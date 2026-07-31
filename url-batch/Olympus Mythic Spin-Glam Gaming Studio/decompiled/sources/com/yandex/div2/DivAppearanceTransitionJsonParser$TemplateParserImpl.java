package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivAppearanceSetTransitionJsonParser;
import com.yandex.div2.DivAppearanceTransitionTemplate;
import com.yandex.div2.DivFadeTransitionJsonParser;
import com.yandex.div2.DivScaleTransitionJsonParser;
import com.yandex.div2.DivSlideTransitionJsonParser;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivAppearanceTransitionJsonParser.kt */
/* loaded from: classes13.dex */
public final class DivAppearanceTransitionJsonParser$TemplateParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivAppearanceTransitionJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
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
    public DivAppearanceTransitionTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String type;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        DivAppearanceTransitionTemplate divAppearanceTransitionTemplate = entityTemplate instanceof DivAppearanceTransitionTemplate ? (DivAppearanceTransitionTemplate) entityTemplate : null;
        if (divAppearanceTransitionTemplate != null && (type = divAppearanceTransitionTemplate.getType()) != null) {
            readString = type;
        }
        switch (readString.hashCode()) {
            case 113762:
                if (readString.equals("set")) {
                    return new DivAppearanceTransitionTemplate.Set(((DivAppearanceSetTransitionJsonParser.TemplateParserImpl) this.component.getDivAppearanceSetTransitionJsonTemplateParser().getValue()).deserialize(parsingContext, (DivAppearanceSetTransitionTemplate) (divAppearanceTransitionTemplate != null ? divAppearanceTransitionTemplate.value() : null), jSONObject));
                }
                break;
            case 3135100:
                if (readString.equals("fade")) {
                    return new DivAppearanceTransitionTemplate.Fade(((DivFadeTransitionJsonParser.TemplateParserImpl) this.component.getDivFadeTransitionJsonTemplateParser().getValue()).deserialize(parsingContext, (DivFadeTransitionTemplate) (divAppearanceTransitionTemplate != null ? divAppearanceTransitionTemplate.value() : null), jSONObject));
                }
                break;
            case 109250890:
                if (readString.equals("scale")) {
                    return new DivAppearanceTransitionTemplate.Scale(((DivScaleTransitionJsonParser.TemplateParserImpl) this.component.getDivScaleTransitionJsonTemplateParser().getValue()).deserialize(parsingContext, (DivScaleTransitionTemplate) (divAppearanceTransitionTemplate != null ? divAppearanceTransitionTemplate.value() : null), jSONObject));
                }
                break;
            case 109526449:
                if (readString.equals("slide")) {
                    return new DivAppearanceTransitionTemplate.Slide(((DivSlideTransitionJsonParser.TemplateParserImpl) this.component.getDivSlideTransitionJsonTemplateParser().getValue()).deserialize(parsingContext, (DivSlideTransitionTemplate) (divAppearanceTransitionTemplate != null ? divAppearanceTransitionTemplate.value() : null), jSONObject));
                }
                break;
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivAppearanceTransitionTemplate divAppearanceTransitionTemplate) {
        if (divAppearanceTransitionTemplate instanceof DivAppearanceTransitionTemplate.Set) {
            return ((DivAppearanceSetTransitionJsonParser.TemplateParserImpl) this.component.getDivAppearanceSetTransitionJsonTemplateParser().getValue()).serialize(parsingContext, ((DivAppearanceTransitionTemplate.Set) divAppearanceTransitionTemplate).getValue());
        }
        if (divAppearanceTransitionTemplate instanceof DivAppearanceTransitionTemplate.Fade) {
            return ((DivFadeTransitionJsonParser.TemplateParserImpl) this.component.getDivFadeTransitionJsonTemplateParser().getValue()).serialize(parsingContext, ((DivAppearanceTransitionTemplate.Fade) divAppearanceTransitionTemplate).getValue());
        }
        if (divAppearanceTransitionTemplate instanceof DivAppearanceTransitionTemplate.Scale) {
            return ((DivScaleTransitionJsonParser.TemplateParserImpl) this.component.getDivScaleTransitionJsonTemplateParser().getValue()).serialize(parsingContext, ((DivAppearanceTransitionTemplate.Scale) divAppearanceTransitionTemplate).getValue());
        }
        if (divAppearanceTransitionTemplate instanceof DivAppearanceTransitionTemplate.Slide) {
            return ((DivSlideTransitionJsonParser.TemplateParserImpl) this.component.getDivSlideTransitionJsonTemplateParser().getValue()).serialize(parsingContext, ((DivAppearanceTransitionTemplate.Slide) divAppearanceTransitionTemplate).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
