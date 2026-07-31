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

/* compiled from: DivActionClearFocus.kt */
/* loaded from: classes15.dex */
public final class DivActionClearFocus implements JSONSerializable, Hashable {
    private Integer _hash;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionClearFocus$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionClearFocus invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionClearFocus.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public final boolean equals(DivActionClearFocus divActionClearFocus, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divActionClearFocus != null;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivActionClearFocus.class).hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionClearFocusJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionClearFocusJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionClearFocus.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivActionClearFocus fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivActionClearFocusJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionClearFocusJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
