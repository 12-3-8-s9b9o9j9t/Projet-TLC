// $ANTLR 3.5.1 C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g 2022-12-05 10:44:45

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class whileParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGNMENT", "BODY", "COMMANDS", 
		"COMMENT", "CONSTRUCT_LIST", "CONSTRUCT_TREE", "DEC", "DEFINITION", "ELSE", 
		"EXPR", "EXPRESSION", "FOREACH_BLOCK", "FOR_BLOCK", "FUNCTION", "FUNCTION_NAME", 
		"HEAD", "IF_BLOCK", "INPUT", "LOGICAL_EXPR", "MAJ", "MIN", "OUTPUT", "SYMBOL", 
		"TAIL", "VARIABLE", "WHILE_BLOCK", "WS", "'%'", "'('", "')'", "','", "':'", 
		"':='", "';'", "'=?'", "'cons'", "'do'", "'else'", "'fi'", "'for'", "'foreach'", 
		"'function'", "'hd'", "'if'", "'in'", "'list'", "'nil'", "'nop'", "'od'", 
		"'read'", "'then'", "'tl'", "'while'", "'write'"
	};
	public static final int EOF=-1;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
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
	public static final int ASSIGNMENT=4;
	public static final int BODY=5;
	public static final int COMMANDS=6;
	public static final int COMMENT=7;
	public static final int CONSTRUCT_LIST=8;
	public static final int CONSTRUCT_TREE=9;
	public static final int DEC=10;
	public static final int DEFINITION=11;
	public static final int ELSE=12;
	public static final int EXPR=13;
	public static final int EXPRESSION=14;
	public static final int FOREACH_BLOCK=15;
	public static final int FOR_BLOCK=16;
	public static final int FUNCTION=17;
	public static final int FUNCTION_NAME=18;
	public static final int HEAD=19;
	public static final int IF_BLOCK=20;
	public static final int INPUT=21;
	public static final int LOGICAL_EXPR=22;
	public static final int MAJ=23;
	public static final int MIN=24;
	public static final int OUTPUT=25;
	public static final int SYMBOL=26;
	public static final int TAIL=27;
	public static final int VARIABLE=28;
	public static final int WHILE_BLOCK=29;
	public static final int WS=30;

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
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:9:1: program : function ( program )? EOF !;
	public final whileParser.program_return program() throws RecognitionException {
		whileParser.program_return retval = new whileParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF3=null;
		ParserRuleReturnScope function1 =null;
		ParserRuleReturnScope program2 =null;

		Object EOF3_tree=null;

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:10:5: ( function ( program )? EOF !)
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:10:7: function ( program )? EOF !
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_function_in_program88);
			function1=function();
			state._fsp--;

			adaptor.addChild(root_0, function1.getTree());

			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:10:16: ( program )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==45) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:10:16: program
					{
					pushFollow(FOLLOW_program_in_program90);
					program2=program();
					state._fsp--;

					adaptor.addChild(root_0, program2.getTree());

					}
					break;

			}

			EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_program93); 
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
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:13:1: function : 'function' SYMBOL ':' definition -> ^( FUNCTION ^( FUNCTION_NAME SYMBOL ) definition ) ;
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
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:14:5: ( 'function' SYMBOL ':' definition -> ^( FUNCTION ^( FUNCTION_NAME SYMBOL ) definition ) )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:14:7: 'function' SYMBOL ':' definition
			{
			string_literal4=(Token)match(input,45,FOLLOW_45_in_function111);  
			stream_45.add(string_literal4);

			SYMBOL5=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_function113);  
			stream_SYMBOL.add(SYMBOL5);

			char_literal6=(Token)match(input,35,FOLLOW_35_in_function115);  
			stream_35.add(char_literal6);

			pushFollow(FOLLOW_definition_in_function117);
			definition7=definition();
			state._fsp--;

			stream_definition.add(definition7.getTree());
			// AST REWRITE
			// elements: SYMBOL, definition
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 14:39: -> ^( FUNCTION ^( FUNCTION_NAME SYMBOL ) definition )
			{
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:14:41: ^( FUNCTION ^( FUNCTION_NAME SYMBOL ) definition )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:14:52: ^( FUNCTION_NAME SYMBOL )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION_NAME, "FUNCTION_NAME"), root_2);
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
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:18:5: ( 'read' input '%' commands '%' 'write' output -> ^( DEFINITION input ^( COMMANDS commands ) ^( OUTPUT output ) ) )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:18:7: 'read' input '%' commands '%' 'write' output
			{
			string_literal8=(Token)match(input,53,FOLLOW_53_in_definition146);  
			stream_53.add(string_literal8);

			pushFollow(FOLLOW_input_in_definition148);
			input9=input();
			state._fsp--;

			stream_input.add(input9.getTree());
			char_literal10=(Token)match(input,31,FOLLOW_31_in_definition150);  
			stream_31.add(char_literal10);

			pushFollow(FOLLOW_commands_in_definition152);
			commands11=commands();
			state._fsp--;

			stream_commands.add(commands11.getTree());
			char_literal12=(Token)match(input,31,FOLLOW_31_in_definition154);  
			stream_31.add(char_literal12);

			string_literal13=(Token)match(input,57,FOLLOW_57_in_definition156);  
			stream_57.add(string_literal13);

			pushFollow(FOLLOW_output_in_definition158);
			output14=output();
			state._fsp--;

			stream_output.add(output14.getTree());
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
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:21:1: input : ( inputsub )? -> ^( INPUT inputsub ) ;
	public final whileParser.input_return input() throws RecognitionException {
		whileParser.input_return retval = new whileParser.input_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope inputsub15 =null;

		RewriteRuleSubtreeStream stream_inputsub=new RewriteRuleSubtreeStream(adaptor,"rule inputsub");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:22:5: ( ( inputsub )? -> ^( INPUT inputsub ) )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:22:7: ( inputsub )?
			{
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:22:7: ( inputsub )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==VARIABLE) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:22:7: inputsub
					{
					pushFollow(FOLLOW_inputsub_in_input193);
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
			// 22:16: -> ^( INPUT inputsub )
			{
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:22:18: ^( INPUT inputsub )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUT, "INPUT"), root_1);
				adaptor.addChild(root_1, stream_inputsub.nextTree());
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
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleSubtreeStream stream_inputsub=new RewriteRuleSubtreeStream(adaptor,"rule inputsub");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:26:5: ( VARIABLE ( ',' inputsub )? -> VARIABLE ( inputsub )? )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:26:7: VARIABLE ( ',' inputsub )?
			{
			VARIABLE16=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_inputsub217);  
			stream_VARIABLE.add(VARIABLE16);

			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:26:16: ( ',' inputsub )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==34) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:26:17: ',' inputsub
					{
					char_literal17=(Token)match(input,34,FOLLOW_34_in_inputsub220);  
					stream_34.add(char_literal17);

					pushFollow(FOLLOW_inputsub_in_inputsub222);
					inputsub18=inputsub();
					state._fsp--;

					stream_inputsub.add(inputsub18.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: inputsub, VARIABLE
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
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:30:5: ( VARIABLE ( ',' output )? -> VARIABLE ( output )? )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:30:7: VARIABLE ( ',' output )?
			{
			VARIABLE19=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_output246);  
			stream_VARIABLE.add(VARIABLE19);

			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:30:16: ( ',' output )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==34) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:30:17: ',' output
					{
					char_literal20=(Token)match(input,34,FOLLOW_34_in_output249);  
					stream_34.add(char_literal20);

					pushFollow(FOLLOW_output_in_output251);
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
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:34:5: ( command ( ';' commands )? -> command ( commands )? )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:34:7: command ( ';' commands )?
			{
			pushFollow(FOLLOW_command_in_commands275);
			command22=command();
			state._fsp--;

			stream_command.add(command22.getTree());
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:34:15: ( ';' commands )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==37) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:34:16: ';' commands
					{
					char_literal23=(Token)match(input,37,FOLLOW_37_in_commands278);  
					stream_37.add(char_literal23);

					pushFollow(FOLLOW_commands_in_commands280);
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
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:38:5: ( VARIABLE ( ',' vars )? -> VARIABLE ( vars )? )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:38:7: VARIABLE ( ',' vars )?
			{
			VARIABLE25=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_vars304);  
			stream_VARIABLE.add(VARIABLE25);

			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:38:16: ( ',' vars )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==34) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:38:17: ',' vars
					{
					char_literal26=(Token)match(input,34,FOLLOW_34_in_vars307);  
					stream_34.add(char_literal26);

					pushFollow(FOLLOW_vars_in_vars309);
					vars27=vars();
					state._fsp--;

					stream_vars.add(vars27.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: VARIABLE, vars
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
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:41:1: exprs : expression ( ',' exprs )? -> ^( EXPRESSION expression ( exprs )? ) ;
	public final whileParser.exprs_return exprs() throws RecognitionException {
		whileParser.exprs_return retval = new whileParser.exprs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal29=null;
		ParserRuleReturnScope expression28 =null;
		ParserRuleReturnScope exprs30 =null;

		Object char_literal29_tree=null;
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:42:5: ( expression ( ',' exprs )? -> ^( EXPRESSION expression ( exprs )? ) )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:42:7: expression ( ',' exprs )?
			{
			pushFollow(FOLLOW_expression_in_exprs333);
			expression28=expression();
			state._fsp--;

			stream_expression.add(expression28.getTree());
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:42:18: ( ',' exprs )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==34) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:42:19: ',' exprs
					{
					char_literal29=(Token)match(input,34,FOLLOW_34_in_exprs336);  
					stream_34.add(char_literal29);

					pushFollow(FOLLOW_exprs_in_exprs338);
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
			// 42:30: -> ^( EXPRESSION expression ( exprs )? )
			{
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:42:33: ^( EXPRESSION expression ( exprs )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRESSION, "EXPRESSION"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:42:57: ( exprs )?
				if ( stream_exprs.hasNext() ) {
					adaptor.addChild(root_1, stream_exprs.nextTree());
				}
				stream_exprs.reset();

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
	// $ANTLR end "exprs"


	public static class command_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command"
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:45:1: command : ( 'nop' -> 'nil' | ( vars ':=' exprs ) -> ^( ASSIGNMENT vars exprs ) | ( 'if' expression 'then' commands ( 'else' commands )? 'fi' ) -> ^( IF_BLOCK ^( EXPR expression ) ^( BODY commands ) ( ^( ELSE commands ) )? ) | ( 'while' expression 'do' commands 'od' ) -> ^( WHILE_BLOCK ^( EXPR expression ) ^( BODY commands ) ) | ( 'for' expression 'do' commands 'od' ) -> ^( FOR_BLOCK ^( EXPR expression ) ^( BODY commands ) ) | ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' ) -> ^( FOREACH_BLOCK VARIABLE ^( EXPR expression ) ^( BODY commands ) ) );
	public final whileParser.command_return command() throws RecognitionException {
		whileParser.command_return retval = new whileParser.command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal31=null;
		Token string_literal33=null;
		Token string_literal35=null;
		Token string_literal37=null;
		Token string_literal39=null;
		Token string_literal41=null;
		Token string_literal42=null;
		Token string_literal44=null;
		Token string_literal46=null;
		Token string_literal47=null;
		Token string_literal49=null;
		Token string_literal51=null;
		Token string_literal52=null;
		Token VARIABLE53=null;
		Token string_literal54=null;
		Token string_literal56=null;
		Token string_literal58=null;
		ParserRuleReturnScope vars32 =null;
		ParserRuleReturnScope exprs34 =null;
		ParserRuleReturnScope expression36 =null;
		ParserRuleReturnScope commands38 =null;
		ParserRuleReturnScope commands40 =null;
		ParserRuleReturnScope expression43 =null;
		ParserRuleReturnScope commands45 =null;
		ParserRuleReturnScope expression48 =null;
		ParserRuleReturnScope commands50 =null;
		ParserRuleReturnScope expression55 =null;
		ParserRuleReturnScope commands57 =null;

		Object string_literal31_tree=null;
		Object string_literal33_tree=null;
		Object string_literal35_tree=null;
		Object string_literal37_tree=null;
		Object string_literal39_tree=null;
		Object string_literal41_tree=null;
		Object string_literal42_tree=null;
		Object string_literal44_tree=null;
		Object string_literal46_tree=null;
		Object string_literal47_tree=null;
		Object string_literal49_tree=null;
		Object string_literal51_tree=null;
		Object string_literal52_tree=null;
		Object VARIABLE53_tree=null;
		Object string_literal54_tree=null;
		Object string_literal56_tree=null;
		Object string_literal58_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:46:5: ( 'nop' -> 'nil' | ( vars ':=' exprs ) -> ^( ASSIGNMENT vars exprs ) | ( 'if' expression 'then' commands ( 'else' commands )? 'fi' ) -> ^( IF_BLOCK ^( EXPR expression ) ^( BODY commands ) ( ^( ELSE commands ) )? ) | ( 'while' expression 'do' commands 'od' ) -> ^( WHILE_BLOCK ^( EXPR expression ) ^( BODY commands ) ) | ( 'for' expression 'do' commands 'od' ) -> ^( FOR_BLOCK ^( EXPR expression ) ^( BODY commands ) ) | ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' ) -> ^( FOREACH_BLOCK VARIABLE ^( EXPR expression ) ^( BODY commands ) ) )
			int alt9=6;
			switch ( input.LA(1) ) {
			case 51:
				{
				alt9=1;
				}
				break;
			case VARIABLE:
				{
				alt9=2;
				}
				break;
			case 47:
				{
				alt9=3;
				}
				break;
			case 56:
				{
				alt9=4;
				}
				break;
			case 43:
				{
				alt9=5;
				}
				break;
			case 44:
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
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:46:7: 'nop'
					{
					string_literal31=(Token)match(input,51,FOLLOW_51_in_command367);  
					stream_51.add(string_literal31);

					// AST REWRITE
					// elements: 50
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 46:12: -> 'nil'
					{
						adaptor.addChild(root_0, (Object)adaptor.create(50, "50"));
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
					pushFollow(FOLLOW_vars_in_command378);
					vars32=vars();
					state._fsp--;

					stream_vars.add(vars32.getTree());
					string_literal33=(Token)match(input,36,FOLLOW_36_in_command380);  
					stream_36.add(string_literal33);

					pushFollow(FOLLOW_exprs_in_command382);
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
					// 47:24: -> ^( ASSIGNMENT vars exprs )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:47:27: ^( ASSIGNMENT vars exprs )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_1);
						adaptor.addChild(root_1, stream_vars.nextTree());
						adaptor.addChild(root_1, stream_exprs.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:48:7: ( 'if' expression 'then' commands ( 'else' commands )? 'fi' )
					{
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:48:7: ( 'if' expression 'then' commands ( 'else' commands )? 'fi' )
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:48:8: 'if' expression 'then' commands ( 'else' commands )? 'fi'
					{
					string_literal35=(Token)match(input,47,FOLLOW_47_in_command401);  
					stream_47.add(string_literal35);

					pushFollow(FOLLOW_expression_in_command403);
					expression36=expression();
					state._fsp--;

					stream_expression.add(expression36.getTree());
					string_literal37=(Token)match(input,54,FOLLOW_54_in_command405);  
					stream_54.add(string_literal37);

					pushFollow(FOLLOW_commands_in_command407);
					commands38=commands();
					state._fsp--;

					stream_commands.add(commands38.getTree());
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:48:40: ( 'else' commands )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==41) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:48:41: 'else' commands
							{
							string_literal39=(Token)match(input,41,FOLLOW_41_in_command410);  
							stream_41.add(string_literal39);

							pushFollow(FOLLOW_commands_in_command412);
							commands40=commands();
							state._fsp--;

							stream_commands.add(commands40.getTree());
							}
							break;

					}

					string_literal41=(Token)match(input,42,FOLLOW_42_in_command416);  
					stream_42.add(string_literal41);

					}

					// AST REWRITE
					// elements: expression, commands, commands
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 48:64: -> ^( IF_BLOCK ^( EXPR expression ) ^( BODY commands ) ( ^( ELSE commands ) )? )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:48:67: ^( IF_BLOCK ^( EXPR expression ) ^( BODY commands ) ( ^( ELSE commands ) )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF_BLOCK, "IF_BLOCK"), root_1);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:48:78: ^( EXPR expression )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_2);
						adaptor.addChild(root_2, stream_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:48:97: ^( BODY commands )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_2);
						adaptor.addChild(root_2, stream_commands.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:48:114: ( ^( ELSE commands ) )?
						if ( stream_commands.hasNext() ) {
							// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:48:115: ^( ELSE commands )
							{
							Object root_2 = (Object)adaptor.nil();
							root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSE, "ELSE"), root_2);
							adaptor.addChild(root_2, stream_commands.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_commands.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:49:7: ( 'while' expression 'do' commands 'od' )
					{
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:49:7: ( 'while' expression 'do' commands 'od' )
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:49:8: 'while' expression 'do' commands 'od'
					{
					string_literal42=(Token)match(input,56,FOLLOW_56_in_command452);  
					stream_56.add(string_literal42);

					pushFollow(FOLLOW_expression_in_command454);
					expression43=expression();
					state._fsp--;

					stream_expression.add(expression43.getTree());
					string_literal44=(Token)match(input,40,FOLLOW_40_in_command456);  
					stream_40.add(string_literal44);

					pushFollow(FOLLOW_commands_in_command458);
					commands45=commands();
					state._fsp--;

					stream_commands.add(commands45.getTree());
					string_literal46=(Token)match(input,52,FOLLOW_52_in_command460);  
					stream_52.add(string_literal46);

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
					// 49:46: -> ^( WHILE_BLOCK ^( EXPR expression ) ^( BODY commands ) )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:49:49: ^( WHILE_BLOCK ^( EXPR expression ) ^( BODY commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE_BLOCK, "WHILE_BLOCK"), root_1);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:49:63: ^( EXPR expression )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_2);
						adaptor.addChild(root_2, stream_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:49:82: ^( BODY commands )
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
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:50:7: ( 'for' expression 'do' commands 'od' )
					{
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:50:7: ( 'for' expression 'do' commands 'od' )
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:50:8: 'for' expression 'do' commands 'od'
					{
					string_literal47=(Token)match(input,43,FOLLOW_43_in_command487);  
					stream_43.add(string_literal47);

					pushFollow(FOLLOW_expression_in_command489);
					expression48=expression();
					state._fsp--;

					stream_expression.add(expression48.getTree());
					string_literal49=(Token)match(input,40,FOLLOW_40_in_command491);  
					stream_40.add(string_literal49);

					pushFollow(FOLLOW_commands_in_command493);
					commands50=commands();
					state._fsp--;

					stream_commands.add(commands50.getTree());
					string_literal51=(Token)match(input,52,FOLLOW_52_in_command495);  
					stream_52.add(string_literal51);

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
					// 50:44: -> ^( FOR_BLOCK ^( EXPR expression ) ^( BODY commands ) )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:50:47: ^( FOR_BLOCK ^( EXPR expression ) ^( BODY commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR_BLOCK, "FOR_BLOCK"), root_1);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:50:59: ^( EXPR expression )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_2);
						adaptor.addChild(root_2, stream_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:50:78: ^( BODY commands )
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
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:51:7: ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' )
					{
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:51:7: ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' )
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:51:8: 'foreach' VARIABLE 'in' expression 'do' commands 'od'
					{
					string_literal52=(Token)match(input,44,FOLLOW_44_in_command522);  
					stream_44.add(string_literal52);

					VARIABLE53=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_command524);  
					stream_VARIABLE.add(VARIABLE53);

					string_literal54=(Token)match(input,48,FOLLOW_48_in_command526);  
					stream_48.add(string_literal54);

					pushFollow(FOLLOW_expression_in_command528);
					expression55=expression();
					state._fsp--;

					stream_expression.add(expression55.getTree());
					string_literal56=(Token)match(input,40,FOLLOW_40_in_command530);  
					stream_40.add(string_literal56);

					pushFollow(FOLLOW_commands_in_command532);
					commands57=commands();
					state._fsp--;

					stream_commands.add(commands57.getTree());
					string_literal58=(Token)match(input,52,FOLLOW_52_in_command534);  
					stream_52.add(string_literal58);

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
					// 51:62: -> ^( FOREACH_BLOCK VARIABLE ^( EXPR expression ) ^( BODY commands ) )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:51:65: ^( FOREACH_BLOCK VARIABLE ^( EXPR expression ) ^( BODY commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOREACH_BLOCK, "FOREACH_BLOCK"), root_1);
						adaptor.addChild(root_1, stream_VARIABLE.nextNode());
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:51:90: ^( EXPR expression )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_2);
						adaptor.addChild(root_2, stream_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:51:109: ^( BODY commands )
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
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:54:1: exprbase : ( 'nil' -> 'nil' | VARIABLE -> VARIABLE | SYMBOL -> SYMBOL | ( '(' 'cons' lexpr ')' ) -> ^( CONSTRUCT_TREE lexpr ) | ( '(' 'list' lexpr ')' ) -> ^( CONSTRUCT_LIST lexpr ) | ( '(' 'hd' exprbase ')' ) -> ^( HEAD exprbase ) | ( '(' 'tl' exprbase ')' ) -> ^( TAIL exprbase ) | ( '(' SYMBOL lexpr ')' ) -> ^( LOGICAL_EXPR SYMBOL lexpr ) );
	public final whileParser.exprbase_return exprbase() throws RecognitionException {
		whileParser.exprbase_return retval = new whileParser.exprbase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal59=null;
		Token VARIABLE60=null;
		Token SYMBOL61=null;
		Token char_literal62=null;
		Token string_literal63=null;
		Token char_literal65=null;
		Token char_literal66=null;
		Token string_literal67=null;
		Token char_literal69=null;
		Token char_literal70=null;
		Token string_literal71=null;
		Token char_literal73=null;
		Token char_literal74=null;
		Token string_literal75=null;
		Token char_literal77=null;
		Token char_literal78=null;
		Token SYMBOL79=null;
		Token char_literal81=null;
		ParserRuleReturnScope lexpr64 =null;
		ParserRuleReturnScope lexpr68 =null;
		ParserRuleReturnScope exprbase72 =null;
		ParserRuleReturnScope exprbase76 =null;
		ParserRuleReturnScope lexpr80 =null;

		Object string_literal59_tree=null;
		Object VARIABLE60_tree=null;
		Object SYMBOL61_tree=null;
		Object char_literal62_tree=null;
		Object string_literal63_tree=null;
		Object char_literal65_tree=null;
		Object char_literal66_tree=null;
		Object string_literal67_tree=null;
		Object char_literal69_tree=null;
		Object char_literal70_tree=null;
		Object string_literal71_tree=null;
		Object char_literal73_tree=null;
		Object char_literal74_tree=null;
		Object string_literal75_tree=null;
		Object char_literal77_tree=null;
		Object char_literal78_tree=null;
		Object SYMBOL79_tree=null;
		Object char_literal81_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");
		RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:55:5: ( 'nil' -> 'nil' | VARIABLE -> VARIABLE | SYMBOL -> SYMBOL | ( '(' 'cons' lexpr ')' ) -> ^( CONSTRUCT_TREE lexpr ) | ( '(' 'list' lexpr ')' ) -> ^( CONSTRUCT_LIST lexpr ) | ( '(' 'hd' exprbase ')' ) -> ^( HEAD exprbase ) | ( '(' 'tl' exprbase ')' ) -> ^( TAIL exprbase ) | ( '(' SYMBOL lexpr ')' ) -> ^( LOGICAL_EXPR SYMBOL lexpr ) )
			int alt10=8;
			switch ( input.LA(1) ) {
			case 50:
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
			case 32:
				{
				switch ( input.LA(2) ) {
				case 39:
					{
					alt10=4;
					}
					break;
				case 49:
					{
					alt10=5;
					}
					break;
				case 46:
					{
					alt10=6;
					}
					break;
				case 55:
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
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:55:7: 'nil'
					{
					string_literal59=(Token)match(input,50,FOLLOW_50_in_exprbase571);  
					stream_50.add(string_literal59);

					// AST REWRITE
					// elements: 50
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 55:12: -> 'nil'
					{
						adaptor.addChild(root_0, stream_50.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:56:7: VARIABLE
					{
					VARIABLE60=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_exprbase581);  
					stream_VARIABLE.add(VARIABLE60);

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
					// 56:15: -> VARIABLE
					{
						adaptor.addChild(root_0, stream_VARIABLE.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:57:7: SYMBOL
					{
					SYMBOL61=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_exprbase591);  
					stream_SYMBOL.add(SYMBOL61);

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
					// 57:13: -> SYMBOL
					{
						adaptor.addChild(root_0, stream_SYMBOL.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:58:7: ( '(' 'cons' lexpr ')' )
					{
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:58:7: ( '(' 'cons' lexpr ')' )
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:58:8: '(' 'cons' lexpr ')'
					{
					char_literal62=(Token)match(input,32,FOLLOW_32_in_exprbase602);  
					stream_32.add(char_literal62);

					string_literal63=(Token)match(input,39,FOLLOW_39_in_exprbase604);  
					stream_39.add(string_literal63);

					pushFollow(FOLLOW_lexpr_in_exprbase606);
					lexpr64=lexpr();
					state._fsp--;

					stream_lexpr.add(lexpr64.getTree());
					char_literal65=(Token)match(input,33,FOLLOW_33_in_exprbase608);  
					stream_33.add(char_literal65);

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
					// 58:29: -> ^( CONSTRUCT_TREE lexpr )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:58:31: ^( CONSTRUCT_TREE lexpr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRUCT_TREE, "CONSTRUCT_TREE"), root_1);
						adaptor.addChild(root_1, stream_lexpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:59:7: ( '(' 'list' lexpr ')' )
					{
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:59:7: ( '(' 'list' lexpr ')' )
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:59:8: '(' 'list' lexpr ')'
					{
					char_literal66=(Token)match(input,32,FOLLOW_32_in_exprbase625);  
					stream_32.add(char_literal66);

					string_literal67=(Token)match(input,49,FOLLOW_49_in_exprbase627);  
					stream_49.add(string_literal67);

					pushFollow(FOLLOW_lexpr_in_exprbase629);
					lexpr68=lexpr();
					state._fsp--;

					stream_lexpr.add(lexpr68.getTree());
					char_literal69=(Token)match(input,33,FOLLOW_33_in_exprbase631);  
					stream_33.add(char_literal69);

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
					// 59:29: -> ^( CONSTRUCT_LIST lexpr )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:59:31: ^( CONSTRUCT_LIST lexpr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTRUCT_LIST, "CONSTRUCT_LIST"), root_1);
						adaptor.addChild(root_1, stream_lexpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:60:7: ( '(' 'hd' exprbase ')' )
					{
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:60:7: ( '(' 'hd' exprbase ')' )
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:60:8: '(' 'hd' exprbase ')'
					{
					char_literal70=(Token)match(input,32,FOLLOW_32_in_exprbase647);  
					stream_32.add(char_literal70);

					string_literal71=(Token)match(input,46,FOLLOW_46_in_exprbase649);  
					stream_46.add(string_literal71);

					pushFollow(FOLLOW_exprbase_in_exprbase651);
					exprbase72=exprbase();
					state._fsp--;

					stream_exprbase.add(exprbase72.getTree());
					char_literal73=(Token)match(input,33,FOLLOW_33_in_exprbase653);  
					stream_33.add(char_literal73);

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
					// 60:30: -> ^( HEAD exprbase )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:60:32: ^( HEAD exprbase )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(HEAD, "HEAD"), root_1);
						adaptor.addChild(root_1, stream_exprbase.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:61:7: ( '(' 'tl' exprbase ')' )
					{
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:61:7: ( '(' 'tl' exprbase ')' )
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:61:8: '(' 'tl' exprbase ')'
					{
					char_literal74=(Token)match(input,32,FOLLOW_32_in_exprbase669);  
					stream_32.add(char_literal74);

					string_literal75=(Token)match(input,55,FOLLOW_55_in_exprbase671);  
					stream_55.add(string_literal75);

					pushFollow(FOLLOW_exprbase_in_exprbase673);
					exprbase76=exprbase();
					state._fsp--;

					stream_exprbase.add(exprbase76.getTree());
					char_literal77=(Token)match(input,33,FOLLOW_33_in_exprbase675);  
					stream_33.add(char_literal77);

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
					// 61:30: -> ^( TAIL exprbase )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:61:32: ^( TAIL exprbase )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TAIL, "TAIL"), root_1);
						adaptor.addChild(root_1, stream_exprbase.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:62:7: ( '(' SYMBOL lexpr ')' )
					{
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:62:7: ( '(' SYMBOL lexpr ')' )
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:62:8: '(' SYMBOL lexpr ')'
					{
					char_literal78=(Token)match(input,32,FOLLOW_32_in_exprbase691);  
					stream_32.add(char_literal78);

					SYMBOL79=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_exprbase693);  
					stream_SYMBOL.add(SYMBOL79);

					pushFollow(FOLLOW_lexpr_in_exprbase695);
					lexpr80=lexpr();
					state._fsp--;

					stream_lexpr.add(lexpr80.getTree());
					char_literal81=(Token)match(input,33,FOLLOW_33_in_exprbase697);  
					stream_33.add(char_literal81);

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
					// 62:30: -> ^( LOGICAL_EXPR SYMBOL lexpr )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:62:32: ^( LOGICAL_EXPR SYMBOL lexpr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOGICAL_EXPR, "LOGICAL_EXPR"), root_1);
						adaptor.addChild(root_1, stream_SYMBOL.nextNode());
						adaptor.addChild(root_1, stream_lexpr.nextTree());
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
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:65:1: expression : exprbase ( '=?' exprbase )? -> exprbase ( exprbase )? ;
	public final whileParser.expression_return expression() throws RecognitionException {
		whileParser.expression_return retval = new whileParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal83=null;
		ParserRuleReturnScope exprbase82 =null;
		ParserRuleReturnScope exprbase84 =null;

		Object string_literal83_tree=null;
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:66:5: ( exprbase ( '=?' exprbase )? -> exprbase ( exprbase )? )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:66:7: exprbase ( '=?' exprbase )?
			{
			pushFollow(FOLLOW_exprbase_in_expression724);
			exprbase82=exprbase();
			state._fsp--;

			stream_exprbase.add(exprbase82.getTree());
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:66:16: ( '=?' exprbase )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==38) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:66:17: '=?' exprbase
					{
					string_literal83=(Token)match(input,38,FOLLOW_38_in_expression727);  
					stream_38.add(string_literal83);

					pushFollow(FOLLOW_exprbase_in_expression729);
					exprbase84=exprbase();
					state._fsp--;

					stream_exprbase.add(exprbase84.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: exprbase, exprbase
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 66:32: -> exprbase ( exprbase )?
			{
				adaptor.addChild(root_0, stream_exprbase.nextTree());
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:66:43: ( exprbase )?
				if ( stream_exprbase.hasNext() ) {
					adaptor.addChild(root_0, stream_exprbase.nextTree());
				}
				stream_exprbase.reset();

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
	// $ANTLR end "expression"


	public static class lexpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lexpr"
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:69:1: lexpr : ( exprbase lexpr )? ;
	public final whileParser.lexpr_return lexpr() throws RecognitionException {
		whileParser.lexpr_return retval = new whileParser.lexpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope exprbase85 =null;
		ParserRuleReturnScope lexpr86 =null;


		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:70:5: ( ( exprbase lexpr )? )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:70:7: ( exprbase lexpr )?
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:70:7: ( exprbase lexpr )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==SYMBOL||LA12_0==VARIABLE||LA12_0==32||LA12_0==50) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:70:8: exprbase lexpr
					{
					pushFollow(FOLLOW_exprbase_in_lexpr754);
					exprbase85=exprbase();
					state._fsp--;

					adaptor.addChild(root_0, exprbase85.getTree());

					pushFollow(FOLLOW_lexpr_in_lexpr756);
					lexpr86=lexpr();
					state._fsp--;

					adaptor.addChild(root_0, lexpr86.getTree());

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
	// $ANTLR end "lexpr"

	// Delegated rules



	public static final BitSet FOLLOW_function_in_program88 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_program_in_program90 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program93 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_function111 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_SYMBOL_in_function113 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_function115 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_definition_in_function117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_definition146 = new BitSet(new long[]{0x0000000090000000L});
	public static final BitSet FOLLOW_input_in_definition148 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_definition150 = new BitSet(new long[]{0x0108980010000000L});
	public static final BitSet FOLLOW_commands_in_definition152 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_definition154 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_definition156 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_output_in_definition158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inputsub_in_input193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_inputsub217 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_34_in_inputsub220 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_inputsub_in_inputsub222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_output246 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_34_in_output249 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_output_in_output251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commands275 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_37_in_commands278 = new BitSet(new long[]{0x0108980010000000L});
	public static final BitSet FOLLOW_commands_in_commands280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_vars304 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_34_in_vars307 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_vars_in_vars309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprs333 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_34_in_exprs336 = new BitSet(new long[]{0x0004000114000000L});
	public static final BitSet FOLLOW_exprs_in_exprs338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_command367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_command378 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_command380 = new BitSet(new long[]{0x0004000114000000L});
	public static final BitSet FOLLOW_exprs_in_command382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_command401 = new BitSet(new long[]{0x0004000114000000L});
	public static final BitSet FOLLOW_expression_in_command403 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_command405 = new BitSet(new long[]{0x0108980010000000L});
	public static final BitSet FOLLOW_commands_in_command407 = new BitSet(new long[]{0x0000060000000000L});
	public static final BitSet FOLLOW_41_in_command410 = new BitSet(new long[]{0x0108980010000000L});
	public static final BitSet FOLLOW_commands_in_command412 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_command416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_command452 = new BitSet(new long[]{0x0004000114000000L});
	public static final BitSet FOLLOW_expression_in_command454 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_command456 = new BitSet(new long[]{0x0108980010000000L});
	public static final BitSet FOLLOW_commands_in_command458 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_command460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_command487 = new BitSet(new long[]{0x0004000114000000L});
	public static final BitSet FOLLOW_expression_in_command489 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_command491 = new BitSet(new long[]{0x0108980010000000L});
	public static final BitSet FOLLOW_commands_in_command493 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_command495 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_command522 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_VARIABLE_in_command524 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_command526 = new BitSet(new long[]{0x0004000114000000L});
	public static final BitSet FOLLOW_expression_in_command528 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_command530 = new BitSet(new long[]{0x0108980010000000L});
	public static final BitSet FOLLOW_commands_in_command532 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_command534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_exprbase571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_exprbase581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_exprbase591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_exprbase602 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_exprbase604 = new BitSet(new long[]{0x0004000314000000L});
	public static final BitSet FOLLOW_lexpr_in_exprbase606 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_exprbase608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_exprbase625 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_exprbase627 = new BitSet(new long[]{0x0004000314000000L});
	public static final BitSet FOLLOW_lexpr_in_exprbase629 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_exprbase631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_exprbase647 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_exprbase649 = new BitSet(new long[]{0x0004000114000000L});
	public static final BitSet FOLLOW_exprbase_in_exprbase651 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_exprbase653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_exprbase669 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_exprbase671 = new BitSet(new long[]{0x0004000114000000L});
	public static final BitSet FOLLOW_exprbase_in_exprbase673 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_exprbase675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_exprbase691 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_SYMBOL_in_exprbase693 = new BitSet(new long[]{0x0004000314000000L});
	public static final BitSet FOLLOW_lexpr_in_exprbase695 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_exprbase697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_in_expression724 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_38_in_expression727 = new BitSet(new long[]{0x0004000114000000L});
	public static final BitSet FOLLOW_exprbase_in_expression729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_in_lexpr754 = new BitSet(new long[]{0x0004000114000000L});
	public static final BitSet FOLLOW_lexpr_in_lexpr756 = new BitSet(new long[]{0x0000000000000002L});
}
