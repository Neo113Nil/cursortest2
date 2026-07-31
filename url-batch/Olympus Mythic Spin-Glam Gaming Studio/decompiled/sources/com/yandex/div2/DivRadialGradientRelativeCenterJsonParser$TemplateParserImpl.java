package com.yandex.div2;

import com.facebook.appevents.codeless.internal.Constants;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivRadialGradientRelativeCenterJsonParser.kt */
/* loaded from: classes5.dex */
public final class DivRadialGradientRelativeCenterJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivRadialGradientRelativeCenterJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivRadialGradientRelativeCenterTemplate deserialize(ParsingContext parsingContext, DivRadialGradientRelativeCenterTemplate divRadialGradientRelativeCenterTemplate, JSONObject jSONObject) {
        return new DivRadialGradientRelativeCenterTemplate(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, parsingContext.getAllowPropertyOverride(), divRadialGradientRelativeCenterTemplate != null ? divRadialGradientRelativeCenterTemplate.value : null, ParsingConvertersKt.NUMBER_TO_DOUBLE));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivRadialGradientRelativeCenterTemplate divRadialGradientRelativeCenterTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", Constants.PATH_TYPE_RELATIVE);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", divRadialGradientRelativeCenterTemplate.value);
        return jSONObject;
    }
}
