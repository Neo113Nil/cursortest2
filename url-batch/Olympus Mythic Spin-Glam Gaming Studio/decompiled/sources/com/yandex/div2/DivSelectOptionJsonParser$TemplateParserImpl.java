package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import com.yandex.div2.DivSelectTemplate;
import org.json.JSONObject;

/* compiled from: DivSelectJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivSelectOptionJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivSelectOptionJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivSelectTemplate.OptionTemplate deserialize(ParsingContext parsingContext, DivSelectTemplate.OptionTemplate optionTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new DivSelectTemplate.OptionTemplate(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "text", typeHelper, allowPropertyOverride, optionTemplate != null ? optionTemplate.text : null), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "value", typeHelper, allowPropertyOverride, optionTemplate != null ? optionTemplate.value : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivSelectTemplate.OptionTemplate optionTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text", optionTemplate.text);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", optionTemplate.value);
        return jSONObject;
    }
}
