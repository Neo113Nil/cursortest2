package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: UrlVariableJsonParser.kt */
/* loaded from: classes4.dex */
public final class UrlVariableJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public UrlVariableJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public UrlVariable resolve(ParsingContext parsingContext, UrlVariableTemplate urlVariableTemplate, JSONObject jSONObject) {
        return new UrlVariable((String) JsonFieldResolver.resolve(parsingContext, urlVariableTemplate.name, jSONObject, "name"), JsonFieldResolver.resolveExpression(parsingContext, urlVariableTemplate.value, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }
}
