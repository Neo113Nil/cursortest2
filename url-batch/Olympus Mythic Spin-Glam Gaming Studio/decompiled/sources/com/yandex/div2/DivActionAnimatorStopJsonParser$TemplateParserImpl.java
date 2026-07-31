package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivActionAnimatorStopJsonParser.kt */
/* loaded from: classes10.dex */
public final class DivActionAnimatorStopJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivActionAnimatorStopJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivActionAnimatorStopTemplate deserialize(ParsingContext parsingContext, DivActionAnimatorStopTemplate divActionAnimatorStopTemplate, JSONObject jSONObject) {
        return new DivActionAnimatorStopTemplate(JsonFieldParser.readField(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "animator_id", parsingContext.getAllowPropertyOverride(), divActionAnimatorStopTemplate != null ? divActionAnimatorStopTemplate.animatorId : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionAnimatorStopTemplate divActionAnimatorStopTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "animator_id", divActionAnimatorStopTemplate.animatorId);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "animator_stop");
        return jSONObject;
    }
}
