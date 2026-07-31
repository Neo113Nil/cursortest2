package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivDimensionJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivDimension.kt */
/* loaded from: classes13.dex */
public final class DivDimension implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression unit;
    public final Expression value;
    public static final Companion Companion = new Companion(null);
    private static final Expression UNIT_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, DivSizeUnit.DP, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivDimension$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivDimension invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivDimension.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivDimension(Expression expression, Expression expression2) {
        this.unit = expression;
        this.value = expression2;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivDimension.class).hashCode() + this.unit.hashCode() + this.value.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivDimension divDimension, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divDimension != null && this.unit.evaluate(expressionResolver) == divDimension.unit.evaluate(expressionResolver2) && ((Number) this.value.evaluate(expressionResolver)).doubleValue() == ((Number) divDimension.value.evaluate(expressionResolver2)).doubleValue();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivDimensionJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivDimensionJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivDimension.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivDimension fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivDimensionJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivDimensionJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
