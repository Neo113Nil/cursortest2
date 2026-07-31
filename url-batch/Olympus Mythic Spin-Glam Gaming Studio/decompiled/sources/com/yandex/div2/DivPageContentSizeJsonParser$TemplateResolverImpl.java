package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivPageContentSizeJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivPageContentSizeJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivPageContentSizeJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivPageContentSize resolve(ParsingContext parsingContext, DivPageContentSizeTemplate divPageContentSizeTemplate, JSONObject jSONObject) {
        return new DivPageContentSize();
    }
}
