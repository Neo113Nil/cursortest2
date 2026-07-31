package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivCloudBackgroundJsonParser;
import com.yandex.div2.DivTextRangeBackground;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivTextRangeBackgroundJsonParser.kt */
/* loaded from: classes11.dex */
public final class DivTextRangeBackgroundJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivTextRangeBackgroundJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivTextRangeBackground deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(readString, "solid")) {
            return new DivTextRangeBackground.Solid(((DivSolidBackgroundJsonParser$EntityParserImpl) this.component.getDivSolidBackgroundJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(readString, "cloud")) {
            return new DivTextRangeBackground.Cloud(((DivCloudBackgroundJsonParser.EntityParserImpl) this.component.getDivCloudBackgroundJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        DivTextRangeBackgroundTemplate divTextRangeBackgroundTemplate = orThrow instanceof DivTextRangeBackgroundTemplate ? (DivTextRangeBackgroundTemplate) orThrow : null;
        if (divTextRangeBackgroundTemplate != null) {
            return ((DivTextRangeBackgroundJsonParser$TemplateResolverImpl) this.component.getDivTextRangeBackgroundJsonTemplateResolver().getValue()).resolve(parsingContext, divTextRangeBackgroundTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivTextRangeBackground divTextRangeBackground) {
        if (divTextRangeBackground instanceof DivTextRangeBackground.Solid) {
            return ((DivSolidBackgroundJsonParser$EntityParserImpl) this.component.getDivSolidBackgroundJsonEntityParser().getValue()).serialize(parsingContext, ((DivTextRangeBackground.Solid) divTextRangeBackground).getValue());
        }
        if (divTextRangeBackground instanceof DivTextRangeBackground.Cloud) {
            return ((DivCloudBackgroundJsonParser.EntityParserImpl) this.component.getDivCloudBackgroundJsonEntityParser().getValue()).serialize(parsingContext, ((DivTextRangeBackground.Cloud) divTextRangeBackground).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
