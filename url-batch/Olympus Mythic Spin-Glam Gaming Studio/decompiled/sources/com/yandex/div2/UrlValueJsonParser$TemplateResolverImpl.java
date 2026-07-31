package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: UrlValueJsonParser.kt */
/* loaded from: classes10.dex */
public final class UrlValueJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public UrlValueJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public UrlValue resolve(ParsingContext parsingContext, UrlValueTemplate urlValueTemplate, JSONObject jSONObject) {
        return new UrlValue(JsonFieldResolver.resolveExpression(parsingContext, urlValueTemplate.value, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }
}
