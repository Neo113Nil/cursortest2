package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivLayoutProviderJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivLayoutProviderJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivLayoutProviderJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivLayoutProvider resolve(ParsingContext parsingContext, DivLayoutProviderTemplate divLayoutProviderTemplate, JSONObject jSONObject) {
        return new DivLayoutProvider((String) JsonFieldResolver.resolveOptional(parsingContext, divLayoutProviderTemplate.heightVariableName, jSONObject, "height_variable_name"), (String) JsonFieldResolver.resolveOptional(parsingContext, divLayoutProviderTemplate.widthVariableName, jSONObject, "width_variable_name"));
    }
}
