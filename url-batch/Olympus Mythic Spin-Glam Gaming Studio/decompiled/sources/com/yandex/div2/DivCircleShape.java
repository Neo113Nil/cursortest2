package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivCircleShapeJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivCircleShape.kt */
/* loaded from: classes13.dex */
public final class DivCircleShape implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression backgroundColor;
    public final DivFixedSize radius;
    public final DivStroke stroke;
    public static final Companion Companion = new Companion(null);
    private static final DivFixedSize RADIUS_DEFAULT_VALUE = new DivFixedSize(null, Expression.Companion.constant$default(Expression.INSTANCE, 10L, null, 2, null), 1, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivCircleShape$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivCircleShape invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivCircleShape.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivCircleShape(Expression expression, DivFixedSize divFixedSize, DivStroke divStroke) {
        this.backgroundColor = expression;
        this.radius = divFixedSize;
        this.stroke = divStroke;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivCircleShape.class).hashCode();
        Expression expression = this.backgroundColor;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0) + this.radius.hash();
        DivStroke divStroke = this.stroke;
        int hash = hashCode2 + (divStroke != null ? divStroke.hash() : 0);
        this._hash = Integer.valueOf(hash);
        return hash;
    }

    public final boolean equals(DivCircleShape divCircleShape, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divCircleShape == null) {
            return false;
        }
        Expression expression = this.backgroundColor;
        Integer num = expression != null ? (Integer) expression.evaluate(expressionResolver) : null;
        Expression expression2 = divCircleShape.backgroundColor;
        if (!Intrinsics.areEqual(num, expression2 != null ? (Integer) expression2.evaluate(expressionResolver2) : null) || !this.radius.equals(divCircleShape.radius, expressionResolver, expressionResolver2)) {
            return false;
        }
        DivStroke divStroke = this.stroke;
        DivStroke divStroke2 = divCircleShape.stroke;
        return divStroke != null ? divStroke.equals(divStroke2, expressionResolver, expressionResolver2) : divStroke2 == null;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivCircleShapeJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivCircleShapeJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivCircleShape.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivCircleShape fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivCircleShapeJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivCircleShapeJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
