package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivAppearanceSetTransitionJsonParser;
import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.DivFadeTransitionJsonParser;
import com.yandex.div2.DivScaleTransitionJsonParser;
import com.yandex.div2.DivSlideTransitionJsonParser;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivAppearanceTransitionJsonParser.kt */
/* loaded from: classes12.dex */
public final class DivAppearanceTransitionJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivAppearanceTransitionJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
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
    public DivAppearanceTransition deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        switch (readString.hashCode()) {
            case 113762:
                if (readString.equals("set")) {
                    return new DivAppearanceTransition.Set(((DivAppearanceSetTransitionJsonParser.EntityParserImpl) this.component.getDivAppearanceSetTransitionJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 3135100:
                if (readString.equals("fade")) {
                    return new DivAppearanceTransition.Fade(((DivFadeTransitionJsonParser.EntityParserImpl) this.component.getDivFadeTransitionJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 109250890:
                if (readString.equals("scale")) {
                    return new DivAppearanceTransition.Scale(((DivScaleTransitionJsonParser.EntityParserImpl) this.component.getDivScaleTransitionJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 109526449:
                if (readString.equals("slide")) {
                    return new DivAppearanceTransition.Slide(((DivSlideTransitionJsonParser.EntityParserImpl) this.component.getDivSlideTransitionJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        DivAppearanceTransitionTemplate divAppearanceTransitionTemplate = orThrow instanceof DivAppearanceTransitionTemplate ? (DivAppearanceTransitionTemplate) orThrow : null;
        if (divAppearanceTransitionTemplate != null) {
            return ((DivAppearanceTransitionJsonParser$TemplateResolverImpl) this.component.getDivAppearanceTransitionJsonTemplateResolver().getValue()).resolve(parsingContext, divAppearanceTransitionTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivAppearanceTransition divAppearanceTransition) {
        if (divAppearanceTransition instanceof DivAppearanceTransition.Set) {
            return ((DivAppearanceSetTransitionJsonParser.EntityParserImpl) this.component.getDivAppearanceSetTransitionJsonEntityParser().getValue()).serialize(parsingContext, ((DivAppearanceTransition.Set) divAppearanceTransition).getValue());
        }
        if (divAppearanceTransition instanceof DivAppearanceTransition.Fade) {
            return ((DivFadeTransitionJsonParser.EntityParserImpl) this.component.getDivFadeTransitionJsonEntityParser().getValue()).serialize(parsingContext, ((DivAppearanceTransition.Fade) divAppearanceTransition).getValue());
        }
        if (divAppearanceTransition instanceof DivAppearanceTransition.Scale) {
            return ((DivScaleTransitionJsonParser.EntityParserImpl) this.component.getDivScaleTransitionJsonEntityParser().getValue()).serialize(parsingContext, ((DivAppearanceTransition.Scale) divAppearanceTransition).getValue());
        }
        if (divAppearanceTransition instanceof DivAppearanceTransition.Slide) {
            return ((DivSlideTransitionJsonParser.EntityParserImpl) this.component.getDivSlideTransitionJsonEntityParser().getValue()).serialize(parsingContext, ((DivAppearanceTransition.Slide) divAppearanceTransition).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
