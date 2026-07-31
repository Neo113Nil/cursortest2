package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivInputFilterExpressionJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivInputFilterExpressionJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivInputFilterExpressionJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivInputFilterExpression resolve(ParsingContext parsingContext, DivInputFilterExpressionTemplate divInputFilterExpressionTemplate, JSONObject jSONObject) {
        return new DivInputFilterExpression(JsonFieldResolver.resolveExpression(parsingContext, divInputFilterExpressionTemplate.condition, jSONObject, "condition", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }
}
