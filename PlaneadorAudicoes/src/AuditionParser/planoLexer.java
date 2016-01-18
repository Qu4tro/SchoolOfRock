// Generated from /home/quatro/IdeaProjects/PlaneadorAudicoes/src/AuditionParser/plano.g4 by ANTLR 4.5.1
package AuditionParser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class planoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, IDA=12, IDP=13, IDO=14, ID=15, INT=16, WS=17, STRING=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "IDA", "IDP", "IDO", "ID", "INT", "WS", "STRING"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Audição'", "'Local:'", "'Data:'", "'Início:'", "'Duração:'", "';'", 
		"'Alunos:'", "'Professores:'", "'Peças:'", "'-'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"IDA", "IDP", "IDO", "ID", "INT", "WS", "STRING"
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


	    DataInterface dataInterface = new DataInterface();
	    Audicao audition  = new Audicao();


	public planoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "plano.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24\u009d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\7\rr\n\r\f\r\16\ru\13\r\3\16\3\16\7"+
		"\16y\n\16\f\16\16\16|\13\16\3\17\3\17\7\17\u0080\n\17\f\17\16\17\u0083"+
		"\13\17\3\20\3\20\7\20\u0087\n\20\f\20\16\20\u008a\13\20\3\21\6\21\u008d"+
		"\n\21\r\21\16\21\u008e\3\22\3\22\3\22\3\22\3\23\3\23\7\23\u0097\n\23\f"+
		"\23\16\23\u009a\13\23\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\6\7\2//\62"+
		";C\\aac|\5\2C\\aac|\5\2\13\f\17\17\"\"\3\2$$\u00a2\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3"+
		"\2\2\2\5/\3\2\2\2\7\66\3\2\2\2\t<\3\2\2\2\13D\3\2\2\2\rM\3\2\2\2\17O\3"+
		"\2\2\2\21W\3\2\2\2\23d\3\2\2\2\25k\3\2\2\2\27m\3\2\2\2\31o\3\2\2\2\33"+
		"v\3\2\2\2\35}\3\2\2\2\37\u0084\3\2\2\2!\u008c\3\2\2\2#\u0090\3\2\2\2%"+
		"\u0094\3\2\2\2\'(\7C\2\2()\7w\2\2)*\7f\2\2*+\7k\2\2+,\7\u00e9\2\2,-\7"+
		"\u00e5\2\2-.\7q\2\2.\4\3\2\2\2/\60\7N\2\2\60\61\7q\2\2\61\62\7e\2\2\62"+
		"\63\7c\2\2\63\64\7n\2\2\64\65\7<\2\2\65\6\3\2\2\2\66\67\7F\2\2\678\7c"+
		"\2\289\7v\2\29:\7c\2\2:;\7<\2\2;\b\3\2\2\2<=\7K\2\2=>\7p\2\2>?\7\u00ef"+
		"\2\2?@\7e\2\2@A\7k\2\2AB\7q\2\2BC\7<\2\2C\n\3\2\2\2DE\7F\2\2EF\7w\2\2"+
		"FG\7t\2\2GH\7c\2\2HI\7\u00e9\2\2IJ\7\u00e5\2\2JK\7q\2\2KL\7<\2\2L\f\3"+
		"\2\2\2MN\7=\2\2N\16\3\2\2\2OP\7C\2\2PQ\7n\2\2QR\7w\2\2RS\7p\2\2ST\7q\2"+
		"\2TU\7u\2\2UV\7<\2\2V\20\3\2\2\2WX\7R\2\2XY\7t\2\2YZ\7q\2\2Z[\7h\2\2["+
		"\\\7g\2\2\\]\7u\2\2]^\7u\2\2^_\7q\2\2_`\7t\2\2`a\7g\2\2ab\7u\2\2bc\7<"+
		"\2\2c\22\3\2\2\2de\7R\2\2ef\7g\2\2fg\7\u00e9\2\2gh\7c\2\2hi\7u\2\2ij\7"+
		"<\2\2j\24\3\2\2\2kl\7/\2\2l\26\3\2\2\2mn\7<\2\2n\30\3\2\2\2os\7c\2\2p"+
		"r\t\2\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\32\3\2\2\2us\3\2\2"+
		"\2vz\7r\2\2wy\t\2\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\34\3\2"+
		"\2\2|z\3\2\2\2}\u0081\7q\2\2~\u0080\t\2\2\2\177~\3\2\2\2\u0080\u0083\3"+
		"\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\36\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0084\u0088\t\3\2\2\u0085\u0087\t\2\2\2\u0086\u0085\3\2\2\2\u0087"+
		"\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089 \3\2\2\2"+
		"\u008a\u0088\3\2\2\2\u008b\u008d\4\62;\2\u008c\u008b\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\"\3\2\2\2\u0090"+
		"\u0091\t\4\2\2\u0091\u0092\3\2\2\2\u0092\u0093\b\22\2\2\u0093$\3\2\2\2"+
		"\u0094\u0098\7$\2\2\u0095\u0097\n\5\2\2\u0096\u0095\3\2\2\2\u0097\u009a"+
		"\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009b\u009c\7$\2\2\u009c&\3\2\2\2\t\2sz\u0081\u0088\u008e"+
		"\u0098\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}