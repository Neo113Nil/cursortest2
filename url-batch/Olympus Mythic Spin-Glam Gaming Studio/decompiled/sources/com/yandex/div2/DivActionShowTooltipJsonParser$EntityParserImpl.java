package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivActionShowTooltipJsonParser.kt */
/* loaded from: classes14.dex */
public final class DivActionShowTooltipJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivActionShowTooltipJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivActionShowTooltip deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivActionShowTooltip(JsonExpressionParser.readExpression(parsingContext, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "multiple", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionShowTooltip divActionShowTooltip) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "id", divActionShowTooltip.id);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "multiple", divActionShowTooltip.multiple);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "show_tooltip");
        return jSONObject;
    }
}
