package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivActionArrayRemoveValueJsonParser.kt */
/* loaded from: classes5.dex */
public final class DivActionArrayRemoveValueJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivActionArrayRemoveValueJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivActionArrayRemoveValueTemplate deserialize(ParsingContext parsingContext, DivActionArrayRemoveValueTemplate divActionArrayRemoveValueTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivActionArrayRemoveValueTemplate(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "index", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, divActionArrayRemoveValueTemplate != null ? divActionArrayRemoveValueTemplate.index : null, ParsingConvertersKt.NUMBER_TO_INT), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divActionArrayRemoveValueTemplate != null ? divActionArrayRemoveValueTemplate.variableName : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionArrayRemoveValueTemplate divActionArrayRemoveValueTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "index", divActionArrayRemoveValueTemplate.index);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "array_remove_value");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "variable_name", divActionArrayRemoveValueTemplate.variableName);
        return jSONObject;
    }
}
