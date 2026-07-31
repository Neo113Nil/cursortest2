package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivCircleShapeJsonParser;
import com.yandex.div2.DivRoundedRectangleShapeJsonParser;
import com.yandex.div2.DivShape;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivShapeJsonParser.kt */
/* loaded from: classes3.dex */
public final class DivShapeJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivShapeJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivShape deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(readString, "rounded_rectangle")) {
            return new DivShape.RoundedRectangle(((DivRoundedRectangleShapeJsonParser.EntityParserImpl) this.component.getDivRoundedRectangleShapeJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(readString, "circle")) {
            return new DivShape.Circle(((DivCircleShapeJsonParser.EntityParserImpl) this.component.getDivCircleShapeJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        DivShapeTemplate divShapeTemplate = orThrow instanceof DivShapeTemplate ? (DivShapeTemplate) orThrow : null;
        if (divShapeTemplate != null) {
            return ((DivShapeJsonParser$TemplateResolverImpl) this.component.getDivShapeJsonTemplateResolver().getValue()).resolve(parsingContext, divShapeTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivShape divShape) {
        if (divShape instanceof DivShape.RoundedRectangle) {
            return ((DivRoundedRectangleShapeJsonParser.EntityParserImpl) this.component.getDivRoundedRectangleShapeJsonEntityParser().getValue()).serialize(parsingContext, ((DivShape.RoundedRectangle) divShape).getValue());
        }
        if (divShape instanceof DivShape.Circle) {
            return ((DivCircleShapeJsonParser.EntityParserImpl) this.component.getDivCircleShapeJsonEntityParser().getValue()).serialize(parsingContext, ((DivShape.Circle) divShape).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
