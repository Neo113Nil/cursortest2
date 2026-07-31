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

/* compiled from: UrlVariable.kt */
/* loaded from: classes10.dex */
public final class UrlVariable implements JSONSerializable, Hashable {
    private Integer _hash;
    public final String name;
    public final Expression value;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.UrlVariable$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final UrlVariable invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return UrlVariable.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public UrlVariable(String str, Expression expression) {
        this.name = str;
        this.value = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(UrlVariable.class).hashCode() + this.name.hashCode() + this.value.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(UrlVariable urlVariable, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return urlVariable != null && Intrinsics.areEqual(this.name, urlVariable.name) && Intrinsics.areEqual(this.value.evaluate(expressionResolver), urlVariable.value.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((UrlVariableJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getUrlVariableJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: UrlVariable.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final UrlVariable fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((UrlVariableJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getUrlVariableJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
