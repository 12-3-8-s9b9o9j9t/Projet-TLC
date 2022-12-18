// $ANTLR 3.5.1 C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g 2022-12-18 17:25:39

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


	public static final String[] ruleNames = new String[] {
		"invalidRule", "lexpr", "input", "commands", "command", "function", "expression", 
		"exprs", "definition", "exprbase", "program", "inputsub", "output", "vars"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false
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
	@Override public String getGrammarFileName() { return "C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:9:1: program : function ( program )? EOF !;
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
			// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:10:5: ( function ( program )? EOF !)
			dbg.enterAlt(1);

			// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:10:7: function ( program )? EOF !
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(10,7);
			pushFollow(FOLLOW_function_in_program91);
			function1=function();
			state._fsp--;

			adaptor.addChild(root_0, function1.getTree());
			dbg.location(10,16);
			// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:10:16: ( program )?
			int alt1=2;
			try { dbg.enterSubRule(1);
			try { dbg.enterDecision(1, decisionCanBacktrack[1]);

			int LA1_0 = input.LA(1);
			if ( (LA1_0==46) ) {
				alt1=1;
			}
			} finally {dbg.exitDecision(1);}

			switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:10:16: program
					{
					dbg.location(10,16);
					pushFollow(FOLLOW_program_in_program93);
					program2=program();
					state._fsp--;

					adaptor.addChild(root_0, program2.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(10,28);
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
	// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:13:1: function : 'function' SYMBOL ':' definition -> ^( FUNCTION ^( FUNC_NAME SYMBOL ) definition ) ;
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

		try { dbg.enterRule(getGrammarFileName(), "function");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(13, 0);

		try {
			// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:14:5: ( 'function' SYMBOL ':' definition -> ^( FUNCTION ^( FUNC_NAME SYMBOL ) definition ) )
			dbg.enterAlt(1);

			// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:14:7: 'function' SYMBOL ':' definition
			{
			dbg.location(14,7);
			string_literal4=(Token)match(input,46,FOLLOW_46_in_function114);  
			stream_46.add(string_literal4);
			dbg.location(14,18);
			SYMBOL5=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_function116);  
			stream_SYMBOL.add(SYMBOL5);
			dbg.location(14,25);
			char_literal6=(Token)match(input,36,FOLLOW_36_in_function118);  
			stream_36.add(char_literal6);
			dbg.location(14,29);
			pushFollow(FOLLOW_definition_in_function120);
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
			// 14:39: -> ^( FUNCTION ^( FUNC_NAME SYMBOL ) definition )
			{
				dbg.location(14,41);
				// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:14:41: ^( FUNCTION ^( FUNC_NAME SYMBOL ) definition )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(14,43);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);
				dbg.location(14,52);
				// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:14:52: ^( FUNC_NAME SYMBOL )
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
	// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:17:1: definition : 'read' input '%' commands '%' 'write' output -> ^( DEFINITION input ^( COMMANDS commands ) ^( OUTPUT output ) ) ;
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

		try { dbg.enterRule(getGrammarFileName(), "definition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(17, 0);

		try {
			// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:18:5: ( 'read' input '%' commands '%' 'write' output -> ^( DEFINITION input ^( COMMANDS commands ) ^( OUTPUT output ) ) )
			dbg.enterAlt(1);

			// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:18:7: 'read' input '%' commands '%' 'write' output
			{
			dbg.location(18,7);
			string_literal8=(Token)match(input,54,FOLLOW_54_in_definition149);  
			stream_54.add(string_literal8);
			dbg.location(18,14);
			pushFollow(FOLLOW_input_in_definition151);
			input9=input();
			state._fsp--;

			stream_input.add(input9.getTree());dbg.location(18,20);
			char_literal10=(Token)match(input,32,FOLLOW_32_in_definition153);  
			stream_32.add(char_literal10);
			dbg.location(18,24);
			pushFollow(FOLLOW_commands_in_definition155);
			commands11=commands();
			state._fsp--;

			stream_commands.add(commands11.getTree());dbg.location(18,33);
			char_literal12=(Token)match(input,32,FOLLOW_32_in_definition157);  
			stream_32.add(char_literal12);
			dbg.location(18,37);
			string_literal13=(Token)match(input,58,FOLLOW_58_in_definition159);  
			stream_58.add(string_literal13);
			dbg.location(18,45);
			pushFollow(FOLLOW_output_in_definition161);
			output14=output();
			state._fsp--;

			stream_output.add(output14.getTree());
			// AST REWRITE
			// elements: commands, input, output
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
				// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:18:53: ^( DEFINITION input ^( COMMANDS commands ) ^( OUTPUT output ) )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(18,55);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEFINITION, "DEFINITION"), root_1);
				dbg.location(18,66);
				adaptor.addChild(root_1, stream_input.nextTree());dbg.location(18,72);
				// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:18:72: ^( COMMANDS commands )
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(18,74);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDS, "COMMANDS"), root_2);
				dbg.location(18,83);
				adaptor.addChild(root_2, stream_commands.nextTree());
				adaptor.addChild(root_1, root_2);
				}
				dbg.location(18,93);
				// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:18:93: ^( OUTPUT output )
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
	// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:21:1: input : ( inputsub )? -> ^( INPUT ( inputsub )? ) ;
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
			// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:22:5: ( ( inputsub )? -> ^( INPUT ( inputsub )? ) )
			dbg.enterAlt(1);

			// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:22:7: ( inputsub )?
			{
			dbg.location(22,7);
			// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:22:7: ( inputsub )?
			int alt2=2;
			try { dbg.enterSubRule(2);
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			int LA2_0 = input.LA(1);
			if ( (LA2_0==VARIABLE) ) {
				alt2=1;
			}
			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:22:7: inputsub
					{
					dbg.location(22,7);
					pushFollow(FOLLOW_inputsub_in_input196);
					inputsub15=inputsub();
					state._fsp--;

					stream_inputsub.add(inputsub15.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(2);}

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
				// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:22:18: ^( INPUT ( inputsub )? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(22,20);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUT, "INPUT"), root_1);
				dbg.location(22,26);
				// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:22:26: ( inputsub )?
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
	// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:25:1: inputsub : VARIABLE ( ',' inputsub )? -> VARIABLE ( inputsub )? ;
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

		try { dbg.enterRule(getGrammarFileName(), "inputsub");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(25, 0);

		try {
			// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:26:5: ( VARIABLE ( ',' inputsub )? -> VARIABLE ( inputsub )? )
			dbg.enterAlt(1);

			// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:26:7: VARIABLE ( ',' inputsub )?
			{
			dbg.location(26,7);
			VARIABLE16=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_inputsub221);  
			stream_VARIABLE.add(VARIABLE16);
			dbg.location(26,16);
			// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:26:16: ( ',' inputsub )?
			int alt3=2;
			try { dbg.enterSubRule(3);
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			int LA3_0 = input.LA(1);
			if ( (LA3_0==35) ) {
				alt3=1;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:26:17: ',' inputsub
					{
					dbg.location(26,17);
					char_literal17=(Token)match(input,35,FOLLOW_35_in_inputsub224);  
					stream_35.add(char_literal17);
					dbg.location(26,21);
					pushFollow(FOLLOW_inputsub_in_inputsub226);
					inputsub18=inputsub();
					state._fsp--;

					stream_inputsub.add(inputsub18.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(3);}

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
				dbg.location(26,33);
				adaptor.addChild(root_0, stream_VARIABLE.nextNode());dbg.location(26,42);
				// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:26:42: ( inputsub )?
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
	// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:29:1: output : VARIABLE ( ',' output )? -> VARIABLE ( output )? ;
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

		try { dbg.enterRule(getGrammarFileName(), "output");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(29, 0);

		try {
			// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:30:5: ( VARIABLE ( ',' output )? -> VARIABLE ( output )? )
			dbg.enterAlt(1);

			// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:30:7: VARIABLE ( ',' output )?
			{
			dbg.location(30,7);
			VARIABLE19=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_output250);  
			stream_VARIABLE.add(VARIABLE19);
			dbg.location(30,16);
			// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:30:16: ( ',' output )?
			int alt4=2;
			try { dbg.enterSubRule(4);
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==35) ) {
				alt4=1;
			}
			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:30:17: ',' output
					{
					dbg.location(30,17);
					char_literal20=(Token)match(input,35,FOLLOW_35_in_output253);  
					stream_35.add(char_literal20);
					dbg.location(30,21);
					pushFollow(FOLLOW_output_in_output255);
					output21=output();
					state._fsp--;

					stream_output.add(output21.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(4);}

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
				// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:30:40: ( output )?
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
	// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:33:1: commands : command ( ';' commands )? -> command ( commands )? ;
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

		try { dbg.enterRule(getGrammarFileName(), "commands");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(33, 0);

		try {
			// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:34:5: ( command ( ';' commands )? -> command ( commands )? )
			dbg.enterAlt(1);

			// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:34:7: command ( ';' commands )?
			{
			dbg.location(34,7);
			pushFollow(FOLLOW_command_in_commands279);
			command22=command();
			state._fsp--;

			stream_command.add(command22.getTree());dbg.location(34,15);
			// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:34:15: ( ';' commands )?
			int alt5=2;
			try { dbg.enterSubRule(5);
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==38) ) {
				alt5=1;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:34:16: ';' commands
					{
					dbg.location(34,16);
					char_literal23=(Token)match(input,38,FOLLOW_38_in_commands282);  
					stream_38.add(char_literal23);
					dbg.location(34,20);
					pushFollow(FOLLOW_commands_in_commands284);
					commands24=commands();
					state._fsp--;

					stream_commands.add(commands24.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(5);}

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
				// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:34:40: ( commands )?
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
	// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:37:1: vars : VARIABLE ( ',' vars )? -> VARIABLE ( vars )? ;
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

		try { dbg.enterRule(getGrammarFileName(), "vars");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(37, 0);

		try {
			// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:38:5: ( VARIABLE ( ',' vars )? -> VARIABLE ( vars )? )
			dbg.enterAlt(1);

			// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:38:7: VARIABLE ( ',' vars )?
			{
			dbg.location(38,7);
			VARIABLE25=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_vars308);  
			stream_VARIABLE.add(VARIABLE25);
			dbg.location(38,16);
			// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:38:16: ( ',' vars )?
			int alt6=2;
			try { dbg.enterSubRule(6);
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==35) ) {
				alt6=1;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:38:17: ',' vars
					{
					dbg.location(38,17);
					char_literal26=(Token)match(input,35,FOLLOW_35_in_vars311);  
					stream_35.add(char_literal26);
					dbg.location(38,21);
					pushFollow(FOLLOW_vars_in_vars313);
					vars27=vars();
					state._fsp--;

					stream_vars.add(vars27.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(6);}

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
				dbg.location(38,29);
				adaptor.addChild(root_0, stream_VARIABLE.nextNode());dbg.location(38,38);
				// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:38:38: ( vars )?
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
	// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:41:1: exprs : expression ( ',' exprs )? -> expression ( exprs )? ;
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

		try { dbg.enterRule(getGrammarFileName(), "exprs");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(41, 0);

		try {
			// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:42:5: ( expression ( ',' exprs )? -> expression ( exprs )? )
			dbg.enterAlt(1);

			// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:42:7: expression ( ',' exprs )?
			{
			dbg.location(42,7);
			pushFollow(FOLLOW_expression_in_exprs337);
			expression28=expression();
			state._fsp--;

			stream_expression.add(expression28.getTree());dbg.location(42,18);
			// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:42:18: ( ',' exprs )?
			int alt7=2;
			try { dbg.enterSubRule(7);
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			int LA7_0 = input.LA(1);
			if ( (LA7_0==35) ) {
				alt7=1;
			}
			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:42:19: ',' exprs
					{
					dbg.location(42,19);
					char_literal29=(Token)match(input,35,FOLLOW_35_in_exprs340);  
					stream_35.add(char_literal29);
					dbg.location(42,23);
					pushFollow(FOLLOW_exprs_in_exprs342);
					exprs30=exprs();
					state._fsp--;

					stream_exprs.add(exprs30.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(7);}

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
				dbg.location(42,33);
				adaptor.addChild(root_0, stream_expression.nextTree());dbg.location(42,44);
				// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:42:44: ( exprs )?
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
	// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:45:1: command : ( 'nop' -> NIL | ( vars ':=' exprs ) -> ^( ASSIGN vars exprs ) | ( 'if' expression 'then' c1= commands ( 'else' c2= commands -> ^( IF ^( COND expression ) ^( THEN $c1) ^( ELSE $c2) ) | -> ^( IF ^( COND expression ) ^( THEN $c1) ) ) 'fi' ) | ( 'while' expression 'do' commands 'od' ) -> ^( WHILE ^( COND expression ) ^( BODY commands ) ) | ( 'for' expression 'do' commands 'od' ) -> ^( FOR ^( COND expression ) ^( BODY commands ) ) | ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' ) -> ^( FOREACH VARIABLE ^( COND expression ) ^( BODY commands ) ) );
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

		try { dbg.enterRule(getGrammarFileName(), "command");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(45, 0);

		try {
			// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:46:5: ( 'nop' -> NIL | ( vars ':=' exprs ) -> ^( ASSIGN vars exprs ) | ( 'if' expression 'then' c1= commands ( 'else' c2= commands -> ^( IF ^( COND expression ) ^( THEN $c1) ^( ELSE $c2) ) | -> ^( IF ^( COND expression ) ^( THEN $c1) ) ) 'fi' ) | ( 'while' expression 'do' commands 'od' ) -> ^( WHILE ^( COND expression ) ^( BODY commands ) ) | ( 'for' expression 'do' commands 'od' ) -> ^( FOR ^( COND expression ) ^( BODY commands ) ) | ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' ) -> ^( FOREACH VARIABLE ^( COND expression ) ^( BODY commands ) ) )
			int alt9=6;
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:46:7: 'nop'
					{
					dbg.location(46,7);
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
						dbg.location(46,15);
						adaptor.addChild(root_0, (Object)adaptor.create(NIL, "NIL"));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:47:7: ( vars ':=' exprs )
					{
					dbg.location(47,7);
					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:47:7: ( vars ':=' exprs )
					dbg.enterAlt(1);

					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:47:8: vars ':=' exprs
					{
					dbg.location(47,8);
					pushFollow(FOLLOW_vars_in_command379);
					vars32=vars();
					state._fsp--;

					stream_vars.add(vars32.getTree());dbg.location(47,13);
					string_literal33=(Token)match(input,37,FOLLOW_37_in_command381);  
					stream_37.add(string_literal33);
					dbg.location(47,18);
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
						dbg.location(47,27);
						// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:47:27: ^( ASSIGN vars exprs )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(47,29);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGN, "ASSIGN"), root_1);
						dbg.location(47,36);
						adaptor.addChild(root_1, stream_vars.nextTree());dbg.location(47,41);
						adaptor.addChild(root_1, stream_exprs.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:48:7: ( 'if' expression 'then' c1= commands ( 'else' c2= commands -> ^( IF ^( COND expression ) ^( THEN $c1) ^( ELSE $c2) ) | -> ^( IF ^( COND expression ) ^( THEN $c1) ) ) 'fi' )
					{
					dbg.location(48,7);
					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:48:7: ( 'if' expression 'then' c1= commands ( 'else' c2= commands -> ^( IF ^( COND expression ) ^( THEN $c1) ^( ELSE $c2) ) | -> ^( IF ^( COND expression ) ^( THEN $c1) ) ) 'fi' )
					dbg.enterAlt(1);

					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:48:8: 'if' expression 'then' c1= commands ( 'else' c2= commands -> ^( IF ^( COND expression ) ^( THEN $c1) ^( ELSE $c2) ) | -> ^( IF ^( COND expression ) ^( THEN $c1) ) ) 'fi'
					{
					dbg.location(48,8);
					string_literal35=(Token)match(input,48,FOLLOW_48_in_command402);  
					stream_48.add(string_literal35);
					dbg.location(48,13);
					pushFollow(FOLLOW_expression_in_command404);
					expression36=expression();
					state._fsp--;

					stream_expression.add(expression36.getTree());dbg.location(48,24);
					string_literal37=(Token)match(input,55,FOLLOW_55_in_command406);  
					stream_55.add(string_literal37);
					dbg.location(48,33);
					pushFollow(FOLLOW_commands_in_command410);
					c1=commands();
					state._fsp--;

					stream_commands.add(c1.getTree());dbg.location(48,43);
					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:48:43: ( 'else' c2= commands -> ^( IF ^( COND expression ) ^( THEN $c1) ^( ELSE $c2) ) | -> ^( IF ^( COND expression ) ^( THEN $c1) ) )
					int alt8=2;
					try { dbg.enterSubRule(8);
					try { dbg.enterDecision(8, decisionCanBacktrack[8]);

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
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(8);}

					switch (alt8) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:48:44: 'else' c2= commands
							{
							dbg.location(48,44);
							string_literal38=(Token)match(input,42,FOLLOW_42_in_command413);  
							stream_42.add(string_literal38);
							dbg.location(48,53);
							pushFollow(FOLLOW_commands_in_command417);
							c2=commands();
							state._fsp--;

							stream_commands.add(c2.getTree());
							// AST REWRITE
							// elements: c1, expression, c2
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
								// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:48:66: ^( IF ^( COND expression ) ^( THEN $c1) ^( ELSE $c2) )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(48,68);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
								dbg.location(48,71);
								// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:48:71: ^( COND expression )
								{
								Object root_2 = (Object)adaptor.nil();
								dbg.location(48,73);
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);
								dbg.location(48,78);
								adaptor.addChild(root_2, stream_expression.nextTree());
								adaptor.addChild(root_1, root_2);
								}
								dbg.location(48,90);
								// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:48:90: ^( THEN $c1)
								{
								Object root_2 = (Object)adaptor.nil();
								dbg.location(48,92);
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_2);
								dbg.location(48,98);
								adaptor.addChild(root_2, stream_c1.nextTree());
								adaptor.addChild(root_1, root_2);
								}
								dbg.location(48,102);
								// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:48:102: ^( ELSE $c2)
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

							// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:49:15: 
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
								// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:49:17: ^( IF ^( COND expression ) ^( THEN $c1) )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(49,19);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
								dbg.location(49,22);
								// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:49:22: ^( COND expression )
								{
								Object root_2 = (Object)adaptor.nil();
								dbg.location(49,24);
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);
								dbg.location(49,29);
								adaptor.addChild(root_2, stream_expression.nextTree());
								adaptor.addChild(root_1, root_2);
								}
								dbg.location(49,41);
								// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:49:41: ^( THEN $c1)
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
					} finally {dbg.exitSubRule(8);}
					dbg.location(50,6);
					string_literal39=(Token)match(input,43,FOLLOW_43_in_command484);  
					stream_43.add(string_literal39);

					}

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:51:7: ( 'while' expression 'do' commands 'od' )
					{
					dbg.location(51,7);
					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:51:7: ( 'while' expression 'do' commands 'od' )
					dbg.enterAlt(1);

					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:51:8: 'while' expression 'do' commands 'od'
					{
					dbg.location(51,8);
					string_literal40=(Token)match(input,57,FOLLOW_57_in_command494);  
					stream_57.add(string_literal40);
					dbg.location(51,16);
					pushFollow(FOLLOW_expression_in_command496);
					expression41=expression();
					state._fsp--;

					stream_expression.add(expression41.getTree());dbg.location(51,27);
					string_literal42=(Token)match(input,41,FOLLOW_41_in_command498);  
					stream_41.add(string_literal42);
					dbg.location(51,32);
					pushFollow(FOLLOW_commands_in_command500);
					commands43=commands();
					state._fsp--;

					stream_commands.add(commands43.getTree());dbg.location(51,41);
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
						dbg.location(51,49);
						// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:51:49: ^( WHILE ^( COND expression ) ^( BODY commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(51,51);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);
						dbg.location(51,57);
						// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:51:57: ^( COND expression )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(51,59);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);
						dbg.location(51,64);
						adaptor.addChild(root_2, stream_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}
						dbg.location(51,76);
						// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:51:76: ^( BODY commands )
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

					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:52:7: ( 'for' expression 'do' commands 'od' )
					{
					dbg.location(52,7);
					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:52:7: ( 'for' expression 'do' commands 'od' )
					dbg.enterAlt(1);

					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:52:8: 'for' expression 'do' commands 'od'
					{
					dbg.location(52,8);
					string_literal45=(Token)match(input,44,FOLLOW_44_in_command529);  
					stream_44.add(string_literal45);
					dbg.location(52,14);
					pushFollow(FOLLOW_expression_in_command531);
					expression46=expression();
					state._fsp--;

					stream_expression.add(expression46.getTree());dbg.location(52,25);
					string_literal47=(Token)match(input,41,FOLLOW_41_in_command533);  
					stream_41.add(string_literal47);
					dbg.location(52,30);
					pushFollow(FOLLOW_commands_in_command535);
					commands48=commands();
					state._fsp--;

					stream_commands.add(commands48.getTree());dbg.location(52,39);
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
						dbg.location(52,47);
						// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:52:47: ^( FOR ^( COND expression ) ^( BODY commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(52,49);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);
						dbg.location(52,53);
						// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:52:53: ^( COND expression )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(52,55);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);
						dbg.location(52,60);
						adaptor.addChild(root_2, stream_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}
						dbg.location(52,72);
						// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:52:72: ^( BODY commands )
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

					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:53:7: ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' )
					{
					dbg.location(53,7);
					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:53:7: ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' )
					dbg.enterAlt(1);

					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:53:8: 'foreach' VARIABLE 'in' expression 'do' commands 'od'
					{
					dbg.location(53,8);
					string_literal50=(Token)match(input,45,FOLLOW_45_in_command564);  
					stream_45.add(string_literal50);
					dbg.location(53,18);
					VARIABLE51=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_command566);  
					stream_VARIABLE.add(VARIABLE51);
					dbg.location(53,27);
					string_literal52=(Token)match(input,49,FOLLOW_49_in_command568);  
					stream_49.add(string_literal52);
					dbg.location(53,32);
					pushFollow(FOLLOW_expression_in_command570);
					expression53=expression();
					state._fsp--;

					stream_expression.add(expression53.getTree());dbg.location(53,43);
					string_literal54=(Token)match(input,41,FOLLOW_41_in_command572);  
					stream_41.add(string_literal54);
					dbg.location(53,48);
					pushFollow(FOLLOW_commands_in_command574);
					commands55=commands();
					state._fsp--;

					stream_commands.add(commands55.getTree());dbg.location(53,57);
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
						dbg.location(53,65);
						// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:53:65: ^( FOREACH VARIABLE ^( COND expression ) ^( BODY commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(53,67);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOREACH, "FOREACH"), root_1);
						dbg.location(53,75);
						adaptor.addChild(root_1, stream_VARIABLE.nextNode());dbg.location(53,84);
						// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:53:84: ^( COND expression )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(53,86);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);
						dbg.location(53,91);
						adaptor.addChild(root_2, stream_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}
						dbg.location(53,103);
						// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:53:103: ^( BODY commands )
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
	// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:56:1: exprbase : ( 'nil' -> 'nil' | VARIABLE -> VARIABLE | SYMBOL -> SYMBOL | ( '(' 'cons' lexpr ')' ) -> ^( CONS ( lexpr )? ) | ( '(' 'list' lexpr ')' ) -> ^( LIST ( lexpr )? ) | ( '(' 'hd' exprbase ')' ) -> ^( HD exprbase ) | ( '(' 'tl' exprbase ')' ) -> ^( TL exprbase ) | ( '(' SYMBOL lexpr ')' ) -> ^( CALL SYMBOL ( lexpr )? ) );
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

		try { dbg.enterRule(getGrammarFileName(), "exprbase");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(56, 0);

		try {
			// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:57:5: ( 'nil' -> 'nil' | VARIABLE -> VARIABLE | SYMBOL -> SYMBOL | ( '(' 'cons' lexpr ')' ) -> ^( CONS ( lexpr )? ) | ( '(' 'list' lexpr ')' ) -> ^( LIST ( lexpr )? ) | ( '(' 'hd' exprbase ')' ) -> ^( HD exprbase ) | ( '(' 'tl' exprbase ')' ) -> ^( TL exprbase ) | ( '(' SYMBOL lexpr ')' ) -> ^( CALL SYMBOL ( lexpr )? ) )
			int alt10=8;
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

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
					new NoViableAltException("", 10, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:57:7: 'nil'
					{
					dbg.location(57,7);
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
						dbg.location(57,14);
						adaptor.addChild(root_0, stream_51.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:58:7: VARIABLE
					{
					dbg.location(58,7);
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
						dbg.location(58,17);
						adaptor.addChild(root_0, stream_VARIABLE.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:59:7: SYMBOL
					{
					dbg.location(59,7);
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
						dbg.location(59,15);
						adaptor.addChild(root_0, stream_SYMBOL.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:60:7: ( '(' 'cons' lexpr ')' )
					{
					dbg.location(60,7);
					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:60:7: ( '(' 'cons' lexpr ')' )
					dbg.enterAlt(1);

					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:60:8: '(' 'cons' lexpr ')'
					{
					dbg.location(60,8);
					char_literal60=(Token)match(input,33,FOLLOW_33_in_exprbase644);  
					stream_33.add(char_literal60);
					dbg.location(60,12);
					string_literal61=(Token)match(input,40,FOLLOW_40_in_exprbase646);  
					stream_40.add(string_literal61);
					dbg.location(60,19);
					pushFollow(FOLLOW_lexpr_in_exprbase648);
					lexpr62=lexpr();
					state._fsp--;

					stream_lexpr.add(lexpr62.getTree());dbg.location(60,25);
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
						dbg.location(60,31);
						// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:60:31: ^( CONS ( lexpr )? )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(60,33);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONS, "CONS"), root_1);
						dbg.location(60,38);
						// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:60:38: ( lexpr )?
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

					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:61:7: ( '(' 'list' lexpr ')' )
					{
					dbg.location(61,7);
					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:61:7: ( '(' 'list' lexpr ')' )
					dbg.enterAlt(1);

					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:61:8: '(' 'list' lexpr ')'
					{
					dbg.location(61,8);
					char_literal64=(Token)match(input,33,FOLLOW_33_in_exprbase667);  
					stream_33.add(char_literal64);
					dbg.location(61,12);
					string_literal65=(Token)match(input,50,FOLLOW_50_in_exprbase669);  
					stream_50.add(string_literal65);
					dbg.location(61,19);
					pushFollow(FOLLOW_lexpr_in_exprbase671);
					lexpr66=lexpr();
					state._fsp--;

					stream_lexpr.add(lexpr66.getTree());dbg.location(61,25);
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
						dbg.location(61,31);
						// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:61:31: ^( LIST ( lexpr )? )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(61,33);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
						dbg.location(61,38);
						// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:61:38: ( lexpr )?
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

					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:62:7: ( '(' 'hd' exprbase ')' )
					{
					dbg.location(62,7);
					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:62:7: ( '(' 'hd' exprbase ')' )
					dbg.enterAlt(1);

					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:62:8: '(' 'hd' exprbase ')'
					{
					dbg.location(62,8);
					char_literal68=(Token)match(input,33,FOLLOW_33_in_exprbase690);  
					stream_33.add(char_literal68);
					dbg.location(62,12);
					string_literal69=(Token)match(input,47,FOLLOW_47_in_exprbase692);  
					stream_47.add(string_literal69);
					dbg.location(62,17);
					pushFollow(FOLLOW_exprbase_in_exprbase694);
					exprbase70=exprbase();
					state._fsp--;

					stream_exprbase.add(exprbase70.getTree());dbg.location(62,26);
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
						dbg.location(62,32);
						// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:62:32: ^( HD exprbase )
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

					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:63:7: ( '(' 'tl' exprbase ')' )
					{
					dbg.location(63,7);
					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:63:7: ( '(' 'tl' exprbase ')' )
					dbg.enterAlt(1);

					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:63:8: '(' 'tl' exprbase ')'
					{
					dbg.location(63,8);
					char_literal72=(Token)match(input,33,FOLLOW_33_in_exprbase712);  
					stream_33.add(char_literal72);
					dbg.location(63,12);
					string_literal73=(Token)match(input,56,FOLLOW_56_in_exprbase714);  
					stream_56.add(string_literal73);
					dbg.location(63,17);
					pushFollow(FOLLOW_exprbase_in_exprbase716);
					exprbase74=exprbase();
					state._fsp--;

					stream_exprbase.add(exprbase74.getTree());dbg.location(63,26);
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
						dbg.location(63,32);
						// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:63:32: ^( TL exprbase )
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

					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:64:7: ( '(' SYMBOL lexpr ')' )
					{
					dbg.location(64,7);
					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:64:7: ( '(' SYMBOL lexpr ')' )
					dbg.enterAlt(1);

					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:64:8: '(' SYMBOL lexpr ')'
					{
					dbg.location(64,8);
					char_literal76=(Token)match(input,33,FOLLOW_33_in_exprbase734);  
					stream_33.add(char_literal76);
					dbg.location(64,12);
					SYMBOL77=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_exprbase736);  
					stream_SYMBOL.add(SYMBOL77);
					dbg.location(64,19);
					pushFollow(FOLLOW_lexpr_in_exprbase738);
					lexpr78=lexpr();
					state._fsp--;

					stream_lexpr.add(lexpr78.getTree());dbg.location(64,25);
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
						dbg.location(64,31);
						// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:64:31: ^( CALL SYMBOL ( lexpr )? )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(64,33);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALL, "CALL"), root_1);
						dbg.location(64,38);
						adaptor.addChild(root_1, stream_SYMBOL.nextNode());dbg.location(64,45);
						// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:64:45: ( lexpr )?
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
	// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:67:1: expression : exprbase ( '=?' exprbase )? -> exprbase ( exprbase )? ;
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

		try { dbg.enterRule(getGrammarFileName(), "expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(67, 0);

		try {
			// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:68:5: ( exprbase ( '=?' exprbase )? -> exprbase ( exprbase )? )
			dbg.enterAlt(1);

			// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:68:7: exprbase ( '=?' exprbase )?
			{
			dbg.location(68,7);
			pushFollow(FOLLOW_exprbase_in_expression767);
			exprbase80=exprbase();
			state._fsp--;

			stream_exprbase.add(exprbase80.getTree());dbg.location(68,16);
			// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:68:16: ( '=?' exprbase )?
			int alt11=2;
			try { dbg.enterSubRule(11);
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			int LA11_0 = input.LA(1);
			if ( (LA11_0==39) ) {
				alt11=1;
			}
			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:68:17: '=?' exprbase
					{
					dbg.location(68,17);
					string_literal81=(Token)match(input,39,FOLLOW_39_in_expression770);  
					stream_39.add(string_literal81);
					dbg.location(68,22);
					pushFollow(FOLLOW_exprbase_in_expression772);
					exprbase82=exprbase();
					state._fsp--;

					stream_exprbase.add(exprbase82.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(11);}

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
				// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:68:43: ( exprbase )?
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
	// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:71:1: lexpr : ( exprbase )* ;
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
			// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:72:5: ( ( exprbase )* )
			dbg.enterAlt(1);

			// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:72:7: ( exprbase )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(72,7);
			// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:72:7: ( exprbase )*
			try { dbg.enterSubRule(12);

			loop12:
			while (true) {
				int alt12=2;
				try { dbg.enterDecision(12, decisionCanBacktrack[12]);

				int LA12_0 = input.LA(1);
				if ( (LA12_0==SYMBOL||LA12_0==VARIABLE||LA12_0==33||LA12_0==51) ) {
					alt12=1;
				}

				} finally {dbg.exitDecision(12);}

				switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\dounk\\OneDrive\\Bureau\\Projet-TLC\\grammaire\\while.g:72:7: exprbase
					{
					dbg.location(72,7);
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
			} finally {dbg.exitSubRule(12);}

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
