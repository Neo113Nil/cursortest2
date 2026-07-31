package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DictVariableJsonParser.kt */
/* loaded from: classes15.dex */
public final class DictVariableJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DictVariableJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DictVariableTemplate deserialize(ParsingContext parsingContext, DictVariableTemplate dictVariableTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DictVariableTemplate(JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "name", allowPropertyOverride, dictVariableTemplate != null ? dictVariableTemplate.name : null), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, dictVariableTemplate != null ? dictVariableTemplate.value : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DictVariableTemplate dictVariableTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "name", dictVariableTemplate.name);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "dict");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", dictVariableTemplate.value);
        return jSONObject;
    }
}
