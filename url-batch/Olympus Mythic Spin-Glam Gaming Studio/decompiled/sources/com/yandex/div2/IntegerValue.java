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

/* compiled from: IntegerValue.kt */
/* loaded from: classes12.dex */
public final class IntegerValue implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression value;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.IntegerValue$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final IntegerValue invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return IntegerValue.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public IntegerValue(Expression expression) {
        this.value = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(IntegerValue.class).hashCode() + this.value.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(IntegerValue integerValue, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return integerValue != null && ((Number) this.value.evaluate(expressionResolver)).longValue() == ((Number) integerValue.value.evaluate(expressionResolver2)).longValue();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((IntegerValueJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getIntegerValueJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: IntegerValue.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final IntegerValue fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((IntegerValueJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getIntegerValueJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
