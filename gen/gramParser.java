// Generated from /home/klanc/Projects/Uni/4t/Compiladors/Compiladors-ANTLR4/gram.g4 by ANTLR 4.7
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
		TK_PC_CHAR=35, TK_PC_BOOL=36, TK_PC_READ=37, TK_PC_WRITE=38, TK_CONST_CHAR=39, 
		TK_CONST_REAL=40, TK_CONST_BOOL=41, TK_CONST_INT=42, TK_OP_SUMA=43, TK_OP_RESTA=44, 
		TK_OP_MULT=45, TK_OP_REALDIV=46, TK_OP_INTDIV=47, TK_OP_MOD=48, TK_OP_MINUS=49, 
		TK_OP_EQ=50, TK_OP_DIFF=51, TK_OP_GT=52, TK_OP_LT=53, TK_OP_LOET=54, TK_OP_GOET=55, 
		TK_OP_NEG=56, TK_OP_AND=57, TK_OP_OR=58, TK_OP_QUESTION_MARK=59, TK_OP_COLON=60, 
		TK_OP_VECTOR_OPEN=61, TK_OP_VECTOR_CLOSE=62, TK_OP_TUPLE=63, TK_OP_ASSIGN=64, 
		TK_OP_PAR_OPEN=65, TK_OP_PAR_CLOSE=66, TK_COMMENTS=67, TK_MULTILINE_COMMENTS=68, 
		TK_SEP_COMMA=69, TK_SEP_SEMICOLON=70, TK_IDENTIFIER=71;
	public static final int
		RULE_inici = 0, RULE_testingRule = 1, RULE_program = 2, RULE_main = 3, 
		RULE_typeBlock = 4, RULE_newType = 5, RULE_basicType = 6, RULE_vectorDec = 7, 
		RULE_tuplaDec = 8, RULE_constBlock = 9, RULE_varBlock = 10, RULE_funcDecBlock = 11, 
		RULE_accioDec = 12, RULE_funcDec = 13, RULE_params = 14, RULE_funcImpBlock = 15, 
		RULE_accioImp = 16, RULE_funcImp = 17, RULE_type = 18, RULE_assign = 19, 
		RULE_if_rule = 20, RULE_for_rule = 21, RULE_while_rule = 22, RULE_accio = 23, 
		RULE_read = 24, RULE_write = 25, RULE_sentence = 26, RULE_constValue = 27, 
		RULE_tuple = 28, RULE_vector = 29, RULE_func = 30, RULE_expr = 31, RULE_logicsDown = 32, 
		RULE_logicUp = 33, RULE_sum = 34, RULE_mult = 35, RULE_neg = 36, RULE_value = 37, 
		RULE_parenthesis = 38;
	public static final String[] ruleNames = {
		"inici", "testingRule", "program", "main", "typeBlock", "newType", "basicType", 
		"vectorDec", "tuplaDec", "constBlock", "varBlock", "funcDecBlock", "accioDec", 
		"funcDec", "params", "funcImpBlock", "accioImp", "funcImp", "type", "assign", 
		"if_rule", "for_rule", "while_rule", "accio", "read", "write", "sentence", 
		"constValue", "tuple", "vector", "func", "expr", "logicsDown", "logicUp", 
		"sum", "mult", "neg", "value", "parenthesis"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'programa'", "'fprograma'", "'accio'", "'faccio'", "'funcio'", 
		"'ffuncio'", "'retorna'", "'ent'", "'entsor'", "'constants'", "'fconstants'", 
		"'variables'", "'fvariables'", "'tipus'", "'ftipus'", "'tupla'", "'ftupla'", 
		"'vector'", "'mida'", "'inici'", "'si'", "'llavors'", "'altrament'", "'fsi'", 
		"'per'", "'de'", "'fins'", "'fer'", "'fper'", "'mentre'", "'fmentre'", 
		"'enter'", "'real'", "'car'", "'boolea'", "'llegir'", "'escriure'", null, 
		null, null, null, "'+'", "'-'", "'*'", "'/'", "'\\'", "'%'", "'~'", "'=='", 
		"'!='", "'>'", "'<'", "'<='", "'>='", "'no'", "'&'", "'|'", "'?'", "':'", 
		"'['", "']'", "'.'", "':='", "'('", "')'", null, null, "','", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TK_WS", "TK_PC_PROGRAMA", "TK_PC_FPROGRAMA", "TK_PC_ACCIO", "TK_PC_FACCIO", 
		"TK_PC_FUNCIO", "TK_PC_FFUNCIO", "TK_PC_RETURN", "TK_PC_PARAM_IN", "TK_PC_PARAM_IO", 
		"TK_PC_CONSTANTS", "TK_PC_FCONSTANTS", "TK_PC_VARIABLES", "TK_PC_FVARIABLES", 
		"TK_PC_TIPUS", "TK_PC_FTIPUS", "TK_PC_TUPLA", "TK_PC_FTUPLA", "TK_PC_VECTOR", 
		"TK_PC_MIDA", "TK_PC_INICI", "TK_PC_SI", "TK_PC_LLAVORS", "TK_PC_ALTRAMENT", 
		"TK_PC_FSI", "TK_PC_PER", "TK_PC_DE", "TK_PC_FINS", "TK_PC_FER", "TK_PC_FPER", 
		"TK_PC_MENTRE", "TK_PC_FMENTRE", "TK_PC_INT", "TK_PC_REAL", "TK_PC_CHAR", 
		"TK_PC_BOOL", "TK_PC_READ", "TK_PC_WRITE", "TK_CONST_CHAR", "TK_CONST_REAL", 
		"TK_CONST_BOOL", "TK_CONST_INT", "TK_OP_SUMA", "TK_OP_RESTA", "TK_OP_MULT", 
		"TK_OP_REALDIV", "TK_OP_INTDIV", "TK_OP_MOD", "TK_OP_MINUS", "TK_OP_EQ", 
		"TK_OP_DIFF", "TK_OP_GT", "TK_OP_LT", "TK_OP_LOET", "TK_OP_GOET", "TK_OP_NEG", 
		"TK_OP_AND", "TK_OP_OR", "TK_OP_QUESTION_MARK", "TK_OP_COLON", "TK_OP_VECTOR_OPEN", 
		"TK_OP_VECTOR_CLOSE", "TK_OP_TUPLE", "TK_OP_ASSIGN", "TK_OP_PAR_OPEN", 
		"TK_OP_PAR_CLOSE", "TK_COMMENTS", "TK_MULTILINE_COMMENTS", "TK_SEP_COMMA", 
		"TK_SEP_SEMICOLON", "TK_IDENTIFIER"
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
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(78);
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
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_WS) | (1L << TK_PC_PROGRAMA) | (1L << TK_PC_FPROGRAMA) | (1L << TK_PC_ACCIO) | (1L << TK_PC_FACCIO) | (1L << TK_PC_FUNCIO) | (1L << TK_PC_FFUNCIO) | (1L << TK_PC_RETURN) | (1L << TK_PC_PARAM_IN) | (1L << TK_PC_PARAM_IO) | (1L << TK_PC_CONSTANTS) | (1L << TK_PC_FCONSTANTS) | (1L << TK_PC_VARIABLES) | (1L << TK_PC_FVARIABLES) | (1L << TK_PC_TIPUS) | (1L << TK_PC_FTIPUS) | (1L << TK_PC_TUPLA) | (1L << TK_PC_FTUPLA) | (1L << TK_PC_VECTOR) | (1L << TK_PC_MIDA) | (1L << TK_PC_INICI) | (1L << TK_PC_SI) | (1L << TK_PC_LLAVORS) | (1L << TK_PC_ALTRAMENT) | (1L << TK_PC_FSI) | (1L << TK_PC_PER) | (1L << TK_PC_DE) | (1L << TK_PC_FINS) | (1L << TK_PC_FER) | (1L << TK_PC_FPER) | (1L << TK_PC_MENTRE) | (1L << TK_PC_FMENTRE) | (1L << TK_PC_INT) | (1L << TK_PC_REAL) | (1L << TK_PC_CHAR) | (1L << TK_PC_BOOL) | (1L << TK_PC_READ) | (1L << TK_PC_WRITE) | (1L << TK_CONST_CHAR) | (1L << TK_CONST_REAL) | (1L << TK_CONST_BOOL) | (1L << TK_CONST_INT) | (1L << TK_OP_SUMA) | (1L << TK_OP_RESTA) | (1L << TK_OP_MULT) | (1L << TK_OP_REALDIV) | (1L << TK_OP_INTDIV) | (1L << TK_OP_MOD) | (1L << TK_OP_MINUS) | (1L << TK_OP_EQ) | (1L << TK_OP_DIFF) | (1L << TK_OP_GT) | (1L << TK_OP_LT) | (1L << TK_OP_LOET) | (1L << TK_OP_GOET) | (1L << TK_OP_NEG) | (1L << TK_OP_AND) | (1L << TK_OP_OR) | (1L << TK_OP_QUESTION_MARK) | (1L << TK_OP_COLON) | (1L << TK_OP_VECTOR_OPEN) | (1L << TK_OP_VECTOR_CLOSE) | (1L << TK_OP_TUPLE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TK_OP_ASSIGN - 64)) | (1L << (TK_OP_PAR_OPEN - 64)) | (1L << (TK_OP_PAR_CLOSE - 64)) | (1L << (TK_COMMENTS - 64)) | (1L << (TK_MULTILINE_COMMENTS - 64)) | (1L << (TK_SEP_COMMA - 64)) | (1L << (TK_SEP_SEMICOLON - 64)) | (1L << (TK_IDENTIFIER - 64)))) != 0) );
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
		public TerminalNode EOF() { return getToken(gramParser.EOF, 0); }
		public List<TerminalNode> TK_CONST_CHAR() { return getTokens(gramParser.TK_CONST_CHAR); }
		public TerminalNode TK_CONST_CHAR(int i) {
			return getToken(gramParser.TK_CONST_CHAR, i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(83);
					match(TK_CONST_CHAR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(86); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(88);
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
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_TIPUS) {
				{
				setState(90);
				typeBlock();
				}
			}

			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(93);
				funcDecBlock();
				}
				break;
			}
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_CONSTANTS) {
				{
				setState(96);
				constBlock();
				}
			}

			setState(99);
			main();
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(100);
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
			setState(103);
			match(TK_PC_PROGRAMA);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_VARIABLES) {
				{
				setState(104);
				varBlock();
				}
			}

			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
				{
				{
				setState(107);
				sentence();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
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
			setState(115);
			match(TK_PC_TIPUS);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_IDENTIFIER) {
				{
				{
				setState(116);
				newType();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
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
			setState(124);
			match(TK_IDENTIFIER);
			setState(125);
			match(TK_OP_COLON);
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PC_INT:
			case TK_PC_REAL:
			case TK_PC_CHAR:
			case TK_PC_BOOL:
				{
				setState(126);
				basicType();
				}
				break;
			case TK_PC_VECTOR:
				{
				setState(127);
				vectorDec();
				}
				break;
			case TK_PC_TUPLA:
				{
				setState(128);
				tuplaDec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(131);
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
			setState(133);
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
			setState(135);
			match(TK_PC_VECTOR);
			setState(136);
			basicType();
			setState(137);
			match(TK_PC_MIDA);
			setState(138);
			match(TK_PC_INT);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_INICI) {
				{
				setState(139);
				match(TK_PC_INICI);
				setState(140);
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
			setState(143);
			match(TK_PC_TUPLA);
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(144);
				basicType();
				setState(145);
				match(TK_IDENTIFIER);
				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PC_INT) | (1L << TK_PC_REAL) | (1L << TK_PC_CHAR) | (1L << TK_PC_BOOL))) != 0) );
			setState(151);
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
			setState(153);
			match(TK_PC_CONSTANTS);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PC_INT) | (1L << TK_PC_REAL) | (1L << TK_PC_CHAR) | (1L << TK_PC_BOOL))) != 0)) {
				{
				{
				setState(154);
				basicType();
				setState(155);
				match(TK_IDENTIFIER);
				setState(156);
				match(TK_OP_ASSIGN);
				{
				setState(157);
				constValue();
				}
				setState(158);
				match(TK_SEP_SEMICOLON);
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
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
			setState(167);
			match(TK_PC_VARIABLES);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & ((1L << (TK_PC_INT - 33)) | (1L << (TK_PC_REAL - 33)) | (1L << (TK_PC_CHAR - 33)) | (1L << (TK_PC_BOOL - 33)) | (1L << (TK_IDENTIFIER - 33)))) != 0)) {
				{
				{
				setState(168);
				type();
				setState(169);
				match(TK_IDENTIFIER);
				setState(170);
				match(TK_SEP_SEMICOLON);
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
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
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_PC_ACCIO || _la==TK_PC_FUNCIO) {
				{
				setState(181);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_PC_ACCIO:
					{
					setState(179);
					accioDec();
					}
					break;
				case TK_PC_FUNCIO:
					{
					setState(180);
					funcDec();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(185);
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
			setState(186);
			match(TK_PC_ACCIO);
			setState(187);
			match(TK_IDENTIFIER);
			setState(188);
			match(TK_OP_PAR_OPEN);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (TK_PC_PARAM_IN - 9)) | (1L << (TK_PC_PARAM_IO - 9)) | (1L << (TK_PC_INT - 9)) | (1L << (TK_PC_REAL - 9)) | (1L << (TK_PC_CHAR - 9)) | (1L << (TK_PC_BOOL - 9)) | (1L << (TK_IDENTIFIER - 9)))) != 0)) {
				{
				setState(189);
				params();
				}
			}

			setState(192);
			match(TK_OP_PAR_CLOSE);
			setState(193);
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
			setState(195);
			match(TK_PC_FUNCIO);
			setState(196);
			match(TK_IDENTIFIER);
			setState(197);
			match(TK_OP_PAR_OPEN);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (TK_PC_PARAM_IN - 9)) | (1L << (TK_PC_PARAM_IO - 9)) | (1L << (TK_PC_INT - 9)) | (1L << (TK_PC_REAL - 9)) | (1L << (TK_PC_CHAR - 9)) | (1L << (TK_PC_BOOL - 9)) | (1L << (TK_IDENTIFIER - 9)))) != 0)) {
				{
				setState(198);
				params();
				}
			}

			setState(201);
			match(TK_OP_PAR_CLOSE);
			setState(202);
			match(TK_PC_RETURN);
			setState(203);
			basicType();
			setState(204);
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
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_PARAM_IN || _la==TK_PC_PARAM_IO) {
				{
				setState(206);
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

			setState(209);
			type();
			setState(210);
			match(TK_IDENTIFIER);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_SEP_COMMA) {
				{
				{
				setState(211);
				match(TK_SEP_COMMA);
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PC_PARAM_IN || _la==TK_PC_PARAM_IO) {
					{
					setState(212);
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

				setState(215);
				type();
				setState(216);
				match(TK_IDENTIFIER);
				}
				}
				setState(222);
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
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_PC_ACCIO || _la==TK_PC_FUNCIO) {
				{
				setState(225);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_PC_ACCIO:
					{
					setState(223);
					accioImp();
					}
					break;
				case TK_PC_FUNCIO:
					{
					setState(224);
					funcImp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(229);
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
			setState(230);
			match(TK_PC_ACCIO);
			setState(231);
			match(TK_IDENTIFIER);
			setState(232);
			match(TK_OP_PAR_OPEN);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (TK_PC_PARAM_IN - 9)) | (1L << (TK_PC_PARAM_IO - 9)) | (1L << (TK_PC_INT - 9)) | (1L << (TK_PC_REAL - 9)) | (1L << (TK_PC_CHAR - 9)) | (1L << (TK_PC_BOOL - 9)) | (1L << (TK_IDENTIFIER - 9)))) != 0)) {
				{
				setState(233);
				params();
				}
			}

			setState(236);
			match(TK_OP_PAR_CLOSE);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_VARIABLES) {
				{
				setState(237);
				varBlock();
				}
			}

			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
				{
				{
				setState(240);
				sentence();
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246);
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
			setState(248);
			match(TK_PC_FUNCIO);
			setState(249);
			match(TK_IDENTIFIER);
			setState(250);
			match(TK_OP_PAR_OPEN);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (TK_PC_PARAM_IN - 9)) | (1L << (TK_PC_PARAM_IO - 9)) | (1L << (TK_PC_INT - 9)) | (1L << (TK_PC_REAL - 9)) | (1L << (TK_PC_CHAR - 9)) | (1L << (TK_PC_BOOL - 9)) | (1L << (TK_IDENTIFIER - 9)))) != 0)) {
				{
				setState(251);
				params();
				}
			}

			setState(254);
			match(TK_OP_PAR_CLOSE);
			setState(255);
			match(TK_PC_RETURN);
			setState(256);
			basicType();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_VARIABLES) {
				{
				setState(257);
				varBlock();
				}
			}

			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
				{
				{
				setState(260);
				sentence();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			match(TK_PC_RETURN);
			setState(267);
			expr();
			setState(268);
			match(TK_SEP_SEMICOLON);
			setState(269);
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
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				match(TK_IDENTIFIER);
				}
				break;
			case TK_PC_INT:
			case TK_PC_REAL:
			case TK_PC_CHAR:
			case TK_PC_BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
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
			setState(275);
			match(TK_IDENTIFIER);
			setState(276);
			match(TK_OP_ASSIGN);
			setState(277);
			expr();
			setState(278);
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
			setState(280);
			match(TK_PC_SI);
			setState(281);
			expr();
			setState(282);
			match(TK_PC_LLAVORS);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
				{
				{
				setState(283);
				sentence();
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_ALTRAMENT) {
				{
				setState(289);
				match(TK_PC_ALTRAMENT);
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
					{
					{
					setState(290);
					sentence();
					}
					}
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(298);
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
			setState(300);
			match(TK_PC_PER);
			setState(301);
			match(TK_IDENTIFIER);
			setState(302);
			match(TK_PC_DE);
			setState(303);
			expr();
			setState(304);
			match(TK_PC_FINS);
			setState(305);
			expr();
			setState(306);
			match(TK_PC_FER);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
				{
				{
				setState(307);
				sentence();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(313);
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
			setState(315);
			match(TK_PC_MENTRE);
			setState(316);
			expr();
			setState(317);
			match(TK_PC_FER);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
				{
				{
				setState(318);
				sentence();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
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
			setState(326);
			match(TK_IDENTIFIER);
			setState(327);
			match(TK_OP_PAR_OPEN);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (TK_CONST_CHAR - 39)) | (1L << (TK_CONST_REAL - 39)) | (1L << (TK_CONST_BOOL - 39)) | (1L << (TK_CONST_INT - 39)) | (1L << (TK_OP_MINUS - 39)) | (1L << (TK_OP_NEG - 39)) | (1L << (TK_OP_PAR_OPEN - 39)) | (1L << (TK_IDENTIFIER - 39)))) != 0)) {
				{
				setState(328);
				expr();
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_SEP_COMMA) {
					{
					{
					setState(329);
					match(TK_SEP_COMMA);
					setState(330);
					expr();
					}
					}
					setState(335);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(338);
			match(TK_OP_PAR_CLOSE);
			setState(339);
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
			setState(341);
			match(TK_PC_READ);
			setState(342);
			match(TK_OP_PAR_OPEN);
			setState(343);
			match(TK_IDENTIFIER);
			setState(344);
			match(TK_OP_PAR_CLOSE);
			setState(345);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TK_OP_PAR_CLOSE() { return getToken(gramParser.TK_OP_PAR_CLOSE, 0); }
		public TerminalNode TK_SEP_SEMICOLON() { return getToken(gramParser.TK_SEP_SEMICOLON, 0); }
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
			setState(347);
			match(TK_PC_WRITE);
			setState(348);
			match(TK_OP_PAR_OPEN);
			setState(349);
			expr();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_SEP_COMMA) {
				{
				{
				setState(350);
				match(TK_SEP_COMMA);
				setState(351);
				expr();
				}
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(357);
			match(TK_OP_PAR_CLOSE);
			setState(358);
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
		enterRule(_localctx, 52, RULE_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(360);
				assign();
				}
				break;
			case 2:
				{
				setState(361);
				if_rule();
				}
				break;
			case 3:
				{
				setState(362);
				for_rule();
				}
				break;
			case 4:
				{
				setState(363);
				while_rule();
				}
				break;
			case 5:
				{
				setState(364);
				accio();
				}
				break;
			case 6:
				{
				setState(365);
				read();
				}
				break;
			case 7:
				{
				setState(366);
				write();
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
		enterRule(_localctx, 54, RULE_constValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
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
		enterRule(_localctx, 56, RULE_tuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(TK_IDENTIFIER);
			setState(372);
			match(TK_OP_TUPLE);
			setState(373);
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
		enterRule(_localctx, 58, RULE_vector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(TK_IDENTIFIER);
			setState(376);
			match(TK_OP_VECTOR_OPEN);
			setState(377);
			expr();
			setState(378);
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
		enterRule(_localctx, 60, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(TK_IDENTIFIER);
			setState(381);
			match(TK_OP_PAR_OPEN);
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (TK_CONST_CHAR - 39)) | (1L << (TK_CONST_REAL - 39)) | (1L << (TK_CONST_BOOL - 39)) | (1L << (TK_CONST_INT - 39)) | (1L << (TK_OP_MINUS - 39)) | (1L << (TK_OP_NEG - 39)) | (1L << (TK_OP_PAR_OPEN - 39)) | (1L << (TK_IDENTIFIER - 39)))) != 0)) {
				{
				setState(382);
				expr();
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_SEP_COMMA) {
					{
					{
					setState(383);
					match(TK_SEP_COMMA);
					setState(384);
					expr();
					}
					}
					setState(389);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(392);
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
		enterRule(_localctx, 62, RULE_expr);
		try {
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(394);
				logicsDown();
				setState(395);
				match(TK_OP_QUESTION_MARK);
				setState(396);
				expr();
				setState(397);
				match(TK_OP_COLON);
				setState(398);
				expr();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
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
		enterRule(_localctx, 64, RULE_logicsDown);
		int _la;
		try {
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(403);
				logicUp();
				setState(404);
				_la = _input.LA(1);
				if ( !(_la==TK_OP_AND || _la==TK_OP_OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(405);
				logicsDown();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
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
		enterRule(_localctx, 66, RULE_logicUp);
		int _la;
		try {
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(410);
				sum();
				setState(411);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_OP_EQ) | (1L << TK_OP_DIFF) | (1L << TK_OP_GT) | (1L << TK_OP_LT) | (1L << TK_OP_LOET) | (1L << TK_OP_GOET))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(412);
				logicUp();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
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
		enterRule(_localctx, 68, RULE_sum);
		int _la;
		try {
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(417);
				mult();
				setState(418);
				_la = _input.LA(1);
				if ( !(_la==TK_OP_SUMA || _la==TK_OP_RESTA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(419);
				sum();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
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
		enterRule(_localctx, 70, RULE_mult);
		int _la;
		try {
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(424);
				neg();
				setState(425);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_OP_MULT) | (1L << TK_OP_REALDIV) | (1L << TK_OP_INTDIV) | (1L << TK_OP_MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(426);
				mult();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
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
		enterRule(_localctx, 72, RULE_neg);
		int _la;
		try {
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_OP_MINUS:
			case TK_OP_NEG:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(431);
				_la = _input.LA(1);
				if ( !(_la==TK_OP_MINUS || _la==TK_OP_NEG) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(432);
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
				setState(433);
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
		enterRule(_localctx, 74, RULE_value);
		try {
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				constValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				match(TK_IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(438);
				tuple();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(439);
				vector();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(440);
				func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(441);
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
		enterRule(_localctx, 76, RULE_parenthesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(TK_OP_PAR_OPEN);
			setState(445);
			expr();
			setState(446);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3I\u01c3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\6\2R\n\2\r\2\16"+
		"\2S\3\3\6\3W\n\3\r\3\16\3X\3\3\3\3\3\4\5\4^\n\4\3\4\5\4a\n\4\3\4\5\4d"+
		"\n\4\3\4\3\4\5\4h\n\4\3\5\3\5\5\5l\n\5\3\5\7\5o\n\5\f\5\16\5r\13\5\3\5"+
		"\3\5\3\6\3\6\7\6x\n\6\f\6\16\6{\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u0084"+
		"\n\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0090\n\t\3\n\3\n\3\n"+
		"\3\n\6\n\u0096\n\n\r\n\16\n\u0097\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13\u00a3\n\13\f\13\16\13\u00a6\13\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\7\f\u00af\n\f\f\f\16\f\u00b2\13\f\3\f\3\f\3\r\3\r\7\r\u00b8\n\r\f"+
		"\r\16\r\u00bb\13\r\3\16\3\16\3\16\3\16\5\16\u00c1\n\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\5\17\u00ca\n\17\3\17\3\17\3\17\3\17\3\17\3\20\5\20"+
		"\u00d2\n\20\3\20\3\20\3\20\3\20\5\20\u00d8\n\20\3\20\3\20\3\20\7\20\u00dd"+
		"\n\20\f\20\16\20\u00e0\13\20\3\21\3\21\7\21\u00e4\n\21\f\21\16\21\u00e7"+
		"\13\21\3\22\3\22\3\22\3\22\5\22\u00ed\n\22\3\22\3\22\5\22\u00f1\n\22\3"+
		"\22\7\22\u00f4\n\22\f\22\16\22\u00f7\13\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\5\23\u00ff\n\23\3\23\3\23\3\23\3\23\5\23\u0105\n\23\3\23\7\23\u0108"+
		"\n\23\f\23\16\23\u010b\13\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\5\24\u0114"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u011f\n\26\f\26"+
		"\16\26\u0122\13\26\3\26\3\26\7\26\u0126\n\26\f\26\16\26\u0129\13\26\5"+
		"\26\u012b\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27"+
		"\u0137\n\27\f\27\16\27\u013a\13\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30"+
		"\u0142\n\30\f\30\16\30\u0145\13\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\7\31\u014e\n\31\f\31\16\31\u0151\13\31\5\31\u0153\n\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\7\33\u0163\n\33"+
		"\f\33\16\33\u0166\13\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\5\34\u0172\n\34\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \7 \u0184\n \f \16 \u0187\13 \5 \u0189\n \3 \3 \3"+
		"!\3!\3!\3!\3!\3!\3!\5!\u0194\n!\3\"\3\"\3\"\3\"\3\"\5\"\u019b\n\"\3#\3"+
		"#\3#\3#\3#\5#\u01a2\n#\3$\3$\3$\3$\3$\5$\u01a9\n$\3%\3%\3%\3%\3%\5%\u01b0"+
		"\n%\3&\3&\3&\5&\u01b5\n&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01bd\n\'\3(\3(\3"+
		"(\3(\3(\3X\2)\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLN\2\13\2\3\3\2#&\3\2\13\f\3\2),\3\2;<\3\2\649\3\2-.\3\2"+
		"/\62\4\2\63\63::\2\u01d5\2Q\3\2\2\2\4V\3\2\2\2\6]\3\2\2\2\bi\3\2\2\2\n"+
		"u\3\2\2\2\f~\3\2\2\2\16\u0087\3\2\2\2\20\u0089\3\2\2\2\22\u0091\3\2\2"+
		"\2\24\u009b\3\2\2\2\26\u00a9\3\2\2\2\30\u00b9\3\2\2\2\32\u00bc\3\2\2\2"+
		"\34\u00c5\3\2\2\2\36\u00d1\3\2\2\2 \u00e5\3\2\2\2\"\u00e8\3\2\2\2$\u00fa"+
		"\3\2\2\2&\u0113\3\2\2\2(\u0115\3\2\2\2*\u011a\3\2\2\2,\u012e\3\2\2\2."+
		"\u013d\3\2\2\2\60\u0148\3\2\2\2\62\u0157\3\2\2\2\64\u015d\3\2\2\2\66\u0171"+
		"\3\2\2\28\u0173\3\2\2\2:\u0175\3\2\2\2<\u0179\3\2\2\2>\u017e\3\2\2\2@"+
		"\u0193\3\2\2\2B\u019a\3\2\2\2D\u01a1\3\2\2\2F\u01a8\3\2\2\2H\u01af\3\2"+
		"\2\2J\u01b4\3\2\2\2L\u01bc\3\2\2\2N\u01be\3\2\2\2PR\n\2\2\2QP\3\2\2\2"+
		"RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\3\3\2\2\2UW\7)\2\2VU\3\2\2\2WX\3\2\2\2"+
		"XY\3\2\2\2XV\3\2\2\2YZ\3\2\2\2Z[\7\2\2\3[\5\3\2\2\2\\^\5\n\6\2]\\\3\2"+
		"\2\2]^\3\2\2\2^`\3\2\2\2_a\5\30\r\2`_\3\2\2\2`a\3\2\2\2ac\3\2\2\2bd\5"+
		"\24\13\2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2eg\5\b\5\2fh\5 \21\2gf\3\2\2\2g"+
		"h\3\2\2\2h\7\3\2\2\2ik\7\4\2\2jl\5\26\f\2kj\3\2\2\2kl\3\2\2\2lp\3\2\2"+
		"\2mo\5\66\34\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2"+
		"\2\2st\7\5\2\2t\t\3\2\2\2uy\7\21\2\2vx\5\f\7\2wv\3\2\2\2x{\3\2\2\2yw\3"+
		"\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7\22\2\2}\13\3\2\2\2~\177\7I\2"+
		"\2\177\u0083\7>\2\2\u0080\u0084\5\16\b\2\u0081\u0084\5\20\t\2\u0082\u0084"+
		"\5\22\n\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2"+
		"\u0084\u0085\3\2\2\2\u0085\u0086\7H\2\2\u0086\r\3\2\2\2\u0087\u0088\t"+
		"\3\2\2\u0088\17\3\2\2\2\u0089\u008a\7\25\2\2\u008a\u008b\5\16\b\2\u008b"+
		"\u008c\7\26\2\2\u008c\u008f\7#\2\2\u008d\u008e\7\27\2\2\u008e\u0090\7"+
		"#\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\21\3\2\2\2\u0091\u0095"+
		"\7\23\2\2\u0092\u0093\5\16\b\2\u0093\u0094\7I\2\2\u0094\u0096\3\2\2\2"+
		"\u0095\u0092\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\24\2\2\u009a\23\3\2\2\2\u009b"+
		"\u00a4\7\r\2\2\u009c\u009d\5\16\b\2\u009d\u009e\7I\2\2\u009e\u009f\7B"+
		"\2\2\u009f\u00a0\58\35\2\u00a0\u00a1\7H\2\2\u00a1\u00a3\3\2\2\2\u00a2"+
		"\u009c\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7\16\2\2\u00a8"+
		"\25\3\2\2\2\u00a9\u00b0\7\17\2\2\u00aa\u00ab\5&\24\2\u00ab\u00ac\7I\2"+
		"\2\u00ac\u00ad\7H\2\2\u00ad\u00af\3\2\2\2\u00ae\u00aa\3\2\2\2\u00af\u00b2"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b3\u00b4\7\20\2\2\u00b4\27\3\2\2\2\u00b5\u00b8\5\32"+
		"\16\2\u00b6\u00b8\5\34\17\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8"+
		"\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\31\3\2\2"+
		"\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7\6\2\2\u00bd\u00be\7I\2\2\u00be\u00c0"+
		"\7C\2\2\u00bf\u00c1\5\36\20\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2"+
		"\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7D\2\2\u00c3\u00c4\7H\2\2\u00c4\33\3"+
		"\2\2\2\u00c5\u00c6\7\b\2\2\u00c6\u00c7\7I\2\2\u00c7\u00c9\7C\2\2\u00c8"+
		"\u00ca\5\36\20\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3"+
		"\2\2\2\u00cb\u00cc\7D\2\2\u00cc\u00cd\7\n\2\2\u00cd\u00ce\5\16\b\2\u00ce"+
		"\u00cf\7H\2\2\u00cf\35\3\2\2\2\u00d0\u00d2\t\4\2\2\u00d1\u00d0\3\2\2\2"+
		"\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\5&\24\2\u00d4\u00de"+
		"\7I\2\2\u00d5\u00d7\7G\2\2\u00d6\u00d8\t\4\2\2\u00d7\u00d6\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\5&\24\2\u00da\u00db\7I"+
		"\2\2\u00db\u00dd\3\2\2\2\u00dc\u00d5\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\37\3\2\2\2\u00e0\u00de\3\2\2"+
		"\2\u00e1\u00e4\5\"\22\2\u00e2\u00e4\5$\23\2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6!\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7\6\2\2\u00e9\u00ea"+
		"\7I\2\2\u00ea\u00ec\7C\2\2\u00eb\u00ed\5\36\20\2\u00ec\u00eb\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\7D\2\2\u00ef\u00f1\5\26"+
		"\f\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f5\3\2\2\2\u00f2"+
		"\u00f4\5\66\34\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3"+
		"\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u00f9\7\7\2\2\u00f9#\3\2\2\2\u00fa\u00fb\7\b\2\2\u00fb\u00fc\7I\2\2\u00fc"+
		"\u00fe\7C\2\2\u00fd\u00ff\5\36\20\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3"+
		"\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\7D\2\2\u0101\u0102\7\n\2\2\u0102"+
		"\u0104\5\16\b\2\u0103\u0105\5\26\f\2\u0104\u0103\3\2\2\2\u0104\u0105\3"+
		"\2\2\2\u0105\u0109\3\2\2\2\u0106\u0108\5\66\34\2\u0107\u0106\3\2\2\2\u0108"+
		"\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2"+
		"\2\2\u010b\u0109\3\2\2\2\u010c\u010d\7\n\2\2\u010d\u010e\5@!\2\u010e\u010f"+
		"\7H\2\2\u010f\u0110\7\t\2\2\u0110%\3\2\2\2\u0111\u0114\7I\2\2\u0112\u0114"+
		"\5\16\b\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114\'\3\2\2\2\u0115"+
		"\u0116\7I\2\2\u0116\u0117\7B\2\2\u0117\u0118\5@!\2\u0118\u0119\7H\2\2"+
		"\u0119)\3\2\2\2\u011a\u011b\7\30\2\2\u011b\u011c\5@!\2\u011c\u0120\7\31"+
		"\2\2\u011d\u011f\5\66\34\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u012a\3\2\2\2\u0122\u0120\3\2"+
		"\2\2\u0123\u0127\7\32\2\2\u0124\u0126\5\66\34\2\u0125\u0124\3\2\2\2\u0126"+
		"\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012b\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u012a\u0123\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012d\7\33\2\2\u012d+\3\2\2\2\u012e\u012f\7\34\2"+
		"\2\u012f\u0130\7I\2\2\u0130\u0131\7\35\2\2\u0131\u0132\5@!\2\u0132\u0133"+
		"\7\36\2\2\u0133\u0134\5@!\2\u0134\u0138\7\37\2\2\u0135\u0137\5\66\34\2"+
		"\u0136\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139"+
		"\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\7 \2\2\u013c"+
		"-\3\2\2\2\u013d\u013e\7!\2\2\u013e\u013f\5@!\2\u013f\u0143\7\37\2\2\u0140"+
		"\u0142\5\66\34\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3"+
		"\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0143\3\2\2\2\u0146"+
		"\u0147\7\"\2\2\u0147/\3\2\2\2\u0148\u0149\7I\2\2\u0149\u0152\7C\2\2\u014a"+
		"\u014f\5@!\2\u014b\u014c\7G\2\2\u014c\u014e\5@!\2\u014d\u014b\3\2\2\2"+
		"\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0153"+
		"\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u014a\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0155\7D\2\2\u0155\u0156\7H\2\2\u0156\61\3\2\2\2"+
		"\u0157\u0158\7\'\2\2\u0158\u0159\7C\2\2\u0159\u015a\7I\2\2\u015a\u015b"+
		"\7D\2\2\u015b\u015c\7H\2\2\u015c\63\3\2\2\2\u015d\u015e\7(\2\2\u015e\u015f"+
		"\7C\2\2\u015f\u0164\5@!\2\u0160\u0161\7G\2\2\u0161\u0163\5@!\2\u0162\u0160"+
		"\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0167\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0168\7D\2\2\u0168\u0169\7H\2"+
		"\2\u0169\65\3\2\2\2\u016a\u0172\5(\25\2\u016b\u0172\5*\26\2\u016c\u0172"+
		"\5,\27\2\u016d\u0172\5.\30\2\u016e\u0172\5\60\31\2\u016f\u0172\5\62\32"+
		"\2\u0170\u0172\5\64\33\2\u0171\u016a\3\2\2\2\u0171\u016b\3\2\2\2\u0171"+
		"\u016c\3\2\2\2\u0171\u016d\3\2\2\2\u0171\u016e\3\2\2\2\u0171\u016f\3\2"+
		"\2\2\u0171\u0170\3\2\2\2\u0172\67\3\2\2\2\u0173\u0174\t\5\2\2\u01749\3"+
		"\2\2\2\u0175\u0176\7I\2\2\u0176\u0177\7A\2\2\u0177\u0178\7I\2\2\u0178"+
		";\3\2\2\2\u0179\u017a\7I\2\2\u017a\u017b\7?\2\2\u017b\u017c\5@!\2\u017c"+
		"\u017d\7@\2\2\u017d=\3\2\2\2\u017e\u017f\7I\2\2\u017f\u0188\7C\2\2\u0180"+
		"\u0185\5@!\2\u0181\u0182\7G\2\2\u0182\u0184\5@!\2\u0183\u0181\3\2\2\2"+
		"\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0189"+
		"\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u0180\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018a\u018b\7D\2\2\u018b?\3\2\2\2\u018c\u018d\5B\"\2\u018d"+
		"\u018e\7=\2\2\u018e\u018f\5@!\2\u018f\u0190\7>\2\2\u0190\u0191\5@!\2\u0191"+
		"\u0194\3\2\2\2\u0192\u0194\5B\"\2\u0193\u018c\3\2\2\2\u0193\u0192\3\2"+
		"\2\2\u0194A\3\2\2\2\u0195\u0196\5D#\2\u0196\u0197\t\6\2\2\u0197\u0198"+
		"\5B\"\2\u0198\u019b\3\2\2\2\u0199\u019b\5D#\2\u019a\u0195\3\2\2\2\u019a"+
		"\u0199\3\2\2\2\u019bC\3\2\2\2\u019c\u019d\5F$\2\u019d\u019e\t\7\2\2\u019e"+
		"\u019f\5D#\2\u019f\u01a2\3\2\2\2\u01a0\u01a2\5F$\2\u01a1\u019c\3\2\2\2"+
		"\u01a1\u01a0\3\2\2\2\u01a2E\3\2\2\2\u01a3\u01a4\5H%\2\u01a4\u01a5\t\b"+
		"\2\2\u01a5\u01a6\5F$\2\u01a6\u01a9\3\2\2\2\u01a7\u01a9\5H%\2\u01a8\u01a3"+
		"\3\2\2\2\u01a8\u01a7\3\2\2\2\u01a9G\3\2\2\2\u01aa\u01ab\5J&\2\u01ab\u01ac"+
		"\t\t\2\2\u01ac\u01ad\5H%\2\u01ad\u01b0\3\2\2\2\u01ae\u01b0\5J&\2\u01af"+
		"\u01aa\3\2\2\2\u01af\u01ae\3\2\2\2\u01b0I\3\2\2\2\u01b1\u01b2\t\n\2\2"+
		"\u01b2\u01b5\5J&\2\u01b3\u01b5\5L\'\2\u01b4\u01b1\3\2\2\2\u01b4\u01b3"+
		"\3\2\2\2\u01b5K\3\2\2\2\u01b6\u01bd\58\35\2\u01b7\u01bd\7I\2\2\u01b8\u01bd"+
		"\5:\36\2\u01b9\u01bd\5<\37\2\u01ba\u01bd\5> \2\u01bb\u01bd\5N(\2\u01bc"+
		"\u01b6\3\2\2\2\u01bc\u01b7\3\2\2\2\u01bc\u01b8\3\2\2\2\u01bc\u01b9\3\2"+
		"\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bb\3\2\2\2\u01bdM\3\2\2\2\u01be\u01bf"+
		"\7C\2\2\u01bf\u01c0\5@!\2\u01c0\u01c1\7D\2\2\u01c1O\3\2\2\2\62SX]`cgk"+
		"py\u0083\u008f\u0097\u00a4\u00b0\u00b7\u00b9\u00c0\u00c9\u00d1\u00d7\u00de"+
		"\u00e3\u00e5\u00ec\u00f0\u00f5\u00fe\u0104\u0109\u0113\u0120\u0127\u012a"+
		"\u0138\u0143\u014f\u0152\u0164\u0171\u0185\u0188\u0193\u019a\u01a1\u01a8"+
		"\u01af\u01b4\u01bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}