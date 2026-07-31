package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivTooltipModeModalJsonParser.kt */
/* loaded from: classes5.dex */
public final class DivTooltipModeModalJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivTooltipModeModalJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivTooltipModeModalTemplate deserialize(ParsingContext parsingContext, DivTooltipModeModalTemplate divTooltipModeModalTemplate, JSONObject jSONObject) {
        return new DivTooltipModeModalTemplate();
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivTooltipModeModalTemplate divTooltipModeModalTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "modal");
        return jSONObject;
    }
}
