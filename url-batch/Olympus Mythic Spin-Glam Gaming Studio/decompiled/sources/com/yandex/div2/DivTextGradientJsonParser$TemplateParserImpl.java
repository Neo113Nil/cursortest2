package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivLinearGradientJsonParser;
import com.yandex.div2.DivRadialGradientJsonParser;
import com.yandex.div2.DivTextGradientTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivTextGradientJsonParser.kt */
/* loaded from: classes14.dex */
public final class DivTextGradientJsonParser$TemplateParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivTextGradientJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivTextGradientTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String type;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        DivTextGradientTemplate divTextGradientTemplate = entityTemplate instanceof DivTextGradientTemplate ? (DivTextGradientTemplate) entityTemplate : null;
        if (divTextGradientTemplate != null && (type = divTextGradientTemplate.getType()) != null) {
            readString = type;
        }
        if (Intrinsics.areEqual(readString, "gradient")) {
            return new DivTextGradientTemplate.Linear(((DivLinearGradientJsonParser.TemplateParserImpl) this.component.getDivLinearGradientJsonTemplateParser().getValue()).deserialize(parsingContext, (DivLinearGradientTemplate) (divTextGradientTemplate != null ? divTextGradientTemplate.value() : null), jSONObject));
        }
        if (Intrinsics.areEqual(readString, "radial_gradient")) {
            return new DivTextGradientTemplate.Radial(((DivRadialGradientJsonParser.TemplateParserImpl) this.component.getDivRadialGradientJsonTemplateParser().getValue()).deserialize(parsingContext, (DivRadialGradientTemplate) (divTextGradientTemplate != null ? divTextGradientTemplate.value() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivTextGradientTemplate divTextGradientTemplate) {
        if (divTextGradientTemplate instanceof DivTextGradientTemplate.Linear) {
            return ((DivLinearGradientJsonParser.TemplateParserImpl) this.component.getDivLinearGradientJsonTemplateParser().getValue()).serialize(parsingContext, ((DivTextGradientTemplate.Linear) divTextGradientTemplate).getValue());
        }
        if (divTextGradientTemplate instanceof DivTextGradientTemplate.Radial) {
            return ((DivRadialGradientJsonParser.TemplateParserImpl) this.component.getDivRadialGradientJsonTemplateParser().getValue()).serialize(parsingContext, ((DivTextGradientTemplate.Radial) divTextGradientTemplate).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
