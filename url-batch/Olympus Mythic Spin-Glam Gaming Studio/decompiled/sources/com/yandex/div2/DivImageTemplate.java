package com.yandex.div2;

import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivImageJsonParser;
import com.yandex.div2.DivSize;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivImageTemplate.kt */
/* loaded from: classes11.dex */
public final class DivImageTemplate implements JSONSerializable, JsonTemplate {
    private static final DivAnimation ACTION_ANIMATION_DEFAULT_VALUE;
    private static final Expression ALPHA_DEFAULT_VALUE;
    private static final Expression CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE;
    private static final Expression CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE;
    private static final Expression CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    private static final Expression HIGH_PRIORITY_PREVIEW_SHOW_DEFAULT_VALUE;
    private static final Expression PLACEHOLDER_COLOR_DEFAULT_VALUE;
    private static final Expression PRELOAD_REQUIRED_DEFAULT_VALUE;
    private static final Expression SCALE_DEFAULT_VALUE;
    private static final Expression TINT_MODE_DEFAULT_VALUE;
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
    public final Field appearanceAnimation;
    public final Field aspect;
    public final Field background;
    public final Field border;
    public final Field captureFocusOnAction;
    public final Field columnSpan;
    public final Field contentAlignmentHorizontal;
    public final Field contentAlignmentVertical;
    public final Field disappearActions;
    public final Field doubletapActions;
    public final Field extensions;
    public final Field filters;
    public final Field focus;
    public final Field functions;
    public final Field height;
    public final Field highPriorityPreviewShow;
    public final Field hoverEndActions;
    public final Field hoverStartActions;
    public final Field id;
    public final Field imageUrl;
    public final Field layoutProvider;
    public final Field longtapActions;
    public final Field margins;
    public final Field paddings;
    public final Field placeholderColor;
    public final Field preloadRequired;
    public final Field pressEndActions;
    public final Field pressStartActions;
    public final Field preview;
    public final Field reuseId;
    public final Field rowSpan;
    public final Field scale;
    public final Field selectedActions;
    public final Field tintColor;
    public final Field tintMode;
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

    public DivImageTemplate(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11, Field field12, Field field13, Field field14, Field field15, Field field16, Field field17, Field field18, Field field19, Field field20, Field field21, Field field22, Field field23, Field field24, Field field25, Field field26, Field field27, Field field28, Field field29, Field field30, Field field31, Field field32, Field field33, Field field34, Field field35, Field field36, Field field37, Field field38, Field field39, Field field40, Field field41, Field field42, Field field43, Field field44, Field field45, Field field46, Field field47, Field field48, Field field49, Field field50, Field field51, Field field52, Field field53, Field field54, Field field55) {
        this.accessibility = field;
        this.action = field2;
        this.actionAnimation = field3;
        this.actions = field4;
        this.alignmentHorizontal = field5;
        this.alignmentVertical = field6;
        this.alpha = field7;
        this.animators = field8;
        this.appearanceAnimation = field9;
        this.aspect = field10;
        this.background = field11;
        this.border = field12;
        this.captureFocusOnAction = field13;
        this.columnSpan = field14;
        this.contentAlignmentHorizontal = field15;
        this.contentAlignmentVertical = field16;
        this.disappearActions = field17;
        this.doubletapActions = field18;
        this.extensions = field19;
        this.filters = field20;
        this.focus = field21;
        this.functions = field22;
        this.height = field23;
        this.highPriorityPreviewShow = field24;
        this.hoverEndActions = field25;
        this.hoverStartActions = field26;
        this.id = field27;
        this.imageUrl = field28;
        this.layoutProvider = field29;
        this.longtapActions = field30;
        this.margins = field31;
        this.paddings = field32;
        this.placeholderColor = field33;
        this.preloadRequired = field34;
        this.pressEndActions = field35;
        this.pressStartActions = field36;
        this.preview = field37;
        this.reuseId = field38;
        this.rowSpan = field39;
        this.scale = field40;
        this.selectedActions = field41;
        this.tintColor = field42;
        this.tintMode = field43;
        this.tooltips = field44;
        this.transform = field45;
        this.transitionChange = field46;
        this.transitionIn = field47;
        this.transitionOut = field48;
        this.transitionTriggers = field49;
        this.variableTriggers = field50;
        this.variables = field51;
        this.visibility = field52;
        this.visibilityAction = field53;
        this.visibilityActions = field54;
        this.width = field55;
    }

    public /* synthetic */ DivImageTemplate(ParsingEnvironment parsingEnvironment, DivImageTemplate divImageTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divImageTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivImageTemplate(ParsingEnvironment parsingEnvironment, DivImageTemplate divImageTemplate, boolean z, JSONObject jSONObject) {
        this(r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivImage resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivImageJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivImageJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivImageJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivImageJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivImageTemplate.kt */
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
        CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivAlignmentHorizontal.CENTER, null, 2, null);
        CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivAlignmentVertical.CENTER, null, 2, null);
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        Boolean bool = Boolean.FALSE;
        HIGH_PRIORITY_PREVIEW_SHOW_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        PLACEHOLDER_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Integer.valueOf(DivSeparatorView.DEFAULT_DIVIDER_COLOR), null, 2, null);
        PRELOAD_REQUIRED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        SCALE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivImageScale.FILL, null, 2, null);
        TINT_MODE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivBlendMode.SOURCE_IN, null, 2, null);
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, 7, null));
        CREATOR = new Function2() { // from class: com.yandex.div2.DivImageTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivImageTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivImageTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }
}
