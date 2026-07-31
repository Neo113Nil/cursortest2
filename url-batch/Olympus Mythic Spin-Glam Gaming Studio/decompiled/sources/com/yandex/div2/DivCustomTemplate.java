package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivCustomJsonParser;
import com.yandex.div2.DivSize;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivCustomTemplate.kt */
/* loaded from: classes11.dex */
public final class DivCustomTemplate implements JSONSerializable, JsonTemplate {
    private static final Expression ALPHA_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
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
    public final Field customProps;
    public final Field customType;
    public final Field disappearActions;
    public final Field extensions;
    public final Field focus;
    public final Field functions;
    public final Field height;
    public final Field id;
    public final Field items;
    public final Field layoutProvider;
    public final Field margins;
    public final Field paddings;
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

    public DivCustomTemplate(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11, Field field12, Field field13, Field field14, Field field15, Field field16, Field field17, Field field18, Field field19, Field field20, Field field21, Field field22, Field field23, Field field24, Field field25, Field field26, Field field27, Field field28, Field field29, Field field30, Field field31, Field field32, Field field33, Field field34, Field field35) {
        this.accessibility = field;
        this.alignmentHorizontal = field2;
        this.alignmentVertical = field3;
        this.alpha = field4;
        this.animators = field5;
        this.background = field6;
        this.border = field7;
        this.columnSpan = field8;
        this.customProps = field9;
        this.customType = field10;
        this.disappearActions = field11;
        this.extensions = field12;
        this.focus = field13;
        this.functions = field14;
        this.height = field15;
        this.id = field16;
        this.items = field17;
        this.layoutProvider = field18;
        this.margins = field19;
        this.paddings = field20;
        this.reuseId = field21;
        this.rowSpan = field22;
        this.selectedActions = field23;
        this.tooltips = field24;
        this.transform = field25;
        this.transitionChange = field26;
        this.transitionIn = field27;
        this.transitionOut = field28;
        this.transitionTriggers = field29;
        this.variableTriggers = field30;
        this.variables = field31;
        this.visibility = field32;
        this.visibilityAction = field33;
        this.visibilityActions = field34;
        this.width = field35;
    }

    public /* synthetic */ DivCustomTemplate(ParsingEnvironment parsingEnvironment, DivCustomTemplate divCustomTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divCustomTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivCustomTemplate(ParsingEnvironment parsingEnvironment, DivCustomTemplate divCustomTemplate, boolean z, JSONObject jSONObject) {
        this(r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivCustom resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivCustomJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivCustomJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivCustomJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivCustomJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivCustomTemplate.kt */
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
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null, null, 7, 0 == true ? 1 : 0));
        CREATOR = new Function2() { // from class: com.yandex.div2.DivCustomTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivCustomTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivCustomTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }
}
