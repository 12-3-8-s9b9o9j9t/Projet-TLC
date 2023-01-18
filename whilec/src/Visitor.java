import java.util.LinkedList;
import java.util.List;

import org.antlr.runtime.tree.Tree;

public class Visitor {

    Tree ast;
	List<SpaghettiStack> root = new LinkedList<SpaghettiStack>();

    public Visitor(Tree ast) {
        this.ast = ast;
    }

    public void analyse() throws Exception {
    	if (this.ast != null) {
			for (int i = 0; i < ast.getChildCount(); i++) {
				//On va chercher chaque sous arbre de la racine, et on se dirige directement vers la partie gauche où est le nom pour stocker ce nouveau bloc
				if (ast.getChild(i).getText().equals("FUNCTION")){
					SpaghettiStack stack = new SpaghettiStack("function_" + ast.getChild(i).getChild(0).getChild(0));
					root.add(stack);
					//On récupère toutes les variables d'entrée données
					Tree input = findChildByName("INPUT", ast.getChild(i));
					for (int j = 0; j < input.getChildCount(); j++) {
						//Et on les ajoute chacune au bloc créé si elle n'a pas déjà été créée
						if (!stack.alreadyDeclared(input.getChild(j).getText())) {
							stack.addSymbolsToCurrentBlock(input.getChild(j).getText(), input.getChild(j).getLine());
						}
					}
					Tree commands = this.ast.getChild(i).getChild(1).getChild(1);
					for (int z = 0; z < commands.getChildCount(); z++) {
						Tree command = commands.getChild(z);
						if (!whatCommand(command, stack, this.root, this.ast)){
							System.out.println("ERREUR");
						}
					}
					//TODO : vérifier que les outputs existent
					System.out.println(stack + " : " + stack.getSymbols());
				}
			}
    	}
    }

	//Hub des commandes, pour faire les appels récursifs
	public static boolean whatCommand(Tree command, SpaghettiStack stack, List<SpaghettiStack> root, Tree ast) {
		switch (command.getText()) {
			case "ASSIGN":
				return assignIsCorrect(command, stack, root, ast);
			case "IF" :
				return ifIsCorrect(command, stack, root, ast);
			case "FOR" :
				return forIsCorrect(command, stack, root, ast);
			case "FOREACH" :
				return forEachIsCorrect(command, stack, root, ast);
			case "WHILE" :
				return whileIsCorrect(command, stack, root, ast);
			default :
				return false;
		}
	}

	//Fonction permettant de s'assurer que la commande For ne comporte pas d'erreur
	public static boolean forIsCorrect(Tree command, SpaghettiStack stack, List<SpaghettiStack> root, Tree ast) {
		if (everyChildrenExistCALL(command.getChild(0), stack, 0, root, ast)) {
			return (whatCommand(command.getChild(1).getChild(0), stack, root, ast));
		} else {
			return false;
		}
	}

	//Fonction permettant de s'assurer que la commande ForEach ne comporte pas d'erreur
	public static boolean forEachIsCorrect(Tree command, SpaghettiStack stack, List<SpaghettiStack> root, Tree ast) {
		if (!stack.alreadyDeclared(command.getChild(0).getText()) && everyChildrenExistCALL(command.getChild(1), stack, 0, root, ast)) {
			stack.addSymbolsToCurrentBlock(command.getChild(0).getText(), command.getChild(0).getLine());
			return (whatCommand(command.getChild(2).getChild(0), stack, root, ast));
		} else {
			return false;
		}
	}

	//Fonction permettant de s'assurer qu'un CALL est bon
	public static int callIsCorrect(Tree call, SpaghettiStack stack, List<SpaghettiStack> root, Tree ast) {
		String nameFunc = "function_" + call.getChild(0).getText();
		for (SpaghettiStack spaghet : root) {
			//Il faut chercher si le nom de la fonction call qu'on utilise existe bien dans notre liste de spaghetti stack de
			//noms de fonctions
			if (spaghet.toString().equals(nameFunc)){
				Tree treeFunc = findFunction(call.getChild(0).getText(), ast);
				if (treeFunc != null) {
					int outputFunc = getNumberOfOutputs(treeFunc);
					int inputFunc = getNumberOfInputs(treeFunc);
					//On vérifie qu'on a le bon nombre d'inputs pour la fonction en question
					if (call.getChildCount()-1 == inputFunc){
						return outputFunc;
					} else {
						return -1;
					}
				}
			}
		}
		return -1;
	}

