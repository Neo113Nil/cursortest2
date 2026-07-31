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

/* compiled from: DivCurrencyInputMask.kt */
/* loaded from: classes10.dex */
public final class DivCurrencyInputMask implements JSONSerializable, Hashable, DivInputMaskBase {
    private Integer _hash;
    public final Expression locale;
    private final String rawTextVariable;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivCurrencyInputMask$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivCurrencyInputMask invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivCurrencyInputMask.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivCurrencyInputMask(Expression expression, String str) {
        this.locale = expression;
        this.rawTextVariable = str;
    }

    @Override // com.yandex.div2.DivInputMaskBase
    public String getRawTextVariable() {
        return this.rawTextVariable;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivCurrencyInputMask.class).hashCode();
        Expression expression = this.locale;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0) + getRawTextVariable().hashCode();
        this._hash = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    public final boolean equals(DivCurrencyInputMask divCurrencyInputMask, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divCurrencyInputMask == null) {
            return false;
        }
        Expression expression = this.locale;
        String str = expression != null ? (String) expression.evaluate(expressionResolver) : null;
        Expression expression2 = divCurrencyInputMask.locale;
        return Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(expressionResolver2) : null) && Intrinsics.areEqual(getRawTextVariable(), divCurrencyInputMask.getRawTextVariable());
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivCurrencyInputMaskJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivCurrencyInputMaskJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivCurrencyInputMask.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivCurrencyInputMask fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivCurrencyInputMaskJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivCurrencyInputMaskJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
