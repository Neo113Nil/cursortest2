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
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: BoolValue.kt */
/* loaded from: classes10.dex */
public final class BoolValue implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression value;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.BoolValue$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final BoolValue invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BoolValue.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public BoolValue(Expression expression) {
        this.value = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(BoolValue.class).hashCode() + this.value.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(BoolValue boolValue, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return boolValue != null && ((Boolean) this.value.evaluate(expressionResolver)).booleanValue() == ((Boolean) boolValue.value.evaluate(expressionResolver2)).booleanValue();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((BoolValueJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getBoolValueJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: BoolValue.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BoolValue fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((BoolValueJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getBoolValueJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
