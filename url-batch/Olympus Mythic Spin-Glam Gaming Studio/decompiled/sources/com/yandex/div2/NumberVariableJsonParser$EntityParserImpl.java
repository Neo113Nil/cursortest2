package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: NumberVariableJsonParser.kt */
/* loaded from: classes3.dex */
public final class NumberVariableJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public NumberVariableJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public NumberVariable deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new NumberVariable((String) JsonPropertyParser.read(parsingContext, jSONObject, "name"), JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, NumberVariable numberVariable) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "name", numberVariable.name);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "number");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", numberVariable.value);
        return jSONObject;
    }
}
