package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.state.db.StateEntry;
import com.yandex.div2.DivData;
import org.json.JSONObject;

/* compiled from: DivDataJsonParser.kt */
/* loaded from: classes10.dex */
public final class DivDataStateJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivDataStateJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivData.State deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivData.State((Div) JsonPropertyParser.read(parsingContext, jSONObject, "div", this.component.getDivJsonEntityParser()), ((Number) JsonPropertyParser.read(parsingContext, jSONObject, StateEntry.COLUMN_STATE_ID, ParsingConvertersKt.NUMBER_TO_INT)).longValue());
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivData.State state) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "div", state.div, this.component.getDivJsonEntityParser());
        JsonPropertyParser.write(parsingContext, jSONObject, StateEntry.COLUMN_STATE_ID, Long.valueOf(state.stateId));
        return jSONObject;
    }
}
