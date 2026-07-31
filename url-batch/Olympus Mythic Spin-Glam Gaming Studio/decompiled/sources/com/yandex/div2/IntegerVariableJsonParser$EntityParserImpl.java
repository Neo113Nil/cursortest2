package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: IntegerVariableJsonParser.kt */
/* loaded from: classes11.dex */
public final class IntegerVariableJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public IntegerVariableJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public IntegerVariable deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new IntegerVariable((String) JsonPropertyParser.read(parsingContext, jSONObject, "name"), JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, IntegerVariable integerVariable) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "name", integerVariable.name);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "integer");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", integerVariable.value);
        return jSONObject;
    }
}
