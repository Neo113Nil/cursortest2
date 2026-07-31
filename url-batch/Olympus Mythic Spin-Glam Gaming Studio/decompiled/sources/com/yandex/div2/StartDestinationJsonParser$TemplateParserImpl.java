package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: StartDestinationJsonParser.kt */
/* loaded from: classes4.dex */
public final class StartDestinationJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public StartDestinationJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public StartDestinationTemplate deserialize(ParsingContext parsingContext, StartDestinationTemplate startDestinationTemplate, JSONObject jSONObject) {
        return new StartDestinationTemplate();
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, StartDestinationTemplate startDestinationTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "start");
        return jSONObject;
    }
}
