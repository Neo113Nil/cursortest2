package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivActionSetVariableJsonParser.kt */
/* loaded from: classes15.dex */
public final class DivActionSetVariableJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivActionSetVariableJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivActionSetVariable deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivActionSetVariable((DivTypedValue) JsonPropertyParser.read(parsingContext, jSONObject, "value", this.component.getDivTypedValueJsonEntityParser()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionSetVariable divActionSetVariable) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "set_variable");
        JsonPropertyParser.write(parsingContext, jSONObject, "value", divActionSetVariable.value, this.component.getDivTypedValueJsonEntityParser());
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "variable_name", divActionSetVariable.variableName);
        return jSONObject;
    }
}
