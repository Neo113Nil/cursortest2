package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivChangeBoundsTransitionJsonParser;
import com.yandex.div2.DivChangeSetTransitionJsonParser;
import com.yandex.div2.DivChangeTransition;
import com.yandex.div2.DivChangeTransitionTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivChangeTransitionJsonParser.kt */
/* loaded from: classes3.dex */
public final class DivChangeTransitionJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivChangeTransitionJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivChangeTransition resolve(ParsingContext parsingContext, DivChangeTransitionTemplate divChangeTransitionTemplate, JSONObject jSONObject) {
        if (divChangeTransitionTemplate instanceof DivChangeTransitionTemplate.Set) {
            return new DivChangeTransition.Set(((DivChangeSetTransitionJsonParser.TemplateResolverImpl) this.component.getDivChangeSetTransitionJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivChangeTransitionTemplate.Set) divChangeTransitionTemplate).getValue(), jSONObject));
        }
        if (divChangeTransitionTemplate instanceof DivChangeTransitionTemplate.Bounds) {
            return new DivChangeTransition.Bounds(((DivChangeBoundsTransitionJsonParser.TemplateResolverImpl) this.component.getDivChangeBoundsTransitionJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivChangeTransitionTemplate.Bounds) divChangeTransitionTemplate).getValue(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
