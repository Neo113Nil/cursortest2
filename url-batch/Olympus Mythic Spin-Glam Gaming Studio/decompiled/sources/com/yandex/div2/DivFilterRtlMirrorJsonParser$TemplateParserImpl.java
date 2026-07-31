package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivFilterRtlMirrorJsonParser.kt */
/* loaded from: classes3.dex */
public final class DivFilterRtlMirrorJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivFilterRtlMirrorJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivFilterRtlMirrorTemplate deserialize(ParsingContext parsingContext, DivFilterRtlMirrorTemplate divFilterRtlMirrorTemplate, JSONObject jSONObject) {
        return new DivFilterRtlMirrorTemplate();
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivFilterRtlMirrorTemplate divFilterRtlMirrorTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "rtl_mirror");
        return jSONObject;
    }
}
