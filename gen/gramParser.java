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
		TK_PC_FUNCIO=6, TK_PC_FFUNCIO=7, TK_PC_CONSTANTS=8, TK_PC_FCONSTANTS=9, 
		TK_PC_VARIABLES=10, TK_PC_FVARIABLES=11, TK_PC_TIPUS=12, TK_PC_FTIPUS=13, 
		TK_PC_SI=14, TK_PC_ALTRAMENT=15, TK_PC_FSI=16, TK_PC_PER=17, TK_PC_DE=18, 
		TK_PC_FINS=19, TK_PC_FER=20, TK_PC_FPER=21, TK_PC_MENTRE=22, TK_PC_FMENTRE=23, 
		TK_CONST_CHAR=24;
	public static final int
		RULE_inici = 0;
	public static final String[] ruleNames = {
		"inici"
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
		"TK_PC_FER", "TK_PC_FPER", "TK_PC_MENTRE", "TK_PC_FMENTRE", "TK_CONST_CHAR"
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
			setState(3); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2);
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
				setState(5); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_WS) | (1L << TK_PC_PROGRAMA) | (1L << TK_PC_FPROGRAMA) | (1L << TK_PC_ACCIO) | (1L << TK_PC_FACCIO) | (1L << TK_PC_FUNCIO) | (1L << TK_PC_FFUNCIO) | (1L << TK_PC_CONSTANTS) | (1L << TK_PC_FCONSTANTS) | (1L << TK_PC_VARIABLES) | (1L << TK_PC_FVARIABLES) | (1L << TK_PC_TIPUS) | (1L << TK_PC_FTIPUS) | (1L << TK_PC_SI) | (1L << TK_PC_ALTRAMENT) | (1L << TK_PC_FSI) | (1L << TK_PC_PER) | (1L << TK_PC_DE) | (1L << TK_PC_FINS) | (1L << TK_PC_FER) | (1L << TK_PC_FPER) | (1L << TK_PC_MENTRE) | (1L << TK_PC_FMENTRE) | (1L << TK_CONST_CHAR))) != 0) );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\n\4\2\t\2\3\2"+
		"\6\2\6\n\2\r\2\16\2\7\3\2\2\2\3\2\2\3\2\3\2\t\2\5\3\2\2\2\4\6\n\2\2\2"+
		"\5\4\3\2\2\2\6\7\3\2\2\2\7\5\3\2\2\2\7\b\3\2\2\2\b\3\3\2\2\2\3\7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}