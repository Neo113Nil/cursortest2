package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivCount;
import com.yandex.div2.DivFixedCountJsonParser;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivCountJsonParser.kt */
/* loaded from: classes12.dex */
public final class DivCountJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivCountJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivCount deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(readString, "infinity")) {
            return new DivCount.Infinity(((DivInfinityCountJsonParser$EntityParserImpl) this.component.getDivInfinityCountJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(readString, "fixed")) {
            return new DivCount.Fixed(((DivFixedCountJsonParser.EntityParserImpl) this.component.getDivFixedCountJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        DivCountTemplate divCountTemplate = orThrow instanceof DivCountTemplate ? (DivCountTemplate) orThrow : null;
        if (divCountTemplate != null) {
            return ((DivCountJsonParser$TemplateResolverImpl) this.component.getDivCountJsonTemplateResolver().getValue()).resolve(parsingContext, divCountTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivCount divCount) {
        if (divCount instanceof DivCount.Infinity) {
            return ((DivInfinityCountJsonParser$EntityParserImpl) this.component.getDivInfinityCountJsonEntityParser().getValue()).serialize(parsingContext, ((DivCount.Infinity) divCount).getValue());
        }
        if (divCount instanceof DivCount.Fixed) {
            return ((DivFixedCountJsonParser.EntityParserImpl) this.component.getDivFixedCountJsonEntityParser().getValue()).serialize(parsingContext, ((DivCount.Fixed) divCount).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
