package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivActionFocusElementJsonParser.kt */
/* loaded from: classes11.dex */
public final class DivActionFocusElementJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivActionFocusElementJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivActionFocusElement resolve(ParsingContext parsingContext, DivActionFocusElementTemplate divActionFocusElementTemplate, JSONObject jSONObject) {
        return new DivActionFocusElement(JsonFieldResolver.resolveExpression(parsingContext, divActionFocusElementTemplate.elementId, jSONObject, "element_id", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
