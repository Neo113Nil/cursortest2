package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: NumberVariableJsonParser.kt */
/* loaded from: classes12.dex */
public final class NumberVariableJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public NumberVariableJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public NumberVariable resolve(ParsingContext parsingContext, NumberVariableTemplate numberVariableTemplate, JSONObject jSONObject) {
        return new NumberVariable((String) JsonFieldResolver.resolve(parsingContext, numberVariableTemplate.name, jSONObject, "name"), JsonFieldResolver.resolveExpression(parsingContext, numberVariableTemplate.value, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
    }
}
