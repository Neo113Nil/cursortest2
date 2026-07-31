package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivStrokeStyleDashedJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivStrokeStyleDashedJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivStrokeStyleDashedJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivStrokeStyleDashed resolve(ParsingContext parsingContext, DivStrokeStyleDashedTemplate divStrokeStyleDashedTemplate, JSONObject jSONObject) {
        return new DivStrokeStyleDashed();
    }
}
