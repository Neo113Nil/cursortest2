package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: StrVariableJsonParser.kt */
/* loaded from: classes13.dex */
public final class StrVariableJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public StrVariableJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public StrVariable deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new StrVariable((String) JsonPropertyParser.read(parsingContext, jSONObject, "name"), JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, StrVariable strVariable) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "name", strVariable.name);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "string");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", strVariable.value);
        return jSONObject;
    }
}
