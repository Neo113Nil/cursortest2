package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivStrokeStyleDashedJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivStrokeStyleDashedJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivStrokeStyleDashedJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivStrokeStyleDashedTemplate deserialize(ParsingContext parsingContext, DivStrokeStyleDashedTemplate divStrokeStyleDashedTemplate, JSONObject jSONObject) {
        return new DivStrokeStyleDashedTemplate();
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivStrokeStyleDashedTemplate divStrokeStyleDashedTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "dashed");
        return jSONObject;
    }
}
