package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* compiled from: DivPointJsonParser.kt */
/* loaded from: classes3.dex */
public final class DivPointJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivPointJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivPoint resolve(ParsingContext parsingContext, DivPointTemplate divPointTemplate, JSONObject jSONObject) {
        return new DivPoint((DivDimension) JsonFieldResolver.resolve(parsingContext, divPointTemplate.x, jSONObject, VastAttributes.HORIZONTAL_POSITION, this.component.getDivDimensionJsonTemplateResolver(), this.component.getDivDimensionJsonEntityParser()), (DivDimension) JsonFieldResolver.resolve(parsingContext, divPointTemplate.y, jSONObject, VastAttributes.VERTICAL_POSITION, this.component.getDivDimensionJsonTemplateResolver(), this.component.getDivDimensionJsonEntityParser()));
    }
}
