package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: ArrayValueJsonParser.kt */
/* loaded from: classes5.dex */
public final class ArrayValueJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public ArrayValueJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public ArrayValueTemplate deserialize(ParsingContext parsingContext, ArrayValueTemplate arrayValueTemplate, JSONObject jSONObject) {
        return new ArrayValueTemplate(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY, parsingContext.getAllowPropertyOverride(), arrayValueTemplate != null ? arrayValueTemplate.value : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, ArrayValueTemplate arrayValueTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "array");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", arrayValueTemplate.value);
        return jSONObject;
    }
}
