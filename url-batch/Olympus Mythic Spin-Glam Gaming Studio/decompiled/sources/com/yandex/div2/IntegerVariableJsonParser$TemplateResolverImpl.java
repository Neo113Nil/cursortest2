package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: IntegerVariableJsonParser.kt */
/* loaded from: classes14.dex */
public final class IntegerVariableJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public IntegerVariableJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public IntegerVariable resolve(ParsingContext parsingContext, IntegerVariableTemplate integerVariableTemplate, JSONObject jSONObject) {
        return new IntegerVariable((String) JsonFieldResolver.resolve(parsingContext, integerVariableTemplate.name, jSONObject, "name"), JsonFieldResolver.resolveExpression(parsingContext, integerVariableTemplate.value, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT));
    }
}
