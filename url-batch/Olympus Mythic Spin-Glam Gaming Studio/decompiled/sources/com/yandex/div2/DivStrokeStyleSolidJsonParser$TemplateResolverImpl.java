package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivStrokeStyleSolidJsonParser.kt */
/* loaded from: classes14.dex */
public final class DivStrokeStyleSolidJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivStrokeStyleSolidJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivStrokeStyleSolid resolve(ParsingContext parsingContext, DivStrokeStyleSolidTemplate divStrokeStyleSolidTemplate, JSONObject jSONObject) {
        return new DivStrokeStyleSolid();
    }
}
