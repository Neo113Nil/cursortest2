package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivActionDictSetValueJsonParser.kt */
/* loaded from: classes5.dex */
public final class DivActionDictSetValueJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivActionDictSetValueJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivActionDictSetValueTemplate deserialize(ParsingContext parsingContext, DivActionDictSetValueTemplate divActionDictSetValueTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new DivActionDictSetValueTemplate(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "key", typeHelper, allowPropertyOverride, divActionDictSetValueTemplate != null ? divActionDictSetValueTemplate.key : null), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "value", allowPropertyOverride, divActionDictSetValueTemplate != null ? divActionDictSetValueTemplate.value : null, this.component.getDivTypedValueJsonTemplateParser()), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "variable_name", typeHelper, allowPropertyOverride, divActionDictSetValueTemplate != null ? divActionDictSetValueTemplate.variableName : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionDictSetValueTemplate divActionDictSetValueTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "key", divActionDictSetValueTemplate.key);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "dict_set_value");
        JsonFieldParser.writeField(parsingContext, jSONObject, "value", divActionDictSetValueTemplate.value, this.component.getDivTypedValueJsonTemplateParser());
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "variable_name", divActionDictSetValueTemplate.variableName);
        return jSONObject;
    }
}
