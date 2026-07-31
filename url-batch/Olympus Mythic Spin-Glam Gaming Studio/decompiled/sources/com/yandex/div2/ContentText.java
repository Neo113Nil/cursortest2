package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: ContentText.kt */
/* loaded from: classes4.dex */
public final class ContentText implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression value;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.ContentText$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final ContentText invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return ContentText.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public ContentText(Expression expression) {
        this.value = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(ContentText.class).hashCode() + this.value.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(ContentText contentText, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (contentText == null) {
            return false;
        }
        return Intrinsics.areEqual(this.value.evaluate(expressionResolver), contentText.value.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ContentTextJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getContentTextJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: ContentText.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ContentText fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((ContentTextJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getContentTextJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
