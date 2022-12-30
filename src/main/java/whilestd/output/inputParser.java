// $ANTLR 3.5.1 C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g 2022-12-30 20:16:16

package whilestd.output;

import whilestd.BinTree;
import static whilestd.Utils.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class inputParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "DEC", "INT", "MAJ", "MIN", "SYMBOL", 
		"WS", "'('", "')'", "'cons'", "'nil'"
	};
	public static final int EOF=-1;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int DEC=4;
	public static final int INT=5;
	public static final int MAJ=6;
	public static final int MIN=7;
	public static final int SYMBOL=8;
	public static final int WS=9;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public inputParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public inputParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return inputParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g"; }



	// $ANTLR start "parse"
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:14:1: parse returns [BinTree t] : (i= INT |f= formula );
	public final BinTree parse() throws RecognitionException {
		BinTree t = null;


		Token i=null;
		BinTree f =null;

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:15:5: (i= INT |f= formula )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==INT) ) {
				alt1=1;
			}
			else if ( (LA1_0==SYMBOL||LA1_0==10||LA1_0==13) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:15:7: i= INT
					{
					i=(Token)match(input,INT,FOLLOW_INT_in_parse35); 
					t = toTree(Integer.parseInt((i!=null?i.getText():null)));
					}
					break;
				case 2 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:16:7: f= formula
					{
					pushFollow(FOLLOW_formula_in_parse47);
					f=formula();
					state._fsp--;

					t = f;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "parse"



	// $ANTLR start "formula"
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:19:1: formula returns [BinTree t] : ( 'nil' |s= SYMBOL | ( '(' 'cons' rec= rec_formula ')' ) );
	public final BinTree formula() throws RecognitionException {
		BinTree t = null;


		Token s=null;
		Stack<BinTree> rec =null;

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:20:5: ( 'nil' |s= SYMBOL | ( '(' 'cons' rec= rec_formula ')' ) )
			int alt2=3;
			switch ( input.LA(1) ) {
			case 13:
				{
				alt2=1;
				}
				break;
			case SYMBOL:
				{
				alt2=2;
				}
				break;
			case 10:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:20:7: 'nil'
					{
					match(input,13,FOLLOW_13_in_formula70); 
					t = nil();
					}
					break;
				case 2 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:21:7: s= SYMBOL
					{
					s=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_formula82); 
					t = symb((s!=null?s.getText():null));
					}
					break;
				case 3 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:22:7: ( '(' 'cons' rec= rec_formula ')' )
					{
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:22:7: ( '(' 'cons' rec= rec_formula ')' )
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:22:8: '(' 'cons' rec= rec_formula ')'
					{
					match(input,10,FOLLOW_10_in_formula93); 
					match(input,12,FOLLOW_12_in_formula95); 
					pushFollow(FOLLOW_rec_formula_in_formula99);
					rec=rec_formula();
					state._fsp--;

					match(input,11,FOLLOW_11_in_formula101); 
					}

					switch (rec.size()) {
					    case 0:
					        t = nil();
					        break;
					    case 1:
					        t = rec.pop();
					        break;
					    default:
					        t = rec.pop();
					        while (!rec.empty()) {
					            t = cons(rec.pop(), t);
					        }
					        break;
					}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "formula"



	// $ANTLR start "rec_formula"
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:39:1: rec_formula returns [Stack<BinTree> st = new Stack<BinTree>()] : (l= formula )* ;
	public final Stack<BinTree> rec_formula() throws RecognitionException {
		Stack<BinTree> st =  new Stack<BinTree>();


		BinTree l =null;

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:40:5: ( (l= formula )* )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:40:7: (l= formula )*
			{
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:40:7: (l= formula )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==SYMBOL||LA3_0==10||LA3_0==13) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:40:8: l= formula
					{
					pushFollow(FOLLOW_formula_in_rec_formula129);
					l=formula();
					state._fsp--;

					st.add(l);
					}
					break;

				default :
					break loop3;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return st;
	}
	// $ANTLR end "rec_formula"

	// Delegated rules



	public static final BitSet FOLLOW_INT_in_parse35 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formula_in_parse47 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_formula70 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_formula82 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_formula93 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_formula95 = new BitSet(new long[]{0x0000000000002D00L});
	public static final BitSet FOLLOW_rec_formula_in_formula99 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_formula101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formula_in_rec_formula129 = new BitSet(new long[]{0x0000000000002502L});
}
