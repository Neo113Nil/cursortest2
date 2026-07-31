package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivFilterRtlMirrorJsonParser.kt */
/* loaded from: classes5.dex */
public final class DivFilterRtlMirrorJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivFilterRtlMirrorJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivFilterRtlMirror deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivFilterRtlMirror();
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivFilterRtlMirror divFilterRtlMirror) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "rtl_mirror");
        return jSONObject;
    }
}
