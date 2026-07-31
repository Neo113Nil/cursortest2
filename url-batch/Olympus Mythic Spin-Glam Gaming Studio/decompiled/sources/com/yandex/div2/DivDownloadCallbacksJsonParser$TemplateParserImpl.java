package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivDownloadCallbacksJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivDownloadCallbacksJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivDownloadCallbacksJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivDownloadCallbacksTemplate deserialize(ParsingContext parsingContext, DivDownloadCallbacksTemplate divDownloadCallbacksTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivDownloadCallbacksTemplate(JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "on_fail_actions", allowPropertyOverride, divDownloadCallbacksTemplate != null ? divDownloadCallbacksTemplate.onFailActions : null, this.component.getDivActionJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "on_success_actions", allowPropertyOverride, divDownloadCallbacksTemplate != null ? divDownloadCallbacksTemplate.onSuccessActions : null, this.component.getDivActionJsonTemplateParser()));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivDownloadCallbacksTemplate divDownloadCallbacksTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_fail_actions", divDownloadCallbacksTemplate.onFailActions, this.component.getDivActionJsonTemplateParser());
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_success_actions", divDownloadCallbacksTemplate.onSuccessActions, this.component.getDivActionJsonTemplateParser());
        return jSONObject;
    }
}
