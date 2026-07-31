package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivActionFocusElementJsonParser.kt */
/* loaded from: classes5.dex */
public final class DivActionFocusElementJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivActionFocusElementJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivActionFocusElementTemplate deserialize(ParsingContext parsingContext, DivActionFocusElementTemplate divActionFocusElementTemplate, JSONObject jSONObject) {
        return new DivActionFocusElementTemplate(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "element_id", TypeHelpersKt.TYPE_HELPER_STRING, parsingContext.getAllowPropertyOverride(), divActionFocusElementTemplate != null ? divActionFocusElementTemplate.elementId : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionFocusElementTemplate divActionFocusElementTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "element_id", divActionFocusElementTemplate.elementId);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "focus_element");
        return jSONObject;
    }
}
