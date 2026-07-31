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

/* compiled from: DivActionAnimatorStop.kt */
/* loaded from: classes15.dex */
public final class DivActionAnimatorStop implements JSONSerializable, Hashable {
    private Integer _hash;
    public final String animatorId;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionAnimatorStop$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionAnimatorStop invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionAnimatorStop.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivActionAnimatorStop(String str) {
        this.animatorId = str;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivActionAnimatorStop.class).hashCode() + this.animatorId.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivActionAnimatorStop divActionAnimatorStop, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divActionAnimatorStop == null) {
            return false;
        }
        return Intrinsics.areEqual(this.animatorId, divActionAnimatorStop.animatorId);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionAnimatorStopJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionAnimatorStopJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionAnimatorStop.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivActionAnimatorStop fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivActionAnimatorStopJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionAnimatorStopJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
