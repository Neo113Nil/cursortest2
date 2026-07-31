package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: IntegerValueJsonParser.kt */
/* loaded from: classes9.dex */
public final class IntegerValueJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public IntegerValueJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public IntegerValueTemplate deserialize(ParsingContext parsingContext, IntegerValueTemplate integerValueTemplate, JSONObject jSONObject) {
        return new IntegerValueTemplate(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, parsingContext.getAllowPropertyOverride(), integerValueTemplate != null ? integerValueTemplate.value : null, ParsingConvertersKt.NUMBER_TO_INT));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, IntegerValueTemplate integerValueTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "integer");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", integerValueTemplate.value);
        return jSONObject;
    }
}
