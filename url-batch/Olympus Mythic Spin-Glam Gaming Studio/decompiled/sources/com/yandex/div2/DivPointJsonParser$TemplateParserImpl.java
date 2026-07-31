package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* compiled from: DivPointJsonParser.kt */
/* loaded from: classes3.dex */
public final class DivPointJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivPointJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivPointTemplate deserialize(ParsingContext parsingContext, DivPointTemplate divPointTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivPointTemplate(JsonFieldParser.readField(restrictPropertyOverride, jSONObject, VastAttributes.HORIZONTAL_POSITION, allowPropertyOverride, divPointTemplate != null ? divPointTemplate.x : null, this.component.getDivDimensionJsonTemplateParser()), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, VastAttributes.VERTICAL_POSITION, allowPropertyOverride, divPointTemplate != null ? divPointTemplate.y : null, this.component.getDivDimensionJsonTemplateParser()));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivPointTemplate divPointTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, VastAttributes.HORIZONTAL_POSITION, divPointTemplate.x, this.component.getDivDimensionJsonTemplateParser());
        JsonFieldParser.writeField(parsingContext, jSONObject, VastAttributes.VERTICAL_POSITION, divPointTemplate.y, this.component.getDivDimensionJsonTemplateParser());
        return jSONObject;
    }
}
