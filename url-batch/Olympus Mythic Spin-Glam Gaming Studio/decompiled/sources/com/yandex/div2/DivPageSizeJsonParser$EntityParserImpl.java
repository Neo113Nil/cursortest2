package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivPageSizeJsonParser.kt */
/* loaded from: classes13.dex */
public final class DivPageSizeJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivPageSizeJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivPageSize deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivPageSize((DivPercentageSize) JsonPropertyParser.read(parsingContext, jSONObject, "page_width", this.component.getDivPercentageSizeJsonEntityParser()));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivPageSize divPageSize) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "page_width", divPageSize.pageWidth, this.component.getDivPercentageSizeJsonEntityParser());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "percentage");
        return jSONObject;
    }
}
