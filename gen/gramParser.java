// Generated from /home/sipwarriper/IdeaProjects/ANTLR4-Compiladors/src/gram.g4 by ANTLR 4.7

    import java.io.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TK_WS=1, TK_PC_PROGRAMA=2, TK_PC_FPROGRAMA=3, TK_PC_ACCIO=4, TK_PC_FACCIO=5, 
		TK_PC_FUNCIO=6, TK_PC_FFUNCIO=7, TK_PC_RETURN=8, TK_PC_PARAM_IN=9, TK_PC_PARAM_IO=10, 
		TK_PC_CONSTANTS=11, TK_PC_FCONSTANTS=12, TK_PC_VARIABLES=13, TK_PC_FVARIABLES=14, 
		TK_PC_TIPUS=15, TK_PC_FTIPUS=16, TK_PC_TUPLA=17, TK_PC_FTUPLA=18, TK_PC_VECTOR=19, 
		TK_PC_MIDA=20, TK_PC_INICI=21, TK_PC_SI=22, TK_PC_LLAVORS=23, TK_PC_ALTRAMENT=24, 
		TK_PC_FSI=25, TK_PC_PER=26, TK_PC_DE=27, TK_PC_FINS=28, TK_PC_FER=29, 
		TK_PC_FPER=30, TK_PC_MENTRE=31, TK_PC_FMENTRE=32, TK_PC_INT=33, TK_PC_REAL=34, 
		TK_PC_CHAR=35, TK_PC_BOOL=36, TK_PC_READ=37, TK_PC_WRITE=38, TK_PC_WRITELN=39, 
		TK_CONST_CHAR=40, TK_CONST_REAL=41, TK_CONST_BOOL=42, TK_CONST_INT=43, 
		TK_OP_SUMA=44, TK_OP_RESTA=45, TK_OP_MULT=46, TK_OP_REALDIV=47, TK_OP_INTDIV=48, 
		TK_OP_MOD=49, TK_OP_MINUS=50, TK_OP_EQ=51, TK_OP_DIFF=52, TK_OP_GT=53, 
		TK_OP_LT=54, TK_OP_LOET=55, TK_OP_GOET=56, TK_OP_NEG=57, TK_OP_AND=58, 
		TK_OP_OR=59, TK_OP_QUESTION_MARK=60, TK_OP_COLON=61, TK_OP_VECTOR_OPEN=62, 
		TK_OP_VECTOR_CLOSE=63, TK_OP_TUPLE=64, TK_OP_ASSIGN=65, TK_OP_PAR_OPEN=66, 
		TK_OP_PAR_CLOSE=67, TK_COMMENTS=68, TK_MULTILINE_COMMENTS=69, TK_SEP_COMMA=70, 
		TK_SEP_SEMICOLON=71, TK_STRING_LITERAL=72, TK_IDENTIFIER=73;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_typeBlock = 2, RULE_newType = 3, 
		RULE_basicType = 4, RULE_vectorDec = 5, RULE_tuplaDec = 6, RULE_constBlock = 7, 
		RULE_varBlock = 8, RULE_funcDecBlock = 9, RULE_accioDec = 10, RULE_funcDec = 11, 
		RULE_params = 12, RULE_funcImpBlock = 13, RULE_accioImp = 14, RULE_funcImp = 15, 
		RULE_type = 16, RULE_assign = 17, RULE_if_rule = 18, RULE_for_rule = 19, 
		RULE_while_rule = 20, RULE_accio = 21, RULE_read = 22, RULE_write = 23, 
		RULE_writeln = 24, RULE_sentence = 25, RULE_constValue = 26, RULE_tuple = 27, 
		RULE_vector = 28, RULE_func = 29, RULE_expr = 30, RULE_logicsDown = 31, 
		RULE_logicUp = 32, RULE_sum = 33, RULE_mult = 34, RULE_neg = 35, RULE_value = 36, 
		RULE_parenthesis = 37;
	public static final String[] ruleNames = {
		"program", "main", "typeBlock", "newType", "basicType", "vectorDec", "tuplaDec", 
		"constBlock", "varBlock", "funcDecBlock", "accioDec", "funcDec", "params", 
		"funcImpBlock", "accioImp", "funcImp", "type", "assign", "if_rule", "for_rule", 
		"while_rule", "accio", "read", "write", "writeln", "sentence", "constValue", 
		"tuple", "vector", "func", "expr", "logicsDown", "logicUp", "sum", "mult", 
		"neg", "value", "parenthesis"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'programa'", "'fprograma'", "'accio'", "'faccio'", "'funcio'", 
		"'ffuncio'", "'retorna'", "'ent'", "'entsor'", "'constants'", "'fconstants'", 
		"'variables'", "'fvariables'", "'tipus'", "'ftipus'", "'tupla'", "'ftupla'", 
		"'vector'", "'mida'", "'inici'", "'si'", "'llavors'", "'altrament'", "'fsi'", 
		"'per'", "'de'", "'fins'", "'fer'", "'fper'", "'mentre'", "'fmentre'", 
		"'enter'", "'real'", "'car'", "'boolea'", "'llegir'", "'escriure'", "'escriureln'", 
		null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'\\'", "'%'", "'~'", 
		"'=='", "'!='", "'>'", "'<'", "'<='", "'>='", "'no'", "'&'", "'|'", "'?'", 
		"':'", "'['", "']'", "'.'", "':='", "'('", "')'", null, null, "','", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TK_WS", "TK_PC_PROGRAMA", "TK_PC_FPROGRAMA", "TK_PC_ACCIO", "TK_PC_FACCIO", 
		"TK_PC_FUNCIO", "TK_PC_FFUNCIO", "TK_PC_RETURN", "TK_PC_PARAM_IN", "TK_PC_PARAM_IO", 
		"TK_PC_CONSTANTS", "TK_PC_FCONSTANTS", "TK_PC_VARIABLES", "TK_PC_FVARIABLES", 
		"TK_PC_TIPUS", "TK_PC_FTIPUS", "TK_PC_TUPLA", "TK_PC_FTUPLA", "TK_PC_VECTOR", 
		"TK_PC_MIDA", "TK_PC_INICI", "TK_PC_SI", "TK_PC_LLAVORS", "TK_PC_ALTRAMENT", 
		"TK_PC_FSI", "TK_PC_PER", "TK_PC_DE", "TK_PC_FINS", "TK_PC_FER", "TK_PC_FPER", 
		"TK_PC_MENTRE", "TK_PC_FMENTRE", "TK_PC_INT", "TK_PC_REAL", "TK_PC_CHAR", 
		"TK_PC_BOOL", "TK_PC_READ", "TK_PC_WRITE", "TK_PC_WRITELN", "TK_CONST_CHAR", 
		"TK_CONST_REAL", "TK_CONST_BOOL", "TK_CONST_INT", "TK_OP_SUMA", "TK_OP_RESTA", 
		"TK_OP_MULT", "TK_OP_REALDIV", "TK_OP_INTDIV", "TK_OP_MOD", "TK_OP_MINUS", 
		"TK_OP_EQ", "TK_OP_DIFF", "TK_OP_GT", "TK_OP_LT", "TK_OP_LOET", "TK_OP_GOET", 
		"TK_OP_NEG", "TK_OP_AND", "TK_OP_OR", "TK_OP_QUESTION_MARK", "TK_OP_COLON", 
		"TK_OP_VECTOR_OPEN", "TK_OP_VECTOR_CLOSE", "TK_OP_TUPLE", "TK_OP_ASSIGN", 
		"TK_OP_PAR_OPEN", "TK_OP_PAR_CLOSE", "TK_COMMENTS", "TK_MULTILINE_COMMENTS", 
		"TK_SEP_COMMA", "TK_SEP_SEMICOLON", "TK_STRING_LITERAL", "TK_IDENTIFIER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "gram.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	     SymTable<Registre> TS = new SymTable<Registre>(1000);
	     boolean error = false;

	     //override method
	     public void notifyErrorListeners(Token offendingToken, String msg, RecognitionException e)    {
	          super.notifyErrorListeners(offendingToken,msg,e);
	          error=true;
	     }

	public gramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TypeBlockContext typeBlock() {
			return getRuleContext(TypeBlockContext.class,0);
		}
		public FuncDecBlockContext funcDecBlock() {
			return getRuleContext(FuncDecBlockContext.class,0);
		}
		public ConstBlockContext constBlock() {
			return getRuleContext(ConstBlockContext.class,0);
		}
		public FuncImpBlockContext funcImpBlock() {
			return getRuleContext(FuncImpBlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_TIPUS) {
				{
				setState(76);
				typeBlock();
				}
			}

			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(79);
				funcDecBlock();
				}
				break;
			}
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_CONSTANTS) {
				{
				setState(82);
				constBlock();
				}
			}

			setState(85);
			main();
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(86);
				funcImpBlock();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public TerminalNode TK_PC_PROGRAMA() { return getToken(gramParser.TK_PC_PROGRAMA, 0); }
		public TerminalNode TK_IDENTIFIER() { return getToken(gramParser.TK_IDENTIFIER, 0); }
		public TerminalNode TK_PC_FPROGRAMA() { return getToken(gramParser.TK_PC_FPROGRAMA, 0); }
		public VarBlockContext varBlock() {
			return getRuleContext(VarBlockContext.class,0);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(TK_PC_PROGRAMA);
			setState(90);
			match(TK_IDENTIFIER);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_VARIABLES) {
				{
				setState(91);
				varBlock();
				}
			}

			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_PC_WRITELN - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
				{
				{
				setState(94);
				sentence();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(TK_PC_FPROGRAMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBlockContext extends ParserRuleContext {
		public TerminalNode TK_PC_TIPUS() { return getToken(gramParser.TK_PC_TIPUS, 0); }
		public TerminalNode TK_PC_FTIPUS() { return getToken(gramParser.TK_PC_FTIPUS, 0); }
		public List<NewTypeContext> newType() {
			return getRuleContexts(NewTypeContext.class);
		}
		public NewTypeContext newType(int i) {
			return getRuleContext(NewTypeContext.class,i);
		}
		public TypeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterTypeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitTypeBlock(this);
		}
	}

	public final TypeBlockContext typeBlock() throws RecognitionException {
		TypeBlockContext _localctx = new TypeBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(TK_PC_TIPUS);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_IDENTIFIER) {
				{
				{
				setState(103);
				newType();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(TK_PC_FTIPUS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewTypeContext extends ParserRuleContext {
		public TerminalNode TK_IDENTIFIER() { return getToken(gramParser.TK_IDENTIFIER, 0); }
		public TerminalNode TK_OP_COLON() { return getToken(gramParser.TK_OP_COLON, 0); }
		public TerminalNode TK_SEP_SEMICOLON() { return getToken(gramParser.TK_SEP_SEMICOLON, 0); }
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public VectorDecContext vectorDec() {
			return getRuleContext(VectorDecContext.class,0);
		}
		public TuplaDecContext tuplaDec() {
			return getRuleContext(TuplaDecContext.class,0);
		}
		public NewTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterNewType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitNewType(this);
		}
	}

	public final NewTypeContext newType() throws RecognitionException {
		NewTypeContext _localctx = new NewTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_newType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(TK_IDENTIFIER);
			setState(112);
			match(TK_OP_COLON);
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PC_INT:
			case TK_PC_REAL:
			case TK_PC_CHAR:
			case TK_PC_BOOL:
				{
				setState(113);
				basicType();
				}
				break;
			case TK_PC_VECTOR:
				{
				setState(114);
				vectorDec();
				}
				break;
			case TK_PC_TUPLA:
				{
				setState(115);
				tuplaDec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(118);
			match(TK_SEP_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicTypeContext extends ParserRuleContext {
		public TerminalNode TK_PC_INT() { return getToken(gramParser.TK_PC_INT, 0); }
		public TerminalNode TK_PC_REAL() { return getToken(gramParser.TK_PC_REAL, 0); }
		public TerminalNode TK_PC_CHAR() { return getToken(gramParser.TK_PC_CHAR, 0); }
		public TerminalNode TK_PC_BOOL() { return getToken(gramParser.TK_PC_BOOL, 0); }
		public BasicTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterBasicType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitBasicType(this);
		}
	}

	public final BasicTypeContext basicType() throws RecognitionException {
		BasicTypeContext _localctx = new BasicTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_basicType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PC_INT) | (1L << TK_PC_REAL) | (1L << TK_PC_CHAR) | (1L << TK_PC_BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VectorDecContext extends ParserRuleContext {
		public TerminalNode TK_PC_VECTOR() { return getToken(gramParser.TK_PC_VECTOR, 0); }
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public TerminalNode TK_PC_MIDA() { return getToken(gramParser.TK_PC_MIDA, 0); }
		public List<TerminalNode> TK_CONST_INT() { return getTokens(gramParser.TK_CONST_INT); }
		public TerminalNode TK_CONST_INT(int i) {
			return getToken(gramParser.TK_CONST_INT, i);
		}
		public TerminalNode TK_PC_INICI() { return getToken(gramParser.TK_PC_INICI, 0); }
		public VectorDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectorDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterVectorDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitVectorDec(this);
		}
	}

	public final VectorDecContext vectorDec() throws RecognitionException {
		VectorDecContext _localctx = new VectorDecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_vectorDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(TK_PC_VECTOR);
			setState(123);
			basicType();
			setState(124);
			match(TK_PC_MIDA);
			setState(125);
			match(TK_CONST_INT);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_INICI) {
				{
				setState(126);
				match(TK_PC_INICI);
				setState(127);
				match(TK_CONST_INT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TuplaDecContext extends ParserRuleContext {
		public TerminalNode TK_PC_TUPLA() { return getToken(gramParser.TK_PC_TUPLA, 0); }
		public TerminalNode TK_PC_FTUPLA() { return getToken(gramParser.TK_PC_FTUPLA, 0); }
		public List<BasicTypeContext> basicType() {
			return getRuleContexts(BasicTypeContext.class);
		}
		public BasicTypeContext basicType(int i) {
			return getRuleContext(BasicTypeContext.class,i);
		}
		public List<TerminalNode> TK_IDENTIFIER() { return getTokens(gramParser.TK_IDENTIFIER); }
		public TerminalNode TK_IDENTIFIER(int i) {
			return getToken(gramParser.TK_IDENTIFIER, i);
		}
		public List<TerminalNode> TK_SEP_SEMICOLON() { return getTokens(gramParser.TK_SEP_SEMICOLON); }
		public TerminalNode TK_SEP_SEMICOLON(int i) {
			return getToken(gramParser.TK_SEP_SEMICOLON, i);
		}
		public TuplaDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplaDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterTuplaDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitTuplaDec(this);
		}
	}

	public final TuplaDecContext tuplaDec() throws RecognitionException {
		TuplaDecContext _localctx = new TuplaDecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tuplaDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(TK_PC_TUPLA);
			setState(135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(131);
				basicType();
				setState(132);
				match(TK_IDENTIFIER);
				setState(133);
				match(TK_SEP_SEMICOLON);
				}
				}
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PC_INT) | (1L << TK_PC_REAL) | (1L << TK_PC_CHAR) | (1L << TK_PC_BOOL))) != 0) );
			setState(139);
			match(TK_PC_FTUPLA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstBlockContext extends ParserRuleContext {
		public TerminalNode TK_PC_CONSTANTS() { return getToken(gramParser.TK_PC_CONSTANTS, 0); }
		public TerminalNode TK_PC_FCONSTANTS() { return getToken(gramParser.TK_PC_FCONSTANTS, 0); }
		public List<BasicTypeContext> basicType() {
			return getRuleContexts(BasicTypeContext.class);
		}
		public BasicTypeContext basicType(int i) {
			return getRuleContext(BasicTypeContext.class,i);
		}
		public List<TerminalNode> TK_IDENTIFIER() { return getTokens(gramParser.TK_IDENTIFIER); }
		public TerminalNode TK_IDENTIFIER(int i) {
			return getToken(gramParser.TK_IDENTIFIER, i);
		}
		public List<TerminalNode> TK_OP_ASSIGN() { return getTokens(gramParser.TK_OP_ASSIGN); }
		public TerminalNode TK_OP_ASSIGN(int i) {
			return getToken(gramParser.TK_OP_ASSIGN, i);
		}
		public List<TerminalNode> TK_SEP_SEMICOLON() { return getTokens(gramParser.TK_SEP_SEMICOLON); }
		public TerminalNode TK_SEP_SEMICOLON(int i) {
			return getToken(gramParser.TK_SEP_SEMICOLON, i);
		}
		public List<ConstValueContext> constValue() {
			return getRuleContexts(ConstValueContext.class);
		}
		public ConstValueContext constValue(int i) {
			return getRuleContext(ConstValueContext.class,i);
		}
		public List<TerminalNode> TK_STRING_LITERAL() { return getTokens(gramParser.TK_STRING_LITERAL); }
		public TerminalNode TK_STRING_LITERAL(int i) {
			return getToken(gramParser.TK_STRING_LITERAL, i);
		}
		public ConstBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterConstBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitConstBlock(this);
		}
	}

	public final ConstBlockContext constBlock() throws RecognitionException {
		ConstBlockContext _localctx = new ConstBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(TK_PC_CONSTANTS);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PC_INT) | (1L << TK_PC_REAL) | (1L << TK_PC_CHAR) | (1L << TK_PC_BOOL))) != 0)) {
				{
				{
				setState(142);
				basicType();
				setState(143);
				match(TK_IDENTIFIER);
				setState(144);
				match(TK_OP_ASSIGN);
				setState(147);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_CONST_CHAR:
				case TK_CONST_REAL:
				case TK_CONST_BOOL:
				case TK_CONST_INT:
					{
					setState(145);
					constValue();
					}
					break;
				case TK_STRING_LITERAL:
					{
					setState(146);
					match(TK_STRING_LITERAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(149);
				match(TK_SEP_SEMICOLON);
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			match(TK_PC_FCONSTANTS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarBlockContext extends ParserRuleContext {
		public TerminalNode TK_PC_VARIABLES() { return getToken(gramParser.TK_PC_VARIABLES, 0); }
		public TerminalNode TK_PC_FVARIABLES() { return getToken(gramParser.TK_PC_FVARIABLES, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> TK_IDENTIFIER() { return getTokens(gramParser.TK_IDENTIFIER); }
		public TerminalNode TK_IDENTIFIER(int i) {
			return getToken(gramParser.TK_IDENTIFIER, i);
		}
		public List<TerminalNode> TK_SEP_SEMICOLON() { return getTokens(gramParser.TK_SEP_SEMICOLON); }
		public TerminalNode TK_SEP_SEMICOLON(int i) {
			return getToken(gramParser.TK_SEP_SEMICOLON, i);
		}
		public VarBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterVarBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitVarBlock(this);
		}
	}

	public final VarBlockContext varBlock() throws RecognitionException {
		VarBlockContext _localctx = new VarBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(TK_PC_VARIABLES);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & ((1L << (TK_PC_INT - 33)) | (1L << (TK_PC_REAL - 33)) | (1L << (TK_PC_CHAR - 33)) | (1L << (TK_PC_BOOL - 33)) | (1L << (TK_IDENTIFIER - 33)))) != 0)) {
				{
				{
				setState(159);
				type();
				setState(160);
				match(TK_IDENTIFIER);
				setState(161);
				match(TK_SEP_SEMICOLON);
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			match(TK_PC_FVARIABLES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDecBlockContext extends ParserRuleContext {
		public List<AccioDecContext> accioDec() {
			return getRuleContexts(AccioDecContext.class);
		}
		public AccioDecContext accioDec(int i) {
			return getRuleContext(AccioDecContext.class,i);
		}
		public List<FuncDecContext> funcDec() {
			return getRuleContexts(FuncDecContext.class);
		}
		public FuncDecContext funcDec(int i) {
			return getRuleContext(FuncDecContext.class,i);
		}
		public FuncDecBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDecBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterFuncDecBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitFuncDecBlock(this);
		}
	}

	public final FuncDecBlockContext funcDecBlock() throws RecognitionException {
		FuncDecBlockContext _localctx = new FuncDecBlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcDecBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_PC_ACCIO || _la==TK_PC_FUNCIO) {
				{
				setState(172);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_PC_ACCIO:
					{
					setState(170);
					accioDec();
					}
					break;
				case TK_PC_FUNCIO:
					{
					setState(171);
					funcDec();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccioDecContext extends ParserRuleContext {
		public TerminalNode TK_PC_ACCIO() { return getToken(gramParser.TK_PC_ACCIO, 0); }
		public TerminalNode TK_IDENTIFIER() { return getToken(gramParser.TK_IDENTIFIER, 0); }
		public TerminalNode TK_OP_PAR_OPEN() { return getToken(gramParser.TK_OP_PAR_OPEN, 0); }
		public TerminalNode TK_OP_PAR_CLOSE() { return getToken(gramParser.TK_OP_PAR_CLOSE, 0); }
		public TerminalNode TK_SEP_SEMICOLON() { return getToken(gramParser.TK_SEP_SEMICOLON, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public AccioDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accioDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterAccioDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitAccioDec(this);
		}
	}

	public final AccioDecContext accioDec() throws RecognitionException {
		AccioDecContext _localctx = new AccioDecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_accioDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(TK_PC_ACCIO);
			setState(178);
			match(TK_IDENTIFIER);
			setState(179);
			match(TK_OP_PAR_OPEN);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PC_PARAM_IN) | (1L << TK_PC_PARAM_IO) | (1L << TK_PC_INT) | (1L << TK_PC_REAL) | (1L << TK_PC_CHAR) | (1L << TK_PC_BOOL))) != 0) || _la==TK_IDENTIFIER) {
				{
				setState(180);
				params();
				}
			}

			setState(183);
			match(TK_OP_PAR_CLOSE);
			setState(184);
			match(TK_SEP_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDecContext extends ParserRuleContext {
		public TerminalNode TK_PC_FUNCIO() { return getToken(gramParser.TK_PC_FUNCIO, 0); }
		public TerminalNode TK_IDENTIFIER() { return getToken(gramParser.TK_IDENTIFIER, 0); }
		public TerminalNode TK_OP_PAR_OPEN() { return getToken(gramParser.TK_OP_PAR_OPEN, 0); }
		public TerminalNode TK_OP_PAR_CLOSE() { return getToken(gramParser.TK_OP_PAR_CLOSE, 0); }
		public TerminalNode TK_PC_RETURN() { return getToken(gramParser.TK_PC_RETURN, 0); }
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public TerminalNode TK_SEP_SEMICOLON() { return getToken(gramParser.TK_SEP_SEMICOLON, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FuncDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterFuncDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitFuncDec(this);
		}
	}

	public final FuncDecContext funcDec() throws RecognitionException {
		FuncDecContext _localctx = new FuncDecContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funcDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(TK_PC_FUNCIO);
			setState(187);
			match(TK_IDENTIFIER);
			setState(188);
			match(TK_OP_PAR_OPEN);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PC_PARAM_IN) | (1L << TK_PC_PARAM_IO) | (1L << TK_PC_INT) | (1L << TK_PC_REAL) | (1L << TK_PC_CHAR) | (1L << TK_PC_BOOL))) != 0) || _la==TK_IDENTIFIER) {
				{
				setState(189);
				params();
				}
			}

			setState(192);
			match(TK_OP_PAR_CLOSE);
			setState(193);
			match(TK_PC_RETURN);
			setState(194);
			basicType();
			setState(195);
			match(TK_SEP_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> TK_IDENTIFIER() { return getTokens(gramParser.TK_IDENTIFIER); }
		public TerminalNode TK_IDENTIFIER(int i) {
			return getToken(gramParser.TK_IDENTIFIER, i);
		}
		public List<TerminalNode> TK_SEP_COMMA() { return getTokens(gramParser.TK_SEP_COMMA); }
		public TerminalNode TK_SEP_COMMA(int i) {
			return getToken(gramParser.TK_SEP_COMMA, i);
		}
		public List<TerminalNode> TK_PC_PARAM_IN() { return getTokens(gramParser.TK_PC_PARAM_IN); }
		public TerminalNode TK_PC_PARAM_IN(int i) {
			return getToken(gramParser.TK_PC_PARAM_IN, i);
		}
		public List<TerminalNode> TK_PC_PARAM_IO() { return getTokens(gramParser.TK_PC_PARAM_IO); }
		public TerminalNode TK_PC_PARAM_IO(int i) {
			return getToken(gramParser.TK_PC_PARAM_IO, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_PARAM_IN || _la==TK_PC_PARAM_IO) {
				{
				setState(197);
				_la = _input.LA(1);
				if ( !(_la==TK_PC_PARAM_IN || _la==TK_PC_PARAM_IO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(200);
			type();
			setState(201);
			match(TK_IDENTIFIER);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_SEP_COMMA) {
				{
				{
				setState(202);
				match(TK_SEP_COMMA);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PC_PARAM_IN || _la==TK_PC_PARAM_IO) {
					{
					setState(203);
					_la = _input.LA(1);
					if ( !(_la==TK_PC_PARAM_IN || _la==TK_PC_PARAM_IO) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(206);
				type();
				setState(207);
				match(TK_IDENTIFIER);
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncImpBlockContext extends ParserRuleContext {
		public List<AccioImpContext> accioImp() {
			return getRuleContexts(AccioImpContext.class);
		}
		public AccioImpContext accioImp(int i) {
			return getRuleContext(AccioImpContext.class,i);
		}
		public List<FuncImpContext> funcImp() {
			return getRuleContexts(FuncImpContext.class);
		}
		public FuncImpContext funcImp(int i) {
			return getRuleContext(FuncImpContext.class,i);
		}
		public FuncImpBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcImpBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterFuncImpBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitFuncImpBlock(this);
		}
	}

	public final FuncImpBlockContext funcImpBlock() throws RecognitionException {
		FuncImpBlockContext _localctx = new FuncImpBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funcImpBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_PC_ACCIO || _la==TK_PC_FUNCIO) {
				{
				setState(216);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_PC_ACCIO:
					{
					setState(214);
					accioImp();
					}
					break;
				case TK_PC_FUNCIO:
					{
					setState(215);
					funcImp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccioImpContext extends ParserRuleContext {
		public TerminalNode TK_PC_ACCIO() { return getToken(gramParser.TK_PC_ACCIO, 0); }
		public TerminalNode TK_IDENTIFIER() { return getToken(gramParser.TK_IDENTIFIER, 0); }
		public TerminalNode TK_OP_PAR_OPEN() { return getToken(gramParser.TK_OP_PAR_OPEN, 0); }
		public TerminalNode TK_OP_PAR_CLOSE() { return getToken(gramParser.TK_OP_PAR_CLOSE, 0); }
		public TerminalNode TK_PC_FACCIO() { return getToken(gramParser.TK_PC_FACCIO, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public VarBlockContext varBlock() {
			return getRuleContext(VarBlockContext.class,0);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public AccioImpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accioImp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterAccioImp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitAccioImp(this);
		}
	}

	public final AccioImpContext accioImp() throws RecognitionException {
		AccioImpContext _localctx = new AccioImpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_accioImp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(TK_PC_ACCIO);
			setState(222);
			match(TK_IDENTIFIER);
			setState(223);
			match(TK_OP_PAR_OPEN);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PC_PARAM_IN) | (1L << TK_PC_PARAM_IO) | (1L << TK_PC_INT) | (1L << TK_PC_REAL) | (1L << TK_PC_CHAR) | (1L << TK_PC_BOOL))) != 0) || _la==TK_IDENTIFIER) {
				{
				setState(224);
				params();
				}
			}

			setState(227);
			match(TK_OP_PAR_CLOSE);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_VARIABLES) {
				{
				setState(228);
				varBlock();
				}
			}

			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_PC_WRITELN - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
				{
				{
				setState(231);
				sentence();
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			match(TK_PC_FACCIO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncImpContext extends ParserRuleContext {
		public TerminalNode TK_PC_FUNCIO() { return getToken(gramParser.TK_PC_FUNCIO, 0); }
		public TerminalNode TK_IDENTIFIER() { return getToken(gramParser.TK_IDENTIFIER, 0); }
		public TerminalNode TK_OP_PAR_OPEN() { return getToken(gramParser.TK_OP_PAR_OPEN, 0); }
		public TerminalNode TK_OP_PAR_CLOSE() { return getToken(gramParser.TK_OP_PAR_CLOSE, 0); }
		public List<TerminalNode> TK_PC_RETURN() { return getTokens(gramParser.TK_PC_RETURN); }
		public TerminalNode TK_PC_RETURN(int i) {
			return getToken(gramParser.TK_PC_RETURN, i);
		}
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_SEP_SEMICOLON() { return getToken(gramParser.TK_SEP_SEMICOLON, 0); }
		public TerminalNode TK_PC_FFUNCIO() { return getToken(gramParser.TK_PC_FFUNCIO, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public VarBlockContext varBlock() {
			return getRuleContext(VarBlockContext.class,0);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public FuncImpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcImp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterFuncImp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitFuncImp(this);
		}
	}

	public final FuncImpContext funcImp() throws RecognitionException {
		FuncImpContext _localctx = new FuncImpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_funcImp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(TK_PC_FUNCIO);
			setState(240);
			match(TK_IDENTIFIER);
			setState(241);
			match(TK_OP_PAR_OPEN);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PC_PARAM_IN) | (1L << TK_PC_PARAM_IO) | (1L << TK_PC_INT) | (1L << TK_PC_REAL) | (1L << TK_PC_CHAR) | (1L << TK_PC_BOOL))) != 0) || _la==TK_IDENTIFIER) {
				{
				setState(242);
				params();
				}
			}

			setState(245);
			match(TK_OP_PAR_CLOSE);
			setState(246);
			match(TK_PC_RETURN);
			setState(247);
			basicType();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_VARIABLES) {
				{
				setState(248);
				varBlock();
				}
			}

			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_PC_WRITELN - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
				{
				{
				setState(251);
				sentence();
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
			match(TK_PC_RETURN);
			setState(258);
			expr();
			setState(259);
			match(TK_SEP_SEMICOLON);
			setState(260);
			match(TK_PC_FFUNCIO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TK_IDENTIFIER() { return getToken(gramParser.TK_IDENTIFIER, 0); }
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_type);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(TK_IDENTIFIER);
				}
				break;
			case TK_PC_INT:
			case TK_PC_REAL:
			case TK_PC_CHAR:
			case TK_PC_BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				basicType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode TK_OP_ASSIGN() { return getToken(gramParser.TK_OP_ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_SEP_SEMICOLON() { return getToken(gramParser.TK_SEP_SEMICOLON, 0); }
		public TerminalNode TK_IDENTIFIER() { return getToken(gramParser.TK_IDENTIFIER, 0); }
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(266);
				match(TK_IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(267);
				tuple();
				}
				break;
			case 3:
				{
				setState(268);
				vector();
				}
				break;
			}
			setState(271);
			match(TK_OP_ASSIGN);
			setState(272);
			expr();
			setState(273);
			match(TK_SEP_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_ruleContext extends ParserRuleContext {
		public Token s;
		public ExprContext t1;
		public TerminalNode TK_PC_LLAVORS() { return getToken(gramParser.TK_PC_LLAVORS, 0); }
		public TerminalNode TK_PC_FSI() { return getToken(gramParser.TK_PC_FSI, 0); }
		public TerminalNode TK_PC_SI() { return getToken(gramParser.TK_PC_SI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode TK_PC_ALTRAMENT() { return getToken(gramParser.TK_PC_ALTRAMENT, 0); }
		public If_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterIf_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitIf_rule(this);
		}
	}

	public final If_ruleContext if_rule() throws RecognitionException {
		If_ruleContext _localctx = new If_ruleContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_if_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			((If_ruleContext)_localctx).s = match(TK_PC_SI);
			setState(276);
			((If_ruleContext)_localctx).t1 = expr();

			              if(((If_ruleContext)_localctx).t1.tipus != 'B'){ //la condició ha de ser booleana
			                  error = true;
			                  System.out.println("Error de tipus detectat a la linia " + (((If_ruleContext)_localctx).s!=null?((If_ruleContext)_localctx).s.getLine():0) + ":la condició del if ha de ser booleana." + (((If_ruleContext)_localctx).t1!=null?_input.getText(((If_ruleContext)_localctx).t1.start,((If_ruleContext)_localctx).t1.stop):null));
			              }
			          
			setState(278);
			match(TK_PC_LLAVORS);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_PC_WRITELN - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
				{
				{
				setState(279);
				sentence();
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_ALTRAMENT) {
				{
				setState(285);
				match(TK_PC_ALTRAMENT);
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_PC_WRITELN - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
					{
					{
					setState(286);
					sentence();
					}
					}
					setState(291);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(294);
			match(TK_PC_FSI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_ruleContext extends ParserRuleContext {
		public Token s;
		public ExprContext t1;
		public ExprContext t2;
		public TerminalNode TK_IDENTIFIER() { return getToken(gramParser.TK_IDENTIFIER, 0); }
		public TerminalNode TK_PC_DE() { return getToken(gramParser.TK_PC_DE, 0); }
		public TerminalNode TK_PC_FINS() { return getToken(gramParser.TK_PC_FINS, 0); }
		public TerminalNode TK_PC_FER() { return getToken(gramParser.TK_PC_FER, 0); }
		public TerminalNode TK_PC_FPER() { return getToken(gramParser.TK_PC_FPER, 0); }
		public TerminalNode TK_PC_PER() { return getToken(gramParser.TK_PC_PER, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public For_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterFor_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitFor_rule(this);
		}
	}

	public final For_ruleContext for_rule() throws RecognitionException {
		For_ruleContext _localctx = new For_ruleContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_for_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			((For_ruleContext)_localctx).s = match(TK_PC_PER);
			setState(297);
			match(TK_IDENTIFIER);
			setState(298);
			match(TK_PC_DE);
			setState(299);
			((For_ruleContext)_localctx).t1 = expr();
			setState(300);
			match(TK_PC_FINS);
			setState(301);
			((For_ruleContext)_localctx).t2 = expr();

			         if(((For_ruleContext)_localctx).t1.tipus != 'E' || ((For_ruleContext)_localctx).t2.tipus !='E'){
			             error = true;
			             System.out.println("Error de tipus detectat a la linia " + (((For_ruleContext)_localctx).s!=null?((For_ruleContext)_localctx).s.getLine():0) + ":els valors dels intervals del for han de ser enters");
			         }
			     
			setState(303);
			match(TK_PC_FER);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_PC_WRITELN - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
				{
				{
				setState(304);
				sentence();
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310);
			match(TK_PC_FPER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_ruleContext extends ParserRuleContext {
		public Token s;
		public ExprContext t1;
		public TerminalNode TK_PC_FER() { return getToken(gramParser.TK_PC_FER, 0); }
		public TerminalNode TK_PC_FMENTRE() { return getToken(gramParser.TK_PC_FMENTRE, 0); }
		public TerminalNode TK_PC_MENTRE() { return getToken(gramParser.TK_PC_MENTRE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public While_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterWhile_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitWhile_rule(this);
		}
	}

	public final While_ruleContext while_rule() throws RecognitionException {
		While_ruleContext _localctx = new While_ruleContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_while_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			((While_ruleContext)_localctx).s = match(TK_PC_MENTRE);
			setState(313);
			((While_ruleContext)_localctx).t1 = expr();

			          if(((While_ruleContext)_localctx).t1.tipus != 'B'){ //la condició ha de ser booleana
			              error = true;
			              System.out.println("Error de tipus detectat a la linia " + (((While_ruleContext)_localctx).s!=null?((While_ruleContext)_localctx).s.getLine():0) + ":la condició del while ha de ser booleana.");
			          }
			      
			setState(315);
			match(TK_PC_FER);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_PC_WRITELN - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
				{
				{
				setState(316);
				sentence();
				}
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(322);
			match(TK_PC_FMENTRE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccioContext extends ParserRuleContext {
		public TerminalNode TK_IDENTIFIER() { return getToken(gramParser.TK_IDENTIFIER, 0); }
		public TerminalNode TK_OP_PAR_OPEN() { return getToken(gramParser.TK_OP_PAR_OPEN, 0); }
		public TerminalNode TK_OP_PAR_CLOSE() { return getToken(gramParser.TK_OP_PAR_CLOSE, 0); }
		public TerminalNode TK_SEP_SEMICOLON() { return getToken(gramParser.TK_SEP_SEMICOLON, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TK_SEP_COMMA() { return getTokens(gramParser.TK_SEP_COMMA); }
		public TerminalNode TK_SEP_COMMA(int i) {
			return getToken(gramParser.TK_SEP_COMMA, i);
		}
		public AccioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterAccio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitAccio(this);
		}
	}

	public final AccioContext accio() throws RecognitionException {
		AccioContext _localctx = new AccioContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_accio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(TK_IDENTIFIER);
			setState(325);
			match(TK_OP_PAR_OPEN);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (TK_CONST_CHAR - 40)) | (1L << (TK_CONST_REAL - 40)) | (1L << (TK_CONST_BOOL - 40)) | (1L << (TK_CONST_INT - 40)) | (1L << (TK_OP_MINUS - 40)) | (1L << (TK_OP_NEG - 40)) | (1L << (TK_OP_PAR_OPEN - 40)) | (1L << (TK_IDENTIFIER - 40)))) != 0)) {
				{
				setState(326);
				expr();
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_SEP_COMMA) {
					{
					{
					setState(327);
					match(TK_SEP_COMMA);
					setState(328);
					expr();
					}
					}
					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(336);
			match(TK_OP_PAR_CLOSE);
			setState(337);
			match(TK_SEP_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode TK_PC_READ() { return getToken(gramParser.TK_PC_READ, 0); }
		public TerminalNode TK_OP_PAR_OPEN() { return getToken(gramParser.TK_OP_PAR_OPEN, 0); }
		public TerminalNode TK_IDENTIFIER() { return getToken(gramParser.TK_IDENTIFIER, 0); }
		public TerminalNode TK_OP_PAR_CLOSE() { return getToken(gramParser.TK_OP_PAR_CLOSE, 0); }
		public TerminalNode TK_SEP_SEMICOLON() { return getToken(gramParser.TK_SEP_SEMICOLON, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(TK_PC_READ);
			setState(340);
			match(TK_OP_PAR_OPEN);
			setState(341);
			match(TK_IDENTIFIER);
			setState(342);
			match(TK_OP_PAR_CLOSE);
			setState(343);
			match(TK_SEP_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode TK_PC_WRITE() { return getToken(gramParser.TK_PC_WRITE, 0); }
		public TerminalNode TK_OP_PAR_OPEN() { return getToken(gramParser.TK_OP_PAR_OPEN, 0); }
		public TerminalNode TK_OP_PAR_CLOSE() { return getToken(gramParser.TK_OP_PAR_CLOSE, 0); }
		public TerminalNode TK_SEP_SEMICOLON() { return getToken(gramParser.TK_SEP_SEMICOLON, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TK_STRING_LITERAL() { return getTokens(gramParser.TK_STRING_LITERAL); }
		public TerminalNode TK_STRING_LITERAL(int i) {
			return getToken(gramParser.TK_STRING_LITERAL, i);
		}
		public List<TerminalNode> TK_SEP_COMMA() { return getTokens(gramParser.TK_SEP_COMMA); }
		public TerminalNode TK_SEP_COMMA(int i) {
			return getToken(gramParser.TK_SEP_COMMA, i);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitWrite(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(TK_PC_WRITE);
			setState(346);
			match(TK_OP_PAR_OPEN);
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_CONST_CHAR:
			case TK_CONST_REAL:
			case TK_CONST_BOOL:
			case TK_CONST_INT:
			case TK_OP_MINUS:
			case TK_OP_NEG:
			case TK_OP_PAR_OPEN:
			case TK_IDENTIFIER:
				{
				setState(347);
				expr();
				}
				break;
			case TK_STRING_LITERAL:
				{
				setState(348);
				match(TK_STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_SEP_COMMA) {
				{
				{
				setState(351);
				match(TK_SEP_COMMA);
				setState(354);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_CONST_CHAR:
				case TK_CONST_REAL:
				case TK_CONST_BOOL:
				case TK_CONST_INT:
				case TK_OP_MINUS:
				case TK_OP_NEG:
				case TK_OP_PAR_OPEN:
				case TK_IDENTIFIER:
					{
					setState(352);
					expr();
					}
					break;
				case TK_STRING_LITERAL:
					{
					setState(353);
					match(TK_STRING_LITERAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(361);
			match(TK_OP_PAR_CLOSE);
			setState(362);
			match(TK_SEP_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WritelnContext extends ParserRuleContext {
		public TerminalNode TK_PC_WRITELN() { return getToken(gramParser.TK_PC_WRITELN, 0); }
		public TerminalNode TK_OP_PAR_OPEN() { return getToken(gramParser.TK_OP_PAR_OPEN, 0); }
		public TerminalNode TK_OP_PAR_CLOSE() { return getToken(gramParser.TK_OP_PAR_CLOSE, 0); }
		public TerminalNode TK_SEP_SEMICOLON() { return getToken(gramParser.TK_SEP_SEMICOLON, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TK_STRING_LITERAL() { return getTokens(gramParser.TK_STRING_LITERAL); }
		public TerminalNode TK_STRING_LITERAL(int i) {
			return getToken(gramParser.TK_STRING_LITERAL, i);
		}
		public List<TerminalNode> TK_SEP_COMMA() { return getTokens(gramParser.TK_SEP_COMMA); }
		public TerminalNode TK_SEP_COMMA(int i) {
			return getToken(gramParser.TK_SEP_COMMA, i);
		}
		public WritelnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeln; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterWriteln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitWriteln(this);
		}
	}

	public final WritelnContext writeln() throws RecognitionException {
		WritelnContext _localctx = new WritelnContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_writeln);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(TK_PC_WRITELN);
			setState(365);
			match(TK_OP_PAR_OPEN);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (TK_CONST_CHAR - 40)) | (1L << (TK_CONST_REAL - 40)) | (1L << (TK_CONST_BOOL - 40)) | (1L << (TK_CONST_INT - 40)) | (1L << (TK_OP_MINUS - 40)) | (1L << (TK_OP_NEG - 40)) | (1L << (TK_OP_PAR_OPEN - 40)) | (1L << (TK_STRING_LITERAL - 40)) | (1L << (TK_IDENTIFIER - 40)))) != 0)) {
				{
				setState(368);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_CONST_CHAR:
				case TK_CONST_REAL:
				case TK_CONST_BOOL:
				case TK_CONST_INT:
				case TK_OP_MINUS:
				case TK_OP_NEG:
				case TK_OP_PAR_OPEN:
				case TK_IDENTIFIER:
					{
					setState(366);
					expr();
					}
					break;
				case TK_STRING_LITERAL:
					{
					setState(367);
					match(TK_STRING_LITERAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_SEP_COMMA) {
					{
					{
					setState(370);
					match(TK_SEP_COMMA);
					setState(373);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TK_CONST_CHAR:
					case TK_CONST_REAL:
					case TK_CONST_BOOL:
					case TK_CONST_INT:
					case TK_OP_MINUS:
					case TK_OP_NEG:
					case TK_OP_PAR_OPEN:
					case TK_IDENTIFIER:
						{
						setState(371);
						expr();
						}
						break;
					case TK_STRING_LITERAL:
						{
						setState(372);
						match(TK_STRING_LITERAL);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(379);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(382);
			match(TK_OP_PAR_CLOSE);
			setState(383);
			match(TK_SEP_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenceContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public If_ruleContext if_rule() {
			return getRuleContext(If_ruleContext.class,0);
		}
		public For_ruleContext for_rule() {
			return getRuleContext(For_ruleContext.class,0);
		}
		public While_ruleContext while_rule() {
			return getRuleContext(While_ruleContext.class,0);
		}
		public AccioContext accio() {
			return getRuleContext(AccioContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public WritelnContext writeln() {
			return getRuleContext(WritelnContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(385);
				assign();
				}
				break;
			case 2:
				{
				setState(386);
				if_rule();
				}
				break;
			case 3:
				{
				setState(387);
				for_rule();
				}
				break;
			case 4:
				{
				setState(388);
				while_rule();
				}
				break;
			case 5:
				{
				setState(389);
				accio();
				}
				break;
			case 6:
				{
				setState(390);
				read();
				}
				break;
			case 7:
				{
				setState(391);
				write();
				}
				break;
			case 8:
				{
				setState(392);
				writeln();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstValueContext extends ParserRuleContext {
		public char tipus;
		public Token a;
		public Token b;
		public Token c;
		public Token d;
		public TerminalNode TK_CONST_INT() { return getToken(gramParser.TK_CONST_INT, 0); }
		public TerminalNode TK_CONST_REAL() { return getToken(gramParser.TK_CONST_REAL, 0); }
		public TerminalNode TK_CONST_CHAR() { return getToken(gramParser.TK_CONST_CHAR, 0); }
		public TerminalNode TK_CONST_BOOL() { return getToken(gramParser.TK_CONST_BOOL, 0); }
		public ConstValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterConstValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitConstValue(this);
		}
	}

	public final ConstValueContext constValue() throws RecognitionException {
		ConstValueContext _localctx = new ConstValueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_constValue);
		try {
			setState(403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_CONST_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				((ConstValueContext)_localctx).a = match(TK_CONST_INT);
				((ConstValueContext)_localctx).tipus =  'E';
				}
				break;
			case TK_CONST_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				((ConstValueContext)_localctx).b = match(TK_CONST_REAL);
				((ConstValueContext)_localctx).tipus =  'R';
				}
				break;
			case TK_CONST_CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(399);
				((ConstValueContext)_localctx).c = match(TK_CONST_CHAR);
				((ConstValueContext)_localctx).tipus =  'C';
				}
				break;
			case TK_CONST_BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(401);
				((ConstValueContext)_localctx).d = match(TK_CONST_BOOL);
				((ConstValueContext)_localctx).tipus =  'B';
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleContext extends ParserRuleContext {
		public List<TerminalNode> TK_IDENTIFIER() { return getTokens(gramParser.TK_IDENTIFIER); }
		public TerminalNode TK_IDENTIFIER(int i) {
			return getToken(gramParser.TK_IDENTIFIER, i);
		}
		public TerminalNode TK_OP_TUPLE() { return getToken(gramParser.TK_OP_TUPLE, 0); }
		public TupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitTuple(this);
		}
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(TK_IDENTIFIER);
			setState(406);
			match(TK_OP_TUPLE);
			setState(407);
			match(TK_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VectorContext extends ParserRuleContext {
		public Token s;
		public ExprContext t1;
		public TerminalNode TK_OP_VECTOR_OPEN() { return getToken(gramParser.TK_OP_VECTOR_OPEN, 0); }
		public TerminalNode TK_OP_VECTOR_CLOSE() { return getToken(gramParser.TK_OP_VECTOR_CLOSE, 0); }
		public TerminalNode TK_IDENTIFIER() { return getToken(gramParser.TK_IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitVector(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_vector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			((VectorContext)_localctx).s = match(TK_IDENTIFIER);
			setState(410);
			match(TK_OP_VECTOR_OPEN);
			setState(411);
			((VectorContext)_localctx).t1 = expr();

			         if(((VectorContext)_localctx).t1.tipus != 'E'){
			             error = true;
			             System.out.println("Error de tipus detectat a la linia " + (((VectorContext)_localctx).s!=null?((VectorContext)_localctx).s.getLine():0) + ": els indexs de vectors han de ser enters.");
			         }
			     
			setState(413);
			match(TK_OP_VECTOR_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncContext extends ParserRuleContext {
		public TerminalNode TK_IDENTIFIER() { return getToken(gramParser.TK_IDENTIFIER, 0); }
		public TerminalNode TK_OP_PAR_OPEN() { return getToken(gramParser.TK_OP_PAR_OPEN, 0); }
		public TerminalNode TK_OP_PAR_CLOSE() { return getToken(gramParser.TK_OP_PAR_CLOSE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TK_SEP_COMMA() { return getTokens(gramParser.TK_SEP_COMMA); }
		public TerminalNode TK_SEP_COMMA(int i) {
			return getToken(gramParser.TK_SEP_COMMA, i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(TK_IDENTIFIER);
			setState(416);
			match(TK_OP_PAR_OPEN);
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (TK_CONST_CHAR - 40)) | (1L << (TK_CONST_REAL - 40)) | (1L << (TK_CONST_BOOL - 40)) | (1L << (TK_CONST_INT - 40)) | (1L << (TK_OP_MINUS - 40)) | (1L << (TK_OP_NEG - 40)) | (1L << (TK_OP_PAR_OPEN - 40)) | (1L << (TK_IDENTIFIER - 40)))) != 0)) {
				{
				setState(417);
				expr();
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_SEP_COMMA) {
					{
					{
					setState(418);
					match(TK_SEP_COMMA);
					setState(419);
					expr();
					}
					}
					setState(424);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(427);
			match(TK_OP_PAR_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public char tipus;
		public LogicsDownContext boolea;
		public Token s;
		public LogicsDownContext t1;
		public LogicsDownContext t2;
		public List<LogicsDownContext> logicsDown() {
			return getRuleContexts(LogicsDownContext.class);
		}
		public LogicsDownContext logicsDown(int i) {
			return getRuleContext(LogicsDownContext.class,i);
		}
		public List<TerminalNode> TK_OP_QUESTION_MARK() { return getTokens(gramParser.TK_OP_QUESTION_MARK); }
		public TerminalNode TK_OP_QUESTION_MARK(int i) {
			return getToken(gramParser.TK_OP_QUESTION_MARK, i);
		}
		public List<TerminalNode> TK_OP_COLON() { return getTokens(gramParser.TK_OP_COLON); }
		public TerminalNode TK_OP_COLON(int i) {
			return getToken(gramParser.TK_OP_COLON, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expr);
		int _la;
		try {
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(429);
				((ExprContext)_localctx).boolea = logicsDown();
				setState(437); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(430);
					((ExprContext)_localctx).s = match(TK_OP_QUESTION_MARK);
					setState(431);
					((ExprContext)_localctx).t1 = logicsDown();

					            ((ExprContext)_localctx).tipus =  ((ExprContext)_localctx).t1.tipus;
					            if(((ExprContext)_localctx).boolea.tipus != 'B'){ //la condició ha de ser booleana
					                error = true;
					                System.out.println("Error de tipus detectat a la linia " + (((ExprContext)_localctx).s!=null?((ExprContext)_localctx).s.getLine():0) + ": La condició d'un ternari ha de ser booleana");
					            }
					        
					setState(433);
					((ExprContext)_localctx).s = match(TK_OP_COLON);
					setState(434);
					((ExprContext)_localctx).t2 = logicsDown();

					                if(((ExprContext)_localctx).t1.tipus != ((ExprContext)_localctx).t2.tipus && !((((ExprContext)_localctx).t1.tipus == 'E' && ((ExprContext)_localctx).t2.tipus == 'R')||(((ExprContext)_localctx).t1.tipus == 'R' && ((ExprContext)_localctx).t2.tipus == 'E'))){
					                //cast de real a enter
					                    error = true;
					                    System.out.println("Error de tipus detectat a la linia " + (((ExprContext)_localctx).s!=null?((ExprContext)_localctx).s.getLine():0) + ": Els tipus del ternari no casen");
					                }
					            
					}
					}
					setState(439); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TK_OP_QUESTION_MARK );
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				((ExprContext)_localctx).t1 = logicsDown();
				((ExprContext)_localctx).tipus =  ((ExprContext)_localctx).t1.tipus;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicsDownContext extends ParserRuleContext {
		public char tipus;
		public LogicUpContext t1;
		public Token s;
		public LogicUpContext t2;
		public LogicUpContext t;
		public List<LogicUpContext> logicUp() {
			return getRuleContexts(LogicUpContext.class);
		}
		public LogicUpContext logicUp(int i) {
			return getRuleContext(LogicUpContext.class,i);
		}
		public List<TerminalNode> TK_OP_AND() { return getTokens(gramParser.TK_OP_AND); }
		public TerminalNode TK_OP_AND(int i) {
			return getToken(gramParser.TK_OP_AND, i);
		}
		public List<TerminalNode> TK_OP_OR() { return getTokens(gramParser.TK_OP_OR); }
		public TerminalNode TK_OP_OR(int i) {
			return getToken(gramParser.TK_OP_OR, i);
		}
		public LogicsDownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicsDown; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterLogicsDown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitLogicsDown(this);
		}
	}

	public final LogicsDownContext logicsDown() throws RecognitionException {
		LogicsDownContext _localctx = new LogicsDownContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_logicsDown);
		int _la;
		try {
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(446);
				((LogicsDownContext)_localctx).t1 = logicUp();
				((LogicsDownContext)_localctx).tipus =  'B';
				setState(452); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(448);
					((LogicsDownContext)_localctx).s = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==TK_OP_AND || _la==TK_OP_OR) ) {
						((LogicsDownContext)_localctx).s = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(449);
					((LogicsDownContext)_localctx).t2 = logicUp();

					                 if(((LogicsDownContext)_localctx).t1.tipus != 'B' && ((LogicsDownContext)_localctx).t2.tipus != 'B'){
					                 //cast de real a enter
					                     error = true;
					                     System.out.println("Error de tipus detectat a la linia " + (((LogicsDownContext)_localctx).s!=null?((LogicsDownContext)_localctx).s.getLine():0) + ": Els tipus de operació lògica no casen");
					                 }
					             
					}
					}
					setState(454); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TK_OP_AND || _la==TK_OP_OR );
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(456);
				((LogicsDownContext)_localctx).t = logicUp();
				((LogicsDownContext)_localctx).tipus =  ((LogicsDownContext)_localctx).t.tipus;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicUpContext extends ParserRuleContext {
		public char tipus;
		public SumContext t1;
		public Token s;
		public SumContext t2;
		public SumContext t;
		public List<SumContext> sum() {
			return getRuleContexts(SumContext.class);
		}
		public SumContext sum(int i) {
			return getRuleContext(SumContext.class,i);
		}
		public List<TerminalNode> TK_OP_EQ() { return getTokens(gramParser.TK_OP_EQ); }
		public TerminalNode TK_OP_EQ(int i) {
			return getToken(gramParser.TK_OP_EQ, i);
		}
		public List<TerminalNode> TK_OP_DIFF() { return getTokens(gramParser.TK_OP_DIFF); }
		public TerminalNode TK_OP_DIFF(int i) {
			return getToken(gramParser.TK_OP_DIFF, i);
		}
		public List<TerminalNode> TK_OP_GT() { return getTokens(gramParser.TK_OP_GT); }
		public TerminalNode TK_OP_GT(int i) {
			return getToken(gramParser.TK_OP_GT, i);
		}
		public List<TerminalNode> TK_OP_LT() { return getTokens(gramParser.TK_OP_LT); }
		public TerminalNode TK_OP_LT(int i) {
			return getToken(gramParser.TK_OP_LT, i);
		}
		public List<TerminalNode> TK_OP_LOET() { return getTokens(gramParser.TK_OP_LOET); }
		public TerminalNode TK_OP_LOET(int i) {
			return getToken(gramParser.TK_OP_LOET, i);
		}
		public List<TerminalNode> TK_OP_GOET() { return getTokens(gramParser.TK_OP_GOET); }
		public TerminalNode TK_OP_GOET(int i) {
			return getToken(gramParser.TK_OP_GOET, i);
		}
		public LogicUpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicUp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterLogicUp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitLogicUp(this);
		}
	}

	public final LogicUpContext logicUp() throws RecognitionException {
		LogicUpContext _localctx = new LogicUpContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_logicUp);
		int _la;
		try {
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(461);
				((LogicUpContext)_localctx).t1 = sum();
				((LogicUpContext)_localctx).tipus =  'B';
				setState(467); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(463);
					((LogicUpContext)_localctx).s = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_OP_EQ) | (1L << TK_OP_DIFF) | (1L << TK_OP_GT) | (1L << TK_OP_LT) | (1L << TK_OP_LOET) | (1L << TK_OP_GOET))) != 0)) ) {
						((LogicUpContext)_localctx).s = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(464);
					((LogicUpContext)_localctx).t2 = sum();

					              if((((LogicUpContext)_localctx).s!=null?((LogicUpContext)_localctx).s.getText():null).equals("==") || (((LogicUpContext)_localctx).s!=null?((LogicUpContext)_localctx).s.getText():null).equals("!=")) {
					                if((((LogicUpContext)_localctx).t1.tipus != ((LogicUpContext)_localctx).t2.tipus) && !((((LogicUpContext)_localctx).t1.tipus == 'E' && ((LogicUpContext)_localctx).t2.tipus == 'R')||(((LogicUpContext)_localctx).t1.tipus == 'R' && ((LogicUpContext)_localctx).t2.tipus == 'E'))){
					                    error = true;
					                    System.out.println("Error de tipus detectat a la linia " + (((LogicUpContext)_localctx).s!=null?((LogicUpContext)_localctx).s.getLine():0) +": El tipus del comparador lògic no casen");
					                }
					              } else if((((LogicUpContext)_localctx).t1.tipus != 'E' || ((LogicUpContext)_localctx).t1.tipus != 'R') && (((LogicUpContext)_localctx).t2.tipus != 'E' || ((LogicUpContext)_localctx).t2.tipus != 'R')){
					                //nomes es pot usar en reals i enters, aixi que si son diferents ferem casting a real.
					                    error = true;
					                    System.out.println("Error de tipus detectat a la linia " + (((LogicUpContext)_localctx).s!=null?((LogicUpContext)_localctx).s.getLine():0) + ": El tipus del comparador lògic no casen");
					              }
					          
					}
					}
					setState(469); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_OP_EQ) | (1L << TK_OP_DIFF) | (1L << TK_OP_GT) | (1L << TK_OP_LT) | (1L << TK_OP_LOET) | (1L << TK_OP_GOET))) != 0) );
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				((LogicUpContext)_localctx).t = sum();
				((LogicUpContext)_localctx).tipus =  ((LogicUpContext)_localctx).t.tipus;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SumContext extends ParserRuleContext {
		public char tipus;
		public MultContext t1;
		public Token s;
		public MultContext t2;
		public MultContext t;
		public List<MultContext> mult() {
			return getRuleContexts(MultContext.class);
		}
		public MultContext mult(int i) {
			return getRuleContext(MultContext.class,i);
		}
		public List<TerminalNode> TK_OP_SUMA() { return getTokens(gramParser.TK_OP_SUMA); }
		public TerminalNode TK_OP_SUMA(int i) {
			return getToken(gramParser.TK_OP_SUMA, i);
		}
		public List<TerminalNode> TK_OP_RESTA() { return getTokens(gramParser.TK_OP_RESTA); }
		public TerminalNode TK_OP_RESTA(int i) {
			return getToken(gramParser.TK_OP_RESTA, i);
		}
		public SumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitSum(this);
		}
	}

	public final SumContext sum() throws RecognitionException {
		SumContext _localctx = new SumContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_sum);
		int _la;
		try {
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(476);
				((SumContext)_localctx).t1 = mult();
				setState(481); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(477);
					((SumContext)_localctx).s = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==TK_OP_SUMA || _la==TK_OP_RESTA) ) {
						((SumContext)_localctx).s = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(478);
					((SumContext)_localctx).t2 = mult();

					          if((((SumContext)_localctx).t1.tipus == 'E' || ((SumContext)_localctx).t1.tipus == 'R') && (((SumContext)_localctx).t2.tipus == 'R' || ((SumContext)_localctx).t2.tipus == 'E')){
					              ((SumContext)_localctx).tipus =  'R';
					          } else if(((SumContext)_localctx).t1.tipus == ((SumContext)_localctx).t2.tipus && (((SumContext)_localctx).t1.tipus == 'E' || ((SumContext)_localctx).t1.tipus == 'R')){
					              ((SumContext)_localctx).tipus =  ((SumContext)_localctx).t1.tipus;
					          } else{
					              error = true;
					              System.out.println("Error de tipus detectat a la linia " + (((SumContext)_localctx).s!=null?((SumContext)_localctx).s.getLine():0) + ": El tipus de la suma/resta no casen");
					          }
					    
					}
					}
					setState(483); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TK_OP_SUMA || _la==TK_OP_RESTA );
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				((SumContext)_localctx).t = mult();
				((SumContext)_localctx).tipus =  ((SumContext)_localctx).t.tipus;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultContext extends ParserRuleContext {
		public char tipus;
		public NegContext t1;
		public Token s;
		public NegContext t2;
		public NegContext t;
		public List<NegContext> neg() {
			return getRuleContexts(NegContext.class);
		}
		public NegContext neg(int i) {
			return getRuleContext(NegContext.class,i);
		}
		public List<TerminalNode> TK_OP_MULT() { return getTokens(gramParser.TK_OP_MULT); }
		public TerminalNode TK_OP_MULT(int i) {
			return getToken(gramParser.TK_OP_MULT, i);
		}
		public List<TerminalNode> TK_OP_REALDIV() { return getTokens(gramParser.TK_OP_REALDIV); }
		public TerminalNode TK_OP_REALDIV(int i) {
			return getToken(gramParser.TK_OP_REALDIV, i);
		}
		public List<TerminalNode> TK_OP_INTDIV() { return getTokens(gramParser.TK_OP_INTDIV); }
		public TerminalNode TK_OP_INTDIV(int i) {
			return getToken(gramParser.TK_OP_INTDIV, i);
		}
		public List<TerminalNode> TK_OP_MOD() { return getTokens(gramParser.TK_OP_MOD); }
		public TerminalNode TK_OP_MOD(int i) {
			return getToken(gramParser.TK_OP_MOD, i);
		}
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitMult(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_mult);
		int _la;
		try {
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(490);
				((MultContext)_localctx).t1 = neg();
				setState(495); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(491);
					((MultContext)_localctx).s = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_OP_MULT) | (1L << TK_OP_REALDIV) | (1L << TK_OP_INTDIV) | (1L << TK_OP_MOD))) != 0)) ) {
						((MultContext)_localctx).s = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(492);
					((MultContext)_localctx).t2 = neg();

					          if(((((MultContext)_localctx).s!=null?((MultContext)_localctx).s.getText():null).equals("%") || (((MultContext)_localctx).s!=null?((MultContext)_localctx).s.getText():null).equals("\\")) && (((MultContext)_localctx).t1.tipus == 'E' && ((MultContext)_localctx).t2.tipus == 'E')) {
					                ((MultContext)_localctx).tipus =  'E';
					          } else if ((((MultContext)_localctx).s!=null?((MultContext)_localctx).s.getText():null).equals("/") && (((MultContext)_localctx).t1.tipus == 'E' || ((MultContext)_localctx).t1.tipus == 'E') && (((MultContext)_localctx).t1.tipus == 'E' || ((MultContext)_localctx).t1.tipus == 'E')) {
					                ((MultContext)_localctx).tipus =  'R';
					          } else if ((((MultContext)_localctx).s!=null?((MultContext)_localctx).s.getText():null).equals("*") && (((MultContext)_localctx).t1.tipus == 'E' || ((MultContext)_localctx).t1.tipus == 'E') && (((MultContext)_localctx).t1.tipus == 'E' || ((MultContext)_localctx).t1.tipus == 'E')) {
					                ((MultContext)_localctx).tipus =  'R';
					          } else if ((((MultContext)_localctx).s!=null?((MultContext)_localctx).s.getText():null).equals("*") && ((MultContext)_localctx).t1.tipus == ((MultContext)_localctx).t2.tipus && (((MultContext)_localctx).t1.tipus == 'E' || ((MultContext)_localctx).t2.tipus == 'R')) {
					                ((MultContext)_localctx).tipus =  ((MultContext)_localctx).t1.tipus;
					          } else {
					                error = true;
					                System.out.println("Error de tipus detectat a la linia " + (((MultContext)_localctx).s!=null?((MultContext)_localctx).s.getLine():0) + ": El tipus de " + (((MultContext)_localctx).s!=null?((MultContext)_localctx).s.getText():null) +" no casen");
					          }
					      
					}
					}
					setState(497); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_OP_MULT) | (1L << TK_OP_REALDIV) | (1L << TK_OP_INTDIV) | (1L << TK_OP_MOD))) != 0) );
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(499);
				((MultContext)_localctx).t = neg();
				((MultContext)_localctx).tipus =  ((MultContext)_localctx).t.tipus;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NegContext extends ParserRuleContext {
		public char tipus;
		public Token s;
		public ValueContext t;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode TK_OP_NEG() { return getToken(gramParser.TK_OP_NEG, 0); }
		public TerminalNode TK_OP_MINUS() { return getToken(gramParser.TK_OP_MINUS, 0); }
		public NegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitNeg(this);
		}
	}

	public final NegContext neg() throws RecognitionException {
		NegContext _localctx = new NegContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_neg);
		int _la;
		try {
			setState(511);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_OP_MINUS:
			case TK_OP_NEG:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(504);
				((NegContext)_localctx).s = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TK_OP_MINUS || _la==TK_OP_NEG) ) {
					((NegContext)_localctx).s = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(505);
				((NegContext)_localctx).t = value();

				        ((NegContext)_localctx).tipus =  ((NegContext)_localctx).t.tipus;
				        if(((((NegContext)_localctx).s!=null?((NegContext)_localctx).s.getText():null).equals("~") && (((NegContext)_localctx).t.tipus != 'E' || ((NegContext)_localctx).t.tipus != 'R' )) || ((((NegContext)_localctx).s!=null?((NegContext)_localctx).s.getText():null).equals("no") && ((NegContext)_localctx).t.tipus != 'B')){
				              error = true;
				              System.out.println("Error de tipus detectat a la linia " + (((NegContext)_localctx).s!=null?((NegContext)_localctx).s.getLine():0) + ": El tipus del unari és incorrecte");
				        }
				    
				}
				}
				break;
			case TK_CONST_CHAR:
			case TK_CONST_REAL:
			case TK_CONST_BOOL:
			case TK_CONST_INT:
			case TK_OP_PAR_OPEN:
			case TK_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				((NegContext)_localctx).t = value();
				((NegContext)_localctx).tipus = ((NegContext)_localctx).t.tipus;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public char tipus;
		public ConstValueContext t1;
		public ParenthesisContext t;
		public ConstValueContext constValue() {
			return getRuleContext(ConstValueContext.class,0);
		}
		public TerminalNode TK_IDENTIFIER() { return getToken(gramParser.TK_IDENTIFIER, 0); }
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public ParenthesisContext parenthesis() {
			return getRuleContext(ParenthesisContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_value);
		try {
			setState(523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				((ValueContext)_localctx).t1 = constValue();
				((ValueContext)_localctx).tipus =  ((ValueContext)_localctx).t1.tipus;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				match(TK_IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(517);
				tuple();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(518);
				vector();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(519);
				func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(520);
				((ValueContext)_localctx).t = parenthesis();
				((ValueContext)_localctx).tipus =  ((ValueContext)_localctx).t.tipus;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParenthesisContext extends ParserRuleContext {
		public char tipus;
		public ExprContext t;
		public TerminalNode TK_OP_PAR_OPEN() { return getToken(gramParser.TK_OP_PAR_OPEN, 0); }
		public TerminalNode TK_OP_PAR_CLOSE() { return getToken(gramParser.TK_OP_PAR_CLOSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitParenthesis(this);
		}
	}

	public final ParenthesisContext parenthesis() throws RecognitionException {
		ParenthesisContext _localctx = new ParenthesisContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_parenthesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(TK_OP_PAR_OPEN);
			setState(526);
			((ParenthesisContext)_localctx).t = expr();

			    ((ParenthesisContext)_localctx).tipus =  ((ParenthesisContext)_localctx).t.tipus;

			setState(528);
			match(TK_OP_PAR_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3K\u0215\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\5\2P\n\2\3\2\5\2S\n\2"+
		"\3\2\5\2V\n\2\3\2\3\2\5\2Z\n\2\3\3\3\3\3\3\5\3_\n\3\3\3\7\3b\n\3\f\3\16"+
		"\3e\13\3\3\3\3\3\3\4\3\4\7\4k\n\4\f\4\16\4n\13\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\5\5w\n\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0083\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\6\b\u008a\n\b\r\b\16\b\u008b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u0096\n\t\3\t\3\t\7\t\u009a\n\t\f\t\16\t\u009d\13\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u00a6\n\n\f\n\16\n\u00a9\13\n\3\n\3\n\3"+
		"\13\3\13\7\13\u00af\n\13\f\13\16\13\u00b2\13\13\3\f\3\f\3\f\3\f\5\f\u00b8"+
		"\n\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00c1\n\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\5\16\u00c9\n\16\3\16\3\16\3\16\3\16\5\16\u00cf\n\16\3\16\3\16\3\16\7"+
		"\16\u00d4\n\16\f\16\16\16\u00d7\13\16\3\17\3\17\7\17\u00db\n\17\f\17\16"+
		"\17\u00de\13\17\3\20\3\20\3\20\3\20\5\20\u00e4\n\20\3\20\3\20\5\20\u00e8"+
		"\n\20\3\20\7\20\u00eb\n\20\f\20\16\20\u00ee\13\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\5\21\u00f6\n\21\3\21\3\21\3\21\3\21\5\21\u00fc\n\21\3\21\7"+
		"\21\u00ff\n\21\f\21\16\21\u0102\13\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\5\22\u010b\n\22\3\23\3\23\3\23\5\23\u0110\n\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\7\24\u011b\n\24\f\24\16\24\u011e\13\24\3\24"+
		"\3\24\7\24\u0122\n\24\f\24\16\24\u0125\13\24\5\24\u0127\n\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0134\n\25\f\25\16"+
		"\25\u0137\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\7\26\u0140\n\26\f\26"+
		"\16\26\u0143\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\7\27\u014c\n\27"+
		"\f\27\16\27\u014f\13\27\5\27\u0151\n\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u0160\n\31\3\31\3\31\3\31\5\31"+
		"\u0165\n\31\7\31\u0167\n\31\f\31\16\31\u016a\13\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\5\32\u0173\n\32\3\32\3\32\3\32\5\32\u0178\n\32\7\32\u017a"+
		"\n\32\f\32\16\32\u017d\13\32\5\32\u017f\n\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u018c\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u0196\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\7\37\u01a7\n\37\f\37\16\37\u01aa\13"+
		"\37\5\37\u01ac\n\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \6 \u01b8\n \r \16"+
		" \u01b9\3 \3 \3 \5 \u01bf\n \3!\3!\3!\3!\3!\3!\6!\u01c7\n!\r!\16!\u01c8"+
		"\3!\3!\3!\5!\u01ce\n!\3\"\3\"\3\"\3\"\3\"\3\"\6\"\u01d6\n\"\r\"\16\"\u01d7"+
		"\3\"\3\"\3\"\5\"\u01dd\n\"\3#\3#\3#\3#\3#\6#\u01e4\n#\r#\16#\u01e5\3#"+
		"\3#\3#\5#\u01eb\n#\3$\3$\3$\3$\3$\6$\u01f2\n$\r$\16$\u01f3\3$\3$\3$\5"+
		"$\u01f9\n$\3%\3%\3%\3%\3%\3%\3%\5%\u0202\n%\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\5&\u020e\n&\3\'\3\'\3\'\3\'\3\'\3\'\2\2(\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\t\3\2#&\3\2\13\f\3\2"+
		"<=\3\2\65:\3\2./\3\2\60\63\4\2\64\64;;\2\u0238\2O\3\2\2\2\4[\3\2\2\2\6"+
		"h\3\2\2\2\bq\3\2\2\2\nz\3\2\2\2\f|\3\2\2\2\16\u0084\3\2\2\2\20\u008f\3"+
		"\2\2\2\22\u00a0\3\2\2\2\24\u00b0\3\2\2\2\26\u00b3\3\2\2\2\30\u00bc\3\2"+
		"\2\2\32\u00c8\3\2\2\2\34\u00dc\3\2\2\2\36\u00df\3\2\2\2 \u00f1\3\2\2\2"+
		"\"\u010a\3\2\2\2$\u010f\3\2\2\2&\u0115\3\2\2\2(\u012a\3\2\2\2*\u013a\3"+
		"\2\2\2,\u0146\3\2\2\2.\u0155\3\2\2\2\60\u015b\3\2\2\2\62\u016e\3\2\2\2"+
		"\64\u018b\3\2\2\2\66\u0195\3\2\2\28\u0197\3\2\2\2:\u019b\3\2\2\2<\u01a1"+
		"\3\2\2\2>\u01be\3\2\2\2@\u01cd\3\2\2\2B\u01dc\3\2\2\2D\u01ea\3\2\2\2F"+
		"\u01f8\3\2\2\2H\u0201\3\2\2\2J\u020d\3\2\2\2L\u020f\3\2\2\2NP\5\6\4\2"+
		"ON\3\2\2\2OP\3\2\2\2PR\3\2\2\2QS\5\24\13\2RQ\3\2\2\2RS\3\2\2\2SU\3\2\2"+
		"\2TV\5\20\t\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WY\5\4\3\2XZ\5\34\17\2YX\3"+
		"\2\2\2YZ\3\2\2\2Z\3\3\2\2\2[\\\7\4\2\2\\^\7K\2\2]_\5\22\n\2^]\3\2\2\2"+
		"^_\3\2\2\2_c\3\2\2\2`b\5\64\33\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2"+
		"\2df\3\2\2\2ec\3\2\2\2fg\7\5\2\2g\5\3\2\2\2hl\7\21\2\2ik\5\b\5\2ji\3\2"+
		"\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7\22\2\2p\7\3"+
		"\2\2\2qr\7K\2\2rv\7?\2\2sw\5\n\6\2tw\5\f\7\2uw\5\16\b\2vs\3\2\2\2vt\3"+
		"\2\2\2vu\3\2\2\2wx\3\2\2\2xy\7I\2\2y\t\3\2\2\2z{\t\2\2\2{\13\3\2\2\2|"+
		"}\7\25\2\2}~\5\n\6\2~\177\7\26\2\2\177\u0082\7-\2\2\u0080\u0081\7\27\2"+
		"\2\u0081\u0083\7-\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\r"+
		"\3\2\2\2\u0084\u0089\7\23\2\2\u0085\u0086\5\n\6\2\u0086\u0087\7K\2\2\u0087"+
		"\u0088\7I\2\2\u0088\u008a\3\2\2\2\u0089\u0085\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\7\24\2\2\u008e\17\3\2\2\2\u008f\u009b\7\r\2\2\u0090\u0091\5\n\6"+
		"\2\u0091\u0092\7K\2\2\u0092\u0095\7C\2\2\u0093\u0096\5\66\34\2\u0094\u0096"+
		"\7J\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0098\7I\2\2\u0098\u009a\3\2\2\2\u0099\u0090\3\2\2\2\u009a\u009d\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009e\u009f\7\16\2\2\u009f\21\3\2\2\2\u00a0\u00a7\7\17"+
		"\2\2\u00a1\u00a2\5\"\22\2\u00a2\u00a3\7K\2\2\u00a3\u00a4\7I\2\2\u00a4"+
		"\u00a6\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00ab\7\20\2\2\u00ab\23\3\2\2\2\u00ac\u00af\5\26\f\2\u00ad\u00af\5\30"+
		"\r\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\25\3\2\2\2\u00b2\u00b0\3\2\2"+
		"\2\u00b3\u00b4\7\6\2\2\u00b4\u00b5\7K\2\2\u00b5\u00b7\7D\2\2\u00b6\u00b8"+
		"\5\32\16\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2"+
		"\u00b9\u00ba\7E\2\2\u00ba\u00bb\7I\2\2\u00bb\27\3\2\2\2\u00bc\u00bd\7"+
		"\b\2\2\u00bd\u00be\7K\2\2\u00be\u00c0\7D\2\2\u00bf\u00c1\5\32\16\2\u00c0"+
		"\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7E"+
		"\2\2\u00c3\u00c4\7\n\2\2\u00c4\u00c5\5\n\6\2\u00c5\u00c6\7I\2\2\u00c6"+
		"\31\3\2\2\2\u00c7\u00c9\t\3\2\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2"+
		"\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\5\"\22\2\u00cb\u00d5\7K\2\2\u00cc\u00ce"+
		"\7H\2\2\u00cd\u00cf\t\3\2\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d1\5\"\22\2\u00d1\u00d2\7K\2\2\u00d2\u00d4\3\2"+
		"\2\2\u00d3\u00cc\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\33\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00db\5\36\20"+
		"\2\u00d9\u00db\5 \21\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00de"+
		"\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\35\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00df\u00e0\7\6\2\2\u00e0\u00e1\7K\2\2\u00e1\u00e3\7D\2"+
		"\2\u00e2\u00e4\5\32\16\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e7\7E\2\2\u00e6\u00e8\5\22\n\2\u00e7\u00e6\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ec\3\2\2\2\u00e9\u00eb\5\64\33\2\u00ea"+
		"\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7\7\2\2\u00f0"+
		"\37\3\2\2\2\u00f1\u00f2\7\b\2\2\u00f2\u00f3\7K\2\2\u00f3\u00f5\7D\2\2"+
		"\u00f4\u00f6\5\32\16\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7"+
		"\3\2\2\2\u00f7\u00f8\7E\2\2\u00f8\u00f9\7\n\2\2\u00f9\u00fb\5\n\6\2\u00fa"+
		"\u00fc\5\22\n\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0100\3"+
		"\2\2\2\u00fd\u00ff\5\64\33\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2"+
		"\2\2\u0103\u0104\7\n\2\2\u0104\u0105\5> \2\u0105\u0106\7I\2\2\u0106\u0107"+
		"\7\t\2\2\u0107!\3\2\2\2\u0108\u010b\7K\2\2\u0109\u010b\5\n\6\2\u010a\u0108"+
		"\3\2\2\2\u010a\u0109\3\2\2\2\u010b#\3\2\2\2\u010c\u0110\7K\2\2\u010d\u0110"+
		"\58\35\2\u010e\u0110\5:\36\2\u010f\u010c\3\2\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\7C\2\2\u0112\u0113\5> "+
		"\2\u0113\u0114\7I\2\2\u0114%\3\2\2\2\u0115\u0116\7\30\2\2\u0116\u0117"+
		"\5> \2\u0117\u0118\b\24\1\2\u0118\u011c\7\31\2\2\u0119\u011b\5\64\33\2"+
		"\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d"+
		"\3\2\2\2\u011d\u0126\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0123\7\32\2\2"+
		"\u0120\u0122\5\64\33\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0126"+
		"\u011f\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\7\33"+
		"\2\2\u0129\'\3\2\2\2\u012a\u012b\7\34\2\2\u012b\u012c\7K\2\2\u012c\u012d"+
		"\7\35\2\2\u012d\u012e\5> \2\u012e\u012f\7\36\2\2\u012f\u0130\5> \2\u0130"+
		"\u0131\b\25\1\2\u0131\u0135\7\37\2\2\u0132\u0134\5\64\33\2\u0133\u0132"+
		"\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\7 \2\2\u0139)\3\2\2\2\u013a"+
		"\u013b\7!\2\2\u013b\u013c\5> \2\u013c\u013d\b\26\1\2\u013d\u0141\7\37"+
		"\2\2\u013e\u0140\5\64\33\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2"+
		"\2\2\u0144\u0145\7\"\2\2\u0145+\3\2\2\2\u0146\u0147\7K\2\2\u0147\u0150"+
		"\7D\2\2\u0148\u014d\5> \2\u0149\u014a\7H\2\2\u014a\u014c\5> \2\u014b\u0149"+
		"\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0148\3\2\2\2\u0150\u0151\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152\u0153\7E\2\2\u0153\u0154\7I\2\2\u0154-"+
		"\3\2\2\2\u0155\u0156\7\'\2\2\u0156\u0157\7D\2\2\u0157\u0158\7K\2\2\u0158"+
		"\u0159\7E\2\2\u0159\u015a\7I\2\2\u015a/\3\2\2\2\u015b\u015c\7(\2\2\u015c"+
		"\u015f\7D\2\2\u015d\u0160\5> \2\u015e\u0160\7J\2\2\u015f\u015d\3\2\2\2"+
		"\u015f\u015e\3\2\2\2\u0160\u0168\3\2\2\2\u0161\u0164\7H\2\2\u0162\u0165"+
		"\5> \2\u0163\u0165\7J\2\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165"+
		"\u0167\3\2\2\2\u0166\u0161\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2"+
		"\2\2\u0168\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u0168\3\2\2\2\u016b"+
		"\u016c\7E\2\2\u016c\u016d\7I\2\2\u016d\61\3\2\2\2\u016e\u016f\7)\2\2\u016f"+
		"\u017e\7D\2\2\u0170\u0173\5> \2\u0171\u0173\7J\2\2\u0172\u0170\3\2\2\2"+
		"\u0172\u0171\3\2\2\2\u0173\u017b\3\2\2\2\u0174\u0177\7H\2\2\u0175\u0178"+
		"\5> \2\u0176\u0178\7J\2\2\u0177\u0175\3\2\2\2\u0177\u0176\3\2\2\2\u0178"+
		"\u017a\3\2\2\2\u0179\u0174\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2"+
		"\2\2\u017b\u017c\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017e"+
		"\u0172\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\7E"+
		"\2\2\u0181\u0182\7I\2\2\u0182\63\3\2\2\2\u0183\u018c\5$\23\2\u0184\u018c"+
		"\5&\24\2\u0185\u018c\5(\25\2\u0186\u018c\5*\26\2\u0187\u018c\5,\27\2\u0188"+
		"\u018c\5.\30\2\u0189\u018c\5\60\31\2\u018a\u018c\5\62\32\2\u018b\u0183"+
		"\3\2\2\2\u018b\u0184\3\2\2\2\u018b\u0185\3\2\2\2\u018b\u0186\3\2\2\2\u018b"+
		"\u0187\3\2\2\2\u018b\u0188\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018a\3\2"+
		"\2\2\u018c\65\3\2\2\2\u018d\u018e\7-\2\2\u018e\u0196\b\34\1\2\u018f\u0190"+
		"\7+\2\2\u0190\u0196\b\34\1\2\u0191\u0192\7*\2\2\u0192\u0196\b\34\1\2\u0193"+
		"\u0194\7,\2\2\u0194\u0196\b\34\1\2\u0195\u018d\3\2\2\2\u0195\u018f\3\2"+
		"\2\2\u0195\u0191\3\2\2\2\u0195\u0193\3\2\2\2\u0196\67\3\2\2\2\u0197\u0198"+
		"\7K\2\2\u0198\u0199\7B\2\2\u0199\u019a\7K\2\2\u019a9\3\2\2\2\u019b\u019c"+
		"\7K\2\2\u019c\u019d\7@\2\2\u019d\u019e\5> \2\u019e\u019f\b\36\1\2\u019f"+
		"\u01a0\7A\2\2\u01a0;\3\2\2\2\u01a1\u01a2\7K\2\2\u01a2\u01ab\7D\2\2\u01a3"+
		"\u01a8\5> \2\u01a4\u01a5\7H\2\2\u01a5\u01a7\5> \2\u01a6\u01a4\3\2\2\2"+
		"\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ac"+
		"\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01a3\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\u01ad\3\2\2\2\u01ad\u01ae\7E\2\2\u01ae=\3\2\2\2\u01af\u01b7\5@!\2\u01b0"+
		"\u01b1\7>\2\2\u01b1\u01b2\5@!\2\u01b2\u01b3\b \1\2\u01b3\u01b4\7?\2\2"+
		"\u01b4\u01b5\5@!\2\u01b5\u01b6\b \1\2\u01b6\u01b8\3\2\2\2\u01b7\u01b0"+
		"\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"\u01bf\3\2\2\2\u01bb\u01bc\5@!\2\u01bc\u01bd\b \1\2\u01bd\u01bf\3\2\2"+
		"\2\u01be\u01af\3\2\2\2\u01be\u01bb\3\2\2\2\u01bf?\3\2\2\2\u01c0\u01c1"+
		"\5B\"\2\u01c1\u01c6\b!\1\2\u01c2\u01c3\t\4\2\2\u01c3\u01c4\5B\"\2\u01c4"+
		"\u01c5\b!\1\2\u01c5\u01c7\3\2\2\2\u01c6\u01c2\3\2\2\2\u01c7\u01c8\3\2"+
		"\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ce\3\2\2\2\u01ca"+
		"\u01cb\5B\"\2\u01cb\u01cc\b!\1\2\u01cc\u01ce\3\2\2\2\u01cd\u01c0\3\2\2"+
		"\2\u01cd\u01ca\3\2\2\2\u01ceA\3\2\2\2\u01cf\u01d0\5D#\2\u01d0\u01d5\b"+
		"\"\1\2\u01d1\u01d2\t\5\2\2\u01d2\u01d3\5D#\2\u01d3\u01d4\b\"\1\2\u01d4"+
		"\u01d6\3\2\2\2\u01d5\u01d1\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d5\3\2"+
		"\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01dd\3\2\2\2\u01d9\u01da\5D#\2\u01da\u01db"+
		"\b\"\1\2\u01db\u01dd\3\2\2\2\u01dc\u01cf\3\2\2\2\u01dc\u01d9\3\2\2\2\u01dd"+
		"C\3\2\2\2\u01de\u01e3\5F$\2\u01df\u01e0\t\6\2\2\u01e0\u01e1\5F$\2\u01e1"+
		"\u01e2\b#\1\2\u01e2\u01e4\3\2\2\2\u01e3\u01df\3\2\2\2\u01e4\u01e5\3\2"+
		"\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01eb\3\2\2\2\u01e7"+
		"\u01e8\5F$\2\u01e8\u01e9\b#\1\2\u01e9\u01eb\3\2\2\2\u01ea\u01de\3\2\2"+
		"\2\u01ea\u01e7\3\2\2\2\u01ebE\3\2\2\2\u01ec\u01f1\5H%\2\u01ed\u01ee\t"+
		"\7\2\2\u01ee\u01ef\5H%\2\u01ef\u01f0\b$\1\2\u01f0\u01f2\3\2\2\2\u01f1"+
		"\u01ed\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2"+
		"\2\2\u01f4\u01f9\3\2\2\2\u01f5\u01f6\5H%\2\u01f6\u01f7\b$\1\2\u01f7\u01f9"+
		"\3\2\2\2\u01f8\u01ec\3\2\2\2\u01f8\u01f5\3\2\2\2\u01f9G\3\2\2\2\u01fa"+
		"\u01fb\t\b\2\2\u01fb\u01fc\5J&\2\u01fc\u01fd\b%\1\2\u01fd\u0202\3\2\2"+
		"\2\u01fe\u01ff\5J&\2\u01ff\u0200\b%\1\2\u0200\u0202\3\2\2\2\u0201\u01fa"+
		"\3\2\2\2\u0201\u01fe\3\2\2\2\u0202I\3\2\2\2\u0203\u0204\5\66\34\2\u0204"+
		"\u0205\b&\1\2\u0205\u020e\3\2\2\2\u0206\u020e\7K\2\2\u0207\u020e\58\35"+
		"\2\u0208\u020e\5:\36\2\u0209\u020e\5<\37\2\u020a\u020b\5L\'\2\u020b\u020c"+
		"\b&\1\2\u020c\u020e\3\2\2\2\u020d\u0203\3\2\2\2\u020d\u0206\3\2\2\2\u020d"+
		"\u0207\3\2\2\2\u020d\u0208\3\2\2\2\u020d\u0209\3\2\2\2\u020d\u020a\3\2"+
		"\2\2\u020eK\3\2\2\2\u020f\u0210\7D\2\2\u0210\u0211\5> \2\u0211\u0212\b"+
		"\'\1\2\u0212\u0213\7E\2\2\u0213M\3\2\2\2>ORUY^clv\u0082\u008b\u0095\u009b"+
		"\u00a7\u00ae\u00b0\u00b7\u00c0\u00c8\u00ce\u00d5\u00da\u00dc\u00e3\u00e7"+
		"\u00ec\u00f5\u00fb\u0100\u010a\u010f\u011c\u0123\u0126\u0135\u0141\u014d"+
		"\u0150\u015f\u0164\u0168\u0172\u0177\u017b\u017e\u018b\u0195\u01a8\u01ab"+
		"\u01b9\u01be\u01c8\u01cd\u01d7\u01dc\u01e5\u01ea\u01f3\u01f8\u0201\u020d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}