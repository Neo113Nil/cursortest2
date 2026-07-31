package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivMatchParentSizeJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivMatchParentSize.kt */
/* loaded from: classes13.dex */
public final class DivMatchParentSize implements JSONSerializable, Hashable {
    private Integer _hash;
    public final DivSizeUnitValue maxSize;
    public final DivSizeUnitValue minSize;
    public final Expression weight;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivMatchParentSize$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivMatchParentSize invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivMatchParentSize.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivMatchParentSize(DivSizeUnitValue divSizeUnitValue, DivSizeUnitValue divSizeUnitValue2, Expression expression) {
        this.maxSize = divSizeUnitValue;
        this.minSize = divSizeUnitValue2;
        this.weight = expression;
    }

    public /* synthetic */ DivMatchParentSize(DivSizeUnitValue divSizeUnitValue, DivSizeUnitValue divSizeUnitValue2, Expression expression, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : divSizeUnitValue, (i & 2) != 0 ? null : divSizeUnitValue2, (i & 4) != 0 ? null : expression);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivMatchParentSize.class).hashCode();
        DivSizeUnitValue divSizeUnitValue = this.maxSize;
        int hash = hashCode + (divSizeUnitValue != null ? divSizeUnitValue.hash() : 0);
        DivSizeUnitValue divSizeUnitValue2 = this.minSize;
        int hash2 = hash + (divSizeUnitValue2 != null ? divSizeUnitValue2.hash() : 0);
        Expression expression = this.weight;
        int hashCode2 = hash2 + (expression != null ? expression.hashCode() : 0);
        this._hash = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    public final boolean equals(DivMatchParentSize divMatchParentSize, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divMatchParentSize == null) {
            return false;
        }
        DivSizeUnitValue divSizeUnitValue = this.maxSize;
        if (!(divSizeUnitValue != null ? divSizeUnitValue.equals(divMatchParentSize.maxSize, expressionResolver, expressionResolver2) : divMatchParentSize.maxSize == null)) {
            return false;
        }
        DivSizeUnitValue divSizeUnitValue2 = this.minSize;
        if (!(divSizeUnitValue2 != null ? divSizeUnitValue2.equals(divMatchParentSize.minSize, expressionResolver, expressionResolver2) : divMatchParentSize.minSize == null)) {
            return false;
        }
        Expression expression = this.weight;
        Double d = expression != null ? (Double) expression.evaluate(expressionResolver) : null;
        Expression expression2 = divMatchParentSize.weight;
        return Intrinsics.areEqual(d, expression2 != null ? (Double) expression2.evaluate(expressionResolver2) : null);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivMatchParentSizeJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivMatchParentSizeJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivMatchParentSize.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivMatchParentSize fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivMatchParentSizeJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivMatchParentSizeJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
