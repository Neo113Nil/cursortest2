package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import org.json.JSONObject;

/* compiled from: DivNinePatchBackgroundJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivNinePatchBackgroundJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivNinePatchBackgroundJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivNinePatchBackground deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivNinePatchBackground(JsonExpressionParser.readExpression(parsingContext, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI), (DivAbsoluteEdgeInsets) JsonPropertyParser.read(parsingContext, jSONObject, "insets", this.component.getDivAbsoluteEdgeInsetsJsonEntityParser()));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivNinePatchBackground divNinePatchBackground) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "image_url", divNinePatchBackground.imageUrl, ParsingConvertersKt.URI_TO_STRING);
        JsonPropertyParser.write(parsingContext, jSONObject, "insets", divNinePatchBackground.insets, this.component.getDivAbsoluteEdgeInsetsJsonEntityParser());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "nine_patch_image");
        return jSONObject;
    }
}
