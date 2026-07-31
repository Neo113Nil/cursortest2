package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivActionShowTooltipJsonParser.kt */
/* loaded from: classes13.dex */
public final class DivActionShowTooltipJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivActionShowTooltipJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivActionShowTooltipTemplate deserialize(ParsingContext parsingContext, DivActionShowTooltipTemplate divActionShowTooltipTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivActionShowTooltipTemplate(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divActionShowTooltipTemplate != null ? divActionShowTooltipTemplate.id : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "multiple", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divActionShowTooltipTemplate != null ? divActionShowTooltipTemplate.multiple : null, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionShowTooltipTemplate divActionShowTooltipTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "id", divActionShowTooltipTemplate.id);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "multiple", divActionShowTooltipTemplate.multiple);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "show_tooltip");
        return jSONObject;
    }
}
