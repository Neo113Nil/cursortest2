package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivImageBackgroundJsonParser;
import com.yandex.div2.DivLinearGradientJsonParser;
import com.yandex.div2.DivRadialGradientJsonParser;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivBackgroundJsonParser.kt */
/* loaded from: classes10.dex */
public final class DivBackgroundJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivBackgroundJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
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
    public DivBackground deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        switch (readString.hashCode()) {
            case -30518633:
                if (readString.equals("nine_patch_image")) {
                    return new DivBackground.NinePatch(((DivNinePatchBackgroundJsonParser$EntityParserImpl) this.component.getDivNinePatchBackgroundJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 89650992:
                if (readString.equals("gradient")) {
                    return new DivBackground.LinearGradient(((DivLinearGradientJsonParser.EntityParserImpl) this.component.getDivLinearGradientJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 100313435:
                if (readString.equals("image")) {
                    return new DivBackground.Image(((DivImageBackgroundJsonParser.EntityParserImpl) this.component.getDivImageBackgroundJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 109618859:
                if (readString.equals("solid")) {
                    return new DivBackground.Solid(((DivSolidBackgroundJsonParser$EntityParserImpl) this.component.getDivSolidBackgroundJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 1881846096:
                if (readString.equals("radial_gradient")) {
                    return new DivBackground.RadialGradient(((DivRadialGradientJsonParser.EntityParserImpl) this.component.getDivRadialGradientJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        DivBackgroundTemplate divBackgroundTemplate = orThrow instanceof DivBackgroundTemplate ? (DivBackgroundTemplate) orThrow : null;
        if (divBackgroundTemplate != null) {
            return ((DivBackgroundJsonParser$TemplateResolverImpl) this.component.getDivBackgroundJsonTemplateResolver().getValue()).resolve(parsingContext, divBackgroundTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivBackground divBackground) {
        if (divBackground instanceof DivBackground.LinearGradient) {
            return ((DivLinearGradientJsonParser.EntityParserImpl) this.component.getDivLinearGradientJsonEntityParser().getValue()).serialize(parsingContext, ((DivBackground.LinearGradient) divBackground).getValue());
        }
        if (divBackground instanceof DivBackground.RadialGradient) {
            return ((DivRadialGradientJsonParser.EntityParserImpl) this.component.getDivRadialGradientJsonEntityParser().getValue()).serialize(parsingContext, ((DivBackground.RadialGradient) divBackground).getValue());
        }
        if (divBackground instanceof DivBackground.Image) {
            return ((DivImageBackgroundJsonParser.EntityParserImpl) this.component.getDivImageBackgroundJsonEntityParser().getValue()).serialize(parsingContext, ((DivBackground.Image) divBackground).getValue());
        }
        if (divBackground instanceof DivBackground.Solid) {
            return ((DivSolidBackgroundJsonParser$EntityParserImpl) this.component.getDivSolidBackgroundJsonEntityParser().getValue()).serialize(parsingContext, ((DivBackground.Solid) divBackground).getValue());
        }
        if (divBackground instanceof DivBackground.NinePatch) {
            return ((DivNinePatchBackgroundJsonParser$EntityParserImpl) this.component.getDivNinePatchBackgroundJsonEntityParser().getValue()).serialize(parsingContext, ((DivBackground.NinePatch) divBackground).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
