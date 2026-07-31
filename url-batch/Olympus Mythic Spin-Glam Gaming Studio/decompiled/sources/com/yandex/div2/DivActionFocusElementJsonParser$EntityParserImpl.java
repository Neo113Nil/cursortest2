package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivActionFocusElementJsonParser.kt */
/* loaded from: classes10.dex */
public final class DivActionFocusElementJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivActionFocusElementJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivActionFocusElement deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivActionFocusElement(JsonExpressionParser.readExpression(parsingContext, jSONObject, "element_id", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivActionFocusElement divActionFocusElement) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "element_id", divActionFocusElement.elementId);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "focus_element");
        return jSONObject;
    }
}
