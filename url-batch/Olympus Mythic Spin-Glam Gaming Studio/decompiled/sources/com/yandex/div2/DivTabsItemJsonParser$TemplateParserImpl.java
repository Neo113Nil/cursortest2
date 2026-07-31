package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import com.yandex.div2.DivTabsTemplate;
import org.json.JSONObject;

/* compiled from: DivTabsJsonParser.kt */
/* loaded from: classes3.dex */
public final class DivTabsItemJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivTabsItemJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivTabsTemplate.ItemTemplate deserialize(ParsingContext parsingContext, DivTabsTemplate.ItemTemplate itemTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivTabsTemplate.ItemTemplate(JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "div", allowPropertyOverride, itemTemplate != null ? itemTemplate.div : null, this.component.getDivJsonTemplateParser()), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "title", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, itemTemplate != null ? itemTemplate.title : null), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "title_click_action", allowPropertyOverride, itemTemplate != null ? itemTemplate.titleClickAction : null, this.component.getDivActionJsonTemplateParser()));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivTabsTemplate.ItemTemplate itemTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "div", itemTemplate.div, this.component.getDivJsonTemplateParser());
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "title", itemTemplate.title);
        JsonFieldParser.writeField(parsingContext, jSONObject, "title_click_action", itemTemplate.titleClickAction, this.component.getDivActionJsonTemplateParser());
        return jSONObject;
    }
}
