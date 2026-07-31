package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivPageTransformationOverlapJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivPageTransformationOverlap.kt */
/* loaded from: classes12.dex */
public final class DivPageTransformationOverlap implements JSONSerializable, Hashable {
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression INTERPOLATOR_DEFAULT_VALUE;
    private static final Expression NEXT_PAGE_ALPHA_DEFAULT_VALUE;
    private static final Expression NEXT_PAGE_SCALE_DEFAULT_VALUE;
    private static final Expression PREVIOUS_PAGE_ALPHA_DEFAULT_VALUE;
    private static final Expression PREVIOUS_PAGE_SCALE_DEFAULT_VALUE;
    private static final Expression REVERSED_STACKING_ORDER_DEFAULT_VALUE;
    private Integer _hash;
    public final Expression interpolator;
    public final Expression nextPageAlpha;
    public final Expression nextPageScale;
    public final Expression previousPageAlpha;
    public final Expression previousPageScale;
    public final Expression reversedStackingOrder;

    public DivPageTransformationOverlap(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6) {
        this.interpolator = expression;
        this.nextPageAlpha = expression2;
        this.nextPageScale = expression3;
        this.previousPageAlpha = expression4;
        this.previousPageScale = expression5;
        this.reversedStackingOrder = expression6;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivPageTransformationOverlap.class).hashCode() + this.interpolator.hashCode() + this.nextPageAlpha.hashCode() + this.nextPageScale.hashCode() + this.previousPageAlpha.hashCode() + this.previousPageScale.hashCode() + this.reversedStackingOrder.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivPageTransformationOverlap divPageTransformationOverlap, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divPageTransformationOverlap != null && this.interpolator.evaluate(expressionResolver) == divPageTransformationOverlap.interpolator.evaluate(expressionResolver2) && ((Number) this.nextPageAlpha.evaluate(expressionResolver)).doubleValue() == ((Number) divPageTransformationOverlap.nextPageAlpha.evaluate(expressionResolver2)).doubleValue() && ((Number) this.nextPageScale.evaluate(expressionResolver)).doubleValue() == ((Number) divPageTransformationOverlap.nextPageScale.evaluate(expressionResolver2)).doubleValue() && ((Number) this.previousPageAlpha.evaluate(expressionResolver)).doubleValue() == ((Number) divPageTransformationOverlap.previousPageAlpha.evaluate(expressionResolver2)).doubleValue() && ((Number) this.previousPageScale.evaluate(expressionResolver)).doubleValue() == ((Number) divPageTransformationOverlap.previousPageScale.evaluate(expressionResolver2)).doubleValue() && ((Boolean) this.reversedStackingOrder.evaluate(expressionResolver)).booleanValue() == ((Boolean) divPageTransformationOverlap.reversedStackingOrder.evaluate(expressionResolver2)).booleanValue();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivPageTransformationOverlapJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPageTransformationOverlapJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivPageTransformationOverlap.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivPageTransformationOverlap fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivPageTransformationOverlapJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPageTransformationOverlapJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        INTERPOLATOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        Double valueOf = Double.valueOf(1.0d);
        NEXT_PAGE_ALPHA_DEFAULT_VALUE = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        NEXT_PAGE_SCALE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        PREVIOUS_PAGE_ALPHA_DEFAULT_VALUE = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        PREVIOUS_PAGE_SCALE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        REVERSED_STACKING_ORDER_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        CREATOR = new Function2() { // from class: com.yandex.div2.DivPageTransformationOverlap$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivPageTransformationOverlap invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivPageTransformationOverlap.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }
}
