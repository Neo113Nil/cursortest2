package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivActionDictSetValueJsonParser.kt */
/* loaded from: classes10.dex */
public final class DivActionDictSetValueJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivActionDictSetValueJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivActionDictSetValue deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new DivActionDictSetValue(JsonExpressionParser.readExpression(parsingContext, jSONObject, "key", typeHelper), (DivTypedValue) JsonPropertyParser.readOptional(parsingContext, jSONObject, "value", this.component.getDivTypedValueJsonEntityParser()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "variable_name", typeHelper));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionDictSetValue divActionDictSetValue) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "key", divActionDictSetValue.key);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "dict_set_value");
        JsonPropertyParser.write(parsingContext, jSONObject, "value", divActionDictSetValue.value, this.component.getDivTypedValueJsonEntityParser());
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "variable_name", divActionDictSetValue.variableName);
        return jSONObject;
    }
}
