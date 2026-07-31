package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivPageContentSizeJsonParser.kt */
/* loaded from: classes15.dex */
public final class DivPageContentSizeJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivPageContentSizeJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivPageContentSize deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivPageContentSize();
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivPageContentSize divPageContentSize) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "wrap_content");
        return jSONObject;
    }
}
