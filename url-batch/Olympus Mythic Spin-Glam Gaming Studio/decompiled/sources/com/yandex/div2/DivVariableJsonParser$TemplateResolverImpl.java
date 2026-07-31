package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivVariable;
import com.yandex.div2.DivVariableTemplate;
import com.yandex.div2.PropertyVariableJsonParser;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivVariableJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivVariableJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivVariableJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivVariable resolve(ParsingContext parsingContext, DivVariableTemplate divVariableTemplate, JSONObject jSONObject) {
        if (divVariableTemplate instanceof DivVariableTemplate.Str) {
            return new DivVariable.Str(((StrVariableJsonParser$TemplateResolverImpl) this.component.getStrVariableJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivVariableTemplate.Str) divVariableTemplate).getValue(), jSONObject));
        }
        if (divVariableTemplate instanceof DivVariableTemplate.Number) {
            return new DivVariable.Number(((NumberVariableJsonParser$TemplateResolverImpl) this.component.getNumberVariableJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivVariableTemplate.Number) divVariableTemplate).getValue(), jSONObject));
        }
        if (divVariableTemplate instanceof DivVariableTemplate.Integer) {
            return new DivVariable.Integer(((IntegerVariableJsonParser$TemplateResolverImpl) this.component.getIntegerVariableJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivVariableTemplate.Integer) divVariableTemplate).getValue(), jSONObject));
        }
        if (divVariableTemplate instanceof DivVariableTemplate.Bool) {
            return new DivVariable.Bool(((BoolVariableJsonParser$TemplateResolverImpl) this.component.getBoolVariableJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivVariableTemplate.Bool) divVariableTemplate).getValue(), jSONObject));
        }
        if (divVariableTemplate instanceof DivVariableTemplate.Color) {
            return new DivVariable.Color(((ColorVariableJsonParser$TemplateResolverImpl) this.component.getColorVariableJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivVariableTemplate.Color) divVariableTemplate).getValue(), jSONObject));
        }
        if (divVariableTemplate instanceof DivVariableTemplate.Url) {
            return new DivVariable.Url(((UrlVariableJsonParser$TemplateResolverImpl) this.component.getUrlVariableJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivVariableTemplate.Url) divVariableTemplate).getValue(), jSONObject));
        }
        if (divVariableTemplate instanceof DivVariableTemplate.Dict) {
            return new DivVariable.Dict(((DictVariableJsonParser$TemplateResolverImpl) this.component.getDictVariableJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivVariableTemplate.Dict) divVariableTemplate).getValue(), jSONObject));
        }
        if (divVariableTemplate instanceof DivVariableTemplate.Array) {
            return new DivVariable.Array(((ArrayVariableJsonParser$TemplateResolverImpl) this.component.getArrayVariableJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivVariableTemplate.Array) divVariableTemplate).getValue(), jSONObject));
        }
        if (divVariableTemplate instanceof DivVariableTemplate.Property) {
            return new DivVariable.Property(((PropertyVariableJsonParser.TemplateResolverImpl) this.component.getPropertyVariableJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivVariableTemplate.Property) divVariableTemplate).getValue(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
