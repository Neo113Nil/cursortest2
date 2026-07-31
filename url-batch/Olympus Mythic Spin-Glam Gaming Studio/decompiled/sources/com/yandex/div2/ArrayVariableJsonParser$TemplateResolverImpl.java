package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: ArrayVariableJsonParser.kt */
/* loaded from: classes10.dex */
public final class ArrayVariableJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public ArrayVariableJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public ArrayVariable resolve(ParsingContext parsingContext, ArrayVariableTemplate arrayVariableTemplate, JSONObject jSONObject) {
        return new ArrayVariable((String) JsonFieldResolver.resolve(parsingContext, arrayVariableTemplate.name, jSONObject, "name"), JsonFieldResolver.resolveExpression(parsingContext, arrayVariableTemplate.value, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY));
    }
}
