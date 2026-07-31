package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivAnimator;
import com.yandex.div2.DivAnimatorTemplate;
import com.yandex.div2.DivColorAnimatorJsonParser;
import com.yandex.div2.DivNumberAnimatorJsonParser;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivAnimatorJsonParser.kt */
/* loaded from: classes14.dex */
public final class DivAnimatorJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivAnimatorJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivAnimator resolve(ParsingContext parsingContext, DivAnimatorTemplate divAnimatorTemplate, JSONObject jSONObject) {
        if (divAnimatorTemplate instanceof DivAnimatorTemplate.Color) {
            return new DivAnimator.Color(((DivColorAnimatorJsonParser.TemplateResolverImpl) this.component.getDivColorAnimatorJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivAnimatorTemplate.Color) divAnimatorTemplate).getValue(), jSONObject));
        }
        if (divAnimatorTemplate instanceof DivAnimatorTemplate.Number) {
            return new DivAnimator.Number(((DivNumberAnimatorJsonParser.TemplateResolverImpl) this.component.getDivNumberAnimatorJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivAnimatorTemplate.Number) divAnimatorTemplate).getValue(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
