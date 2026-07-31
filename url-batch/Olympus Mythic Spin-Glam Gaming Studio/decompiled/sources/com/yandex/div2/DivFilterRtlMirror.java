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

/* compiled from: DivFilterRtlMirror.kt */
/* loaded from: classes3.dex */
public final class DivFilterRtlMirror implements JSONSerializable, Hashable {
    private Integer _hash;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivFilterRtlMirror$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivFilterRtlMirror invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivFilterRtlMirror.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public final boolean equals(DivFilterRtlMirror divFilterRtlMirror, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divFilterRtlMirror != null;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivFilterRtlMirror.class).hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivFilterRtlMirrorJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFilterRtlMirrorJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivFilterRtlMirror.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivFilterRtlMirror fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivFilterRtlMirrorJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFilterRtlMirrorJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
