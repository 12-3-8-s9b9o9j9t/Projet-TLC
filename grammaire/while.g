grammar while;

options{ output=AST; }

tokens{ FUNCTION; FUNCTION_NAME; DEFINITION; INPUT; COMMANDS; OUTPUT; LOGICAL_EXPR;
ASSIGNMENT; IF_BLOCK; EXPRESSION; EXPR; BODY; ELSE; WHILE_BLOCK; FOR_BLOCK; FOREACH_BLOCK;
CONSTRUCT_TREE; CONSTRUCT_LIST; HEAD; TAIL;}

program
    :	function program? EOF!
    ;

function
    :	'function' SYMBOL ':' definition->^(FUNCTION ^(FUNCTION_NAME SYMBOL) definition)
    ;

definition
    :	'read' input '%' commands '%' 'write' output->^(DEFINITION input ^(COMMANDS commands) ^(OUTPUT output))
    ;

input
    : inputsub?->^(INPUT inputsub?)
    ;

inputsub
    :	VARIABLE (',' inputsub)?->VARIABLE inputsub?
    ;

output
    :	VARIABLE (',' output)?->VARIABLE output?
    ;

commands
    :	command (';' commands)?->command commands?
    ;

vars
    :	VARIABLE (',' vars)?->VARIABLE vars?
    ;

exprs
    :	expression (',' exprs)?-> ^(EXPRESSION expression exprs?)
    ;

command
    :	'nop'->'nil'
    |	(vars ':=' exprs)-> ^(ASSIGNMENT vars exprs)
    |	('if' expression 'then' c1=commands ('else' c2=commands  ->^(IF_BLOCK ^(EXPR expression) ^(BODY $c1) ^(ELSE $c2)) 
    								| ->^(IF_BLOCK ^(EXPR expression) ^(BODY $c1)))
    	'fi')
    |	('while' expression 'do' commands 'od')-> ^(WHILE_BLOCK ^(EXPR expression) ^(BODY commands))
    |	('for' expression 'do' commands 'od')-> ^(FOR_BLOCK ^(EXPR expression) ^(BODY commands))
    |	('foreach' VARIABLE 'in' expression 'do' commands 'od')-> ^(FOREACH_BLOCK VARIABLE ^(EXPR expression) ^(BODY commands))
    ;

exprbase
    :	'nil'->'nil'
    |	VARIABLE->VARIABLE
    |	SYMBOL->SYMBOL
    |	('(' 'cons' lexpr ')')->^(CONSTRUCT_TREE lexpr?)
    |	('(' 'list' lexpr ')')->^(CONSTRUCT_LIST lexpr?)
    |	('(' 'hd' exprbase ')')->^(HEAD exprbase)
    |	('(' 'tl' exprbase ')')->^(TAIL exprbase)
    |	('(' SYMBOL lexpr ')')->^(LOGICAL_EXPR ^(FUNCTION_NAME SYMBOL) lexpr?)
    ;

expression
    :	exprbase ('=?' exprbase)?->exprbase exprbase?
    ;

lexpr
    :	exprbase*
    ;

VARIABLE
    :	MAJ(MAJ|MIN|DEC)*('!'|'?')?
    ;


SYMBOL
    :	MIN(MAJ|MIN|DEC)*('!'|'?')?
    ;

fragment
MAJ :	'A'..'Z'
    ;

fragment
MIN :	'a'..'z'
    ;

fragment
DEC :	'0'..'9'
    ;
    
COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;
