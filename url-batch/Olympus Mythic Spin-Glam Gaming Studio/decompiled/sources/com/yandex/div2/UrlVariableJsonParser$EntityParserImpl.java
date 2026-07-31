package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: UrlVariableJsonParser.kt */
/* loaded from: classes12.dex */
public final class UrlVariableJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public UrlVariableJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public UrlVariable deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new UrlVariable((String) JsonPropertyParser.read(parsingContext, jSONObject, "name"), JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, UrlVariable urlVariable) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "name", urlVariable.name);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "url");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", urlVariable.value, ParsingConvertersKt.URI_TO_STRING);
        return jSONObject;
    }
}
