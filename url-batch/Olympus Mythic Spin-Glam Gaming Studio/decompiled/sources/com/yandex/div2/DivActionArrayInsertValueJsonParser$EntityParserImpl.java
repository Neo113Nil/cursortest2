package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivActionArrayInsertValueJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivActionArrayInsertValueJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivActionArrayInsertValueJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivActionArrayInsertValue deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivActionArrayInsertValue(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "index", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), (DivTypedValue) JsonPropertyParser.read(parsingContext, jSONObject, "value", this.component.getDivTypedValueJsonEntityParser()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionArrayInsertValue divActionArrayInsertValue) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "index", divActionArrayInsertValue.index);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "array_insert_value");
        JsonPropertyParser.write(parsingContext, jSONObject, "value", divActionArrayInsertValue.value, this.component.getDivTypedValueJsonEntityParser());
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "variable_name", divActionArrayInsertValue.variableName);
        return jSONObject;
    }
}
