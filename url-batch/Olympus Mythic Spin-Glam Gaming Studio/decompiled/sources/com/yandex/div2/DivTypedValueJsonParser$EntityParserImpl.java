package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivTypedValue;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivTypedValueJsonParser.kt */
/* loaded from: classes12.dex */
public final class DivTypedValueJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivTypedValueJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
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
    public DivTypedValue deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        switch (readString.hashCode()) {
            case -1034364087:
                if (readString.equals("number")) {
                    return new DivTypedValue.Number(((NumberValueJsonParser$EntityParserImpl) this.component.getNumberValueJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -891985903:
                if (readString.equals("string")) {
                    return new DivTypedValue.Str(((StrValueJsonParser$EntityParserImpl) this.component.getStrValueJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 116079:
                if (readString.equals("url")) {
                    return new DivTypedValue.Url(((UrlValueJsonParser$EntityParserImpl) this.component.getUrlValueJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 3083190:
                if (readString.equals("dict")) {
                    return new DivTypedValue.Dict(((DictValueJsonParser$EntityParserImpl) this.component.getDictValueJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 64711720:
                if (readString.equals("boolean")) {
                    return new DivTypedValue.Bool(((BoolValueJsonParser$EntityParserImpl) this.component.getBoolValueJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 93090393:
                if (readString.equals("array")) {
                    return new DivTypedValue.Array(((ArrayValueJsonParser$EntityParserImpl) this.component.getArrayValueJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 94842723:
                if (readString.equals("color")) {
                    return new DivTypedValue.Color(((ColorValueJsonParser$EntityParserImpl) this.component.getColorValueJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 1958052158:
                if (readString.equals("integer")) {
                    return new DivTypedValue.Integer(((IntegerValueJsonParser$EntityParserImpl) this.component.getIntegerValueJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        DivTypedValueTemplate divTypedValueTemplate = orThrow instanceof DivTypedValueTemplate ? (DivTypedValueTemplate) orThrow : null;
        if (divTypedValueTemplate != null) {
            return ((DivTypedValueJsonParser$TemplateResolverImpl) this.component.getDivTypedValueJsonTemplateResolver().getValue()).resolve(parsingContext, divTypedValueTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivTypedValue divTypedValue) {
        if (divTypedValue instanceof DivTypedValue.Str) {
            return ((StrValueJsonParser$EntityParserImpl) this.component.getStrValueJsonEntityParser().getValue()).serialize(parsingContext, ((DivTypedValue.Str) divTypedValue).getValue());
        }
        if (divTypedValue instanceof DivTypedValue.Integer) {
            return ((IntegerValueJsonParser$EntityParserImpl) this.component.getIntegerValueJsonEntityParser().getValue()).serialize(parsingContext, ((DivTypedValue.Integer) divTypedValue).getValue());
        }
        if (divTypedValue instanceof DivTypedValue.Number) {
            return ((NumberValueJsonParser$EntityParserImpl) this.component.getNumberValueJsonEntityParser().getValue()).serialize(parsingContext, ((DivTypedValue.Number) divTypedValue).getValue());
        }
        if (divTypedValue instanceof DivTypedValue.Color) {
            return ((ColorValueJsonParser$EntityParserImpl) this.component.getColorValueJsonEntityParser().getValue()).serialize(parsingContext, ((DivTypedValue.Color) divTypedValue).getValue());
        }
        if (divTypedValue instanceof DivTypedValue.Bool) {
            return ((BoolValueJsonParser$EntityParserImpl) this.component.getBoolValueJsonEntityParser().getValue()).serialize(parsingContext, ((DivTypedValue.Bool) divTypedValue).getValue());
        }
        if (divTypedValue instanceof DivTypedValue.Url) {
            return ((UrlValueJsonParser$EntityParserImpl) this.component.getUrlValueJsonEntityParser().getValue()).serialize(parsingContext, ((DivTypedValue.Url) divTypedValue).getValue());
        }
        if (divTypedValue instanceof DivTypedValue.Dict) {
            return ((DictValueJsonParser$EntityParserImpl) this.component.getDictValueJsonEntityParser().getValue()).serialize(parsingContext, ((DivTypedValue.Dict) divTypedValue).getValue());
        }
        if (divTypedValue instanceof DivTypedValue.Array) {
            return ((ArrayValueJsonParser$EntityParserImpl) this.component.getArrayValueJsonEntityParser().getValue()).serialize(parsingContext, ((DivTypedValue.Array) divTypedValue).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
