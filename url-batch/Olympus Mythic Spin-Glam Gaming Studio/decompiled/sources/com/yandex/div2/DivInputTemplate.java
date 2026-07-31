package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivInput;
import com.yandex.div2.DivInputJsonParser;
import com.yandex.div2.DivInputTemplate;
import com.yandex.div2.DivSize;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivInputTemplate.kt */
/* loaded from: classes11.dex */
public final class DivInputTemplate implements JSONSerializable, JsonTemplate {
    private static final Expression ALPHA_DEFAULT_VALUE;
    private static final Expression AUTOCAPITALIZATION_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression ENTER_KEY_TYPE_DEFAULT_VALUE;
    private static final Expression FONT_SIZE_DEFAULT_VALUE;
    private static final Expression FONT_SIZE_UNIT_DEFAULT_VALUE;
    private static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    private static final Expression HINT_COLOR_DEFAULT_VALUE;
    private static final Expression IS_ENABLED_DEFAULT_VALUE;
    private static final Expression KEYBOARD_TYPE_DEFAULT_VALUE;
    private static final Expression LETTER_SPACING_DEFAULT_VALUE;
    private static final Expression SELECT_ALL_ON_FOCUS_DEFAULT_VALUE;
    private static final Expression TEXT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE;
    private static final Expression TEXT_ALIGNMENT_VERTICAL_DEFAULT_VALUE;
    private static final Expression TEXT_COLOR_DEFAULT_VALUE;
    private static final Expression VISIBILITY_DEFAULT_VALUE;
    private static final DivSize.MatchParent WIDTH_DEFAULT_VALUE;
    public final Field accessibility;
    public final Field alignmentHorizontal;
    public final Field alignmentVertical;
    public final Field alpha;
    public final Field animators;
    public final Field autocapitalization;
    public final Field background;
    public final Field border;
    public final Field columnSpan;
    public final Field disappearActions;
    public final Field enterKeyActions;
    public final Field enterKeyType;
    public final Field extensions;
    public final Field filters;
    public final Field focus;
    public final Field fontFamily;
    public final Field fontSize;
    public final Field fontSizeUnit;
    public final Field fontVariationSettings;
    public final Field fontWeight;
    public final Field fontWeightValue;
    public final Field functions;
    public final Field height;
    public final Field highlightColor;
    public final Field hintColor;
    public final Field hintText;
    public final Field id;
    public final Field isEnabled;
    public final Field keyboardType;
    public final Field layoutProvider;
    public final Field letterSpacing;
    public final Field lineHeight;
    public final Field margins;
    public final Field mask;
    public final Field maxLength;
    public final Field maxVisibleLines;
    public final Field nativeInterface;
    public final Field paddings;
    public final Field reuseId;
    public final Field rowSpan;
    public final Field selectAllOnFocus;
    public final Field selectedActions;
    public final Field textAlignmentHorizontal;
    public final Field textAlignmentVertical;
    public final Field textColor;
    public final Field textVariable;
    public final Field tooltips;
    public final Field transform;
    public final Field transitionChange;
    public final Field transitionIn;
    public final Field transitionOut;
    public final Field transitionTriggers;
    public final Field validators;
    public final Field variableTriggers;
    public final Field variables;
    public final Field visibility;
    public final Field visibilityAction;
    public final Field visibilityActions;
    public final Field width;

