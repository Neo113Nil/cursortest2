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

/* compiled from: DivInputFilterRegexTemplate.kt */
/* loaded from: classes12.dex */
public final class DivInputFilterRegexTemplate implements JSONSerializable, JsonTemplate {
    public final Field pattern;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivInputFilterRegexTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivInputFilterRegexTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivInputFilterRegexTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivInputFilterRegexTemplate(Field field) {
        this.pattern = field;
    }

    public /* synthetic */ DivInputFilterRegexTemplate(ParsingEnvironment parsingEnvironment, DivInputFilterRegexTemplate divInputFilterRegexTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divInputFilterRegexTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    public DivInputFilterRegexTemplate(ParsingEnvironment parsingEnvironment, DivInputFilterRegexTemplate divInputFilterRegexTemplate, boolean z, JSONObject jSONObject) {
        this(Field.INSTANCE.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivInputFilterRegex resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivInputFilterRegexJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputFilterRegexJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivInputFilterRegexJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputFilterRegexJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivInputFilterRegexTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
