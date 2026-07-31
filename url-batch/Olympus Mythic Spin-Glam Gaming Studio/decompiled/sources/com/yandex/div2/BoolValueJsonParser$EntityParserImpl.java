package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: BoolValueJsonParser.kt */
/* loaded from: classes6.dex */
public final class BoolValueJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public BoolValueJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public BoolValue deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new BoolValue(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, BoolValue boolValue) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "boolean");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", boolValue.value);
        return jSONObject;
    }
}
