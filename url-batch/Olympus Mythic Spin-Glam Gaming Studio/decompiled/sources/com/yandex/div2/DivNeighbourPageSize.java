package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivNeighbourPageSize.kt */
/* loaded from: classes4.dex */
public final class DivNeighbourPageSize implements JSONSerializable, Hashable {
    private Integer _hash;
    public final DivFixedSize neighbourPageWidth;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivNeighbourPageSize$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivNeighbourPageSize invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivNeighbourPageSize.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivNeighbourPageSize(DivFixedSize divFixedSize) {
        this.neighbourPageWidth = divFixedSize;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivNeighbourPageSize.class).hashCode() + this.neighbourPageWidth.hash();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivNeighbourPageSize divNeighbourPageSize, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divNeighbourPageSize == null) {
            return false;
        }
        return this.neighbourPageWidth.equals(divNeighbourPageSize.neighbourPageWidth, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivNeighbourPageSizeJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivNeighbourPageSizeJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivNeighbourPageSize.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivNeighbourPageSize fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivNeighbourPageSizeJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivNeighbourPageSizeJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
