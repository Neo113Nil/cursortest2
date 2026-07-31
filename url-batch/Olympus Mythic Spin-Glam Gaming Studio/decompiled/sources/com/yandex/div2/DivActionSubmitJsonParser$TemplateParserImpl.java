package com.yandex.div2;

import com.yandex.div.core.DivActionHandler;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivActionSubmitJsonParser.kt */
/* loaded from: classes5.dex */
public final class DivActionSubmitJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivActionSubmitJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivActionSubmitTemplate deserialize(ParsingContext parsingContext, DivActionSubmitTemplate divActionSubmitTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivActionSubmitTemplate(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "container_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divActionSubmitTemplate != null ? divActionSubmitTemplate.containerId : null), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "on_fail_actions", allowPropertyOverride, divActionSubmitTemplate != null ? divActionSubmitTemplate.onFailActions : null, this.component.getDivActionJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "on_success_actions", allowPropertyOverride, divActionSubmitTemplate != null ? divActionSubmitTemplate.onSuccessActions : null, this.component.getDivActionJsonTemplateParser()), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "request", allowPropertyOverride, divActionSubmitTemplate != null ? divActionSubmitTemplate.request : null, this.component.getDivActionSubmitRequestJsonTemplateParser()));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionSubmitTemplate divActionSubmitTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "container_id", divActionSubmitTemplate.containerId);
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_fail_actions", divActionSubmitTemplate.onFailActions, this.component.getDivActionJsonTemplateParser());
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_success_actions", divActionSubmitTemplate.onSuccessActions, this.component.getDivActionJsonTemplateParser());
        JsonFieldParser.writeField(parsingContext, jSONObject, "request", divActionSubmitTemplate.request, this.component.getDivActionSubmitRequestJsonTemplateParser());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", DivActionHandler.DivActionReason.SUBMIT);
        return jSONObject;
    }
}
