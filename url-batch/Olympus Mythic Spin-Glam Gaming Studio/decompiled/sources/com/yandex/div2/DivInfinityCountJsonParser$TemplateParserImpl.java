package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivInfinityCountJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivInfinityCountJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivInfinityCountJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivInfinityCountTemplate deserialize(ParsingContext parsingContext, DivInfinityCountTemplate divInfinityCountTemplate, JSONObject jSONObject) {
        return new DivInfinityCountTemplate();
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivInfinityCountTemplate divInfinityCountTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "infinity");
        return jSONObject;
    }
}
