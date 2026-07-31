package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivPageTransformation;
import com.yandex.div2.DivPageTransformationOverlapJsonParser;
import com.yandex.div2.DivPageTransformationSlideJsonParser;
import com.yandex.div2.DivPageTransformationTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivPageTransformationJsonParser.kt */
/* loaded from: classes3.dex */
public final class DivPageTransformationJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivPageTransformationJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivPageTransformation resolve(ParsingContext parsingContext, DivPageTransformationTemplate divPageTransformationTemplate, JSONObject jSONObject) {
        if (divPageTransformationTemplate instanceof DivPageTransformationTemplate.Slide) {
            return new DivPageTransformation.Slide(((DivPageTransformationSlideJsonParser.TemplateResolverImpl) this.component.getDivPageTransformationSlideJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivPageTransformationTemplate.Slide) divPageTransformationTemplate).getValue(), jSONObject));
        }
        if (divPageTransformationTemplate instanceof DivPageTransformationTemplate.Overlap) {
            return new DivPageTransformation.Overlap(((DivPageTransformationOverlapJsonParser.TemplateResolverImpl) this.component.getDivPageTransformationOverlapJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivPageTransformationTemplate.Overlap) divPageTransformationTemplate).getValue(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
