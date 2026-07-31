package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: IntegerVariableJsonParser.kt */
/* loaded from: classes14.dex */
public final class IntegerVariableJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public IntegerVariableJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public IntegerVariableTemplate deserialize(ParsingContext parsingContext, IntegerVariableTemplate integerVariableTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new IntegerVariableTemplate(JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "name", allowPropertyOverride, integerVariableTemplate != null ? integerVariableTemplate.name : null), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, integerVariableTemplate != null ? integerVariableTemplate.value : null, ParsingConvertersKt.NUMBER_TO_INT));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, IntegerVariableTemplate integerVariableTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "name", integerVariableTemplate.name);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "integer");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", integerVariableTemplate.value);
        return jSONObject;
    }
}
