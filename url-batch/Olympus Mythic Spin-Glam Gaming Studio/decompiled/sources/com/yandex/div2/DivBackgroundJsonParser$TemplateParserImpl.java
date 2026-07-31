package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivBackgroundTemplate;
import com.yandex.div2.DivImageBackgroundJsonParser;
import com.yandex.div2.DivLinearGradientJsonParser;
import com.yandex.div2.DivRadialGradientJsonParser;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivBackgroundJsonParser.kt */
/* loaded from: classes5.dex */
public final class DivBackgroundJsonParser$TemplateParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivBackgroundJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
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
    public DivBackgroundTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String type;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        DivBackgroundTemplate divBackgroundTemplate = entityTemplate instanceof DivBackgroundTemplate ? (DivBackgroundTemplate) entityTemplate : null;
        if (divBackgroundTemplate != null && (type = divBackgroundTemplate.getType()) != null) {
            readString = type;
        }
        switch (readString.hashCode()) {
            case -30518633:
                if (readString.equals("nine_patch_image")) {
                    return new DivBackgroundTemplate.NinePatch(((DivNinePatchBackgroundJsonParser$TemplateParserImpl) this.component.getDivNinePatchBackgroundJsonTemplateParser().getValue()).deserialize(parsingContext, (DivNinePatchBackgroundTemplate) (divBackgroundTemplate != null ? divBackgroundTemplate.value() : null), jSONObject));
                }
                break;
            case 89650992:
                if (readString.equals("gradient")) {
                    return new DivBackgroundTemplate.LinearGradient(((DivLinearGradientJsonParser.TemplateParserImpl) this.component.getDivLinearGradientJsonTemplateParser().getValue()).deserialize(parsingContext, (DivLinearGradientTemplate) (divBackgroundTemplate != null ? divBackgroundTemplate.value() : null), jSONObject));
                }
                break;
            case 100313435:
                if (readString.equals("image")) {
                    return new DivBackgroundTemplate.Image(((DivImageBackgroundJsonParser.TemplateParserImpl) this.component.getDivImageBackgroundJsonTemplateParser().getValue()).deserialize(parsingContext, (DivImageBackgroundTemplate) (divBackgroundTemplate != null ? divBackgroundTemplate.value() : null), jSONObject));
                }
                break;
            case 109618859:
                if (readString.equals("solid")) {
                    return new DivBackgroundTemplate.Solid(((DivSolidBackgroundJsonParser$TemplateParserImpl) this.component.getDivSolidBackgroundJsonTemplateParser().getValue()).deserialize(parsingContext, (DivSolidBackgroundTemplate) (divBackgroundTemplate != null ? divBackgroundTemplate.value() : null), jSONObject));
                }
                break;
            case 1881846096:
                if (readString.equals("radial_gradient")) {
                    return new DivBackgroundTemplate.RadialGradient(((DivRadialGradientJsonParser.TemplateParserImpl) this.component.getDivRadialGradientJsonTemplateParser().getValue()).deserialize(parsingContext, (DivRadialGradientTemplate) (divBackgroundTemplate != null ? divBackgroundTemplate.value() : null), jSONObject));
                }
                break;
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivBackgroundTemplate divBackgroundTemplate) {
        if (divBackgroundTemplate instanceof DivBackgroundTemplate.LinearGradient) {
            return ((DivLinearGradientJsonParser.TemplateParserImpl) this.component.getDivLinearGradientJsonTemplateParser().getValue()).serialize(parsingContext, ((DivBackgroundTemplate.LinearGradient) divBackgroundTemplate).getValue());
        }
        if (divBackgroundTemplate instanceof DivBackgroundTemplate.RadialGradient) {
            return ((DivRadialGradientJsonParser.TemplateParserImpl) this.component.getDivRadialGradientJsonTemplateParser().getValue()).serialize(parsingContext, ((DivBackgroundTemplate.RadialGradient) divBackgroundTemplate).getValue());
        }
        if (divBackgroundTemplate instanceof DivBackgroundTemplate.Image) {
            return ((DivImageBackgroundJsonParser.TemplateParserImpl) this.component.getDivImageBackgroundJsonTemplateParser().getValue()).serialize(parsingContext, ((DivBackgroundTemplate.Image) divBackgroundTemplate).getValue());
        }
        if (divBackgroundTemplate instanceof DivBackgroundTemplate.Solid) {
            return ((DivSolidBackgroundJsonParser$TemplateParserImpl) this.component.getDivSolidBackgroundJsonTemplateParser().getValue()).serialize(parsingContext, ((DivBackgroundTemplate.Solid) divBackgroundTemplate).getValue());
        }
        if (divBackgroundTemplate instanceof DivBackgroundTemplate.NinePatch) {
            return ((DivNinePatchBackgroundJsonParser$TemplateParserImpl) this.component.getDivNinePatchBackgroundJsonTemplateParser().getValue()).serialize(parsingContext, ((DivBackgroundTemplate.NinePatch) divBackgroundTemplate).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
