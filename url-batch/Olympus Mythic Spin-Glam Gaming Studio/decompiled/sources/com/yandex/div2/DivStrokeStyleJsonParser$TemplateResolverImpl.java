package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivStrokeStyle;
import com.yandex.div2.DivStrokeStyleTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivStrokeStyleJsonParser.kt */
/* loaded from: classes.dex */
public final class DivStrokeStyleJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivStrokeStyleJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivStrokeStyle resolve(ParsingContext parsingContext, DivStrokeStyleTemplate divStrokeStyleTemplate, JSONObject jSONObject) {
        if (divStrokeStyleTemplate instanceof DivStrokeStyleTemplate.Solid) {
            return new DivStrokeStyle.Solid(((DivStrokeStyleSolidJsonParser$TemplateResolverImpl) this.component.getDivStrokeStyleSolidJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivStrokeStyleTemplate.Solid) divStrokeStyleTemplate).getValue(), jSONObject));
        }
        if (divStrokeStyleTemplate instanceof DivStrokeStyleTemplate.Dashed) {
            return new DivStrokeStyle.Dashed(((DivStrokeStyleDashedJsonParser$TemplateResolverImpl) this.component.getDivStrokeStyleDashedJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivStrokeStyleTemplate.Dashed) divStrokeStyleTemplate).getValue(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
