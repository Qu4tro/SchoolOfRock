// Generated from C:/Users/patri/Documents/GitHub/SchoolOfRock/PlaneadorAudicoes/src/AuditionParser\plano.g4 by ANTLR 4.5.1
package AuditionParser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class planoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, IDA=13, IDP=14, IDO=15, ID=16, INT=17, WS=18, 
		STRING=19;
	public static final int
		RULE_audicao = 0, RULE_plano = 1, RULE_atuacao = 2, RULE_aluno = 3, RULE_professor = 4, 
		RULE_peca = 5, RULE_nome = 6, RULE_local = 7, RULE_data = 8, RULE_hora = 9;
	public static final String[] ruleNames = {
		"audicao", "plano", "atuacao", "aluno", "professor", "peca", "nome", "local", 
		"data", "hora"
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

	@Override
	public String getGrammarFileName() { return "plano.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    DataInterface dataInterface = new DataInterface();
	    Audicao audition  = new Audicao();

	public planoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AudicaoContext extends ParserRuleContext {
		public Token IDA;
		public NomeContext nome;
		public LocalContext local;
		public DataContext data;
		public HoraContext hora;
		public TerminalNode IDA() { return getToken(planoParser.IDA, 0); }
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public LocalContext local() {
			return getRuleContext(LocalContext.class,0);
		}
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public List<HoraContext> hora() {
			return getRuleContexts(HoraContext.class);
		}
		public HoraContext hora(int i) {
			return getRuleContext(HoraContext.class,i);
		}
		public PlanoContext plano() {
			return getRuleContext(PlanoContext.class,0);
		}
		public AudicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_audicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof planoListener ) ((planoListener)listener).enterAudicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof planoListener ) ((planoListener)listener).exitAudicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof planoVisitor ) return ((planoVisitor<? extends T>)visitor).visitAudicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AudicaoContext audicao() throws RecognitionException {
		AudicaoContext _localctx = new AudicaoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_audicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(T__0);
			setState(21);
			((AudicaoContext)_localctx).IDA = match(IDA);
			audition.setId((((AudicaoContext)_localctx).IDA!=null?((AudicaoContext)_localctx).IDA.getText():null)); 
			setState(23);
			match(T__1);
			setState(24);
			((AudicaoContext)_localctx).nome = nome();
			audition.setLocal((((AudicaoContext)_localctx).nome!=null?_input.getText(((AudicaoContext)_localctx).nome.start,((AudicaoContext)_localctx).nome.stop):null));
			setState(26);
			match(T__2);
			setState(27);
			((AudicaoContext)_localctx).local = local();
			audition.setLocal((((AudicaoContext)_localctx).local!=null?_input.getText(((AudicaoContext)_localctx).local.start,((AudicaoContext)_localctx).local.stop):null));
			setState(29);
			match(T__3);
			setState(30);
			((AudicaoContext)_localctx).data = data();
			audition.setData(((AudicaoContext)_localctx).data.day, ((AudicaoContext)_localctx).data.month, ((AudicaoContext)_localctx).data.year);
			setState(32);
			match(T__4);
			setState(33);
			((AudicaoContext)_localctx).hora = hora();
			audition.setInicio(((AudicaoContext)_localctx).hora.hours, ((AudicaoContext)_localctx).hora.minutes);
			setState(35);
			match(T__5);
			setState(36);
			((AudicaoContext)_localctx).hora = hora();
			audition.setDuracao(((AudicaoContext)_localctx).hora.hours, ((AudicaoContext)_localctx).hora.minutes);
			setState(38);
			plano();
			dataInterface.addAudicao(audition);
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

	public static class PlanoContext extends ParserRuleContext {
		public AtuacaoContext a1;
		public AtuacaoContext a2;
		public List<AtuacaoContext> atuacao() {
			return getRuleContexts(AtuacaoContext.class);
		}
		public AtuacaoContext atuacao(int i) {
			return getRuleContext(AtuacaoContext.class,i);
		}
		public PlanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof planoListener ) ((planoListener)listener).enterPlano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof planoListener ) ((planoListener)listener).exitPlano(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof planoVisitor ) return ((planoVisitor<? extends T>)visitor).visitPlano(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlanoContext plano() throws RecognitionException {
		PlanoContext _localctx = new PlanoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_plano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			((PlanoContext)_localctx).a1 = atuacao();
			audition.addAtuacao(((PlanoContext)_localctx).a1.a);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(43);
				match(T__6);
				setState(44);
				((PlanoContext)_localctx).a2 = atuacao();
				audition.addAtuacao(((PlanoContext)_localctx).a2.a);
				}
				}
				setState(51);
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

	public static class AtuacaoContext extends ParserRuleContext {
		public Atuacao a;
		public NomeContext nome;
		public HoraContext hora;
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public HoraContext hora() {
			return getRuleContext(HoraContext.class,0);
		}
		public List<AlunoContext> aluno() {
			return getRuleContexts(AlunoContext.class);
		}
		public AlunoContext aluno(int i) {
			return getRuleContext(AlunoContext.class,i);
		}
		public List<ProfessorContext> professor() {
			return getRuleContexts(ProfessorContext.class);
		}
		public ProfessorContext professor(int i) {
			return getRuleContext(ProfessorContext.class,i);
		}
		public List<PecaContext> peca() {
			return getRuleContexts(PecaContext.class);
		}
		public PecaContext peca(int i) {
			return getRuleContext(PecaContext.class,i);
		}
		public AtuacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atuacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof planoListener ) ((planoListener)listener).enterAtuacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof planoListener ) ((planoListener)listener).exitAtuacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof planoVisitor ) return ((planoVisitor<? extends T>)visitor).visitAtuacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtuacaoContext atuacao() throws RecognitionException {
		AtuacaoContext _localctx = new AtuacaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atuacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			((AtuacaoContext)_localctx).nome = nome();
			((AtuacaoContext)_localctx).a =  new Atuacao(dataInterface, (((AtuacaoContext)_localctx).nome!=null?_input.getText(((AtuacaoContext)_localctx).nome.start,((AtuacaoContext)_localctx).nome.stop):null));
			setState(54);
			match(T__7);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDA) {
				{
				{
				setState(55);
				aluno(_localctx.a);
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			match(T__8);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDP) {
				{
				{
				setState(62);
				professor(_localctx.a);
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			match(T__9);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDO) {
				{
				{
				setState(69);
				peca(_localctx.a);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(T__5);
			setState(76);
			((AtuacaoContext)_localctx).hora = hora();
			_localctx.a.setDuracao(((AtuacaoContext)_localctx).hora.hours, ((AtuacaoContext)_localctx).hora.minutes);
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

	public static class AlunoContext extends ParserRuleContext {
		public Atuacao a;
		public Token IDA;
		public TerminalNode IDA() { return getToken(planoParser.IDA, 0); }
		public AlunoContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AlunoContext(ParserRuleContext parent, int invokingState, Atuacao a) {
			super(parent, invokingState);
			this.a = a;
		}
		@Override public int getRuleIndex() { return RULE_aluno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof planoListener ) ((planoListener)listener).enterAluno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof planoListener ) ((planoListener)listener).exitAluno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof planoVisitor ) return ((planoVisitor<? extends T>)visitor).visitAluno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlunoContext aluno(Atuacao a) throws RecognitionException {
		AlunoContext _localctx = new AlunoContext(_ctx, getState(), a);
		enterRule(_localctx, 6, RULE_aluno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			((AlunoContext)_localctx).IDA = match(IDA);
			 a.addAluno((((AlunoContext)_localctx).IDA!=null?((AlunoContext)_localctx).IDA.getText():null)); 
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

	public static class ProfessorContext extends ParserRuleContext {
		public Atuacao a;
		public Token IDP;
		public TerminalNode IDP() { return getToken(planoParser.IDP, 0); }
		public ProfessorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ProfessorContext(ParserRuleContext parent, int invokingState, Atuacao a) {
			super(parent, invokingState);
			this.a = a;
		}
		@Override public int getRuleIndex() { return RULE_professor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof planoListener ) ((planoListener)listener).enterProfessor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof planoListener ) ((planoListener)listener).exitProfessor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof planoVisitor ) return ((planoVisitor<? extends T>)visitor).visitProfessor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProfessorContext professor(Atuacao a) throws RecognitionException {
		ProfessorContext _localctx = new ProfessorContext(_ctx, getState(), a);
		enterRule(_localctx, 8, RULE_professor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			((ProfessorContext)_localctx).IDP = match(IDP);
			 a.addProfessor((((ProfessorContext)_localctx).IDP!=null?((ProfessorContext)_localctx).IDP.getText():null)); 
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

	public static class PecaContext extends ParserRuleContext {
		public Atuacao a;
		public Token IDO;
		public TerminalNode IDO() { return getToken(planoParser.IDO, 0); }
		public PecaContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PecaContext(ParserRuleContext parent, int invokingState, Atuacao a) {
			super(parent, invokingState);
			this.a = a;
		}
		@Override public int getRuleIndex() { return RULE_peca; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof planoListener ) ((planoListener)listener).enterPeca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof planoListener ) ((planoListener)listener).exitPeca(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof planoVisitor ) return ((planoVisitor<? extends T>)visitor).visitPeca(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PecaContext peca(Atuacao a) throws RecognitionException {
		PecaContext _localctx = new PecaContext(_ctx, getState(), a);
		enterRule(_localctx, 10, RULE_peca);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			((PecaContext)_localctx).IDO = match(IDO);
			 a.addPeca((((PecaContext)_localctx).IDO!=null?((PecaContext)_localctx).IDO.getText():null)); 
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

	public static class NomeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(planoParser.STRING, 0); }
		public NomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof planoListener ) ((planoListener)listener).enterNome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof planoListener ) ((planoListener)listener).exitNome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof planoVisitor ) return ((planoVisitor<? extends T>)visitor).visitNome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomeContext nome() throws RecognitionException {
		NomeContext _localctx = new NomeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(STRING);
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

	public static class LocalContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(planoParser.STRING, 0); }
		public LocalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof planoListener ) ((planoListener)listener).enterLocal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof planoListener ) ((planoListener)listener).exitLocal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof planoVisitor ) return ((planoVisitor<? extends T>)visitor).visitLocal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalContext local() throws RecognitionException {
		LocalContext _localctx = new LocalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_local);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(STRING);
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

	public static class DataContext extends ParserRuleContext {
		public int day;
		public int month;
		public int year;
		public Token d;
		public Token m;
		public Token y;
		public List<TerminalNode> INT() { return getTokens(planoParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(planoParser.INT, i);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof planoListener ) ((planoListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof planoListener ) ((planoListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof planoVisitor ) return ((planoVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			((DataContext)_localctx).d = match(INT);
			setState(93);
			match(T__10);
			setState(94);
			((DataContext)_localctx).m = match(INT);
			setState(95);
			match(T__10);
			setState(96);
			((DataContext)_localctx).y = match(INT);
			 ((DataContext)_localctx).day =  (((DataContext)_localctx).d!=null?Integer.valueOf(((DataContext)_localctx).d.getText()):0);
			                                     ((DataContext)_localctx).month =  (((DataContext)_localctx).m!=null?Integer.valueOf(((DataContext)_localctx).m.getText()):0);
			                                     ((DataContext)_localctx).year =  (((DataContext)_localctx).y!=null?Integer.valueOf(((DataContext)_localctx).y.getText()):0);
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

	public static class HoraContext extends ParserRuleContext {
		public int hours;
		public int minutes;
		public Token h;
		public Token m;
		public List<TerminalNode> INT() { return getTokens(planoParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(planoParser.INT, i);
		}
		public HoraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hora; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof planoListener ) ((planoListener)listener).enterHora(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof planoListener ) ((planoListener)listener).exitHora(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof planoVisitor ) return ((planoVisitor<? extends T>)visitor).visitHora(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HoraContext hora() throws RecognitionException {
		HoraContext _localctx = new HoraContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_hora);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			((HoraContext)_localctx).h = match(INT);
			setState(100);
			match(T__11);
			setState(101);
			((HoraContext)_localctx).m = match(INT);
			 ((HoraContext)_localctx).hours =  (((HoraContext)_localctx).h!=null?Integer.valueOf(((HoraContext)_localctx).h.getText()):0);
			                                   ((HoraContext)_localctx).minutes =  (((HoraContext)_localctx).m!=null?Integer.valueOf(((HoraContext)_localctx).m.getText()):0);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25k\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3\62\n\3\f\3\16\3\65\13\3\3\4\3"+
		"\4\3\4\3\4\7\4;\n\4\f\4\16\4>\13\4\3\4\3\4\7\4B\n\4\f\4\16\4E\13\4\3\4"+
		"\3\4\7\4I\n\4\f\4\16\4L\13\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\2d\2\26\3\2\2\2\4+\3\2"+
		"\2\2\6\66\3\2\2\2\bQ\3\2\2\2\nT\3\2\2\2\fW\3\2\2\2\16Z\3\2\2\2\20\\\3"+
		"\2\2\2\22^\3\2\2\2\24e\3\2\2\2\26\27\7\3\2\2\27\30\7\17\2\2\30\31\b\2"+
		"\1\2\31\32\7\4\2\2\32\33\5\16\b\2\33\34\b\2\1\2\34\35\7\5\2\2\35\36\5"+
		"\20\t\2\36\37\b\2\1\2\37 \7\6\2\2 !\5\22\n\2!\"\b\2\1\2\"#\7\7\2\2#$\5"+
		"\24\13\2$%\b\2\1\2%&\7\b\2\2&\'\5\24\13\2\'(\b\2\1\2()\5\4\3\2)*\b\2\1"+
		"\2*\3\3\2\2\2+,\5\6\4\2,\63\b\3\1\2-.\7\t\2\2./\5\6\4\2/\60\b\3\1\2\60"+
		"\62\3\2\2\2\61-\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\5"+
		"\3\2\2\2\65\63\3\2\2\2\66\67\5\16\b\2\678\b\4\1\28<\7\n\2\29;\5\b\5\2"+
		":9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?C\7\13\2"+
		"\2@B\5\n\6\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2"+
		"\2FJ\7\f\2\2GI\5\f\7\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2"+
		"\2LJ\3\2\2\2MN\7\b\2\2NO\5\24\13\2OP\b\4\1\2P\7\3\2\2\2QR\7\17\2\2RS\b"+
		"\5\1\2S\t\3\2\2\2TU\7\20\2\2UV\b\6\1\2V\13\3\2\2\2WX\7\21\2\2XY\b\7\1"+
		"\2Y\r\3\2\2\2Z[\7\25\2\2[\17\3\2\2\2\\]\7\25\2\2]\21\3\2\2\2^_\7\23\2"+
		"\2_`\7\r\2\2`a\7\23\2\2ab\7\r\2\2bc\7\23\2\2cd\b\n\1\2d\23\3\2\2\2ef\7"+
		"\23\2\2fg\7\16\2\2gh\7\23\2\2hi\b\13\1\2i\25\3\2\2\2\6\63<CJ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}