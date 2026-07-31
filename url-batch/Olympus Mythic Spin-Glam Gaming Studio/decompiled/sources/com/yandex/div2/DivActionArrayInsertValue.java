package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivActionArrayInsertValue.kt */
/* loaded from: classes10.dex */
public final class DivActionArrayInsertValue implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression index;
    public final DivTypedValue value;
    public final Expression variableName;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionArrayInsertValue$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionArrayInsertValue invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionArrayInsertValue.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivActionArrayInsertValue(Expression expression, DivTypedValue divTypedValue, Expression expression2) {
        this.index = expression;
        this.value = divTypedValue;
        this.variableName = expression2;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivActionArrayInsertValue.class).hashCode();
        Expression expression = this.index;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0) + this.value.hash() + this.variableName.hashCode();
        this._hash = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    public final boolean equals(DivActionArrayInsertValue divActionArrayInsertValue, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divActionArrayInsertValue == null) {
            return false;
        }
        Expression expression = this.index;
        Long l = expression != null ? (Long) expression.evaluate(expressionResolver) : null;
        Expression expression2 = divActionArrayInsertValue.index;
        return Intrinsics.areEqual(l, expression2 != null ? (Long) expression2.evaluate(expressionResolver2) : null) && this.value.equals(divActionArrayInsertValue.value, expressionResolver, expressionResolver2) && Intrinsics.areEqual(this.variableName.evaluate(expressionResolver), divActionArrayInsertValue.variableName.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionArrayInsertValueJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionArrayInsertValueJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionArrayInsertValue.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivActionArrayInsertValue fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivActionArrayInsertValueJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionArrayInsertValueJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
