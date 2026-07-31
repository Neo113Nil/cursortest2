package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivNeighbourPageSizeJsonParser.kt */
/* loaded from: classes10.dex */
public final class DivNeighbourPageSizeJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivNeighbourPageSizeJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivNeighbourPageSize resolve(ParsingContext parsingContext, DivNeighbourPageSizeTemplate divNeighbourPageSizeTemplate, JSONObject jSONObject) {
        return new DivNeighbourPageSize((DivFixedSize) JsonFieldResolver.resolve(parsingContext, divNeighbourPageSizeTemplate.neighbourPageWidth, jSONObject, "neighbour_page_width", this.component.getDivFixedSizeJsonTemplateResolver(), this.component.getDivFixedSizeJsonEntityParser()));
    }
}
