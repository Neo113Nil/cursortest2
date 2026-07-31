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

/* compiled from: DivActionShowTooltip.kt */
/* loaded from: classes.dex */
public final class DivActionShowTooltip implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression id;
    public final Expression multiple;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionShowTooltip$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionShowTooltip invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionShowTooltip.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivActionShowTooltip(Expression expression, Expression expression2) {
        this.id = expression;
        this.multiple = expression2;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivActionShowTooltip.class).hashCode() + this.id.hashCode();
        Expression expression = this.multiple;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        this._hash = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    public final boolean equals(DivActionShowTooltip divActionShowTooltip, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divActionShowTooltip == null || !Intrinsics.areEqual(this.id.evaluate(expressionResolver), divActionShowTooltip.id.evaluate(expressionResolver2))) {
            return false;
        }
        Expression expression = this.multiple;
        Boolean bool = expression != null ? (Boolean) expression.evaluate(expressionResolver) : null;
        Expression expression2 = divActionShowTooltip.multiple;
        return Intrinsics.areEqual(bool, expression2 != null ? (Boolean) expression2.evaluate(expressionResolver2) : null);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionShowTooltipJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionShowTooltipJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionShowTooltip.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivActionShowTooltip fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivActionShowTooltipJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionShowTooltipJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
