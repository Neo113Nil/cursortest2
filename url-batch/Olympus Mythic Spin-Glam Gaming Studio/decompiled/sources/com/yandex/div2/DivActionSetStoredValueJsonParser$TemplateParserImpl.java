package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivActionSetStoredValueJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivActionSetStoredValueJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivActionSetStoredValueJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivActionSetStoredValueTemplate deserialize(ParsingContext parsingContext, DivActionSetStoredValueTemplate divActionSetStoredValueTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivActionSetStoredValueTemplate(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "lifetime", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, divActionSetStoredValueTemplate != null ? divActionSetStoredValueTemplate.lifetime : null, ParsingConvertersKt.NUMBER_TO_INT), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "name", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divActionSetStoredValueTemplate != null ? divActionSetStoredValueTemplate.name : null), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "value", allowPropertyOverride, divActionSetStoredValueTemplate != null ? divActionSetStoredValueTemplate.value : null, this.component.getDivTypedValueJsonTemplateParser()));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionSetStoredValueTemplate divActionSetStoredValueTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "lifetime", divActionSetStoredValueTemplate.lifetime);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "name", divActionSetStoredValueTemplate.name);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "set_stored_value");
        JsonFieldParser.writeField(parsingContext, jSONObject, "value", divActionSetStoredValueTemplate.value, this.component.getDivTypedValueJsonTemplateParser());
        return jSONObject;
    }
}
