// Generated from experiment.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class experimentParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, NEWLINE=59, 
		ID=60, NUM_INT=61, NUM_DEC=62, TEXTO=63;
	public static final int
		RULE_programa = 0, RULE_declaracao = 1, RULE_declaracaoVariavel = 2, RULE_tipo = 3, 
		RULE_declaracaoFuncao = 4, RULE_parametros = 5, RULE_parametro = 6, RULE_bloco = 7, 
		RULE_comentario = 8, RULE_expressao = 9, RULE_atribuicao = 10, RULE_estruturaControle = 11, 
		RULE_caseLista = 12, RULE_caseDecl = 13, RULE_declaracaoEstrutura = 14, 
		RULE_array = 15, RULE_arrayInicializacao = 16, RULE_expressaoLogica = 17, 
		RULE_expressaoRelacional = 18, RULE_expressaoAritmetica = 19, RULE_expressaoMultiplicativa = 20, 
		RULE_expressaoUnaria = 21, RULE_expressaoPostfix = 22, RULE_argumentos = 23, 
		RULE_primaria = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracao", "declaracaoVariavel", "tipo", "declaracaoFuncao", 
			"parametros", "parametro", "bloco", "comentario", "expressao", "atribuicao", 
			"estruturaControle", "caseLista", "caseDecl", "declaracaoEstrutura", 
			"array", "arrayInicializacao", "expressaoLogica", "expressaoRelacional", 
			"expressaoAritmetica", "expressaoMultiplicativa", "expressaoUnaria", 
			"expressaoPostfix", "argumentos", "primaria"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'int'", "'float'", "'double'", "'char'", "'boolean'", 
			"'vet'", "'('", "')'", "','", "'['", "']'", "'...'", "'{'", "'}'", "'//'", 
			"'/*'", "'*/'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&&='", "'||='", 
			"'if'", "'else'", "'while'", "'for'", "'switch'", "'break'", "'continue'", 
			"'return'", "'case'", "':'", "'default'", "'struct'", "'expressaoLista'", 
			"'&&'", "'||'", "'!'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'.'", "'->'", "'vazio'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "NEWLINE", 
			"ID", "NUM_INT", "NUM_DEC", "TEXTO"
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
	public String getGrammarFileName() { return "experiment.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public experimentParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(experimentParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(experimentParser.NEWLINE, i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 308835418616L) != 0)) {
				{
				{
				setState(50);
				declaracao();
				setState(51);
				match(NEWLINE);
				}
				}
				setState(57);
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
	public static class DeclaracaoContext extends ParserRuleContext {
		public DeclaracaoVariavelContext declaracaoVariavel() {
			return getRuleContext(DeclaracaoVariavelContext.class,0);
		}
		public DeclaracaoFuncaoContext declaracaoFuncao() {
			return getRuleContext(DeclaracaoFuncaoContext.class,0);
		}
		public DeclaracaoEstruturaContext declaracaoEstrutura() {
			return getRuleContext(DeclaracaoEstruturaContext.class,0);
		}
		public ComentarioContext comentario() {
			return getRuleContext(ComentarioContext.class,0);
		}
		public ArrayInicializacaoContext arrayInicializacao() {
			return getRuleContext(ArrayInicializacaoContext.class,0);
		}
		public EstruturaControleContext estruturaControle() {
			return getRuleContext(EstruturaControleContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracao);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				declaracaoVariavel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				declaracaoFuncao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				declaracaoEstrutura();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				comentario();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				arrayInicializacao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(63);
				estruturaControle();
				}
				break;
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
	public static class DeclaracaoVariavelContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(experimentParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public DeclaracaoVariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoVariavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterDeclaracaoVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitDeclaracaoVariavel(this);
		}
	}

	public final DeclaracaoVariavelContext declaracaoVariavel() throws RecognitionException {
		DeclaracaoVariavelContext _localctx = new DeclaracaoVariavelContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracaoVariavel);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				tipo();
				setState(67);
				match(ID);
				setState(68);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				tipo();
				setState(71);
				match(ID);
				setState(72);
				match(T__1);
				setState(73);
				expressao();
				setState(74);
				match(T__0);
				}
				break;
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
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 504L) != 0)) ) {
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
	public static class DeclaracaoFuncaoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(experimentParser.ID, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public DeclaracaoFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterDeclaracaoFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitDeclaracaoFuncao(this);
		}
	}

	public final DeclaracaoFuncaoContext declaracaoFuncao() throws RecognitionException {
		DeclaracaoFuncaoContext _localctx = new DeclaracaoFuncaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracaoFuncao);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				tipo();
				setState(81);
				match(ID);
				setState(82);
				match(T__8);
				setState(83);
				parametros();
				setState(84);
				match(T__9);
				setState(85);
				bloco();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				tipo();
				setState(88);
				match(ID);
				setState(89);
				match(T__8);
				setState(90);
				match(T__9);
				setState(91);
				bloco();
				}
				break;
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
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parametros);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				parametro();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				parametro();
				setState(97);
				match(T__10);
				setState(98);
				parametros();
				}
				break;
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
	public static class ParametroContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(experimentParser.ID, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parametro);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				tipo();
				setState(103);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				tipo();
				setState(106);
				match(ID);
				setState(107);
				match(T__11);
				setState(108);
				match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				tipo();
				setState(111);
				match(T__13);
				setState(112);
				match(ID);
				}
				break;
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
		public List<TerminalNode> NEWLINE() { return getTokens(experimentParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(experimentParser.NEWLINE, i);
		}
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__14);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(117);
				match(NEWLINE);
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 308835418616L) != 0)) {
				{
				{
				setState(123);
				declaracao();
				setState(124);
				match(NEWLINE);
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(T__15);
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
		public List<TerminalNode> NEWLINE() { return getTokens(experimentParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(experimentParser.NEWLINE, i);
		}
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterComentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitComentario(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comentario);
		int _la;
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(T__16);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -576460752303423490L) != 0)) {
					{
					{
					setState(134);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==NEWLINE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(T__17);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -524290L) != 0)) {
					{
					{
					setState(141);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__18) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(147);
				match(T__18);
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
	public static class ExpressaoContext extends ParserRuleContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expressao);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				atribuicao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				expressaoLogica(0);
				}
				break;
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
	public static class AtribuicaoContext extends ParserRuleContext {
		public PrimariaContext primaria() {
			return getRuleContext(PrimariaContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(experimentParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(experimentParser.ID, i);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atribuicao);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				primaria();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				array();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				match(ID);
				setState(157);
				match(T__1);
				setState(158);
				expressao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				match(ID);
				setState(160);
				match(T__19);
				setState(161);
				expressao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(162);
				match(ID);
				setState(163);
				match(T__20);
				setState(164);
				expressao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(165);
				match(ID);
				setState(166);
				match(T__21);
				setState(167);
				expressao();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(168);
				match(ID);
				setState(169);
				match(T__22);
				setState(170);
				expressao();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(171);
				match(ID);
				setState(172);
				match(T__23);
				setState(173);
				expressao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(174);
				match(ID);
				setState(175);
				match(T__24);
				setState(176);
				expressao();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(177);
				match(ID);
				setState(178);
				match(T__25);
				setState(179);
				expressao();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(180);
				match(ID);
				setState(181);
				match(T__1);
				setState(182);
				match(ID);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(183);
				match(ID);
				setState(184);
				match(T__19);
				setState(185);
				match(ID);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(186);
				match(ID);
				setState(187);
				match(T__20);
				setState(188);
				match(ID);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(189);
				match(ID);
				setState(190);
				match(T__21);
				setState(191);
				match(ID);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(192);
				match(ID);
				setState(193);
				match(T__22);
				setState(194);
				match(ID);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(195);
				match(ID);
				setState(196);
				match(T__23);
				setState(197);
				match(ID);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(198);
				match(ID);
				setState(199);
				match(T__24);
				setState(200);
				match(ID);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(201);
				match(ID);
				setState(202);
				match(T__25);
				setState(203);
				match(ID);
				}
				break;
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
	public static class EstruturaControleContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public CaseListaContext caseLista() {
			return getRuleContext(CaseListaContext.class,0);
		}
		public EstruturaControleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estruturaControle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterEstruturaControle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitEstruturaControle(this);
		}
	}

	public final EstruturaControleContext estruturaControle() throws RecognitionException {
		EstruturaControleContext _localctx = new EstruturaControleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_estruturaControle);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(T__26);
				setState(207);
				match(T__8);
				setState(208);
				expressao();
				setState(209);
				match(T__9);
				setState(210);
				bloco();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(T__26);
				setState(213);
				match(T__8);
				setState(214);
				expressao();
				setState(215);
				match(T__9);
				setState(216);
				bloco();
				setState(217);
				match(T__27);
				setState(218);
				bloco();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(T__28);
				setState(221);
				match(T__8);
				setState(222);
				expressao();
				setState(223);
				match(T__9);
				setState(224);
				bloco();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				match(T__29);
				setState(227);
				match(T__8);
				setState(228);
				expressao();
				setState(229);
				match(T__0);
				setState(230);
				expressao();
				setState(231);
				match(T__0);
				setState(232);
				expressao();
				setState(233);
				match(T__9);
				setState(234);
				bloco();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				match(T__30);
				setState(237);
				match(T__8);
				setState(238);
				expressao();
				setState(239);
				match(T__9);
				setState(240);
				caseLista();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(242);
				match(T__31);
				setState(243);
				match(T__0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(244);
				match(T__32);
				setState(245);
				match(T__0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(246);
				match(T__33);
				setState(247);
				expressao();
				setState(248);
				match(T__0);
				}
				break;
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
	public static class CaseListaContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(experimentParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(experimentParser.NEWLINE, i);
		}
		public List<CaseDeclContext> caseDecl() {
			return getRuleContexts(CaseDeclContext.class);
		}
		public CaseDeclContext caseDecl(int i) {
			return getRuleContext(CaseDeclContext.class,i);
		}
		public CaseListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseLista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterCaseLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitCaseLista(this);
		}
	}

	public final CaseListaContext caseLista() throws RecognitionException {
		CaseListaContext _localctx = new CaseListaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_caseLista);
		int _la;
		try {
			int _alt;
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(252);
						match(NEWLINE);
						setState(253);
						caseDecl();
						}
						} 
					}
					setState(258);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__34 || _la==T__36) {
					{
					{
					setState(259);
					caseDecl();
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
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
	public static class CaseDeclContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public CaseDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterCaseDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitCaseDecl(this);
		}
	}

	public final CaseDeclContext caseDecl() throws RecognitionException {
		CaseDeclContext _localctx = new CaseDeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_caseDecl);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(T__34);
				setState(268);
				expressao();
				setState(269);
				match(T__35);
				setState(270);
				bloco();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				match(T__36);
				setState(273);
				match(T__35);
				setState(274);
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
	public static class DeclaracaoEstruturaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(experimentParser.ID, 0); }
		public List<DeclaracaoVariavelContext> declaracaoVariavel() {
			return getRuleContexts(DeclaracaoVariavelContext.class);
		}
		public DeclaracaoVariavelContext declaracaoVariavel(int i) {
			return getRuleContext(DeclaracaoVariavelContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(experimentParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(experimentParser.NEWLINE, i);
		}
		public DeclaracaoEstruturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoEstrutura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterDeclaracaoEstrutura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitDeclaracaoEstrutura(this);
		}
	}

	public final DeclaracaoEstruturaContext declaracaoEstrutura() throws RecognitionException {
		DeclaracaoEstruturaContext _localctx = new DeclaracaoEstruturaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declaracaoEstrutura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(T__37);
			setState(278);
			match(ID);
			setState(279);
			match(T__14);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576460752303423992L) != 0)) {
				{
				{
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(280);
					match(NEWLINE);
					}
					}
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(286);
				declaracaoVariavel();
				setState(287);
				match(NEWLINE);
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(294);
			match(T__15);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(295);
				match(NEWLINE);
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
			match(T__0);
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
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(experimentParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_array);
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(ID);
				setState(304);
				match(T__11);
				setState(305);
				expressao();
				setState(306);
				match(T__12);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(ID);
				setState(309);
				match(T__11);
				setState(310);
				match(T__12);
				}
				break;
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
	public static class ArrayInicializacaoContext extends ParserRuleContext {
		public ArrayInicializacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInicializacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterArrayInicializacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitArrayInicializacao(this);
		}
	}

	public final ArrayInicializacaoContext arrayInicializacao() throws RecognitionException {
		ArrayInicializacaoContext _localctx = new ArrayInicializacaoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arrayInicializacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(T__14);
			setState(314);
			match(T__38);
			setState(315);
			match(T__15);
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
	public static class ExpressaoLogicaContext extends ParserRuleContext {
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public ExpressaoLogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoLogica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterExpressaoLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitExpressaoLogica(this);
		}
	}

	public final ExpressaoLogicaContext expressaoLogica() throws RecognitionException {
		return expressaoLogica(0);
	}

	private ExpressaoLogicaContext expressaoLogica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoLogicaContext _localctx = new ExpressaoLogicaContext(_ctx, _parentState);
		ExpressaoLogicaContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expressaoLogica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__49:
			case T__53:
			case T__54:
			case ID:
			case NUM_INT:
			case NUM_DEC:
			case TEXTO:
				{
				setState(318);
				expressaoRelacional();
				}
				break;
			case T__41:
				{
				setState(319);
				match(T__41);
				setState(320);
				expressaoRelacional();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(331);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(329);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoLogicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoLogica);
						setState(323);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(324);
						match(T__39);
						setState(325);
						expressaoRelacional();
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoLogicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoLogica);
						setState(326);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(327);
						match(T__40);
						setState(328);
						expressaoRelacional();
						}
						break;
					}
					} 
				}
				setState(333);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
	public static class ExpressaoRelacionalContext extends ParserRuleContext {
		public List<ExpressaoAritmeticaContext> expressaoAritmetica() {
			return getRuleContexts(ExpressaoAritmeticaContext.class);
		}
		public ExpressaoAritmeticaContext expressaoAritmetica(int i) {
			return getRuleContext(ExpressaoAritmeticaContext.class,i);
		}
		public ExpressaoRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterExpressaoRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitExpressaoRelacional(this);
		}
	}

	public final ExpressaoRelacionalContext expressaoRelacional() throws RecognitionException {
		ExpressaoRelacionalContext _localctx = new ExpressaoRelacionalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressaoRelacional);
		try {
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				expressaoAritmetica(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				expressaoAritmetica(0);
				setState(336);
				match(T__42);
				setState(337);
				expressaoAritmetica(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(339);
				expressaoAritmetica(0);
				setState(340);
				match(T__43);
				setState(341);
				expressaoAritmetica(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(343);
				expressaoAritmetica(0);
				setState(344);
				match(T__44);
				setState(345);
				expressaoAritmetica(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(347);
				expressaoAritmetica(0);
				setState(348);
				match(T__45);
				setState(349);
				expressaoAritmetica(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(351);
				expressaoAritmetica(0);
				setState(352);
				match(T__46);
				setState(353);
				expressaoAritmetica(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(355);
				expressaoAritmetica(0);
				setState(356);
				match(T__47);
				setState(357);
				expressaoAritmetica(0);
				}
				break;
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
	public static class ExpressaoAritmeticaContext extends ParserRuleContext {
		public ExpressaoMultiplicativaContext expressaoMultiplicativa() {
			return getRuleContext(ExpressaoMultiplicativaContext.class,0);
		}
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public ExpressaoAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterExpressaoAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitExpressaoAritmetica(this);
		}
	}

	public final ExpressaoAritmeticaContext expressaoAritmetica() throws RecognitionException {
		return expressaoAritmetica(0);
	}

	private ExpressaoAritmeticaContext expressaoAritmetica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoAritmeticaContext _localctx = new ExpressaoAritmeticaContext(_ctx, _parentState);
		ExpressaoAritmeticaContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expressaoAritmetica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(362);
			expressaoMultiplicativa(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(372);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(370);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoAritmeticaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritmetica);
						setState(364);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(365);
						match(T__48);
						setState(366);
						expressaoMultiplicativa(0);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoAritmeticaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritmetica);
						setState(367);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(368);
						match(T__49);
						setState(369);
						expressaoMultiplicativa(0);
						}
						break;
					}
					} 
				}
				setState(374);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
	public static class ExpressaoMultiplicativaContext extends ParserRuleContext {
		public ExpressaoUnariaContext expressaoUnaria() {
			return getRuleContext(ExpressaoUnariaContext.class,0);
		}
		public ExpressaoMultiplicativaContext expressaoMultiplicativa() {
			return getRuleContext(ExpressaoMultiplicativaContext.class,0);
		}
		public ExpressaoMultiplicativaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoMultiplicativa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterExpressaoMultiplicativa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitExpressaoMultiplicativa(this);
		}
	}

	public final ExpressaoMultiplicativaContext expressaoMultiplicativa() throws RecognitionException {
		return expressaoMultiplicativa(0);
	}

	private ExpressaoMultiplicativaContext expressaoMultiplicativa(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoMultiplicativaContext _localctx = new ExpressaoMultiplicativaContext(_ctx, _parentState);
		ExpressaoMultiplicativaContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expressaoMultiplicativa, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(376);
			expressaoUnaria();
			}
			_ctx.stop = _input.LT(-1);
			setState(389);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(387);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoMultiplicativaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoMultiplicativa);
						setState(378);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(379);
						match(T__50);
						setState(380);
						expressaoUnaria();
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoMultiplicativaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoMultiplicativa);
						setState(381);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(382);
						match(T__51);
						setState(383);
						expressaoUnaria();
						}
						break;
					case 3:
						{
						_localctx = new ExpressaoMultiplicativaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoMultiplicativa);
						setState(384);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(385);
						match(T__52);
						setState(386);
						expressaoUnaria();
						}
						break;
					}
					} 
				}
				setState(391);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
	public static class ExpressaoUnariaContext extends ParserRuleContext {
		public ExpressaoPostfixContext expressaoPostfix() {
			return getRuleContext(ExpressaoPostfixContext.class,0);
		}
		public ExpressaoUnariaContext expressaoUnaria() {
			return getRuleContext(ExpressaoUnariaContext.class,0);
		}
		public ExpressaoUnariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoUnaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterExpressaoUnaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitExpressaoUnaria(this);
		}
	}

	public final ExpressaoUnariaContext expressaoUnaria() throws RecognitionException {
		ExpressaoUnariaContext _localctx = new ExpressaoUnariaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expressaoUnaria);
		try {
			setState(399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case ID:
			case NUM_INT:
			case NUM_DEC:
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				expressaoPostfix();
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				match(T__49);
				setState(394);
				expressaoUnaria();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
				match(T__53);
				setState(396);
				expressaoPostfix();
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 4);
				{
				setState(397);
				match(T__54);
				setState(398);
				expressaoPostfix();
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
	public static class ExpressaoPostfixContext extends ParserRuleContext {
		public PrimariaContext primaria() {
			return getRuleContext(PrimariaContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode ID() { return getToken(experimentParser.ID, 0); }
		public ExpressaoPostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoPostfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterExpressaoPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitExpressaoPostfix(this);
		}
	}

	public final ExpressaoPostfixContext expressaoPostfix() throws RecognitionException {
		ExpressaoPostfixContext _localctx = new ExpressaoPostfixContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressaoPostfix);
		try {
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				primaria();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				primaria();
				setState(403);
				match(T__11);
				setState(404);
				expressao();
				setState(405);
				match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(407);
				primaria();
				setState(408);
				match(T__8);
				setState(409);
				argumentos();
				setState(410);
				match(T__9);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(412);
				primaria();
				setState(413);
				match(T__55);
				setState(414);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(416);
				primaria();
				setState(417);
				match(T__56);
				setState(418);
				match(ID);
				}
				break;
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
	public static class ArgumentosContext extends ParserRuleContext {
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitArgumentos(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			_la = _input.LA(1);
			if ( !(_la==T__38 || _la==T__57) ) {
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
	public static class PrimariaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(experimentParser.ID, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(experimentParser.NUM_INT, 0); }
		public TerminalNode NUM_DEC() { return getToken(experimentParser.NUM_DEC, 0); }
		public TerminalNode TEXTO() { return getToken(experimentParser.TEXTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public PrimariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).enterPrimaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof experimentListener ) ((experimentListener)listener).exitPrimaria(this);
		}
	}

	public final PrimariaContext primaria() throws RecognitionException {
		PrimariaContext _localctx = new PrimariaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_primaria);
		try {
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				array();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(426);
				match(NUM_INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(427);
				match(NUM_DEC);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(428);
				match(TEXTO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(429);
				match(T__8);
				setState(430);
				expressao();
				setState(431);
				match(T__9);
				}
				break;
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
		case 17:
			return expressaoLogica_sempred((ExpressaoLogicaContext)_localctx, predIndex);
		case 19:
			return expressaoAritmetica_sempred((ExpressaoAritmeticaContext)_localctx, predIndex);
		case 20:
			return expressaoMultiplicativa_sempred((ExpressaoMultiplicativaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressaoLogica_sempred(ExpressaoLogicaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressaoAritmetica_sempred(ExpressaoAritmeticaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expressaoMultiplicativa_sempred(ExpressaoMultiplicativaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001?\u01b4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u00006\b\u0000\n\u0000\f\u0000"+
		"9\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001A\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002M\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004^\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005e\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006s\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0005\u0007w\b\u0007\n\u0007\f\u0007z\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u007f\b\u0007\n\u0007\f\u0007\u0082"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005\b\u0088\b\b\n\b"+
		"\f\b\u008b\t\b\u0001\b\u0001\b\u0005\b\u008f\b\b\n\b\f\b\u0092\t\b\u0001"+
		"\b\u0003\b\u0095\b\b\u0001\t\u0001\t\u0003\t\u0099\b\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00cd\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00fb\b\u000b\u0001\f\u0001\f\u0005\f\u00ff\b\f\n\f\f\f\u0102\t"+
		"\f\u0001\f\u0005\f\u0105\b\f\n\f\f\f\u0108\t\f\u0003\f\u010a\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0114"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u011a"+
		"\b\u000e\n\u000e\f\u000e\u011d\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u0122\b\u000e\n\u000e\f\u000e\u0125\t\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u0129\b\u000e\n\u000e\f\u000e\u012c\t\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0138\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0142\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u014a\b\u0011\n\u0011"+
		"\f\u0011\u014d\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0168\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u0173\b\u0013\n\u0013\f\u0013\u0176"+
		"\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u0184\b\u0014\n\u0014\f\u0014\u0187\t\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u0190\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01a5\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01b2\b\u0018"+
		"\u0001\u0018\u0000\u0003\"&(\u0019\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0\u0000\u0004"+
		"\u0001\u0000\u0003\b\u0001\u0000;;\u0001\u0000\u0013\u0013\u0002\u0000"+
		"\'\'::\u01e5\u00007\u0001\u0000\u0000\u0000\u0002@\u0001\u0000\u0000\u0000"+
		"\u0004L\u0001\u0000\u0000\u0000\u0006N\u0001\u0000\u0000\u0000\b]\u0001"+
		"\u0000\u0000\u0000\nd\u0001\u0000\u0000\u0000\fr\u0001\u0000\u0000\u0000"+
		"\u000et\u0001\u0000\u0000\u0000\u0010\u0094\u0001\u0000\u0000\u0000\u0012"+
		"\u0098\u0001\u0000\u0000\u0000\u0014\u00cc\u0001\u0000\u0000\u0000\u0016"+
		"\u00fa\u0001\u0000\u0000\u0000\u0018\u0109\u0001\u0000\u0000\u0000\u001a"+
		"\u0113\u0001\u0000\u0000\u0000\u001c\u0115\u0001\u0000\u0000\u0000\u001e"+
		"\u0137\u0001\u0000\u0000\u0000 \u0139\u0001\u0000\u0000\u0000\"\u0141"+
		"\u0001\u0000\u0000\u0000$\u0167\u0001\u0000\u0000\u0000&\u0169\u0001\u0000"+
		"\u0000\u0000(\u0177\u0001\u0000\u0000\u0000*\u018f\u0001\u0000\u0000\u0000"+
		",\u01a4\u0001\u0000\u0000\u0000.\u01a6\u0001\u0000\u0000\u00000\u01b1"+
		"\u0001\u0000\u0000\u000023\u0003\u0002\u0001\u000034\u0005;\u0000\u0000"+
		"46\u0001\u0000\u0000\u000052\u0001\u0000\u0000\u000069\u0001\u0000\u0000"+
		"\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008\u0001\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u0000:A\u0003\u0004\u0002\u0000"+
		";A\u0003\b\u0004\u0000<A\u0003\u001c\u000e\u0000=A\u0003\u0010\b\u0000"+
		">A\u0003 \u0010\u0000?A\u0003\u0016\u000b\u0000@:\u0001\u0000\u0000\u0000"+
		"@;\u0001\u0000\u0000\u0000@<\u0001\u0000\u0000\u0000@=\u0001\u0000\u0000"+
		"\u0000@>\u0001\u0000\u0000\u0000@?\u0001\u0000\u0000\u0000A\u0003\u0001"+
		"\u0000\u0000\u0000BC\u0003\u0006\u0003\u0000CD\u0005<\u0000\u0000DE\u0005"+
		"\u0001\u0000\u0000EM\u0001\u0000\u0000\u0000FG\u0003\u0006\u0003\u0000"+
		"GH\u0005<\u0000\u0000HI\u0005\u0002\u0000\u0000IJ\u0003\u0012\t\u0000"+
		"JK\u0005\u0001\u0000\u0000KM\u0001\u0000\u0000\u0000LB\u0001\u0000\u0000"+
		"\u0000LF\u0001\u0000\u0000\u0000M\u0005\u0001\u0000\u0000\u0000NO\u0007"+
		"\u0000\u0000\u0000O\u0007\u0001\u0000\u0000\u0000PQ\u0003\u0006\u0003"+
		"\u0000QR\u0005<\u0000\u0000RS\u0005\t\u0000\u0000ST\u0003\n\u0005\u0000"+
		"TU\u0005\n\u0000\u0000UV\u0003\u000e\u0007\u0000V^\u0001\u0000\u0000\u0000"+
		"WX\u0003\u0006\u0003\u0000XY\u0005<\u0000\u0000YZ\u0005\t\u0000\u0000"+
		"Z[\u0005\n\u0000\u0000[\\\u0003\u000e\u0007\u0000\\^\u0001\u0000\u0000"+
		"\u0000]P\u0001\u0000\u0000\u0000]W\u0001\u0000\u0000\u0000^\t\u0001\u0000"+
		"\u0000\u0000_e\u0003\f\u0006\u0000`a\u0003\f\u0006\u0000ab\u0005\u000b"+
		"\u0000\u0000bc\u0003\n\u0005\u0000ce\u0001\u0000\u0000\u0000d_\u0001\u0000"+
		"\u0000\u0000d`\u0001\u0000\u0000\u0000e\u000b\u0001\u0000\u0000\u0000"+
		"fg\u0003\u0006\u0003\u0000gh\u0005<\u0000\u0000hs\u0001\u0000\u0000\u0000"+
		"ij\u0003\u0006\u0003\u0000jk\u0005<\u0000\u0000kl\u0005\f\u0000\u0000"+
		"lm\u0005\r\u0000\u0000ms\u0001\u0000\u0000\u0000no\u0003\u0006\u0003\u0000"+
		"op\u0005\u000e\u0000\u0000pq\u0005<\u0000\u0000qs\u0001\u0000\u0000\u0000"+
		"rf\u0001\u0000\u0000\u0000ri\u0001\u0000\u0000\u0000rn\u0001\u0000\u0000"+
		"\u0000s\r\u0001\u0000\u0000\u0000tx\u0005\u000f\u0000\u0000uw\u0005;\u0000"+
		"\u0000vu\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000y\u0080\u0001\u0000\u0000\u0000"+
		"zx\u0001\u0000\u0000\u0000{|\u0003\u0002\u0001\u0000|}\u0005;\u0000\u0000"+
		"}\u007f\u0001\u0000\u0000\u0000~{\u0001\u0000\u0000\u0000\u007f\u0082"+
		"\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001"+
		"\u0000\u0000\u0000\u0081\u0083\u0001\u0000\u0000\u0000\u0082\u0080\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0005\u0010\u0000\u0000\u0084\u000f\u0001"+
		"\u0000\u0000\u0000\u0085\u0089\u0005\u0011\u0000\u0000\u0086\u0088\b\u0001"+
		"\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000"+
		"\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000"+
		"\u0000\u0000\u008a\u0095\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000"+
		"\u0000\u0000\u008c\u0090\u0005\u0012\u0000\u0000\u008d\u008f\b\u0002\u0000"+
		"\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000"+
		"\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000"+
		"\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000"+
		"\u0000\u0093\u0095\u0005\u0013\u0000\u0000\u0094\u0085\u0001\u0000\u0000"+
		"\u0000\u0094\u008c\u0001\u0000\u0000\u0000\u0095\u0011\u0001\u0000\u0000"+
		"\u0000\u0096\u0099\u0003\u0014\n\u0000\u0097\u0099\u0003\"\u0011\u0000"+
		"\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000"+
		"\u0099\u0013\u0001\u0000\u0000\u0000\u009a\u00cd\u00030\u0018\u0000\u009b"+
		"\u00cd\u0003\u001e\u000f\u0000\u009c\u009d\u0005<\u0000\u0000\u009d\u009e"+
		"\u0005\u0002\u0000\u0000\u009e\u00cd\u0003\u0012\t\u0000\u009f\u00a0\u0005"+
		"<\u0000\u0000\u00a0\u00a1\u0005\u0014\u0000\u0000\u00a1\u00cd\u0003\u0012"+
		"\t\u0000\u00a2\u00a3\u0005<\u0000\u0000\u00a3\u00a4\u0005\u0015\u0000"+
		"\u0000\u00a4\u00cd\u0003\u0012\t\u0000\u00a5\u00a6\u0005<\u0000\u0000"+
		"\u00a6\u00a7\u0005\u0016\u0000\u0000\u00a7\u00cd\u0003\u0012\t\u0000\u00a8"+
		"\u00a9\u0005<\u0000\u0000\u00a9\u00aa\u0005\u0017\u0000\u0000\u00aa\u00cd"+
		"\u0003\u0012\t\u0000\u00ab\u00ac\u0005<\u0000\u0000\u00ac\u00ad\u0005"+
		"\u0018\u0000\u0000\u00ad\u00cd\u0003\u0012\t\u0000\u00ae\u00af\u0005<"+
		"\u0000\u0000\u00af\u00b0\u0005\u0019\u0000\u0000\u00b0\u00cd\u0003\u0012"+
		"\t\u0000\u00b1\u00b2\u0005<\u0000\u0000\u00b2\u00b3\u0005\u001a\u0000"+
		"\u0000\u00b3\u00cd\u0003\u0012\t\u0000\u00b4\u00b5\u0005<\u0000\u0000"+
		"\u00b5\u00b6\u0005\u0002\u0000\u0000\u00b6\u00cd\u0005<\u0000\u0000\u00b7"+
		"\u00b8\u0005<\u0000\u0000\u00b8\u00b9\u0005\u0014\u0000\u0000\u00b9\u00cd"+
		"\u0005<\u0000\u0000\u00ba\u00bb\u0005<\u0000\u0000\u00bb\u00bc\u0005\u0015"+
		"\u0000\u0000\u00bc\u00cd\u0005<\u0000\u0000\u00bd\u00be\u0005<\u0000\u0000"+
		"\u00be\u00bf\u0005\u0016\u0000\u0000\u00bf\u00cd\u0005<\u0000\u0000\u00c0"+
		"\u00c1\u0005<\u0000\u0000\u00c1\u00c2\u0005\u0017\u0000\u0000\u00c2\u00cd"+
		"\u0005<\u0000\u0000\u00c3\u00c4\u0005<\u0000\u0000\u00c4\u00c5\u0005\u0018"+
		"\u0000\u0000\u00c5\u00cd\u0005<\u0000\u0000\u00c6\u00c7\u0005<\u0000\u0000"+
		"\u00c7\u00c8\u0005\u0019\u0000\u0000\u00c8\u00cd\u0005<\u0000\u0000\u00c9"+
		"\u00ca\u0005<\u0000\u0000\u00ca\u00cb\u0005\u001a\u0000\u0000\u00cb\u00cd"+
		"\u0005<\u0000\u0000\u00cc\u009a\u0001\u0000\u0000\u0000\u00cc\u009b\u0001"+
		"\u0000\u0000\u0000\u00cc\u009c\u0001\u0000\u0000\u0000\u00cc\u009f\u0001"+
		"\u0000\u0000\u0000\u00cc\u00a2\u0001\u0000\u0000\u0000\u00cc\u00a5\u0001"+
		"\u0000\u0000\u0000\u00cc\u00a8\u0001\u0000\u0000\u0000\u00cc\u00ab\u0001"+
		"\u0000\u0000\u0000\u00cc\u00ae\u0001\u0000\u0000\u0000\u00cc\u00b1\u0001"+
		"\u0000\u0000\u0000\u00cc\u00b4\u0001\u0000\u0000\u0000\u00cc\u00b7\u0001"+
		"\u0000\u0000\u0000\u00cc\u00ba\u0001\u0000\u0000\u0000\u00cc\u00bd\u0001"+
		"\u0000\u0000\u0000\u00cc\u00c0\u0001\u0000\u0000\u0000\u00cc\u00c3\u0001"+
		"\u0000\u0000\u0000\u00cc\u00c6\u0001\u0000\u0000\u0000\u00cc\u00c9\u0001"+
		"\u0000\u0000\u0000\u00cd\u0015\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005"+
		"\u001b\u0000\u0000\u00cf\u00d0\u0005\t\u0000\u0000\u00d0\u00d1\u0003\u0012"+
		"\t\u0000\u00d1\u00d2\u0005\n\u0000\u0000\u00d2\u00d3\u0003\u000e\u0007"+
		"\u0000\u00d3\u00fb\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u001b\u0000"+
		"\u0000\u00d5\u00d6\u0005\t\u0000\u0000\u00d6\u00d7\u0003\u0012\t\u0000"+
		"\u00d7\u00d8\u0005\n\u0000\u0000\u00d8\u00d9\u0003\u000e\u0007\u0000\u00d9"+
		"\u00da\u0005\u001c\u0000\u0000\u00da\u00db\u0003\u000e\u0007\u0000\u00db"+
		"\u00fb\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\u001d\u0000\u0000\u00dd"+
		"\u00de\u0005\t\u0000\u0000\u00de\u00df\u0003\u0012\t\u0000\u00df\u00e0"+
		"\u0005\n\u0000\u0000\u00e0\u00e1\u0003\u000e\u0007\u0000\u00e1\u00fb\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e3\u0005\u001e\u0000\u0000\u00e3\u00e4\u0005"+
		"\t\u0000\u0000\u00e4\u00e5\u0003\u0012\t\u0000\u00e5\u00e6\u0005\u0001"+
		"\u0000\u0000\u00e6\u00e7\u0003\u0012\t\u0000\u00e7\u00e8\u0005\u0001\u0000"+
		"\u0000\u00e8\u00e9\u0003\u0012\t\u0000\u00e9\u00ea\u0005\n\u0000\u0000"+
		"\u00ea\u00eb\u0003\u000e\u0007\u0000\u00eb\u00fb\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ed\u0005\u001f\u0000\u0000\u00ed\u00ee\u0005\t\u0000\u0000\u00ee"+
		"\u00ef\u0003\u0012\t\u0000\u00ef\u00f0\u0005\n\u0000\u0000\u00f0\u00f1"+
		"\u0003\u0018\f\u0000\u00f1\u00fb\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005"+
		" \u0000\u0000\u00f3\u00fb\u0005\u0001\u0000\u0000\u00f4\u00f5\u0005!\u0000"+
		"\u0000\u00f5\u00fb\u0005\u0001\u0000\u0000\u00f6\u00f7\u0005\"\u0000\u0000"+
		"\u00f7\u00f8\u0003\u0012\t\u0000\u00f8\u00f9\u0005\u0001\u0000\u0000\u00f9"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fa\u00ce\u0001\u0000\u0000\u0000\u00fa"+
		"\u00d4\u0001\u0000\u0000\u0000\u00fa\u00dc\u0001\u0000\u0000\u0000\u00fa"+
		"\u00e2\u0001\u0000\u0000\u0000\u00fa\u00ec\u0001\u0000\u0000\u0000\u00fa"+
		"\u00f2\u0001\u0000\u0000\u0000\u00fa\u00f4\u0001\u0000\u0000\u0000\u00fa"+
		"\u00f6\u0001\u0000\u0000\u0000\u00fb\u0017\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0005;\u0000\u0000\u00fd\u00ff\u0003\u001a\r\u0000\u00fe\u00fc"+
		"\u0001\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u010a"+
		"\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0105"+
		"\u0003\u001a\r\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0105\u0108\u0001"+
		"\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0107\u0001"+
		"\u0000\u0000\u0000\u0107\u010a\u0001\u0000\u0000\u0000\u0108\u0106\u0001"+
		"\u0000\u0000\u0000\u0109\u0100\u0001\u0000\u0000\u0000\u0109\u0106\u0001"+
		"\u0000\u0000\u0000\u010a\u0019\u0001\u0000\u0000\u0000\u010b\u010c\u0005"+
		"#\u0000\u0000\u010c\u010d\u0003\u0012\t\u0000\u010d\u010e\u0005$\u0000"+
		"\u0000\u010e\u010f\u0003\u000e\u0007\u0000\u010f\u0114\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0005%\u0000\u0000\u0111\u0112\u0005$\u0000\u0000\u0112"+
		"\u0114\u0003\u000e\u0007\u0000\u0113\u010b\u0001\u0000\u0000\u0000\u0113"+
		"\u0110\u0001\u0000\u0000\u0000\u0114\u001b\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0005&\u0000\u0000\u0116\u0117\u0005<\u0000\u0000\u0117\u0123\u0005"+
		"\u000f\u0000\u0000\u0118\u011a\u0005;\u0000\u0000\u0119\u0118\u0001\u0000"+
		"\u0000\u0000\u011a\u011d\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000"+
		"\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011e\u0001\u0000"+
		"\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011e\u011f\u0003\u0004"+
		"\u0002\u0000\u011f\u0120\u0005;\u0000\u0000\u0120\u0122\u0001\u0000\u0000"+
		"\u0000\u0121\u011b\u0001\u0000\u0000\u0000\u0122\u0125\u0001\u0000\u0000"+
		"\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000"+
		"\u0000\u0124\u0126\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000"+
		"\u0000\u0126\u012a\u0005\u0010\u0000\u0000\u0127\u0129\u0005;\u0000\u0000"+
		"\u0128\u0127\u0001\u0000\u0000\u0000\u0129\u012c\u0001\u0000\u0000\u0000"+
		"\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000"+
		"\u012b\u012d\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000"+
		"\u012d\u012e\u0005\u0001\u0000\u0000\u012e\u001d\u0001\u0000\u0000\u0000"+
		"\u012f\u0130\u0005<\u0000\u0000\u0130\u0131\u0005\f\u0000\u0000\u0131"+
		"\u0132\u0003\u0012\t\u0000\u0132\u0133\u0005\r\u0000\u0000\u0133\u0138"+
		"\u0001\u0000\u0000\u0000\u0134\u0135\u0005<\u0000\u0000\u0135\u0136\u0005"+
		"\f\u0000\u0000\u0136\u0138\u0005\r\u0000\u0000\u0137\u012f\u0001\u0000"+
		"\u0000\u0000\u0137\u0134\u0001\u0000\u0000\u0000\u0138\u001f\u0001\u0000"+
		"\u0000\u0000\u0139\u013a\u0005\u000f\u0000\u0000\u013a\u013b\u0005\'\u0000"+
		"\u0000\u013b\u013c\u0005\u0010\u0000\u0000\u013c!\u0001\u0000\u0000\u0000"+
		"\u013d\u013e\u0006\u0011\uffff\uffff\u0000\u013e\u0142\u0003$\u0012\u0000"+
		"\u013f\u0140\u0005*\u0000\u0000\u0140\u0142\u0003$\u0012\u0000\u0141\u013d"+
		"\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0142\u014b"+
		"\u0001\u0000\u0000\u0000\u0143\u0144\n\u0003\u0000\u0000\u0144\u0145\u0005"+
		"(\u0000\u0000\u0145\u014a\u0003$\u0012\u0000\u0146\u0147\n\u0002\u0000"+
		"\u0000\u0147\u0148\u0005)\u0000\u0000\u0148\u014a\u0003$\u0012\u0000\u0149"+
		"\u0143\u0001\u0000\u0000\u0000\u0149\u0146\u0001\u0000\u0000\u0000\u014a"+
		"\u014d\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014b"+
		"\u014c\u0001\u0000\u0000\u0000\u014c#\u0001\u0000\u0000\u0000\u014d\u014b"+
		"\u0001\u0000\u0000\u0000\u014e\u0168\u0003&\u0013\u0000\u014f\u0150\u0003"+
		"&\u0013\u0000\u0150\u0151\u0005+\u0000\u0000\u0151\u0152\u0003&\u0013"+
		"\u0000\u0152\u0168\u0001\u0000\u0000\u0000\u0153\u0154\u0003&\u0013\u0000"+
		"\u0154\u0155\u0005,\u0000\u0000\u0155\u0156\u0003&\u0013\u0000\u0156\u0168"+
		"\u0001\u0000\u0000\u0000\u0157\u0158\u0003&\u0013\u0000\u0158\u0159\u0005"+
		"-\u0000\u0000\u0159\u015a\u0003&\u0013\u0000\u015a\u0168\u0001\u0000\u0000"+
		"\u0000\u015b\u015c\u0003&\u0013\u0000\u015c\u015d\u0005.\u0000\u0000\u015d"+
		"\u015e\u0003&\u0013\u0000\u015e\u0168\u0001\u0000\u0000\u0000\u015f\u0160"+
		"\u0003&\u0013\u0000\u0160\u0161\u0005/\u0000\u0000\u0161\u0162\u0003&"+
		"\u0013\u0000\u0162\u0168\u0001\u0000\u0000\u0000\u0163\u0164\u0003&\u0013"+
		"\u0000\u0164\u0165\u00050\u0000\u0000\u0165\u0166\u0003&\u0013\u0000\u0166"+
		"\u0168\u0001\u0000\u0000\u0000\u0167\u014e\u0001\u0000\u0000\u0000\u0167"+
		"\u014f\u0001\u0000\u0000\u0000\u0167\u0153\u0001\u0000\u0000\u0000\u0167"+
		"\u0157\u0001\u0000\u0000\u0000\u0167\u015b\u0001\u0000\u0000\u0000\u0167"+
		"\u015f\u0001\u0000\u0000\u0000\u0167\u0163\u0001\u0000\u0000\u0000\u0168"+
		"%\u0001\u0000\u0000\u0000\u0169\u016a\u0006\u0013\uffff\uffff\u0000\u016a"+
		"\u016b\u0003(\u0014\u0000\u016b\u0174\u0001\u0000\u0000\u0000\u016c\u016d"+
		"\n\u0002\u0000\u0000\u016d\u016e\u00051\u0000\u0000\u016e\u0173\u0003"+
		"(\u0014\u0000\u016f\u0170\n\u0001\u0000\u0000\u0170\u0171\u00052\u0000"+
		"\u0000\u0171\u0173\u0003(\u0014\u0000\u0172\u016c\u0001\u0000\u0000\u0000"+
		"\u0172\u016f\u0001\u0000\u0000\u0000\u0173\u0176\u0001\u0000\u0000\u0000"+
		"\u0174\u0172\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000"+
		"\u0175\'\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0177"+
		"\u0178\u0006\u0014\uffff\uffff\u0000\u0178\u0179\u0003*\u0015\u0000\u0179"+
		"\u0185\u0001\u0000\u0000\u0000\u017a\u017b\n\u0003\u0000\u0000\u017b\u017c"+
		"\u00053\u0000\u0000\u017c\u0184\u0003*\u0015\u0000\u017d\u017e\n\u0002"+
		"\u0000\u0000\u017e\u017f\u00054\u0000\u0000\u017f\u0184\u0003*\u0015\u0000"+
		"\u0180\u0181\n\u0001\u0000\u0000\u0181\u0182\u00055\u0000\u0000\u0182"+
		"\u0184\u0003*\u0015\u0000\u0183\u017a\u0001\u0000\u0000\u0000\u0183\u017d"+
		"\u0001\u0000\u0000\u0000\u0183\u0180\u0001\u0000\u0000\u0000\u0184\u0187"+
		"\u0001\u0000\u0000\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0185\u0186"+
		"\u0001\u0000\u0000\u0000\u0186)\u0001\u0000\u0000\u0000\u0187\u0185\u0001"+
		"\u0000\u0000\u0000\u0188\u0190\u0003,\u0016\u0000\u0189\u018a\u00052\u0000"+
		"\u0000\u018a\u0190\u0003*\u0015\u0000\u018b\u018c\u00056\u0000\u0000\u018c"+
		"\u0190\u0003,\u0016\u0000\u018d\u018e\u00057\u0000\u0000\u018e\u0190\u0003"+
		",\u0016\u0000\u018f\u0188\u0001\u0000\u0000\u0000\u018f\u0189\u0001\u0000"+
		"\u0000\u0000\u018f\u018b\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000"+
		"\u0000\u0000\u0190+\u0001\u0000\u0000\u0000\u0191\u01a5\u00030\u0018\u0000"+
		"\u0192\u0193\u00030\u0018\u0000\u0193\u0194\u0005\f\u0000\u0000\u0194"+
		"\u0195\u0003\u0012\t\u0000\u0195\u0196\u0005\r\u0000\u0000\u0196\u01a5"+
		"\u0001\u0000\u0000\u0000\u0197\u0198\u00030\u0018\u0000\u0198\u0199\u0005"+
		"\t\u0000\u0000\u0199\u019a\u0003.\u0017\u0000\u019a\u019b\u0005\n\u0000"+
		"\u0000\u019b\u01a5\u0001\u0000\u0000\u0000\u019c\u019d\u00030\u0018\u0000"+
		"\u019d\u019e\u00058\u0000\u0000\u019e\u019f\u0005<\u0000\u0000\u019f\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a0\u01a1\u00030\u0018\u0000\u01a1\u01a2\u0005"+
		"9\u0000\u0000\u01a2\u01a3\u0005<\u0000\u0000\u01a3\u01a5\u0001\u0000\u0000"+
		"\u0000\u01a4\u0191\u0001\u0000\u0000\u0000\u01a4\u0192\u0001\u0000\u0000"+
		"\u0000\u01a4\u0197\u0001\u0000\u0000\u0000\u01a4\u019c\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a0\u0001\u0000\u0000\u0000\u01a5-\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a7\u0007\u0003\u0000\u0000\u01a7/\u0001\u0000\u0000\u0000\u01a8"+
		"\u01b2\u0005<\u0000\u0000\u01a9\u01b2\u0003\u001e\u000f\u0000\u01aa\u01b2"+
		"\u0005=\u0000\u0000\u01ab\u01b2\u0005>\u0000\u0000\u01ac\u01b2\u0005?"+
		"\u0000\u0000\u01ad\u01ae\u0005\t\u0000\u0000\u01ae\u01af\u0003\u0012\t"+
		"\u0000\u01af\u01b0\u0005\n\u0000\u0000\u01b0\u01b2\u0001\u0000\u0000\u0000"+
		"\u01b1\u01a8\u0001\u0000\u0000\u0000\u01b1\u01a9\u0001\u0000\u0000\u0000"+
		"\u01b1\u01aa\u0001\u0000\u0000\u0000\u01b1\u01ab\u0001\u0000\u0000\u0000"+
		"\u01b1\u01ac\u0001\u0000\u0000\u0000\u01b1\u01ad\u0001\u0000\u0000\u0000"+
		"\u01b21\u0001\u0000\u0000\u0000!7@L]drx\u0080\u0089\u0090\u0094\u0098"+
		"\u00cc\u00fa\u0100\u0106\u0109\u0113\u011b\u0123\u012a\u0137\u0141\u0149"+
		"\u014b\u0167\u0172\u0174\u0183\u0185\u018f\u01a4\u01b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}