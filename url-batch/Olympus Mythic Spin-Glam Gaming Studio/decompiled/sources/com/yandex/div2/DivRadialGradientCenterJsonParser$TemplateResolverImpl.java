package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivRadialGradientCenter;
import com.yandex.div2.DivRadialGradientCenterTemplate;
import com.yandex.div2.DivRadialGradientFixedCenterJsonParser;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivRadialGradientCenterJsonParser.kt */
/* loaded from: classes3.dex */
public final class DivRadialGradientCenterJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivRadialGradientCenterJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivRadialGradientCenter resolve(ParsingContext parsingContext, DivRadialGradientCenterTemplate divRadialGradientCenterTemplate, JSONObject jSONObject) {
        if (divRadialGradientCenterTemplate instanceof DivRadialGradientCenterTemplate.Fixed) {
            return new DivRadialGradientCenter.Fixed(((DivRadialGradientFixedCenterJsonParser.TemplateResolverImpl) this.component.getDivRadialGradientFixedCenterJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivRadialGradientCenterTemplate.Fixed) divRadialGradientCenterTemplate).getValue(), jSONObject));
        }
        if (divRadialGradientCenterTemplate instanceof DivRadialGradientCenterTemplate.Relative) {
            return new DivRadialGradientCenter.Relative(((DivRadialGradientRelativeCenterJsonParser$TemplateResolverImpl) this.component.getDivRadialGradientRelativeCenterJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivRadialGradientCenterTemplate.Relative) divRadialGradientCenterTemplate).getValue(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
