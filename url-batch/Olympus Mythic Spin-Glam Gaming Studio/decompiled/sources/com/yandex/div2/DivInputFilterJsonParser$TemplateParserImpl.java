package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivInputFilterTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivInputFilterJsonParser.kt */
/* loaded from: classes3.dex */
public final class DivInputFilterJsonParser$TemplateParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivInputFilterJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivInputFilterTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String type;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        DivInputFilterTemplate divInputFilterTemplate = entityTemplate instanceof DivInputFilterTemplate ? (DivInputFilterTemplate) entityTemplate : null;
        if (divInputFilterTemplate != null && (type = divInputFilterTemplate.getType()) != null) {
            readString = type;
        }
        if (Intrinsics.areEqual(readString, "regex")) {
            return new DivInputFilterTemplate.Regex(((DivInputFilterRegexJsonParser$TemplateParserImpl) this.component.getDivInputFilterRegexJsonTemplateParser().getValue()).deserialize(parsingContext, (DivInputFilterRegexTemplate) (divInputFilterTemplate != null ? divInputFilterTemplate.value() : null), jSONObject));
        }
        if (Intrinsics.areEqual(readString, "expression")) {
            return new DivInputFilterTemplate.Expression(((DivInputFilterExpressionJsonParser$TemplateParserImpl) this.component.getDivInputFilterExpressionJsonTemplateParser().getValue()).deserialize(parsingContext, (DivInputFilterExpressionTemplate) (divInputFilterTemplate != null ? divInputFilterTemplate.value() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivInputFilterTemplate divInputFilterTemplate) {
        if (divInputFilterTemplate instanceof DivInputFilterTemplate.Regex) {
            return ((DivInputFilterRegexJsonParser$TemplateParserImpl) this.component.getDivInputFilterRegexJsonTemplateParser().getValue()).serialize(parsingContext, ((DivInputFilterTemplate.Regex) divInputFilterTemplate).getValue());
        }
        if (divInputFilterTemplate instanceof DivInputFilterTemplate.Expression) {
            return ((DivInputFilterExpressionJsonParser$TemplateParserImpl) this.component.getDivInputFilterExpressionJsonTemplateParser().getValue()).serialize(parsingContext, ((DivInputFilterTemplate.Expression) divInputFilterTemplate).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
