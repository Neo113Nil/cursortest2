package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivTooltipMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivTooltipModeJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivTooltipModeJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivTooltipModeJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivTooltipMode deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        if (Intrinsics.areEqual(readString, "non_modal")) {
            return new DivTooltipMode.NonModal(((DivTooltipModeNonModalJsonParser$EntityParserImpl) this.component.getDivTooltipModeNonModalJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        if (Intrinsics.areEqual(readString, "modal")) {
            return new DivTooltipMode.Modal(((DivTooltipModeModalJsonParser$EntityParserImpl) this.component.getDivTooltipModeModalJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        DivTooltipModeTemplate divTooltipModeTemplate = orThrow instanceof DivTooltipModeTemplate ? (DivTooltipModeTemplate) orThrow : null;
        if (divTooltipModeTemplate != null) {
            return ((DivTooltipModeJsonParser$TemplateResolverImpl) this.component.getDivTooltipModeJsonTemplateResolver().getValue()).resolve(parsingContext, divTooltipModeTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivTooltipMode divTooltipMode) {
        if (divTooltipMode instanceof DivTooltipMode.NonModal) {
            return ((DivTooltipModeNonModalJsonParser$EntityParserImpl) this.component.getDivTooltipModeNonModalJsonEntityParser().getValue()).serialize(parsingContext, ((DivTooltipMode.NonModal) divTooltipMode).getValue());
        }
        if (divTooltipMode instanceof DivTooltipMode.Modal) {
            return ((DivTooltipModeModalJsonParser$EntityParserImpl) this.component.getDivTooltipModeModalJsonEntityParser().getValue()).serialize(parsingContext, ((DivTooltipMode.Modal) divTooltipMode).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
