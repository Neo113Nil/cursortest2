package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivPageContentSizeJsonParser.kt */
/* loaded from: classes3.dex */
public final class DivPageContentSizeJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivPageContentSizeJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivPageContentSizeTemplate deserialize(ParsingContext parsingContext, DivPageContentSizeTemplate divPageContentSizeTemplate, JSONObject jSONObject) {
        return new DivPageContentSizeTemplate();
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivPageContentSizeTemplate divPageContentSizeTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "wrap_content");
        return jSONObject;
    }
}
