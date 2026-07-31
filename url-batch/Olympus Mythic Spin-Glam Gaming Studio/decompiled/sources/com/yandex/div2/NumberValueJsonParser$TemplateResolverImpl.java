package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: NumberValueJsonParser.kt */
/* loaded from: classes5.dex */
public final class NumberValueJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public NumberValueJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public NumberValue resolve(ParsingContext parsingContext, NumberValueTemplate numberValueTemplate, JSONObject jSONObject) {
        return new NumberValue(JsonFieldResolver.resolveExpression(parsingContext, numberValueTemplate.value, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
    }
}
