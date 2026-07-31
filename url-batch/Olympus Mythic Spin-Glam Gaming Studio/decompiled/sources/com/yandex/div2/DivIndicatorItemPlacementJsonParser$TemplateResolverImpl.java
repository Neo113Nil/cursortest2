package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivDefaultIndicatorItemPlacementJsonParser;
import com.yandex.div2.DivIndicatorItemPlacement;
import com.yandex.div2.DivIndicatorItemPlacementTemplate;
import com.yandex.div2.DivStretchIndicatorItemPlacementJsonParser;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivIndicatorItemPlacementJsonParser.kt */
/* loaded from: classes14.dex */
public final class DivIndicatorItemPlacementJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivIndicatorItemPlacementJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivIndicatorItemPlacement resolve(ParsingContext parsingContext, DivIndicatorItemPlacementTemplate divIndicatorItemPlacementTemplate, JSONObject jSONObject) {
        if (divIndicatorItemPlacementTemplate instanceof DivIndicatorItemPlacementTemplate.Default) {
            return new DivIndicatorItemPlacement.Default(((DivDefaultIndicatorItemPlacementJsonParser.TemplateResolverImpl) this.component.getDivDefaultIndicatorItemPlacementJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivIndicatorItemPlacementTemplate.Default) divIndicatorItemPlacementTemplate).getValue(), jSONObject));
        }
        if (divIndicatorItemPlacementTemplate instanceof DivIndicatorItemPlacementTemplate.Stretch) {
            return new DivIndicatorItemPlacement.Stretch(((DivStretchIndicatorItemPlacementJsonParser.TemplateResolverImpl) this.component.getDivStretchIndicatorItemPlacementJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivIndicatorItemPlacementTemplate.Stretch) divIndicatorItemPlacementTemplate).getValue(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
