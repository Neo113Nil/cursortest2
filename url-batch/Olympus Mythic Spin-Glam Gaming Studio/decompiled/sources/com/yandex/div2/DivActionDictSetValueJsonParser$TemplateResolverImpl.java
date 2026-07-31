package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivActionDictSetValueJsonParser.kt */
/* loaded from: classes13.dex */
public final class DivActionDictSetValueJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivActionDictSetValueJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivActionDictSetValue resolve(ParsingContext parsingContext, DivActionDictSetValueTemplate divActionDictSetValueTemplate, JSONObject jSONObject) {
        Field field = divActionDictSetValueTemplate.key;
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new DivActionDictSetValue(JsonFieldResolver.resolveExpression(parsingContext, field, jSONObject, "key", typeHelper), (DivTypedValue) JsonFieldResolver.resolveOptional(parsingContext, divActionDictSetValueTemplate.value, jSONObject, "value", this.component.getDivTypedValueJsonTemplateResolver(), this.component.getDivTypedValueJsonEntityParser()), JsonFieldResolver.resolveExpression(parsingContext, divActionDictSetValueTemplate.variableName, jSONObject, "variable_name", typeHelper));
    }
}
