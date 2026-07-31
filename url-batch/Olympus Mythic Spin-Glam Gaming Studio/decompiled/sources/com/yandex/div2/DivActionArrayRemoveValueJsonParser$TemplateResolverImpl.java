package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivActionArrayRemoveValueJsonParser.kt */
/* loaded from: classes15.dex */
public final class DivActionArrayRemoveValueJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivActionArrayRemoveValueJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivActionArrayRemoveValue resolve(ParsingContext parsingContext, DivActionArrayRemoveValueTemplate divActionArrayRemoveValueTemplate, JSONObject jSONObject) {
        return new DivActionArrayRemoveValue(JsonFieldResolver.resolveExpression(parsingContext, divActionArrayRemoveValueTemplate.index, jSONObject, "index", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), JsonFieldResolver.resolveExpression(parsingContext, divActionArrayRemoveValueTemplate.variableName, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
