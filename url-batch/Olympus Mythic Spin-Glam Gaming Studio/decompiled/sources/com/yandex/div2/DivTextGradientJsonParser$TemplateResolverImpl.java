package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivLinearGradientJsonParser;
import com.yandex.div2.DivRadialGradientJsonParser;
import com.yandex.div2.DivTextGradient;
import com.yandex.div2.DivTextGradientTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivTextGradientJsonParser.kt */
/* loaded from: classes9.dex */
public final class DivTextGradientJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivTextGradientJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivTextGradient resolve(ParsingContext parsingContext, DivTextGradientTemplate divTextGradientTemplate, JSONObject jSONObject) {
        if (divTextGradientTemplate instanceof DivTextGradientTemplate.Linear) {
            return new DivTextGradient.Linear(((DivLinearGradientJsonParser.TemplateResolverImpl) this.component.getDivLinearGradientJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivTextGradientTemplate.Linear) divTextGradientTemplate).getValue(), jSONObject));
        }
        if (divTextGradientTemplate instanceof DivTextGradientTemplate.Radial) {
            return new DivTextGradient.Radial(((DivRadialGradientJsonParser.TemplateResolverImpl) this.component.getDivRadialGradientJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivTextGradientTemplate.Radial) divTextGradientTemplate).getValue(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
