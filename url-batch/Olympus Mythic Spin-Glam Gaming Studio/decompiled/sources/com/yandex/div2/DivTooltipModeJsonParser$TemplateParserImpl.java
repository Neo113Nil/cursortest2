package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivTooltipModeTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivTooltipModeJsonParser.kt */
/* loaded from: classes8.dex */
public final class DivTooltipModeJsonParser$TemplateParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivTooltipModeJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    public DivTooltipModeTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String type;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        DivTooltipModeTemplate divTooltipModeTemplate = entityTemplate instanceof DivTooltipModeTemplate ? (DivTooltipModeTemplate) entityTemplate : null;
        if (divTooltipModeTemplate != null && (type = divTooltipModeTemplate.getType()) != null) {
            readString = type;
        }
        if (Intrinsics.areEqual(readString, "non_modal")) {
            return new DivTooltipModeTemplate.NonModal(((DivTooltipModeNonModalJsonParser$TemplateParserImpl) this.component.getDivTooltipModeNonModalJsonTemplateParser().getValue()).deserialize(parsingContext, (DivTooltipModeNonModalTemplate) (divTooltipModeTemplate != null ? divTooltipModeTemplate.value() : null), jSONObject));
        }
        if (Intrinsics.areEqual(readString, "modal")) {
            return new DivTooltipModeTemplate.Modal(((DivTooltipModeModalJsonParser$TemplateParserImpl) this.component.getDivTooltipModeModalJsonTemplateParser().getValue()).deserialize(parsingContext, (DivTooltipModeModalTemplate) (divTooltipModeTemplate != null ? divTooltipModeTemplate.value() : null), jSONObject));
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivTooltipModeTemplate divTooltipModeTemplate) {
        if (divTooltipModeTemplate instanceof DivTooltipModeTemplate.NonModal) {
            return ((DivTooltipModeNonModalJsonParser$TemplateParserImpl) this.component.getDivTooltipModeNonModalJsonTemplateParser().getValue()).serialize(parsingContext, ((DivTooltipModeTemplate.NonModal) divTooltipModeTemplate).getValue());
        }
        if (divTooltipModeTemplate instanceof DivTooltipModeTemplate.Modal) {
            return ((DivTooltipModeModalJsonParser$TemplateParserImpl) this.component.getDivTooltipModeModalJsonTemplateParser().getValue()).serialize(parsingContext, ((DivTooltipModeTemplate.Modal) divTooltipModeTemplate).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
