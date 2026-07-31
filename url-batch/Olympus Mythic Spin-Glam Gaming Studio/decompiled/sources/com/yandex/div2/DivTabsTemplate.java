package com.yandex.div2;

import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivTabs;
import com.yandex.div2.DivTabsJsonParser;
import com.yandex.div2.DivTabsTabTitleDelimiterJsonParser;
import com.yandex.div2.DivTabsTabTitleStyleJsonParser;
import com.yandex.div2.DivTabsTemplate;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTabsTemplate.kt */
/* loaded from: classes9.dex */
public final class DivTabsTemplate implements JSONSerializable, JsonTemplate {
    private static final Expression ALPHA_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression DYNAMIC_HEIGHT_DEFAULT_VALUE;
    private static final Expression HAS_SEPARATOR_DEFAULT_VALUE;
    private static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    private static final Expression RESTRICT_PARENT_SCROLL_DEFAULT_VALUE;
    private static final Expression SELECTED_TAB_DEFAULT_VALUE;
    private static final Expression SEPARATOR_COLOR_DEFAULT_VALUE;
    private static final DivEdgeInsets SEPARATOR_PADDINGS_DEFAULT_VALUE;
    private static final Expression SWITCH_TABS_BY_CONTENT_SWIPE_ENABLED_DEFAULT_VALUE;
    private static final DivEdgeInsets TITLE_PADDINGS_DEFAULT_VALUE;
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
    public final Field dynamicHeight;
    public final Field extensions;
    public final Field focus;
    public final Field functions;
    public final Field hasSeparator;
    public final Field height;
    public final Field id;
    public final Field items;
    public final Field layoutProvider;
    public final Field margins;
    public final Field paddings;
    public final Field restrictParentScroll;
    public final Field reuseId;
    public final Field rowSpan;
    public final Field selectedActions;
    public final Field selectedTab;
    public final Field separatorColor;
    public final Field separatorPaddings;
    public final Field switchTabsByContentSwipeEnabled;
    public final Field tabTitleDelimiter;
    public final Field tabTitleStyle;
    public final Field titlePaddings;
    public final Field tooltips;
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

    public DivTabsTemplate(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11, Field field12, Field field13, Field field14, Field field15, Field field16, Field field17, Field field18, Field field19, Field field20, Field field21, Field field22, Field field23, Field field24, Field field25, Field field26, Field field27, Field field28, Field field29, Field field30, Field field31, Field field32, Field field33, Field field34, Field field35, Field field36, Field field37, Field field38, Field field39, Field field40, Field field41, Field field42, Field field43) {
        this.accessibility = field;
        this.alignmentHorizontal = field2;
        this.alignmentVertical = field3;
        this.alpha = field4;
        this.animators = field5;
        this.background = field6;
        this.border = field7;
        this.columnSpan = field8;
        this.disappearActions = field9;
        this.dynamicHeight = field10;
        this.extensions = field11;
        this.focus = field12;
        this.functions = field13;
        this.hasSeparator = field14;
        this.height = field15;
        this.id = field16;
        this.items = field17;
        this.layoutProvider = field18;
        this.margins = field19;
        this.paddings = field20;
        this.restrictParentScroll = field21;
        this.reuseId = field22;
        this.rowSpan = field23;
        this.selectedActions = field24;
        this.selectedTab = field25;
        this.separatorColor = field26;
        this.separatorPaddings = field27;
        this.switchTabsByContentSwipeEnabled = field28;
        this.tabTitleDelimiter = field29;
        this.tabTitleStyle = field30;
        this.titlePaddings = field31;
        this.tooltips = field32;
        this.transform = field33;
        this.transitionChange = field34;
        this.transitionIn = field35;
        this.transitionOut = field36;
        this.transitionTriggers = field37;
        this.variableTriggers = field38;
        this.variables = field39;
        this.visibility = field40;
        this.visibilityAction = field41;
        this.visibilityActions = field42;
        this.width = field43;
    }

