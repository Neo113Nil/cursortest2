package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivPager;
import com.yandex.div2.DivPagerJsonParser;
import com.yandex.div2.DivSize;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivPagerTemplate.kt */
/* loaded from: classes10.dex */
public final class DivPagerTemplate implements JSONSerializable, JsonTemplate {
    private static final Expression ALPHA_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    private static final Expression CROSS_AXIS_ALIGNMENT_DEFAULT_VALUE;
    public static final Companion Companion = new Companion(null);
    private static final Expression DEFAULT_ITEM_DEFAULT_VALUE;
    private static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    private static final Expression INFINITE_SCROLL_DEFAULT_VALUE;
    private static final DivFixedSize ITEM_SPACING_DEFAULT_VALUE;
    private static final Expression ORIENTATION_DEFAULT_VALUE;
    private static final Expression RESTRICT_PARENT_SCROLL_DEFAULT_VALUE;
    private static final Expression SCROLL_AXIS_ALIGNMENT_DEFAULT_VALUE;
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
    public final Field crossAxisAlignment;
    public final Field defaultItem;
    public final Field disappearActions;
    public final Field extensions;
    public final Field focus;
    public final Field functions;
    public final Field height;
    public final Field id;
    public final Field infiniteScroll;
    public final Field itemBuilder;
    public final Field itemSpacing;
    public final Field items;
    public final Field layoutMode;
    public final Field layoutProvider;
    public final Field margins;
    public final Field orientation;
    public final Field paddings;
    public final Field pageTransformation;
    public final Field restrictParentScroll;
    public final Field reuseId;
    public final Field rowSpan;
    public final Field scrollAxisAlignment;
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

    public DivPagerTemplate(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11, Field field12, Field field13, Field field14, Field field15, Field field16, Field field17, Field field18, Field field19, Field field20, Field field21, Field field22, Field field23, Field field24, Field field25, Field field26, Field field27, Field field28, Field field29, Field field30, Field field31, Field field32, Field field33, Field field34, Field field35, Field field36, Field field37, Field field38, Field field39, Field field40, Field field41, Field field42, Field field43) {
        this.accessibility = field;
        this.alignmentHorizontal = field2;
        this.alignmentVertical = field3;
        this.alpha = field4;
        this.animators = field5;
        this.background = field6;
        this.border = field7;
        this.columnSpan = field8;
        this.crossAxisAlignment = field9;
        this.defaultItem = field10;
        this.disappearActions = field11;
        this.extensions = field12;
        this.focus = field13;
        this.functions = field14;
        this.height = field15;
        this.id = field16;
        this.infiniteScroll = field17;
        this.itemBuilder = field18;
        this.itemSpacing = field19;
        this.items = field20;
        this.layoutMode = field21;
        this.layoutProvider = field22;
        this.margins = field23;
        this.orientation = field24;
        this.paddings = field25;
        this.pageTransformation = field26;
        this.restrictParentScroll = field27;
        this.reuseId = field28;
        this.rowSpan = field29;
        this.scrollAxisAlignment = field30;
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

    public /* synthetic */ DivPagerTemplate(ParsingEnvironment parsingEnvironment, DivPagerTemplate divPagerTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divPagerTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivPagerTemplate(ParsingEnvironment parsingEnvironment, DivPagerTemplate divPagerTemplate, boolean z, JSONObject jSONObject) {
        this(r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false), r15.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivPager resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivPagerJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPagerJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivPagerJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPagerJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivPagerTemplate.kt */
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
        CROSS_AXIS_ALIGNMENT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivPager.ItemAlignment.START, null, 2, null);
        DEFAULT_ITEM_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7, null));
        Boolean bool = Boolean.FALSE;
        INFINITE_SCROLL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        ITEM_SPACING_DEFAULT_VALUE = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 0L, null, 2, null), 1, null == true ? 1 : 0);
        ORIENTATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivPager.Orientation.HORIZONTAL, null, 2, null);
        RESTRICT_PARENT_SCROLL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        SCROLL_AXIS_ALIGNMENT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivPager.ItemAlignment.CENTER, null, 2, null);
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivVisibility.VISIBLE, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null, null, 7, null));
        CREATOR = new Function2() { // from class: com.yandex.div2.DivPagerTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivPagerTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivPagerTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }
}
