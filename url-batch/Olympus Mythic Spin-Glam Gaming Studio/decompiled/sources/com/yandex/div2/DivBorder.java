package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivBorderJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivBorder.kt */
/* loaded from: classes12.dex */
public final class DivBorder implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression cornerRadius;
    public final DivCornersRadius cornersRadius;
    public final Expression hasShadow;
    public final DivShadow shadow;
    public final DivStroke stroke;
    public static final Companion Companion = new Companion(null);
    private static final Expression HAS_SHADOW_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.FALSE, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivBorder$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivBorder invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivBorder.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivBorder(Expression expression, DivCornersRadius divCornersRadius, Expression expression2, DivShadow divShadow, DivStroke divStroke) {
        this.cornerRadius = expression;
        this.cornersRadius = divCornersRadius;
        this.hasShadow = expression2;
        this.shadow = divShadow;
        this.stroke = divStroke;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivBorder.class).hashCode();
        Expression expression = this.cornerRadius;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        DivCornersRadius divCornersRadius = this.cornersRadius;
        int hash = hashCode2 + (divCornersRadius != null ? divCornersRadius.hash() : 0) + this.hasShadow.hashCode();
        DivShadow divShadow = this.shadow;
        int hash2 = hash + (divShadow != null ? divShadow.hash() : 0);
        DivStroke divStroke = this.stroke;
        int hash3 = hash2 + (divStroke != null ? divStroke.hash() : 0);
        this._hash = Integer.valueOf(hash3);
        return hash3;
    }

    public final boolean equals(DivBorder divBorder, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divBorder == null) {
            return false;
        }
        Expression expression = this.cornerRadius;
        Long l = expression != null ? (Long) expression.evaluate(expressionResolver) : null;
        Expression expression2 = divBorder.cornerRadius;
        if (!Intrinsics.areEqual(l, expression2 != null ? (Long) expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivCornersRadius divCornersRadius = this.cornersRadius;
        if (!(divCornersRadius != null ? divCornersRadius.equals(divBorder.cornersRadius, expressionResolver, expressionResolver2) : divBorder.cornersRadius == null) || ((Boolean) this.hasShadow.evaluate(expressionResolver)).booleanValue() != ((Boolean) divBorder.hasShadow.evaluate(expressionResolver2)).booleanValue()) {
            return false;
        }
        DivShadow divShadow = this.shadow;
        if (!(divShadow != null ? divShadow.equals(divBorder.shadow, expressionResolver, expressionResolver2) : divBorder.shadow == null)) {
            return false;
        }
        DivStroke divStroke = this.stroke;
        DivStroke divStroke2 = divBorder.stroke;
        return divStroke != null ? divStroke.equals(divStroke2, expressionResolver, expressionResolver2) : divStroke2 == null;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivBorderJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivBorderJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivBorder.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivBorder fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivBorderJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivBorderJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
