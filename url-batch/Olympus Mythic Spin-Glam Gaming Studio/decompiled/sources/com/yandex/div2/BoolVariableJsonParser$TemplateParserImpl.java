package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: BoolVariableJsonParser.kt */
/* loaded from: classes14.dex */
public final class BoolVariableJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public BoolVariableJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public BoolVariableTemplate deserialize(ParsingContext parsingContext, BoolVariableTemplate boolVariableTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new BoolVariableTemplate(JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "name", allowPropertyOverride, boolVariableTemplate != null ? boolVariableTemplate.name : null), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, boolVariableTemplate != null ? boolVariableTemplate.value : null, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, BoolVariableTemplate boolVariableTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "name", boolVariableTemplate.name);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "boolean");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", boolVariableTemplate.value);
        return jSONObject;
    }
}
