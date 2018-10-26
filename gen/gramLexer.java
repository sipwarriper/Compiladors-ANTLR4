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
		TK_PC_FUNCIO=6, TK_PC_FFUNCIO=7, TK_PC_CONSTANTS=8, TK_PC_FCONSTANTS=9, 
		TK_PC_VARIABLES=10, TK_PC_FVARIABLES=11, TK_PC_TIPUS=12, TK_PC_FTIPUS=13, 
		TK_PC_SI=14, TK_PC_ALTRAMENT=15, TK_PC_FSI=16, TK_PC_PER=17, TK_PC_DE=18, 
		TK_PC_FINS=19, TK_PC_FER=20, TK_PC_FPER=21, TK_PC_MENTRE=22, TK_PC_FMENTRE=23, 
		TK_CONST_CHAR=24, TK_CONST_REAL=25, TK_CONST_BOOL=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"TK_WS", "TK_PC_PROGRAMA", "TK_PC_FPROGRAMA", "TK_PC_ACCIO", "TK_PC_FACCIO", 
		"TK_PC_FUNCIO", "TK_PC_FFUNCIO", "TK_PC_CONSTANTS", "TK_PC_FCONSTANTS", 
		"TK_PC_VARIABLES", "TK_PC_FVARIABLES", "TK_PC_TIPUS", "TK_PC_FTIPUS", 
		"TK_PC_SI", "TK_PC_ALTRAMENT", "TK_PC_FSI", "TK_PC_PER", "TK_PC_DE", "TK_PC_FINS", 
		"TK_PC_FER", "TK_PC_FPER", "TK_PC_MENTRE", "TK_PC_FMENTRE", "DIGIT", "LETTER", 
		"CAPLETTER", "TK_CONST_CHAR", "TK_CONST_REAL", "TK_CONST_BOOL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'programa'", "'fprograma'", "'accio'", "'faccio'", "'funcio'", 
		"'ffuncio'", "'constants'", "'fconstants'", "'variables'", "'fvariables'", 
		"'tipus'", "'ftipus'", "'si'", "'altrament'", "'fsi'", "'per'", "'de'", 
		"'fins'", "'fer'", "'fper'", "'mentre'", "'fmentre'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TK_WS", "TK_PC_PROGRAMA", "TK_PC_FPROGRAMA", "TK_PC_ACCIO", "TK_PC_FACCIO", 
		"TK_PC_FUNCIO", "TK_PC_FFUNCIO", "TK_PC_CONSTANTS", "TK_PC_FCONSTANTS", 
		"TK_PC_VARIABLES", "TK_PC_FVARIABLES", "TK_PC_TIPUS", "TK_PC_FTIPUS", 
		"TK_PC_SI", "TK_PC_ALTRAMENT", "TK_PC_FSI", "TK_PC_PER", "TK_PC_DE", "TK_PC_FINS", 
		"TK_PC_FER", "TK_PC_FPER", "TK_PC_MENTRE", "TK_PC_FMENTRE", "TK_CONST_CHAR", 
		"TK_CONST_REAL", "TK_CONST_BOOL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u0113\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\5\34\u00e8\n\34\3\35"+
		"\3\35\3\35\7\35\u00ed\n\35\f\35\16\35\u00f0\13\35\3\35\5\35\u00f3\n\35"+
		"\3\35\3\35\6\35\u00f7\n\35\r\35\16\35\u00f8\3\35\3\35\5\35\u00fd\n\35"+
		"\3\35\3\35\3\35\7\35\u0102\n\35\f\35\16\35\u0105\13\35\5\35\u0107\n\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0112\n\36\2\2\37\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\2\63\2\65\2\67\329\33;\34\3\2"+
		"\3\5\2\13\f\17\17\"\"\2\u0119\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3="+
		"\3\2\2\2\5A\3\2\2\2\7J\3\2\2\2\tT\3\2\2\2\13Z\3\2\2\2\ra\3\2\2\2\17h\3"+
		"\2\2\2\21p\3\2\2\2\23z\3\2\2\2\25\u0085\3\2\2\2\27\u008f\3\2\2\2\31\u009a"+
		"\3\2\2\2\33\u00a0\3\2\2\2\35\u00a7\3\2\2\2\37\u00aa\3\2\2\2!\u00b4\3\2"+
		"\2\2#\u00b8\3\2\2\2%\u00bc\3\2\2\2\'\u00bf\3\2\2\2)\u00c4\3\2\2\2+\u00c8"+
		"\3\2\2\2-\u00cd\3\2\2\2/\u00d4\3\2\2\2\61\u00dc\3\2\2\2\63\u00de\3\2\2"+
		"\2\65\u00e0\3\2\2\2\67\u00e7\3\2\2\29\u00f2\3\2\2\2;\u0111\3\2\2\2=>\t"+
		"\2\2\2>?\3\2\2\2?@\b\2\2\2@\4\3\2\2\2AB\7r\2\2BC\7t\2\2CD\7q\2\2DE\7i"+
		"\2\2EF\7t\2\2FG\7c\2\2GH\7o\2\2HI\7c\2\2I\6\3\2\2\2JK\7h\2\2KL\7r\2\2"+
		"LM\7t\2\2MN\7q\2\2NO\7i\2\2OP\7t\2\2PQ\7c\2\2QR\7o\2\2RS\7c\2\2S\b\3\2"+
		"\2\2TU\7c\2\2UV\7e\2\2VW\7e\2\2WX\7k\2\2XY\7q\2\2Y\n\3\2\2\2Z[\7h\2\2"+
		"[\\\7c\2\2\\]\7e\2\2]^\7e\2\2^_\7k\2\2_`\7q\2\2`\f\3\2\2\2ab\7h\2\2bc"+
		"\7w\2\2cd\7p\2\2de\7e\2\2ef\7k\2\2fg\7q\2\2g\16\3\2\2\2hi\7h\2\2ij\7h"+
		"\2\2jk\7w\2\2kl\7p\2\2lm\7e\2\2mn\7k\2\2no\7q\2\2o\20\3\2\2\2pq\7e\2\2"+
		"qr\7q\2\2rs\7p\2\2st\7u\2\2tu\7v\2\2uv\7c\2\2vw\7p\2\2wx\7v\2\2xy\7u\2"+
		"\2y\22\3\2\2\2z{\7h\2\2{|\7e\2\2|}\7q\2\2}~\7p\2\2~\177\7u\2\2\177\u0080"+
		"\7v\2\2\u0080\u0081\7c\2\2\u0081\u0082\7p\2\2\u0082\u0083\7v\2\2\u0083"+
		"\u0084\7u\2\2\u0084\24\3\2\2\2\u0085\u0086\7x\2\2\u0086\u0087\7c\2\2\u0087"+
		"\u0088\7t\2\2\u0088\u0089\7k\2\2\u0089\u008a\7c\2\2\u008a\u008b\7d\2\2"+
		"\u008b\u008c\7n\2\2\u008c\u008d\7g\2\2\u008d\u008e\7u\2\2\u008e\26\3\2"+
		"\2\2\u008f\u0090\7h\2\2\u0090\u0091\7x\2\2\u0091\u0092\7c\2\2\u0092\u0093"+
		"\7t\2\2\u0093\u0094\7k\2\2\u0094\u0095\7c\2\2\u0095\u0096\7d\2\2\u0096"+
		"\u0097\7n\2\2\u0097\u0098\7g\2\2\u0098\u0099\7u\2\2\u0099\30\3\2\2\2\u009a"+
		"\u009b\7v\2\2\u009b\u009c\7k\2\2\u009c\u009d\7r\2\2\u009d\u009e\7w\2\2"+
		"\u009e\u009f\7u\2\2\u009f\32\3\2\2\2\u00a0\u00a1\7h\2\2\u00a1\u00a2\7"+
		"v\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7r\2\2\u00a4\u00a5\7w\2\2\u00a5\u00a6"+
		"\7u\2\2\u00a6\34\3\2\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7k\2\2\u00a9\36"+
		"\3\2\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7v\2\2\u00ad"+
		"\u00ae\7t\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7o\2\2\u00b0\u00b1\7g\2\2"+
		"\u00b1\u00b2\7p\2\2\u00b2\u00b3\7v\2\2\u00b3 \3\2\2\2\u00b4\u00b5\7h\2"+
		"\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7k\2\2\u00b7\"\3\2\2\2\u00b8\u00b9\7"+
		"r\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7t\2\2\u00bb$\3\2\2\2\u00bc\u00bd"+
		"\7f\2\2\u00bd\u00be\7g\2\2\u00be&\3\2\2\2\u00bf\u00c0\7h\2\2\u00c0\u00c1"+
		"\7k\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7u\2\2\u00c3(\3\2\2\2\u00c4\u00c5"+
		"\7h\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7t\2\2\u00c7*\3\2\2\2\u00c8\u00c9"+
		"\7h\2\2\u00c9\u00ca\7r\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7t\2\2\u00cc"+
		",\3\2\2\2\u00cd\u00ce\7o\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7p\2\2\u00d0"+
		"\u00d1\7v\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7g\2\2\u00d3.\3\2\2\2\u00d4"+
		"\u00d5\7h\2\2\u00d5\u00d6\7o\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7p\2\2"+
		"\u00d8\u00d9\7v\2\2\u00d9\u00da\7t\2\2\u00da\u00db\7g\2\2\u00db\60\3\2"+
		"\2\2\u00dc\u00dd\4\63;\2\u00dd\62\3\2\2\2\u00de\u00df\4c|\2\u00df\64\3"+
		"\2\2\2\u00e0\u00e1\4C\\\2\u00e1\66\3\2\2\2\u00e2\u00e3\7)\2\2\u00e3\u00e8"+
		"\4\"\u0080\2\u00e4\u00e5\7^\2\2\u00e5\u00e6\7)\2\2\u00e6\u00e8\7)\2\2"+
		"\u00e7\u00e2\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e88\3\2\2\2\u00e9\u00ea\7"+
		"\62\2\2\u00ea\u00f3\7\60\2\2\u00eb\u00ed\5\61\31\2\u00ec\u00eb\3\2\2\2"+
		"\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1"+
		"\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f3\7\60\2\2\u00f2\u00e9\3\2\2\2"+
		"\u00f2\u00ee\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f7\7\62\2\2\u00f5\u00f7"+
		"\5\61\31\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2"+
		"\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u0106\3\2\2\2\u00fa\u00fc"+
		"\7G\2\2\u00fb\u00fd\7/\2\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0103\5\61\31\2\u00ff\u0102\7\62\2\2\u0100\u0102"+
		"\5\61\31\2\u0101\u00ff\3\2\2\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2"+
		"\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103"+
		"\3\2\2\2\u0106\u00fa\3\2\2\2\u0106\u0107\3\2\2\2\u0107:\3\2\2\2\u0108"+
		"\u0109\7h\2\2\u0109\u010a\7c\2\2\u010a\u010b\7n\2\2\u010b\u010c\7u\2\2"+
		"\u010c\u0112\7g\2\2\u010d\u010e\7v\2\2\u010e\u010f\7t\2\2\u010f\u0110"+
		"\7w\2\2\u0110\u0112\7g\2\2\u0111\u0108\3\2\2\2\u0111\u010d\3\2\2\2\u0112"+
		"<\3\2\2\2\r\2\u00e7\u00ee\u00f2\u00f6\u00f8\u00fc\u0101\u0103\u0106\u0111"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}