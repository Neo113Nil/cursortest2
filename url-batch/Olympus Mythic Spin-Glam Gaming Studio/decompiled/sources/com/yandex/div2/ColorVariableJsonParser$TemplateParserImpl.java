package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: ColorVariableJsonParser.kt */
/* loaded from: classes3.dex */
public final class ColorVariableJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public ColorVariableJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public ColorVariableTemplate deserialize(ParsingContext parsingContext, ColorVariableTemplate colorVariableTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new ColorVariableTemplate(JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "name", allowPropertyOverride, colorVariableTemplate != null ? colorVariableTemplate.name : null), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, colorVariableTemplate != null ? colorVariableTemplate.value : null, ParsingConvertersKt.STRING_TO_COLOR_INT));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, ColorVariableTemplate colorVariableTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeField(parsingContext, jSONObject, "name", colorVariableTemplate.name);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "color");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", colorVariableTemplate.value, ParsingConvertersKt.COLOR_INT_TO_STRING);
        return jSONObject;
    }
}
