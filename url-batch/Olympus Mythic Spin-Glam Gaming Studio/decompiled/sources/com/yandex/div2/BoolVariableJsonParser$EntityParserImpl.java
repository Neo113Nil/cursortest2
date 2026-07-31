package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: BoolVariableJsonParser.kt */
/* loaded from: classes10.dex */
public final class BoolVariableJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public BoolVariableJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public BoolVariable deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new BoolVariable((String) JsonPropertyParser.read(parsingContext, jSONObject, "name"), JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, BoolVariable boolVariable) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "name", boolVariable.name);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "boolean");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", boolVariable.value);
        return jSONObject;
    }
}
