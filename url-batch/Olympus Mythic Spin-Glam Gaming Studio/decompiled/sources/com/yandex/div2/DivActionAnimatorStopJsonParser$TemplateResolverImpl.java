package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivActionAnimatorStopJsonParser.kt */
/* loaded from: classes3.dex */
public final class DivActionAnimatorStopJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivActionAnimatorStopJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivActionAnimatorStop resolve(ParsingContext parsingContext, DivActionAnimatorStopTemplate divActionAnimatorStopTemplate, JSONObject jSONObject) {
        return new DivActionAnimatorStop((String) JsonFieldResolver.resolve(parsingContext, divActionAnimatorStopTemplate.animatorId, jSONObject, "animator_id"));
    }
}
