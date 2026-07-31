package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* compiled from: DivVideoSourceJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivVideoSourceJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivVideoSourceJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivVideoSourceTemplate deserialize(ParsingContext parsingContext, DivVideoSourceTemplate divVideoSourceTemplate, JSONObject jSONObject) {
        DivVideoSourceJsonParser$TemplateParserImpl divVideoSourceJsonParser$TemplateParserImpl;
        Field field;
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, VastAttributes.BITRATE, TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, divVideoSourceTemplate != null ? divVideoSourceTemplate.bitrate : null, ParsingConvertersKt.NUMBER_TO_INT);
        Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "mime_type", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divVideoSourceTemplate != null ? divVideoSourceTemplate.mimeType : null);
        if (divVideoSourceTemplate != null) {
            divVideoSourceJsonParser$TemplateParserImpl = this;
            field = divVideoSourceTemplate.resolution;
        } else {
            divVideoSourceJsonParser$TemplateParserImpl = this;
            field = null;
        }
        return new DivVideoSourceTemplate(readOptionalFieldWithExpression, readFieldWithExpression, JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "resolution", allowPropertyOverride, field, divVideoSourceJsonParser$TemplateParserImpl.component.getDivVideoSourceResolutionJsonTemplateParser()), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, divVideoSourceTemplate != null ? divVideoSourceTemplate.url : null, ParsingConvertersKt.ANY_TO_URI));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivVideoSourceTemplate divVideoSourceTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, VastAttributes.BITRATE, divVideoSourceTemplate.bitrate);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "mime_type", divVideoSourceTemplate.mimeType);
        JsonFieldParser.writeField(parsingContext, jSONObject, "resolution", divVideoSourceTemplate.resolution, this.component.getDivVideoSourceResolutionJsonTemplateParser());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "video_source");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", divVideoSourceTemplate.url, ParsingConvertersKt.URI_TO_STRING);
        return jSONObject;
    }
}
