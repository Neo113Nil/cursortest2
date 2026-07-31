package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivActionClearFocusJsonParser.kt */
/* loaded from: classes11.dex */
public final class DivActionClearFocusJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivActionClearFocusJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivActionClearFocus deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivActionClearFocus();
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionClearFocus divActionClearFocus) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "clear_focus");
        return jSONObject;
    }
}
