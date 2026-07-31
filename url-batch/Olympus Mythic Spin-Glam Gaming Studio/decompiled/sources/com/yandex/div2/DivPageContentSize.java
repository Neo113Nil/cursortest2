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

/* compiled from: DivPageContentSize.kt */
/* loaded from: classes13.dex */
public final class DivPageContentSize implements JSONSerializable, Hashable {
    private Integer _hash;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivPageContentSize$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivPageContentSize invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivPageContentSize.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public final boolean equals(DivPageContentSize divPageContentSize, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divPageContentSize != null;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivPageContentSize.class).hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivPageContentSizeJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPageContentSizeJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivPageContentSize.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivPageContentSize fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivPageContentSizeJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPageContentSizeJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
