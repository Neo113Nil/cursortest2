package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSlider;
import com.yandex.div2.DivSliderJsonParser;
import com.yandex.div2.DivSliderTemplate;
import com.yandex.div2.DivSliderTextStyleJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivSliderTemplate.kt */
/* loaded from: classes12.dex */
public final class DivSliderTemplate implements JSONSerializable, JsonTemplate {
    private static final Expression ALPHA_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    private static final Expression IS_ENABLED_DEFAULT_VALUE;
    private static final Expression MAX_VALUE_DEFAULT_VALUE;
    private static final Expression MIN_VALUE_DEFAULT_VALUE;
    private static final Expression VISIBILITY_DEFAULT_VALUE;
    private static final DivSize.MatchParent WIDTH_DEFAULT_VALUE;
    public final Field accessibility;
    public final Field alignmentHorizontal;
    public final Field alignmentVertical;
    public final Field alpha;
    public final Field animators;
    public final Field background;
    public final Field border;
    public final Field columnSpan;
    public final Field disappearActions;
    public final Field extensions;
    public final Field focus;
    public final Field functions;
    public final Field height;
    public final Field id;
    public final Field isEnabled;
    public final Field layoutProvider;
    public final Field margins;
    public final Field maxValue;
    public final Field minValue;
    public final Field paddings;
    public final Field ranges;
    public final Field reuseId;
    public final Field rowSpan;
    public final Field secondaryValueAccessibility;
    public final Field selectedActions;
    public final Field thumbSecondaryStyle;
    public final Field thumbSecondaryTextStyle;
    public final Field thumbSecondaryValueVariable;
    public final Field thumbStyle;
    public final Field thumbTextStyle;
    public final Field thumbValueVariable;
    public final Field tickMarkActiveStyle;
    public final Field tickMarkInactiveStyle;
    public final Field tooltips;
    public final Field trackActiveStyle;
    public final Field trackInactiveStyle;
    public final Field transform;
    public final Field transitionChange;
    public final Field transitionIn;
    public final Field transitionOut;
    public final Field transitionTriggers;
    public final Field variableTriggers;
    public final Field variables;
    public final Field visibility;
    public final Field visibilityAction;
    public final Field visibilityActions;
    public final Field width;

    public DivSliderTemplate(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11, Field field12, Field field13, Field field14, Field field15, Field field16, Field field17, Field field18, Field field19, Field field20, Field field21, Field field22, Field field23, Field field24, Field field25, Field field26, Field field27, Field field28, Field field29, Field field30, Field field31, Field field32, Field field33, Field field34, Field field35, Field field36, Field field37, Field field38, Field field39, Field field40, Field field41, Field field42, Field field43, Field field44, Field field45, Field field46, Field field47) {
        this.accessibility = field;
        this.alignmentHorizontal = field2;
        this.alignmentVertical = field3;
        this.alpha = field4;
        this.animators = field5;
        this.background = field6;
        this.border = field7;
        this.columnSpan = field8;
        this.disappearActions = field9;
        this.extensions = field10;
        this.focus = field11;
        this.functions = field12;
        this.height = field13;
        this.id = field14;
        this.isEnabled = field15;
        this.layoutProvider = field16;
        this.margins = field17;
        this.maxValue = field18;
        this.minValue = field19;
        this.paddings = field20;
        this.ranges = field21;
        this.reuseId = field22;
        this.rowSpan = field23;
        this.secondaryValueAccessibility = field24;
        this.selectedActions = field25;
        this.thumbSecondaryStyle = field26;
        this.thumbSecondaryTextStyle = field27;
        this.thumbSecondaryValueVariable = field28;
        this.thumbStyle = field29;
        this.thumbTextStyle = field30;
        this.thumbValueVariable = field31;
        this.tickMarkActiveStyle = field32;
        this.tickMarkInactiveStyle = field33;
        this.tooltips = field34;
        this.trackActiveStyle = field35;
        this.trackInactiveStyle = field36;
        this.transform = field37;
        this.transitionChange = field38;
        this.transitionIn = field39;
        this.transitionOut = field40;
        this.transitionTriggers = field41;
        this.variableTriggers = field42;
        this.variables = field43;
        this.visibility = field44;
        this.visibilityAction = field45;
        this.visibilityActions = field46;
        this.width = field47;
    }

