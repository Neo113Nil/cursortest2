package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivVariableTemplate;
import com.yandex.div2.PropertyVariableJsonParser;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivVariableJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivVariableJsonParser$TemplateParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivVariableJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
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
    public DivVariableTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String type;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        DivVariableTemplate divVariableTemplate = entityTemplate instanceof DivVariableTemplate ? (DivVariableTemplate) entityTemplate : null;
        if (divVariableTemplate != null && (type = divVariableTemplate.getType()) != null) {
            readString = type;
        }
        switch (readString.hashCode()) {
            case -1034364087:
                if (readString.equals("number")) {
                    return new DivVariableTemplate.Number(((NumberVariableJsonParser$TemplateParserImpl) this.component.getNumberVariableJsonTemplateParser().getValue()).deserialize(parsingContext, (NumberVariableTemplate) (divVariableTemplate != null ? divVariableTemplate.value() : null), jSONObject));
                }
                break;
            case -993141291:
                if (readString.equals("property")) {
                    return new DivVariableTemplate.Property(((PropertyVariableJsonParser.TemplateParserImpl) this.component.getPropertyVariableJsonTemplateParser().getValue()).deserialize(parsingContext, (PropertyVariableTemplate) (divVariableTemplate != null ? divVariableTemplate.value() : null), jSONObject));
                }
                break;
            case -891985903:
                if (readString.equals("string")) {
                    return new DivVariableTemplate.Str(((StrVariableJsonParser$TemplateParserImpl) this.component.getStrVariableJsonTemplateParser().getValue()).deserialize(parsingContext, (StrVariableTemplate) (divVariableTemplate != null ? divVariableTemplate.value() : null), jSONObject));
                }
                break;
            case 116079:
                if (readString.equals("url")) {
                    return new DivVariableTemplate.Url(((UrlVariableJsonParser$TemplateParserImpl) this.component.getUrlVariableJsonTemplateParser().getValue()).deserialize(parsingContext, (UrlVariableTemplate) (divVariableTemplate != null ? divVariableTemplate.value() : null), jSONObject));
                }
                break;
            case 3083190:
                if (readString.equals("dict")) {
                    return new DivVariableTemplate.Dict(((DictVariableJsonParser$TemplateParserImpl) this.component.getDictVariableJsonTemplateParser().getValue()).deserialize(parsingContext, (DictVariableTemplate) (divVariableTemplate != null ? divVariableTemplate.value() : null), jSONObject));
                }
                break;
            case 64711720:
                if (readString.equals("boolean")) {
                    return new DivVariableTemplate.Bool(((BoolVariableJsonParser$TemplateParserImpl) this.component.getBoolVariableJsonTemplateParser().getValue()).deserialize(parsingContext, (BoolVariableTemplate) (divVariableTemplate != null ? divVariableTemplate.value() : null), jSONObject));
                }
                break;
            case 93090393:
                if (readString.equals("array")) {
                    return new DivVariableTemplate.Array(((ArrayVariableJsonParser$TemplateParserImpl) this.component.getArrayVariableJsonTemplateParser().getValue()).deserialize(parsingContext, (ArrayVariableTemplate) (divVariableTemplate != null ? divVariableTemplate.value() : null), jSONObject));
                }
                break;
            case 94842723:
                if (readString.equals("color")) {
                    return new DivVariableTemplate.Color(((ColorVariableJsonParser$TemplateParserImpl) this.component.getColorVariableJsonTemplateParser().getValue()).deserialize(parsingContext, (ColorVariableTemplate) (divVariableTemplate != null ? divVariableTemplate.value() : null), jSONObject));
                }
                break;
            case 1958052158:
                if (readString.equals("integer")) {
                    return new DivVariableTemplate.Integer(((IntegerVariableJsonParser$TemplateParserImpl) this.component.getIntegerVariableJsonTemplateParser().getValue()).deserialize(parsingContext, (IntegerVariableTemplate) (divVariableTemplate != null ? divVariableTemplate.value() : null), jSONObject));
                }
                break;
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivVariableTemplate divVariableTemplate) {
        if (divVariableTemplate instanceof DivVariableTemplate.Str) {
            return ((StrVariableJsonParser$TemplateParserImpl) this.component.getStrVariableJsonTemplateParser().getValue()).serialize(parsingContext, ((DivVariableTemplate.Str) divVariableTemplate).getValue());
        }
        if (divVariableTemplate instanceof DivVariableTemplate.Number) {
            return ((NumberVariableJsonParser$TemplateParserImpl) this.component.getNumberVariableJsonTemplateParser().getValue()).serialize(parsingContext, ((DivVariableTemplate.Number) divVariableTemplate).getValue());
        }
        if (divVariableTemplate instanceof DivVariableTemplate.Integer) {
            return ((IntegerVariableJsonParser$TemplateParserImpl) this.component.getIntegerVariableJsonTemplateParser().getValue()).serialize(parsingContext, ((DivVariableTemplate.Integer) divVariableTemplate).getValue());
        }
        if (divVariableTemplate instanceof DivVariableTemplate.Bool) {
            return ((BoolVariableJsonParser$TemplateParserImpl) this.component.getBoolVariableJsonTemplateParser().getValue()).serialize(parsingContext, ((DivVariableTemplate.Bool) divVariableTemplate).getValue());
        }
        if (divVariableTemplate instanceof DivVariableTemplate.Color) {
            return ((ColorVariableJsonParser$TemplateParserImpl) this.component.getColorVariableJsonTemplateParser().getValue()).serialize(parsingContext, ((DivVariableTemplate.Color) divVariableTemplate).getValue());
        }
        if (divVariableTemplate instanceof DivVariableTemplate.Url) {
            return ((UrlVariableJsonParser$TemplateParserImpl) this.component.getUrlVariableJsonTemplateParser().getValue()).serialize(parsingContext, ((DivVariableTemplate.Url) divVariableTemplate).getValue());
        }
        if (divVariableTemplate instanceof DivVariableTemplate.Dict) {
            return ((DictVariableJsonParser$TemplateParserImpl) this.component.getDictVariableJsonTemplateParser().getValue()).serialize(parsingContext, ((DivVariableTemplate.Dict) divVariableTemplate).getValue());
        }
        if (divVariableTemplate instanceof DivVariableTemplate.Array) {
            return ((ArrayVariableJsonParser$TemplateParserImpl) this.component.getArrayVariableJsonTemplateParser().getValue()).serialize(parsingContext, ((DivVariableTemplate.Array) divVariableTemplate).getValue());
        }
        if (divVariableTemplate instanceof DivVariableTemplate.Property) {
            return ((PropertyVariableJsonParser.TemplateParserImpl) this.component.getPropertyVariableJsonTemplateParser().getValue()).serialize(parsingContext, ((DivVariableTemplate.Property) divVariableTemplate).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
