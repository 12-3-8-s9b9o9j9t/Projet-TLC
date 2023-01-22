// $ANTLR 3.5.1 C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g 2023-01-22 17:54:55

package output;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class whileParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "CALL", "COMMANDS", 
		"COMMENT", "COND", "CONS", "DEC", "DEFINITION", "EQU", "EXPRESSIONS", 
		"FOR", "FOREACH", "FUNCTION", "FUNC_NAME", "HD", "IF", "INPUT", "LIST", 
		"MAJ", "MIN", "NIL", "NOP", "OUTPUT", "PROGRAM", "SYM", "SYMBOL", "TL", 
		"VAR", "VARIABLE", "VARIABLES", "WHILE", "WS", "'%'", "'('", "')'", "','", 
		"':'", "':='", "';'", "'=?'", "'cons'", "'do'", "'else'", "'fi'", "'for'", 
		"'foreach'", "'function'", "'hd'", "'if'", "'in'", "'list'", "'nil'", 
		"'nop'", "'od'", "'read'", "'then'", "'tl'", "'while'", "'write'"
	};
	public static final int EOF=-1;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
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
	public static final int ASSIGN=4;
	public static final int CALL=5;
	public static final int COMMANDS=6;
	public static final int COMMENT=7;
	public static final int COND=8;
	public static final int CONS=9;
	public static final int DEC=10;
	public static final int DEFINITION=11;
	public static final int EQU=12;
	public static final int EXPRESSIONS=13;
	public static final int FOR=14;
	public static final int FOREACH=15;
	public static final int FUNCTION=16;
	public static final int FUNC_NAME=17;
	public static final int HD=18;
	public static final int IF=19;
	public static final int INPUT=20;
	public static final int LIST=21;
	public static final int MAJ=22;
	public static final int MIN=23;
	public static final int NIL=24;
	public static final int NOP=25;
	public static final int OUTPUT=26;
	public static final int PROGRAM=27;
	public static final int SYM=28;
	public static final int SYMBOL=29;
	public static final int TL=30;
	public static final int VAR=31;
	public static final int VARIABLE=32;
	public static final int VARIABLES=33;
	public static final int WHILE=34;
	public static final int WS=35;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public whileParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public whileParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return whileParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:24:1: program : ( function )+ EOF -> ^( PROGRAM ( function )+ ) ;
	public final whileParser.program_return program() throws RecognitionException {
		whileParser.program_return retval = new whileParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope function1 =null;

		Object EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:25:5: ( ( function )+ EOF -> ^( PROGRAM ( function )+ ) )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:25:7: ( function )+ EOF
			{
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:25:7: ( function )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==50) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:25:7: function
					{
					pushFollow(FOLLOW_function_in_program125);
					function1=function();
					state._fsp--;

					stream_function.add(function1.getTree());
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program128);  
			stream_EOF.add(EOF2);

			// AST REWRITE
			// elements: function
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 25:21: -> ^( PROGRAM ( function )+ )
			{
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:25:24: ^( PROGRAM ( function )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				if ( !(stream_function.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_function.hasNext() ) {
					adaptor.addChild(root_1, stream_function.nextTree());
				}
				stream_function.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		catch (RecognitionException re) {
		    reportError(re);
		    throw re;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class function_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function"
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:28:1: function : 'function' SYMBOL ':' definition -> ^( FUNCTION ^( FUNC_NAME SYMBOL ) definition ) ;
	public final whileParser.function_return function() throws RecognitionException {
		whileParser.function_return retval = new whileParser.function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal3=null;
		Token SYMBOL4=null;
		Token char_literal5=null;
		ParserRuleReturnScope definition6 =null;

		Object string_literal3_tree=null;
		Object SYMBOL4_tree=null;
		Object char_literal5_tree=null;
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:29:5: ( 'function' SYMBOL ':' definition -> ^( FUNCTION ^( FUNC_NAME SYMBOL ) definition ) )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:29:7: 'function' SYMBOL ':' definition
			{
			string_literal3=(Token)match(input,50,FOLLOW_50_in_function154);  
			stream_50.add(string_literal3);

			SYMBOL4=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_function156);  
			stream_SYMBOL.add(SYMBOL4);

			char_literal5=(Token)match(input,40,FOLLOW_40_in_function158);  
			stream_40.add(char_literal5);

			pushFollow(FOLLOW_definition_in_function160);
			definition6=definition();
			state._fsp--;

			stream_definition.add(definition6.getTree());
			// AST REWRITE
			// elements: definition, SYMBOL
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 29:39: -> ^( FUNCTION ^( FUNC_NAME SYMBOL ) definition )
			{
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:29:41: ^( FUNCTION ^( FUNC_NAME SYMBOL ) definition )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:29:52: ^( FUNC_NAME SYMBOL )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_NAME, "FUNC_NAME"), root_2);
				adaptor.addChild(root_2, stream_SYMBOL.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_definition.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		catch (RecognitionException re) {
		    reportError(re);
		    throw re;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function"


	public static class definition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "definition"
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:32:1: definition : 'read' input '%' commands '%' 'write' output -> ^( DEFINITION input ^( COMMANDS commands ) ^( OUTPUT output ) ) ;
	public final whileParser.definition_return definition() throws RecognitionException {
		whileParser.definition_return retval = new whileParser.definition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal7=null;
		Token char_literal9=null;
		Token char_literal11=null;
		Token string_literal12=null;
		ParserRuleReturnScope input8 =null;
		ParserRuleReturnScope commands10 =null;
		ParserRuleReturnScope output13 =null;

		Object string_literal7_tree=null;
		Object char_literal9_tree=null;
		Object char_literal11_tree=null;
		Object string_literal12_tree=null;
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:33:5: ( 'read' input '%' commands '%' 'write' output -> ^( DEFINITION input ^( COMMANDS commands ) ^( OUTPUT output ) ) )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:33:7: 'read' input '%' commands '%' 'write' output
			{
			string_literal7=(Token)match(input,58,FOLLOW_58_in_definition189);  
			stream_58.add(string_literal7);

			pushFollow(FOLLOW_input_in_definition191);
			input8=input();
			state._fsp--;

			stream_input.add(input8.getTree());
			char_literal9=(Token)match(input,36,FOLLOW_36_in_definition193);  
			stream_36.add(char_literal9);

			pushFollow(FOLLOW_commands_in_definition195);
			commands10=commands();
			state._fsp--;

			stream_commands.add(commands10.getTree());
			char_literal11=(Token)match(input,36,FOLLOW_36_in_definition197);  
			stream_36.add(char_literal11);

			string_literal12=(Token)match(input,62,FOLLOW_62_in_definition199);  
			stream_62.add(string_literal12);

			pushFollow(FOLLOW_output_in_definition201);
			output13=output();
			state._fsp--;

			stream_output.add(output13.getTree());
			// AST REWRITE
			// elements: output, input, commands
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 33:51: -> ^( DEFINITION input ^( COMMANDS commands ) ^( OUTPUT output ) )
			{
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:33:53: ^( DEFINITION input ^( COMMANDS commands ) ^( OUTPUT output ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEFINITION, "DEFINITION"), root_1);
				adaptor.addChild(root_1, stream_input.nextTree());
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:33:72: ^( COMMANDS commands )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDS, "COMMANDS"), root_2);
				adaptor.addChild(root_2, stream_commands.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:33:93: ^( OUTPUT output )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUT, "OUTPUT"), root_2);
				adaptor.addChild(root_2, stream_output.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		catch (RecognitionException re) {
		    reportError(re);
		    throw re;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "definition"


	public static class input_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "input"
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:36:1: input : ( inputsub )? -> ^( INPUT ( inputsub )? ) ;
	public final whileParser.input_return input() throws RecognitionException {
		whileParser.input_return retval = new whileParser.input_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope inputsub14 =null;

		RewriteRuleSubtreeStream stream_inputsub=new RewriteRuleSubtreeStream(adaptor,"rule inputsub");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:37:5: ( ( inputsub )? -> ^( INPUT ( inputsub )? ) )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:37:7: ( inputsub )?
			{
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:37:7: ( inputsub )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==VARIABLE) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:37:7: inputsub
					{
					pushFollow(FOLLOW_inputsub_in_input236);
					inputsub14=inputsub();
					state._fsp--;

					stream_inputsub.add(inputsub14.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: inputsub
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 37:16: -> ^( INPUT ( inputsub )? )
			{
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:37:18: ^( INPUT ( inputsub )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUT, "INPUT"), root_1);
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:37:26: ( inputsub )?
				if ( stream_inputsub.hasNext() ) {
					adaptor.addChild(root_1, stream_inputsub.nextTree());
				}
				stream_inputsub.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		catch (RecognitionException re) {
		    reportError(re);
		    throw re;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "input"


	public static class inputsub_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "inputsub"
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:40:1: inputsub : VARIABLE ( ',' inputsub )? -> VARIABLE ( inputsub )? ;
	public final whileParser.inputsub_return inputsub() throws RecognitionException {
		whileParser.inputsub_return retval = new whileParser.inputsub_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARIABLE15=null;
		Token char_literal16=null;
		ParserRuleReturnScope inputsub17 =null;

		Object VARIABLE15_tree=null;
		Object char_literal16_tree=null;
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleSubtreeStream stream_inputsub=new RewriteRuleSubtreeStream(adaptor,"rule inputsub");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:41:5: ( VARIABLE ( ',' inputsub )? -> VARIABLE ( inputsub )? )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:41:7: VARIABLE ( ',' inputsub )?
			{
			VARIABLE15=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_inputsub261);  
			stream_VARIABLE.add(VARIABLE15);

			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:41:16: ( ',' inputsub )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==39) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:41:17: ',' inputsub
					{
					char_literal16=(Token)match(input,39,FOLLOW_39_in_inputsub264);  
					stream_39.add(char_literal16);

					pushFollow(FOLLOW_inputsub_in_inputsub266);
					inputsub17=inputsub();
					state._fsp--;

					stream_inputsub.add(inputsub17.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: VARIABLE, inputsub
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 41:31: -> VARIABLE ( inputsub )?
			{
				adaptor.addChild(root_0, stream_VARIABLE.nextNode());
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:41:42: ( inputsub )?
				if ( stream_inputsub.hasNext() ) {
					adaptor.addChild(root_0, stream_inputsub.nextTree());
				}
				stream_inputsub.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		catch (RecognitionException re) {
		    reportError(re);
		    throw re;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "inputsub"


	public static class output_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "output"
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:44:1: output : VARIABLE ( ',' output )? -> VARIABLE ( output )? ;
	public final whileParser.output_return output() throws RecognitionException {
		whileParser.output_return retval = new whileParser.output_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARIABLE18=null;
		Token char_literal19=null;
		ParserRuleReturnScope output20 =null;

		Object VARIABLE18_tree=null;
		Object char_literal19_tree=null;
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:45:5: ( VARIABLE ( ',' output )? -> VARIABLE ( output )? )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:45:7: VARIABLE ( ',' output )?
			{
			VARIABLE18=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_output290);  
			stream_VARIABLE.add(VARIABLE18);

			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:45:16: ( ',' output )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==39) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:45:17: ',' output
					{
					char_literal19=(Token)match(input,39,FOLLOW_39_in_output293);  
					stream_39.add(char_literal19);

					pushFollow(FOLLOW_output_in_output295);
					output20=output();
					state._fsp--;

					stream_output.add(output20.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: output, VARIABLE
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 45:29: -> VARIABLE ( output )?
			{
				adaptor.addChild(root_0, stream_VARIABLE.nextNode());
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:45:40: ( output )?
				if ( stream_output.hasNext() ) {
					adaptor.addChild(root_0, stream_output.nextTree());
				}
				stream_output.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		catch (RecognitionException re) {
		    reportError(re);
		    throw re;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "output"


	public static class commands_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "commands"
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:48:1: commands : command ( ';' commands )? -> command ( commands )? ;
	public final whileParser.commands_return commands() throws RecognitionException {
		whileParser.commands_return retval = new whileParser.commands_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal22=null;
		ParserRuleReturnScope command21 =null;
		ParserRuleReturnScope commands23 =null;

		Object char_literal22_tree=null;
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:49:5: ( command ( ';' commands )? -> command ( commands )? )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:49:7: command ( ';' commands )?
			{
			pushFollow(FOLLOW_command_in_commands319);
			command21=command();
			state._fsp--;

			stream_command.add(command21.getTree());
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:49:15: ( ';' commands )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==42) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:49:16: ';' commands
					{
					char_literal22=(Token)match(input,42,FOLLOW_42_in_commands322);  
					stream_42.add(char_literal22);

					pushFollow(FOLLOW_commands_in_commands324);
					commands23=commands();
					state._fsp--;

					stream_commands.add(commands23.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: commands, command
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 49:30: -> command ( commands )?
			{
				adaptor.addChild(root_0, stream_command.nextTree());
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:49:40: ( commands )?
				if ( stream_commands.hasNext() ) {
					adaptor.addChild(root_0, stream_commands.nextTree());
				}
				stream_commands.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		catch (RecognitionException re) {
		    reportError(re);
		    throw re;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "commands"


	public static class vars_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "vars"
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:52:1: vars : VARIABLE ( ',' vars )? -> VARIABLE ( vars )? ;
	public final whileParser.vars_return vars() throws RecognitionException {
		whileParser.vars_return retval = new whileParser.vars_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARIABLE24=null;
		Token char_literal25=null;
		ParserRuleReturnScope vars26 =null;

		Object VARIABLE24_tree=null;
		Object char_literal25_tree=null;
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:53:5: ( VARIABLE ( ',' vars )? -> VARIABLE ( vars )? )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:53:7: VARIABLE ( ',' vars )?
			{
			VARIABLE24=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_vars348);  
			stream_VARIABLE.add(VARIABLE24);

			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:53:16: ( ',' vars )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==39) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:53:17: ',' vars
					{
					char_literal25=(Token)match(input,39,FOLLOW_39_in_vars351);  
					stream_39.add(char_literal25);

					pushFollow(FOLLOW_vars_in_vars353);
					vars26=vars();
					state._fsp--;

					stream_vars.add(vars26.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: vars, VARIABLE
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 53:27: -> VARIABLE ( vars )?
			{
				adaptor.addChild(root_0, stream_VARIABLE.nextNode());
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:53:38: ( vars )?
				if ( stream_vars.hasNext() ) {
					adaptor.addChild(root_0, stream_vars.nextTree());
				}
				stream_vars.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		catch (RecognitionException re) {
		    reportError(re);
		    throw re;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "vars"


	public static class exprs_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprs"
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:56:1: exprs : expression ( ',' exprs )? -> expression ( exprs )? ;
	public final whileParser.exprs_return exprs() throws RecognitionException {
		whileParser.exprs_return retval = new whileParser.exprs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal28=null;
		ParserRuleReturnScope expression27 =null;
		ParserRuleReturnScope exprs29 =null;

		Object char_literal28_tree=null;
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:57:5: ( expression ( ',' exprs )? -> expression ( exprs )? )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:57:7: expression ( ',' exprs )?
			{
			pushFollow(FOLLOW_expression_in_exprs377);
			expression27=expression();
			state._fsp--;

			stream_expression.add(expression27.getTree());
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:57:18: ( ',' exprs )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==39) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:57:19: ',' exprs
					{
					char_literal28=(Token)match(input,39,FOLLOW_39_in_exprs380);  
					stream_39.add(char_literal28);

					pushFollow(FOLLOW_exprs_in_exprs382);
					exprs29=exprs();
					state._fsp--;

					stream_exprs.add(exprs29.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: expression, exprs
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 57:30: -> expression ( exprs )?
			{
				adaptor.addChild(root_0, stream_expression.nextTree());
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:57:44: ( exprs )?
				if ( stream_exprs.hasNext() ) {
					adaptor.addChild(root_0, stream_exprs.nextTree());
				}
				stream_exprs.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		catch (RecognitionException re) {
		    reportError(re);
		    throw re;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprs"


	public static class command_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command"
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:60:1: command : ( 'nop' -> NOP | ( vars ':=' exprs ) -> ^( ASSIGN ^( VARIABLES vars ) ^( EXPRESSIONS exprs ) ) | ( 'if' expression 'then' c1= commands ( 'else' c2= commands -> ^( IF ^( COND expression ) ^( COMMANDS $c1) ^( COMMANDS $c2) ) | -> ^( IF ^( COND expression ) ^( COMMANDS $c1) ) ) 'fi' ) | ( 'while' expression 'do' commands 'od' ) -> ^( WHILE ^( COND expression ) ^( COMMANDS commands ) ) | ( 'for' expression 'do' commands 'od' ) -> ^( FOR ^( COND expression ) ^( COMMANDS commands ) ) | ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' ) -> ^( FOREACH ^( COND expression ) ^( COMMANDS commands ) VARIABLE ) );
	public final whileParser.command_return command() throws RecognitionException {
		whileParser.command_return retval = new whileParser.command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal30=null;
		Token string_literal32=null;
		Token string_literal34=null;
		Token string_literal36=null;
		Token string_literal37=null;
		Token string_literal38=null;
		Token string_literal39=null;
		Token string_literal41=null;
		Token string_literal43=null;
		Token string_literal44=null;
		Token string_literal46=null;
		Token string_literal48=null;
		Token string_literal49=null;
		Token VARIABLE50=null;
		Token string_literal51=null;
		Token string_literal53=null;
		Token string_literal55=null;
		ParserRuleReturnScope c1 =null;
		ParserRuleReturnScope c2 =null;
		ParserRuleReturnScope vars31 =null;
		ParserRuleReturnScope exprs33 =null;
		ParserRuleReturnScope expression35 =null;
		ParserRuleReturnScope expression40 =null;
		ParserRuleReturnScope commands42 =null;
		ParserRuleReturnScope expression45 =null;
		ParserRuleReturnScope commands47 =null;
		ParserRuleReturnScope expression52 =null;
		ParserRuleReturnScope commands54 =null;

		Object string_literal30_tree=null;
		Object string_literal32_tree=null;
		Object string_literal34_tree=null;
		Object string_literal36_tree=null;
		Object string_literal37_tree=null;
		Object string_literal38_tree=null;
		Object string_literal39_tree=null;
		Object string_literal41_tree=null;
		Object string_literal43_tree=null;
		Object string_literal44_tree=null;
		Object string_literal46_tree=null;
		Object string_literal48_tree=null;
		Object string_literal49_tree=null;
		Object VARIABLE50_tree=null;
		Object string_literal51_tree=null;
		Object string_literal53_tree=null;
		Object string_literal55_tree=null;
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:61:5: ( 'nop' -> NOP | ( vars ':=' exprs ) -> ^( ASSIGN ^( VARIABLES vars ) ^( EXPRESSIONS exprs ) ) | ( 'if' expression 'then' c1= commands ( 'else' c2= commands -> ^( IF ^( COND expression ) ^( COMMANDS $c1) ^( COMMANDS $c2) ) | -> ^( IF ^( COND expression ) ^( COMMANDS $c1) ) ) 'fi' ) | ( 'while' expression 'do' commands 'od' ) -> ^( WHILE ^( COND expression ) ^( COMMANDS commands ) ) | ( 'for' expression 'do' commands 'od' ) -> ^( FOR ^( COND expression ) ^( COMMANDS commands ) ) | ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' ) -> ^( FOREACH ^( COND expression ) ^( COMMANDS commands ) VARIABLE ) )
			int alt9=6;
			switch ( input.LA(1) ) {
			case 56:
				{
				alt9=1;
				}
				break;
			case VARIABLE:
				{
				alt9=2;
				}
				break;
			case 52:
				{
				alt9=3;
				}
				break;
			case 61:
				{
				alt9=4;
				}
				break;
			case 48:
				{
				alt9=5;
				}
				break;
			case 49:
				{
				alt9=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:61:7: 'nop'
					{
					string_literal30=(Token)match(input,56,FOLLOW_56_in_command407);  
					stream_56.add(string_literal30);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 61:12: -> NOP
					{
						adaptor.addChild(root_0, (Object)adaptor.create(NOP, "NOP"));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:62:7: ( vars ':=' exprs )
					{
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:62:7: ( vars ':=' exprs )
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:62:8: vars ':=' exprs
					{
					pushFollow(FOLLOW_vars_in_command419);
					vars31=vars();
					state._fsp--;

					stream_vars.add(vars31.getTree());
					string_literal32=(Token)match(input,41,FOLLOW_41_in_command421);  
					stream_41.add(string_literal32);

					pushFollow(FOLLOW_exprs_in_command423);
					exprs33=exprs();
					state._fsp--;

					stream_exprs.add(exprs33.getTree());
					}

					// AST REWRITE
					// elements: vars, exprs
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 62:24: -> ^( ASSIGN ^( VARIABLES vars ) ^( EXPRESSIONS exprs ) )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:62:27: ^( ASSIGN ^( VARIABLES vars ) ^( EXPRESSIONS exprs ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGN, "ASSIGN"), root_1);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:62:36: ^( VARIABLES vars )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLES, "VARIABLES"), root_2);
						adaptor.addChild(root_2, stream_vars.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:62:54: ^( EXPRESSIONS exprs )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRESSIONS, "EXPRESSIONS"), root_2);
						adaptor.addChild(root_2, stream_exprs.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:63:7: ( 'if' expression 'then' c1= commands ( 'else' c2= commands -> ^( IF ^( COND expression ) ^( COMMANDS $c1) ^( COMMANDS $c2) ) | -> ^( IF ^( COND expression ) ^( COMMANDS $c1) ) ) 'fi' )
					{
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:63:7: ( 'if' expression 'then' c1= commands ( 'else' c2= commands -> ^( IF ^( COND expression ) ^( COMMANDS $c1) ^( COMMANDS $c2) ) | -> ^( IF ^( COND expression ) ^( COMMANDS $c1) ) ) 'fi' )
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:63:8: 'if' expression 'then' c1= commands ( 'else' c2= commands -> ^( IF ^( COND expression ) ^( COMMANDS $c1) ^( COMMANDS $c2) ) | -> ^( IF ^( COND expression ) ^( COMMANDS $c1) ) ) 'fi'
					{
					string_literal34=(Token)match(input,52,FOLLOW_52_in_command450);  
					stream_52.add(string_literal34);

					pushFollow(FOLLOW_expression_in_command452);
					expression35=expression();
					state._fsp--;

					stream_expression.add(expression35.getTree());
					string_literal36=(Token)match(input,59,FOLLOW_59_in_command454);  
					stream_59.add(string_literal36);

					pushFollow(FOLLOW_commands_in_command458);
					c1=commands();
					state._fsp--;

					stream_commands.add(c1.getTree());
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:63:43: ( 'else' c2= commands -> ^( IF ^( COND expression ) ^( COMMANDS $c1) ^( COMMANDS $c2) ) | -> ^( IF ^( COND expression ) ^( COMMANDS $c1) ) )
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==46) ) {
						alt8=1;
					}
					else if ( (LA8_0==47) ) {
						alt8=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 8, 0, input);
						throw nvae;
					}

					switch (alt8) {
						case 1 :
							// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:63:44: 'else' c2= commands
							{
							string_literal37=(Token)match(input,46,FOLLOW_46_in_command461);  
							stream_46.add(string_literal37);

							pushFollow(FOLLOW_commands_in_command465);
							c2=commands();
							state._fsp--;

							stream_commands.add(c2.getTree());
							// AST REWRITE
							// elements: expression, c1, c2
							// token labels: 
							// rule labels: c1, retval, c2
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
							RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 63:64: -> ^( IF ^( COND expression ) ^( COMMANDS $c1) ^( COMMANDS $c2) )
							{
								// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:63:66: ^( IF ^( COND expression ) ^( COMMANDS $c1) ^( COMMANDS $c2) )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
								// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:63:71: ^( COND expression )
								{
								Object root_2 = (Object)adaptor.nil();
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);
								adaptor.addChild(root_2, stream_expression.nextTree());
								adaptor.addChild(root_1, root_2);
								}

								// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:63:90: ^( COMMANDS $c1)
								{
								Object root_2 = (Object)adaptor.nil();
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDS, "COMMANDS"), root_2);
								adaptor.addChild(root_2, stream_c1.nextTree());
								adaptor.addChild(root_1, root_2);
								}

								// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:63:106: ^( COMMANDS $c2)
								{
								Object root_2 = (Object)adaptor.nil();
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDS, "COMMANDS"), root_2);
								adaptor.addChild(root_2, stream_c2.nextTree());
								adaptor.addChild(root_1, root_2);
								}

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:64:15: 
							{
							// AST REWRITE
							// elements: expression, c1
							// token labels: 
							// rule labels: c1, retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 64:15: -> ^( IF ^( COND expression ) ^( COMMANDS $c1) )
							{
								// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:64:17: ^( IF ^( COND expression ) ^( COMMANDS $c1) )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
								// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:64:22: ^( COND expression )
								{
								Object root_2 = (Object)adaptor.nil();
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);
								adaptor.addChild(root_2, stream_expression.nextTree());
								adaptor.addChild(root_1, root_2);
								}

								// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:64:41: ^( COMMANDS $c1)
								{
								Object root_2 = (Object)adaptor.nil();
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDS, "COMMANDS"), root_2);
								adaptor.addChild(root_2, stream_c1.nextTree());
								adaptor.addChild(root_1, root_2);
								}

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

					string_literal38=(Token)match(input,47,FOLLOW_47_in_command532);  
					stream_47.add(string_literal38);

					}

					}
					break;
				case 4 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:66:7: ( 'while' expression 'do' commands 'od' )
					{
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:66:7: ( 'while' expression 'do' commands 'od' )
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:66:8: 'while' expression 'do' commands 'od'
					{
					string_literal39=(Token)match(input,61,FOLLOW_61_in_command542);  
					stream_61.add(string_literal39);

					pushFollow(FOLLOW_expression_in_command544);
					expression40=expression();
					state._fsp--;

					stream_expression.add(expression40.getTree());
					string_literal41=(Token)match(input,45,FOLLOW_45_in_command546);  
					stream_45.add(string_literal41);

					pushFollow(FOLLOW_commands_in_command548);
					commands42=commands();
					state._fsp--;

					stream_commands.add(commands42.getTree());
					string_literal43=(Token)match(input,57,FOLLOW_57_in_command550);  
					stream_57.add(string_literal43);

					}

					// AST REWRITE
					// elements: expression, commands
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 66:46: -> ^( WHILE ^( COND expression ) ^( COMMANDS commands ) )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:66:49: ^( WHILE ^( COND expression ) ^( COMMANDS commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:66:57: ^( COND expression )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);
						adaptor.addChild(root_2, stream_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:66:76: ^( COMMANDS commands )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDS, "COMMANDS"), root_2);
						adaptor.addChild(root_2, stream_commands.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:67:7: ( 'for' expression 'do' commands 'od' )
					{
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:67:7: ( 'for' expression 'do' commands 'od' )
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:67:8: 'for' expression 'do' commands 'od'
					{
					string_literal44=(Token)match(input,48,FOLLOW_48_in_command577);  
					stream_48.add(string_literal44);

					pushFollow(FOLLOW_expression_in_command579);
					expression45=expression();
					state._fsp--;

					stream_expression.add(expression45.getTree());
					string_literal46=(Token)match(input,45,FOLLOW_45_in_command581);  
					stream_45.add(string_literal46);

					pushFollow(FOLLOW_commands_in_command583);
					commands47=commands();
					state._fsp--;

					stream_commands.add(commands47.getTree());
					string_literal48=(Token)match(input,57,FOLLOW_57_in_command585);  
					stream_57.add(string_literal48);

					}

					// AST REWRITE
					// elements: expression, commands
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 67:44: -> ^( FOR ^( COND expression ) ^( COMMANDS commands ) )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:67:47: ^( FOR ^( COND expression ) ^( COMMANDS commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:67:53: ^( COND expression )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);
						adaptor.addChild(root_2, stream_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:67:72: ^( COMMANDS commands )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDS, "COMMANDS"), root_2);
						adaptor.addChild(root_2, stream_commands.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:68:7: ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' )
					{
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:68:7: ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' )
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:68:8: 'foreach' VARIABLE 'in' expression 'do' commands 'od'
					{
					string_literal49=(Token)match(input,49,FOLLOW_49_in_command612);  
					stream_49.add(string_literal49);

					VARIABLE50=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_command614);  
					stream_VARIABLE.add(VARIABLE50);

					string_literal51=(Token)match(input,53,FOLLOW_53_in_command616);  
					stream_53.add(string_literal51);

					pushFollow(FOLLOW_expression_in_command618);
					expression52=expression();
					state._fsp--;

					stream_expression.add(expression52.getTree());
					string_literal53=(Token)match(input,45,FOLLOW_45_in_command620);  
					stream_45.add(string_literal53);

					pushFollow(FOLLOW_commands_in_command622);
					commands54=commands();
					state._fsp--;

					stream_commands.add(commands54.getTree());
					string_literal55=(Token)match(input,57,FOLLOW_57_in_command624);  
					stream_57.add(string_literal55);

					}

					// AST REWRITE
					// elements: VARIABLE, expression, commands
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 68:62: -> ^( FOREACH ^( COND expression ) ^( COMMANDS commands ) VARIABLE )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:68:65: ^( FOREACH ^( COND expression ) ^( COMMANDS commands ) VARIABLE )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOREACH, "FOREACH"), root_1);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:68:75: ^( COND expression )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);
						adaptor.addChild(root_2, stream_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:68:94: ^( COMMANDS commands )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDS, "COMMANDS"), root_2);
						adaptor.addChild(root_2, stream_commands.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_VARIABLE.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		catch (RecognitionException re) {
		    reportError(re);
		    throw re;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "command"


	public static class exprbase_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprbase"
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:71:1: exprbase : ( 'nil' -> NIL | VARIABLE -> ^( VAR VARIABLE ) | SYMBOL -> ^( SYM SYMBOL ) | ( '(' 'cons' lexpr ')' ) -> ^( CONS ( lexpr )? ) | ( '(' 'list' lexpr ')' ) -> ^( LIST ( lexpr )? ) | ( '(' 'hd' exprbase ')' ) -> ^( HD exprbase ) | ( '(' 'tl' exprbase ')' ) -> ^( TL exprbase ) | ( '(' SYMBOL lexpr ')' ) -> ^( CALL SYMBOL ( lexpr )? ) );
	public final whileParser.exprbase_return exprbase() throws RecognitionException {
		whileParser.exprbase_return retval = new whileParser.exprbase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal56=null;
		Token VARIABLE57=null;
		Token SYMBOL58=null;
		Token char_literal59=null;
		Token string_literal60=null;
		Token char_literal62=null;
		Token char_literal63=null;
		Token string_literal64=null;
		Token char_literal66=null;
		Token char_literal67=null;
		Token string_literal68=null;
		Token char_literal70=null;
		Token char_literal71=null;
		Token string_literal72=null;
		Token char_literal74=null;
		Token char_literal75=null;
		Token SYMBOL76=null;
		Token char_literal78=null;
		ParserRuleReturnScope lexpr61 =null;
		ParserRuleReturnScope lexpr65 =null;
		ParserRuleReturnScope exprbase69 =null;
		ParserRuleReturnScope exprbase73 =null;
		ParserRuleReturnScope lexpr77 =null;

		Object string_literal56_tree=null;
		Object VARIABLE57_tree=null;
		Object SYMBOL58_tree=null;
		Object char_literal59_tree=null;
		Object string_literal60_tree=null;
		Object char_literal62_tree=null;
		Object char_literal63_tree=null;
		Object string_literal64_tree=null;
		Object char_literal66_tree=null;
		Object char_literal67_tree=null;
		Object string_literal68_tree=null;
		Object char_literal70_tree=null;
		Object char_literal71_tree=null;
		Object string_literal72_tree=null;
		Object char_literal74_tree=null;
		Object char_literal75_tree=null;
		Object SYMBOL76_tree=null;
		Object char_literal78_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");
		RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:72:5: ( 'nil' -> NIL | VARIABLE -> ^( VAR VARIABLE ) | SYMBOL -> ^( SYM SYMBOL ) | ( '(' 'cons' lexpr ')' ) -> ^( CONS ( lexpr )? ) | ( '(' 'list' lexpr ')' ) -> ^( LIST ( lexpr )? ) | ( '(' 'hd' exprbase ')' ) -> ^( HD exprbase ) | ( '(' 'tl' exprbase ')' ) -> ^( TL exprbase ) | ( '(' SYMBOL lexpr ')' ) -> ^( CALL SYMBOL ( lexpr )? ) )
			int alt10=8;
			switch ( input.LA(1) ) {
			case 55:
				{
				alt10=1;
				}
				break;
			case VARIABLE:
				{
				alt10=2;
				}
				break;
			case SYMBOL:
				{
				alt10=3;
				}
				break;
			case 37:
				{
				switch ( input.LA(2) ) {
				case 44:
					{
					alt10=4;
					}
					break;
				case 54:
					{
					alt10=5;
					}
					break;
				case 51:
					{
					alt10=6;
					}
					break;
				case 60:
					{
					alt10=7;
					}
					break;
				case SYMBOL:
					{
					alt10=8;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:72:7: 'nil'
					{
					string_literal56=(Token)match(input,55,FOLLOW_55_in_exprbase661);  
					stream_55.add(string_literal56);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 72:12: -> NIL
					{
						adaptor.addChild(root_0, (Object)adaptor.create(NIL, "NIL"));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:73:7: VARIABLE
					{
					VARIABLE57=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_exprbase671);  
					stream_VARIABLE.add(VARIABLE57);

					// AST REWRITE
					// elements: VARIABLE
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 73:15: -> ^( VAR VARIABLE )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:73:18: ^( VAR VARIABLE )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);
						adaptor.addChild(root_1, stream_VARIABLE.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:74:7: SYMBOL
					{
					SYMBOL58=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_exprbase686);  
					stream_SYMBOL.add(SYMBOL58);

					// AST REWRITE
					// elements: SYMBOL
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 74:13: -> ^( SYM SYMBOL )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:74:16: ^( SYM SYMBOL )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SYM, "SYM"), root_1);
						adaptor.addChild(root_1, stream_SYMBOL.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:75:7: ( '(' 'cons' lexpr ')' )
					{
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:75:7: ( '(' 'cons' lexpr ')' )
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:75:8: '(' 'cons' lexpr ')'
					{
					char_literal59=(Token)match(input,37,FOLLOW_37_in_exprbase702);  
					stream_37.add(char_literal59);

					string_literal60=(Token)match(input,44,FOLLOW_44_in_exprbase704);  
					stream_44.add(string_literal60);

					pushFollow(FOLLOW_lexpr_in_exprbase706);
					lexpr61=lexpr();
					state._fsp--;

					stream_lexpr.add(lexpr61.getTree());
					char_literal62=(Token)match(input,38,FOLLOW_38_in_exprbase708);  
					stream_38.add(char_literal62);

					}

					// AST REWRITE
					// elements: lexpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 75:29: -> ^( CONS ( lexpr )? )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:75:31: ^( CONS ( lexpr )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONS, "CONS"), root_1);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:75:38: ( lexpr )?
						if ( stream_lexpr.hasNext() ) {
							adaptor.addChild(root_1, stream_lexpr.nextTree());
						}
						stream_lexpr.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:76:7: ( '(' 'list' lexpr ')' )
					{
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:76:7: ( '(' 'list' lexpr ')' )
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:76:8: '(' 'list' lexpr ')'
					{
					char_literal63=(Token)match(input,37,FOLLOW_37_in_exprbase725);  
					stream_37.add(char_literal63);

					string_literal64=(Token)match(input,54,FOLLOW_54_in_exprbase727);  
					stream_54.add(string_literal64);

					pushFollow(FOLLOW_lexpr_in_exprbase729);
					lexpr65=lexpr();
					state._fsp--;

					stream_lexpr.add(lexpr65.getTree());
					char_literal66=(Token)match(input,38,FOLLOW_38_in_exprbase731);  
					stream_38.add(char_literal66);

					}

					// AST REWRITE
					// elements: lexpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 76:29: -> ^( LIST ( lexpr )? )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:76:31: ^( LIST ( lexpr )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:76:38: ( lexpr )?
						if ( stream_lexpr.hasNext() ) {
							adaptor.addChild(root_1, stream_lexpr.nextTree());
						}
						stream_lexpr.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:77:7: ( '(' 'hd' exprbase ')' )
					{
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:77:7: ( '(' 'hd' exprbase ')' )
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:77:8: '(' 'hd' exprbase ')'
					{
					char_literal67=(Token)match(input,37,FOLLOW_37_in_exprbase748);  
					stream_37.add(char_literal67);

					string_literal68=(Token)match(input,51,FOLLOW_51_in_exprbase750);  
					stream_51.add(string_literal68);

					pushFollow(FOLLOW_exprbase_in_exprbase752);
					exprbase69=exprbase();
					state._fsp--;

					stream_exprbase.add(exprbase69.getTree());
					char_literal70=(Token)match(input,38,FOLLOW_38_in_exprbase754);  
					stream_38.add(char_literal70);

					}

					// AST REWRITE
					// elements: exprbase
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 77:30: -> ^( HD exprbase )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:77:32: ^( HD exprbase )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(HD, "HD"), root_1);
						adaptor.addChild(root_1, stream_exprbase.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:78:7: ( '(' 'tl' exprbase ')' )
					{
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:78:7: ( '(' 'tl' exprbase ')' )
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:78:8: '(' 'tl' exprbase ')'
					{
					char_literal71=(Token)match(input,37,FOLLOW_37_in_exprbase770);  
					stream_37.add(char_literal71);

					string_literal72=(Token)match(input,60,FOLLOW_60_in_exprbase772);  
					stream_60.add(string_literal72);

					pushFollow(FOLLOW_exprbase_in_exprbase774);
					exprbase73=exprbase();
					state._fsp--;

					stream_exprbase.add(exprbase73.getTree());
					char_literal74=(Token)match(input,38,FOLLOW_38_in_exprbase776);  
					stream_38.add(char_literal74);

					}

					// AST REWRITE
					// elements: exprbase
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 78:30: -> ^( TL exprbase )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:78:32: ^( TL exprbase )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TL, "TL"), root_1);
						adaptor.addChild(root_1, stream_exprbase.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:79:7: ( '(' SYMBOL lexpr ')' )
					{
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:79:7: ( '(' SYMBOL lexpr ')' )
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:79:8: '(' SYMBOL lexpr ')'
					{
					char_literal75=(Token)match(input,37,FOLLOW_37_in_exprbase792);  
					stream_37.add(char_literal75);

					SYMBOL76=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_exprbase794);  
					stream_SYMBOL.add(SYMBOL76);

					pushFollow(FOLLOW_lexpr_in_exprbase796);
					lexpr77=lexpr();
					state._fsp--;

					stream_lexpr.add(lexpr77.getTree());
					char_literal78=(Token)match(input,38,FOLLOW_38_in_exprbase798);  
					stream_38.add(char_literal78);

					}

					// AST REWRITE
					// elements: SYMBOL, lexpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 79:29: -> ^( CALL SYMBOL ( lexpr )? )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:79:31: ^( CALL SYMBOL ( lexpr )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALL, "CALL"), root_1);
						adaptor.addChild(root_1, stream_SYMBOL.nextNode());
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:79:45: ( lexpr )?
						if ( stream_lexpr.hasNext() ) {
							adaptor.addChild(root_1, stream_lexpr.nextTree());
						}
						stream_lexpr.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		catch (RecognitionException re) {
		    reportError(re);
		    throw re;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprbase"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:82:1: expression : e1= exprbase ( '=?' e2= exprbase -> ^( EQU $e1 $e2) | -> $e1) ;
	public final whileParser.expression_return expression() throws RecognitionException {
		whileParser.expression_return retval = new whileParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal79=null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		Object string_literal79_tree=null;
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:83:5: (e1= exprbase ( '=?' e2= exprbase -> ^( EQU $e1 $e2) | -> $e1) )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:83:7: e1= exprbase ( '=?' e2= exprbase -> ^( EQU $e1 $e2) | -> $e1)
			{
			pushFollow(FOLLOW_exprbase_in_expression827);
			e1=exprbase();
			state._fsp--;

			stream_exprbase.add(e1.getTree());
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:83:19: ( '=?' e2= exprbase -> ^( EQU $e1 $e2) | -> $e1)
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==43) ) {
				alt11=1;
			}
			else if ( (LA11_0==36||LA11_0==39||LA11_0==42||(LA11_0 >= 45 && LA11_0 <= 47)||LA11_0==57||LA11_0==59) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:83:20: '=?' e2= exprbase
					{
					string_literal79=(Token)match(input,43,FOLLOW_43_in_expression830);  
					stream_43.add(string_literal79);

					pushFollow(FOLLOW_exprbase_in_expression834);
					e2=exprbase();
					state._fsp--;

					stream_exprbase.add(e2.getTree());
					// AST REWRITE
					// elements: e1, e2
					// token labels: 
					// rule labels: e1, e2, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.getTree():null);
					RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 83:37: -> ^( EQU $e1 $e2)
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:83:40: ^( EQU $e1 $e2)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQU, "EQU"), root_1);
						adaptor.addChild(root_1, stream_e1.nextTree());
						adaptor.addChild(root_1, stream_e2.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:83:57: 
					{
					// AST REWRITE
					// elements: e1
					// token labels: 
					// rule labels: e1, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 83:57: -> $e1
					{
						adaptor.addChild(root_0, stream_e1.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		catch (RecognitionException re) {
		    reportError(re);
		    throw re;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class lexpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lexpr"
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:86:1: lexpr : ( exprbase )* ;
	public final whileParser.lexpr_return lexpr() throws RecognitionException {
		whileParser.lexpr_return retval = new whileParser.lexpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope exprbase80 =null;


		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:87:5: ( ( exprbase )* )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:87:7: ( exprbase )*
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:87:7: ( exprbase )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==SYMBOL||LA12_0==VARIABLE||LA12_0==37||LA12_0==55) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\whilec\\src\\while.g:87:7: exprbase
					{
					pushFollow(FOLLOW_exprbase_in_lexpr871);
					exprbase80=exprbase();
					state._fsp--;

					adaptor.addChild(root_0, exprbase80.getTree());

					}
					break;

				default :
					break loop12;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		catch (RecognitionException re) {
		    reportError(re);
		    throw re;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lexpr"

	// Delegated rules



	public static final BitSet FOLLOW_function_in_program125 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_EOF_in_program128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_function154 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SYMBOL_in_function156 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_function158 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_definition_in_function160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_definition189 = new BitSet(new long[]{0x0000001100000000L});
	public static final BitSet FOLLOW_input_in_definition191 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_definition193 = new BitSet(new long[]{0x2113000100000000L});
	public static final BitSet FOLLOW_commands_in_definition195 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_definition197 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_definition199 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_output_in_definition201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inputsub_in_input236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_inputsub261 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_inputsub264 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_inputsub_in_inputsub266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_output290 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_output293 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_output_in_output295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commands319 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_42_in_commands322 = new BitSet(new long[]{0x2113000100000000L});
	public static final BitSet FOLLOW_commands_in_commands324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_vars348 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_vars351 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_vars_in_vars353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprs377 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_exprs380 = new BitSet(new long[]{0x0080002120000000L});
	public static final BitSet FOLLOW_exprs_in_exprs382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_command407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_command419 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_command421 = new BitSet(new long[]{0x0080002120000000L});
	public static final BitSet FOLLOW_exprs_in_command423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_command450 = new BitSet(new long[]{0x0080002120000000L});
	public static final BitSet FOLLOW_expression_in_command452 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_command454 = new BitSet(new long[]{0x2113000100000000L});
	public static final BitSet FOLLOW_commands_in_command458 = new BitSet(new long[]{0x0000C00000000000L});
	public static final BitSet FOLLOW_46_in_command461 = new BitSet(new long[]{0x2113000100000000L});
	public static final BitSet FOLLOW_commands_in_command465 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_command532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_command542 = new BitSet(new long[]{0x0080002120000000L});
	public static final BitSet FOLLOW_expression_in_command544 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_command546 = new BitSet(new long[]{0x2113000100000000L});
	public static final BitSet FOLLOW_commands_in_command548 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_command550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_command577 = new BitSet(new long[]{0x0080002120000000L});
	public static final BitSet FOLLOW_expression_in_command579 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_command581 = new BitSet(new long[]{0x2113000100000000L});
	public static final BitSet FOLLOW_commands_in_command583 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_command585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_command612 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_VARIABLE_in_command614 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_command616 = new BitSet(new long[]{0x0080002120000000L});
	public static final BitSet FOLLOW_expression_in_command618 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_command620 = new BitSet(new long[]{0x2113000100000000L});
	public static final BitSet FOLLOW_commands_in_command622 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_command624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_exprbase661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_exprbase671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_exprbase686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_exprbase702 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_exprbase704 = new BitSet(new long[]{0x0080006120000000L});
	public static final BitSet FOLLOW_lexpr_in_exprbase706 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_exprbase708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_exprbase725 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_exprbase727 = new BitSet(new long[]{0x0080006120000000L});
	public static final BitSet FOLLOW_lexpr_in_exprbase729 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_exprbase731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_exprbase748 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_exprbase750 = new BitSet(new long[]{0x0080002120000000L});
	public static final BitSet FOLLOW_exprbase_in_exprbase752 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_exprbase754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_exprbase770 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_exprbase772 = new BitSet(new long[]{0x0080002120000000L});
	public static final BitSet FOLLOW_exprbase_in_exprbase774 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_exprbase776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_exprbase792 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SYMBOL_in_exprbase794 = new BitSet(new long[]{0x0080006120000000L});
	public static final BitSet FOLLOW_lexpr_in_exprbase796 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_exprbase798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_in_expression827 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_43_in_expression830 = new BitSet(new long[]{0x0080002120000000L});
	public static final BitSet FOLLOW_exprbase_in_expression834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_in_lexpr871 = new BitSet(new long[]{0x0080002120000002L});
}
