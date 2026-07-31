package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivPivotFixedJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivPivotFixed.kt */
/* loaded from: classes.dex */
public final class DivPivotFixed implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression unit;
    public final Expression value;
    public static final Companion Companion = new Companion(null);
    private static final Expression UNIT_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, DivSizeUnit.DP, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivPivotFixed$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivPivotFixed invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivPivotFixed.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivPivotFixed(Expression expression, Expression expression2) {
        this.unit = expression;
        this.value = expression2;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivPivotFixed.class).hashCode() + this.unit.hashCode();
        Expression expression = this.value;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        this._hash = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    public final boolean equals(DivPivotFixed divPivotFixed, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divPivotFixed == null || this.unit.evaluate(expressionResolver) != divPivotFixed.unit.evaluate(expressionResolver2)) {
            return false;
        }
        Expression expression = this.value;
        Long l = expression != null ? (Long) expression.evaluate(expressionResolver) : null;
        Expression expression2 = divPivotFixed.value;
        return Intrinsics.areEqual(l, expression2 != null ? (Long) expression2.evaluate(expressionResolver2) : null);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivPivotFixedJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPivotFixedJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivPivotFixed.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivPivotFixed fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivPivotFixedJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPivotFixedJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
