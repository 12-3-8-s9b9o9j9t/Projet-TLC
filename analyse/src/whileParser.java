// $ANTLR 3.5.1 C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g 2022-12-25 17:32:53

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class whileParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "BODY", "CALL", "COMMANDS", 
		"COMMENT", "COND", "CONS", "DEC", "DEFINITION", "ELSE", "EQU", "EXPRESSIONS", 
		"FOR", "FOREACH", "FUNCTION", "FUNC_NAME", "HD", "IF", "INPUT", "ITER", 
		"LIST", "MAJ", "MIN", "NIL", "NOP", "OUTPUT", "SYM", "SYMBOL", "THEN", 
		"TL", "VAR", "VARIABLE", "VARIABLES", "WHILE", "WS", "'%'", "'('", "')'", 
		"','", "':'", "':='", "';'", "'=?'", "'cons'", "'do'", "'else'", "'fi'", 
		"'for'", "'foreach'", "'function'", "'hd'", "'if'", "'in'", "'list'", 
		"'nil'", "'nop'", "'od'", "'read'", "'then'", "'tl'", "'while'", "'write'"
	};
	public static final int EOF=-1;
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
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
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
	public static final int SYM=30;
	public static final int SYMBOL=31;
	public static final int THEN=32;
	public static final int TL=33;
	public static final int VAR=34;
	public static final int VARIABLE=35;
	public static final int VARIABLES=36;
	public static final int WHILE=37;
	public static final int WS=38;

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
	@Override public String getGrammarFileName() { return "C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:9:1: program : function ( ( program )? | EOF !) ;
	public final whileParser.program_return program() throws RecognitionException {
		whileParser.program_return retval = new whileParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF3=null;
		ParserRuleReturnScope function1 =null;
		ParserRuleReturnScope program2 =null;

		Object EOF3_tree=null;

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:10:5: ( function ( ( program )? | EOF !) )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:10:7: function ( ( program )? | EOF !)
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_function_in_program113);
			function1=function();
			state._fsp--;

			adaptor.addChild(root_0, function1.getTree());

			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:10:16: ( ( program )? | EOF !)
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==53) ) {
				alt2=1;
			}
			else if ( (LA2_0==EOF) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:10:17: ( program )?
					{
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:10:17: ( program )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==53) ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:10:17: program
							{
							pushFollow(FOLLOW_program_in_program116);
							program2=program();
							state._fsp--;

							adaptor.addChild(root_0, program2.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:10:28: EOF !
					{
					EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_program121); 
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
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
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
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:13:1: function : 'function' SYMBOL ':' definition -> ^( FUNCTION ^( FUNC_NAME SYMBOL ) definition ) ;
	public final whileParser.function_return function() throws RecognitionException {
		whileParser.function_return retval = new whileParser.function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal4=null;
		Token SYMBOL5=null;
		Token char_literal6=null;
		ParserRuleReturnScope definition7 =null;

		Object string_literal4_tree=null;
		Object SYMBOL5_tree=null;
		Object char_literal6_tree=null;
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:14:5: ( 'function' SYMBOL ':' definition -> ^( FUNCTION ^( FUNC_NAME SYMBOL ) definition ) )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:14:7: 'function' SYMBOL ':' definition
			{
			string_literal4=(Token)match(input,53,FOLLOW_53_in_function140);  
			stream_53.add(string_literal4);

			SYMBOL5=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_function142);  
			stream_SYMBOL.add(SYMBOL5);

			char_literal6=(Token)match(input,43,FOLLOW_43_in_function144);  
			stream_43.add(char_literal6);

			pushFollow(FOLLOW_definition_in_function146);
			definition7=definition();
			state._fsp--;

			stream_definition.add(definition7.getTree());
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
			// 14:39: -> ^( FUNCTION ^( FUNC_NAME SYMBOL ) definition )
			{
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:14:41: ^( FUNCTION ^( FUNC_NAME SYMBOL ) definition )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:14:52: ^( FUNC_NAME SYMBOL )
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
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
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
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:17:1: definition : 'read' input '%' commands '%' 'write' output -> ^( DEFINITION input ^( COMMANDS commands ) ^( OUTPUT output ) ) ;
	public final whileParser.definition_return definition() throws RecognitionException {
		whileParser.definition_return retval = new whileParser.definition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal8=null;
		Token char_literal10=null;
		Token char_literal12=null;
		Token string_literal13=null;
		ParserRuleReturnScope input9 =null;
		ParserRuleReturnScope commands11 =null;
		ParserRuleReturnScope output14 =null;

		Object string_literal8_tree=null;
		Object char_literal10_tree=null;
		Object char_literal12_tree=null;
		Object string_literal13_tree=null;
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:18:5: ( 'read' input '%' commands '%' 'write' output -> ^( DEFINITION input ^( COMMANDS commands ) ^( OUTPUT output ) ) )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:18:7: 'read' input '%' commands '%' 'write' output
			{
			string_literal8=(Token)match(input,61,FOLLOW_61_in_definition175);  
			stream_61.add(string_literal8);

			pushFollow(FOLLOW_input_in_definition177);
			input9=input();
			state._fsp--;

			stream_input.add(input9.getTree());
			char_literal10=(Token)match(input,39,FOLLOW_39_in_definition179);  
			stream_39.add(char_literal10);

			pushFollow(FOLLOW_commands_in_definition181);
			commands11=commands();
			state._fsp--;

			stream_commands.add(commands11.getTree());
			char_literal12=(Token)match(input,39,FOLLOW_39_in_definition183);  
			stream_39.add(char_literal12);

			string_literal13=(Token)match(input,65,FOLLOW_65_in_definition185);  
			stream_65.add(string_literal13);

			pushFollow(FOLLOW_output_in_definition187);
			output14=output();
			state._fsp--;

			stream_output.add(output14.getTree());
			// AST REWRITE
			// elements: input, commands, output
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 18:51: -> ^( DEFINITION input ^( COMMANDS commands ) ^( OUTPUT output ) )
			{
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:18:53: ^( DEFINITION input ^( COMMANDS commands ) ^( OUTPUT output ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEFINITION, "DEFINITION"), root_1);
				adaptor.addChild(root_1, stream_input.nextTree());
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:18:72: ^( COMMANDS commands )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDS, "COMMANDS"), root_2);
				adaptor.addChild(root_2, stream_commands.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:18:93: ^( OUTPUT output )
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
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
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
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:21:1: input : ( inputsub )? -> ^( INPUT ( inputsub )? ) ;
	public final whileParser.input_return input() throws RecognitionException {
		whileParser.input_return retval = new whileParser.input_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope inputsub15 =null;

		RewriteRuleSubtreeStream stream_inputsub=new RewriteRuleSubtreeStream(adaptor,"rule inputsub");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:22:5: ( ( inputsub )? -> ^( INPUT ( inputsub )? ) )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:22:7: ( inputsub )?
			{
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:22:7: ( inputsub )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==VARIABLE) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:22:7: inputsub
					{
					pushFollow(FOLLOW_inputsub_in_input222);
					inputsub15=inputsub();
					state._fsp--;

					stream_inputsub.add(inputsub15.getTree());
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
			// 22:16: -> ^( INPUT ( inputsub )? )
			{
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:22:18: ^( INPUT ( inputsub )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUT, "INPUT"), root_1);
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:22:26: ( inputsub )?
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
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
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
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:25:1: inputsub : VARIABLE ( ',' inputsub )? -> VARIABLE ( inputsub )? ;
	public final whileParser.inputsub_return inputsub() throws RecognitionException {
		whileParser.inputsub_return retval = new whileParser.inputsub_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARIABLE16=null;
		Token char_literal17=null;
		ParserRuleReturnScope inputsub18 =null;

		Object VARIABLE16_tree=null;
		Object char_literal17_tree=null;
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_inputsub=new RewriteRuleSubtreeStream(adaptor,"rule inputsub");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:26:5: ( VARIABLE ( ',' inputsub )? -> VARIABLE ( inputsub )? )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:26:7: VARIABLE ( ',' inputsub )?
			{
			VARIABLE16=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_inputsub247);  
			stream_VARIABLE.add(VARIABLE16);

			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:26:16: ( ',' inputsub )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==42) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:26:17: ',' inputsub
					{
					char_literal17=(Token)match(input,42,FOLLOW_42_in_inputsub250);  
					stream_42.add(char_literal17);

					pushFollow(FOLLOW_inputsub_in_inputsub252);
					inputsub18=inputsub();
					state._fsp--;

					stream_inputsub.add(inputsub18.getTree());
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
			// 26:31: -> VARIABLE ( inputsub )?
			{
				adaptor.addChild(root_0, stream_VARIABLE.nextNode());
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:26:42: ( inputsub )?
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
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
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
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:29:1: output : VARIABLE ( ',' output )? -> VARIABLE ( output )? ;
	public final whileParser.output_return output() throws RecognitionException {
		whileParser.output_return retval = new whileParser.output_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARIABLE19=null;
		Token char_literal20=null;
		ParserRuleReturnScope output21 =null;

		Object VARIABLE19_tree=null;
		Object char_literal20_tree=null;
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:30:5: ( VARIABLE ( ',' output )? -> VARIABLE ( output )? )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:30:7: VARIABLE ( ',' output )?
			{
			VARIABLE19=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_output276);  
			stream_VARIABLE.add(VARIABLE19);

			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:30:16: ( ',' output )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==42) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:30:17: ',' output
					{
					char_literal20=(Token)match(input,42,FOLLOW_42_in_output279);  
					stream_42.add(char_literal20);

					pushFollow(FOLLOW_output_in_output281);
					output21=output();
					state._fsp--;

					stream_output.add(output21.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: VARIABLE, output
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 30:29: -> VARIABLE ( output )?
			{
				adaptor.addChild(root_0, stream_VARIABLE.nextNode());
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:30:40: ( output )?
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
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
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
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:33:1: commands : command ( ';' commands )? -> command ( commands )? ;
	public final whileParser.commands_return commands() throws RecognitionException {
		whileParser.commands_return retval = new whileParser.commands_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal23=null;
		ParserRuleReturnScope command22 =null;
		ParserRuleReturnScope commands24 =null;

		Object char_literal23_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:34:5: ( command ( ';' commands )? -> command ( commands )? )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:34:7: command ( ';' commands )?
			{
			pushFollow(FOLLOW_command_in_commands305);
			command22=command();
			state._fsp--;

			stream_command.add(command22.getTree());
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:34:15: ( ';' commands )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==45) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:34:16: ';' commands
					{
					char_literal23=(Token)match(input,45,FOLLOW_45_in_commands308);  
					stream_45.add(char_literal23);

					pushFollow(FOLLOW_commands_in_commands310);
					commands24=commands();
					state._fsp--;

					stream_commands.add(commands24.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: command, commands
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 34:30: -> command ( commands )?
			{
				adaptor.addChild(root_0, stream_command.nextTree());
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:34:40: ( commands )?
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
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
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
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:37:1: vars : VARIABLE ( ',' vars )? -> VARIABLE ( vars )? ;
	public final whileParser.vars_return vars() throws RecognitionException {
		whileParser.vars_return retval = new whileParser.vars_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARIABLE25=null;
		Token char_literal26=null;
		ParserRuleReturnScope vars27 =null;

		Object VARIABLE25_tree=null;
		Object char_literal26_tree=null;
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:38:5: ( VARIABLE ( ',' vars )? -> VARIABLE ( vars )? )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:38:7: VARIABLE ( ',' vars )?
			{
			VARIABLE25=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_vars334);  
			stream_VARIABLE.add(VARIABLE25);

			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:38:16: ( ',' vars )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==42) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:38:17: ',' vars
					{
					char_literal26=(Token)match(input,42,FOLLOW_42_in_vars337);  
					stream_42.add(char_literal26);

					pushFollow(FOLLOW_vars_in_vars339);
					vars27=vars();
					state._fsp--;

					stream_vars.add(vars27.getTree());
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
			// 38:27: -> VARIABLE ( vars )?
			{
				adaptor.addChild(root_0, stream_VARIABLE.nextNode());
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:38:38: ( vars )?
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
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
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
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:41:1: exprs : expression ( ',' exprs )? -> expression ( exprs )? ;
	public final whileParser.exprs_return exprs() throws RecognitionException {
		whileParser.exprs_return retval = new whileParser.exprs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal29=null;
		ParserRuleReturnScope expression28 =null;
		ParserRuleReturnScope exprs30 =null;

		Object char_literal29_tree=null;
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:42:5: ( expression ( ',' exprs )? -> expression ( exprs )? )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:42:7: expression ( ',' exprs )?
			{
			pushFollow(FOLLOW_expression_in_exprs363);
			expression28=expression();
			state._fsp--;

			stream_expression.add(expression28.getTree());
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:42:18: ( ',' exprs )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==42) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:42:19: ',' exprs
					{
					char_literal29=(Token)match(input,42,FOLLOW_42_in_exprs366);  
					stream_42.add(char_literal29);

					pushFollow(FOLLOW_exprs_in_exprs368);
					exprs30=exprs();
					state._fsp--;

					stream_exprs.add(exprs30.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: exprs, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 42:30: -> expression ( exprs )?
			{
				adaptor.addChild(root_0, stream_expression.nextTree());
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:42:44: ( exprs )?
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
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
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
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:45:1: command : ( 'nop' -> NOP | ( vars ':=' exprs ) -> ^( ASSIGN ^( VARIABLES vars ) ^( EXPRESSIONS exprs ) ) | ( 'if' expression 'then' c1= commands ( 'else' c2= commands -> ^( IF ^( COND expression ) ^( THEN $c1) ^( ELSE $c2) ) | -> ^( IF ^( COND expression ) ^( THEN $c1) ) ) 'fi' ) | ( 'while' expression 'do' commands 'od' ) -> ^( WHILE ^( COND expression ) ^( BODY commands ) ) | ( 'for' expression 'do' commands 'od' ) -> ^( FOR ^( ITER expression ) ^( BODY commands ) ) | ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' ) -> ^( FOREACH VARIABLE ^( ITER expression ) ^( BODY commands ) ) );
	public final whileParser.command_return command() throws RecognitionException {
		whileParser.command_return retval = new whileParser.command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal31=null;
		Token string_literal33=null;
		Token string_literal35=null;
		Token string_literal37=null;
		Token string_literal38=null;
		Token string_literal39=null;
		Token string_literal40=null;
		Token string_literal42=null;
		Token string_literal44=null;
		Token string_literal45=null;
		Token string_literal47=null;
		Token string_literal49=null;
		Token string_literal50=null;
		Token VARIABLE51=null;
		Token string_literal52=null;
		Token string_literal54=null;
		Token string_literal56=null;
		ParserRuleReturnScope c1 =null;
		ParserRuleReturnScope c2 =null;
		ParserRuleReturnScope vars32 =null;
		ParserRuleReturnScope exprs34 =null;
		ParserRuleReturnScope expression36 =null;
		ParserRuleReturnScope expression41 =null;
		ParserRuleReturnScope commands43 =null;
		ParserRuleReturnScope expression46 =null;
		ParserRuleReturnScope commands48 =null;
		ParserRuleReturnScope expression53 =null;
		ParserRuleReturnScope commands55 =null;

		Object string_literal31_tree=null;
		Object string_literal33_tree=null;
		Object string_literal35_tree=null;
		Object string_literal37_tree=null;
		Object string_literal38_tree=null;
		Object string_literal39_tree=null;
		Object string_literal40_tree=null;
		Object string_literal42_tree=null;
		Object string_literal44_tree=null;
		Object string_literal45_tree=null;
		Object string_literal47_tree=null;
		Object string_literal49_tree=null;
		Object string_literal50_tree=null;
		Object VARIABLE51_tree=null;
		Object string_literal52_tree=null;
		Object string_literal54_tree=null;
		Object string_literal56_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:46:5: ( 'nop' -> NOP | ( vars ':=' exprs ) -> ^( ASSIGN ^( VARIABLES vars ) ^( EXPRESSIONS exprs ) ) | ( 'if' expression 'then' c1= commands ( 'else' c2= commands -> ^( IF ^( COND expression ) ^( THEN $c1) ^( ELSE $c2) ) | -> ^( IF ^( COND expression ) ^( THEN $c1) ) ) 'fi' ) | ( 'while' expression 'do' commands 'od' ) -> ^( WHILE ^( COND expression ) ^( BODY commands ) ) | ( 'for' expression 'do' commands 'od' ) -> ^( FOR ^( ITER expression ) ^( BODY commands ) ) | ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' ) -> ^( FOREACH VARIABLE ^( ITER expression ) ^( BODY commands ) ) )
			int alt10=6;
			switch ( input.LA(1) ) {
			case 59:
				{
				alt10=1;
				}
				break;
			case VARIABLE:
				{
				alt10=2;
				}
				break;
			case 55:
				{
				alt10=3;
				}
				break;
			case 64:
				{
				alt10=4;
				}
				break;
			case 51:
				{
				alt10=5;
				}
				break;
			case 52:
				{
				alt10=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:46:7: 'nop'
					{
					string_literal31=(Token)match(input,59,FOLLOW_59_in_command393);  
					stream_59.add(string_literal31);

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
					// 46:12: -> NOP
					{
						adaptor.addChild(root_0, (Object)adaptor.create(NOP, "NOP"));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:47:7: ( vars ':=' exprs )
					{
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:47:7: ( vars ':=' exprs )
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:47:8: vars ':=' exprs
					{
					pushFollow(FOLLOW_vars_in_command405);
					vars32=vars();
					state._fsp--;

					stream_vars.add(vars32.getTree());
					string_literal33=(Token)match(input,44,FOLLOW_44_in_command407);  
					stream_44.add(string_literal33);

					pushFollow(FOLLOW_exprs_in_command409);
					exprs34=exprs();
					state._fsp--;

					stream_exprs.add(exprs34.getTree());
					}

					// AST REWRITE
					// elements: exprs, vars
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 47:24: -> ^( ASSIGN ^( VARIABLES vars ) ^( EXPRESSIONS exprs ) )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:47:27: ^( ASSIGN ^( VARIABLES vars ) ^( EXPRESSIONS exprs ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGN, "ASSIGN"), root_1);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:47:36: ^( VARIABLES vars )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLES, "VARIABLES"), root_2);
						adaptor.addChild(root_2, stream_vars.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:47:54: ^( EXPRESSIONS exprs )
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
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:48:7: ( 'if' expression 'then' c1= commands ( 'else' c2= commands -> ^( IF ^( COND expression ) ^( THEN $c1) ^( ELSE $c2) ) | -> ^( IF ^( COND expression ) ^( THEN $c1) ) ) 'fi' )
					{
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:48:7: ( 'if' expression 'then' c1= commands ( 'else' c2= commands -> ^( IF ^( COND expression ) ^( THEN $c1) ^( ELSE $c2) ) | -> ^( IF ^( COND expression ) ^( THEN $c1) ) ) 'fi' )
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:48:8: 'if' expression 'then' c1= commands ( 'else' c2= commands -> ^( IF ^( COND expression ) ^( THEN $c1) ^( ELSE $c2) ) | -> ^( IF ^( COND expression ) ^( THEN $c1) ) ) 'fi'
					{
					string_literal35=(Token)match(input,55,FOLLOW_55_in_command436);  
					stream_55.add(string_literal35);

					pushFollow(FOLLOW_expression_in_command438);
					expression36=expression();
					state._fsp--;

					stream_expression.add(expression36.getTree());
					string_literal37=(Token)match(input,62,FOLLOW_62_in_command440);  
					stream_62.add(string_literal37);

					pushFollow(FOLLOW_commands_in_command444);
					c1=commands();
					state._fsp--;

					stream_commands.add(c1.getTree());
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:48:43: ( 'else' c2= commands -> ^( IF ^( COND expression ) ^( THEN $c1) ^( ELSE $c2) ) | -> ^( IF ^( COND expression ) ^( THEN $c1) ) )
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==49) ) {
						alt9=1;
					}
					else if ( (LA9_0==50) ) {
						alt9=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						throw nvae;
					}

					switch (alt9) {
						case 1 :
							// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:48:44: 'else' c2= commands
							{
							string_literal38=(Token)match(input,49,FOLLOW_49_in_command447);  
							stream_49.add(string_literal38);

							pushFollow(FOLLOW_commands_in_command451);
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
							// 48:64: -> ^( IF ^( COND expression ) ^( THEN $c1) ^( ELSE $c2) )
							{
								// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:48:66: ^( IF ^( COND expression ) ^( THEN $c1) ^( ELSE $c2) )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
								// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:48:71: ^( COND expression )
								{
								Object root_2 = (Object)adaptor.nil();
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);
								adaptor.addChild(root_2, stream_expression.nextTree());
								adaptor.addChild(root_1, root_2);
								}

								// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:48:90: ^( THEN $c1)
								{
								Object root_2 = (Object)adaptor.nil();
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_2);
								adaptor.addChild(root_2, stream_c1.nextTree());
								adaptor.addChild(root_1, root_2);
								}

								// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:48:102: ^( ELSE $c2)
								{
								Object root_2 = (Object)adaptor.nil();
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSE, "ELSE"), root_2);
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
							// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:49:15: 
							{
							// AST REWRITE
							// elements: c1, expression
							// token labels: 
							// rule labels: c1, retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 49:15: -> ^( IF ^( COND expression ) ^( THEN $c1) )
							{
								// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:49:17: ^( IF ^( COND expression ) ^( THEN $c1) )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
								// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:49:22: ^( COND expression )
								{
								Object root_2 = (Object)adaptor.nil();
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);
								adaptor.addChild(root_2, stream_expression.nextTree());
								adaptor.addChild(root_1, root_2);
								}

								// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:49:41: ^( THEN $c1)
								{
								Object root_2 = (Object)adaptor.nil();
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_2);
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

					string_literal39=(Token)match(input,50,FOLLOW_50_in_command518);  
					stream_50.add(string_literal39);

					}

					}
					break;
				case 4 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:51:7: ( 'while' expression 'do' commands 'od' )
					{
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:51:7: ( 'while' expression 'do' commands 'od' )
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:51:8: 'while' expression 'do' commands 'od'
					{
					string_literal40=(Token)match(input,64,FOLLOW_64_in_command528);  
					stream_64.add(string_literal40);

					pushFollow(FOLLOW_expression_in_command530);
					expression41=expression();
					state._fsp--;

					stream_expression.add(expression41.getTree());
					string_literal42=(Token)match(input,48,FOLLOW_48_in_command532);  
					stream_48.add(string_literal42);

					pushFollow(FOLLOW_commands_in_command534);
					commands43=commands();
					state._fsp--;

					stream_commands.add(commands43.getTree());
					string_literal44=(Token)match(input,60,FOLLOW_60_in_command536);  
					stream_60.add(string_literal44);

					}

					// AST REWRITE
					// elements: commands, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 51:46: -> ^( WHILE ^( COND expression ) ^( BODY commands ) )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:51:49: ^( WHILE ^( COND expression ) ^( BODY commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:51:57: ^( COND expression )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);
						adaptor.addChild(root_2, stream_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:51:76: ^( BODY commands )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_2);
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
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:52:7: ( 'for' expression 'do' commands 'od' )
					{
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:52:7: ( 'for' expression 'do' commands 'od' )
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:52:8: 'for' expression 'do' commands 'od'
					{
					string_literal45=(Token)match(input,51,FOLLOW_51_in_command563);  
					stream_51.add(string_literal45);

					pushFollow(FOLLOW_expression_in_command565);
					expression46=expression();
					state._fsp--;

					stream_expression.add(expression46.getTree());
					string_literal47=(Token)match(input,48,FOLLOW_48_in_command567);  
					stream_48.add(string_literal47);

					pushFollow(FOLLOW_commands_in_command569);
					commands48=commands();
					state._fsp--;

					stream_commands.add(commands48.getTree());
					string_literal49=(Token)match(input,60,FOLLOW_60_in_command571);  
					stream_60.add(string_literal49);

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
					// 52:44: -> ^( FOR ^( ITER expression ) ^( BODY commands ) )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:52:47: ^( FOR ^( ITER expression ) ^( BODY commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:52:53: ^( ITER expression )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ITER, "ITER"), root_2);
						adaptor.addChild(root_2, stream_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:52:72: ^( BODY commands )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_2);
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
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:53:7: ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' )
					{
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:53:7: ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' )
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:53:8: 'foreach' VARIABLE 'in' expression 'do' commands 'od'
					{
					string_literal50=(Token)match(input,52,FOLLOW_52_in_command598);  
					stream_52.add(string_literal50);

					VARIABLE51=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_command600);  
					stream_VARIABLE.add(VARIABLE51);

					string_literal52=(Token)match(input,56,FOLLOW_56_in_command602);  
					stream_56.add(string_literal52);

					pushFollow(FOLLOW_expression_in_command604);
					expression53=expression();
					state._fsp--;

					stream_expression.add(expression53.getTree());
					string_literal54=(Token)match(input,48,FOLLOW_48_in_command606);  
					stream_48.add(string_literal54);

					pushFollow(FOLLOW_commands_in_command608);
					commands55=commands();
					state._fsp--;

					stream_commands.add(commands55.getTree());
					string_literal56=(Token)match(input,60,FOLLOW_60_in_command610);  
					stream_60.add(string_literal56);

					}

					// AST REWRITE
					// elements: VARIABLE, commands, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 53:62: -> ^( FOREACH VARIABLE ^( ITER expression ) ^( BODY commands ) )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:53:65: ^( FOREACH VARIABLE ^( ITER expression ) ^( BODY commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOREACH, "FOREACH"), root_1);
						adaptor.addChild(root_1, stream_VARIABLE.nextNode());
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:53:84: ^( ITER expression )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ITER, "ITER"), root_2);
						adaptor.addChild(root_2, stream_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:53:103: ^( BODY commands )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_2);
						adaptor.addChild(root_2, stream_commands.nextTree());
						adaptor.addChild(root_1, root_2);
						}

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
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
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
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:56:1: exprbase : ( 'nil' -> NIL | VARIABLE -> ^( VAR VARIABLE ) | SYMBOL -> ^( SYM SYMBOL ) | ( '(' 'cons' lexpr ')' ) -> ^( CONS ( lexpr )? ) | ( '(' 'list' lexpr ')' ) -> ^( LIST ( lexpr )? ) | ( '(' 'hd' exprbase ')' ) -> ^( HD exprbase ) | ( '(' 'tl' exprbase ')' ) -> ^( TL exprbase ) | ( '(' SYMBOL lexpr ')' ) -> ^( CALL SYMBOL ( lexpr )? ) );
	public final whileParser.exprbase_return exprbase() throws RecognitionException {
		whileParser.exprbase_return retval = new whileParser.exprbase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal57=null;
		Token VARIABLE58=null;
		Token SYMBOL59=null;
		Token char_literal60=null;
		Token string_literal61=null;
		Token char_literal63=null;
		Token char_literal64=null;
		Token string_literal65=null;
		Token char_literal67=null;
		Token char_literal68=null;
		Token string_literal69=null;
		Token char_literal71=null;
		Token char_literal72=null;
		Token string_literal73=null;
		Token char_literal75=null;
		Token char_literal76=null;
		Token SYMBOL77=null;
		Token char_literal79=null;
		ParserRuleReturnScope lexpr62 =null;
		ParserRuleReturnScope lexpr66 =null;
		ParserRuleReturnScope exprbase70 =null;
		ParserRuleReturnScope exprbase74 =null;
		ParserRuleReturnScope lexpr78 =null;

		Object string_literal57_tree=null;
		Object VARIABLE58_tree=null;
		Object SYMBOL59_tree=null;
		Object char_literal60_tree=null;
		Object string_literal61_tree=null;
		Object char_literal63_tree=null;
		Object char_literal64_tree=null;
		Object string_literal65_tree=null;
		Object char_literal67_tree=null;
		Object char_literal68_tree=null;
		Object string_literal69_tree=null;
		Object char_literal71_tree=null;
		Object char_literal72_tree=null;
		Object string_literal73_tree=null;
		Object char_literal75_tree=null;
		Object char_literal76_tree=null;
		Object SYMBOL77_tree=null;
		Object char_literal79_tree=null;
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");
		RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:57:5: ( 'nil' -> NIL | VARIABLE -> ^( VAR VARIABLE ) | SYMBOL -> ^( SYM SYMBOL ) | ( '(' 'cons' lexpr ')' ) -> ^( CONS ( lexpr )? ) | ( '(' 'list' lexpr ')' ) -> ^( LIST ( lexpr )? ) | ( '(' 'hd' exprbase ')' ) -> ^( HD exprbase ) | ( '(' 'tl' exprbase ')' ) -> ^( TL exprbase ) | ( '(' SYMBOL lexpr ')' ) -> ^( CALL SYMBOL ( lexpr )? ) )
			int alt11=8;
			switch ( input.LA(1) ) {
			case 58:
				{
				alt11=1;
				}
				break;
			case VARIABLE:
				{
				alt11=2;
				}
				break;
			case SYMBOL:
				{
				alt11=3;
				}
				break;
			case 40:
				{
				switch ( input.LA(2) ) {
				case 47:
					{
					alt11=4;
					}
					break;
				case 57:
					{
					alt11=5;
					}
					break;
				case 54:
					{
					alt11=6;
					}
					break;
				case 63:
					{
					alt11=7;
					}
					break;
				case SYMBOL:
					{
					alt11=8;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:57:7: 'nil'
					{
					string_literal57=(Token)match(input,58,FOLLOW_58_in_exprbase647);  
					stream_58.add(string_literal57);

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
					// 57:12: -> NIL
					{
						adaptor.addChild(root_0, (Object)adaptor.create(NIL, "NIL"));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:58:7: VARIABLE
					{
					VARIABLE58=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_exprbase657);  
					stream_VARIABLE.add(VARIABLE58);

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
					// 58:15: -> ^( VAR VARIABLE )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:58:18: ^( VAR VARIABLE )
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
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:59:7: SYMBOL
					{
					SYMBOL59=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_exprbase672);  
					stream_SYMBOL.add(SYMBOL59);

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
					// 59:13: -> ^( SYM SYMBOL )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:59:16: ^( SYM SYMBOL )
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
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:60:7: ( '(' 'cons' lexpr ')' )
					{
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:60:7: ( '(' 'cons' lexpr ')' )
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:60:8: '(' 'cons' lexpr ')'
					{
					char_literal60=(Token)match(input,40,FOLLOW_40_in_exprbase688);  
					stream_40.add(char_literal60);

					string_literal61=(Token)match(input,47,FOLLOW_47_in_exprbase690);  
					stream_47.add(string_literal61);

					pushFollow(FOLLOW_lexpr_in_exprbase692);
					lexpr62=lexpr();
					state._fsp--;

					stream_lexpr.add(lexpr62.getTree());
					char_literal63=(Token)match(input,41,FOLLOW_41_in_exprbase694);  
					stream_41.add(char_literal63);

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
					// 60:29: -> ^( CONS ( lexpr )? )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:60:31: ^( CONS ( lexpr )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONS, "CONS"), root_1);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:60:38: ( lexpr )?
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
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:61:7: ( '(' 'list' lexpr ')' )
					{
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:61:7: ( '(' 'list' lexpr ')' )
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:61:8: '(' 'list' lexpr ')'
					{
					char_literal64=(Token)match(input,40,FOLLOW_40_in_exprbase711);  
					stream_40.add(char_literal64);

					string_literal65=(Token)match(input,57,FOLLOW_57_in_exprbase713);  
					stream_57.add(string_literal65);

					pushFollow(FOLLOW_lexpr_in_exprbase715);
					lexpr66=lexpr();
					state._fsp--;

					stream_lexpr.add(lexpr66.getTree());
					char_literal67=(Token)match(input,41,FOLLOW_41_in_exprbase717);  
					stream_41.add(char_literal67);

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
					// 61:29: -> ^( LIST ( lexpr )? )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:61:31: ^( LIST ( lexpr )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:61:38: ( lexpr )?
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
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:62:7: ( '(' 'hd' exprbase ')' )
					{
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:62:7: ( '(' 'hd' exprbase ')' )
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:62:8: '(' 'hd' exprbase ')'
					{
					char_literal68=(Token)match(input,40,FOLLOW_40_in_exprbase734);  
					stream_40.add(char_literal68);

					string_literal69=(Token)match(input,54,FOLLOW_54_in_exprbase736);  
					stream_54.add(string_literal69);

					pushFollow(FOLLOW_exprbase_in_exprbase738);
					exprbase70=exprbase();
					state._fsp--;

					stream_exprbase.add(exprbase70.getTree());
					char_literal71=(Token)match(input,41,FOLLOW_41_in_exprbase740);  
					stream_41.add(char_literal71);

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
					// 62:30: -> ^( HD exprbase )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:62:32: ^( HD exprbase )
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
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:63:7: ( '(' 'tl' exprbase ')' )
					{
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:63:7: ( '(' 'tl' exprbase ')' )
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:63:8: '(' 'tl' exprbase ')'
					{
					char_literal72=(Token)match(input,40,FOLLOW_40_in_exprbase756);  
					stream_40.add(char_literal72);

					string_literal73=(Token)match(input,63,FOLLOW_63_in_exprbase758);  
					stream_63.add(string_literal73);

					pushFollow(FOLLOW_exprbase_in_exprbase760);
					exprbase74=exprbase();
					state._fsp--;

					stream_exprbase.add(exprbase74.getTree());
					char_literal75=(Token)match(input,41,FOLLOW_41_in_exprbase762);  
					stream_41.add(char_literal75);

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
					// 63:30: -> ^( TL exprbase )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:63:32: ^( TL exprbase )
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
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:64:7: ( '(' SYMBOL lexpr ')' )
					{
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:64:7: ( '(' SYMBOL lexpr ')' )
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:64:8: '(' SYMBOL lexpr ')'
					{
					char_literal76=(Token)match(input,40,FOLLOW_40_in_exprbase778);  
					stream_40.add(char_literal76);

					SYMBOL77=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_exprbase780);  
					stream_SYMBOL.add(SYMBOL77);

					pushFollow(FOLLOW_lexpr_in_exprbase782);
					lexpr78=lexpr();
					state._fsp--;

					stream_lexpr.add(lexpr78.getTree());
					char_literal79=(Token)match(input,41,FOLLOW_41_in_exprbase784);  
					stream_41.add(char_literal79);

					}

					// AST REWRITE
					// elements: lexpr, SYMBOL
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 64:29: -> ^( CALL SYMBOL ( lexpr )? )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:64:31: ^( CALL SYMBOL ( lexpr )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALL, "CALL"), root_1);
						adaptor.addChild(root_1, stream_SYMBOL.nextNode());
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:64:45: ( lexpr )?
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
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
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
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:67:1: expression : e1= exprbase ( '=?' e2= exprbase -> ^( EQU $e1 $e2) | -> $e1) ;
	public final whileParser.expression_return expression() throws RecognitionException {
		whileParser.expression_return retval = new whileParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal80=null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		Object string_literal80_tree=null;
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:68:5: (e1= exprbase ( '=?' e2= exprbase -> ^( EQU $e1 $e2) | -> $e1) )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:68:7: e1= exprbase ( '=?' e2= exprbase -> ^( EQU $e1 $e2) | -> $e1)
			{
			pushFollow(FOLLOW_exprbase_in_expression813);
			e1=exprbase();
			state._fsp--;

			stream_exprbase.add(e1.getTree());
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:68:19: ( '=?' e2= exprbase -> ^( EQU $e1 $e2) | -> $e1)
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==46) ) {
				alt12=1;
			}
			else if ( (LA12_0==39||LA12_0==42||LA12_0==45||(LA12_0 >= 48 && LA12_0 <= 50)||LA12_0==60||LA12_0==62) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:68:20: '=?' e2= exprbase
					{
					string_literal80=(Token)match(input,46,FOLLOW_46_in_expression816);  
					stream_46.add(string_literal80);

					pushFollow(FOLLOW_exprbase_in_expression820);
					e2=exprbase();
					state._fsp--;

					stream_exprbase.add(e2.getTree());
					// AST REWRITE
					// elements: e2, e1
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
					// 68:37: -> ^( EQU $e1 $e2)
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:68:40: ^( EQU $e1 $e2)
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
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:68:57: 
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
					// 68:57: -> $e1
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
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
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
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:71:1: lexpr : ( exprbase )* ;
	public final whileParser.lexpr_return lexpr() throws RecognitionException {
		whileParser.lexpr_return retval = new whileParser.lexpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope exprbase81 =null;


		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:72:5: ( ( exprbase )* )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:72:7: ( exprbase )*
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:72:7: ( exprbase )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==SYMBOL||LA13_0==VARIABLE||LA13_0==40||LA13_0==58) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:72:7: exprbase
					{
					pushFollow(FOLLOW_exprbase_in_lexpr857);
					exprbase81=exprbase();
					state._fsp--;

					adaptor.addChild(root_0, exprbase81.getTree());

					}
					break;

				default :
					break loop13;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lexpr"

	// Delegated rules



	public static final BitSet FOLLOW_function_in_program113 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_program_in_program116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EOF_in_program121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_function140 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_SYMBOL_in_function142 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_function144 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_definition_in_function146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_definition175 = new BitSet(new long[]{0x0000008800000000L});
	public static final BitSet FOLLOW_input_in_definition177 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_definition179 = new BitSet(new long[]{0x0898000800000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_commands_in_definition181 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_definition183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_definition185 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_output_in_definition187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inputsub_in_input222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_inputsub247 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_42_in_inputsub250 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_inputsub_in_inputsub252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_output276 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_42_in_output279 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_output_in_output281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commands305 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_45_in_commands308 = new BitSet(new long[]{0x0898000800000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_commands_in_commands310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_vars334 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_42_in_vars337 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_vars_in_vars339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprs363 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_42_in_exprs366 = new BitSet(new long[]{0x0400010880000000L});
	public static final BitSet FOLLOW_exprs_in_exprs368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_command393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_command405 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_command407 = new BitSet(new long[]{0x0400010880000000L});
	public static final BitSet FOLLOW_exprs_in_command409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_command436 = new BitSet(new long[]{0x0400010880000000L});
	public static final BitSet FOLLOW_expression_in_command438 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_command440 = new BitSet(new long[]{0x0898000800000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_commands_in_command444 = new BitSet(new long[]{0x0006000000000000L});
	public static final BitSet FOLLOW_49_in_command447 = new BitSet(new long[]{0x0898000800000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_commands_in_command451 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_command518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_command528 = new BitSet(new long[]{0x0400010880000000L});
	public static final BitSet FOLLOW_expression_in_command530 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_command532 = new BitSet(new long[]{0x0898000800000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_commands_in_command534 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_command536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_command563 = new BitSet(new long[]{0x0400010880000000L});
	public static final BitSet FOLLOW_expression_in_command565 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_command567 = new BitSet(new long[]{0x0898000800000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_commands_in_command569 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_command571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_command598 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_VARIABLE_in_command600 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_command602 = new BitSet(new long[]{0x0400010880000000L});
	public static final BitSet FOLLOW_expression_in_command604 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_command606 = new BitSet(new long[]{0x0898000800000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_commands_in_command608 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_command610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_exprbase647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_exprbase657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_exprbase672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_exprbase688 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_exprbase690 = new BitSet(new long[]{0x0400030880000000L});
	public static final BitSet FOLLOW_lexpr_in_exprbase692 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_exprbase694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_exprbase711 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_exprbase713 = new BitSet(new long[]{0x0400030880000000L});
	public static final BitSet FOLLOW_lexpr_in_exprbase715 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_exprbase717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_exprbase734 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_exprbase736 = new BitSet(new long[]{0x0400010880000000L});
	public static final BitSet FOLLOW_exprbase_in_exprbase738 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_exprbase740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_exprbase756 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_exprbase758 = new BitSet(new long[]{0x0400010880000000L});
	public static final BitSet FOLLOW_exprbase_in_exprbase760 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_exprbase762 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_exprbase778 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_SYMBOL_in_exprbase780 = new BitSet(new long[]{0x0400030880000000L});
	public static final BitSet FOLLOW_lexpr_in_exprbase782 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_exprbase784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_in_expression813 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_46_in_expression816 = new BitSet(new long[]{0x0400010880000000L});
	public static final BitSet FOLLOW_exprbase_in_expression820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_in_lexpr857 = new BitSet(new long[]{0x0400010880000002L});
}
