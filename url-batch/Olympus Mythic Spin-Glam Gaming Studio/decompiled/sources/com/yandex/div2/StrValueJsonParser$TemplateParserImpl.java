package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: StrValueJsonParser.kt */
/* loaded from: classes15.dex */
public final class StrValueJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public StrValueJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public StrValueTemplate deserialize(ParsingContext parsingContext, StrValueTemplate strValueTemplate, JSONObject jSONObject) {
        return new StrValueTemplate(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_STRING, parsingContext.getAllowPropertyOverride(), strValueTemplate != null ? strValueTemplate.value : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, StrValueTemplate strValueTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "string");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", strValueTemplate.value);
        return jSONObject;
    }
}
