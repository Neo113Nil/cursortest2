package com.yandex.div2;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivActionClearFocusJsonParser.kt */
/* loaded from: classes14.dex */
public final class DivActionClearFocusJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivActionClearFocusJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivActionClearFocusTemplate deserialize(ParsingContext parsingContext, DivActionClearFocusTemplate divActionClearFocusTemplate, JSONObject jSONObject) {
        return new DivActionClearFocusTemplate();
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionClearFocusTemplate divActionClearFocusTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "clear_focus");
        return jSONObject;
    }
}
