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

/* compiled from: DivFilterRtlMirrorTemplate.kt */
/* loaded from: classes4.dex */
public final class DivFilterRtlMirrorTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivFilterRtlMirrorTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivFilterRtlMirrorTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivFilterRtlMirrorTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivFilterRtlMirrorTemplate() {
    }

    public /* synthetic */ DivFilterRtlMirrorTemplate(ParsingEnvironment parsingEnvironment, DivFilterRtlMirrorTemplate divFilterRtlMirrorTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divFilterRtlMirrorTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    public DivFilterRtlMirrorTemplate(ParsingEnvironment parsingEnvironment, DivFilterRtlMirrorTemplate divFilterRtlMirrorTemplate, boolean z, JSONObject jSONObject) {
        this();
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivFilterRtlMirror resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivFilterRtlMirrorJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFilterRtlMirrorJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivFilterRtlMirrorJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFilterRtlMirrorJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivFilterRtlMirrorTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
