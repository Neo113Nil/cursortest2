package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivInputValidator;
import com.yandex.div2.DivInputValidatorExpressionJsonParser;
import com.yandex.div2.DivInputValidatorRegexJsonParser;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivInputValidatorJsonParser.kt */
/* loaded from: classes9.dex */
public final class DivInputValidatorJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivInputValidatorJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivInputValidator deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(readString, "regex")) {
            return new DivInputValidator.Regex(((DivInputValidatorRegexJsonParser.EntityParserImpl) this.component.getDivInputValidatorRegexJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(readString, "expression")) {
            return new DivInputValidator.Expression(((DivInputValidatorExpressionJsonParser.EntityParserImpl) this.component.getDivInputValidatorExpressionJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        DivInputValidatorTemplate divInputValidatorTemplate = orThrow instanceof DivInputValidatorTemplate ? (DivInputValidatorTemplate) orThrow : null;
        if (divInputValidatorTemplate != null) {
            return ((DivInputValidatorJsonParser$TemplateResolverImpl) this.component.getDivInputValidatorJsonTemplateResolver().getValue()).resolve(parsingContext, divInputValidatorTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivInputValidator divInputValidator) {
        if (divInputValidator instanceof DivInputValidator.Regex) {
            return ((DivInputValidatorRegexJsonParser.EntityParserImpl) this.component.getDivInputValidatorRegexJsonEntityParser().getValue()).serialize(parsingContext, ((DivInputValidator.Regex) divInputValidator).getValue());
        }
        if (divInputValidator instanceof DivInputValidator.Expression) {
            return ((DivInputValidatorExpressionJsonParser.EntityParserImpl) this.component.getDivInputValidatorExpressionJsonEntityParser().getValue()).serialize(parsingContext, ((DivInputValidator.Expression) divInputValidator).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
