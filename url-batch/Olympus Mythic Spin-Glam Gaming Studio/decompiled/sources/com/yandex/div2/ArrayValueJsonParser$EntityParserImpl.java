package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: ArrayValueJsonParser.kt */
/* loaded from: classes6.dex */
public final class ArrayValueJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public ArrayValueJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public ArrayValue deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new ArrayValue(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, ArrayValue arrayValue) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "array");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", arrayValue.value);
        return jSONObject;
    }
}
