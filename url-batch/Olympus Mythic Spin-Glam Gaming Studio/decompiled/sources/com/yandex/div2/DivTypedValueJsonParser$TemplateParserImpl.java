package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivTypedValueTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivTypedValueJsonParser.kt */
/* loaded from: classes6.dex */
public final class DivTypedValueJsonParser$TemplateParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivTypedValueJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    @Override // com.yandex.div.serialization.Deserializer
    public DivTypedValueTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String type;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        DivTypedValueTemplate divTypedValueTemplate = entityTemplate instanceof DivTypedValueTemplate ? (DivTypedValueTemplate) entityTemplate : null;
        if (divTypedValueTemplate != null && (type = divTypedValueTemplate.getType()) != null) {
            readString = type;
        }
        switch (readString.hashCode()) {
            case -1034364087:
                if (readString.equals("number")) {
                    return new DivTypedValueTemplate.Number(((NumberValueJsonParser$TemplateParserImpl) this.component.getNumberValueJsonTemplateParser().getValue()).deserialize(parsingContext, (NumberValueTemplate) (divTypedValueTemplate != null ? divTypedValueTemplate.value() : null), jSONObject));
                }
                break;
            case -891985903:
                if (readString.equals("string")) {
                    return new DivTypedValueTemplate.Str(((StrValueJsonParser$TemplateParserImpl) this.component.getStrValueJsonTemplateParser().getValue()).deserialize(parsingContext, (StrValueTemplate) (divTypedValueTemplate != null ? divTypedValueTemplate.value() : null), jSONObject));
                }
                break;
            case 116079:
                if (readString.equals("url")) {
                    return new DivTypedValueTemplate.Url(((UrlValueJsonParser$TemplateParserImpl) this.component.getUrlValueJsonTemplateParser().getValue()).deserialize(parsingContext, (UrlValueTemplate) (divTypedValueTemplate != null ? divTypedValueTemplate.value() : null), jSONObject));
                }
                break;
            case 3083190:
                if (readString.equals("dict")) {
                    return new DivTypedValueTemplate.Dict(((DictValueJsonParser$TemplateParserImpl) this.component.getDictValueJsonTemplateParser().getValue()).deserialize(parsingContext, (DictValueTemplate) (divTypedValueTemplate != null ? divTypedValueTemplate.value() : null), jSONObject));
                }
                break;
            case 64711720:
                if (readString.equals("boolean")) {
                    return new DivTypedValueTemplate.Bool(((BoolValueJsonParser$TemplateParserImpl) this.component.getBoolValueJsonTemplateParser().getValue()).deserialize(parsingContext, (BoolValueTemplate) (divTypedValueTemplate != null ? divTypedValueTemplate.value() : null), jSONObject));
                }
                break;
            case 93090393:
                if (readString.equals("array")) {
                    return new DivTypedValueTemplate.Array(((ArrayValueJsonParser$TemplateParserImpl) this.component.getArrayValueJsonTemplateParser().getValue()).deserialize(parsingContext, (ArrayValueTemplate) (divTypedValueTemplate != null ? divTypedValueTemplate.value() : null), jSONObject));
                }
                break;
            case 94842723:
                if (readString.equals("color")) {
                    return new DivTypedValueTemplate.Color(((ColorValueJsonParser$TemplateParserImpl) this.component.getColorValueJsonTemplateParser().getValue()).deserialize(parsingContext, (ColorValueTemplate) (divTypedValueTemplate != null ? divTypedValueTemplate.value() : null), jSONObject));
                }
                break;
            case 1958052158:
                if (readString.equals("integer")) {
                    return new DivTypedValueTemplate.Integer(((IntegerValueJsonParser$TemplateParserImpl) this.component.getIntegerValueJsonTemplateParser().getValue()).deserialize(parsingContext, (IntegerValueTemplate) (divTypedValueTemplate != null ? divTypedValueTemplate.value() : null), jSONObject));
                }
                break;
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivTypedValueTemplate divTypedValueTemplate) {
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.Str) {
            return ((StrValueJsonParser$TemplateParserImpl) this.component.getStrValueJsonTemplateParser().getValue()).serialize(parsingContext, ((DivTypedValueTemplate.Str) divTypedValueTemplate).getValue());
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.Integer) {
            return ((IntegerValueJsonParser$TemplateParserImpl) this.component.getIntegerValueJsonTemplateParser().getValue()).serialize(parsingContext, ((DivTypedValueTemplate.Integer) divTypedValueTemplate).getValue());
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.Number) {
            return ((NumberValueJsonParser$TemplateParserImpl) this.component.getNumberValueJsonTemplateParser().getValue()).serialize(parsingContext, ((DivTypedValueTemplate.Number) divTypedValueTemplate).getValue());
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.Color) {
            return ((ColorValueJsonParser$TemplateParserImpl) this.component.getColorValueJsonTemplateParser().getValue()).serialize(parsingContext, ((DivTypedValueTemplate.Color) divTypedValueTemplate).getValue());
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.Bool) {
            return ((BoolValueJsonParser$TemplateParserImpl) this.component.getBoolValueJsonTemplateParser().getValue()).serialize(parsingContext, ((DivTypedValueTemplate.Bool) divTypedValueTemplate).getValue());
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.Url) {
            return ((UrlValueJsonParser$TemplateParserImpl) this.component.getUrlValueJsonTemplateParser().getValue()).serialize(parsingContext, ((DivTypedValueTemplate.Url) divTypedValueTemplate).getValue());
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.Dict) {
            return ((DictValueJsonParser$TemplateParserImpl) this.component.getDictValueJsonTemplateParser().getValue()).serialize(parsingContext, ((DivTypedValueTemplate.Dict) divTypedValueTemplate).getValue());
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.Array) {
            return ((ArrayValueJsonParser$TemplateParserImpl) this.component.getArrayValueJsonTemplateParser().getValue()).serialize(parsingContext, ((DivTypedValueTemplate.Array) divTypedValueTemplate).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
