package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivFixedLengthInputMaskJsonParser;
import com.yandex.div2.DivInputMask;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivInputMaskJsonParser.kt */
/* loaded from: classes5.dex */
public final class DivInputMaskJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivInputMaskJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivInputMask deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        int hashCode = readString.hashCode();
        if (hashCode != 106642798) {
            if (hashCode != 393594385) {
                if (hashCode == 575402001 && readString.equals("currency")) {
                    return new DivInputMask.Currency(((DivCurrencyInputMaskJsonParser$EntityParserImpl) this.component.getDivCurrencyInputMaskJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
            } else if (readString.equals("fixed_length")) {
                return new DivInputMask.FixedLength(((DivFixedLengthInputMaskJsonParser.EntityParserImpl) this.component.getDivFixedLengthInputMaskJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
            }
        } else if (readString.equals("phone")) {
            return new DivInputMask.Phone(((DivPhoneInputMaskJsonParser$EntityParserImpl) this.component.getDivPhoneInputMaskJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        DivInputMaskTemplate divInputMaskTemplate = orThrow instanceof DivInputMaskTemplate ? (DivInputMaskTemplate) orThrow : null;
        if (divInputMaskTemplate != null) {
            return ((DivInputMaskJsonParser$TemplateResolverImpl) this.component.getDivInputMaskJsonTemplateResolver().getValue()).resolve(parsingContext, divInputMaskTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivInputMask divInputMask) {
        if (divInputMask instanceof DivInputMask.FixedLength) {
            return ((DivFixedLengthInputMaskJsonParser.EntityParserImpl) this.component.getDivFixedLengthInputMaskJsonEntityParser().getValue()).serialize(parsingContext, ((DivInputMask.FixedLength) divInputMask).getValue());
        }
        if (divInputMask instanceof DivInputMask.Currency) {
            return ((DivCurrencyInputMaskJsonParser$EntityParserImpl) this.component.getDivCurrencyInputMaskJsonEntityParser().getValue()).serialize(parsingContext, ((DivInputMask.Currency) divInputMask).getValue());
        }
        if (divInputMask instanceof DivInputMask.Phone) {
            return ((DivPhoneInputMaskJsonParser$EntityParserImpl) this.component.getDivPhoneInputMaskJsonEntityParser().getValue()).serialize(parsingContext, ((DivInputMask.Phone) divInputMask).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
