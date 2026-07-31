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

/* compiled from: ContentUrl.kt */
/* loaded from: classes3.dex */
public final class ContentUrl implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression value;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.ContentUrl$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final ContentUrl invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return ContentUrl.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public ContentUrl(Expression expression) {
        this.value = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(ContentUrl.class).hashCode() + this.value.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(ContentUrl contentUrl, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (contentUrl == null) {
            return false;
        }
        return Intrinsics.areEqual(this.value.evaluate(expressionResolver), contentUrl.value.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ContentUrlJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getContentUrlJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: ContentUrl.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ContentUrl fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((ContentUrlJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getContentUrlJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
