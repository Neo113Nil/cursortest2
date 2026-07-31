package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivInputValidatorExpressionJsonParser;
import com.yandex.div2.DivInputValidatorRegexJsonParser;
import com.yandex.div2.DivInputValidatorTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivInputValidatorJsonParser.kt */
/* loaded from: classes13.dex */
public final class DivInputValidatorJsonParser$TemplateParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivInputValidatorJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivInputValidatorTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String type;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        DivInputValidatorTemplate divInputValidatorTemplate = entityTemplate instanceof DivInputValidatorTemplate ? (DivInputValidatorTemplate) entityTemplate : null;
        if (divInputValidatorTemplate != null && (type = divInputValidatorTemplate.getType()) != null) {
            readString = type;
        }
        if (Intrinsics.areEqual(readString, "regex")) {
            return new DivInputValidatorTemplate.Regex(((DivInputValidatorRegexJsonParser.TemplateParserImpl) this.component.getDivInputValidatorRegexJsonTemplateParser().getValue()).deserialize(parsingContext, (DivInputValidatorRegexTemplate) (divInputValidatorTemplate != null ? divInputValidatorTemplate.value() : null), jSONObject));
        }
        if (Intrinsics.areEqual(readString, "expression")) {
            return new DivInputValidatorTemplate.Expression(((DivInputValidatorExpressionJsonParser.TemplateParserImpl) this.component.getDivInputValidatorExpressionJsonTemplateParser().getValue()).deserialize(parsingContext, (DivInputValidatorExpressionTemplate) (divInputValidatorTemplate != null ? divInputValidatorTemplate.value() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivInputValidatorTemplate divInputValidatorTemplate) {
        if (divInputValidatorTemplate instanceof DivInputValidatorTemplate.Regex) {
            return ((DivInputValidatorRegexJsonParser.TemplateParserImpl) this.component.getDivInputValidatorRegexJsonTemplateParser().getValue()).serialize(parsingContext, ((DivInputValidatorTemplate.Regex) divInputValidatorTemplate).getValue());
        }
        if (divInputValidatorTemplate instanceof DivInputValidatorTemplate.Expression) {
            return ((DivInputValidatorExpressionJsonParser.TemplateParserImpl) this.component.getDivInputValidatorExpressionJsonTemplateParser().getValue()).serialize(parsingContext, ((DivInputValidatorTemplate.Expression) divInputValidatorTemplate).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
