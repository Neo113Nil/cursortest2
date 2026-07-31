package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivWrapContentSizeJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivWrapContentSizeJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivWrapContentSizeJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivWrapContentSizeTemplate deserialize(ParsingContext parsingContext, DivWrapContentSizeTemplate divWrapContentSizeTemplate, JSONObject jSONObject) {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivWrapContentSizeTemplate(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "constrained", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divWrapContentSizeTemplate != null ? divWrapContentSizeTemplate.constrained : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "max_size", allowPropertyOverride, divWrapContentSizeTemplate != null ? divWrapContentSizeTemplate.maxSize : null, this.component.getDivSizeUnitValueJsonTemplateParser()), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "min_size", allowPropertyOverride, divWrapContentSizeTemplate != null ? divWrapContentSizeTemplate.minSize : null, this.component.getDivSizeUnitValueJsonTemplateParser()));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivWrapContentSizeTemplate divWrapContentSizeTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "constrained", divWrapContentSizeTemplate.constrained);
        JsonFieldParser.writeField(parsingContext, jSONObject, "max_size", divWrapContentSizeTemplate.maxSize, this.component.getDivSizeUnitValueJsonTemplateParser());
        JsonFieldParser.writeField(parsingContext, jSONObject, "min_size", divWrapContentSizeTemplate.minSize, this.component.getDivSizeUnitValueJsonTemplateParser());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "wrap_content");
        return jSONObject;
    }
}
