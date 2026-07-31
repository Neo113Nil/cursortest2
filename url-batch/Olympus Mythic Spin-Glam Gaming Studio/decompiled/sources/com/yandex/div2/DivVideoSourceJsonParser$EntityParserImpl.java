package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivVideoSource;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* compiled from: DivVideoSourceJsonParser.kt */
/* loaded from: classes11.dex */
public final class DivVideoSourceJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivVideoSourceJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivVideoSource deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivVideoSource(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, VastAttributes.BITRATE, TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), JsonExpressionParser.readExpression(parsingContext, jSONObject, "mime_type", TypeHelpersKt.TYPE_HELPER_STRING), (DivVideoSource.Resolution) JsonPropertyParser.readOptional(parsingContext, jSONObject, "resolution", this.component.getDivVideoSourceResolutionJsonEntityParser()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivVideoSource divVideoSource) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, VastAttributes.BITRATE, divVideoSource.bitrate);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "mime_type", divVideoSource.mimeType);
        JsonPropertyParser.write(parsingContext, jSONObject, "resolution", divVideoSource.resolution, this.component.getDivVideoSourceResolutionJsonEntityParser());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "video_source");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "url", divVideoSource.url, ParsingConvertersKt.URI_TO_STRING);
        return jSONObject;
    }
}
