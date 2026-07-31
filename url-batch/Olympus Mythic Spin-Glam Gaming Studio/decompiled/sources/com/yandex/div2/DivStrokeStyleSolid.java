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

/* compiled from: DivStrokeStyleSolid.kt */
/* loaded from: classes13.dex */
public final class DivStrokeStyleSolid implements JSONSerializable, Hashable {
    private Integer _hash;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivStrokeStyleSolid$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivStrokeStyleSolid invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivStrokeStyleSolid.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public final boolean equals(DivStrokeStyleSolid divStrokeStyleSolid, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divStrokeStyleSolid != null;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivStrokeStyleSolid.class).hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivStrokeStyleSolidJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivStrokeStyleSolidJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivStrokeStyleSolid.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivStrokeStyleSolid fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivStrokeStyleSolidJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivStrokeStyleSolidJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
