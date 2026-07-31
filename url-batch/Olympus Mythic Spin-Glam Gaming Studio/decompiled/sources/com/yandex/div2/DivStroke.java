package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivStrokeJsonParser;
import com.yandex.div2.DivStrokeStyle;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivStroke.kt */
/* loaded from: classes13.dex */
public final class DivStroke implements JSONSerializable, Hashable {
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final DivStrokeStyle.Solid STYLE_DEFAULT_VALUE = new DivStrokeStyle.Solid(new DivStrokeStyleSolid());
    private static final Expression UNIT_DEFAULT_VALUE;
    private static final Expression WIDTH_DEFAULT_VALUE;
    private Integer _hash;
    public final Expression color;
    public final DivStrokeStyle style;
    public final Expression unit;
    public final Expression width;

    public DivStroke(Expression expression, DivStrokeStyle divStrokeStyle, Expression expression2, Expression expression3) {
        this.color = expression;
        this.style = divStrokeStyle;
        this.unit = expression2;
        this.width = expression3;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivStroke.class).hashCode() + this.color.hashCode() + this.style.hash() + this.unit.hashCode() + this.width.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivStroke divStroke, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divStroke != null && ((Number) this.color.evaluate(expressionResolver)).intValue() == ((Number) divStroke.color.evaluate(expressionResolver2)).intValue() && this.style.equals(divStroke.style, expressionResolver, expressionResolver2) && this.unit.evaluate(expressionResolver) == divStroke.unit.evaluate(expressionResolver2) && ((Number) this.width.evaluate(expressionResolver)).doubleValue() == ((Number) divStroke.width.evaluate(expressionResolver2)).doubleValue();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivStrokeJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivStrokeJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivStroke.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivStroke fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivStrokeJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivStrokeJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        UNIT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivSizeUnit.DP, null, 2, null);
        WIDTH_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        CREATOR = new Function2() { // from class: com.yandex.div2.DivStroke$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivStroke invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivStroke.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }
}
