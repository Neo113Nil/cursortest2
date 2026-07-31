package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivActionHideTooltipJsonParser.kt */
/* loaded from: classes13.dex */
public final class DivActionHideTooltipJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivActionHideTooltipJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivActionHideTooltip deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivActionHideTooltip(JsonExpressionParser.readExpression(parsingContext, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionHideTooltip divActionHideTooltip) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "id", divActionHideTooltip.id);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "hide_tooltip");
        return jSONObject;
    }
}
