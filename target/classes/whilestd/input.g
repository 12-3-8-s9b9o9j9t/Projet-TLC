grammar input;

@lexer::header{
package whilestd.output;
}

@parser::header{
package whilestd.output;

import whilestd.BinTree;
import static whilestd.Utils.*;
}

parse returns[BinTree t]
    :	i=INT {$t = toTree(Integer.parseInt($i.text));}
    |	f=formula {$t = f;}
    ;

formula returns [BinTree t]
    :	'nil' {$t = nil();}
    |	s=SYMBOL {$t = symb($s.text);}
    |	('(' 'cons' rec=rec_formula ')') 
{if (rec == null) {
    $t = nil();
}
else if (rec.size() == 1) {
    $t = rec.pop();
}
else {
    $t = rec.pop();
    while (!rec.empty()) {
        $t = cons(rec.pop(), $t);
    }
}}
    ;

rec_formula returns [Stack<BinTree> st]
    : (l=formula {$st.add($l.t);})*
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

INT :	DEC+
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;
