package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivRoundedRectangleShapeJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivRoundedRectangleShape.kt */
/* loaded from: classes11.dex */
public final class DivRoundedRectangleShape implements JSONSerializable, Hashable {
    private static final DivFixedSize CORNER_RADIUS_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final DivFixedSize ITEM_HEIGHT_DEFAULT_VALUE;
    private static final DivFixedSize ITEM_WIDTH_DEFAULT_VALUE;
    private Integer _hash;
    public final Expression backgroundColor;
    public final DivFixedSize cornerRadius;
    public final DivFixedSize itemHeight;
    public final DivFixedSize itemWidth;
    public final DivStroke stroke;

    public DivRoundedRectangleShape(Expression expression, DivFixedSize divFixedSize, DivFixedSize divFixedSize2, DivFixedSize divFixedSize3, DivStroke divStroke) {
        this.backgroundColor = expression;
        this.cornerRadius = divFixedSize;
        this.itemHeight = divFixedSize2;
        this.itemWidth = divFixedSize3;
        this.stroke = divStroke;
    }

    public /* synthetic */ DivRoundedRectangleShape(Expression expression, DivFixedSize divFixedSize, DivFixedSize divFixedSize2, DivFixedSize divFixedSize3, DivStroke divStroke, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : expression, (i & 2) != 0 ? CORNER_RADIUS_DEFAULT_VALUE : divFixedSize, (i & 4) != 0 ? ITEM_HEIGHT_DEFAULT_VALUE : divFixedSize2, (i & 8) != 0 ? ITEM_WIDTH_DEFAULT_VALUE : divFixedSize3, (i & 16) != 0 ? null : divStroke);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivRoundedRectangleShape.class).hashCode();
        Expression expression = this.backgroundColor;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0) + this.cornerRadius.hash() + this.itemHeight.hash() + this.itemWidth.hash();
        DivStroke divStroke = this.stroke;
        int hash = hashCode2 + (divStroke != null ? divStroke.hash() : 0);
        this._hash = Integer.valueOf(hash);
        return hash;
    }

    public final boolean equals(DivRoundedRectangleShape divRoundedRectangleShape, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divRoundedRectangleShape == null) {
            return false;
        }
        Expression expression = this.backgroundColor;
        Integer num = expression != null ? (Integer) expression.evaluate(expressionResolver) : null;
        Expression expression2 = divRoundedRectangleShape.backgroundColor;
        if (!Intrinsics.areEqual(num, expression2 != null ? (Integer) expression2.evaluate(expressionResolver2) : null) || !this.cornerRadius.equals(divRoundedRectangleShape.cornerRadius, expressionResolver, expressionResolver2) || !this.itemHeight.equals(divRoundedRectangleShape.itemHeight, expressionResolver, expressionResolver2) || !this.itemWidth.equals(divRoundedRectangleShape.itemWidth, expressionResolver, expressionResolver2)) {
            return false;
        }
        DivStroke divStroke = this.stroke;
        DivStroke divStroke2 = divRoundedRectangleShape.stroke;
        return divStroke != null ? divStroke.equals(divStroke2, expressionResolver, expressionResolver2) : divStroke2 == null;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivRoundedRectangleShapeJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRoundedRectangleShapeJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivRoundedRectangleShape.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivRoundedRectangleShape fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivRoundedRectangleShapeJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRoundedRectangleShapeJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        CORNER_RADIUS_DEFAULT_VALUE = new DivFixedSize(null, Expression.Companion.constant$default(companion, 5L, null, 2, null), 1, null);
        ITEM_HEIGHT_DEFAULT_VALUE = new DivFixedSize(null, Expression.Companion.constant$default(companion, 10L, null, 2, null), 1, null);
        ITEM_WIDTH_DEFAULT_VALUE = new DivFixedSize(null, Expression.Companion.constant$default(companion, 10L, null, 2, null), 1, null);
        CREATOR = new Function2() { // from class: com.yandex.div2.DivRoundedRectangleShape$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivRoundedRectangleShape invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivRoundedRectangleShape.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }
}
