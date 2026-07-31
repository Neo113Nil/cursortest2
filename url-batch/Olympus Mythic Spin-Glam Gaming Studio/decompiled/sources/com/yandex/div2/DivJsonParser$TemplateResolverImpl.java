package com.yandex.div2;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
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
import com.yandex.div2.DivTemplate;
import com.yandex.div2.DivTextJsonParser;
import com.yandex.div2.DivVideoJsonParser;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* compiled from: DivJsonParser.kt */
/* loaded from: classes11.dex */
public final class DivJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public Div resolve(ParsingContext parsingContext, DivTemplate divTemplate, JSONObject jSONObject) {
        if (divTemplate instanceof DivTemplate.Image) {
            return new Div.Image(((DivImageJsonParser.TemplateResolverImpl) this.component.getDivImageJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivTemplate.Image) divTemplate).getValue(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.GifImage) {
            return new Div.GifImage(((DivGifImageJsonParser.TemplateResolverImpl) this.component.getDivGifImageJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivTemplate.GifImage) divTemplate).getValue(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.Text) {
            return new Div.Text(((DivTextJsonParser.TemplateResolverImpl) this.component.getDivTextJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivTemplate.Text) divTemplate).getValue(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.Separator) {
            return new Div.Separator(((DivSeparatorJsonParser.TemplateResolverImpl) this.component.getDivSeparatorJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivTemplate.Separator) divTemplate).getValue(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.Container) {
            return new Div.Container(((DivContainerJsonParser.TemplateResolverImpl) this.component.getDivContainerJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivTemplate.Container) divTemplate).getValue(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.Grid) {
            return new Div.Grid(((DivGridJsonParser.TemplateResolverImpl) this.component.getDivGridJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivTemplate.Grid) divTemplate).getValue(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.Gallery) {
            return new Div.Gallery(((DivGalleryJsonParser.TemplateResolverImpl) this.component.getDivGalleryJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivTemplate.Gallery) divTemplate).getValue(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.Pager) {
            return new Div.Pager(((DivPagerJsonParser.TemplateResolverImpl) this.component.getDivPagerJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivTemplate.Pager) divTemplate).getValue(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.Tabs) {
            return new Div.Tabs(((DivTabsJsonParser.TemplateResolverImpl) this.component.getDivTabsJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivTemplate.Tabs) divTemplate).getValue(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.State) {
            return new Div.State(((DivStateJsonParser.TemplateResolverImpl) this.component.getDivStateJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivTemplate.State) divTemplate).getValue(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.Custom) {
            return new Div.Custom(((DivCustomJsonParser.TemplateResolverImpl) this.component.getDivCustomJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivTemplate.Custom) divTemplate).getValue(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.Indicator) {
            return new Div.Indicator(((DivIndicatorJsonParser.TemplateResolverImpl) this.component.getDivIndicatorJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivTemplate.Indicator) divTemplate).getValue(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.Slider) {
            return new Div.Slider(((DivSliderJsonParser.TemplateResolverImpl) this.component.getDivSliderJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivTemplate.Slider) divTemplate).getValue(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.Switch) {
            return new Div.Switch(((DivSwitchJsonParser.TemplateResolverImpl) this.component.getDivSwitchJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivTemplate.Switch) divTemplate).getValue(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.Input) {
            return new Div.Input(((DivInputJsonParser.TemplateResolverImpl) this.component.getDivInputJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivTemplate.Input) divTemplate).getValue(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.Select) {
            return new Div.Select(((DivSelectJsonParser.TemplateResolverImpl) this.component.getDivSelectJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivTemplate.Select) divTemplate).getValue(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.Video) {
            return new Div.Video(((DivVideoJsonParser.TemplateResolverImpl) this.component.getDivVideoJsonTemplateResolver().getValue()).resolve(parsingContext, ((DivTemplate.Video) divTemplate).getValue(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
