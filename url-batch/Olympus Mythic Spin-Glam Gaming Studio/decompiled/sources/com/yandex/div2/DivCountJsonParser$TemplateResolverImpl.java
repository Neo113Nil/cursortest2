package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivCount;
import com.yandex.div2.DivCountTemplate;
import com.yandex.div2.DivFixedCountJsonParser;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivCountJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivCountJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivCountJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivCount resolve(ParsingContext parsingContext, DivCountTemplate divCountTemplate, JSONObject jSONObject) {
        if (divCountTemplate instanceof DivCountTemplate.Infinity) {
            return new DivCount.Infinity(((DivInfinityCountJsonParser$TemplateResolverImpl) this.component.getDivInfinityCountJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivCountTemplate.Infinity) divCountTemplate).getValue(), jSONObject));
        }
        if (divCountTemplate instanceof DivCountTemplate.Fixed) {
            return new DivCount.Fixed(((DivFixedCountJsonParser.TemplateResolverImpl) this.component.getDivFixedCountJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivCountTemplate.Fixed) divCountTemplate).getValue(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
