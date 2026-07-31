package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: EndDestinationJsonParser.kt */
/* loaded from: classes6.dex */
public final class EndDestinationJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public EndDestinationJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public EndDestination resolve(ParsingContext parsingContext, EndDestinationTemplate endDestinationTemplate, JSONObject jSONObject) {
        return new EndDestination();
    }
}
