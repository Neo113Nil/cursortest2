package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivNeighbourPageSizeJsonParser.kt */
/* loaded from: classes5.dex */
public final class DivNeighbourPageSizeJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivNeighbourPageSizeJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivNeighbourPageSizeTemplate deserialize(ParsingContext parsingContext, DivNeighbourPageSizeTemplate divNeighbourPageSizeTemplate, JSONObject jSONObject) {
        return new DivNeighbourPageSizeTemplate(JsonFieldParser.readField(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "neighbour_page_width", parsingContext.getAllowPropertyOverride(), divNeighbourPageSizeTemplate != null ? divNeighbourPageSizeTemplate.neighbourPageWidth : null, this.component.getDivFixedSizeJsonTemplateParser()));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivNeighbourPageSizeTemplate divNeighbourPageSizeTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "neighbour_page_width", divNeighbourPageSizeTemplate.neighbourPageWidth, this.component.getDivFixedSizeJsonTemplateParser());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "fixed");
        return jSONObject;
    }
}
