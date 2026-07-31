package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivTypedValue;
import com.yandex.div2.DivTypedValueTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivTypedValueJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivTypedValueJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivTypedValueJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivTypedValue resolve(ParsingContext parsingContext, DivTypedValueTemplate divTypedValueTemplate, JSONObject jSONObject) {
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.Str) {
            return new DivTypedValue.Str(((StrValueJsonParser$TemplateResolverImpl) this.component.getStrValueJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivTypedValueTemplate.Str) divTypedValueTemplate).getValue(), jSONObject));
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.Integer) {
            return new DivTypedValue.Integer(((IntegerValueJsonParser$TemplateResolverImpl) this.component.getIntegerValueJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivTypedValueTemplate.Integer) divTypedValueTemplate).getValue(), jSONObject));
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.Number) {
            return new DivTypedValue.Number(((NumberValueJsonParser$TemplateResolverImpl) this.component.getNumberValueJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivTypedValueTemplate.Number) divTypedValueTemplate).getValue(), jSONObject));
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.Color) {
            return new DivTypedValue.Color(((ColorValueJsonParser$TemplateResolverImpl) this.component.getColorValueJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivTypedValueTemplate.Color) divTypedValueTemplate).getValue(), jSONObject));
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.Bool) {
            return new DivTypedValue.Bool(((BoolValueJsonParser$TemplateResolverImpl) this.component.getBoolValueJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivTypedValueTemplate.Bool) divTypedValueTemplate).getValue(), jSONObject));
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.Url) {
            return new DivTypedValue.Url(((UrlValueJsonParser$TemplateResolverImpl) this.component.getUrlValueJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivTypedValueTemplate.Url) divTypedValueTemplate).getValue(), jSONObject));
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.Dict) {
            return new DivTypedValue.Dict(((DictValueJsonParser$TemplateResolverImpl) this.component.getDictValueJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivTypedValueTemplate.Dict) divTypedValueTemplate).getValue(), jSONObject));
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.Array) {
            return new DivTypedValue.Array(((ArrayValueJsonParser$TemplateResolverImpl) this.component.getArrayValueJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivTypedValueTemplate.Array) divTypedValueTemplate).getValue(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
