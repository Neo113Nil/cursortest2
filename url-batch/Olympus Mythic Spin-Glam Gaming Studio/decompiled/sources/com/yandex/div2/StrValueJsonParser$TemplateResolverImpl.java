package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: StrValueJsonParser.kt */
/* loaded from: classes12.dex */
public final class StrValueJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public StrValueJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public StrValue resolve(ParsingContext parsingContext, StrValueTemplate strValueTemplate, JSONObject jSONObject) {
        return new StrValue(JsonFieldResolver.resolveExpression(parsingContext, strValueTemplate.value, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
