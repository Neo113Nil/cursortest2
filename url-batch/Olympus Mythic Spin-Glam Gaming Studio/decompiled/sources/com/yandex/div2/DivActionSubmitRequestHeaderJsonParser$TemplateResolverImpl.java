package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionSubmit;
import com.yandex.div2.DivActionSubmitTemplate;
import org.json.JSONObject;

/* compiled from: DivActionSubmitJsonParser.kt */
/* loaded from: classes14.dex */
public final class DivActionSubmitRequestHeaderJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivActionSubmitRequestHeaderJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivActionSubmit.Request.Header resolve(ParsingContext parsingContext, DivActionSubmitTemplate.RequestTemplate.HeaderTemplate headerTemplate, JSONObject jSONObject) {
        Field field = headerTemplate.name;
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new DivActionSubmit.Request.Header(JsonFieldResolver.resolveExpression(parsingContext, field, jSONObject, "name", typeHelper), JsonFieldResolver.resolveExpression(parsingContext, headerTemplate.value, jSONObject, "value", typeHelper));
    }
}
