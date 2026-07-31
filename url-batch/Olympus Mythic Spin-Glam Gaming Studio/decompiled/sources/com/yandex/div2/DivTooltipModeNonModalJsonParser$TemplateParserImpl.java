package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivTooltipModeNonModalJsonParser.kt */
/* loaded from: classes14.dex */
public final class DivTooltipModeNonModalJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivTooltipModeNonModalJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivTooltipModeNonModalTemplate deserialize(ParsingContext parsingContext, DivTooltipModeNonModalTemplate divTooltipModeNonModalTemplate, JSONObject jSONObject) {
        return new DivTooltipModeNonModalTemplate();
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivTooltipModeNonModalTemplate divTooltipModeNonModalTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "non_modal");
        return jSONObject;
    }
}
