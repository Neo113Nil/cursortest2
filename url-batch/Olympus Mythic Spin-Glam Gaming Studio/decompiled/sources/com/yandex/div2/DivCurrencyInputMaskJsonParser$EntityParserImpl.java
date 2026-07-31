package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* compiled from: DivCurrencyInputMaskJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivCurrencyInputMaskJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivCurrencyInputMaskJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivCurrencyInputMask deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        return new DivCurrencyInputMask(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, CommonUrlParts.LOCALE, TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonPropertyParser.read(parsingContext, jSONObject, "raw_text_variable"));
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivCurrencyInputMask divCurrencyInputMask) {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, CommonUrlParts.LOCALE, divCurrencyInputMask.locale);
        JsonPropertyParser.write(parsingContext, jSONObject, "raw_text_variable", divCurrencyInputMask.getRawTextVariable());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "currency");
        return jSONObject;
    }
}
