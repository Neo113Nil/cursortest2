package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivNeighbourPageSizeJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivNeighbourPageSizeJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivNeighbourPageSizeJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivNeighbourPageSize deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivNeighbourPageSize((DivFixedSize) JsonPropertyParser.read(parsingContext, jSONObject, "neighbour_page_width", this.component.getDivFixedSizeJsonEntityParser()));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivNeighbourPageSize divNeighbourPageSize) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "neighbour_page_width", divNeighbourPageSize.neighbourPageWidth, this.component.getDivFixedSizeJsonEntityParser());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "fixed");
        return jSONObject;
    }
}
