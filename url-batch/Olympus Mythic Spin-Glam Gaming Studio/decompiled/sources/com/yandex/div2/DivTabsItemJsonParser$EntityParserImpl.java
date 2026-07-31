package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivTabs;
import org.json.JSONObject;

/* compiled from: DivTabsJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivTabsItemJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivTabsItemJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivTabs.Item deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivTabs.Item((Div) JsonPropertyParser.read(parsingContext, jSONObject, "div", this.component.getDivJsonEntityParser()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "title", TypeHelpersKt.TYPE_HELPER_STRING), (DivAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "title_click_action", this.component.getDivActionJsonEntityParser()));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivTabs.Item item) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "div", item.div, this.component.getDivJsonEntityParser());
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "title", item.title);
        JsonPropertyParser.write(parsingContext, jSONObject, "title_click_action", item.titleClickAction, this.component.getDivActionJsonEntityParser());
        return jSONObject;
    }
}
