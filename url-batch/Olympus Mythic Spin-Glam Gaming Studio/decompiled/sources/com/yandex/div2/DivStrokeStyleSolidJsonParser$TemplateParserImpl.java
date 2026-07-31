package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivStrokeStyleSolidJsonParser.kt */
/* loaded from: classes10.dex */
public final class DivStrokeStyleSolidJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivStrokeStyleSolidJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivStrokeStyleSolidTemplate deserialize(ParsingContext parsingContext, DivStrokeStyleSolidTemplate divStrokeStyleSolidTemplate, JSONObject jSONObject) {
        return new DivStrokeStyleSolidTemplate();
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivStrokeStyleSolidTemplate divStrokeStyleSolidTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "solid");
        return jSONObject;
    }
}
