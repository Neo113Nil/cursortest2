package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivActionArrayInsertValueJsonParser.kt */
/* loaded from: classes13.dex */
public final class DivActionArrayInsertValueJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivActionArrayInsertValueJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivActionArrayInsertValueTemplate deserialize(ParsingContext parsingContext, DivActionArrayInsertValueTemplate divActionArrayInsertValueTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivActionArrayInsertValueTemplate(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "index", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, divActionArrayInsertValueTemplate != null ? divActionArrayInsertValueTemplate.index : null, ParsingConvertersKt.NUMBER_TO_INT), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "value", allowPropertyOverride, divActionArrayInsertValueTemplate != null ? divActionArrayInsertValueTemplate.value : null, this.component.getDivTypedValueJsonTemplateParser()), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divActionArrayInsertValueTemplate != null ? divActionArrayInsertValueTemplate.variableName : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionArrayInsertValueTemplate divActionArrayInsertValueTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "index", divActionArrayInsertValueTemplate.index);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "array_insert_value");
        JsonFieldParser.writeField(parsingContext, jSONObject, "value", divActionArrayInsertValueTemplate.value, this.component.getDivTypedValueJsonTemplateParser());
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "variable_name", divActionArrayInsertValueTemplate.variableName);
        return jSONObject;
    }
}
