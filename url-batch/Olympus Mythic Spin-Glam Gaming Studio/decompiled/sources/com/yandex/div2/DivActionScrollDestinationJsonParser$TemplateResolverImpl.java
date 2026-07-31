package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionScrollDestination;
import com.yandex.div2.DivActionScrollDestinationTemplate;
import com.yandex.div2.IndexDestinationJsonParser;
import com.yandex.div2.OffsetDestinationJsonParser;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivActionScrollDestinationJsonParser.kt */
/* loaded from: classes13.dex */
public final class DivActionScrollDestinationJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivActionScrollDestinationJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivActionScrollDestination resolve(ParsingContext parsingContext, DivActionScrollDestinationTemplate divActionScrollDestinationTemplate, JSONObject jSONObject) {
        if (divActionScrollDestinationTemplate instanceof DivActionScrollDestinationTemplate.Offset) {
            return new DivActionScrollDestination.Offset(((OffsetDestinationJsonParser.TemplateResolverImpl) this.component.getOffsetDestinationJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivActionScrollDestinationTemplate.Offset) divActionScrollDestinationTemplate).getValue(), jSONObject));
        }
        if (divActionScrollDestinationTemplate instanceof DivActionScrollDestinationTemplate.Index) {
            return new DivActionScrollDestination.Index(((IndexDestinationJsonParser.TemplateResolverImpl) this.component.getIndexDestinationJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivActionScrollDestinationTemplate.Index) divActionScrollDestinationTemplate).getValue(), jSONObject));
        }
        if (divActionScrollDestinationTemplate instanceof DivActionScrollDestinationTemplate.Start) {
            return new DivActionScrollDestination.Start(((StartDestinationJsonParser$TemplateResolverImpl) this.component.getStartDestinationJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivActionScrollDestinationTemplate.Start) divActionScrollDestinationTemplate).getValue(), jSONObject));
        }
        if (divActionScrollDestinationTemplate instanceof DivActionScrollDestinationTemplate.End) {
            return new DivActionScrollDestination.End(((EndDestinationJsonParser$TemplateResolverImpl) this.component.getEndDestinationJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivActionScrollDestinationTemplate.End) divActionScrollDestinationTemplate).getValue(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
