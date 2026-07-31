package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivDefaultIndicatorItemPlacementJsonParser;
import com.yandex.div2.DivIndicatorItemPlacement;
import com.yandex.div2.DivStretchIndicatorItemPlacementJsonParser;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivIndicatorItemPlacementJsonParser.kt */
/* loaded from: classes11.dex */
public final class DivIndicatorItemPlacementJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivIndicatorItemPlacementJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivIndicatorItemPlacement deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(readString, "default")) {
            return new DivIndicatorItemPlacement.Default(((DivDefaultIndicatorItemPlacementJsonParser.EntityParserImpl) this.component.getDivDefaultIndicatorItemPlacementJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(readString, "stretch")) {
            return new DivIndicatorItemPlacement.Stretch(((DivStretchIndicatorItemPlacementJsonParser.EntityParserImpl) this.component.getDivStretchIndicatorItemPlacementJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        DivIndicatorItemPlacementTemplate divIndicatorItemPlacementTemplate = orThrow instanceof DivIndicatorItemPlacementTemplate ? (DivIndicatorItemPlacementTemplate) orThrow : null;
        if (divIndicatorItemPlacementTemplate != null) {
            return ((DivIndicatorItemPlacementJsonParser$TemplateResolverImpl) this.component.getDivIndicatorItemPlacementJsonTemplateResolver().getValue()).resolve(parsingContext, divIndicatorItemPlacementTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivIndicatorItemPlacement divIndicatorItemPlacement) {
        if (divIndicatorItemPlacement instanceof DivIndicatorItemPlacement.Default) {
            return ((DivDefaultIndicatorItemPlacementJsonParser.EntityParserImpl) this.component.getDivDefaultIndicatorItemPlacementJsonEntityParser().getValue()).serialize(parsingContext, ((DivIndicatorItemPlacement.Default) divIndicatorItemPlacement).getValue());
        }
        if (divIndicatorItemPlacement instanceof DivIndicatorItemPlacement.Stretch) {
            return ((DivStretchIndicatorItemPlacementJsonParser.EntityParserImpl) this.component.getDivStretchIndicatorItemPlacementJsonEntityParser().getValue()).serialize(parsingContext, ((DivIndicatorItemPlacement.Stretch) divIndicatorItemPlacement).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
