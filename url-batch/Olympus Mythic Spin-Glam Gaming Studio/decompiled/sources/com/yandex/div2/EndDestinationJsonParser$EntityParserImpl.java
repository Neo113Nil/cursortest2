package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: EndDestinationJsonParser.kt */
/* loaded from: classes10.dex */
public final class EndDestinationJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public EndDestinationJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public EndDestination deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new EndDestination();
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, EndDestination endDestination) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "end");
        return jSONObject;
    }
}
