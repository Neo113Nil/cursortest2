package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivActionHideTooltipJsonParser.kt */
/* loaded from: classes12.dex */
public final class DivActionHideTooltipJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivActionHideTooltipJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivActionHideTooltipTemplate deserialize(ParsingContext parsingContext, DivActionHideTooltipTemplate divActionHideTooltipTemplate, JSONObject jSONObject) {
        return new DivActionHideTooltipTemplate(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING, parsingContext.getAllowPropertyOverride(), divActionHideTooltipTemplate != null ? divActionHideTooltipTemplate.id : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionHideTooltipTemplate divActionHideTooltipTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "id", divActionHideTooltipTemplate.id);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "hide_tooltip");
        return jSONObject;
    }
}
