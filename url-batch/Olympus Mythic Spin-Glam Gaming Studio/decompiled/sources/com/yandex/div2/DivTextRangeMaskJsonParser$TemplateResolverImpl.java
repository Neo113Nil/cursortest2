package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivTextRangeMask;
import com.yandex.div2.DivTextRangeMaskParticlesJsonParser;
import com.yandex.div2.DivTextRangeMaskSolidJsonParser;
import com.yandex.div2.DivTextRangeMaskTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivTextRangeMaskJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivTextRangeMaskJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivTextRangeMaskJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivTextRangeMask resolve(ParsingContext parsingContext, DivTextRangeMaskTemplate divTextRangeMaskTemplate, JSONObject jSONObject) {
        if (divTextRangeMaskTemplate instanceof DivTextRangeMaskTemplate.Particles) {
            return new DivTextRangeMask.Particles(((DivTextRangeMaskParticlesJsonParser.TemplateResolverImpl) this.component.getDivTextRangeMaskParticlesJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivTextRangeMaskTemplate.Particles) divTextRangeMaskTemplate).getValue(), jSONObject));
        }
        if (divTextRangeMaskTemplate instanceof DivTextRangeMaskTemplate.Solid) {
            return new DivTextRangeMask.Solid(((DivTextRangeMaskSolidJsonParser.TemplateResolverImpl) this.component.getDivTextRangeMaskSolidJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivTextRangeMaskTemplate.Solid) divTextRangeMaskTemplate).getValue(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
