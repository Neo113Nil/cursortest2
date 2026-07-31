package com.yandex.div2;

import com.facebook.appevents.codeless.internal.Constants;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivRadialGradientRelativeCenterJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivRadialGradientRelativeCenterJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivRadialGradientRelativeCenterJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivRadialGradientRelativeCenter deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivRadialGradientRelativeCenter(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivRadialGradientRelativeCenter divRadialGradientRelativeCenter) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", Constants.PATH_TYPE_RELATIVE);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", divRadialGradientRelativeCenter.value);
        return jSONObject;
    }
}
