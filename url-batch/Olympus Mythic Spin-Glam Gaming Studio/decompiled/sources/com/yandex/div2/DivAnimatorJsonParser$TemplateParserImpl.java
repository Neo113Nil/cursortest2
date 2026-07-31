package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivAnimatorTemplate;
import com.yandex.div2.DivColorAnimatorJsonParser;
import com.yandex.div2.DivNumberAnimatorJsonParser;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivAnimatorJsonParser.kt */
/* loaded from: classes11.dex */
public final class DivAnimatorJsonParser$TemplateParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivAnimatorJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivAnimatorTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String type;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        DivAnimatorTemplate divAnimatorTemplate = entityTemplate instanceof DivAnimatorTemplate ? (DivAnimatorTemplate) entityTemplate : null;
        if (divAnimatorTemplate != null && (type = divAnimatorTemplate.getType()) != null) {
            readString = type;
        }
        if (Intrinsics.areEqual(readString, "color_animator")) {
            return new DivAnimatorTemplate.Color(((DivColorAnimatorJsonParser.TemplateParserImpl) this.component.getDivColorAnimatorJsonTemplateParser().getValue()).deserialize(parsingContext, (DivColorAnimatorTemplate) (divAnimatorTemplate != null ? divAnimatorTemplate.value() : null), jSONObject));
        }
        if (Intrinsics.areEqual(readString, "number_animator")) {
            return new DivAnimatorTemplate.Number(((DivNumberAnimatorJsonParser.TemplateParserImpl) this.component.getDivNumberAnimatorJsonTemplateParser().getValue()).deserialize(parsingContext, (DivNumberAnimatorTemplate) (divAnimatorTemplate != null ? divAnimatorTemplate.value() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivAnimatorTemplate divAnimatorTemplate) {
        if (divAnimatorTemplate instanceof DivAnimatorTemplate.Color) {
            return ((DivColorAnimatorJsonParser.TemplateParserImpl) this.component.getDivColorAnimatorJsonTemplateParser().getValue()).serialize(parsingContext, ((DivAnimatorTemplate.Color) divAnimatorTemplate).getValue());
        }
        if (divAnimatorTemplate instanceof DivAnimatorTemplate.Number) {
            return ((DivNumberAnimatorJsonParser.TemplateParserImpl) this.component.getDivNumberAnimatorJsonTemplateParser().getValue()).serialize(parsingContext, ((DivAnimatorTemplate.Number) divAnimatorTemplate).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
