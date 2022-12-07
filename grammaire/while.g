grammar while;

options{ output=AST; }

tokens{ FUNCTION; FUNC_NAME; DEFINITION; INPUT; COMMANDS; OUTPUT; CALL;
ASSIGN; BODY; IF; THEN; ELSE; WHILE; FOR; FOREACH;
CONS; LIST; HD; TL; NIL; COND; NOP;}

program
    :	function program? EOF!
    ;

function
    :	'function' SYMBOL ':' definition->^(FUNCTION ^(FUNC_NAME SYMBOL) definition)
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
    :	expression (',' exprs)?-> expression exprs?
    ;

command
    :	'nop'-> NOP
    |	(vars ':=' exprs)-> ^(ASSIGN vars exprs)
    |	('if' expression 'then' c1=commands ('else' c2=commands  ->^(IF ^(COND expression) ^(THEN $c1) ^(ELSE $c2)) 
    								| ->^(IF ^(COND expression) ^(THEN $c1)))
    	'fi')
    |	('while' expression 'do' commands 'od')-> ^(WHILE ^(COND expression) ^(BODY commands))
    |	('for' expression 'do' commands 'od')-> ^(FOR ^(COND expression) ^(BODY commands))
    |	('foreach' VARIABLE 'in' expression 'do' commands 'od')-> ^(FOREACH VARIABLE ^(COND expression) ^(BODY commands))
    ;

exprbase
    :	'nil'->NIL
    |	VARIABLE->VARIABLE
    |	SYMBOL->SYMBOL
    |	('(' 'cons' lexpr ')')->^(CONS lexpr?)
    |	('(' 'list' lexpr ')')->^(LIST lexpr?)
    |	('(' 'hd' exprbase ')')->^(HD exprbase)
    |	('(' 'tl' exprbase ')')->^(TL exprbase)
    |	('(' SYMBOL lexpr ')')->^(CALL SYMBOL lexpr?)
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
