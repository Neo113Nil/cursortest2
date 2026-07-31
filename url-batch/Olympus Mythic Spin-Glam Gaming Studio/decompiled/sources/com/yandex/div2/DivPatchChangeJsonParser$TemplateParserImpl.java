package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import com.yandex.div2.DivPatchTemplate;
import org.json.JSONObject;

/* compiled from: DivPatchJsonParser.kt */
/* loaded from: classes14.dex */
public final class DivPatchChangeJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivPatchChangeJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivPatchTemplate.ChangeTemplate deserialize(ParsingContext parsingContext, DivPatchTemplate.ChangeTemplate changeTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivPatchTemplate.ChangeTemplate(JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, changeTemplate != null ? changeTemplate.id : null), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "items", allowPropertyOverride, changeTemplate != null ? changeTemplate.items : null, this.component.getDivJsonTemplateParser()));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivPatchTemplate.ChangeTemplate changeTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "id", changeTemplate.id);
        JsonFieldParser.writeListField(parsingContext, jSONObject, "items", changeTemplate.items, this.component.getDivJsonTemplateParser());
        return jSONObject;
    }
}
