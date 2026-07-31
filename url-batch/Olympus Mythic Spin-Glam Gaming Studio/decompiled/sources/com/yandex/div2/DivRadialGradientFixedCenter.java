package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivRadialGradientFixedCenterJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivRadialGradientFixedCenter.kt */
/* loaded from: classes8.dex */
public final class DivRadialGradientFixedCenter implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression unit;
    public final Expression value;
    public static final Companion Companion = new Companion(null);
    private static final Expression UNIT_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, DivSizeUnit.DP, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivRadialGradientFixedCenter$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivRadialGradientFixedCenter invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivRadialGradientFixedCenter.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivRadialGradientFixedCenter(Expression expression, Expression expression2) {
        this.unit = expression;
        this.value = expression2;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivRadialGradientFixedCenter.class).hashCode() + this.unit.hashCode() + this.value.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivRadialGradientFixedCenter divRadialGradientFixedCenter, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divRadialGradientFixedCenter != null && this.unit.evaluate(expressionResolver) == divRadialGradientFixedCenter.unit.evaluate(expressionResolver2) && ((Number) this.value.evaluate(expressionResolver)).longValue() == ((Number) divRadialGradientFixedCenter.value.evaluate(expressionResolver2)).longValue();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivRadialGradientFixedCenterJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRadialGradientFixedCenterJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivRadialGradientFixedCenter.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivRadialGradientFixedCenter fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivRadialGradientFixedCenterJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRadialGradientFixedCenterJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
