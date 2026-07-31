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

/* compiled from: DivActionDictSetValue.kt */
/* loaded from: classes4.dex */
public final class DivActionDictSetValue implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression key;
    public final DivTypedValue value;
    public final Expression variableName;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionDictSetValue$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionDictSetValue invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionDictSetValue.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivActionDictSetValue(Expression expression, DivTypedValue divTypedValue, Expression expression2) {
        this.key = expression;
        this.value = divTypedValue;
        this.variableName = expression2;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivActionDictSetValue.class).hashCode() + this.key.hashCode();
        DivTypedValue divTypedValue = this.value;
        int hash = hashCode + (divTypedValue != null ? divTypedValue.hash() : 0) + this.variableName.hashCode();
        this._hash = Integer.valueOf(hash);
        return hash;
    }

    public final boolean equals(DivActionDictSetValue divActionDictSetValue, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divActionDictSetValue == null || !Intrinsics.areEqual(this.key.evaluate(expressionResolver), divActionDictSetValue.key.evaluate(expressionResolver2))) {
            return false;
        }
        DivTypedValue divTypedValue = this.value;
        return (divTypedValue != null ? divTypedValue.equals(divActionDictSetValue.value, expressionResolver, expressionResolver2) : divActionDictSetValue.value == null) && Intrinsics.areEqual(this.variableName.evaluate(expressionResolver), divActionDictSetValue.variableName.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionDictSetValueJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionDictSetValueJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionDictSetValue.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivActionDictSetValue fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivActionDictSetValueJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionDictSetValueJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
