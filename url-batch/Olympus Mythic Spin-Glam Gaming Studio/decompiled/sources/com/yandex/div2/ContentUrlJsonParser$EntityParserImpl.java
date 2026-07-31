package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: ContentUrlJsonParser.kt */
/* loaded from: classes3.dex */
public final class ContentUrlJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public ContentUrlJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public ContentUrl deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new ContentUrl(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, ContentUrl contentUrl) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "url");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", contentUrl.value, ParsingConvertersKt.URI_TO_STRING);
        return jSONObject;
    }
}
