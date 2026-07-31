package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivInputValidator;
import com.yandex.div2.DivInputValidatorExpressionJsonParser;
import com.yandex.div2.DivInputValidatorRegexJsonParser;
import com.yandex.div2.DivInputValidatorTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivInputValidatorJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivInputValidatorJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivInputValidatorJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivInputValidator resolve(ParsingContext parsingContext, DivInputValidatorTemplate divInputValidatorTemplate, JSONObject jSONObject) {
        if (divInputValidatorTemplate instanceof DivInputValidatorTemplate.Regex) {
            return new DivInputValidator.Regex(((DivInputValidatorRegexJsonParser.TemplateResolverImpl) this.component.getDivInputValidatorRegexJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivInputValidatorTemplate.Regex) divInputValidatorTemplate).getValue(), jSONObject));
        }
        if (divInputValidatorTemplate instanceof DivInputValidatorTemplate.Expression) {
            return new DivInputValidator.Expression(((DivInputValidatorExpressionJsonParser.TemplateResolverImpl) this.component.getDivInputValidatorExpressionJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivInputValidatorTemplate.Expression) divInputValidatorTemplate).getValue(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
