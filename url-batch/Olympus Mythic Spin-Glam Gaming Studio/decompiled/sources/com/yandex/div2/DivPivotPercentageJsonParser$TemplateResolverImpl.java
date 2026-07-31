package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivPivotPercentageJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivPivotPercentageJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivPivotPercentageJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivPivotPercentage resolve(ParsingContext parsingContext, DivPivotPercentageTemplate divPivotPercentageTemplate, JSONObject jSONObject) {
        return new DivPivotPercentage(JsonFieldResolver.resolveExpression(parsingContext, divPivotPercentageTemplate.value, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
    }
}
