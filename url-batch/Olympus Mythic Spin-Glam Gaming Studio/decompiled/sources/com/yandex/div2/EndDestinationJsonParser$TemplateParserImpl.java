package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: EndDestinationJsonParser.kt */
/* loaded from: classes14.dex */
public final class EndDestinationJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public EndDestinationJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public EndDestinationTemplate deserialize(ParsingContext parsingContext, EndDestinationTemplate endDestinationTemplate, JSONObject jSONObject) {
        return new EndDestinationTemplate();
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, EndDestinationTemplate endDestinationTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "end");
        return jSONObject;
    }
}
