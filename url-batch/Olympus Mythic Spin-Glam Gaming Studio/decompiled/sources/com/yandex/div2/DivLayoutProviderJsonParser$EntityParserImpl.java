package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivLayoutProviderJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivLayoutProviderJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivLayoutProviderJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivLayoutProvider deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivLayoutProvider((String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height_variable_name"), (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width_variable_name"));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivLayoutProvider divLayoutProvider) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "height_variable_name", divLayoutProvider.heightVariableName);
        JsonPropertyParser.write(parsingContext, jSONObject, "width_variable_name", divLayoutProvider.widthVariableName);
        return jSONObject;
    }
}
