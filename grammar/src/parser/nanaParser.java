// Generated from nana.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class nanaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, NEWLINE=47, WS=48, IDENT=49, INT=50, DEC=51, STRING=52, OPERADOR_ARITMETICO=53, 
		OPERADOR_LOGICO=54, TRUE=55, FALSE=56, COMMENT=57;
	public static final int
		RULE_programa = 0, RULE_bloco = 1, RULE_linha = 2, RULE_declaracao = 3, 
		RULE_varnana_decl = 4, RULE_constn_decl = 5, RULE_troca_tipo = 6, RULE_expressao = 7, 
		RULE_funcao_chamada = 8, RULE_args = 9, RULE_controle = 10, RULE_condicional = 11, 
		RULE_loop = 12, RULE_funcao_def = 13, RULE_parametros = 14, RULE_tratamento_erro = 15, 
		RULE_importacao = 16, RULE_comentario = 17, RULE_valor = 18, RULE_lista = 19, 
		RULE_dicionario = 20, RULE_setc = 21, RULE_tipo = 22, RULE_operador_aritmetico = 23, 
		RULE_operador_logico = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "bloco", "linha", "declaracao", "varnana_decl", "constn_decl", 
			"troca_tipo", "expressao", "funcao_chamada", "args", "controle", "condicional", 
			"loop", "funcao_def", "parametros", "tratamento_erro", "importacao", 
			"comentario", "valor", "lista", "dicionario", "setc", "tipo", "operador_aritmetico", 
			"operador_logico"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'varnana'", "'='", "'constn'", "'ntroca'", "'para'", "'('", "')'", 
			"','", "'nanase'", "':'", "'nanasenao'", "'nanaenqt'", "'nanaget'", "'em'", 
			"'nanaf'", "'nanatente'", "'nanaerro'", "'nanasemerro'", "'nanafinal'", 
			"'nanapackage'", "'de'", "'busque'", "'<n'", "'n>'", "'nanalista'", "'nanadicio'", 
			"'nanaset'", "'intn'", "'decn'", "'letn'", "'stgn'", "'boon'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", 
			"'e'", "'ou'", "'nao'", null, null, null, null, null, null, null, null, 
			"'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "NEWLINE", 
			"WS", "IDENT", "INT", "DEC", "STRING", "OPERADOR_ARITMETICO", "OPERADOR_LOGICO", 
			"TRUE", "FALSE", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "nana.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public nanaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode EOF() { return getToken(nanaParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			bloco();
			setState(51);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ParserRuleContext {
		public List<LinhaContext> linha() {
			return getRuleContexts(LinhaContext.class);
		}
		public LinhaContext linha(int i) {
			return getRuleContext(LinhaContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(53);
					linha();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(56); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class LinhaContext extends ParserRuleContext {
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ControleContext controle() {
			return getRuleContext(ControleContext.class,0);
		}
		public Funcao_defContext funcao_def() {
			return getRuleContext(Funcao_defContext.class,0);
		}
		public Tratamento_erroContext tratamento_erro() {
			return getRuleContext(Tratamento_erroContext.class,0);
		}
		public ImportacaoContext importacao() {
			return getRuleContext(ImportacaoContext.class,0);
		}
		public ComentarioContext comentario() {
			return getRuleContext(ComentarioContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(nanaParser.NEWLINE, 0); }
		public LinhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).enterLinha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).exitLinha(this);
		}
	}

	public final LinhaContext linha() throws RecognitionException {
		LinhaContext _localctx = new LinhaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_linha);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				declaracao();
				}
				break;
			case T__5:
			case T__24:
			case T__25:
			case T__26:
			case IDENT:
			case INT:
			case DEC:
			case STRING:
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				expressao(0);
				}
				break;
			case T__8:
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				controle();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				funcao_def();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				tratamento_erro();
				}
				break;
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 6);
				{
				setState(63);
				importacao();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 7);
				{
				setState(64);
				comentario();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 8);
				{
				setState(65);
				match(NEWLINE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoContext extends ParserRuleContext {
		public Varnana_declContext varnana_decl() {
			return getRuleContext(Varnana_declContext.class,0);
		}
		public Constn_declContext constn_decl() {
			return getRuleContext(Constn_declContext.class,0);
		}
		public Troca_tipoContext troca_tipo() {
			return getRuleContext(Troca_tipoContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				varnana_decl();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				constn_decl();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				troca_tipo();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Varnana_declContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(nanaParser.IDENT, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(nanaParser.NEWLINE, 0); }
		public Varnana_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varnana_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).enterVarnana_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).exitVarnana_decl(this);
		}
	}

	public final Varnana_declContext varnana_decl() throws RecognitionException {
		Varnana_declContext _localctx = new Varnana_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varnana_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__0);
			setState(74);
			match(IDENT);
			setState(75);
			match(T__1);
			setState(76);
			expressao(0);
			setState(77);
			match(NEWLINE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Constn_declContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(nanaParser.IDENT, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(nanaParser.NEWLINE, 0); }
		public Constn_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constn_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).enterConstn_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).exitConstn_decl(this);
		}
	}

	public final Constn_declContext constn_decl() throws RecognitionException {
		Constn_declContext _localctx = new Constn_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constn_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__2);
			setState(80);
			match(IDENT);
			setState(81);
			match(T__1);
			setState(82);
			expressao(0);
			setState(83);
			match(NEWLINE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Troca_tipoContext extends ParserRuleContext {
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(nanaParser.NEWLINE, 0); }
		public Troca_tipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_troca_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).enterTroca_tipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).exitTroca_tipo(this);
		}
	}

	public final Troca_tipoContext troca_tipo() throws RecognitionException {
		Troca_tipoContext _localctx = new Troca_tipoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_troca_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__3);
			setState(86);
			tipo();
			setState(87);
			match(T__4);
			setState(88);
			tipo();
			setState(89);
			match(NEWLINE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public Funcao_chamadaContext funcao_chamada() {
			return getRuleContext(Funcao_chamadaContext.class,0);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(nanaParser.IDENT, 0); }
		public Operador_aritmeticoContext operador_aritmetico() {
			return getRuleContext(Operador_aritmeticoContext.class,0);
		}
		public Operador_logicoContext operador_logico() {
			return getRuleContext(Operador_logicoContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expressao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(92);
				match(T__5);
				setState(93);
				expressao(0);
				setState(94);
				match(T__6);
				}
				break;
			case 2:
				{
				setState(96);
				funcao_chamada();
				}
				break;
			case 3:
				{
				setState(97);
				valor();
				}
				break;
			case 4:
				{
				setState(98);
				match(IDENT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(109);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(101);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(102);
						operador_aritmetico();
						setState(103);
						expressao(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(105);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(106);
						operador_logico();
						setState(107);
						expressao(6);
						}
						break;
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Funcao_chamadaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(nanaParser.IDENT, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Funcao_chamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao_chamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).enterFuncao_chamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).exitFuncao_chamada(this);
		}
	}

	public final Funcao_chamadaContext funcao_chamada() throws RecognitionException {
		Funcao_chamadaContext _localctx = new Funcao_chamadaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcao_chamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(IDENT);
			setState(115);
			match(T__5);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 116530640593092672L) != 0)) {
				{
				setState(116);
				args();
				}
			}

			setState(119);
			match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			expressao(0);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(122);
				match(T__7);
				setState(123);
				expressao(0);
				}
				}
				setState(128);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ControleContext extends ParserRuleContext {
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public ControleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).enterControle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).exitControle(this);
		}
	}

	public final ControleContext controle() throws RecognitionException {
		ControleContext _localctx = new ControleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_controle);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				condicional();
				}
				break;
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				loop();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__8);
			setState(134);
			expressao(0);
			setState(135);
			match(T__9);
			setState(136);
			bloco();
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(137);
				match(T__10);
				setState(138);
				match(T__9);
				setState(139);
				bloco();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(nanaParser.IDENT, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_loop);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(T__11);
				setState(143);
				expressao(0);
				setState(144);
				match(T__9);
				setState(145);
				bloco();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(T__12);
				setState(148);
				match(IDENT);
				setState(149);
				match(T__13);
				setState(150);
				expressao(0);
				setState(151);
				match(T__9);
				setState(152);
				bloco();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Funcao_defContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(nanaParser.IDENT, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public Funcao_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).enterFuncao_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).exitFuncao_def(this);
		}
	}

	public final Funcao_defContext funcao_def() throws RecognitionException {
		Funcao_defContext _localctx = new Funcao_defContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funcao_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__14);
			setState(157);
			match(IDENT);
			setState(158);
			match(T__5);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(159);
				parametros();
				}
			}

			setState(162);
			match(T__6);
			setState(163);
			match(T__9);
			setState(164);
			bloco();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(nanaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(nanaParser.IDENT, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(IDENT);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(167);
				match(T__7);
				setState(168);
				match(IDENT);
				}
				}
				setState(173);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tratamento_erroContext extends ParserRuleContext {
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public Tratamento_erroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tratamento_erro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).enterTratamento_erro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).exitTratamento_erro(this);
		}
	}

	public final Tratamento_erroContext tratamento_erro() throws RecognitionException {
		Tratamento_erroContext _localctx = new Tratamento_erroContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tratamento_erro);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__15);
			setState(175);
			match(T__9);
			setState(176);
			bloco();
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(177);
					match(T__16);
					setState(178);
					tipo();
					setState(179);
					match(T__9);
					setState(180);
					bloco();
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(187);
				match(T__16);
				setState(188);
				match(T__9);
				setState(189);
				bloco();
				}
				break;
			}
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(192);
				match(T__17);
				setState(193);
				match(T__9);
				setState(194);
				bloco();
				}
				break;
			}
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(197);
				match(T__18);
				setState(198);
				match(T__9);
				setState(199);
				bloco();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportacaoContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(nanaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(nanaParser.IDENT, i);
		}
		public TerminalNode NEWLINE() { return getToken(nanaParser.NEWLINE, 0); }
		public ImportacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).enterImportacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).exitImportacao(this);
		}
	}

	public final ImportacaoContext importacao() throws RecognitionException {
		ImportacaoContext _localctx = new ImportacaoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_importacao);
		int _la;
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(T__19);
				setState(203);
				match(IDENT);
				setState(204);
				match(NEWLINE);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(T__20);
				setState(206);
				match(IDENT);
				setState(207);
				match(T__21);
				setState(208);
				match(IDENT);
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(209);
					match(T__7);
					setState(210);
					match(IDENT);
					}
					}
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(216);
				match(NEWLINE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComentarioContext extends ParserRuleContext {
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).enterComentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).exitComentario(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comentario);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(T__22);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(220);
					matchWildcard();
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(226);
			match(T__23);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValorContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(nanaParser.INT, 0); }
		public TerminalNode DEC() { return getToken(nanaParser.DEC, 0); }
		public TerminalNode STRING() { return getToken(nanaParser.STRING, 0); }
		public TerminalNode TRUE() { return getToken(nanaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(nanaParser.FALSE, 0); }
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public DicionarioContext dicionario() {
			return getRuleContext(DicionarioContext.class,0);
		}
		public SetcContext setc() {
			return getRuleContext(SetcContext.class,0);
		}
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).exitValor(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_valor);
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(INT);
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(DEC);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				match(STRING);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				match(FALSE);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 6);
				{
				setState(233);
				lista();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 7);
				{
				setState(234);
				dicionario();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 8);
				{
				setState(235);
				setc();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).enterLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).exitLista(this);
		}
	}

	public final ListaContext lista() throws RecognitionException {
		ListaContext _localctx = new ListaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__24);
			setState(239);
			match(T__5);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 116530640593092672L) != 0)) {
				{
				setState(240);
				expressao(0);
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(241);
					match(T__7);
					setState(242);
					expressao(0);
					}
					}
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(250);
			match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DicionarioContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(nanaParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(nanaParser.STRING, i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public DicionarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dicionario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).enterDicionario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).exitDicionario(this);
		}
	}

	public final DicionarioContext dicionario() throws RecognitionException {
		DicionarioContext _localctx = new DicionarioContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dicionario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__25);
			setState(253);
			match(T__5);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(254);
				match(STRING);
				setState(255);
				match(T__9);
				setState(256);
				expressao(0);
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(257);
					match(T__7);
					setState(258);
					match(STRING);
					setState(259);
					match(T__9);
					setState(260);
					expressao(0);
					}
					}
					setState(265);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(268);
			match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SetcContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public SetcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).enterSetc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).exitSetc(this);
		}
	}

	public final SetcContext setc() throws RecognitionException {
		SetcContext _localctx = new SetcContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_setc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(T__26);
			setState(271);
			match(T__5);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 116530640593092672L) != 0)) {
				{
				setState(272);
				expressao(0);
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(273);
					match(T__7);
					setState(274);
					expressao(0);
					}
					}
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(282);
			match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8321499136L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Operador_aritmeticoContext extends ParserRuleContext {
		public Operador_aritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_aritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).enterOperador_aritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).exitOperador_aritmetico(this);
		}
	}

	public final Operador_aritmeticoContext operador_aritmetico() throws RecognitionException {
		Operador_aritmeticoContext _localctx = new Operador_aritmeticoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_operador_aritmetico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 266287972352L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Operador_logicoContext extends ParserRuleContext {
		public Operador_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).enterOperador_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nanaListener ) ((nanaListener)listener).exitOperador_logico(this);
		}
	}

	public final Operador_logicoContext operador_logico() throws RecognitionException {
		Operador_logicoContext _localctx = new Operador_logicoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_operador_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 140462610448384L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00019\u0123\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u00017\b\u0001"+
		"\u000b\u0001\f\u00018\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002C\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003H\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007d\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"n\b\u0007\n\u0007\f\u0007q\t\u0007\u0001\b\u0001\b\u0001\b\u0003\bv\b"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t}\b\t\n\t\f\t\u0080"+
		"\t\t\u0001\n\u0001\n\u0003\n\u0084\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u008d\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u009b\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00a1\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u00aa\b\u000e\n\u000e\f\u000e\u00ad\t\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u00b7\b\u000f\n\u000f\f\u000f\u00ba"+
		"\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00bf\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00c4\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00c9\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u00d4\b\u0010\n\u0010\f\u0010\u00d7\t\u0010\u0001"+
		"\u0010\u0003\u0010\u00da\b\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u00de"+
		"\b\u0011\n\u0011\f\u0011\u00e1\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u00ed\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u00f4\b\u0013\n\u0013\f\u0013\u00f7"+
		"\t\u0013\u0003\u0013\u00f9\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u0106\b\u0014\n\u0014\f\u0014\u0109"+
		"\t\u0014\u0003\u0014\u010b\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0114\b\u0015"+
		"\n\u0015\f\u0015\u0117\t\u0015\u0003\u0015\u0119\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u00df\u0001\u000e\u0019\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"0\u0000\u0003\u0001\u0000\u001c \u0001\u0000!%\u0001\u0000&.\u0133\u0000"+
		"2\u0001\u0000\u0000\u0000\u00026\u0001\u0000\u0000\u0000\u0004B\u0001"+
		"\u0000\u0000\u0000\u0006G\u0001\u0000\u0000\u0000\bI\u0001\u0000\u0000"+
		"\u0000\nO\u0001\u0000\u0000\u0000\fU\u0001\u0000\u0000\u0000\u000ec\u0001"+
		"\u0000\u0000\u0000\u0010r\u0001\u0000\u0000\u0000\u0012y\u0001\u0000\u0000"+
		"\u0000\u0014\u0083\u0001\u0000\u0000\u0000\u0016\u0085\u0001\u0000\u0000"+
		"\u0000\u0018\u009a\u0001\u0000\u0000\u0000\u001a\u009c\u0001\u0000\u0000"+
		"\u0000\u001c\u00a6\u0001\u0000\u0000\u0000\u001e\u00ae\u0001\u0000\u0000"+
		"\u0000 \u00d9\u0001\u0000\u0000\u0000\"\u00db\u0001\u0000\u0000\u0000"+
		"$\u00ec\u0001\u0000\u0000\u0000&\u00ee\u0001\u0000\u0000\u0000(\u00fc"+
		"\u0001\u0000\u0000\u0000*\u010e\u0001\u0000\u0000\u0000,\u011c\u0001\u0000"+
		"\u0000\u0000.\u011e\u0001\u0000\u0000\u00000\u0120\u0001\u0000\u0000\u0000"+
		"23\u0003\u0002\u0001\u000034\u0005\u0000\u0000\u00014\u0001\u0001\u0000"+
		"\u0000\u000057\u0003\u0004\u0002\u000065\u0001\u0000\u0000\u000078\u0001"+
		"\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u0000"+
		"9\u0003\u0001\u0000\u0000\u0000:C\u0003\u0006\u0003\u0000;C\u0003\u000e"+
		"\u0007\u0000<C\u0003\u0014\n\u0000=C\u0003\u001a\r\u0000>C\u0003\u001e"+
		"\u000f\u0000?C\u0003 \u0010\u0000@C\u0003\"\u0011\u0000AC\u0005/\u0000"+
		"\u0000B:\u0001\u0000\u0000\u0000B;\u0001\u0000\u0000\u0000B<\u0001\u0000"+
		"\u0000\u0000B=\u0001\u0000\u0000\u0000B>\u0001\u0000\u0000\u0000B?\u0001"+
		"\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000"+
		"C\u0005\u0001\u0000\u0000\u0000DH\u0003\b\u0004\u0000EH\u0003\n\u0005"+
		"\u0000FH\u0003\f\u0006\u0000GD\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000GF\u0001\u0000\u0000\u0000H\u0007\u0001\u0000\u0000\u0000IJ\u0005"+
		"\u0001\u0000\u0000JK\u00051\u0000\u0000KL\u0005\u0002\u0000\u0000LM\u0003"+
		"\u000e\u0007\u0000MN\u0005/\u0000\u0000N\t\u0001\u0000\u0000\u0000OP\u0005"+
		"\u0003\u0000\u0000PQ\u00051\u0000\u0000QR\u0005\u0002\u0000\u0000RS\u0003"+
		"\u000e\u0007\u0000ST\u0005/\u0000\u0000T\u000b\u0001\u0000\u0000\u0000"+
		"UV\u0005\u0004\u0000\u0000VW\u0003,\u0016\u0000WX\u0005\u0005\u0000\u0000"+
		"XY\u0003,\u0016\u0000YZ\u0005/\u0000\u0000Z\r\u0001\u0000\u0000\u0000"+
		"[\\\u0006\u0007\uffff\uffff\u0000\\]\u0005\u0006\u0000\u0000]^\u0003\u000e"+
		"\u0007\u0000^_\u0005\u0007\u0000\u0000_d\u0001\u0000\u0000\u0000`d\u0003"+
		"\u0010\b\u0000ad\u0003$\u0012\u0000bd\u00051\u0000\u0000c[\u0001\u0000"+
		"\u0000\u0000c`\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cb\u0001"+
		"\u0000\u0000\u0000do\u0001\u0000\u0000\u0000ef\n\u0006\u0000\u0000fg\u0003"+
		".\u0017\u0000gh\u0003\u000e\u0007\u0007hn\u0001\u0000\u0000\u0000ij\n"+
		"\u0005\u0000\u0000jk\u00030\u0018\u0000kl\u0003\u000e\u0007\u0006ln\u0001"+
		"\u0000\u0000\u0000me\u0001\u0000\u0000\u0000mi\u0001\u0000\u0000\u0000"+
		"nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000p\u000f\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000rs\u0005"+
		"1\u0000\u0000su\u0005\u0006\u0000\u0000tv\u0003\u0012\t\u0000ut\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"wx\u0005\u0007\u0000\u0000x\u0011\u0001\u0000\u0000\u0000y~\u0003\u000e"+
		"\u0007\u0000z{\u0005\b\u0000\u0000{}\u0003\u000e\u0007\u0000|z\u0001\u0000"+
		"\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000"+
		"~\u007f\u0001\u0000\u0000\u0000\u007f\u0013\u0001\u0000\u0000\u0000\u0080"+
		"~\u0001\u0000\u0000\u0000\u0081\u0084\u0003\u0016\u000b\u0000\u0082\u0084"+
		"\u0003\u0018\f\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0015\u0001\u0000\u0000\u0000\u0085\u0086\u0005"+
		"\t\u0000\u0000\u0086\u0087\u0003\u000e\u0007\u0000\u0087\u0088\u0005\n"+
		"\u0000\u0000\u0088\u008c\u0003\u0002\u0001\u0000\u0089\u008a\u0005\u000b"+
		"\u0000\u0000\u008a\u008b\u0005\n\u0000\u0000\u008b\u008d\u0003\u0002\u0001"+
		"\u0000\u008c\u0089\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d\u0017\u0001\u0000\u0000\u0000\u008e\u008f\u0005\f\u0000\u0000"+
		"\u008f\u0090\u0003\u000e\u0007\u0000\u0090\u0091\u0005\n\u0000\u0000\u0091"+
		"\u0092\u0003\u0002\u0001\u0000\u0092\u009b\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0005\r\u0000\u0000\u0094\u0095\u00051\u0000\u0000\u0095\u0096"+
		"\u0005\u000e\u0000\u0000\u0096\u0097\u0003\u000e\u0007\u0000\u0097\u0098"+
		"\u0005\n\u0000\u0000\u0098\u0099\u0003\u0002\u0001\u0000\u0099\u009b\u0001"+
		"\u0000\u0000\u0000\u009a\u008e\u0001\u0000\u0000\u0000\u009a\u0093\u0001"+
		"\u0000\u0000\u0000\u009b\u0019\u0001\u0000\u0000\u0000\u009c\u009d\u0005"+
		"\u000f\u0000\u0000\u009d\u009e\u00051\u0000\u0000\u009e\u00a0\u0005\u0006"+
		"\u0000\u0000\u009f\u00a1\u0003\u001c\u000e\u0000\u00a0\u009f\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0005\u0007\u0000\u0000\u00a3\u00a4\u0005\n\u0000"+
		"\u0000\u00a4\u00a5\u0003\u0002\u0001\u0000\u00a5\u001b\u0001\u0000\u0000"+
		"\u0000\u00a6\u00ab\u00051\u0000\u0000\u00a7\u00a8\u0005\b\u0000\u0000"+
		"\u00a8\u00aa\u00051\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ac\u001d\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u0010\u0000\u0000\u00af"+
		"\u00b0\u0005\n\u0000\u0000\u00b0\u00b8\u0003\u0002\u0001\u0000\u00b1\u00b2"+
		"\u0005\u0011\u0000\u0000\u00b2\u00b3\u0003,\u0016\u0000\u00b3\u00b4\u0005"+
		"\n\u0000\u0000\u00b4\u00b5\u0003\u0002\u0001\u0000\u00b5\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b1\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b9\u00be\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0005\u0011\u0000\u0000\u00bc\u00bd\u0005\n\u0000"+
		"\u0000\u00bd\u00bf\u0003\u0002\u0001\u0000\u00be\u00bb\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0005\u0012\u0000\u0000\u00c1\u00c2\u0005\n\u0000\u0000"+
		"\u00c2\u00c4\u0003\u0002\u0001\u0000\u00c3\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0005\u0013\u0000\u0000\u00c6\u00c7\u0005\n\u0000\u0000\u00c7"+
		"\u00c9\u0003\u0002\u0001\u0000\u00c8\u00c5\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c9\u001f\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0005\u0014\u0000\u0000\u00cb\u00cc\u00051\u0000\u0000\u00cc\u00da"+
		"\u0005/\u0000\u0000\u00cd\u00ce\u0005\u0015\u0000\u0000\u00ce\u00cf\u0005"+
		"1\u0000\u0000\u00cf\u00d0\u0005\u0016\u0000\u0000\u00d0\u00d5\u00051\u0000"+
		"\u0000\u00d1\u00d2\u0005\b\u0000\u0000\u00d2\u00d4\u00051\u0000\u0000"+
		"\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d8\u00da\u0005/\u0000\u0000\u00d9\u00ca\u0001\u0000\u0000\u0000\u00d9"+
		"\u00cd\u0001\u0000\u0000\u0000\u00da!\u0001\u0000\u0000\u0000\u00db\u00df"+
		"\u0005\u0017\u0000\u0000\u00dc\u00de\t\u0000\u0000\u0000\u00dd\u00dc\u0001"+
		"\u0000\u0000\u0000\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00e0\u0001"+
		"\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005"+
		"\u0018\u0000\u0000\u00e3#\u0001\u0000\u0000\u0000\u00e4\u00ed\u00052\u0000"+
		"\u0000\u00e5\u00ed\u00053\u0000\u0000\u00e6\u00ed\u00054\u0000\u0000\u00e7"+
		"\u00ed\u00057\u0000\u0000\u00e8\u00ed\u00058\u0000\u0000\u00e9\u00ed\u0003"+
		"&\u0013\u0000\u00ea\u00ed\u0003(\u0014\u0000\u00eb\u00ed\u0003*\u0015"+
		"\u0000\u00ec\u00e4\u0001\u0000\u0000\u0000\u00ec\u00e5\u0001\u0000\u0000"+
		"\u0000\u00ec\u00e6\u0001\u0000\u0000\u0000\u00ec\u00e7\u0001\u0000\u0000"+
		"\u0000\u00ec\u00e8\u0001\u0000\u0000\u0000\u00ec\u00e9\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00eb\u0001\u0000\u0000"+
		"\u0000\u00ed%\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005\u0019\u0000\u0000"+
		"\u00ef\u00f8\u0005\u0006\u0000\u0000\u00f0\u00f5\u0003\u000e\u0007\u0000"+
		"\u00f1\u00f2\u0005\b\u0000\u0000\u00f2\u00f4\u0003\u000e\u0007\u0000\u00f3"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f9\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005\u0007\u0000\u0000\u00fb"+
		"\'\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005\u001a\u0000\u0000\u00fd\u010a"+
		"\u0005\u0006\u0000\u0000\u00fe\u00ff\u00054\u0000\u0000\u00ff\u0100\u0005"+
		"\n\u0000\u0000\u0100\u0107\u0003\u000e\u0007\u0000\u0101\u0102\u0005\b"+
		"\u0000\u0000\u0102\u0103\u00054\u0000\u0000\u0103\u0104\u0005\n\u0000"+
		"\u0000\u0104\u0106\u0003\u000e\u0007\u0000\u0105\u0101\u0001\u0000\u0000"+
		"\u0000\u0106\u0109\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000"+
		"\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000"+
		"\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u010a\u00fe\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000"+
		"\u0000\u010c\u010d\u0005\u0007\u0000\u0000\u010d)\u0001\u0000\u0000\u0000"+
		"\u010e\u010f\u0005\u001b\u0000\u0000\u010f\u0118\u0005\u0006\u0000\u0000"+
		"\u0110\u0115\u0003\u000e\u0007\u0000\u0111\u0112\u0005\b\u0000\u0000\u0112"+
		"\u0114\u0003\u000e\u0007\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0114"+
		"\u0117\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0001\u0000\u0000\u0000\u0116\u0119\u0001\u0000\u0000\u0000\u0117"+
		"\u0115\u0001\u0000\u0000\u0000\u0118\u0110\u0001\u0000\u0000\u0000\u0118"+
		"\u0119\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u0005\u0007\u0000\u0000\u011b+\u0001\u0000\u0000\u0000\u011c\u011d"+
		"\u0007\u0000\u0000\u0000\u011d-\u0001\u0000\u0000\u0000\u011e\u011f\u0007"+
		"\u0001\u0000\u0000\u011f/\u0001\u0000\u0000\u0000\u0120\u0121\u0007\u0002"+
		"\u0000\u0000\u01211\u0001\u0000\u0000\u0000\u001b8BGcmou~\u0083\u008c"+
		"\u009a\u00a0\u00ab\u00b8\u00be\u00c3\u00c8\u00d5\u00d9\u00df\u00ec\u00f5"+
		"\u00f8\u0107\u010a\u0115\u0118";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}