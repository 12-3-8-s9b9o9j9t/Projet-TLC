// $ANTLR 3.5.1 C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g 2022-12-07 09:19:32

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class whileParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "BODY", "CALL", "COMMANDS", 
		"COMMENT", "COND", "CONS", "DEC", "DEFINITION", "ELSE", "FOR", "FOREACH", 
		"FUNCTION", "FUNC_NAME", "HD", "IF", "INPUT", "LIST", "MAJ", "MIN", "NIL", 
		"OUTPUT", "SYMBOL", "THEN", "TL", "VARIABLE", "WHILE", "WS", "'%'", "'('", 
		"')'", "','", "':'", "':='", "';'", "'=?'", "'cons'", "'do'", "'else'", 
		"'fi'", "'for'", "'foreach'", "'function'", "'hd'", "'if'", "'in'", "'list'", 
		"'nil'", "'nop'", "'od'", "'read'", "'then'", "'tl'", "'while'", "'write'"
	};
	public static final int EOF=-1;
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
	public static final int T__58=58;
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
	public static final int OUTPUT=25;
	public static final int SYMBOL=26;
	public static final int THEN=27;
	public static final int TL=28;
	public static final int VARIABLE=29;
	public static final int WHILE=30;
	public static final int WS=31;

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


			pushFollow(FOLLOW_function_in_program91);
			function1=function();
			state._fsp--;

			adaptor.addChild(root_0, function1.getTree());

			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:10:16: ( program )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==46) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:10:16: program
					{
					pushFollow(FOLLOW_program_in_program93);
					program2=program();
					state._fsp--;

					adaptor.addChild(root_0, program2.getTree());

					}
					break;

			}

			EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_program96); 
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
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:14:5: ( 'function' SYMBOL ':' definition -> ^( FUNCTION ^( FUNC_NAME SYMBOL ) definition ) )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:14:7: 'function' SYMBOL ':' definition
			{
			string_literal4=(Token)match(input,46,FOLLOW_46_in_function114);  
			stream_46.add(string_literal4);

			SYMBOL5=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_function116);  
			stream_SYMBOL.add(SYMBOL5);

			char_literal6=(Token)match(input,36,FOLLOW_36_in_function118);  
			stream_36.add(char_literal6);

			pushFollow(FOLLOW_definition_in_function120);
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
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:18:5: ( 'read' input '%' commands '%' 'write' output -> ^( DEFINITION input ^( COMMANDS commands ) ^( OUTPUT output ) ) )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:18:7: 'read' input '%' commands '%' 'write' output
			{
			string_literal8=(Token)match(input,54,FOLLOW_54_in_definition149);  
			stream_54.add(string_literal8);

			pushFollow(FOLLOW_input_in_definition151);
			input9=input();
			state._fsp--;

			stream_input.add(input9.getTree());
			char_literal10=(Token)match(input,32,FOLLOW_32_in_definition153);  
			stream_32.add(char_literal10);

			pushFollow(FOLLOW_commands_in_definition155);
			commands11=commands();
			state._fsp--;

			stream_commands.add(commands11.getTree());
			char_literal12=(Token)match(input,32,FOLLOW_32_in_definition157);  
			stream_32.add(char_literal12);

			string_literal13=(Token)match(input,58,FOLLOW_58_in_definition159);  
			stream_58.add(string_literal13);

			pushFollow(FOLLOW_output_in_definition161);
			output14=output();
			state._fsp--;

			stream_output.add(output14.getTree());
			// AST REWRITE
			// elements: input, output, commands
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
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==VARIABLE) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:22:7: inputsub
					{
					pushFollow(FOLLOW_inputsub_in_input196);
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
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleSubtreeStream stream_inputsub=new RewriteRuleSubtreeStream(adaptor,"rule inputsub");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:26:5: ( VARIABLE ( ',' inputsub )? -> VARIABLE ( inputsub )? )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:26:7: VARIABLE ( ',' inputsub )?
			{
			VARIABLE16=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_inputsub221);  
			stream_VARIABLE.add(VARIABLE16);

			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:26:16: ( ',' inputsub )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==35) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:26:17: ',' inputsub
					{
					char_literal17=(Token)match(input,35,FOLLOW_35_in_inputsub224);  
					stream_35.add(char_literal17);

					pushFollow(FOLLOW_inputsub_in_inputsub226);
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
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:30:5: ( VARIABLE ( ',' output )? -> VARIABLE ( output )? )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:30:7: VARIABLE ( ',' output )?
			{
			VARIABLE19=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_output250);  
			stream_VARIABLE.add(VARIABLE19);

			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:30:16: ( ',' output )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==35) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:30:17: ',' output
					{
					char_literal20=(Token)match(input,35,FOLLOW_35_in_output253);  
					stream_35.add(char_literal20);

					pushFollow(FOLLOW_output_in_output255);
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
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:34:5: ( command ( ';' commands )? -> command ( commands )? )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:34:7: command ( ';' commands )?
			{
			pushFollow(FOLLOW_command_in_commands279);
			command22=command();
			state._fsp--;

			stream_command.add(command22.getTree());
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:34:15: ( ';' commands )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==38) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:34:16: ';' commands
					{
					char_literal23=(Token)match(input,38,FOLLOW_38_in_commands282);  
					stream_38.add(char_literal23);

					pushFollow(FOLLOW_commands_in_commands284);
					commands24=commands();
					state._fsp--;

					stream_commands.add(commands24.getTree());
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
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:38:5: ( VARIABLE ( ',' vars )? -> VARIABLE ( vars )? )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:38:7: VARIABLE ( ',' vars )?
			{
			VARIABLE25=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_vars308);  
			stream_VARIABLE.add(VARIABLE25);

			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:38:16: ( ',' vars )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==35) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:38:17: ',' vars
					{
					char_literal26=(Token)match(input,35,FOLLOW_35_in_vars311);  
					stream_35.add(char_literal26);

					pushFollow(FOLLOW_vars_in_vars313);
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
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:42:5: ( expression ( ',' exprs )? -> expression ( exprs )? )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:42:7: expression ( ',' exprs )?
			{
			pushFollow(FOLLOW_expression_in_exprs337);
			expression28=expression();
			state._fsp--;

			stream_expression.add(expression28.getTree());
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:42:18: ( ',' exprs )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==35) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:42:19: ',' exprs
					{
					char_literal29=(Token)match(input,35,FOLLOW_35_in_exprs340);  
					stream_35.add(char_literal29);

					pushFollow(FOLLOW_exprs_in_exprs342);
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
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:45:1: command : ( 'nop' -> NIL | ( vars ':=' exprs ) -> ^( ASSIGN vars exprs ) | ( 'if' expression 'then' c1= commands ( 'else' c2= commands -> ^( IF ^( COND expression ) ^( THEN $c1) ^( ELSE $c2) ) | -> ^( IF ^( COND expression ) ^( THEN $c1) ) ) 'fi' ) | ( 'while' expression 'do' commands 'od' ) -> ^( WHILE ^( COND expression ) ^( BODY commands ) ) | ( 'for' expression 'do' commands 'od' ) -> ^( FOR ^( COND expression ) ^( BODY commands ) ) | ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' ) -> ^( FOREACH VARIABLE ^( COND expression ) ^( BODY commands ) ) );
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
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:46:5: ( 'nop' -> NIL | ( vars ':=' exprs ) -> ^( ASSIGN vars exprs ) | ( 'if' expression 'then' c1= commands ( 'else' c2= commands -> ^( IF ^( COND expression ) ^( THEN $c1) ^( ELSE $c2) ) | -> ^( IF ^( COND expression ) ^( THEN $c1) ) ) 'fi' ) | ( 'while' expression 'do' commands 'od' ) -> ^( WHILE ^( COND expression ) ^( BODY commands ) ) | ( 'for' expression 'do' commands 'od' ) -> ^( FOR ^( COND expression ) ^( BODY commands ) ) | ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' ) -> ^( FOREACH VARIABLE ^( COND expression ) ^( BODY commands ) ) )
			int alt9=6;
			switch ( input.LA(1) ) {
			case 52:
				{
				alt9=1;
				}
				break;
			case VARIABLE:
				{
				alt9=2;
				}
				break;
			case 48:
				{
				alt9=3;
				}
				break;
			case 57:
				{
				alt9=4;
				}
				break;
			case 44:
				{
				alt9=5;
				}
				break;
			case 45:
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
					string_literal31=(Token)match(input,52,FOLLOW_52_in_command367);  
					stream_52.add(string_literal31);

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
					// 46:12: -> NIL
					{
						adaptor.addChild(root_0, (Object)adaptor.create(NIL, "NIL"));
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
					pushFollow(FOLLOW_vars_in_command379);
					vars32=vars();
					state._fsp--;

					stream_vars.add(vars32.getTree());
					string_literal33=(Token)match(input,37,FOLLOW_37_in_command381);  
					stream_37.add(string_literal33);

					pushFollow(FOLLOW_exprs_in_command383);
					exprs34=exprs();
					state._fsp--;

					stream_exprs.add(exprs34.getTree());
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
					// 47:24: -> ^( ASSIGN vars exprs )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:47:27: ^( ASSIGN vars exprs )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGN, "ASSIGN"), root_1);
						adaptor.addChild(root_1, stream_vars.nextTree());
						adaptor.addChild(root_1, stream_exprs.nextTree());
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
					string_literal35=(Token)match(input,48,FOLLOW_48_in_command402);  
					stream_48.add(string_literal35);

					pushFollow(FOLLOW_expression_in_command404);
					expression36=expression();
					state._fsp--;

					stream_expression.add(expression36.getTree());
					string_literal37=(Token)match(input,55,FOLLOW_55_in_command406);  
					stream_55.add(string_literal37);

					pushFollow(FOLLOW_commands_in_command410);
					c1=commands();
					state._fsp--;

					stream_commands.add(c1.getTree());
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:48:43: ( 'else' c2= commands -> ^( IF ^( COND expression ) ^( THEN $c1) ^( ELSE $c2) ) | -> ^( IF ^( COND expression ) ^( THEN $c1) ) )
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==42) ) {
						alt8=1;
					}
					else if ( (LA8_0==43) ) {
						alt8=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 8, 0, input);
						throw nvae;
					}

					switch (alt8) {
						case 1 :
							// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:48:44: 'else' c2= commands
							{
							string_literal38=(Token)match(input,42,FOLLOW_42_in_command413);  
							stream_42.add(string_literal38);

							pushFollow(FOLLOW_commands_in_command417);
							c2=commands();
							state._fsp--;

							stream_commands.add(c2.getTree());
							// AST REWRITE
							// elements: c2, expression, c1
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

					string_literal39=(Token)match(input,43,FOLLOW_43_in_command484);  
					stream_43.add(string_literal39);

					}

					}
					break;
				case 4 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:51:7: ( 'while' expression 'do' commands 'od' )
					{
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:51:7: ( 'while' expression 'do' commands 'od' )
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:51:8: 'while' expression 'do' commands 'od'
					{
					string_literal40=(Token)match(input,57,FOLLOW_57_in_command494);  
					stream_57.add(string_literal40);

					pushFollow(FOLLOW_expression_in_command496);
					expression41=expression();
					state._fsp--;

					stream_expression.add(expression41.getTree());
					string_literal42=(Token)match(input,41,FOLLOW_41_in_command498);  
					stream_41.add(string_literal42);

					pushFollow(FOLLOW_commands_in_command500);
					commands43=commands();
					state._fsp--;

					stream_commands.add(commands43.getTree());
					string_literal44=(Token)match(input,53,FOLLOW_53_in_command502);  
					stream_53.add(string_literal44);

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
					string_literal45=(Token)match(input,44,FOLLOW_44_in_command529);  
					stream_44.add(string_literal45);

					pushFollow(FOLLOW_expression_in_command531);
					expression46=expression();
					state._fsp--;

					stream_expression.add(expression46.getTree());
					string_literal47=(Token)match(input,41,FOLLOW_41_in_command533);  
					stream_41.add(string_literal47);

					pushFollow(FOLLOW_commands_in_command535);
					commands48=commands();
					state._fsp--;

					stream_commands.add(commands48.getTree());
					string_literal49=(Token)match(input,53,FOLLOW_53_in_command537);  
					stream_53.add(string_literal49);

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
					// 52:44: -> ^( FOR ^( COND expression ) ^( BODY commands ) )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:52:47: ^( FOR ^( COND expression ) ^( BODY commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:52:53: ^( COND expression )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);
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
					string_literal50=(Token)match(input,45,FOLLOW_45_in_command564);  
					stream_45.add(string_literal50);

					VARIABLE51=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_command566);  
					stream_VARIABLE.add(VARIABLE51);

					string_literal52=(Token)match(input,49,FOLLOW_49_in_command568);  
					stream_49.add(string_literal52);

					pushFollow(FOLLOW_expression_in_command570);
					expression53=expression();
					state._fsp--;

					stream_expression.add(expression53.getTree());
					string_literal54=(Token)match(input,41,FOLLOW_41_in_command572);  
					stream_41.add(string_literal54);

					pushFollow(FOLLOW_commands_in_command574);
					commands55=commands();
					state._fsp--;

					stream_commands.add(commands55.getTree());
					string_literal56=(Token)match(input,53,FOLLOW_53_in_command576);  
					stream_53.add(string_literal56);

					}

					// AST REWRITE
					// elements: expression, commands, VARIABLE
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 53:62: -> ^( FOREACH VARIABLE ^( COND expression ) ^( BODY commands ) )
					{
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:53:65: ^( FOREACH VARIABLE ^( COND expression ) ^( BODY commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOREACH, "FOREACH"), root_1);
						adaptor.addChild(root_1, stream_VARIABLE.nextNode());
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:53:84: ^( COND expression )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);
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
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:56:1: exprbase : ( 'nil' -> 'nil' | VARIABLE -> VARIABLE | SYMBOL -> SYMBOL | ( '(' 'cons' lexpr ')' ) -> ^( CONS ( lexpr )? ) | ( '(' 'list' lexpr ')' ) -> ^( LIST ( lexpr )? ) | ( '(' 'hd' exprbase ')' ) -> ^( HD exprbase ) | ( '(' 'tl' exprbase ')' ) -> ^( TL exprbase ) | ( '(' SYMBOL lexpr ')' ) -> ^( CALL SYMBOL ( lexpr )? ) );
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
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");
		RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:57:5: ( 'nil' -> 'nil' | VARIABLE -> VARIABLE | SYMBOL -> SYMBOL | ( '(' 'cons' lexpr ')' ) -> ^( CONS ( lexpr )? ) | ( '(' 'list' lexpr ')' ) -> ^( LIST ( lexpr )? ) | ( '(' 'hd' exprbase ')' ) -> ^( HD exprbase ) | ( '(' 'tl' exprbase ')' ) -> ^( TL exprbase ) | ( '(' SYMBOL lexpr ')' ) -> ^( CALL SYMBOL ( lexpr )? ) )
			int alt10=8;
			switch ( input.LA(1) ) {
			case 51:
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
			case 33:
				{
				switch ( input.LA(2) ) {
				case 40:
					{
					alt10=4;
					}
					break;
				case 50:
					{
					alt10=5;
					}
					break;
				case 47:
					{
					alt10=6;
					}
					break;
				case 56:
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
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:57:7: 'nil'
					{
					string_literal57=(Token)match(input,51,FOLLOW_51_in_exprbase613);  
					stream_51.add(string_literal57);

					// AST REWRITE
					// elements: 51
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 57:12: -> 'nil'
					{
						adaptor.addChild(root_0, stream_51.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:58:7: VARIABLE
					{
					VARIABLE58=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_exprbase623);  
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
					// 58:15: -> VARIABLE
					{
						adaptor.addChild(root_0, stream_VARIABLE.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:59:7: SYMBOL
					{
					SYMBOL59=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_exprbase633);  
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
					// 59:13: -> SYMBOL
					{
						adaptor.addChild(root_0, stream_SYMBOL.nextNode());
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
					char_literal60=(Token)match(input,33,FOLLOW_33_in_exprbase644);  
					stream_33.add(char_literal60);

					string_literal61=(Token)match(input,40,FOLLOW_40_in_exprbase646);  
					stream_40.add(string_literal61);

					pushFollow(FOLLOW_lexpr_in_exprbase648);
					lexpr62=lexpr();
					state._fsp--;

					stream_lexpr.add(lexpr62.getTree());
					char_literal63=(Token)match(input,34,FOLLOW_34_in_exprbase650);  
					stream_34.add(char_literal63);

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
					char_literal64=(Token)match(input,33,FOLLOW_33_in_exprbase667);  
					stream_33.add(char_literal64);

					string_literal65=(Token)match(input,50,FOLLOW_50_in_exprbase669);  
					stream_50.add(string_literal65);

					pushFollow(FOLLOW_lexpr_in_exprbase671);
					lexpr66=lexpr();
					state._fsp--;

					stream_lexpr.add(lexpr66.getTree());
					char_literal67=(Token)match(input,34,FOLLOW_34_in_exprbase673);  
					stream_34.add(char_literal67);

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
					char_literal68=(Token)match(input,33,FOLLOW_33_in_exprbase690);  
					stream_33.add(char_literal68);

					string_literal69=(Token)match(input,47,FOLLOW_47_in_exprbase692);  
					stream_47.add(string_literal69);

					pushFollow(FOLLOW_exprbase_in_exprbase694);
					exprbase70=exprbase();
					state._fsp--;

					stream_exprbase.add(exprbase70.getTree());
					char_literal71=(Token)match(input,34,FOLLOW_34_in_exprbase696);  
					stream_34.add(char_literal71);

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
					char_literal72=(Token)match(input,33,FOLLOW_33_in_exprbase712);  
					stream_33.add(char_literal72);

					string_literal73=(Token)match(input,56,FOLLOW_56_in_exprbase714);  
					stream_56.add(string_literal73);

					pushFollow(FOLLOW_exprbase_in_exprbase716);
					exprbase74=exprbase();
					state._fsp--;

					stream_exprbase.add(exprbase74.getTree());
					char_literal75=(Token)match(input,34,FOLLOW_34_in_exprbase718);  
					stream_34.add(char_literal75);

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
					char_literal76=(Token)match(input,33,FOLLOW_33_in_exprbase734);  
					stream_33.add(char_literal76);

					SYMBOL77=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_exprbase736);  
					stream_SYMBOL.add(SYMBOL77);

					pushFollow(FOLLOW_lexpr_in_exprbase738);
					lexpr78=lexpr();
					state._fsp--;

					stream_lexpr.add(lexpr78.getTree());
					char_literal79=(Token)match(input,34,FOLLOW_34_in_exprbase740);  
					stream_34.add(char_literal79);

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
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:67:1: expression : exprbase ( '=?' exprbase )? -> exprbase ( exprbase )? ;
	public final whileParser.expression_return expression() throws RecognitionException {
		whileParser.expression_return retval = new whileParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal81=null;
		ParserRuleReturnScope exprbase80 =null;
		ParserRuleReturnScope exprbase82 =null;

		Object string_literal81_tree=null;
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:68:5: ( exprbase ( '=?' exprbase )? -> exprbase ( exprbase )? )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:68:7: exprbase ( '=?' exprbase )?
			{
			pushFollow(FOLLOW_exprbase_in_expression767);
			exprbase80=exprbase();
			state._fsp--;

			stream_exprbase.add(exprbase80.getTree());
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:68:16: ( '=?' exprbase )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==39) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:68:17: '=?' exprbase
					{
					string_literal81=(Token)match(input,39,FOLLOW_39_in_expression770);  
					stream_39.add(string_literal81);

					pushFollow(FOLLOW_exprbase_in_expression772);
					exprbase82=exprbase();
					state._fsp--;

					stream_exprbase.add(exprbase82.getTree());
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
			// 68:32: -> exprbase ( exprbase )?
			{
				adaptor.addChild(root_0, stream_exprbase.nextTree());
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:68:43: ( exprbase )?
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
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:71:1: lexpr : ( exprbase )* ;
	public final whileParser.lexpr_return lexpr() throws RecognitionException {
		whileParser.lexpr_return retval = new whileParser.lexpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope exprbase83 =null;


		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:72:5: ( ( exprbase )* )
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:72:7: ( exprbase )*
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:72:7: ( exprbase )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==SYMBOL||LA12_0==VARIABLE||LA12_0==33||LA12_0==51) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:72:7: exprbase
					{
					pushFollow(FOLLOW_exprbase_in_lexpr796);
					exprbase83=exprbase();
					state._fsp--;

					adaptor.addChild(root_0, exprbase83.getTree());

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



	public static final BitSet FOLLOW_function_in_program91 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_program_in_program93 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program96 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_function114 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_SYMBOL_in_function116 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_function118 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_definition_in_function120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_definition149 = new BitSet(new long[]{0x0000000120000000L});
	public static final BitSet FOLLOW_input_in_definition151 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_definition153 = new BitSet(new long[]{0x0211300020000000L});
	public static final BitSet FOLLOW_commands_in_definition155 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_definition157 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_definition159 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_output_in_definition161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inputsub_in_input196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_inputsub221 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_35_in_inputsub224 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_inputsub_in_inputsub226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_output250 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_35_in_output253 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_output_in_output255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commands279 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_38_in_commands282 = new BitSet(new long[]{0x0211300020000000L});
	public static final BitSet FOLLOW_commands_in_commands284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_vars308 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_35_in_vars311 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_vars_in_vars313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprs337 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_35_in_exprs340 = new BitSet(new long[]{0x0008000224000000L});
	public static final BitSet FOLLOW_exprs_in_exprs342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_command367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_command379 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_command381 = new BitSet(new long[]{0x0008000224000000L});
	public static final BitSet FOLLOW_exprs_in_command383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_command402 = new BitSet(new long[]{0x0008000224000000L});
	public static final BitSet FOLLOW_expression_in_command404 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_command406 = new BitSet(new long[]{0x0211300020000000L});
	public static final BitSet FOLLOW_commands_in_command410 = new BitSet(new long[]{0x00000C0000000000L});
	public static final BitSet FOLLOW_42_in_command413 = new BitSet(new long[]{0x0211300020000000L});
	public static final BitSet FOLLOW_commands_in_command417 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_command484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_command494 = new BitSet(new long[]{0x0008000224000000L});
	public static final BitSet FOLLOW_expression_in_command496 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_command498 = new BitSet(new long[]{0x0211300020000000L});
	public static final BitSet FOLLOW_commands_in_command500 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_command502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_command529 = new BitSet(new long[]{0x0008000224000000L});
	public static final BitSet FOLLOW_expression_in_command531 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_command533 = new BitSet(new long[]{0x0211300020000000L});
	public static final BitSet FOLLOW_commands_in_command535 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_command537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_command564 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VARIABLE_in_command566 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_command568 = new BitSet(new long[]{0x0008000224000000L});
	public static final BitSet FOLLOW_expression_in_command570 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_command572 = new BitSet(new long[]{0x0211300020000000L});
	public static final BitSet FOLLOW_commands_in_command574 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_command576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_exprbase613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_exprbase623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_exprbase633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_exprbase644 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_exprbase646 = new BitSet(new long[]{0x0008000624000000L});
	public static final BitSet FOLLOW_lexpr_in_exprbase648 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_exprbase650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_exprbase667 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_exprbase669 = new BitSet(new long[]{0x0008000624000000L});
	public static final BitSet FOLLOW_lexpr_in_exprbase671 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_exprbase673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_exprbase690 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_exprbase692 = new BitSet(new long[]{0x0008000224000000L});
	public static final BitSet FOLLOW_exprbase_in_exprbase694 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_exprbase696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_exprbase712 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_exprbase714 = new BitSet(new long[]{0x0008000224000000L});
	public static final BitSet FOLLOW_exprbase_in_exprbase716 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_exprbase718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_exprbase734 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_SYMBOL_in_exprbase736 = new BitSet(new long[]{0x0008000624000000L});
	public static final BitSet FOLLOW_lexpr_in_exprbase738 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_exprbase740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_in_expression767 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_expression770 = new BitSet(new long[]{0x0008000224000000L});
	public static final BitSet FOLLOW_exprbase_in_expression772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_in_lexpr796 = new BitSet(new long[]{0x0008000224000002L});
}
