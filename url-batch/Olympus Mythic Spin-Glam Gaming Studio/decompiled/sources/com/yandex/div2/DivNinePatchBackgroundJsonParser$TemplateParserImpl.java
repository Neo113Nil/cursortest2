package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivNinePatchBackgroundJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivNinePatchBackgroundJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivNinePatchBackgroundJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivNinePatchBackgroundTemplate deserialize(ParsingContext parsingContext, DivNinePatchBackgroundTemplate divNinePatchBackgroundTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivNinePatchBackgroundTemplate(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, divNinePatchBackgroundTemplate != null ? divNinePatchBackgroundTemplate.imageUrl : null, ParsingConvertersKt.ANY_TO_URI), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "insets", allowPropertyOverride, divNinePatchBackgroundTemplate != null ? divNinePatchBackgroundTemplate.insets : null, this.component.getDivAbsoluteEdgeInsetsJsonTemplateParser()));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivNinePatchBackgroundTemplate divNinePatchBackgroundTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "image_url", divNinePatchBackgroundTemplate.imageUrl, ParsingConvertersKt.URI_TO_STRING);
        JsonFieldParser.writeField(parsingContext, jSONObject, "insets", divNinePatchBackgroundTemplate.insets, this.component.getDivAbsoluteEdgeInsetsJsonTemplateParser());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "nine_patch_image");
        return jSONObject;
    }
}
