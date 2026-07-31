package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: StrValueJsonParser.kt */
/* loaded from: classes9.dex */
public final class StrValueJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public StrValueJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public StrValue deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new StrValue(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, StrValue strValue) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "string");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", strValue.value);
        return jSONObject;
    }
}
