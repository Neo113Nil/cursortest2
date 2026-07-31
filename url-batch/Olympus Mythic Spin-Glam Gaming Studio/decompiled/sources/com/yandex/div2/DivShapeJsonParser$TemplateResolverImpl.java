package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivCircleShapeJsonParser;
import com.yandex.div2.DivRoundedRectangleShapeJsonParser;
import com.yandex.div2.DivShape;
import com.yandex.div2.DivShapeTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivShapeJsonParser.kt */
/* loaded from: classes3.dex */
public final class DivShapeJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivShapeJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivShape resolve(ParsingContext parsingContext, DivShapeTemplate divShapeTemplate, JSONObject jSONObject) {
        if (divShapeTemplate instanceof DivShapeTemplate.RoundedRectangle) {
            return new DivShape.RoundedRectangle(((DivRoundedRectangleShapeJsonParser.TemplateResolverImpl) this.component.getDivRoundedRectangleShapeJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivShapeTemplate.RoundedRectangle) divShapeTemplate).getValue(), jSONObject));
        }
        if (divShapeTemplate instanceof DivShapeTemplate.Circle) {
            return new DivShape.Circle(((DivCircleShapeJsonParser.TemplateResolverImpl) this.component.getDivCircleShapeJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivShapeTemplate.Circle) divShapeTemplate).getValue(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
