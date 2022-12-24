// $ANTLR 3.5.1 C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g 2022-12-24 19:35:41

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class whileParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "BODY", "CALL", "COMMANDS", 
		"COMMENT", "COND", "CONS", "DEC", "DEFINITION", "ELSE", "EXPRESSIONS", 
		"FOR", "FOREACH", "FUNCTION", "FUNC_NAME", "HD", "IF", "INPUT", "LIST", 
		"MAJ", "MIN", "NIL", "NOP", "OUTPUT", "SYM", "SYMBOL", "THEN", "TL", "VAR", 
		"VARIABLE", "VARIABLES", "WHILE", "WS", "'%'", "'('", "')'", "','", "':'", 
		"':='", "';'", "'=?'", "'cons'", "'do'", "'else'", "'fi'", "'for'", "'foreach'", 
		"'function'", "'hd'", "'if'", "'in'", "'list'", "'nil'", "'nop'", "'od'", 
		"'read'", "'then'", "'tl'", "'while'", "'write'"
	};
	public static final int EOF=-1;
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
	public static final int T__63=63;
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
	public static final int EXPRESSIONS=14;
	public static final int FOR=15;
	public static final int FOREACH=16;
	public static final int FUNCTION=17;
	public static final int FUNC_NAME=18;
	public static final int HD=19;
	public static final int IF=20;
	public static final int INPUT=21;
	public static final int LIST=22;
	public static final int MAJ=23;
	public static final int MIN=24;
	public static final int NIL=25;
	public static final int NOP=26;
	public static final int OUTPUT=27;
	public static final int SYM=28;
	public static final int SYMBOL=29;
	public static final int THEN=30;
	public static final int TL=31;
	public static final int VAR=32;
	public static final int VARIABLE=33;
	public static final int VARIABLES=34;
	public static final int WHILE=35;
	public static final int WS=36;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "expression", "commands", "vars", "exprs", "command", "lexpr", 
		"input", "inputsub", "function", "program", "definition", "exprbase", 
		"output"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public whileParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public whileParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this,port,adaptor);
		setDebugListener(proxy);
		setTokenStream(new DebugTokenStream(input,proxy));
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);
		proxy.setTreeAdaptor(adap);
	}

	public whileParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg);
		 
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);

	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

		protected DebugTreeAdaptor adaptor;
		public void setTreeAdaptor(TreeAdaptor adaptor) {
			this.adaptor = new DebugTreeAdaptor(dbg,adaptor);
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

		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(9, 0);

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:10:5: ( function ( ( program )? | EOF !) )
			dbg.enterAlt(1);

			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:10:7: function ( ( program )? | EOF !)
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(10,7);
			pushFollow(FOLLOW_function_in_program107);
			function1=function();
			state._fsp--;

			adaptor.addChild(root_0, function1.getTree());
			dbg.location(10,16);
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:10:16: ( ( program )? | EOF !)
			int alt2=2;
			try { dbg.enterSubRule(2);
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			int LA2_0 = input.LA(1);
			if ( (LA2_0==51) ) {
				alt2=1;
			}
			else if ( (LA2_0==EOF) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:10:17: ( program )?
					{
					dbg.location(10,17);
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:10:17: ( program )?
					int alt1=2;
					try { dbg.enterSubRule(1);
					try { dbg.enterDecision(1, decisionCanBacktrack[1]);

					int LA1_0 = input.LA(1);
					if ( (LA1_0==51) ) {
						alt1=1;
					}
					} finally {dbg.exitDecision(1);}

					switch (alt1) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:10:17: program
							{
							dbg.location(10,17);
							pushFollow(FOLLOW_program_in_program110);
							program2=program();
							state._fsp--;

							adaptor.addChild(root_0, program2.getTree());

							}
							break;

					}
					} finally {dbg.exitSubRule(1);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:10:28: EOF !
					{
					dbg.location(10,31);
					EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_program115); 
					}
					break;

			}
			} finally {dbg.exitSubRule(2);}

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
		dbg.location(11, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try { dbg.enterRule(getGrammarFileName(), "function");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(13, 0);

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:14:5: ( 'function' SYMBOL ':' definition -> ^( FUNCTION ^( FUNC_NAME SYMBOL ) definition ) )
			dbg.enterAlt(1);

			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:14:7: 'function' SYMBOL ':' definition
			{
			dbg.location(14,7);
			string_literal4=(Token)match(input,51,FOLLOW_51_in_function134);  
			stream_51.add(string_literal4);
			dbg.location(14,18);
			SYMBOL5=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_function136);  
			stream_SYMBOL.add(SYMBOL5);
			dbg.location(14,25);
			char_literal6=(Token)match(input,41,FOLLOW_41_in_function138);  
			stream_41.add(char_literal6);
			dbg.location(14,29);
			pushFollow(FOLLOW_definition_in_function140);
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
				dbg.location(14,41);
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:14:41: ^( FUNCTION ^( FUNC_NAME SYMBOL ) definition )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(14,43);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);
				dbg.location(14,52);
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:14:52: ^( FUNC_NAME SYMBOL )
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(14,54);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_NAME, "FUNC_NAME"), root_2);
				dbg.location(14,64);
				adaptor.addChild(root_2, stream_SYMBOL.nextNode());
				adaptor.addChild(root_1, root_2);
				}
				dbg.location(14,72);
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
		dbg.location(15, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "function");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "definition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(17, 0);

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:18:5: ( 'read' input '%' commands '%' 'write' output -> ^( DEFINITION input ^( COMMANDS commands ) ^( OUTPUT output ) ) )
			dbg.enterAlt(1);

			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:18:7: 'read' input '%' commands '%' 'write' output
			{
			dbg.location(18,7);
			string_literal8=(Token)match(input,59,FOLLOW_59_in_definition169);  
			stream_59.add(string_literal8);
			dbg.location(18,14);
			pushFollow(FOLLOW_input_in_definition171);
			input9=input();
			state._fsp--;

			stream_input.add(input9.getTree());dbg.location(18,20);
			char_literal10=(Token)match(input,37,FOLLOW_37_in_definition173);  
			stream_37.add(char_literal10);
			dbg.location(18,24);
			pushFollow(FOLLOW_commands_in_definition175);
			commands11=commands();
			state._fsp--;

			stream_commands.add(commands11.getTree());dbg.location(18,33);
			char_literal12=(Token)match(input,37,FOLLOW_37_in_definition177);  
			stream_37.add(char_literal12);
			dbg.location(18,37);
			string_literal13=(Token)match(input,63,FOLLOW_63_in_definition179);  
			stream_63.add(string_literal13);
			dbg.location(18,45);
			pushFollow(FOLLOW_output_in_definition181);
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
				dbg.location(18,53);
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:18:53: ^( DEFINITION input ^( COMMANDS commands ) ^( OUTPUT output ) )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(18,55);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEFINITION, "DEFINITION"), root_1);
				dbg.location(18,66);
				adaptor.addChild(root_1, stream_input.nextTree());dbg.location(18,72);
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:18:72: ^( COMMANDS commands )
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(18,74);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDS, "COMMANDS"), root_2);
				dbg.location(18,83);
				adaptor.addChild(root_2, stream_commands.nextTree());
				adaptor.addChild(root_1, root_2);
				}
				dbg.location(18,93);
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:18:93: ^( OUTPUT output )
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(18,95);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUT, "OUTPUT"), root_2);
				dbg.location(18,102);
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
		dbg.location(19, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "definition");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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

		try { dbg.enterRule(getGrammarFileName(), "input");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(21, 0);

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:22:5: ( ( inputsub )? -> ^( INPUT ( inputsub )? ) )
			dbg.enterAlt(1);

			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:22:7: ( inputsub )?
			{
			dbg.location(22,7);
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:22:7: ( inputsub )?
			int alt3=2;
			try { dbg.enterSubRule(3);
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			int LA3_0 = input.LA(1);
			if ( (LA3_0==VARIABLE) ) {
				alt3=1;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:22:7: inputsub
					{
					dbg.location(22,7);
					pushFollow(FOLLOW_inputsub_in_input216);
					inputsub15=inputsub();
					state._fsp--;

					stream_inputsub.add(inputsub15.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(3);}

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
				dbg.location(22,18);
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:22:18: ^( INPUT ( inputsub )? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(22,20);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUT, "INPUT"), root_1);
				dbg.location(22,26);
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:22:26: ( inputsub )?
				if ( stream_inputsub.hasNext() ) {
					dbg.location(22,26);
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
		dbg.location(23, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "input");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_inputsub=new RewriteRuleSubtreeStream(adaptor,"rule inputsub");

		try { dbg.enterRule(getGrammarFileName(), "inputsub");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(25, 0);

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:26:5: ( VARIABLE ( ',' inputsub )? -> VARIABLE ( inputsub )? )
			dbg.enterAlt(1);

			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:26:7: VARIABLE ( ',' inputsub )?
			{
			dbg.location(26,7);
			VARIABLE16=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_inputsub241);  
			stream_VARIABLE.add(VARIABLE16);
			dbg.location(26,16);
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:26:16: ( ',' inputsub )?
			int alt4=2;
			try { dbg.enterSubRule(4);
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==40) ) {
				alt4=1;
			}
			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:26:17: ',' inputsub
					{
					dbg.location(26,17);
					char_literal17=(Token)match(input,40,FOLLOW_40_in_inputsub244);  
					stream_40.add(char_literal17);
					dbg.location(26,21);
					pushFollow(FOLLOW_inputsub_in_inputsub246);
					inputsub18=inputsub();
					state._fsp--;

					stream_inputsub.add(inputsub18.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(4);}

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
				dbg.location(26,33);
				adaptor.addChild(root_0, stream_VARIABLE.nextNode());dbg.location(26,42);
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:26:42: ( inputsub )?
				if ( stream_inputsub.hasNext() ) {
					dbg.location(26,42);
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
		dbg.location(27, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "inputsub");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");

		try { dbg.enterRule(getGrammarFileName(), "output");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(29, 0);

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:30:5: ( VARIABLE ( ',' output )? -> VARIABLE ( output )? )
			dbg.enterAlt(1);

			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:30:7: VARIABLE ( ',' output )?
			{
			dbg.location(30,7);
			VARIABLE19=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_output270);  
			stream_VARIABLE.add(VARIABLE19);
			dbg.location(30,16);
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:30:16: ( ',' output )?
			int alt5=2;
			try { dbg.enterSubRule(5);
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==40) ) {
				alt5=1;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:30:17: ',' output
					{
					dbg.location(30,17);
					char_literal20=(Token)match(input,40,FOLLOW_40_in_output273);  
					stream_40.add(char_literal20);
					dbg.location(30,21);
					pushFollow(FOLLOW_output_in_output275);
					output21=output();
					state._fsp--;

					stream_output.add(output21.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(5);}

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
			// 30:29: -> VARIABLE ( output )?
			{
				dbg.location(30,31);
				adaptor.addChild(root_0, stream_VARIABLE.nextNode());dbg.location(30,40);
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:30:40: ( output )?
				if ( stream_output.hasNext() ) {
					dbg.location(30,40);
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
		dbg.location(31, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "output");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "commands");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(33, 0);

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:34:5: ( command ( ';' commands )? -> command ( commands )? )
			dbg.enterAlt(1);

			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:34:7: command ( ';' commands )?
			{
			dbg.location(34,7);
			pushFollow(FOLLOW_command_in_commands299);
			command22=command();
			state._fsp--;

			stream_command.add(command22.getTree());dbg.location(34,15);
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:34:15: ( ';' commands )?
			int alt6=2;
			try { dbg.enterSubRule(6);
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==43) ) {
				alt6=1;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:34:16: ';' commands
					{
					dbg.location(34,16);
					char_literal23=(Token)match(input,43,FOLLOW_43_in_commands302);  
					stream_43.add(char_literal23);
					dbg.location(34,20);
					pushFollow(FOLLOW_commands_in_commands304);
					commands24=commands();
					state._fsp--;

					stream_commands.add(commands24.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(6);}

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
				dbg.location(34,32);
				adaptor.addChild(root_0, stream_command.nextTree());dbg.location(34,40);
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:34:40: ( commands )?
				if ( stream_commands.hasNext() ) {
					dbg.location(34,40);
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
		dbg.location(35, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "commands");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try { dbg.enterRule(getGrammarFileName(), "vars");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(37, 0);

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:38:5: ( VARIABLE ( ',' vars )? -> VARIABLE ( vars )? )
			dbg.enterAlt(1);

			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:38:7: VARIABLE ( ',' vars )?
			{
			dbg.location(38,7);
			VARIABLE25=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_vars328);  
			stream_VARIABLE.add(VARIABLE25);
			dbg.location(38,16);
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:38:16: ( ',' vars )?
			int alt7=2;
			try { dbg.enterSubRule(7);
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			int LA7_0 = input.LA(1);
			if ( (LA7_0==40) ) {
				alt7=1;
			}
			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:38:17: ',' vars
					{
					dbg.location(38,17);
					char_literal26=(Token)match(input,40,FOLLOW_40_in_vars331);  
					stream_40.add(char_literal26);
					dbg.location(38,21);
					pushFollow(FOLLOW_vars_in_vars333);
					vars27=vars();
					state._fsp--;

					stream_vars.add(vars27.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(7);}

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
				dbg.location(38,29);
				adaptor.addChild(root_0, stream_VARIABLE.nextNode());dbg.location(38,38);
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:38:38: ( vars )?
				if ( stream_vars.hasNext() ) {
					dbg.location(38,38);
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
		dbg.location(39, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "vars");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");

		try { dbg.enterRule(getGrammarFileName(), "exprs");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(41, 0);

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:42:5: ( expression ( ',' exprs )? -> expression ( exprs )? )
			dbg.enterAlt(1);

			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:42:7: expression ( ',' exprs )?
			{
			dbg.location(42,7);
			pushFollow(FOLLOW_expression_in_exprs357);
			expression28=expression();
			state._fsp--;

			stream_expression.add(expression28.getTree());dbg.location(42,18);
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:42:18: ( ',' exprs )?
			int alt8=2;
			try { dbg.enterSubRule(8);
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( (LA8_0==40) ) {
				alt8=1;
			}
			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:42:19: ',' exprs
					{
					dbg.location(42,19);
					char_literal29=(Token)match(input,40,FOLLOW_40_in_exprs360);  
					stream_40.add(char_literal29);
					dbg.location(42,23);
					pushFollow(FOLLOW_exprs_in_exprs362);
					exprs30=exprs();
					state._fsp--;

					stream_exprs.add(exprs30.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(8);}

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
			// 42:30: -> expression ( exprs )?
			{
				dbg.location(42,33);
				adaptor.addChild(root_0, stream_expression.nextTree());dbg.location(42,44);
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:42:44: ( exprs )?
				if ( stream_exprs.hasNext() ) {
					dbg.location(42,44);
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
		dbg.location(43, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprs");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:45:1: command : ( 'nop' -> NOP | ( vars ':=' exprs ) -> ^( ASSIGN ^( VARIABLES vars ) ^( EXPRESSIONS exprs ) ) | ( 'if' expression 'then' c1= commands ( 'else' c2= commands -> ^( IF ^( COND expression ) ^( THEN $c1) ^( ELSE $c2) ) | -> ^( IF ^( COND expression ) ^( THEN $c1) ) ) 'fi' ) | ( 'while' expression 'do' commands 'od' ) -> ^( WHILE ^( COND expression ) ^( BODY commands ) ) | ( 'for' expression 'do' commands 'od' ) -> ^( FOR ^( COND expression ) ^( BODY commands ) ) | ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' ) -> ^( FOREACH VARIABLE ^( COND expression ) ^( BODY commands ) ) );
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
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "command");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(45, 0);

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:46:5: ( 'nop' -> NOP | ( vars ':=' exprs ) -> ^( ASSIGN ^( VARIABLES vars ) ^( EXPRESSIONS exprs ) ) | ( 'if' expression 'then' c1= commands ( 'else' c2= commands -> ^( IF ^( COND expression ) ^( THEN $c1) ^( ELSE $c2) ) | -> ^( IF ^( COND expression ) ^( THEN $c1) ) ) 'fi' ) | ( 'while' expression 'do' commands 'od' ) -> ^( WHILE ^( COND expression ) ^( BODY commands ) ) | ( 'for' expression 'do' commands 'od' ) -> ^( FOR ^( COND expression ) ^( BODY commands ) ) | ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' ) -> ^( FOREACH VARIABLE ^( COND expression ) ^( BODY commands ) ) )
			int alt10=6;
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			switch ( input.LA(1) ) {
			case 57:
				{
				alt10=1;
				}
				break;
			case VARIABLE:
				{
				alt10=2;
				}
				break;
			case 53:
				{
				alt10=3;
				}
				break;
			case 62:
				{
				alt10=4;
				}
				break;
			case 49:
				{
				alt10=5;
				}
				break;
			case 50:
				{
				alt10=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:46:7: 'nop'
					{
					dbg.location(46,7);
					string_literal31=(Token)match(input,57,FOLLOW_57_in_command387);  
					stream_57.add(string_literal31);

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
						dbg.location(46,15);
						adaptor.addChild(root_0, (Object)adaptor.create(NOP, "NOP"));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:47:7: ( vars ':=' exprs )
					{
					dbg.location(47,7);
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:47:7: ( vars ':=' exprs )
					dbg.enterAlt(1);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:47:8: vars ':=' exprs
					{
					dbg.location(47,8);
					pushFollow(FOLLOW_vars_in_command399);
					vars32=vars();
					state._fsp--;

					stream_vars.add(vars32.getTree());dbg.location(47,13);
					string_literal33=(Token)match(input,42,FOLLOW_42_in_command401);  
					stream_42.add(string_literal33);
					dbg.location(47,18);
					pushFollow(FOLLOW_exprs_in_command403);
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
					// 47:24: -> ^( ASSIGN ^( VARIABLES vars ) ^( EXPRESSIONS exprs ) )
					{
						dbg.location(47,27);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:47:27: ^( ASSIGN ^( VARIABLES vars ) ^( EXPRESSIONS exprs ) )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(47,29);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGN, "ASSIGN"), root_1);
						dbg.location(47,36);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:47:36: ^( VARIABLES vars )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(47,38);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLES, "VARIABLES"), root_2);
						dbg.location(47,48);
						adaptor.addChild(root_2, stream_vars.nextTree());
						adaptor.addChild(root_1, root_2);
						}
						dbg.location(47,54);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:47:54: ^( EXPRESSIONS exprs )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(47,56);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRESSIONS, "EXPRESSIONS"), root_2);
						dbg.location(47,68);
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
					dbg.enterAlt(3);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:48:7: ( 'if' expression 'then' c1= commands ( 'else' c2= commands -> ^( IF ^( COND expression ) ^( THEN $c1) ^( ELSE $c2) ) | -> ^( IF ^( COND expression ) ^( THEN $c1) ) ) 'fi' )
					{
					dbg.location(48,7);
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:48:7: ( 'if' expression 'then' c1= commands ( 'else' c2= commands -> ^( IF ^( COND expression ) ^( THEN $c1) ^( ELSE $c2) ) | -> ^( IF ^( COND expression ) ^( THEN $c1) ) ) 'fi' )
					dbg.enterAlt(1);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:48:8: 'if' expression 'then' c1= commands ( 'else' c2= commands -> ^( IF ^( COND expression ) ^( THEN $c1) ^( ELSE $c2) ) | -> ^( IF ^( COND expression ) ^( THEN $c1) ) ) 'fi'
					{
					dbg.location(48,8);
					string_literal35=(Token)match(input,53,FOLLOW_53_in_command430);  
					stream_53.add(string_literal35);
					dbg.location(48,13);
					pushFollow(FOLLOW_expression_in_command432);
					expression36=expression();
					state._fsp--;

					stream_expression.add(expression36.getTree());dbg.location(48,24);
					string_literal37=(Token)match(input,60,FOLLOW_60_in_command434);  
					stream_60.add(string_literal37);
					dbg.location(48,33);
					pushFollow(FOLLOW_commands_in_command438);
					c1=commands();
					state._fsp--;

					stream_commands.add(c1.getTree());dbg.location(48,43);
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:48:43: ( 'else' c2= commands -> ^( IF ^( COND expression ) ^( THEN $c1) ^( ELSE $c2) ) | -> ^( IF ^( COND expression ) ^( THEN $c1) ) )
					int alt9=2;
					try { dbg.enterSubRule(9);
					try { dbg.enterDecision(9, decisionCanBacktrack[9]);

					int LA9_0 = input.LA(1);
					if ( (LA9_0==47) ) {
						alt9=1;
					}
					else if ( (LA9_0==48) ) {
						alt9=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(9);}

					switch (alt9) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:48:44: 'else' c2= commands
							{
							dbg.location(48,44);
							string_literal38=(Token)match(input,47,FOLLOW_47_in_command441);  
							stream_47.add(string_literal38);
							dbg.location(48,53);
							pushFollow(FOLLOW_commands_in_command445);
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
								dbg.location(48,66);
								// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:48:66: ^( IF ^( COND expression ) ^( THEN $c1) ^( ELSE $c2) )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(48,68);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
								dbg.location(48,71);
								// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:48:71: ^( COND expression )
								{
								Object root_2 = (Object)adaptor.nil();
								dbg.location(48,73);
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);
								dbg.location(48,78);
								adaptor.addChild(root_2, stream_expression.nextTree());
								adaptor.addChild(root_1, root_2);
								}
								dbg.location(48,90);
								// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:48:90: ^( THEN $c1)
								{
								Object root_2 = (Object)adaptor.nil();
								dbg.location(48,92);
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_2);
								dbg.location(48,98);
								adaptor.addChild(root_2, stream_c1.nextTree());
								adaptor.addChild(root_1, root_2);
								}
								dbg.location(48,102);
								// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:48:102: ^( ELSE $c2)
								{
								Object root_2 = (Object)adaptor.nil();
								dbg.location(48,104);
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSE, "ELSE"), root_2);
								dbg.location(48,110);
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
							dbg.enterAlt(2);

							// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:49:15: 
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
							// 49:15: -> ^( IF ^( COND expression ) ^( THEN $c1) )
							{
								dbg.location(49,17);
								// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:49:17: ^( IF ^( COND expression ) ^( THEN $c1) )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(49,19);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
								dbg.location(49,22);
								// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:49:22: ^( COND expression )
								{
								Object root_2 = (Object)adaptor.nil();
								dbg.location(49,24);
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);
								dbg.location(49,29);
								adaptor.addChild(root_2, stream_expression.nextTree());
								adaptor.addChild(root_1, root_2);
								}
								dbg.location(49,41);
								// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:49:41: ^( THEN $c1)
								{
								Object root_2 = (Object)adaptor.nil();
								dbg.location(49,43);
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_2);
								dbg.location(49,49);
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
					} finally {dbg.exitSubRule(9);}
					dbg.location(50,6);
					string_literal39=(Token)match(input,48,FOLLOW_48_in_command512);  
					stream_48.add(string_literal39);

					}

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:51:7: ( 'while' expression 'do' commands 'od' )
					{
					dbg.location(51,7);
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:51:7: ( 'while' expression 'do' commands 'od' )
					dbg.enterAlt(1);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:51:8: 'while' expression 'do' commands 'od'
					{
					dbg.location(51,8);
					string_literal40=(Token)match(input,62,FOLLOW_62_in_command522);  
					stream_62.add(string_literal40);
					dbg.location(51,16);
					pushFollow(FOLLOW_expression_in_command524);
					expression41=expression();
					state._fsp--;

					stream_expression.add(expression41.getTree());dbg.location(51,27);
					string_literal42=(Token)match(input,46,FOLLOW_46_in_command526);  
					stream_46.add(string_literal42);
					dbg.location(51,32);
					pushFollow(FOLLOW_commands_in_command528);
					commands43=commands();
					state._fsp--;

					stream_commands.add(commands43.getTree());dbg.location(51,41);
					string_literal44=(Token)match(input,58,FOLLOW_58_in_command530);  
					stream_58.add(string_literal44);

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
						dbg.location(51,49);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:51:49: ^( WHILE ^( COND expression ) ^( BODY commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(51,51);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);
						dbg.location(51,57);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:51:57: ^( COND expression )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(51,59);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);
						dbg.location(51,64);
						adaptor.addChild(root_2, stream_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}
						dbg.location(51,76);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:51:76: ^( BODY commands )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(51,78);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_2);
						dbg.location(51,83);
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
					dbg.enterAlt(5);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:52:7: ( 'for' expression 'do' commands 'od' )
					{
					dbg.location(52,7);
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:52:7: ( 'for' expression 'do' commands 'od' )
					dbg.enterAlt(1);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:52:8: 'for' expression 'do' commands 'od'
					{
					dbg.location(52,8);
					string_literal45=(Token)match(input,49,FOLLOW_49_in_command557);  
					stream_49.add(string_literal45);
					dbg.location(52,14);
					pushFollow(FOLLOW_expression_in_command559);
					expression46=expression();
					state._fsp--;

					stream_expression.add(expression46.getTree());dbg.location(52,25);
					string_literal47=(Token)match(input,46,FOLLOW_46_in_command561);  
					stream_46.add(string_literal47);
					dbg.location(52,30);
					pushFollow(FOLLOW_commands_in_command563);
					commands48=commands();
					state._fsp--;

					stream_commands.add(commands48.getTree());dbg.location(52,39);
					string_literal49=(Token)match(input,58,FOLLOW_58_in_command565);  
					stream_58.add(string_literal49);

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
					// 52:44: -> ^( FOR ^( COND expression ) ^( BODY commands ) )
					{
						dbg.location(52,47);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:52:47: ^( FOR ^( COND expression ) ^( BODY commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(52,49);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);
						dbg.location(52,53);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:52:53: ^( COND expression )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(52,55);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);
						dbg.location(52,60);
						adaptor.addChild(root_2, stream_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}
						dbg.location(52,72);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:52:72: ^( BODY commands )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(52,74);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_2);
						dbg.location(52,79);
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
					dbg.enterAlt(6);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:53:7: ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' )
					{
					dbg.location(53,7);
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:53:7: ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' )
					dbg.enterAlt(1);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:53:8: 'foreach' VARIABLE 'in' expression 'do' commands 'od'
					{
					dbg.location(53,8);
					string_literal50=(Token)match(input,50,FOLLOW_50_in_command592);  
					stream_50.add(string_literal50);
					dbg.location(53,18);
					VARIABLE51=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_command594);  
					stream_VARIABLE.add(VARIABLE51);
					dbg.location(53,27);
					string_literal52=(Token)match(input,54,FOLLOW_54_in_command596);  
					stream_54.add(string_literal52);
					dbg.location(53,32);
					pushFollow(FOLLOW_expression_in_command598);
					expression53=expression();
					state._fsp--;

					stream_expression.add(expression53.getTree());dbg.location(53,43);
					string_literal54=(Token)match(input,46,FOLLOW_46_in_command600);  
					stream_46.add(string_literal54);
					dbg.location(53,48);
					pushFollow(FOLLOW_commands_in_command602);
					commands55=commands();
					state._fsp--;

					stream_commands.add(commands55.getTree());dbg.location(53,57);
					string_literal56=(Token)match(input,58,FOLLOW_58_in_command604);  
					stream_58.add(string_literal56);

					}

					// AST REWRITE
					// elements: commands, VARIABLE, expression
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
						dbg.location(53,65);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:53:65: ^( FOREACH VARIABLE ^( COND expression ) ^( BODY commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(53,67);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOREACH, "FOREACH"), root_1);
						dbg.location(53,75);
						adaptor.addChild(root_1, stream_VARIABLE.nextNode());dbg.location(53,84);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:53:84: ^( COND expression )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(53,86);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);
						dbg.location(53,91);
						adaptor.addChild(root_2, stream_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}
						dbg.location(53,103);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:53:103: ^( BODY commands )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(53,105);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_2);
						dbg.location(53,110);
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
		dbg.location(54, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "command");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");
		RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");

		try { dbg.enterRule(getGrammarFileName(), "exprbase");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(56, 0);

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:57:5: ( 'nil' -> NIL | VARIABLE -> ^( VAR VARIABLE ) | SYMBOL -> ^( SYM SYMBOL ) | ( '(' 'cons' lexpr ')' ) -> ^( CONS ( lexpr )? ) | ( '(' 'list' lexpr ')' ) -> ^( LIST ( lexpr )? ) | ( '(' 'hd' exprbase ')' ) -> ^( HD exprbase ) | ( '(' 'tl' exprbase ')' ) -> ^( TL exprbase ) | ( '(' SYMBOL lexpr ')' ) -> ^( CALL SYMBOL ( lexpr )? ) )
			int alt11=8;
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			switch ( input.LA(1) ) {
			case 56:
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
			case 38:
				{
				switch ( input.LA(2) ) {
				case 45:
					{
					alt11=4;
					}
					break;
				case 55:
					{
					alt11=5;
					}
					break;
				case 52:
					{
					alt11=6;
					}
					break;
				case 61:
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
						dbg.recognitionException(nvae);
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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:57:7: 'nil'
					{
					dbg.location(57,7);
					string_literal57=(Token)match(input,56,FOLLOW_56_in_exprbase641);  
					stream_56.add(string_literal57);

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
						dbg.location(57,14);
						adaptor.addChild(root_0, (Object)adaptor.create(NIL, "NIL"));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:58:7: VARIABLE
					{
					dbg.location(58,7);
					VARIABLE58=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_exprbase651);  
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
						dbg.location(58,18);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:58:18: ^( VAR VARIABLE )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(58,20);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);
						dbg.location(58,24);
						adaptor.addChild(root_1, stream_VARIABLE.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:59:7: SYMBOL
					{
					dbg.location(59,7);
					SYMBOL59=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_exprbase666);  
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
						dbg.location(59,16);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:59:16: ^( SYM SYMBOL )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(59,18);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SYM, "SYM"), root_1);
						dbg.location(59,22);
						adaptor.addChild(root_1, stream_SYMBOL.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:60:7: ( '(' 'cons' lexpr ')' )
					{
					dbg.location(60,7);
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:60:7: ( '(' 'cons' lexpr ')' )
					dbg.enterAlt(1);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:60:8: '(' 'cons' lexpr ')'
					{
					dbg.location(60,8);
					char_literal60=(Token)match(input,38,FOLLOW_38_in_exprbase682);  
					stream_38.add(char_literal60);
					dbg.location(60,12);
					string_literal61=(Token)match(input,45,FOLLOW_45_in_exprbase684);  
					stream_45.add(string_literal61);
					dbg.location(60,19);
					pushFollow(FOLLOW_lexpr_in_exprbase686);
					lexpr62=lexpr();
					state._fsp--;

					stream_lexpr.add(lexpr62.getTree());dbg.location(60,25);
					char_literal63=(Token)match(input,39,FOLLOW_39_in_exprbase688);  
					stream_39.add(char_literal63);

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
						dbg.location(60,31);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:60:31: ^( CONS ( lexpr )? )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(60,33);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONS, "CONS"), root_1);
						dbg.location(60,38);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:60:38: ( lexpr )?
						if ( stream_lexpr.hasNext() ) {
							dbg.location(60,38);
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
					dbg.enterAlt(5);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:61:7: ( '(' 'list' lexpr ')' )
					{
					dbg.location(61,7);
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:61:7: ( '(' 'list' lexpr ')' )
					dbg.enterAlt(1);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:61:8: '(' 'list' lexpr ')'
					{
					dbg.location(61,8);
					char_literal64=(Token)match(input,38,FOLLOW_38_in_exprbase705);  
					stream_38.add(char_literal64);
					dbg.location(61,12);
					string_literal65=(Token)match(input,55,FOLLOW_55_in_exprbase707);  
					stream_55.add(string_literal65);
					dbg.location(61,19);
					pushFollow(FOLLOW_lexpr_in_exprbase709);
					lexpr66=lexpr();
					state._fsp--;

					stream_lexpr.add(lexpr66.getTree());dbg.location(61,25);
					char_literal67=(Token)match(input,39,FOLLOW_39_in_exprbase711);  
					stream_39.add(char_literal67);

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
						dbg.location(61,31);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:61:31: ^( LIST ( lexpr )? )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(61,33);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
						dbg.location(61,38);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:61:38: ( lexpr )?
						if ( stream_lexpr.hasNext() ) {
							dbg.location(61,38);
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
					dbg.enterAlt(6);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:62:7: ( '(' 'hd' exprbase ')' )
					{
					dbg.location(62,7);
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:62:7: ( '(' 'hd' exprbase ')' )
					dbg.enterAlt(1);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:62:8: '(' 'hd' exprbase ')'
					{
					dbg.location(62,8);
					char_literal68=(Token)match(input,38,FOLLOW_38_in_exprbase728);  
					stream_38.add(char_literal68);
					dbg.location(62,12);
					string_literal69=(Token)match(input,52,FOLLOW_52_in_exprbase730);  
					stream_52.add(string_literal69);
					dbg.location(62,17);
					pushFollow(FOLLOW_exprbase_in_exprbase732);
					exprbase70=exprbase();
					state._fsp--;

					stream_exprbase.add(exprbase70.getTree());dbg.location(62,26);
					char_literal71=(Token)match(input,39,FOLLOW_39_in_exprbase734);  
					stream_39.add(char_literal71);

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
						dbg.location(62,32);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:62:32: ^( HD exprbase )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(62,34);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(HD, "HD"), root_1);
						dbg.location(62,37);
						adaptor.addChild(root_1, stream_exprbase.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:63:7: ( '(' 'tl' exprbase ')' )
					{
					dbg.location(63,7);
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:63:7: ( '(' 'tl' exprbase ')' )
					dbg.enterAlt(1);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:63:8: '(' 'tl' exprbase ')'
					{
					dbg.location(63,8);
					char_literal72=(Token)match(input,38,FOLLOW_38_in_exprbase750);  
					stream_38.add(char_literal72);
					dbg.location(63,12);
					string_literal73=(Token)match(input,61,FOLLOW_61_in_exprbase752);  
					stream_61.add(string_literal73);
					dbg.location(63,17);
					pushFollow(FOLLOW_exprbase_in_exprbase754);
					exprbase74=exprbase();
					state._fsp--;

					stream_exprbase.add(exprbase74.getTree());dbg.location(63,26);
					char_literal75=(Token)match(input,39,FOLLOW_39_in_exprbase756);  
					stream_39.add(char_literal75);

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
						dbg.location(63,32);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:63:32: ^( TL exprbase )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(63,34);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TL, "TL"), root_1);
						dbg.location(63,37);
						adaptor.addChild(root_1, stream_exprbase.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:64:7: ( '(' SYMBOL lexpr ')' )
					{
					dbg.location(64,7);
					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:64:7: ( '(' SYMBOL lexpr ')' )
					dbg.enterAlt(1);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:64:8: '(' SYMBOL lexpr ')'
					{
					dbg.location(64,8);
					char_literal76=(Token)match(input,38,FOLLOW_38_in_exprbase772);  
					stream_38.add(char_literal76);
					dbg.location(64,12);
					SYMBOL77=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_exprbase774);  
					stream_SYMBOL.add(SYMBOL77);
					dbg.location(64,19);
					pushFollow(FOLLOW_lexpr_in_exprbase776);
					lexpr78=lexpr();
					state._fsp--;

					stream_lexpr.add(lexpr78.getTree());dbg.location(64,25);
					char_literal79=(Token)match(input,39,FOLLOW_39_in_exprbase778);  
					stream_39.add(char_literal79);

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
						dbg.location(64,31);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:64:31: ^( CALL SYMBOL ( lexpr )? )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(64,33);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALL, "CALL"), root_1);
						dbg.location(64,38);
						adaptor.addChild(root_1, stream_SYMBOL.nextNode());dbg.location(64,45);
						// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:64:45: ( lexpr )?
						if ( stream_lexpr.hasNext() ) {
							dbg.location(64,45);
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
		dbg.location(65, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprbase");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");

		try { dbg.enterRule(getGrammarFileName(), "expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(67, 0);

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:68:5: ( exprbase ( '=?' exprbase )? -> exprbase ( exprbase )? )
			dbg.enterAlt(1);

			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:68:7: exprbase ( '=?' exprbase )?
			{
			dbg.location(68,7);
			pushFollow(FOLLOW_exprbase_in_expression805);
			exprbase80=exprbase();
			state._fsp--;

			stream_exprbase.add(exprbase80.getTree());dbg.location(68,16);
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:68:16: ( '=?' exprbase )?
			int alt12=2;
			try { dbg.enterSubRule(12);
			try { dbg.enterDecision(12, decisionCanBacktrack[12]);

			int LA12_0 = input.LA(1);
			if ( (LA12_0==44) ) {
				alt12=1;
			}
			} finally {dbg.exitDecision(12);}

			switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:68:17: '=?' exprbase
					{
					dbg.location(68,17);
					string_literal81=(Token)match(input,44,FOLLOW_44_in_expression808);  
					stream_44.add(string_literal81);
					dbg.location(68,22);
					pushFollow(FOLLOW_exprbase_in_expression810);
					exprbase82=exprbase();
					state._fsp--;

					stream_exprbase.add(exprbase82.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(12);}

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
				dbg.location(68,34);
				adaptor.addChild(root_0, stream_exprbase.nextTree());dbg.location(68,43);
				// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:68:43: ( exprbase )?
				if ( stream_exprbase.hasNext() ) {
					dbg.location(68,43);
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
		dbg.location(69, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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


		try { dbg.enterRule(getGrammarFileName(), "lexpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(71, 0);

		try {
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:72:5: ( ( exprbase )* )
			dbg.enterAlt(1);

			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:72:7: ( exprbase )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(72,7);
			// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:72:7: ( exprbase )*
			try { dbg.enterSubRule(13);

			loop13:
			while (true) {
				int alt13=2;
				try { dbg.enterDecision(13, decisionCanBacktrack[13]);

				int LA13_0 = input.LA(1);
				if ( (LA13_0==SYMBOL||LA13_0==VARIABLE||LA13_0==38||LA13_0==56) ) {
					alt13=1;
				}

				} finally {dbg.exitDecision(13);}

				switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\yanis\\Desktop\\TLC\\Projet\\grammaire\\while.g:72:7: exprbase
					{
					dbg.location(72,7);
					pushFollow(FOLLOW_exprbase_in_lexpr834);
					exprbase83=exprbase();
					state._fsp--;

					adaptor.addChild(root_0, exprbase83.getTree());

					}
					break;

				default :
					break loop13;
				}
			}
			} finally {dbg.exitSubRule(13);}

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
		dbg.location(73, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "lexpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "lexpr"

	// Delegated rules



	public static final BitSet FOLLOW_function_in_program107 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_program_in_program110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EOF_in_program115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_function134 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SYMBOL_in_function136 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_function138 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_definition_in_function140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_definition169 = new BitSet(new long[]{0x0000002200000000L});
	public static final BitSet FOLLOW_input_in_definition171 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_definition173 = new BitSet(new long[]{0x4226000200000000L});
	public static final BitSet FOLLOW_commands_in_definition175 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_definition177 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_definition179 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_output_in_definition181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inputsub_in_input216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_inputsub241 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_40_in_inputsub244 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_inputsub_in_inputsub246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_output270 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_40_in_output273 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_output_in_output275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commands299 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_43_in_commands302 = new BitSet(new long[]{0x4226000200000000L});
	public static final BitSet FOLLOW_commands_in_commands304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_vars328 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_40_in_vars331 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_vars_in_vars333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprs357 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_40_in_exprs360 = new BitSet(new long[]{0x0100004220000000L});
	public static final BitSet FOLLOW_exprs_in_exprs362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_command387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_command399 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_command401 = new BitSet(new long[]{0x0100004220000000L});
	public static final BitSet FOLLOW_exprs_in_command403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_command430 = new BitSet(new long[]{0x0100004220000000L});
	public static final BitSet FOLLOW_expression_in_command432 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_command434 = new BitSet(new long[]{0x4226000200000000L});
	public static final BitSet FOLLOW_commands_in_command438 = new BitSet(new long[]{0x0001800000000000L});
	public static final BitSet FOLLOW_47_in_command441 = new BitSet(new long[]{0x4226000200000000L});
	public static final BitSet FOLLOW_commands_in_command445 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_command512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_command522 = new BitSet(new long[]{0x0100004220000000L});
	public static final BitSet FOLLOW_expression_in_command524 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_command526 = new BitSet(new long[]{0x4226000200000000L});
	public static final BitSet FOLLOW_commands_in_command528 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_command530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_command557 = new BitSet(new long[]{0x0100004220000000L});
	public static final BitSet FOLLOW_expression_in_command559 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_command561 = new BitSet(new long[]{0x4226000200000000L});
	public static final BitSet FOLLOW_commands_in_command563 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_command565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_command592 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_VARIABLE_in_command594 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_command596 = new BitSet(new long[]{0x0100004220000000L});
	public static final BitSet FOLLOW_expression_in_command598 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_command600 = new BitSet(new long[]{0x4226000200000000L});
	public static final BitSet FOLLOW_commands_in_command602 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_command604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_exprbase641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_exprbase651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_exprbase666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_exprbase682 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_exprbase684 = new BitSet(new long[]{0x010000C220000000L});
	public static final BitSet FOLLOW_lexpr_in_exprbase686 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_exprbase688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_exprbase705 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_exprbase707 = new BitSet(new long[]{0x010000C220000000L});
	public static final BitSet FOLLOW_lexpr_in_exprbase709 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_exprbase711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_exprbase728 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_exprbase730 = new BitSet(new long[]{0x0100004220000000L});
	public static final BitSet FOLLOW_exprbase_in_exprbase732 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_exprbase734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_exprbase750 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_exprbase752 = new BitSet(new long[]{0x0100004220000000L});
	public static final BitSet FOLLOW_exprbase_in_exprbase754 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_exprbase756 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_exprbase772 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SYMBOL_in_exprbase774 = new BitSet(new long[]{0x010000C220000000L});
	public static final BitSet FOLLOW_lexpr_in_exprbase776 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_exprbase778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_in_expression805 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_44_in_expression808 = new BitSet(new long[]{0x0100004220000000L});
	public static final BitSet FOLLOW_exprbase_in_expression810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_in_lexpr834 = new BitSet(new long[]{0x0100004220000002L});
}
