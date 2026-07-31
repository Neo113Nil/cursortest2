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

/* compiled from: DivActionCopyToClipboard.kt */
/* loaded from: classes14.dex */
public final class DivActionCopyToClipboard implements JSONSerializable, Hashable {
    private Integer _hash;
    public final DivActionCopyToClipboardContent content;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionCopyToClipboard$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionCopyToClipboard invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionCopyToClipboard.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivActionCopyToClipboard(DivActionCopyToClipboardContent divActionCopyToClipboardContent) {
        this.content = divActionCopyToClipboardContent;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivActionCopyToClipboard.class).hashCode() + this.content.hash();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivActionCopyToClipboard divActionCopyToClipboard, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divActionCopyToClipboard == null) {
            return false;
        }
        return this.content.equals(divActionCopyToClipboard.content, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionCopyToClipboardJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionCopyToClipboardJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionCopyToClipboard.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivActionCopyToClipboard fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivActionCopyToClipboardJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionCopyToClipboardJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