    public /* synthetic */ DivSliderTemplate(ParsingEnvironment parsingEnvironment, DivSliderTemplate divSliderTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divSliderTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivSliderTemplate(ParsingEnvironment parsingEnvironment, DivSliderTemplate divSliderTemplate, boolean z, JSONObject jSONObject) {
        this(r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivSlider resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivSliderJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSliderJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivSliderJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSliderJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivSliderTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Expression.Companion companion = Expression.INSTANCE;
        ALPHA_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7, null));
        IS_ENABLED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        MAX_VALUE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        MIN_VALUE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null, null, 7, null == true ? 1 : 0));
        CREATOR = new Function2() { // from class: com.yandex.div2.DivSliderTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivSliderTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivSliderTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    /* compiled from: DivSliderTemplate.kt */
    public static final class TextStyleTemplate implements JSONSerializable, JsonTemplate {
        private static final Function2 CREATOR;
        public static final Companion Companion = new Companion(null);
        private static final Expression FONT_SIZE_DEFAULT_VALUE;
        private static final Expression FONT_SIZE_UNIT_DEFAULT_VALUE;
        private static final Expression LETTER_SPACING_DEFAULT_VALUE;
        private static final Expression TEXT_COLOR_DEFAULT_VALUE;
        public final Field fontFamily;
        public final Field fontSize;
        public final Field fontSizeUnit;
        public final Field fontVariationSettings;
        public final Field fontWeight;
        public final Field fontWeightValue;
        public final Field letterSpacing;
        public final Field offset;
        public final Field textColor;

        public TextStyleTemplate(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9) {
            this.fontFamily = field;
            this.fontSize = field2;
            this.fontSizeUnit = field3;
            this.fontVariationSettings = field4;
            this.fontWeight = field5;
            this.fontWeightValue = field6;
            this.letterSpacing = field7;
            this.offset = field8;
            this.textColor = field9;
        }

        public /* synthetic */ TextStyleTemplate(ParsingEnvironment parsingEnvironment, TextStyleTemplate textStyleTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i & 2) != 0 ? null : textStyleTemplate, (i & 4) != 0 ? false : z, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public TextStyleTemplate(ParsingEnvironment parsingEnvironment, TextStyleTemplate textStyleTemplate, boolean z, JSONObject jSONObject) {
            this(r11.nullField(false), r11.nullField(false), r11.nullField(false), r11.nullField(false), r11.nullField(false), r11.nullField(false), r11.nullField(false), r11.nullField(false), r11.nullField(false));
            Field.Companion companion = Field.INSTANCE;
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        @Override // com.yandex.div.json.JsonTemplate
        public DivSlider.TextStyle resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivSliderTextStyleJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSliderTextStyleJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivSliderTextStyleJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSliderTextStyleJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivSliderTemplate.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        static {
            Expression.Companion companion = Expression.INSTANCE;
            FONT_SIZE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 12L, null, 2, null);
            FONT_SIZE_UNIT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
            LETTER_SPACING_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
            TEXT_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, -16777216, null, 2, null);
            CREATOR = new Function2() { // from class: com.yandex.div2.DivSliderTemplate$TextStyleTemplate$Companion$CREATOR$1
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                public final DivSliderTemplate.TextStyleTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return new DivSliderTemplate.TextStyleTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
                }
            };
        }
    }

    /* compiled from: DivSliderTemplate.kt */
    public static final class RangeTemplate implements JSONSerializable, JsonTemplate {
        public final Field end;
        public final Field margins;
        public final Field start;
        public final Field trackActiveStyle;
        public final Field trackInactiveStyle;
        public static final Companion Companion = new Companion(null);
        private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivSliderTemplate$RangeTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivSliderTemplate.RangeTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivSliderTemplate.RangeTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        public RangeTemplate(Field field, Field field2, Field field3, Field field4, Field field5) {
            this.end = field;
            this.margins = field2;
            this.start = field3;
            this.trackActiveStyle = field4;
            this.trackInactiveStyle = field5;
        }

        public /* synthetic */ RangeTemplate(ParsingEnvironment parsingEnvironment, RangeTemplate rangeTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i & 2) != 0 ? null : rangeTemplate, (i & 4) != 0 ? false : z, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public RangeTemplate(ParsingEnvironment parsingEnvironment, RangeTemplate rangeTemplate, boolean z, JSONObject jSONObject) {
            this(r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false));
            Field.Companion companion = Field.INSTANCE;
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        @Override // com.yandex.div.json.JsonTemplate
        public DivSlider.Range resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivSliderRangeJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSliderRangeJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivSliderRangeJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSliderRangeJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivSliderTemplate.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }
}
