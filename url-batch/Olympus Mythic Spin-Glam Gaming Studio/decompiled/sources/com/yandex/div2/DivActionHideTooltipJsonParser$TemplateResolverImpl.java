package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivActionHideTooltipJsonParser.kt */
/* loaded from: classes5.dex */
public final class DivActionHideTooltipJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivActionHideTooltipJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivActionHideTooltip resolve(ParsingContext parsingContext, DivActionHideTooltipTemplate divActionHideTooltipTemplate, JSONObject jSONObject) {
        return new DivActionHideTooltip(JsonFieldResolver.resolveExpression(parsingContext, divActionHideTooltipTemplate.id, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
