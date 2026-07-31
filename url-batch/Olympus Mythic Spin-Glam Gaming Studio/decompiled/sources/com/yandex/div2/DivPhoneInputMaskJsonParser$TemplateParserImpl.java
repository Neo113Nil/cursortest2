package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivPhoneInputMaskJsonParser.kt */
/* loaded from: classes13.dex */
public final class DivPhoneInputMaskJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivPhoneInputMaskJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivPhoneInputMaskTemplate deserialize(ParsingContext parsingContext, DivPhoneInputMaskTemplate divPhoneInputMaskTemplate, JSONObject jSONObject) {
        return new DivPhoneInputMaskTemplate(JsonFieldParser.readField(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "raw_text_variable", parsingContext.getAllowPropertyOverride(), divPhoneInputMaskTemplate != null ? divPhoneInputMaskTemplate.rawTextVariable : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivPhoneInputMaskTemplate divPhoneInputMaskTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "raw_text_variable", divPhoneInputMaskTemplate.rawTextVariable);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "phone");
        return jSONObject;
    }
}
