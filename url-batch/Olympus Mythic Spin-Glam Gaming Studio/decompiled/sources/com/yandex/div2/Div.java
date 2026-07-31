package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: Div.kt */
/* loaded from: classes11.dex */
public abstract class Div implements JSONSerializable, Hashable {
    private Integer _hash;
    private Integer _propertiesHash;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.Div$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final Div invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return Div.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public /* synthetic */ Div(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: Div.kt */
    public static final class Image extends Div {
        private final DivImage value;

        public Image(DivImage divImage) {
            super(null);
            this.value = divImage;
        }

        public final DivImage getValue() {
            return this.value;
        }
    }

    private Div() {
    }

    /* compiled from: Div.kt */
    public static final class GifImage extends Div {
        private final DivGifImage value;

        public GifImage(DivGifImage divGifImage) {
            super(null);
            this.value = divGifImage;
        }

        public final DivGifImage getValue() {
            return this.value;
        }
    }

    /* compiled from: Div.kt */
    public static final class Text extends Div {
        private final DivText value;

        public Text(DivText divText) {
            super(null);
            this.value = divText;
        }

        public final DivText getValue() {
            return this.value;
        }
    }

    /* compiled from: Div.kt */
    public static final class Separator extends Div {
        private final DivSeparator value;

        public Separator(DivSeparator divSeparator) {
            super(null);
            this.value = divSeparator;
        }

        public final DivSeparator getValue() {
            return this.value;
        }
    }

    /* compiled from: Div.kt */
    public static final class Container extends Div {
        private final DivContainer value;

        public Container(DivContainer divContainer) {
            super(null);
            this.value = divContainer;
        }

        public final DivContainer getValue() {
            return this.value;
        }
    }

    /* compiled from: Div.kt */
    public static final class Grid extends Div {
        private final DivGrid value;

        public Grid(DivGrid divGrid) {
            super(null);
            this.value = divGrid;
        }

        public final DivGrid getValue() {
            return this.value;
        }
    }

    /* compiled from: Div.kt */
    public static final class Gallery extends Div {
        private final DivGallery value;

        public Gallery(DivGallery divGallery) {
            super(null);
            this.value = divGallery;
        }

        public final DivGallery getValue() {
            return this.value;
        }
    }

    /* compiled from: Div.kt */
    public static final class Pager extends Div {
        private final DivPager value;

        public Pager(DivPager divPager) {
            super(null);
            this.value = divPager;
        }

        public final DivPager getValue() {
            return this.value;
        }
    }

    /* compiled from: Div.kt */
    public static final class Tabs extends Div {
        private final DivTabs value;

        public Tabs(DivTabs divTabs) {
            super(null);
            this.value = divTabs;
        }

        public final DivTabs getValue() {
            return this.value;
        }
    }

    /* compiled from: Div.kt */
    public static final class State extends Div {
        private final DivState value;

        public State(DivState divState) {
            super(null);
            this.value = divState;
        }

        public final DivState getValue() {
            return this.value;
        }
    }

    /* compiled from: Div.kt */
    public static final class Custom extends Div {
        private final DivCustom value;

        public Custom(DivCustom divCustom) {
            super(null);
            this.value = divCustom;
        }

        public final DivCustom getValue() {
            return this.value;
        }
    }

    /* compiled from: Div.kt */
    public static final class Indicator extends Div {
        private final DivIndicator value;

        public Indicator(DivIndicator divIndicator) {
            super(null);
            this.value = divIndicator;
        }

        public final DivIndicator getValue() {
            return this.value;
        }
    }

    /* compiled from: Div.kt */
    public static final class Slider extends Div {
        private final DivSlider value;

        public Slider(DivSlider divSlider) {
            super(null);
            this.value = divSlider;
        }

        public final DivSlider getValue() {
            return this.value;
        }
    }

    /* compiled from: Div.kt */
    public static final class Switch extends Div {
        private final DivSwitch value;

        public Switch(DivSwitch divSwitch) {
            super(null);
            this.value = divSwitch;
        }

        public final DivSwitch getValue() {
            return this.value;
        }
    }

    /* compiled from: Div.kt */
    public static final class Input extends Div {
        private final DivInput value;

        public Input(DivInput divInput) {
            super(null);
            this.value = divInput;
        }

        public final DivInput getValue() {
            return this.value;
        }
    }

    /* compiled from: Div.kt */
    public static final class Select extends Div {
        private final DivSelect value;

        public Select(DivSelect divSelect) {
            super(null);
            this.value = divSelect;
        }

        public final DivSelect getValue() {
            return this.value;
        }
    }

    /* compiled from: Div.kt */
    public static final class Video extends Div {
        private final DivVideo value;

        public Video(DivVideo divVideo) {
            super(null);
            this.value = divVideo;
        }

        public final DivVideo getValue() {
            return this.value;
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int propertiesHash() {
        int propertiesHash;
        Integer num = this._propertiesHash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(getClass()).hashCode();
        if (this instanceof Image) {
            propertiesHash = ((Image) this).getValue().propertiesHash();
        } else if (this instanceof GifImage) {
            propertiesHash = ((GifImage) this).getValue().propertiesHash();
        } else if (this instanceof Text) {
            propertiesHash = ((Text) this).getValue().propertiesHash();
        } else if (this instanceof Separator) {
            propertiesHash = ((Separator) this).getValue().propertiesHash();
        } else if (this instanceof Container) {
            propertiesHash = ((Container) this).getValue().propertiesHash();
        } else if (this instanceof Grid) {
            propertiesHash = ((Grid) this).getValue().propertiesHash();
        } else if (this instanceof Gallery) {
            propertiesHash = ((Gallery) this).getValue().propertiesHash();
        } else if (this instanceof Pager) {
            propertiesHash = ((Pager) this).getValue().propertiesHash();
        } else if (this instanceof Tabs) {
            propertiesHash = ((Tabs) this).getValue().propertiesHash();
        } else if (this instanceof State) {
            propertiesHash = ((State) this).getValue().propertiesHash();
        } else if (this instanceof Custom) {
            propertiesHash = ((Custom) this).getValue().propertiesHash();
        } else if (this instanceof Indicator) {
            propertiesHash = ((Indicator) this).getValue().propertiesHash();
        } else if (this instanceof Slider) {
            propertiesHash = ((Slider) this).getValue().propertiesHash();
        } else if (this instanceof Switch) {
            propertiesHash = ((Switch) this).getValue().propertiesHash();
        } else if (this instanceof Input) {
            propertiesHash = ((Input) this).getValue().propertiesHash();
        } else if (this instanceof Select) {
            propertiesHash = ((Select) this).getValue().propertiesHash();
        } else {
            if (!(this instanceof Video)) {
                throw new NoWhenBranchMatchedException();
            }
            propertiesHash = ((Video) this).getValue().propertiesHash();
        }
        int i = hashCode + propertiesHash;
        this._propertiesHash = Integer.valueOf(i);
        return i;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int hash;
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(getClass()).hashCode();
        if (this instanceof Image) {
            hash = ((Image) this).getValue().hash();
        } else if (this instanceof GifImage) {
            hash = ((GifImage) this).getValue().hash();
        } else if (this instanceof Text) {
            hash = ((Text) this).getValue().hash();
        } else if (this instanceof Separator) {
            hash = ((Separator) this).getValue().hash();
        } else if (this instanceof Container) {
            hash = ((Container) this).getValue().hash();
        } else if (this instanceof Grid) {
            hash = ((Grid) this).getValue().hash();
        } else if (this instanceof Gallery) {
            hash = ((Gallery) this).getValue().hash();
        } else if (this instanceof Pager) {
            hash = ((Pager) this).getValue().hash();
        } else if (this instanceof Tabs) {
            hash = ((Tabs) this).getValue().hash();
        } else if (this instanceof State) {
            hash = ((State) this).getValue().hash();
        } else if (this instanceof Custom) {
            hash = ((Custom) this).getValue().hash();
        } else if (this instanceof Indicator) {
            hash = ((Indicator) this).getValue().hash();
        } else if (this instanceof Slider) {
            hash = ((Slider) this).getValue().hash();
        } else if (this instanceof Switch) {
            hash = ((Switch) this).getValue().hash();
        } else if (this instanceof Input) {
            hash = ((Input) this).getValue().hash();
        } else if (this instanceof Select) {
            hash = ((Select) this).getValue().hash();
        } else {
            if (!(this instanceof Video)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((Video) this).getValue().hash();
        }
        int i = hashCode + hash;
        this._hash = Integer.valueOf(i);
        return i;
    }

    public final boolean equals(Div div, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (div == null) {
            return false;
        }
        if (this instanceof Image) {
            DivImage value = ((Image) this).getValue();
            DivBase value2 = div.value();
            return value.equals(value2 instanceof DivImage ? (DivImage) value2 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof GifImage) {
            DivGifImage value3 = ((GifImage) this).getValue();
            DivBase value4 = div.value();
            return value3.equals(value4 instanceof DivGifImage ? (DivGifImage) value4 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Text) {
            DivText value5 = ((Text) this).getValue();
            DivBase value6 = div.value();
            return value5.equals(value6 instanceof DivText ? (DivText) value6 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Separator) {
            DivSeparator value7 = ((Separator) this).getValue();
            DivBase value8 = div.value();
            return value7.equals(value8 instanceof DivSeparator ? (DivSeparator) value8 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Container) {
            DivContainer value9 = ((Container) this).getValue();
            DivBase value10 = div.value();
            return value9.equals(value10 instanceof DivContainer ? (DivContainer) value10 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Grid) {
            DivGrid value11 = ((Grid) this).getValue();
            DivBase value12 = div.value();
            return value11.equals(value12 instanceof DivGrid ? (DivGrid) value12 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Gallery) {
            DivGallery value13 = ((Gallery) this).getValue();
            DivBase value14 = div.value();
            return value13.equals(value14 instanceof DivGallery ? (DivGallery) value14 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Pager) {
            DivPager value15 = ((Pager) this).getValue();
            DivBase value16 = div.value();
            return value15.equals(value16 instanceof DivPager ? (DivPager) value16 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Tabs) {
            DivTabs value17 = ((Tabs) this).getValue();
            DivBase value18 = div.value();
            return value17.equals(value18 instanceof DivTabs ? (DivTabs) value18 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof State) {
            DivState value19 = ((State) this).getValue();
            DivBase value20 = div.value();
            return value19.equals(value20 instanceof DivState ? (DivState) value20 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Custom) {
            DivCustom value21 = ((Custom) this).getValue();
            DivBase value22 = div.value();
            return value21.equals(value22 instanceof DivCustom ? (DivCustom) value22 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Indicator) {
            DivIndicator value23 = ((Indicator) this).getValue();
            DivBase value24 = div.value();
            return value23.equals(value24 instanceof DivIndicator ? (DivIndicator) value24 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Slider) {
            DivSlider value25 = ((Slider) this).getValue();
            DivBase value26 = div.value();
            return value25.equals(value26 instanceof DivSlider ? (DivSlider) value26 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Switch) {
            DivSwitch value27 = ((Switch) this).getValue();
            DivBase value28 = div.value();
            return value27.equals(value28 instanceof DivSwitch ? (DivSwitch) value28 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Input) {
            DivInput value29 = ((Input) this).getValue();
            DivBase value30 = div.value();
            return value29.equals(value30 instanceof DivInput ? (DivInput) value30 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Select) {
            DivSelect value31 = ((Select) this).getValue();
            DivBase value32 = div.value();
            return value31.equals(value32 instanceof DivSelect ? (DivSelect) value32 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof Video)) {
            throw new NoWhenBranchMatchedException();
        }
        DivVideo value33 = ((Video) this).getValue();
        DivBase value34 = div.value();
        return value33.equals(value34 instanceof DivVideo ? (DivVideo) value34 : null, expressionResolver, expressionResolver2);
    }

    public final DivBase value() {
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
        return ((DivJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: Div.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Div fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
