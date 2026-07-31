package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivFixedLengthInputMaskJsonParser;
import com.yandex.div2.DivInputMaskTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivInputMaskJsonParser.kt */
/* loaded from: classes12.dex */
public final class DivInputMaskJsonParser$TemplateParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivInputMaskJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivInputMaskTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String type;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        DivInputMaskTemplate divInputMaskTemplate = entityTemplate instanceof DivInputMaskTemplate ? (DivInputMaskTemplate) entityTemplate : null;
        if (divInputMaskTemplate != null && (type = divInputMaskTemplate.getType()) != null) {
            readString = type;
        }
        int hashCode = readString.hashCode();
        if (hashCode != 106642798) {
            if (hashCode != 393594385) {
                if (hashCode == 575402001 && readString.equals("currency")) {
                    return new DivInputMaskTemplate.Currency(((DivCurrencyInputMaskJsonParser$TemplateParserImpl) this.component.getDivCurrencyInputMaskJsonTemplateParser().getValue()).deserialize(parsingContext, (DivCurrencyInputMaskTemplate) (divInputMaskTemplate != null ? divInputMaskTemplate.value() : null), jSONObject));
                }
            } else if (readString.equals("fixed_length")) {
                return new DivInputMaskTemplate.FixedLength(((DivFixedLengthInputMaskJsonParser.TemplateParserImpl) this.component.getDivFixedLengthInputMaskJsonTemplateParser().getValue()).deserialize(parsingContext, (DivFixedLengthInputMaskTemplate) (divInputMaskTemplate != null ? divInputMaskTemplate.value() : null), jSONObject));
            }
        } else if (readString.equals("phone")) {
            return new DivInputMaskTemplate.Phone(((DivPhoneInputMaskJsonParser$TemplateParserImpl) this.component.getDivPhoneInputMaskJsonTemplateParser().getValue()).deserialize(parsingContext, (DivPhoneInputMaskTemplate) (divInputMaskTemplate != null ? divInputMaskTemplate.value() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivInputMaskTemplate divInputMaskTemplate) {
        if (divInputMaskTemplate instanceof DivInputMaskTemplate.FixedLength) {
            return ((DivFixedLengthInputMaskJsonParser.TemplateParserImpl) this.component.getDivFixedLengthInputMaskJsonTemplateParser().getValue()).serialize(parsingContext, ((DivInputMaskTemplate.FixedLength) divInputMaskTemplate).getValue());
        }
        if (divInputMaskTemplate instanceof DivInputMaskTemplate.Currency) {
            return ((DivCurrencyInputMaskJsonParser$TemplateParserImpl) this.component.getDivCurrencyInputMaskJsonTemplateParser().getValue()).serialize(parsingContext, ((DivInputMaskTemplate.Currency) divInputMaskTemplate).getValue());
        }
        if (divInputMaskTemplate instanceof DivInputMaskTemplate.Phone) {
            return ((DivPhoneInputMaskJsonParser$TemplateParserImpl) this.component.getDivPhoneInputMaskJsonTemplateParser().getValue()).serialize(parsingContext, ((DivInputMaskTemplate.Phone) divInputMaskTemplate).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
