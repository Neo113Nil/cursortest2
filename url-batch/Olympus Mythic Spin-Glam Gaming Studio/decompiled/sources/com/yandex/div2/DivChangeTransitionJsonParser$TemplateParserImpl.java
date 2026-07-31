package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivChangeBoundsTransitionJsonParser;
import com.yandex.div2.DivChangeSetTransitionJsonParser;
import com.yandex.div2.DivChangeTransitionTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivChangeTransitionJsonParser.kt */
/* loaded from: classes13.dex */
public final class DivChangeTransitionJsonParser$TemplateParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivChangeTransitionJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivChangeTransitionTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String type;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        DivChangeTransitionTemplate divChangeTransitionTemplate = entityTemplate instanceof DivChangeTransitionTemplate ? (DivChangeTransitionTemplate) entityTemplate : null;
        if (divChangeTransitionTemplate != null && (type = divChangeTransitionTemplate.getType()) != null) {
            readString = type;
        }
        if (Intrinsics.areEqual(readString, "set")) {
            return new DivChangeTransitionTemplate.Set(((DivChangeSetTransitionJsonParser.TemplateParserImpl) this.component.getDivChangeSetTransitionJsonTemplateParser().getValue()).deserialize(parsingContext, (DivChangeSetTransitionTemplate) (divChangeTransitionTemplate != null ? divChangeTransitionTemplate.value() : null), jSONObject));
        }
        if (Intrinsics.areEqual(readString, "change_bounds")) {
            return new DivChangeTransitionTemplate.Bounds(((DivChangeBoundsTransitionJsonParser.TemplateParserImpl) this.component.getDivChangeBoundsTransitionJsonTemplateParser().getValue()).deserialize(parsingContext, (DivChangeBoundsTransitionTemplate) (divChangeTransitionTemplate != null ? divChangeTransitionTemplate.value() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivChangeTransitionTemplate divChangeTransitionTemplate) {
        if (divChangeTransitionTemplate instanceof DivChangeTransitionTemplate.Set) {
            return ((DivChangeSetTransitionJsonParser.TemplateParserImpl) this.component.getDivChangeSetTransitionJsonTemplateParser().getValue()).serialize(parsingContext, ((DivChangeTransitionTemplate.Set) divChangeTransitionTemplate).getValue());
        }
        if (divChangeTransitionTemplate instanceof DivChangeTransitionTemplate.Bounds) {
            return ((DivChangeBoundsTransitionJsonParser.TemplateParserImpl) this.component.getDivChangeBoundsTransitionJsonTemplateParser().getValue()).serialize(parsingContext, ((DivChangeTransitionTemplate.Bounds) divChangeTransitionTemplate).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
