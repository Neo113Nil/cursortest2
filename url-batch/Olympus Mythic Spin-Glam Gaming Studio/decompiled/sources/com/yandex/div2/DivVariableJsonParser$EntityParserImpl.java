package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivVariable;
import com.yandex.div2.PropertyVariableJsonParser;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivVariableJsonParser.kt */
/* loaded from: classes3.dex */
public final class DivVariableJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivVariableJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
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
    public DivVariable deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        switch (readString.hashCode()) {
            case -1034364087:
                if (readString.equals("number")) {
                    return new DivVariable.Number(((NumberVariableJsonParser$EntityParserImpl) this.component.getNumberVariableJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -993141291:
                if (readString.equals("property")) {
                    return new DivVariable.Property(((PropertyVariableJsonParser.EntityParserImpl) this.component.getPropertyVariableJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -891985903:
                if (readString.equals("string")) {
                    return new DivVariable.Str(((StrVariableJsonParser$EntityParserImpl) this.component.getStrVariableJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 116079:
                if (readString.equals("url")) {
                    return new DivVariable.Url(((UrlVariableJsonParser$EntityParserImpl) this.component.getUrlVariableJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 3083190:
                if (readString.equals("dict")) {
                    return new DivVariable.Dict(((DictVariableJsonParser$EntityParserImpl) this.component.getDictVariableJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 64711720:
                if (readString.equals("boolean")) {
                    return new DivVariable.Bool(((BoolVariableJsonParser$EntityParserImpl) this.component.getBoolVariableJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 93090393:
                if (readString.equals("array")) {
                    return new DivVariable.Array(((ArrayVariableJsonParser$EntityParserImpl) this.component.getArrayVariableJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 94842723:
                if (readString.equals("color")) {
                    return new DivVariable.Color(((ColorVariableJsonParser$EntityParserImpl) this.component.getColorVariableJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 1958052158:
                if (readString.equals("integer")) {
                    return new DivVariable.Integer(((IntegerVariableJsonParser$EntityParserImpl) this.component.getIntegerVariableJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        DivVariableTemplate divVariableTemplate = orThrow instanceof DivVariableTemplate ? (DivVariableTemplate) orThrow : null;
        if (divVariableTemplate != null) {
            return ((DivVariableJsonParser$TemplateResolverImpl) this.component.getDivVariableJsonTemplateResolver().getValue()).resolve(parsingContext, divVariableTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivVariable divVariable) {
        if (divVariable instanceof DivVariable.Str) {
            return ((StrVariableJsonParser$EntityParserImpl) this.component.getStrVariableJsonEntityParser().getValue()).serialize(parsingContext, ((DivVariable.Str) divVariable).getValue());
        }
        if (divVariable instanceof DivVariable.Number) {
            return ((NumberVariableJsonParser$EntityParserImpl) this.component.getNumberVariableJsonEntityParser().getValue()).serialize(parsingContext, ((DivVariable.Number) divVariable).getValue());
        }
        if (divVariable instanceof DivVariable.Integer) {
            return ((IntegerVariableJsonParser$EntityParserImpl) this.component.getIntegerVariableJsonEntityParser().getValue()).serialize(parsingContext, ((DivVariable.Integer) divVariable).getValue());
        }
        if (divVariable instanceof DivVariable.Bool) {
            return ((BoolVariableJsonParser$EntityParserImpl) this.component.getBoolVariableJsonEntityParser().getValue()).serialize(parsingContext, ((DivVariable.Bool) divVariable).getValue());
        }
        if (divVariable instanceof DivVariable.Color) {
            return ((ColorVariableJsonParser$EntityParserImpl) this.component.getColorVariableJsonEntityParser().getValue()).serialize(parsingContext, ((DivVariable.Color) divVariable).getValue());
        }
        if (divVariable instanceof DivVariable.Url) {
            return ((UrlVariableJsonParser$EntityParserImpl) this.component.getUrlVariableJsonEntityParser().getValue()).serialize(parsingContext, ((DivVariable.Url) divVariable).getValue());
        }
        if (divVariable instanceof DivVariable.Dict) {
            return ((DictVariableJsonParser$EntityParserImpl) this.component.getDictVariableJsonEntityParser().getValue()).serialize(parsingContext, ((DivVariable.Dict) divVariable).getValue());
        }
        if (divVariable instanceof DivVariable.Array) {
            return ((ArrayVariableJsonParser$EntityParserImpl) this.component.getArrayVariableJsonEntityParser().getValue()).serialize(parsingContext, ((DivVariable.Array) divVariable).getValue());
        }
        if (divVariable instanceof DivVariable.Property) {
            return ((PropertyVariableJsonParser.EntityParserImpl) this.component.getPropertyVariableJsonEntityParser().getValue()).serialize(parsingContext, ((DivVariable.Property) divVariable).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
