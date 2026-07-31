package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: ColorVariableJsonParser.kt */
/* loaded from: classes5.dex */
public final class ColorVariableJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public ColorVariableJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public ColorVariable deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new ColorVariable((String) JsonPropertyParser.read(parsingContext, jSONObject, "name"), JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, ColorVariable colorVariable) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "name", colorVariable.name);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "color");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", colorVariable.value, ParsingConvertersKt.COLOR_INT_TO_STRING);
        return jSONObject;
    }
}
