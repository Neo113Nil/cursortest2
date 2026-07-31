package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivPageTransformationSlideJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivPageTransformationSlide.kt */
/* loaded from: classes10.dex */
public final class DivPageTransformationSlide implements JSONSerializable, Hashable {
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression INTERPOLATOR_DEFAULT_VALUE;
    private static final Expression NEXT_PAGE_ALPHA_DEFAULT_VALUE;
    private static final Expression NEXT_PAGE_SCALE_DEFAULT_VALUE;
    private static final Expression PREVIOUS_PAGE_ALPHA_DEFAULT_VALUE;
    private static final Expression PREVIOUS_PAGE_SCALE_DEFAULT_VALUE;
    private Integer _hash;
    public final Expression interpolator;
    public final Expression nextPageAlpha;
    public final Expression nextPageScale;
    public final Expression previousPageAlpha;
    public final Expression previousPageScale;

    public DivPageTransformationSlide(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5) {
        this.interpolator = expression;
        this.nextPageAlpha = expression2;
        this.nextPageScale = expression3;
        this.previousPageAlpha = expression4;
        this.previousPageScale = expression5;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivPageTransformationSlide.class).hashCode() + this.interpolator.hashCode() + this.nextPageAlpha.hashCode() + this.nextPageScale.hashCode() + this.previousPageAlpha.hashCode() + this.previousPageScale.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivPageTransformationSlide divPageTransformationSlide, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divPageTransformationSlide != null && this.interpolator.evaluate(expressionResolver) == divPageTransformationSlide.interpolator.evaluate(expressionResolver2) && ((Number) this.nextPageAlpha.evaluate(expressionResolver)).doubleValue() == ((Number) divPageTransformationSlide.nextPageAlpha.evaluate(expressionResolver2)).doubleValue() && ((Number) this.nextPageScale.evaluate(expressionResolver)).doubleValue() == ((Number) divPageTransformationSlide.nextPageScale.evaluate(expressionResolver2)).doubleValue() && ((Number) this.previousPageAlpha.evaluate(expressionResolver)).doubleValue() == ((Number) divPageTransformationSlide.previousPageAlpha.evaluate(expressionResolver2)).doubleValue() && ((Number) this.previousPageScale.evaluate(expressionResolver)).doubleValue() == ((Number) divPageTransformationSlide.previousPageScale.evaluate(expressionResolver2)).doubleValue();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivPageTransformationSlideJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPageTransformationSlideJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivPageTransformationSlide.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivPageTransformationSlide fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivPageTransformationSlideJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPageTransformationSlideJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
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
        CREATOR = new Function2() { // from class: com.yandex.div2.DivPageTransformationSlide$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivPageTransformationSlide invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivPageTransformationSlide.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }
}
