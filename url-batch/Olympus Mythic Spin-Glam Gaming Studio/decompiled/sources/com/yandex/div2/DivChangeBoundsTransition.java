package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivChangeBoundsTransitionJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivChangeBoundsTransition.kt */
/* loaded from: classes12.dex */
public final class DivChangeBoundsTransition implements JSONSerializable, Hashable {
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression DURATION_DEFAULT_VALUE;
    private static final Expression INTERPOLATOR_DEFAULT_VALUE;
    private static final Expression START_DELAY_DEFAULT_VALUE;
    private Integer _hash;
    private final Expression duration;
    private final Expression interpolator;
    private final Expression startDelay;

    public DivChangeBoundsTransition(Expression expression, Expression expression2, Expression expression3) {
        this.duration = expression;
        this.interpolator = expression2;
        this.startDelay = expression3;
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
        int hashCode = Reflection.getOrCreateKotlinClass(DivChangeBoundsTransition.class).hashCode() + getDuration().hashCode() + getInterpolator().hashCode() + getStartDelay().hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivChangeBoundsTransition divChangeBoundsTransition, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divChangeBoundsTransition != null && ((Number) getDuration().evaluate(expressionResolver)).longValue() == ((Number) divChangeBoundsTransition.getDuration().evaluate(expressionResolver2)).longValue() && getInterpolator().evaluate(expressionResolver) == divChangeBoundsTransition.getInterpolator().evaluate(expressionResolver2) && ((Number) getStartDelay().evaluate(expressionResolver)).longValue() == ((Number) divChangeBoundsTransition.getStartDelay().evaluate(expressionResolver2)).longValue();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivChangeBoundsTransitionJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivChangeBoundsTransitionJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivChangeBoundsTransition.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivChangeBoundsTransition fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivChangeBoundsTransitionJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivChangeBoundsTransitionJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        DURATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        INTERPOLATOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        START_DELAY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        CREATOR = new Function2() { // from class: com.yandex.div2.DivChangeBoundsTransition$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivChangeBoundsTransition invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivChangeBoundsTransition.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }
}
