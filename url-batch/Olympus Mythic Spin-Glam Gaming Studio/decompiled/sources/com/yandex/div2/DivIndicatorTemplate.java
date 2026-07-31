package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivIndicator;
import com.yandex.div2.DivIndicatorJsonParser;
import com.yandex.div2.DivShape;
import com.yandex.div2.DivSize;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivIndicatorTemplate.kt */
/* loaded from: classes13.dex */
public final class DivIndicatorTemplate implements JSONSerializable, JsonTemplate {
    private static final Expression ACTIVE_ITEM_COLOR_DEFAULT_VALUE;
    private static final Expression ACTIVE_ITEM_SIZE_DEFAULT_VALUE;
    private static final Expression ALPHA_DEFAULT_VALUE;
    private static final Expression ANIMATION_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    private static final Expression INACTIVE_ITEM_COLOR_DEFAULT_VALUE;
    private static final Expression MINIMUM_ITEM_SIZE_DEFAULT_VALUE;
    private static final DivShape.RoundedRectangle SHAPE_DEFAULT_VALUE;
    private static final DivFixedSize SPACE_BETWEEN_CENTERS_DEFAULT_VALUE;
    private static final Expression VISIBILITY_DEFAULT_VALUE;
    private static final DivSize.MatchParent WIDTH_DEFAULT_VALUE;
    public final Field accessibility;
    public final Field activeItemColor;
    public final Field activeItemSize;
    public final Field activeShape;
    public final Field alignmentHorizontal;
    public final Field alignmentVertical;
    public final Field alpha;
    public final Field animation;
    public final Field animators;
    public final Field background;
    public final Field border;
    public final Field columnSpan;
    public final Field disappearActions;
    public final Field extensions;
    public final Field focus;
    public final Field functions;
    public final Field height;
    public final Field id;
    public final Field inactiveItemColor;
    public final Field inactiveMinimumShape;
    public final Field inactiveShape;
    public final Field itemsPlacement;
    public final Field layoutProvider;
    public final Field margins;
    public final Field minimumItemSize;
    public final Field paddings;
    public final Field pagerId;
    public final Field reuseId;
    public final Field rowSpan;
    public final Field selectedActions;
    public final Field shape;
    public final Field spaceBetweenCenters;
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

    public DivIndicatorTemplate(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11, Field field12, Field field13, Field field14, Field field15, Field field16, Field field17, Field field18, Field field19, Field field20, Field field21, Field field22, Field field23, Field field24, Field field25, Field field26, Field field27, Field field28, Field field29, Field field30, Field field31, Field field32, Field field33, Field field34, Field field35, Field field36, Field field37, Field field38, Field field39, Field field40, Field field41, Field field42, Field field43, Field field44) {
        this.accessibility = field;
        this.activeItemColor = field2;
        this.activeItemSize = field3;
        this.activeShape = field4;
        this.alignmentHorizontal = field5;
        this.alignmentVertical = field6;
        this.alpha = field7;
        this.animation = field8;
        this.animators = field9;
        this.background = field10;
        this.border = field11;
        this.columnSpan = field12;
        this.disappearActions = field13;
        this.extensions = field14;
        this.focus = field15;
        this.functions = field16;
        this.height = field17;
        this.id = field18;
        this.inactiveItemColor = field19;
        this.inactiveMinimumShape = field20;
        this.inactiveShape = field21;
        this.itemsPlacement = field22;
        this.layoutProvider = field23;
        this.margins = field24;
        this.minimumItemSize = field25;
        this.paddings = field26;
        this.pagerId = field27;
        this.reuseId = field28;
        this.rowSpan = field29;
        this.selectedActions = field30;
        this.shape = field31;
        this.spaceBetweenCenters = field32;
        this.tooltips = field33;
        this.transform = field34;
        this.transitionChange = field35;
        this.transitionIn = field36;
        this.transitionOut = field37;
        this.transitionTriggers = field38;
        this.variableTriggers = field39;
        this.variables = field40;
        this.visibility = field41;
        this.visibilityAction = field42;
        this.visibilityActions = field43;
        this.width = field44;
    }

    public /* synthetic */ DivIndicatorTemplate(ParsingEnvironment parsingEnvironment, DivIndicatorTemplate divIndicatorTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divIndicatorTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivIndicatorTemplate(ParsingEnvironment parsingEnvironment, DivIndicatorTemplate divIndicatorTemplate, boolean z, JSONObject jSONObject) {
        this(r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivIndicator resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivIndicatorJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivIndicatorJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivIndicatorJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivIndicatorJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivIndicatorTemplate.kt */
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
        ACTIVE_ITEM_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 16768096, null, 2, null);
        ACTIVE_ITEM_SIZE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(1.3d), null, 2, null);
        ALPHA_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        ANIMATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivIndicator.Animation.SCALE, null, 2, null);
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7, null));
        INACTIVE_ITEM_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 865180853, null, 2, null);
        MINIMUM_ITEM_SIZE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(0.5d), null, 2, null);
        Object[] objArr = null == true ? 1 : 0;
        SHAPE_DEFAULT_VALUE = new DivShape.RoundedRectangle(new DivRoundedRectangleShape(null, null == true ? 1 : 0, null == true ? 1 : 0, null, objArr, 31, null));
        SPACE_BETWEEN_CENTERS_DEFAULT_VALUE = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 15L, null, 2, null), 1, null == true ? 1 : 0);
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null, null, 7, null == true ? 1 : 0));
        CREATOR = new Function2() { // from class: com.yandex.div2.DivIndicatorTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivIndicatorTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivIndicatorTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }
}
