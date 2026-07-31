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
import com.yandex.div2.DivState;
import com.yandex.div2.DivStateJsonParser;
import com.yandex.div2.DivStateTemplate;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivStateTemplate.kt */
/* loaded from: classes9.dex */
public final class DivStateTemplate implements JSONSerializable, JsonTemplate {
    private static final DivAnimation ACTION_ANIMATION_DEFAULT_VALUE;
    private static final Expression ALPHA_DEFAULT_VALUE;
    private static final Expression CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE;
    private static final Expression CLIP_TO_BOUNDS_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    private static final Expression TRANSITION_ANIMATION_SELECTOR_DEFAULT_VALUE;
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
    public final Field background;
    public final Field border;
    public final Field captureFocusOnAction;
    public final Field clipToBounds;
    public final Field columnSpan;
    public final Field defaultStateId;
    public final Field disappearActions;
    public final Field divId;
    public final Field doubletapActions;
    public final Field extensions;
    public final Field focus;
    public final Field functions;
    public final Field height;
    public final Field hoverEndActions;
    public final Field hoverStartActions;
    public final Field id;
    public final Field layoutProvider;
    public final Field longtapActions;
    public final Field margins;
    public final Field paddings;
    public final Field pressEndActions;
    public final Field pressStartActions;
    public final Field reuseId;
    public final Field rowSpan;
    public final Field selectedActions;
    public final Field stateIdVariable;
    public final Field states;
    public final Field tooltips;
    public final Field transform;
    public final Field transitionAnimationSelector;
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

    public DivStateTemplate(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11, Field field12, Field field13, Field field14, Field field15, Field field16, Field field17, Field field18, Field field19, Field field20, Field field21, Field field22, Field field23, Field field24, Field field25, Field field26, Field field27, Field field28, Field field29, Field field30, Field field31, Field field32, Field field33, Field field34, Field field35, Field field36, Field field37, Field field38, Field field39, Field field40, Field field41, Field field42, Field field43, Field field44, Field field45, Field field46, Field field47, Field field48) {
        this.accessibility = field;
        this.action = field2;
        this.actionAnimation = field3;
        this.actions = field4;
        this.alignmentHorizontal = field5;
        this.alignmentVertical = field6;
        this.alpha = field7;
        this.animators = field8;
        this.background = field9;
        this.border = field10;
        this.captureFocusOnAction = field11;
        this.clipToBounds = field12;
        this.columnSpan = field13;
        this.defaultStateId = field14;
        this.disappearActions = field15;
        this.divId = field16;
        this.doubletapActions = field17;
        this.extensions = field18;
        this.focus = field19;
        this.functions = field20;
        this.height = field21;
        this.hoverEndActions = field22;
        this.hoverStartActions = field23;
        this.id = field24;
        this.layoutProvider = field25;
        this.longtapActions = field26;
        this.margins = field27;
        this.paddings = field28;
        this.pressEndActions = field29;
        this.pressStartActions = field30;
        this.reuseId = field31;
        this.rowSpan = field32;
        this.selectedActions = field33;
        this.stateIdVariable = field34;
        this.states = field35;
        this.tooltips = field36;
        this.transform = field37;
        this.transitionAnimationSelector = field38;
        this.transitionChange = field39;
        this.transitionIn = field40;
        this.transitionOut = field41;
        this.transitionTriggers = field42;
        this.variableTriggers = field43;
        this.variables = field44;
        this.visibility = field45;
        this.visibilityAction = field46;
        this.visibilityActions = field47;
        this.width = field48;
    }

    public /* synthetic */ DivStateTemplate(ParsingEnvironment parsingEnvironment, DivStateTemplate divStateTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divStateTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivStateTemplate(ParsingEnvironment parsingEnvironment, DivStateTemplate divStateTemplate, boolean z, JSONObject jSONObject) {
        this(r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivState resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivStateJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivStateJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivStateJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivStateJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivStateTemplate.kt */
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
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        TRANSITION_ANIMATION_SELECTOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivTransitionSelector.STATE_CHANGE, null, 2, null);
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, 7, null));
        CREATOR = new Function2() { // from class: com.yandex.div2.DivStateTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivStateTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivStateTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    /* compiled from: DivStateTemplate.kt */
    public static final class StateTemplate implements JSONSerializable, JsonTemplate {
        public final Field animationIn;
        public final Field animationOut;
        public final Field div;
        public final Field stateId;
        public final Field swipeOutActions;
        public static final Companion Companion = new Companion(null);
        private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivStateTemplate$StateTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivStateTemplate.StateTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivStateTemplate.StateTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        public StateTemplate(Field field, Field field2, Field field3, Field field4, Field field5) {
            this.animationIn = field;
            this.animationOut = field2;
            this.div = field3;
            this.stateId = field4;
            this.swipeOutActions = field5;
        }

        public /* synthetic */ StateTemplate(ParsingEnvironment parsingEnvironment, StateTemplate stateTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i & 2) != 0 ? null : stateTemplate, (i & 4) != 0 ? false : z, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public StateTemplate(ParsingEnvironment parsingEnvironment, StateTemplate stateTemplate, boolean z, JSONObject jSONObject) {
            this(r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false));
            Field.Companion companion = Field.INSTANCE;
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        @Override // com.yandex.div.json.JsonTemplate
        public DivState.State resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivStateStateJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivStateStateJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivStateStateJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivStateStateJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivStateTemplate.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }
}
