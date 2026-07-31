package com.yandex.div.evaluable;

import androidx.core.app.NotificationCompat;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.internal.Token;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.DateTime;
import com.yandex.div.evaluable.types.Url;
import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Evaluator.kt */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 H2\u00020\u0001:\u0001HB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0012J$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0012J\u001b\u0010\u0010\u001a\u0002H\u0011\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016¢\u0006\u0002\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0017H\u0010¢\u0006\u0002\b\u0018J5\u0010\u0019\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u0002H\u00110\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\t\u001a\u0002H\u00112\u0006\u0010\n\u001a\u0002H\u0011H\u0012¢\u0006\u0002\u0010\u001dJ \u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0012J \u0010\u001f\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020 2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0012J\u0015\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#H\u0010¢\u0006\u0002\b$J&\u0010%\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020&2\u0006\u0010\t\u001a\u00020\u00012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010(H\u0012J\u0015\u0010)\u001a\u00020\u00012\u0006\u0010*\u001a\u00020+H\u0010¢\u0006\u0002\b,J\u0015\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0010¢\u0006\u0002\b1J\u0015\u00102\u001a\u00020\u00012\u0006\u00103\u001a\u000204H\u0010¢\u0006\u0002\b5J\u0015\u00106\u001a\u00020\u00012\u0006\u00107\u001a\u000208H\u0010¢\u0006\u0002\b9J\u0015\u0010:\u001a\u00020\u00012\u0006\u0010;\u001a\u00020<H\u0010¢\u0006\u0002\b=J\u0015\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020@H\u0010¢\u0006\u0002\bAJ\u0015\u0010B\u001a\u00020\u00012\u0006\u0010?\u001a\u00020CH\u0010¢\u0006\u0002\bDJ\u0014\u0010E\u001a\u00020\u0001*\u00020\u00012\u0006\u0010F\u001a\u00020GH\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006I"}, d2 = {"Lcom/yandex/div/evaluable/Evaluator;", "", "evaluationContext", "Lcom/yandex/div/evaluable/EvaluationContext;", "(Lcom/yandex/div/evaluable/EvaluationContext;)V", "getEvaluationContext", "()Lcom/yandex/div/evaluable/EvaluationContext;", "castArgumentsIfNeeded", "Lkotlin/Pair;", "left", "right", "castEvalArgumentsIfNeeded", "", "function", "Lcom/yandex/div/evaluable/Function;", "args", "eval", "T", "expr", "Lcom/yandex/div/evaluable/Evaluable;", "(Lcom/yandex/div/evaluable/Evaluable;)Ljava/lang/Object;", "evalBinary", BuildConfig.SDK_DEPENDENCY, "Lcom/yandex/div/evaluable/Evaluable$Binary;", "evalBinary$div_evaluable", "evalComparableTypes", "", "operator", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison;", "(Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Comparison;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Object;", "evalComparison", "evalEquality", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Equality;", "evalFunctionCall", "functionCall", "Lcom/yandex/div/evaluable/Evaluable$FunctionCall;", "evalFunctionCall$div_evaluable", "evalLogical", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Logical;", "rightEvaluator", "Lkotlin/Function0;", "evalMethodCall", "methodCall", "Lcom/yandex/div/evaluable/Evaluable$MethodCall;", "evalMethodCall$div_evaluable", "evalStringTemplate", "", "stringTemplate", "Lcom/yandex/div/evaluable/Evaluable$StringTemplate;", "evalStringTemplate$div_evaluable", "evalTernary", "ternary", "Lcom/yandex/div/evaluable/Evaluable$Ternary;", "evalTernary$div_evaluable", "evalTry", "tryEvaluable", "Lcom/yandex/div/evaluable/Evaluable$Try;", "evalTry$div_evaluable", "evalUnary", "unary", "Lcom/yandex/div/evaluable/Evaluable$Unary;", "evalUnary$div_evaluable", "evalValue", NotificationCompat.CATEGORY_CALL, "Lcom/yandex/div/evaluable/Evaluable$Value;", "evalValue$div_evaluable", "evalVariable", "Lcom/yandex/div/evaluable/Evaluable$Variable;", "evalVariable$div_evaluable", "castIfPossible", "type", "Lcom/yandex/div/evaluable/EvaluableType;", "Companion", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public class Evaluator {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final EvaluationContext evaluationContext;

    /* compiled from: Evaluator.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EvaluableType.values().length];
            try {
                iArr[EvaluableType.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Evaluator(@NotNull EvaluationContext evaluationContext) {
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        this.evaluationContext = evaluationContext;
    }

    @NotNull
    public EvaluationContext getEvaluationContext() {
        return this.evaluationContext;
    }

    public <T> T eval(@NotNull Evaluable expr) throws EvaluableException {
        Intrinsics.checkNotNullParameter(expr, "expr");
        try {
            return (T) expr.eval$div_evaluable(this);
        } catch (EvaluableException e) {
            throw e;
        } catch (Exception e2) {
            String message = e2.getMessage();
            if (message == null) {
                message = "";
            }
            throw new EvaluableException(message, e2);
        }
    }

    @NotNull
    public Object evalUnary$div_evaluable(@NotNull Evaluable.Unary unary) {
        Intrinsics.checkNotNullParameter(unary, "unary");
        Object eval = eval(unary.getExpression());
        unary.updateIsCacheable$div_evaluable(unary.getExpression().getIsCacheable());
        Token.Operator token = unary.getToken();
        if (token instanceof Token.Operator.Unary.Plus) {
            if (eval instanceof Long) {
                return Long.valueOf(((Number) eval).longValue());
            }
            if (eval instanceof Double) {
                return Double.valueOf(((Number) eval).doubleValue());
            }
            StringBuilder sb = new StringBuilder();
            sb.append('+');
            sb.append(eval);
            EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(sb.toString(), "A Number is expected after a unary plus.", null, 4, null);
            throw new KotlinNothingValueException();
        }
        if (token instanceof Token.Operator.Unary.Minus) {
            if (eval instanceof Long) {
                return Long.valueOf(-((Number) eval).longValue());
            }
            if (eval instanceof Double) {
                return Double.valueOf(-((Number) eval).doubleValue());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append('-');
            sb2.append(eval);
            EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(sb2.toString(), "A Number is expected after a unary minus.", null, 4, null);
            throw new KotlinNothingValueException();
        }
        if (Intrinsics.areEqual(token, Token.Operator.Unary.Not.INSTANCE)) {
            if (!(eval instanceof Boolean)) {
                String str = eval instanceof String ? "'" : "";
                EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default('!' + str + eval + str, "A Boolean is expected after a unary not.", null, 4, null);
                throw new KotlinNothingValueException();
            }
            return Boolean.valueOf(!((Boolean) eval).booleanValue());
        }
        throw new EvaluableException(unary.getToken() + " was incorrectly parsed as a unary operator.", null, 2, null);
    }

    @NotNull
    public Object evalBinary$div_evaluable(@NotNull final Evaluable.Binary binary) {
        Intrinsics.checkNotNullParameter(binary, "binary");
        Object eval = eval(binary.getLeft());
        binary.updateIsCacheable$div_evaluable(binary.getLeft().getIsCacheable());
        if (binary.getToken() instanceof Token.Operator.Binary.Logical) {
            return evalLogical((Token.Operator.Binary.Logical) binary.getToken(), eval, new Function0() { // from class: com.yandex.div.evaluable.Evaluator$evalBinary$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    Object eval2 = Evaluator.this.eval(binary.getRight());
                    Evaluable.Binary binary2 = binary;
                    binary2.updateIsCacheable$div_evaluable(binary2.getRight().getIsCacheable());
                    return eval2;
                }
            });
        }
        Object eval2 = eval(binary.getRight());
        binary.updateIsCacheable$div_evaluable(binary.getRight().getIsCacheable());
        Pair<Object, Object> castArgumentsIfNeeded = castArgumentsIfNeeded(eval, eval2);
        Object component1 = castArgumentsIfNeeded.component1();
        Object component2 = castArgumentsIfNeeded.component2();
        if (!Intrinsics.areEqual(component1.getClass(), component2.getClass())) {
            EvaluableExceptionKt.throwExceptionOnEvaluationFailed(binary.getToken(), component1, component2);
            throw new KotlinNothingValueException();
        }
        Token.Operator.Binary token = binary.getToken();
        if (token instanceof Token.Operator.Binary.Equality) {
            return evalEquality((Token.Operator.Binary.Equality) binary.getToken(), component1, component2);
        }
        if (token instanceof Token.Operator.Binary.Sum) {
            return INSTANCE.evalSum$div_evaluable((Token.Operator.Binary.Sum) binary.getToken(), component1, component2);
        }
        if (token instanceof Token.Operator.Binary.Factor) {
            return INSTANCE.evalFactor$div_evaluable((Token.Operator.Binary.Factor) binary.getToken(), component1, component2);
        }
        if (token instanceof Token.Operator.Binary.Comparison) {
            return evalComparison((Token.Operator.Binary.Comparison) binary.getToken(), component1, component2);
        }
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed(binary.getToken(), component1, component2);
        throw new KotlinNothingValueException();
    }

    private Object evalLogical(Token.Operator.Binary.Logical operator, Object left, Function0 rightEvaluator) {
        if (!(left instanceof Boolean)) {
            EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(left + ' ' + operator + " ...", '\'' + operator + "' must be called with boolean operands.", null, 4, null);
            throw new KotlinNothingValueException();
        }
        boolean z = operator instanceof Token.Operator.Binary.Logical.Or;
        if (z && ((Boolean) left).booleanValue()) {
            return left;
        }
        if ((operator instanceof Token.Operator.Binary.Logical.And) && !((Boolean) left).booleanValue()) {
            return left;
        }
        Object mo4828invoke = rightEvaluator.mo4828invoke();
        if (!(mo4828invoke instanceof Boolean)) {
            EvaluableExceptionKt.throwExceptionOnEvaluationFailed(operator, left, mo4828invoke);
            throw new KotlinNothingValueException();
        }
        boolean z2 = true;
        if (!z ? !((Boolean) left).booleanValue() || !((Boolean) mo4828invoke).booleanValue() : !((Boolean) left).booleanValue() && !((Boolean) mo4828invoke).booleanValue()) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    private Object evalEquality(Token.Operator.Binary.Equality operator, Object left, Object right) {
        boolean z;
        if (operator instanceof Token.Operator.Binary.Equality.Equal) {
            z = Intrinsics.areEqual(left, right);
        } else {
            if (!(operator instanceof Token.Operator.Binary.Equality.NotEqual)) {
                throw new NoWhenBranchMatchedException();
            }
            z = !Intrinsics.areEqual(left, right);
        }
        return Boolean.valueOf(z);
    }

    private Object evalComparison(Token.Operator.Binary.Comparison operator, Object left, Object right) {
        if ((left instanceof Double) && (right instanceof Double)) {
            return evalComparableTypes(operator, (Comparable) left, (Comparable) right);
        }
        if ((left instanceof Long) && (right instanceof Long)) {
            return evalComparableTypes(operator, (Comparable) left, (Comparable) right);
        }
        if ((left instanceof DateTime) && (right instanceof DateTime)) {
            return evalComparableTypes(operator, (Comparable) left, (Comparable) right);
        }
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed(operator, left, right);
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
    
        if (r5.compareTo(r6) <= 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0021, code lost:
    
        if (r5.compareTo(r6) >= 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        if (r5.compareTo(r6) > 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r5.compareTo(r6) < 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
    
        return java.lang.Boolean.valueOf(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private <T extends Comparable<? super T>> Object evalComparableTypes(Token.Operator.Binary.Comparison operator, T left, T right) {
        boolean z = false;
        if (!(operator instanceof Token.Operator.Binary.Comparison.Less)) {
            if (!(operator instanceof Token.Operator.Binary.Comparison.LessOrEqual)) {
                if (!(operator instanceof Token.Operator.Binary.Comparison.GreaterOrEqual)) {
                    if (!(operator instanceof Token.Operator.Binary.Comparison.Greater)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        }
    }

    @NotNull
    public Object evalTernary$div_evaluable(@NotNull Evaluable.Ternary ternary) {
        Intrinsics.checkNotNullParameter(ternary, "ternary");
        if (ternary.getToken() instanceof Token.Operator.TernaryIfElse) {
            Object eval = eval(ternary.getFirstExpression());
            ternary.updateIsCacheable$div_evaluable(ternary.getFirstExpression().getIsCacheable());
            if (!(eval instanceof Boolean)) {
                EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(ternary.getFirstExpression() + " ? " + ternary.getSecondExpression() + " : " + ternary.getThirdExpression(), "Ternary must be called with a Boolean value as a condition.", null, 4, null);
                throw new KotlinNothingValueException();
            }
            if (((Boolean) eval).booleanValue()) {
                Object eval2 = eval(ternary.getSecondExpression());
                ternary.updateIsCacheable$div_evaluable(ternary.getSecondExpression().getIsCacheable());
                return eval2;
            }
            Object eval3 = eval(ternary.getThirdExpression());
            ternary.updateIsCacheable$div_evaluable(ternary.getThirdExpression().getIsCacheable());
            return eval3;
        }
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(ternary.getRawExpr(), ternary.getToken() + " was incorrectly parsed as a ternary operator.", null, 4, null);
        throw new KotlinNothingValueException();
    }

    @NotNull
    public Object evalTry$div_evaluable(@NotNull Evaluable.Try tryEvaluable) {
        Object m8023constructorimpl;
        Intrinsics.checkNotNullParameter(tryEvaluable, "tryEvaluable");
        try {
            Result.Companion companion = Result.INSTANCE;
            Object eval = eval(tryEvaluable.getTryExpression());
            tryEvaluable.updateIsCacheable$div_evaluable(tryEvaluable.getTryExpression().getIsCacheable());
            m8023constructorimpl = Result.m8023constructorimpl(eval);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8026exceptionOrNullimpl(m8023constructorimpl) == null) {
            return m8023constructorimpl;
        }
        Object eval2 = eval(tryEvaluable.getFallbackExpression());
        tryEvaluable.updateIsCacheable$div_evaluable(tryEvaluable.getFallbackExpression().getIsCacheable());
        return eval2;
    }

    @NotNull
    public Object evalMethodCall$div_evaluable(@NotNull Evaluable.MethodCall methodCall) {
        EvaluableType evaluableType;
        Intrinsics.checkNotNullParameter(methodCall, "methodCall");
        ArrayList arrayList = new ArrayList();
        for (Evaluable evaluable : methodCall.getArguments()) {
            arrayList.add(eval(evaluable));
            methodCall.updateIsCacheable$div_evaluable(evaluable.getIsCacheable());
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (Object obj : arrayList) {
            EvaluableType.Companion companion = EvaluableType.INSTANCE;
            if (obj instanceof Long) {
                evaluableType = EvaluableType.INTEGER;
            } else if (obj instanceof Double) {
                evaluableType = EvaluableType.NUMBER;
            } else if (obj instanceof Boolean) {
                evaluableType = EvaluableType.BOOLEAN;
            } else if (obj instanceof String) {
                evaluableType = EvaluableType.STRING;
            } else if (obj instanceof DateTime) {
                evaluableType = EvaluableType.DATETIME;
            } else if (obj instanceof Color) {
                evaluableType = EvaluableType.COLOR;
            } else if (obj instanceof Url) {
                evaluableType = EvaluableType.URL;
            } else if (obj instanceof JSONObject) {
                evaluableType = EvaluableType.DICT;
            } else {
                if (!(obj instanceof JSONArray)) {
                    if (obj == null) {
                        throw new EvaluableException("Unable to find type for null", null, 2, null);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to find type for ");
                    Intrinsics.checkNotNull(obj);
                    sb.append(obj.getClass().getName());
                    throw new EvaluableException(sb.toString(), null, 2, null);
                }
                evaluableType = EvaluableType.ARRAY;
            }
            arrayList2.add(evaluableType);
        }
        try {
            Function method = getEvaluationContext().getFunctionProvider().getMethod(methodCall.getToken().getName(), arrayList2);
            Evaluable m7273constructorimpl = ExpressionContext.m7273constructorimpl(methodCall);
            methodCall.updateIsCacheable$div_evaluable(method.getIsPure());
            return method.m7279invokeex6DHhM(getEvaluationContext(), m7273constructorimpl, castEvalArgumentsIfNeeded(method, arrayList));
        } catch (EvaluableException e) {
            String name = methodCall.getToken().getName();
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            EvaluableExceptionKt.throwExceptionOnMethodEvaluationFailed(name, arrayList, message, e);
            throw new KotlinNothingValueException();
        }
    }

    @NotNull
    public Object evalFunctionCall$div_evaluable(@NotNull Evaluable.FunctionCall functionCall) {
        EvaluableType evaluableType;
        Intrinsics.checkNotNullParameter(functionCall, "functionCall");
        ArrayList arrayList = new ArrayList();
        for (Evaluable evaluable : functionCall.getArguments()) {
            arrayList.add(eval(evaluable));
            functionCall.updateIsCacheable$div_evaluable(evaluable.getIsCacheable());
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (Object obj : arrayList) {
            EvaluableType.Companion companion = EvaluableType.INSTANCE;
            if (obj instanceof Long) {
                evaluableType = EvaluableType.INTEGER;
            } else if (obj instanceof Double) {
                evaluableType = EvaluableType.NUMBER;
            } else if (obj instanceof Boolean) {
                evaluableType = EvaluableType.BOOLEAN;
            } else if (obj instanceof String) {
                evaluableType = EvaluableType.STRING;
            } else if (obj instanceof DateTime) {
                evaluableType = EvaluableType.DATETIME;
            } else if (obj instanceof Color) {
                evaluableType = EvaluableType.COLOR;
            } else if (obj instanceof Url) {
                evaluableType = EvaluableType.URL;
            } else if (obj instanceof JSONObject) {
                evaluableType = EvaluableType.DICT;
            } else {
                if (!(obj instanceof JSONArray)) {
                    if (obj == null) {
                        throw new EvaluableException("Unable to find type for null", null, 2, null);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to find type for ");
                    Intrinsics.checkNotNull(obj);
                    sb.append(obj.getClass().getName());
                    throw new EvaluableException(sb.toString(), null, 2, null);
                }
                evaluableType = EvaluableType.ARRAY;
            }
            arrayList2.add(evaluableType);
        }
        try {
            Function function = getEvaluationContext().getFunctionProvider().get(functionCall.getToken().getName(), arrayList2);
            Evaluable m7273constructorimpl = ExpressionContext.m7273constructorimpl(functionCall);
            functionCall.updateIsCacheable$div_evaluable(function.getIsPure());
            try {
                return function.m7279invokeex6DHhM(getEvaluationContext(), m7273constructorimpl, castEvalArgumentsIfNeeded(function, arrayList));
            } catch (IntegerOverflow unused) {
                throw new IntegerOverflow(EvaluableExceptionKt.functionToMessageFormat(function.getName(), arrayList), null, 2, null);
            }
        } catch (EvaluableException e) {
            String name = functionCall.getToken().getName();
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(name, arrayList, message, null, 8, null);
            throw new KotlinNothingValueException();
        }
    }

    @NotNull
    public String evalStringTemplate$div_evaluable(@NotNull Evaluable.StringTemplate stringTemplate) {
        Intrinsics.checkNotNullParameter(stringTemplate, "stringTemplate");
        ArrayList arrayList = new ArrayList();
        for (Evaluable evaluable : stringTemplate.getArguments()) {
            arrayList.add(eval(evaluable).toString());
            stringTemplate.updateIsCacheable$div_evaluable(evaluable.getIsCacheable());
        }
        return CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }

    @NotNull
    public Object evalValue$div_evaluable(@NotNull Evaluable.Value call) {
        Intrinsics.checkNotNullParameter(call, "call");
        Token.Operand.Literal token = call.getToken();
        if (token instanceof Token.Operand.Literal.Num) {
            return ((Token.Operand.Literal.Num) token).m7305unboximpl();
        }
        if (token instanceof Token.Operand.Literal.Bool) {
            return Boolean.valueOf(((Token.Operand.Literal.Bool) token).m7298unboximpl());
        }
        if (token instanceof Token.Operand.Literal.Str) {
            return ((Token.Operand.Literal.Str) token).m7312unboximpl();
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public Object evalVariable$div_evaluable(@NotNull Evaluable.Variable call) {
        Intrinsics.checkNotNullParameter(call, "call");
        Object obj = getEvaluationContext().getVariableProvider().get(call.m7271getTokenA4lXSVo());
        if (obj != null) {
            return obj;
        }
        throw new MissingVariableException(call.m7271getTokenA4lXSVo(), null, 2, null);
    }

    /* compiled from: Evaluator.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000¢\u0006\u0002\b\bJ%\u0010\t\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/div/evaluable/Evaluator$Companion;", "", "()V", "evalFactor", "operator", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Factor;", "left", "right", "evalFactor$div_evaluable", "evalSum", "Lcom/yandex/div/evaluable/internal/Token$Operator$Binary$Sum;", "evalSum$div_evaluable", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final Object evalSum$div_evaluable(@NotNull Token.Operator.Binary.Sum operator, @NotNull Object left, @NotNull Object right) {
            double doubleValue;
            Intrinsics.checkNotNullParameter(operator, "operator");
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            if ((left instanceof String) && (right instanceof String)) {
                if (!(operator instanceof Token.Operator.Binary.Sum.Plus)) {
                    EvaluableExceptionKt.throwExceptionOnEvaluationFailed(operator, left, right);
                    throw new KotlinNothingValueException();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(left);
                sb.append(right);
                return sb.toString();
            }
            if ((left instanceof Long) && (right instanceof Long)) {
                if (operator instanceof Token.Operator.Binary.Sum.Plus) {
                    Number number = (Number) left;
                    Number number2 = (Number) right;
                    long longValue = number.longValue() + number2.longValue();
                    if (((number.longValue() ^ longValue) & (number2.longValue() ^ longValue)) < 0) {
                        throw new IntegerOverflow(left + " + " + right, null, 2, null);
                    }
                    return Long.valueOf(longValue);
                }
                if (operator instanceof Token.Operator.Binary.Sum.Minus) {
                    Number number3 = (Number) left;
                    Number number4 = (Number) right;
                    long longValue2 = number3.longValue() - number4.longValue();
                    if (((number3.longValue() ^ number4.longValue()) & (number3.longValue() ^ longValue2)) < 0) {
                        throw new IntegerOverflow(left + " - " + right, null, 2, null);
                    }
                    return Long.valueOf(longValue2);
                }
                throw new NoWhenBranchMatchedException();
            }
            if ((left instanceof Double) && (right instanceof Double)) {
                if (operator instanceof Token.Operator.Binary.Sum.Plus) {
                    doubleValue = ((Number) left).doubleValue() + ((Number) right).doubleValue();
                } else {
                    if (!(operator instanceof Token.Operator.Binary.Sum.Minus)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    doubleValue = ((Number) left).doubleValue() - ((Number) right).doubleValue();
                }
                return Double.valueOf(doubleValue);
            }
            EvaluableExceptionKt.throwExceptionOnEvaluationFailed(operator, left, right);
            throw new KotlinNothingValueException();
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
        
            if (r2 == r11.longValue()) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r13, (java.lang.Object) (-1L)) != false) goto L21;
         */
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object evalFactor$div_evaluable(@NotNull Token.Operator.Binary.Factor operator, @NotNull Object left, @NotNull Object right) {
            double doubleValue;
            long longValue;
            Intrinsics.checkNotNullParameter(operator, "operator");
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            if ((left instanceof Long) && (right instanceof Long)) {
                if (operator instanceof Token.Operator.Binary.Factor.Multiplication) {
                    Number number = (Number) left;
                    Number number2 = (Number) right;
                    long longValue2 = number.longValue() * number2.longValue();
                    if (((Math.abs(number.longValue()) | Math.abs(number2.longValue())) >>> 31) != 0) {
                        if (!Intrinsics.areEqual(right, (Object) 0L)) {
                            long longValue3 = longValue2 / number2.longValue();
                            if (left instanceof Long) {
                            }
                            throw new IntegerOverflow(left + " * " + right, null, 2, null);
                        }
                        if (Intrinsics.areEqual(left, (Object) Long.MIN_VALUE)) {
                        }
                    }
                    return Long.valueOf(longValue2);
                }
                if (operator instanceof Token.Operator.Binary.Factor.Division) {
                    if (Intrinsics.areEqual(right, (Object) 0L)) {
                        EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(left + " / " + right, EvaluableExceptionKt.REASON_DIVISION_BY_ZERO, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                    longValue = ((Number) left).longValue() / ((Number) right).longValue();
                } else if (operator instanceof Token.Operator.Binary.Factor.Modulo) {
                    if (Intrinsics.areEqual(right, (Object) 0L)) {
                        EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(left + " % " + right, EvaluableExceptionKt.REASON_DIVISION_BY_ZERO, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                    longValue = ((Number) left).longValue() % ((Number) right).longValue();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Long.valueOf(longValue);
            }
            if ((left instanceof Double) && (right instanceof Double)) {
                if (operator instanceof Token.Operator.Binary.Factor.Multiplication) {
                    doubleValue = ((Number) left).doubleValue() * ((Number) right).doubleValue();
                } else if (operator instanceof Token.Operator.Binary.Factor.Division) {
                    Number number3 = (Number) right;
                    if (number3.doubleValue() == 0.0d) {
                        EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(left + " / " + right, EvaluableExceptionKt.REASON_DIVISION_BY_ZERO, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                    doubleValue = ((Number) left).doubleValue() / number3.doubleValue();
                } else if (operator instanceof Token.Operator.Binary.Factor.Modulo) {
                    Number number4 = (Number) right;
                    if (number4.doubleValue() == 0.0d) {
                        EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(left + " % " + right, EvaluableExceptionKt.REASON_DIVISION_BY_ZERO, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                    doubleValue = ((Number) left).doubleValue() % number4.doubleValue();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Double.valueOf(doubleValue);
            }
            EvaluableExceptionKt.throwExceptionOnEvaluationFailed(operator, left, right);
            throw new KotlinNothingValueException();
        }
    }

    private Pair<Object, Object> castArgumentsIfNeeded(Object left, Object right) {
        return Intrinsics.areEqual(left.getClass(), right.getClass()) ? TuplesKt.to(left, right) : ((left instanceof Long) && (right instanceof Double)) ? TuplesKt.to(Double.valueOf(((Number) left).longValue()), right) : ((left instanceof Double) && (right instanceof Long)) ? TuplesKt.to(left, Double.valueOf(((Number) right).longValue())) : TuplesKt.to(left, right);
    }

    private List<Object> castEvalArgumentsIfNeeded(Function function, List<? extends Object> args) {
        EvaluableType evaluableType;
        List<FunctionArgument> declaredArgs = function.getDeclaredArgs();
        List<? extends Object> list = args;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            EvaluableType type = declaredArgs.get(RangesKt.coerceAtMost(i, CollectionsKt.getLastIndex(declaredArgs))).getType();
            EvaluableType.Companion companion = EvaluableType.INSTANCE;
            if (obj instanceof Long) {
                evaluableType = EvaluableType.INTEGER;
            } else if (obj instanceof Double) {
                evaluableType = EvaluableType.NUMBER;
            } else if (obj instanceof Boolean) {
                evaluableType = EvaluableType.BOOLEAN;
            } else if (obj instanceof String) {
                evaluableType = EvaluableType.STRING;
            } else if (obj instanceof DateTime) {
                evaluableType = EvaluableType.DATETIME;
            } else if (obj instanceof Color) {
                evaluableType = EvaluableType.COLOR;
            } else if (obj instanceof Url) {
                evaluableType = EvaluableType.URL;
            } else if (obj instanceof JSONObject) {
                evaluableType = EvaluableType.DICT;
            } else {
                if (!(obj instanceof JSONArray)) {
                    if (obj == null) {
                        throw new EvaluableException("Unable to find type for null", null, 2, null);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to find type for ");
                    Intrinsics.checkNotNull(obj);
                    sb.append(obj.getClass().getName());
                    throw new EvaluableException(sb.toString(), null, 2, null);
                }
                evaluableType = EvaluableType.ARRAY;
            }
            if (type != evaluableType) {
                obj = castIfPossible(obj, type);
            }
            arrayList.add(obj);
            i = i2;
        }
        return arrayList;
    }

    private Object castIfPossible(Object obj, EvaluableType evaluableType) {
        return ((obj instanceof Long) && WhenMappings.$EnumSwitchMapping$0[evaluableType.ordinal()] == 1) ? Double.valueOf(((Number) obj).longValue()) : obj;
    }
}
