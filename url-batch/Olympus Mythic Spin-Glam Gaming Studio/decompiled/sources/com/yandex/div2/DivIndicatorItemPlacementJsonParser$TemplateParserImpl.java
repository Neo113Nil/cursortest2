package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivDefaultIndicatorItemPlacementJsonParser;
import com.yandex.div2.DivIndicatorItemPlacementTemplate;
import com.yandex.div2.DivStretchIndicatorItemPlacementJsonParser;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivIndicatorItemPlacementJsonParser.kt */
/* loaded from: classes8.dex */
public final class DivIndicatorItemPlacementJsonParser$TemplateParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivIndicatorItemPlacementJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivIndicatorItemPlacementTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String type;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        DivIndicatorItemPlacementTemplate divIndicatorItemPlacementTemplate = entityTemplate instanceof DivIndicatorItemPlacementTemplate ? (DivIndicatorItemPlacementTemplate) entityTemplate : null;
        if (divIndicatorItemPlacementTemplate != null && (type = divIndicatorItemPlacementTemplate.getType()) != null) {
            readString = type;
        }
        if (Intrinsics.areEqual(readString, "default")) {
            return new DivIndicatorItemPlacementTemplate.Default(((DivDefaultIndicatorItemPlacementJsonParser.TemplateParserImpl) this.component.getDivDefaultIndicatorItemPlacementJsonTemplateParser().getValue()).deserialize(parsingContext, (DivDefaultIndicatorItemPlacementTemplate) (divIndicatorItemPlacementTemplate != null ? divIndicatorItemPlacementTemplate.value() : null), jSONObject));
        }
        if (Intrinsics.areEqual(readString, "stretch")) {
            return new DivIndicatorItemPlacementTemplate.Stretch(((DivStretchIndicatorItemPlacementJsonParser.TemplateParserImpl) this.component.getDivStretchIndicatorItemPlacementJsonTemplateParser().getValue()).deserialize(parsingContext, (DivStretchIndicatorItemPlacementTemplate) (divIndicatorItemPlacementTemplate != null ? divIndicatorItemPlacementTemplate.value() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivIndicatorItemPlacementTemplate divIndicatorItemPlacementTemplate) {
        if (divIndicatorItemPlacementTemplate instanceof DivIndicatorItemPlacementTemplate.Default) {
            return ((DivDefaultIndicatorItemPlacementJsonParser.TemplateParserImpl) this.component.getDivDefaultIndicatorItemPlacementJsonTemplateParser().getValue()).serialize(parsingContext, ((DivIndicatorItemPlacementTemplate.Default) divIndicatorItemPlacementTemplate).getValue());
        }
        if (divIndicatorItemPlacementTemplate instanceof DivIndicatorItemPlacementTemplate.Stretch) {
            return ((DivStretchIndicatorItemPlacementJsonParser.TemplateParserImpl) this.component.getDivStretchIndicatorItemPlacementJsonTemplateParser().getValue()).serialize(parsingContext, ((DivIndicatorItemPlacementTemplate.Stretch) divIndicatorItemPlacementTemplate).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
