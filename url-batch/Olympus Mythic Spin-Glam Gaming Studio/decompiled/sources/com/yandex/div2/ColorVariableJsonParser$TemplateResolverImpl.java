package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: ColorVariableJsonParser.kt */
/* loaded from: classes14.dex */
public final class ColorVariableJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public ColorVariableJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public ColorVariable resolve(ParsingContext parsingContext, ColorVariableTemplate colorVariableTemplate, JSONObject jSONObject) {
        return new ColorVariable((String) JsonFieldResolver.resolve(parsingContext, colorVariableTemplate.name, jSONObject, "name"), JsonFieldResolver.resolveExpression(parsingContext, colorVariableTemplate.value, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT));
    }
}
