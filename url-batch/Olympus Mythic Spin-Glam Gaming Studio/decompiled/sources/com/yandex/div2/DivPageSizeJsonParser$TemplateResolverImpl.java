package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivPageSizeJsonParser.kt */
/* loaded from: classes5.dex */
public final class DivPageSizeJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivPageSizeJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivPageSize resolve(ParsingContext parsingContext, DivPageSizeTemplate divPageSizeTemplate, JSONObject jSONObject) {
        return new DivPageSize((DivPercentageSize) JsonFieldResolver.resolve(parsingContext, divPageSizeTemplate.pageWidth, jSONObject, "page_width", this.component.getDivPercentageSizeJsonTemplateResolver(), this.component.getDivPercentageSizeJsonEntityParser()));
    }
}
