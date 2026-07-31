package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* compiled from: DivPointJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivPointJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivPointJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivPoint deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivPoint((DivDimension) JsonPropertyParser.read(parsingContext, jSONObject, VastAttributes.HORIZONTAL_POSITION, this.component.getDivDimensionJsonEntityParser()), (DivDimension) JsonPropertyParser.read(parsingContext, jSONObject, VastAttributes.VERTICAL_POSITION, this.component.getDivDimensionJsonEntityParser()));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivPoint divPoint) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, VastAttributes.HORIZONTAL_POSITION, divPoint.x, this.component.getDivDimensionJsonEntityParser());
        JsonPropertyParser.write(parsingContext, jSONObject, VastAttributes.VERTICAL_POSITION, divPoint.y, this.component.getDivDimensionJsonEntityParser());
        return jSONObject;
    }
}
