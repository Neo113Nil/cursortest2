package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivSelect;
import com.yandex.div2.DivSelectTemplate;
import org.json.JSONObject;

/* compiled from: DivSelectJsonParser.kt */
/* loaded from: classes9.dex */
public final class DivSelectOptionJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivSelectOptionJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivSelect.Option resolve(ParsingContext parsingContext, DivSelectTemplate.OptionTemplate optionTemplate, JSONObject jSONObject) {
        Field field = optionTemplate.text;
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new DivSelect.Option(JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "text", typeHelper), JsonFieldResolver.resolveExpression(parsingContext, optionTemplate.value, jSONObject, "value", typeHelper));
    }
}
