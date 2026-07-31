package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivChangeBoundsTransitionJsonParser;
import com.yandex.div2.DivChangeSetTransitionJsonParser;
import com.yandex.div2.DivChangeTransition;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivChangeTransitionJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivChangeTransitionJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivChangeTransitionJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivChangeTransition deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(readString, "set")) {
            return new DivChangeTransition.Set(((DivChangeSetTransitionJsonParser.EntityParserImpl) this.component.getDivChangeSetTransitionJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(readString, "change_bounds")) {
            return new DivChangeTransition.Bounds(((DivChangeBoundsTransitionJsonParser.EntityParserImpl) this.component.getDivChangeBoundsTransitionJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        DivChangeTransitionTemplate divChangeTransitionTemplate = orThrow instanceof DivChangeTransitionTemplate ? (DivChangeTransitionTemplate) orThrow : null;
        if (divChangeTransitionTemplate != null) {
            return ((DivChangeTransitionJsonParser$TemplateResolverImpl) this.component.getDivChangeTransitionJsonTemplateResolver().getValue()).resolve(parsingContext, divChangeTransitionTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivChangeTransition divChangeTransition) {
        if (divChangeTransition instanceof DivChangeTransition.Set) {
            return ((DivChangeSetTransitionJsonParser.EntityParserImpl) this.component.getDivChangeSetTransitionJsonEntityParser().getValue()).serialize(parsingContext, ((DivChangeTransition.Set) divChangeTransition).getValue());
        }
        if (divChangeTransition instanceof DivChangeTransition.Bounds) {
            return ((DivChangeBoundsTransitionJsonParser.EntityParserImpl) this.component.getDivChangeBoundsTransitionJsonEntityParser().getValue()).serialize(parsingContext, ((DivChangeTransition.Bounds) divChangeTransition).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
