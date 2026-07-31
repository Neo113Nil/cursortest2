package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivSolidBackgroundJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivSolidBackgroundJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivSolidBackgroundJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivSolidBackground deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivSolidBackground(JsonExpressionParser.readExpression(parsingContext, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivSolidBackground divSolidBackground) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", divSolidBackground.color, ParsingConvertersKt.COLOR_INT_TO_STRING);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "solid");
        return jSONObject;
    }
}