	//Fonction permettant de s'assurer que la commande Assign ne comporte pas d'erreur
	public static boolean assignIsCorrect(Tree command, SpaghettiStack stack, List<SpaghettiStack> root, Tree ast) {
		int totalReturn = 0;
		for (int j = 0; j < command.getChild(1).getChildCount(); j++) {
			Tree appel = command.getChild(1).getChild(j);
			if (!appel.getText().equals("CALL")) {
				totalReturn += 1;
			} else if (appel.getText().equals("CALL")) {
				int i = callIsCorrect(appel, stack, root, ast);
				if (i == -1) {
					return false;
				} else {
					totalReturn += i;
				}
			}
		}
		if (totalReturn == command.getChild(0).getChildCount()) {
			for (int j = 0; j < command.getChild(0).getChildCount(); j++) {
				//On ajoute toutes les vars au stack, dans le cas où elle existe déjà on ajoute juste la ligne dans la liste des lignes
				stack.addSymbolsToCurrentBlock(command.getChild(0).getChild(j).getText(), command.getChild(0).getChild(j).getLine());
				
			}
			return true;
		} else {
			return false;
		}
	}
	
	//Fonction permettant de s'assurer que la commande If ne comporte pas d'erreur
	public static boolean ifIsCorrect(Tree command, SpaghettiStack stack, List<SpaghettiStack> root, Tree ast) {
		if (everyChildrenExistCALL(command.getChild(0), stack, 0, root, ast)) {
			//Appel récursif on check si le then et else sont bons
			return (whatCommand(command.getChild(1).getChild(0), stack, root, ast) && whatCommand(command.getChild(2).getChild(0), stack, root, ast));
		} else {
			return false;
		}
	}

	//Fonction permettant de s'assurer que la commande Else ne comporte pas d'erreur
	public static boolean whileIsCorrect(Tree command, SpaghettiStack stack, List<SpaghettiStack> root, Tree ast) {
		if (everyChildrenExistCALL(command.getChild(0), stack, 0, root, ast)) {
			//Appel récursif on check si le then et else sont bons
			return (whatCommand(command.getChild(1).getChild(0), stack, root, ast));
		} else {
			return false;
		}
	}

	//Méthode permettant de voir si le COND du IF est bon
	public static boolean everyChildrenExistCALL(Tree seek, SpaghettiStack stack, int firstIter, List<SpaghettiStack> root, Tree ast) {
		for (int i = firstIter; i < seek.getChildCount(); i++) {
			switch (seek.getChild(i).getText()) {
				case "VAR":
					if (!stack.alreadyDeclared(seek.getChild(i).getChild(0).getText())) {
						return false;
					}
				case "CALL":
					if (i != 0) {
						if (callIsCorrect(seek.getChild(i), stack, root, ast)==-1) {
							return false;
						}
					}
			}
		}
		return true;
	}
	
	//Fonction permettant de trouver un sous arbre par le nom de son noeud
	public static Tree findChildByName(String name, Tree seek) {
		if (seek != null) {
			if (seek.getText().equals(name)) {
				return seek;
			} else {
				int nbChilds = seek.getChildCount();
				for (int i = 0; i < nbChilds; i++) {
					if (findChildByName(name, seek.getChild(i)) != null) {
						return findChildByName(name, seek.getChild(i));
					}
				}
			}
		}
		return null;
	}

	//Fonction permettant de récupérer l'arbre d'une fonction par son nom
	public static Tree findFunction(String name, Tree seek) {
		for (int i = 0; i < seek.getChildCount(); i++) {
			if (seek.getChild(i).getChild(0).getChild(0).getText().equals(name)) {
				return seek.getChild(i);
			}
		}
		return null;
	}

	//Renvoie le nombre d'outputs de la fonction symbolisée par le Tree seek
	public static int getNumberOfOutputs(Tree seek) {
		return seek.getChild(1).getChild(2).getChildCount();
	}

	//Vérifie que pour une fonction de l'arbre donnée, ses outputs sont bien définis dans son stack
	public static boolean outputsAreDefined(Tree func, SpaghettiStack stack) {
		return true;
	}

	//Renvoie le nombre d'inputs du call symbolisés par le Tree seek
	public static int getNumberOfInputs(Tree seek) {
		return seek.getChild(1).getChild(0).getChildCount();
	}
}
