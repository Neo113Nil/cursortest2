package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivBlurJsonParser;
import com.yandex.div2.DivFilter;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivFilterJsonParser.kt */
/* loaded from: classes3.dex */
public final class DivFilterJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivFilterJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivFilter deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(readString, "blur")) {
            return new DivFilter.Blur(((DivBlurJsonParser.EntityParserImpl) this.component.getDivBlurJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(readString, "rtl_mirror")) {
            return new DivFilter.RtlMirror(((DivFilterRtlMirrorJsonParser$EntityParserImpl) this.component.getDivFilterRtlMirrorJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        DivFilterTemplate divFilterTemplate = orThrow instanceof DivFilterTemplate ? (DivFilterTemplate) orThrow : null;
        if (divFilterTemplate != null) {
            return ((DivFilterJsonParser$TemplateResolverImpl) this.component.getDivFilterJsonTemplateResolver().getValue()).resolve(parsingContext, divFilterTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivFilter divFilter) {
        if (divFilter instanceof DivFilter.Blur) {
            return ((DivBlurJsonParser.EntityParserImpl) this.component.getDivBlurJsonEntityParser().getValue()).serialize(parsingContext, ((DivFilter.Blur) divFilter).getValue());
        }
        if (divFilter instanceof DivFilter.RtlMirror) {
            return ((DivFilterRtlMirrorJsonParser$EntityParserImpl) this.component.getDivFilterRtlMirrorJsonEntityParser().getValue()).serialize(parsingContext, ((DivFilter.RtlMirror) divFilter).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
