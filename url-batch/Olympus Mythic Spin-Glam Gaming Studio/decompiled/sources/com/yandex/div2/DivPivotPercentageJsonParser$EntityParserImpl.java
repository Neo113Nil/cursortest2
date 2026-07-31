package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivPivotPercentageJsonParser.kt */
/* loaded from: classes8.dex */
public final class DivPivotPercentageJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivPivotPercentageJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivPivotPercentage deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivPivotPercentage(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivPivotPercentage divPivotPercentage) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "pivot-percentage");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", divPivotPercentage.value);
        return jSONObject;
    }
}
