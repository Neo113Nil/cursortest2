package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivFixedSizeJsonParser;
import com.yandex.div2.DivMatchParentSizeJsonParser;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivSizeJsonParser.kt */
/* loaded from: classes11.dex */
public final class DivSizeJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivSizeJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivSize resolve(ParsingContext parsingContext, DivSizeTemplate divSizeTemplate, JSONObject jSONObject) {
        if (divSizeTemplate instanceof DivSizeTemplate.Fixed) {
            return new DivSize.Fixed(((DivFixedSizeJsonParser.TemplateResolverImpl) this.component.getDivFixedSizeJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivSizeTemplate.Fixed) divSizeTemplate).getValue(), jSONObject));
        }
        if (divSizeTemplate instanceof DivSizeTemplate.MatchParent) {
            return new DivSize.MatchParent(((DivMatchParentSizeJsonParser.TemplateResolverImpl) this.component.getDivMatchParentSizeJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivSizeTemplate.MatchParent) divSizeTemplate).getValue(), jSONObject));
        }
        if (divSizeTemplate instanceof DivSizeTemplate.WrapContent) {
            return new DivSize.WrapContent(((DivWrapContentSizeJsonParser$TemplateResolverImpl) this.component.getDivWrapContentSizeJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivSizeTemplate.WrapContent) divSizeTemplate).getValue(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
