package com.yandex.div.evaluable.internal;

import com.ironsource.X3;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.TokenizingException;
import com.yandex.div.evaluable.internal.Token;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Tokenizer.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0019\n\u0002\b\u000e\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001.B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0016\u0010\f\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0016\u0010\u0010\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J \u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0002J\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0002J\u001e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0002J\u001e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0002J,\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00122\b\b\u0002\u0010\u001e\u001a\u00020\nH\u0002J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010 \u001a\u00020!H\u0002J\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010 \u001a\u00020\u0017J\f\u0010\"\u001a\u00020\n*\u00020\u0004H\u0002J\f\u0010#\u001a\u00020\n*\u00020\u0004H\u0002J\f\u0010$\u001a\u00020\n*\u00020\u0004H\u0002J\u0014\u0010%\u001a\u00020\n*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002J \u0010&\u001a\u00020\n*\u00020\u00042\b\b\u0002\u0010'\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020\u0004H\u0002J\f\u0010)\u001a\u00020\n*\u00020\u0004H\u0002J\f\u0010*\u001a\u00020\n*\u00020\u0004H\u0002J\u0014\u0010+\u001a\u00020\n*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002J\f\u0010,\u001a\u00020\n*\u00020\u0004H\u0002J\f\u0010-\u001a\u00020\n*\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006/"}, d2 = {"Lcom/yandex/div/evaluable/internal/Tokenizer;", "", "()V", "EMPTY_CHAR", "", "invalidToken", "Lcom/yandex/div/evaluable/EvaluableException;", "state", "Lcom/yandex/div/evaluable/internal/Tokenizer$TokenizationState;", "isAtEndOfString", "", "isLiteral", "isOperator", "tokens", "", "Lcom/yandex/div/evaluable/internal/Token;", "isUnaryOperator", "processExpression", "", "processIdentifier", "", "processKeyword", "identifier", "", "processNumber", "processString", "Lcom/yandex/div/evaluable/internal/Token$Operand$Literal$Str;", "processString-wB-4SYI", "(Lcom/yandex/div/evaluable/internal/Tokenizer$TokenizationState;Z)Ljava/lang/String;", "processStringTemplate", "isPartOfExpression", "tokenize", "input", "", "isAlphabetic", "isAtEnd", "isAtEndOfExpression", "isAtEndOfStringLiteral", "isDecimal", "previousChar", "nextChar", "isDot", "isNumber", "isStartOfExpression", "isValidIdentifier", "isWhiteSpace", "TokenizationState", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Tokenizer {
    private static final char EMPTY_CHAR = 0;

    @NotNull
    public static final Tokenizer INSTANCE = new Tokenizer();

    private final boolean isAlphabetic(char c) {
        return ('a' <= c && c < '{') || ('A' <= c && c < '[') || c == '_';
    }

    private final boolean isAtEnd(char c) {
        return c == 0;
    }

    private final boolean isAtEndOfExpression(char c) {
        return c == '}';
    }

    private final boolean isDot(char c) {
        return c == '.';
    }

    private final boolean isNumber(char c) {
        return '0' <= c && c < ':';
    }

    private final boolean isWhiteSpace(char c) {
        return c == ' ' || c == '\t' || c == '\r' || c == '\n';
    }

    private Tokenizer() {
    }

    @NotNull
    public final List<Token> tokenize(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        char[] charArray = input.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        return tokenize(charArray);
    }

    private final List<Token> tokenize(char[] input) {
        TokenizationState tokenizationState = new TokenizationState(input);
        try {
            processStringTemplate(tokenizationState, tokenizationState.getTokens(), false);
            return tokenizationState.getTokens();
        } catch (EvaluableException e) {
            if (e instanceof TokenizingException) {
                throw new EvaluableException("Error tokenizing '" + StringsKt.concatToString(input) + "'.", e);
            }
            throw e;
        }
    }

    static /* synthetic */ void processStringTemplate$default(Tokenizer tokenizer, TokenizationState tokenizationState, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        tokenizer.processStringTemplate(tokenizationState, list, z);
    }

    private final void processStringTemplate(TokenizationState state, List<Token> tokens, boolean isPartOfExpression) {
        if (isPartOfExpression) {
            TokenizationState.forward$default(state, 0, 1, null);
        }
        ArrayList arrayList = new ArrayList();
        String m7320processStringwB4SYI = m7320processStringwB4SYI(state, isPartOfExpression);
        if (isAtEnd(state.currentChar())) {
            if (isPartOfExpression) {
                throw new TokenizingException("''' expected at end of string literal at " + state.getIndex(), null, 2, null);
            }
            if (m7320processStringwB4SYI != null) {
                tokens.add(Token.Operand.Literal.Str.m7306boximpl(m7320processStringwB4SYI));
                return;
            }
            return;
        }
        if (isAtEndOfStringLiteral(state.currentChar(), state)) {
            if (m7320processStringwB4SYI == null) {
                m7320processStringwB4SYI = Token.Operand.Literal.Str.m7307constructorimpl("");
            }
            tokens.add(Token.Operand.Literal.Str.m7306boximpl(m7320processStringwB4SYI));
            TokenizationState.forward$default(state, 0, 1, null);
            return;
        }
        if (m7320processStringwB4SYI != null && isStartOfExpression(state.currentChar(), state)) {
            arrayList.add(Token.StringTemplate.Start.INSTANCE);
            arrayList.add(Token.Operand.Literal.Str.m7306boximpl(m7320processStringwB4SYI));
        }
        while (isStartOfExpression(state.currentChar(), state)) {
            ArrayList arrayList2 = new ArrayList();
            processExpression(state, arrayList2);
            String m7320processStringwB4SYI2 = m7320processStringwB4SYI(state, isPartOfExpression);
            if (!isPartOfExpression && arrayList.isEmpty() && m7320processStringwB4SYI2 == null && !isStartOfExpression(state.currentChar(), state)) {
                tokens.addAll(arrayList2);
                return;
            }
            if (arrayList.isEmpty()) {
                arrayList.add(Token.StringTemplate.Start.INSTANCE);
            }
            arrayList.add(Token.StringTemplate.StartOfExpression.INSTANCE);
            arrayList.addAll(arrayList2);
            arrayList.add(Token.StringTemplate.EndOfExpression.INSTANCE);
            if (m7320processStringwB4SYI2 != null) {
                arrayList.add(Token.Operand.Literal.Str.m7306boximpl(m7320processStringwB4SYI2));
            }
        }
        if (isPartOfExpression && !isAtEndOfStringLiteral(state.currentChar(), state)) {
            throw new TokenizingException("''' expected at end of string literal at " + state.getIndex(), null, 2, null);
        }
        if (!arrayList.isEmpty()) {
            tokens.addAll(arrayList);
            tokens.add(Token.StringTemplate.End.INSTANCE);
        }
        if (isPartOfExpression) {
            TokenizationState.forward$default(state, 0, 1, null);
        }
    }

    /* renamed from: processString-wB-4SYI$default, reason: not valid java name */
    static /* synthetic */ String m7321processStringwB4SYI$default(Tokenizer tokenizer, TokenizationState tokenizationState, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return tokenizer.m7320processStringwB4SYI(tokenizationState, z);
    }

    /* renamed from: processString-wB-4SYI, reason: not valid java name */
    private final String m7320processStringwB4SYI(TokenizationState state, boolean isLiteral) {
        int index = state.getIndex();
        while (!isAtEndOfString(state, isLiteral)) {
            TokenizationState.forward$default(state, 0, 1, null);
        }
        String process$default = LiteralsEscaper.process$default(LiteralsEscaper.INSTANCE, state.part(index, state.getIndex()), null, 2, null);
        if (process$default.length() > 0) {
            return Token.Operand.Literal.Str.m7307constructorimpl(process$default);
        }
        return null;
    }

    private final boolean isAtEndOfString(TokenizationState state, boolean isLiteral) {
        return isAtEnd(state.currentChar()) || isStartOfExpression(state.currentChar(), state) || (isLiteral && isAtEndOfStringLiteral(state.currentChar(), state));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean processExpression$default(Tokenizer tokenizer, TokenizationState tokenizationState, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = tokenizationState.getTokens();
        }
        return tokenizer.processExpression(tokenizationState, list);
    }

    private final boolean processExpression(TokenizationState state, List<Token> tokens) {
        Token token;
        Token token2;
        if (!isStartOfExpression(state.currentChar(), state)) {
            return false;
        }
        state.forward(2);
        while (!isAtEnd(state.currentChar()) && state.currentChar() != '}') {
            char currentChar = state.currentChar();
            if (currentChar == '?') {
                tokens.add(Token.Operator.TernaryIf.INSTANCE);
                TokenizationState.forward$default(state, 0, 1, null);
            } else if (currentChar == ':') {
                tokens.add(Token.Operator.TernaryElse.INSTANCE);
                TokenizationState.forward$default(state, 0, 1, null);
            } else if (currentChar == '+') {
                if (isUnaryOperator(tokens)) {
                    token = Token.Operator.Unary.Plus.INSTANCE;
                } else {
                    if (!isOperator(tokens)) {
                        throw invalidToken(state);
                    }
                    token = Token.Operator.Binary.Sum.Plus.INSTANCE;
                }
                tokens.add(token);
                TokenizationState.forward$default(state, 0, 1, null);
            } else if (currentChar == '-') {
                if (isUnaryOperator(tokens)) {
                    token2 = Token.Operator.Unary.Minus.INSTANCE;
                } else {
                    if (!isOperator(tokens)) {
                        throw invalidToken(state);
                    }
                    token2 = Token.Operator.Binary.Sum.Minus.INSTANCE;
                }
                tokens.add(token2);
                TokenizationState.forward$default(state, 0, 1, null);
            } else if (currentChar == '*') {
                tokens.add(Token.Operator.Binary.Factor.Multiplication.INSTANCE);
                TokenizationState.forward$default(state, 0, 1, null);
            } else if (currentChar == '/') {
                tokens.add(Token.Operator.Binary.Factor.Division.INSTANCE);
                TokenizationState.forward$default(state, 0, 1, null);
            } else if (currentChar == '%') {
                tokens.add(Token.Operator.Binary.Factor.Modulo.INSTANCE);
                TokenizationState.forward$default(state, 0, 1, null);
            } else if (currentChar == '!') {
                if (TokenizationState.nextChar$default(state, 0, 1, null) == '=') {
                    tokens.add(Token.Operator.Binary.Equality.NotEqual.INSTANCE);
                    state.forward(2);
                } else if (TokenizationState.nextChar$default(state, 0, 1, null) == ':') {
                    tokens.add(Token.Operator.Try.INSTANCE);
                    state.forward(2);
                } else if (isUnaryOperator(tokens)) {
                    tokens.add(Token.Operator.Unary.Not.INSTANCE);
                    TokenizationState.forward$default(state, 0, 1, null);
                } else {
                    throw invalidToken(state);
                }
            } else if (currentChar == '&') {
                if (TokenizationState.nextChar$default(state, 0, 1, null) == '&') {
                    tokens.add(Token.Operator.Binary.Logical.And.INSTANCE);
                    state.forward(2);
                } else {
                    throw invalidToken(state);
                }
            } else if (currentChar == '|') {
                if (TokenizationState.nextChar$default(state, 0, 1, null) == '|') {
                    tokens.add(Token.Operator.Binary.Logical.Or.INSTANCE);
                    state.forward(2);
                } else {
                    throw invalidToken(state);
                }
            } else if (currentChar == '<') {
                if (TokenizationState.nextChar$default(state, 0, 1, null) == '=') {
                    tokens.add(Token.Operator.Binary.Comparison.LessOrEqual.INSTANCE);
                    state.forward(2);
                } else {
                    tokens.add(Token.Operator.Binary.Comparison.Less.INSTANCE);
                    TokenizationState.forward$default(state, 0, 1, null);
                }
            } else if (currentChar == '>') {
                if (TokenizationState.nextChar$default(state, 0, 1, null) == '=') {
                    tokens.add(Token.Operator.Binary.Comparison.GreaterOrEqual.INSTANCE);
                    state.forward(2);
                } else {
                    tokens.add(Token.Operator.Binary.Comparison.Greater.INSTANCE);
                    TokenizationState.forward$default(state, 0, 1, null);
                }
            } else if (currentChar == '=') {
                if (TokenizationState.nextChar$default(state, 0, 1, null) == '=') {
                    tokens.add(Token.Operator.Binary.Equality.Equal.INSTANCE);
                    state.forward(2);
                } else {
                    throw invalidToken(state);
                }
            } else if (currentChar == '(') {
                tokens.add(Token.Bracket.LeftRound.INSTANCE);
                TokenizationState.forward$default(state, 0, 1, null);
            } else if (currentChar == ')') {
                tokens.add(Token.Bracket.RightRound.INSTANCE);
                TokenizationState.forward$default(state, 0, 1, null);
            } else if (currentChar == ',') {
                tokens.add(Token.Function.ArgumentDelimiter.INSTANCE);
                TokenizationState.forward$default(state, 0, 1, null);
            } else if (currentChar == '\'') {
                processStringTemplate$default(this, state, tokens, false, 4, null);
            } else if (isWhiteSpace(state.currentChar())) {
                TokenizationState.forward$default(state, 0, 1, null);
            } else if (isDecimal(state.currentChar(), TokenizationState.prevChar$default(state, 0, 1, null), TokenizationState.nextChar$default(state, 0, 1, null))) {
                processNumber(state, tokens);
            } else if (isAlphabetic(state.currentChar())) {
                processIdentifier(state, tokens);
            } else if (isDot(state.currentChar())) {
                TokenizationState.forward$default(state, 0, 1, null);
                tokens.add(Token.Operator.Dot.INSTANCE);
            } else {
                throw invalidToken(state);
            }
        }
        if (!isAtEndOfExpression(state.currentChar())) {
            throw new TokenizingException("'}' expected at end of expression at " + state.getIndex(), null, 2, null);
        }
        TokenizationState.forward$default(state, 0, 1, null);
        return true;
    }

    private final void processNumber(TokenizationState state, List<Token> tokens) {
        String part;
        String part2;
        int index = state.getIndex();
        boolean z = CollectionsKt.lastOrNull(tokens) instanceof Token.Operator.Unary.Minus;
        if (z) {
            CollectionsKt.removeLastOrNull(tokens);
        }
        do {
            TokenizationState.forward$default(state, 0, 1, null);
        } while (Character.isDigit(state.currentChar()));
        if (state.charAt(index) == '.' || isDecimal(state.currentChar(), TokenizationState.prevChar$default(state, 0, 1, null), TokenizationState.nextChar$default(state, 0, 1, null))) {
            while (isDecimal(state.currentChar(), TokenizationState.prevChar$default(state, 0, 1, null), TokenizationState.nextChar$default(state, 0, 1, null))) {
                TokenizationState.forward$default(state, 0, 1, null);
            }
            if (z) {
                part = '-' + state.part(index, state.getIndex());
            } else {
                part = state.part(index, state.getIndex());
            }
            try {
                tokens.add(Token.Operand.Literal.Num.m7299boximpl(Token.Operand.Literal.Num.m7300constructorimpl(Double.valueOf(Double.parseDouble(part)))));
                return;
            } catch (Exception unused) {
                throw new EvaluableException("Value " + part + " can't be converted to Number type.", null, 2, null);
            }
        }
        if (z) {
            part2 = '-' + state.part(index, state.getIndex());
        } else {
            part2 = state.part(index, state.getIndex());
        }
        try {
            tokens.add(Token.Operand.Literal.Num.m7299boximpl(Token.Operand.Literal.Num.m7300constructorimpl(Long.valueOf(Long.parseLong(part2)))));
        } catch (Exception unused2) {
            throw new EvaluableException("Value " + part2 + " can't be converted to Integer type.", null, 2, null);
        }
    }

    private final void processIdentifier(TokenizationState state, List<Token> tokens) {
        Token.Function function;
        int index = state.getIndex();
        Integer num = null;
        while (true) {
            int index2 = state.getIndex();
            while (isValidIdentifier(state.currentChar())) {
                TokenizationState.forward$default(state, 0, 1, null);
            }
            if (isDot(state.currentChar())) {
                int index3 = state.getIndex() + 1;
                Integer valueOf = Integer.valueOf(index3);
                TokenizationState.forward$default(state, 0, 1, null);
                if (index3 - index2 <= 1) {
                    throw new EvaluableException("Unexpected token: .", null, 2, null);
                }
                num = valueOf;
            }
            if (!isValidIdentifier(state.currentChar()) && !isDot(state.currentChar())) {
                int index4 = state.getIndex();
                while (isWhiteSpace(state.currentChar())) {
                    TokenizationState.forward$default(state, 0, 1, null);
                }
                if (state.currentChar() == '(') {
                    function = new Token.Function(state.part(num != null ? num.intValue() : index, index4));
                    if (num == null) {
                        tokens.add(function);
                        return;
                    }
                    index4 = num.intValue() - 1;
                } else {
                    function = null;
                }
                String part = state.part(index, index4);
                Tokenizer tokenizer = INSTANCE;
                if (!tokenizer.processKeyword(part, tokens)) {
                    if (tokenizer.isDot(state.charAt(index4 - 1))) {
                        throw new EvaluableException("Unexpected token: .", null, 2, null);
                    }
                    tokens.add(Token.Operand.Variable.m7313boximpl(Token.Operand.Variable.m7314constructorimpl(part)));
                }
                if (function != null) {
                    tokens.add(Token.Operator.Dot.INSTANCE);
                    tokens.add(function);
                    return;
                }
                return;
            }
        }
    }

    private final boolean processKeyword(String identifier, List<Token> tokens) {
        Token.Operand.Literal.Bool m7292boximpl;
        if (Intrinsics.areEqual(identifier, "true")) {
            m7292boximpl = Token.Operand.Literal.Bool.m7292boximpl(Token.Operand.Literal.Bool.m7293constructorimpl(true));
        } else {
            m7292boximpl = Intrinsics.areEqual(identifier, "false") ? Token.Operand.Literal.Bool.m7292boximpl(Token.Operand.Literal.Bool.m7293constructorimpl(false)) : null;
        }
        if (m7292boximpl == null) {
            return false;
        }
        tokens.add(m7292boximpl);
        return true;
    }

    private final EvaluableException invalidToken(TokenizationState state) {
        return new EvaluableException("Invalid token '" + state.currentChar() + "' at position " + state.getIndex(), null, 2, null);
    }

    private final boolean isOperator(List<? extends Token> tokens) {
        if (tokens.isEmpty() || (CollectionsKt.last((List) tokens) instanceof Token.Operator.Unary)) {
            return false;
        }
        return (CollectionsKt.last((List) tokens) instanceof Token.Operand) || (CollectionsKt.last((List) tokens) instanceof Token.Bracket.RightRound);
    }

    private final boolean isUnaryOperator(List<? extends Token> tokens) {
        return (isOperator(tokens) || (CollectionsKt.lastOrNull(tokens) instanceof Token.Operator.Unary)) ? false : true;
    }

    /* compiled from: Tokenizer.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006J\t\u0010\u0013\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0011J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0010\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u0006J\b\u0010\u001c\u001a\u00020\u0006H\u0016J\u0010\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u0006J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006J\u0010\u0010#\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u0006J\t\u0010$\u001a\u00020 HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006%"}, d2 = {"Lcom/yandex/div/evaluable/internal/Tokenizer$TokenizationState;", "", "source", "", "([C)V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "tokens", "", "Lcom/yandex/div/evaluable/internal/Token;", "getTokens", "()Ljava/util/List;", "charAt", "", X3.i.L, "component1", "copy", "currentChar", "currentCharIsEscaped", "", "equals", "other", ToolBar.FORWARD, "count", "hashCode", "nextChar", "step", "part", "", "from", "to", "prevChar", "toString", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class TokenizationState {
        private int index;

        @NotNull
        private final char[] source;

        @NotNull
        private final List<Token> tokens;

        /* renamed from: component1, reason: from getter */
        private final char[] getSource() {
            return this.source;
        }

        public static /* synthetic */ TokenizationState copy$default(TokenizationState tokenizationState, char[] cArr, int i, Object obj) {
            if ((i & 1) != 0) {
                cArr = tokenizationState.source;
            }
            return tokenizationState.copy(cArr);
        }

        @NotNull
        public final TokenizationState copy(@NotNull char[] source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new TokenizationState(source);
        }

        @NotNull
        public String toString() {
            return "TokenizationState(source=" + Arrays.toString(this.source) + ')';
        }

        public TokenizationState(@NotNull char[] source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.source = source;
            this.tokens = new ArrayList();
        }

        public final int getIndex() {
            return this.index;
        }

        public final void setIndex(int i) {
            this.index = i;
        }

        @NotNull
        public final List<Token> getTokens() {
            return this.tokens;
        }

        public static /* synthetic */ char prevChar$default(TokenizationState tokenizationState, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 1;
            }
            return tokenizationState.prevChar(i);
        }

        public final char prevChar(int step) {
            int i = this.index;
            if (i - step >= 0) {
                return this.source[i - step];
            }
            return (char) 0;
        }

        public final boolean currentCharIsEscaped() {
            int i = this.index;
            if (i >= this.source.length) {
                return false;
            }
            int i2 = 0;
            for (int i3 = i - 1; i3 > 0 && this.source[i3] == '\\'; i3--) {
                i2++;
            }
            return i2 % 2 == 1;
        }

        public final char currentChar() {
            int i = this.index;
            char[] cArr = this.source;
            if (i >= cArr.length) {
                return (char) 0;
            }
            return cArr[i];
        }

        public final char charAt(int position) {
            if (position >= 0) {
                char[] cArr = this.source;
                if (position < cArr.length) {
                    return cArr[position];
                }
            }
            return (char) 0;
        }

        @NotNull
        public final String part(int from, int to) {
            return StringsKt.concatToString(this.source, from, to);
        }

        public static /* synthetic */ char nextChar$default(TokenizationState tokenizationState, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 1;
            }
            return tokenizationState.nextChar(i);
        }

        public final char nextChar(int step) {
            int i = this.index;
            int i2 = i + step;
            char[] cArr = this.source;
            if (i2 >= cArr.length) {
                return (char) 0;
            }
            return cArr[i + step];
        }

        public static /* synthetic */ int forward$default(TokenizationState tokenizationState, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 1;
            }
            return tokenizationState.forward(i);
        }

        public final int forward(int count) {
            int i = this.index;
            this.index = count + i;
            return i;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.areEqual(TokenizationState.class, other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Tokenizer.TokenizationState");
            return Arrays.equals(this.source, ((TokenizationState) other).source);
        }

        public int hashCode() {
            return Arrays.hashCode(this.source);
        }
    }

    static /* synthetic */ boolean isDecimal$default(Tokenizer tokenizer, char c, char c2, char c3, int i, Object obj) {
        if ((i & 1) != 0) {
            c2 = 0;
        }
        if ((i & 2) != 0) {
            c3 = 0;
        }
        return tokenizer.isDecimal(c, c2, c3);
    }

    private final boolean isDecimal(char c, char c2, char c3) {
        boolean z;
        if (Character.isDigit(c)) {
            return true;
        }
        if (c == '.') {
            z = Character.isDigit(c3);
        } else {
            z = !(c == 'e' || c == 'E') ? !((c == '+' || c == '-') && ((c2 == 'e' || c2 == 'E') && Character.isDigit(c3))) : !(Character.isDigit(c2) && (Character.isDigit(c3) || c3 == '+' || c3 == '-'));
        }
        return z;
    }

    private final boolean isValidIdentifier(char c) {
        return isAlphabetic(c) || isNumber(c);
    }

    private final boolean isAtEndOfStringLiteral(char c, TokenizationState tokenizationState) {
        return c == '\'' && !tokenizationState.currentCharIsEscaped();
    }

    private final boolean isStartOfExpression(char c, TokenizationState tokenizationState) {
        return c == '@' && TokenizationState.prevChar$default(tokenizationState, 0, 1, null) != '\\' && TokenizationState.nextChar$default(tokenizationState, 0, 1, null) == '{';
    }
}
