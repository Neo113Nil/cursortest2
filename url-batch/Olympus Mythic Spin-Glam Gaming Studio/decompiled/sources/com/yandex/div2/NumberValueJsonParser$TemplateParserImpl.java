package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: NumberValueJsonParser.kt */
/* loaded from: classes4.dex */
public final class NumberValueJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public NumberValueJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public NumberValueTemplate deserialize(ParsingContext parsingContext, NumberValueTemplate numberValueTemplate, JSONObject jSONObject) {
        return new NumberValueTemplate(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, parsingContext.getAllowPropertyOverride(), numberValueTemplate != null ? numberValueTemplate.value : null, ParsingConvertersKt.NUMBER_TO_DOUBLE));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, NumberValueTemplate numberValueTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "number");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", numberValueTemplate.value);
        return jSONObject;
    }
}
