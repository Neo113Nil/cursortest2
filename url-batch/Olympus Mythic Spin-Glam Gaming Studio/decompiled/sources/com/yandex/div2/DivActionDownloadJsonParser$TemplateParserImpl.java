package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivActionDownloadJsonParser.kt */
/* loaded from: classes14.dex */
public final class DivActionDownloadJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivActionDownloadJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivActionDownloadTemplate deserialize(ParsingContext parsingContext, DivActionDownloadTemplate divActionDownloadTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivActionDownloadTemplate(JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "on_fail_actions", allowPropertyOverride, divActionDownloadTemplate != null ? divActionDownloadTemplate.onFailActions : null, this.component.getDivActionJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "on_success_actions", allowPropertyOverride, divActionDownloadTemplate != null ? divActionDownloadTemplate.onSuccessActions : null, this.component.getDivActionJsonTemplateParser()), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, divActionDownloadTemplate != null ? divActionDownloadTemplate.url : null, ParsingConvertersKt.ANY_TO_URI));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionDownloadTemplate divActionDownloadTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_fail_actions", divActionDownloadTemplate.onFailActions, this.component.getDivActionJsonTemplateParser());
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_success_actions", divActionDownloadTemplate.onSuccessActions, this.component.getDivActionJsonTemplateParser());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "download");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", divActionDownloadTemplate.url, ParsingConvertersKt.URI_TO_STRING);
        return jSONObject;
    }
}
