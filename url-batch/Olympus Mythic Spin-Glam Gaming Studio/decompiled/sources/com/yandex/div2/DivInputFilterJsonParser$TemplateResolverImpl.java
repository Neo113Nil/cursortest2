package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivInputFilter;
import com.yandex.div2.DivInputFilterTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivInputFilterJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivInputFilterJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivInputFilterJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivInputFilter resolve(ParsingContext parsingContext, DivInputFilterTemplate divInputFilterTemplate, JSONObject jSONObject) {
        if (divInputFilterTemplate instanceof DivInputFilterTemplate.Regex) {
            return new DivInputFilter.Regex(((DivInputFilterRegexJsonParser$TemplateResolverImpl) this.component.getDivInputFilterRegexJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivInputFilterTemplate.Regex) divInputFilterTemplate).getValue(), jSONObject));
        }
        if (divInputFilterTemplate instanceof DivInputFilterTemplate.Expression) {
            return new DivInputFilter.Expression(((DivInputFilterExpressionJsonParser$TemplateResolverImpl) this.component.getDivInputFilterExpressionJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivInputFilterTemplate.Expression) divInputFilterTemplate).getValue(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
