package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivPagerLayoutMode;
import com.yandex.div2.DivPagerLayoutModeTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivPagerLayoutModeJsonParser.kt */
/* loaded from: classes14.dex */
public final class DivPagerLayoutModeJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivPagerLayoutModeJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivPagerLayoutMode resolve(ParsingContext parsingContext, DivPagerLayoutModeTemplate divPagerLayoutModeTemplate, JSONObject jSONObject) {
        if (divPagerLayoutModeTemplate instanceof DivPagerLayoutModeTemplate.PageSize) {
            return new DivPagerLayoutMode.PageSize(((DivPageSizeJsonParser$TemplateResolverImpl) this.component.getDivPageSizeJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivPagerLayoutModeTemplate.PageSize) divPagerLayoutModeTemplate).getValue(), jSONObject));
        }
        if (divPagerLayoutModeTemplate instanceof DivPagerLayoutModeTemplate.NeighbourPageSize) {
            return new DivPagerLayoutMode.NeighbourPageSize(((DivNeighbourPageSizeJsonParser$TemplateResolverImpl) this.component.getDivNeighbourPageSizeJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivPagerLayoutModeTemplate.NeighbourPageSize) divPagerLayoutModeTemplate).getValue(), jSONObject));
        }
        if (divPagerLayoutModeTemplate instanceof DivPagerLayoutModeTemplate.PageContentSize) {
            return new DivPagerLayoutMode.PageContentSize(((DivPageContentSizeJsonParser$TemplateResolverImpl) this.component.getDivPageContentSizeJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivPagerLayoutModeTemplate.PageContentSize) divPagerLayoutModeTemplate).getValue(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
