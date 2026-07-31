package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: ContentUrlTemplate.kt */
/* loaded from: classes9.dex */
public final class ContentUrlTemplate implements JSONSerializable, JsonTemplate {
    public final Field value;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.ContentUrlTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final ContentUrlTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new ContentUrlTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public ContentUrlTemplate(Field field) {
        this.value = field;
    }

    public /* synthetic */ ContentUrlTemplate(ParsingEnvironment parsingEnvironment, ContentUrlTemplate contentUrlTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : contentUrlTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    public ContentUrlTemplate(ParsingEnvironment parsingEnvironment, ContentUrlTemplate contentUrlTemplate, boolean z, JSONObject jSONObject) {
        this(Field.INSTANCE.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public ContentUrl resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((ContentUrlJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getContentUrlJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ContentUrlJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getContentUrlJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: ContentUrlTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
