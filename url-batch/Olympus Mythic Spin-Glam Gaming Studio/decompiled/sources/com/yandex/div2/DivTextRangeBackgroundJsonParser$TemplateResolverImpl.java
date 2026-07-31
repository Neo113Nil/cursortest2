package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivCloudBackgroundJsonParser;
import com.yandex.div2.DivTextRangeBackground;
import com.yandex.div2.DivTextRangeBackgroundTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivTextRangeBackgroundJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivTextRangeBackgroundJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivTextRangeBackgroundJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivTextRangeBackground resolve(ParsingContext parsingContext, DivTextRangeBackgroundTemplate divTextRangeBackgroundTemplate, JSONObject jSONObject) {
        if (divTextRangeBackgroundTemplate instanceof DivTextRangeBackgroundTemplate.Solid) {
            return new DivTextRangeBackground.Solid(((DivSolidBackgroundJsonParser$TemplateResolverImpl) this.component.getDivSolidBackgroundJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivTextRangeBackgroundTemplate.Solid) divTextRangeBackgroundTemplate).getValue(), jSONObject));
        }
        if (divTextRangeBackgroundTemplate instanceof DivTextRangeBackgroundTemplate.Cloud) {
            return new DivTextRangeBackground.Cloud(((DivCloudBackgroundJsonParser.TemplateResolverImpl) this.component.getDivCloudBackgroundJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivTextRangeBackgroundTemplate.Cloud) divTextRangeBackgroundTemplate).getValue(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
