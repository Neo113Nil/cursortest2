package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: BoolVariableJsonParser.kt */
/* loaded from: classes6.dex */
public final class BoolVariableJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public BoolVariableJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public BoolVariable resolve(ParsingContext parsingContext, BoolVariableTemplate boolVariableTemplate, JSONObject jSONObject) {
        return new BoolVariable((String) JsonFieldResolver.resolve(parsingContext, boolVariableTemplate.name, jSONObject, "name"), JsonFieldResolver.resolveExpression(parsingContext, boolVariableTemplate.value, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }
}
