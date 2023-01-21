// $ANTLR 3.5.1 C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g 2023-01-20 19:03:20

package output;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class whileLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int ASSIGN=4;
	public static final int BODY=5;
	public static final int CALL=6;
	public static final int COMMANDS=7;
	public static final int COMMENT=8;
	public static final int COND=9;
	public static final int CONS=10;
	public static final int DEC=11;
	public static final int DEFINITION=12;
	public static final int ELSE=13;
	public static final int EQU=14;
	public static final int EXPRESSIONS=15;
	public static final int FOR=16;
	public static final int FOREACH=17;
	public static final int FUNCTION=18;
	public static final int FUNC_NAME=19;
	public static final int HD=20;
	public static final int IF=21;
	public static final int INPUT=22;
	public static final int ITER=23;
	public static final int LIST=24;
	public static final int MAJ=25;
	public static final int MIN=26;
	public static final int NIL=27;
	public static final int NOP=28;
	public static final int OUTPUT=29;
	public static final int PROGRAM=30;
	public static final int SYM=31;
	public static final int SYMBOL=32;
	public static final int THEN=33;
	public static final int TL=34;
	public static final int VAR=35;
	public static final int VARIABLE=36;
	public static final int VARIABLES=37;
	public static final int WHILE=38;
	public static final int WS=39;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public whileLexer() {} 
	public whileLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public whileLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g"; }

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:6:7: ( '%' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:6:9: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:7:7: ( '(' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:7:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:8:7: ( ')' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:8:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:9:7: ( ',' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:9:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:10:7: ( ':' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:10:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:11:7: ( ':=' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:11:9: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:12:7: ( ';' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:12:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:13:7: ( '=?' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:13:9: '=?'
			{
			match("=?"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:14:7: ( 'cons' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:14:9: 'cons'
			{
			match("cons"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:15:7: ( 'do' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:15:9: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:16:7: ( 'else' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:16:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:17:7: ( 'fi' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:17:9: 'fi'
			{
			match("fi"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:18:7: ( 'for' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:18:9: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:19:7: ( 'foreach' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:19:9: 'foreach'
			{
			match("foreach"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:20:7: ( 'function' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:20:9: 'function'
			{
			match("function"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:21:7: ( 'hd' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:21:9: 'hd'
			{
			match("hd"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:22:7: ( 'if' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:22:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:23:7: ( 'in' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:23:9: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:24:7: ( 'list' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:24:9: 'list'
			{
			match("list"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:25:7: ( 'nil' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:25:9: 'nil'
			{
			match("nil"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:26:7: ( 'nop' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:26:9: 'nop'
			{
			match("nop"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:27:7: ( 'od' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:27:9: 'od'
			{
			match("od"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:28:7: ( 'read' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:28:9: 'read'
			{
			match("read"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:29:7: ( 'then' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:29:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:30:7: ( 'tl' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:30:9: 'tl'
			{
			match("tl"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:31:7: ( 'while' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:31:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:32:7: ( 'write' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:32:9: 'write'
			{
			match("write"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__66"

	// $ANTLR start "VARIABLE"
	public final void mVARIABLE() throws RecognitionException {
		try {
			int _type = VARIABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:84:5: ( MAJ ( MAJ | MIN | DEC )* ( '!' | '?' )? )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:84:7: MAJ ( MAJ | MIN | DEC )* ( '!' | '?' )?
			{
			mMAJ(); 

			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:84:10: ( MAJ | MIN | DEC )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:84:24: ( '!' | '?' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='!'||LA2_0=='?') ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:
					{
					if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VARIABLE"

	// $ANTLR start "SYMBOL"
	public final void mSYMBOL() throws RecognitionException {
		try {
			int _type = SYMBOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:89:5: ( MIN ( MAJ | MIN | DEC )* ( '!' | '?' )? )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:89:7: MIN ( MAJ | MIN | DEC )* ( '!' | '?' )?
			{
			mMIN(); 

			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:89:10: ( MAJ | MIN | DEC )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:89:24: ( '!' | '?' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='!'||LA4_0=='?') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:
					{
					if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SYMBOL"

	// $ANTLR start "MAJ"
	public final void mMAJ() throws RecognitionException {
		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:94:5: ( 'A' .. 'Z' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAJ"

	// $ANTLR start "MIN"
	public final void mMIN() throws RecognitionException {
		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:98:5: ( 'a' .. 'z' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MIN"

	// $ANTLR start "DEC"
	public final void mDEC() throws RecognitionException {
		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:102:5: ( '0' .. '9' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEC"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:105:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='/') ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1=='/') ) {
					alt8=1;
				}
				else if ( (LA8_1=='*') ) {
					alt8=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:105:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:105:14: (~ ( '\\n' | '\\r' ) )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '\uFFFF')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop5;
						}
					}

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:105:28: ( '\\r' )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0=='\r') ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:105:28: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:106:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:106:14: ( options {greedy=false; } : . )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0=='*') ) {
							int LA7_1 = input.LA(2);
							if ( (LA7_1=='/') ) {
								alt7=2;
							}
							else if ( ((LA7_1 >= '\u0000' && LA7_1 <= '.')||(LA7_1 >= '0' && LA7_1 <= '\uFFFF')) ) {
								alt7=1;
							}

						}
						else if ( ((LA7_0 >= '\u0000' && LA7_0 <= ')')||(LA7_0 >= '+' && LA7_0 <= '\uFFFF')) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:106:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop7;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:109:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:109:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:1:8: ( T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | VARIABLE | SYMBOL | COMMENT | WS )
		int alt9=31;
		alt9 = dfa9.predict(input);
		switch (alt9) {
			case 1 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:1:10: T__40
				{
				mT__40(); 

				}
				break;
			case 2 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:1:16: T__41
				{
				mT__41(); 

				}
				break;
			case 3 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:1:22: T__42
				{
				mT__42(); 

				}
				break;
			case 4 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:1:28: T__43
				{
				mT__43(); 

				}
				break;
			case 5 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:1:34: T__44
				{
				mT__44(); 

				}
				break;
			case 6 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:1:40: T__45
				{
				mT__45(); 

				}
				break;
			case 7 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:1:46: T__46
				{
				mT__46(); 

				}
				break;
			case 8 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:1:52: T__47
				{
				mT__47(); 

				}
				break;
			case 9 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:1:58: T__48
				{
				mT__48(); 

				}
				break;
			case 10 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:1:64: T__49
				{
				mT__49(); 

				}
				break;
			case 11 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:1:70: T__50
				{
				mT__50(); 

				}
				break;
			case 12 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:1:76: T__51
				{
				mT__51(); 

				}
				break;
			case 13 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:1:82: T__52
				{
				mT__52(); 

				}
				break;
			case 14 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:1:88: T__53
				{
				mT__53(); 

				}
				break;
			case 15 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:1:94: T__54
				{
				mT__54(); 

				}
				break;
			case 16 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:1:100: T__55
				{
				mT__55(); 

				}
				break;
			case 17 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:1:106: T__56
				{
				mT__56(); 

				}
				break;
			case 18 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:1:112: T__57
				{
				mT__57(); 

				}
				break;
			case 19 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:1:118: T__58
				{
				mT__58(); 

				}
				break;
			case 20 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:1:124: T__59
				{
				mT__59(); 

				}
				break;
			case 21 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:1:130: T__60
				{
				mT__60(); 

				}
				break;
			case 22 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:1:136: T__61
				{
				mT__61(); 

				}
				break;
			case 23 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:1:142: T__62
				{
				mT__62(); 

				}
				break;
			case 24 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:1:148: T__63
				{
				mT__63(); 

				}
				break;
			case 25 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:1:154: T__64
				{
				mT__64(); 

				}
				break;
			case 26 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:1:160: T__65
				{
				mT__65(); 

				}
				break;
			case 27 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:1:166: T__66
				{
				mT__66(); 

				}
				break;
			case 28 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:1:172: VARIABLE
				{
				mVARIABLE(); 

				}
				break;
			case 29 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:1:181: SYMBOL
				{
				mSYMBOL(); 

				}
				break;
			case 30 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:1:188: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 31 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:1:196: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	static final String DFA9_eotS =
		"\5\uffff\1\31\2\uffff\14\25\6\uffff\1\25\1\55\1\25\1\57\2\25\1\62\1\63"+
		"\1\64\3\25\1\70\2\25\1\73\3\25\1\uffff\1\25\1\uffff\1\101\1\25\3\uffff"+
		"\1\25\1\104\1\105\1\uffff\2\25\1\uffff\2\25\1\112\1\113\1\25\1\uffff\1"+
		"\25\1\116\2\uffff\1\117\1\120\2\25\2\uffff\2\25\3\uffff\1\125\1\126\2"+
		"\25\2\uffff\1\131\1\25\1\uffff\1\133\1\uffff";
	static final String DFA9_eofS =
		"\134\uffff";
	static final String DFA9_minS =
		"\1\11\4\uffff\1\75\2\uffff\2\157\1\154\1\151\1\144\1\146\2\151\1\144\1"+
		"\145\2\150\6\uffff\1\156\1\41\1\163\1\41\1\162\1\156\3\41\1\163\1\154"+
		"\1\160\1\41\1\141\1\145\1\41\2\151\1\163\1\uffff\1\145\1\uffff\1\41\1"+
		"\143\3\uffff\1\164\2\41\1\uffff\1\144\1\156\1\uffff\1\154\1\164\2\41\1"+
		"\141\1\uffff\1\164\1\41\2\uffff\2\41\2\145\2\uffff\1\143\1\151\3\uffff"+
		"\2\41\1\150\1\157\2\uffff\1\41\1\156\1\uffff\1\41\1\uffff";
	static final String DFA9_maxS =
		"\1\172\4\uffff\1\75\2\uffff\2\157\1\154\1\165\1\144\1\156\1\151\1\157"+
		"\1\144\1\145\1\154\1\162\6\uffff\1\156\1\172\1\163\1\172\1\162\1\156\3"+
		"\172\1\163\1\154\1\160\1\172\1\141\1\145\1\172\2\151\1\163\1\uffff\1\145"+
		"\1\uffff\1\172\1\143\3\uffff\1\164\2\172\1\uffff\1\144\1\156\1\uffff\1"+
		"\154\1\164\2\172\1\141\1\uffff\1\164\1\172\2\uffff\2\172\2\145\2\uffff"+
		"\1\143\1\151\3\uffff\2\172\1\150\1\157\2\uffff\1\172\1\156\1\uffff\1\172"+
		"\1\uffff";
	static final String DFA9_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\1\10\14\uffff\1\34\1\35\1\36\1\37"+
		"\1\6\1\5\23\uffff\1\12\1\uffff\1\14\2\uffff\1\20\1\21\1\22\3\uffff\1\26"+
		"\2\uffff\1\31\5\uffff\1\15\2\uffff\1\24\1\25\4\uffff\1\11\1\13\2\uffff"+
		"\1\23\1\27\1\30\4\uffff\1\32\1\33\2\uffff\1\16\1\uffff\1\17";
	static final String DFA9_specialS =
		"\134\uffff}>";
	static final String[] DFA9_transitionS = {
			"\2\27\2\uffff\1\27\22\uffff\1\27\4\uffff\1\1\2\uffff\1\2\1\3\2\uffff"+
			"\1\4\2\uffff\1\26\12\uffff\1\5\1\6\1\uffff\1\7\3\uffff\32\24\6\uffff"+
			"\2\25\1\10\1\11\1\12\1\13\1\25\1\14\1\15\2\25\1\16\1\25\1\17\1\20\2\25"+
			"\1\21\1\25\1\22\2\25\1\23\3\25",
			"",
			"",
			"",
			"",
			"\1\30",
			"",
			"",
			"\1\32",
			"\1\33",
			"\1\34",
			"\1\35\5\uffff\1\36\5\uffff\1\37",
			"\1\40",
			"\1\41\7\uffff\1\42",
			"\1\43",
			"\1\44\5\uffff\1\45",
			"\1\46",
			"\1\47",
			"\1\50\3\uffff\1\51",
			"\1\52\11\uffff\1\53",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\54",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"\1\56",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"\1\60",
			"\1\61",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"\1\71",
			"\1\72",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"\1\74",
			"\1\75",
			"\1\76",
			"",
			"\1\77",
			"",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\4\25\1\100\25"+
			"\25",
			"\1\102",
			"",
			"",
			"",
			"\1\103",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"",
			"\1\106",
			"\1\107",
			"",
			"\1\110",
			"\1\111",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"\1\114",
			"",
			"\1\115",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"",
			"",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"\1\121",
			"\1\122",
			"",
			"",
			"\1\123",
			"\1\124",
			"",
			"",
			"",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"\1\127",
			"\1\130",
			"",
			"",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"\1\132",
			"",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | VARIABLE | SYMBOL | COMMENT | WS );";
		}
	}

}
