package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivBlurJsonParser;
import com.yandex.div2.DivFilterTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivFilterJsonParser.kt */
/* loaded from: classes12.dex */
public final class DivFilterJsonParser$TemplateParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivFilterJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivFilterTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String type;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        DivFilterTemplate divFilterTemplate = entityTemplate instanceof DivFilterTemplate ? (DivFilterTemplate) entityTemplate : null;
        if (divFilterTemplate != null && (type = divFilterTemplate.getType()) != null) {
            readString = type;
        }
        if (Intrinsics.areEqual(readString, "blur")) {
            return new DivFilterTemplate.Blur(((DivBlurJsonParser.TemplateParserImpl) this.component.getDivBlurJsonTemplateParser().getValue()).deserialize(parsingContext, (DivBlurTemplate) (divFilterTemplate != null ? divFilterTemplate.value() : null), jSONObject));
        }
        if (Intrinsics.areEqual(readString, "rtl_mirror")) {
            return new DivFilterTemplate.RtlMirror(((DivFilterRtlMirrorJsonParser$TemplateParserImpl) this.component.getDivFilterRtlMirrorJsonTemplateParser().getValue()).deserialize(parsingContext, (DivFilterRtlMirrorTemplate) (divFilterTemplate != null ? divFilterTemplate.value() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivFilterTemplate divFilterTemplate) {
        if (divFilterTemplate instanceof DivFilterTemplate.Blur) {
            return ((DivBlurJsonParser.TemplateParserImpl) this.component.getDivBlurJsonTemplateParser().getValue()).serialize(parsingContext, ((DivFilterTemplate.Blur) divFilterTemplate).getValue());
        }
        if (divFilterTemplate instanceof DivFilterTemplate.RtlMirror) {
            return ((DivFilterRtlMirrorJsonParser$TemplateParserImpl) this.component.getDivFilterRtlMirrorJsonTemplateParser().getValue()).serialize(parsingContext, ((DivFilterTemplate.RtlMirror) divFilterTemplate).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
