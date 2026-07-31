package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivTooltipMode;
import com.yandex.div2.DivTooltipModeTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivTooltipModeJsonParser.kt */
/* loaded from: classes3.dex */
public final class DivTooltipModeJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivTooltipModeJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivTooltipMode resolve(ParsingContext parsingContext, DivTooltipModeTemplate divTooltipModeTemplate, JSONObject jSONObject) {
        if (divTooltipModeTemplate instanceof DivTooltipModeTemplate.NonModal) {
            return new DivTooltipMode.NonModal(((DivTooltipModeNonModalJsonParser$TemplateResolverImpl) this.component.getDivTooltipModeNonModalJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivTooltipModeTemplate.NonModal) divTooltipModeTemplate).getValue(), jSONObject));
        }
        if (divTooltipModeTemplate instanceof DivTooltipModeTemplate.Modal) {
            return new DivTooltipMode.Modal(((DivTooltipModeModalJsonParser$TemplateResolverImpl) this.component.getDivTooltipModeModalJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivTooltipModeTemplate.Modal) divTooltipModeTemplate).getValue(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
