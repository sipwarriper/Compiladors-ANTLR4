// Generated from /home/sipwarriper/IdeaProjects/ANTLR4-Compiladors/src/gram.g4 by ANTLR 4.7

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
	        classfile=cf;
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

		    x=new Bytecode(classfile);
		    saltLinia=x.addConstant("S","\n");
		    Vector<Long> trad = new Vector<Long>(10);

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
		enterRule(_localctx, 2, RULE_main);

		    Vector<Long> trad = new Vector<Long>(10);

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

			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_PC_WRITELN - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
				{
				{
				setState(94);
				((MainContext)_localctx).s = sentence();

				    trad.addAll(((MainContext)_localctx).s.trad);

				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(TK_PC_FPROGRAMA);

			    if(!error){
			        trad.add(x.RETURN);
			        x.addMainCode(10L,10L,trad);
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
		enterRule(_localctx, 4, RULE_typeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(TK_PC_TIPUS);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_IDENTIFIER) {
				{
				{
				setState(106);
				newType();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
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
		enterRule(_localctx, 6, RULE_newType);
		Registre registre = new Registre();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			((NewTypeContext)_localctx).id = match(TK_IDENTIFIER);
			setState(115);
			match(TK_OP_COLON);
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PC_INT:
			case TK_PC_REAL:
			case TK_PC_CHAR:
			case TK_PC_BOOL:
				{
				setState(116);
				((NewTypeContext)_localctx).reg = basicType();
				((NewTypeContext)_localctx).reg.reg.putLexema((((NewTypeContext)_localctx).id!=null?((NewTypeContext)_localctx).id.getText():null)); registre = ((NewTypeContext)_localctx).reg.reg;
				}
				break;
			case TK_PC_VECTOR:
				{
				setState(119);
				((NewTypeContext)_localctx).reg2 = vectorDec();
				((NewTypeContext)_localctx).reg2.reg.putLexema((((NewTypeContext)_localctx).id!=null?((NewTypeContext)_localctx).id.getText():null)); registre = ((NewTypeContext)_localctx).reg2.reg;
				}
				break;
			case TK_PC_TUPLA:
				{
				setState(122);
				((NewTypeContext)_localctx).reg3 = tuplaDec();
				((NewTypeContext)_localctx).reg3.reg.putLexema((((NewTypeContext)_localctx).id!=null?((NewTypeContext)_localctx).id.getText():null)); registre = ((NewTypeContext)_localctx).reg3.reg;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(127);
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
		enterRule(_localctx, 8, RULE_basicType);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PC_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(TK_PC_INT);
				 ((BasicTypeContext)_localctx).reg =  new Registre("", "enter"); 
				}
				break;
			case TK_PC_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(TK_PC_REAL);
				 ((BasicTypeContext)_localctx).reg =  new Registre("", "real"); 
				}
				break;
			case TK_PC_CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(TK_PC_CHAR);
				 ((BasicTypeContext)_localctx).reg =  new Registre("", "car"); 
				}
				break;
			case TK_PC_BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
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
		enterRule(_localctx, 10, RULE_vectorDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(TK_PC_VECTOR);
			setState(141);
			((VectorDecContext)_localctx).bt = basicType();

			    ((VectorDecContext)_localctx).reg =  new Registre ("", ((VectorDecContext)_localctx).bt.reg.getTipus(), "vector");

			setState(143);
			match(TK_PC_MIDA);
			setState(144);
			match(TK_CONST_INT);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_INICI) {
				{
				setState(145);
				match(TK_PC_INICI);
				setState(146);
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
		enterRule(_localctx, 12, RULE_tuplaDec);
		Vector<Pair<String,String>> camps = new Vector<Pair<String,String>>(10); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(TK_PC_TUPLA);
			setState(155); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(150);
				((TuplaDecContext)_localctx).bt = basicType();
				setState(151);
				((TuplaDecContext)_localctx).id = match(TK_IDENTIFIER);
				setState(152);
				match(TK_SEP_SEMICOLON);

				    camps.add(new Pair<>(((TuplaDecContext)_localctx).bt.reg.getTipus(), (((TuplaDecContext)_localctx).id!=null?((TuplaDecContext)_localctx).id.getText():null)));

				}
				}
				setState(157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PC_INT) | (1L << TK_PC_REAL) | (1L << TK_PC_CHAR) | (1L << TK_PC_BOOL))) != 0) );
			setState(159);
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
		enterRule(_localctx, 14, RULE_constBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(TK_PC_CONSTANTS);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PC_INT) | (1L << TK_PC_REAL) | (1L << TK_PC_CHAR) | (1L << TK_PC_BOOL))) != 0)) {
				{
				{
				setState(163);
				((ConstBlockContext)_localctx).bt = basicType();
				setState(164);
				((ConstBlockContext)_localctx).id = match(TK_IDENTIFIER);
				setState(165);
				match(TK_OP_ASSIGN);
				setState(166);
				((ConstBlockContext)_localctx).c = constValue();

				    char tipusCar = ((ConstBlockContext)_localctx).bt.reg.getTipus().toUpperCase().charAt(0);
				    if((tipusCar == ((ConstBlockContext)_localctx).c.tipus || (tipusCar == 'R' && ((ConstBlockContext)_localctx).c.tipus == 'E') ) && !TS.existeix((((ConstBlockContext)_localctx).id!=null?((ConstBlockContext)_localctx).id.getText():null))){
				        Long idConst = x.addConstName((((ConstBlockContext)_localctx).id!=null?((ConstBlockContext)_localctx).id.getText():null), toBytecodeType(tipusCar), (((ConstBlockContext)_localctx).c!=null?_input.getText(((ConstBlockContext)_localctx).c.start,((ConstBlockContext)_localctx).c.stop):null));
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

				setState(168);
				match(TK_SEP_SEMICOLON);
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
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
		enterRule(_localctx, 16, RULE_varBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(TK_PC_VARIABLES);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & ((1L << (TK_PC_INT - 33)) | (1L << (TK_PC_REAL - 33)) | (1L << (TK_PC_CHAR - 33)) | (1L << (TK_PC_BOOL - 33)) | (1L << (TK_IDENTIFIER - 33)))) != 0)) {
				{
				{
				setState(178);
				((VarBlockContext)_localctx).t = type();
				setState(179);
				((VarBlockContext)_localctx).id = match(TK_IDENTIFIER);
				setState(180);
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
				            System.out.println("Error, dos variables amb el mateix nom detectats a la linia " + (((VarBlockContext)_localctx).id!=null?((VarBlockContext)_localctx).id.getLine():0));
				        }
				    }

				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
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
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_PC_ACCIO || _la==TK_PC_FUNCIO) {
				{
				setState(192);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_PC_ACCIO:
					{
					setState(190);
					accioDec();
					}
					break;
				case TK_PC_FUNCIO:
					{
					setState(191);
					funcDec();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(196);
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
			setState(197);
			match(TK_PC_ACCIO);
			setState(198);
			match(TK_IDENTIFIER);
			setState(199);
			match(TK_OP_PAR_OPEN);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PC_PARAM_IN) | (1L << TK_PC_PARAM_IO) | (1L << TK_PC_INT) | (1L << TK_PC_REAL) | (1L << TK_PC_CHAR) | (1L << TK_PC_BOOL))) != 0) || _la==TK_IDENTIFIER) {
				{
				setState(200);
				params();
				}
			}

			setState(203);
			match(TK_OP_PAR_CLOSE);
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
			setState(206);
			match(TK_PC_FUNCIO);
			setState(207);
			match(TK_IDENTIFIER);
			setState(208);
			match(TK_OP_PAR_OPEN);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PC_PARAM_IN) | (1L << TK_PC_PARAM_IO) | (1L << TK_PC_INT) | (1L << TK_PC_REAL) | (1L << TK_PC_CHAR) | (1L << TK_PC_BOOL))) != 0) || _la==TK_IDENTIFIER) {
				{
				setState(209);
				params();
				}
			}

			setState(212);
			match(TK_OP_PAR_CLOSE);
			setState(213);
			match(TK_PC_RETURN);
			setState(214);
			basicType();
			setState(215);
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
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_PARAM_IN || _la==TK_PC_PARAM_IO) {
				{
				setState(217);
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

			setState(220);
			type();
			setState(221);
			match(TK_IDENTIFIER);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_SEP_COMMA) {
				{
				{
				setState(222);
				match(TK_SEP_COMMA);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_PC_PARAM_IN || _la==TK_PC_PARAM_IO) {
					{
					setState(223);
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

				setState(226);
				type();
				setState(227);
				match(TK_IDENTIFIER);
				}
				}
				setState(233);
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
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_PC_ACCIO || _la==TK_PC_FUNCIO) {
				{
				setState(236);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TK_PC_ACCIO:
					{
					setState(234);
					accioImp();
					}
					break;
				case TK_PC_FUNCIO:
					{
					setState(235);
					funcImp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(240);
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
			setState(241);
			match(TK_PC_ACCIO);
			setState(242);
			match(TK_IDENTIFIER);
			setState(243);
			match(TK_OP_PAR_OPEN);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PC_PARAM_IN) | (1L << TK_PC_PARAM_IO) | (1L << TK_PC_INT) | (1L << TK_PC_REAL) | (1L << TK_PC_CHAR) | (1L << TK_PC_BOOL))) != 0) || _la==TK_IDENTIFIER) {
				{
				setState(244);
				params();
				}
			}

			setState(247);
			match(TK_OP_PAR_CLOSE);
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
			setState(259);
			match(TK_PC_FUNCIO);
			setState(260);
			match(TK_IDENTIFIER);
			setState(261);
			match(TK_OP_PAR_OPEN);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PC_PARAM_IN) | (1L << TK_PC_PARAM_IO) | (1L << TK_PC_INT) | (1L << TK_PC_REAL) | (1L << TK_PC_CHAR) | (1L << TK_PC_BOOL))) != 0) || _la==TK_IDENTIFIER) {
				{
				setState(262);
				params();
				}
			}

			setState(265);
			match(TK_OP_PAR_CLOSE);
			setState(266);
			match(TK_PC_RETURN);
			setState(267);
			basicType();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_VARIABLES) {
				{
				setState(268);
				varBlock();
				}
			}

			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_PC_WRITELN - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
				{
				{
				setState(271);
				sentence();
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(277);
			match(TK_PC_RETURN);
			setState(278);
			expr();
			setState(279);
			match(TK_SEP_SEMICOLON);
			setState(280);
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
		enterRule(_localctx, 32, RULE_type);
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
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
				setState(284);
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
		enterRule(_localctx, 34, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(289);
			((AssignContext)_localctx).id = match(TK_IDENTIFIER);
			}
			setState(290);
			match(TK_OP_ASSIGN);
			setState(291);
			((AssignContext)_localctx).e = expr();

			    if (!error){
			        if (!(TS.existeix((((AssignContext)_localctx).id!=null?((AssignContext)_localctx).id.getText():null)))){
			            error=true;
			            System.out.println("Variable " +(((AssignContext)_localctx).id!=null?((AssignContext)_localctx).id.getText():null)+  " inexistent a la linea " + (((AssignContext)_localctx).id!=null?((AssignContext)_localctx).id.getLine():0));
			        }
			        else if(TS.obtenir((((AssignContext)_localctx).id!=null?((AssignContext)_localctx).id.getText():null)).getTipusLexema().equals("var")){
			            error=true;
			            System.out.println("Variable " +(((AssignContext)_localctx).id!=null?((AssignContext)_localctx).id.getText():null)+  " inexistent a la linea " + (((AssignContext)_localctx).id!=null?((AssignContext)_localctx).id.getLine():0));
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
			                _localctx.trad.add(x.I2F); //castajem enter a float;
			                _localctx.trad.add(x.FSTORE);
			                _localctx.trad.add(new Long(r.getAdreca()));
			            }
			            else{
			                error=true;
			                System.out.println("Error de tipus a la linea " + (((AssignContext)_localctx).id!=null?((AssignContext)_localctx).id.getLine():0));
			            }
			        }
			    }

			setState(293);
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
		enterRule(_localctx, 36, RULE_if_rule);

		    Vector<Long> trad2 = new Vector<Long>(10);
		    Vector<Long> trad3 = new Vector<Long>(10);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			((If_ruleContext)_localctx).s = match(TK_PC_SI);
			setState(296);
			((If_ruleContext)_localctx).t1 = expr();

			              if(((If_ruleContext)_localctx).t1.tipus != 'B'){ //la condició ha de ser booleana
			                  error = true;
			                  System.out.println("Error de tipus detectat a la linia " + (((If_ruleContext)_localctx).s!=null?((If_ruleContext)_localctx).s.getLine():0) + ":la condició del if ha de ser booleana." + (((If_ruleContext)_localctx).t1!=null?_input.getText(((If_ruleContext)_localctx).t1.start,((If_ruleContext)_localctx).t1.stop):null));
			              }
			          
			setState(298);
			match(TK_PC_LLAVORS);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_PC_WRITELN - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
				{
				{
				setState(299);
				((If_ruleContext)_localctx).sen = sentence();
				trad2.addAll(((If_ruleContext)_localctx).sen.trad);
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_PC_ALTRAMENT) {
				{
				setState(307);
				match(TK_PC_ALTRAMENT);
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_PC_WRITELN - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
					{
					{
					setState(308);
					((If_ruleContext)_localctx).sen2 = sentence();
					trad3.addAll(((If_ruleContext)_localctx).sen2.trad);
					}
					}
					setState(315);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(318);
			match(TK_PC_FSI);

			                if(!error){
			                    ((If_ruleContext)_localctx).trad = ((If_ruleContext)_localctx).t1.trad;
			                    _localctx.trad.add(x.IFNE);
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
		enterRule(_localctx, 38, RULE_for_rule);

		    Vector<Long> trad2 = new Vector<Long>(10);
		    Vector<Long> trad3 = new Vector<Long>(10);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(TK_PC_PER);
			setState(322);
			((For_ruleContext)_localctx).id = match(TK_IDENTIFIER);
			setState(323);
			match(TK_PC_DE);
			setState(324);
			((For_ruleContext)_localctx).t1 = expr();
			setState(325);
			match(TK_PC_FINS);
			setState(326);
			((For_ruleContext)_localctx).t2 = expr();

			         if(((For_ruleContext)_localctx).t1.tipus != 'E' || ((For_ruleContext)_localctx).t2.tipus !='E'){
			             error = true;
			             System.out.println("Error de tipus detectat a la linia " + (((For_ruleContext)_localctx).id!=null?((For_ruleContext)_localctx).id.getLine():0) + ":els valors dels intervals del for han de ser enters");
			         }
			     
			setState(328);
			match(TK_PC_FER);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_PC_WRITELN - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
				{
				{
				setState(329);
				((For_ruleContext)_localctx).sen = sentence();
				trad2.addAll(((For_ruleContext)_localctx).sen.trad);
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(337);
			match(TK_PC_FPER);

			        Registre r = TS.obtenir((((For_ruleContext)_localctx).id!=null?((For_ruleContext)_localctx).id.getText():null));
			        char tipus = r.getTipus().toUpperCase().charAt(0);
			        ((For_ruleContext)_localctx).trad =  ((For_ruleContext)_localctx).t1.trad;
			        if(tipus == ((For_ruleContext)_localctx).t1.tipus){
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
			        else{
			            error=true;
			            System.out.println("Error de tipus a la linea " + (((For_ruleContext)_localctx).id!=null?((For_ruleContext)_localctx).id.getLine():0));
			        }
			        //falta fer el check
			        _localctx.trad.add(x.FCMPG);
			        _localctx.trad.add(x.IFNE);
			        Long salt=trad2.size()+9L;
			        _localctx.trad.add(x.nByte(salt,2));
			        _localctx.trad.add(x.nByte(salt,1));
			        _localctx.trad.addAll(trad2);
			        _localctx.trad.add(x.IINC);
			        _localctx.trad.add(new Long(r.getAdreca()));// HMM?
			        _localctx.trad.add(1L);
			        salt=0L-_localctx.trad.size()-6L;
			        _localctx.trad.add(x.GOTO);
			        _localctx.trad.add(x.nByte(salt,2));
			        _localctx.trad.add(x.nByte(salt,1));
			    
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
		enterRule(_localctx, 40, RULE_while_rule);

		    Vector<Long> trad2 = new Vector<Long>(10);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			((While_ruleContext)_localctx).s = match(TK_PC_MENTRE);
			setState(341);
			((While_ruleContext)_localctx).t1 = expr();

			          if(((While_ruleContext)_localctx).t1.tipus != 'B'){ //la condició ha de ser booleana
			              error = true;
			              System.out.println("Error de tipus detectat a la linia " + (((While_ruleContext)_localctx).s!=null?((While_ruleContext)_localctx).s.getLine():0) + ":la condició del while ha de ser booleana.");
			          }
			      
			setState(343);
			match(TK_PC_FER);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (TK_PC_SI - 22)) | (1L << (TK_PC_PER - 22)) | (1L << (TK_PC_MENTRE - 22)) | (1L << (TK_PC_READ - 22)) | (1L << (TK_PC_WRITE - 22)) | (1L << (TK_PC_WRITELN - 22)) | (1L << (TK_IDENTIFIER - 22)))) != 0)) {
				{
				{
				setState(344);
				((While_ruleContext)_localctx).sen = sentence();
				trad2.addAll(((While_ruleContext)_localctx).sen.trad);
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(352);
			match(TK_PC_FMENTRE);

			         if(!error){
			                ((While_ruleContext)_localctx).trad = ((While_ruleContext)_localctx).t1.trad;
			                _localctx.trad.add(x.IFNE);
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
		enterRule(_localctx, 42, RULE_accio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(TK_IDENTIFIER);
			setState(356);
			match(TK_OP_PAR_OPEN);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (TK_CONST_CHAR - 40)) | (1L << (TK_CONST_REAL - 40)) | (1L << (TK_CONST_BOOL - 40)) | (1L << (TK_CONST_INT - 40)) | (1L << (TK_OP_MINUS - 40)) | (1L << (TK_OP_NEG - 40)) | (1L << (TK_OP_PAR_OPEN - 40)) | (1L << (TK_IDENTIFIER - 40)))) != 0)) {
				{
				setState(357);
				expr();
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_SEP_COMMA) {
					{
					{
					setState(358);
					match(TK_SEP_COMMA);
					setState(359);
					expr();
					}
					}
					setState(364);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(367);
			match(TK_OP_PAR_CLOSE);
			setState(368);
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
		enterRule(_localctx, 44, RULE_read);

		    ((ReadContext)_localctx).trad =  new Vector<Long>(10);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(TK_PC_READ);
			setState(371);
			match(TK_OP_PAR_OPEN);
			setState(372);
			((ReadContext)_localctx).id = match(TK_IDENTIFIER);

			    if(TS.existeix((((ReadContext)_localctx).id!=null?((ReadContext)_localctx).id.getText():null))){
			        Registre reg = TS.obtenir((((ReadContext)_localctx).id!=null?((ReadContext)_localctx).id.getText():null));
			        char tipus = reg.getTipus().toUpperCase().charAt(0);
			        switch(tipus){
			             case 'E':
			                 _localctx.trad.add(x.nByte(x.mGetInt,2));
			                 _localctx.trad.add(x.nByte(x.mGetInt,1));
			                 _localctx.trad.add(x.ISTORE);
			                 break;
			             case 'R':
			                 _localctx.trad.add(x.nByte(x.mGetFloat,2));
			                 _localctx.trad.add(x.nByte(x.mGetFloat,1));
			                 _localctx.trad.add(x.ISTORE);
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

			setState(374);
			match(TK_OP_PAR_CLOSE);
			setState(375);
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
		enterRule(_localctx, 46, RULE_write);

		          ((WriteContext)_localctx).trad =  new Vector<Long>(10);
		      
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(TK_PC_WRITE);
			setState(378);
			match(TK_OP_PAR_OPEN);
			setState(384);
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
				setState(379);
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
				                        _localctx.trad.add(x.I2C); //castajem enter a char
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
				setState(382);
				((WriteContext)_localctx).s = match(TK_STRING_LITERAL);

				             Long tempString = x.addConstant("S",(((WriteContext)_localctx).s!=null?((WriteContext)_localctx).s.getText():null));
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
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_SEP_COMMA) {
				{
				{
				setState(386);
				match(TK_SEP_COMMA);
				setState(392);
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
					setState(387);
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
					                        _localctx.trad.add(x.I2C); //castajem enter a char
					                        _localctx.trad.add(x.nByte(x.mPutChar,2));
					                        _localctx.trad.add(x.nByte(x.mPutChar,1));
					                        break;
					                     case 'B':
					                        _localctx.trad.add(x.I2B); //castajem enter a byte
					                        _localctx.trad.add(x.nByte(x.mPutBoolean,2));
					                        _localctx.trad.add(x.nByte(x.mPutBoolean,1));
					                        break;
					                }
					            }
					      
					}
					break;
				case TK_STRING_LITERAL:
					{
					setState(390);
					((WriteContext)_localctx).s1 = match(TK_STRING_LITERAL);

					              Long tempString = x.addConstant("S",(((WriteContext)_localctx).s1!=null?((WriteContext)_localctx).s1.getText():null));
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
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(399);
			match(TK_OP_PAR_CLOSE);
			setState(400);
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
		enterRule(_localctx, 48, RULE_writeln);

		    ((WritelnContext)_localctx).trad =  new Vector<Long>(10);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(TK_PC_WRITELN);
			setState(403);
			match(TK_OP_PAR_OPEN);
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (TK_CONST_CHAR - 40)) | (1L << (TK_CONST_REAL - 40)) | (1L << (TK_CONST_BOOL - 40)) | (1L << (TK_CONST_INT - 40)) | (1L << (TK_OP_MINUS - 40)) | (1L << (TK_OP_NEG - 40)) | (1L << (TK_OP_PAR_OPEN - 40)) | (1L << (TK_STRING_LITERAL - 40)) | (1L << (TK_IDENTIFIER - 40)))) != 0)) {
				{
				setState(409);
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
					setState(404);
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
					                    _localctx.trad.add(x.I2C); //castajem enter a char
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
					setState(407);
					((WritelnContext)_localctx).s = match(TK_STRING_LITERAL);

					    Long tempString = x.addConstant("S",(((WritelnContext)_localctx).s!=null?((WritelnContext)_localctx).s.getText():null));
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
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_SEP_COMMA) {
					{
					{
					setState(411);
					match(TK_SEP_COMMA);
					setState(417);
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
						setState(412);
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
						                    _localctx.trad.add(x.I2C); //castajem enter a char
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
						setState(415);
						((WritelnContext)_localctx).s1 = match(TK_STRING_LITERAL);

						    Long tempString = x.addConstant("S",(((WritelnContext)_localctx).s1!=null?((WritelnContext)_localctx).s1.getText():null));
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
					setState(423);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(426);
			match(TK_OP_PAR_CLOSE);
			setState(427);
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
		enterRule(_localctx, 50, RULE_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(429);
				((SentenceContext)_localctx).a = assign();
				((SentenceContext)_localctx).trad = ((SentenceContext)_localctx).a.trad;
				}
				break;
			case 2:
				{
				setState(432);
				((SentenceContext)_localctx).i = if_rule();
				((SentenceContext)_localctx).trad = ((SentenceContext)_localctx).i.trad;
				}
				break;
			case 3:
				{
				setState(435);
				((SentenceContext)_localctx).f = for_rule();
				((SentenceContext)_localctx).trad = ((SentenceContext)_localctx).f.trad;
				}
				break;
			case 4:
				{
				setState(438);
				((SentenceContext)_localctx).w = while_rule();
				((SentenceContext)_localctx).trad = ((SentenceContext)_localctx).w.trad;
				}
				break;
			case 5:
				{
				setState(441);
				accio();
				}
				break;
			case 6:
				{
				setState(442);
				((SentenceContext)_localctx).r = read();
				((SentenceContext)_localctx).trad =  ((SentenceContext)_localctx).r.trad;
				}
				break;
			case 7:
				{
				setState(445);
				((SentenceContext)_localctx).wr = write();
				_localctx.trad = ((SentenceContext)_localctx).wr.trad
				}
				break;
			case 8:
				{
				setState(448);
				((SentenceContext)_localctx).wr2 = writeln();
				_localctx.trad = ((SentenceContext)_localctx).wr2.trad
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
		enterRule(_localctx, 52, RULE_constValue);

		    ((ConstValueContext)_localctx).trad =  new Vector<Long> (10);

		try {
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_CONST_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				((ConstValueContext)_localctx).a = match(TK_CONST_INT);

				        ((ConstValueContext)_localctx).tipus =  'E';
				        _localctx.trad.add(x.BIPUSH);
				        _localctx.trad.add(new Long((((ConstValueContext)_localctx).a!=null?((ConstValueContext)_localctx).a.getText():null)));
				    
				}
				break;
			case TK_CONST_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				((ConstValueContext)_localctx).b = match(TK_CONST_REAL);

				        ((ConstValueContext)_localctx).tipus =  'R';
				        _localctx.trad.add(x.BIPUSH);
				        _localctx.trad.add(new Long((((ConstValueContext)_localctx).b!=null?((ConstValueContext)_localctx).b.getText():null)));
				        _localctx.trad.add(x.I2F);
				        
				}
				break;
			case TK_CONST_CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(457);
				((ConstValueContext)_localctx).c = match(TK_CONST_CHAR);

				        ((ConstValueContext)_localctx).tipus =  'C';
				        _localctx.trad.add(x.BIPUSH);
				        _localctx.trad.add(new Long((((ConstValueContext)_localctx).c!=null?((ConstValueContext)_localctx).c.getText():null)));
				        _localctx.trad.add(x.I2C);
				}
				break;
			case TK_CONST_BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(459);
				((ConstValueContext)_localctx).d = match(TK_CONST_BOOL);

				        ((ConstValueContext)_localctx).tipus =  'B';
				        _localctx.trad.add(x.BIPUSH);
				        _localctx.trad.add(new Long((((ConstValueContext)_localctx).d!=null?((ConstValueContext)_localctx).d.getText():null)));
				    
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
		enterRule(_localctx, 54, RULE_tuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			((TupleContext)_localctx).id = match(TK_IDENTIFIER);
			setState(464);
			match(TK_OP_TUPLE);
			setState(465);
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
		enterRule(_localctx, 56, RULE_vector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			((VectorContext)_localctx).id = match(TK_IDENTIFIER);
			setState(469);
			match(TK_OP_VECTOR_OPEN);
			setState(470);
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
			     
			setState(472);
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
			setState(474);
			match(TK_IDENTIFIER);
			setState(475);
			match(TK_OP_PAR_OPEN);
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (TK_CONST_CHAR - 40)) | (1L << (TK_CONST_REAL - 40)) | (1L << (TK_CONST_BOOL - 40)) | (1L << (TK_CONST_INT - 40)) | (1L << (TK_OP_MINUS - 40)) | (1L << (TK_OP_NEG - 40)) | (1L << (TK_OP_PAR_OPEN - 40)) | (1L << (TK_IDENTIFIER - 40)))) != 0)) {
				{
				setState(476);
				expr();
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_SEP_COMMA) {
					{
					{
					setState(477);
					match(TK_SEP_COMMA);
					setState(478);
					expr();
					}
					}
					setState(483);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(486);
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
		enterRule(_localctx, 60, RULE_expr);
		int _la;
		try {
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(488);
				((ExprContext)_localctx).boolea = logicsDown();
				setState(496); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(489);
					((ExprContext)_localctx).s = match(TK_OP_QUESTION_MARK);
					setState(490);
					((ExprContext)_localctx).t1 = logicsDown();

					            ((ExprContext)_localctx).tipus =  ((ExprContext)_localctx).t1.tipus;
					            if(((ExprContext)_localctx).boolea.tipus != 'B'){ //la condició ha de ser booleana
					                error = true;
					                System.out.println("Error de tipus detectat a la linia " + (((ExprContext)_localctx).s!=null?((ExprContext)_localctx).s.getLine():0) + ": La condició d'un ternari ha de ser booleana");
					            }
					        
					setState(492);
					((ExprContext)_localctx).s = match(TK_OP_COLON);
					setState(493);
					((ExprContext)_localctx).t2 = logicsDown();

					                if(((ExprContext)_localctx).t1.tipus != ((ExprContext)_localctx).t2.tipus && !((((ExprContext)_localctx).t1.tipus == 'E' && ((ExprContext)_localctx).t2.tipus == 'R')||(((ExprContext)_localctx).t1.tipus == 'R' && ((ExprContext)_localctx).t2.tipus == 'E'))){
					                //cast de real a enter
					                    error = true;
					                    System.out.println("Error de tipus detectat a la linia " + (((ExprContext)_localctx).s!=null?((ExprContext)_localctx).s.getLine():0) + ": Els tipus del ternari no casen");
					                }
					            
					}
					}
					setState(498); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TK_OP_QUESTION_MARK );
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
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
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(505);
				((LogicsDownContext)_localctx).t1 = logicUp();
				((LogicsDownContext)_localctx).tipus =  'B';
				setState(511); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(507);
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
					setState(508);
					((LogicsDownContext)_localctx).t2 = logicUp();

					                 if(((LogicsDownContext)_localctx).t1.tipus != 'B' && ((LogicsDownContext)_localctx).t2.tipus != 'B'){
					                 //cast de real a enter
					                     error = true;
					                     System.out.println("Error de tipus detectat a la linia " + (((LogicsDownContext)_localctx).s!=null?((LogicsDownContext)_localctx).s.getLine():0) + ": Els tipus de operació lògica no casen");
					                 }
					             
					}
					}
					setState(513); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TK_OP_AND || _la==TK_OP_OR );
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
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
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(520);
				((LogicUpContext)_localctx).t1 = sum();
				((LogicUpContext)_localctx).tipus =  'B';
				setState(526); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(522);
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
					setState(523);
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
					setState(528); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_OP_EQ) | (1L << TK_OP_DIFF) | (1L << TK_OP_GT) | (1L << TK_OP_LT) | (1L << TK_OP_LOET) | (1L << TK_OP_GOET))) != 0) );
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
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
		enterRule(_localctx, 66, RULE_sum);
		int _la;
		try {
			setState(547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(535);
				((SumContext)_localctx).t1 = mult();
				setState(540); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(536);
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
					setState(537);
					((SumContext)_localctx).t2 = mult();

					        ((SumContext)_localctx).trad =  ((SumContext)_localctx).t1.trad;
					          if((((SumContext)_localctx).t1.tipus == 'E' || ((SumContext)_localctx).t1.tipus == 'R') && (((SumContext)_localctx).t2.tipus == 'R' || ((SumContext)_localctx).t2.tipus == 'E')){
					              ((SumContext)_localctx).tipus =  'R';
					          } else if(((SumContext)_localctx).t1.tipus == ((SumContext)_localctx).t2.tipus && (((SumContext)_localctx).t1.tipus == 'E' || ((SumContext)_localctx).t1.tipus == 'R')){
					              ((SumContext)_localctx).tipus =  ((SumContext)_localctx).t1.tipus;
					          } else{
					              error = true;
					              System.out.println("Error de tipus detectat a la linia " + (((SumContext)_localctx).s!=null?((SumContext)_localctx).s.getLine():0) + ": El tipus de la suma/resta no casen");
					          }
					          if(!error){
					              if(((SumContext)_localctx).t1.tipus = 'E' && ((SumContext)_localctx).t2.tipus = 'R') _localctx.trad.add(x.I2F);
					              _localctx.trad.addAll(((SumContext)_localctx).t2.trad);
					              if(((SumContext)_localctx).t2.tipus = 'E' && ((SumContext)_localctx).t1.tipus = 'R') _localctx.trad.add(x.I2F);
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
					setState(542); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TK_OP_SUMA || _la==TK_OP_RESTA );
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(544);
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
		enterRule(_localctx, 68, RULE_mult);
		int _la;
		try {
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(549);
				((MultContext)_localctx).t1 = neg();
				setState(554); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(550);
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
					setState(551);
					((MultContext)_localctx).t2 = neg();

					        ((MultContext)_localctx).trad =  ((MultContext)_localctx).t1.trad;
					          if(((((MultContext)_localctx).s!=null?((MultContext)_localctx).s.getText():null).equals("%") || (((MultContext)_localctx).s!=null?((MultContext)_localctx).s.getText():null).equals("\\")) && (((MultContext)_localctx).t1.tipus == 'E' && ((MultContext)_localctx).t2.tipus == 'E')) {
					                ((MultContext)_localctx).tipus =  'E';
					          } else if ((((MultContext)_localctx).s!=null?((MultContext)_localctx).s.getText():null).equals("/") && (((MultContext)_localctx).t1.tipus == 'E' || ((MultContext)_localctx).t1.tipus == 'R') && (((MultContext)_localctx).t2.tipus == 'E' || ((MultContext)_localctx).t2.tipus == 'R')) {
					                ((MultContext)_localctx).tipus =  'R';
					          } else if ((((MultContext)_localctx).s!=null?((MultContext)_localctx).s.getText():null).equals("*") && (((MultContext)_localctx).t1.tipus == 'E' || ((MultContext)_localctx).t1.tipus == 'R') && (((MultContext)_localctx).t2.tipus == 'E' || ((MultContext)_localctx).t2.tipus == 'R')) {
					                ((MultContext)_localctx).tipus =  'R';
					          } else if ((((MultContext)_localctx).s!=null?((MultContext)_localctx).s.getText():null).equals("*") && ((MultContext)_localctx).t1.tipus == ((MultContext)_localctx).t2.tipus && (((MultContext)_localctx).t1.tipus == 'E' || ((MultContext)_localctx).t2.tipus == 'R')) {
					                ((MultContext)_localctx).tipus =  ((MultContext)_localctx).t1.tipus;
					          } else {
					                error = true;
					                System.out.println("Error de tipus detectat a la linia " + (((MultContext)_localctx).s!=null?((MultContext)_localctx).s.getLine():0) + ": El tipus de " + (((MultContext)_localctx).s!=null?((MultContext)_localctx).s.getText():null) +" no casen");
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
					                    if(((MultContext)_localctx).t1.tipus == 'R') || ((MultContext)_localctx).t2.tipus == 'R')){
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
					setState(556); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_OP_MULT) | (1L << TK_OP_REALDIV) | (1L << TK_OP_INTDIV) | (1L << TK_OP_MOD))) != 0) );
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(558);
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
		enterRule(_localctx, 70, RULE_neg);
		int _la;
		try {
			setState(570);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_OP_MINUS:
			case TK_OP_NEG:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(563);
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
				setState(564);
				((NegContext)_localctx).t = value();

				        ((NegContext)_localctx).tipus =  ((NegContext)_localctx).t.tipus;
				        ((NegContext)_localctx).trad =  ((NegContext)_localctx).t.trad;
				        if(((((NegContext)_localctx).s!=null?((NegContext)_localctx).s.getText():null).equals("~") && (((NegContext)_localctx).t.tipus != 'E' || ((NegContext)_localctx).t.tipus != 'R' )) || ((((NegContext)_localctx).s!=null?((NegContext)_localctx).s.getText():null).equals("no") && ((NegContext)_localctx).t.tipus != 'B')){
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
				setState(567);
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
		enterRule(_localctx, 72, RULE_value);
		try {
			setState(587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(572);
				((ValueContext)_localctx).t1 = constValue();
				((ValueContext)_localctx).tipus =  ((ValueContext)_localctx).t1.tipus; ((ValueContext)_localctx).trad =  ((ValueContext)_localctx).t1.trad;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(575);
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
				            if(_localctx.tipus != 'R'){
				                _localctx.trad.addx.(x.FLOAD);
				            }
				            else{
				                _localctx.trad.add(x.ILOAD);
				            }
							_localctx.trad.add(new Long(reg.getAdreca()));

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
				setState(577);
				((ValueContext)_localctx).t2 = tuple();
				((ValueContext)_localctx).tipus =  ((ValueContext)_localctx).t2.tipus;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(580);
				((ValueContext)_localctx).t3 = vector();
				((ValueContext)_localctx).tipus =  ((ValueContext)_localctx).t3.tipus;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(583);
				func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(584);
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
		enterRule(_localctx, 74, RULE_parenthesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(TK_OP_PAR_OPEN);
			setState(590);
			((ParenthesisContext)_localctx).t = expr();

			    ((ParenthesisContext)_localctx).tipus =  ((ParenthesisContext)_localctx).t.tipus;
			    ((ParenthesisContext)_localctx).trad =  ((ParenthesisContext)_localctx).t.trad;

			setState(592);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3K\u0255\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\5\2P\n\2\3\2\5\2S\n\2"+
		"\3\2\5\2V\n\2\3\2\3\2\5\2Z\n\2\3\3\3\3\3\3\5\3_\n\3\3\3\3\3\3\3\7\3d\n"+
		"\3\f\3\16\3g\13\3\3\3\3\3\3\3\3\4\3\4\7\4n\n\4\f\4\16\4q\13\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0080\n\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u008d\n\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7\u0096\n\7\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u009e\n\b\r\b\16\b\u009f"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00ad\n\t\f\t\16\t\u00b0"+
		"\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00ba\n\n\f\n\16\n\u00bd\13"+
		"\n\3\n\3\n\3\13\3\13\7\13\u00c3\n\13\f\13\16\13\u00c6\13\13\3\f\3\f\3"+
		"\f\3\f\5\f\u00cc\n\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00d5\n\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\5\16\u00dd\n\16\3\16\3\16\3\16\3\16\5\16\u00e3\n\16"+
		"\3\16\3\16\3\16\7\16\u00e8\n\16\f\16\16\16\u00eb\13\16\3\17\3\17\7\17"+
		"\u00ef\n\17\f\17\16\17\u00f2\13\17\3\20\3\20\3\20\3\20\5\20\u00f8\n\20"+
		"\3\20\3\20\5\20\u00fc\n\20\3\20\7\20\u00ff\n\20\f\20\16\20\u0102\13\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u010a\n\21\3\21\3\21\3\21\3\21\5\21"+
		"\u0110\n\21\3\21\7\21\u0113\n\21\f\21\16\21\u0116\13\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u0122\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0131\n\24\f\24\16"+
		"\24\u0134\13\24\3\24\3\24\3\24\3\24\7\24\u013a\n\24\f\24\16\24\u013d\13"+
		"\24\5\24\u013f\n\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\7\25\u014f\n\25\f\25\16\25\u0152\13\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u015e\n\26\f\26\16\26\u0161"+
		"\13\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\7\27\u016b\n\27\f\27\16"+
		"\27\u016e\13\27\5\27\u0170\n\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0183\n\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u018b\n\31\7\31\u018d\n\31\f\31\16\31\u0190"+
		"\13\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u019c\n"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01a4\n\32\7\32\u01a6\n\32\f\32"+
		"\16\32\u01a9\13\32\5\32\u01ab\n\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u01c6\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u01d0\n\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\7\37\u01e2\n\37\f\37\16\37\u01e5\13\37"+
		"\5\37\u01e7\n\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \6 \u01f3\n \r \16 "+
		"\u01f4\3 \3 \3 \5 \u01fa\n \3!\3!\3!\3!\3!\3!\6!\u0202\n!\r!\16!\u0203"+
		"\3!\3!\3!\5!\u0209\n!\3\"\3\"\3\"\3\"\3\"\3\"\6\"\u0211\n\"\r\"\16\"\u0212"+
		"\3\"\3\"\3\"\5\"\u0218\n\"\3#\3#\3#\3#\3#\6#\u021f\n#\r#\16#\u0220\3#"+
		"\3#\3#\5#\u0226\n#\3$\3$\3$\3$\3$\6$\u022d\n$\r$\16$\u022e\3$\3$\3$\5"+
		"$\u0234\n$\3%\3%\3%\3%\3%\3%\3%\5%\u023d\n%\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\5&\u024e\n&\3\'\3\'\3\'\3\'\3\'\3\'\2\2(\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\b\3\2"+
		"\13\f\3\2<=\3\2\65:\3\2./\3\2\60\63\4\2\64\64;;\2\u0278\2O\3\2\2\2\4["+
		"\3\2\2\2\6k\3\2\2\2\bt\3\2\2\2\n\u008c\3\2\2\2\f\u008e\3\2\2\2\16\u0097"+
		"\3\2\2\2\20\u00a4\3\2\2\2\22\u00b3\3\2\2\2\24\u00c4\3\2\2\2\26\u00c7\3"+
		"\2\2\2\30\u00d0\3\2\2\2\32\u00dc\3\2\2\2\34\u00f0\3\2\2\2\36\u00f3\3\2"+
		"\2\2 \u0105\3\2\2\2\"\u0121\3\2\2\2$\u0123\3\2\2\2&\u0129\3\2\2\2(\u0143"+
		"\3\2\2\2*\u0156\3\2\2\2,\u0165\3\2\2\2.\u0174\3\2\2\2\60\u017b\3\2\2\2"+
		"\62\u0194\3\2\2\2\64\u01c5\3\2\2\2\66\u01cf\3\2\2\28\u01d1\3\2\2\2:\u01d6"+
		"\3\2\2\2<\u01dc\3\2\2\2>\u01f9\3\2\2\2@\u0208\3\2\2\2B\u0217\3\2\2\2D"+
		"\u0225\3\2\2\2F\u0233\3\2\2\2H\u023c\3\2\2\2J\u024d\3\2\2\2L\u024f\3\2"+
		"\2\2NP\5\6\4\2ON\3\2\2\2OP\3\2\2\2PR\3\2\2\2QS\5\24\13\2RQ\3\2\2\2RS\3"+
		"\2\2\2SU\3\2\2\2TV\5\20\t\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WY\5\4\3\2XZ"+
		"\5\34\17\2YX\3\2\2\2YZ\3\2\2\2Z\3\3\2\2\2[\\\7\4\2\2\\^\7K\2\2]_\5\22"+
		"\n\2^]\3\2\2\2^_\3\2\2\2_e\3\2\2\2`a\5\64\33\2ab\b\3\1\2bd\3\2\2\2c`\3"+
		"\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7\5\2\2ij\b"+
		"\3\1\2j\5\3\2\2\2ko\7\21\2\2ln\5\b\5\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2o"+
		"p\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7\22\2\2s\7\3\2\2\2tu\7K\2\2u\177\7?\2"+
		"\2vw\5\n\6\2wx\b\5\1\2x\u0080\3\2\2\2yz\5\f\7\2z{\b\5\1\2{\u0080\3\2\2"+
		"\2|}\5\16\b\2}~\b\5\1\2~\u0080\3\2\2\2\177v\3\2\2\2\177y\3\2\2\2\177|"+
		"\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7I\2\2\u0082\u0083\b\5\1\2\u0083"+
		"\t\3\2\2\2\u0084\u0085\7#\2\2\u0085\u008d\b\6\1\2\u0086\u0087\7$\2\2\u0087"+
		"\u008d\b\6\1\2\u0088\u0089\7%\2\2\u0089\u008d\b\6\1\2\u008a\u008b\7&\2"+
		"\2\u008b\u008d\b\6\1\2\u008c\u0084\3\2\2\2\u008c\u0086\3\2\2\2\u008c\u0088"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008d\13\3\2\2\2\u008e\u008f\7\25\2\2\u008f"+
		"\u0090\5\n\6\2\u0090\u0091\b\7\1\2\u0091\u0092\7\26\2\2\u0092\u0095\7"+
		"-\2\2\u0093\u0094\7\27\2\2\u0094\u0096\7-\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\r\3\2\2\2\u0097\u009d\7\23\2\2\u0098\u0099\5\n\6"+
		"\2\u0099\u009a\7K\2\2\u009a\u009b\7I\2\2\u009b\u009c\b\b\1\2\u009c\u009e"+
		"\3\2\2\2\u009d\u0098\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7\24\2\2\u00a2\u00a3\b"+
		"\b\1\2\u00a3\17\3\2\2\2\u00a4\u00ae\7\r\2\2\u00a5\u00a6\5\n\6\2\u00a6"+
		"\u00a7\7K\2\2\u00a7\u00a8\7C\2\2\u00a8\u00a9\5\66\34\2\u00a9\u00aa\b\t"+
		"\1\2\u00aa\u00ab\7I\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00a5\3\2\2\2\u00ad"+
		"\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\16\2\2\u00b2\21\3\2\2\2\u00b3\u00bb"+
		"\7\17\2\2\u00b4\u00b5\5\"\22\2\u00b5\u00b6\7K\2\2\u00b6\u00b7\7I\2\2\u00b7"+
		"\u00b8\b\n\1\2\u00b8\u00ba\3\2\2\2\u00b9\u00b4\3\2\2\2\u00ba\u00bd\3\2"+
		"\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\u00bf\7\20\2\2\u00bf\23\3\2\2\2\u00c0\u00c3\5\26"+
		"\f\2\u00c1\u00c3\5\30\r\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\25\3\2\2"+
		"\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7\6\2\2\u00c8\u00c9\7K\2\2\u00c9\u00cb"+
		"\7D\2\2\u00ca\u00cc\5\32\16\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2"+
		"\u00cc\u00cd\3\2\2\2\u00cd\u00ce\7E\2\2\u00ce\u00cf\7I\2\2\u00cf\27\3"+
		"\2\2\2\u00d0\u00d1\7\b\2\2\u00d1\u00d2\7K\2\2\u00d2\u00d4\7D\2\2\u00d3"+
		"\u00d5\5\32\16\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3"+
		"\2\2\2\u00d6\u00d7\7E\2\2\u00d7\u00d8\7\n\2\2\u00d8\u00d9\5\n\6\2\u00d9"+
		"\u00da\7I\2\2\u00da\31\3\2\2\2\u00db\u00dd\t\2\2\2\u00dc\u00db\3\2\2\2"+
		"\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\5\"\22\2\u00df\u00e9"+
		"\7K\2\2\u00e0\u00e2\7H\2\2\u00e1\u00e3\t\2\2\2\u00e2\u00e1\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\5\"\22\2\u00e5\u00e6\7"+
		"K\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e0\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\33\3\2\2\2\u00eb\u00e9\3\2\2"+
		"\2\u00ec\u00ef\5\36\20\2\u00ed\u00ef\5 \21\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\35\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\7\6\2\2\u00f4\u00f5"+
		"\7K\2\2\u00f5\u00f7\7D\2\2\u00f6\u00f8\5\32\16\2\u00f7\u00f6\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\7E\2\2\u00fa\u00fc\5\22"+
		"\n\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0100\3\2\2\2\u00fd"+
		"\u00ff\5\64\33\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3"+
		"\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103"+
		"\u0104\7\7\2\2\u0104\37\3\2\2\2\u0105\u0106\7\b\2\2\u0106\u0107\7K\2\2"+
		"\u0107\u0109\7D\2\2\u0108\u010a\5\32\16\2\u0109\u0108\3\2\2\2\u0109\u010a"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\7E\2\2\u010c\u010d\7\n\2\2\u010d"+
		"\u010f\5\n\6\2\u010e\u0110\5\22\n\2\u010f\u010e\3\2\2\2\u010f\u0110\3"+
		"\2\2\2\u0110\u0114\3\2\2\2\u0111\u0113\5\64\33\2\u0112\u0111\3\2\2\2\u0113"+
		"\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2"+
		"\2\2\u0116\u0114\3\2\2\2\u0117\u0118\7\n\2\2\u0118\u0119\5> \2\u0119\u011a"+
		"\7I\2\2\u011a\u011b\7\t\2\2\u011b!\3\2\2\2\u011c\u011d\7K\2\2\u011d\u0122"+
		"\b\22\1\2\u011e\u011f\5\n\6\2\u011f\u0120\b\22\1\2\u0120\u0122\3\2\2\2"+
		"\u0121\u011c\3\2\2\2\u0121\u011e\3\2\2\2\u0122#\3\2\2\2\u0123\u0124\7"+
		"K\2\2\u0124\u0125\7C\2\2\u0125\u0126\5> \2\u0126\u0127\b\23\1\2\u0127"+
		"\u0128\7I\2\2\u0128%\3\2\2\2\u0129\u012a\7\30\2\2\u012a\u012b\5> \2\u012b"+
		"\u012c\b\24\1\2\u012c\u0132\7\31\2\2\u012d\u012e\5\64\33\2\u012e\u012f"+
		"\b\24\1\2\u012f\u0131\3\2\2\2\u0130\u012d\3\2\2\2\u0131\u0134\3\2\2\2"+
		"\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u013e\3\2\2\2\u0134\u0132"+
		"\3\2\2\2\u0135\u013b\7\32\2\2\u0136\u0137\5\64\33\2\u0137\u0138\b\24\1"+
		"\2\u0138\u013a\3\2\2\2\u0139\u0136\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139"+
		"\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013e"+
		"\u0135\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\7\33"+
		"\2\2\u0141\u0142\b\24\1\2\u0142\'\3\2\2\2\u0143\u0144\7\34\2\2\u0144\u0145"+
		"\7K\2\2\u0145\u0146\7\35\2\2\u0146\u0147\5> \2\u0147\u0148\7\36\2\2\u0148"+
		"\u0149\5> \2\u0149\u014a\b\25\1\2\u014a\u0150\7\37\2\2\u014b\u014c\5\64"+
		"\33\2\u014c\u014d\b\25\1\2\u014d\u014f\3\2\2\2\u014e\u014b\3\2\2\2\u014f"+
		"\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0153\u0154\7 \2\2\u0154\u0155\b\25\1\2\u0155"+
		")\3\2\2\2\u0156\u0157\7!\2\2\u0157\u0158\5> \2\u0158\u0159\b\26\1\2\u0159"+
		"\u015f\7\37\2\2\u015a\u015b\5\64\33\2\u015b\u015c\b\26\1\2\u015c\u015e"+
		"\3\2\2\2\u015d\u015a\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0163\7\""+
		"\2\2\u0163\u0164\b\26\1\2\u0164+\3\2\2\2\u0165\u0166\7K\2\2\u0166\u016f"+
		"\7D\2\2\u0167\u016c\5> \2\u0168\u0169\7H\2\2\u0169\u016b\5> \2\u016a\u0168"+
		"\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0167\3\2\2\2\u016f\u0170\3\2"+
		"\2\2\u0170\u0171\3\2\2\2\u0171\u0172\7E\2\2\u0172\u0173\7I\2\2\u0173-"+
		"\3\2\2\2\u0174\u0175\7\'\2\2\u0175\u0176\7D\2\2\u0176\u0177\7K\2\2\u0177"+
		"\u0178\b\30\1\2\u0178\u0179\7E\2\2\u0179\u017a\7I\2\2\u017a/\3\2\2\2\u017b"+
		"\u017c\7(\2\2\u017c\u0182\7D\2\2\u017d\u017e\5> \2\u017e\u017f\b\31\1"+
		"\2\u017f\u0183\3\2\2\2\u0180\u0181\7J\2\2\u0181\u0183\b\31\1\2\u0182\u017d"+
		"\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u018e\3\2\2\2\u0184\u018a\7H\2\2\u0185"+
		"\u0186\5> \2\u0186\u0187\b\31\1\2\u0187\u018b\3\2\2\2\u0188\u0189\7J\2"+
		"\2\u0189\u018b\b\31\1\2\u018a\u0185\3\2\2\2\u018a\u0188\3\2\2\2\u018b"+
		"\u018d\3\2\2\2\u018c\u0184\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2"+
		"\2\2\u018e\u018f\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u018e\3\2\2\2\u0191"+
		"\u0192\7E\2\2\u0192\u0193\7I\2\2\u0193\61\3\2\2\2\u0194\u0195\7)\2\2\u0195"+
		"\u01aa\7D\2\2\u0196\u0197\5> \2\u0197\u0198\b\32\1\2\u0198\u019c\3\2\2"+
		"\2\u0199\u019a\7J\2\2\u019a\u019c\b\32\1\2\u019b\u0196\3\2\2\2\u019b\u0199"+
		"\3\2\2\2\u019c\u01a7\3\2\2\2\u019d\u01a3\7H\2\2\u019e\u019f\5> \2\u019f"+
		"\u01a0\b\32\1\2\u01a0\u01a4\3\2\2\2\u01a1\u01a2\7J\2\2\u01a2\u01a4\b\32"+
		"\1\2\u01a3\u019e\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5"+
		"\u019d\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2"+
		"\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u019b\3\2\2\2\u01aa"+
		"\u01ab\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\7E\2\2\u01ad\u01ae\7I\2"+
		"\2\u01ae\63\3\2\2\2\u01af\u01b0\5$\23\2\u01b0\u01b1\b\33\1\2\u01b1\u01c6"+
		"\3\2\2\2\u01b2\u01b3\5&\24\2\u01b3\u01b4\b\33\1\2\u01b4\u01c6\3\2\2\2"+
		"\u01b5\u01b6\5(\25\2\u01b6\u01b7\b\33\1\2\u01b7\u01c6\3\2\2\2\u01b8\u01b9"+
		"\5*\26\2\u01b9\u01ba\b\33\1\2\u01ba\u01c6\3\2\2\2\u01bb\u01c6\5,\27\2"+
		"\u01bc\u01bd\5.\30\2\u01bd\u01be\b\33\1\2\u01be\u01c6\3\2\2\2\u01bf\u01c0"+
		"\5\60\31\2\u01c0\u01c1\b\33\1\2\u01c1\u01c6\3\2\2\2\u01c2\u01c3\5\62\32"+
		"\2\u01c3\u01c4\b\33\1\2\u01c4\u01c6\3\2\2\2\u01c5\u01af\3\2\2\2\u01c5"+
		"\u01b2\3\2\2\2\u01c5\u01b5\3\2\2\2\u01c5\u01b8\3\2\2\2\u01c5\u01bb\3\2"+
		"\2\2\u01c5\u01bc\3\2\2\2\u01c5\u01bf\3\2\2\2\u01c5\u01c2\3\2\2\2\u01c6"+
		"\65\3\2\2\2\u01c7\u01c8\7-\2\2\u01c8\u01d0\b\34\1\2\u01c9\u01ca\7+\2\2"+
		"\u01ca\u01d0\b\34\1\2\u01cb\u01cc\7*\2\2\u01cc\u01d0\b\34\1\2\u01cd\u01ce"+
		"\7,\2\2\u01ce\u01d0\b\34\1\2\u01cf\u01c7\3\2\2\2\u01cf\u01c9\3\2\2\2\u01cf"+
		"\u01cb\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\67\3\2\2\2\u01d1\u01d2\7K\2\2"+
		"\u01d2\u01d3\7B\2\2\u01d3\u01d4\7K\2\2\u01d4\u01d5\b\35\1\2\u01d59\3\2"+
		"\2\2\u01d6\u01d7\7K\2\2\u01d7\u01d8\7@\2\2\u01d8\u01d9\5> \2\u01d9\u01da"+
		"\b\36\1\2\u01da\u01db\7A\2\2\u01db;\3\2\2\2\u01dc\u01dd\7K\2\2\u01dd\u01e6"+
		"\7D\2\2\u01de\u01e3\5> \2\u01df\u01e0\7H\2\2\u01e0\u01e2\5> \2\u01e1\u01df"+
		"\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01de\3\2\2\2\u01e6\u01e7\3\2"+
		"\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\7E\2\2\u01e9=\3\2\2\2\u01ea\u01f2"+
		"\5@!\2\u01eb\u01ec\7>\2\2\u01ec\u01ed\5@!\2\u01ed\u01ee\b \1\2\u01ee\u01ef"+
		"\7?\2\2\u01ef\u01f0\5@!\2\u01f0\u01f1\b \1\2\u01f1\u01f3\3\2\2\2\u01f2"+
		"\u01eb\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2"+
		"\2\2\u01f5\u01fa\3\2\2\2\u01f6\u01f7\5@!\2\u01f7\u01f8\b \1\2\u01f8\u01fa"+
		"\3\2\2\2\u01f9\u01ea\3\2\2\2\u01f9\u01f6\3\2\2\2\u01fa?\3\2\2\2\u01fb"+
		"\u01fc\5B\"\2\u01fc\u0201\b!\1\2\u01fd\u01fe\t\3\2\2\u01fe\u01ff\5B\""+
		"\2\u01ff\u0200\b!\1\2\u0200\u0202\3\2\2\2\u0201\u01fd\3\2\2\2\u0202\u0203"+
		"\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0209\3\2\2\2\u0205"+
		"\u0206\5B\"\2\u0206\u0207\b!\1\2\u0207\u0209\3\2\2\2\u0208\u01fb\3\2\2"+
		"\2\u0208\u0205\3\2\2\2\u0209A\3\2\2\2\u020a\u020b\5D#\2\u020b\u0210\b"+
		"\"\1\2\u020c\u020d\t\4\2\2\u020d\u020e\5D#\2\u020e\u020f\b\"\1\2\u020f"+
		"\u0211\3\2\2\2\u0210\u020c\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0210\3\2"+
		"\2\2\u0212\u0213\3\2\2\2\u0213\u0218\3\2\2\2\u0214\u0215\5D#\2\u0215\u0216"+
		"\b\"\1\2\u0216\u0218\3\2\2\2\u0217\u020a\3\2\2\2\u0217\u0214\3\2\2\2\u0218"+
		"C\3\2\2\2\u0219\u021e\5F$\2\u021a\u021b\t\5\2\2\u021b\u021c\5F$\2\u021c"+
		"\u021d\b#\1\2\u021d\u021f\3\2\2\2\u021e\u021a\3\2\2\2\u021f\u0220\3\2"+
		"\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0226\3\2\2\2\u0222"+
		"\u0223\5F$\2\u0223\u0224\b#\1\2\u0224\u0226\3\2\2\2\u0225\u0219\3\2\2"+
		"\2\u0225\u0222\3\2\2\2\u0226E\3\2\2\2\u0227\u022c\5H%\2\u0228\u0229\t"+
		"\6\2\2\u0229\u022a\5H%\2\u022a\u022b\b$\1\2\u022b\u022d\3\2\2\2\u022c"+
		"\u0228\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2"+
		"\2\2\u022f\u0234\3\2\2\2\u0230\u0231\5H%\2\u0231\u0232\b$\1\2\u0232\u0234"+
		"\3\2\2\2\u0233\u0227\3\2\2\2\u0233\u0230\3\2\2\2\u0234G\3\2\2\2\u0235"+
		"\u0236\t\7\2\2\u0236\u0237\5J&\2\u0237\u0238\b%\1\2\u0238\u023d\3\2\2"+
		"\2\u0239\u023a\5J&\2\u023a\u023b\b%\1\2\u023b\u023d\3\2\2\2\u023c\u0235"+
		"\3\2\2\2\u023c\u0239\3\2\2\2\u023dI\3\2\2\2\u023e\u023f\5\66\34\2\u023f"+
		"\u0240\b&\1\2\u0240\u024e\3\2\2\2\u0241\u0242\7K\2\2\u0242\u024e\b&\1"+
		"\2\u0243\u0244\58\35\2\u0244\u0245\b&\1\2\u0245\u024e\3\2\2\2\u0246\u0247"+
		"\5:\36\2\u0247\u0248\b&\1\2\u0248\u024e\3\2\2\2\u0249\u024e\5<\37\2\u024a"+
		"\u024b\5L\'\2\u024b\u024c\b&\1\2\u024c\u024e\3\2\2\2\u024d\u023e\3\2\2"+
		"\2\u024d\u0241\3\2\2\2\u024d\u0243\3\2\2\2\u024d\u0246\3\2\2\2\u024d\u0249"+
		"\3\2\2\2\u024d\u024a\3\2\2\2\u024eK\3\2\2\2\u024f\u0250\7D\2\2\u0250\u0251"+
		"\5> \2\u0251\u0252\b\'\1\2\u0252\u0253\7E\2\2\u0253M\3\2\2\2=ORUY^eo\177"+
		"\u008c\u0095\u009f\u00ae\u00bb\u00c2\u00c4\u00cb\u00d4\u00dc\u00e2\u00e9"+
		"\u00ee\u00f0\u00f7\u00fb\u0100\u0109\u010f\u0114\u0121\u0132\u013b\u013e"+
		"\u0150\u015f\u016c\u016f\u0182\u018a\u018e\u019b\u01a3\u01a7\u01aa\u01c5"+
		"\u01cf\u01e3\u01e6\u01f4\u01f9\u0203\u0208\u0212\u0217\u0220\u0225\u022e"+
		"\u0233\u023c\u024d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}