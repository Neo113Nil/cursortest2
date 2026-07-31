package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivDrawable;
import com.yandex.div2.DivDrawableTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivDrawableJsonParser.kt */
/* loaded from: classes13.dex */
public final class DivDrawableJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivDrawableJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivDrawable resolve(ParsingContext parsingContext, DivDrawableTemplate divDrawableTemplate, JSONObject jSONObject) {
        if (divDrawableTemplate instanceof DivDrawableTemplate.Shape) {
            return new DivDrawable.Shape(((DivShapeDrawableJsonParser$TemplateResolverImpl) this.component.getDivShapeDrawableJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivDrawableTemplate.Shape) divDrawableTemplate).getValue(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
