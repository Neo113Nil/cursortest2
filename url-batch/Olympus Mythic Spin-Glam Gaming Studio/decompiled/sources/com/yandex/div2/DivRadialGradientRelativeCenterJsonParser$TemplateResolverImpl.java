package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivRadialGradientRelativeCenterJsonParser.kt */
/* loaded from: classes10.dex */
public final class DivRadialGradientRelativeCenterJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivRadialGradientRelativeCenterJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivRadialGradientRelativeCenter resolve(ParsingContext parsingContext, DivRadialGradientRelativeCenterTemplate divRadialGradientRelativeCenterTemplate, JSONObject jSONObject) {
        return new DivRadialGradientRelativeCenter(JsonFieldResolver.resolveExpression(parsingContext, divRadialGradientRelativeCenterTemplate.value, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
    }
}
