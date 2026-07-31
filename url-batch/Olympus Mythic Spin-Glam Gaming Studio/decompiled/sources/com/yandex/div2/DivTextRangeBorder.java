package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivTextRangeBorderJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTextRangeBorder.kt */
/* loaded from: classes10.dex */
public final class DivTextRangeBorder implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression cornerRadius;
    public final DivStroke stroke;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivTextRangeBorder$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivTextRangeBorder invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivTextRangeBorder.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivTextRangeBorder(Expression expression, DivStroke divStroke) {
        this.cornerRadius = expression;
        this.stroke = divStroke;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivTextRangeBorder.class).hashCode();
        Expression expression = this.cornerRadius;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        DivStroke divStroke = this.stroke;
        int hash = hashCode2 + (divStroke != null ? divStroke.hash() : 0);
        this._hash = Integer.valueOf(hash);
        return hash;
    }

    public final boolean equals(DivTextRangeBorder divTextRangeBorder, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divTextRangeBorder == null) {
            return false;
        }
        Expression expression = this.cornerRadius;
        Long l = expression != null ? (Long) expression.evaluate(expressionResolver) : null;
        Expression expression2 = divTextRangeBorder.cornerRadius;
        if (!Intrinsics.areEqual(l, expression2 != null ? (Long) expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivStroke divStroke = this.stroke;
        DivStroke divStroke2 = divTextRangeBorder.stroke;
        return divStroke != null ? divStroke.equals(divStroke2, expressionResolver, expressionResolver2) : divStroke2 == null;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivTextRangeBorderJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextRangeBorderJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivTextRangeBorder.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivTextRangeBorder fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivTextRangeBorderJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextRangeBorderJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
