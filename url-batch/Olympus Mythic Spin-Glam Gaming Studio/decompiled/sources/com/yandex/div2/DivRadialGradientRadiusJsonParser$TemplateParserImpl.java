package com.yandex.div2;

import com.facebook.appevents.codeless.internal.Constants;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivFixedSizeJsonParser;
import com.yandex.div2.DivRadialGradientRadiusTemplate;
import com.yandex.div2.DivRadialGradientRelativeRadiusJsonParser;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivRadialGradientRadiusJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivRadialGradientRadiusJsonParser$TemplateParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivRadialGradientRadiusJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivRadialGradientRadiusTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String type;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        DivRadialGradientRadiusTemplate divRadialGradientRadiusTemplate = entityTemplate instanceof DivRadialGradientRadiusTemplate ? (DivRadialGradientRadiusTemplate) entityTemplate : null;
        if (divRadialGradientRadiusTemplate != null && (type = divRadialGradientRadiusTemplate.getType()) != null) {
            readString = type;
        }
        if (Intrinsics.areEqual(readString, "fixed")) {
            return new DivRadialGradientRadiusTemplate.FixedSize(((DivFixedSizeJsonParser.TemplateParserImpl) this.component.getDivFixedSizeJsonTemplateParser().getValue()).deserialize(parsingContext, (DivFixedSizeTemplate) (divRadialGradientRadiusTemplate != null ? divRadialGradientRadiusTemplate.value() : null), jSONObject));
        }
        if (Intrinsics.areEqual(readString, Constants.PATH_TYPE_RELATIVE)) {
            return new DivRadialGradientRadiusTemplate.Relative(((DivRadialGradientRelativeRadiusJsonParser.TemplateParserImpl) this.component.getDivRadialGradientRelativeRadiusJsonTemplateParser().getValue()).deserialize(parsingContext, (DivRadialGradientRelativeRadiusTemplate) (divRadialGradientRadiusTemplate != null ? divRadialGradientRadiusTemplate.value() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivRadialGradientRadiusTemplate divRadialGradientRadiusTemplate) {
        if (divRadialGradientRadiusTemplate instanceof DivRadialGradientRadiusTemplate.FixedSize) {
            return ((DivFixedSizeJsonParser.TemplateParserImpl) this.component.getDivFixedSizeJsonTemplateParser().getValue()).serialize(parsingContext, ((DivRadialGradientRadiusTemplate.FixedSize) divRadialGradientRadiusTemplate).getValue());
        }
        if (divRadialGradientRadiusTemplate instanceof DivRadialGradientRadiusTemplate.Relative) {
            return ((DivRadialGradientRelativeRadiusJsonParser.TemplateParserImpl) this.component.getDivRadialGradientRelativeRadiusJsonTemplateParser().getValue()).serialize(parsingContext, ((DivRadialGradientRadiusTemplate.Relative) divRadialGradientRadiusTemplate).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
