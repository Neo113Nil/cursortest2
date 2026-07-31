package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: ArrayValueJsonParser.kt */
/* loaded from: classes13.dex */
public final class ArrayValueJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public ArrayValueJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public ArrayValue resolve(ParsingContext parsingContext, ArrayValueTemplate arrayValueTemplate, JSONObject jSONObject) {
        return new ArrayValue(JsonFieldResolver.resolveExpression(parsingContext, arrayValueTemplate.value, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY));
    }
}
