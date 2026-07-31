package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivText;
import com.yandex.div2.DivTextImageAccessibilityJsonParser;
import com.yandex.div2.DivTextImageJsonParser;
import com.yandex.div2.DivTextJsonParser;
import com.yandex.div2.DivTextRangeJsonParser;
import com.yandex.div2.DivTextTemplate;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTextTemplate.kt */
/* loaded from: classes10.dex */
public final class DivTextTemplate implements JSONSerializable, JsonTemplate {
    private static final DivAnimation ACTION_ANIMATION_DEFAULT_VALUE;
    private static final Expression ALPHA_DEFAULT_VALUE;
    private static final Expression CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression FONT_SIZE_DEFAULT_VALUE;
    private static final Expression FONT_SIZE_UNIT_DEFAULT_VALUE;
    private static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    private static final Expression LETTER_SPACING_DEFAULT_VALUE;
    private static final Expression SELECTABLE_DEFAULT_VALUE;
    private static final Expression STRIKE_DEFAULT_VALUE;
    private static final Expression TEXT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE;
    private static final Expression TEXT_ALIGNMENT_VERTICAL_DEFAULT_VALUE;
    private static final Expression TEXT_COLOR_DEFAULT_VALUE;
    private static final Expression TIGHTEN_WIDTH_DEFAULT_VALUE;
    private static final Expression TRUNCATE_DEFAULT_VALUE;
    private static final Expression UNDERLINE_DEFAULT_VALUE;
    private static final Expression VISIBILITY_DEFAULT_VALUE;
    private static final DivSize.MatchParent WIDTH_DEFAULT_VALUE;
    public final Field accessibility;
    public final Field action;
    public final Field actionAnimation;
    public final Field actions;
    public final Field alignmentHorizontal;
    public final Field alignmentVertical;
    public final Field alpha;
    public final Field animators;
    public final Field autoEllipsize;
    public final Field background;
    public final Field border;
    public final Field captureFocusOnAction;
    public final Field columnSpan;
    public final Field disappearActions;
    public final Field doubletapActions;
    public final Field ellipsis;
    public final Field extensions;
    public final Field focus;
    public final Field focusedTextColor;
    public final Field fontFamily;
    public final Field fontFeatureSettings;
    public final Field fontSize;
    public final Field fontSizeUnit;
    public final Field fontVariationSettings;
    public final Field fontWeight;
    public final Field fontWeightValue;
    public final Field functions;
    public final Field height;
    public final Field hoverEndActions;
    public final Field hoverStartActions;
    public final Field id;
    public final Field images;
    public final Field layoutProvider;
    public final Field letterSpacing;
    public final Field lineHeight;
    public final Field longtapActions;
    public final Field margins;
    public final Field maxLines;
    public final Field minHiddenLines;
    public final Field paddings;
    public final Field pressEndActions;
    public final Field pressStartActions;
    public final Field ranges;
    public final Field reuseId;
    public final Field rowSpan;
    public final Field selectable;
    public final Field selectedActions;
    public final Field strike;
    public final Field text;
    public final Field textAlignmentHorizontal;
    public final Field textAlignmentVertical;
    public final Field textColor;
    public final Field textGradient;
    public final Field textShadow;
    public final Field tightenWidth;
    public final Field tooltips;
    public final Field transform;
    public final Field transitionChange;
    public final Field transitionIn;
    public final Field transitionOut;
    public final Field transitionTriggers;
    public final Field truncate;
    public final Field underline;
    public final Field variableTriggers;
    public final Field variables;
    public final Field visibility;
    public final Field visibilityAction;
    public final Field visibilityActions;
    public final Field width;

