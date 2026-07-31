package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivPivot;
import com.yandex.div2.DivPivotFixedJsonParser;
import com.yandex.div2.DivPivotTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivPivotJsonParser.kt */
/* loaded from: classes3.dex */
public final class DivPivotJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivPivotJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivPivot resolve(ParsingContext parsingContext, DivPivotTemplate divPivotTemplate, JSONObject jSONObject) {
        if (divPivotTemplate instanceof DivPivotTemplate.Fixed) {
            return new DivPivot.Fixed(((DivPivotFixedJsonParser.TemplateResolverImpl) this.component.getDivPivotFixedJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivPivotTemplate.Fixed) divPivotTemplate).getValue(), jSONObject));
        }
        if (divPivotTemplate instanceof DivPivotTemplate.Percentage) {
            return new DivPivot.Percentage(((DivPivotPercentageJsonParser$TemplateResolverImpl) this.component.getDivPivotPercentageJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivPivotTemplate.Percentage) divPivotTemplate).getValue(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
