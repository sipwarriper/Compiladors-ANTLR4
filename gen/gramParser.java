// Generated from /home/klanc/Projects/Uni/4t/Compiladors/Compiladors-ANTLR4/src/gram.g4 by ANTLR 4.7

    import java.io.*;
    import javafx.util.Pair;
    import java.util.Vector;

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
		RULE_test = 0, RULE_program = 1, RULE_main = 2, RULE_typeBlock = 3, RULE_newType = 4, 
		RULE_basicType = 5, RULE_vectorDec = 6, RULE_tuplaDec = 7, RULE_constBlock = 8, 
		RULE_varBlock = 9, RULE_funcDecBlock = 10, RULE_accioDec = 11, RULE_funcDec = 12, 
		RULE_params = 13, RULE_funcImpBlock = 14, RULE_accioImp = 15, RULE_funcImp = 16, 
		RULE_type = 17, RULE_assign = 18, RULE_if_rule = 19, RULE_for_rule = 20, 
		RULE_while_rule = 21, RULE_accio = 22, RULE_read = 23, RULE_write = 24, 
		RULE_writeln = 25, RULE_sentence = 26, RULE_constValue = 27, RULE_tuple = 28, 
		RULE_vector = 29, RULE_func = 30, RULE_expr = 31, RULE_logicsDown = 32, 
		RULE_logicUp = 33, RULE_sum = 34, RULE_mult = 35, RULE_neg = 36, RULE_value = 37, 
		RULE_parenthesis = 38;
	public static final String[] ruleNames = {
		"test", "program", "main", "typeBlock", "newType", "basicType", "vectorDec", 
		"tuplaDec", "constBlock", "varBlock", "funcDecBlock", "accioDec", "funcDec", 
		"params", "funcImpBlock", "accioImp", "funcImp", "type", "assign", "if_rule", 
		"for_rule", "while_rule", "accio", "read", "write", "writeln", "sentence", 
		"constValue", "tuple", "vector", "func", "expr", "logicsDown", "logicUp", 
		"sum", "mult", "neg", "value", "parenthesis"
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
	    int contVar=0;
	    Bytecode x;
	    String classfile;
	    Long saltLinia;

	    //override method
	    public void notifyErrorListeners(Token offendingToken, String msg, RecognitionException e)    {
	        super.notifyErrorListeners(offendingToken,msg,e);
	        error=true;
	    }

	    public String toBytecodeType(char t){
	        switch(t){
	            case 'E': return "I";
	            case 'R': return "F";
	            case 'B': return "Z";
	            case 'C': return "C";
	            case 'S': return "S"; //nomes es poden definir constants sense nom
	            case 'V': return "V";
	            default :  System.out.println("Tipus incorrecte");
	                return "0";
	        }
	    }

	    public void setLANSClassFile(String cf){
	        classfile=cf.replace(".class","");;
	    }


	public gramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TestContext extends ParserRuleContext {
		public TerminalNode TK_CONST_REAL() { return getToken(gramParser.TK_CONST_REAL, 0); }
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitTest(this);
		}
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(TK_CONST_REAL);
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);

		    x=new Bytecode(classfile);
		    saltLinia=x.addConstant("S","\n");
		    Vector<Long> trad = new Vector<Long>(10);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_TIPUS) {
				{
				setState(80);
				typeBlock();
				}
			}

			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(83);
				funcDecBlock();
				}
				break;
			}
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_CONSTANTS) {
				{
				setState(86);
				constBlock();
				}
			}

			setState(89);
			main();
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(90);
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
		public SentenceContext s;
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
		enterRule(_localctx, 4, RULE_main);

		    Vector<Long> trad = new Vector<Long>(10);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(TK_PC_PROGRAMA);
			setState(94);
			match(TK_IDENTIFIER);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_VARIABLES) {
				{
				setState(95);
				varBlock();
				}
			}

			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_PC_WRITELN - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
				{
				{
				setState(98);
				((MainContext)_localctx).s = sentence();

				    if(!error) trad.addAll(((MainContext)_localctx).s.trad);

				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			match(TK_PC_FPROGRAMA);

			    if(!error){
			        trad.add(x.RETURN);
			        x.addMainCode(100L,new Long(contVar+3),trad);
			        x.write();
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
		enterRule(_localctx, 6, RULE_typeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(TK_PC_TIPUS);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_IDENTIFIER) {
				{
				{
				setState(110);
				newType();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
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
		public Token id;
		public BasicTypeContext reg;
		public VectorDecContext reg2;
		public TuplaDecContext reg3;
		public TerminalNode TK_OP_COLON() { return getToken(gramParser.TK_OP_COLON, 0); }
		public TerminalNode TK_SEP_SEMICOLON() { return getToken(gramParser.TK_SEP_SEMICOLON, 0); }
		public TerminalNode TK_IDENTIFIER() { return getToken(gramParser.TK_IDENTIFIER, 0); }
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
		enterRule(_localctx, 8, RULE_newType);
		Registre registre = new Registre();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			((NewTypeContext)_localctx).id = match(TK_IDENTIFIER);
			setState(119);
			match(TK_OP_COLON);
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PC_INT:
			case TK_PC_REAL:
			case TK_PC_CHAR:
			case TK_PC_BOOL:
				{
				setState(120);
				((NewTypeContext)_localctx).reg = basicType();
				((NewTypeContext)_localctx).reg.reg.putLexema((((NewTypeContext)_localctx).id!=null?((NewTypeContext)_localctx).id.getText():null)); registre = ((NewTypeContext)_localctx).reg.reg;
				}
				break;
			case TK_PC_VECTOR:
				{
				setState(123);
				((NewTypeContext)_localctx).reg2 = vectorDec();
				((NewTypeContext)_localctx).reg2.reg.putLexema((((NewTypeContext)_localctx).id!=null?((NewTypeContext)_localctx).id.getText():null)); registre = ((NewTypeContext)_localctx).reg2.reg;
				}
				break;
			case TK_PC_TUPLA:
				{
				setState(126);
				((NewTypeContext)_localctx).reg3 = tuplaDec();
				((NewTypeContext)_localctx).reg3.reg.putLexema((((NewTypeContext)_localctx).id!=null?((NewTypeContext)_localctx).id.getText():null)); registre = ((NewTypeContext)_localctx).reg3.reg;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(131);
			match(TK_SEP_SEMICOLON);

			        if(TS.existeix((((NewTypeContext)_localctx).id!=null?((NewTypeContext)_localctx).id.getText():null))){ //no podem tenir dos tipus amb el mateix nom!
			            error = true;
			            System.out.println("Error, dos tipus amb el mateix nom detectats a la linia " + (((NewTypeContext)_localctx).id!=null?((NewTypeContext)_localctx).id.getLine():0));
			        }
			        else{
			            TS.inserir((((NewTypeContext)_localctx).id!=null?((NewTypeContext)_localctx).id.getText():null), registre);
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

	public static class BasicTypeContext extends ParserRuleContext {
		public Registre reg;
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
		enterRule(_localctx, 10, RULE_basicType);
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PC_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(TK_PC_INT);
				 ((BasicTypeContext)_localctx).reg =  new Registre("", "enter"); 
				}
				break;
			case TK_PC_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(TK_PC_REAL);
				 ((BasicTypeContext)_localctx).reg =  new Registre("", "real"); 
				}
				break;
			case TK_PC_CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(TK_PC_CHAR);
				 ((BasicTypeContext)_localctx).reg =  new Registre("", "car"); 
				}
				break;
			case TK_PC_BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				match(TK_PC_BOOL);
				 ((BasicTypeContext)_localctx).reg =  new Registre("", "boolea"); 
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

	public static class VectorDecContext extends ParserRuleContext {
		public Registre reg;
		public BasicTypeContext bt;
		public TerminalNode TK_PC_VECTOR() { return getToken(gramParser.TK_PC_VECTOR, 0); }
		public TerminalNode TK_PC_MIDA() { return getToken(gramParser.TK_PC_MIDA, 0); }
		public List<TerminalNode> TK_CONST_INT() { return getTokens(gramParser.TK_CONST_INT); }
		public TerminalNode TK_CONST_INT(int i) {
			return getToken(gramParser.TK_CONST_INT, i);
		}
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
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
		enterRule(_localctx, 12, RULE_vectorDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(TK_PC_VECTOR);
			setState(145);
			((VectorDecContext)_localctx).bt = basicType();

			    ((VectorDecContext)_localctx).reg =  new Registre ("", ((VectorDecContext)_localctx).bt.reg.getTipus(), "vector");

			setState(147);
			match(TK_PC_MIDA);
			setState(148);
			match(TK_CONST_INT);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_INICI) {
				{
				setState(149);
				match(TK_PC_INICI);
				setState(150);
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
		public Registre reg;
		public BasicTypeContext bt;
		public Token id;
		public TerminalNode TK_PC_TUPLA() { return getToken(gramParser.TK_PC_TUPLA, 0); }
		public TerminalNode TK_PC_FTUPLA() { return getToken(gramParser.TK_PC_FTUPLA, 0); }
		public List<TerminalNode> TK_SEP_SEMICOLON() { return getTokens(gramParser.TK_SEP_SEMICOLON); }
		public TerminalNode TK_SEP_SEMICOLON(int i) {
			return getToken(gramParser.TK_SEP_SEMICOLON, i);
		}
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
	}

	public final TuplaDecContext tuplaDec() throws RecognitionException {
		TuplaDecContext _localctx = new TuplaDecContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tuplaDec);
		Vector<Pair<String,String>> camps = new Vector<Pair<String,String>>(10); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(TK_PC_TUPLA);
			setState(159); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(154);
				((TuplaDecContext)_localctx).bt = basicType();
				setState(155);
				((TuplaDecContext)_localctx).id = match(TK_IDENTIFIER);
				setState(156);
				match(TK_SEP_SEMICOLON);

				    camps.add(new Pair<>(((TuplaDecContext)_localctx).bt.reg.getTipus(), (((TuplaDecContext)_localctx).id!=null?((TuplaDecContext)_localctx).id.getText():null)));

				}
				}
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PC_INT) | (1L << TK_PC_REAL) | (1L << TK_PC_CHAR) | (1L << TK_PC_BOOL))) != 0) );
			setState(163);
			match(TK_PC_FTUPLA);

			    ((TuplaDecContext)_localctx).reg =  new Registre("", null, "tupla");
			    _localctx.reg.putCampsAddicionals(camps); 
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
		public BasicTypeContext bt;
		public Token id;
		public ConstValueContext c;
		public TerminalNode TK_PC_CONSTANTS() { return getToken(gramParser.TK_PC_CONSTANTS, 0); }
		public TerminalNode TK_PC_FCONSTANTS() { return getToken(gramParser.TK_PC_FCONSTANTS, 0); }
		public List<TerminalNode> TK_OP_ASSIGN() { return getTokens(gramParser.TK_OP_ASSIGN); }
		public TerminalNode TK_OP_ASSIGN(int i) {
			return getToken(gramParser.TK_OP_ASSIGN, i);
		}
		public List<TerminalNode> TK_SEP_SEMICOLON() { return getTokens(gramParser.TK_SEP_SEMICOLON); }
		public TerminalNode TK_SEP_SEMICOLON(int i) {
			return getToken(gramParser.TK_SEP_SEMICOLON, i);
		}
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
	}

	public final ConstBlockContext constBlock() throws RecognitionException {
		ConstBlockContext _localctx = new ConstBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(TK_PC_CONSTANTS);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PC_INT) | (1L << TK_PC_REAL) | (1L << TK_PC_CHAR) | (1L << TK_PC_BOOL))) != 0)) {
				{
				{
				setState(167);
				((ConstBlockContext)_localctx).bt = basicType();
				setState(168);
				((ConstBlockContext)_localctx).id = match(TK_IDENTIFIER);
				setState(169);
				match(TK_OP_ASSIGN);
				setState(170);
				((ConstBlockContext)_localctx).c = constValue();

				    char tipusCar = ((ConstBlockContext)_localctx).bt.reg.getTipus().toUpperCase().charAt(0);
				    if((tipusCar == ((ConstBlockContext)_localctx).c.tipus || (tipusCar == 'R' && ((ConstBlockContext)_localctx).c.tipus == 'E') ) && !TS.existeix((((ConstBlockContext)_localctx).id!=null?((ConstBlockContext)_localctx).id.getText():null))){
				        String cont = (((ConstBlockContext)_localctx).c!=null?_input.getText(((ConstBlockContext)_localctx).c.start,((ConstBlockContext)_localctx).c.stop):null);
				        if (tipusCar == 'C') cont = cont.replace("'","");
				        else if (tipusCar == 'B') cont = cont.equals("cert") ? "Cert" : "Fals" ;
				        Long idConst = x.addConstName((((ConstBlockContext)_localctx).id!=null?((ConstBlockContext)_localctx).id.getText():null), toBytecodeType(tipusCar), cont);
				        Registre registre = new Registre((((ConstBlockContext)_localctx).id!=null?((ConstBlockContext)_localctx).id.getText():null), ((ConstBlockContext)_localctx).bt.reg.getTipus(), "const", idConst);
				        TS.inserir((((ConstBlockContext)_localctx).id!=null?((ConstBlockContext)_localctx).id.getText():null), registre);
				    }
				    else if(TS.existeix((((ConstBlockContext)_localctx).id!=null?((ConstBlockContext)_localctx).id.getText():null))){
				        error = true;
				        System.out.println("Error, dos constants amb el mateix nom detectats a la linia " + (((ConstBlockContext)_localctx).id!=null?((ConstBlockContext)_localctx).id.getLine():0));
				    }
				    else{
				        error = true;
				        System.out.println("Error de tipus a la linia " + (((ConstBlockContext)_localctx).id!=null?((ConstBlockContext)_localctx).id.getLine():0) + " càsting il·legal");
				    }

				setState(172);
				match(TK_SEP_SEMICOLON);
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
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
		public TypeContext t;
		public Token id;
		public TerminalNode TK_PC_VARIABLES() { return getToken(gramParser.TK_PC_VARIABLES, 0); }
		public TerminalNode TK_PC_FVARIABLES() { return getToken(gramParser.TK_PC_FVARIABLES, 0); }
		public List<TerminalNode> TK_SEP_SEMICOLON() { return getTokens(gramParser.TK_SEP_SEMICOLON); }
		public TerminalNode TK_SEP_SEMICOLON(int i) {
			return getToken(gramParser.TK_SEP_SEMICOLON, i);
		}
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
		enterRule(_localctx, 18, RULE_varBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(TK_PC_VARIABLES);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & ((1L << (TK_PC_INT - 33)) | (1L << (TK_PC_REAL - 33)) | (1L << (TK_PC_CHAR - 33)) | (1L << (TK_PC_BOOL - 33)) | (1L << (TK_IDENTIFIER - 33)))) != 0)) {
				{
				{
				setState(182);
				((VarBlockContext)_localctx).t = type();
				setState(183);
				((VarBlockContext)_localctx).id = match(TK_IDENTIFIER);
				setState(184);
				match(TK_SEP_SEMICOLON);

				    if (((VarBlockContext)_localctx).t.reg!=null){
				        String tipus = null;
				        if (((VarBlockContext)_localctx).t.reg.getLexema().equals("")){ tipus = ((VarBlockContext)_localctx).t.reg.getTipus();}
				        else { tipus = ((VarBlockContext)_localctx).t.reg.getLexema();}
				        if(!TS.existeix((((VarBlockContext)_localctx).id!=null?((VarBlockContext)_localctx).id.getText():null))){
				            Registre registre = new Registre((((VarBlockContext)_localctx).id!=null?((VarBlockContext)_localctx).id.getText():null), tipus, "var", new Long(contVar));
				            contVar++;
				            TS.inserir((((VarBlockContext)_localctx).id!=null?((VarBlockContext)_localctx).id.getText():null), registre);
				        }
				        else{
				            error = true;
				            System.out.println("Error, no es pot declarar el mateix simbol (" + (((VarBlockContext)_localctx).id!=null?((VarBlockContext)_localctx).id.getText():null) + ") a la linia " + (((VarBlockContext)_localctx).id!=null?((VarBlockContext)_localctx).id.getLine():0));
				        }
				    }

				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
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
		enterRule(_localctx, 20, RULE_funcDecBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_PC_ACCIO || _la==TK_PC_FUNCIO) {
				{
				setState(196);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_PC_ACCIO:
					{
					setState(194);
					accioDec();
					}
					break;
				case TK_PC_FUNCIO:
					{
					setState(195);
					funcDec();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(200);
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
		enterRule(_localctx, 22, RULE_accioDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(TK_PC_ACCIO);
			setState(202);
			match(TK_IDENTIFIER);
			setState(203);
			match(TK_OP_PAR_OPEN);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PC_PARAM_IN) | (1L << TK_PC_PARAM_IO) | (1L << TK_PC_INT) | (1L << TK_PC_REAL) | (1L << TK_PC_CHAR) | (1L << TK_PC_BOOL))) != 0) || _la==TK_IDENTIFIER) {
				{
				setState(204);
				params();
				}
			}

			setState(207);
			match(TK_OP_PAR_CLOSE);
			setState(208);
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
		enterRule(_localctx, 24, RULE_funcDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(TK_PC_FUNCIO);
			setState(211);
			match(TK_IDENTIFIER);
			setState(212);
			match(TK_OP_PAR_OPEN);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PC_PARAM_IN) | (1L << TK_PC_PARAM_IO) | (1L << TK_PC_INT) | (1L << TK_PC_REAL) | (1L << TK_PC_CHAR) | (1L << TK_PC_BOOL))) != 0) || _la==TK_IDENTIFIER) {
				{
				setState(213);
				params();
				}
			}

			setState(216);
			match(TK_OP_PAR_CLOSE);
			setState(217);
			match(TK_PC_RETURN);
			setState(218);
			basicType();
			setState(219);
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
		enterRule(_localctx, 26, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_PARAM_IN || _la==TK_PC_PARAM_IO) {
				{
				setState(221);
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

			setState(224);
			type();
			setState(225);
			match(TK_IDENTIFIER);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_SEP_COMMA) {
				{
				{
				setState(226);
				match(TK_SEP_COMMA);
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PC_PARAM_IN || _la==TK_PC_PARAM_IO) {
					{
					setState(227);
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

				setState(230);
				type();
				setState(231);
				match(TK_IDENTIFIER);
				}
				}
				setState(237);
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
		enterRule(_localctx, 28, RULE_funcImpBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_PC_ACCIO || _la==TK_PC_FUNCIO) {
				{
				setState(240);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_PC_ACCIO:
					{
					setState(238);
					accioImp();
					}
					break;
				case TK_PC_FUNCIO:
					{
					setState(239);
					funcImp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(244);
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
		enterRule(_localctx, 30, RULE_accioImp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(TK_PC_ACCIO);
			setState(246);
			match(TK_IDENTIFIER);
			setState(247);
			match(TK_OP_PAR_OPEN);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PC_PARAM_IN) | (1L << TK_PC_PARAM_IO) | (1L << TK_PC_INT) | (1L << TK_PC_REAL) | (1L << TK_PC_CHAR) | (1L << TK_PC_BOOL))) != 0) || _la==TK_IDENTIFIER) {
				{
				setState(248);
				params();
				}
			}

			setState(251);
			match(TK_OP_PAR_CLOSE);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_VARIABLES) {
				{
				setState(252);
				varBlock();
				}
			}

			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_PC_WRITELN - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
				{
				{
				setState(255);
				sentence();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
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
		enterRule(_localctx, 32, RULE_funcImp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(TK_PC_FUNCIO);
			setState(264);
			match(TK_IDENTIFIER);
			setState(265);
			match(TK_OP_PAR_OPEN);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PC_PARAM_IN) | (1L << TK_PC_PARAM_IO) | (1L << TK_PC_INT) | (1L << TK_PC_REAL) | (1L << TK_PC_CHAR) | (1L << TK_PC_BOOL))) != 0) || _la==TK_IDENTIFIER) {
				{
				setState(266);
				params();
				}
			}

			setState(269);
			match(TK_OP_PAR_CLOSE);
			setState(270);
			match(TK_PC_RETURN);
			setState(271);
			basicType();
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_VARIABLES) {
				{
				setState(272);
				varBlock();
				}
			}

			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_PC_WRITELN - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
				{
				{
				setState(275);
				sentence();
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281);
			match(TK_PC_RETURN);
			setState(282);
			expr();
			setState(283);
			match(TK_SEP_SEMICOLON);
			setState(284);
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
		public Registre reg;
		public Token id;
		public BasicTypeContext bt;
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
		enterRule(_localctx, 34, RULE_type);
		try {
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				((TypeContext)_localctx).id = match(TK_IDENTIFIER);

				        if(!TS.existeix((((TypeContext)_localctx).id!=null?((TypeContext)_localctx).id.getText():null))){
				            error = true;
				            System.out.println("Error, "+ (((TypeContext)_localctx).id!=null?((TypeContext)_localctx).id.getText():null) +" no existeix. Linia " + (((TypeContext)_localctx).id!=null?((TypeContext)_localctx).id.getLine():0));
				        }
				        else {
				            ((TypeContext)_localctx).reg =  TS.obtenir((((TypeContext)_localctx).id!=null?((TypeContext)_localctx).id.getText():null));
				        }
				    
				}
				break;
			case TK_PC_INT:
			case TK_PC_REAL:
			case TK_PC_CHAR:
			case TK_PC_BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				((TypeContext)_localctx).bt = basicType();
				((TypeContext)_localctx).reg =  ((TypeContext)_localctx).bt.reg;
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
		public Vector<Long> trad;
		public Token id;
		public ExprContext e;
		public TerminalNode TK_OP_ASSIGN() { return getToken(gramParser.TK_OP_ASSIGN, 0); }
		public TerminalNode TK_SEP_SEMICOLON() { return getToken(gramParser.TK_SEP_SEMICOLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_IDENTIFIER() { return getToken(gramParser.TK_IDENTIFIER, 0); }
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
		enterRule(_localctx, 36, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(293);
			((AssignContext)_localctx).id = match(TK_IDENTIFIER);
			}
			setState(294);
			match(TK_OP_ASSIGN);
			setState(295);
			((AssignContext)_localctx).e = expr();

			    if (!error){
			        if (!(TS.existeix((((AssignContext)_localctx).id!=null?((AssignContext)_localctx).id.getText():null)))){
			            error=true;
			            System.out.println("Variable " +(((AssignContext)_localctx).id!=null?((AssignContext)_localctx).id.getText():null)+  " inexistent a la linea " + (((AssignContext)_localctx).id!=null?((AssignContext)_localctx).id.getLine():0));
			        }
			        else if(!TS.obtenir((((AssignContext)_localctx).id!=null?((AssignContext)_localctx).id.getText():null)).getTipusLexema().equals("var")){
			            error=true;
			            System.out.println((((AssignContext)_localctx).id!=null?((AssignContext)_localctx).id.getText():null) +  " no es pot editar a la linea " + (((AssignContext)_localctx).id!=null?((AssignContext)_localctx).id.getLine():0));
			        }
			        else{
			            Registre r = TS.obtenir((((AssignContext)_localctx).id!=null?((AssignContext)_localctx).id.getText():null));
			            char tipus = r.getTipus().toUpperCase().charAt(0);
			            ((AssignContext)_localctx).trad =  ((AssignContext)_localctx).e.trad;
			            if(tipus == ((AssignContext)_localctx).e.tipus){
			                switch(tipus){
			                     case 'E':
			                        _localctx.trad.add(x.ISTORE);
			                        break;
			                     case 'R':
			                        _localctx.trad.add(x.FSTORE);
			                        break;
			                     case 'C':
			                        _localctx.trad.add(x.ISTORE);
			                        break;
			                     case 'B':
			                        _localctx.trad.add(x.ISTORE);
			                        break;
			                }
			                _localctx.trad.add(new Long(r.getAdreca()));
			            }
			            else if(tipus == 'R' && ((AssignContext)_localctx).e.tipus == 'E'){
			                _localctx.trad.add(x.FSTORE);
			                _localctx.trad.add(new Long(r.getAdreca()));
			            }
			            else{
			                error=true;
			                System.out.println("Error de tipus a la linea " + (((AssignContext)_localctx).id!=null?((AssignContext)_localctx).id.getLine():0));
			            }
			        }
			    }

			setState(297);
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
		public Vector<Long> trad;
		public Token s;
		public ExprContext t1;
		public SentenceContext sen;
		public SentenceContext sen2;
		public TerminalNode TK_PC_LLAVORS() { return getToken(gramParser.TK_PC_LLAVORS, 0); }
		public TerminalNode TK_PC_FSI() { return getToken(gramParser.TK_PC_FSI, 0); }
		public TerminalNode TK_PC_SI() { return getToken(gramParser.TK_PC_SI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_PC_ALTRAMENT() { return getToken(gramParser.TK_PC_ALTRAMENT, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
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
		enterRule(_localctx, 38, RULE_if_rule);

		    Vector<Long> trad2 = new Vector<Long>(10);
		    Vector<Long> trad3 = new Vector<Long>(10);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			((If_ruleContext)_localctx).s = match(TK_PC_SI);
			setState(300);
			((If_ruleContext)_localctx).t1 = expr();

			              if(((If_ruleContext)_localctx).t1.tipus != 'B'){ //la condició ha de ser booleana
			                  error = true;
			                  System.out.println("Error de tipus detectat a la linia " + (((If_ruleContext)_localctx).s!=null?((If_ruleContext)_localctx).s.getLine():0) + ":la condició del if ha de ser booleana." + (((If_ruleContext)_localctx).t1!=null?_input.getText(((If_ruleContext)_localctx).t1.start,((If_ruleContext)_localctx).t1.stop):null));
			              }
			          
			setState(302);
			match(TK_PC_LLAVORS);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_PC_WRITELN - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
				{
				{
				setState(303);
				((If_ruleContext)_localctx).sen = sentence();
				if(!error) trad2.addAll(((If_ruleContext)_localctx).sen.trad);
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_ALTRAMENT) {
				{
				setState(311);
				match(TK_PC_ALTRAMENT);
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_PC_WRITELN - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
					{
					{
					setState(312);
					((If_ruleContext)_localctx).sen2 = sentence();
					if(!error)trad3.addAll(((If_ruleContext)_localctx).sen2.trad);
					}
					}
					setState(319);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(322);
			match(TK_PC_FSI);

			                if(!error){
			                    ((If_ruleContext)_localctx).trad = ((If_ruleContext)_localctx).t1.trad;
			                    _localctx.trad.add(x.IFEQ);
			                    Long salt=trad2.size()+6L;
			                    _localctx.trad.add(x.nByte(salt,2));
			                    _localctx.trad.add(x.nByte(salt,1));
			                    _localctx.trad.addAll(trad2);
			                    _localctx.trad.add(x.GOTO);
			                    salt=trad3.size()+3L;
			                    _localctx.trad.add(x.nByte(salt,2));
			                    _localctx.trad.add(x.nByte(salt,1));
			                    _localctx.trad.addAll(trad3);
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

	public static class For_ruleContext extends ParserRuleContext {
		public Vector<Long> trad;
		public Token id;
		public ExprContext t1;
		public ExprContext t2;
		public SentenceContext sen;
		public TerminalNode TK_PC_PER() { return getToken(gramParser.TK_PC_PER, 0); }
		public TerminalNode TK_PC_DE() { return getToken(gramParser.TK_PC_DE, 0); }
		public TerminalNode TK_PC_FINS() { return getToken(gramParser.TK_PC_FINS, 0); }
		public TerminalNode TK_PC_FER() { return getToken(gramParser.TK_PC_FER, 0); }
		public TerminalNode TK_PC_FPER() { return getToken(gramParser.TK_PC_FPER, 0); }
		public TerminalNode TK_IDENTIFIER() { return getToken(gramParser.TK_IDENTIFIER, 0); }
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
		enterRule(_localctx, 40, RULE_for_rule);

		    Vector<Long> trad2 = new Vector<Long>(10);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(TK_PC_PER);
			setState(326);
			((For_ruleContext)_localctx).id = match(TK_IDENTIFIER);
			setState(327);
			match(TK_PC_DE);
			setState(328);
			((For_ruleContext)_localctx).t1 = expr();
			setState(329);
			match(TK_PC_FINS);
			setState(330);
			((For_ruleContext)_localctx).t2 = expr();

			        if(((For_ruleContext)_localctx).t1.tipus != 'E' || ((For_ruleContext)_localctx).t2.tipus !='E'){
			           error = true;
			           System.out.println("Error de tipus detectat a la linia " + (((For_ruleContext)_localctx).id!=null?((For_ruleContext)_localctx).id.getLine():0) + ":els valors dels intervals del for han de ser enters");
			       } else if(!TS.existeix((((For_ruleContext)_localctx).id!=null?((For_ruleContext)_localctx).id.getText():null))){
			           error = true;
			           System.out.println("Variable " + (((For_ruleContext)_localctx).id!=null?((For_ruleContext)_localctx).id.getText():null) + " no existeix. Linia " + (((For_ruleContext)_localctx).id!=null?((For_ruleContext)_localctx).id.getLine():0));

			       }
			   
			setState(332);
			match(TK_PC_FER);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_PC_WRITELN - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
				{
				{
				setState(333);
				((For_ruleContext)_localctx).sen = sentence();
				if(!error) trad2.addAll(((For_ruleContext)_localctx).sen.trad);
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(341);
			match(TK_PC_FPER);


			        if(!error){
			            Registre r = TS.obtenir((((For_ruleContext)_localctx).id!=null?((For_ruleContext)_localctx).id.getText():null));
			            char tipus = r.getTipus().toUpperCase().charAt(0);
			            ((For_ruleContext)_localctx).trad =  ((For_ruleContext)_localctx).t1.trad;
			            if(tipus == ((For_ruleContext)_localctx).t1.tipus && r.getTipusLexema().equals("var")){
			                _localctx.trad.add(x.ISTORE);
			                _localctx.trad.add(new Long(r.getAdreca()));

			                _localctx.trad.add(x.ILOAD);
			                _localctx.trad.add(new Long(r.getAdreca()));

			                _localctx.trad.addAll(((For_ruleContext)_localctx).t2.trad);

			                _localctx.trad.add(x.IF_ICMPGT);
			                Long salt=trad2.size()+9L;
			                _localctx.trad.add(x.nByte(salt,2));
			                _localctx.trad.add(x.nByte(salt,1));
			                _localctx.trad.addAll(trad2);
			                _localctx.trad.add(x.IINC);
			                _localctx.trad.add(new Long(r.getAdreca()));
			                _localctx.trad.add(1L);
			                //salt=0L-_localctx.trad.size()+((For_ruleContext)_localctx).t1.trad.size()+3L;
			                salt=0L-trad2.size()-((For_ruleContext)_localctx).t2.trad.size()-8L;
			                _localctx.trad.add(x.GOTO);
			                _localctx.trad.add(x.nByte(salt,2));
			                _localctx.trad.add(x.nByte(salt,1));
			                //APANYO
			                _localctx.trad.add(x.IINC);
			                _localctx.trad.add(new Long(r.getAdreca()));
			                _localctx.trad.add(-1L);


			            }
			            else{
			                error=true;
			                System.out.println("Error de tipus a la linea " + (((For_ruleContext)_localctx).id!=null?((For_ruleContext)_localctx).id.getLine():0));
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

	public static class While_ruleContext extends ParserRuleContext {
		public Vector<Long> trad;
		public Token s;
		public ExprContext t1;
		public SentenceContext sen;
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
		enterRule(_localctx, 42, RULE_while_rule);

		    Vector<Long> trad2 = new Vector<Long>(10);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			((While_ruleContext)_localctx).s = match(TK_PC_MENTRE);
			setState(345);
			((While_ruleContext)_localctx).t1 = expr();

			          if(((While_ruleContext)_localctx).t1.tipus != 'B'){ //la condició ha de ser booleana
			              error = true;
			              System.out.println("Error de tipus detectat a la linia " + (((While_ruleContext)_localctx).s!=null?((While_ruleContext)_localctx).s.getLine():0) + ":la condició del while ha de ser booleana.");
			          }
			      
			setState(347);
			match(TK_PC_FER);
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_PC_WRITELN - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
				{
				{
				setState(348);
				((While_ruleContext)_localctx).sen = sentence();
				 if(!error) trad2.addAll(((While_ruleContext)_localctx).sen.trad);
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(356);
			match(TK_PC_FMENTRE);

			         if(!error){
			                ((While_ruleContext)_localctx).trad = ((While_ruleContext)_localctx).t1.trad;
			                _localctx.trad.add(x.IFEQ);
			                Long salt=trad2.size()+6L;
			                _localctx.trad.add(x.nByte(salt,2));
			                _localctx.trad.add(x.nByte(salt,1));
			                _localctx.trad.addAll(trad2);
			                salt=0L-_localctx.trad.size();
			                _localctx.trad.add(x.GOTO);
			                _localctx.trad.add(x.nByte(salt,2));
			                _localctx.trad.add(x.nByte(salt,1));
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
		enterRule(_localctx, 44, RULE_accio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(TK_IDENTIFIER);
			setState(360);
			match(TK_OP_PAR_OPEN);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (TK_CONST_CHAR - 40)) | (1L << (TK_CONST_REAL - 40)) | (1L << (TK_CONST_BOOL - 40)) | (1L << (TK_CONST_INT - 40)) | (1L << (TK_OP_MINUS - 40)) | (1L << (TK_OP_NEG - 40)) | (1L << (TK_OP_PAR_OPEN - 40)) | (1L << (TK_IDENTIFIER - 40)))) != 0)) {
				{
				setState(361);
				expr();
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_SEP_COMMA) {
					{
					{
					setState(362);
					match(TK_SEP_COMMA);
					setState(363);
					expr();
					}
					}
					setState(368);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(371);
			match(TK_OP_PAR_CLOSE);
			setState(372);
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
		public Vector<Long> trad;
		public Token id;
		public TerminalNode TK_PC_READ() { return getToken(gramParser.TK_PC_READ, 0); }
		public TerminalNode TK_OP_PAR_OPEN() { return getToken(gramParser.TK_OP_PAR_OPEN, 0); }
		public TerminalNode TK_OP_PAR_CLOSE() { return getToken(gramParser.TK_OP_PAR_CLOSE, 0); }
		public TerminalNode TK_SEP_SEMICOLON() { return getToken(gramParser.TK_SEP_SEMICOLON, 0); }
		public TerminalNode TK_IDENTIFIER() { return getToken(gramParser.TK_IDENTIFIER, 0); }
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
		enterRule(_localctx, 46, RULE_read);

		    ((ReadContext)_localctx).trad =  new Vector<Long>(10);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(TK_PC_READ);
			setState(375);
			match(TK_OP_PAR_OPEN);
			setState(376);
			((ReadContext)_localctx).id = match(TK_IDENTIFIER);

			    if(TS.existeix((((ReadContext)_localctx).id!=null?((ReadContext)_localctx).id.getText():null))){
			        Registre reg = TS.obtenir((((ReadContext)_localctx).id!=null?((ReadContext)_localctx).id.getText():null));
			        if(TS.obtenir((((ReadContext)_localctx).id!=null?((ReadContext)_localctx).id.getText():null)).getTipusLexema().equals("var")){
			            char tipus = reg.getTipus().toUpperCase().charAt(0);
			            if(reg.getTipus().equals("enter") || reg.getTipus().equals("real") || reg.getTipus().equals("car") || reg.getTipus().equals("boolea")){
			                tipus = reg.getTipus().toUpperCase().charAt(0);
			            }
			            else{ //tipus es un alias
			                Registre reg2 = TS.obtenir(reg.getTipus());
			                tipus = reg2.getTipus().toUpperCase().charAt(0);
			            }
			            _localctx.trad.add(x.INVOKESTATIC);
			            switch(tipus){
			                 case 'E':
			                     _localctx.trad.add(x.nByte(x.mGetInt,2));
			                     _localctx.trad.add(x.nByte(x.mGetInt,1));
			                     _localctx.trad.add(x.ISTORE);
			                     break;
			                 case 'R':
			                     _localctx.trad.add(x.nByte(x.mGetFloat,2));
			                     _localctx.trad.add(x.nByte(x.mGetFloat,1));
			                     _localctx.trad.add(x.FSTORE);
			                     break;
			                 case 'C':
			                     _localctx.trad.add(x.nByte(x.mGetChar,2));
			                     _localctx.trad.add(x.nByte(x.mGetChar,1));
			                     _localctx.trad.add(x.ISTORE);
			                     break;
			                 case 'B':
			                     _localctx.trad.add(x.nByte(x.mGetBoolean,2));
			                     _localctx.trad.add(x.nByte(x.mGetBoolean,1));
			                     _localctx.trad.add(x.ISTORE);
			                     break;
			            }
			            _localctx.trad.add(new Long(reg.getAdreca()));
			        }
			        else{
			              error=true;
			              System.out.println((((ReadContext)_localctx).id!=null?((ReadContext)_localctx).id.getText():null) +  " no es pot editar a la linea " + (((ReadContext)_localctx).id!=null?((ReadContext)_localctx).id.getLine():0));
			        }
			    } else{
			            error=true;
			            System.out.println("Variable " +(((ReadContext)_localctx).id!=null?((ReadContext)_localctx).id.getText():null)+  " inexistent a la linea " + (((ReadContext)_localctx).id!=null?((ReadContext)_localctx).id.getLine():0));

			    }

			setState(378);
			match(TK_OP_PAR_CLOSE);
			setState(379);
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
		public Vector<Long> trad;
		public ExprContext e;
		public Token s;
		public ExprContext e1;
		public Token s1;
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
		enterRule(_localctx, 48, RULE_write);

		          ((WriteContext)_localctx).trad =  new Vector<Long>(10);
		      
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(TK_PC_WRITE);
			setState(382);
			match(TK_OP_PAR_OPEN);
			setState(388);
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
				setState(383);
				((WriteContext)_localctx).e = expr();

				             if(!error){
				                 ((WriteContext)_localctx).trad =  ((WriteContext)_localctx).e.trad;
				                 _localctx.trad.add(x.INVOKESTATIC);
				                 switch(((WriteContext)_localctx).e.tipus){
				                     case 'E':
				                        _localctx.trad.add(x.nByte(x.mPutInt,2));
				                        _localctx.trad.add(x.nByte(x.mPutInt,1));
				                        break;
				                     case 'R':
				                        _localctx.trad.add(x.nByte(x.mPutFloat,2));
				                        _localctx.trad.add(x.nByte(x.mPutFloat,1));
				                        break;
				                     case 'C':
				                        _localctx.trad.add(x.nByte(x.mPutChar,2));
				                        _localctx.trad.add(x.nByte(x.mPutChar,1));
				                        break;
				                     case 'B':
				                        //_localctx.trad.add(x.I2B); //castajem enter a byte
				                        _localctx.trad.add(x.nByte(x.mPutBoolean,2));
				                        _localctx.trad.add(x.nByte(x.mPutBoolean,1));
				                        break;
				                 }
				             }
				      
				}
				break;
			case TK_STRING_LITERAL:
				{
				setState(386);
				((WriteContext)_localctx).s = match(TK_STRING_LITERAL);

				             Long tempString = x.addConstant("S",(((WriteContext)_localctx).s!=null?((WriteContext)_localctx).s.getText():null).replace("\"", ""));
				             _localctx.trad.add(x.LDC_W); //carragem la string a la pila
				             _localctx.trad.add(x.nByte(tempString,2));
				             _localctx.trad.add(x.nByte(tempString,1));
				             _localctx.trad.add(x.INVOKESTATIC);
				             _localctx.trad.add(x.nByte(x.mPutString,2));
				             _localctx.trad.add(x.nByte(x.mPutString,1));
				      
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_SEP_COMMA) {
				{
				{
				setState(390);
				match(TK_SEP_COMMA);
				setState(396);
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
					setState(391);
					((WriteContext)_localctx).e1 = expr();

					            if(!error){
					                ((WriteContext)_localctx).trad =  ((WriteContext)_localctx).e1.trad;
					                _localctx.trad.add(x.INVOKESTATIC);
					                switch(((WriteContext)_localctx).e1.tipus){
					                     case 'E':
					                        _localctx.trad.add(x.nByte(x.mPutInt,2));
					                        _localctx.trad.add(x.nByte(x.mPutInt,1));
					                        break;
					                     case 'R':
					                        _localctx.trad.add(x.nByte(x.mPutFloat,2));
					                        _localctx.trad.add(x.nByte(x.mPutFloat,1));
					                        break;
					                     case 'C':
					                        _localctx.trad.add(x.nByte(x.mPutChar,2));
					                        _localctx.trad.add(x.nByte(x.mPutChar,1));
					                        break;
					                     case 'B':
					                        _localctx.trad.add(x.nByte(x.mPutBoolean,2));
					                        _localctx.trad.add(x.nByte(x.mPutBoolean,1));
					                        break;
					                }
					            }
					      
					}
					break;
				case TK_STRING_LITERAL:
					{
					setState(394);
					((WriteContext)_localctx).s1 = match(TK_STRING_LITERAL);

					              Long tempString = x.addConstant("S",(((WriteContext)_localctx).s1!=null?((WriteContext)_localctx).s1.getText():null).replace("\"", ""));
					              _localctx.trad.add(x.LDC_W); //carragem la string a la pila
					              _localctx.trad.add(x.nByte(tempString,2));
					              _localctx.trad.add(x.nByte(tempString,1));
					              _localctx.trad.add(x.INVOKESTATIC);
					              _localctx.trad.add(x.nByte(x.mPutString,2));
					              _localctx.trad.add(x.nByte(x.mPutString,1));
					      
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(403);
			match(TK_OP_PAR_CLOSE);
			setState(404);
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
		public Vector<Long> trad;
		public ExprContext e;
		public Token s;
		public ExprContext e1;
		public Token s1;
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
		enterRule(_localctx, 50, RULE_writeln);

		    ((WritelnContext)_localctx).trad =  new Vector<Long>(10);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(TK_PC_WRITELN);
			setState(407);
			match(TK_OP_PAR_OPEN);
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (TK_CONST_CHAR - 40)) | (1L << (TK_CONST_REAL - 40)) | (1L << (TK_CONST_BOOL - 40)) | (1L << (TK_CONST_INT - 40)) | (1L << (TK_OP_MINUS - 40)) | (1L << (TK_OP_NEG - 40)) | (1L << (TK_OP_PAR_OPEN - 40)) | (1L << (TK_STRING_LITERAL - 40)) | (1L << (TK_IDENTIFIER - 40)))) != 0)) {
				{
				setState(413);
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
					setState(408);
					((WritelnContext)_localctx).e = expr();

					        if(!error){
					            ((WritelnContext)_localctx).trad =  ((WritelnContext)_localctx).e.trad;
					            _localctx.trad.add(x.INVOKESTATIC);
					            switch(((WritelnContext)_localctx).e.tipus){
					                 case 'E':
					                    _localctx.trad.add(x.nByte(x.mPutInt,2));
					                    _localctx.trad.add(x.nByte(x.mPutInt,1));
					                    break;
					                 case 'R':
					                    _localctx.trad.add(x.nByte(x.mPutFloat,2));
					                    _localctx.trad.add(x.nByte(x.mPutFloat,1));
					                    break;
					                 case 'C':
					                    _localctx.trad.add(x.nByte(x.mPutChar,2));
					                    _localctx.trad.add(x.nByte(x.mPutChar,1));
					                    break;
					                 case 'B':
					                    _localctx.trad.add(x.nByte(x.mPutBoolean,2));
					                    _localctx.trad.add(x.nByte(x.mPutBoolean,1));
					                    break;
					            }
					        }

					}
					break;
				case TK_STRING_LITERAL:
					{
					setState(411);
					((WritelnContext)_localctx).s = match(TK_STRING_LITERAL);

					    Long tempString = x.addConstant("S",(((WritelnContext)_localctx).s!=null?((WritelnContext)_localctx).s.getText():null).replace("\"", ""));
					    _localctx.trad.add(x.LDC_W); //carragem la string a la pila
					    _localctx.trad.add(x.nByte(tempString,2));
					    _localctx.trad.add(x.nByte(tempString,1));
					    _localctx.trad.add(x.INVOKESTATIC);
					    _localctx.trad.add(x.nByte(x.mPutString,2));
					    _localctx.trad.add(x.nByte(x.mPutString,1));

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_SEP_COMMA) {
					{
					{
					setState(415);
					match(TK_SEP_COMMA);
					setState(421);
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
						setState(416);
						((WritelnContext)_localctx).e1 = expr();

						        if(!error){
						            ((WritelnContext)_localctx).trad =  ((WritelnContext)_localctx).e1.trad;
						            _localctx.trad.add(x.INVOKESTATIC);
						            switch(((WritelnContext)_localctx).e1.tipus){
						                 case 'E':
						                    _localctx.trad.add(x.nByte(x.mPutInt,2));
						                    _localctx.trad.add(x.nByte(x.mPutInt,1));
						                    break;
						                 case 'R':
						                    _localctx.trad.add(x.nByte(x.mPutFloat,2));
						                    _localctx.trad.add(x.nByte(x.mPutFloat,1));
						                    break;
						                 case 'C':
						                    _localctx.trad.add(x.nByte(x.mPutChar,2));
						                    _localctx.trad.add(x.nByte(x.mPutChar,1));
						                    break;
						                 case 'B':
						                    _localctx.trad.add(x.I2B); //castajem enter a boolea
						                    _localctx.trad.add(x.nByte(x.mPutBoolean,2));
						                    _localctx.trad.add(x.nByte(x.mPutBoolean,1));
						                    break;
						            }
						        }

						}
						break;
					case TK_STRING_LITERAL:
						{
						setState(419);
						((WritelnContext)_localctx).s1 = match(TK_STRING_LITERAL);

						    Long tempString = x.addConstant("S",(((WritelnContext)_localctx).s1!=null?((WritelnContext)_localctx).s1.getText():null).replace("\"", ""));
						    _localctx.trad.add(x.LDC_W); //carragem la string a la pila
						    _localctx.trad.add(x.nByte(tempString,2));
						    _localctx.trad.add(x.nByte(tempString,1));
						    _localctx.trad.add(x.INVOKESTATIC);
						    _localctx.trad.add(x.nByte(x.mPutString,2));
						    _localctx.trad.add(x.nByte(x.mPutString,1));

						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(427);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(430);
			match(TK_OP_PAR_CLOSE);
			setState(431);
			match(TK_SEP_SEMICOLON);
			}
			_ctx.stop = _input.LT(-1);

			    _localctx.trad.add(x.LDC_W);
			    _localctx.trad.add(x.nByte(saltLinia,2));
			    _localctx.trad.add(x.nByte(saltLinia,1));
			    _localctx.trad.add(x.INVOKESTATIC);
			    _localctx.trad.add(x.nByte(x.mPutString,2));
			    _localctx.trad.add(x.nByte(x.mPutString,1));


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
		public Vector<Long> trad;
		public AssignContext a;
		public If_ruleContext i;
		public For_ruleContext f;
		public While_ruleContext w;
		public ReadContext r;
		public WriteContext wr;
		public WritelnContext wr2;
		public AccioContext accio() {
			return getRuleContext(AccioContext.class,0);
		}
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
		enterRule(_localctx, 52, RULE_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(433);
				((SentenceContext)_localctx).a = assign();
				((SentenceContext)_localctx).trad = ((SentenceContext)_localctx).a.trad;
				}
				break;
			case 2:
				{
				setState(436);
				((SentenceContext)_localctx).i = if_rule();
				((SentenceContext)_localctx).trad = ((SentenceContext)_localctx).i.trad;
				}
				break;
			case 3:
				{
				setState(439);
				((SentenceContext)_localctx).f = for_rule();
				((SentenceContext)_localctx).trad = ((SentenceContext)_localctx).f.trad;
				}
				break;
			case 4:
				{
				setState(442);
				((SentenceContext)_localctx).w = while_rule();
				((SentenceContext)_localctx).trad = ((SentenceContext)_localctx).w.trad;
				}
				break;
			case 5:
				{
				setState(445);
				accio();
				}
				break;
			case 6:
				{
				setState(446);
				((SentenceContext)_localctx).r = read();
				((SentenceContext)_localctx).trad =  ((SentenceContext)_localctx).r.trad;
				}
				break;
			case 7:
				{
				setState(449);
				((SentenceContext)_localctx).wr = write();
				((SentenceContext)_localctx).trad =  ((SentenceContext)_localctx).wr.trad;
				}
				break;
			case 8:
				{
				setState(452);
				((SentenceContext)_localctx).wr2 = writeln();
				((SentenceContext)_localctx).trad =  ((SentenceContext)_localctx).wr2.trad;
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
		public Vector<Long> trad;
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
		enterRule(_localctx, 54, RULE_constValue);

		    ((ConstValueContext)_localctx).trad =  new Vector<Long> (10);

		try {
			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_CONST_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				((ConstValueContext)_localctx).a = match(TK_CONST_INT);

				        ((ConstValueContext)_localctx).tipus =  'E';
				        _localctx.trad.add(x.BIPUSH);
				        _localctx.trad.add(new Long((((ConstValueContext)_localctx).a!=null?((ConstValueContext)_localctx).a.getText():null)));
				    
				}
				break;
			case TK_CONST_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				((ConstValueContext)_localctx).b = match(TK_CONST_REAL);

				        ((ConstValueContext)_localctx).tipus =  'R';
				        Long constTemp = x.addConstant("F",(((ConstValueContext)_localctx).b!=null?((ConstValueContext)_localctx).b.getText():null));
				        _localctx.trad.add(x.LDC_W);
				        _localctx.trad.add(x.nByte(constTemp,2));
				        _localctx.trad.add(x.nByte(constTemp,1));
				        
				}
				break;
			case TK_CONST_CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(461);
				((ConstValueContext)_localctx).c = match(TK_CONST_CHAR);

				        ((ConstValueContext)_localctx).tipus =  'C';
				        _localctx.trad.add(x.BIPUSH);
				        _localctx.trad.add(new Long((((ConstValueContext)_localctx).c!=null?((ConstValueContext)_localctx).c.getText():null).replace("'", "").charAt(0)));
				        
				}
				break;
			case TK_CONST_BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(463);
				((ConstValueContext)_localctx).d = match(TK_CONST_BOOL);

				        ((ConstValueContext)_localctx).tipus =  'B';
				        _localctx.trad.add(x.BIPUSH);
				        if((((ConstValueContext)_localctx).d!=null?((ConstValueContext)_localctx).d.getText():null).equals("cert")){
				            _localctx.trad.add(1l);
				        }
				        else{
				            _localctx.trad.add(0l);
				        }
				    
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
		public char tipus;
		public Token id;
		public Token camp;
		public TerminalNode TK_OP_TUPLE() { return getToken(gramParser.TK_OP_TUPLE, 0); }
		public List<TerminalNode> TK_IDENTIFIER() { return getTokens(gramParser.TK_IDENTIFIER); }
		public TerminalNode TK_IDENTIFIER(int i) {
			return getToken(gramParser.TK_IDENTIFIER, i);
		}
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
		enterRule(_localctx, 56, RULE_tuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			((TupleContext)_localctx).id = match(TK_IDENTIFIER);
			setState(468);
			match(TK_OP_TUPLE);
			setState(469);
			((TupleContext)_localctx).camp = match(TK_IDENTIFIER);

			    if(TS.existeix((((TupleContext)_localctx).id!=null?((TupleContext)_localctx).id.getText():null))){
			        Registre reg = TS.obtenir((((TupleContext)_localctx).id!=null?((TupleContext)_localctx).id.getText():null));
			        Vector<Pair<String,String>> camps = reg.getCampsAddicionals();
			        boolean trobat = false;
			        int i = 0;
			        Pair<String, String> c = null;
			        while (trobat != false && i < camps.size()){
			            c = camps.get(i);
			            if (c.getValue().equals((((TupleContext)_localctx).camp!=null?((TupleContext)_localctx).camp.getText():null))) trobat = true;
			            i++;
			        }
			        if (!trobat) {
			            error = true;
			            System.out.println("Error: la tupla " + (((TupleContext)_localctx).id!=null?((TupleContext)_localctx).id.getText():null) + " no te el camp " + (((TupleContext)_localctx).camp!=null?((TupleContext)_localctx).camp.getText():null) + " a la linea: " + (((TupleContext)_localctx).id!=null?((TupleContext)_localctx).id.getLine():0));
			        }
			        else{
			            ((TupleContext)_localctx).tipus =  c.getKey().toUpperCase().charAt(0);
			        }
			    }
			    else{
			        error = true;
			        System.out.println("Error: la tupla " + (((TupleContext)_localctx).id!=null?((TupleContext)_localctx).id.getText():null) + " no existeix, a la linea: " + (((TupleContext)_localctx).id!=null?((TupleContext)_localctx).id.getLine():0));
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

	public static class VectorContext extends ParserRuleContext {
		public char tipus;
		public Token id;
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
		enterRule(_localctx, 58, RULE_vector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			((VectorContext)_localctx).id = match(TK_IDENTIFIER);
			setState(473);
			match(TK_OP_VECTOR_OPEN);
			setState(474);
			((VectorContext)_localctx).t1 = expr();

			         if(((VectorContext)_localctx).t1.tipus != 'E'){
			             error = true;
			             System.out.println("Error de tipus detectat a la linia " + (((VectorContext)_localctx).id!=null?((VectorContext)_localctx).id.getLine():0) + ": els indexs de vectors han de ser enters.");
			         }
			         if(TS.existeix((((VectorContext)_localctx).id!=null?((VectorContext)_localctx).id.getText():null))){
			            Registre reg = TS.obtenir((((VectorContext)_localctx).id!=null?((VectorContext)_localctx).id.getText():null));
			            ((VectorContext)_localctx).tipus =  reg.getTipus().toUpperCase().charAt(0);
			         }
			         else{
			            error = true;
			            System.out.println("Error: el vector " + (((VectorContext)_localctx).id!=null?((VectorContext)_localctx).id.getText():null) + " no existeix, a la linea: " + (((VectorContext)_localctx).id!=null?((VectorContext)_localctx).id.getLine():0));
			         }
			     
			setState(476);
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
		enterRule(_localctx, 60, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(TK_IDENTIFIER);
			setState(479);
			match(TK_OP_PAR_OPEN);
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (TK_CONST_CHAR - 40)) | (1L << (TK_CONST_REAL - 40)) | (1L << (TK_CONST_BOOL - 40)) | (1L << (TK_CONST_INT - 40)) | (1L << (TK_OP_MINUS - 40)) | (1L << (TK_OP_NEG - 40)) | (1L << (TK_OP_PAR_OPEN - 40)) | (1L << (TK_IDENTIFIER - 40)))) != 0)) {
				{
				setState(480);
				expr();
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_SEP_COMMA) {
					{
					{
					setState(481);
					match(TK_SEP_COMMA);
					setState(482);
					expr();
					}
					}
					setState(487);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(490);
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
		public Vector<Long> trad;
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
		enterRule(_localctx, 62, RULE_expr);
		int _la;
		try {
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(492);
				((ExprContext)_localctx).boolea = logicsDown();
				setState(500); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(493);
					((ExprContext)_localctx).s = match(TK_OP_QUESTION_MARK);
					setState(494);
					((ExprContext)_localctx).t1 = logicsDown();

					            ((ExprContext)_localctx).tipus =  ((ExprContext)_localctx).t1.tipus;
					            if(((ExprContext)_localctx).boolea.tipus != 'B'){ //la condició ha de ser booleana
					                error = true;
					                System.out.println("Error de tipus detectat a la linia " + (((ExprContext)_localctx).s!=null?((ExprContext)_localctx).s.getLine():0) + ": La condició d'un ternari ha de ser booleana");
					            }
					        
					setState(496);
					((ExprContext)_localctx).s = match(TK_OP_COLON);
					setState(497);
					((ExprContext)_localctx).t2 = logicsDown();

					                if(((ExprContext)_localctx).t1.tipus != ((ExprContext)_localctx).t2.tipus && !((((ExprContext)_localctx).t1.tipus == 'E' && ((ExprContext)_localctx).t2.tipus == 'R')||(((ExprContext)_localctx).t1.tipus == 'R' && ((ExprContext)_localctx).t2.tipus == 'E'))){
					                //cast de real a enter
					                    error = true;
					                    System.out.println("Error de tipus detectat a la linia " + (((ExprContext)_localctx).s!=null?((ExprContext)_localctx).s.getLine():0) + ": Els tipus del ternari no casen");
					                }
					                else if(!error){
					                    ((ExprContext)_localctx).trad =  ((ExprContext)_localctx).boolea.trad;
					                    Vector<Long> trad2 = ((ExprContext)_localctx).t1.trad;
					                    Vector<Long> trad3 = ((ExprContext)_localctx).t2.trad;
					                    _localctx.trad.add(x.IFEQ);
					                    Long salt = trad2.size()+6L;
					                    _localctx.trad.add(x.nByte(salt,2));
					                    _localctx.trad.add(x.nByte(salt,1));
					                    _localctx.trad.addAll(trad2);
					                    _localctx.trad.add(x.GOTO);
					                    salt=trad3.size()+3L;
					                    _localctx.trad.add(x.nByte(salt,2));
					                    _localctx.trad.add(x.nByte(salt,1));
					                    _localctx.trad.addAll(trad3);
					                }
					            
					}
					}
					setState(502); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TK_OP_QUESTION_MARK );
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				((ExprContext)_localctx).t1 = logicsDown();
				((ExprContext)_localctx).tipus =  ((ExprContext)_localctx).t1.tipus;  ((ExprContext)_localctx).trad =  ((ExprContext)_localctx).t1.trad;
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
		public Vector<Long> trad;
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
		enterRule(_localctx, 64, RULE_logicsDown);
		int _la;
		try {
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(509);
				((LogicsDownContext)_localctx).t1 = logicUp();
				((LogicsDownContext)_localctx).tipus =  'B';
				setState(515); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(511);
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
					setState(512);
					((LogicsDownContext)_localctx).t2 = logicUp();

					                 if(((LogicsDownContext)_localctx).t1.tipus != 'B' && ((LogicsDownContext)_localctx).t2.tipus != 'B'){
					                 //cast de real a enter
					                     error = true;
					                     System.out.println("Error de tipus detectat a la linia " + (((LogicsDownContext)_localctx).s!=null?((LogicsDownContext)_localctx).s.getLine():0) + ": Els tipus de operació lògica no casen");
					                 }
					                 if(!error){
					                    ((LogicsDownContext)_localctx).trad =  ((LogicsDownContext)_localctx).t1.trad;
					                    _localctx.trad.addAll(((LogicsDownContext)_localctx).t2.trad);
					                    if((((LogicsDownContext)_localctx).s!=null?((LogicsDownContext)_localctx).s.getText():null).equals("&")){
					                        _localctx.trad.add(x.IAND);
					                    }
					                    else if((((LogicsDownContext)_localctx).s!=null?((LogicsDownContext)_localctx).s.getText():null).equals("|")){
					                        _localctx.trad.add(x.IOR);
					                    }
					                 }
					             
					}
					}
					setState(517); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TK_OP_AND || _la==TK_OP_OR );
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				((LogicsDownContext)_localctx).t = logicUp();
				((LogicsDownContext)_localctx).tipus =  ((LogicsDownContext)_localctx).t.tipus;  ((LogicsDownContext)_localctx).trad =  ((LogicsDownContext)_localctx).t.trad;
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
		public Vector<Long> trad;
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
		enterRule(_localctx, 66, RULE_logicUp);
		int _la;
		try {
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(524);
				((LogicUpContext)_localctx).t1 = sum();
				((LogicUpContext)_localctx).tipus =  'B';
				setState(530); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(526);
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
					setState(527);
					((LogicUpContext)_localctx).t2 = sum();

					              if((((LogicUpContext)_localctx).s!=null?((LogicUpContext)_localctx).s.getText():null).equals("==") || (((LogicUpContext)_localctx).s!=null?((LogicUpContext)_localctx).s.getText():null).equals("!=")) {
					                if((((LogicUpContext)_localctx).t1.tipus != ((LogicUpContext)_localctx).t2.tipus) && !((((LogicUpContext)_localctx).t1.tipus == 'E' && ((LogicUpContext)_localctx).t2.tipus == 'R')||(((LogicUpContext)_localctx).t1.tipus == 'R' && ((LogicUpContext)_localctx).t2.tipus == 'E'))){
					                    // == i != esta definit sobre tots els tipus reals
					                    error = true;
					                    System.out.println("Error de tipus detectat a la linia " + (((LogicUpContext)_localctx).s!=null?((LogicUpContext)_localctx).s.getLine():0) +": El tipus del comparador lògic no casen (cas1)");
					                    break;
					                }
					                else{
					                    if(((((LogicUpContext)_localctx).t1.tipus=='R' || ((LogicUpContext)_localctx).t2.tipus=='R') && (((LogicUpContext)_localctx).t1.tipus=='E' || ((LogicUpContext)_localctx).t2.tipus=='E')) || (((LogicUpContext)_localctx).t1.tipus=='R' && ((LogicUpContext)_localctx).t2.tipus=='R')){

					                        ((LogicUpContext)_localctx).trad = ((LogicUpContext)_localctx).t1.trad;
					                        if(((LogicUpContext)_localctx).t1.tipus=='E'){
					                            _localctx.trad.add(x.I2F);
					                        }

					                        _localctx.trad.addAll(((LogicUpContext)_localctx).t2.trad);
					                        if(((LogicUpContext)_localctx).t2.tipus=='E'){
					                            _localctx.trad.add(x.I2F);
					                        }

					                        _localctx.trad.add(x.FCMPG);

					                        if((((LogicUpContext)_localctx).s!=null?((LogicUpContext)_localctx).s.getText():null).equals("==")){
					                            _localctx.trad.add(x.IFEQ);
					                        }
					                        else{
					                            _localctx.trad.add(x.IFNE);
					                        }
					                    }else{
					                        ((LogicUpContext)_localctx).trad = ((LogicUpContext)_localctx).t1.trad;
					                        _localctx.trad.addAll(((LogicUpContext)_localctx).t2.trad);
					                        if((((LogicUpContext)_localctx).s!=null?((LogicUpContext)_localctx).s.getText():null).equals("==")){
					                            _localctx.trad.add(x.IF_ICMPEQ);
					                        }
					                        else{
					                            _localctx.trad.add(x.IF_ICMPNE);
					                        }
					                    }

					                }
					              } else if((((LogicUpContext)_localctx).t1.tipus != 'E' || ((LogicUpContext)_localctx).t1.tipus != 'R') && (((LogicUpContext)_localctx).t2.tipus != 'E' || ((LogicUpContext)_localctx).t2.tipus != 'R')&& (((LogicUpContext)_localctx).t2.tipus != 'E' || ((LogicUpContext)_localctx).t2.tipus != 'E')&& (((LogicUpContext)_localctx).t2.tipus != 'R' || ((LogicUpContext)_localctx).t2.tipus != 'R')){
					                //nomes es pot usar en reals i enters, aixi que si son diferents ferem casting a real.
					                    error = true;
					                    System.out.println("Error de tipus detectat a la linia " + (((LogicUpContext)_localctx).s!=null?((LogicUpContext)_localctx).s.getLine():0) + ": El tipus del comparador lògic no casen (cas2)");
					                    break;
					              }
					              else{
					                ((LogicUpContext)_localctx).trad = ((LogicUpContext)_localctx).t1.trad;
					                if(((LogicUpContext)_localctx).t1.tipus=='E'){
					                   _localctx.trad.add(x.I2F);
					                }
					                _localctx.trad.addAll(((LogicUpContext)_localctx).t2.trad);
					                if(((LogicUpContext)_localctx).t2.tipus=='E'){
					                   _localctx.trad.add(x.I2F);
					                }
					                _localctx.trad.add(x.FCMPG);
					                switch((((LogicUpContext)_localctx).s!=null?((LogicUpContext)_localctx).s.getText():null)){
					                    case ">":
					                        _localctx.trad.add(x.IFGT);
					                        break;
					                    case "<":
					                        _localctx.trad.add(x.IFLT);
					                        break;
					                    case "<=":
					                        _localctx.trad.add(x.IFLE);
					                        break;
					                    case ">=":
					                        _localctx.trad.add(x.IFGE);
					                        break;
					                }
					                }
					                Long salt=8L;
					                _localctx.trad.add(x.nByte(salt,2));
					                _localctx.trad.add(x.nByte(salt,1));

					                _localctx.trad.add(x.BIPUSH);
					                _localctx.trad.add(new Long(0));

					                _localctx.trad.add(x.GOTO);
					                salt=5L;
					                _localctx.trad.add(x.nByte(salt,2));
					                _localctx.trad.add(x.nByte(salt,1));

					                _localctx.trad.add(x.BIPUSH);
					                _localctx.trad.add(new Long(1));

					          
					}
					}
					setState(532); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_OP_EQ) | (1L << TK_OP_DIFF) | (1L << TK_OP_GT) | (1L << TK_OP_LT) | (1L << TK_OP_LOET) | (1L << TK_OP_GOET))) != 0) );
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(534);
				((LogicUpContext)_localctx).t = sum();
				((LogicUpContext)_localctx).tipus =  ((LogicUpContext)_localctx).t.tipus;  ((LogicUpContext)_localctx).trad =  ((LogicUpContext)_localctx).t.trad;
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
		public Vector<Long> trad;
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
		enterRule(_localctx, 68, RULE_sum);
		int _la;
		try {
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(539);
				((SumContext)_localctx).t1 = mult();
				setState(544); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(540);
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
					setState(541);
					((SumContext)_localctx).t2 = mult();

					        ((SumContext)_localctx).trad =  ((SumContext)_localctx).t1.trad;
					          if((((SumContext)_localctx).t1.tipus == 'E' || ((SumContext)_localctx).t1.tipus == 'R') && (((SumContext)_localctx).t2.tipus == 'R' || ((SumContext)_localctx).t2.tipus == 'E') && ((SumContext)_localctx).t1.tipus != ((SumContext)_localctx).t2.tipus){
					              ((SumContext)_localctx).tipus =  'R';
					          } else if(((SumContext)_localctx).t1.tipus == ((SumContext)_localctx).t2.tipus && (((SumContext)_localctx).t1.tipus == 'E' || ((SumContext)_localctx).t1.tipus == 'R')){
					              ((SumContext)_localctx).tipus =  ((SumContext)_localctx).t1.tipus;
					          } else{
					              error = true;
					              System.out.println("Error de tipus detectat a la linia " + (((SumContext)_localctx).s!=null?((SumContext)_localctx).s.getLine():0) + ": El tipus de la suma/resta no casen");
					          }
					          if(!error){
					              if(((SumContext)_localctx).t1.tipus == 'E' && ((SumContext)_localctx).t2.tipus == 'R') _localctx.trad.add(x.I2F);
					              _localctx.trad.addAll(((SumContext)_localctx).t2.trad);
					              if(((SumContext)_localctx).t2.tipus == 'E' && ((SumContext)_localctx).t1.tipus == 'R') _localctx.trad.add(x.I2F);
					              if(_localctx.tipus == 'E'){
					                    if ((((SumContext)_localctx).s!=null?((SumContext)_localctx).s.getText():null).equals("+")) _localctx.trad.add(x.IADD);
					                    else _localctx.trad.add(x.ISUB);
					              }
					              else{
					                    if ((((SumContext)_localctx).s!=null?((SumContext)_localctx).s.getText():null).equals("+")) _localctx.trad.add(x.FADD);
					                    else _localctx.trad.add(x.FSUB);
					              }
					          }
					    
					}
					}
					setState(546); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TK_OP_SUMA || _la==TK_OP_RESTA );
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				((SumContext)_localctx).t = mult();
				((SumContext)_localctx).tipus =  ((SumContext)_localctx).t.tipus; ((SumContext)_localctx).trad =  ((SumContext)_localctx).t.trad;
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
		public Vector<Long> trad;
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
		enterRule(_localctx, 70, RULE_mult);
		int _la;
		try {
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(553);
				((MultContext)_localctx).t1 = neg();
				setState(558); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(554);
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
					setState(555);
					((MultContext)_localctx).t2 = neg();

					        ((MultContext)_localctx).trad =  ((MultContext)_localctx).t1.trad;
					          if(((((MultContext)_localctx).s!=null?((MultContext)_localctx).s.getText():null).equals("%") || (((MultContext)_localctx).s!=null?((MultContext)_localctx).s.getText():null).equals("\\")) && (((MultContext)_localctx).t1.tipus == 'E' && ((MultContext)_localctx).t2.tipus == 'E')) {
					                ((MultContext)_localctx).tipus =  'E';
					          } else if ((((MultContext)_localctx).s!=null?((MultContext)_localctx).s.getText():null).equals("/") && (((MultContext)_localctx).t1.tipus == 'E' || ((MultContext)_localctx).t1.tipus == 'R') && (((MultContext)_localctx).t2.tipus == 'E' || ((MultContext)_localctx).t2.tipus == 'R')) {
					                ((MultContext)_localctx).tipus =  'R';
					          } else if ((((MultContext)_localctx).s!=null?((MultContext)_localctx).s.getText():null).equals("*") && (((MultContext)_localctx).t1.tipus == 'E' || ((MultContext)_localctx).t1.tipus == 'R') && (((MultContext)_localctx).t2.tipus == 'E' || ((MultContext)_localctx).t2.tipus == 'R') && ((MultContext)_localctx).t1.tipus != ((MultContext)_localctx).t2.tipus) {
					                ((MultContext)_localctx).tipus =  'R';
					          } else if ((((MultContext)_localctx).s!=null?((MultContext)_localctx).s.getText():null).equals("*") && ((MultContext)_localctx).t1.tipus == ((MultContext)_localctx).t2.tipus && (((MultContext)_localctx).t1.tipus == 'E' || ((MultContext)_localctx).t2.tipus == 'R')) {
					                ((MultContext)_localctx).tipus =  ((MultContext)_localctx).t1.tipus;
					          } else {
					                error = true;
					                System.out.println("Error de tipus detectat a la linia " + (((MultContext)_localctx).s!=null?((MultContext)_localctx).s.getLine():0) + ": El tipus de l'operador " + (((MultContext)_localctx).s!=null?((MultContext)_localctx).s.getText():null) +" no casen");
					          }
					          if(!error){
					                if((((MultContext)_localctx).s!=null?((MultContext)_localctx).s.getText():null).equals("%")){
					                    _localctx.trad.addAll(((MultContext)_localctx).t2.trad);
								        _localctx.trad.add(x.IREM);
					                }
					                else if((((MultContext)_localctx).s!=null?((MultContext)_localctx).s.getText():null).equals("\\")){
					                    _localctx.trad.addAll(((MultContext)_localctx).t2.trad);
					                    _localctx.trad.add(x.IDIV);
					                }
					                else if((((MultContext)_localctx).s!=null?((MultContext)_localctx).s.getText():null).equals("/")){
					                    if(((MultContext)_localctx).t1.tipus == 'E') _localctx.trad.add(x.I2F);
					                    _localctx.trad.addAll(((MultContext)_localctx).t2.trad);
					                    if(((MultContext)_localctx).t2.tipus == 'E') _localctx.trad.add(x.I2F);
					                    _localctx.trad.add(x.FDIV);
					                }
					                else if((((MultContext)_localctx).s!=null?((MultContext)_localctx).s.getText():null).equals("*")){
					                    if(((MultContext)_localctx).t1.tipus == 'R' || ((MultContext)_localctx).t2.tipus == 'R'){
					                        if(((MultContext)_localctx).t1.tipus == 'E') _localctx.trad.add(x.I2F);
					                        _localctx.trad.addAll(((MultContext)_localctx).t2.trad);
					                        if(((MultContext)_localctx).t2.tipus == 'E') _localctx.trad.add(x.I2F);
					                        _localctx.trad.add(x.FMUL);
					                    }
					                    else{
					                        _localctx.trad.addAll(((MultContext)_localctx).t2.trad);
					                        _localctx.trad.add(x.IMUL);
					                    }
					                }
					          }
					      
					}
					}
					setState(560); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_OP_MULT) | (1L << TK_OP_REALDIV) | (1L << TK_OP_INTDIV) | (1L << TK_OP_MOD))) != 0) );
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(562);
				((MultContext)_localctx).t = neg();
				((MultContext)_localctx).tipus =  ((MultContext)_localctx).t.tipus;  ((MultContext)_localctx).trad =  ((MultContext)_localctx).t.trad;
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
		public Vector<Long> trad;
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
		enterRule(_localctx, 72, RULE_neg);
		int _la;
		try {
			setState(574);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_OP_MINUS:
			case TK_OP_NEG:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(567);
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
				setState(568);
				((NegContext)_localctx).t = value();

				        ((NegContext)_localctx).tipus =  ((NegContext)_localctx).t.tipus;
				        ((NegContext)_localctx).trad =  ((NegContext)_localctx).t.trad;
				        if(((((NegContext)_localctx).s!=null?((NegContext)_localctx).s.getText():null).equals("~") && !(((NegContext)_localctx).t.tipus == 'E' || ((NegContext)_localctx).t.tipus == 'R' )) || ((((NegContext)_localctx).s!=null?((NegContext)_localctx).s.getText():null).equals("no") && ((NegContext)_localctx).t.tipus != 'B')){
				              error = true;
				              System.out.println("Error de tipus detectat a la linia " + (((NegContext)_localctx).s!=null?((NegContext)_localctx).s.getLine():0) + ": El tipus del unari és incorrecte");
				        }
				        else{
				            ((NegContext)_localctx).trad =  ((NegContext)_localctx).t.trad;
				            if(_localctx.tipus == 'R' && (((NegContext)_localctx).s!=null?((NegContext)_localctx).s.getText():null).equals("~")){
				                _localctx.trad.add(x.FNEG);
				            }
				            else if ((((NegContext)_localctx).s!=null?((NegContext)_localctx).s.getText():null).equals("~")){
				                _localctx.trad.add(x.INEG);
				            }
				            else if ((((NegContext)_localctx).s!=null?((NegContext)_localctx).s.getText():null).equals("no")){
				                _localctx.trad.add(x.BIPUSH);
				                _localctx.trad.add(1l);
				                _localctx.trad.add(x.IXOR);
				            }
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
				setState(571);
				((NegContext)_localctx).t = value();
				((NegContext)_localctx).tipus = ((NegContext)_localctx).t.tipus;  ((NegContext)_localctx).trad =  ((NegContext)_localctx).t.trad;
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
		public Vector<Long> trad;
		public ConstValueContext t1;
		public Token id;
		public TupleContext t2;
		public VectorContext t3;
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
		enterRule(_localctx, 74, RULE_value);
		try {
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(576);
				((ValueContext)_localctx).t1 = constValue();
				((ValueContext)_localctx).tipus =  ((ValueContext)_localctx).t1.tipus; ((ValueContext)_localctx).trad =  ((ValueContext)_localctx).t1.trad;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				((ValueContext)_localctx).id = match(TK_IDENTIFIER);

				        ((ValueContext)_localctx).trad =  new Vector<Long> (10);
				        if(TS.existeix((((ValueContext)_localctx).id!=null?((ValueContext)_localctx).id.getText():null)) && (TS.obtenir((((ValueContext)_localctx).id!=null?((ValueContext)_localctx).id.getText():null)).getTipusLexema().equals("var") || TS.obtenir((((ValueContext)_localctx).id!=null?((ValueContext)_localctx).id.getText():null)).getTipusLexema().equals("const"))){
				            Registre reg = TS.obtenir((((ValueContext)_localctx).id!=null?((ValueContext)_localctx).id.getText():null));
				            if(reg.getTipus().equals("enter") || reg.getTipus().equals("real") || reg.getTipus().equals("car") || reg.getTipus().equals("boolea")){
				                ((ValueContext)_localctx).tipus =  reg.getTipus().toUpperCase().charAt(0);
				            }
				            else{ //tipus es un alias
				                Registre reg2 = TS.obtenir(reg.getTipus());
				                ((ValueContext)_localctx).tipus =  reg2.getTipus().toUpperCase().charAt(0);
				            }
				            if(reg.getTipusLexema().equals("var")){
				                if(_localctx.tipus != 'R'){
				                    _localctx.trad.add(x.ILOAD);
				                }
				                else{
				                    _localctx.trad.add(x.FLOAD);
				                }
				                _localctx.trad.add(new Long(reg.getAdreca()));
				            }
				            else if (reg.getTipusLexema().equals("const")){
				                _localctx.trad.add(x.LDC_W);
				                Long constTemp = new Long(reg.getAdreca());
				                _localctx.trad.add(x.nByte(constTemp,2));
				                _localctx.trad.add(x.nByte(constTemp,1));
				            }
				        }
				        else{
				            error = true;
				            System.out.println("Error: " + (((ValueContext)_localctx).id!=null?((ValueContext)_localctx).id.getText():null) + " no existeix: " + (((ValueContext)_localctx).id!=null?((ValueContext)_localctx).id.getLine():0));
				        }
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(581);
				((ValueContext)_localctx).t2 = tuple();
				((ValueContext)_localctx).tipus =  ((ValueContext)_localctx).t2.tipus;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(584);
				((ValueContext)_localctx).t3 = vector();
				((ValueContext)_localctx).tipus =  ((ValueContext)_localctx).t3.tipus;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(587);
				func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(588);
				((ValueContext)_localctx).t = parenthesis();
				((ValueContext)_localctx).tipus =  ((ValueContext)_localctx).t.tipus; ((ValueContext)_localctx).trad =  ((ValueContext)_localctx).t.trad;
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
		public Vector<Long> trad;
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
		enterRule(_localctx, 76, RULE_parenthesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(TK_OP_PAR_OPEN);
			setState(594);
			((ParenthesisContext)_localctx).t = expr();

			    ((ParenthesisContext)_localctx).tipus =  ((ParenthesisContext)_localctx).t.tipus;
			    ((ParenthesisContext)_localctx).trad =  ((ParenthesisContext)_localctx).t.trad;

			setState(596);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3K\u0259\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\5\3T\n\3"+
		"\3\3\5\3W\n\3\3\3\5\3Z\n\3\3\3\3\3\5\3^\n\3\3\4\3\4\3\4\5\4c\n\4\3\4\3"+
		"\4\3\4\7\4h\n\4\f\4\16\4k\13\4\3\4\3\4\3\4\3\5\3\5\7\5r\n\5\f\5\16\5u"+
		"\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0084\n"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0091\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u009a\n\b\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u00a2\n\t"+
		"\r\t\16\t\u00a3\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00b1"+
		"\n\n\f\n\16\n\u00b4\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00be"+
		"\n\13\f\13\16\13\u00c1\13\13\3\13\3\13\3\f\3\f\7\f\u00c7\n\f\f\f\16\f"+
		"\u00ca\13\f\3\r\3\r\3\r\3\r\5\r\u00d0\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\5\16\u00d9\n\16\3\16\3\16\3\16\3\16\3\16\3\17\5\17\u00e1\n\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00e7\n\17\3\17\3\17\3\17\7\17\u00ec\n\17\f\17\16"+
		"\17\u00ef\13\17\3\20\3\20\7\20\u00f3\n\20\f\20\16\20\u00f6\13\20\3\21"+
		"\3\21\3\21\3\21\5\21\u00fc\n\21\3\21\3\21\5\21\u0100\n\21\3\21\7\21\u0103"+
		"\n\21\f\21\16\21\u0106\13\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u010e"+
		"\n\22\3\22\3\22\3\22\3\22\5\22\u0114\n\22\3\22\7\22\u0117\n\22\f\22\16"+
		"\22\u011a\13\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u0126\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\7\25\u0135\n\25\f\25\16\25\u0138\13\25\3\25\3\25\3\25\3\25\7\25"+
		"\u013e\n\25\f\25\16\25\u0141\13\25\5\25\u0143\n\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0153\n\26\f\26"+
		"\16\26\u0156\13\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7"+
		"\27\u0162\n\27\f\27\16\27\u0165\13\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\7\30\u016f\n\30\f\30\16\30\u0172\13\30\5\30\u0174\n\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\5\32\u0187\n\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u018f\n\32"+
		"\7\32\u0191\n\32\f\32\16\32\u0194\13\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u01a0\n\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u01a8\n\33\7\33\u01aa\n\33\f\33\16\33\u01ad\13\33\5\33\u01af\n\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01ca\n\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01d4\n\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \7 \u01e6\n \f \16 "+
		"\u01e9\13 \5 \u01eb\n \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\6!\u01f7\n!\r!\16"+
		"!\u01f8\3!\3!\3!\5!\u01fe\n!\3\"\3\"\3\"\3\"\3\"\3\"\6\"\u0206\n\"\r\""+
		"\16\"\u0207\3\"\3\"\3\"\5\"\u020d\n\"\3#\3#\3#\3#\3#\3#\6#\u0215\n#\r"+
		"#\16#\u0216\3#\3#\3#\5#\u021c\n#\3$\3$\3$\3$\3$\6$\u0223\n$\r$\16$\u0224"+
		"\3$\3$\3$\5$\u022a\n$\3%\3%\3%\3%\3%\6%\u0231\n%\r%\16%\u0232\3%\3%\3"+
		"%\5%\u0238\n%\3&\3&\3&\3&\3&\3&\3&\5&\u0241\n&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0252\n\'\3(\3(\3(\3(\3(\3(\2"+
		"\2)\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLN\2\b\3\2\13\f\3\2<=\3\2\65:\3\2./\3\2\60\63\4\2\64\64;;\2\u027b"+
		"\2P\3\2\2\2\4S\3\2\2\2\6_\3\2\2\2\bo\3\2\2\2\nx\3\2\2\2\f\u0090\3\2\2"+
		"\2\16\u0092\3\2\2\2\20\u009b\3\2\2\2\22\u00a8\3\2\2\2\24\u00b7\3\2\2\2"+
		"\26\u00c8\3\2\2\2\30\u00cb\3\2\2\2\32\u00d4\3\2\2\2\34\u00e0\3\2\2\2\36"+
		"\u00f4\3\2\2\2 \u00f7\3\2\2\2\"\u0109\3\2\2\2$\u0125\3\2\2\2&\u0127\3"+
		"\2\2\2(\u012d\3\2\2\2*\u0147\3\2\2\2,\u015a\3\2\2\2.\u0169\3\2\2\2\60"+
		"\u0178\3\2\2\2\62\u017f\3\2\2\2\64\u0198\3\2\2\2\66\u01c9\3\2\2\28\u01d3"+
		"\3\2\2\2:\u01d5\3\2\2\2<\u01da\3\2\2\2>\u01e0\3\2\2\2@\u01fd\3\2\2\2B"+
		"\u020c\3\2\2\2D\u021b\3\2\2\2F\u0229\3\2\2\2H\u0237\3\2\2\2J\u0240\3\2"+
		"\2\2L\u0251\3\2\2\2N\u0253\3\2\2\2PQ\7+\2\2Q\3\3\2\2\2RT\5\b\5\2SR\3\2"+
		"\2\2ST\3\2\2\2TV\3\2\2\2UW\5\26\f\2VU\3\2\2\2VW\3\2\2\2WY\3\2\2\2XZ\5"+
		"\22\n\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[]\5\6\4\2\\^\5\36\20\2]\\\3\2\2"+
		"\2]^\3\2\2\2^\5\3\2\2\2_`\7\4\2\2`b\7K\2\2ac\5\24\13\2ba\3\2\2\2bc\3\2"+
		"\2\2ci\3\2\2\2de\5\66\34\2ef\b\4\1\2fh\3\2\2\2gd\3\2\2\2hk\3\2\2\2ig\3"+
		"\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7\5\2\2mn\b\4\1\2n\7\3\2\2\2os"+
		"\7\21\2\2pr\5\n\6\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2"+
		"us\3\2\2\2vw\7\22\2\2w\t\3\2\2\2xy\7K\2\2y\u0083\7?\2\2z{\5\f\7\2{|\b"+
		"\6\1\2|\u0084\3\2\2\2}~\5\16\b\2~\177\b\6\1\2\177\u0084\3\2\2\2\u0080"+
		"\u0081\5\20\t\2\u0081\u0082\b\6\1\2\u0082\u0084\3\2\2\2\u0083z\3\2\2\2"+
		"\u0083}\3\2\2\2\u0083\u0080\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7"+
		"I\2\2\u0086\u0087\b\6\1\2\u0087\13\3\2\2\2\u0088\u0089\7#\2\2\u0089\u0091"+
		"\b\7\1\2\u008a\u008b\7$\2\2\u008b\u0091\b\7\1\2\u008c\u008d\7%\2\2\u008d"+
		"\u0091\b\7\1\2\u008e\u008f\7&\2\2\u008f\u0091\b\7\1\2\u0090\u0088\3\2"+
		"\2\2\u0090\u008a\3\2\2\2\u0090\u008c\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\r\3\2\2\2\u0092\u0093\7\25\2\2\u0093\u0094\5\f\7\2\u0094\u0095\b\b\1"+
		"\2\u0095\u0096\7\26\2\2\u0096\u0099\7-\2\2\u0097\u0098\7\27\2\2\u0098"+
		"\u009a\7-\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\17\3\2\2\2"+
		"\u009b\u00a1\7\23\2\2\u009c\u009d\5\f\7\2\u009d\u009e\7K\2\2\u009e\u009f"+
		"\7I\2\2\u009f\u00a0\b\t\1\2\u00a0\u00a2\3\2\2\2\u00a1\u009c\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a6\7\24\2\2\u00a6\u00a7\b\t\1\2\u00a7\21\3\2\2\2\u00a8\u00b2"+
		"\7\r\2\2\u00a9\u00aa\5\f\7\2\u00aa\u00ab\7K\2\2\u00ab\u00ac\7C\2\2\u00ac"+
		"\u00ad\58\35\2\u00ad\u00ae\b\n\1\2\u00ae\u00af\7I\2\2\u00af\u00b1\3\2"+
		"\2\2\u00b0\u00a9\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7\16"+
		"\2\2\u00b6\23\3\2\2\2\u00b7\u00bf\7\17\2\2\u00b8\u00b9\5$\23\2\u00b9\u00ba"+
		"\7K\2\2\u00ba\u00bb\7I\2\2\u00bb\u00bc\b\13\1\2\u00bc\u00be\3\2\2\2\u00bd"+
		"\u00b8\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7\20\2\2\u00c3"+
		"\25\3\2\2\2\u00c4\u00c7\5\30\r\2\u00c5\u00c7\5\32\16\2\u00c6\u00c4\3\2"+
		"\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\27\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\7\6\2"+
		"\2\u00cc\u00cd\7K\2\2\u00cd\u00cf\7D\2\2\u00ce\u00d0\5\34\17\2\u00cf\u00ce"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7E\2\2\u00d2"+
		"\u00d3\7I\2\2\u00d3\31\3\2\2\2\u00d4\u00d5\7\b\2\2\u00d5\u00d6\7K\2\2"+
		"\u00d6\u00d8\7D\2\2\u00d7\u00d9\5\34\17\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\7E\2\2\u00db\u00dc\7\n\2\2\u00dc"+
		"\u00dd\5\f\7\2\u00dd\u00de\7I\2\2\u00de\33\3\2\2\2\u00df\u00e1\t\2\2\2"+
		"\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3"+
		"\5$\23\2\u00e3\u00ed\7K\2\2\u00e4\u00e6\7H\2\2\u00e5\u00e7\t\2\2\2\u00e6"+
		"\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\5$"+
		"\23\2\u00e9\u00ea\7K\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e4\3\2\2\2\u00ec"+
		"\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\35\3\2\2"+
		"\2\u00ef\u00ed\3\2\2\2\u00f0\u00f3\5 \21\2\u00f1\u00f3\5\"\22\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5\37\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8"+
		"\7\6\2\2\u00f8\u00f9\7K\2\2\u00f9\u00fb\7D\2\2\u00fa\u00fc\5\34\17\2\u00fb"+
		"\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\7E"+
		"\2\2\u00fe\u0100\5\24\13\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0104\3\2\2\2\u0101\u0103\5\66\34\2\u0102\u0101\3\2\2\2\u0103\u0106\3"+
		"\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0107\u0108\7\7\2\2\u0108!\3\2\2\2\u0109\u010a\7\b\2\2"+
		"\u010a\u010b\7K\2\2\u010b\u010d\7D\2\2\u010c\u010e\5\34\17\2\u010d\u010c"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\7E\2\2\u0110"+
		"\u0111\7\n\2\2\u0111\u0113\5\f\7\2\u0112\u0114\5\24\13\2\u0113\u0112\3"+
		"\2\2\2\u0113\u0114\3\2\2\2\u0114\u0118\3\2\2\2\u0115\u0117\5\66\34\2\u0116"+
		"\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\7\n\2\2\u011c"+
		"\u011d\5@!\2\u011d\u011e\7I\2\2\u011e\u011f\7\t\2\2\u011f#\3\2\2\2\u0120"+
		"\u0121\7K\2\2\u0121\u0126\b\23\1\2\u0122\u0123\5\f\7\2\u0123\u0124\b\23"+
		"\1\2\u0124\u0126\3\2\2\2\u0125\u0120\3\2\2\2\u0125\u0122\3\2\2\2\u0126"+
		"%\3\2\2\2\u0127\u0128\7K\2\2\u0128\u0129\7C\2\2\u0129\u012a\5@!\2\u012a"+
		"\u012b\b\24\1\2\u012b\u012c\7I\2\2\u012c\'\3\2\2\2\u012d\u012e\7\30\2"+
		"\2\u012e\u012f\5@!\2\u012f\u0130\b\25\1\2\u0130\u0136\7\31\2\2\u0131\u0132"+
		"\5\66\34\2\u0132\u0133\b\25\1\2\u0133\u0135\3\2\2\2\u0134\u0131\3\2\2"+
		"\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0142"+
		"\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013f\7\32\2\2\u013a\u013b\5\66\34"+
		"\2\u013b\u013c\b\25\1\2\u013c\u013e\3\2\2\2\u013d\u013a\3\2\2\2\u013e"+
		"\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0143\3\2"+
		"\2\2\u0141\u013f\3\2\2\2\u0142\u0139\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0145\7\33\2\2\u0145\u0146\b\25\1\2\u0146)\3\2\2"+
		"\2\u0147\u0148\7\34\2\2\u0148\u0149\7K\2\2\u0149\u014a\7\35\2\2\u014a"+
		"\u014b\5@!\2\u014b\u014c\7\36\2\2\u014c\u014d\5@!\2\u014d\u014e\b\26\1"+
		"\2\u014e\u0154\7\37\2\2\u014f\u0150\5\66\34\2\u0150\u0151\b\26\1\2\u0151"+
		"\u0153\3\2\2\2\u0152\u014f\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2"+
		"\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157"+
		"\u0158\7 \2\2\u0158\u0159\b\26\1\2\u0159+\3\2\2\2\u015a\u015b\7!\2\2\u015b"+
		"\u015c\5@!\2\u015c\u015d\b\27\1\2\u015d\u0163\7\37\2\2\u015e\u015f\5\66"+
		"\34\2\u015f\u0160\b\27\1\2\u0160\u0162\3\2\2\2\u0161\u015e\3\2\2\2\u0162"+
		"\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2"+
		"\2\2\u0165\u0163\3\2\2\2\u0166\u0167\7\"\2\2\u0167\u0168\b\27\1\2\u0168"+
		"-\3\2\2\2\u0169\u016a\7K\2\2\u016a\u0173\7D\2\2\u016b\u0170\5@!\2\u016c"+
		"\u016d\7H\2\2\u016d\u016f\5@!\2\u016e\u016c\3\2\2\2\u016f\u0172\3\2\2"+
		"\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170"+
		"\3\2\2\2\u0173\u016b\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0176\7E\2\2\u0176\u0177\7I\2\2\u0177/\3\2\2\2\u0178\u0179\7\'\2\2\u0179"+
		"\u017a\7D\2\2\u017a\u017b\7K\2\2\u017b\u017c\b\31\1\2\u017c\u017d\7E\2"+
		"\2\u017d\u017e\7I\2\2\u017e\61\3\2\2\2\u017f\u0180\7(\2\2\u0180\u0186"+
		"\7D\2\2\u0181\u0182\5@!\2\u0182\u0183\b\32\1\2\u0183\u0187\3\2\2\2\u0184"+
		"\u0185\7J\2\2\u0185\u0187\b\32\1\2\u0186\u0181\3\2\2\2\u0186\u0184\3\2"+
		"\2\2\u0187\u0192\3\2\2\2\u0188\u018e\7H\2\2\u0189\u018a\5@!\2\u018a\u018b"+
		"\b\32\1\2\u018b\u018f\3\2\2\2\u018c\u018d\7J\2\2\u018d\u018f\b\32\1\2"+
		"\u018e\u0189\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u0188"+
		"\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u0195\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0196\7E\2\2\u0196\u0197\7I\2"+
		"\2\u0197\63\3\2\2\2\u0198\u0199\7)\2\2\u0199\u01ae\7D\2\2\u019a\u019b"+
		"\5@!\2\u019b\u019c\b\33\1\2\u019c\u01a0\3\2\2\2\u019d\u019e\7J\2\2\u019e"+
		"\u01a0\b\33\1\2\u019f\u019a\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01ab\3"+
		"\2\2\2\u01a1\u01a7\7H\2\2\u01a2\u01a3\5@!\2\u01a3\u01a4\b\33\1\2\u01a4"+
		"\u01a8\3\2\2\2\u01a5\u01a6\7J\2\2\u01a6\u01a8\b\33\1\2\u01a7\u01a2\3\2"+
		"\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01aa\3\2\2\2\u01a9\u01a1\3\2\2\2\u01aa"+
		"\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01af\3\2"+
		"\2\2\u01ad\u01ab\3\2\2\2\u01ae\u019f\3\2\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0\u01b1\7E\2\2\u01b1\u01b2\7I\2\2\u01b2\65\3\2\2\2"+
		"\u01b3\u01b4\5&\24\2\u01b4\u01b5\b\34\1\2\u01b5\u01ca\3\2\2\2\u01b6\u01b7"+
		"\5(\25\2\u01b7\u01b8\b\34\1\2\u01b8\u01ca\3\2\2\2\u01b9\u01ba\5*\26\2"+
		"\u01ba\u01bb\b\34\1\2\u01bb\u01ca\3\2\2\2\u01bc\u01bd\5,\27\2\u01bd\u01be"+
		"\b\34\1\2\u01be\u01ca\3\2\2\2\u01bf\u01ca\5.\30\2\u01c0\u01c1\5\60\31"+
		"\2\u01c1\u01c2\b\34\1\2\u01c2\u01ca\3\2\2\2\u01c3\u01c4\5\62\32\2\u01c4"+
		"\u01c5\b\34\1\2\u01c5\u01ca\3\2\2\2\u01c6\u01c7\5\64\33\2\u01c7\u01c8"+
		"\b\34\1\2\u01c8\u01ca\3\2\2\2\u01c9\u01b3\3\2\2\2\u01c9\u01b6\3\2\2\2"+
		"\u01c9\u01b9\3\2\2\2\u01c9\u01bc\3\2\2\2\u01c9\u01bf\3\2\2\2\u01c9\u01c0"+
		"\3\2\2\2\u01c9\u01c3\3\2\2\2\u01c9\u01c6\3\2\2\2\u01ca\67\3\2\2\2\u01cb"+
		"\u01cc\7-\2\2\u01cc\u01d4\b\35\1\2\u01cd\u01ce\7+\2\2\u01ce\u01d4\b\35"+
		"\1\2\u01cf\u01d0\7*\2\2\u01d0\u01d4\b\35\1\2\u01d1\u01d2\7,\2\2\u01d2"+
		"\u01d4\b\35\1\2\u01d3\u01cb\3\2\2\2\u01d3\u01cd\3\2\2\2\u01d3\u01cf\3"+
		"\2\2\2\u01d3\u01d1\3\2\2\2\u01d49\3\2\2\2\u01d5\u01d6\7K\2\2\u01d6\u01d7"+
		"\7B\2\2\u01d7\u01d8\7K\2\2\u01d8\u01d9\b\36\1\2\u01d9;\3\2\2\2\u01da\u01db"+
		"\7K\2\2\u01db\u01dc\7@\2\2\u01dc\u01dd\5@!\2\u01dd\u01de\b\37\1\2\u01de"+
		"\u01df\7A\2\2\u01df=\3\2\2\2\u01e0\u01e1\7K\2\2\u01e1\u01ea\7D\2\2\u01e2"+
		"\u01e7\5@!\2\u01e3\u01e4\7H\2\2\u01e4\u01e6\5@!\2\u01e5\u01e3\3\2\2\2"+
		"\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01eb"+
		"\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01e2\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb"+
		"\u01ec\3\2\2\2\u01ec\u01ed\7E\2\2\u01ed?\3\2\2\2\u01ee\u01f6\5B\"\2\u01ef"+
		"\u01f0\7>\2\2\u01f0\u01f1\5B\"\2\u01f1\u01f2\b!\1\2\u01f2\u01f3\7?\2\2"+
		"\u01f3\u01f4\5B\"\2\u01f4\u01f5\b!\1\2\u01f5\u01f7\3\2\2\2\u01f6\u01ef"+
		"\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9"+
		"\u01fe\3\2\2\2\u01fa\u01fb\5B\"\2\u01fb\u01fc\b!\1\2\u01fc\u01fe\3\2\2"+
		"\2\u01fd\u01ee\3\2\2\2\u01fd\u01fa\3\2\2\2\u01feA\3\2\2\2\u01ff\u0200"+
		"\5D#\2\u0200\u0205\b\"\1\2\u0201\u0202\t\3\2\2\u0202\u0203\5D#\2\u0203"+
		"\u0204\b\"\1\2\u0204\u0206\3\2\2\2\u0205\u0201\3\2\2\2\u0206\u0207\3\2"+
		"\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020d\3\2\2\2\u0209"+
		"\u020a\5D#\2\u020a\u020b\b\"\1\2\u020b\u020d\3\2\2\2\u020c\u01ff\3\2\2"+
		"\2\u020c\u0209\3\2\2\2\u020dC\3\2\2\2\u020e\u020f\5F$\2\u020f\u0214\b"+
		"#\1\2\u0210\u0211\t\4\2\2\u0211\u0212\5F$\2\u0212\u0213\b#\1\2\u0213\u0215"+
		"\3\2\2\2\u0214\u0210\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0214\3\2\2\2\u0216"+
		"\u0217\3\2\2\2\u0217\u021c\3\2\2\2\u0218\u0219\5F$\2\u0219\u021a\b#\1"+
		"\2\u021a\u021c\3\2\2\2\u021b\u020e\3\2\2\2\u021b\u0218\3\2\2\2\u021cE"+
		"\3\2\2\2\u021d\u0222\5H%\2\u021e\u021f\t\5\2\2\u021f\u0220\5H%\2\u0220"+
		"\u0221\b$\1\2\u0221\u0223\3\2\2\2\u0222\u021e\3\2\2\2\u0223\u0224\3\2"+
		"\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u022a\3\2\2\2\u0226"+
		"\u0227\5H%\2\u0227\u0228\b$\1\2\u0228\u022a\3\2\2\2\u0229\u021d\3\2\2"+
		"\2\u0229\u0226\3\2\2\2\u022aG\3\2\2\2\u022b\u0230\5J&\2\u022c\u022d\t"+
		"\6\2\2\u022d\u022e\5J&\2\u022e\u022f\b%\1\2\u022f\u0231\3\2\2\2\u0230"+
		"\u022c\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2"+
		"\2\2\u0233\u0238\3\2\2\2\u0234\u0235\5J&\2\u0235\u0236\b%\1\2\u0236\u0238"+
		"\3\2\2\2\u0237\u022b\3\2\2\2\u0237\u0234\3\2\2\2\u0238I\3\2\2\2\u0239"+
		"\u023a\t\7\2\2\u023a\u023b\5L\'\2\u023b\u023c\b&\1\2\u023c\u0241\3\2\2"+
		"\2\u023d\u023e\5L\'\2\u023e\u023f\b&\1\2\u023f\u0241\3\2\2\2\u0240\u0239"+
		"\3\2\2\2\u0240\u023d\3\2\2\2\u0241K\3\2\2\2\u0242\u0243\58\35\2\u0243"+
		"\u0244\b\'\1\2\u0244\u0252\3\2\2\2\u0245\u0246\7K\2\2\u0246\u0252\b\'"+
		"\1\2\u0247\u0248\5:\36\2\u0248\u0249\b\'\1\2\u0249\u0252\3\2\2\2\u024a"+
		"\u024b\5<\37\2\u024b\u024c\b\'\1\2\u024c\u0252\3\2\2\2\u024d\u0252\5>"+
		" \2\u024e\u024f\5N(\2\u024f\u0250\b\'\1\2\u0250\u0252\3\2\2\2\u0251\u0242"+
		"\3\2\2\2\u0251\u0245\3\2\2\2\u0251\u0247\3\2\2\2\u0251\u024a\3\2\2\2\u0251"+
		"\u024d\3\2\2\2\u0251\u024e\3\2\2\2\u0252M\3\2\2\2\u0253\u0254\7D\2\2\u0254"+
		"\u0255\5@!\2\u0255\u0256\b(\1\2\u0256\u0257\7E\2\2\u0257O\3\2\2\2=SVY"+
		"]bis\u0083\u0090\u0099\u00a3\u00b2\u00bf\u00c6\u00c8\u00cf\u00d8\u00e0"+
		"\u00e6\u00ed\u00f2\u00f4\u00fb\u00ff\u0104\u010d\u0113\u0118\u0125\u0136"+
		"\u013f\u0142\u0154\u0163\u0170\u0173\u0186\u018e\u0192\u019f\u01a7\u01ab"+
		"\u01ae\u01c9\u01d3\u01e7\u01ea\u01f8\u01fd\u0207\u020c\u0216\u021b\u0224"+
		"\u0229\u0232\u0237\u0240\u0251";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}