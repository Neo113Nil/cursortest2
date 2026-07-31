package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivWrapContentSizeJsonParser.kt */
/* loaded from: classes5.dex */
public final class DivWrapContentSizeJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivWrapContentSizeJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivWrapContentSize resolve(ParsingContext parsingContext, DivWrapContentSizeTemplate divWrapContentSizeTemplate, JSONObject jSONObject) {
        return new DivWrapContentSize(JsonFieldResolver.resolveOptionalExpression(parsingContext, divWrapContentSizeTemplate.constrained, jSONObject, "constrained", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN), (DivSizeUnitValue) JsonFieldResolver.resolveOptional(parsingContext, divWrapContentSizeTemplate.maxSize, jSONObject, "max_size", this.component.getDivSizeUnitValueJsonTemplateResolver(), this.component.getDivSizeUnitValueJsonEntityParser()), (DivSizeUnitValue) JsonFieldResolver.resolveOptional(parsingContext, divWrapContentSizeTemplate.minSize, jSONObject, "min_size", this.component.getDivSizeUnitValueJsonTemplateResolver(), this.component.getDivSizeUnitValueJsonEntityParser()));
    }
}
