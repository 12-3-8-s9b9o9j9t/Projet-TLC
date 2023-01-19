import java.util.List;
import java.util.Map;

import org.antlr.runtime.tree.Tree;

public class Visitor {

    Tree ast;
	SpaghettiStack root = new SpaghettiStack();

    public Visitor(Tree ast) {
        this.ast = ast;
    }

    public Map<String, SpaghettiStack.Tuple<List<String>, List<String>, List<String>>> analyse() throws Exception {
    	if (this.ast != null) {
			for (int i = 0; i < ast.getChildCount(); i++) {
				//On va chercher chaque sous arbre de la racine, et on se dirige directement vers la partie gauche où est le nom pour stocker ce nouveau bloc
				if (ast.getChild(i).getText().equals("FUNCTION")){
					//On récupère toutes les variables d'entrée données
					Tree input = findChildByName("INPUT", ast.getChild(i));
					for (int j = 0; j < input.getChildCount(); j++) {
						//Et on les ajoute chacune au bloc créé si elle n'a pas déjà été créée
						if (!root.alreadyDeclaredInput(input.getChild(j).getText(), ast.getChild(i).getChild(0).getChild(0).getText())) {
							root.addInputsToCurrentBlock(input.getChild(j).getText(), input.getChild(j).getLine(), ast.getChild(i).getChild(0).getChild(0).getText());
						}
					}
					Tree commands = this.ast.getChild(i).getChild(1).getChild(1);
					for (int z = 0; z < commands.getChildCount(); z++) {
						Tree command = commands.getChild(z);
						if (!whatCommand(command, this.root, this.ast, ast.getChild(i).getChild(0).getChild(0).getText())){
							throw new Exception("AST isn't correctly built");
						}
					}
					//On récupère toutes les variables de sortie
					Tree output = findChildByName("OUTPUT", ast.getChild(i));
					for (int j = 0; j < output.getChildCount(); j++) {
						//Et on les ajoute chacune au bloc créé si elle n'a pas déjà été créée
						if (!root.alreadyDeclaredOutput(output.getChild(j).getText(), ast.getChild(i).getChild(0).getChild(0).getText())) {
							root.addOutputsToCurrentBlock(output.getChild(j).getText(), output.getChild(j).getLine(), ast.getChild(i).getChild(0).getChild(0).getText());
						}
					}
				}
			}
			return this.root.getSymbols();
    	} else {
			throw new Exception("AST null");
		}
    }

	//Hub des commandes, pour faire les appels récursifs
	public static boolean whatCommand(Tree command, SpaghettiStack root, Tree ast, String funcName) throws Exception {
		switch (command.getText()) {
			case "ASSIGN":
				return assignIsCorrect(command, root, ast, funcName);
			case "IF" :
				return ifIsCorrect(command, root, ast, funcName);
			case "FOR" :
				return forIsCorrect(command, root, ast, funcName);
			case "FOREACH" :
				return forEachIsCorrect(command, root, ast, funcName);
			case "WHILE" :
				return whileIsCorrect(command, root, ast, funcName);
			default :
				return false;
		}
	}

	//Fonction permettant de s'assurer que la commande For ne comporte pas d'erreur
	public static boolean forIsCorrect(Tree command, SpaghettiStack root, Tree ast, String funcName) throws Exception {
		if (everyChildrenExistCALL(command.getChild(0), 0, root, ast, funcName)) {
			return (whatCommand(command.getChild(1).getChild(0), root, ast, funcName));
		} else {
			return false;
		}
	}

	//Fonction permettant de s'assurer que la commande ForEach ne comporte pas d'erreur
	public static boolean forEachIsCorrect(Tree command, SpaghettiStack root, Tree ast, String funcName) throws Exception {
		if (!root.alreadyDeclared(command.getChild(0).getText(), funcName) && everyChildrenExistCALL(command.getChild(1), 0, root, ast, funcName)) {
			root.addSymbolsToCurrentBlock(command.getChild(0).getText(), command.getChild(0).getLine(), funcName);
			return (whatCommand(command.getChild(2).getChild(0), root, ast, funcName));
		} else {
			return false;
		}
	}

	//Fonction permettant de s'assurer qu'un CALL est bon
	public static int callIsCorrect(Tree call, SpaghettiStack root, Tree ast) throws Exception {
		String name = call.getChild(0).getText();
		if (!name.equals("main")) {
			String nameFunc = "function_" + call.getChild(0).getText();
			for (String func : root.getSymbols().keySet()) {
				//Il faut chercher si le nom de la fonction call qu'on utilise existe bien dans notre liste de spaghetti stack de
				//noms de fonctions
				if (func.equals(nameFunc)){
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
		} else {
			throw new Exception("call on main");
		}
		
	}

	//Fonction permettant de s'assurer que la commande Assign ne comporte pas d'erreur
	public static boolean assignIsCorrect(Tree command, SpaghettiStack root, Tree ast, String funcName) throws Exception {
		int totalReturn = 0;
		for (int j = 0; j < command.getChild(1).getChildCount(); j++) {
			Tree appel = command.getChild(1).getChild(j);
			if (!appel.getText().equals("CALL")) {
				totalReturn += 1;
			} else if (appel.getText().equals("CALL")) {
				int i = callIsCorrect(appel, root, ast);
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
				root.addSymbolsToCurrentBlock(command.getChild(0).getChild(j).getText(), command.getChild(0).getChild(j).getLine(), funcName);
				
			}
			return true;
		} else {
			return false;
		}
	}
	
	//Fonction permettant de s'assurer que la commande If ne comporte pas d'erreur
	public static boolean ifIsCorrect(Tree command, SpaghettiStack root, Tree ast, String funcName) throws Exception {
		if (everyChildrenExistCALL(command.getChild(0), 0, root, ast, funcName)) {
			//Appel récursif on check si le then et else sont bons
			return (whatCommand(command.getChild(1).getChild(0), root, ast, funcName) && whatCommand(command.getChild(2).getChild(0), root, ast, funcName));
		} else {
			return false;
		}
	}

	//Fonction permettant de s'assurer que la commande Else ne comporte pas d'erreur
	public static boolean whileIsCorrect(Tree command, SpaghettiStack root, Tree ast, String funcName) throws Exception {
		if (everyChildrenExistCALL(command.getChild(0), 0, root, ast, funcName)) {
			//Appel récursif on check si le then et else sont bons
			return (whatCommand(command.getChild(1).getChild(0), root, ast, funcName));
		} else {
			return false;
		}
	}

	//Méthode permettant de voir si le COND du IF est bon
	public static boolean everyChildrenExistCALL(Tree seek, int firstIter, SpaghettiStack root, Tree ast, String funcName) throws Exception {
		for (int i = firstIter; i < seek.getChildCount(); i++) {
			switch (seek.getChild(i).getText()) {
				case "VAR":
					if (!root.alreadyDeclared(seek.getChild(i).getChild(0).getText(), funcName)) {
						return false;
					}
				case "CALL":
					if (i != 0) {
						if (callIsCorrect(seek.getChild(i), root, ast)==-1) {
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

	//Renvoie le nombre d'inputs du call symbolisés par le Tree seek
	public static int getNumberOfInputs(Tree seek) {
		return seek.getChild(1).getChild(0).getChildCount();
	}
}
