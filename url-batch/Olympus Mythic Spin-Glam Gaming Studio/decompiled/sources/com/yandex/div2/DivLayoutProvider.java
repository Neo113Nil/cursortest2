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

/* compiled from: DivLayoutProvider.kt */
/* loaded from: classes9.dex */
public final class DivLayoutProvider implements JSONSerializable, Hashable {
    private Integer _hash;
    public final String heightVariableName;
    public final String widthVariableName;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivLayoutProvider$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivLayoutProvider invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivLayoutProvider.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivLayoutProvider(String str, String str2) {
        this.heightVariableName = str;
        this.widthVariableName = str2;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivLayoutProvider.class).hashCode();
        String str = this.heightVariableName;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        String str2 = this.widthVariableName;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this._hash = Integer.valueOf(hashCode3);
        return hashCode3;
    }

    public final boolean equals(DivLayoutProvider divLayoutProvider, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divLayoutProvider != null && Intrinsics.areEqual(this.heightVariableName, divLayoutProvider.heightVariableName) && Intrinsics.areEqual(this.widthVariableName, divLayoutProvider.widthVariableName);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivLayoutProviderJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivLayoutProviderJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivLayoutProvider.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivLayoutProvider fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivLayoutProviderJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivLayoutProviderJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
