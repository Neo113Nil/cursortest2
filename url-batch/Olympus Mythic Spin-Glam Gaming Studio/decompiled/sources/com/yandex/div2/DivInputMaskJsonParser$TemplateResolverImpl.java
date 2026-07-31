package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivFixedLengthInputMaskJsonParser;
import com.yandex.div2.DivInputMask;
import com.yandex.div2.DivInputMaskTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivInputMaskJsonParser.kt */
/* loaded from: classes13.dex */
public final class DivInputMaskJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivInputMaskJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivInputMask resolve(ParsingContext parsingContext, DivInputMaskTemplate divInputMaskTemplate, JSONObject jSONObject) {
        if (divInputMaskTemplate instanceof DivInputMaskTemplate.FixedLength) {
            return new DivInputMask.FixedLength(((DivFixedLengthInputMaskJsonParser.TemplateResolverImpl) this.component.getDivFixedLengthInputMaskJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivInputMaskTemplate.FixedLength) divInputMaskTemplate).getValue(), jSONObject));
        }
        if (divInputMaskTemplate instanceof DivInputMaskTemplate.Currency) {
            return new DivInputMask.Currency(((DivCurrencyInputMaskJsonParser$TemplateResolverImpl) this.component.getDivCurrencyInputMaskJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivInputMaskTemplate.Currency) divInputMaskTemplate).getValue(), jSONObject));
        }
        if (divInputMaskTemplate instanceof DivInputMaskTemplate.Phone) {
            return new DivInputMask.Phone(((DivPhoneInputMaskJsonParser$TemplateResolverImpl) this.component.getDivPhoneInputMaskJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivInputMaskTemplate.Phone) divInputMaskTemplate).getValue(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
