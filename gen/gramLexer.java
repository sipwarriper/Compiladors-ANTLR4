// Generated from /home/klanc/Projects/Uni/4t/Compiladors/Compiladors-ANTLR4/gram.g4 by ANTLR 4.7
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
		TK_PC_FPER=30, TK_PC_MENTRE=31, TK_PC_FMENTRE=32, TK_PC_INT=33, TK_PC_REAL=34,
		TK_PC_CHAR=35, TK_PC_BOOL=36, TK_PC_READ=37, TK_PC_WRITE=38, TK_CONST_CHAR=39,
		TK_CONST_REAL=40, TK_CONST_BOOL=41, TK_CONST_INT=42, TK_OP_SUMA=43, TK_OP_RESTA=44,
		TK_OP_MULT=45, TK_OP_REALDIV=46, TK_OP_INTDIV=47, TK_OP_MOD=48, TK_OP_MINUS=49,
		TK_OP_EQ=50, TK_OP_DIFF=51, TK_OP_GT=52, TK_OP_LT=53, TK_OP_LOET=54, TK_OP_GOET=55,
		TK_OP_NEG=56, TK_OP_AND=57, TK_OP_OR=58, TK_OP_QUESTION_MARK=59, TK_OP_COLON=60,
		TK_OP_VECTOR_OPEN=61, TK_OP_VECTOR_CLOSE=62, TK_OP_TUPLE=63, TK_OP_ASSIGN=64,
		TK_OP_PAR_OPEN=65, TK_OP_PAR_CLOSE=66, TK_COMMENTS=67, TK_MULTILINE_COMMENTS=68,
		TK_SEP_COMMA=69, TK_SEP_SEMICOLON=70, TK_IDENTIFIER=71;
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
		"TK_PC_MENTRE", "TK_PC_FMENTRE", "TK_PC_INT", "TK_PC_REAL", "TK_PC_CHAR",
		"TK_PC_BOOL", "TK_PC_READ", "TK_PC_WRITE", "DIGIT", "LETTER", "CAPLETTER",
		"TK_CONST_CHAR", "TK_CONST_REAL", "TK_CONST_BOOL", "TK_CONST_INT", "TK_OP_SUMA",
		"TK_OP_RESTA", "TK_OP_MULT", "TK_OP_REALDIV", "TK_OP_INTDIV", "TK_OP_MOD",
		"TK_OP_MINUS", "TK_OP_EQ", "TK_OP_DIFF", "TK_OP_GT", "TK_OP_LT", "TK_OP_LOET",
		"TK_OP_GOET", "TK_OP_NEG", "TK_OP_AND", "TK_OP_OR", "TK_OP_QUESTION_MARK",
		"TK_OP_COLON", "TK_OP_VECTOR_OPEN", "TK_OP_VECTOR_CLOSE", "TK_OP_TUPLE",
		"TK_OP_ASSIGN", "TK_OP_PAR_OPEN", "TK_OP_PAR_CLOSE", "TK_COMMENTS", "TK_MULTILINE_COMMENTS",
		"TK_SEP_COMMA", "TK_SEP_SEMICOLON", "TK_IDENTIFIER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2I\u0240\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%"+
		"\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3(\3(\3)\3)\3*\3*\3+\3+\3+\3+\5+\u01a1\n+\3+\3+\3,\3,\3,\7,\u01a8\n,"+
		"\f,\16,\u01ab\13,\3,\5,\u01ae\n,\3,\3,\6,\u01b2\n,\r,\16,\u01b3\3,\3,"+
		"\5,\u01b8\n,\3,\3,\3,\7,\u01bd\n,\f,\16,\u01c0\13,\5,\u01c2\n,\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\5-\u01cd\n-\3.\3.\3.\7.\u01d2\n.\f.\16.\u01d5\13."+
		"\3.\6.\u01d8\n.\r.\16.\u01d9\5.\u01dc\n.\3/\3/\3\60\3\60\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\3"+
		"8\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3"+
		"B\3C\3C\3D\3D\3D\3E\3E\3F\3F\3G\3G\3G\3G\7G\u0218\nG\fG\16G\u021b\13G"+
		"\3G\5G\u021e\nG\3G\3G\3H\3H\3H\3H\7H\u0226\nH\fH\16H\u0229\13H\3H\3H\3"+
		"H\3H\3H\3I\3I\3J\3J\3K\3K\5K\u0236\nK\3K\3K\3K\3K\7K\u023c\nK\fK\16K\u023f"+
		"\13K\4\u0219\u0227\2L\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O\2Q\2S\2U)W*Y+[,]-_.a/c\60e\61"+
		"g\62i\63k\64m\65o\66q\67s8u9w:y;{<}=\177>\u0081?\u0083@\u0085A\u0087B"+
		"\u0089C\u008bD\u008dE\u008fF\u0091G\u0093H\u0095I\3\2\5\5\2\13\f\17\17"+
		"\"\"\3\3\f\f\4\2\62\62aa\2\u0251\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{"+
		"\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\3\u0097"+
		"\3\2\2\2\5\u009b\3\2\2\2\7\u00a4\3\2\2\2\t\u00ae\3\2\2\2\13\u00b4\3\2"+
		"\2\2\r\u00bb\3\2\2\2\17\u00c2\3\2\2\2\21\u00ca\3\2\2\2\23\u00d2\3\2\2"+
		"\2\25\u00d6\3\2\2\2\27\u00dd\3\2\2\2\31\u00e7\3\2\2\2\33\u00f2\3\2\2\2"+
		"\35\u00fc\3\2\2\2\37\u0107\3\2\2\2!\u010d\3\2\2\2#\u0114\3\2\2\2%\u011a"+
		"\3\2\2\2\'\u0121\3\2\2\2)\u0128\3\2\2\2+\u012d\3\2\2\2-\u0133\3\2\2\2"+
		"/\u0136\3\2\2\2\61\u013e\3\2\2\2\63\u0148\3\2\2\2\65\u014c\3\2\2\2\67"+
		"\u0150\3\2\2\29\u0153\3\2\2\2;\u0158\3\2\2\2=\u015c\3\2\2\2?\u0161\3\2"+
		"\2\2A\u0168\3\2\2\2C\u0170\3\2\2\2E\u0176\3\2\2\2G\u017b\3\2\2\2I\u017f"+
		"\3\2\2\2K\u0186\3\2\2\2M\u018d\3\2\2\2O\u0196\3\2\2\2Q\u0198\3\2\2\2S"+
		"\u019a\3\2\2\2U\u019c\3\2\2\2W\u01ad\3\2\2\2Y\u01cc\3\2\2\2[\u01db\3\2"+
		"\2\2]\u01dd\3\2\2\2_\u01df\3\2\2\2a\u01e1\3\2\2\2c\u01e3\3\2\2\2e\u01e5"+
		"\3\2\2\2g\u01e7\3\2\2\2i\u01e9\3\2\2\2k\u01eb\3\2\2\2m\u01ee\3\2\2\2o"+
		"\u01f1\3\2\2\2q\u01f3\3\2\2\2s\u01f5\3\2\2\2u\u01f8\3\2\2\2w\u01fb\3\2"+
		"\2\2y\u01fe\3\2\2\2{\u0200\3\2\2\2}\u0202\3\2\2\2\177\u0204\3\2\2\2\u0081"+
		"\u0206\3\2\2\2\u0083\u0208\3\2\2\2\u0085\u020a\3\2\2\2\u0087\u020c\3\2"+
		"\2\2\u0089\u020f\3\2\2\2\u008b\u0211\3\2\2\2\u008d\u0213\3\2\2\2\u008f"+
		"\u0221\3\2\2\2\u0091\u022f\3\2\2\2\u0093\u0231\3\2\2\2\u0095\u0235\3\2"+
		"\2\2\u0097\u0098\t\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\b\2\2\2\u009a"+
		"\4\3\2\2\2\u009b\u009c\7r\2\2\u009c\u009d\7t\2\2\u009d\u009e\7q\2\2\u009e"+
		"\u009f\7i\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7o\2\2"+
		"\u00a2\u00a3\7c\2\2\u00a3\6\3\2\2\2\u00a4\u00a5\7h\2\2\u00a5\u00a6\7r"+
		"\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7i\2\2\u00a9\u00aa"+
		"\7t\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7o\2\2\u00ac\u00ad\7c\2\2\u00ad"+
		"\b\3\2\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7e\2\2\u00b0\u00b1\7e\2\2\u00b1"+
		"\u00b2\7k\2\2\u00b2\u00b3\7q\2\2\u00b3\n\3\2\2\2\u00b4\u00b5\7h\2\2\u00b5"+
		"\u00b6\7c\2\2\u00b6\u00b7\7e\2\2\u00b7\u00b8\7e\2\2\u00b8\u00b9\7k\2\2"+
		"\u00b9\u00ba\7q\2\2\u00ba\f\3\2\2\2\u00bb\u00bc\7h\2\2\u00bc\u00bd\7w"+
		"\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7e\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1"+
		"\7q\2\2\u00c1\16\3\2\2\2\u00c2\u00c3\7h\2\2\u00c3\u00c4\7h\2\2\u00c4\u00c5"+
		"\7w\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7e\2\2\u00c7\u00c8\7k\2\2\u00c8"+
		"\u00c9\7q\2\2\u00c9\20\3\2\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7g\2\2\u00cc"+
		"\u00cd\7v\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7p\2\2"+
		"\u00d0\u00d1\7c\2\2\u00d1\22\3\2\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7"+
		"p\2\2\u00d4\u00d5\7v\2\2\u00d5\24\3\2\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8"+
		"\7p\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7u\2\2\u00da\u00db\7q\2\2\u00db"+
		"\u00dc\7t\2\2\u00dc\26\3\2\2\2\u00dd\u00de\7e\2\2\u00de\u00df\7q\2\2\u00df"+
		"\u00e0\7p\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7c\2\2"+
		"\u00e3\u00e4\7p\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7u\2\2\u00e6\30\3\2"+
		"\2\2\u00e7\u00e8\7h\2\2\u00e8\u00e9\7e\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb"+
		"\7p\2\2\u00eb\u00ec\7u\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee\7c\2\2\u00ee"+
		"\u00ef\7p\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7u\2\2\u00f1\32\3\2\2\2\u00f2"+
		"\u00f3\7x\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\7k\2\2"+
		"\u00f6\u00f7\7c\2\2\u00f7\u00f8\7d\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa"+
		"\7g\2\2\u00fa\u00fb\7u\2\2\u00fb\34\3\2\2\2\u00fc\u00fd\7h\2\2\u00fd\u00fe"+
		"\7x\2\2\u00fe\u00ff\7c\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7k\2\2\u0101"+
		"\u0102\7c\2\2\u0102\u0103\7d\2\2\u0103\u0104\7n\2\2\u0104\u0105\7g\2\2"+
		"\u0105\u0106\7u\2\2\u0106\36\3\2\2\2\u0107\u0108\7v\2\2\u0108\u0109\7"+
		"k\2\2\u0109\u010a\7r\2\2\u010a\u010b\7w\2\2\u010b\u010c\7u\2\2\u010c "+
		"\3\2\2\2\u010d\u010e\7h\2\2\u010e\u010f\7v\2\2\u010f\u0110\7k\2\2\u0110"+
		"\u0111\7r\2\2\u0111\u0112\7w\2\2\u0112\u0113\7u\2\2\u0113\"\3\2\2\2\u0114"+
		"\u0115\7v\2\2\u0115\u0116\7w\2\2\u0116\u0117\7r\2\2\u0117\u0118\7n\2\2"+
		"\u0118\u0119\7c\2\2\u0119$\3\2\2\2\u011a\u011b\7h\2\2\u011b\u011c\7v\2"+
		"\2\u011c\u011d\7w\2\2\u011d\u011e\7r\2\2\u011e\u011f\7n\2\2\u011f\u0120"+
		"\7c\2\2\u0120&\3\2\2\2\u0121\u0122\7x\2\2\u0122\u0123\7g\2\2\u0123\u0124"+
		"\7e\2\2\u0124\u0125\7v\2\2\u0125\u0126\7q\2\2\u0126\u0127\7t\2\2\u0127"+
		"(\3\2\2\2\u0128\u0129\7o\2\2\u0129\u012a\7k\2\2\u012a\u012b\7f\2\2\u012b"+
		"\u012c\7c\2\2\u012c*\3\2\2\2\u012d\u012e\7k\2\2\u012e\u012f\7p\2\2\u012f"+
		"\u0130\7k\2\2\u0130\u0131\7e\2\2\u0131\u0132\7k\2\2\u0132,\3\2\2\2\u0133"+
		"\u0134\7u\2\2\u0134\u0135\7k\2\2\u0135.\3\2\2\2\u0136\u0137\7n\2\2\u0137"+
		"\u0138\7n\2\2\u0138\u0139\7c\2\2\u0139\u013a\7x\2\2\u013a\u013b\7q\2\2"+
		"\u013b\u013c\7t\2\2\u013c\u013d\7u\2\2\u013d\60\3\2\2\2\u013e\u013f\7"+
		"c\2\2\u013f\u0140\7n\2\2\u0140\u0141\7v\2\2\u0141\u0142\7t\2\2\u0142\u0143"+
		"\7c\2\2\u0143\u0144\7o\2\2\u0144\u0145\7g\2\2\u0145\u0146\7p\2\2\u0146"+
		"\u0147\7v\2\2\u0147\62\3\2\2\2\u0148\u0149\7h\2\2\u0149\u014a\7u\2\2\u014a"+
		"\u014b\7k\2\2\u014b\64\3\2\2\2\u014c\u014d\7r\2\2\u014d\u014e\7g\2\2\u014e"+
		"\u014f\7t\2\2\u014f\66\3\2\2\2\u0150\u0151\7f\2\2\u0151\u0152\7g\2\2\u0152"+
		"8\3\2\2\2\u0153\u0154\7h\2\2\u0154\u0155\7k\2\2\u0155\u0156\7p\2\2\u0156"+
		"\u0157\7u\2\2\u0157:\3\2\2\2\u0158\u0159\7h\2\2\u0159\u015a\7g\2\2\u015a"+
		"\u015b\7t\2\2\u015b<\3\2\2\2\u015c\u015d\7h\2\2\u015d\u015e\7r\2\2\u015e"+
		"\u015f\7g\2\2\u015f\u0160\7t\2\2\u0160>\3\2\2\2\u0161\u0162\7o\2\2\u0162"+
		"\u0163\7g\2\2\u0163\u0164\7p\2\2\u0164\u0165\7v\2\2\u0165\u0166\7t\2\2"+
		"\u0166\u0167\7g\2\2\u0167@\3\2\2\2\u0168\u0169\7h\2\2\u0169\u016a\7o\2"+
		"\2\u016a\u016b\7g\2\2\u016b\u016c\7p\2\2\u016c\u016d\7v\2\2\u016d\u016e"+
		"\7t\2\2\u016e\u016f\7g\2\2\u016fB\3\2\2\2\u0170\u0171\7g\2\2\u0171\u0172"+
		"\7p\2\2\u0172\u0173\7v\2\2\u0173\u0174\7g\2\2\u0174\u0175\7t\2\2\u0175"+
		"D\3\2\2\2\u0176\u0177\7t\2\2\u0177\u0178\7g\2\2\u0178\u0179\7c\2\2\u0179"+
		"\u017a\7n\2\2\u017aF\3\2\2\2\u017b\u017c\7e\2\2\u017c\u017d\7c\2\2\u017d"+
		"\u017e\7t\2\2\u017eH\3\2\2\2\u017f\u0180\7d\2\2\u0180\u0181\7q\2\2\u0181"+
		"\u0182\7q\2\2\u0182\u0183\7n\2\2\u0183\u0184\7g\2\2\u0184\u0185\7c\2\2"+
		"\u0185J\3\2\2\2\u0186\u0187\7n\2\2\u0187\u0188\7n\2\2\u0188\u0189\7g\2"+
		"\2\u0189\u018a\7i\2\2\u018a\u018b\7k\2\2\u018b\u018c\7t\2\2\u018cL\3\2"+
		"\2\2\u018d\u018e\7g\2\2\u018e\u018f\7u\2\2\u018f\u0190\7e\2\2\u0190\u0191"+
		"\7t\2\2\u0191\u0192\7k\2\2\u0192\u0193\7w\2\2\u0193\u0194\7t\2\2\u0194"+
		"\u0195\7g\2\2\u0195N\3\2\2\2\u0196\u0197\4\63;\2\u0197P\3\2\2\2\u0198"+
		"\u0199\4c|\2\u0199R\3\2\2\2\u019a\u019b\4C\\\2\u019bT\3\2\2\2\u019c\u01a0"+
		"\7)\2\2\u019d\u01a1\4\"\u0080\2\u019e\u019f\7^\2\2\u019f\u01a1\7)\2\2"+
		"\u01a0\u019d\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3"+
		"\7)\2\2\u01a3V\3\2\2\2\u01a4\u01a5\7\62\2\2\u01a5\u01ae\7\60\2\2\u01a6"+
		"\u01a8\5O(\2\u01a7\u01a6\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2"+
		"\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ae"+
		"\7\60\2\2\u01ad\u01a4\3\2\2\2\u01ad\u01a9\3\2\2\2\u01ae\u01b1\3\2\2\2"+
		"\u01af\u01b2\7\62\2\2\u01b0\u01b2\5O(\2\u01b1\u01af\3\2\2\2\u01b1\u01b0"+
		"\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4"+
		"\u01c1\3\2\2\2\u01b5\u01b7\7G\2\2\u01b6\u01b8\7/\2\2\u01b7\u01b6\3\2\2"+
		"\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01be\5O(\2\u01ba\u01bd"+
		"\7\62\2\2\u01bb\u01bd\5O(\2\u01bc\u01ba\3\2\2\2\u01bc\u01bb\3\2\2\2\u01bd"+
		"\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c2\3\2"+
		"\2\2\u01c0\u01be\3\2\2\2\u01c1\u01b5\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"X\3\2\2\2\u01c3\u01c4\7h\2\2\u01c4\u01c5\7c\2\2\u01c5\u01c6\7n\2\2\u01c6"+
		"\u01c7\7u\2\2\u01c7\u01cd\7g\2\2\u01c8\u01c9\7v\2\2\u01c9\u01ca\7t\2\2"+
		"\u01ca\u01cb\7w\2\2\u01cb\u01cd\7g\2\2\u01cc\u01c3\3\2\2\2\u01cc\u01c8"+
		"\3\2\2\2\u01cdZ\3\2\2\2\u01ce\u01d3\5O(\2\u01cf\u01d2\7\62\2\2\u01d0\u01d2"+
		"\5O(\2\u01d1\u01cf\3\2\2\2\u01d1\u01d0\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3"+
		"\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01dc\3\2\2\2\u01d5\u01d3\3\2"+
		"\2\2\u01d6\u01d8\7\62\2\2\u01d7\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9"+
		"\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01ce\3\2"+
		"\2\2\u01db\u01d7\3\2\2\2\u01dc\\\3\2\2\2\u01dd\u01de\7-\2\2\u01de^\3\2"+
		"\2\2\u01df\u01e0\7/\2\2\u01e0`\3\2\2\2\u01e1\u01e2\7,\2\2\u01e2b\3\2\2"+
		"\2\u01e3\u01e4\7\61\2\2\u01e4d\3\2\2\2\u01e5\u01e6\7^\2\2\u01e6f\3\2\2"+
		"\2\u01e7\u01e8\7\'\2\2\u01e8h\3\2\2\2\u01e9\u01ea\7\u0080\2\2\u01eaj\3"+
		"\2\2\2\u01eb\u01ec\7?\2\2\u01ec\u01ed\7?\2\2\u01edl\3\2\2\2\u01ee\u01ef"+
		"\7#\2\2\u01ef\u01f0\7?\2\2\u01f0n\3\2\2\2\u01f1\u01f2\7@\2\2\u01f2p\3"+
		"\2\2\2\u01f3\u01f4\7>\2\2\u01f4r\3\2\2\2\u01f5\u01f6\7>\2\2\u01f6\u01f7"+
		"\7?\2\2\u01f7t\3\2\2\2\u01f8\u01f9\7@\2\2\u01f9\u01fa\7?\2\2\u01fav\3"+
		"\2\2\2\u01fb\u01fc\7p\2\2\u01fc\u01fd\7q\2\2\u01fdx\3\2\2\2\u01fe\u01ff"+
		"\7(\2\2\u01ffz\3\2\2\2\u0200\u0201\7~\2\2\u0201|\3\2\2\2\u0202\u0203\7"+
		"A\2\2\u0203~\3\2\2\2\u0204\u0205\7<\2\2\u0205\u0080\3\2\2\2\u0206\u0207"+
		"\7]\2\2\u0207\u0082\3\2\2\2\u0208\u0209\7_\2\2\u0209\u0084\3\2\2\2\u020a"+
		"\u020b\7\60\2\2\u020b\u0086\3\2\2\2\u020c\u020d\7<\2\2\u020d\u020e\7?"+
		"\2\2\u020e\u0088\3\2\2\2\u020f\u0210\7*\2\2\u0210\u008a\3\2\2\2\u0211"+
		"\u0212\7+\2\2\u0212\u008c\3\2\2\2\u0213\u0214\7\61\2\2\u0214\u0215\7\61"+
		"\2\2\u0215\u0219\3\2\2\2\u0216\u0218\13\2\2\2\u0217\u0216\3\2\2\2\u0218"+
		"\u021b\3\2\2\2\u0219\u021a\3\2\2\2\u0219\u0217\3\2\2\2\u021a\u021d\3\2"+
		"\2\2\u021b\u0219\3\2\2\2\u021c\u021e\t\3\2\2\u021d\u021c\3\2\2\2\u021e"+
		"\u021f\3\2\2\2\u021f\u0220\bG\2\2\u0220\u008e\3\2\2\2\u0221\u0222\7\61"+
		"\2\2\u0222\u0223\7,\2\2\u0223\u0227\3\2\2\2\u0224\u0226\13\2\2\2\u0225"+
		"\u0224\3\2\2\2\u0226\u0229\3\2\2\2\u0227\u0228\3\2\2\2\u0227\u0225\3\2"+
		"\2\2\u0228\u022a\3\2\2\2\u0229\u0227\3\2\2\2\u022a\u022b\7,\2\2\u022b"+
		"\u022c\7\61\2\2\u022c\u022d\3\2\2\2\u022d\u022e\bH\2\2\u022e\u0090\3\2"+
		"\2\2\u022f\u0230\7.\2\2\u0230\u0092\3\2\2\2\u0231\u0232\7=\2\2\u0232\u0094"+
		"\3\2\2\2\u0233\u0236\5Q)\2\u0234\u0236\5S*\2\u0235\u0233\3\2\2\2\u0235"+
		"\u0234\3\2\2\2\u0236\u023d\3\2\2\2\u0237\u023c\5Q)\2\u0238\u023c\5S*\2"+
		"\u0239\u023c\5O(\2\u023a\u023c\t\4\2\2\u023b\u0237\3\2\2\2\u023b\u0238"+
		"\3\2\2\2\u023b\u0239\3\2\2\2\u023b\u023a\3\2\2\2\u023c\u023f\3\2\2\2\u023d"+
		"\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0096\3\2\2\2\u023f\u023d\3\2"+
		"\2\2\27\2\u01a0\u01a9\u01ad\u01b1\u01b3\u01b7\u01bc\u01be\u01c1\u01cc"+
		"\u01d1\u01d3\u01d9\u01db\u0219\u021d\u0227\u0235\u023b\u023d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}