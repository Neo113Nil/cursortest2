package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import io.appmetrica.analytics.impl.M2;
import org.json.JSONObject;

/* compiled from: DivFocusJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivFocusJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivFocusJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivFocusTemplate deserialize(ParsingContext parsingContext, DivFocusTemplate divFocusTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivFocusTemplate(JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, M2.g, allowPropertyOverride, divFocusTemplate != null ? divFocusTemplate.background : null, this.component.getDivBackgroundJsonTemplateParser()), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, divFocusTemplate != null ? divFocusTemplate.border : null, this.component.getDivBorderJsonTemplateParser()), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "next_focus_ids", allowPropertyOverride, divFocusTemplate != null ? divFocusTemplate.nextFocusIds : null, this.component.getDivFocusNextFocusIdsJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "on_blur", allowPropertyOverride, divFocusTemplate != null ? divFocusTemplate.onBlur : null, this.component.getDivActionJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "on_focus", allowPropertyOverride, divFocusTemplate != null ? divFocusTemplate.onFocus : null, this.component.getDivActionJsonTemplateParser()));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivFocusTemplate divFocusTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeListField(parsingContext, jSONObject, M2.g, divFocusTemplate.background, this.component.getDivBackgroundJsonTemplateParser());
        JsonFieldParser.writeField(parsingContext, jSONObject, "border", divFocusTemplate.border, this.component.getDivBorderJsonTemplateParser());
        JsonFieldParser.writeField(parsingContext, jSONObject, "next_focus_ids", divFocusTemplate.nextFocusIds, this.component.getDivFocusNextFocusIdsJsonTemplateParser());
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_blur", divFocusTemplate.onBlur, this.component.getDivActionJsonTemplateParser());
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_focus", divFocusTemplate.onFocus, this.component.getDivActionJsonTemplateParser());
        return jSONObject;
    }
}
