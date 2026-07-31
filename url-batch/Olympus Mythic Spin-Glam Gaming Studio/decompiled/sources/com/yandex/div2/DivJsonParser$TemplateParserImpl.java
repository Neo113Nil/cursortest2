package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivContainerJsonParser;
import com.yandex.div2.DivCustomJsonParser;
import com.yandex.div2.DivGalleryJsonParser;
import com.yandex.div2.DivGifImageJsonParser;
import com.yandex.div2.DivGridJsonParser;
import com.yandex.div2.DivImageJsonParser;
import com.yandex.div2.DivIndicatorJsonParser;
import com.yandex.div2.DivInputJsonParser;
import com.yandex.div2.DivPagerJsonParser;
import com.yandex.div2.DivSelectJsonParser;
import com.yandex.div2.DivSeparatorJsonParser;
import com.yandex.div2.DivSliderJsonParser;
import com.yandex.div2.DivStateJsonParser;
import com.yandex.div2.DivSwitchJsonParser;
import com.yandex.div2.DivTabsJsonParser;
import com.yandex.div2.DivTemplate;
import com.yandex.div2.DivTextJsonParser;
import com.yandex.div2.DivVideoJsonParser;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivJsonParser.kt */
/* loaded from: classes3.dex */
public final class DivJsonParser$TemplateParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivJsonParser$TemplateParserImpl(JsonParserComponent jsonParserComponent) {
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
    public DivTemplate deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String type;
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate<?> entityTemplate = parsingContext.getTemplates().get(readString);
        DivTemplate divTemplate = entityTemplate instanceof DivTemplate ? (DivTemplate) entityTemplate : null;
        if (divTemplate != null && (type = divTemplate.getType()) != null) {
            readString = type;
        }
        switch (readString.hashCode()) {
            case -1349088399:
                if (readString.equals("custom")) {
                    return new DivTemplate.Custom(((DivCustomJsonParser.TemplateParserImpl) this.component.getDivCustomJsonTemplateParser().getValue()).deserialize(parsingContext, (DivCustomTemplate) (divTemplate != null ? divTemplate.value() : null), jSONObject));
                }
                break;
            case -906021636:
                if (readString.equals("select")) {
                    return new DivTemplate.Select(((DivSelectJsonParser.TemplateParserImpl) this.component.getDivSelectJsonTemplateParser().getValue()).deserialize(parsingContext, (DivSelectTemplate) (divTemplate != null ? divTemplate.value() : null), jSONObject));
                }
                break;
            case -899647263:
                if (readString.equals("slider")) {
                    return new DivTemplate.Slider(((DivSliderJsonParser.TemplateParserImpl) this.component.getDivSliderJsonTemplateParser().getValue()).deserialize(parsingContext, (DivSliderTemplate) (divTemplate != null ? divTemplate.value() : null), jSONObject));
                }
                break;
            case -889473228:
                if (readString.equals("switch")) {
                    return new DivTemplate.Switch(((DivSwitchJsonParser.TemplateParserImpl) this.component.getDivSwitchJsonTemplateParser().getValue()).deserialize(parsingContext, (DivSwitchTemplate) (divTemplate != null ? divTemplate.value() : null), jSONObject));
                }
                break;
            case -711999985:
                if (readString.equals("indicator")) {
                    return new DivTemplate.Indicator(((DivIndicatorJsonParser.TemplateParserImpl) this.component.getDivIndicatorJsonTemplateParser().getValue()).deserialize(parsingContext, (DivIndicatorTemplate) (divTemplate != null ? divTemplate.value() : null), jSONObject));
                }
                break;
            case -410956671:
                if (readString.equals("container")) {
                    return new DivTemplate.Container(((DivContainerJsonParser.TemplateParserImpl) this.component.getDivContainerJsonTemplateParser().getValue()).deserialize(parsingContext, (DivContainerTemplate) (divTemplate != null ? divTemplate.value() : null), jSONObject));
                }
                break;
            case -196315310:
                if (readString.equals("gallery")) {
                    return new DivTemplate.Gallery(((DivGalleryJsonParser.TemplateParserImpl) this.component.getDivGalleryJsonTemplateParser().getValue()).deserialize(parsingContext, (DivGalleryTemplate) (divTemplate != null ? divTemplate.value() : null), jSONObject));
                }
                break;
            case 102340:
                if (readString.equals("gif")) {
                    return new DivTemplate.GifImage(((DivGifImageJsonParser.TemplateParserImpl) this.component.getDivGifImageJsonTemplateParser().getValue()).deserialize(parsingContext, (DivGifImageTemplate) (divTemplate != null ? divTemplate.value() : null), jSONObject));
                }
                break;
            case 3181382:
                if (readString.equals("grid")) {
                    return new DivTemplate.Grid(((DivGridJsonParser.TemplateParserImpl) this.component.getDivGridJsonTemplateParser().getValue()).deserialize(parsingContext, (DivGridTemplate) (divTemplate != null ? divTemplate.value() : null), jSONObject));
                }
                break;
            case 3552126:
                if (readString.equals("tabs")) {
                    return new DivTemplate.Tabs(((DivTabsJsonParser.TemplateParserImpl) this.component.getDivTabsJsonTemplateParser().getValue()).deserialize(parsingContext, (DivTabsTemplate) (divTemplate != null ? divTemplate.value() : null), jSONObject));
                }
                break;
            case 3556653:
                if (readString.equals("text")) {
                    return new DivTemplate.Text(((DivTextJsonParser.TemplateParserImpl) this.component.getDivTextJsonTemplateParser().getValue()).deserialize(parsingContext, (DivTextTemplate) (divTemplate != null ? divTemplate.value() : null), jSONObject));
                }
                break;
            case 100313435:
                if (readString.equals("image")) {
                    return new DivTemplate.Image(((DivImageJsonParser.TemplateParserImpl) this.component.getDivImageJsonTemplateParser().getValue()).deserialize(parsingContext, (DivImageTemplate) (divTemplate != null ? divTemplate.value() : null), jSONObject));
                }
                break;
            case 100358090:
                if (readString.equals("input")) {
                    return new DivTemplate.Input(((DivInputJsonParser.TemplateParserImpl) this.component.getDivInputJsonTemplateParser().getValue()).deserialize(parsingContext, (DivInputTemplate) (divTemplate != null ? divTemplate.value() : null), jSONObject));
                }
                break;
            case 106426307:
                if (readString.equals("pager")) {
                    return new DivTemplate.Pager(((DivPagerJsonParser.TemplateParserImpl) this.component.getDivPagerJsonTemplateParser().getValue()).deserialize(parsingContext, (DivPagerTemplate) (divTemplate != null ? divTemplate.value() : null), jSONObject));
                }
                break;
            case 109757585:
                if (readString.equals("state")) {
                    return new DivTemplate.State(((DivStateJsonParser.TemplateParserImpl) this.component.getDivStateJsonTemplateParser().getValue()).deserialize(parsingContext, (DivStateTemplate) (divTemplate != null ? divTemplate.value() : null), jSONObject));
                }
                break;
            case 112202875:
                if (readString.equals("video")) {
                    return new DivTemplate.Video(((DivVideoJsonParser.TemplateParserImpl) this.component.getDivVideoJsonTemplateParser().getValue()).deserialize(parsingContext, (DivVideoTemplate) (divTemplate != null ? divTemplate.value() : null), jSONObject));
                }
                break;
            case 1732829925:
                if (readString.equals("separator")) {
                    return new DivTemplate.Separator(((DivSeparatorJsonParser.TemplateParserImpl) this.component.getDivSeparatorJsonTemplateParser().getValue()).deserialize(parsingContext, (DivSeparatorTemplate) (divTemplate != null ? divTemplate.value() : null), jSONObject));
                }
                break;
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, DivTemplate divTemplate) {
        if (divTemplate instanceof DivTemplate.Image) {
            return ((DivImageJsonParser.TemplateParserImpl) this.component.getDivImageJsonTemplateParser().getValue()).serialize(parsingContext, ((DivTemplate.Image) divTemplate).getValue());
        }
        if (divTemplate instanceof DivTemplate.GifImage) {
            return ((DivGifImageJsonParser.TemplateParserImpl) this.component.getDivGifImageJsonTemplateParser().getValue()).serialize(parsingContext, ((DivTemplate.GifImage) divTemplate).getValue());
        }
        if (divTemplate instanceof DivTemplate.Text) {
            return ((DivTextJsonParser.TemplateParserImpl) this.component.getDivTextJsonTemplateParser().getValue()).serialize(parsingContext, ((DivTemplate.Text) divTemplate).getValue());
        }
        if (divTemplate instanceof DivTemplate.Separator) {
            return ((DivSeparatorJsonParser.TemplateParserImpl) this.component.getDivSeparatorJsonTemplateParser().getValue()).serialize(parsingContext, ((DivTemplate.Separator) divTemplate).getValue());
        }
        if (divTemplate instanceof DivTemplate.Container) {
            return ((DivContainerJsonParser.TemplateParserImpl) this.component.getDivContainerJsonTemplateParser().getValue()).serialize(parsingContext, ((DivTemplate.Container) divTemplate).getValue());
        }
        if (divTemplate instanceof DivTemplate.Grid) {
            return ((DivGridJsonParser.TemplateParserImpl) this.component.getDivGridJsonTemplateParser().getValue()).serialize(parsingContext, ((DivTemplate.Grid) divTemplate).getValue());
        }
        if (divTemplate instanceof DivTemplate.Gallery) {
            return ((DivGalleryJsonParser.TemplateParserImpl) this.component.getDivGalleryJsonTemplateParser().getValue()).serialize(parsingContext, ((DivTemplate.Gallery) divTemplate).getValue());
        }
        if (divTemplate instanceof DivTemplate.Pager) {
            return ((DivPagerJsonParser.TemplateParserImpl) this.component.getDivPagerJsonTemplateParser().getValue()).serialize(parsingContext, ((DivTemplate.Pager) divTemplate).getValue());
        }
        if (divTemplate instanceof DivTemplate.Tabs) {
            return ((DivTabsJsonParser.TemplateParserImpl) this.component.getDivTabsJsonTemplateParser().getValue()).serialize(parsingContext, ((DivTemplate.Tabs) divTemplate).getValue());
        }
        if (divTemplate instanceof DivTemplate.State) {
            return ((DivStateJsonParser.TemplateParserImpl) this.component.getDivStateJsonTemplateParser().getValue()).serialize(parsingContext, ((DivTemplate.State) divTemplate).getValue());
        }
        if (divTemplate instanceof DivTemplate.Custom) {
            return ((DivCustomJsonParser.TemplateParserImpl) this.component.getDivCustomJsonTemplateParser().getValue()).serialize(parsingContext, ((DivTemplate.Custom) divTemplate).getValue());
        }
        if (divTemplate instanceof DivTemplate.Indicator) {
            return ((DivIndicatorJsonParser.TemplateParserImpl) this.component.getDivIndicatorJsonTemplateParser().getValue()).serialize(parsingContext, ((DivTemplate.Indicator) divTemplate).getValue());
        }
        if (divTemplate instanceof DivTemplate.Slider) {
            return ((DivSliderJsonParser.TemplateParserImpl) this.component.getDivSliderJsonTemplateParser().getValue()).serialize(parsingContext, ((DivTemplate.Slider) divTemplate).getValue());
        }
        if (divTemplate instanceof DivTemplate.Switch) {
            return ((DivSwitchJsonParser.TemplateParserImpl) this.component.getDivSwitchJsonTemplateParser().getValue()).serialize(parsingContext, ((DivTemplate.Switch) divTemplate).getValue());
        }
        if (divTemplate instanceof DivTemplate.Input) {
            return ((DivInputJsonParser.TemplateParserImpl) this.component.getDivInputJsonTemplateParser().getValue()).serialize(parsingContext, ((DivTemplate.Input) divTemplate).getValue());
        }
        if (divTemplate instanceof DivTemplate.Select) {
            return ((DivSelectJsonParser.TemplateParserImpl) this.component.getDivSelectJsonTemplateParser().getValue()).serialize(parsingContext, ((DivTemplate.Select) divTemplate).getValue());
        }
        if (divTemplate instanceof DivTemplate.Video) {
            return ((DivVideoJsonParser.TemplateParserImpl) this.component.getDivVideoJsonTemplateParser().getValue()).serialize(parsingContext, ((DivTemplate.Video) divTemplate).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
