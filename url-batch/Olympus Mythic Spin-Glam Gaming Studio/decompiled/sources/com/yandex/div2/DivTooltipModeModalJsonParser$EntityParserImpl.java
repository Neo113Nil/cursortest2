package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivTooltipModeModalJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivTooltipModeModalJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivTooltipModeModalJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivTooltipModeModal deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivTooltipModeModal();
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivTooltipModeModal divTooltipModeModal) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "modal");
        return jSONObject;
    }
}
