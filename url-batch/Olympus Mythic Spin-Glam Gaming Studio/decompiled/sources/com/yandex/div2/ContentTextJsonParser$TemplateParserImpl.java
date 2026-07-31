package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: ContentTextJsonParser.kt */
/* loaded from: classes6.dex */
public final class ContentTextJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public ContentTextJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public ContentTextTemplate deserialize(ParsingContext parsingContext, ContentTextTemplate contentTextTemplate, JSONObject jSONObject) {
        return new ContentTextTemplate(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_STRING, parsingContext.getAllowPropertyOverride(), contentTextTemplate != null ? contentTextTemplate.value : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, ContentTextTemplate contentTextTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "text");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", contentTextTemplate.value);
        return jSONObject;
    }
}
