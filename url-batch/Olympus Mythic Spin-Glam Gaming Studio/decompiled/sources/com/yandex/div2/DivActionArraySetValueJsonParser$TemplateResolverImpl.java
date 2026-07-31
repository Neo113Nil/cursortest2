package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivActionArraySetValueJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivActionArraySetValueJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivActionArraySetValueJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivActionArraySetValue resolve(ParsingContext parsingContext, DivActionArraySetValueTemplate divActionArraySetValueTemplate, JSONObject jSONObject) {
        return new DivActionArraySetValue(JsonFieldResolver.resolveExpression(parsingContext, divActionArraySetValueTemplate.index, jSONObject, "index", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), (DivTypedValue) JsonFieldResolver.resolve(parsingContext, divActionArraySetValueTemplate.value, jSONObject, "value", this.component.getDivTypedValueJsonTemplateResolver(), this.component.getDivTypedValueJsonEntityParser()), JsonFieldResolver.resolveExpression(parsingContext, divActionArraySetValueTemplate.variableName, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
