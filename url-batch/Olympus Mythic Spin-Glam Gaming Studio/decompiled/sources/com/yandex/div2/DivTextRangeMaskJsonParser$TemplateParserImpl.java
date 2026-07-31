package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivTextRangeMaskParticlesJsonParser;
import com.yandex.div2.DivTextRangeMaskSolidJsonParser;
import com.yandex.div2.DivTextRangeMaskTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivTextRangeMaskJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivTextRangeMaskJsonParser$TemplateParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivTextRangeMaskJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivTextRangeMaskTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String type;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        DivTextRangeMaskTemplate divTextRangeMaskTemplate = entityTemplate instanceof DivTextRangeMaskTemplate ? (DivTextRangeMaskTemplate) entityTemplate : null;
        if (divTextRangeMaskTemplate != null && (type = divTextRangeMaskTemplate.getType()) != null) {
            readString = type;
        }
        if (Intrinsics.areEqual(readString, "particles")) {
            return new DivTextRangeMaskTemplate.Particles(((DivTextRangeMaskParticlesJsonParser.TemplateParserImpl) this.component.getDivTextRangeMaskParticlesJsonTemplateParser().getValue()).deserialize(parsingContext, (DivTextRangeMaskParticlesTemplate) (divTextRangeMaskTemplate != null ? divTextRangeMaskTemplate.value() : null), jSONObject));
        }
        if (Intrinsics.areEqual(readString, "solid")) {
            return new DivTextRangeMaskTemplate.Solid(((DivTextRangeMaskSolidJsonParser.TemplateParserImpl) this.component.getDivTextRangeMaskSolidJsonTemplateParser().getValue()).deserialize(parsingContext, (DivTextRangeMaskSolidTemplate) (divTextRangeMaskTemplate != null ? divTextRangeMaskTemplate.value() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivTextRangeMaskTemplate divTextRangeMaskTemplate) {
        if (divTextRangeMaskTemplate instanceof DivTextRangeMaskTemplate.Particles) {
            return ((DivTextRangeMaskParticlesJsonParser.TemplateParserImpl) this.component.getDivTextRangeMaskParticlesJsonTemplateParser().getValue()).serialize(parsingContext, ((DivTextRangeMaskTemplate.Particles) divTextRangeMaskTemplate).getValue());
        }
        if (divTextRangeMaskTemplate instanceof DivTextRangeMaskTemplate.Solid) {
            return ((DivTextRangeMaskSolidJsonParser.TemplateParserImpl) this.component.getDivTextRangeMaskSolidJsonTemplateParser().getValue()).serialize(parsingContext, ((DivTextRangeMaskTemplate.Solid) divTextRangeMaskTemplate).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
