package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* compiled from: DivCurrencyInputMaskJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivCurrencyInputMaskJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivCurrencyInputMaskJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivCurrencyInputMaskTemplate deserialize(ParsingContext parsingContext, DivCurrencyInputMaskTemplate divCurrencyInputMaskTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivCurrencyInputMaskTemplate(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, CommonUrlParts.LOCALE, TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divCurrencyInputMaskTemplate != null ? divCurrencyInputMaskTemplate.locale : null), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "raw_text_variable", allowPropertyOverride, divCurrencyInputMaskTemplate != null ? divCurrencyInputMaskTemplate.rawTextVariable : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivCurrencyInputMaskTemplate divCurrencyInputMaskTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, CommonUrlParts.LOCALE, divCurrencyInputMaskTemplate.locale);
        JsonFieldParser.writeField(parsingContext, jSONObject, "raw_text_variable", divCurrencyInputMaskTemplate.rawTextVariable);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "currency");
        return jSONObject;
    }
}