    public DivTextTemplate(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11, Field field12, Field field13, Field field14, Field field15, Field field16, Field field17, Field field18, Field field19, Field field20, Field field21, Field field22, Field field23, Field field24, Field field25, Field field26, Field field27, Field field28, Field field29, Field field30, Field field31, Field field32, Field field33, Field field34, Field field35, Field field36, Field field37, Field field38, Field field39, Field field40, Field field41, Field field42, Field field43, Field field44, Field field45, Field field46, Field field47, Field field48, Field field49, Field field50, Field field51, Field field52, Field field53, Field field54, Field field55, Field field56, Field field57, Field field58, Field field59, Field field60, Field field61, Field field62, Field field63, Field field64, Field field65, Field field66, Field field67, Field field68, Field field69) {
        this.accessibility = field;
        this.action = field2;
        this.actionAnimation = field3;
        this.actions = field4;
        this.alignmentHorizontal = field5;
        this.alignmentVertical = field6;
        this.alpha = field7;
        this.animators = field8;
        this.autoEllipsize = field9;
        this.background = field10;
        this.border = field11;
        this.captureFocusOnAction = field12;
        this.columnSpan = field13;
        this.disappearActions = field14;
        this.doubletapActions = field15;
        this.ellipsis = field16;
        this.extensions = field17;
        this.focus = field18;
        this.focusedTextColor = field19;
        this.fontFamily = field20;
        this.fontFeatureSettings = field21;
        this.fontSize = field22;
        this.fontSizeUnit = field23;
        this.fontVariationSettings = field24;
        this.fontWeight = field25;
        this.fontWeightValue = field26;
        this.functions = field27;
        this.height = field28;
        this.hoverEndActions = field29;
        this.hoverStartActions = field30;
        this.id = field31;
        this.images = field32;
        this.layoutProvider = field33;
        this.letterSpacing = field34;
        this.lineHeight = field35;
        this.longtapActions = field36;
        this.margins = field37;
        this.maxLines = field38;
        this.minHiddenLines = field39;
        this.paddings = field40;
        this.pressEndActions = field41;
        this.pressStartActions = field42;
        this.ranges = field43;
        this.reuseId = field44;
        this.rowSpan = field45;
        this.selectable = field46;
        this.selectedActions = field47;
        this.strike = field48;
        this.text = field49;
        this.textAlignmentHorizontal = field50;
        this.textAlignmentVertical = field51;
        this.textColor = field52;
        this.textGradient = field53;
        this.textShadow = field54;
        this.tightenWidth = field55;
        this.tooltips = field56;
        this.transform = field57;
        this.transitionChange = field58;
        this.transitionIn = field59;
        this.transitionOut = field60;
        this.transitionTriggers = field61;
        this.truncate = field62;
        this.underline = field63;
        this.variableTriggers = field64;
        this.variables = field65;
        this.visibility = field66;
        this.visibilityAction = field67;
        this.visibilityActions = field68;
        this.width = field69;
    }

