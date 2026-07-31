package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivInputFilterExpressionJsonParser.kt */
/* loaded from: classes3.dex */
public final class DivInputFilterExpressionJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivInputFilterExpressionJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivInputFilterExpression deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivInputFilterExpression(JsonExpressionParser.readExpression(parsingContext, jSONObject, "condition", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivInputFilterExpression divInputFilterExpression) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "condition", divInputFilterExpression.condition);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "expression");
        return jSONObject;
    }
}
