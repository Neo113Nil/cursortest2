package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: ColorValueJsonParser.kt */
/* loaded from: classes6.dex */
public final class ColorValueJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public ColorValueJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public ColorValueTemplate deserialize(ParsingContext parsingContext, ColorValueTemplate colorValueTemplate, JSONObject jSONObject) {
        return new ColorValueTemplate(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_COLOR, parsingContext.getAllowPropertyOverride(), colorValueTemplate != null ? colorValueTemplate.value : null, ParsingConvertersKt.STRING_TO_COLOR_INT));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, ColorValueTemplate colorValueTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "color");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", colorValueTemplate.value, ParsingConvertersKt.COLOR_INT_TO_STRING);
        return jSONObject;
    }
}
