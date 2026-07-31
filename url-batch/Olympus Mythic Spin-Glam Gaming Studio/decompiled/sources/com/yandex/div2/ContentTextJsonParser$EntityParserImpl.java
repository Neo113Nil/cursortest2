package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: ContentTextJsonParser.kt */
/* loaded from: classes5.dex */
public final class ContentTextJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public ContentTextJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public ContentText deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new ContentText(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, ContentText contentText) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "text");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", contentText.value);
        return jSONObject;
    }
}
