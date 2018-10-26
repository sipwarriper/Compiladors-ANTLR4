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
		TK_PC_MIDA=20, TK_PC_INICI=21, TK_PC_SI=22, TK_PC_ALTRAMENT=23, TK_PC_FSI=24, 
		TK_PC_PER=25, TK_PC_DE=26, TK_PC_FINS=27, TK_PC_FER=28, TK_PC_FPER=29, 
		TK_PC_MENTRE=30, TK_PC_FMENTRE=31, TK_CONST_CHAR=32, TK_CONST_REAL=33, 
		TK_CONST_BOOL=34, TK_CONST_INT=35, TK_OP_SUMA=36, TK_OP_RESTA=37, TK_OP_MULT=38, 
		TK_OP_REALDIV=39, TK_OP_INTDIV=40;
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
		"TK_PC_MIDA", "TK_PC_INICI", "TK_PC_SI", "TK_PC_ALTRAMENT", "TK_PC_FSI", 
		"TK_PC_PER", "TK_PC_DE", "TK_PC_FINS", "TK_PC_FER", "TK_PC_FPER", "TK_PC_MENTRE", 
		"TK_PC_FMENTRE", "DIGIT", "LETTER", "CAPLETTER", "TK_CONST_CHAR", "TK_CONST_REAL", 
		"TK_CONST_BOOL", "TK_CONST_INT", "TK_OP_SUMA", "TK_OP_RESTA", "TK_OP_MULT", 
		"TK_OP_REALDIV", "TK_OP_INTDIV"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'programa'", "'fprograma'", "'accio'", "'faccio'", "'funcio'", 
		"'ffuncio'", "'retorna'", "'ent'", "'entsor'", "'constants'", "'fconstants'", 
		"'variables'", "'fvariables'", "'tipus'", "'ftipus'", "'tupla'", "'ftupla'", 
		"'vector'", "'mida'", "'inici'", "'si'", "'altrament'", "'fsi'", "'per'", 
		"'de'", "'fins'", "'fer'", "'fper'", "'mentre'", "'fmentre'", null, null, 
		null, null, "'+'", "'-'", "'*'", "'/'", "'\\'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TK_WS", "TK_PC_PROGRAMA", "TK_PC_FPROGRAMA", "TK_PC_ACCIO", "TK_PC_FACCIO", 
		"TK_PC_FUNCIO", "TK_PC_FFUNCIO", "TK_PC_RETURN", "TK_PC_PARAM_IN", "TK_PC_PARAM_IO", 
		"TK_PC_CONSTANTS", "TK_PC_FCONSTANTS", "TK_PC_VARIABLES", "TK_PC_FVARIABLES", 
		"TK_PC_TIPUS", "TK_PC_FTIPUS", "TK_PC_TUPLA", "TK_PC_FTUPLA", "TK_PC_VECTOR", 
		"TK_PC_MIDA", "TK_PC_INICI", "TK_PC_SI", "TK_PC_ALTRAMENT", "TK_PC_FSI", 
		"TK_PC_PER", "TK_PC_DE", "TK_PC_FINS", "TK_PC_FER", "TK_PC_FPER", "TK_PC_MENTRE", 
		"TK_PC_FMENTRE", "TK_CONST_CHAR", "TK_CONST_REAL", "TK_CONST_BOOL", "TK_CONST_INT", 
		"TK_OP_SUMA", "TK_OP_RESTA", "TK_OP_MULT", "TK_OP_REALDIV", "TK_OP_INTDIV"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u0176\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3"+
		"$\3$\5$\u0136\n$\3%\3%\3%\7%\u013b\n%\f%\16%\u013e\13%\3%\5%\u0141\n%"+
		"\3%\3%\6%\u0145\n%\r%\16%\u0146\3%\3%\5%\u014b\n%\3%\3%\3%\7%\u0150\n"+
		"%\f%\16%\u0153\13%\5%\u0155\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0160\n&"+
		"\3\'\3\'\3\'\7\'\u0165\n\'\f\'\16\'\u0168\13\'\3\'\5\'\u016b\n\'\3(\3"+
		"(\3)\3)\3*\3*\3+\3+\3,\3,\2\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\2C\2E\2G\"I#K$M%O&Q\'S(U)W*\3\2\3\5"+
		"\2\13\f\17\17\"\"\2\u017f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2G\3\2\2\2\2I\3\2"+
		"\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2"+
		"\2W\3\2\2\2\3Y\3\2\2\2\5]\3\2\2\2\7f\3\2\2\2\tp\3\2\2\2\13v\3\2\2\2\r"+
		"}\3\2\2\2\17\u0084\3\2\2\2\21\u008c\3\2\2\2\23\u0094\3\2\2\2\25\u0098"+
		"\3\2\2\2\27\u009f\3\2\2\2\31\u00a9\3\2\2\2\33\u00b4\3\2\2\2\35\u00be\3"+
		"\2\2\2\37\u00c9\3\2\2\2!\u00cf\3\2\2\2#\u00d6\3\2\2\2%\u00dc\3\2\2\2\'"+
		"\u00e3\3\2\2\2)\u00ea\3\2\2\2+\u00ef\3\2\2\2-\u00f5\3\2\2\2/\u00f8\3\2"+
		"\2\2\61\u0102\3\2\2\2\63\u0106\3\2\2\2\65\u010a\3\2\2\2\67\u010d\3\2\2"+
		"\29\u0112\3\2\2\2;\u0116\3\2\2\2=\u011b\3\2\2\2?\u0122\3\2\2\2A\u012a"+
		"\3\2\2\2C\u012c\3\2\2\2E\u012e\3\2\2\2G\u0135\3\2\2\2I\u0140\3\2\2\2K"+
		"\u015f\3\2\2\2M\u016a\3\2\2\2O\u016c\3\2\2\2Q\u016e\3\2\2\2S\u0170\3\2"+
		"\2\2U\u0172\3\2\2\2W\u0174\3\2\2\2YZ\t\2\2\2Z[\3\2\2\2[\\\b\2\2\2\\\4"+
		"\3\2\2\2]^\7r\2\2^_\7t\2\2_`\7q\2\2`a\7i\2\2ab\7t\2\2bc\7c\2\2cd\7o\2"+
		"\2de\7c\2\2e\6\3\2\2\2fg\7h\2\2gh\7r\2\2hi\7t\2\2ij\7q\2\2jk\7i\2\2kl"+
		"\7t\2\2lm\7c\2\2mn\7o\2\2no\7c\2\2o\b\3\2\2\2pq\7c\2\2qr\7e\2\2rs\7e\2"+
		"\2st\7k\2\2tu\7q\2\2u\n\3\2\2\2vw\7h\2\2wx\7c\2\2xy\7e\2\2yz\7e\2\2z{"+
		"\7k\2\2{|\7q\2\2|\f\3\2\2\2}~\7h\2\2~\177\7w\2\2\177\u0080\7p\2\2\u0080"+
		"\u0081\7e\2\2\u0081\u0082\7k\2\2\u0082\u0083\7q\2\2\u0083\16\3\2\2\2\u0084"+
		"\u0085\7h\2\2\u0085\u0086\7h\2\2\u0086\u0087\7w\2\2\u0087\u0088\7p\2\2"+
		"\u0088\u0089\7e\2\2\u0089\u008a\7k\2\2\u008a\u008b\7q\2\2\u008b\20\3\2"+
		"\2\2\u008c\u008d\7t\2\2\u008d\u008e\7g\2\2\u008e\u008f\7v\2\2\u008f\u0090"+
		"\7q\2\2\u0090\u0091\7t\2\2\u0091\u0092\7p\2\2\u0092\u0093\7c\2\2\u0093"+
		"\22\3\2\2\2\u0094\u0095\7g\2\2\u0095\u0096\7p\2\2\u0096\u0097\7v\2\2\u0097"+
		"\24\3\2\2\2\u0098\u0099\7g\2\2\u0099\u009a\7p\2\2\u009a\u009b\7v\2\2\u009b"+
		"\u009c\7u\2\2\u009c\u009d\7q\2\2\u009d\u009e\7t\2\2\u009e\26\3\2\2\2\u009f"+
		"\u00a0\7e\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7u\2\2"+
		"\u00a3\u00a4\7v\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a7"+
		"\7v\2\2\u00a7\u00a8\7u\2\2\u00a8\30\3\2\2\2\u00a9\u00aa\7h\2\2\u00aa\u00ab"+
		"\7e\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae\7u\2\2\u00ae"+
		"\u00af\7v\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b2\7v\2\2"+
		"\u00b2\u00b3\7u\2\2\u00b3\32\3\2\2\2\u00b4\u00b5\7x\2\2\u00b5\u00b6\7"+
		"c\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba"+
		"\7d\2\2\u00ba\u00bb\7n\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7u\2\2\u00bd"+
		"\34\3\2\2\2\u00be\u00bf\7h\2\2\u00bf\u00c0\7x\2\2\u00c0\u00c1\7c\2\2\u00c1"+
		"\u00c2\7t\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7d\2\2"+
		"\u00c5\u00c6\7n\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7u\2\2\u00c8\36\3\2"+
		"\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7r\2\2\u00cc\u00cd"+
		"\7w\2\2\u00cd\u00ce\7u\2\2\u00ce \3\2\2\2\u00cf\u00d0\7h\2\2\u00d0\u00d1"+
		"\7v\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7r\2\2\u00d3\u00d4\7w\2\2\u00d4"+
		"\u00d5\7u\2\2\u00d5\"\3\2\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7w\2\2\u00d8"+
		"\u00d9\7r\2\2\u00d9\u00da\7n\2\2\u00da\u00db\7c\2\2\u00db$\3\2\2\2\u00dc"+
		"\u00dd\7h\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7w\2\2\u00df\u00e0\7r\2\2"+
		"\u00e0\u00e1\7n\2\2\u00e1\u00e2\7c\2\2\u00e2&\3\2\2\2\u00e3\u00e4\7x\2"+
		"\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7e\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8"+
		"\7q\2\2\u00e8\u00e9\7t\2\2\u00e9(\3\2\2\2\u00ea\u00eb\7o\2\2\u00eb\u00ec"+
		"\7k\2\2\u00ec\u00ed\7f\2\2\u00ed\u00ee\7c\2\2\u00ee*\3\2\2\2\u00ef\u00f0"+
		"\7k\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7e\2\2\u00f3"+
		"\u00f4\7k\2\2\u00f4,\3\2\2\2\u00f5\u00f6\7u\2\2\u00f6\u00f7\7k\2\2\u00f7"+
		".\3\2\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7n\2\2\u00fa\u00fb\7v\2\2\u00fb"+
		"\u00fc\7t\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe\7o\2\2\u00fe\u00ff\7g\2\2"+
		"\u00ff\u0100\7p\2\2\u0100\u0101\7v\2\2\u0101\60\3\2\2\2\u0102\u0103\7"+
		"h\2\2\u0103\u0104\7u\2\2\u0104\u0105\7k\2\2\u0105\62\3\2\2\2\u0106\u0107"+
		"\7r\2\2\u0107\u0108\7g\2\2\u0108\u0109\7t\2\2\u0109\64\3\2\2\2\u010a\u010b"+
		"\7f\2\2\u010b\u010c\7g\2\2\u010c\66\3\2\2\2\u010d\u010e\7h\2\2\u010e\u010f"+
		"\7k\2\2\u010f\u0110\7p\2\2\u0110\u0111\7u\2\2\u01118\3\2\2\2\u0112\u0113"+
		"\7h\2\2\u0113\u0114\7g\2\2\u0114\u0115\7t\2\2\u0115:\3\2\2\2\u0116\u0117"+
		"\7h\2\2\u0117\u0118\7r\2\2\u0118\u0119\7g\2\2\u0119\u011a\7t\2\2\u011a"+
		"<\3\2\2\2\u011b\u011c\7o\2\2\u011c\u011d\7g\2\2\u011d\u011e\7p\2\2\u011e"+
		"\u011f\7v\2\2\u011f\u0120\7t\2\2\u0120\u0121\7g\2\2\u0121>\3\2\2\2\u0122"+
		"\u0123\7h\2\2\u0123\u0124\7o\2\2\u0124\u0125\7g\2\2\u0125\u0126\7p\2\2"+
		"\u0126\u0127\7v\2\2\u0127\u0128\7t\2\2\u0128\u0129\7g\2\2\u0129@\3\2\2"+
		"\2\u012a\u012b\4\63;\2\u012bB\3\2\2\2\u012c\u012d\4c|\2\u012dD\3\2\2\2"+
		"\u012e\u012f\4C\\\2\u012fF\3\2\2\2\u0130\u0131\7)\2\2\u0131\u0136\4\""+
		"\u0080\2\u0132\u0133\7^\2\2\u0133\u0134\7)\2\2\u0134\u0136\7)\2\2\u0135"+
		"\u0130\3\2\2\2\u0135\u0132\3\2\2\2\u0136H\3\2\2\2\u0137\u0138\7\62\2\2"+
		"\u0138\u0141\7\60\2\2\u0139\u013b\5A!\2\u013a\u0139\3\2\2\2\u013b\u013e"+
		"\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e"+
		"\u013c\3\2\2\2\u013f\u0141\7\60\2\2\u0140\u0137\3\2\2\2\u0140\u013c\3"+
		"\2\2\2\u0141\u0144\3\2\2\2\u0142\u0145\7\62\2\2\u0143\u0145\5A!\2\u0144"+
		"\u0142\3\2\2\2\u0144\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0144\3\2"+
		"\2\2\u0146\u0147\3\2\2\2\u0147\u0154\3\2\2\2\u0148\u014a\7G\2\2\u0149"+
		"\u014b\7/\2\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2"+
		"\2\2\u014c\u0151\5A!\2\u014d\u0150\7\62\2\2\u014e\u0150\5A!\2\u014f\u014d"+
		"\3\2\2\2\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0148\3\2"+
		"\2\2\u0154\u0155\3\2\2\2\u0155J\3\2\2\2\u0156\u0157\7h\2\2\u0157\u0158"+
		"\7c\2\2\u0158\u0159\7n\2\2\u0159\u015a\7u\2\2\u015a\u0160\7g\2\2\u015b"+
		"\u015c\7v\2\2\u015c\u015d\7t\2\2\u015d\u015e\7w\2\2\u015e\u0160\7g\2\2"+
		"\u015f\u0156\3\2\2\2\u015f\u015b\3\2\2\2\u0160L\3\2\2\2\u0161\u0166\5"+
		"A!\2\u0162\u0165\7\62\2\2\u0163\u0165\5A!\2\u0164\u0162\3\2\2\2\u0164"+
		"\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2"+
		"\2\2\u0167\u016b\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016b\7\62\2\2\u016a"+
		"\u0161\3\2\2\2\u016a\u0169\3\2\2\2\u016bN\3\2\2\2\u016c\u016d\7-\2\2\u016d"+
		"P\3\2\2\2\u016e\u016f\7/\2\2\u016fR\3\2\2\2\u0170\u0171\7,\2\2\u0171T"+
		"\3\2\2\2\u0172\u0173\7\61\2\2\u0173V\3\2\2\2\u0174\u0175\7^\2\2\u0175"+
		"X\3\2\2\2\20\2\u0135\u013c\u0140\u0144\u0146\u014a\u014f\u0151\u0154\u015f"+
		"\u0164\u0166\u016a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}