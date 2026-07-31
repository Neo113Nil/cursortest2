package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivActionArrayRemoveValueJsonParser.kt */
/* loaded from: classes9.dex */
public final class DivActionArrayRemoveValueJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivActionArrayRemoveValueJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivActionArrayRemoveValue deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivActionArrayRemoveValue(JsonExpressionParser.readExpression(parsingContext, jSONObject, "index", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), JsonExpressionParser.readExpression(parsingContext, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionArrayRemoveValue divActionArrayRemoveValue) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "index", divActionArrayRemoveValue.index);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "array_remove_value");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "variable_name", divActionArrayRemoveValue.variableName);
        return jSONObject;
    }
}
