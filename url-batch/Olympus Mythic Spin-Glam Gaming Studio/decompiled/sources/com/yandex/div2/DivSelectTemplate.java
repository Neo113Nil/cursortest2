package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivSelect;
import com.yandex.div2.DivSelectJsonParser;
import com.yandex.div2.DivSelectTemplate;
import com.yandex.div2.DivSize;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivSelectTemplate.kt */
/* loaded from: classes12.dex */
public final class DivSelectTemplate implements JSONSerializable, JsonTemplate {
    private static final Expression ALPHA_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression FONT_SIZE_DEFAULT_VALUE;
    private static final Expression FONT_SIZE_UNIT_DEFAULT_VALUE;
    private static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    private static final Expression HINT_COLOR_DEFAULT_VALUE;
    private static final Expression LETTER_SPACING_DEFAULT_VALUE;
    private static final Expression TEXT_COLOR_DEFAULT_VALUE;
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
    public final Field fontFamily;
    public final Field fontSize;
    public final Field fontSizeUnit;
    public final Field fontVariationSettings;
    public final Field fontWeight;
    public final Field fontWeightValue;
    public final Field functions;
    public final Field height;
    public final Field hintColor;
    public final Field hintText;
    public final Field id;
    public final Field layoutProvider;
    public final Field letterSpacing;
    public final Field lineHeight;
    public final Field margins;
    public final Field options;
    public final Field paddings;
    public final Field reuseId;
    public final Field rowSpan;
    public final Field selectedActions;
    public final Field textColor;
    public final Field tooltips;
    public final Field transform;
    public final Field transitionChange;
    public final Field transitionIn;
    public final Field transitionOut;
    public final Field transitionTriggers;
    public final Field valueVariable;
    public final Field variableTriggers;
    public final Field variables;
    public final Field visibility;
    public final Field visibilityAction;
    public final Field visibilityActions;
    public final Field width;

    public DivSelectTemplate(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11, Field field12, Field field13, Field field14, Field field15, Field field16, Field field17, Field field18, Field field19, Field field20, Field field21, Field field22, Field field23, Field field24, Field field25, Field field26, Field field27, Field field28, Field field29, Field field30, Field field31, Field field32, Field field33, Field field34, Field field35, Field field36, Field field37, Field field38, Field field39, Field field40, Field field41, Field field42, Field field43, Field field44, Field field45) {
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
        this.fontFamily = field12;
        this.fontSize = field13;
        this.fontSizeUnit = field14;
        this.fontVariationSettings = field15;
        this.fontWeight = field16;
        this.fontWeightValue = field17;
        this.functions = field18;
        this.height = field19;
        this.hintColor = field20;
        this.hintText = field21;
        this.id = field22;
        this.layoutProvider = field23;
        this.letterSpacing = field24;
        this.lineHeight = field25;
        this.margins = field26;
        this.options = field27;
        this.paddings = field28;
        this.reuseId = field29;
        this.rowSpan = field30;
        this.selectedActions = field31;
        this.textColor = field32;
        this.tooltips = field33;
        this.transform = field34;
        this.transitionChange = field35;
        this.transitionIn = field36;
        this.transitionOut = field37;
        this.transitionTriggers = field38;
        this.valueVariable = field39;
        this.variableTriggers = field40;
        this.variables = field41;
        this.visibility = field42;
        this.visibilityAction = field43;
        this.visibilityActions = field44;
        this.width = field45;
    }

    public /* synthetic */ DivSelectTemplate(ParsingEnvironment parsingEnvironment, DivSelectTemplate divSelectTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divSelectTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivSelectTemplate(ParsingEnvironment parsingEnvironment, DivSelectTemplate divSelectTemplate, boolean z, JSONObject jSONObject) {
        this(r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivSelect resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivSelectJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSelectJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivSelectJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSelectJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivSelectTemplate.kt */
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
        FONT_SIZE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        FONT_SIZE_UNIT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivSizeUnit.SP, null, 2, null);
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7, null));
        HINT_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 1929379840, null, 2, null);
        LETTER_SPACING_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        TEXT_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, -16777216, null, 2, null);
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null, null, 7, null == true ? 1 : 0));
        CREATOR = new Function2() { // from class: com.yandex.div2.DivSelectTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivSelectTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivSelectTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    /* compiled from: DivSelectTemplate.kt */
    public static final class OptionTemplate implements JSONSerializable, JsonTemplate {
        public final Field text;
        public final Field value;
        public static final Companion Companion = new Companion(null);
        private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivSelectTemplate$OptionTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivSelectTemplate.OptionTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivSelectTemplate.OptionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        public OptionTemplate(Field field, Field field2) {
            this.text = field;
            this.value = field2;
        }

        public /* synthetic */ OptionTemplate(ParsingEnvironment parsingEnvironment, OptionTemplate optionTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i & 2) != 0 ? null : optionTemplate, (i & 4) != 0 ? false : z, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public OptionTemplate(ParsingEnvironment parsingEnvironment, OptionTemplate optionTemplate, boolean z, JSONObject jSONObject) {
            this(r1.nullField(false), r1.nullField(false));
            Field.Companion companion = Field.INSTANCE;
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        @Override // com.yandex.div.json.JsonTemplate
        public DivSelect.Option resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivSelectOptionJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSelectOptionJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivSelectOptionJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSelectOptionJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivSelectTemplate.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }
}