    public DivInputTemplate(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11, Field field12, Field field13, Field field14, Field field15, Field field16, Field field17, Field field18, Field field19, Field field20, Field field21, Field field22, Field field23, Field field24, Field field25, Field field26, Field field27, Field field28, Field field29, Field field30, Field field31, Field field32, Field field33, Field field34, Field field35, Field field36, Field field37, Field field38, Field field39, Field field40, Field field41, Field field42, Field field43, Field field44, Field field45, Field field46, Field field47, Field field48, Field field49, Field field50, Field field51, Field field52, Field field53, Field field54, Field field55, Field field56, Field field57, Field field58, Field field59) {
        this.accessibility = field;
        this.alignmentHorizontal = field2;
        this.alignmentVertical = field3;
        this.alpha = field4;
        this.animators = field5;
        this.autocapitalization = field6;
        this.background = field7;
        this.border = field8;
        this.columnSpan = field9;
        this.disappearActions = field10;
        this.enterKeyActions = field11;
        this.enterKeyType = field12;
        this.extensions = field13;
        this.filters = field14;
        this.focus = field15;
        this.fontFamily = field16;
        this.fontSize = field17;
        this.fontSizeUnit = field18;
        this.fontVariationSettings = field19;
        this.fontWeight = field20;
        this.fontWeightValue = field21;
        this.functions = field22;
        this.height = field23;
        this.highlightColor = field24;
        this.hintColor = field25;
        this.hintText = field26;
        this.id = field27;
        this.isEnabled = field28;
        this.keyboardType = field29;
        this.layoutProvider = field30;
        this.letterSpacing = field31;
        this.lineHeight = field32;
        this.margins = field33;
        this.mask = field34;
        this.maxLength = field35;
        this.maxVisibleLines = field36;
        this.nativeInterface = field37;
        this.paddings = field38;
        this.reuseId = field39;
        this.rowSpan = field40;
        this.selectAllOnFocus = field41;
        this.selectedActions = field42;
        this.textAlignmentHorizontal = field43;
        this.textAlignmentVertical = field44;
        this.textColor = field45;
        this.textVariable = field46;
        this.tooltips = field47;
        this.transform = field48;
        this.transitionChange = field49;
        this.transitionIn = field50;
        this.transitionOut = field51;
        this.transitionTriggers = field52;
        this.validators = field53;
        this.variableTriggers = field54;
        this.variables = field55;
        this.visibility = field56;
        this.visibilityAction = field57;
        this.visibilityActions = field58;
        this.width = field59;
    }

    public /* synthetic */ DivInputTemplate(ParsingEnvironment parsingEnvironment, DivInputTemplate divInputTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divInputTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivInputTemplate(ParsingEnvironment parsingEnvironment, DivInputTemplate divInputTemplate, boolean z, JSONObject jSONObject) {
        this(r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivInput resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivInputJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivInputJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivInputTemplate.kt */
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
        AUTOCAPITALIZATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivInput.Autocapitalization.AUTO, null, 2, null);
        ENTER_KEY_TYPE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivInput.EnterKeyType.DEFAULT, null, 2, null);
        FONT_SIZE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        FONT_SIZE_UNIT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7, null));
        HINT_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 1929379840, null, 2, null);
        IS_ENABLED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        KEYBOARD_TYPE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivInput.KeyboardType.MULTI_LINE_TEXT, null, 2, null);
        LETTER_SPACING_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        SELECT_ALL_ON_FOCUS_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        TEXT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivAlignmentHorizontal.START, null, 2, null);
        TEXT_ALIGNMENT_VERTICAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivAlignmentVertical.CENTER, null, 2, null);
        TEXT_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, -16777216, null, 2, null);
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null, null, 7, null == true ? 1 : 0));
        CREATOR = new Function2() { // from class: com.yandex.div2.DivInputTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivInputTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivInputTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    /* compiled from: DivInputTemplate.kt */
    public static final class NativeInterfaceTemplate implements JSONSerializable, JsonTemplate {
        public final Field color;
        public static final Companion Companion = new Companion(null);
        private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivInputTemplate$NativeInterfaceTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivInputTemplate.NativeInterfaceTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivInputTemplate.NativeInterfaceTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        public NativeInterfaceTemplate(Field field) {
            this.color = field;
        }

        public /* synthetic */ NativeInterfaceTemplate(ParsingEnvironment parsingEnvironment, NativeInterfaceTemplate nativeInterfaceTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i & 2) != 0 ? null : nativeInterfaceTemplate, (i & 4) != 0 ? false : z, jSONObject);
        }

        public NativeInterfaceTemplate(ParsingEnvironment parsingEnvironment, NativeInterfaceTemplate nativeInterfaceTemplate, boolean z, JSONObject jSONObject) {
            this(Field.INSTANCE.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        @Override // com.yandex.div.json.JsonTemplate
        public DivInput.NativeInterface resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivInputNativeInterfaceJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputNativeInterfaceJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivInputNativeInterfaceJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputNativeInterfaceJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivInputTemplate.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }
}
