package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivActionArraySetValueJsonParser.kt */
/* loaded from: classes5.dex */
public final class DivActionArraySetValueJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivActionArraySetValueJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivActionArraySetValue deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivActionArraySetValue(JsonExpressionParser.readExpression(parsingContext, jSONObject, "index", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), (DivTypedValue) JsonPropertyParser.read(parsingContext, jSONObject, "value", this.component.getDivTypedValueJsonEntityParser()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionArraySetValue divActionArraySetValue) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "index", divActionArraySetValue.index);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "array_set_value");
        JsonPropertyParser.write(parsingContext, jSONObject, "value", divActionArraySetValue.value, this.component.getDivTypedValueJsonEntityParser());
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "variable_name", divActionArraySetValue.variableName);
        return jSONObject;
    }
}
