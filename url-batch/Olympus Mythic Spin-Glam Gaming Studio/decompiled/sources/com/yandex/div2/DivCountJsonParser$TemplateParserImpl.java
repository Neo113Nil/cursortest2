package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivCountTemplate;
import com.yandex.div2.DivFixedCountJsonParser;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivCountJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivCountJsonParser$TemplateParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivCountJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivCountTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String type;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        DivCountTemplate divCountTemplate = entityTemplate instanceof DivCountTemplate ? (DivCountTemplate) entityTemplate : null;
        if (divCountTemplate != null && (type = divCountTemplate.getType()) != null) {
            readString = type;
        }
        if (Intrinsics.areEqual(readString, "infinity")) {
            return new DivCountTemplate.Infinity(((DivInfinityCountJsonParser$TemplateParserImpl) this.component.getDivInfinityCountJsonTemplateParser().getValue()).deserialize(parsingContext, (DivInfinityCountTemplate) (divCountTemplate != null ? divCountTemplate.value() : null), jSONObject));
        }
        if (Intrinsics.areEqual(readString, "fixed")) {
            return new DivCountTemplate.Fixed(((DivFixedCountJsonParser.TemplateParserImpl) this.component.getDivFixedCountJsonTemplateParser().getValue()).deserialize(parsingContext, (DivFixedCountTemplate) (divCountTemplate != null ? divCountTemplate.value() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivCountTemplate divCountTemplate) {
        if (divCountTemplate instanceof DivCountTemplate.Infinity) {
            return ((DivInfinityCountJsonParser$TemplateParserImpl) this.component.getDivInfinityCountJsonTemplateParser().getValue()).serialize(parsingContext, ((DivCountTemplate.Infinity) divCountTemplate).getValue());
        }
        if (divCountTemplate instanceof DivCountTemplate.Fixed) {
            return ((DivFixedCountJsonParser.TemplateParserImpl) this.component.getDivFixedCountJsonTemplateParser().getValue()).serialize(parsingContext, ((DivCountTemplate.Fixed) divCountTemplate).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
