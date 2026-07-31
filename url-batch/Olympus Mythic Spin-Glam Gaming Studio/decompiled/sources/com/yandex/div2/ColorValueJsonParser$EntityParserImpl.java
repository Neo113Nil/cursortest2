package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: ColorValueJsonParser.kt */
/* loaded from: classes5.dex */
public final class ColorValueJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public ColorValueJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public ColorValue deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new ColorValue(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, ColorValue colorValue) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "color");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", colorValue.value, ParsingConvertersKt.COLOR_INT_TO_STRING);
        return jSONObject;
    }
}
