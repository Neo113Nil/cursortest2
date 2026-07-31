package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivActionArrayInsertValueJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivActionArrayInsertValueJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivActionArrayInsertValueJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivActionArrayInsertValue resolve(ParsingContext parsingContext, DivActionArrayInsertValueTemplate divActionArrayInsertValueTemplate, JSONObject jSONObject) {
        return new DivActionArrayInsertValue(JsonFieldResolver.resolveOptionalExpression(parsingContext, divActionArrayInsertValueTemplate.index, jSONObject, "index", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), (DivTypedValue) JsonFieldResolver.resolve(parsingContext, divActionArrayInsertValueTemplate.value, jSONObject, "value", this.component.getDivTypedValueJsonTemplateResolver(), this.component.getDivTypedValueJsonEntityParser()), JsonFieldResolver.resolveExpression(parsingContext, divActionArrayInsertValueTemplate.variableName, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
