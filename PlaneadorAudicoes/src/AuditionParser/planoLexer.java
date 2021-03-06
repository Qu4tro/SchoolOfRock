// Generated from C:/Users/patri/Documents/GitHub/SchoolOfRock/PlaneadorAudicoes/src/AuditionParser\plano.g4 by ANTLR 4.5.1
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
		T__9=10, T__10=11, T__11=12, IDA=13, IDP=14, IDO=15, ID=16, INT=17, WS=18, 
		STRING=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "IDA", "IDP", "IDO", "ID", "INT", "WS", "STRING"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Audicao'", "'Nome:'", "'Local:'", "'Data:'", "'Inicio:'", "'Duracao:'", 
		"';'", "'Alunos:'", "'Professores:'", "'Pecas:'", "'-'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "IDA", "IDP", "IDO", "ID", "INT", "WS", "STRING"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25\u00a5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\7\16z\n\16\f\16\16\16}\13\16\3\17\3\17\7\17\u0081\n\17\f\17\16\17"+
		"\u0084\13\17\3\20\3\20\7\20\u0088\n\20\f\20\16\20\u008b\13\20\3\21\3\21"+
		"\7\21\u008f\n\21\f\21\16\21\u0092\13\21\3\22\6\22\u0095\n\22\r\22\16\22"+
		"\u0096\3\23\3\23\3\23\3\23\3\24\3\24\7\24\u009f\n\24\f\24\16\24\u00a2"+
		"\13\24\3\24\3\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\6\7\2//\62;C\\aac|"+
		"\5\2C\\aac|\5\2\13\f\17\17\"\"\3\2$$\u00aa\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\3)\3\2\2\2\5\61\3\2\2\2\7\67\3\2\2\2\t>\3\2\2\2\13D\3\2\2\2\rL\3\2\2"+
		"\2\17U\3\2\2\2\21W\3\2\2\2\23_\3\2\2\2\25l\3\2\2\2\27s\3\2\2\2\31u\3\2"+
		"\2\2\33w\3\2\2\2\35~\3\2\2\2\37\u0085\3\2\2\2!\u008c\3\2\2\2#\u0094\3"+
		"\2\2\2%\u0098\3\2\2\2\'\u009c\3\2\2\2)*\7C\2\2*+\7w\2\2+,\7f\2\2,-\7k"+
		"\2\2-.\7e\2\2./\7c\2\2/\60\7q\2\2\60\4\3\2\2\2\61\62\7P\2\2\62\63\7q\2"+
		"\2\63\64\7o\2\2\64\65\7g\2\2\65\66\7<\2\2\66\6\3\2\2\2\678\7N\2\289\7"+
		"q\2\29:\7e\2\2:;\7c\2\2;<\7n\2\2<=\7<\2\2=\b\3\2\2\2>?\7F\2\2?@\7c\2\2"+
		"@A\7v\2\2AB\7c\2\2BC\7<\2\2C\n\3\2\2\2DE\7K\2\2EF\7p\2\2FG\7k\2\2GH\7"+
		"e\2\2HI\7k\2\2IJ\7q\2\2JK\7<\2\2K\f\3\2\2\2LM\7F\2\2MN\7w\2\2NO\7t\2\2"+
		"OP\7c\2\2PQ\7e\2\2QR\7c\2\2RS\7q\2\2ST\7<\2\2T\16\3\2\2\2UV\7=\2\2V\20"+
		"\3\2\2\2WX\7C\2\2XY\7n\2\2YZ\7w\2\2Z[\7p\2\2[\\\7q\2\2\\]\7u\2\2]^\7<"+
		"\2\2^\22\3\2\2\2_`\7R\2\2`a\7t\2\2ab\7q\2\2bc\7h\2\2cd\7g\2\2de\7u\2\2"+
		"ef\7u\2\2fg\7q\2\2gh\7t\2\2hi\7g\2\2ij\7u\2\2jk\7<\2\2k\24\3\2\2\2lm\7"+
		"R\2\2mn\7g\2\2no\7e\2\2op\7c\2\2pq\7u\2\2qr\7<\2\2r\26\3\2\2\2st\7/\2"+
		"\2t\30\3\2\2\2uv\7<\2\2v\32\3\2\2\2w{\7C\2\2xz\t\2\2\2yx\3\2\2\2z}\3\2"+
		"\2\2{y\3\2\2\2{|\3\2\2\2|\34\3\2\2\2}{\3\2\2\2~\u0082\7R\2\2\177\u0081"+
		"\t\2\2\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\36\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0089\7Q\2\2"+
		"\u0086\u0088\t\2\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a \3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u0090\t\3\2\2\u008d\u008f\t\2\2\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2"+
		"\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\"\3\2\2\2\u0092\u0090"+
		"\3\2\2\2\u0093\u0095\4\62;\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097$\3\2\2\2\u0098\u0099\t\4\2\2"+
		"\u0099\u009a\3\2\2\2\u009a\u009b\b\23\2\2\u009b&\3\2\2\2\u009c\u00a0\7"+
		"$\2\2\u009d\u009f\n\5\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a3\u00a4\7$\2\2\u00a4(\3\2\2\2\t\2{\u0082\u0089\u0090\u0096\u00a0"+
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