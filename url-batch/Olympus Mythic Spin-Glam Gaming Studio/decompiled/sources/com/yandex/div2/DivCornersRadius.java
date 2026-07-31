package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivCornersRadiusJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivCornersRadius.kt */
/* loaded from: classes4.dex */
public final class DivCornersRadius implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression bottomLeft;
    public final Expression bottomRight;
    public final Expression topLeft;
    public final Expression topRight;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivCornersRadius$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivCornersRadius invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivCornersRadius.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivCornersRadius(Expression expression, Expression expression2, Expression expression3, Expression expression4) {
        this.bottomLeft = expression;
        this.bottomRight = expression2;
        this.topLeft = expression3;
        this.topRight = expression4;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivCornersRadius.class).hashCode();
        Expression expression = this.bottomLeft;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        Expression expression2 = this.bottomRight;
        int hashCode3 = hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        Expression expression3 = this.topLeft;
        int hashCode4 = hashCode3 + (expression3 != null ? expression3.hashCode() : 0);
        Expression expression4 = this.topRight;
        int hashCode5 = hashCode4 + (expression4 != null ? expression4.hashCode() : 0);
        this._hash = Integer.valueOf(hashCode5);
        return hashCode5;
    }

    public final boolean equals(DivCornersRadius divCornersRadius, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divCornersRadius == null) {
            return false;
        }
        Expression expression = this.bottomLeft;
        Long l = expression != null ? (Long) expression.evaluate(expressionResolver) : null;
        Expression expression2 = divCornersRadius.bottomLeft;
        if (!Intrinsics.areEqual(l, expression2 != null ? (Long) expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression expression3 = this.bottomRight;
        Long l2 = expression3 != null ? (Long) expression3.evaluate(expressionResolver) : null;
        Expression expression4 = divCornersRadius.bottomRight;
        if (!Intrinsics.areEqual(l2, expression4 != null ? (Long) expression4.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression expression5 = this.topLeft;
        Long l3 = expression5 != null ? (Long) expression5.evaluate(expressionResolver) : null;
        Expression expression6 = divCornersRadius.topLeft;
        if (!Intrinsics.areEqual(l3, expression6 != null ? (Long) expression6.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression expression7 = this.topRight;
        Long l4 = expression7 != null ? (Long) expression7.evaluate(expressionResolver) : null;
        Expression expression8 = divCornersRadius.topRight;
        return Intrinsics.areEqual(l4, expression8 != null ? (Long) expression8.evaluate(expressionResolver2) : null);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivCornersRadiusJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivCornersRadiusJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivCornersRadius.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivCornersRadius fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivCornersRadiusJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivCornersRadiusJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