    public /* synthetic */ DivTabsTemplate(ParsingEnvironment parsingEnvironment, DivTabsTemplate divTabsTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divTabsTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivTabsTemplate(ParsingEnvironment parsingEnvironment, DivTabsTemplate divTabsTemplate, boolean z, JSONObject jSONObject) {
        this(r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivTabs resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivTabsJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTabsJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivTabsJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTabsJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivTabsTemplate.kt */
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
        Boolean bool = Boolean.FALSE;
        DYNAMIC_HEIGHT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        HAS_SEPARATOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7, null));
        RESTRICT_PARENT_SCROLL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        SELECTED_TAB_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        SEPARATOR_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Integer.valueOf(DivSeparatorView.DEFAULT_DIVIDER_COLOR), null, 2, null);
        int i = 82;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Expression expression = null;
        Expression expression2 = null;
        SEPARATOR_PADDINGS_DEFAULT_VALUE = new DivEdgeInsets(Expression.Companion.constant$default(companion, 0L, null, 2, null), expression, Expression.Companion.constant$default(companion, 12L, null, 2, null), Expression.Companion.constant$default(companion, 12L, null, 2, null), null == true ? 1 : 0, Expression.Companion.constant$default(companion, 0L, null, 2, null), expression2, i, defaultConstructorMarker);
        SWITCH_TABS_BY_CONTENT_SWIPE_ENABLED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        TITLE_PADDINGS_DEFAULT_VALUE = new DivEdgeInsets(Expression.Companion.constant$default(companion, 8L, null, 2, null), expression, Expression.Companion.constant$default(companion, 12L, null, 2, null), Expression.Companion.constant$default(companion, 12L, null, 2, null), null == true ? 1 : 0, Expression.Companion.constant$default(companion, 0L, null, 2, null), expression2, i, defaultConstructorMarker);
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null, null, 7, null));
        CREATOR = new Function2() { // from class: com.yandex.div2.DivTabsTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivTabsTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivTabsTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    /* compiled from: DivTabsTemplate.kt */
    public static final class TabTitleStyleTemplate implements JSONSerializable, JsonTemplate {
        private static final Expression ACTIVE_BACKGROUND_COLOR_DEFAULT_VALUE;
        private static final Expression ACTIVE_TEXT_COLOR_DEFAULT_VALUE;
        private static final Expression ANIMATION_DURATION_DEFAULT_VALUE;
        private static final Expression ANIMATION_TYPE_DEFAULT_VALUE;
        private static final Function2 CREATOR;
        public static final Companion Companion = new Companion(null);
        private static final Expression FONT_SIZE_DEFAULT_VALUE;
        private static final Expression FONT_SIZE_UNIT_DEFAULT_VALUE;
        private static final Expression FONT_WEIGHT_DEFAULT_VALUE;
        private static final Expression INACTIVE_TEXT_COLOR_DEFAULT_VALUE;
        private static final Expression ITEM_SPACING_DEFAULT_VALUE;
        private static final Expression LETTER_SPACING_DEFAULT_VALUE;
        private static final DivEdgeInsets PADDINGS_DEFAULT_VALUE;
        public final Field activeBackgroundColor;
        public final Field activeFontVariationSettings;
        public final Field activeFontWeight;
        public final Field activeTextColor;
        public final Field animationDuration;
        public final Field animationType;
        public final Field cornerRadius;
        public final Field cornersRadius;
        public final Field fontFamily;
        public final Field fontSize;
        public final Field fontSizeUnit;
        public final Field fontWeight;
        public final Field inactiveBackgroundColor;
        public final Field inactiveFontVariationSettings;
        public final Field inactiveFontWeight;
        public final Field inactiveTextColor;
        public final Field itemSpacing;
        public final Field letterSpacing;
        public final Field lineHeight;
        public final Field paddings;

        public TabTitleStyleTemplate(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11, Field field12, Field field13, Field field14, Field field15, Field field16, Field field17, Field field18, Field field19, Field field20) {
            this.activeBackgroundColor = field;
            this.activeFontVariationSettings = field2;
            this.activeFontWeight = field3;
            this.activeTextColor = field4;
            this.animationDuration = field5;
            this.animationType = field6;
            this.cornerRadius = field7;
            this.cornersRadius = field8;
            this.fontFamily = field9;
            this.fontSize = field10;
            this.fontSizeUnit = field11;
            this.fontWeight = field12;
            this.inactiveBackgroundColor = field13;
            this.inactiveFontVariationSettings = field14;
            this.inactiveFontWeight = field15;
            this.inactiveTextColor = field16;
            this.itemSpacing = field17;
            this.letterSpacing = field18;
            this.lineHeight = field19;
            this.paddings = field20;
        }

        public /* synthetic */ TabTitleStyleTemplate(ParsingEnvironment parsingEnvironment, TabTitleStyleTemplate tabTitleStyleTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i & 2) != 0 ? null : tabTitleStyleTemplate, (i & 4) != 0 ? false : z, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public TabTitleStyleTemplate(ParsingEnvironment parsingEnvironment, TabTitleStyleTemplate tabTitleStyleTemplate, boolean z, JSONObject jSONObject) {
            this(r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false));
            Field.Companion companion = Field.INSTANCE;
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        @Override // com.yandex.div.json.JsonTemplate
        public DivTabs.TabTitleStyle resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivTabsTabTitleStyleJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTabsTabTitleStyleJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivTabsTabTitleStyleJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTabsTabTitleStyleJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivTabsTemplate.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        static {
            Expression.Companion companion = Expression.INSTANCE;
            ACTIVE_BACKGROUND_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, -9120, null, 2, null);
            ACTIVE_TEXT_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, -872415232, null, 2, null);
            ANIMATION_DURATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 300L, null, 2, null);
            ANIMATION_TYPE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivTabs.TabTitleStyle.AnimationType.SLIDE, null, 2, null);
            FONT_SIZE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 12L, null, 2, null);
            FONT_SIZE_UNIT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
            FONT_WEIGHT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivFontWeight.REGULAR, null, 2, null);
            INACTIVE_TEXT_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Integer.MIN_VALUE, null, 2, null);
            ITEM_SPACING_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
            LETTER_SPACING_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
            PADDINGS_DEFAULT_VALUE = new DivEdgeInsets(Expression.Companion.constant$default(companion, 6L, null, 2, null), null, Expression.Companion.constant$default(companion, 8L, null, 2, null), Expression.Companion.constant$default(companion, 8L, null, 2, null), null, Expression.Companion.constant$default(companion, 6L, null, 2, null), null, 82, null);
            CREATOR = new Function2() { // from class: com.yandex.div2.DivTabsTemplate$TabTitleStyleTemplate$Companion$CREATOR$1
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                public final DivTabsTemplate.TabTitleStyleTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return new DivTabsTemplate.TabTitleStyleTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
                }
            };
        }
    }

    /* compiled from: DivTabsTemplate.kt */
    public static final class TabTitleDelimiterTemplate implements JSONSerializable, JsonTemplate {
        private static final Function2 CREATOR;
        public static final Companion Companion = new Companion(null);
        private static final DivFixedSize HEIGHT_DEFAULT_VALUE;
        private static final DivFixedSize WIDTH_DEFAULT_VALUE;
        public final Field height;
        public final Field imageUrl;
        public final Field width;

        public TabTitleDelimiterTemplate(Field field, Field field2, Field field3) {
            this.height = field;
            this.imageUrl = field2;
            this.width = field3;
        }

        public /* synthetic */ TabTitleDelimiterTemplate(ParsingEnvironment parsingEnvironment, TabTitleDelimiterTemplate tabTitleDelimiterTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i & 2) != 0 ? null : tabTitleDelimiterTemplate, (i & 4) != 0 ? false : z, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public TabTitleDelimiterTemplate(ParsingEnvironment parsingEnvironment, TabTitleDelimiterTemplate tabTitleDelimiterTemplate, boolean z, JSONObject jSONObject) {
            this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
            Field.Companion companion = Field.INSTANCE;
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        @Override // com.yandex.div.json.JsonTemplate
        public DivTabs.TabTitleDelimiter resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivTabsTabTitleDelimiterJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTabsTabTitleDelimiterJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivTabsTabTitleDelimiterJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTabsTabTitleDelimiterJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivTabsTemplate.kt */
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
            int i = 1;
            HEIGHT_DEFAULT_VALUE = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 12L, null, 2, null), i, null == true ? 1 : 0);
            WIDTH_DEFAULT_VALUE = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 12L, null, 2, null), i, null == true ? 1 : 0);
            CREATOR = new Function2() { // from class: com.yandex.div2.DivTabsTemplate$TabTitleDelimiterTemplate$Companion$CREATOR$1
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                public final DivTabsTemplate.TabTitleDelimiterTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return new DivTabsTemplate.TabTitleDelimiterTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
                }
            };
        }
    }

    /* compiled from: DivTabsTemplate.kt */
    public static final class ItemTemplate implements JSONSerializable, JsonTemplate {
        public final Field div;
        public final Field title;
        public final Field titleClickAction;
        public static final Companion Companion = new Companion(null);
        private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivTabsTemplate$ItemTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivTabsTemplate.ItemTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivTabsTemplate.ItemTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        public ItemTemplate(Field field, Field field2, Field field3) {
            this.div = field;
            this.title = field2;
            this.titleClickAction = field3;
        }

        public /* synthetic */ ItemTemplate(ParsingEnvironment parsingEnvironment, ItemTemplate itemTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i & 2) != 0 ? null : itemTemplate, (i & 4) != 0 ? false : z, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ItemTemplate(ParsingEnvironment parsingEnvironment, ItemTemplate itemTemplate, boolean z, JSONObject jSONObject) {
            this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
            Field.Companion companion = Field.INSTANCE;
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        @Override // com.yandex.div.json.JsonTemplate
        public DivTabs.Item resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivTabsItemJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTabsItemJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivTabsItemJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTabsItemJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivTabsTemplate.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }
}
