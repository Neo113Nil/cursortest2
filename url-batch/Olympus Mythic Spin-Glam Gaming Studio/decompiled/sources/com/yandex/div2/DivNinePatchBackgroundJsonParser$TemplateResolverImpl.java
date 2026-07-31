package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import org.json.JSONObject;

/* compiled from: DivNinePatchBackgroundJsonParser.kt */
/* loaded from: classes3.dex */
public final class DivNinePatchBackgroundJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivNinePatchBackgroundJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivNinePatchBackground resolve(ParsingContext parsingContext, DivNinePatchBackgroundTemplate divNinePatchBackgroundTemplate, JSONObject jSONObject) {
        return new DivNinePatchBackground(JsonFieldResolver.resolveExpression(parsingContext, divNinePatchBackgroundTemplate.imageUrl, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI), (DivAbsoluteEdgeInsets) JsonFieldResolver.resolve(parsingContext, divNinePatchBackgroundTemplate.insets, jSONObject, "insets", this.component.getDivAbsoluteEdgeInsetsJsonTemplateResolver(), this.component.getDivAbsoluteEdgeInsetsJsonEntityParser()));
    }
}
