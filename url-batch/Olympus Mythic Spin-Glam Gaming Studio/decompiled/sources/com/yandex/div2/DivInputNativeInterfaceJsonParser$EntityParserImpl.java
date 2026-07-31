package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivInput;
import org.json.JSONObject;

/* compiled from: DivInputJsonParser.kt */
/* loaded from: classes14.dex */
public final class DivInputNativeInterfaceJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivInputNativeInterfaceJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivInput.NativeInterface deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivInput.NativeInterface(JsonExpressionParser.readExpression(parsingContext, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivInput.NativeInterface nativeInterface) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", nativeInterface.color, ParsingConvertersKt.COLOR_INT_TO_STRING);
        return jSONObject;
    }
}
