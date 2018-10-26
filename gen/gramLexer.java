// Generated from /home/sipwarriper/IdeaProjects/ANTLR4-Compiladors/gram.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramLexer extends Lexer {
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
		TK_PC_FPER=30, TK_PC_MENTRE=31, TK_PC_FMENTRE=32, TK_CONST_CHAR=33, TK_CONST_REAL=34, 
		TK_CONST_BOOL=35, TK_CONST_INT=36, TK_OP_SUMA=37, TK_OP_RESTA=38, TK_OP_MULT=39, 
		TK_OP_REALDIV=40, TK_OP_INTDIV=41, TK_OP_MOD=42, TK_OP_EQ=43, TK_OP_DIFF=44, 
		TK_OP_GT=45, TK_OP_LT=46, TK_OP_LOET=47, TK_OP_GOET=48, TK_OP_NEG=49, 
		TK_OP_AND=50, TK_OP_O=51, TK_OP_IF_THEN_ELSE_CONDITION=52, TK_OP_IF_THEN_ELSE_ALTENRATIVE=53, 
		TK_OP_VECTOR_OPEN=54, TK_OP_VECTOR_CLOSE=55, TK_OP_TUPLE=56, TK_OP_ASSIGN=57, 
		TK_COMMENTS=58;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"TK_WS", "TK_PC_PROGRAMA", "TK_PC_FPROGRAMA", "TK_PC_ACCIO", "TK_PC_FACCIO", 
		"TK_PC_FUNCIO", "TK_PC_FFUNCIO", "TK_PC_RETURN", "TK_PC_PARAM_IN", "TK_PC_PARAM_IO", 
		"TK_PC_CONSTANTS", "TK_PC_FCONSTANTS", "TK_PC_VARIABLES", "TK_PC_FVARIABLES", 
		"TK_PC_TIPUS", "TK_PC_FTIPUS", "TK_PC_TUPLA", "TK_PC_FTUPLA", "TK_PC_VECTOR", 
		"TK_PC_MIDA", "TK_PC_INICI", "TK_PC_SI", "TK_PC_LLAVORS", "TK_PC_ALTRAMENT", 
		"TK_PC_FSI", "TK_PC_PER", "TK_PC_DE", "TK_PC_FINS", "TK_PC_FER", "TK_PC_FPER", 
		"TK_PC_MENTRE", "TK_PC_FMENTRE", "DIGIT", "LETTER", "CAPLETTER", "TK_CONST_CHAR", 
		"TK_CONST_REAL", "TK_CONST_BOOL", "TK_CONST_INT", "TK_OP_SUMA", "TK_OP_RESTA", 
		"TK_OP_MULT", "TK_OP_REALDIV", "TK_OP_INTDIV", "TK_OP_MOD", "TK_OP_EQ", 
		"TK_OP_DIFF", "TK_OP_GT", "TK_OP_LT", "TK_OP_LOET", "TK_OP_GOET", "TK_OP_NEG", 
		"TK_OP_AND", "TK_OP_O", "TK_OP_IF_THEN_ELSE_CONDITION", "TK_OP_IF_THEN_ELSE_ALTENRATIVE", 
		"TK_OP_VECTOR_OPEN", "TK_OP_VECTOR_CLOSE", "TK_OP_TUPLE", "TK_OP_ASSIGN", 
		"TK_COMMENTS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'programa'", "'fprograma'", "'accio'", "'faccio'", "'funcio'", 
		"'ffuncio'", "'retorna'", "'ent'", "'entsor'", "'constants'", "'fconstants'", 
		"'variables'", "'fvariables'", "'tipus'", "'ftipus'", "'tupla'", "'ftupla'", 
		"'vector'", "'mida'", "'inici'", "'si'", "'llavors'", "'altrament'", "'fsi'", 
		"'per'", "'de'", "'fins'", "'fer'", "'fper'", "'mentre'", "'fmentre'", 
		null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'\\'", "'%'", "'=='", 
		"'!='", "'>'", "'<'", "'<='", "'>='", "'no'", "'&'", "'|'", "'?'", "':'", 
		"'['", "']'", "'.'", "':='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TK_WS", "TK_PC_PROGRAMA", "TK_PC_FPROGRAMA", "TK_PC_ACCIO", "TK_PC_FACCIO", 
		"TK_PC_FUNCIO", "TK_PC_FFUNCIO", "TK_PC_RETURN", "TK_PC_PARAM_IN", "TK_PC_PARAM_IO", 
		"TK_PC_CONSTANTS", "TK_PC_FCONSTANTS", "TK_PC_VARIABLES", "TK_PC_FVARIABLES", 
		"TK_PC_TIPUS", "TK_PC_FTIPUS", "TK_PC_TUPLA", "TK_PC_FTUPLA", "TK_PC_VECTOR", 
		"TK_PC_MIDA", "TK_PC_INICI", "TK_PC_SI", "TK_PC_LLAVORS", "TK_PC_ALTRAMENT", 
		"TK_PC_FSI", "TK_PC_PER", "TK_PC_DE", "TK_PC_FINS", "TK_PC_FER", "TK_PC_FPER", 
		"TK_PC_MENTRE", "TK_PC_FMENTRE", "TK_CONST_CHAR", "TK_CONST_REAL", "TK_CONST_BOOL", 
		"TK_CONST_INT", "TK_OP_SUMA", "TK_OP_RESTA", "TK_OP_MULT", "TK_OP_REALDIV", 
		"TK_OP_INTDIV", "TK_OP_MOD", "TK_OP_EQ", "TK_OP_DIFF", "TK_OP_GT", "TK_OP_LT", 
		"TK_OP_LOET", "TK_OP_GOET", "TK_OP_NEG", "TK_OP_AND", "TK_OP_O", "TK_OP_IF_THEN_ELSE_CONDITION", 
		"TK_OP_IF_THEN_ELSE_ALTENRATIVE", "TK_OP_VECTOR_OPEN", "TK_OP_VECTOR_CLOSE", 
		"TK_OP_TUPLE", "TK_OP_ASSIGN", "TK_COMMENTS"
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


	public gramLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gram.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u01d1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\3%\5%\u0162\n%\3&\3&\3&\7&\u0167\n&\f&"+
		"\16&\u016a\13&\3&\5&\u016d\n&\3&\3&\6&\u0171\n&\r&\16&\u0172\3&\3&\5&"+
		"\u0177\n&\3&\3&\3&\7&\u017c\n&\f&\16&\u017f\13&\5&\u0181\n&\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u018c\n\'\3(\3(\3(\7(\u0191\n(\f(\16(\u0194"+
		"\13(\3(\5(\u0197\n(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60"+
		"\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3=\3>\3"+
		">\7>\u01cb\n>\f>\16>\u01ce\13>\3>\3>\3\u01cc\2?\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C\2E\2G\2I#K$M"+
		"%O&Q\'S(U)W*Y+[,]-_.a/c\60e\61g\62i\63k\64m\65o\66q\67s8u9w:y;{<\3\2\3"+
		"\5\2\13\f\17\17\"\"\2\u01db\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o"+
		"\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2"+
		"\2\2\3}\3\2\2\2\5\u0081\3\2\2\2\7\u008a\3\2\2\2\t\u0094\3\2\2\2\13\u009a"+
		"\3\2\2\2\r\u00a1\3\2\2\2\17\u00a8\3\2\2\2\21\u00b0\3\2\2\2\23\u00b8\3"+
		"\2\2\2\25\u00bc\3\2\2\2\27\u00c3\3\2\2\2\31\u00cd\3\2\2\2\33\u00d8\3\2"+
		"\2\2\35\u00e2\3\2\2\2\37\u00ed\3\2\2\2!\u00f3\3\2\2\2#\u00fa\3\2\2\2%"+
		"\u0100\3\2\2\2\'\u0107\3\2\2\2)\u010e\3\2\2\2+\u0113\3\2\2\2-\u0119\3"+
		"\2\2\2/\u011c\3\2\2\2\61\u0124\3\2\2\2\63\u012e\3\2\2\2\65\u0132\3\2\2"+
		"\2\67\u0136\3\2\2\29\u0139\3\2\2\2;\u013e\3\2\2\2=\u0142\3\2\2\2?\u0147"+
		"\3\2\2\2A\u014e\3\2\2\2C\u0156\3\2\2\2E\u0158\3\2\2\2G\u015a\3\2\2\2I"+
		"\u0161\3\2\2\2K\u016c\3\2\2\2M\u018b\3\2\2\2O\u0196\3\2\2\2Q\u0198\3\2"+
		"\2\2S\u019a\3\2\2\2U\u019c\3\2\2\2W\u019e\3\2\2\2Y\u01a0\3\2\2\2[\u01a2"+
		"\3\2\2\2]\u01a4\3\2\2\2_\u01a7\3\2\2\2a\u01aa\3\2\2\2c\u01ac\3\2\2\2e"+
		"\u01ae\3\2\2\2g\u01b1\3\2\2\2i\u01b4\3\2\2\2k\u01b7\3\2\2\2m\u01b9\3\2"+
		"\2\2o\u01bb\3\2\2\2q\u01bd\3\2\2\2s\u01bf\3\2\2\2u\u01c1\3\2\2\2w\u01c3"+
		"\3\2\2\2y\u01c5\3\2\2\2{\u01c8\3\2\2\2}~\t\2\2\2~\177\3\2\2\2\177\u0080"+
		"\b\2\2\2\u0080\4\3\2\2\2\u0081\u0082\7r\2\2\u0082\u0083\7t\2\2\u0083\u0084"+
		"\7q\2\2\u0084\u0085\7i\2\2\u0085\u0086\7t\2\2\u0086\u0087\7c\2\2\u0087"+
		"\u0088\7o\2\2\u0088\u0089\7c\2\2\u0089\6\3\2\2\2\u008a\u008b\7h\2\2\u008b"+
		"\u008c\7r\2\2\u008c\u008d\7t\2\2\u008d\u008e\7q\2\2\u008e\u008f\7i\2\2"+
		"\u008f\u0090\7t\2\2\u0090\u0091\7c\2\2\u0091\u0092\7o\2\2\u0092\u0093"+
		"\7c\2\2\u0093\b\3\2\2\2\u0094\u0095\7c\2\2\u0095\u0096\7e\2\2\u0096\u0097"+
		"\7e\2\2\u0097\u0098\7k\2\2\u0098\u0099\7q\2\2\u0099\n\3\2\2\2\u009a\u009b"+
		"\7h\2\2\u009b\u009c\7c\2\2\u009c\u009d\7e\2\2\u009d\u009e\7e\2\2\u009e"+
		"\u009f\7k\2\2\u009f\u00a0\7q\2\2\u00a0\f\3\2\2\2\u00a1\u00a2\7h\2\2\u00a2"+
		"\u00a3\7w\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7e\2\2\u00a5\u00a6\7k\2\2"+
		"\u00a6\u00a7\7q\2\2\u00a7\16\3\2\2\2\u00a8\u00a9\7h\2\2\u00a9\u00aa\7"+
		"h\2\2\u00aa\u00ab\7w\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7e\2\2\u00ad\u00ae"+
		"\7k\2\2\u00ae\u00af\7q\2\2\u00af\20\3\2\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2"+
		"\7g\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7t\2\2\u00b5"+
		"\u00b6\7p\2\2\u00b6\u00b7\7c\2\2\u00b7\22\3\2\2\2\u00b8\u00b9\7g\2\2\u00b9"+
		"\u00ba\7p\2\2\u00ba\u00bb\7v\2\2\u00bb\24\3\2\2\2\u00bc\u00bd\7g\2\2\u00bd"+
		"\u00be\7p\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7q\2\2"+
		"\u00c1\u00c2\7t\2\2\u00c2\26\3\2\2\2\u00c3\u00c4\7e\2\2\u00c4\u00c5\7"+
		"q\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9"+
		"\7c\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7u\2\2\u00cc"+
		"\30\3\2\2\2\u00cd\u00ce\7h\2\2\u00ce\u00cf\7e\2\2\u00cf\u00d0\7q\2\2\u00d0"+
		"\u00d1\7p\2\2\u00d1\u00d2\7u\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7c\2\2"+
		"\u00d4\u00d5\7p\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7u\2\2\u00d7\32\3\2"+
		"\2\2\u00d8\u00d9\7x\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7t\2\2\u00db\u00dc"+
		"\7k\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7d\2\2\u00de\u00df\7n\2\2\u00df"+
		"\u00e0\7g\2\2\u00e0\u00e1\7u\2\2\u00e1\34\3\2\2\2\u00e2\u00e3\7h\2\2\u00e3"+
		"\u00e4\7x\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7k\2\2"+
		"\u00e7\u00e8\7c\2\2\u00e8\u00e9\7d\2\2\u00e9\u00ea\7n\2\2\u00ea\u00eb"+
		"\7g\2\2\u00eb\u00ec\7u\2\2\u00ec\36\3\2\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef"+
		"\7k\2\2\u00ef\u00f0\7r\2\2\u00f0\u00f1\7w\2\2\u00f1\u00f2\7u\2\2\u00f2"+
		" \3\2\2\2\u00f3\u00f4\7h\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7k\2\2\u00f6"+
		"\u00f7\7r\2\2\u00f7\u00f8\7w\2\2\u00f8\u00f9\7u\2\2\u00f9\"\3\2\2\2\u00fa"+
		"\u00fb\7v\2\2\u00fb\u00fc\7w\2\2\u00fc\u00fd\7r\2\2\u00fd\u00fe\7n\2\2"+
		"\u00fe\u00ff\7c\2\2\u00ff$\3\2\2\2\u0100\u0101\7h\2\2\u0101\u0102\7v\2"+
		"\2\u0102\u0103\7w\2\2\u0103\u0104\7r\2\2\u0104\u0105\7n\2\2\u0105\u0106"+
		"\7c\2\2\u0106&\3\2\2\2\u0107\u0108\7x\2\2\u0108\u0109\7g\2\2\u0109\u010a"+
		"\7e\2\2\u010a\u010b\7v\2\2\u010b\u010c\7q\2\2\u010c\u010d\7t\2\2\u010d"+
		"(\3\2\2\2\u010e\u010f\7o\2\2\u010f\u0110\7k\2\2\u0110\u0111\7f\2\2\u0111"+
		"\u0112\7c\2\2\u0112*\3\2\2\2\u0113\u0114\7k\2\2\u0114\u0115\7p\2\2\u0115"+
		"\u0116\7k\2\2\u0116\u0117\7e\2\2\u0117\u0118\7k\2\2\u0118,\3\2\2\2\u0119"+
		"\u011a\7u\2\2\u011a\u011b\7k\2\2\u011b.\3\2\2\2\u011c\u011d\7n\2\2\u011d"+
		"\u011e\7n\2\2\u011e\u011f\7c\2\2\u011f\u0120\7x\2\2\u0120\u0121\7q\2\2"+
		"\u0121\u0122\7t\2\2\u0122\u0123\7u\2\2\u0123\60\3\2\2\2\u0124\u0125\7"+
		"c\2\2\u0125\u0126\7n\2\2\u0126\u0127\7v\2\2\u0127\u0128\7t\2\2\u0128\u0129"+
		"\7c\2\2\u0129\u012a\7o\2\2\u012a\u012b\7g\2\2\u012b\u012c\7p\2\2\u012c"+
		"\u012d\7v\2\2\u012d\62\3\2\2\2\u012e\u012f\7h\2\2\u012f\u0130\7u\2\2\u0130"+
		"\u0131\7k\2\2\u0131\64\3\2\2\2\u0132\u0133\7r\2\2\u0133\u0134\7g\2\2\u0134"+
		"\u0135\7t\2\2\u0135\66\3\2\2\2\u0136\u0137\7f\2\2\u0137\u0138\7g\2\2\u0138"+
		"8\3\2\2\2\u0139\u013a\7h\2\2\u013a\u013b\7k\2\2\u013b\u013c\7p\2\2\u013c"+
		"\u013d\7u\2\2\u013d:\3\2\2\2\u013e\u013f\7h\2\2\u013f\u0140\7g\2\2\u0140"+
		"\u0141\7t\2\2\u0141<\3\2\2\2\u0142\u0143\7h\2\2\u0143\u0144\7r\2\2\u0144"+
		"\u0145\7g\2\2\u0145\u0146\7t\2\2\u0146>\3\2\2\2\u0147\u0148\7o\2\2\u0148"+
		"\u0149\7g\2\2\u0149\u014a\7p\2\2\u014a\u014b\7v\2\2\u014b\u014c\7t\2\2"+
		"\u014c\u014d\7g\2\2\u014d@\3\2\2\2\u014e\u014f\7h\2\2\u014f\u0150\7o\2"+
		"\2\u0150\u0151\7g\2\2\u0151\u0152\7p\2\2\u0152\u0153\7v\2\2\u0153\u0154"+
		"\7t\2\2\u0154\u0155\7g\2\2\u0155B\3\2\2\2\u0156\u0157\4\63;\2\u0157D\3"+
		"\2\2\2\u0158\u0159\4c|\2\u0159F\3\2\2\2\u015a\u015b\4C\\\2\u015bH\3\2"+
		"\2\2\u015c\u015d\7)\2\2\u015d\u0162\4\"\u0080\2\u015e\u015f\7^\2\2\u015f"+
		"\u0160\7)\2\2\u0160\u0162\7)\2\2\u0161\u015c\3\2\2\2\u0161\u015e\3\2\2"+
		"\2\u0162J\3\2\2\2\u0163\u0164\7\62\2\2\u0164\u016d\7\60\2\2\u0165\u0167"+
		"\5C\"\2\u0166\u0165\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016d\7\60"+
		"\2\2\u016c\u0163\3\2\2\2\u016c\u0168\3\2\2\2\u016d\u0170\3\2\2\2\u016e"+
		"\u0171\7\62\2\2\u016f\u0171\5C\"\2\u0170\u016e\3\2\2\2\u0170\u016f\3\2"+
		"\2\2\u0171\u0172\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0180\3\2\2\2\u0174\u0176\7G\2\2\u0175\u0177\7/\2\2\u0176\u0175\3\2\2"+
		"\2\u0176\u0177\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017d\5C\"\2\u0179\u017c"+
		"\7\62\2\2\u017a\u017c\5C\"\2\u017b\u0179\3\2\2\2\u017b\u017a\3\2\2\2\u017c"+
		"\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0181\3\2"+
		"\2\2\u017f\u017d\3\2\2\2\u0180\u0174\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"L\3\2\2\2\u0182\u0183\7h\2\2\u0183\u0184\7c\2\2\u0184\u0185\7n\2\2\u0185"+
		"\u0186\7u\2\2\u0186\u018c\7g\2\2\u0187\u0188\7v\2\2\u0188\u0189\7t\2\2"+
		"\u0189\u018a\7w\2\2\u018a\u018c\7g\2\2\u018b\u0182\3\2\2\2\u018b\u0187"+
		"\3\2\2\2\u018cN\3\2\2\2\u018d\u0192\5C\"\2\u018e\u0191\7\62\2\2\u018f"+
		"\u0191\5C\"\2\u0190\u018e\3\2\2\2\u0190\u018f\3\2\2\2\u0191\u0194\3\2"+
		"\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0197\3\2\2\2\u0194"+
		"\u0192\3\2\2\2\u0195\u0197\7\62\2\2\u0196\u018d\3\2\2\2\u0196\u0195\3"+
		"\2\2\2\u0197P\3\2\2\2\u0198\u0199\7-\2\2\u0199R\3\2\2\2\u019a\u019b\7"+
		"/\2\2\u019bT\3\2\2\2\u019c\u019d\7,\2\2\u019dV\3\2\2\2\u019e\u019f\7\61"+
		"\2\2\u019fX\3\2\2\2\u01a0\u01a1\7^\2\2\u01a1Z\3\2\2\2\u01a2\u01a3\7\'"+
		"\2\2\u01a3\\\3\2\2\2\u01a4\u01a5\7?\2\2\u01a5\u01a6\7?\2\2\u01a6^\3\2"+
		"\2\2\u01a7\u01a8\7#\2\2\u01a8\u01a9\7?\2\2\u01a9`\3\2\2\2\u01aa\u01ab"+
		"\7@\2\2\u01abb\3\2\2\2\u01ac\u01ad\7>\2\2\u01add\3\2\2\2\u01ae\u01af\7"+
		">\2\2\u01af\u01b0\7?\2\2\u01b0f\3\2\2\2\u01b1\u01b2\7@\2\2\u01b2\u01b3"+
		"\7?\2\2\u01b3h\3\2\2\2\u01b4\u01b5\7p\2\2\u01b5\u01b6\7q\2\2\u01b6j\3"+
		"\2\2\2\u01b7\u01b8\7(\2\2\u01b8l\3\2\2\2\u01b9\u01ba\7~\2\2\u01ban\3\2"+
		"\2\2\u01bb\u01bc\7A\2\2\u01bcp\3\2\2\2\u01bd\u01be\7<\2\2\u01ber\3\2\2"+
		"\2\u01bf\u01c0\7]\2\2\u01c0t\3\2\2\2\u01c1\u01c2\7_\2\2\u01c2v\3\2\2\2"+
		"\u01c3\u01c4\7\60\2\2\u01c4x\3\2\2\2\u01c5\u01c6\7<\2\2\u01c6\u01c7\7"+
		"?\2\2\u01c7z\3\2\2\2\u01c8\u01cc\7^\2\2\u01c9\u01cb\13\2\2\2\u01ca\u01c9"+
		"\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd"+
		"\u01cf\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d0\7\f\2\2\u01d0|\3\2\2\2"+
		"\21\2\u0161\u0168\u016c\u0170\u0172\u0176\u017b\u017d\u0180\u018b\u0190"+
		"\u0192\u0196\u01cc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}