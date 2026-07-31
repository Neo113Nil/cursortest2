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

/* compiled from: DivShapeDrawable.kt */
/* loaded from: classes14.dex */
public final class DivShapeDrawable implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression color;
    public final DivShape shape;
    public final DivStroke stroke;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivShapeDrawable$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivShapeDrawable invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivShapeDrawable.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivShapeDrawable(Expression expression, DivShape divShape, DivStroke divStroke) {
        this.color = expression;
        this.shape = divShape;
        this.stroke = divStroke;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivShapeDrawable.class).hashCode() + this.color.hashCode() + this.shape.hash();
        DivStroke divStroke = this.stroke;
        int hash = hashCode + (divStroke != null ? divStroke.hash() : 0);
        this._hash = Integer.valueOf(hash);
        return hash;
    }

    public final boolean equals(DivShapeDrawable divShapeDrawable, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divShapeDrawable == null || ((Number) this.color.evaluate(expressionResolver)).intValue() != ((Number) divShapeDrawable.color.evaluate(expressionResolver2)).intValue() || !this.shape.equals(divShapeDrawable.shape, expressionResolver, expressionResolver2)) {
            return false;
        }
        DivStroke divStroke = this.stroke;
        DivStroke divStroke2 = divShapeDrawable.stroke;
        return divStroke != null ? divStroke.equals(divStroke2, expressionResolver, expressionResolver2) : divStroke2 == null;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivShapeDrawableJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivShapeDrawableJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivShapeDrawable.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivShapeDrawable fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivShapeDrawableJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivShapeDrawableJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
