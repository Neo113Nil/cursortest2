package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: UrlValueJsonParser.kt */
/* loaded from: classes14.dex */
public final class UrlValueJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public UrlValueJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public UrlValueTemplate deserialize(ParsingContext parsingContext, UrlValueTemplate urlValueTemplate, JSONObject jSONObject) {
        return new UrlValueTemplate(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_URI, parsingContext.getAllowPropertyOverride(), urlValueTemplate != null ? urlValueTemplate.value : null, ParsingConvertersKt.ANY_TO_URI));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, UrlValueTemplate urlValueTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "url");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", urlValueTemplate.value, ParsingConvertersKt.URI_TO_STRING);
        return jSONObject;
    }
}
