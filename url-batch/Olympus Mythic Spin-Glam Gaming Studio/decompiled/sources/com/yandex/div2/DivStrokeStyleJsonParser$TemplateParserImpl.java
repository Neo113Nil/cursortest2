package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivStrokeStyleTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivStrokeStyleJsonParser.kt */
/* loaded from: classes5.dex */
public final class DivStrokeStyleJsonParser$TemplateParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivStrokeStyleJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivStrokeStyleTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String type;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        DivStrokeStyleTemplate divStrokeStyleTemplate = entityTemplate instanceof DivStrokeStyleTemplate ? (DivStrokeStyleTemplate) entityTemplate : null;
        if (divStrokeStyleTemplate != null && (type = divStrokeStyleTemplate.getType()) != null) {
            readString = type;
        }
        if (Intrinsics.areEqual(readString, "solid")) {
            return new DivStrokeStyleTemplate.Solid(((DivStrokeStyleSolidJsonParser$TemplateParserImpl) this.component.getDivStrokeStyleSolidJsonTemplateParser().getValue()).deserialize(parsingContext, (DivStrokeStyleSolidTemplate) (divStrokeStyleTemplate != null ? divStrokeStyleTemplate.value() : null), jSONObject));
        }
        if (Intrinsics.areEqual(readString, "dashed")) {
            return new DivStrokeStyleTemplate.Dashed(((DivStrokeStyleDashedJsonParser$TemplateParserImpl) this.component.getDivStrokeStyleDashedJsonTemplateParser().getValue()).deserialize(parsingContext, (DivStrokeStyleDashedTemplate) (divStrokeStyleTemplate != null ? divStrokeStyleTemplate.value() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivStrokeStyleTemplate divStrokeStyleTemplate) {
        if (divStrokeStyleTemplate instanceof DivStrokeStyleTemplate.Solid) {
            return ((DivStrokeStyleSolidJsonParser$TemplateParserImpl) this.component.getDivStrokeStyleSolidJsonTemplateParser().getValue()).serialize(parsingContext, ((DivStrokeStyleTemplate.Solid) divStrokeStyleTemplate).getValue());
        }
        if (divStrokeStyleTemplate instanceof DivStrokeStyleTemplate.Dashed) {
            return ((DivStrokeStyleDashedJsonParser$TemplateParserImpl) this.component.getDivStrokeStyleDashedJsonTemplateParser().getValue()).serialize(parsingContext, ((DivStrokeStyleTemplate.Dashed) divStrokeStyleTemplate).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
