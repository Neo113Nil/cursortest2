package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivInfinityCountJsonParser.kt */
/* loaded from: classes5.dex */
public final class DivInfinityCountJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivInfinityCountJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivInfinityCount deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivInfinityCount();
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivInfinityCount divInfinityCount) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "infinity");
        return jSONObject;
    }
}
