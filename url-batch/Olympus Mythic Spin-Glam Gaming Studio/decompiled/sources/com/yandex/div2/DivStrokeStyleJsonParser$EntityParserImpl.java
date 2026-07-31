package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivStrokeStyle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivStrokeStyleJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivStrokeStyleJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivStrokeStyleJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivStrokeStyle deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(readString, "solid")) {
            return new DivStrokeStyle.Solid(((DivStrokeStyleSolidJsonParser$EntityParserImpl) this.component.getDivStrokeStyleSolidJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(readString, "dashed")) {
            return new DivStrokeStyle.Dashed(((DivStrokeStyleDashedJsonParser$EntityParserImpl) this.component.getDivStrokeStyleDashedJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        DivStrokeStyleTemplate divStrokeStyleTemplate = orThrow instanceof DivStrokeStyleTemplate ? (DivStrokeStyleTemplate) orThrow : null;
        if (divStrokeStyleTemplate != null) {
            return ((DivStrokeStyleJsonParser$TemplateResolverImpl) this.component.getDivStrokeStyleJsonTemplateResolver().getValue()).resolve(parsingContext, divStrokeStyleTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivStrokeStyle divStrokeStyle) {
        if (divStrokeStyle instanceof DivStrokeStyle.Solid) {
            return ((DivStrokeStyleSolidJsonParser$EntityParserImpl) this.component.getDivStrokeStyleSolidJsonEntityParser().getValue()).serialize(parsingContext, ((DivStrokeStyle.Solid) divStrokeStyle).getValue());
        }
        if (divStrokeStyle instanceof DivStrokeStyle.Dashed) {
            return ((DivStrokeStyleDashedJsonParser$EntityParserImpl) this.component.getDivStrokeStyleDashedJsonEntityParser().getValue()).serialize(parsingContext, ((DivStrokeStyle.Dashed) divStrokeStyle).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
