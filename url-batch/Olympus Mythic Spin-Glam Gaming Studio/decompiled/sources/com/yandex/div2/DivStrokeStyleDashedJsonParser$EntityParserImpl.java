package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivStrokeStyleDashedJsonParser.kt */
/* loaded from: classes15.dex */
public final class DivStrokeStyleDashedJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivStrokeStyleDashedJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivStrokeStyleDashed deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivStrokeStyleDashed();
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivStrokeStyleDashed divStrokeStyleDashed) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "dashed");
        return jSONObject;
    }
}
