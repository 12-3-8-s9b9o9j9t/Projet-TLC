// $ANTLR 3.5.1 C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g 2022-12-30 20:16:16

package whilestd.output;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class inputLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public inputLexer() {} 
	public inputLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public inputLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g"; }

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:6:7: ( '(' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:6:9: '('
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
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:7:7: ( ')' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:7:9: ')'
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
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:8:7: ( 'cons' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:8:9: 'cons'
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
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:9:7: ( 'nil' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:9:9: 'nil'
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
	// $ANTLR end "T__13"

	// $ANTLR start "SYMBOL"
	public final void mSYMBOL() throws RecognitionException {
		try {
			int _type = SYMBOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:44:5: ( MIN ( MAJ | MIN | DEC )* ( '!' | '?' )? )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:44:7: MIN ( MAJ | MIN | DEC )* ( '!' | '?' )?
			{
			mMIN(); 

			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:44:10: ( MAJ | MIN | DEC )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:
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

			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:44:24: ( '!' | '?' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='!'||LA2_0=='?') ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:
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
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:49:5: ( 'A' .. 'Z' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:
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
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:53:5: ( 'a' .. 'z' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:
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
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:57:5: ( '0' .. '9' )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:
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

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:59:5: ( ( DEC )+ )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:59:7: ( DEC )+
			{
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:59:7: ( DEC )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:
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
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:62:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:62:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
		// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:1:8: ( T__10 | T__11 | T__12 | T__13 | SYMBOL | INT | WS )
		int alt4=7;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt4=1;
			}
			break;
		case ')':
			{
			alt4=2;
			}
			break;
		case 'c':
			{
			int LA4_3 = input.LA(2);
			if ( (LA4_3=='o') ) {
				int LA4_8 = input.LA(3);
				if ( (LA4_8=='n') ) {
					int LA4_10 = input.LA(4);
					if ( (LA4_10=='s') ) {
						int LA4_12 = input.LA(5);
						if ( (LA4_12=='!'||(LA4_12 >= '0' && LA4_12 <= '9')||LA4_12=='?'||(LA4_12 >= 'A' && LA4_12 <= 'Z')||(LA4_12 >= 'a' && LA4_12 <= 'z')) ) {
							alt4=5;
						}

						else {
							alt4=3;
						}

					}

					else {
						alt4=5;
					}

				}

				else {
					alt4=5;
				}

			}

			else {
				alt4=5;
			}

			}
			break;
		case 'n':
			{
			int LA4_4 = input.LA(2);
			if ( (LA4_4=='i') ) {
				int LA4_9 = input.LA(3);
				if ( (LA4_9=='l') ) {
					int LA4_11 = input.LA(4);
					if ( (LA4_11=='!'||(LA4_11 >= '0' && LA4_11 <= '9')||LA4_11=='?'||(LA4_11 >= 'A' && LA4_11 <= 'Z')||(LA4_11 >= 'a' && LA4_11 <= 'z')) ) {
						alt4=5;
					}

					else {
						alt4=4;
					}

				}

				else {
					alt4=5;
				}

			}

			else {
				alt4=5;
			}

			}
			break;
		case 'a':
		case 'b':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt4=5;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt4=6;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt4=7;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 4, 0, input);
			throw nvae;
		}
		switch (alt4) {
			case 1 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:1:10: T__10
				{
				mT__10(); 

				}
				break;
			case 2 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:1:16: T__11
				{
				mT__11(); 

				}
				break;
			case 3 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:1:22: T__12
				{
				mT__12(); 

				}
				break;
			case 4 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:1:28: T__13
				{
				mT__13(); 

				}
				break;
			case 5 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:1:34: SYMBOL
				{
				mSYMBOL(); 

				}
				break;
			case 6 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:1:41: INT
				{
				mINT(); 

				}
				break;
			case 7 :
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\main\\java\\whilestd\\input.g:1:45: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
