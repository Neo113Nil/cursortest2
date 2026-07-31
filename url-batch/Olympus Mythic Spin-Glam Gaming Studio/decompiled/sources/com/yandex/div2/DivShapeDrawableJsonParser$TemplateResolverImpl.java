package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* compiled from: DivShapeDrawableJsonParser.kt */
/* loaded from: classes3.dex */
public final class DivShapeDrawableJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivShapeDrawableJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivShapeDrawable resolve(ParsingContext parsingContext, DivShapeDrawableTemplate divShapeDrawableTemplate, JSONObject jSONObject) {
        return new DivShapeDrawable(JsonFieldResolver.resolveExpression(parsingContext, divShapeDrawableTemplate.color, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), (DivShape) JsonFieldResolver.resolve(parsingContext, divShapeDrawableTemplate.shape, jSONObject, "shape", this.component.getDivShapeJsonTemplateResolver(), this.component.getDivShapeJsonEntityParser()), (DivStroke) JsonFieldResolver.resolveOptional(parsingContext, divShapeDrawableTemplate.stroke, jSONObject, VastAttributes.STROKE_COLOR, this.component.getDivStrokeJsonTemplateResolver(), this.component.getDivStrokeJsonEntityParser()));
    }
}
