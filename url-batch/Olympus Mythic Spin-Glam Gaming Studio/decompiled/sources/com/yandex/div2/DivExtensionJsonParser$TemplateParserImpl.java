package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivExtensionJsonParser.kt */
/* loaded from: classes11.dex */
public final class DivExtensionJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivExtensionJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivExtensionTemplate deserialize(ParsingContext parsingContext, DivExtensionTemplate divExtensionTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivExtensionTemplate(JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divExtensionTemplate != null ? divExtensionTemplate.id : null), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "params", allowPropertyOverride, divExtensionTemplate != null ? divExtensionTemplate.params : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivExtensionTemplate divExtensionTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "id", divExtensionTemplate.id);
        JsonFieldParser.writeField(parsingContext, jSONObject, "params", divExtensionTemplate.params);
        return jSONObject;
    }
}
