package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivActionSetStoredValueJsonParser.kt */
/* loaded from: classes5.dex */
public final class DivActionSetStoredValueJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivActionSetStoredValueJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivActionSetStoredValue resolve(ParsingContext parsingContext, DivActionSetStoredValueTemplate divActionSetStoredValueTemplate, JSONObject jSONObject) {
        return new DivActionSetStoredValue(JsonFieldResolver.resolveExpression(parsingContext, divActionSetStoredValueTemplate.lifetime, jSONObject, "lifetime", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), JsonFieldResolver.resolveExpression(parsingContext, divActionSetStoredValueTemplate.name, jSONObject, "name", TypeHelpersKt.TYPE_HELPER_STRING), (DivTypedValue) JsonFieldResolver.resolve(parsingContext, divActionSetStoredValueTemplate.value, jSONObject, "value", this.component.getDivTypedValueJsonTemplateResolver(), this.component.getDivTypedValueJsonEntityParser()));
    }
}
