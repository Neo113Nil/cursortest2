package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivPageContentSizeTemplate.kt */
/* loaded from: classes10.dex */
public final class DivPageContentSizeTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivPageContentSizeTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivPageContentSizeTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivPageContentSizeTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivPageContentSizeTemplate() {
    }

    public /* synthetic */ DivPageContentSizeTemplate(ParsingEnvironment parsingEnvironment, DivPageContentSizeTemplate divPageContentSizeTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divPageContentSizeTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    public DivPageContentSizeTemplate(ParsingEnvironment parsingEnvironment, DivPageContentSizeTemplate divPageContentSizeTemplate, boolean z, JSONObject jSONObject) {
        this();
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivPageContentSize resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivPageContentSizeJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPageContentSizeJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivPageContentSizeJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPageContentSizeJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivPageContentSizeTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
