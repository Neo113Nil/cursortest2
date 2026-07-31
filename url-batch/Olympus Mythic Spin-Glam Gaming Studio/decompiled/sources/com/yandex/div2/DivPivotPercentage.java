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

/* compiled from: DivPivotPercentage.kt */
/* loaded from: classes14.dex */
public final class DivPivotPercentage implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression value;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivPivotPercentage$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivPivotPercentage invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivPivotPercentage.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivPivotPercentage(Expression expression) {
        this.value = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivPivotPercentage.class).hashCode() + this.value.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivPivotPercentage divPivotPercentage, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divPivotPercentage != null && ((Number) this.value.evaluate(expressionResolver)).doubleValue() == ((Number) divPivotPercentage.value.evaluate(expressionResolver2)).doubleValue();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivPivotPercentageJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPivotPercentageJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivPivotPercentage.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivPivotPercentage fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivPivotPercentageJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPivotPercentageJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
