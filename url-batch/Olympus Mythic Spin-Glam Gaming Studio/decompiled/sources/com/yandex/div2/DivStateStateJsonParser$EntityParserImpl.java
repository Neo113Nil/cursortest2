package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.state.db.StateEntry;
import com.yandex.div2.DivState;
import org.json.JSONObject;

/* compiled from: DivStateJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivStateStateJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivStateStateJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivState.State deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivState.State((DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "animation_in", this.component.getDivAnimationJsonEntityParser()), (DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "animation_out", this.component.getDivAnimationJsonEntityParser()), (Div) JsonPropertyParser.readOptional(parsingContext, jSONObject, "div", this.component.getDivJsonEntityParser()), (String) JsonPropertyParser.read(parsingContext, jSONObject, StateEntry.COLUMN_STATE_ID), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "swipe_out_actions", this.component.getDivActionJsonEntityParser()));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivState.State state) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "animation_in", state.animationIn, this.component.getDivAnimationJsonEntityParser());
        JsonPropertyParser.write(parsingContext, jSONObject, "animation_out", state.animationOut, this.component.getDivAnimationJsonEntityParser());
        JsonPropertyParser.write(parsingContext, jSONObject, "div", state.div, this.component.getDivJsonEntityParser());
        JsonPropertyParser.write(parsingContext, jSONObject, StateEntry.COLUMN_STATE_ID, state.stateId);
        JsonPropertyParser.writeList(parsingContext, jSONObject, "swipe_out_actions", state.swipeOutActions, this.component.getDivActionJsonEntityParser());
        return jSONObject;
    }
}
