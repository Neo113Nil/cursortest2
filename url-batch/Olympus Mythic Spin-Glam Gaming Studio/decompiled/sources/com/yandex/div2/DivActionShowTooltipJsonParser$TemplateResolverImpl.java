package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivActionShowTooltipJsonParser.kt */
/* loaded from: classes11.dex */
public final class DivActionShowTooltipJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivActionShowTooltipJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivActionShowTooltip resolve(ParsingContext parsingContext, DivActionShowTooltipTemplate divActionShowTooltipTemplate, JSONObject jSONObject) {
        return new DivActionShowTooltip(JsonFieldResolver.resolveExpression(parsingContext, divActionShowTooltipTemplate.id, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING), JsonFieldResolver.resolveOptionalExpression(parsingContext, divActionShowTooltipTemplate.multiple, jSONObject, "multiple", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }
}
