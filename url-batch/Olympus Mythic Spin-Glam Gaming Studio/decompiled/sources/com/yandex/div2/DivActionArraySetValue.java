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

/* compiled from: DivActionArraySetValue.kt */
/* loaded from: classes4.dex */
public final class DivActionArraySetValue implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression index;
    public final DivTypedValue value;
    public final Expression variableName;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionArraySetValue$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionArraySetValue invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionArraySetValue.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivActionArraySetValue(Expression expression, DivTypedValue divTypedValue, Expression expression2) {
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
        int hashCode = Reflection.getOrCreateKotlinClass(DivActionArraySetValue.class).hashCode() + this.index.hashCode() + this.value.hash() + this.variableName.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivActionArraySetValue divActionArraySetValue, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divActionArraySetValue != null && ((Number) this.index.evaluate(expressionResolver)).longValue() == ((Number) divActionArraySetValue.index.evaluate(expressionResolver2)).longValue() && this.value.equals(divActionArraySetValue.value, expressionResolver, expressionResolver2) && Intrinsics.areEqual(this.variableName.evaluate(expressionResolver), divActionArraySetValue.variableName.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionArraySetValueJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionArraySetValueJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionArraySetValue.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivActionArraySetValue fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivActionArraySetValueJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionArraySetValueJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
