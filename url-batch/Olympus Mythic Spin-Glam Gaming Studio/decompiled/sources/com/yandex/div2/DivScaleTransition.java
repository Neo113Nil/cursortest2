package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivScaleTransitionJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivScaleTransition.kt */
/* loaded from: classes8.dex */
public final class DivScaleTransition implements JSONSerializable, Hashable {
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression DURATION_DEFAULT_VALUE;
    private static final Expression INTERPOLATOR_DEFAULT_VALUE;
    private static final Expression PIVOT_X_DEFAULT_VALUE;
    private static final Expression PIVOT_Y_DEFAULT_VALUE;
    private static final Expression SCALE_DEFAULT_VALUE;
    private static final Expression START_DELAY_DEFAULT_VALUE;
    private Integer _hash;
    private final Expression duration;
    private final Expression interpolator;
    public final Expression pivotX;
    public final Expression pivotY;
    public final Expression scale;
    private final Expression startDelay;

    public DivScaleTransition(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6) {
        this.duration = expression;
        this.interpolator = expression2;
        this.pivotX = expression3;
        this.pivotY = expression4;
        this.scale = expression5;
        this.startDelay = expression6;
    }

    public Expression getDuration() {
        return this.duration;
    }

    public Expression getInterpolator() {
        return this.interpolator;
    }

    public Expression getStartDelay() {
        return this.startDelay;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivScaleTransition.class).hashCode() + getDuration().hashCode() + getInterpolator().hashCode() + this.pivotX.hashCode() + this.pivotY.hashCode() + this.scale.hashCode() + getStartDelay().hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivScaleTransition divScaleTransition, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divScaleTransition != null && ((Number) getDuration().evaluate(expressionResolver)).longValue() == ((Number) divScaleTransition.getDuration().evaluate(expressionResolver2)).longValue() && getInterpolator().evaluate(expressionResolver) == divScaleTransition.getInterpolator().evaluate(expressionResolver2) && ((Number) this.pivotX.evaluate(expressionResolver)).doubleValue() == ((Number) divScaleTransition.pivotX.evaluate(expressionResolver2)).doubleValue() && ((Number) this.pivotY.evaluate(expressionResolver)).doubleValue() == ((Number) divScaleTransition.pivotY.evaluate(expressionResolver2)).doubleValue() && ((Number) this.scale.evaluate(expressionResolver)).doubleValue() == ((Number) divScaleTransition.scale.evaluate(expressionResolver2)).doubleValue() && ((Number) getStartDelay().evaluate(expressionResolver)).longValue() == ((Number) divScaleTransition.getStartDelay().evaluate(expressionResolver2)).longValue();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivScaleTransitionJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivScaleTransitionJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivScaleTransition.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivScaleTransition fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivScaleTransitionJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivScaleTransitionJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        DURATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        INTERPOLATOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        Double valueOf = Double.valueOf(0.5d);
        PIVOT_X_DEFAULT_VALUE = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        PIVOT_Y_DEFAULT_VALUE = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        SCALE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        START_DELAY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        CREATOR = new Function2() { // from class: com.yandex.div2.DivScaleTransition$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivScaleTransition invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivScaleTransition.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }
}
