package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: StartDestinationJsonParser.kt */
/* loaded from: classes9.dex */
public final class StartDestinationJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public StartDestinationJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public StartDestination resolve(ParsingContext parsingContext, StartDestinationTemplate startDestinationTemplate, JSONObject jSONObject) {
        return new StartDestination();
    }
}
