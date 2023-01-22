# Compilateur While

## Lancer le compilateur

Avant de lancer le compilateur, il faut s'assurer d'avoir la hiérarchie suivante :

```
├── run_whilec.sh
├── whilec
│   ├── lib
│   │   └── ···
│   └── src
│       ├── ···
│       ···
└── whilestd
    ├── Makefile
    ├── include
    │   └── whilestd
    │       ├── ···
    │       ···
    └── src
        ├── ···
        ···
```

Pour lancer le compilateur, il est nécéssaire d'avoir installé un JDK avec une version supérieure ou égale à 11, afin d'avoir accès aux commandes `java`, `javac` et `jar`. Il est également nécéssaire d'avoir installé `make` et `g++`, ainsi que d'avoir accès à la commande `sh`.(car ce sont les commandes utilisées par le script, le compilateur en soit est compatible avec windows, nous avons essayé, nous n'avons cependant pas réussi à ecrire un script permettant d'automatiser la compilation sous windows🙁).

Le script `run_whilec.sh` permet de lancer le compilateur. À la première exécution, il va compiler le compilateur automatiquement, soit l'archive exécutable `whilec.jar` et la librairie `libwhilestd.a`.
    
Les options de compilation sont les suivantes :
 - `-h` : affiche l'aide
 - `-r` : permet de supprimer les fichiers temporaires (`.cpp`, `.h`) générés par le compilateur
- `-o <fichier>` : permet de spécifier le nom du fichier exécutable généré

Les fichiers sont générés dans le dossier depuis lequel le script est lancé.

Le compilateur ne comprend les options que lorsqu'elles se trouvent avant le nom du fichier source. Par exemple, la commande suivante ne fonctionne pas :

```bash
./run_whilec.sh exemples/hello.txt -o hello
```

La command suivante est un exemple d'utilisation du script :

```bash
./run_whilec.sh -r -o hello exemples/hello.txt
```

Pour ensuite exécuter le programme, il suffit de donner le chemin vers le fichier exécutable généré :

```bash
./hello
```

Si le programme nécessite des valeurs en entrée, il suffit de les donner en argument de la commande, sous la forme d'un entier ou d'une expression à base de cons :

```bash
./run_whilec.sh -r -o sum examples/add.txt
./add 10 (cons nil (cons nil (cons nil nil)))
```

## Écrire un programme

Il est possible d'écrire un programme while dans un fichier texte, l'extension du fichier n'a pas d'importance.

Un programme while comporte au moins une fonction main, et éventuellement d'autres fonctions. Les fonctions sont définies de la manière suivante :

```txt
function <nom de la fonction>:
read <variable in1>, <variable in2>, ..., <variable inN>
%
<corps de la fonction>
%
write <variable out1>, <variable out2>, ..., <variable outM>
```

Il est possible de créer un fonction sans input, mais il faut obligatoirement au moins un output. Les inputs doivent avoir des noms différents, mais il est possible de retourner plusieurs fois le même output. La surcharge de fonction n'est pas possible.

Le corps de la fonction est composé d'une ou plusieurs commandes séparées par un point-virgule. Les commandes sont les suivantes :

- \<variable1>, \<variable2>, ..., \<variableN> := \<expression1>, \<expression2>, ..., \<expressionM> : affecte les valeurs des expressions aux variables, il faut que le nombre de variables soit égal au nombre de valeurs générées par les expressions

- `if` \<expression> `then` \<commandes> `fi` : exécute les commandes si l'expression est vraie

- `if` \<expression> `then` \<commandes> `else` \<commandes> `fi` : exécute les commandes si l'expression est vraie, sinon exécute les commandes de l'`else`

- `while` \<expression> `do` \<commandes> `od` : exécute les commandes tant que l'expression est vraie

- `for` \<expression> `do` \<commandes> `od` : interprète l'expression comme un entier, et exécute les commandes un nombre de fois égal à la valeur de l'expression

- `foreach` \<variable> `in` \<expression> `do` \<commandes> `od` : interprète l'expression comme étant itérable, et exécute les commandes pour chaque élément de l'expression. La variable est affectée à chaque itération à la valeur de l'élément courant. La variable ne doit pas déjà exister.


- `nop` : ne fait rien


Le langage while ne comprend qu'un type de donnée : les arbres binaires. ils peuvent être interprétés comme étant un booléen, un entier ou une chaîne de caractères.

En supposant que ◎ représente un arbre vide, ◉ un nœud et `sym` une feuille, les arbres binaires sont interprétés de la manière suivante :

- booléen : 
    - ◎ et `sym` sont interprétés comme étant faux
    - ◉ est interprété comme étant vrai
- entier :
    - ◎ et `sym` sont interprétés comme étant 0
    - ◉ est interprété comme étant égale à sa hauteur
- chaîne de caractères :
    - ◎ est interprété comme étant la chaîne vide
    - `sym` est interprété comme étant la chaîne de caractères du symbole qu'il contient
    - ◉ est interprété comme étant égale à la concaténation de son fils gauche et de son fils droit

Un symbole commence par une minuscule, et peut être composé de majuscules, de minuscules et de chiffres, et peut finir par un point d'interrogation ou un point d'exclamation.

Une variable commence par une majuscule, et peut être composée de majuscules, de minuscules et de chiffres, et peut finir par un point d'interrogation ou un point d'exclamation.

Les arbres ne sont pas modifiables et les variables ne permettent pas les effets de bord.

Les expressions permettant de manipuler les arbres binaires sont les suivantes :

- `nil` : crée un arbre vide

- cons :
    - `(cons)` : crée un arbre vide
    - `(cons <expression>)` : crée une copie de l'expression
    - `(cons <expression1> <expression2>)` : crée un arbre dont le fils gauche est l'expression1 et le fils droit est l'expression2
    - `(cons <expression1> <expression2> ... <expressionN>)` : créé l'arbre (cons \<expression1> (cons \<expression2> ... (cons \<expressionN-1> \<expressionN>)))

- list :
    - `(list)` : crée une liste vide
    - `(list <expression>)` : crée une liste à un élément, équivaut à `(cons <expression> nil)`
    - `(list <expression1> <expression2> ... <expressionN>)` : crée une liste à N éléments, équivaut à `(cons <expression1> (cons <expression2> ... (cons <expressionN> nil)))`

- `hd` : retourne le fils gauche de l'expression, ou nil

- `tl` : retourne le fils droit de l'expression, ou nil

- appel de fonction :
    - `(f <expression1> ... <expressionN>)` : appelle la fonction f avec les expressions en paramètres. Il est possible d'appeler une fonction avant qu'elle ne soit définie. Il est impossible d'appeler la fonction main.

L'utilisation d'une variable non définie l'initialise à nil. Il n'y a pas de variable globale, mais les variables sont visibles partout dans la fonction dans laquelle elles sont définies.

## Exemples

Des exemples de programmes sont fournis dans le dossier `examples`.
