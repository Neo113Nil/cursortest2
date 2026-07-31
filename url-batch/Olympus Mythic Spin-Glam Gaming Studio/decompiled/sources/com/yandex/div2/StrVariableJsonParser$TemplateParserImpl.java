package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: StrVariableJsonParser.kt */
/* loaded from: classes5.dex */
public final class StrVariableJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public StrVariableJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public StrVariableTemplate deserialize(ParsingContext parsingContext, StrVariableTemplate strVariableTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new StrVariableTemplate(JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "name", allowPropertyOverride, strVariableTemplate != null ? strVariableTemplate.name : null), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, strVariableTemplate != null ? strVariableTemplate.value : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, StrVariableTemplate strVariableTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "name", strVariableTemplate.name);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "string");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", strVariableTemplate.value);
        return jSONObject;
    }
}
