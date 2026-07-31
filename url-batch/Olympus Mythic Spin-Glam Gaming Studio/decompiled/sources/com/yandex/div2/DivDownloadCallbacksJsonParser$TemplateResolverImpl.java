package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivDownloadCallbacksJsonParser.kt */
/* loaded from: classes3.dex */
public final class DivDownloadCallbacksJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivDownloadCallbacksJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivDownloadCallbacks resolve(ParsingContext parsingContext, DivDownloadCallbacksTemplate divDownloadCallbacksTemplate, JSONObject jSONObject) {
        return new DivDownloadCallbacks(JsonFieldResolver.resolveOptionalList(parsingContext, divDownloadCallbacksTemplate.onFailActions, jSONObject, "on_fail_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser()), JsonFieldResolver.resolveOptionalList(parsingContext, divDownloadCallbacksTemplate.onSuccessActions, jSONObject, "on_success_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser()));
    }
}
