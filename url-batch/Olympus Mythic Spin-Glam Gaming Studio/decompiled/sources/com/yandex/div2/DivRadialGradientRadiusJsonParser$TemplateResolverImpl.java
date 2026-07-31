package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivFixedSizeJsonParser;
import com.yandex.div2.DivRadialGradientRadius;
import com.yandex.div2.DivRadialGradientRadiusTemplate;
import com.yandex.div2.DivRadialGradientRelativeRadiusJsonParser;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivRadialGradientRadiusJsonParser.kt */
/* loaded from: classes5.dex */
public final class DivRadialGradientRadiusJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivRadialGradientRadiusJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivRadialGradientRadius resolve(ParsingContext parsingContext, DivRadialGradientRadiusTemplate divRadialGradientRadiusTemplate, JSONObject jSONObject) {
        if (divRadialGradientRadiusTemplate instanceof DivRadialGradientRadiusTemplate.FixedSize) {
            return new DivRadialGradientRadius.FixedSize(((DivFixedSizeJsonParser.TemplateResolverImpl) this.component.getDivFixedSizeJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivRadialGradientRadiusTemplate.FixedSize) divRadialGradientRadiusTemplate).getValue(), jSONObject));
        }
        if (divRadialGradientRadiusTemplate instanceof DivRadialGradientRadiusTemplate.Relative) {
            return new DivRadialGradientRadius.Relative(((DivRadialGradientRelativeRadiusJsonParser.TemplateResolverImpl) this.component.getDivRadialGradientRelativeRadiusJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivRadialGradientRadiusTemplate.Relative) divRadialGradientRadiusTemplate).getValue(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
