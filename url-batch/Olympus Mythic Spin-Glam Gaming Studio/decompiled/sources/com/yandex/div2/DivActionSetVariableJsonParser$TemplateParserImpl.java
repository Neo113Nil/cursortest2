package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivActionSetVariableJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivActionSetVariableJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivActionSetVariableJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivActionSetVariableTemplate deserialize(ParsingContext parsingContext, DivActionSetVariableTemplate divActionSetVariableTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivActionSetVariableTemplate(JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "value", allowPropertyOverride, divActionSetVariableTemplate != null ? divActionSetVariableTemplate.value : null, this.component.getDivTypedValueJsonTemplateParser()), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divActionSetVariableTemplate != null ? divActionSetVariableTemplate.variableName : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionSetVariableTemplate divActionSetVariableTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "set_variable");
        JsonFieldParser.writeField(parsingContext, jSONObject, "value", divActionSetVariableTemplate.value, this.component.getDivTypedValueJsonTemplateParser());
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "variable_name", divActionSetVariableTemplate.variableName);
        return jSONObject;
    }
}
