package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: ContentTextJsonParser.kt */
/* loaded from: classes6.dex */
public final class ContentTextJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public ContentTextJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public ContentText resolve(ParsingContext parsingContext, ContentTextTemplate contentTextTemplate, JSONObject jSONObject) {
        return new ContentText(JsonFieldResolver.resolveExpression(parsingContext, contentTextTemplate.value, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
