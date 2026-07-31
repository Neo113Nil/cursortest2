package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DictVariableJsonParser.kt */
/* loaded from: classes5.dex */
public final class DictVariableJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DictVariableJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DictVariable deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DictVariable((String) JsonPropertyParser.read(parsingContext, jSONObject, "name"), JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DICT));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DictVariable dictVariable) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "name", dictVariable.name);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "dict");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", dictVariable.value);
        return jSONObject;
    }
}
