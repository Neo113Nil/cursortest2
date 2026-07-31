package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivSolidBackgroundJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivSolidBackgroundJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivSolidBackgroundJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivSolidBackground resolve(ParsingContext parsingContext, DivSolidBackgroundTemplate divSolidBackgroundTemplate, JSONObject jSONObject) {
        return new DivSolidBackground(JsonFieldResolver.resolveExpression(parsingContext, divSolidBackgroundTemplate.color, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT));
    }
}
