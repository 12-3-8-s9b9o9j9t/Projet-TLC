grammar while;

options{ output=AST; }

tokens{ PROGRAM; FUNCTION; FUNC_NAME; DEFINITION; INPUT; COMMANDS; OUTPUT;
ASSIGN; VARIABLES; EXPRESSIONS; EQU; IF; WHILE; FOR; FOREACH;
COND; NOP; CALL; CONS; LIST; HD; TL; NIL; VAR; SYM; }

@lexer::header{
package output;
}

@parser::header{
package output;
}

@rulecatch{
catch (RecognitionException re) {
    reportError(re);
    throw re;
}
}

program
    :	function+ EOF -> ^(PROGRAM function+)
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
    |	(vars ':=' exprs)-> ^(ASSIGN ^(VARIABLES vars) ^(EXPRESSIONS exprs))
    |	('if' expression 'then' c1=commands ('else' c2=commands  ->^(IF ^(COND expression) ^(COMMANDS $c1) ^(COMMANDS $c2)) 
    								| ->^(IF ^(COND expression) ^(COMMANDS $c1)))
    	'fi')
    |	('while' expression 'do' commands 'od')-> ^(WHILE ^(COND expression) ^(COMMANDS commands))
    |	('for' expression 'do' commands 'od')-> ^(FOR ^(COND expression) ^(COMMANDS commands))
    |	('foreach' VARIABLE 'in' expression 'do' commands 'od')-> ^(FOREACH ^(COND expression) ^(COMMANDS commands) VARIABLE)
    ;

exprbase
    :	'nil'->NIL
    |	VARIABLE-> ^(VAR VARIABLE)
    |	SYMBOL-> ^(SYM SYMBOL)
    |	('(' 'cons' lexpr ')')->^(CONS lexpr?)
    |	('(' 'list' lexpr ')')->^(LIST lexpr?)
    |	('(' 'hd' exprbase ')')->^(HD exprbase)
    |	('(' 'tl' exprbase ')')->^(TL exprbase)
    |	('(' SYMBOL lexpr ')')->^(CALL SYMBOL lexpr?)
    ;

expression
    :	e1=exprbase ('=?' e2=exprbase -> ^(EQU $e1 $e2) | -> $e1)
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
