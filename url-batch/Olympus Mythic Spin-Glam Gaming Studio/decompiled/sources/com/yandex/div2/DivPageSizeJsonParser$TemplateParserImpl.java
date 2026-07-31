package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivPageSizeJsonParser.kt */
/* loaded from: classes9.dex */
public final class DivPageSizeJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivPageSizeJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivPageSizeTemplate deserialize(ParsingContext parsingContext, DivPageSizeTemplate divPageSizeTemplate, JSONObject jSONObject) {
        return new DivPageSizeTemplate(JsonFieldParser.readField(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "page_width", parsingContext.getAllowPropertyOverride(), divPageSizeTemplate != null ? divPageSizeTemplate.pageWidth : null, this.component.getDivPercentageSizeJsonTemplateParser()));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivPageSizeTemplate divPageSizeTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "page_width", divPageSizeTemplate.pageWidth, this.component.getDivPercentageSizeJsonTemplateParser());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "percentage");
        return jSONObject;
    }
}
