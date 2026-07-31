package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivExtension.kt */
/* loaded from: classes13.dex */
public final class DivExtension implements JSONSerializable, Hashable {
    private Integer _hash;
    public final String id;
    public final JSONObject params;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivExtension$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivExtension invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivExtension.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivExtension(String str, JSONObject jSONObject) {
        this.id = str;
        this.params = jSONObject;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivExtension.class).hashCode() + this.id.hashCode();
        JSONObject jSONObject = this.params;
        int hashCode2 = hashCode + (jSONObject != null ? jSONObject.hashCode() : 0);
        this._hash = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    public final boolean equals(DivExtension divExtension, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divExtension != null && Intrinsics.areEqual(this.id, divExtension.id) && Intrinsics.areEqual(this.params, divExtension.params);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivExtensionJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivExtensionJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivExtension.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivExtension fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivExtensionJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivExtensionJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
