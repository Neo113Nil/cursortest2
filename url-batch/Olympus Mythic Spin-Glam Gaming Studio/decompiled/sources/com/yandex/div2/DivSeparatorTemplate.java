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
import com.yandex.div2.DivSeparator;
import com.yandex.div2.DivSeparatorDelimiterStyleJsonParser;
import com.yandex.div2.DivSeparatorJsonParser;
import com.yandex.div2.DivSeparatorTemplate;
import com.yandex.div2.DivSize;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivSeparatorTemplate.kt */
/* loaded from: classes10.dex */
public final class DivSeparatorTemplate implements JSONSerializable, JsonTemplate {
    private static final DivAnimation ACTION_ANIMATION_DEFAULT_VALUE;
    private static final Expression ALPHA_DEFAULT_VALUE;
    private static final Expression CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
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
    public final Field columnSpan;
    public final Field delimiterStyle;
    public final Field disappearActions;
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

    public DivSeparatorTemplate(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11, Field field12, Field field13, Field field14, Field field15, Field field16, Field field17, Field field18, Field field19, Field field20, Field field21, Field field22, Field field23, Field field24, Field field25, Field field26, Field field27, Field field28, Field field29, Field field30, Field field31, Field field32, Field field33, Field field34, Field field35, Field field36, Field field37, Field field38, Field field39, Field field40, Field field41, Field field42, Field field43) {
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
        this.columnSpan = field12;
        this.delimiterStyle = field13;
        this.disappearActions = field14;
        this.doubletapActions = field15;
        this.extensions = field16;
        this.focus = field17;
        this.functions = field18;
        this.height = field19;
        this.hoverEndActions = field20;
        this.hoverStartActions = field21;
        this.id = field22;
        this.layoutProvider = field23;
        this.longtapActions = field24;
        this.margins = field25;
        this.paddings = field26;
        this.pressEndActions = field27;
        this.pressStartActions = field28;
        this.reuseId = field29;
        this.rowSpan = field30;
        this.selectedActions = field31;
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

    public /* synthetic */ DivSeparatorTemplate(ParsingEnvironment parsingEnvironment, DivSeparatorTemplate divSeparatorTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divSeparatorTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivSeparatorTemplate(ParsingEnvironment parsingEnvironment, DivSeparatorTemplate divSeparatorTemplate, boolean z, JSONObject jSONObject) {
        this(r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivSeparator resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivSeparatorJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSeparatorJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivSeparatorJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSeparatorJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivSeparatorTemplate.kt */
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
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null == true ? 1 : 0, 7, null));
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null == true ? 1 : 0, null == true ? 1 : 0, 7, null));
        CREATOR = new Function2() { // from class: com.yandex.div2.DivSeparatorTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivSeparatorTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivSeparatorTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    /* compiled from: DivSeparatorTemplate.kt */
    public static final class DelimiterStyleTemplate implements JSONSerializable, JsonTemplate {
        private static final Expression COLOR_DEFAULT_VALUE;
        private static final Function2 CREATOR;
        public static final Companion Companion = new Companion(null);
        private static final Expression ORIENTATION_DEFAULT_VALUE;
        public final Field color;
        public final Field orientation;

        public DelimiterStyleTemplate(Field field, Field field2) {
            this.color = field;
            this.orientation = field2;
        }

        public /* synthetic */ DelimiterStyleTemplate(ParsingEnvironment parsingEnvironment, DelimiterStyleTemplate delimiterStyleTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i & 2) != 0 ? null : delimiterStyleTemplate, (i & 4) != 0 ? false : z, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public DelimiterStyleTemplate(ParsingEnvironment parsingEnvironment, DelimiterStyleTemplate delimiterStyleTemplate, boolean z, JSONObject jSONObject) {
            this(r1.nullField(false), r1.nullField(false));
            Field.Companion companion = Field.INSTANCE;
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        @Override // com.yandex.div.json.JsonTemplate
        public DivSeparator.DelimiterStyle resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivSeparatorDelimiterStyleJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSeparatorDelimiterStyleJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivSeparatorDelimiterStyleJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSeparatorDelimiterStyleJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivSeparatorTemplate.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        static {
            Expression.Companion companion = Expression.INSTANCE;
            COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Integer.valueOf(DivSeparatorView.DEFAULT_DIVIDER_COLOR), null, 2, null);
            ORIENTATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivSeparator.DelimiterStyle.Orientation.HORIZONTAL, null, 2, null);
            CREATOR = new Function2() { // from class: com.yandex.div2.DivSeparatorTemplate$DelimiterStyleTemplate$Companion$CREATOR$1
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                public final DivSeparatorTemplate.DelimiterStyleTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                    return new DivSeparatorTemplate.DelimiterStyleTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
                }
            };
        }
    }
}
