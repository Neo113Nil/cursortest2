package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivPivot;
import com.yandex.div2.DivTransformJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTransform.kt */
/* loaded from: classes3.dex */
public final class DivTransform implements JSONSerializable, Hashable {
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final DivPivot.Percentage PIVOT_X_DEFAULT_VALUE;
    private static final DivPivot.Percentage PIVOT_Y_DEFAULT_VALUE;
    private Integer _hash;
    public final DivPivot pivotX;
    public final DivPivot pivotY;
    public final Expression rotation;

    public DivTransform(DivPivot divPivot, DivPivot divPivot2, Expression expression) {
        this.pivotX = divPivot;
        this.pivotY = divPivot2;
        this.rotation = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivTransform.class).hashCode() + this.pivotX.hash() + this.pivotY.hash();
        Expression expression = this.rotation;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        this._hash = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    public final boolean equals(DivTransform divTransform, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divTransform == null || !this.pivotX.equals(divTransform.pivotX, expressionResolver, expressionResolver2) || !this.pivotY.equals(divTransform.pivotY, expressionResolver, expressionResolver2)) {
            return false;
        }
        Expression expression = this.rotation;
        Double d = expression != null ? (Double) expression.evaluate(expressionResolver) : null;
        Expression expression2 = divTransform.rotation;
        return Intrinsics.areEqual(d, expression2 != null ? (Double) expression2.evaluate(expressionResolver2) : null);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivTransformJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTransformJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivTransform.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivTransform fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivTransformJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTransformJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        Double valueOf = Double.valueOf(50.0d);
        PIVOT_X_DEFAULT_VALUE = new DivPivot.Percentage(new DivPivotPercentage(Expression.Companion.constant$default(companion, valueOf, null, 2, null)));
        PIVOT_Y_DEFAULT_VALUE = new DivPivot.Percentage(new DivPivotPercentage(Expression.Companion.constant$default(companion, valueOf, null, 2, null)));
        CREATOR = new Function2() { // from class: com.yandex.div2.DivTransform$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivTransform invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivTransform.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }
}
