package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivTabs;
import com.yandex.div2.DivTabsTemplate;
import org.json.JSONObject;

/* compiled from: DivTabsJsonParser.kt */
/* loaded from: classes3.dex */
public final class DivTabsItemJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivTabsItemJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivTabs.Item resolve(ParsingContext parsingContext, DivTabsTemplate.ItemTemplate itemTemplate, JSONObject jSONObject) {
        return new DivTabs.Item((Div) JsonFieldResolver.resolve(parsingContext, itemTemplate.div, jSONObject, "div", this.component.getDivJsonTemplateResolver(), this.component.getDivJsonEntityParser()), JsonFieldResolver.resolveExpression(parsingContext, itemTemplate.title, jSONObject, "title", TypeHelpersKt.TYPE_HELPER_STRING), (DivAction) JsonFieldResolver.resolveOptional(parsingContext, itemTemplate.titleClickAction, jSONObject, "title_click_action", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser()));
    }
}
