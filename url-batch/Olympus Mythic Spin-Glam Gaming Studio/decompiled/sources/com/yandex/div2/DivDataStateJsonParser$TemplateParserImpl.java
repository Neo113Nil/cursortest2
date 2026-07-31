package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import com.yandex.div.state.db.StateEntry;
import com.yandex.div2.DivDataTemplate;
import org.json.JSONObject;

/* compiled from: DivDataJsonParser.kt */
/* loaded from: classes12.dex */
public final class DivDataStateJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivDataStateJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivDataTemplate.StateTemplate deserialize(ParsingContext parsingContext, DivDataTemplate.StateTemplate stateTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivDataTemplate.StateTemplate(JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "div", allowPropertyOverride, stateTemplate != null ? stateTemplate.div : null, this.component.getDivJsonTemplateParser()), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, StateEntry.COLUMN_STATE_ID, allowPropertyOverride, stateTemplate != null ? stateTemplate.stateId : null, ParsingConvertersKt.NUMBER_TO_INT));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivDataTemplate.StateTemplate stateTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "div", stateTemplate.div, this.component.getDivJsonTemplateParser());
        JsonFieldParser.writeField(parsingContext, jSONObject, StateEntry.COLUMN_STATE_ID, stateTemplate.stateId);
        return jSONObject;
    }
}
