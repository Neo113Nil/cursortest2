package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import com.yandex.div2.DivSliderTemplate;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* compiled from: DivSliderJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivSliderRangeJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivSliderRangeJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivSliderTemplate.RangeTemplate deserialize(ParsingContext parsingContext, DivSliderTemplate.RangeTemplate rangeTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Field field = rangeTemplate != null ? rangeTemplate.end : null;
        Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
        return new DivSliderTemplate.RangeTemplate(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "end", typeHelper, allowPropertyOverride, field, function1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, rangeTemplate != null ? rangeTemplate.margins : null, this.component.getDivEdgeInsetsJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "start", typeHelper, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.start : null, function1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "track_active_style", allowPropertyOverride, rangeTemplate != null ? rangeTemplate.trackActiveStyle : null, this.component.getDivDrawableJsonTemplateParser()), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "track_inactive_style", allowPropertyOverride, rangeTemplate != null ? rangeTemplate.trackInactiveStyle : null, this.component.getDivDrawableJsonTemplateParser()));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivSliderTemplate.RangeTemplate rangeTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "end", rangeTemplate.end);
        JsonFieldParser.writeField(parsingContext, jSONObject, "margins", rangeTemplate.margins, this.component.getDivEdgeInsetsJsonTemplateParser());
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start", rangeTemplate.start);
        JsonFieldParser.writeField(parsingContext, jSONObject, "track_active_style", rangeTemplate.trackActiveStyle, this.component.getDivDrawableJsonTemplateParser());
        JsonFieldParser.writeField(parsingContext, jSONObject, "track_inactive_style", rangeTemplate.trackInactiveStyle, this.component.getDivDrawableJsonTemplateParser());
        return jSONObject;
    }
}
