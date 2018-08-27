// Generated from Units.g4 by ANTLR 4.7.1

package units;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UnitsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		EOL=18, ID=19, STRING=20, NUMBER=21, COMMENTS=22, WS=23, ERROR=24;
	public static final int
		RULE_unitsFile = 0, RULE_declaration = 1, RULE_unitsDeclaration = 2, RULE_unit = 3, 
		RULE_unitsEquivalence = 4, RULE_equivalentUnit = 5, RULE_unitsDerivation = 6, 
		RULE_structureDeclaration = 7, RULE_structure = 8, RULE_unitsAssociation = 9, 
		RULE_prefixDeclaration = 10, RULE_prefix = 11, RULE_value = 12;
	public static final String[] ruleNames = {
		"unitsFile", "declaration", "unitsDeclaration", "unit", "unitsEquivalence", 
		"equivalentUnit", "unitsDerivation", "structureDeclaration", "structure", 
		"unitsAssociation", "prefixDeclaration", "prefix", "value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'units'", "'{'", "'}'", "':'", "'['", "']'", "'|'", "'('", "')'", 
		"'*'", "'/'", "'^'", "'structures'", "'&'", "'prefixes'", "'-'", "'+'", 
		"';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "EOL", "ID", "STRING", "NUMBER", "COMMENTS", 
		"WS", "ERROR"
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
	public String getGrammarFileName() { return "Units.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UnitsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class UnitsFileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(UnitsParser.EOF, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public UnitsFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitsFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).enterUnitsFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).exitUnitsFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnitsVisitor ) return ((UnitsVisitor<? extends T>)visitor).visitUnitsFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitsFileContext unitsFile() throws RecognitionException {
		UnitsFileContext _localctx = new UnitsFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_unitsFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__12) | (1L << T__14))) != 0)) {
				{
				{
				setState(26);
				declaration();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
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

	public static class DeclarationContext extends ParserRuleContext {
		public UnitsDeclarationContext unitsDeclaration() {
			return getRuleContext(UnitsDeclarationContext.class,0);
		}
		public StructureDeclarationContext structureDeclaration() {
			return getRuleContext(StructureDeclarationContext.class,0);
		}
		public PrefixDeclarationContext prefixDeclaration() {
			return getRuleContext(PrefixDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnitsVisitor ) return ((UnitsVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				unitsDeclaration();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				structureDeclaration();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				prefixDeclaration();
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

	public static class UnitsDeclarationContext extends ParserRuleContext {
		public List<UnitContext> unit() {
			return getRuleContexts(UnitContext.class);
		}
		public UnitContext unit(int i) {
			return getRuleContext(UnitContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(UnitsParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(UnitsParser.EOL, i);
		}
		public UnitsDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitsDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).enterUnitsDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).exitUnitsDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnitsVisitor ) return ((UnitsVisitor<? extends T>)visitor).visitUnitsDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitsDeclarationContext unitsDeclaration() throws RecognitionException {
		UnitsDeclarationContext _localctx = new UnitsDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_unitsDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__0);
			setState(40);
			match(T__1);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(41);
				unit();
				setState(42);
				match(EOL);
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(T__2);
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

	public static class UnitContext extends ParserRuleContext {
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
	 
		public UnitContext() { }
		public void copyFrom(UnitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Unit_BasicContext extends UnitContext {
		public TerminalNode ID() { return getToken(UnitsParser.ID, 0); }
		public TerminalNode STRING() { return getToken(UnitsParser.STRING, 0); }
		public Unit_BasicContext(UnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).enterUnit_Basic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).exitUnit_Basic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnitsVisitor ) return ((UnitsVisitor<? extends T>)visitor).visitUnit_Basic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Unit_DerivedContext extends UnitContext {
		public TerminalNode ID() { return getToken(UnitsParser.ID, 0); }
		public TerminalNode STRING() { return getToken(UnitsParser.STRING, 0); }
		public UnitsDerivationContext unitsDerivation() {
			return getRuleContext(UnitsDerivationContext.class,0);
		}
		public Unit_DerivedContext(UnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).enterUnit_Derived(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).exitUnit_Derived(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnitsVisitor ) return ((UnitsVisitor<? extends T>)visitor).visitUnit_Derived(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Unit_EquivalentContext extends UnitContext {
		public TerminalNode ID() { return getToken(UnitsParser.ID, 0); }
		public UnitsEquivalenceContext unitsEquivalence() {
			return getRuleContext(UnitsEquivalenceContext.class,0);
		}
		public Unit_EquivalentContext(UnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).enterUnit_Equivalent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).exitUnit_Equivalent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnitsVisitor ) return ((UnitsVisitor<? extends T>)visitor).visitUnit_Equivalent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Unit_ClassContext extends UnitContext {
		public List<TerminalNode> ID() { return getTokens(UnitsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(UnitsParser.ID, i);
		}
		public UnitsEquivalenceContext unitsEquivalence() {
			return getRuleContext(UnitsEquivalenceContext.class,0);
		}
		public Unit_ClassContext(UnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).enterUnit_Class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).exitUnit_Class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnitsVisitor ) return ((UnitsVisitor<? extends T>)visitor).visitUnit_Class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unit);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new Unit_BasicContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(ID);
				setState(52);
				match(STRING);
				}
				break;
			case 2:
				_localctx = new Unit_DerivedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				match(ID);
				setState(54);
				match(STRING);
				setState(55);
				match(T__3);
				setState(56);
				unitsDerivation(0);
				}
				break;
			case 3:
				_localctx = new Unit_EquivalentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				match(ID);
				setState(58);
				match(T__3);
				setState(59);
				unitsEquivalence();
				}
				break;
			case 4:
				_localctx = new Unit_ClassContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				match(ID);
				setState(61);
				match(T__4);
				setState(62);
				match(ID);
				setState(63);
				match(T__5);
				setState(64);
				match(T__3);
				setState(65);
				unitsEquivalence();
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

	public static class UnitsEquivalenceContext extends ParserRuleContext {
		public List<EquivalentUnitContext> equivalentUnit() {
			return getRuleContexts(EquivalentUnitContext.class);
		}
		public EquivalentUnitContext equivalentUnit(int i) {
			return getRuleContext(EquivalentUnitContext.class,i);
		}
		public UnitsEquivalenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitsEquivalence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).enterUnitsEquivalence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).exitUnitsEquivalence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnitsVisitor ) return ((UnitsVisitor<? extends T>)visitor).visitUnitsEquivalence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitsEquivalenceContext unitsEquivalence() throws RecognitionException {
		UnitsEquivalenceContext _localctx = new UnitsEquivalenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unitsEquivalence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			equivalentUnit();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(69);
				match(T__6);
				setState(70);
				equivalentUnit();
				}
				}
				setState(75);
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

	public static class EquivalentUnitContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode ID() { return getToken(UnitsParser.ID, 0); }
		public EquivalentUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equivalentUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).enterEquivalentUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).exitEquivalentUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnitsVisitor ) return ((UnitsVisitor<? extends T>)visitor).visitEquivalentUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquivalentUnitContext equivalentUnit() throws RecognitionException {
		EquivalentUnitContext _localctx = new EquivalentUnitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_equivalentUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__7);
			setState(77);
			value(0);
			setState(78);
			match(T__8);
			setState(79);
			match(ID);
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

	public static class UnitsDerivationContext extends ParserRuleContext {
		public UnitsDerivationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitsDerivation; }
	 
		public UnitsDerivationContext() { }
		public void copyFrom(UnitsDerivationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Unit_Op_ParenthesisContext extends UnitsDerivationContext {
		public UnitsDerivationContext unitsDerivation() {
			return getRuleContext(UnitsDerivationContext.class,0);
		}
		public Unit_Op_ParenthesisContext(UnitsDerivationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).enterUnit_Op_Parenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).exitUnit_Op_Parenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnitsVisitor ) return ((UnitsVisitor<? extends T>)visitor).visitUnit_Op_Parenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Unit_Op_MultDivContext extends UnitsDerivationContext {
		public Token op;
		public List<UnitsDerivationContext> unitsDerivation() {
			return getRuleContexts(UnitsDerivationContext.class);
		}
		public UnitsDerivationContext unitsDerivation(int i) {
			return getRuleContext(UnitsDerivationContext.class,i);
		}
		public Unit_Op_MultDivContext(UnitsDerivationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).enterUnit_Op_MultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).exitUnit_Op_MultDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnitsVisitor ) return ((UnitsVisitor<? extends T>)visitor).visitUnit_Op_MultDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Unit_Op_IDContext extends UnitsDerivationContext {
		public TerminalNode ID() { return getToken(UnitsParser.ID, 0); }
		public Unit_Op_IDContext(UnitsDerivationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).enterUnit_Op_ID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).exitUnit_Op_ID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnitsVisitor ) return ((UnitsVisitor<? extends T>)visitor).visitUnit_Op_ID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Unit_Op_PowerContext extends UnitsDerivationContext {
		public UnitsDerivationContext unitsDerivation() {
			return getRuleContext(UnitsDerivationContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(UnitsParser.NUMBER, 0); }
		public Unit_Op_PowerContext(UnitsDerivationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).enterUnit_Op_Power(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).exitUnit_Op_Power(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnitsVisitor ) return ((UnitsVisitor<? extends T>)visitor).visitUnit_Op_Power(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitsDerivationContext unitsDerivation() throws RecognitionException {
		return unitsDerivation(0);
	}

	private UnitsDerivationContext unitsDerivation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		UnitsDerivationContext _localctx = new UnitsDerivationContext(_ctx, _parentState);
		UnitsDerivationContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_unitsDerivation, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				_localctx = new Unit_Op_ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(82);
				match(T__7);
				setState(83);
				unitsDerivation(0);
				setState(84);
				match(T__8);
				}
				break;
			case ID:
				{
				_localctx = new Unit_Op_IDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(95);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new Unit_Op_MultDivContext(new UnitsDerivationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_unitsDerivation);
						setState(89);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(90);
						((Unit_Op_MultDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__10) ) {
							((Unit_Op_MultDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(91);
						unitsDerivation(4);
						}
						break;
					case 2:
						{
						_localctx = new Unit_Op_PowerContext(new UnitsDerivationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_unitsDerivation);
						setState(92);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(93);
						match(T__11);
						setState(94);
						match(NUMBER);
						}
						break;
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class StructureDeclarationContext extends ParserRuleContext {
		public List<StructureContext> structure() {
			return getRuleContexts(StructureContext.class);
		}
		public StructureContext structure(int i) {
			return getRuleContext(StructureContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(UnitsParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(UnitsParser.EOL, i);
		}
		public StructureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).enterStructureDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).exitStructureDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnitsVisitor ) return ((UnitsVisitor<? extends T>)visitor).visitStructureDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureDeclarationContext structureDeclaration() throws RecognitionException {
		StructureDeclarationContext _localctx = new StructureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_structureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__12);
			setState(101);
			match(T__1);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(102);
				structure();
				setState(103);
				match(EOL);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(T__2);
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

	public static class StructureContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(UnitsParser.ID, 0); }
		public TerminalNode STRING() { return getToken(UnitsParser.STRING, 0); }
		public UnitsAssociationContext unitsAssociation() {
			return getRuleContext(UnitsAssociationContext.class,0);
		}
		public StructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).enterStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).exitStructure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnitsVisitor ) return ((UnitsVisitor<? extends T>)visitor).visitStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureContext structure() throws RecognitionException {
		StructureContext _localctx = new StructureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_structure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(ID);
			setState(113);
			match(STRING);
			setState(114);
			match(T__3);
			setState(115);
			unitsAssociation();
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

	public static class UnitsAssociationContext extends ParserRuleContext {
		public List<EquivalentUnitContext> equivalentUnit() {
			return getRuleContexts(EquivalentUnitContext.class);
		}
		public EquivalentUnitContext equivalentUnit(int i) {
			return getRuleContext(EquivalentUnitContext.class,i);
		}
		public UnitsAssociationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitsAssociation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).enterUnitsAssociation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).exitUnitsAssociation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnitsVisitor ) return ((UnitsVisitor<? extends T>)visitor).visitUnitsAssociation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitsAssociationContext unitsAssociation() throws RecognitionException {
		UnitsAssociationContext _localctx = new UnitsAssociationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_unitsAssociation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			equivalentUnit();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(118);
				match(T__13);
				setState(119);
				equivalentUnit();
				}
				}
				setState(124);
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

	public static class PrefixDeclarationContext extends ParserRuleContext {
		public List<PrefixContext> prefix() {
			return getRuleContexts(PrefixContext.class);
		}
		public PrefixContext prefix(int i) {
			return getRuleContext(PrefixContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(UnitsParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(UnitsParser.EOL, i);
		}
		public PrefixDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).enterPrefixDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).exitPrefixDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnitsVisitor ) return ((UnitsVisitor<? extends T>)visitor).visitPrefixDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixDeclarationContext prefixDeclaration() throws RecognitionException {
		PrefixDeclarationContext _localctx = new PrefixDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_prefixDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__14);
			setState(126);
			match(T__1);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(127);
				prefix();
				setState(128);
				match(EOL);
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			match(T__2);
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

	public static class PrefixContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(UnitsParser.ID, 0); }
		public TerminalNode STRING() { return getToken(UnitsParser.STRING, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).enterPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).exitPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnitsVisitor ) return ((UnitsVisitor<? extends T>)visitor).visitPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixContext prefix() throws RecognitionException {
		PrefixContext _localctx = new PrefixContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(ID);
			setState(138);
			match(STRING);
			setState(139);
			match(T__3);
			setState(140);
			value(0);
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

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Value_AddSubContext extends ValueContext {
		public Token op;
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Value_AddSubContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).enterValue_AddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).exitValue_AddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnitsVisitor ) return ((UnitsVisitor<? extends T>)visitor).visitValue_AddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Value_SimetricContext extends ValueContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Value_SimetricContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).enterValue_Simetric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).exitValue_Simetric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnitsVisitor ) return ((UnitsVisitor<? extends T>)visitor).visitValue_Simetric(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Value_PowerContext extends ValueContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Value_PowerContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).enterValue_Power(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).exitValue_Power(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnitsVisitor ) return ((UnitsVisitor<? extends T>)visitor).visitValue_Power(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Value_NumberContext extends ValueContext {
		public TerminalNode NUMBER() { return getToken(UnitsParser.NUMBER, 0); }
		public Value_NumberContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).enterValue_Number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).exitValue_Number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnitsVisitor ) return ((UnitsVisitor<? extends T>)visitor).visitValue_Number(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Value_ParenthesisContext extends ValueContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Value_ParenthesisContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).enterValue_Parenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).exitValue_Parenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnitsVisitor ) return ((UnitsVisitor<? extends T>)visitor).visitValue_Parenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Value_MultDivContext extends ValueContext {
		public Token op;
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Value_MultDivContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).enterValue_MultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnitsListener ) ((UnitsListener)listener).exitValue_MultDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnitsVisitor ) return ((UnitsVisitor<? extends T>)visitor).visitValue_MultDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		return value(0);
	}

	private ValueContext value(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueContext _localctx = new ValueContext(_ctx, _parentState);
		ValueContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_value, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				_localctx = new Value_ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(143);
				match(T__7);
				setState(144);
				value(0);
				setState(145);
				match(T__8);
				}
				break;
			case T__15:
				{
				_localctx = new Value_SimetricContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(T__15);
				setState(148);
				value(5);
				}
				break;
			case NUMBER:
				{
				_localctx = new Value_NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(161);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new Value_PowerContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(152);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(153);
						match(T__11);
						setState(154);
						value(4);
						}
						break;
					case 2:
						{
						_localctx = new Value_MultDivContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(155);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(156);
						((Value_MultDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__10) ) {
							((Value_MultDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(157);
						value(4);
						}
						break;
					case 3:
						{
						_localctx = new Value_AddSubContext(new ValueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(158);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(159);
						((Value_AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__15 || _la==T__16) ) {
							((Value_AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(160);
						value(3);
						}
						break;
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return unitsDerivation_sempred((UnitsDerivationContext)_localctx, predIndex);
		case 12:
			return value_sempred((ValueContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean unitsDerivation_sempred(UnitsDerivationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean value_sempred(ValueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u00a9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\5\3(\n\3\3\4\3\4\3\4\3\4\3\4\7\4/\n\4\f\4\16\4\62\13\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"E\n\5\3\6\3\6\3\6\7\6J\n\6\f\6\16\6M\13\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\bZ\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bb\n\b\f\b\16\be\13"+
		"\b\3\t\3\t\3\t\3\t\3\t\7\tl\n\t\f\t\16\to\13\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\7\13{\n\13\f\13\16\13~\13\13\3\f\3\f\3\f\3\f\3\f\7"+
		"\f\u0085\n\f\f\f\16\f\u0088\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0099\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\7\16\u00a4\n\16\f\16\16\16\u00a7\13\16\3\16\2\4\16"+
		"\32\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\4\3\2\f\r\3\2\22\23\2\u00ae"+
		"\2\37\3\2\2\2\4\'\3\2\2\2\6)\3\2\2\2\bD\3\2\2\2\nF\3\2\2\2\fN\3\2\2\2"+
		"\16Y\3\2\2\2\20f\3\2\2\2\22r\3\2\2\2\24w\3\2\2\2\26\177\3\2\2\2\30\u008b"+
		"\3\2\2\2\32\u0098\3\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2\36!\3\2\2\2\37\35"+
		"\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\7\2\2\3#\3\3\2\2\2$(\5"+
		"\6\4\2%(\5\20\t\2&(\5\26\f\2\'$\3\2\2\2\'%\3\2\2\2\'&\3\2\2\2(\5\3\2\2"+
		"\2)*\7\3\2\2*\60\7\4\2\2+,\5\b\5\2,-\7\24\2\2-/\3\2\2\2.+\3\2\2\2/\62"+
		"\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63\64\7"+
		"\5\2\2\64\7\3\2\2\2\65\66\7\25\2\2\66E\7\26\2\2\678\7\25\2\289\7\26\2"+
		"\29:\7\6\2\2:E\5\16\b\2;<\7\25\2\2<=\7\6\2\2=E\5\n\6\2>?\7\25\2\2?@\7"+
		"\7\2\2@A\7\25\2\2AB\7\b\2\2BC\7\6\2\2CE\5\n\6\2D\65\3\2\2\2D\67\3\2\2"+
		"\2D;\3\2\2\2D>\3\2\2\2E\t\3\2\2\2FK\5\f\7\2GH\7\t\2\2HJ\5\f\7\2IG\3\2"+
		"\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\13\3\2\2\2MK\3\2\2\2NO\7\n\2\2OP\5"+
		"\32\16\2PQ\7\13\2\2QR\7\25\2\2R\r\3\2\2\2ST\b\b\1\2TU\7\n\2\2UV\5\16\b"+
		"\2VW\7\13\2\2WZ\3\2\2\2XZ\7\25\2\2YS\3\2\2\2YX\3\2\2\2Zc\3\2\2\2[\\\f"+
		"\5\2\2\\]\t\2\2\2]b\5\16\b\6^_\f\4\2\2_`\7\16\2\2`b\7\27\2\2a[\3\2\2\2"+
		"a^\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\17\3\2\2\2ec\3\2\2\2fg\7\17"+
		"\2\2gm\7\4\2\2hi\5\22\n\2ij\7\24\2\2jl\3\2\2\2kh\3\2\2\2lo\3\2\2\2mk\3"+
		"\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\5\2\2q\21\3\2\2\2rs\7\25\2\2"+
		"st\7\26\2\2tu\7\6\2\2uv\5\24\13\2v\23\3\2\2\2w|\5\f\7\2xy\7\20\2\2y{\5"+
		"\f\7\2zx\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\25\3\2\2\2~|\3\2\2\2\177"+
		"\u0080\7\21\2\2\u0080\u0086\7\4\2\2\u0081\u0082\5\30\r\2\u0082\u0083\7"+
		"\24\2\2\u0083\u0085\3\2\2\2\u0084\u0081\3\2\2\2\u0085\u0088\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2"+
		"\2\2\u0089\u008a\7\5\2\2\u008a\27\3\2\2\2\u008b\u008c\7\25\2\2\u008c\u008d"+
		"\7\26\2\2\u008d\u008e\7\6\2\2\u008e\u008f\5\32\16\2\u008f\31\3\2\2\2\u0090"+
		"\u0091\b\16\1\2\u0091\u0092\7\n\2\2\u0092\u0093\5\32\16\2\u0093\u0094"+
		"\7\13\2\2\u0094\u0099\3\2\2\2\u0095\u0096\7\22\2\2\u0096\u0099\5\32\16"+
		"\7\u0097\u0099\7\27\2\2\u0098\u0090\3\2\2\2\u0098\u0095\3\2\2\2\u0098"+
		"\u0097\3\2\2\2\u0099\u00a5\3\2\2\2\u009a\u009b\f\6\2\2\u009b\u009c\7\16"+
		"\2\2\u009c\u00a4\5\32\16\6\u009d\u009e\f\5\2\2\u009e\u009f\t\2\2\2\u009f"+
		"\u00a4\5\32\16\6\u00a0\u00a1\f\4\2\2\u00a1\u00a2\t\3\2\2\u00a2\u00a4\5"+
		"\32\16\5\u00a3\u009a\3\2\2\2\u00a3\u009d\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a4"+
		"\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\33\3\2\2"+
		"\2\u00a7\u00a5\3\2\2\2\20\37\'\60DKYacm|\u0086\u0098\u00a3\u00a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}