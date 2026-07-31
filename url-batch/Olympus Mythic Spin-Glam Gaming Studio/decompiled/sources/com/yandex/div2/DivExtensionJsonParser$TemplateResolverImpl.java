package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivExtensionJsonParser.kt */
/* loaded from: classes.dex */
public final class DivExtensionJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivExtensionJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivExtension resolve(ParsingContext parsingContext, DivExtensionTemplate divExtensionTemplate, JSONObject jSONObject) {
        return new DivExtension((String) JsonFieldResolver.resolve(parsingContext, divExtensionTemplate.id, jSONObject, "id"), (JSONObject) JsonFieldResolver.resolveOptional(parsingContext, divExtensionTemplate.params, jSONObject, "params"));
    }
}
