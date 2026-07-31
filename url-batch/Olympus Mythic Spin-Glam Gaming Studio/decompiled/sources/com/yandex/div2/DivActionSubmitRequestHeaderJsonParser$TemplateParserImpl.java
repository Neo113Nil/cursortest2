package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import com.yandex.div2.DivActionSubmitTemplate;
import org.json.JSONObject;

/* compiled from: DivActionSubmitJsonParser.kt */
/* loaded from: classes10.dex */
public final class DivActionSubmitRequestHeaderJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivActionSubmitRequestHeaderJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivActionSubmitTemplate.RequestTemplate.HeaderTemplate deserialize(ParsingContext parsingContext, DivActionSubmitTemplate.RequestTemplate.HeaderTemplate headerTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new DivActionSubmitTemplate.RequestTemplate.HeaderTemplate(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "name", typeHelper, allowPropertyOverride, headerTemplate != null ? headerTemplate.name : null), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "value", typeHelper, allowPropertyOverride, headerTemplate != null ? headerTemplate.value : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionSubmitTemplate.RequestTemplate.HeaderTemplate headerTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "name", headerTemplate.name);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", headerTemplate.value);
        return jSONObject;
    }
}
