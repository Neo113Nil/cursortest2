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

/* compiled from: DivWrapContentSize.kt */
/* loaded from: classes15.dex */
public final class DivWrapContentSize implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression constrained;
    public final DivSizeUnitValue maxSize;
    public final DivSizeUnitValue minSize;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivWrapContentSize$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivWrapContentSize invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivWrapContentSize.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivWrapContentSize(Expression expression, DivSizeUnitValue divSizeUnitValue, DivSizeUnitValue divSizeUnitValue2) {
        this.constrained = expression;
        this.maxSize = divSizeUnitValue;
        this.minSize = divSizeUnitValue2;
    }

    public /* synthetic */ DivWrapContentSize(Expression expression, DivSizeUnitValue divSizeUnitValue, DivSizeUnitValue divSizeUnitValue2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : expression, (i & 2) != 0 ? null : divSizeUnitValue, (i & 4) != 0 ? null : divSizeUnitValue2);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivWrapContentSize.class).hashCode();
        Expression expression = this.constrained;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        DivSizeUnitValue divSizeUnitValue = this.maxSize;
        int hash = hashCode2 + (divSizeUnitValue != null ? divSizeUnitValue.hash() : 0);
        DivSizeUnitValue divSizeUnitValue2 = this.minSize;
        int hash2 = hash + (divSizeUnitValue2 != null ? divSizeUnitValue2.hash() : 0);
        this._hash = Integer.valueOf(hash2);
        return hash2;
    }

    public final boolean equals(DivWrapContentSize divWrapContentSize, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divWrapContentSize == null) {
            return false;
        }
        Expression expression = this.constrained;
        Boolean bool = expression != null ? (Boolean) expression.evaluate(expressionResolver) : null;
        Expression expression2 = divWrapContentSize.constrained;
        if (!Intrinsics.areEqual(bool, expression2 != null ? (Boolean) expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivSizeUnitValue divSizeUnitValue = this.maxSize;
        if (!(divSizeUnitValue != null ? divSizeUnitValue.equals(divWrapContentSize.maxSize, expressionResolver, expressionResolver2) : divWrapContentSize.maxSize == null)) {
            return false;
        }
        DivSizeUnitValue divSizeUnitValue2 = this.minSize;
        DivSizeUnitValue divSizeUnitValue3 = divWrapContentSize.minSize;
        return divSizeUnitValue2 != null ? divSizeUnitValue2.equals(divSizeUnitValue3, expressionResolver, expressionResolver2) : divSizeUnitValue3 == null;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivWrapContentSizeJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivWrapContentSizeJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivWrapContentSize.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivWrapContentSize fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivWrapContentSizeJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivWrapContentSizeJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
