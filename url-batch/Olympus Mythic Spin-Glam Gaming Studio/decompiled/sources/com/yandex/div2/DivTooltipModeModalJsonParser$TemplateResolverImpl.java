package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivTooltipModeModalJsonParser.kt */
/* loaded from: classes14.dex */
public final class DivTooltipModeModalJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivTooltipModeModalJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivTooltipModeModal resolve(ParsingContext parsingContext, DivTooltipModeModalTemplate divTooltipModeModalTemplate, JSONObject jSONObject) {
        return new DivTooltipModeModal();
    }
}
