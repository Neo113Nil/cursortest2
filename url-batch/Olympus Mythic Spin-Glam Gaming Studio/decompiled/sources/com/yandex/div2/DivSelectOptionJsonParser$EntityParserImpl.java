package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivSelect;
import org.json.JSONObject;

/* compiled from: DivSelectJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivSelectOptionJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivSelectOptionJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivSelect.Option deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new DivSelect.Option(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text", typeHelper), JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", typeHelper));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivSelect.Option option) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text", option.text);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", option.value);
        return jSONObject;
    }
}
