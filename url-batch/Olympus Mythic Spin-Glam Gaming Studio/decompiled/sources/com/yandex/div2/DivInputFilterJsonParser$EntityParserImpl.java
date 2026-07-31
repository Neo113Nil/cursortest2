package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivInputFilter;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivInputFilterJsonParser.kt */
/* loaded from: classes9.dex */
public final class DivInputFilterJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivInputFilterJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivInputFilter deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(readString, "regex")) {
            return new DivInputFilter.Regex(((DivInputFilterRegexJsonParser$EntityParserImpl) this.component.getDivInputFilterRegexJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(readString, "expression")) {
            return new DivInputFilter.Expression(((DivInputFilterExpressionJsonParser$EntityParserImpl) this.component.getDivInputFilterExpressionJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        DivInputFilterTemplate divInputFilterTemplate = orThrow instanceof DivInputFilterTemplate ? (DivInputFilterTemplate) orThrow : null;
        if (divInputFilterTemplate != null) {
            return ((DivInputFilterJsonParser$TemplateResolverImpl) this.component.getDivInputFilterJsonTemplateResolver().getValue()).resolve(parsingContext, divInputFilterTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivInputFilter divInputFilter) {
        if (divInputFilter instanceof DivInputFilter.Regex) {
            return ((DivInputFilterRegexJsonParser$EntityParserImpl) this.component.getDivInputFilterRegexJsonEntityParser().getValue()).serialize(parsingContext, ((DivInputFilter.Regex) divInputFilter).getValue());
        }
        if (divInputFilter instanceof DivInputFilter.Expression) {
            return ((DivInputFilterExpressionJsonParser$EntityParserImpl) this.component.getDivInputFilterExpressionJsonEntityParser().getValue()).serialize(parsingContext, ((DivInputFilter.Expression) divInputFilter).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
