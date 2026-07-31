package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivLinearGradientJsonParser;
import com.yandex.div2.DivRadialGradientJsonParser;
import com.yandex.div2.DivTextGradient;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivTextGradientJsonParser.kt */
/* loaded from: classes13.dex */
public final class DivTextGradientJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivTextGradientJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivTextGradient deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(readString, "gradient")) {
            return new DivTextGradient.Linear(((DivLinearGradientJsonParser.EntityParserImpl) this.component.getDivLinearGradientJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(readString, "radial_gradient")) {
            return new DivTextGradient.Radial(((DivRadialGradientJsonParser.EntityParserImpl) this.component.getDivRadialGradientJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        DivTextGradientTemplate divTextGradientTemplate = orThrow instanceof DivTextGradientTemplate ? (DivTextGradientTemplate) orThrow : null;
        if (divTextGradientTemplate != null) {
            return ((DivTextGradientJsonParser$TemplateResolverImpl) this.component.getDivTextGradientJsonTemplateResolver().getValue()).resolve(parsingContext, divTextGradientTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivTextGradient divTextGradient) {
        if (divTextGradient instanceof DivTextGradient.Linear) {
            return ((DivLinearGradientJsonParser.EntityParserImpl) this.component.getDivLinearGradientJsonEntityParser().getValue()).serialize(parsingContext, ((DivTextGradient.Linear) divTextGradient).getValue());
        }
        if (divTextGradient instanceof DivTextGradient.Radial) {
            return ((DivRadialGradientJsonParser.EntityParserImpl) this.component.getDivRadialGradientJsonEntityParser().getValue()).serialize(parsingContext, ((DivTextGradient.Radial) divTextGradient).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
