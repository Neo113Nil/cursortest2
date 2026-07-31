package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivActionAnimatorStopJsonParser.kt */
/* loaded from: classes10.dex */
public final class DivActionAnimatorStopJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivActionAnimatorStopJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivActionAnimatorStop deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivActionAnimatorStop((String) JsonPropertyParser.read(parsingContext, jSONObject, "animator_id"));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionAnimatorStop divActionAnimatorStop) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "animator_id", divActionAnimatorStop.animatorId);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "animator_stop");
        return jSONObject;
    }
}
