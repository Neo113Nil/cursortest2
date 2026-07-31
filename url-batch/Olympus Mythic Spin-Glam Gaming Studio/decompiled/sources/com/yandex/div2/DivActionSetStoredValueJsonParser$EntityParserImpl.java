package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivActionSetStoredValueJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivActionSetStoredValueJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivActionSetStoredValueJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivActionSetStoredValue deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivActionSetStoredValue(JsonExpressionParser.readExpression(parsingContext, jSONObject, "lifetime", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), JsonExpressionParser.readExpression(parsingContext, jSONObject, "name", TypeHelpersKt.TYPE_HELPER_STRING), (DivTypedValue) JsonPropertyParser.read(parsingContext, jSONObject, "value", this.component.getDivTypedValueJsonEntityParser()));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionSetStoredValue divActionSetStoredValue) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "lifetime", divActionSetStoredValue.lifetime);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "name", divActionSetStoredValue.name);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "set_stored_value");
        JsonPropertyParser.write(parsingContext, jSONObject, "value", divActionSetStoredValue.value, this.component.getDivTypedValueJsonEntityParser());
        return jSONObject;
    }
}
