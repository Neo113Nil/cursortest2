package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivContainerJsonParser;
import com.yandex.div2.DivContainerSeparatorJsonParser;
import com.yandex.div2.DivContainerTemplate;
import com.yandex.div2.DivSize;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivContainerTemplate.kt */
/* loaded from: classes10.dex */
public final class DivContainerTemplate implements JSONSerializable, JsonTemplate {
    private static final DivAnimation ACTION_ANIMATION_DEFAULT_VALUE;
    private static final Expression ALPHA_DEFAULT_VALUE;
    private static final Expression CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE;
    private static final Expression CLIP_TO_BOUNDS_DEFAULT_VALUE;
    private static final Expression CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE;
    private static final Expression CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    private static final Expression ITEM_SPACING_DEFAULT_VALUE;
    private static final Expression LAYOUT_MODE_DEFAULT_VALUE;
    private static final Expression LINE_SPACING_DEFAULT_VALUE;
    private static final Expression ORIENTATION_DEFAULT_VALUE;
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
    public final Field aspect;
    public final Field background;
    public final Field border;
    public final Field captureFocusOnAction;
    public final Field clipToBounds;
    public final Field columnSpan;
    public final Field contentAlignmentHorizontal;
    public final Field contentAlignmentVertical;
    public final Field disappearActions;
    public final Field doubletapActions;
    public final Field extensions;
    public final Field focus;
    public final Field functions;
    public final Field height;
    public final Field hoverEndActions;
    public final Field hoverStartActions;
    public final Field id;
    public final Field itemBuilder;
    public final Field itemSpacing;
    public final Field items;
    public final Field layoutMode;
    public final Field layoutProvider;
    public final Field lineSeparator;
    public final Field lineSpacing;
    public final Field longtapActions;
    public final Field margins;
    public final Field orientation;
    public final Field paddings;
    public final Field pressEndActions;
    public final Field pressStartActions;
    public final Field reuseId;
    public final Field rowSpan;
    public final Field selectedActions;
    public final Field separator;
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

    public DivContainerTemplate(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11, Field field12, Field field13, Field field14, Field field15, Field field16, Field field17, Field field18, Field field19, Field field20, Field field21, Field field22, Field field23, Field field24, Field field25, Field field26, Field field27, Field field28, Field field29, Field field30, Field field31, Field field32, Field field33, Field field34, Field field35, Field field36, Field field37, Field field38, Field field39, Field field40, Field field41, Field field42, Field field43, Field field44, Field field45, Field field46, Field field47, Field field48, Field field49, Field field50, Field field51, Field field52, Field field53, Field field54) {
        this.accessibility = field;
        this.action = field2;
        this.actionAnimation = field3;
        this.actions = field4;
        this.alignmentHorizontal = field5;
        this.alignmentVertical = field6;
        this.alpha = field7;
        this.animators = field8;
        this.aspect = field9;
        this.background = field10;
        this.border = field11;
        this.captureFocusOnAction = field12;
        this.clipToBounds = field13;
        this.columnSpan = field14;
        this.contentAlignmentHorizontal = field15;
        this.contentAlignmentVertical = field16;
        this.disappearActions = field17;
        this.doubletapActions = field18;
        this.extensions = field19;
        this.focus = field20;
        this.functions = field21;
        this.height = field22;
        this.hoverEndActions = field23;
        this.hoverStartActions = field24;
        this.id = field25;
        this.itemBuilder = field26;
        this.itemSpacing = field27;
        this.items = field28;
        this.layoutMode = field29;
        this.layoutProvider = field30;
        this.lineSeparator = field31;
        this.lineSpacing = field32;
        this.longtapActions = field33;
        this.margins = field34;
        this.orientation = field35;
        this.paddings = field36;
        this.pressEndActions = field37;
        this.pressStartActions = field38;
        this.reuseId = field39;
        this.rowSpan = field40;
        this.selectedActions = field41;
        this.separator = field42;
        this.tooltips = field43;
        this.transform = field44;
        this.transitionChange = field45;
        this.transitionIn = field46;
        this.transitionOut = field47;
        this.transitionTriggers = field48;
        this.variableTriggers = field49;
        this.variables = field50;
        this.visibility = field51;
        this.visibilityAction = field52;
        this.visibilityActions = field53;
        this.width = field54;
    }

    public /* synthetic */ DivContainerTemplate(ParsingEnvironment parsingEnvironment, DivContainerTemplate divContainerTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divContainerTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivContainerTemplate(ParsingEnvironment parsingEnvironment, DivContainerTemplate divContainerTemplate, boolean z, JSONObject jSONObject) {
        this(r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivContainer resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivContainerJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivContainerJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivContainerJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivContainerJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivContainerTemplate.kt */
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
        Boolean bool = Boolean.TRUE;
        CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        CLIP_TO_BOUNDS_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivContentAlignmentHorizontal.START, null, 2, null);
        CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivContentAlignmentVertical.TOP, null, 2, null);
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        ITEM_SPACING_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        LAYOUT_MODE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivContainer.LayoutMode.NO_WRAP, null, 2, null);
        LINE_SPACING_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        ORIENTATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivContainer.Orientation.VERTICAL, null, 2, null);
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null, null == true ? 1 : 0, 7, null));
        CREATOR = new Function2() { // from class: com.yandex.div2.DivContainerTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivContainerTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivContainerTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    /* compiled from: DivContainerTemplate.kt */
    public static final class SeparatorTemplate implements JSONSerializable, JsonTemplate {
        private static final Function2 CREATOR;
        public static final Companion Companion = new Companion(null);
        private static final Expression SHOW_AT_END_DEFAULT_VALUE;
        private static final Expression SHOW_AT_START_DEFAULT_VALUE;
        private static final Expression SHOW_BETWEEN_DEFAULT_VALUE;
        public final Field margins;
        public final Field showAtEnd;
        public final Field showAtStart;
        public final Field showBetween;
        public final Field style;

        public SeparatorTemplate(Field field, Field field2, Field field3, Field field4, Field field5) {
            this.margins = field;
            this.showAtEnd = field2;
            this.showAtStart = field3;
            this.showBetween = field4;
            this.style = field5;
        }

        public /* synthetic */ SeparatorTemplate(ParsingEnvironment parsingEnvironment, SeparatorTemplate separatorTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i & 2) != 0 ? null : separatorTemplate, (i & 4) != 0 ? false : z, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public SeparatorTemplate(ParsingEnvironment parsingEnvironment, SeparatorTemplate separatorTemplate, boolean z, JSONObject jSONObject) {
            this(r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false));
            Field.Companion companion = Field.INSTANCE;
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        @Override // com.yandex.div.json.JsonTemplate
        public DivContainer.Separator resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivContainerSeparatorJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivContainerSeparatorJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivContainerSeparatorJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivContainerSeparatorJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivContainerTemplate.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        static {
            Expression.Companion companion = Expression.INSTANCE;
            Boolean bool = Boolean.FALSE;
            SHOW_AT_END_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
            SHOW_AT_START_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
            SHOW_BETWEEN_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
            CREATOR = new Function2() { // from class: com.yandex.div2.DivContainerTemplate$SeparatorTemplate$Companion$CREATOR$1
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                public final DivContainerTemplate.SeparatorTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return new DivContainerTemplate.SeparatorTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
                }
            };
        }
    }
}
