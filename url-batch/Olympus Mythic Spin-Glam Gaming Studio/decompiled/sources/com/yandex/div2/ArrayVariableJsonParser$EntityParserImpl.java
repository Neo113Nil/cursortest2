package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: ArrayVariableJsonParser.kt */
/* loaded from: classes10.dex */
public final class ArrayVariableJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public ArrayVariableJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public ArrayVariable deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new ArrayVariable((String) JsonPropertyParser.read(parsingContext, jSONObject, "name"), JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, ArrayVariable arrayVariable) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "name", arrayVariable.name);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "array");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", arrayVariable.value);
        return jSONObject;
    }
}
