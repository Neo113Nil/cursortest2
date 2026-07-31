package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivActionCopyToClipboardJsonParser.kt */
/* loaded from: classes12.dex */
public final class DivActionCopyToClipboardJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivActionCopyToClipboardJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivActionCopyToClipboardTemplate deserialize(ParsingContext parsingContext, DivActionCopyToClipboardTemplate divActionCopyToClipboardTemplate, JSONObject jSONObject) {
        return new DivActionCopyToClipboardTemplate(JsonFieldParser.readField(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "content", parsingContext.getAllowPropertyOverride(), divActionCopyToClipboardTemplate != null ? divActionCopyToClipboardTemplate.content : null, this.component.getDivActionCopyToClipboardContentJsonTemplateParser()));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionCopyToClipboardTemplate divActionCopyToClipboardTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "content", divActionCopyToClipboardTemplate.content, this.component.getDivActionCopyToClipboardContentJsonTemplateParser());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "copy_to_clipboard");
        return jSONObject;
    }
}
