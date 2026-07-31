package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivBackgroundTemplate;
import com.yandex.div2.DivImageBackgroundJsonParser;
import com.yandex.div2.DivLinearGradientJsonParser;
import com.yandex.div2.DivRadialGradientJsonParser;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivBackgroundJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivBackgroundJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivBackgroundJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivBackground resolve(ParsingContext parsingContext, DivBackgroundTemplate divBackgroundTemplate, JSONObject jSONObject) {
        if (divBackgroundTemplate instanceof DivBackgroundTemplate.LinearGradient) {
            return new DivBackground.LinearGradient(((DivLinearGradientJsonParser.TemplateResolverImpl) this.component.getDivLinearGradientJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivBackgroundTemplate.LinearGradient) divBackgroundTemplate).getValue(), jSONObject));
        }
        if (divBackgroundTemplate instanceof DivBackgroundTemplate.RadialGradient) {
            return new DivBackground.RadialGradient(((DivRadialGradientJsonParser.TemplateResolverImpl) this.component.getDivRadialGradientJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivBackgroundTemplate.RadialGradient) divBackgroundTemplate).getValue(), jSONObject));
        }
        if (divBackgroundTemplate instanceof DivBackgroundTemplate.Image) {
            return new DivBackground.Image(((DivImageBackgroundJsonParser.TemplateResolverImpl) this.component.getDivImageBackgroundJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivBackgroundTemplate.Image) divBackgroundTemplate).getValue(), jSONObject));
        }
        if (divBackgroundTemplate instanceof DivBackgroundTemplate.Solid) {
            return new DivBackground.Solid(((DivSolidBackgroundJsonParser$TemplateResolverImpl) this.component.getDivSolidBackgroundJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivBackgroundTemplate.Solid) divBackgroundTemplate).getValue(), jSONObject));
        }
        if (divBackgroundTemplate instanceof DivBackgroundTemplate.NinePatch) {
            return new DivBackground.NinePatch(((DivNinePatchBackgroundJsonParser$TemplateResolverImpl) this.component.getDivNinePatchBackgroundJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivBackgroundTemplate.NinePatch) divBackgroundTemplate).getValue(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
