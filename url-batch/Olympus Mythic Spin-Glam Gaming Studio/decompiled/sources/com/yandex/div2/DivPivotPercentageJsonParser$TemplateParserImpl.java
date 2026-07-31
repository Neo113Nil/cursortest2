package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivPivotPercentageJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivPivotPercentageJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivPivotPercentageJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivPivotPercentageTemplate deserialize(ParsingContext parsingContext, DivPivotPercentageTemplate divPivotPercentageTemplate, JSONObject jSONObject) {
        return new DivPivotPercentageTemplate(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, parsingContext.getAllowPropertyOverride(), divPivotPercentageTemplate != null ? divPivotPercentageTemplate.value : null, ParsingConvertersKt.NUMBER_TO_DOUBLE));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivPivotPercentageTemplate divPivotPercentageTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "pivot-percentage");
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", divPivotPercentageTemplate.value);
        return jSONObject;
    }
}
