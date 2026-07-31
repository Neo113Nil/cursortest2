package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: StrVariableJsonParser.kt */
/* loaded from: classes15.dex */
public final class StrVariableJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public StrVariableJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public StrVariable resolve(ParsingContext parsingContext, StrVariableTemplate strVariableTemplate, JSONObject jSONObject) {
        return new StrVariable((String) JsonFieldResolver.resolve(parsingContext, strVariableTemplate.name, jSONObject, "name"), JsonFieldResolver.resolveExpression(parsingContext, strVariableTemplate.value, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
