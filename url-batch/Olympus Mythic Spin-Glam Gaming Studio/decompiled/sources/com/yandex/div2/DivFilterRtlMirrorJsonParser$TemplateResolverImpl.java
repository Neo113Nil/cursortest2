package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivFilterRtlMirrorJsonParser.kt */
/* loaded from: classes15.dex */
public final class DivFilterRtlMirrorJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivFilterRtlMirrorJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivFilterRtlMirror resolve(ParsingContext parsingContext, DivFilterRtlMirrorTemplate divFilterRtlMirrorTemplate, JSONObject jSONObject) {
        return new DivFilterRtlMirror();
    }
}
