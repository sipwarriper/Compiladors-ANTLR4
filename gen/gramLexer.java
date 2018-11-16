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
		TK_OP_QUOTE=65, TK_OP_PAR_OPEN=66, TK_OP_PAR_CLOSE=67, TK_COMMENTS=68, 
		TK_MULTILINE_COMMENTS=69, TK_SEP_COMMA=70, TK_SEP_SEMICOLON=71, TK_STRING_LITERAL=72, 
		TK_IDENTIFIER=73;
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
		"TK_OP_ASSIGN", "TK_OP_QUOTE", "TK_OP_PAR_OPEN", "TK_OP_PAR_CLOSE", "TK_COMMENTS", 
		"TK_MULTILINE_COMMENTS", "TK_SEP_COMMA", "TK_SEP_SEMICOLON", "TK_STRING_LITERAL", 
		"TK_IDENTIFIER"
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
		"'['", "']'", "'.'", "':='", "'\"'", "'('", "')'", null, null, "','", 
		"';'"
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
		"TK_OP_VECTOR_CLOSE", "TK_OP_TUPLE", "TK_OP_ASSIGN", "TK_OP_QUOTE", "TK_OP_PAR_OPEN", 
		"TK_OP_PAR_CLOSE", "TK_COMMENTS", "TK_MULTILINE_COMMENTS", "TK_SEP_COMMA", 
		"TK_SEP_SEMICOLON", "TK_STRING_LITERAL", "TK_IDENTIFIER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2K\u0252\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$"+
		"\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3+\5+\u01a5\n+\3+\3+\3,\3,\3,"+
		"\7,\u01ac\n,\f,\16,\u01af\13,\3,\5,\u01b2\n,\3,\3,\6,\u01b6\n,\r,\16,"+
		"\u01b7\3,\3,\5,\u01bc\n,\3,\3,\3,\7,\u01c1\n,\f,\16,\u01c4\13,\5,\u01c6"+
		"\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u01d1\n-\3.\3.\3.\7.\u01d6\n.\f.\16"+
		".\u01d9\13.\3.\6.\u01dc\n.\r.\16.\u01dd\5.\u01e0\n.\3/\3/\3\60\3\60\3"+
		"\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\67\3"+
		"\67\3\67\38\38\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3>\3>\3?\3?\3@\3"+
		"@\3A\3A\3B\3B\3C\3C\3D\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3H\3H\7H\u021e\n"+
		"H\fH\16H\u0221\13H\3H\5H\u0224\nH\3H\3H\3I\3I\3I\3I\7I\u022c\nI\fI\16"+
		"I\u022f\13I\3I\3I\3I\3I\3I\3J\3J\3K\3K\3L\3L\3L\3L\3L\7L\u023f\nL\fL\16"+
		"L\u0242\13L\3L\3L\3M\3M\5M\u0248\nM\3M\3M\3M\3M\7M\u024e\nM\fM\16M\u0251"+
		"\13M\4\u021f\u022d\2N\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O\2Q\2S\2U)W*Y+[,]-_.a/c\60e\61"+
		"g\62i\63k\64m\65o\66q\67s8u9w:y;{<}=\177>\u0081?\u0083@\u0085A\u0087B"+
		"\u0089C\u008bD\u008dE\u008fF\u0091G\u0093H\u0095I\u0097J\u0099K\3\2\5"+
		"\5\2\13\f\17\17\"\"\3\3\f\f\4\2\62\62aa\2\u0267\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2"+
		"\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\3\u009b\3\2\2\2\5\u009f\3\2\2"+
		"\2\7\u00a8\3\2\2\2\t\u00b2\3\2\2\2\13\u00b8\3\2\2\2\r\u00bf\3\2\2\2\17"+
		"\u00c6\3\2\2\2\21\u00ce\3\2\2\2\23\u00d6\3\2\2\2\25\u00da\3\2\2\2\27\u00e1"+
		"\3\2\2\2\31\u00eb\3\2\2\2\33\u00f6\3\2\2\2\35\u0100\3\2\2\2\37\u010b\3"+
		"\2\2\2!\u0111\3\2\2\2#\u0118\3\2\2\2%\u011e\3\2\2\2\'\u0125\3\2\2\2)\u012c"+
		"\3\2\2\2+\u0131\3\2\2\2-\u0137\3\2\2\2/\u013a\3\2\2\2\61\u0142\3\2\2\2"+
		"\63\u014c\3\2\2\2\65\u0150\3\2\2\2\67\u0154\3\2\2\29\u0157\3\2\2\2;\u015c"+
		"\3\2\2\2=\u0160\3\2\2\2?\u0165\3\2\2\2A\u016c\3\2\2\2C\u0174\3\2\2\2E"+
		"\u017a\3\2\2\2G\u017f\3\2\2\2I\u0183\3\2\2\2K\u018a\3\2\2\2M\u0191\3\2"+
		"\2\2O\u019a\3\2\2\2Q\u019c\3\2\2\2S\u019e\3\2\2\2U\u01a0\3\2\2\2W\u01b1"+
		"\3\2\2\2Y\u01d0\3\2\2\2[\u01df\3\2\2\2]\u01e1\3\2\2\2_\u01e3\3\2\2\2a"+
		"\u01e5\3\2\2\2c\u01e7\3\2\2\2e\u01e9\3\2\2\2g\u01eb\3\2\2\2i\u01ed\3\2"+
		"\2\2k\u01ef\3\2\2\2m\u01f2\3\2\2\2o\u01f5\3\2\2\2q\u01f7\3\2\2\2s\u01f9"+
		"\3\2\2\2u\u01fc\3\2\2\2w\u01ff\3\2\2\2y\u0202\3\2\2\2{\u0204\3\2\2\2}"+
		"\u0206\3\2\2\2\177\u0208\3\2\2\2\u0081\u020a\3\2\2\2\u0083\u020c\3\2\2"+
		"\2\u0085\u020e\3\2\2\2\u0087\u0210\3\2\2\2\u0089\u0213\3\2\2\2\u008b\u0215"+
		"\3\2\2\2\u008d\u0217\3\2\2\2\u008f\u0219\3\2\2\2\u0091\u0227\3\2\2\2\u0093"+
		"\u0235\3\2\2\2\u0095\u0237\3\2\2\2\u0097\u0239\3\2\2\2\u0099\u0247\3\2"+
		"\2\2\u009b\u009c\t\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\2\2\2\u009e"+
		"\4\3\2\2\2\u009f\u00a0\7r\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7q\2\2\u00a2"+
		"\u00a3\7i\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7o\2\2"+
		"\u00a6\u00a7\7c\2\2\u00a7\6\3\2\2\2\u00a8\u00a9\7h\2\2\u00a9\u00aa\7r"+
		"\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7i\2\2\u00ad\u00ae"+
		"\7t\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7o\2\2\u00b0\u00b1\7c\2\2\u00b1"+
		"\b\3\2\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7e\2\2\u00b4\u00b5\7e\2\2\u00b5"+
		"\u00b6\7k\2\2\u00b6\u00b7\7q\2\2\u00b7\n\3\2\2\2\u00b8\u00b9\7h\2\2\u00b9"+
		"\u00ba\7c\2\2\u00ba\u00bb\7e\2\2\u00bb\u00bc\7e\2\2\u00bc\u00bd\7k\2\2"+
		"\u00bd\u00be\7q\2\2\u00be\f\3\2\2\2\u00bf\u00c0\7h\2\2\u00c0\u00c1\7w"+
		"\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7e\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5"+
		"\7q\2\2\u00c5\16\3\2\2\2\u00c6\u00c7\7h\2\2\u00c7\u00c8\7h\2\2\u00c8\u00c9"+
		"\7w\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb\7e\2\2\u00cb\u00cc\7k\2\2\u00cc"+
		"\u00cd\7q\2\2\u00cd\20\3\2\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7g\2\2\u00d0"+
		"\u00d1\7v\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7p\2\2"+
		"\u00d4\u00d5\7c\2\2\u00d5\22\3\2\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7"+
		"p\2\2\u00d8\u00d9\7v\2\2\u00d9\24\3\2\2\2\u00da\u00db\7g\2\2\u00db\u00dc"+
		"\7p\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7u\2\2\u00de\u00df\7q\2\2\u00df"+
		"\u00e0\7t\2\2\u00e0\26\3\2\2\2\u00e1\u00e2\7e\2\2\u00e2\u00e3\7q\2\2\u00e3"+
		"\u00e4\7p\2\2\u00e4\u00e5\7u\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\7c\2\2"+
		"\u00e7\u00e8\7p\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7u\2\2\u00ea\30\3\2"+
		"\2\2\u00eb\u00ec\7h\2\2\u00ec\u00ed\7e\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef"+
		"\7p\2\2\u00ef\u00f0\7u\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7c\2\2\u00f2"+
		"\u00f3\7p\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\7u\2\2\u00f5\32\3\2\2\2\u00f6"+
		"\u00f7\7x\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9\7t\2\2\u00f9\u00fa\7k\2\2"+
		"\u00fa\u00fb\7c\2\2\u00fb\u00fc\7d\2\2\u00fc\u00fd\7n\2\2\u00fd\u00fe"+
		"\7g\2\2\u00fe\u00ff\7u\2\2\u00ff\34\3\2\2\2\u0100\u0101\7h\2\2\u0101\u0102"+
		"\7x\2\2\u0102\u0103\7c\2\2\u0103\u0104\7t\2\2\u0104\u0105\7k\2\2\u0105"+
		"\u0106\7c\2\2\u0106\u0107\7d\2\2\u0107\u0108\7n\2\2\u0108\u0109\7g\2\2"+
		"\u0109\u010a\7u\2\2\u010a\36\3\2\2\2\u010b\u010c\7v\2\2\u010c\u010d\7"+
		"k\2\2\u010d\u010e\7r\2\2\u010e\u010f\7w\2\2\u010f\u0110\7u\2\2\u0110 "+
		"\3\2\2\2\u0111\u0112\7h\2\2\u0112\u0113\7v\2\2\u0113\u0114\7k\2\2\u0114"+
		"\u0115\7r\2\2\u0115\u0116\7w\2\2\u0116\u0117\7u\2\2\u0117\"\3\2\2\2\u0118"+
		"\u0119\7v\2\2\u0119\u011a\7w\2\2\u011a\u011b\7r\2\2\u011b\u011c\7n\2\2"+
		"\u011c\u011d\7c\2\2\u011d$\3\2\2\2\u011e\u011f\7h\2\2\u011f\u0120\7v\2"+
		"\2\u0120\u0121\7w\2\2\u0121\u0122\7r\2\2\u0122\u0123\7n\2\2\u0123\u0124"+
		"\7c\2\2\u0124&\3\2\2\2\u0125\u0126\7x\2\2\u0126\u0127\7g\2\2\u0127\u0128"+
		"\7e\2\2\u0128\u0129\7v\2\2\u0129\u012a\7q\2\2\u012a\u012b\7t\2\2\u012b"+
		"(\3\2\2\2\u012c\u012d\7o\2\2\u012d\u012e\7k\2\2\u012e\u012f\7f\2\2\u012f"+
		"\u0130\7c\2\2\u0130*\3\2\2\2\u0131\u0132\7k\2\2\u0132\u0133\7p\2\2\u0133"+
		"\u0134\7k\2\2\u0134\u0135\7e\2\2\u0135\u0136\7k\2\2\u0136,\3\2\2\2\u0137"+
		"\u0138\7u\2\2\u0138\u0139\7k\2\2\u0139.\3\2\2\2\u013a\u013b\7n\2\2\u013b"+
		"\u013c\7n\2\2\u013c\u013d\7c\2\2\u013d\u013e\7x\2\2\u013e\u013f\7q\2\2"+
		"\u013f\u0140\7t\2\2\u0140\u0141\7u\2\2\u0141\60\3\2\2\2\u0142\u0143\7"+
		"c\2\2\u0143\u0144\7n\2\2\u0144\u0145\7v\2\2\u0145\u0146\7t\2\2\u0146\u0147"+
		"\7c\2\2\u0147\u0148\7o\2\2\u0148\u0149\7g\2\2\u0149\u014a\7p\2\2\u014a"+
		"\u014b\7v\2\2\u014b\62\3\2\2\2\u014c\u014d\7h\2\2\u014d\u014e\7u\2\2\u014e"+
		"\u014f\7k\2\2\u014f\64\3\2\2\2\u0150\u0151\7r\2\2\u0151\u0152\7g\2\2\u0152"+
		"\u0153\7t\2\2\u0153\66\3\2\2\2\u0154\u0155\7f\2\2\u0155\u0156\7g\2\2\u0156"+
		"8\3\2\2\2\u0157\u0158\7h\2\2\u0158\u0159\7k\2\2\u0159\u015a\7p\2\2\u015a"+
		"\u015b\7u\2\2\u015b:\3\2\2\2\u015c\u015d\7h\2\2\u015d\u015e\7g\2\2\u015e"+
		"\u015f\7t\2\2\u015f<\3\2\2\2\u0160\u0161\7h\2\2\u0161\u0162\7r\2\2\u0162"+
		"\u0163\7g\2\2\u0163\u0164\7t\2\2\u0164>\3\2\2\2\u0165\u0166\7o\2\2\u0166"+
		"\u0167\7g\2\2\u0167\u0168\7p\2\2\u0168\u0169\7v\2\2\u0169\u016a\7t\2\2"+
		"\u016a\u016b\7g\2\2\u016b@\3\2\2\2\u016c\u016d\7h\2\2\u016d\u016e\7o\2"+
		"\2\u016e\u016f\7g\2\2\u016f\u0170\7p\2\2\u0170\u0171\7v\2\2\u0171\u0172"+
		"\7t\2\2\u0172\u0173\7g\2\2\u0173B\3\2\2\2\u0174\u0175\7g\2\2\u0175\u0176"+
		"\7p\2\2\u0176\u0177\7v\2\2\u0177\u0178\7g\2\2\u0178\u0179\7t\2\2\u0179"+
		"D\3\2\2\2\u017a\u017b\7t\2\2\u017b\u017c\7g\2\2\u017c\u017d\7c\2\2\u017d"+
		"\u017e\7n\2\2\u017eF\3\2\2\2\u017f\u0180\7e\2\2\u0180\u0181\7c\2\2\u0181"+
		"\u0182\7t\2\2\u0182H\3\2\2\2\u0183\u0184\7d\2\2\u0184\u0185\7q\2\2\u0185"+
		"\u0186\7q\2\2\u0186\u0187\7n\2\2\u0187\u0188\7g\2\2\u0188\u0189\7c\2\2"+
		"\u0189J\3\2\2\2\u018a\u018b\7n\2\2\u018b\u018c\7n\2\2\u018c\u018d\7g\2"+
		"\2\u018d\u018e\7i\2\2\u018e\u018f\7k\2\2\u018f\u0190\7t\2\2\u0190L\3\2"+
		"\2\2\u0191\u0192\7g\2\2\u0192\u0193\7u\2\2\u0193\u0194\7e\2\2\u0194\u0195"+
		"\7t\2\2\u0195\u0196\7k\2\2\u0196\u0197\7w\2\2\u0197\u0198\7t\2\2\u0198"+
		"\u0199\7g\2\2\u0199N\3\2\2\2\u019a\u019b\4\63;\2\u019bP\3\2\2\2\u019c"+
		"\u019d\4c|\2\u019dR\3\2\2\2\u019e\u019f\4C\\\2\u019fT\3\2\2\2\u01a0\u01a4"+
		"\7)\2\2\u01a1\u01a5\4\"\u0080\2\u01a2\u01a3\7^\2\2\u01a3\u01a5\7)\2\2"+
		"\u01a4\u01a1\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7"+
		"\7)\2\2\u01a7V\3\2\2\2\u01a8\u01a9\7\62\2\2\u01a9\u01b2\7\60\2\2\u01aa"+
		"\u01ac\5O(\2\u01ab\u01aa\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2"+
		"\2\u01ad\u01ae\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b2"+
		"\7\60\2\2\u01b1\u01a8\3\2\2\2\u01b1\u01ad\3\2\2\2\u01b2\u01b5\3\2\2\2"+
		"\u01b3\u01b6\7\62\2\2\u01b4\u01b6\5O(\2\u01b5\u01b3\3\2\2\2\u01b5\u01b4"+
		"\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8"+
		"\u01c5\3\2\2\2\u01b9\u01bb\7G\2\2\u01ba\u01bc\7/\2\2\u01bb\u01ba\3\2\2"+
		"\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c2\5O(\2\u01be\u01c1"+
		"\7\62\2\2\u01bf\u01c1\5O(\2\u01c0\u01be\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1"+
		"\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c6\3\2"+
		"\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01b9\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"X\3\2\2\2\u01c7\u01c8\7h\2\2\u01c8\u01c9\7c\2\2\u01c9\u01ca\7n\2\2\u01ca"+
		"\u01cb\7u\2\2\u01cb\u01d1\7g\2\2\u01cc\u01cd\7v\2\2\u01cd\u01ce\7t\2\2"+
		"\u01ce\u01cf\7w\2\2\u01cf\u01d1\7g\2\2\u01d0\u01c7\3\2\2\2\u01d0\u01cc"+
		"\3\2\2\2\u01d1Z\3\2\2\2\u01d2\u01d7\5O(\2\u01d3\u01d6\7\62\2\2\u01d4\u01d6"+
		"\5O(\2\u01d5\u01d3\3\2\2\2\u01d5\u01d4\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7"+
		"\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01e0\3\2\2\2\u01d9\u01d7\3\2"+
		"\2\2\u01da\u01dc\7\62\2\2\u01db\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01d2\3\2"+
		"\2\2\u01df\u01db\3\2\2\2\u01e0\\\3\2\2\2\u01e1\u01e2\7-\2\2\u01e2^\3\2"+
		"\2\2\u01e3\u01e4\7/\2\2\u01e4`\3\2\2\2\u01e5\u01e6\7,\2\2\u01e6b\3\2\2"+
		"\2\u01e7\u01e8\7\61\2\2\u01e8d\3\2\2\2\u01e9\u01ea\7^\2\2\u01eaf\3\2\2"+
		"\2\u01eb\u01ec\7\'\2\2\u01ech\3\2\2\2\u01ed\u01ee\7\u0080\2\2\u01eej\3"+
		"\2\2\2\u01ef\u01f0\7?\2\2\u01f0\u01f1\7?\2\2\u01f1l\3\2\2\2\u01f2\u01f3"+
		"\7#\2\2\u01f3\u01f4\7?\2\2\u01f4n\3\2\2\2\u01f5\u01f6\7@\2\2\u01f6p\3"+
		"\2\2\2\u01f7\u01f8\7>\2\2\u01f8r\3\2\2\2\u01f9\u01fa\7>\2\2\u01fa\u01fb"+
		"\7?\2\2\u01fbt\3\2\2\2\u01fc\u01fd\7@\2\2\u01fd\u01fe\7?\2\2\u01fev\3"+
		"\2\2\2\u01ff\u0200\7p\2\2\u0200\u0201\7q\2\2\u0201x\3\2\2\2\u0202\u0203"+
		"\7(\2\2\u0203z\3\2\2\2\u0204\u0205\7~\2\2\u0205|\3\2\2\2\u0206\u0207\7"+
		"A\2\2\u0207~\3\2\2\2\u0208\u0209\7<\2\2\u0209\u0080\3\2\2\2\u020a\u020b"+
		"\7]\2\2\u020b\u0082\3\2\2\2\u020c\u020d\7_\2\2\u020d\u0084\3\2\2\2\u020e"+
		"\u020f\7\60\2\2\u020f\u0086\3\2\2\2\u0210\u0211\7<\2\2\u0211\u0212\7?"+
		"\2\2\u0212\u0088\3\2\2\2\u0213\u0214\7$\2\2\u0214\u008a\3\2\2\2\u0215"+
		"\u0216\7*\2\2\u0216\u008c\3\2\2\2\u0217\u0218\7+\2\2\u0218\u008e\3\2\2"+
		"\2\u0219\u021a\7\61\2\2\u021a\u021b\7\61\2\2\u021b\u021f\3\2\2\2\u021c"+
		"\u021e\13\2\2\2\u021d\u021c\3\2\2\2\u021e\u0221\3\2\2\2\u021f\u0220\3"+
		"\2\2\2\u021f\u021d\3\2\2\2\u0220\u0223\3\2\2\2\u0221\u021f\3\2\2\2\u0222"+
		"\u0224\t\3\2\2\u0223\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\bH"+
		"\2\2\u0226\u0090\3\2\2\2\u0227\u0228\7\61\2\2\u0228\u0229\7,\2\2\u0229"+
		"\u022d\3\2\2\2\u022a\u022c\13\2\2\2\u022b\u022a\3\2\2\2\u022c\u022f\3"+
		"\2\2\2\u022d\u022e\3\2\2\2\u022d\u022b\3\2\2\2\u022e\u0230\3\2\2\2\u022f"+
		"\u022d\3\2\2\2\u0230\u0231\7,\2\2\u0231\u0232\7\61\2\2\u0232\u0233\3\2"+
		"\2\2\u0233\u0234\bI\2\2\u0234\u0092\3\2\2\2\u0235\u0236\7.\2\2\u0236\u0094"+
		"\3\2\2\2\u0237\u0238\7=\2\2\u0238\u0096\3\2\2\2\u0239\u0240\5\u0089E\2"+
		"\u023a\u023f\5Q)\2\u023b\u023f\5S*\2\u023c\u023f\5O(\2\u023d\u023f\t\4"+
		"\2\2\u023e\u023a\3\2\2\2\u023e\u023b\3\2\2\2\u023e\u023c\3\2\2\2\u023e"+
		"\u023d\3\2\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2"+
		"\2\2\u0241\u0243\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u0244\5\u0089E\2\u0244"+
		"\u0098\3\2\2\2\u0245\u0248\5Q)\2\u0246\u0248\5S*\2\u0247\u0245\3\2\2\2"+
		"\u0247\u0246\3\2\2\2\u0248\u024f\3\2\2\2\u0249\u024e\5Q)\2\u024a\u024e"+
		"\5S*\2\u024b\u024e\5O(\2\u024c\u024e\t\4\2\2\u024d\u0249\3\2\2\2\u024d"+
		"\u024a\3\2\2\2\u024d\u024b\3\2\2\2\u024d\u024c\3\2\2\2\u024e\u0251\3\2"+
		"\2\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u009a\3\2\2\2\u0251"+
		"\u024f\3\2\2\2\31\2\u01a4\u01ad\u01b1\u01b5\u01b7\u01bb\u01c0\u01c2\u01c5"+
		"\u01d0\u01d5\u01d7\u01dd\u01df\u021f\u0223\u022d\u023e\u0240\u0247\u024d"+
		"\u024f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}