package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivPhoneInputMaskJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivPhoneInputMaskJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivPhoneInputMaskJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivPhoneInputMask deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivPhoneInputMask((String) JsonPropertyParser.read(parsingContext, jSONObject, "raw_text_variable"));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivPhoneInputMask divPhoneInputMask) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "raw_text_variable", divPhoneInputMask.getRawTextVariable());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "phone");
        return jSONObject;
    }
}
