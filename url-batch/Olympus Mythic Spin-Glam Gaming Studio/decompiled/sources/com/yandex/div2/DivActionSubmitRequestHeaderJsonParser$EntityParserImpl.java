package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivActionSubmit;
import org.json.JSONObject;

/* compiled from: DivActionSubmitJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivActionSubmitRequestHeaderJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivActionSubmitRequestHeaderJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivActionSubmit.Request.Header deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new DivActionSubmit.Request.Header(JsonExpressionParser.readExpression(parsingContext, jSONObject, "name", typeHelper), JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", typeHelper));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionSubmit.Request.Header header) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "name", header.name);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", header.value);
        return jSONObject;
    }
}
