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

/* compiled from: DivActionSetStoredValue.kt */
/* loaded from: classes13.dex */
public final class DivActionSetStoredValue implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression lifetime;
    public final Expression name;
    public final DivTypedValue value;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionSetStoredValue$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionSetStoredValue invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionSetStoredValue.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivActionSetStoredValue(Expression expression, Expression expression2, DivTypedValue divTypedValue) {
        this.lifetime = expression;
        this.name = expression2;
        this.value = divTypedValue;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivActionSetStoredValue.class).hashCode() + this.lifetime.hashCode() + this.name.hashCode() + this.value.hash();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivActionSetStoredValue divActionSetStoredValue, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divActionSetStoredValue != null && ((Number) this.lifetime.evaluate(expressionResolver)).longValue() == ((Number) divActionSetStoredValue.lifetime.evaluate(expressionResolver2)).longValue() && Intrinsics.areEqual(this.name.evaluate(expressionResolver), divActionSetStoredValue.name.evaluate(expressionResolver2)) && this.value.equals(divActionSetStoredValue.value, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionSetStoredValueJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionSetStoredValueJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionSetStoredValue.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivActionSetStoredValue fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivActionSetStoredValueJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionSetStoredValueJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
