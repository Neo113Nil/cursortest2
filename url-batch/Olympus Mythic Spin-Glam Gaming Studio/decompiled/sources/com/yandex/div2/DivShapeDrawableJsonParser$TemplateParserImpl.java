package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* compiled from: DivShapeDrawableJsonParser.kt */
/* loaded from: classes12.dex */
public final class DivShapeDrawableJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivShapeDrawableJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivShapeDrawableTemplate deserialize(ParsingContext parsingContext, DivShapeDrawableTemplate divShapeDrawableTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivShapeDrawableTemplate(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, divShapeDrawableTemplate != null ? divShapeDrawableTemplate.color : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "shape", allowPropertyOverride, divShapeDrawableTemplate != null ? divShapeDrawableTemplate.shape : null, this.component.getDivShapeJsonTemplateParser()), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, VastAttributes.STROKE_COLOR, allowPropertyOverride, divShapeDrawableTemplate != null ? divShapeDrawableTemplate.stroke : null, this.component.getDivStrokeJsonTemplateParser()));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivShapeDrawableTemplate divShapeDrawableTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", divShapeDrawableTemplate.color, ParsingConvertersKt.COLOR_INT_TO_STRING);
        JsonFieldParser.writeField(parsingContext, jSONObject, "shape", divShapeDrawableTemplate.shape, this.component.getDivShapeJsonTemplateParser());
        JsonFieldParser.writeField(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, divShapeDrawableTemplate.stroke, this.component.getDivStrokeJsonTemplateParser());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "shape_drawable");
        return jSONObject;
    }
}
