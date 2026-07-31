package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivWrapContentSizeJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivWrapContentSizeJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivWrapContentSizeJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivWrapContentSize deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivWrapContentSize(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "constrained", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN), (DivSizeUnitValue) JsonPropertyParser.readOptional(parsingContext, jSONObject, "max_size", this.component.getDivSizeUnitValueJsonEntityParser()), (DivSizeUnitValue) JsonPropertyParser.readOptional(parsingContext, jSONObject, "min_size", this.component.getDivSizeUnitValueJsonEntityParser()));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivWrapContentSize divWrapContentSize) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "constrained", divWrapContentSize.constrained);
        JsonPropertyParser.write(parsingContext, jSONObject, "max_size", divWrapContentSize.maxSize, this.component.getDivSizeUnitValueJsonEntityParser());
        JsonPropertyParser.write(parsingContext, jSONObject, "min_size", divWrapContentSize.minSize, this.component.getDivSizeUnitValueJsonEntityParser());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "wrap_content");
        return jSONObject;
    }
}
