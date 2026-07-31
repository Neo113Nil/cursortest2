package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivTooltipModeNonModalJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivTooltipModeNonModalJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivTooltipModeNonModalJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivTooltipModeNonModal resolve(ParsingContext parsingContext, DivTooltipModeNonModalTemplate divTooltipModeNonModalTemplate, JSONObject jSONObject) {
        return new DivTooltipModeNonModal();
    }
}
