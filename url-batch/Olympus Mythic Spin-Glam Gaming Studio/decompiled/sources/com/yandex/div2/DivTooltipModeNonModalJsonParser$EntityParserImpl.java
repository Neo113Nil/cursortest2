package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivTooltipModeNonModalJsonParser.kt */
/* loaded from: classes13.dex */
public final class DivTooltipModeNonModalJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivTooltipModeNonModalJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivTooltipModeNonModal deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivTooltipModeNonModal();
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivTooltipModeNonModal divTooltipModeNonModal) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "non_modal");
        return jSONObject;
    }
}
