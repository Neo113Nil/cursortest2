package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import com.yandex.div2.DivTextTemplate;
import org.json.JSONObject;

/* compiled from: DivTextJsonParser.kt */
/* loaded from: classes5.dex */
public final class DivTextEllipsisJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivTextEllipsisJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivTextTemplate.EllipsisTemplate deserialize(ParsingContext parsingContext, DivTextTemplate.EllipsisTemplate ellipsisTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivTextTemplate.EllipsisTemplate(JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, ellipsisTemplate != null ? ellipsisTemplate.actions : null, this.component.getDivActionJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "images", allowPropertyOverride, ellipsisTemplate != null ? ellipsisTemplate.images : null, this.component.getDivTextImageJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "ranges", allowPropertyOverride, ellipsisTemplate != null ? ellipsisTemplate.ranges : null, this.component.getDivTextRangeJsonTemplateParser()), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "text", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, ellipsisTemplate != null ? ellipsisTemplate.text : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivTextTemplate.EllipsisTemplate ellipsisTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", ellipsisTemplate.actions, this.component.getDivActionJsonTemplateParser());
        JsonFieldParser.writeListField(parsingContext, jSONObject, "images", ellipsisTemplate.images, this.component.getDivTextImageJsonTemplateParser());
        JsonFieldParser.writeListField(parsingContext, jSONObject, "ranges", ellipsisTemplate.ranges, this.component.getDivTextRangeJsonTemplateParser());
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text", ellipsisTemplate.text);
        return jSONObject;
    }
}
