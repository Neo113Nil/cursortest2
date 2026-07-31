package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivStretchIndicatorItemPlacementJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivStretchIndicatorItemPlacement.kt */
/* loaded from: classes9.dex */
public final class DivStretchIndicatorItemPlacement implements JSONSerializable, Hashable {
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final DivFixedSize ITEM_SPACING_DEFAULT_VALUE;
    private static final Expression MAX_VISIBLE_ITEMS_DEFAULT_VALUE;
    private Integer _hash;
    public final DivFixedSize itemSpacing;
    public final Expression maxVisibleItems;

    public DivStretchIndicatorItemPlacement(DivFixedSize divFixedSize, Expression expression) {
        this.itemSpacing = divFixedSize;
        this.maxVisibleItems = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivStretchIndicatorItemPlacement.class).hashCode() + this.itemSpacing.hash() + this.maxVisibleItems.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivStretchIndicatorItemPlacement divStretchIndicatorItemPlacement, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divStretchIndicatorItemPlacement != null && this.itemSpacing.equals(divStretchIndicatorItemPlacement.itemSpacing, expressionResolver, expressionResolver2) && ((Number) this.maxVisibleItems.evaluate(expressionResolver)).longValue() == ((Number) divStretchIndicatorItemPlacement.maxVisibleItems.evaluate(expressionResolver2)).longValue();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivStretchIndicatorItemPlacementJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivStretchIndicatorItemPlacementJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivStretchIndicatorItemPlacement.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivStretchIndicatorItemPlacement fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivStretchIndicatorItemPlacementJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivStretchIndicatorItemPlacementJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        ITEM_SPACING_DEFAULT_VALUE = new DivFixedSize(null, Expression.Companion.constant$default(companion, 5L, null, 2, null), 1, null);
        MAX_VISIBLE_ITEMS_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 10L, null, 2, null);
        CREATOR = new Function2() { // from class: com.yandex.div2.DivStretchIndicatorItemPlacement$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivStretchIndicatorItemPlacement invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivStretchIndicatorItemPlacement.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }
}
