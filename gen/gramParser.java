// Generated from /home/sipwarriper/IdeaProjects/ANTLR4-Compiladors/gram.g4 by ANTLR 4.7
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
		TK_OP_VECTOR_CLOSE=63, TK_OP_TUPLE=64, TK_OP_ASSIGN=65, TK_OP_QUOTE=66, 
		TK_OP_PAR_OPEN=67, TK_OP_PAR_CLOSE=68, TK_COMMENTS=69, TK_MULTILINE_COMMENTS=70, 
		TK_SEP_COMMA=71, TK_SEP_SEMICOLON=72, TK_STRING_LITERAL=73, TK_IDENTIFIER=74;
	public static final int
		RULE_inici = 0, RULE_testingRule = 1, RULE_program = 2, RULE_main = 3, 
		RULE_typeBlock = 4, RULE_newType = 5, RULE_basicType = 6, RULE_vectorDec = 7, 
		RULE_tuplaDec = 8, RULE_constBlock = 9, RULE_varBlock = 10, RULE_funcDecBlock = 11, 
		RULE_accioDec = 12, RULE_funcDec = 13, RULE_params = 14, RULE_funcImpBlock = 15, 
		RULE_accioImp = 16, RULE_funcImp = 17, RULE_type = 18, RULE_assign = 19, 
		RULE_if_rule = 20, RULE_for_rule = 21, RULE_while_rule = 22, RULE_accio = 23, 
		RULE_read = 24, RULE_write = 25, RULE_writeln = 26, RULE_sentence = 27, 
		RULE_constValue = 28, RULE_tuple = 29, RULE_vector = 30, RULE_func = 31, 
		RULE_expr = 32, RULE_logicsDown = 33, RULE_logicUp = 34, RULE_sum = 35, 
		RULE_mult = 36, RULE_neg = 37, RULE_value = 38, RULE_parenthesis = 39;
	public static final String[] ruleNames = {
		"inici", "testingRule", "program", "main", "typeBlock", "newType", "basicType", 
		"vectorDec", "tuplaDec", "constBlock", "varBlock", "funcDecBlock", "accioDec", 
		"funcDec", "params", "funcImpBlock", "accioImp", "funcImp", "type", "assign", 
		"if_rule", "for_rule", "while_rule", "accio", "read", "write", "writeln", 
		"sentence", "constValue", "tuple", "vector", "func", "expr", "logicsDown", 
		"logicUp", "sum", "mult", "neg", "value", "parenthesis"
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
		"':'", "'['", "']'", "'.'", "':='", "'\"'", "'('", "')'", null, null, 
		"','", "';'"
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
		"TK_OP_QUOTE", "TK_OP_PAR_OPEN", "TK_OP_PAR_CLOSE", "TK_COMMENTS", "TK_MULTILINE_COMMENTS", 
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

	public gramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class IniciContext extends ParserRuleContext {
		public List<TerminalNode> EOF() { return getTokens(gramParser.EOF); }
		public TerminalNode EOF(int i) {
			return getToken(gramParser.EOF, i);
		}
		public IniciContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inici; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterInici(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitInici(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitInici(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IniciContext inici() throws RecognitionException {
		IniciContext _localctx = new IniciContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inici);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==EOF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_WS) | (1L << TK_PC_PROGRAMA) | (1L << TK_PC_FPROGRAMA) | (1L << TK_PC_ACCIO) | (1L << TK_PC_FACCIO) | (1L << TK_PC_FUNCIO) | (1L << TK_PC_FFUNCIO) | (1L << TK_PC_RETURN) | (1L << TK_PC_PARAM_IN) | (1L << TK_PC_PARAM_IO) | (1L << TK_PC_CONSTANTS) | (1L << TK_PC_FCONSTANTS) | (1L << TK_PC_VARIABLES) | (1L << TK_PC_FVARIABLES) | (1L << TK_PC_TIPUS) | (1L << TK_PC_FTIPUS) | (1L << TK_PC_TUPLA) | (1L << TK_PC_FTUPLA) | (1L << TK_PC_VECTOR) | (1L << TK_PC_MIDA) | (1L << TK_PC_INICI) | (1L << TK_PC_SI) | (1L << TK_PC_LLAVORS) | (1L << TK_PC_ALTRAMENT) | (1L << TK_PC_FSI) | (1L << TK_PC_PER) | (1L << TK_PC_DE) | (1L << TK_PC_FINS) | (1L << TK_PC_FER) | (1L << TK_PC_FPER) | (1L << TK_PC_MENTRE) | (1L << TK_PC_FMENTRE) | (1L << TK_PC_INT) | (1L << TK_PC_REAL) | (1L << TK_PC_CHAR) | (1L << TK_PC_BOOL) | (1L << TK_PC_READ) | (1L << TK_PC_WRITE) | (1L << TK_PC_WRITELN) | (1L << TK_CONST_CHAR) | (1L << TK_CONST_REAL) | (1L << TK_CONST_BOOL) | (1L << TK_CONST_INT) | (1L << TK_OP_SUMA) | (1L << TK_OP_RESTA) | (1L << TK_OP_MULT) | (1L << TK_OP_REALDIV) | (1L << TK_OP_INTDIV) | (1L << TK_OP_MOD) | (1L << TK_OP_MINUS) | (1L << TK_OP_EQ) | (1L << TK_OP_DIFF) | (1L << TK_OP_GT) | (1L << TK_OP_LT) | (1L << TK_OP_LOET) | (1L << TK_OP_GOET) | (1L << TK_OP_NEG) | (1L << TK_OP_AND) | (1L << TK_OP_OR) | (1L << TK_OP_QUESTION_MARK) | (1L << TK_OP_COLON) | (1L << TK_OP_VECTOR_OPEN) | (1L << TK_OP_VECTOR_CLOSE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TK_OP_TUPLE - 64)) | (1L << (TK_OP_ASSIGN - 64)) | (1L << (TK_OP_QUOTE - 64)) | (1L << (TK_OP_PAR_OPEN - 64)) | (1L << (TK_OP_PAR_CLOSE - 64)) | (1L << (TK_COMMENTS - 64)) | (1L << (TK_MULTILINE_COMMENTS - 64)) | (1L << (TK_SEP_COMMA - 64)) | (1L << (TK_SEP_SEMICOLON - 64)) | (1L << (TK_STRING_LITERAL - 64)) | (1L << (TK_IDENTIFIER - 64)))) != 0) );
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

	public static class TestingRuleContext extends ParserRuleContext {
		public TerminalNode TK_STRING_LITERAL() { return getToken(gramParser.TK_STRING_LITERAL, 0); }
		public TerminalNode EOF() { return getToken(gramParser.EOF, 0); }
		public TestingRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testingRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterTestingRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitTestingRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitTestingRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestingRuleContext testingRule() throws RecognitionException {
		TestingRuleContext _localctx = new TestingRuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_testingRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(TK_STRING_LITERAL);
			setState(86);
			match(EOF);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_TIPUS) {
				{
				setState(88);
				typeBlock();
				}
			}

			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(91);
				funcDecBlock();
				}
				break;
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_CONSTANTS) {
				{
				setState(94);
				constBlock();
				}
			}

			setState(97);
			main();
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(98);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(TK_PC_PROGRAMA);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_VARIABLES) {
				{
				setState(102);
				varBlock();
				}
			}

			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_PC_WRITELN - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
				{
				{
				setState(105);
				sentence();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitTypeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBlockContext typeBlock() throws RecognitionException {
		TypeBlockContext _localctx = new TypeBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(TK_PC_TIPUS);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_IDENTIFIER) {
				{
				{
				setState(114);
				newType();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitNewType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewTypeContext newType() throws RecognitionException {
		NewTypeContext _localctx = new NewTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_newType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(TK_IDENTIFIER);
			setState(123);
			match(TK_OP_COLON);
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PC_INT:
			case TK_PC_REAL:
			case TK_PC_CHAR:
			case TK_PC_BOOL:
				{
				setState(124);
				basicType();
				}
				break;
			case TK_PC_VECTOR:
				{
				setState(125);
				vectorDec();
				}
				break;
			case TK_PC_TUPLA:
				{
				setState(126);
				tuplaDec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(129);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitBasicType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicTypeContext basicType() throws RecognitionException {
		BasicTypeContext _localctx = new BasicTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_basicType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
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
		public List<TerminalNode> TK_PC_INT() { return getTokens(gramParser.TK_PC_INT); }
		public TerminalNode TK_PC_INT(int i) {
			return getToken(gramParser.TK_PC_INT, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitVectorDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VectorDecContext vectorDec() throws RecognitionException {
		VectorDecContext _localctx = new VectorDecContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_vectorDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(TK_PC_VECTOR);
			setState(134);
			basicType();
			setState(135);
			match(TK_PC_MIDA);
			setState(136);
			match(TK_PC_INT);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_INICI) {
				{
				setState(137);
				match(TK_PC_INICI);
				setState(138);
				match(TK_PC_INT);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitTuplaDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TuplaDecContext tuplaDec() throws RecognitionException {
		TuplaDecContext _localctx = new TuplaDecContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tuplaDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(TK_PC_TUPLA);
			setState(145); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(142);
				basicType();
				setState(143);
				match(TK_IDENTIFIER);
				}
				}
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PC_INT) | (1L << TK_PC_REAL) | (1L << TK_PC_CHAR) | (1L << TK_PC_BOOL))) != 0) );
			setState(149);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitConstBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstBlockContext constBlock() throws RecognitionException {
		ConstBlockContext _localctx = new ConstBlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(TK_PC_CONSTANTS);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PC_INT) | (1L << TK_PC_REAL) | (1L << TK_PC_CHAR) | (1L << TK_PC_BOOL))) != 0)) {
				{
				{
				setState(152);
				basicType();
				setState(153);
				match(TK_IDENTIFIER);
				setState(154);
				match(TK_OP_ASSIGN);
				setState(157);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_CONST_CHAR:
				case TK_CONST_REAL:
				case TK_CONST_BOOL:
				case TK_CONST_INT:
					{
					setState(155);
					constValue();
					}
					break;
				case TK_STRING_LITERAL:
					{
					setState(156);
					match(TK_STRING_LITERAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(159);
				match(TK_SEP_SEMICOLON);
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitVarBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarBlockContext varBlock() throws RecognitionException {
		VarBlockContext _localctx = new VarBlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(TK_PC_VARIABLES);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & ((1L << (TK_PC_INT - 33)) | (1L << (TK_PC_REAL - 33)) | (1L << (TK_PC_CHAR - 33)) | (1L << (TK_PC_BOOL - 33)) | (1L << (TK_IDENTIFIER - 33)))) != 0)) {
				{
				{
				setState(169);
				type();
				setState(170);
				match(TK_IDENTIFIER);
				setState(171);
				match(TK_SEP_SEMICOLON);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitFuncDecBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDecBlockContext funcDecBlock() throws RecognitionException {
		FuncDecBlockContext _localctx = new FuncDecBlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funcDecBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_PC_ACCIO || _la==TK_PC_FUNCIO) {
				{
				setState(182);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_PC_ACCIO:
					{
					setState(180);
					accioDec();
					}
					break;
				case TK_PC_FUNCIO:
					{
					setState(181);
					funcDec();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(186);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitAccioDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccioDecContext accioDec() throws RecognitionException {
		AccioDecContext _localctx = new AccioDecContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_accioDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(TK_PC_ACCIO);
			setState(188);
			match(TK_IDENTIFIER);
			setState(189);
			match(TK_OP_PAR_OPEN);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PC_PARAM_IN) | (1L << TK_PC_PARAM_IO) | (1L << TK_PC_INT) | (1L << TK_PC_REAL) | (1L << TK_PC_CHAR) | (1L << TK_PC_BOOL))) != 0) || _la==TK_IDENTIFIER) {
				{
				setState(190);
				params();
				}
			}

			setState(193);
			match(TK_OP_PAR_CLOSE);
			setState(194);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitFuncDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDecContext funcDec() throws RecognitionException {
		FuncDecContext _localctx = new FuncDecContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funcDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(TK_PC_FUNCIO);
			setState(197);
			match(TK_IDENTIFIER);
			setState(198);
			match(TK_OP_PAR_OPEN);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PC_PARAM_IN) | (1L << TK_PC_PARAM_IO) | (1L << TK_PC_INT) | (1L << TK_PC_REAL) | (1L << TK_PC_CHAR) | (1L << TK_PC_BOOL))) != 0) || _la==TK_IDENTIFIER) {
				{
				setState(199);
				params();
				}
			}

			setState(202);
			match(TK_OP_PAR_CLOSE);
			setState(203);
			match(TK_PC_RETURN);
			setState(204);
			basicType();
			setState(205);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_PARAM_IN || _la==TK_PC_PARAM_IO) {
				{
				setState(207);
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

			setState(210);
			type();
			setState(211);
			match(TK_IDENTIFIER);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_SEP_COMMA) {
				{
				{
				setState(212);
				match(TK_SEP_COMMA);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PC_PARAM_IN || _la==TK_PC_PARAM_IO) {
					{
					setState(213);
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

				setState(216);
				type();
				setState(217);
				match(TK_IDENTIFIER);
				}
				}
				setState(223);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitFuncImpBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncImpBlockContext funcImpBlock() throws RecognitionException {
		FuncImpBlockContext _localctx = new FuncImpBlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_funcImpBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_PC_ACCIO || _la==TK_PC_FUNCIO) {
				{
				setState(226);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_PC_ACCIO:
					{
					setState(224);
					accioImp();
					}
					break;
				case TK_PC_FUNCIO:
					{
					setState(225);
					funcImp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(230);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitAccioImp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccioImpContext accioImp() throws RecognitionException {
		AccioImpContext _localctx = new AccioImpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_accioImp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(TK_PC_ACCIO);
			setState(232);
			match(TK_IDENTIFIER);
			setState(233);
			match(TK_OP_PAR_OPEN);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PC_PARAM_IN) | (1L << TK_PC_PARAM_IO) | (1L << TK_PC_INT) | (1L << TK_PC_REAL) | (1L << TK_PC_CHAR) | (1L << TK_PC_BOOL))) != 0) || _la==TK_IDENTIFIER) {
				{
				setState(234);
				params();
				}
			}

			setState(237);
			match(TK_OP_PAR_CLOSE);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_VARIABLES) {
				{
				setState(238);
				varBlock();
				}
			}

			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_PC_WRITELN - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
				{
				{
				setState(241);
				sentence();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitFuncImp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncImpContext funcImp() throws RecognitionException {
		FuncImpContext _localctx = new FuncImpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_funcImp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(TK_PC_FUNCIO);
			setState(250);
			match(TK_IDENTIFIER);
			setState(251);
			match(TK_OP_PAR_OPEN);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PC_PARAM_IN) | (1L << TK_PC_PARAM_IO) | (1L << TK_PC_INT) | (1L << TK_PC_REAL) | (1L << TK_PC_CHAR) | (1L << TK_PC_BOOL))) != 0) || _la==TK_IDENTIFIER) {
				{
				setState(252);
				params();
				}
			}

			setState(255);
			match(TK_OP_PAR_CLOSE);
			setState(256);
			match(TK_PC_RETURN);
			setState(257);
			basicType();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_VARIABLES) {
				{
				setState(258);
				varBlock();
				}
			}

			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_PC_WRITELN - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
				{
				{
				setState(261);
				sentence();
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
			match(TK_PC_RETURN);
			setState(268);
			expr();
			setState(269);
			match(TK_SEP_SEMICOLON);
			setState(270);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type);
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(TK_IDENTIFIER);
				}
				break;
			case TK_PC_INT:
			case TK_PC_REAL:
			case TK_PC_CHAR:
			case TK_PC_BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
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
		public TerminalNode TK_IDENTIFIER() { return getToken(gramParser.TK_IDENTIFIER, 0); }
		public TerminalNode TK_OP_ASSIGN() { return getToken(gramParser.TK_OP_ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_SEP_SEMICOLON() { return getToken(gramParser.TK_SEP_SEMICOLON, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(TK_IDENTIFIER);
			setState(277);
			match(TK_OP_ASSIGN);
			setState(278);
			expr();
			setState(279);
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
		public TerminalNode TK_PC_SI() { return getToken(gramParser.TK_PC_SI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_PC_LLAVORS() { return getToken(gramParser.TK_PC_LLAVORS, 0); }
		public TerminalNode TK_PC_FSI() { return getToken(gramParser.TK_PC_FSI, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitIf_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_ruleContext if_rule() throws RecognitionException {
		If_ruleContext _localctx = new If_ruleContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_if_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(TK_PC_SI);
			setState(282);
			expr();
			setState(283);
			match(TK_PC_LLAVORS);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_PC_WRITELN - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
				{
				{
				setState(284);
				sentence();
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_ALTRAMENT) {
				{
				setState(290);
				match(TK_PC_ALTRAMENT);
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_PC_WRITELN - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
					{
					{
					setState(291);
					sentence();
					}
					}
					setState(296);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(299);
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
		public TerminalNode TK_PC_PER() { return getToken(gramParser.TK_PC_PER, 0); }
		public TerminalNode TK_IDENTIFIER() { return getToken(gramParser.TK_IDENTIFIER, 0); }
		public TerminalNode TK_PC_DE() { return getToken(gramParser.TK_PC_DE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TK_PC_FINS() { return getToken(gramParser.TK_PC_FINS, 0); }
		public TerminalNode TK_PC_FER() { return getToken(gramParser.TK_PC_FER, 0); }
		public TerminalNode TK_PC_FPER() { return getToken(gramParser.TK_PC_FPER, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitFor_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_ruleContext for_rule() throws RecognitionException {
		For_ruleContext _localctx = new For_ruleContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_for_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(TK_PC_PER);
			setState(302);
			match(TK_IDENTIFIER);
			setState(303);
			match(TK_PC_DE);
			setState(304);
			expr();
			setState(305);
			match(TK_PC_FINS);
			setState(306);
			expr();
			setState(307);
			match(TK_PC_FER);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_PC_WRITELN - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
				{
				{
				setState(308);
				sentence();
				}
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(314);
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
		public TerminalNode TK_PC_MENTRE() { return getToken(gramParser.TK_PC_MENTRE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_PC_FER() { return getToken(gramParser.TK_PC_FER, 0); }
		public TerminalNode TK_PC_FMENTRE() { return getToken(gramParser.TK_PC_FMENTRE, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitWhile_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_ruleContext while_rule() throws RecognitionException {
		While_ruleContext _localctx = new While_ruleContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_while_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(TK_PC_MENTRE);
			setState(317);
			expr();
			setState(318);
			match(TK_PC_FER);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_PC_WRITELN - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
				{
				{
				setState(319);
				sentence();
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitAccio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccioContext accio() throws RecognitionException {
		AccioContext _localctx = new AccioContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_accio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(TK_IDENTIFIER);
			setState(328);
			match(TK_OP_PAR_OPEN);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (TK_CONST_CHAR - 40)) | (1L << (TK_CONST_REAL - 40)) | (1L << (TK_CONST_BOOL - 40)) | (1L << (TK_CONST_INT - 40)) | (1L << (TK_OP_MINUS - 40)) | (1L << (TK_OP_NEG - 40)) | (1L << (TK_OP_PAR_OPEN - 40)) | (1L << (TK_IDENTIFIER - 40)))) != 0)) {
				{
				setState(329);
				expr();
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_SEP_COMMA) {
					{
					{
					setState(330);
					match(TK_SEP_COMMA);
					setState(331);
					expr();
					}
					}
					setState(336);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(339);
			match(TK_OP_PAR_CLOSE);
			setState(340);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(TK_PC_READ);
			setState(343);
			match(TK_OP_PAR_OPEN);
			setState(344);
			match(TK_IDENTIFIER);
			setState(345);
			match(TK_OP_PAR_CLOSE);
			setState(346);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(TK_PC_WRITE);
			setState(349);
			match(TK_OP_PAR_OPEN);
			setState(352);
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
				setState(350);
				expr();
				}
				break;
			case TK_STRING_LITERAL:
				{
				setState(351);
				match(TK_STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_SEP_COMMA) {
				{
				{
				setState(354);
				match(TK_SEP_COMMA);
				setState(357);
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
					setState(355);
					expr();
					}
					break;
				case TK_STRING_LITERAL:
					{
					setState(356);
					match(TK_STRING_LITERAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(364);
			match(TK_OP_PAR_CLOSE);
			setState(365);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitWriteln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WritelnContext writeln() throws RecognitionException {
		WritelnContext _localctx = new WritelnContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_writeln);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(TK_PC_WRITELN);
			setState(368);
			match(TK_OP_PAR_OPEN);
			setState(371);
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
				setState(369);
				expr();
				}
				break;
			case TK_STRING_LITERAL:
				{
				setState(370);
				match(TK_STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_SEP_COMMA) {
				{
				{
				setState(373);
				match(TK_SEP_COMMA);
				setState(376);
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
					setState(374);
					expr();
					}
					break;
				case TK_STRING_LITERAL:
					{
					setState(375);
					match(TK_STRING_LITERAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(383);
			match(TK_OP_PAR_CLOSE);
			setState(384);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(386);
				assign();
				}
				break;
			case 2:
				{
				setState(387);
				if_rule();
				}
				break;
			case 3:
				{
				setState(388);
				for_rule();
				}
				break;
			case 4:
				{
				setState(389);
				while_rule();
				}
				break;
			case 5:
				{
				setState(390);
				accio();
				}
				break;
			case 6:
				{
				setState(391);
				read();
				}
				break;
			case 7:
				{
				setState(392);
				write();
				}
				break;
			case 8:
				{
				setState(393);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitConstValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstValueContext constValue() throws RecognitionException {
		ConstValueContext _localctx = new ConstValueContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_constValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_CONST_CHAR) | (1L << TK_CONST_REAL) | (1L << TK_CONST_BOOL) | (1L << TK_CONST_INT))) != 0)) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_tuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(TK_IDENTIFIER);
			setState(399);
			match(TK_OP_TUPLE);
			setState(400);
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
		public TerminalNode TK_IDENTIFIER() { return getToken(gramParser.TK_IDENTIFIER, 0); }
		public TerminalNode TK_OP_VECTOR_OPEN() { return getToken(gramParser.TK_OP_VECTOR_OPEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_OP_VECTOR_CLOSE() { return getToken(gramParser.TK_OP_VECTOR_CLOSE, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_vector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(TK_IDENTIFIER);
			setState(403);
			match(TK_OP_VECTOR_OPEN);
			setState(404);
			expr();
			setState(405);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(TK_IDENTIFIER);
			setState(408);
			match(TK_OP_PAR_OPEN);
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (TK_CONST_CHAR - 40)) | (1L << (TK_CONST_REAL - 40)) | (1L << (TK_CONST_BOOL - 40)) | (1L << (TK_CONST_INT - 40)) | (1L << (TK_OP_MINUS - 40)) | (1L << (TK_OP_NEG - 40)) | (1L << (TK_OP_PAR_OPEN - 40)) | (1L << (TK_IDENTIFIER - 40)))) != 0)) {
				{
				setState(409);
				expr();
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_SEP_COMMA) {
					{
					{
					setState(410);
					match(TK_SEP_COMMA);
					setState(411);
					expr();
					}
					}
					setState(416);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(419);
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
		public LogicsDownContext logicsDown() {
			return getRuleContext(LogicsDownContext.class,0);
		}
		public TerminalNode TK_OP_QUESTION_MARK() { return getToken(gramParser.TK_OP_QUESTION_MARK, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TK_OP_COLON() { return getToken(gramParser.TK_OP_COLON, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expr);
		try {
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(421);
				logicsDown();
				setState(422);
				match(TK_OP_QUESTION_MARK);
				setState(423);
				expr();
				setState(424);
				match(TK_OP_COLON);
				setState(425);
				expr();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				logicsDown();
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
		public LogicUpContext logicUp() {
			return getRuleContext(LogicUpContext.class,0);
		}
		public LogicsDownContext logicsDown() {
			return getRuleContext(LogicsDownContext.class,0);
		}
		public TerminalNode TK_OP_AND() { return getToken(gramParser.TK_OP_AND, 0); }
		public TerminalNode TK_OP_OR() { return getToken(gramParser.TK_OP_OR, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitLogicsDown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicsDownContext logicsDown() throws RecognitionException {
		LogicsDownContext _localctx = new LogicsDownContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_logicsDown);
		int _la;
		try {
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(430);
				logicUp();
				setState(431);
				_la = _input.LA(1);
				if ( !(_la==TK_OP_AND || _la==TK_OP_OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(432);
				logicsDown();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				logicUp();
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
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public LogicUpContext logicUp() {
			return getRuleContext(LogicUpContext.class,0);
		}
		public TerminalNode TK_OP_EQ() { return getToken(gramParser.TK_OP_EQ, 0); }
		public TerminalNode TK_OP_DIFF() { return getToken(gramParser.TK_OP_DIFF, 0); }
		public TerminalNode TK_OP_GT() { return getToken(gramParser.TK_OP_GT, 0); }
		public TerminalNode TK_OP_LT() { return getToken(gramParser.TK_OP_LT, 0); }
		public TerminalNode TK_OP_LOET() { return getToken(gramParser.TK_OP_LOET, 0); }
		public TerminalNode TK_OP_GOET() { return getToken(gramParser.TK_OP_GOET, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitLogicUp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicUpContext logicUp() throws RecognitionException {
		LogicUpContext _localctx = new LogicUpContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_logicUp);
		int _la;
		try {
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(437);
				sum();
				setState(438);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_OP_EQ) | (1L << TK_OP_DIFF) | (1L << TK_OP_GT) | (1L << TK_OP_LT) | (1L << TK_OP_LOET) | (1L << TK_OP_GOET))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(439);
				logicUp();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				sum();
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
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public TerminalNode TK_OP_SUMA() { return getToken(gramParser.TK_OP_SUMA, 0); }
		public TerminalNode TK_OP_RESTA() { return getToken(gramParser.TK_OP_RESTA, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitSum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumContext sum() throws RecognitionException {
		SumContext _localctx = new SumContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_sum);
		int _la;
		try {
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(444);
				mult();
				setState(445);
				_la = _input.LA(1);
				if ( !(_la==TK_OP_SUMA || _la==TK_OP_RESTA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(446);
				sum();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				mult();
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
		public NegContext neg() {
			return getRuleContext(NegContext.class,0);
		}
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public TerminalNode TK_OP_MULT() { return getToken(gramParser.TK_OP_MULT, 0); }
		public TerminalNode TK_OP_REALDIV() { return getToken(gramParser.TK_OP_REALDIV, 0); }
		public TerminalNode TK_OP_INTDIV() { return getToken(gramParser.TK_OP_INTDIV, 0); }
		public TerminalNode TK_OP_MOD() { return getToken(gramParser.TK_OP_MOD, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_mult);
		int _la;
		try {
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(451);
				neg();
				setState(452);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_OP_MULT) | (1L << TK_OP_REALDIV) | (1L << TK_OP_INTDIV) | (1L << TK_OP_MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(453);
				mult();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				neg();
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
		public NegContext neg() {
			return getRuleContext(NegContext.class,0);
		}
		public TerminalNode TK_OP_NEG() { return getToken(gramParser.TK_OP_NEG, 0); }
		public TerminalNode TK_OP_MINUS() { return getToken(gramParser.TK_OP_MINUS, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitNeg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegContext neg() throws RecognitionException {
		NegContext _localctx = new NegContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_neg);
		int _la;
		try {
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_OP_MINUS:
			case TK_OP_NEG:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(458);
				_la = _input.LA(1);
				if ( !(_la==TK_OP_MINUS || _la==TK_OP_NEG) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(459);
				neg();
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
				setState(460);
				value();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_value);
		try {
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				constValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				match(TK_IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(465);
				tuple();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(466);
				vector();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(467);
				func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(468);
				parenthesis();
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
		public TerminalNode TK_OP_PAR_OPEN() { return getToken(gramParser.TK_OP_PAR_OPEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_OP_PAR_CLOSE() { return getToken(gramParser.TK_OP_PAR_CLOSE, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesisContext parenthesis() throws RecognitionException {
		ParenthesisContext _localctx = new ParenthesisContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_parenthesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(TK_OP_PAR_OPEN);
			setState(472);
			expr();
			setState(473);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3L\u01de\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\6\2T\n\2\r"+
		"\2\16\2U\3\3\3\3\3\3\3\4\5\4\\\n\4\3\4\5\4_\n\4\3\4\5\4b\n\4\3\4\3\4\5"+
		"\4f\n\4\3\5\3\5\5\5j\n\5\3\5\7\5m\n\5\f\5\16\5p\13\5\3\5\3\5\3\6\3\6\7"+
		"\6v\n\6\f\6\16\6y\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u0082\n\7\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008e\n\t\3\n\3\n\3\n\3\n\6\n\u0094"+
		"\n\n\r\n\16\n\u0095\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a0\n"+
		"\13\3\13\3\13\7\13\u00a4\n\13\f\13\16\13\u00a7\13\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\7\f\u00b0\n\f\f\f\16\f\u00b3\13\f\3\f\3\f\3\r\3\r\7\r\u00b9"+
		"\n\r\f\r\16\r\u00bc\13\r\3\16\3\16\3\16\3\16\5\16\u00c2\n\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\5\17\u00cb\n\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\5\20\u00d3\n\20\3\20\3\20\3\20\3\20\5\20\u00d9\n\20\3\20\3\20\3\20\7"+
		"\20\u00de\n\20\f\20\16\20\u00e1\13\20\3\21\3\21\7\21\u00e5\n\21\f\21\16"+
		"\21\u00e8\13\21\3\22\3\22\3\22\3\22\5\22\u00ee\n\22\3\22\3\22\5\22\u00f2"+
		"\n\22\3\22\7\22\u00f5\n\22\f\22\16\22\u00f8\13\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\5\23\u0100\n\23\3\23\3\23\3\23\3\23\5\23\u0106\n\23\3\23\7"+
		"\23\u0109\n\23\f\23\16\23\u010c\13\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\5\24\u0115\n\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26"+
		"\u0120\n\26\f\26\16\26\u0123\13\26\3\26\3\26\7\26\u0127\n\26\f\26\16\26"+
		"\u012a\13\26\5\26\u012c\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\7\27\u0138\n\27\f\27\16\27\u013b\13\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\7\30\u0143\n\30\f\30\16\30\u0146\13\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\7\31\u014f\n\31\f\31\16\31\u0152\13\31\5\31\u0154\n\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u0163"+
		"\n\33\3\33\3\33\3\33\5\33\u0168\n\33\7\33\u016a\n\33\f\33\16\33\u016d"+
		"\13\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\5\34\u0176\n\34\3\34\3\34\3"+
		"\34\5\34\u017b\n\34\7\34\u017d\n\34\f\34\16\34\u0180\13\34\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u018d\n\35\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\7!\u019f\n!\f!\16!"+
		"\u01a2\13!\5!\u01a4\n!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01af\n\""+
		"\3#\3#\3#\3#\3#\5#\u01b6\n#\3$\3$\3$\3$\3$\5$\u01bd\n$\3%\3%\3%\3%\3%"+
		"\5%\u01c4\n%\3&\3&\3&\3&\3&\5&\u01cb\n&\3\'\3\'\3\'\5\'\u01d0\n\'\3(\3"+
		"(\3(\3(\3(\3(\5(\u01d8\n(\3)\3)\3)\3)\3)\2\2*\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP\2\13\2\3\3\2#&\3\2\13"+
		"\f\3\2*-\3\2<=\3\2\65:\3\2./\3\2\60\63\4\2\64\64;;\2\u01f5\2S\3\2\2\2"+
		"\4W\3\2\2\2\6[\3\2\2\2\bg\3\2\2\2\ns\3\2\2\2\f|\3\2\2\2\16\u0085\3\2\2"+
		"\2\20\u0087\3\2\2\2\22\u008f\3\2\2\2\24\u0099\3\2\2\2\26\u00aa\3\2\2\2"+
		"\30\u00ba\3\2\2\2\32\u00bd\3\2\2\2\34\u00c6\3\2\2\2\36\u00d2\3\2\2\2 "+
		"\u00e6\3\2\2\2\"\u00e9\3\2\2\2$\u00fb\3\2\2\2&\u0114\3\2\2\2(\u0116\3"+
		"\2\2\2*\u011b\3\2\2\2,\u012f\3\2\2\2.\u013e\3\2\2\2\60\u0149\3\2\2\2\62"+
		"\u0158\3\2\2\2\64\u015e\3\2\2\2\66\u0171\3\2\2\28\u018c\3\2\2\2:\u018e"+
		"\3\2\2\2<\u0190\3\2\2\2>\u0194\3\2\2\2@\u0199\3\2\2\2B\u01ae\3\2\2\2D"+
		"\u01b5\3\2\2\2F\u01bc\3\2\2\2H\u01c3\3\2\2\2J\u01ca\3\2\2\2L\u01cf\3\2"+
		"\2\2N\u01d7\3\2\2\2P\u01d9\3\2\2\2RT\n\2\2\2SR\3\2\2\2TU\3\2\2\2US\3\2"+
		"\2\2UV\3\2\2\2V\3\3\2\2\2WX\7K\2\2XY\7\2\2\3Y\5\3\2\2\2Z\\\5\n\6\2[Z\3"+
		"\2\2\2[\\\3\2\2\2\\^\3\2\2\2]_\5\30\r\2^]\3\2\2\2^_\3\2\2\2_a\3\2\2\2"+
		"`b\5\24\13\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2ce\5\b\5\2df\5 \21\2ed\3\2\2"+
		"\2ef\3\2\2\2f\7\3\2\2\2gi\7\4\2\2hj\5\26\f\2ih\3\2\2\2ij\3\2\2\2jn\3\2"+
		"\2\2km\58\35\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2"+
		"\2\2qr\7\5\2\2r\t\3\2\2\2sw\7\21\2\2tv\5\f\7\2ut\3\2\2\2vy\3\2\2\2wu\3"+
		"\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7\22\2\2{\13\3\2\2\2|}\7L\2\2}"+
		"\u0081\7?\2\2~\u0082\5\16\b\2\177\u0082\5\20\t\2\u0080\u0082\5\22\n\2"+
		"\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2"+
		"\2\2\u0083\u0084\7J\2\2\u0084\r\3\2\2\2\u0085\u0086\t\3\2\2\u0086\17\3"+
		"\2\2\2\u0087\u0088\7\25\2\2\u0088\u0089\5\16\b\2\u0089\u008a\7\26\2\2"+
		"\u008a\u008d\7#\2\2\u008b\u008c\7\27\2\2\u008c\u008e\7#\2\2\u008d\u008b"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\21\3\2\2\2\u008f\u0093\7\23\2\2\u0090"+
		"\u0091\5\16\b\2\u0091\u0092\7L\2\2\u0092\u0094\3\2\2\2\u0093\u0090\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0098\7\24\2\2\u0098\23\3\2\2\2\u0099\u00a5\7\r\2"+
		"\2\u009a\u009b\5\16\b\2\u009b\u009c\7L\2\2\u009c\u009f\7C\2\2\u009d\u00a0"+
		"\5:\36\2\u009e\u00a0\7K\2\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a2\7J\2\2\u00a2\u00a4\3\2\2\2\u00a3\u009a\3\2"+
		"\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7\16\2\2\u00a9\25\3\2\2"+
		"\2\u00aa\u00b1\7\17\2\2\u00ab\u00ac\5&\24\2\u00ac\u00ad\7L\2\2\u00ad\u00ae"+
		"\7J\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ab\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b4\u00b5\7\20\2\2\u00b5\27\3\2\2\2\u00b6\u00b9\5\32\16\2\u00b7"+
		"\u00b9\5\34\17\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3"+
		"\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\31\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00be\7\6\2\2\u00be\u00bf\7L\2\2\u00bf\u00c1\7E\2"+
		"\2\u00c0\u00c2\5\36\20\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c4\7F\2\2\u00c4\u00c5\7J\2\2\u00c5\33\3\2\2\2"+
		"\u00c6\u00c7\7\b\2\2\u00c7\u00c8\7L\2\2\u00c8\u00ca\7E\2\2\u00c9\u00cb"+
		"\5\36\20\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2"+
		"\u00cc\u00cd\7F\2\2\u00cd\u00ce\7\n\2\2\u00ce\u00cf\5\16\b\2\u00cf\u00d0"+
		"\7J\2\2\u00d0\35\3\2\2\2\u00d1\u00d3\t\4\2\2\u00d2\u00d1\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\5&\24\2\u00d5\u00df\7L"+
		"\2\2\u00d6\u00d8\7I\2\2\u00d7\u00d9\t\4\2\2\u00d8\u00d7\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\5&\24\2\u00db\u00dc\7L"+
		"\2\2\u00dc\u00de\3\2\2\2\u00dd\u00d6\3\2\2\2\u00de\u00e1\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\37\3\2\2\2\u00e1\u00df\3\2\2"+
		"\2\u00e2\u00e5\5\"\22\2\u00e3\u00e5\5$\23\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7!\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7\6\2\2\u00ea\u00eb"+
		"\7L\2\2\u00eb\u00ed\7E\2\2\u00ec\u00ee\5\36\20\2\u00ed\u00ec\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\7F\2\2\u00f0\u00f2\5\26"+
		"\f\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f6\3\2\2\2\u00f3"+
		"\u00f5\58\35\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2"+
		"\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fa\7\7\2\2\u00fa#\3\2\2\2\u00fb\u00fc\7\b\2\2\u00fc\u00fd\7L\2\2\u00fd"+
		"\u00ff\7E\2\2\u00fe\u0100\5\36\20\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3"+
		"\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7F\2\2\u0102\u0103\7\n\2\2\u0103"+
		"\u0105\5\16\b\2\u0104\u0106\5\26\f\2\u0105\u0104\3\2\2\2\u0105\u0106\3"+
		"\2\2\2\u0106\u010a\3\2\2\2\u0107\u0109\58\35\2\u0108\u0107\3\2\2\2\u0109"+
		"\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2"+
		"\2\2\u010c\u010a\3\2\2\2\u010d\u010e\7\n\2\2\u010e\u010f\5B\"\2\u010f"+
		"\u0110\7J\2\2\u0110\u0111\7\t\2\2\u0111%\3\2\2\2\u0112\u0115\7L\2\2\u0113"+
		"\u0115\5\16\b\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115\'\3\2\2"+
		"\2\u0116\u0117\7L\2\2\u0117\u0118\7C\2\2\u0118\u0119\5B\"\2\u0119\u011a"+
		"\7J\2\2\u011a)\3\2\2\2\u011b\u011c\7\30\2\2\u011c\u011d\5B\"\2\u011d\u0121"+
		"\7\31\2\2\u011e\u0120\58\35\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2"+
		"\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u012b\3\2\2\2\u0123\u0121"+
		"\3\2\2\2\u0124\u0128\7\32\2\2\u0125\u0127\58\35\2\u0126\u0125\3\2\2\2"+
		"\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012c"+
		"\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u0124\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u012e\7\33\2\2\u012e+\3\2\2\2\u012f\u0130\7\34\2"+
		"\2\u0130\u0131\7L\2\2\u0131\u0132\7\35\2\2\u0132\u0133\5B\"\2\u0133\u0134"+
		"\7\36\2\2\u0134\u0135\5B\"\2\u0135\u0139\7\37\2\2\u0136\u0138\58\35\2"+
		"\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a"+
		"\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\7 \2\2\u013d"+
		"-\3\2\2\2\u013e\u013f\7!\2\2\u013f\u0140\5B\"\2\u0140\u0144\7\37\2\2\u0141"+
		"\u0143\58\35\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2"+
		"\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147"+
		"\u0148\7\"\2\2\u0148/\3\2\2\2\u0149\u014a\7L\2\2\u014a\u0153\7E\2\2\u014b"+
		"\u0150\5B\"\2\u014c\u014d\7I\2\2\u014d\u014f\5B\"\2\u014e\u014c\3\2\2"+
		"\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0154"+
		"\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u014b\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0156\7F\2\2\u0156\u0157\7J\2\2\u0157\61\3\2\2\2"+
		"\u0158\u0159\7\'\2\2\u0159\u015a\7E\2\2\u015a\u015b\7L\2\2\u015b\u015c"+
		"\7F\2\2\u015c\u015d\7J\2\2\u015d\63\3\2\2\2\u015e\u015f\7(\2\2\u015f\u0162"+
		"\7E\2\2\u0160\u0163\5B\"\2\u0161\u0163\7K\2\2\u0162\u0160\3\2\2\2\u0162"+
		"\u0161\3\2\2\2\u0163\u016b\3\2\2\2\u0164\u0167\7I\2\2\u0165\u0168\5B\""+
		"\2\u0166\u0168\7K\2\2\u0167\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168\u016a"+
		"\3\2\2\2\u0169\u0164\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u016f\7F"+
		"\2\2\u016f\u0170\7J\2\2\u0170\65\3\2\2\2\u0171\u0172\7)\2\2\u0172\u0175"+
		"\7E\2\2\u0173\u0176\5B\"\2\u0174\u0176\7K\2\2\u0175\u0173\3\2\2\2\u0175"+
		"\u0174\3\2\2\2\u0176\u017e\3\2\2\2\u0177\u017a\7I\2\2\u0178\u017b\5B\""+
		"\2\u0179\u017b\7K\2\2\u017a\u0178\3\2\2\2\u017a\u0179\3\2\2\2\u017b\u017d"+
		"\3\2\2\2\u017c\u0177\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0182\7F"+
		"\2\2\u0182\u0183\7J\2\2\u0183\67\3\2\2\2\u0184\u018d\5(\25\2\u0185\u018d"+
		"\5*\26\2\u0186\u018d\5,\27\2\u0187\u018d\5.\30\2\u0188\u018d\5\60\31\2"+
		"\u0189\u018d\5\62\32\2\u018a\u018d\5\64\33\2\u018b\u018d\5\66\34\2\u018c"+
		"\u0184\3\2\2\2\u018c\u0185\3\2\2\2\u018c\u0186\3\2\2\2\u018c\u0187\3\2"+
		"\2\2\u018c\u0188\3\2\2\2\u018c\u0189\3\2\2\2\u018c\u018a\3\2\2\2\u018c"+
		"\u018b\3\2\2\2\u018d9\3\2\2\2\u018e\u018f\t\5\2\2\u018f;\3\2\2\2\u0190"+
		"\u0191\7L\2\2\u0191\u0192\7B\2\2\u0192\u0193\7L\2\2\u0193=\3\2\2\2\u0194"+
		"\u0195\7L\2\2\u0195\u0196\7@\2\2\u0196\u0197\5B\"\2\u0197\u0198\7A\2\2"+
		"\u0198?\3\2\2\2\u0199\u019a\7L\2\2\u019a\u01a3\7E\2\2\u019b\u01a0\5B\""+
		"\2\u019c\u019d\7I\2\2\u019d\u019f\5B\"\2\u019e\u019c\3\2\2\2\u019f\u01a2"+
		"\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2"+
		"\u01a0\3\2\2\2\u01a3\u019b\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2"+
		"\2\2\u01a5\u01a6\7F\2\2\u01a6A\3\2\2\2\u01a7\u01a8\5D#\2\u01a8\u01a9\7"+
		">\2\2\u01a9\u01aa\5B\"\2\u01aa\u01ab\7?\2\2\u01ab\u01ac\5B\"\2\u01ac\u01af"+
		"\3\2\2\2\u01ad\u01af\5D#\2\u01ae\u01a7\3\2\2\2\u01ae\u01ad\3\2\2\2\u01af"+
		"C\3\2\2\2\u01b0\u01b1\5F$\2\u01b1\u01b2\t\6\2\2\u01b2\u01b3\5D#\2\u01b3"+
		"\u01b6\3\2\2\2\u01b4\u01b6\5F$\2\u01b5\u01b0\3\2\2\2\u01b5\u01b4\3\2\2"+
		"\2\u01b6E\3\2\2\2\u01b7\u01b8\5H%\2\u01b8\u01b9\t\7\2\2\u01b9\u01ba\5"+
		"F$\2\u01ba\u01bd\3\2\2\2\u01bb\u01bd\5H%\2\u01bc\u01b7\3\2\2\2\u01bc\u01bb"+
		"\3\2\2\2\u01bdG\3\2\2\2\u01be\u01bf\5J&\2\u01bf\u01c0\t\b\2\2\u01c0\u01c1"+
		"\5H%\2\u01c1\u01c4\3\2\2\2\u01c2\u01c4\5J&\2\u01c3\u01be\3\2\2\2\u01c3"+
		"\u01c2\3\2\2\2\u01c4I\3\2\2\2\u01c5\u01c6\5L\'\2\u01c6\u01c7\t\t\2\2\u01c7"+
		"\u01c8\5J&\2\u01c8\u01cb\3\2\2\2\u01c9\u01cb\5L\'\2\u01ca\u01c5\3\2\2"+
		"\2\u01ca\u01c9\3\2\2\2\u01cbK\3\2\2\2\u01cc\u01cd\t\n\2\2\u01cd\u01d0"+
		"\5L\'\2\u01ce\u01d0\5N(\2\u01cf\u01cc\3\2\2\2\u01cf\u01ce\3\2\2\2\u01d0"+
		"M\3\2\2\2\u01d1\u01d8\5:\36\2\u01d2\u01d8\7L\2\2\u01d3\u01d8\5<\37\2\u01d4"+
		"\u01d8\5> \2\u01d5\u01d8\5@!\2\u01d6\u01d8\5P)\2\u01d7\u01d1\3\2\2\2\u01d7"+
		"\u01d2\3\2\2\2\u01d7\u01d3\3\2\2\2\u01d7\u01d4\3\2\2\2\u01d7\u01d5\3\2"+
		"\2\2\u01d7\u01d6\3\2\2\2\u01d8O\3\2\2\2\u01d9\u01da\7E\2\2\u01da\u01db"+
		"\5B\"\2\u01db\u01dc\7F\2\2\u01dcQ\3\2\2\2\67U[^aeinw\u0081\u008d\u0095"+
		"\u009f\u00a5\u00b1\u00b8\u00ba\u00c1\u00ca\u00d2\u00d8\u00df\u00e4\u00e6"+
		"\u00ed\u00f1\u00f6\u00ff\u0105\u010a\u0114\u0121\u0128\u012b\u0139\u0144"+
		"\u0150\u0153\u0162\u0167\u016b\u0175\u017a\u017e\u018c\u01a0\u01a3\u01ae"+
		"\u01b5\u01bc\u01c3\u01ca\u01cf\u01d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}