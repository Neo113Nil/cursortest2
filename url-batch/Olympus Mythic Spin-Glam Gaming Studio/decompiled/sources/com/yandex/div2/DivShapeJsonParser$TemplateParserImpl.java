package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivCircleShapeJsonParser;
import com.yandex.div2.DivRoundedRectangleShapeJsonParser;
import com.yandex.div2.DivShapeTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivShapeJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivShapeJsonParser$TemplateParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivShapeJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivShapeTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String type;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        DivShapeTemplate divShapeTemplate = entityTemplate instanceof DivShapeTemplate ? (DivShapeTemplate) entityTemplate : null;
        if (divShapeTemplate != null && (type = divShapeTemplate.getType()) != null) {
            readString = type;
        }
        if (Intrinsics.areEqual(readString, "rounded_rectangle")) {
            return new DivShapeTemplate.RoundedRectangle(((DivRoundedRectangleShapeJsonParser.TemplateParserImpl) this.component.getDivRoundedRectangleShapeJsonTemplateParser().getValue()).deserialize(parsingContext, (DivRoundedRectangleShapeTemplate) (divShapeTemplate != null ? divShapeTemplate.value() : null), jSONObject));
        }
        if (Intrinsics.areEqual(readString, "circle")) {
            return new DivShapeTemplate.Circle(((DivCircleShapeJsonParser.TemplateParserImpl) this.component.getDivCircleShapeJsonTemplateParser().getValue()).deserialize(parsingContext, (DivCircleShapeTemplate) (divShapeTemplate != null ? divShapeTemplate.value() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivShapeTemplate divShapeTemplate) {
        if (divShapeTemplate instanceof DivShapeTemplate.RoundedRectangle) {
            return ((DivRoundedRectangleShapeJsonParser.TemplateParserImpl) this.component.getDivRoundedRectangleShapeJsonTemplateParser().getValue()).serialize(parsingContext, ((DivShapeTemplate.RoundedRectangle) divShapeTemplate).getValue());
        }
        if (divShapeTemplate instanceof DivShapeTemplate.Circle) {
            return ((DivCircleShapeJsonParser.TemplateParserImpl) this.component.getDivCircleShapeJsonTemplateParser().getValue()).serialize(parsingContext, ((DivShapeTemplate.Circle) divShapeTemplate).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
