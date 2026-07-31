package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: ColorValueJsonParser.kt */
/* loaded from: classes15.dex */
public final class ColorValueJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public ColorValueJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public ColorValue resolve(ParsingContext parsingContext, ColorValueTemplate colorValueTemplate, JSONObject jSONObject) {
        return new ColorValue(JsonFieldResolver.resolveExpression(parsingContext, colorValueTemplate.value, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT));
    }
}
