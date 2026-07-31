package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivInfinityCountJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivInfinityCountJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivInfinityCountJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivInfinityCount resolve(ParsingContext parsingContext, DivInfinityCountTemplate divInfinityCountTemplate, JSONObject jSONObject) {
        return new DivInfinityCount();
    }
}
