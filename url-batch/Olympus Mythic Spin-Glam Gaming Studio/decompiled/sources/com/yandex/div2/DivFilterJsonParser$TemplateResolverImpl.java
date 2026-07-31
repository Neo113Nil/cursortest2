package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivBlurJsonParser;
import com.yandex.div2.DivFilter;
import com.yandex.div2.DivFilterTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivFilterJsonParser.kt */
/* loaded from: classes10.dex */
public final class DivFilterJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivFilterJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivFilter resolve(ParsingContext parsingContext, DivFilterTemplate divFilterTemplate, JSONObject jSONObject) {
        if (divFilterTemplate instanceof DivFilterTemplate.Blur) {
            return new DivFilter.Blur(((DivBlurJsonParser.TemplateResolverImpl) this.component.getDivBlurJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivFilterTemplate.Blur) divFilterTemplate).getValue(), jSONObject));
        }
        if (divFilterTemplate instanceof DivFilterTemplate.RtlMirror) {
            return new DivFilter.RtlMirror(((DivFilterRtlMirrorJsonParser$TemplateResolverImpl) this.component.getDivFilterRtlMirrorJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivFilterTemplate.RtlMirror) divFilterTemplate).getValue(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
