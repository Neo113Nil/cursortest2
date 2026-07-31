package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivText;
import org.json.JSONObject;

/* compiled from: DivTextJsonParser.kt */
/* loaded from: classes11.dex */
public final class DivTextEllipsisJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivTextEllipsisJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivText.Ellipsis deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivText.Ellipsis(JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.component.getDivActionJsonEntityParser()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "images", this.component.getDivTextImageJsonEntityParser()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "ranges", this.component.getDivTextRangeJsonEntityParser()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "text", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivText.Ellipsis ellipsis) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", ellipsis.actions, this.component.getDivActionJsonEntityParser());
        JsonPropertyParser.writeList(parsingContext, jSONObject, "images", ellipsis.images, this.component.getDivTextImageJsonEntityParser());
        JsonPropertyParser.writeList(parsingContext, jSONObject, "ranges", ellipsis.ranges, this.component.getDivTextRangeJsonEntityParser());
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text", ellipsis.text);
        return jSONObject;
    }
}
