package com.yandex.div2;

import com.facebook.appevents.codeless.internal.Constants;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivRadialGradientCenter;
import com.yandex.div2.DivRadialGradientFixedCenterJsonParser;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivRadialGradientCenterJsonParser.kt */
/* loaded from: classes9.dex */
public final class DivRadialGradientCenterJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivRadialGradientCenterJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivRadialGradientCenter deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(readString, "fixed")) {
            return new DivRadialGradientCenter.Fixed(((DivRadialGradientFixedCenterJsonParser.EntityParserImpl) this.component.getDivRadialGradientFixedCenterJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(readString, Constants.PATH_TYPE_RELATIVE)) {
            return new DivRadialGradientCenter.Relative(((DivRadialGradientRelativeCenterJsonParser$EntityParserImpl) this.component.getDivRadialGradientRelativeCenterJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        DivRadialGradientCenterTemplate divRadialGradientCenterTemplate = orThrow instanceof DivRadialGradientCenterTemplate ? (DivRadialGradientCenterTemplate) orThrow : null;
        if (divRadialGradientCenterTemplate != null) {
            return ((DivRadialGradientCenterJsonParser$TemplateResolverImpl) this.component.getDivRadialGradientCenterJsonTemplateResolver().getValue()).resolve(parsingContext, divRadialGradientCenterTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivRadialGradientCenter divRadialGradientCenter) {
        if (divRadialGradientCenter instanceof DivRadialGradientCenter.Fixed) {
            return ((DivRadialGradientFixedCenterJsonParser.EntityParserImpl) this.component.getDivRadialGradientFixedCenterJsonEntityParser().getValue()).serialize(parsingContext, ((DivRadialGradientCenter.Fixed) divRadialGradientCenter).getValue());
        }
        if (divRadialGradientCenter instanceof DivRadialGradientCenter.Relative) {
            return ((DivRadialGradientRelativeCenterJsonParser$EntityParserImpl) this.component.getDivRadialGradientRelativeCenterJsonEntityParser().getValue()).serialize(parsingContext, ((DivRadialGradientCenter.Relative) divRadialGradientCenter).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
