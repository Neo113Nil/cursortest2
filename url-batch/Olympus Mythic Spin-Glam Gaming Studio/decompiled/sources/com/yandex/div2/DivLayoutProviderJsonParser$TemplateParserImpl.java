package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivLayoutProviderJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivLayoutProviderJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivLayoutProviderJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivLayoutProviderTemplate deserialize(ParsingContext parsingContext, DivLayoutProviderTemplate divLayoutProviderTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivLayoutProviderTemplate(JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height_variable_name", allowPropertyOverride, divLayoutProviderTemplate != null ? divLayoutProviderTemplate.heightVariableName : null), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width_variable_name", allowPropertyOverride, divLayoutProviderTemplate != null ? divLayoutProviderTemplate.widthVariableName : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivLayoutProviderTemplate divLayoutProviderTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "height_variable_name", divLayoutProviderTemplate.heightVariableName);
        JsonFieldParser.writeField(parsingContext, jSONObject, "width_variable_name", divLayoutProviderTemplate.widthVariableName);
        return jSONObject;
    }
}
