package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: StartDestinationJsonParser.kt */
/* loaded from: classes6.dex */
public final class StartDestinationJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public StartDestinationJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public StartDestination deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new StartDestination();
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, StartDestination startDestination) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "start");
        return jSONObject;
    }
}
