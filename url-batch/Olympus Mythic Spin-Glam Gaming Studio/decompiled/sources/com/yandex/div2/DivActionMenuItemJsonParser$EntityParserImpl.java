package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivAction;
import org.json.JSONObject;

/* compiled from: DivActionJsonParser.kt */
/* loaded from: classes11.dex */
public final class DivActionMenuItemJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivActionMenuItemJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivAction.MenuItem deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivAction.MenuItem((DivAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action", this.component.getDivActionJsonEntityParser()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.component.getDivActionJsonEntityParser()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "text", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivAction.MenuItem menuItem) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "action", menuItem.action, this.component.getDivActionJsonEntityParser());
        JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", menuItem.actions, this.component.getDivActionJsonEntityParser());
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text", menuItem.text);
        return jSONObject;
    }
}
