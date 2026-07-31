package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivActionTemplate;
import org.json.JSONObject;

/* compiled from: DivActionJsonParser.kt */
/* loaded from: classes13.dex */
public final class DivActionMenuItemJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivActionMenuItemJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivAction.MenuItem resolve(ParsingContext parsingContext, DivActionTemplate.MenuItemTemplate menuItemTemplate, JSONObject jSONObject) {
        return new DivAction.MenuItem((DivAction) JsonFieldResolver.resolveOptional(parsingContext, menuItemTemplate.action, jSONObject, "action", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser()), JsonFieldResolver.resolveOptionalList(parsingContext, menuItemTemplate.actions, jSONObject, "actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser()), JsonFieldResolver.resolveExpression(parsingContext, menuItemTemplate.text, jSONObject, "text", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
