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

/* compiled from: UrlValueTemplate.kt */
/* loaded from: classes13.dex */
public final class UrlValueTemplate implements JSONSerializable, JsonTemplate {
    public final Field value;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.UrlValueTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final UrlValueTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new UrlValueTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public UrlValueTemplate(Field field) {
        this.value = field;
    }

    public /* synthetic */ UrlValueTemplate(ParsingEnvironment parsingEnvironment, UrlValueTemplate urlValueTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : urlValueTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    public UrlValueTemplate(ParsingEnvironment parsingEnvironment, UrlValueTemplate urlValueTemplate, boolean z, JSONObject jSONObject) {
        this(Field.INSTANCE.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public UrlValue resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((UrlValueJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getUrlValueJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((UrlValueJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getUrlValueJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: UrlValueTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
