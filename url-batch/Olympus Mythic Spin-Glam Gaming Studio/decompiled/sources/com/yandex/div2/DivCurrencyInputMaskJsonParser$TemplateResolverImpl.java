package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* compiled from: DivCurrencyInputMaskJsonParser.kt */
/* loaded from: classes9.dex */
public final class DivCurrencyInputMaskJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivCurrencyInputMaskJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivCurrencyInputMask resolve(ParsingContext parsingContext, DivCurrencyInputMaskTemplate divCurrencyInputMaskTemplate, JSONObject jSONObject) {
        return new DivCurrencyInputMask(JsonFieldResolver.resolveOptionalExpression(parsingContext, divCurrencyInputMaskTemplate.locale, jSONObject, CommonUrlParts.LOCALE, TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonFieldResolver.resolve(parsingContext, divCurrencyInputMaskTemplate.rawTextVariable, jSONObject, "raw_text_variable"));
    }
}
