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

/* compiled from: ColorVariable.kt */
/* loaded from: classes9.dex */
public final class ColorVariable implements JSONSerializable, Hashable {
    private Integer _hash;
    public final String name;
    public final Expression value;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.ColorVariable$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final ColorVariable invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return ColorVariable.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public ColorVariable(String str, Expression expression) {
        this.name = str;
        this.value = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(ColorVariable.class).hashCode() + this.name.hashCode() + this.value.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(ColorVariable colorVariable, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return colorVariable != null && Intrinsics.areEqual(this.name, colorVariable.name) && ((Number) this.value.evaluate(expressionResolver)).intValue() == ((Number) colorVariable.value.evaluate(expressionResolver2)).intValue();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ColorVariableJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getColorVariableJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: ColorVariable.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ColorVariable fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((ColorVariableJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getColorVariableJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
