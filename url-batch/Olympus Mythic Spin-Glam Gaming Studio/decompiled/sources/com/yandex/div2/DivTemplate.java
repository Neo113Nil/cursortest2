package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTemplate.kt */
/* loaded from: classes.dex */
public abstract class DivTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivTemplate.Companion.invoke$default(DivTemplate.Companion, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    public /* synthetic */ DivTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivTemplate.kt */
    public static final class Image extends DivTemplate {
        private final DivImageTemplate value;

        public Image(DivImageTemplate divImageTemplate) {
            super(null);
            this.value = divImageTemplate;
        }

        public final DivImageTemplate getValue() {
            return this.value;
        }
    }

    private DivTemplate() {
    }

    /* compiled from: DivTemplate.kt */
    public static final class GifImage extends DivTemplate {
        private final DivGifImageTemplate value;

        public GifImage(DivGifImageTemplate divGifImageTemplate) {
            super(null);
            this.value = divGifImageTemplate;
        }

        public final DivGifImageTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivTemplate.kt */
    public static final class Text extends DivTemplate {
        private final DivTextTemplate value;

        public Text(DivTextTemplate divTextTemplate) {
            super(null);
            this.value = divTextTemplate;
        }

        public final DivTextTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivTemplate.kt */
    public static final class Separator extends DivTemplate {
        private final DivSeparatorTemplate value;

        public Separator(DivSeparatorTemplate divSeparatorTemplate) {
            super(null);
            this.value = divSeparatorTemplate;
        }

        public final DivSeparatorTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivTemplate.kt */
    public static final class Container extends DivTemplate {
        private final DivContainerTemplate value;

        public Container(DivContainerTemplate divContainerTemplate) {
            super(null);
            this.value = divContainerTemplate;
        }

        public final DivContainerTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivTemplate.kt */
    public static final class Grid extends DivTemplate {
        private final DivGridTemplate value;

        public Grid(DivGridTemplate divGridTemplate) {
            super(null);
            this.value = divGridTemplate;
        }

        public final DivGridTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivTemplate.kt */
    public static final class Gallery extends DivTemplate {
        private final DivGalleryTemplate value;

        public Gallery(DivGalleryTemplate divGalleryTemplate) {
            super(null);
            this.value = divGalleryTemplate;
        }

        public final DivGalleryTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivTemplate.kt */
    public static final class Pager extends DivTemplate {
        private final DivPagerTemplate value;

        public Pager(DivPagerTemplate divPagerTemplate) {
            super(null);
            this.value = divPagerTemplate;
        }

        public final DivPagerTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivTemplate.kt */
    public static final class Tabs extends DivTemplate {
        private final DivTabsTemplate value;

        public Tabs(DivTabsTemplate divTabsTemplate) {
            super(null);
            this.value = divTabsTemplate;
        }

        public final DivTabsTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivTemplate.kt */
    public static final class State extends DivTemplate {
        private final DivStateTemplate value;

        public State(DivStateTemplate divStateTemplate) {
            super(null);
            this.value = divStateTemplate;
        }

        public final DivStateTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivTemplate.kt */
    public static final class Custom extends DivTemplate {
        private final DivCustomTemplate value;

        public Custom(DivCustomTemplate divCustomTemplate) {
            super(null);
            this.value = divCustomTemplate;
        }

        public final DivCustomTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivTemplate.kt */
    public static final class Indicator extends DivTemplate {
        private final DivIndicatorTemplate value;

        public Indicator(DivIndicatorTemplate divIndicatorTemplate) {
            super(null);
            this.value = divIndicatorTemplate;
        }

        public final DivIndicatorTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivTemplate.kt */
    public static final class Slider extends DivTemplate {
        private final DivSliderTemplate value;

        public Slider(DivSliderTemplate divSliderTemplate) {
            super(null);
            this.value = divSliderTemplate;
        }

        public final DivSliderTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivTemplate.kt */
    public static final class Switch extends DivTemplate {
        private final DivSwitchTemplate value;

        public Switch(DivSwitchTemplate divSwitchTemplate) {
            super(null);
            this.value = divSwitchTemplate;
        }

        public final DivSwitchTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivTemplate.kt */
    public static final class Input extends DivTemplate {
        private final DivInputTemplate value;

        public Input(DivInputTemplate divInputTemplate) {
            super(null);
            this.value = divInputTemplate;
        }

        public final DivInputTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivTemplate.kt */
    public static final class Select extends DivTemplate {
        private final DivSelectTemplate value;

        public Select(DivSelectTemplate divSelectTemplate) {
            super(null);
            this.value = divSelectTemplate;
        }

        public final DivSelectTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivTemplate.kt */
    public static final class Video extends DivTemplate {
        private final DivVideoTemplate value;

        public Video(DivVideoTemplate divVideoTemplate) {
            super(null);
            this.value = divVideoTemplate;
        }

        public final DivVideoTemplate getValue() {
            return this.value;
        }
    }

    public final Object value() {
        if (this instanceof Image) {
            return ((Image) this).getValue();
        }
        if (this instanceof GifImage) {
            return ((GifImage) this).getValue();
        }
        if (this instanceof Text) {
            return ((Text) this).getValue();
        }
        if (this instanceof Separator) {
            return ((Separator) this).getValue();
        }
        if (this instanceof Container) {
            return ((Container) this).getValue();
        }
        if (this instanceof Grid) {
            return ((Grid) this).getValue();
        }
        if (this instanceof Gallery) {
            return ((Gallery) this).getValue();
        }
        if (this instanceof Pager) {
            return ((Pager) this).getValue();
        }
        if (this instanceof Tabs) {
            return ((Tabs) this).getValue();
        }
        if (this instanceof State) {
            return ((State) this).getValue();
        }
        if (this instanceof Custom) {
            return ((Custom) this).getValue();
        }
        if (this instanceof Indicator) {
            return ((Indicator) this).getValue();
        }
        if (this instanceof Slider) {
            return ((Slider) this).getValue();
        }
        if (this instanceof Switch) {
            return ((Switch) this).getValue();
        }
        if (this instanceof Input) {
            return ((Input) this).getValue();
        }
        if (this instanceof Select) {
            return ((Select) this).getValue();
        }
        if (this instanceof Video) {
            return ((Video) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // com.yandex.div.json.JsonTemplate
    public Div resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    public final String getType() {
        if (this instanceof Image) {
            return "image";
        }
        if (this instanceof GifImage) {
            return "gif";
        }
        if (this instanceof Text) {
            return "text";
        }
        if (this instanceof Separator) {
            return "separator";
        }
        if (this instanceof Container) {
            return "container";
        }
        if (this instanceof Grid) {
            return "grid";
        }
        if (this instanceof Gallery) {
            return "gallery";
        }
        if (this instanceof Pager) {
            return "pager";
        }
        if (this instanceof Tabs) {
            return "tabs";
        }
        if (this instanceof State) {
            return "state";
        }
        if (this instanceof Custom) {
            return "custom";
        }
        if (this instanceof Indicator) {
            return "indicator";
        }
        if (this instanceof Slider) {
            return "slider";
        }
        if (this instanceof Switch) {
            return "switch";
        }
        if (this instanceof Input) {
            return "input";
        }
        if (this instanceof Select) {
            return "select";
        }
        if (this instanceof Video) {
            return "video";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: DivTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DivTemplate invoke$default(Companion companion, ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.invoke(parsingEnvironment, z, jSONObject);
        }

        public final DivTemplate invoke(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
            return ((DivJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivJsonTemplateParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
