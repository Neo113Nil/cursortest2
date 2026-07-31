package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivActionDownloadJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivActionDownloadJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivActionDownloadJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivActionDownload resolve(ParsingContext parsingContext, DivActionDownloadTemplate divActionDownloadTemplate, JSONObject jSONObject) {
        return new DivActionDownload(JsonFieldResolver.resolveOptionalList(parsingContext, divActionDownloadTemplate.onFailActions, jSONObject, "on_fail_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser()), JsonFieldResolver.resolveOptionalList(parsingContext, divActionDownloadTemplate.onSuccessActions, jSONObject, "on_success_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser()), JsonFieldResolver.resolveExpression(parsingContext, divActionDownloadTemplate.url, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }
}
