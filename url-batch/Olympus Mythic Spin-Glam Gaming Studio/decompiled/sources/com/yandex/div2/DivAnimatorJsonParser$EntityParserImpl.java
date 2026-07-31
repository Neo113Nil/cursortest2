package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivAnimator;
import com.yandex.div2.DivColorAnimatorJsonParser;
import com.yandex.div2.DivNumberAnimatorJsonParser;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivAnimatorJsonParser.kt */
/* loaded from: classes9.dex */
public final class DivAnimatorJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivAnimatorJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivAnimator deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(readString, "color_animator")) {
            return new DivAnimator.Color(((DivColorAnimatorJsonParser.EntityParserImpl) this.component.getDivColorAnimatorJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(readString, "number_animator")) {
            return new DivAnimator.Number(((DivNumberAnimatorJsonParser.EntityParserImpl) this.component.getDivNumberAnimatorJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        DivAnimatorTemplate divAnimatorTemplate = orThrow instanceof DivAnimatorTemplate ? (DivAnimatorTemplate) orThrow : null;
        if (divAnimatorTemplate != null) {
            return ((DivAnimatorJsonParser$TemplateResolverImpl) this.component.getDivAnimatorJsonTemplateResolver().getValue()).resolve(parsingContext, divAnimatorTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivAnimator divAnimator) {
        if (divAnimator instanceof DivAnimator.Color) {
            return ((DivColorAnimatorJsonParser.EntityParserImpl) this.component.getDivColorAnimatorJsonEntityParser().getValue()).serialize(parsingContext, ((DivAnimator.Color) divAnimator).getValue());
        }
        if (divAnimator instanceof DivAnimator.Number) {
            return ((DivNumberAnimatorJsonParser.EntityParserImpl) this.component.getDivNumberAnimatorJsonEntityParser().getValue()).serialize(parsingContext, ((DivAnimator.Number) divAnimator).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
