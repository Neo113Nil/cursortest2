package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivFocus;
import io.appmetrica.analytics.impl.M2;
import org.json.JSONObject;

/* compiled from: DivFocusJsonParser.kt */
/* loaded from: classes15.dex */
public final class DivFocusJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivFocusJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivFocus resolve(ParsingContext parsingContext, DivFocusTemplate divFocusTemplate, JSONObject jSONObject) {
        return new DivFocus(JsonFieldResolver.resolveOptionalList(parsingContext, divFocusTemplate.background, jSONObject, M2.g, this.component.getDivBackgroundJsonTemplateResolver(), this.component.getDivBackgroundJsonEntityParser()), (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divFocusTemplate.border, jSONObject, "border", this.component.getDivBorderJsonTemplateResolver(), this.component.getDivBorderJsonEntityParser()), (DivFocus.NextFocusIds) JsonFieldResolver.resolveOptional(parsingContext, divFocusTemplate.nextFocusIds, jSONObject, "next_focus_ids", this.component.getDivFocusNextFocusIdsJsonTemplateResolver(), this.component.getDivFocusNextFocusIdsJsonEntityParser()), JsonFieldResolver.resolveOptionalList(parsingContext, divFocusTemplate.onBlur, jSONObject, "on_blur", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser()), JsonFieldResolver.resolveOptionalList(parsingContext, divFocusTemplate.onFocus, jSONObject, "on_focus", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser()));
    }
}
