package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import org.json.JSONObject;

/* compiled from: DivInputFilterRegexJsonParser.kt */
/* loaded from: classes11.dex */
public final class DivInputFilterRegexJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivInputFilterRegexJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivInputFilterRegexTemplate deserialize(ParsingContext parsingContext, DivInputFilterRegexTemplate divInputFilterRegexTemplate, JSONObject jSONObject) {
        return new DivInputFilterRegexTemplate(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "pattern", TypeHelpersKt.TYPE_HELPER_STRING, parsingContext.getAllowPropertyOverride(), divInputFilterRegexTemplate != null ? divInputFilterRegexTemplate.pattern : null));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivInputFilterRegexTemplate divInputFilterRegexTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "pattern", divInputFilterRegexTemplate.pattern);
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "regex");
        return jSONObject;
    }
}
