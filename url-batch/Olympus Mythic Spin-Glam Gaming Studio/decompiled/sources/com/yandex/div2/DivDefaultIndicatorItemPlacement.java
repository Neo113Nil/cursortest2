package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivDefaultIndicatorItemPlacementJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivDefaultIndicatorItemPlacement.kt */
/* loaded from: classes14.dex */
public final class DivDefaultIndicatorItemPlacement implements JSONSerializable, Hashable {
    private Integer _hash;
    public final DivFixedSize spaceBetweenCenters;
    public static final Companion Companion = new Companion(null);
    private static final DivFixedSize SPACE_BETWEEN_CENTERS_DEFAULT_VALUE = new DivFixedSize(null, Expression.Companion.constant$default(Expression.INSTANCE, 15L, null, 2, null), 1, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivDefaultIndicatorItemPlacement$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivDefaultIndicatorItemPlacement invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivDefaultIndicatorItemPlacement.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivDefaultIndicatorItemPlacement(DivFixedSize divFixedSize) {
        this.spaceBetweenCenters = divFixedSize;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivDefaultIndicatorItemPlacement.class).hashCode() + this.spaceBetweenCenters.hash();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivDefaultIndicatorItemPlacement divDefaultIndicatorItemPlacement, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divDefaultIndicatorItemPlacement == null) {
            return false;
        }
        return this.spaceBetweenCenters.equals(divDefaultIndicatorItemPlacement.spaceBetweenCenters, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivDefaultIndicatorItemPlacementJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivDefaultIndicatorItemPlacementJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivDefaultIndicatorItemPlacement.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivDefaultIndicatorItemPlacement fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivDefaultIndicatorItemPlacementJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivDefaultIndicatorItemPlacementJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
