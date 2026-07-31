package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivDownloadCallbacksJsonParser.kt */
/* loaded from: classes.dex */
public final class DivDownloadCallbacksJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivDownloadCallbacksJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivDownloadCallbacks deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivDownloadCallbacks(JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_fail_actions", this.component.getDivActionJsonEntityParser()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_success_actions", this.component.getDivActionJsonEntityParser()));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivDownloadCallbacks divDownloadCallbacks) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_fail_actions", divDownloadCallbacks.onFailActions, this.component.getDivActionJsonEntityParser());
        JsonPropertyParser.writeList(parsingContext, jSONObject, "on_success_actions", divDownloadCallbacks.onSuccessActions, this.component.getDivActionJsonEntityParser());
        return jSONObject;
    }
}
