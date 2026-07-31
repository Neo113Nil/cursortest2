package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivFunctionArgumentJsonParser.kt */
/* loaded from: classes11.dex */
public final class DivFunctionArgumentJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivFunctionArgumentJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivFunctionArgument deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivFunctionArgument((String) JsonPropertyParser.read(parsingContext, jSONObject, "name"), (DivEvaluableType) JsonPropertyParser.read(parsingContext, jSONObject, "type", DivEvaluableType.FROM_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivFunctionArgument divFunctionArgument) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "name", divFunctionArgument.name);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", divFunctionArgument.type, DivEvaluableType.TO_STRING);
        return jSONObject;
    }
}
