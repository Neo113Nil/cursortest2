package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivDrawableTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivDrawableJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivDrawableJsonParser$TemplateParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivDrawableJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivDrawableTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String type;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        DivDrawableTemplate divDrawableTemplate = entityTemplate instanceof DivDrawableTemplate ? (DivDrawableTemplate) entityTemplate : null;
        if (divDrawableTemplate != null && (type = divDrawableTemplate.getType()) != null) {
            readString = type;
        }
        if (Intrinsics.areEqual(readString, "shape_drawable")) {
            return new DivDrawableTemplate.Shape(((DivShapeDrawableJsonParser$TemplateParserImpl) this.component.getDivShapeDrawableJsonTemplateParser().getValue()).deserialize(parsingContext, (DivShapeDrawableTemplate) (divDrawableTemplate != null ? divDrawableTemplate.value() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivDrawableTemplate divDrawableTemplate) {
        if (divDrawableTemplate instanceof DivDrawableTemplate.Shape) {
            return ((DivShapeDrawableJsonParser$TemplateParserImpl) this.component.getDivShapeDrawableJsonTemplateParser().getValue()).serialize(parsingContext, ((DivDrawableTemplate.Shape) divDrawableTemplate).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
