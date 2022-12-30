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
{switch (rec.size()) {
    case 0:
        $t = nil();
        break;
    case 1:
        $t = rec.pop();
        break;
    default:
        $t = rec.pop();
        while (!rec.empty()) {
            $t = cons(rec.pop(), $t);
        }
        break;
}}
    ;

rec_formula returns [Stack<BinTree> st = new Stack<BinTree>()]
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
