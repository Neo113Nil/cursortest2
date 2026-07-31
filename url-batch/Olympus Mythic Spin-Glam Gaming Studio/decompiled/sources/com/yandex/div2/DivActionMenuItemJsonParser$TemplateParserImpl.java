package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import com.yandex.div2.DivActionTemplate;
import org.json.JSONObject;

/* compiled from: DivActionJsonParser.kt */
/* loaded from: classes5.dex */
public final class DivActionMenuItemJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivActionMenuItemJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivActionTemplate.MenuItemTemplate deserialize(ParsingContext parsingContext, DivActionTemplate.MenuItemTemplate menuItemTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivActionTemplate.MenuItemTemplate(JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "action", allowPropertyOverride, menuItemTemplate != null ? menuItemTemplate.action : null, this.component.getDivActionJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, menuItemTemplate != null ? menuItemTemplate.actions : null, this.component.getDivActionJsonTemplateParser()), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "text", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, menuItemTemplate != null ? menuItemTemplate.text : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionTemplate.MenuItemTemplate menuItemTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "action", menuItemTemplate.action, this.component.getDivActionJsonTemplateParser());
        JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", menuItemTemplate.actions, this.component.getDivActionJsonTemplateParser());
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text", menuItemTemplate.text);
        return jSONObject;
    }
}
