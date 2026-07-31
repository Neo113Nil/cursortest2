package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivVideoJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivVideoTemplate.kt */
/* loaded from: classes.dex */
public final class DivVideoTemplate implements JSONSerializable, JsonTemplate {
    private static final Expression ALPHA_DEFAULT_VALUE;
    private static final Expression AUTOSTART_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    private static final Expression MUTED_DEFAULT_VALUE;
    private static final Expression PRELOAD_REQUIRED_DEFAULT_VALUE;
    private static final Expression REPEATABLE_DEFAULT_VALUE;
    private static final Expression SCALE_DEFAULT_VALUE;
    private static final Expression VISIBILITY_DEFAULT_VALUE;
    private static final DivSize.MatchParent WIDTH_DEFAULT_VALUE;
    public final Field accessibility;
    public final Field alignmentHorizontal;
    public final Field alignmentVertical;
    public final Field alpha;
    public final Field animators;
    public final Field aspect;
    public final Field autostart;
    public final Field background;
    public final Field border;
    public final Field bufferingActions;
    public final Field columnSpan;
    public final Field disappearActions;
    public final Field elapsedTimeVariable;
    public final Field endActions;
    public final Field extensions;
    public final Field fatalActions;
    public final Field focus;
    public final Field functions;
    public final Field height;
    public final Field id;
    public final Field layoutProvider;
    public final Field margins;
    public final Field muted;
    public final Field paddings;
    public final Field pauseActions;
    public final Field playerSettingsPayload;
    public final Field preloadRequired;
    public final Field preview;
    public final Field repeatable;
    public final Field resumeActions;
    public final Field reuseId;
    public final Field rowSpan;
    public final Field scale;
    public final Field selectedActions;
    public final Field tooltips;
    public final Field transform;
    public final Field transitionChange;
    public final Field transitionIn;
    public final Field transitionOut;
    public final Field transitionTriggers;
    public final Field variableTriggers;
    public final Field variables;
    public final Field videoSources;
    public final Field visibility;
    public final Field visibilityAction;
    public final Field visibilityActions;
    public final Field width;

    public DivVideoTemplate(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11, Field field12, Field field13, Field field14, Field field15, Field field16, Field field17, Field field18, Field field19, Field field20, Field field21, Field field22, Field field23, Field field24, Field field25, Field field26, Field field27, Field field28, Field field29, Field field30, Field field31, Field field32, Field field33, Field field34, Field field35, Field field36, Field field37, Field field38, Field field39, Field field40, Field field41, Field field42, Field field43, Field field44, Field field45, Field field46, Field field47) {
        this.accessibility = field;
        this.alignmentHorizontal = field2;
        this.alignmentVertical = field3;
        this.alpha = field4;
        this.animators = field5;
        this.aspect = field6;
        this.autostart = field7;
        this.background = field8;
        this.border = field9;
        this.bufferingActions = field10;
        this.columnSpan = field11;
        this.disappearActions = field12;
        this.elapsedTimeVariable = field13;
        this.endActions = field14;
        this.extensions = field15;
        this.fatalActions = field16;
        this.focus = field17;
        this.functions = field18;
        this.height = field19;
        this.id = field20;
        this.layoutProvider = field21;
        this.margins = field22;
        this.muted = field23;
        this.paddings = field24;
        this.pauseActions = field25;
        this.playerSettingsPayload = field26;
        this.preloadRequired = field27;
        this.preview = field28;
        this.repeatable = field29;
        this.resumeActions = field30;
        this.reuseId = field31;
        this.rowSpan = field32;
        this.scale = field33;
        this.selectedActions = field34;
        this.tooltips = field35;
        this.transform = field36;
        this.transitionChange = field37;
        this.transitionIn = field38;
        this.transitionOut = field39;
        this.transitionTriggers = field40;
        this.variableTriggers = field41;
        this.variables = field42;
        this.videoSources = field43;
        this.visibility = field44;
        this.visibilityAction = field45;
        this.visibilityActions = field46;
        this.width = field47;
    }

    public /* synthetic */ DivVideoTemplate(ParsingEnvironment parsingEnvironment, DivVideoTemplate divVideoTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divVideoTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivVideoTemplate(ParsingEnvironment parsingEnvironment, DivVideoTemplate divVideoTemplate, boolean z, JSONObject jSONObject) {
        this(r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivVideo resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivVideoJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivVideoJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivVideoJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivVideoJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivVideoTemplate.kt */
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
        AUTOSTART_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7, null));
        MUTED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        PRELOAD_REQUIRED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        REPEATABLE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        SCALE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivVideoScale.FIT, null, 2, null);
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null, null, 7, 0 == true ? 1 : 0));
        CREATOR = new Function2() { // from class: com.yandex.div2.DivVideoTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivVideoTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivVideoTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }
}
