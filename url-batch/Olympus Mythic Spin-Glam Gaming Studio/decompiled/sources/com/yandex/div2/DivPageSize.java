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

/* compiled from: DivPageSize.kt */
/* loaded from: classes11.dex */
public final class DivPageSize implements JSONSerializable, Hashable {
    private Integer _hash;
    public final DivPercentageSize pageWidth;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivPageSize$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivPageSize invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivPageSize.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivPageSize(DivPercentageSize divPercentageSize) {
        this.pageWidth = divPercentageSize;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivPageSize.class).hashCode() + this.pageWidth.hash();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivPageSize divPageSize, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divPageSize == null) {
            return false;
        }
        return this.pageWidth.equals(divPageSize.pageWidth, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivPageSizeJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPageSizeJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivPageSize.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivPageSize fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivPageSizeJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPageSizeJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
