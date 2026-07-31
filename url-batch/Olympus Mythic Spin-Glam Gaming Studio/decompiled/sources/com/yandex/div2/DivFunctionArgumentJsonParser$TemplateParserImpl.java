package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivFunctionArgumentJsonParser.kt */
/* loaded from: classes12.dex */
public final class DivFunctionArgumentJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivFunctionArgumentJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivFunctionArgumentTemplate deserialize(ParsingContext parsingContext, DivFunctionArgumentTemplate divFunctionArgumentTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivFunctionArgumentTemplate(JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "name", allowPropertyOverride, divFunctionArgumentTemplate != null ? divFunctionArgumentTemplate.name : null), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "type", allowPropertyOverride, divFunctionArgumentTemplate != null ? divFunctionArgumentTemplate.type : null, DivEvaluableType.FROM_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivFunctionArgumentTemplate divFunctionArgumentTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "name", divFunctionArgumentTemplate.name);
        JsonFieldParser.writeField(parsingContext, jSONObject, "type", divFunctionArgumentTemplate.type, DivEvaluableType.TO_STRING);
        return jSONObject;
    }
}
