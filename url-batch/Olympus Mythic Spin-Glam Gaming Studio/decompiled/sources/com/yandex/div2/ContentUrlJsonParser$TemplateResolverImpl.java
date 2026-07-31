package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: ContentUrlJsonParser.kt */
/* loaded from: classes6.dex */
public final class ContentUrlJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public ContentUrlJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public ContentUrl resolve(ParsingContext parsingContext, ContentUrlTemplate contentUrlTemplate, JSONObject jSONObject) {
        return new ContentUrl(JsonFieldResolver.resolveExpression(parsingContext, contentUrlTemplate.value, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }
}
