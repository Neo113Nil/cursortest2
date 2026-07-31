package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivInputFilterExpressionJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivInputFilterExpressionJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivInputFilterExpressionJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivInputFilterExpressionTemplate deserialize(ParsingContext parsingContext, DivInputFilterExpressionTemplate divInputFilterExpressionTemplate, JSONObject jSONObject) {
        return new DivInputFilterExpressionTemplate(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "condition", TypeHelpersKt.TYPE_HELPER_BOOLEAN, parsingContext.getAllowPropertyOverride(), divInputFilterExpressionTemplate != null ? divInputFilterExpressionTemplate.condition : null, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivInputFilterExpressionTemplate divInputFilterExpressionTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "condition", divInputFilterExpressionTemplate.condition);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "expression");
        return jSONObject;
    }
}
