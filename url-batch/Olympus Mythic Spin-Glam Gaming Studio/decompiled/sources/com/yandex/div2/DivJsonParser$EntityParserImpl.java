package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.Div;
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
import com.yandex.div2.DivTextJsonParser;
import com.yandex.div2.DivVideoJsonParser;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivJsonParser.kt */
/* loaded from: classes14.dex */
public final class DivJsonParser$EntityParserImpl implements Parser {
    private final JsonParserComponent component;

    public DivJsonParser$EntityParserImpl(JsonParserComponent jsonParserComponent) {
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
    public Div deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
        String readString = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        switch (readString.hashCode()) {
            case -1349088399:
                if (readString.equals("custom")) {
                    return new Div.Custom(((DivCustomJsonParser.EntityParserImpl) this.component.getDivCustomJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -906021636:
                if (readString.equals("select")) {
                    return new Div.Select(((DivSelectJsonParser.EntityParserImpl) this.component.getDivSelectJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -899647263:
                if (readString.equals("slider")) {
                    return new Div.Slider(((DivSliderJsonParser.EntityParserImpl) this.component.getDivSliderJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -889473228:
                if (readString.equals("switch")) {
                    return new Div.Switch(((DivSwitchJsonParser.EntityParserImpl) this.component.getDivSwitchJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -711999985:
                if (readString.equals("indicator")) {
                    return new Div.Indicator(((DivIndicatorJsonParser.EntityParserImpl) this.component.getDivIndicatorJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -410956671:
                if (readString.equals("container")) {
                    return new Div.Container(((DivContainerJsonParser.EntityParserImpl) this.component.getDivContainerJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case -196315310:
                if (readString.equals("gallery")) {
                    return new Div.Gallery(((DivGalleryJsonParser.EntityParserImpl) this.component.getDivGalleryJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 102340:
                if (readString.equals("gif")) {
                    return new Div.GifImage(((DivGifImageJsonParser.EntityParserImpl) this.component.getDivGifImageJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 3181382:
                if (readString.equals("grid")) {
                    return new Div.Grid(((DivGridJsonParser.EntityParserImpl) this.component.getDivGridJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 3552126:
                if (readString.equals("tabs")) {
                    return new Div.Tabs(((DivTabsJsonParser.EntityParserImpl) this.component.getDivTabsJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 3556653:
                if (readString.equals("text")) {
                    return new Div.Text(((DivTextJsonParser.EntityParserImpl) this.component.getDivTextJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 100313435:
                if (readString.equals("image")) {
                    return new Div.Image(((DivImageJsonParser.EntityParserImpl) this.component.getDivImageJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 100358090:
                if (readString.equals("input")) {
                    return new Div.Input(((DivInputJsonParser.EntityParserImpl) this.component.getDivInputJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 106426307:
                if (readString.equals("pager")) {
                    return new Div.Pager(((DivPagerJsonParser.EntityParserImpl) this.component.getDivPagerJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 109757585:
                if (readString.equals("state")) {
                    return new Div.State(((DivStateJsonParser.EntityParserImpl) this.component.getDivStateJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 112202875:
                if (readString.equals("video")) {
                    return new Div.Video(((DivVideoJsonParser.EntityParserImpl) this.component.getDivVideoJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
            case 1732829925:
                if (readString.equals("separator")) {
                    return new Div.Separator(((DivSeparatorJsonParser.EntityParserImpl) this.component.getDivSeparatorJsonEntityParser().getValue()).deserialize(parsingContext, jSONObject));
                }
                break;
        }
        EntityTemplate<?> orThrow = parsingContext.getTemplates().getOrThrow(readString, jSONObject);
        DivTemplate divTemplate = orThrow instanceof DivTemplate ? (DivTemplate) orThrow : null;
        if (divTemplate != null) {
            return ((DivJsonParser$TemplateResolverImpl) this.component.getDivJsonTemplateResolver().getValue()).resolve(parsingContext, divTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", readString);
    }

    @Override // com.yandex.div.serialization.Serializer
    public JSONObject serialize(ParsingContext parsingContext, Div div) {
        if (div instanceof Div.Image) {
            return ((DivImageJsonParser.EntityParserImpl) this.component.getDivImageJsonEntityParser().getValue()).serialize(parsingContext, ((Div.Image) div).getValue());
        }
        if (div instanceof Div.GifImage) {
            return ((DivGifImageJsonParser.EntityParserImpl) this.component.getDivGifImageJsonEntityParser().getValue()).serialize(parsingContext, ((Div.GifImage) div).getValue());
        }
        if (div instanceof Div.Text) {
            return ((DivTextJsonParser.EntityParserImpl) this.component.getDivTextJsonEntityParser().getValue()).serialize(parsingContext, ((Div.Text) div).getValue());
        }
        if (div instanceof Div.Separator) {
            return ((DivSeparatorJsonParser.EntityParserImpl) this.component.getDivSeparatorJsonEntityParser().getValue()).serialize(parsingContext, ((Div.Separator) div).getValue());
        }
        if (div instanceof Div.Container) {
            return ((DivContainerJsonParser.EntityParserImpl) this.component.getDivContainerJsonEntityParser().getValue()).serialize(parsingContext, ((Div.Container) div).getValue());
        }
        if (div instanceof Div.Grid) {
            return ((DivGridJsonParser.EntityParserImpl) this.component.getDivGridJsonEntityParser().getValue()).serialize(parsingContext, ((Div.Grid) div).getValue());
        }
        if (div instanceof Div.Gallery) {
            return ((DivGalleryJsonParser.EntityParserImpl) this.component.getDivGalleryJsonEntityParser().getValue()).serialize(parsingContext, ((Div.Gallery) div).getValue());
        }
        if (div instanceof Div.Pager) {
            return ((DivPagerJsonParser.EntityParserImpl) this.component.getDivPagerJsonEntityParser().getValue()).serialize(parsingContext, ((Div.Pager) div).getValue());
        }
        if (div instanceof Div.Tabs) {
            return ((DivTabsJsonParser.EntityParserImpl) this.component.getDivTabsJsonEntityParser().getValue()).serialize(parsingContext, ((Div.Tabs) div).getValue());
        }
        if (div instanceof Div.State) {
            return ((DivStateJsonParser.EntityParserImpl) this.component.getDivStateJsonEntityParser().getValue()).serialize(parsingContext, ((Div.State) div).getValue());
        }
        if (div instanceof Div.Custom) {
            return ((DivCustomJsonParser.EntityParserImpl) this.component.getDivCustomJsonEntityParser().getValue()).serialize(parsingContext, ((Div.Custom) div).getValue());
        }
        if (div instanceof Div.Indicator) {
            return ((DivIndicatorJsonParser.EntityParserImpl) this.component.getDivIndicatorJsonEntityParser().getValue()).serialize(parsingContext, ((Div.Indicator) div).getValue());
        }
        if (div instanceof Div.Slider) {
            return ((DivSliderJsonParser.EntityParserImpl) this.component.getDivSliderJsonEntityParser().getValue()).serialize(parsingContext, ((Div.Slider) div).getValue());
        }
        if (div instanceof Div.Switch) {
            return ((DivSwitchJsonParser.EntityParserImpl) this.component.getDivSwitchJsonEntityParser().getValue()).serialize(parsingContext, ((Div.Switch) div).getValue());
        }
        if (div instanceof Div.Input) {
            return ((DivInputJsonParser.EntityParserImpl) this.component.getDivInputJsonEntityParser().getValue()).serialize(parsingContext, ((Div.Input) div).getValue());
        }
        if (div instanceof Div.Select) {
            return ((DivSelectJsonParser.EntityParserImpl) this.component.getDivSelectJsonEntityParser().getValue()).serialize(parsingContext, ((Div.Select) div).getValue());
        }
        if (div instanceof Div.Video) {
            return ((DivVideoJsonParser.EntityParserImpl) this.component.getDivVideoJsonEntityParser().getValue()).serialize(parsingContext, ((Div.Video) div).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
