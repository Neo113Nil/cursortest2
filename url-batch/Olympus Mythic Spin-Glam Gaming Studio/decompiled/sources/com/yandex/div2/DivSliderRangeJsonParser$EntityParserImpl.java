package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivSlider;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* compiled from: DivSliderJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivSliderRangeJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivSliderRangeJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivSlider.Range deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
        return new DivSlider.Range(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "end", typeHelper, function1), (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.component.getDivEdgeInsetsJsonEntityParser()), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start", typeHelper, function1), (DivDrawable) JsonPropertyParser.readOptional(parsingContext, jSONObject, "track_active_style", this.component.getDivDrawableJsonEntityParser()), (DivDrawable) JsonPropertyParser.readOptional(parsingContext, jSONObject, "track_inactive_style", this.component.getDivDrawableJsonEntityParser()));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivSlider.Range range) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "end", range.end);
        JsonPropertyParser.write(parsingContext, jSONObject, "margins", range.margins, this.component.getDivEdgeInsetsJsonEntityParser());
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start", range.start);
        JsonPropertyParser.write(parsingContext, jSONObject, "track_active_style", range.trackActiveStyle, this.component.getDivDrawableJsonEntityParser());
        JsonPropertyParser.write(parsingContext, jSONObject, "track_inactive_style", range.trackInactiveStyle, this.component.getDivDrawableJsonEntityParser());
        return jSONObject;
    }
}
