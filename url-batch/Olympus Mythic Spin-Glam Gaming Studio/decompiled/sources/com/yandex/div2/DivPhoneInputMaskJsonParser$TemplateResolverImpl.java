package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivPhoneInputMaskJsonParser.kt */
/* loaded from: classes5.dex */
public final class DivPhoneInputMaskJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivPhoneInputMaskJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivPhoneInputMask resolve(ParsingContext parsingContext, DivPhoneInputMaskTemplate divPhoneInputMaskTemplate, JSONObject jSONObject) {
        return new DivPhoneInputMask((String) JsonFieldResolver.resolve(parsingContext, divPhoneInputMaskTemplate.rawTextVariable, jSONObject, "raw_text_variable"));
    }
}
