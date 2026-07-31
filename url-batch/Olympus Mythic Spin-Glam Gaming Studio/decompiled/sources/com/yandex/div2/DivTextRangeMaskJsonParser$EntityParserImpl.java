package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivTextRangeMask;
import com.yandex.div2.DivTextRangeMaskParticlesJsonParser;
import com.yandex.div2.DivTextRangeMaskSolidJsonParser;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivTextRangeMaskJsonParser.kt */
/* loaded from: classes5.dex */
public final class DivTextRangeMaskJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivTextRangeMaskJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivTextRangeMask deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(readString, "particles")) {
            return new DivTextRangeMask.Particles(((DivTextRangeMaskParticlesJsonParser.EntityParserImpl) this.component.getDivTextRangeMaskParticlesJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(readString, "solid")) {
            return new DivTextRangeMask.Solid(((DivTextRangeMaskSolidJsonParser.EntityParserImpl) this.component.getDivTextRangeMaskSolidJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        DivTextRangeMaskTemplate divTextRangeMaskTemplate = orThrow instanceof DivTextRangeMaskTemplate ? (DivTextRangeMaskTemplate) orThrow : null;
        if (divTextRangeMaskTemplate != null) {
            return ((DivTextRangeMaskJsonParser$TemplateResolverImpl) this.component.getDivTextRangeMaskJsonTemplateResolver().getValue()).resolve(parsingContext, divTextRangeMaskTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivTextRangeMask divTextRangeMask) {
        if (divTextRangeMask instanceof DivTextRangeMask.Particles) {
            return ((DivTextRangeMaskParticlesJsonParser.EntityParserImpl) this.component.getDivTextRangeMaskParticlesJsonEntityParser().getValue()).serialize(parsingContext, ((DivTextRangeMask.Particles) divTextRangeMask).getValue());
        }
        if (divTextRangeMask instanceof DivTextRangeMask.Solid) {
            return ((DivTextRangeMaskSolidJsonParser.EntityParserImpl) this.component.getDivTextRangeMaskSolidJsonEntityParser().getValue()).serialize(parsingContext, ((DivTextRangeMask.Solid) divTextRangeMask).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
