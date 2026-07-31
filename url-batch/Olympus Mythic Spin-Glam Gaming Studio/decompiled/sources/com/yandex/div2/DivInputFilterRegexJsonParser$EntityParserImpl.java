package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivInputFilterRegexJsonParser.kt */
/* loaded from: classes13.dex */
public final class DivInputFilterRegexJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivInputFilterRegexJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivInputFilterRegex deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivInputFilterRegex(JsonExpressionParser.readExpression(parsingContext, jSONObject, "pattern", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivInputFilterRegex divInputFilterRegex) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "pattern", divInputFilterRegex.pattern);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "regex");
        return jSONObject;
    }
}
