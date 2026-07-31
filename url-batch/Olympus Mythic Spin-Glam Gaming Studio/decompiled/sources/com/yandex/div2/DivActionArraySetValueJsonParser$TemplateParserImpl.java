package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivActionArraySetValueJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivActionArraySetValueJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivActionArraySetValueJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivActionArraySetValueTemplate deserialize(ParsingContext parsingContext, DivActionArraySetValueTemplate divActionArraySetValueTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivActionArraySetValueTemplate(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "index", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, divActionArraySetValueTemplate != null ? divActionArraySetValueTemplate.index : null, ParsingConvertersKt.NUMBER_TO_INT), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "value", allowPropertyOverride, divActionArraySetValueTemplate != null ? divActionArraySetValueTemplate.value : null, this.component.getDivTypedValueJsonTemplateParser()), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divActionArraySetValueTemplate != null ? divActionArraySetValueTemplate.variableName : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionArraySetValueTemplate divActionArraySetValueTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "index", divActionArraySetValueTemplate.index);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "array_set_value");
        JsonFieldParser.writeField(parsingContext, jSONObject, "value", divActionArraySetValueTemplate.value, this.component.getDivTypedValueJsonTemplateParser());
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "variable_name", divActionArraySetValueTemplate.variableName);
        return jSONObject;
    }
}
