package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DictValueJsonParser.kt */
/* loaded from: classes6.dex */
public final class DictValueJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DictValueJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DictValueTemplate deserialize(ParsingContext parsingContext, DictValueTemplate dictValueTemplate, JSONObject jSONObject) {
        return new DictValueTemplate(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DICT, parsingContext.getAllowPropertyOverride(), dictValueTemplate != null ? dictValueTemplate.value : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DictValueTemplate dictValueTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "dict");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", dictValueTemplate.value);
        return jSONObject;
    }
}
