package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: ArrayVariableJsonParser.kt */
/* loaded from: classes4.dex */
public final class ArrayVariableJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public ArrayVariableJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public ArrayVariableTemplate deserialize(ParsingContext parsingContext, ArrayVariableTemplate arrayVariableTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new ArrayVariableTemplate(JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "name", allowPropertyOverride, arrayVariableTemplate != null ? arrayVariableTemplate.name : null), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY, allowPropertyOverride, arrayVariableTemplate != null ? arrayVariableTemplate.value : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, ArrayVariableTemplate arrayVariableTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "name", arrayVariableTemplate.name);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "array");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", arrayVariableTemplate.value);
        return jSONObject;
    }
}
