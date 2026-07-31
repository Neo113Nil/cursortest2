package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivPageTransformation;
import com.yandex.div2.DivPageTransformationOverlapJsonParser;
import com.yandex.div2.DivPageTransformationSlideJsonParser;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivPageTransformationJsonParser.kt */
/* loaded from: classes15.dex */
public final class DivPageTransformationJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivPageTransformationJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivPageTransformation deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(readString, "slide")) {
            return new DivPageTransformation.Slide(((DivPageTransformationSlideJsonParser.EntityParserImpl) this.component.getDivPageTransformationSlideJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(readString, "overlap")) {
            return new DivPageTransformation.Overlap(((DivPageTransformationOverlapJsonParser.EntityParserImpl) this.component.getDivPageTransformationOverlapJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        DivPageTransformationTemplate divPageTransformationTemplate = orThrow instanceof DivPageTransformationTemplate ? (DivPageTransformationTemplate) orThrow : null;
        if (divPageTransformationTemplate != null) {
            return ((DivPageTransformationJsonParser$TemplateResolverImpl) this.component.getDivPageTransformationJsonTemplateResolver().getValue()).resolve(parsingContext, divPageTransformationTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivPageTransformation divPageTransformation) {
        if (divPageTransformation instanceof DivPageTransformation.Slide) {
            return ((DivPageTransformationSlideJsonParser.EntityParserImpl) this.component.getDivPageTransformationSlideJsonEntityParser().getValue()).serialize(parsingContext, ((DivPageTransformation.Slide) divPageTransformation).getValue());
        }
        if (divPageTransformation instanceof DivPageTransformation.Overlap) {
            return ((DivPageTransformationOverlapJsonParser.EntityParserImpl) this.component.getDivPageTransformationOverlapJsonEntityParser().getValue()).serialize(parsingContext, ((DivPageTransformation.Overlap) divPageTransformation).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
