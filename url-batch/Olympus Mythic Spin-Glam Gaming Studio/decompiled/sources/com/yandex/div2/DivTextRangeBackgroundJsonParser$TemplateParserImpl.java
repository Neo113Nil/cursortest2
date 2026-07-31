package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivCloudBackgroundJsonParser;
import com.yandex.div2.DivTextRangeBackgroundTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivTextRangeBackgroundJsonParser.kt */
/* loaded from: classes3.dex */
public final class DivTextRangeBackgroundJsonParser$TemplateParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivTextRangeBackgroundJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivTextRangeBackgroundTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String type;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        DivTextRangeBackgroundTemplate divTextRangeBackgroundTemplate = entityTemplate instanceof DivTextRangeBackgroundTemplate ? (DivTextRangeBackgroundTemplate) entityTemplate : null;
        if (divTextRangeBackgroundTemplate != null && (type = divTextRangeBackgroundTemplate.getType()) != null) {
            readString = type;
        }
        if (Intrinsics.areEqual(readString, "solid")) {
            return new DivTextRangeBackgroundTemplate.Solid(((DivSolidBackgroundJsonParser$TemplateParserImpl) this.component.getDivSolidBackgroundJsonTemplateParser().getValue()).deserialize(parsingContext, (DivSolidBackgroundTemplate) (divTextRangeBackgroundTemplate != null ? divTextRangeBackgroundTemplate.value() : null), jSONObject));
        }
        if (Intrinsics.areEqual(readString, "cloud")) {
            return new DivTextRangeBackgroundTemplate.Cloud(((DivCloudBackgroundJsonParser.TemplateParserImpl) this.component.getDivCloudBackgroundJsonTemplateParser().getValue()).deserialize(parsingContext, (DivCloudBackgroundTemplate) (divTextRangeBackgroundTemplate != null ? divTextRangeBackgroundTemplate.value() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivTextRangeBackgroundTemplate divTextRangeBackgroundTemplate) {
        if (divTextRangeBackgroundTemplate instanceof DivTextRangeBackgroundTemplate.Solid) {
            return ((DivSolidBackgroundJsonParser$TemplateParserImpl) this.component.getDivSolidBackgroundJsonTemplateParser().getValue()).serialize(parsingContext, ((DivTextRangeBackgroundTemplate.Solid) divTextRangeBackgroundTemplate).getValue());
        }
        if (divTextRangeBackgroundTemplate instanceof DivTextRangeBackgroundTemplate.Cloud) {
            return ((DivCloudBackgroundJsonParser.TemplateParserImpl) this.component.getDivCloudBackgroundJsonTemplateParser().getValue()).serialize(parsingContext, ((DivTextRangeBackgroundTemplate.Cloud) divTextRangeBackgroundTemplate).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
