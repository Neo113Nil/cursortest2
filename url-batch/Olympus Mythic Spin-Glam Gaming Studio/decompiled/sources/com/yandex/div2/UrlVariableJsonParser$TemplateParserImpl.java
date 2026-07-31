package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: UrlVariableJsonParser.kt */
/* loaded from: classes3.dex */
public final class UrlVariableJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public UrlVariableJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public UrlVariableTemplate deserialize(ParsingContext parsingContext, UrlVariableTemplate urlVariableTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new UrlVariableTemplate(JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "name", allowPropertyOverride, urlVariableTemplate != null ? urlVariableTemplate.name : null), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, urlVariableTemplate != null ? urlVariableTemplate.value : null, ParsingConvertersKt.ANY_TO_URI));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, UrlVariableTemplate urlVariableTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "name", urlVariableTemplate.name);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "url");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", urlVariableTemplate.value, ParsingConvertersKt.URI_TO_STRING);
        return jSONObject;
    }
}
