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

/* compiled from: DivRadialGradientRelativeCenter.kt */
/* loaded from: classes8.dex */
public final class DivRadialGradientRelativeCenter implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression value;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivRadialGradientRelativeCenter$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivRadialGradientRelativeCenter invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivRadialGradientRelativeCenter.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivRadialGradientRelativeCenter(Expression expression) {
        this.value = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivRadialGradientRelativeCenter.class).hashCode() + this.value.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivRadialGradientRelativeCenter divRadialGradientRelativeCenter, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divRadialGradientRelativeCenter != null && ((Number) this.value.evaluate(expressionResolver)).doubleValue() == ((Number) divRadialGradientRelativeCenter.value.evaluate(expressionResolver2)).doubleValue();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivRadialGradientRelativeCenterJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRadialGradientRelativeCenterJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivRadialGradientRelativeCenter.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivRadialGradientRelativeCenter fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivRadialGradientRelativeCenterJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRadialGradientRelativeCenterJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
