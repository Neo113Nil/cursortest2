package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivFadeTransitionJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivFadeTransition.kt */
/* loaded from: classes3.dex */
public final class DivFadeTransition implements JSONSerializable, Hashable {
    private static final Expression ALPHA_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression DURATION_DEFAULT_VALUE;
    private static final Expression INTERPOLATOR_DEFAULT_VALUE;
    private static final Expression START_DELAY_DEFAULT_VALUE;
    private Integer _hash;
    public final Expression alpha;
    private final Expression duration;
    private final Expression interpolator;
    private final Expression startDelay;

    public DivFadeTransition(Expression expression, Expression expression2, Expression expression3, Expression expression4) {
        this.alpha = expression;
        this.duration = expression2;
        this.interpolator = expression3;
        this.startDelay = expression4;
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
        int hashCode = Reflection.getOrCreateKotlinClass(DivFadeTransition.class).hashCode() + this.alpha.hashCode() + getDuration().hashCode() + getInterpolator().hashCode() + getStartDelay().hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivFadeTransition divFadeTransition, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divFadeTransition != null && ((Number) this.alpha.evaluate(expressionResolver)).doubleValue() == ((Number) divFadeTransition.alpha.evaluate(expressionResolver2)).doubleValue() && ((Number) getDuration().evaluate(expressionResolver)).longValue() == ((Number) divFadeTransition.getDuration().evaluate(expressionResolver2)).longValue() && getInterpolator().evaluate(expressionResolver) == divFadeTransition.getInterpolator().evaluate(expressionResolver2) && ((Number) getStartDelay().evaluate(expressionResolver)).longValue() == ((Number) divFadeTransition.getStartDelay().evaluate(expressionResolver2)).longValue();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivFadeTransitionJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFadeTransitionJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivFadeTransition.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivFadeTransition fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivFadeTransitionJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFadeTransitionJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        ALPHA_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        DURATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        INTERPOLATOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        START_DELAY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        CREATOR = new Function2() { // from class: com.yandex.div2.DivFadeTransition$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivFadeTransition invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivFadeTransition.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }
}
