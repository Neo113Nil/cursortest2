package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DictValueJsonParser.kt */
/* loaded from: classes15.dex */
public final class DictValueJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DictValueJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DictValue deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DictValue(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DICT));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DictValue dictValue) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "dict");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", dictValue.value);
        return jSONObject;
    }
}
