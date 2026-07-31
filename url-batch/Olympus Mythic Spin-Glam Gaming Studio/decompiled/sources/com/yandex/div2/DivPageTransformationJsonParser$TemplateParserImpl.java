package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivPageTransformationOverlapJsonParser;
import com.yandex.div2.DivPageTransformationSlideJsonParser;
import com.yandex.div2.DivPageTransformationTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivPageTransformationJsonParser.kt */
/* loaded from: classes10.dex */
public final class DivPageTransformationJsonParser$TemplateParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivPageTransformationJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivPageTransformationTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String type;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        DivPageTransformationTemplate divPageTransformationTemplate = entityTemplate instanceof DivPageTransformationTemplate ? (DivPageTransformationTemplate) entityTemplate : null;
        if (divPageTransformationTemplate != null && (type = divPageTransformationTemplate.getType()) != null) {
            readString = type;
        }
        if (Intrinsics.areEqual(readString, "slide")) {
            return new DivPageTransformationTemplate.Slide(((DivPageTransformationSlideJsonParser.TemplateParserImpl) this.component.getDivPageTransformationSlideJsonTemplateParser().getValue()).deserialize(parsingContext, (DivPageTransformationSlideTemplate) (divPageTransformationTemplate != null ? divPageTransformationTemplate.value() : null), jSONObject));
        }
        if (Intrinsics.areEqual(readString, "overlap")) {
            return new DivPageTransformationTemplate.Overlap(((DivPageTransformationOverlapJsonParser.TemplateParserImpl) this.component.getDivPageTransformationOverlapJsonTemplateParser().getValue()).deserialize(parsingContext, (DivPageTransformationOverlapTemplate) (divPageTransformationTemplate != null ? divPageTransformationTemplate.value() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivPageTransformationTemplate divPageTransformationTemplate) {
        if (divPageTransformationTemplate instanceof DivPageTransformationTemplate.Slide) {
            return ((DivPageTransformationSlideJsonParser.TemplateParserImpl) this.component.getDivPageTransformationSlideJsonTemplateParser().getValue()).serialize(parsingContext, ((DivPageTransformationTemplate.Slide) divPageTransformationTemplate).getValue());
        }
        if (divPageTransformationTemplate instanceof DivPageTransformationTemplate.Overlap) {
            return ((DivPageTransformationOverlapJsonParser.TemplateParserImpl) this.component.getDivPageTransformationOverlapJsonTemplateParser().getValue()).serialize(parsingContext, ((DivPageTransformationTemplate.Overlap) divPageTransformationTemplate).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
