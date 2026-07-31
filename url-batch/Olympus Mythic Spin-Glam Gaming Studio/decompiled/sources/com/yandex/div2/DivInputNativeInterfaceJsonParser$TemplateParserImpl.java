package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import com.yandex.div2.DivInputTemplate;
import org.json.JSONObject;

/* compiled from: DivInputJsonParser.kt */
/* loaded from: classes5.dex */
public final class DivInputNativeInterfaceJsonParser$TemplateParserImpl implements TemplateParser {
    private final JsonParserComponent component;

    public DivInputNativeInterfaceJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public DivInputTemplate.NativeInterfaceTemplate deserialize(ParsingContext parsingContext, DivInputTemplate.NativeInterfaceTemplate nativeInterfaceTemplate, JSONObject jSONObject) {
        return new DivInputTemplate.NativeInterfaceTemplate(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, parsingContext.getAllowPropertyOverride(), nativeInterfaceTemplate != null ? nativeInterfaceTemplate.color : null, ParsingConvertersKt.STRING_TO_COLOR_INT));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivInputTemplate.NativeInterfaceTemplate nativeInterfaceTemplate) {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", nativeInterfaceTemplate.color, ParsingConvertersKt.COLOR_INT_TO_STRING);
        return jSONObject;
    }
}
