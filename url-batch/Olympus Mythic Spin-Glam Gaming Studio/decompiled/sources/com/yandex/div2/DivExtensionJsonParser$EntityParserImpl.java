package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivExtensionJsonParser.kt */
/* loaded from: classes5.dex */
public final class DivExtensionJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivExtensionJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivExtension deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivExtension((String) JsonPropertyParser.read(parsingContext, jSONObject, "id"), (JSONObject) JsonPropertyParser.readOptional(parsingContext, jSONObject, "params"));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivExtension divExtension) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "id", divExtension.id);
        JsonPropertyParser.write(parsingContext, jSONObject, "params", divExtension.params);
        return jSONObject;
    }
}
