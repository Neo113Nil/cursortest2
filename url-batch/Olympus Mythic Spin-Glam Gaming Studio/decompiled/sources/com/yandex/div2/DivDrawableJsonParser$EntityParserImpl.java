package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivDrawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivDrawableJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivDrawableJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivDrawableJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivDrawable deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(readString, "shape_drawable")) {
            return new DivDrawable.Shape(((DivShapeDrawableJsonParser$EntityParserImpl) this.component.getDivShapeDrawableJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        DivDrawableTemplate divDrawableTemplate = orThrow instanceof DivDrawableTemplate ? (DivDrawableTemplate) orThrow : null;
        if (divDrawableTemplate != null) {
            return ((DivDrawableJsonParser$TemplateResolverImpl) this.component.getDivDrawableJsonTemplateResolver().getValue()).resolve(parsingContext, divDrawableTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivDrawable divDrawable) {
        if (divDrawable instanceof DivDrawable.Shape) {
            return ((DivShapeDrawableJsonParser$EntityParserImpl) this.component.getDivShapeDrawableJsonEntityParser().getValue()).serialize(parsingContext, ((DivDrawable.Shape) divDrawable).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
