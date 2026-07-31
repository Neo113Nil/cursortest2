package com.yandex.div2;

import com.facebook.appevents.codeless.internal.Constants;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivFixedSizeJsonParser;
import com.yandex.div2.DivRadialGradientRadius;
import com.yandex.div2.DivRadialGradientRelativeRadiusJsonParser;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivRadialGradientRadiusJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivRadialGradientRadiusJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivRadialGradientRadiusJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivRadialGradientRadius deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(readString, "fixed")) {
            return new DivRadialGradientRadius.FixedSize(((DivFixedSizeJsonParser.EntityParserImpl) this.component.getDivFixedSizeJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(readString, Constants.PATH_TYPE_RELATIVE)) {
            return new DivRadialGradientRadius.Relative(((DivRadialGradientRelativeRadiusJsonParser.EntityParserImpl) this.component.getDivRadialGradientRelativeRadiusJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        DivRadialGradientRadiusTemplate divRadialGradientRadiusTemplate = orThrow instanceof DivRadialGradientRadiusTemplate ? (DivRadialGradientRadiusTemplate) orThrow : null;
        if (divRadialGradientRadiusTemplate != null) {
            return ((DivRadialGradientRadiusJsonParser$TemplateResolverImpl) this.component.getDivRadialGradientRadiusJsonTemplateResolver().getValue()).resolve(parsingContext, divRadialGradientRadiusTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivRadialGradientRadius divRadialGradientRadius) {
        if (divRadialGradientRadius instanceof DivRadialGradientRadius.FixedSize) {
            return ((DivFixedSizeJsonParser.EntityParserImpl) this.component.getDivFixedSizeJsonEntityParser().getValue()).serialize(parsingContext, ((DivRadialGradientRadius.FixedSize) divRadialGradientRadius).getValue());
        }
        if (divRadialGradientRadius instanceof DivRadialGradientRadius.Relative) {
            return ((DivRadialGradientRelativeRadiusJsonParser.EntityParserImpl) this.component.getDivRadialGradientRelativeRadiusJsonEntityParser().getValue()).serialize(parsingContext, ((DivRadialGradientRadius.Relative) divRadialGradientRadius).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
