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

/* compiled from: DivActionArrayRemoveValue.kt */
/* loaded from: classes12.dex */
public final class DivActionArrayRemoveValue implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression index;
    public final Expression variableName;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionArrayRemoveValue$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionArrayRemoveValue invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionArrayRemoveValue.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivActionArrayRemoveValue(Expression expression, Expression expression2) {
        this.index = expression;
        this.variableName = expression2;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivActionArrayRemoveValue.class).hashCode() + this.index.hashCode() + this.variableName.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivActionArrayRemoveValue divActionArrayRemoveValue, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divActionArrayRemoveValue != null && ((Number) this.index.evaluate(expressionResolver)).longValue() == ((Number) divActionArrayRemoveValue.index.evaluate(expressionResolver2)).longValue() && Intrinsics.areEqual(this.variableName.evaluate(expressionResolver), divActionArrayRemoveValue.variableName.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionArrayRemoveValueJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionArrayRemoveValueJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionArrayRemoveValue.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivActionArrayRemoveValue fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivActionArrayRemoveValueJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionArrayRemoveValueJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
