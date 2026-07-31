package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* compiled from: DivShapeDrawableJsonParser.kt */
/* loaded from: classes5.dex */
public final class DivShapeDrawableJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivShapeDrawableJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivShapeDrawable deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivShapeDrawable(JsonExpressionParser.readExpression(parsingContext, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), (DivShape) JsonPropertyParser.read(parsingContext, jSONObject, "shape", this.component.getDivShapeJsonEntityParser()), (DivStroke) JsonPropertyParser.readOptional(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, this.component.getDivStrokeJsonEntityParser()));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivShapeDrawable divShapeDrawable) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", divShapeDrawable.color, ParsingConvertersKt.COLOR_INT_TO_STRING);
        JsonPropertyParser.write(parsingContext, jSONObject, "shape", divShapeDrawable.shape, this.component.getDivShapeJsonEntityParser());
        JsonPropertyParser.write(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, divShapeDrawable.stroke, this.component.getDivStrokeJsonEntityParser());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "shape_drawable");
        return jSONObject;
    }
}
