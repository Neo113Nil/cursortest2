package com.yandex.div.evaluable;

import com.yandex.div.evaluable.function.GetBooleanValue;
import com.yandex.div.evaluable.function.GetColorValue;
import com.yandex.div.evaluable.function.GetColorValueString;
import com.yandex.div.evaluable.function.GetIntegerValue;
import com.yandex.div.evaluable.function.GetNumberValue;
import com.yandex.div.evaluable.function.GetStringValue;
import com.yandex.div.evaluable.function.GetUrlValueWithStringFallback;
import com.yandex.div.evaluable.function.GetUrlValueWithUrlFallback;
import com.yandex.div.evaluable.internal.Parser;
import com.yandex.div.evaluable.internal.Token;
import com.yandex.div.evaluable.internal.Tokenizer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Evaluable.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\b&\u0018\u0000 \u001b2\u00020\u0001:\u000b\u001a\u001b\u001c\u001d\u001e\u001f !\"#$B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\nJ\u0015\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0014J\u0010\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0013H$J\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\nH\u0000¢\u0006\u0002\b\u0019R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\b¨\u0006%"}, d2 = {"Lcom/yandex/div/evaluable/Evaluable;", "", "rawExpr", "", "(Ljava/lang/String;)V", "dynamicVariables", "", "getDynamicVariables", "()Ljava/util/List;", "evalCalled", "", "isCacheable", "getRawExpr", "()Ljava/lang/String;", "variables", "getVariables", "checkIsCacheable", "eval", "evaluator", "Lcom/yandex/div/evaluable/Evaluator;", "eval$div_evaluable", "evalImpl", "updateIsCacheable", "", "value", "updateIsCacheable$div_evaluable", "Binary", "Companion", "FunctionCall", "Lazy", "MethodCall", "StringTemplate", "Ternary", "Try", "Unary", "Value", "Variable", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class Evaluable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Set<String> functionsWithVariableName = SetsKt.setOf((Object[]) new String[]{GetIntegerValue.INSTANCE.getName(), GetNumberValue.INSTANCE.getName(), GetStringValue.INSTANCE.getName(), GetColorValue.INSTANCE.getName(), GetColorValueString.INSTANCE.getName(), GetUrlValueWithUrlFallback.INSTANCE.getName(), GetUrlValueWithStringFallback.INSTANCE.getName(), GetBooleanValue.INSTANCE.getName()});
    private boolean evalCalled;
    private boolean isCacheable;

    @NotNull
    private final String rawExpr;

    @NotNull
    public static final Evaluable lazy(@NotNull String str) {
        return INSTANCE.lazy(str);
    }

    @NotNull
    public static final Evaluable prepare(@NotNull String str) {
        return INSTANCE.prepare(str);
    }

    @NotNull
    protected abstract Object evalImpl(@NotNull Evaluator evaluator) throws EvaluableException;

    @NotNull
    public abstract List<Evaluable> getDynamicVariables();

    @NotNull
    public abstract List<String> getVariables();

    public Evaluable(@NotNull String rawExpr) {
        Intrinsics.checkNotNullParameter(rawExpr, "rawExpr");
        this.rawExpr = rawExpr;
        this.isCacheable = true;
    }

    @NotNull
    public final String getRawExpr() {
        return this.rawExpr;
    }

    public final void updateIsCacheable$div_evaluable(boolean value) {
        this.isCacheable = this.isCacheable && value;
    }

    /* renamed from: checkIsCacheable, reason: from getter */
    public final boolean getIsCacheable() {
        return this.isCacheable;
    }

    @NotNull
    public final Object eval$div_evaluable(@NotNull Evaluator evaluator) throws EvaluableException {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        Object evalImpl = evalImpl(evaluator);
        this.evalCalled = true;
        return evalImpl;
    }

    /* compiled from: Evaluable.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0003H\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0001X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/evaluable/Evaluable$Lazy;", "Lcom/yandex/div/evaluable/Evaluable;", "expr", "", "(Ljava/lang/String;)V", "dynamicVariables", "", "getDynamicVariables", "()Ljava/util/List;", "expression", "tokens", "Lcom/yandex/div/evaluable/internal/Token;", "variables", "getVariables", "evalImpl", "", "evaluator", "Lcom/yandex/div/evaluable/Evaluator;", "initExpression", "", "toString", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Lazy extends Evaluable {

        @NotNull
        private final String expr;
        private Evaluable expression;

        @NotNull
        private final List<Token> tokens;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Lazy(@NotNull String expr) {
            super(expr);
            Intrinsics.checkNotNullParameter(expr, "expr");
            this.expr = expr;
            this.tokens = Tokenizer.INSTANCE.tokenize(expr);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            Evaluable evaluable = this.expression;
            if (evaluable != null) {
                if (evaluable == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("expression");
                    evaluable = null;
                }
                return evaluable.getVariables();
            }
            List<Token> list = this.tokens;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof Token.Operand.Variable) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Token.Operand.Variable) it.next()).m7319unboximpl());
            }
            return arrayList2;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            initExpression();
            Unit unit = Unit.INSTANCE;
            Evaluable evaluable = this.expression;
            if (evaluable == null) {
                Intrinsics.throwUninitializedPropertyAccessException("expression");
                evaluable = null;
            }
            return evaluable.getDynamicVariables();
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        protected Object evalImpl(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            initExpression();
            Evaluable evaluable = this.expression;
            Evaluable evaluable2 = null;
            if (evaluable == null) {
                Intrinsics.throwUninitializedPropertyAccessException("expression");
                evaluable = null;
            }
            Object eval$div_evaluable = evaluable.eval$div_evaluable(evaluator);
            Evaluable evaluable3 = this.expression;
            if (evaluable3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("expression");
            } else {
                evaluable2 = evaluable3;
            }
            updateIsCacheable$div_evaluable(evaluable2.isCacheable);
            return eval$div_evaluable;
        }

        @NotNull
        /* renamed from: toString, reason: from getter */
        public String getExpr() {
            return this.expr;
        }

        private final void initExpression() {
            if (this.expression == null) {
                this.expression = Parser.INSTANCE.parse(this.tokens, getRawExpr());
            }
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\b\u0010!\u001a\u00020\u0006H\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000b¨\u0006\""}, d2 = {"Lcom/yandex/div/evaluable/Evaluable$Unary;", "Lcom/yandex/div/evaluable/Evaluable;", "token", "Lcom/yandex/div/evaluable/internal/Token$Operator;", "expression", "rawExpression", "", "(Lcom/yandex/div/evaluable/internal/Token$Operator;Lcom/yandex/div/evaluable/Evaluable;Ljava/lang/String;)V", "dynamicVariables", "", "getDynamicVariables", "()Ljava/util/List;", "getExpression", "()Lcom/yandex/div/evaluable/Evaluable;", "getRawExpression", "()Ljava/lang/String;", "getToken", "()Lcom/yandex/div/evaluable/internal/Token$Operator;", "variables", "getVariables", "component1", "component2", "component3", "copy", "equals", "", "other", "", "evalImpl", "evaluator", "Lcom/yandex/div/evaluable/Evaluator;", "hashCode", "", "toString", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Unary extends Evaluable {

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final Evaluable expression;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final Token.Operator token;

        @NotNull
        private final List<String> variables;

        public static /* synthetic */ Unary copy$default(Unary unary, Token.Operator operator, Evaluable evaluable, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                operator = unary.token;
            }
            if ((i & 2) != 0) {
                evaluable = unary.expression;
            }
            if ((i & 4) != 0) {
                str = unary.rawExpression;
            }
            return unary.copy(operator, evaluable, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Token.Operator getToken() {
            return this.token;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Evaluable getExpression() {
            return this.expression;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getRawExpression() {
            return this.rawExpression;
        }

        @NotNull
        public final Unary copy(@NotNull Token.Operator token, @NotNull Evaluable expression, @NotNull String rawExpression) {
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(expression, "expression");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            return new Unary(token, expression, rawExpression);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Unary)) {
                return false;
            }
            Unary unary = (Unary) other;
            return Intrinsics.areEqual(this.token, unary.token) && Intrinsics.areEqual(this.expression, unary.expression) && Intrinsics.areEqual(this.rawExpression, unary.rawExpression);
        }

        public int hashCode() {
            return (((this.token.hashCode() * 31) + this.expression.hashCode()) * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public final Token.Operator getToken() {
            return this.token;
        }

        @NotNull
        public final Evaluable getExpression() {
            return this.expression;
        }

        @NotNull
        public final String getRawExpression() {
            return this.rawExpression;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unary(@NotNull Token.Operator token, @NotNull Evaluable expression, @NotNull String rawExpression) {
            super(rawExpression);
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(expression, "expression");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.token = token;
            this.expression = expression;
            this.rawExpression = rawExpression;
            this.variables = expression.getVariables();
            this.dynamicVariables = expression.getDynamicVariables();
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        protected Object evalImpl(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.evalUnary$div_evaluable(this);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.token);
            sb.append(this.expression);
            return sb.toString();
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!H\u0014J\t\u0010\"\u001a\u00020#HÖ\u0001J\b\u0010$\u001a\u00020\u0007H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\f¨\u0006%"}, d2 = {"Lcom/yandex/div/evaluable/Evaluable$Binary;", "Lcom/yandex/div/evaluable/Evaluable;", "token", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary;", "left", "right", "rawExpression", "", "(Lcom/yandex/div/evaluable/internal/Token$Operator$Binary;Lcom/yandex/div/evaluable/Evaluable;Lcom/yandex/div/evaluable/Evaluable;Ljava/lang/String;)V", "dynamicVariables", "", "getDynamicVariables", "()Ljava/util/List;", "getLeft", "()Lcom/yandex/div/evaluable/Evaluable;", "getRawExpression", "()Ljava/lang/String;", "getRight", "getToken", "()Lcom/yandex/div/evaluable/internal/Token$Operator$Binary;", "variables", "getVariables", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "evalImpl", "evaluator", "Lcom/yandex/div/evaluable/Evaluator;", "hashCode", "", "toString", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Binary extends Evaluable {

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final Evaluable left;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final Evaluable right;

        @NotNull
        private final Token.Operator.Binary token;

        @NotNull
        private final List<String> variables;

        public static /* synthetic */ Binary copy$default(Binary binary, Token.Operator.Binary binary2, Evaluable evaluable, Evaluable evaluable2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                binary2 = binary.token;
            }
            if ((i & 2) != 0) {
                evaluable = binary.left;
            }
            if ((i & 4) != 0) {
                evaluable2 = binary.right;
            }
            if ((i & 8) != 0) {
                str = binary.rawExpression;
            }
            return binary.copy(binary2, evaluable, evaluable2, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Token.Operator.Binary getToken() {
            return this.token;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Evaluable getLeft() {
            return this.left;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Evaluable getRight() {
            return this.right;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getRawExpression() {
            return this.rawExpression;
        }

        @NotNull
        public final Binary copy(@NotNull Token.Operator.Binary token, @NotNull Evaluable left, @NotNull Evaluable right, @NotNull String rawExpression) {
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            return new Binary(token, left, right, rawExpression);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Binary)) {
                return false;
            }
            Binary binary = (Binary) other;
            return Intrinsics.areEqual(this.token, binary.token) && Intrinsics.areEqual(this.left, binary.left) && Intrinsics.areEqual(this.right, binary.right) && Intrinsics.areEqual(this.rawExpression, binary.rawExpression);
        }

        public int hashCode() {
            return (((((this.token.hashCode() * 31) + this.left.hashCode()) * 31) + this.right.hashCode()) * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public final Token.Operator.Binary getToken() {
            return this.token;
        }

        @NotNull
        public final Evaluable getLeft() {
            return this.left;
        }

        @NotNull
        public final Evaluable getRight() {
            return this.right;
        }

        @NotNull
        public final String getRawExpression() {
            return this.rawExpression;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Binary(@NotNull Token.Operator.Binary token, @NotNull Evaluable left, @NotNull Evaluable right, @NotNull String rawExpression) {
            super(rawExpression);
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.token = token;
            this.left = left;
            this.right = right;
            this.rawExpression = rawExpression;
            this.variables = CollectionsKt.plus((Collection) left.getVariables(), (Iterable) right.getVariables());
            this.dynamicVariables = CollectionsKt.plus((Collection) left.getDynamicVariables(), (Iterable) right.getDynamicVariables());
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        protected Object evalImpl(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.evalBinary$div_evaluable(this);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('(');
            sb.append(this.left);
            sb.append(' ');
            sb.append(this.token);
            sb.append(' ');
            sb.append(this.right);
            sb.append(')');
            return sb.toString();
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0001HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0001HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0001HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\u0010\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$H\u0014J\t\u0010%\u001a\u00020&HÖ\u0001J\b\u0010'\u001a\u00020\bH\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\r¨\u0006("}, d2 = {"Lcom/yandex/div/evaluable/Evaluable$Ternary;", "Lcom/yandex/div/evaluable/Evaluable;", "token", "Lcom/yandex/div/evaluable/internal/Token$Operator;", "firstExpression", "secondExpression", "thirdExpression", "rawExpression", "", "(Lcom/yandex/div/evaluable/internal/Token$Operator;Lcom/yandex/div/evaluable/Evaluable;Lcom/yandex/div/evaluable/Evaluable;Lcom/yandex/div/evaluable/Evaluable;Ljava/lang/String;)V", "dynamicVariables", "", "getDynamicVariables", "()Ljava/util/List;", "getFirstExpression", "()Lcom/yandex/div/evaluable/Evaluable;", "getRawExpression", "()Ljava/lang/String;", "getSecondExpression", "getThirdExpression", "getToken", "()Lcom/yandex/div/evaluable/internal/Token$Operator;", "variables", "getVariables", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "evalImpl", "evaluator", "Lcom/yandex/div/evaluable/Evaluator;", "hashCode", "", "toString", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Ternary extends Evaluable {

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final Evaluable firstExpression;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final Evaluable secondExpression;

        @NotNull
        private final Evaluable thirdExpression;

        @NotNull
        private final Token.Operator token;

        @NotNull
        private final List<String> variables;

        public static /* synthetic */ Ternary copy$default(Ternary ternary, Token.Operator operator, Evaluable evaluable, Evaluable evaluable2, Evaluable evaluable3, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                operator = ternary.token;
            }
            if ((i & 2) != 0) {
                evaluable = ternary.firstExpression;
            }
            Evaluable evaluable4 = evaluable;
            if ((i & 4) != 0) {
                evaluable2 = ternary.secondExpression;
            }
            Evaluable evaluable5 = evaluable2;
            if ((i & 8) != 0) {
                evaluable3 = ternary.thirdExpression;
            }
            Evaluable evaluable6 = evaluable3;
            if ((i & 16) != 0) {
                str = ternary.rawExpression;
            }
            return ternary.copy(operator, evaluable4, evaluable5, evaluable6, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Token.Operator getToken() {
            return this.token;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Evaluable getFirstExpression() {
            return this.firstExpression;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Evaluable getSecondExpression() {
            return this.secondExpression;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Evaluable getThirdExpression() {
            return this.thirdExpression;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getRawExpression() {
            return this.rawExpression;
        }

        @NotNull
        public final Ternary copy(@NotNull Token.Operator token, @NotNull Evaluable firstExpression, @NotNull Evaluable secondExpression, @NotNull Evaluable thirdExpression, @NotNull String rawExpression) {
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(firstExpression, "firstExpression");
            Intrinsics.checkNotNullParameter(secondExpression, "secondExpression");
            Intrinsics.checkNotNullParameter(thirdExpression, "thirdExpression");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            return new Ternary(token, firstExpression, secondExpression, thirdExpression, rawExpression);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ternary)) {
                return false;
            }
            Ternary ternary = (Ternary) other;
            return Intrinsics.areEqual(this.token, ternary.token) && Intrinsics.areEqual(this.firstExpression, ternary.firstExpression) && Intrinsics.areEqual(this.secondExpression, ternary.secondExpression) && Intrinsics.areEqual(this.thirdExpression, ternary.thirdExpression) && Intrinsics.areEqual(this.rawExpression, ternary.rawExpression);
        }

        public int hashCode() {
            return (((((((this.token.hashCode() * 31) + this.firstExpression.hashCode()) * 31) + this.secondExpression.hashCode()) * 31) + this.thirdExpression.hashCode()) * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public final Token.Operator getToken() {
            return this.token;
        }

        @NotNull
        public final Evaluable getFirstExpression() {
            return this.firstExpression;
        }

        @NotNull
        public final Evaluable getSecondExpression() {
            return this.secondExpression;
        }

        @NotNull
        public final Evaluable getThirdExpression() {
            return this.thirdExpression;
        }

        @NotNull
        public final String getRawExpression() {
            return this.rawExpression;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ternary(@NotNull Token.Operator token, @NotNull Evaluable firstExpression, @NotNull Evaluable secondExpression, @NotNull Evaluable thirdExpression, @NotNull String rawExpression) {
            super(rawExpression);
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(firstExpression, "firstExpression");
            Intrinsics.checkNotNullParameter(secondExpression, "secondExpression");
            Intrinsics.checkNotNullParameter(thirdExpression, "thirdExpression");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.token = token;
            this.firstExpression = firstExpression;
            this.secondExpression = secondExpression;
            this.thirdExpression = thirdExpression;
            this.rawExpression = rawExpression;
            this.variables = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) firstExpression.getVariables(), (Iterable) secondExpression.getVariables()), (Iterable) thirdExpression.getVariables());
            this.dynamicVariables = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) firstExpression.getDynamicVariables(), (Iterable) secondExpression.getDynamicVariables()), (Iterable) thirdExpression.getDynamicVariables());
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        protected Object evalImpl(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.evalTernary$div_evaluable(this);
        }

        @NotNull
        public String toString() {
            Token.Operator.TernaryIf ternaryIf = Token.Operator.TernaryIf.INSTANCE;
            Token.Operator.TernaryElse ternaryElse = Token.Operator.TernaryElse.INSTANCE;
            StringBuilder sb = new StringBuilder();
            sb.append('(');
            sb.append(this.firstExpression);
            sb.append(' ');
            sb.append(ternaryIf);
            sb.append(' ');
            sb.append(this.secondExpression);
            sb.append(' ');
            sb.append(ternaryElse);
            sb.append(' ');
            sb.append(this.thirdExpression);
            sb.append(')');
            return sb.toString();
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!H\u0014J\t\u0010\"\u001a\u00020#HÖ\u0001J\b\u0010$\u001a\u00020\u0007H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\f¨\u0006%"}, d2 = {"Lcom/yandex/div/evaluable/Evaluable$Try;", "Lcom/yandex/div/evaluable/Evaluable;", "token", "Lcom/yandex/div/evaluable/internal/Token$Operator$Try;", "tryExpression", "fallbackExpression", "rawExpression", "", "(Lcom/yandex/div/evaluable/internal/Token$Operator$Try;Lcom/yandex/div/evaluable/Evaluable;Lcom/yandex/div/evaluable/Evaluable;Ljava/lang/String;)V", "dynamicVariables", "", "getDynamicVariables", "()Ljava/util/List;", "getFallbackExpression", "()Lcom/yandex/div/evaluable/Evaluable;", "getRawExpression", "()Ljava/lang/String;", "getToken", "()Lcom/yandex/div/evaluable/internal/Token$Operator$Try;", "getTryExpression", "variables", "getVariables", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "evalImpl", "evaluator", "Lcom/yandex/div/evaluable/Evaluator;", "hashCode", "", "toString", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Try extends Evaluable {

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final Evaluable fallbackExpression;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final Token.Operator.Try token;

        @NotNull
        private final Evaluable tryExpression;

        @NotNull
        private final List<String> variables;

        public static /* synthetic */ Try copy$default(Try r0, Token.Operator.Try r1, Evaluable evaluable, Evaluable evaluable2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                r1 = r0.token;
            }
            if ((i & 2) != 0) {
                evaluable = r0.tryExpression;
            }
            if ((i & 4) != 0) {
                evaluable2 = r0.fallbackExpression;
            }
            if ((i & 8) != 0) {
                str = r0.rawExpression;
            }
            return r0.copy(r1, evaluable, evaluable2, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Token.Operator.Try getToken() {
            return this.token;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Evaluable getTryExpression() {
            return this.tryExpression;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Evaluable getFallbackExpression() {
            return this.fallbackExpression;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getRawExpression() {
            return this.rawExpression;
        }

        @NotNull
        public final Try copy(@NotNull Token.Operator.Try token, @NotNull Evaluable tryExpression, @NotNull Evaluable fallbackExpression, @NotNull String rawExpression) {
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(tryExpression, "tryExpression");
            Intrinsics.checkNotNullParameter(fallbackExpression, "fallbackExpression");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            return new Try(token, tryExpression, fallbackExpression, rawExpression);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Try)) {
                return false;
            }
            Try r5 = (Try) other;
            return Intrinsics.areEqual(this.token, r5.token) && Intrinsics.areEqual(this.tryExpression, r5.tryExpression) && Intrinsics.areEqual(this.fallbackExpression, r5.fallbackExpression) && Intrinsics.areEqual(this.rawExpression, r5.rawExpression);
        }

        public int hashCode() {
            return (((((this.token.hashCode() * 31) + this.tryExpression.hashCode()) * 31) + this.fallbackExpression.hashCode()) * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public final Token.Operator.Try getToken() {
            return this.token;
        }

        @NotNull
        public final Evaluable getTryExpression() {
            return this.tryExpression;
        }

        @NotNull
        public final Evaluable getFallbackExpression() {
            return this.fallbackExpression;
        }

        @NotNull
        public final String getRawExpression() {
            return this.rawExpression;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Try(@NotNull Token.Operator.Try token, @NotNull Evaluable tryExpression, @NotNull Evaluable fallbackExpression, @NotNull String rawExpression) {
            super(rawExpression);
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(tryExpression, "tryExpression");
            Intrinsics.checkNotNullParameter(fallbackExpression, "fallbackExpression");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.token = token;
            this.tryExpression = tryExpression;
            this.fallbackExpression = fallbackExpression;
            this.rawExpression = rawExpression;
            this.variables = CollectionsKt.plus((Collection) tryExpression.getVariables(), (Iterable) fallbackExpression.getVariables());
            this.dynamicVariables = CollectionsKt.plus((Collection) tryExpression.getDynamicVariables(), (Iterable) fallbackExpression.getDynamicVariables());
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        protected Object evalImpl(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.evalTry$div_evaluable(this);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('(');
            sb.append(this.tryExpression);
            sb.append(' ');
            sb.append(this.token);
            sb.append(' ');
            sb.append(this.fallbackExpression);
            sb.append(')');
            return sb.toString();
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J-\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\b\u0010 \u001a\u00020\u0007H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\n¨\u0006!"}, d2 = {"Lcom/yandex/div/evaluable/Evaluable$MethodCall;", "Lcom/yandex/div/evaluable/Evaluable;", "token", "Lcom/yandex/div/evaluable/internal/Token$Function;", "arguments", "", "rawExpression", "", "(Lcom/yandex/div/evaluable/internal/Token$Function;Ljava/util/List;Ljava/lang/String;)V", "getArguments", "()Ljava/util/List;", "dynamicVariables", "getDynamicVariables", "getRawExpression", "()Ljava/lang/String;", "getToken", "()Lcom/yandex/div/evaluable/internal/Token$Function;", "variables", "getVariables", "component1", "component2", "component3", "copy", "equals", "", "other", "", "evalImpl", "evaluator", "Lcom/yandex/div/evaluable/Evaluator;", "hashCode", "", "toString", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class MethodCall extends Evaluable {

        @NotNull
        private final List<Evaluable> arguments;

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final Token.Function token;

        @NotNull
        private final List<String> variables;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MethodCall copy$default(MethodCall methodCall, Token.Function function, List list, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                function = methodCall.token;
            }
            if ((i & 2) != 0) {
                list = methodCall.arguments;
            }
            if ((i & 4) != 0) {
                str = methodCall.rawExpression;
            }
            return methodCall.copy(function, list, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Token.Function getToken() {
            return this.token;
        }

        @NotNull
        public final List<Evaluable> component2() {
            return this.arguments;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getRawExpression() {
            return this.rawExpression;
        }

        @NotNull
        public final MethodCall copy(@NotNull Token.Function token, @NotNull List<? extends Evaluable> arguments, @NotNull String rawExpression) {
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            return new MethodCall(token, arguments, rawExpression);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MethodCall)) {
                return false;
            }
            MethodCall methodCall = (MethodCall) other;
            return Intrinsics.areEqual(this.token, methodCall.token) && Intrinsics.areEqual(this.arguments, methodCall.arguments) && Intrinsics.areEqual(this.rawExpression, methodCall.rawExpression);
        }

        public int hashCode() {
            return (((this.token.hashCode() * 31) + this.arguments.hashCode()) * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public final Token.Function getToken() {
            return this.token;
        }

        @NotNull
        public final List<Evaluable> getArguments() {
            return this.arguments;
        }

        @NotNull
        public final String getRawExpression() {
            return this.rawExpression;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public MethodCall(@NotNull Token.Function token, @NotNull List<? extends Evaluable> arguments, @NotNull String rawExpression) {
            super(rawExpression);
            Object next;
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.token = token;
            this.arguments = arguments;
            this.rawExpression = rawExpression;
            List<? extends Evaluable> list = arguments;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Evaluable) it.next()).getVariables());
            }
            Iterator it2 = arrayList.iterator();
            Object obj = null;
            if (it2.hasNext()) {
                next = it2.next();
                while (it2.hasNext()) {
                    next = CollectionsKt.plus((Collection) next, (Iterable) it2.next());
                }
            } else {
                next = null;
            }
            List<String> list2 = (List) next;
            this.variables = list2 == null ? CollectionsKt.emptyList() : list2;
            List<Evaluable> list3 = this.arguments;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((Evaluable) it3.next()).getDynamicVariables());
            }
            Iterator it4 = arrayList2.iterator();
            if (it4.hasNext()) {
                obj = it4.next();
                while (it4.hasNext()) {
                    obj = CollectionsKt.plus((Collection) obj, (Iterable) it4.next());
                }
            }
            List<Evaluable> list4 = (List) obj;
            this.dynamicVariables = list4 == null ? CollectionsKt.emptyList() : list4;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        protected Object evalImpl(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.evalMethodCall$div_evaluable(this);
        }

        @NotNull
        public String toString() {
            String str;
            if (this.arguments.size() > 1) {
                List<Evaluable> list = this.arguments;
                str = CollectionsKt.joinToString$default(list.subList(1, list.size()), Token.Function.ArgumentDelimiter.INSTANCE.toString(), null, null, 0, null, null, 62, null);
            } else {
                str = "";
            }
            return CollectionsKt.first((List) this.arguments) + '.' + this.token.getName() + '(' + str + ')';
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J-\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0002J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\b\u0010!\u001a\u00020\u0007H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\n¨\u0006\""}, d2 = {"Lcom/yandex/div/evaluable/Evaluable$FunctionCall;", "Lcom/yandex/div/evaluable/Evaluable;", "token", "Lcom/yandex/div/evaluable/internal/Token$Function;", "arguments", "", "rawExpression", "", "(Lcom/yandex/div/evaluable/internal/Token$Function;Ljava/util/List;Ljava/lang/String;)V", "getArguments", "()Ljava/util/List;", "dynamicVariables", "getDynamicVariables", "getRawExpression", "()Ljava/lang/String;", "getToken", "()Lcom/yandex/div/evaluable/internal/Token$Function;", "variables", "getVariables", "component1", "component2", "component3", "copy", "equals", "", "other", "", "evalImpl", "evaluator", "Lcom/yandex/div/evaluable/Evaluator;", "findDynamicVariables", "hashCode", "", "toString", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class FunctionCall extends Evaluable {

        @NotNull
        private final List<Evaluable> arguments;

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final Token.Function token;

        @NotNull
        private final List<String> variables;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FunctionCall copy$default(FunctionCall functionCall, Token.Function function, List list, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                function = functionCall.token;
            }
            if ((i & 2) != 0) {
                list = functionCall.arguments;
            }
            if ((i & 4) != 0) {
                str = functionCall.rawExpression;
            }
            return functionCall.copy(function, list, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Token.Function getToken() {
            return this.token;
        }

        @NotNull
        public final List<Evaluable> component2() {
            return this.arguments;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getRawExpression() {
            return this.rawExpression;
        }

        @NotNull
        public final FunctionCall copy(@NotNull Token.Function token, @NotNull List<? extends Evaluable> arguments, @NotNull String rawExpression) {
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            return new FunctionCall(token, arguments, rawExpression);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FunctionCall)) {
                return false;
            }
            FunctionCall functionCall = (FunctionCall) other;
            return Intrinsics.areEqual(this.token, functionCall.token) && Intrinsics.areEqual(this.arguments, functionCall.arguments) && Intrinsics.areEqual(this.rawExpression, functionCall.rawExpression);
        }

        public int hashCode() {
            return (((this.token.hashCode() * 31) + this.arguments.hashCode()) * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public final Token.Function getToken() {
            return this.token;
        }

        @NotNull
        public final List<Evaluable> getArguments() {
            return this.arguments;
        }

        @NotNull
        public final String getRawExpression() {
            return this.rawExpression;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FunctionCall(@NotNull Token.Function token, @NotNull List<? extends Evaluable> arguments, @NotNull String rawExpression) {
            super(rawExpression);
            Object obj;
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.token = token;
            this.arguments = arguments;
            this.rawExpression = rawExpression;
            List<? extends Evaluable> list = arguments;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Evaluable) it.next()).getVariables());
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                while (it2.hasNext()) {
                    next = CollectionsKt.plus((Collection) next, (Iterable) it2.next());
                }
                obj = next;
            } else {
                obj = null;
            }
            List<String> list2 = (List) obj;
            this.variables = list2 == null ? CollectionsKt.emptyList() : list2;
            this.dynamicVariables = findDynamicVariables();
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        protected Object evalImpl(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.evalFunctionCall$div_evaluable(this);
        }

        @NotNull
        public String toString() {
            return this.token.getName() + '(' + CollectionsKt.joinToString$default(this.arguments, Token.Function.ArgumentDelimiter.INSTANCE.toString(), null, null, 0, null, null, 62, null) + ')';
        }

        private final List<Evaluable> findDynamicVariables() {
            Object obj;
            List<Evaluable> emptyList = Evaluable.INSTANCE.getFunctionsWithVariableName$div_evaluable().contains(this.token.getName()) ? this.arguments : CollectionsKt.emptyList();
            List<Evaluable> list = this.arguments;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Evaluable) it.next()).getDynamicVariables());
            }
            Iterator it2 = CollectionsKt.plus((Collection) arrayList, (Iterable) CollectionsKt.listOf(emptyList)).iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                while (it2.hasNext()) {
                    next = CollectionsKt.plus((Collection) next, (Iterable) it2.next());
                }
                obj = next;
            } else {
                obj = null;
            }
            List<Evaluable> list2 = (List) obj;
            return list2 == null ? CollectionsKt.emptyList() : list2;
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J#\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\b\u0010\u001b\u001a\u00020\u0005H\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/yandex/div/evaluable/Evaluable$StringTemplate;", "Lcom/yandex/div/evaluable/Evaluable;", "arguments", "", "rawExpression", "", "(Ljava/util/List;Ljava/lang/String;)V", "getArguments", "()Ljava/util/List;", "dynamicVariables", "getDynamicVariables", "getRawExpression", "()Ljava/lang/String;", "variables", "getVariables", "component1", "component2", "copy", "equals", "", "other", "", "evalImpl", "evaluator", "Lcom/yandex/div/evaluable/Evaluator;", "hashCode", "", "toString", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class StringTemplate extends Evaluable {

        @NotNull
        private final List<Evaluable> arguments;

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final List<String> variables;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StringTemplate copy$default(StringTemplate stringTemplate, List list, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = stringTemplate.arguments;
            }
            if ((i & 2) != 0) {
                str = stringTemplate.rawExpression;
            }
            return stringTemplate.copy(list, str);
        }

        @NotNull
        public final List<Evaluable> component1() {
            return this.arguments;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getRawExpression() {
            return this.rawExpression;
        }

        @NotNull
        public final StringTemplate copy(@NotNull List<? extends Evaluable> arguments, @NotNull String rawExpression) {
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            return new StringTemplate(arguments, rawExpression);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StringTemplate)) {
                return false;
            }
            StringTemplate stringTemplate = (StringTemplate) other;
            return Intrinsics.areEqual(this.arguments, stringTemplate.arguments) && Intrinsics.areEqual(this.rawExpression, stringTemplate.rawExpression);
        }

        public int hashCode() {
            return (this.arguments.hashCode() * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public final List<Evaluable> getArguments() {
            return this.arguments;
        }

        @NotNull
        public final String getRawExpression() {
            return this.rawExpression;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public StringTemplate(@NotNull List<? extends Evaluable> arguments, @NotNull String rawExpression) {
            super(rawExpression);
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.arguments = arguments;
            this.rawExpression = rawExpression;
            List<? extends Evaluable> list = arguments;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Evaluable) it.next()).getVariables());
            }
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it2.next();
            while (it2.hasNext()) {
                next = CollectionsKt.plus((Collection) next, (Iterable) it2.next());
            }
            this.variables = (List) next;
            List<Evaluable> list2 = this.arguments;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((Evaluable) it3.next()).getDynamicVariables());
            }
            Iterator it4 = arrayList2.iterator();
            if (!it4.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next2 = it4.next();
            while (it4.hasNext()) {
                next2 = CollectionsKt.plus((Collection) next2, (Iterable) it4.next());
            }
            this.dynamicVariables = (List) next2;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        protected Object evalImpl(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.evalStringTemplate$div_evaluable(this);
        }

        @NotNull
        public String toString() {
            return CollectionsKt.joinToString$default(this.arguments, "", null, null, 0, null, null, 62, null);
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0011\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\fJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J*\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\b\u0010 \u001a\u00020\u0005H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\n\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Lcom/yandex/div/evaluable/Evaluable$Variable;", "Lcom/yandex/div/evaluable/Evaluable;", "token", "Lcom/yandex/div/evaluable/internal/Token$Operand$Variable;", "rawExpression", "", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "dynamicVariables", "", "getDynamicVariables", "()Ljava/util/List;", "getRawExpression", "()Ljava/lang/String;", "getToken-A4lXSVo", "Ljava/lang/String;", "variables", "getVariables", "component1", "component1-A4lXSVo", "component2", "copy", "copy-VWWhtj0", "(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/div/evaluable/Evaluable$Variable;", "equals", "", "other", "", "evalImpl", "evaluator", "Lcom/yandex/div/evaluable/Evaluator;", "hashCode", "", "toString", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Variable extends Evaluable {

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final String token;

        @NotNull
        private final List<String> variables;

        public /* synthetic */ Variable(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        /* renamed from: copy-VWWhtj0$default, reason: not valid java name */
        public static /* synthetic */ Variable m7268copyVWWhtj0$default(Variable variable, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = variable.token;
            }
            if ((i & 2) != 0) {
                str2 = variable.rawExpression;
            }
            return variable.m7270copyVWWhtj0(str, str2);
        }

        @NotNull
        /* renamed from: component1-A4lXSVo, reason: not valid java name and from getter */
        public final String getToken() {
            return this.token;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getRawExpression() {
            return this.rawExpression;
        }

        @NotNull
        /* renamed from: copy-VWWhtj0, reason: not valid java name */
        public final Variable m7270copyVWWhtj0(@NotNull String token, @NotNull String rawExpression) {
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            return new Variable(token, rawExpression, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Variable)) {
                return false;
            }
            Variable variable = (Variable) other;
            return Token.Operand.Variable.m7316equalsimpl0(this.token, variable.token) && Intrinsics.areEqual(this.rawExpression, variable.rawExpression);
        }

        public int hashCode() {
            return (Token.Operand.Variable.m7317hashCodeimpl(this.token) * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        /* renamed from: getToken-A4lXSVo, reason: not valid java name */
        public final String m7271getTokenA4lXSVo() {
            return this.token;
        }

        @NotNull
        public final String getRawExpression() {
            return this.rawExpression;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private Variable(String token, String rawExpression) {
            super(rawExpression);
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.token = token;
            this.rawExpression = rawExpression;
            this.variables = CollectionsKt.listOf(token);
            this.dynamicVariables = CollectionsKt.emptyList();
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        protected Object evalImpl(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.evalVariable$div_evaluable(this);
        }

        @NotNull
        public String toString() {
            return this.token;
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\b\u0010\u001d\u001a\u00020\u0005H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/yandex/div/evaluable/Evaluable$Value;", "Lcom/yandex/div/evaluable/Evaluable;", "token", "Lcom/yandex/div/evaluable/internal/Token$Operand$Literal;", "rawExpression", "", "(Lcom/yandex/div/evaluable/internal/Token$Operand$Literal;Ljava/lang/String;)V", "dynamicVariables", "", "getDynamicVariables", "()Ljava/util/List;", "getRawExpression", "()Ljava/lang/String;", "getToken", "()Lcom/yandex/div/evaluable/internal/Token$Operand$Literal;", "variables", "getVariables", "component1", "component2", "copy", "equals", "", "other", "", "evalImpl", "evaluator", "Lcom/yandex/div/evaluable/Evaluator;", "hashCode", "", "toString", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Value extends Evaluable {

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final Token.Operand.Literal token;

        @NotNull
        private final List<String> variables;

        public static /* synthetic */ Value copy$default(Value value, Token.Operand.Literal literal, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                literal = value.token;
            }
            if ((i & 2) != 0) {
                str = value.rawExpression;
            }
            return value.copy(literal, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Token.Operand.Literal getToken() {
            return this.token;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getRawExpression() {
            return this.rawExpression;
        }

        @NotNull
        public final Value copy(@NotNull Token.Operand.Literal token, @NotNull String rawExpression) {
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            return new Value(token, rawExpression);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Value)) {
                return false;
            }
            Value value = (Value) other;
            return Intrinsics.areEqual(this.token, value.token) && Intrinsics.areEqual(this.rawExpression, value.rawExpression);
        }

        public int hashCode() {
            return (this.token.hashCode() * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public final Token.Operand.Literal getToken() {
            return this.token;
        }

        @NotNull
        public final String getRawExpression() {
            return this.rawExpression;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Value(@NotNull Token.Operand.Literal token, @NotNull String rawExpression) {
            super(rawExpression);
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.token = token;
            this.rawExpression = rawExpression;
            this.variables = CollectionsKt.emptyList();
            this.dynamicVariables = CollectionsKt.emptyList();
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        protected Object evalImpl(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.evalValue$div_evaluable(this);
        }

        @NotNull
        public String toString() {
            Token.Operand.Literal literal = this.token;
            if (literal instanceof Token.Operand.Literal.Str) {
                return '\'' + ((Token.Operand.Literal.Str) this.token).m7312unboximpl() + '\'';
            }
            if (literal instanceof Token.Operand.Literal.Num) {
                return ((Token.Operand.Literal.Num) literal).m7305unboximpl().toString();
            }
            if (literal instanceof Token.Operand.Literal.Bool) {
                return String.valueOf(((Token.Operand.Literal.Bool) literal).m7298unboximpl());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/yandex/div/evaluable/Evaluable$Companion;", "", "()V", "functionsWithVariableName", "", "", "getFunctionsWithVariableName$div_evaluable", "()Ljava/util/Set;", "lazy", "Lcom/yandex/div/evaluable/Evaluable;", "expr", "prepare", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final Evaluable prepare(@NotNull String expr) {
            Intrinsics.checkNotNullParameter(expr, "expr");
            return Parser.INSTANCE.parse(Tokenizer.INSTANCE.tokenize(expr), expr);
        }

        @NotNull
        public final Evaluable lazy(@NotNull String expr) {
            Intrinsics.checkNotNullParameter(expr, "expr");
            return new Lazy(expr);
        }

        @NotNull
        public final Set<String> getFunctionsWithVariableName$div_evaluable() {
            return Evaluable.functionsWithVariableName;
        }
    }
}
