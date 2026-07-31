package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivSizeUnitValueJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivSizeUnitValue.kt */
/* loaded from: classes4.dex */
public final class DivSizeUnitValue implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression unit;
    public final Expression value;
    public static final Companion Companion = new Companion(null);
    private static final Expression UNIT_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, DivSizeUnit.DP, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivSizeUnitValue$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivSizeUnitValue invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivSizeUnitValue.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivSizeUnitValue(Expression expression, Expression expression2) {
        this.unit = expression;
        this.value = expression2;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivSizeUnitValue.class).hashCode() + this.unit.hashCode() + this.value.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivSizeUnitValue divSizeUnitValue, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divSizeUnitValue != null && this.unit.evaluate(expressionResolver) == divSizeUnitValue.unit.evaluate(expressionResolver2) && ((Number) this.value.evaluate(expressionResolver)).longValue() == ((Number) divSizeUnitValue.value.evaluate(expressionResolver2)).longValue();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivSizeUnitValueJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSizeUnitValueJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivSizeUnitValue.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivSizeUnitValue fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivSizeUnitValueJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSizeUnitValueJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
