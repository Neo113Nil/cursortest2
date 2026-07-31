package com.yandex.div2;

import com.facebook.appevents.codeless.internal.Constants;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivRadialGradientCenterTemplate;
import com.yandex.div2.DivRadialGradientFixedCenterJsonParser;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivRadialGradientCenterJsonParser.kt */
/* loaded from: classes14.dex */
public final class DivRadialGradientCenterJsonParser$TemplateParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivRadialGradientCenterJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivRadialGradientCenterTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String type;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        DivRadialGradientCenterTemplate divRadialGradientCenterTemplate = entityTemplate instanceof DivRadialGradientCenterTemplate ? (DivRadialGradientCenterTemplate) entityTemplate : null;
        if (divRadialGradientCenterTemplate != null && (type = divRadialGradientCenterTemplate.getType()) != null) {
            readString = type;
        }
        if (Intrinsics.areEqual(readString, "fixed")) {
            return new DivRadialGradientCenterTemplate.Fixed(((DivRadialGradientFixedCenterJsonParser.TemplateParserImpl) this.component.getDivRadialGradientFixedCenterJsonTemplateParser().getValue()).deserialize(parsingContext, (DivRadialGradientFixedCenterTemplate) (divRadialGradientCenterTemplate != null ? divRadialGradientCenterTemplate.value() : null), jSONObject));
        }
        if (Intrinsics.areEqual(readString, Constants.PATH_TYPE_RELATIVE)) {
            return new DivRadialGradientCenterTemplate.Relative(((DivRadialGradientRelativeCenterJsonParser$TemplateParserImpl) this.component.getDivRadialGradientRelativeCenterJsonTemplateParser().getValue()).deserialize(parsingContext, (DivRadialGradientRelativeCenterTemplate) (divRadialGradientCenterTemplate != null ? divRadialGradientCenterTemplate.value() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivRadialGradientCenterTemplate divRadialGradientCenterTemplate) {
        if (divRadialGradientCenterTemplate instanceof DivRadialGradientCenterTemplate.Fixed) {
            return ((DivRadialGradientFixedCenterJsonParser.TemplateParserImpl) this.component.getDivRadialGradientFixedCenterJsonTemplateParser().getValue()).serialize(parsingContext, ((DivRadialGradientCenterTemplate.Fixed) divRadialGradientCenterTemplate).getValue());
        }
        if (divRadialGradientCenterTemplate instanceof DivRadialGradientCenterTemplate.Relative) {
            return ((DivRadialGradientRelativeCenterJsonParser$TemplateParserImpl) this.component.getDivRadialGradientRelativeCenterJsonTemplateParser().getValue()).serialize(parsingContext, ((DivRadialGradientCenterTemplate.Relative) divRadialGradientCenterTemplate).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
