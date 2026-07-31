package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: NumberVariableJsonParser.kt */
/* loaded from: classes4.dex */
public final class NumberVariableJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public NumberVariableJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public NumberVariableTemplate deserialize(ParsingContext parsingContext, NumberVariableTemplate numberVariableTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new NumberVariableTemplate(JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "name", allowPropertyOverride, numberVariableTemplate != null ? numberVariableTemplate.name : null), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, numberVariableTemplate != null ? numberVariableTemplate.value : null, ParsingConvertersKt.NUMBER_TO_DOUBLE));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, NumberVariableTemplate numberVariableTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "name", numberVariableTemplate.name);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "number");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", numberVariableTemplate.value);
        return jSONObject;
    }
}
