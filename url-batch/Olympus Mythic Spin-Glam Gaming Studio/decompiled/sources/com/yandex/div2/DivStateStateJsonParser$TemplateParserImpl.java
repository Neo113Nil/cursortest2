package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import com.yandex.div.state.db.StateEntry;
import com.yandex.div2.DivStateTemplate;
import org.json.JSONObject;

/* compiled from: DivStateJsonParser.kt */
/* loaded from: classes8.dex */
public final class DivStateStateJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivStateStateJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivStateTemplate.StateTemplate deserialize(ParsingContext parsingContext, DivStateTemplate.StateTemplate stateTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivStateTemplate.StateTemplate(JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "animation_in", allowPropertyOverride, stateTemplate != null ? stateTemplate.animationIn : null, this.component.getDivAnimationJsonTemplateParser()), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "animation_out", allowPropertyOverride, stateTemplate != null ? stateTemplate.animationOut : null, this.component.getDivAnimationJsonTemplateParser()), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "div", allowPropertyOverride, stateTemplate != null ? stateTemplate.div : null, this.component.getDivJsonTemplateParser()), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, StateEntry.COLUMN_STATE_ID, allowPropertyOverride, stateTemplate != null ? stateTemplate.stateId : null), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "swipe_out_actions", allowPropertyOverride, stateTemplate != null ? stateTemplate.swipeOutActions : null, this.component.getDivActionJsonTemplateParser()));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivStateTemplate.StateTemplate stateTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "animation_in", stateTemplate.animationIn, this.component.getDivAnimationJsonTemplateParser());
        JsonFieldParser.writeField(parsingContext, jSONObject, "animation_out", stateTemplate.animationOut, this.component.getDivAnimationJsonTemplateParser());
        JsonFieldParser.writeField(parsingContext, jSONObject, "div", stateTemplate.div, this.component.getDivJsonTemplateParser());
        JsonFieldParser.writeField(parsingContext, jSONObject, StateEntry.COLUMN_STATE_ID, stateTemplate.stateId);
        JsonFieldParser.writeListField(parsingContext, jSONObject, "swipe_out_actions", stateTemplate.swipeOutActions, this.component.getDivActionJsonTemplateParser());
        return jSONObject;
    }
}
