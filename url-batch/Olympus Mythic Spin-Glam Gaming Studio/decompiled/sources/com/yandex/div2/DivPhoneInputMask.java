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

/* compiled from: DivPhoneInputMask.kt */
/* loaded from: classes13.dex */
public final class DivPhoneInputMask implements JSONSerializable, Hashable, DivInputMaskBase {
    private Integer _hash;
    private final String rawTextVariable;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivPhoneInputMask$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivPhoneInputMask invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivPhoneInputMask.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivPhoneInputMask(String str) {
        this.rawTextVariable = str;
    }

    @Override // com.yandex.div2.DivInputMaskBase
    public String getRawTextVariable() {
        return this.rawTextVariable;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivPhoneInputMask.class).hashCode() + getRawTextVariable().hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivPhoneInputMask divPhoneInputMask, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divPhoneInputMask == null) {
            return false;
        }
        return Intrinsics.areEqual(getRawTextVariable(), divPhoneInputMask.getRawTextVariable());
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivPhoneInputMaskJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPhoneInputMaskJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivPhoneInputMask.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivPhoneInputMask fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivPhoneInputMaskJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPhoneInputMaskJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
