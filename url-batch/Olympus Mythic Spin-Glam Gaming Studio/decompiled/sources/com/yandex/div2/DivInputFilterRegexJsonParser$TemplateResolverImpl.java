package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivInputFilterRegexJsonParser.kt */
/* loaded from: classes3.dex */
public final class DivInputFilterRegexJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivInputFilterRegexJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivInputFilterRegex resolve(ParsingContext parsingContext, DivInputFilterRegexTemplate divInputFilterRegexTemplate, JSONObject jSONObject) {
        return new DivInputFilterRegex(JsonFieldResolver.resolveExpression(parsingContext, divInputFilterRegexTemplate.pattern, jSONObject, "pattern", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
