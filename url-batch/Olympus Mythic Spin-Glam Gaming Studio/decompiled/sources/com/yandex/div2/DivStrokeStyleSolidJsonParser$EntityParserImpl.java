package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivStrokeStyleSolidJsonParser.kt */
/* loaded from: classes5.dex */
public final class DivStrokeStyleSolidJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivStrokeStyleSolidJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivStrokeStyleSolid deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivStrokeStyleSolid();
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivStrokeStyleSolid divStrokeStyleSolid) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "solid");
        return jSONObject;
    }
}
