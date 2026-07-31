package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivFunctionArgumentJsonParser.kt */
/* loaded from: classes8.dex */
public final class DivFunctionArgumentJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivFunctionArgumentJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivFunctionArgument resolve(ParsingContext parsingContext, DivFunctionArgumentTemplate divFunctionArgumentTemplate, JSONObject jSONObject) {
        return new DivFunctionArgument((String) JsonFieldResolver.resolve(parsingContext, divFunctionArgumentTemplate.name, jSONObject, "name"), (DivEvaluableType) JsonFieldResolver.resolve(parsingContext, divFunctionArgumentTemplate.type, jSONObject, "type", DivEvaluableType.FROM_STRING));
    }
}
