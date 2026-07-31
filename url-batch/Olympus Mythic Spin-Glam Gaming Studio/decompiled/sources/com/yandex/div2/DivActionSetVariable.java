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

/* compiled from: DivActionSetVariable.kt */
/* loaded from: classes14.dex */
public final class DivActionSetVariable implements JSONSerializable, Hashable {
    private Integer _hash;
    public final DivTypedValue value;
    public final Expression variableName;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionSetVariable$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionSetVariable invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionSetVariable.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivActionSetVariable(DivTypedValue divTypedValue, Expression expression) {
        this.value = divTypedValue;
        this.variableName = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivActionSetVariable.class).hashCode() + this.value.hash() + this.variableName.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivActionSetVariable divActionSetVariable, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divActionSetVariable != null && this.value.equals(divActionSetVariable.value, expressionResolver, expressionResolver2) && Intrinsics.areEqual(this.variableName.evaluate(expressionResolver), divActionSetVariable.variableName.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionSetVariableJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionSetVariableJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionSetVariable.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivActionSetVariable fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivActionSetVariableJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionSetVariableJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
