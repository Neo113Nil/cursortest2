package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivActionSetVariableJsonParser.kt */
/* loaded from: classes15.dex */
public final class DivActionSetVariableJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivActionSetVariableJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivActionSetVariable resolve(ParsingContext parsingContext, DivActionSetVariableTemplate divActionSetVariableTemplate, JSONObject jSONObject) {
        return new DivActionSetVariable((DivTypedValue) JsonFieldResolver.resolve(parsingContext, divActionSetVariableTemplate.value, jSONObject, "value", this.component.getDivTypedValueJsonTemplateResolver(), this.component.getDivTypedValueJsonEntityParser()), JsonFieldResolver.resolveExpression(parsingContext, divActionSetVariableTemplate.variableName, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
