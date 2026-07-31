package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionSubmit;
import org.json.JSONObject;

/* compiled from: DivActionSubmitJsonParser.kt */
/* loaded from: classes5.dex */
public final class DivActionSubmitJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivActionSubmitJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivActionSubmit resolve(ParsingContext parsingContext, DivActionSubmitTemplate divActionSubmitTemplate, JSONObject jSONObject) {
        return new DivActionSubmit(JsonFieldResolver.resolveExpression(parsingContext, divActionSubmitTemplate.containerId, jSONObject, "container_id", TypeHelpersKt.TYPE_HELPER_STRING), JsonFieldResolver.resolveOptionalList(parsingContext, divActionSubmitTemplate.onFailActions, jSONObject, "on_fail_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser()), JsonFieldResolver.resolveOptionalList(parsingContext, divActionSubmitTemplate.onSuccessActions, jSONObject, "on_success_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser()), (DivActionSubmit.Request) JsonFieldResolver.resolve(parsingContext, divActionSubmitTemplate.request, jSONObject, "request", this.component.getDivActionSubmitRequestJsonTemplateResolver(), this.component.getDivActionSubmitRequestJsonEntityParser()));
    }
}
