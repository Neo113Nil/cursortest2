package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivSlider;
import com.yandex.div2.DivSliderTemplate;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* compiled from: DivSliderJsonParser.kt */
/* loaded from: classes14.dex */
public final class DivSliderRangeJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivSliderRangeJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivSlider.Range resolve(ParsingContext parsingContext, DivSliderTemplate.RangeTemplate rangeTemplate, JSONObject jSONObject) {
        Field field = rangeTemplate.end;
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
        return new DivSlider.Range(JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "end", typeHelper, function1), (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, rangeTemplate.margins, jSONObject, "margins", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser()), JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.start, jSONObject, "start", typeHelper, function1), (DivDrawable) JsonFieldResolver.resolveOptional(parsingContext, rangeTemplate.trackActiveStyle, jSONObject, "track_active_style", this.component.getDivDrawableJsonTemplateResolver(), this.component.getDivDrawableJsonEntityParser()), (DivDrawable) JsonFieldResolver.resolveOptional(parsingContext, rangeTemplate.trackInactiveStyle, jSONObject, "track_inactive_style", this.component.getDivDrawableJsonTemplateResolver(), this.component.getDivDrawableJsonEntityParser()));
    }
}