    public /* synthetic */ DivTextTemplate(ParsingEnvironment parsingEnvironment, DivTextTemplate divTextTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divTextTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivTextTemplate(ParsingEnvironment parsingEnvironment, DivTextTemplate divTextTemplate, boolean z, JSONObject jSONObject) {
        this(r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivText resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivTextJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivTextJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivTextTemplate.kt */
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
        Expression constant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression constant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression constant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double valueOf = Double.valueOf(1.0d);
        ACTION_ANIMATION_DEFAULT_VALUE = new DivAnimation(constant$default, constant$default2, null, null, constant$default3, null, null, Expression.Companion.constant$default(companion, valueOf, null, 2, null), 108, null);
        ALPHA_DEFAULT_VALUE = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        FONT_SIZE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        FONT_SIZE_UNIT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        LETTER_SPACING_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        SELECTABLE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        DivLineStyle divLineStyle = DivLineStyle.NONE;
        STRIKE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divLineStyle, null, 2, null);
        TEXT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivAlignmentHorizontal.START, null, 2, null);
        TEXT_ALIGNMENT_VERTICAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivAlignmentVertical.TOP, null, 2, null);
        TEXT_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, -16777216, null, 2, null);
        TIGHTEN_WIDTH_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        TRUNCATE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivText.Truncate.END, null, 2, null);
        UNDERLINE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divLineStyle, null, 2, null);
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null, null == true ? 1 : 0, 7, null));
        CREATOR = new Function2() { // from class: com.yandex.div2.DivTextTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivTextTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivTextTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    /* compiled from: DivTextTemplate.kt */
    public static final class RangeTemplate implements JSONSerializable, JsonTemplate {
        private static final Expression BASELINE_OFFSET_DEFAULT_VALUE;
        private static final Function2 CREATOR;
        public static final Companion Companion = new Companion(null);
        private static final Expression FONT_SIZE_UNIT_DEFAULT_VALUE;
        private static final Expression START_DEFAULT_VALUE;
        public final Field actions;
        public final Field alignmentVertical;
        public final Field background;
        public final Field baselineOffset;
        public final Field border;
        public final Field end;
        public final Field fontFamily;
        public final Field fontFeatureSettings;
        public final Field fontSize;
        public final Field fontSizeUnit;
        public final Field fontVariationSettings;
        public final Field fontWeight;
        public final Field fontWeightValue;
        public final Field letterSpacing;
        public final Field lineHeight;
        public final Field mask;
        public final Field start;
        public final Field strike;
        public final Field textColor;
        public final Field textShadow;
        public final Field topOffset;
        public final Field underline;

        public RangeTemplate(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11, Field field12, Field field13, Field field14, Field field15, Field field16, Field field17, Field field18, Field field19, Field field20, Field field21, Field field22) {
            this.actions = field;
            this.alignmentVertical = field2;
            this.background = field3;
            this.baselineOffset = field4;
            this.border = field5;
            this.end = field6;
            this.fontFamily = field7;
            this.fontFeatureSettings = field8;
            this.fontSize = field9;
            this.fontSizeUnit = field10;
            this.fontVariationSettings = field11;
            this.fontWeight = field12;
            this.fontWeightValue = field13;
            this.letterSpacing = field14;
            this.lineHeight = field15;
            this.mask = field16;
            this.start = field17;
            this.strike = field18;
            this.textColor = field19;
            this.textShadow = field20;
            this.topOffset = field21;
            this.underline = field22;
        }

        public /* synthetic */ RangeTemplate(ParsingEnvironment parsingEnvironment, RangeTemplate rangeTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i & 2) != 0 ? null : rangeTemplate, (i & 4) != 0 ? false : z, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public RangeTemplate(ParsingEnvironment parsingEnvironment, RangeTemplate rangeTemplate, boolean z, JSONObject jSONObject) {
            this(r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false));
            Field.Companion companion = Field.INSTANCE;
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        @Override // com.yandex.div.json.JsonTemplate
        public DivText.Range resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivTextRangeJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextRangeJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivTextRangeJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextRangeJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivTextTemplate.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        static {
            Expression.Companion companion = Expression.INSTANCE;
            BASELINE_OFFSET_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
            FONT_SIZE_UNIT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
            START_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
            CREATOR = new Function2() { // from class: com.yandex.div2.DivTextTemplate$RangeTemplate$Companion$CREATOR$1
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                public final DivTextTemplate.RangeTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return new DivTextTemplate.RangeTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
                }
            };
        }
    }

    /* compiled from: DivTextTemplate.kt */
    public static final class ImageTemplate implements JSONSerializable, JsonTemplate {
        private static final Expression ALIGNMENT_VERTICAL_DEFAULT_VALUE;
        private static final Function2 CREATOR;
        public static final Companion Companion = new Companion(null);
        private static final DivFixedSize HEIGHT_DEFAULT_VALUE;
        private static final Expression INDEXING_DIRECTION_DEFAULT_VALUE;
        private static final Expression PRELOAD_REQUIRED_DEFAULT_VALUE;
        private static final Expression TINT_MODE_DEFAULT_VALUE;
        private static final DivFixedSize WIDTH_DEFAULT_VALUE;
        public final Field accessibility;
        public final Field alignmentVertical;
        public final Field height;
        public final Field indexingDirection;
        public final Field preloadRequired;
        public final Field start;
        public final Field tintColor;
        public final Field tintMode;
        public final Field url;
        public final Field width;

        public ImageTemplate(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10) {
            this.accessibility = field;
            this.alignmentVertical = field2;
            this.height = field3;
            this.indexingDirection = field4;
            this.preloadRequired = field5;
            this.start = field6;
            this.tintColor = field7;
            this.tintMode = field8;
            this.url = field9;
            this.width = field10;
        }

        public /* synthetic */ ImageTemplate(ParsingEnvironment parsingEnvironment, ImageTemplate imageTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i & 2) != 0 ? null : imageTemplate, (i & 4) != 0 ? false : z, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ImageTemplate(ParsingEnvironment parsingEnvironment, ImageTemplate imageTemplate, boolean z, JSONObject jSONObject) {
            this(r12.nullField(false), r12.nullField(false), r12.nullField(false), r12.nullField(false), r12.nullField(false), r12.nullField(false), r12.nullField(false), r12.nullField(false), r12.nullField(false), r12.nullField(false));
            Field.Companion companion = Field.INSTANCE;
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        @Override // com.yandex.div.json.JsonTemplate
        public DivText.Image resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivTextImageJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextImageJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivTextImageJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextImageJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivTextTemplate.kt */
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
            ALIGNMENT_VERTICAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivTextAlignmentVertical.CENTER, null, 2, null);
            int i = 1;
            HEIGHT_DEFAULT_VALUE = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 20L, null, 2, null), i, null == true ? 1 : 0);
            INDEXING_DIRECTION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivText.Image.IndexingDirection.NORMAL, null, 2, null);
            PRELOAD_REQUIRED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
            TINT_MODE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivBlendMode.SOURCE_IN, null, 2, null);
            WIDTH_DEFAULT_VALUE = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 20L, null, 2, null), i, null == true ? 1 : 0);
            CREATOR = new Function2() { // from class: com.yandex.div2.DivTextTemplate$ImageTemplate$Companion$CREATOR$1
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                public final DivTextTemplate.ImageTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return new DivTextTemplate.ImageTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
                }
            };
        }

        /* compiled from: DivTextTemplate.kt */
        public static final class AccessibilityTemplate implements JSONSerializable, JsonTemplate {
            public final Field description;
            public final Field type;
            public static final Companion Companion = new Companion(null);
            private static final DivText.Image.Accessibility.Type TYPE_DEFAULT_VALUE = DivText.Image.Accessibility.Type.AUTO;
            private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivTextTemplate$ImageTemplate$AccessibilityTemplate$Companion$CREATOR$1
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                public final DivTextTemplate.ImageTemplate.AccessibilityTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return new DivTextTemplate.ImageTemplate.AccessibilityTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
                }
            };

            public AccessibilityTemplate(Field field, Field field2) {
                this.description = field;
                this.type = field2;
            }

            public /* synthetic */ AccessibilityTemplate(ParsingEnvironment parsingEnvironment, AccessibilityTemplate accessibilityTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(parsingEnvironment, (i & 2) != 0 ? null : accessibilityTemplate, (i & 4) != 0 ? false : z, jSONObject);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public AccessibilityTemplate(ParsingEnvironment parsingEnvironment, AccessibilityTemplate accessibilityTemplate, boolean z, JSONObject jSONObject) {
                this(r1.nullField(false), r1.nullField(false));
                Field.Companion companion = Field.INSTANCE;
                throw new UnsupportedOperationException("Do not use this constructor directly.");
            }

            @Override // com.yandex.div.json.JsonTemplate
            public DivText.Image.Accessibility resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((DivTextImageAccessibilityJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextImageAccessibilityJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
            }

            @Override // com.yandex.div.json.JSONSerializable
            public JSONObject writeToJSON() {
                return ((DivTextImageAccessibilityJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextImageAccessibilityJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
            }

            /* compiled from: DivTextTemplate.kt */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }
        }
    }

    /* compiled from: DivTextTemplate.kt */
    public static final class EllipsisTemplate implements JSONSerializable, JsonTemplate {
        public final Field actions;
        public final Field images;
        public final Field ranges;
        public final Field text;
        public static final Companion Companion = new Companion(null);
        private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivTextTemplate$EllipsisTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivTextTemplate.EllipsisTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivTextTemplate.EllipsisTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        public EllipsisTemplate(Field field, Field field2, Field field3, Field field4) {
            this.actions = field;
            this.images = field2;
            this.ranges = field3;
            this.text = field4;
        }

        public /* synthetic */ EllipsisTemplate(ParsingEnvironment parsingEnvironment, EllipsisTemplate ellipsisTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i & 2) != 0 ? null : ellipsisTemplate, (i & 4) != 0 ? false : z, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public EllipsisTemplate(ParsingEnvironment parsingEnvironment, EllipsisTemplate ellipsisTemplate, boolean z, JSONObject jSONObject) {
            this(r2.nullField(false), r2.nullField(false), r2.nullField(false), r2.nullField(false));
            Field.Companion companion = Field.INSTANCE;
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        @Override // com.yandex.div.json.JsonTemplate
        public DivText.Ellipsis resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivTextEllipsisJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextEllipsisJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivTextEllipsisJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextEllipsisJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivTextTemplate.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }
}
