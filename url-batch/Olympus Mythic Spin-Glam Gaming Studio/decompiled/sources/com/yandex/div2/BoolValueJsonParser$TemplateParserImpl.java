package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: BoolValueJsonParser.kt */
/* loaded from: classes6.dex */
public final class BoolValueJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public BoolValueJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public BoolValueTemplate deserialize(ParsingContext parsingContext, BoolValueTemplate boolValueTemplate, JSONObject jSONObject) {
        return new BoolValueTemplate(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_BOOLEAN, parsingContext.getAllowPropertyOverride(), boolValueTemplate != null ? boolValueTemplate.value : null, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, BoolValueTemplate boolValueTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "boolean");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", boolValueTemplate.value);
        return jSONObject;
    }
}
