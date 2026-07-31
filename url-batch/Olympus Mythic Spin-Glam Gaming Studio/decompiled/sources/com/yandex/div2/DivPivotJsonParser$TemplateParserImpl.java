package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivPivotFixedJsonParser;
import com.yandex.div2.DivPivotTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivPivotJsonParser.kt */
/* loaded from: classes5.dex */
public final class DivPivotJsonParser$TemplateParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivPivotJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivPivotTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String type;
        String readOptionalString = JsonPropertyParser.readOptionalString(parsingContext, jSONObject, "type");
        if (readOptionalString == null) {
            readOptionalString = "pivot-fixed";
        }
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readOptionalString);
        DivPivotTemplate divPivotTemplate = entityTemplate instanceof DivPivotTemplate ? (DivPivotTemplate) entityTemplate : null;
        if (divPivotTemplate != null && (type = divPivotTemplate.getType()) != null) {
            readOptionalString = type;
        }
        if (Intrinsics.areEqual(readOptionalString, "pivot-fixed")) {
            return new DivPivotTemplate.Fixed(((DivPivotFixedJsonParser.TemplateParserImpl) this.component.getDivPivotFixedJsonTemplateParser().getValue()).deserialize(parsingContext, (DivPivotFixedTemplate) (divPivotTemplate != null ? divPivotTemplate.value() : null), jSONObject));
        }
        if (Intrinsics.areEqual(readOptionalString, "pivot-percentage")) {
            return new DivPivotTemplate.Percentage(((DivPivotPercentageJsonParser$TemplateParserImpl) this.component.getDivPivotPercentageJsonTemplateParser().getValue()).deserialize(parsingContext, (DivPivotPercentageTemplate) (divPivotTemplate != null ? divPivotTemplate.value() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readOptionalString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivPivotTemplate divPivotTemplate) {
        if (divPivotTemplate instanceof DivPivotTemplate.Fixed) {
            return ((DivPivotFixedJsonParser.TemplateParserImpl) this.component.getDivPivotFixedJsonTemplateParser().getValue()).serialize(parsingContext, ((DivPivotTemplate.Fixed) divPivotTemplate).getValue());
        }
        if (divPivotTemplate instanceof DivPivotTemplate.Percentage) {
            return ((DivPivotPercentageJsonParser$TemplateParserImpl) this.component.getDivPivotPercentageJsonTemplateParser().getValue()).serialize(parsingContext, ((DivPivotTemplate.Percentage) divPivotTemplate).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
