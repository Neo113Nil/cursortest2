package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivAppearanceSetTransitionJsonParser;
import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.DivAppearanceTransitionTemplate;
import com.yandex.div2.DivFadeTransitionJsonParser;
import com.yandex.div2.DivScaleTransitionJsonParser;
import com.yandex.div2.DivSlideTransitionJsonParser;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivAppearanceTransitionJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivAppearanceTransitionJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivAppearanceTransitionJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivAppearanceTransition resolve(ParsingContext parsingContext, DivAppearanceTransitionTemplate divAppearanceTransitionTemplate, JSONObject jSONObject) {
        if (divAppearanceTransitionTemplate instanceof DivAppearanceTransitionTemplate.Set) {
            return new DivAppearanceTransition.Set(((DivAppearanceSetTransitionJsonParser.TemplateResolverImpl) this.component.getDivAppearanceSetTransitionJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivAppearanceTransitionTemplate.Set) divAppearanceTransitionTemplate).getValue(), jSONObject));
        }
        if (divAppearanceTransitionTemplate instanceof DivAppearanceTransitionTemplate.Fade) {
            return new DivAppearanceTransition.Fade(((DivFadeTransitionJsonParser.TemplateResolverImpl) this.component.getDivFadeTransitionJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivAppearanceTransitionTemplate.Fade) divAppearanceTransitionTemplate).getValue(), jSONObject));
        }
        if (divAppearanceTransitionTemplate instanceof DivAppearanceTransitionTemplate.Scale) {
            return new DivAppearanceTransition.Scale(((DivScaleTransitionJsonParser.TemplateResolverImpl) this.component.getDivScaleTransitionJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivAppearanceTransitionTemplate.Scale) divAppearanceTransitionTemplate).getValue(), jSONObject));
        }
        if (divAppearanceTransitionTemplate instanceof DivAppearanceTransitionTemplate.Slide) {
            return new DivAppearanceTransition.Slide(((DivSlideTransitionJsonParser.TemplateResolverImpl) this.component.getDivSlideTransitionJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivAppearanceTransitionTemplate.Slide) divAppearanceTransitionTemplate).getValue(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
