package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivPivot;
import com.yandex.div2.DivPivotFixedJsonParser;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivPivotJsonParser.kt */
/* loaded from: classes8.dex */
public final class DivPivotJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivPivotJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivPivot deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String readOptionalString = JsonPropertyParser.readOptionalString(parsingContext, jSONObject, "type");
        if (readOptionalString == null) {
            readOptionalString = "pivot-fixed";
        }
        if (Intrinsics.areEqual(readOptionalString, "pivot-fixed")) {
            return new DivPivot.Fixed(((DivPivotFixedJsonParser.EntityParserImpl) this.component.getDivPivotFixedJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(readOptionalString, "pivot-percentage")) {
            return new DivPivot.Percentage(((DivPivotPercentageJsonParser$EntityParserImpl) this.component.getDivPivotPercentageJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readOptionalString, jSONObject);
        DivPivotTemplate divPivotTemplate = orThrow instanceof DivPivotTemplate ? (DivPivotTemplate) orThrow : null;
        if (divPivotTemplate != null) {
            return ((DivPivotJsonParser$TemplateResolverImpl) this.component.getDivPivotJsonTemplateResolver().getValue()).resolve(parsingContext, divPivotTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readOptionalString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivPivot divPivot) {
        if (divPivot instanceof DivPivot.Fixed) {
            return ((DivPivotFixedJsonParser.EntityParserImpl) this.component.getDivPivotFixedJsonEntityParser().getValue()).serialize(parsingContext, ((DivPivot.Fixed) divPivot).getValue());
        }
        if (divPivot instanceof DivPivot.Percentage) {
            return ((DivPivotPercentageJsonParser$EntityParserImpl) this.component.getDivPivotPercentageJsonEntityParser().getValue()).serialize(parsingContext, ((DivPivot.Percentage) divPivot).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
