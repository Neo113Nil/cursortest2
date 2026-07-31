package com.yandex.div2;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.X3;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivPager;
import com.yandex.div2.DivSize;
import io.appmetrica.analytics.impl.M2;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivPagerJsonParser.kt */
/* loaded from: classes11.dex */
public abstract class DivPagerJsonParser {
    public static final Expression ALPHA_DEFAULT_VALUE;
    public static final ValueValidator ALPHA_VALIDATOR;
    public static final ValueValidator COLUMN_SPAN_VALIDATOR;
    public static final Expression CROSS_AXIS_ALIGNMENT_DEFAULT_VALUE;
    private static final Companion Companion = new Companion(null);
    public static final Expression DEFAULT_ITEM_DEFAULT_VALUE;
    public static final ValueValidator DEFAULT_ITEM_VALIDATOR;
    public static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    public static final Expression INFINITE_SCROLL_DEFAULT_VALUE;
    public static final DivFixedSize ITEM_SPACING_DEFAULT_VALUE;
    public static final Expression ORIENTATION_DEFAULT_VALUE;
    public static final Expression RESTRICT_PARENT_SCROLL_DEFAULT_VALUE;
    public static final ValueValidator ROW_SPAN_VALIDATOR;
    public static final Expression SCROLL_AXIS_ALIGNMENT_DEFAULT_VALUE;
    public static final ListValidator TRANSITION_TRIGGERS_VALIDATOR;
    public static final TypeHelper TYPE_HELPER_ALIGNMENT_HORIZONTAL;
    public static final TypeHelper TYPE_HELPER_ALIGNMENT_VERTICAL;
    public static final TypeHelper TYPE_HELPER_CROSS_AXIS_ALIGNMENT;
    public static final TypeHelper TYPE_HELPER_ORIENTATION;
    public static final TypeHelper TYPE_HELPER_SCROLL_AXIS_ALIGNMENT;
    public static final TypeHelper TYPE_HELPER_VISIBILITY;
    public static final Expression VISIBILITY_DEFAULT_VALUE;
    public static final DivSize.MatchParent WIDTH_DEFAULT_VALUE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ALPHA_VALIDATOR$lambda$0(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean COLUMN_SPAN_VALIDATOR$lambda$1(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DEFAULT_ITEM_VALIDATOR$lambda$2(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ROW_SPAN_VALIDATOR$lambda$3(long j) {
        return j >= 0;
    }

    /* compiled from: DivPagerJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivPager deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.component.getDivAccessibilityJsonEntityParser());
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", DivPagerJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL, DivAlignmentHorizontal.FROM_STRING);
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivPagerJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivPagerJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivPagerJsonParser.ALPHA_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression3 != null) {
                expression = readOptionalExpression3;
            }
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.component.getDivAnimatorJsonEntityParser());
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, M2.g, this.component.getDivBackgroundJsonEntityParser());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.component.getDivBorderJsonEntityParser());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, function12, DivPagerJsonParser.COLUMN_SPAN_VALIDATOR);
            TypeHelper typeHelper3 = DivPagerJsonParser.TYPE_HELPER_CROSS_AXIS_ALIGNMENT;
            Function1 function13 = DivPager.ItemAlignment.FROM_STRING;
            Expression expression2 = DivPagerJsonParser.CROSS_AXIS_ALIGNMENT_DEFAULT_VALUE;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "cross_axis_alignment", typeHelper3, function13, expression2);
            Expression expression3 = readOptionalExpression5 == null ? expression2 : readOptionalExpression5;
            ValueValidator valueValidator2 = DivPagerJsonParser.DEFAULT_ITEM_VALIDATOR;
            Expression expression4 = DivPagerJsonParser.DEFAULT_ITEM_DEFAULT_VALUE;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "default_item", typeHelper2, function12, valueValidator2, expression4);
            if (readOptionalExpression6 != null) {
                expression4 = readOptionalExpression6;
            }
            List readOptionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.component.getDivDisappearActionJsonEntityParser());
            List readOptionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.component.getDivExtensionJsonEntityParser());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.component.getDivFocusJsonEntityParser());
            List readOptionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.component.getDivFunctionJsonEntityParser());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.component.getDivSizeJsonEntityParser());
            if (divSize == null) {
                divSize = DivPagerJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            DivSize divSize2 = divSize;
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression5 = DivPagerJsonParser.INFINITE_SCROLL_DEFAULT_VALUE;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "infinite_scroll", typeHelper4, function14, expression5);
            if (readOptionalExpression7 != null) {
                expression5 = readOptionalExpression7;
            }
            DivCollectionItemBuilder divCollectionItemBuilder = (DivCollectionItemBuilder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_builder", this.component.getDivCollectionItemBuilderJsonEntityParser());
            DivFixedSize divFixedSize = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_spacing", this.component.getDivFixedSizeJsonEntityParser());
            if (divFixedSize == null) {
                divFixedSize = DivPagerJsonParser.ITEM_SPACING_DEFAULT_VALUE;
            }
            DivFixedSize divFixedSize2 = divFixedSize;
            List readOptionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "items", this.component.getDivJsonEntityParser());
            DivPagerLayoutMode divPagerLayoutMode = (DivPagerLayoutMode) JsonPropertyParser.read(parsingContext, jSONObject, "layout_mode", this.component.getDivPagerLayoutModeJsonEntityParser());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.component.getDivLayoutProviderJsonEntityParser());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.component.getDivEdgeInsetsJsonEntityParser());
            TypeHelper typeHelper5 = DivPagerJsonParser.TYPE_HELPER_ORIENTATION;
            Function1 function15 = DivPager.Orientation.FROM_STRING;
            Expression expression6 = DivPagerJsonParser.ORIENTATION_DEFAULT_VALUE;
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, X3.i.n, typeHelper5, function15, expression6);
            if (readOptionalExpression8 != null) {
                expression6 = readOptionalExpression8;
            }
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonEntityParser());
            DivPageTransformation divPageTransformation = (DivPageTransformation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "page_transformation", this.component.getDivPageTransformationJsonEntityParser());
            Expression expression7 = DivPagerJsonParser.RESTRICT_PARENT_SCROLL_DEFAULT_VALUE;
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "restrict_parent_scroll", typeHelper4, function14, expression7);
            if (readOptionalExpression9 != null) {
                expression7 = readOptionalExpression9;
            }
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, function12, DivPagerJsonParser.ROW_SPAN_VALIDATOR);
            TypeHelper typeHelper6 = DivPagerJsonParser.TYPE_HELPER_SCROLL_AXIS_ALIGNMENT;
            Expression expression8 = DivPagerJsonParser.SCROLL_AXIS_ALIGNMENT_DEFAULT_VALUE;
            Expression readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scroll_axis_alignment", typeHelper6, function13, expression8);
            Expression expression9 = readOptionalExpression12 == null ? expression8 : readOptionalExpression12;
            List readOptionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.component.getDivActionJsonEntityParser());
            List readOptionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.component.getDivTooltipJsonEntityParser());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.component.getDivTransformJsonEntityParser());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.component.getDivChangeTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.component.getDivAppearanceTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.component.getDivAppearanceTransitionJsonEntityParser());
            List readOptionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivPagerJsonParser.TRANSITION_TRIGGERS_VALIDATOR);
            List readOptionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.component.getDivTriggerJsonEntityParser());
            List readOptionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.component.getDivVariableJsonEntityParser());
            TypeHelper typeHelper7 = DivPagerJsonParser.TYPE_HELPER_VISIBILITY;
            Function1 function16 = DivVisibility.FROM_STRING;
            Expression expression10 = DivPagerJsonParser.VISIBILITY_DEFAULT_VALUE;
            Expression readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, typeHelper7, function16, expression10);
            Expression expression11 = readOptionalExpression13 == null ? expression10 : readOptionalExpression13;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.component.getDivVisibilityActionJsonEntityParser());
            List readOptionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.component.getDivVisibilityActionJsonEntityParser());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.component.getDivSizeJsonEntityParser());
            if (divSize3 == null) {
                divSize3 = DivPagerJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivPager(divAccessibility, readOptionalExpression, readOptionalExpression2, expression, readOptionalList, readOptionalList2, divBorder, readOptionalExpression4, expression3, expression4, readOptionalList3, readOptionalList4, divFocus, readOptionalList5, divSize2, str, expression5, divCollectionItemBuilder, divFixedSize2, readOptionalList6, divPagerLayoutMode, divLayoutProvider, divEdgeInsets, expression6, divEdgeInsets2, divPageTransformation, expression7, readOptionalExpression10, readOptionalExpression11, expression9, readOptionalList7, readOptionalList8, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, readOptionalList9, readOptionalList10, readOptionalList11, expression11, divVisibilityAction, readOptionalList12, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivPager divPager) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divPager.getAccessibility(), this.component.getDivAccessibilityJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divPager.getAlignmentHorizontal(), DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divPager.getAlignmentVertical(), DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divPager.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divPager.getAnimators(), this.component.getDivAnimatorJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, M2.g, divPager.getBackground(), this.component.getDivBackgroundJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divPager.getBorder(), this.component.getDivBorderJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divPager.getColumnSpan());
            Expression expression = divPager.crossAxisAlignment;
            Function1 function1 = DivPager.ItemAlignment.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "cross_axis_alignment", expression, function1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "default_item", divPager.defaultItem);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divPager.getDisappearActions(), this.component.getDivDisappearActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divPager.getExtensions(), this.component.getDivExtensionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divPager.getFocus(), this.component.getDivFocusJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divPager.getFunctions(), this.component.getDivFunctionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divPager.getHeight(), this.component.getDivSizeJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divPager.getId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "infinite_scroll", divPager.infiniteScroll);
            JsonPropertyParser.write(parsingContext, jSONObject, "item_builder", divPager.itemBuilder, this.component.getDivCollectionItemBuilderJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "item_spacing", divPager.itemSpacing, this.component.getDivFixedSizeJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", divPager.items, this.component.getDivJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_mode", divPager.layoutMode, this.component.getDivPagerLayoutModeJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divPager.getLayoutProvider(), this.component.getDivLayoutProviderJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divPager.getMargins(), this.component.getDivEdgeInsetsJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, X3.i.n, divPager.orientation, DivPager.Orientation.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divPager.getPaddings(), this.component.getDivEdgeInsetsJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "page_transformation", divPager.pageTransformation, this.component.getDivPageTransformationJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "restrict_parent_scroll", divPager.restrictParentScroll);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divPager.getReuseId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divPager.getRowSpan());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scroll_axis_alignment", divPager.scrollAxisAlignment, function1);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divPager.getSelectedActions(), this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divPager.getTooltips(), this.component.getDivTooltipJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divPager.getTransform(), this.component.getDivTransformJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divPager.getTransitionChange(), this.component.getDivChangeTransitionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divPager.getTransitionIn(), this.component.getDivAppearanceTransitionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divPager.getTransitionOut(), this.component.getDivAppearanceTransitionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divPager.getTransitionTriggers(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "pager");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divPager.getVariableTriggers(), this.component.getDivTriggerJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divPager.getVariables(), this.component.getDivVariableJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, divPager.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divPager.getVisibilityAction(), this.component.getDivVisibilityActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divPager.getVisibilityActions(), this.component.getDivVisibilityActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divPager.getWidth(), this.component.getDivSizeJsonEntityParser());
            return jSONObject;
        }
    }

    /* compiled from: DivPagerJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivPagerTemplate deserialize(ParsingContext parsingContext, DivPagerTemplate divPagerTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.accessibility : null, this.component.getDivAccessibilityJsonTemplateParser());
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_horizontal", DivPagerJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.alignmentHorizontal : null, DivAlignmentHorizontal.FROM_STRING);
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", DivPagerJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.alignmentVertical : null, DivAlignmentVertical.FROM_STRING);
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.alpha : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivPagerJsonParser.ALPHA_VALIDATOR);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.animators : null, this.component.getDivAnimatorJsonTemplateParser());
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, M2.g, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.background : null, this.component.getDivBackgroundJsonTemplateParser());
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.border : null, this.component.getDivBorderJsonTemplateParser());
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = divPagerTemplate != null ? divPagerTemplate.columnSpan : null;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, field, function1, DivPagerJsonParser.COLUMN_SPAN_VALIDATOR);
            TypeHelper typeHelper2 = DivPagerJsonParser.TYPE_HELPER_CROSS_AXIS_ALIGNMENT;
            Field field2 = divPagerTemplate != null ? divPagerTemplate.crossAxisAlignment : null;
            Function1 function12 = DivPager.ItemAlignment.FROM_STRING;
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "cross_axis_alignment", typeHelper2, allowPropertyOverride, field2, function12);
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "default_item", typeHelper, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.defaultItem : null, function1, DivPagerJsonParser.DEFAULT_ITEM_VALIDATOR);
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.disappearActions : null, this.component.getDivDisappearActionJsonTemplateParser());
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.extensions : null, this.component.getDivExtensionJsonTemplateParser());
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.focus : null, this.component.getDivFocusJsonTemplateParser());
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.functions : null, this.component.getDivFunctionJsonTemplateParser());
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.height : null, this.component.getDivSizeJsonTemplateParser());
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.id : null);
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field3 = divPagerTemplate != null ? divPagerTemplate.infiniteScroll : null;
            Function1 function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "infinite_scroll", typeHelper3, allowPropertyOverride, field3, function13);
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "item_builder", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.itemBuilder : null, this.component.getDivCollectionItemBuilderJsonTemplateParser());
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "item_spacing", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.itemSpacing : null, this.component.getDivFixedSizeJsonTemplateParser());
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "items", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.items : null, this.component.getDivJsonTemplateParser());
            Field readField = JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "layout_mode", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.layoutMode : null, this.component.getDivPagerLayoutModeJsonTemplateParser());
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.layoutProvider : null, this.component.getDivLayoutProviderJsonTemplateParser());
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.margins : null, this.component.getDivEdgeInsetsJsonTemplateParser());
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, X3.i.n, DivPagerJsonParser.TYPE_HELPER_ORIENTATION, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.orientation : null, DivPager.Orientation.FROM_STRING);
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.paddings : null, this.component.getDivEdgeInsetsJsonTemplateParser());
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "page_transformation", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.pageTransformation : null, this.component.getDivPageTransformationJsonTemplateParser());
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "restrict_parent_scroll", typeHelper3, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.restrictParentScroll : null, function13);
            Field readOptionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.reuseId : null);
            Field readOptionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.rowSpan : null, function1, DivPagerJsonParser.ROW_SPAN_VALIDATOR);
            Field readOptionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "scroll_axis_alignment", DivPagerJsonParser.TYPE_HELPER_SCROLL_AXIS_ALIGNMENT, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.scrollAxisAlignment : null, function12);
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.selectedActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalListField8 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.tooltips : null, this.component.getDivTooltipJsonTemplateParser());
            Field readOptionalField12 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.transform : null, this.component.getDivTransformJsonTemplateParser());
            Field readOptionalField13 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.transitionChange : null, this.component.getDivChangeTransitionJsonTemplateParser());
            Field readOptionalField14 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.transitionIn : null, this.component.getDivAppearanceTransitionJsonTemplateParser());
            Field readOptionalField15 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.transitionOut : null, this.component.getDivAppearanceTransitionJsonTemplateParser());
            Field field4 = divPagerTemplate != null ? divPagerTemplate.transitionTriggers : null;
            Function1 function14 = DivTransitionTrigger.FROM_STRING;
            ListValidator listValidator = DivPagerJsonParser.TRANSITION_TRIGGERS_VALIDATOR;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivPagerTemplate(readOptionalField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField, readOptionalListField2, readOptionalField2, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalListField3, readOptionalListField4, readOptionalField3, readOptionalListField5, readOptionalField4, readOptionalField5, readOptionalFieldWithExpression7, readOptionalField6, readOptionalField7, readOptionalListField6, readField, readOptionalField8, readOptionalField9, readOptionalFieldWithExpression8, readOptionalField10, readOptionalField11, readOptionalFieldWithExpression9, readOptionalFieldWithExpression10, readOptionalFieldWithExpression11, readOptionalFieldWithExpression12, readOptionalListField7, readOptionalListField8, readOptionalField12, readOptionalField13, readOptionalField14, readOptionalField15, JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field4, function14, listValidator), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.variableTriggers : null, this.component.getDivTriggerJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.variables : null, this.component.getDivVariableJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, DivPagerJsonParser.TYPE_HELPER_VISIBILITY, allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.visibility : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.visibilityAction : null, this.component.getDivVisibilityActionJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.visibilityActions : null, this.component.getDivVisibilityActionJsonTemplateParser()), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divPagerTemplate != null ? divPagerTemplate.width : null, this.component.getDivSizeJsonTemplateParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivPagerTemplate divPagerTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divPagerTemplate.accessibility, this.component.getDivAccessibilityJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", divPagerTemplate.alignmentHorizontal, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", divPagerTemplate.alignmentVertical, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divPagerTemplate.alpha);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divPagerTemplate.animators, this.component.getDivAnimatorJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, M2.g, divPagerTemplate.background, this.component.getDivBackgroundJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", divPagerTemplate.border, this.component.getDivBorderJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divPagerTemplate.columnSpan);
            Field field = divPagerTemplate.crossAxisAlignment;
            Function1 function1 = DivPager.ItemAlignment.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "cross_axis_alignment", field, function1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "default_item", divPagerTemplate.defaultItem);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divPagerTemplate.disappearActions, this.component.getDivDisappearActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divPagerTemplate.extensions, this.component.getDivExtensionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divPagerTemplate.focus, this.component.getDivFocusJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divPagerTemplate.functions, this.component.getDivFunctionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divPagerTemplate.height, this.component.getDivSizeJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divPagerTemplate.id);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "infinite_scroll", divPagerTemplate.infiniteScroll);
            JsonFieldParser.writeField(parsingContext, jSONObject, "item_builder", divPagerTemplate.itemBuilder, this.component.getDivCollectionItemBuilderJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "item_spacing", divPagerTemplate.itemSpacing, this.component.getDivFixedSizeJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", divPagerTemplate.items, this.component.getDivJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_mode", divPagerTemplate.layoutMode, this.component.getDivPagerLayoutModeJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divPagerTemplate.layoutProvider, this.component.getDivLayoutProviderJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divPagerTemplate.margins, this.component.getDivEdgeInsetsJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, X3.i.n, divPagerTemplate.orientation, DivPager.Orientation.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divPagerTemplate.paddings, this.component.getDivEdgeInsetsJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "page_transformation", divPagerTemplate.pageTransformation, this.component.getDivPageTransformationJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "restrict_parent_scroll", divPagerTemplate.restrictParentScroll);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divPagerTemplate.reuseId);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divPagerTemplate.rowSpan);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scroll_axis_alignment", divPagerTemplate.scrollAxisAlignment, function1);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divPagerTemplate.selectedActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divPagerTemplate.tooltips, this.component.getDivTooltipJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divPagerTemplate.transform, this.component.getDivTransformJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divPagerTemplate.transitionChange, this.component.getDivChangeTransitionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divPagerTemplate.transitionIn, this.component.getDivAppearanceTransitionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divPagerTemplate.transitionOut, this.component.getDivAppearanceTransitionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divPagerTemplate.transitionTriggers, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "pager");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divPagerTemplate.variableTriggers, this.component.getDivTriggerJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divPagerTemplate.variables, this.component.getDivVariableJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, divPagerTemplate.visibility, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divPagerTemplate.visibilityAction, this.component.getDivVisibilityActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divPagerTemplate.visibilityActions, this.component.getDivVisibilityActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divPagerTemplate.width, this.component.getDivSizeJsonTemplateParser());
            return jSONObject;
        }
    }

    /* compiled from: DivPagerJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivPager resolve(ParsingContext parsingContext, DivPagerTemplate divPagerTemplate, JSONObject jSONObject) {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.accessibility, jSONObject, "accessibility", this.component.getDivAccessibilityJsonTemplateResolver(), this.component.getDivAccessibilityJsonEntityParser());
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divPagerTemplate.alignmentHorizontal, jSONObject, "alignment_horizontal", DivPagerJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL, DivAlignmentHorizontal.FROM_STRING);
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divPagerTemplate.alignmentVertical, jSONObject, "alignment_vertical", DivPagerJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, DivAlignmentVertical.FROM_STRING);
            Field field = divPagerTemplate.alpha;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivPagerJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivPagerJsonParser.ALPHA_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression3 != null) {
                expression = resolveOptionalExpression3;
            }
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.animators, jSONObject, "animators", this.component.getDivAnimatorJsonTemplateResolver(), this.component.getDivAnimatorJsonEntityParser());
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.background, jSONObject, M2.g, this.component.getDivBackgroundJsonTemplateResolver(), this.component.getDivBackgroundJsonEntityParser());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.border, jSONObject, "border", this.component.getDivBorderJsonTemplateResolver(), this.component.getDivBorderJsonEntityParser());
            Field field2 = divPagerTemplate.columnSpan;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "column_span", typeHelper2, function12, DivPagerJsonParser.COLUMN_SPAN_VALIDATOR);
            Field field3 = divPagerTemplate.crossAxisAlignment;
            TypeHelper typeHelper3 = DivPagerJsonParser.TYPE_HELPER_CROSS_AXIS_ALIGNMENT;
            Function1 function13 = DivPager.ItemAlignment.FROM_STRING;
            Expression expression2 = DivPagerJsonParser.CROSS_AXIS_ALIGNMENT_DEFAULT_VALUE;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "cross_axis_alignment", typeHelper3, function13, expression2);
            Expression expression3 = resolveOptionalExpression5 == null ? expression2 : resolveOptionalExpression5;
            Field field4 = divPagerTemplate.defaultItem;
            ValueValidator valueValidator2 = DivPagerJsonParser.DEFAULT_ITEM_VALIDATOR;
            Expression expression4 = DivPagerJsonParser.DEFAULT_ITEM_DEFAULT_VALUE;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "default_item", typeHelper2, function12, valueValidator2, expression4);
            if (resolveOptionalExpression6 != null) {
                expression4 = resolveOptionalExpression6;
            }
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.disappearActions, jSONObject, "disappear_actions", this.component.getDivDisappearActionJsonTemplateResolver(), this.component.getDivDisappearActionJsonEntityParser());
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.extensions, jSONObject, "extensions", this.component.getDivExtensionJsonTemplateResolver(), this.component.getDivExtensionJsonEntityParser());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.focus, jSONObject, "focus", this.component.getDivFocusJsonTemplateResolver(), this.component.getDivFocusJsonEntityParser());
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.functions, jSONObject, "functions", this.component.getDivFunctionJsonTemplateResolver(), this.component.getDivFunctionJsonEntityParser());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.height, jSONObject, "height", this.component.getDivSizeJsonTemplateResolver(), this.component.getDivSizeJsonEntityParser());
            if (divSize == null) {
                divSize = DivPagerJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            DivSize divSize2 = divSize;
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.id, jSONObject, "id");
            Field field5 = divPagerTemplate.infiniteScroll;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression5 = DivPagerJsonParser.INFINITE_SCROLL_DEFAULT_VALUE;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "infinite_scroll", typeHelper4, function14, expression5);
            if (resolveOptionalExpression7 != null) {
                expression5 = resolveOptionalExpression7;
            }
            DivCollectionItemBuilder divCollectionItemBuilder = (DivCollectionItemBuilder) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.itemBuilder, jSONObject, "item_builder", this.component.getDivCollectionItemBuilderJsonTemplateResolver(), this.component.getDivCollectionItemBuilderJsonEntityParser());
            DivFixedSize divFixedSize = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.itemSpacing, jSONObject, "item_spacing", this.component.getDivFixedSizeJsonTemplateResolver(), this.component.getDivFixedSizeJsonEntityParser());
            if (divFixedSize == null) {
                divFixedSize = DivPagerJsonParser.ITEM_SPACING_DEFAULT_VALUE;
            }
            DivFixedSize divFixedSize2 = divFixedSize;
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.items, jSONObject, "items", this.component.getDivJsonTemplateResolver(), this.component.getDivJsonEntityParser());
            DivPagerLayoutMode divPagerLayoutMode = (DivPagerLayoutMode) JsonFieldResolver.resolve(parsingContext, divPagerTemplate.layoutMode, jSONObject, "layout_mode", this.component.getDivPagerLayoutModeJsonTemplateResolver(), this.component.getDivPagerLayoutModeJsonEntityParser());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.layoutProvider, jSONObject, "layout_provider", this.component.getDivLayoutProviderJsonTemplateResolver(), this.component.getDivLayoutProviderJsonEntityParser());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.margins, jSONObject, "margins", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            Field field6 = divPagerTemplate.orientation;
            TypeHelper typeHelper5 = DivPagerJsonParser.TYPE_HELPER_ORIENTATION;
            Function1 function15 = DivPager.Orientation.FROM_STRING;
            Expression expression6 = DivPagerJsonParser.ORIENTATION_DEFAULT_VALUE;
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, X3.i.n, typeHelper5, function15, expression6);
            if (resolveOptionalExpression8 != null) {
                expression6 = resolveOptionalExpression8;
            }
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.paddings, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            DivPageTransformation divPageTransformation = (DivPageTransformation) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.pageTransformation, jSONObject, "page_transformation", this.component.getDivPageTransformationJsonTemplateResolver(), this.component.getDivPageTransformationJsonEntityParser());
            Field field7 = divPagerTemplate.restrictParentScroll;
            Expression expression7 = DivPagerJsonParser.RESTRICT_PARENT_SCROLL_DEFAULT_VALUE;
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "restrict_parent_scroll", typeHelper4, function14, expression7);
            if (resolveOptionalExpression9 != null) {
                expression7 = resolveOptionalExpression9;
            }
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divPagerTemplate.reuseId, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divPagerTemplate.rowSpan, jSONObject, "row_span", typeHelper2, function12, DivPagerJsonParser.ROW_SPAN_VALIDATOR);
            Field field8 = divPagerTemplate.scrollAxisAlignment;
            TypeHelper typeHelper6 = DivPagerJsonParser.TYPE_HELPER_SCROLL_AXIS_ALIGNMENT;
            Expression expression8 = DivPagerJsonParser.SCROLL_AXIS_ALIGNMENT_DEFAULT_VALUE;
            Expression resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "scroll_axis_alignment", typeHelper6, function13, expression8);
            Expression expression9 = resolveOptionalExpression12 == null ? expression8 : resolveOptionalExpression12;
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.selectedActions, jSONObject, "selected_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.tooltips, jSONObject, "tooltips", this.component.getDivTooltipJsonTemplateResolver(), this.component.getDivTooltipJsonEntityParser());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.transform, jSONObject, "transform", this.component.getDivTransformJsonTemplateResolver(), this.component.getDivTransformJsonEntityParser());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.transitionChange, jSONObject, "transition_change", this.component.getDivChangeTransitionJsonTemplateResolver(), this.component.getDivChangeTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.transitionIn, jSONObject, "transition_in", this.component.getDivAppearanceTransitionJsonTemplateResolver(), this.component.getDivAppearanceTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.transitionOut, jSONObject, "transition_out", this.component.getDivAppearanceTransitionJsonTemplateResolver(), this.component.getDivAppearanceTransitionJsonEntityParser());
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.transitionTriggers, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivPagerJsonParser.TRANSITION_TRIGGERS_VALIDATOR);
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.variableTriggers, jSONObject, "variable_triggers", this.component.getDivTriggerJsonTemplateResolver(), this.component.getDivTriggerJsonEntityParser());
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.variables, jSONObject, "variables", this.component.getDivVariableJsonTemplateResolver(), this.component.getDivVariableJsonEntityParser());
            Field field9 = divPagerTemplate.visibility;
            TypeHelper typeHelper7 = DivPagerJsonParser.TYPE_HELPER_VISIBILITY;
            Function1 function16 = DivVisibility.FROM_STRING;
            Expression expression10 = DivPagerJsonParser.VISIBILITY_DEFAULT_VALUE;
            Expression resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, typeHelper7, function16, expression10);
            Expression expression11 = resolveOptionalExpression13 == null ? expression10 : resolveOptionalExpression13;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.visibilityAction, jSONObject, "visibility_action", this.component.getDivVisibilityActionJsonTemplateResolver(), this.component.getDivVisibilityActionJsonEntityParser());
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divPagerTemplate.visibilityActions, jSONObject, "visibility_actions", this.component.getDivVisibilityActionJsonTemplateResolver(), this.component.getDivVisibilityActionJsonEntityParser());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divPagerTemplate.width, jSONObject, "width", this.component.getDivSizeJsonTemplateResolver(), this.component.getDivSizeJsonEntityParser());
            if (divSize3 == null) {
                divSize3 = DivPagerJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivPager(divAccessibility, resolveOptionalExpression, resolveOptionalExpression2, expression, resolveOptionalList, resolveOptionalList2, divBorder, resolveOptionalExpression4, expression3, expression4, resolveOptionalList3, resolveOptionalList4, divFocus, resolveOptionalList5, divSize2, str, expression5, divCollectionItemBuilder, divFixedSize2, resolveOptionalList6, divPagerLayoutMode, divLayoutProvider, divEdgeInsets, expression6, divEdgeInsets2, divPageTransformation, expression7, resolveOptionalExpression10, resolveOptionalExpression11, expression9, resolveOptionalList7, resolveOptionalList8, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, resolveOptionalList9, resolveOptionalList10, resolveOptionalList11, expression11, divVisibilityAction, resolveOptionalList12, divSize3);
        }
    }

    /* compiled from: DivPagerJsonParser.kt */
    private static final class Companion {
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
        DivPager.ItemAlignment itemAlignment = DivPager.ItemAlignment.START;
        CROSS_AXIS_ALIGNMENT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, itemAlignment, null, 2, null);
        DEFAULT_ITEM_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        DivSizeUnitValue divSizeUnitValue = null;
        DivSizeUnitValue divSizeUnitValue2 = null;
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, divSizeUnitValue, divSizeUnitValue2, 7, null));
        Boolean bool = Boolean.FALSE;
        INFINITE_SCROLL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        ITEM_SPACING_DEFAULT_VALUE = new DivFixedSize(null == true ? 1 : 0, Expression.Companion.constant$default(companion, 0L, null, 2, null), 1, null == true ? 1 : 0);
        DivPager.Orientation orientation = DivPager.Orientation.HORIZONTAL;
        ORIENTATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, orientation, null, 2, null);
        RESTRICT_PARENT_SCROLL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        DivPager.ItemAlignment itemAlignment2 = DivPager.ItemAlignment.CENTER;
        SCROLL_AXIS_ALIGNMENT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, itemAlignment2, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(divSizeUnitValue, divSizeUnitValue2, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        TYPE_HELPER_ALIGNMENT_HORIZONTAL = companion2.from(ArraysKt.first(DivAlignmentHorizontal.values()), new Function1() { // from class: com.yandex.div2.DivPagerJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        TYPE_HELPER_ALIGNMENT_VERTICAL = companion2.from(ArraysKt.first(DivAlignmentVertical.values()), new Function1() { // from class: com.yandex.div2.DivPagerJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        TYPE_HELPER_CROSS_AXIS_ALIGNMENT = companion2.from(itemAlignment, new Function1() { // from class: com.yandex.div2.DivPagerJsonParser$Companion$TYPE_HELPER_CROSS_AXIS_ALIGNMENT$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivPager.ItemAlignment);
            }
        });
        TYPE_HELPER_ORIENTATION = companion2.from(orientation, new Function1() { // from class: com.yandex.div2.DivPagerJsonParser$Companion$TYPE_HELPER_ORIENTATION$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivPager.Orientation);
            }
        });
        TYPE_HELPER_SCROLL_AXIS_ALIGNMENT = companion2.from(itemAlignment2, new Function1() { // from class: com.yandex.div2.DivPagerJsonParser$Companion$TYPE_HELPER_SCROLL_AXIS_ALIGNMENT$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivPager.ItemAlignment);
            }
        });
        TYPE_HELPER_VISIBILITY = companion2.from(divVisibility, new Function1() { // from class: com.yandex.div2.DivPagerJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        ALPHA_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivPagerJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ALPHA_VALIDATOR$lambda$0;
                ALPHA_VALIDATOR$lambda$0 = DivPagerJsonParser.ALPHA_VALIDATOR$lambda$0(((Double) obj).doubleValue());
                return ALPHA_VALIDATOR$lambda$0;
            }
        };
        COLUMN_SPAN_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivPagerJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean COLUMN_SPAN_VALIDATOR$lambda$1;
                COLUMN_SPAN_VALIDATOR$lambda$1 = DivPagerJsonParser.COLUMN_SPAN_VALIDATOR$lambda$1(((Long) obj).longValue());
                return COLUMN_SPAN_VALIDATOR$lambda$1;
            }
        };
        DEFAULT_ITEM_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivPagerJsonParser$$ExternalSyntheticLambda2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean DEFAULT_ITEM_VALIDATOR$lambda$2;
                DEFAULT_ITEM_VALIDATOR$lambda$2 = DivPagerJsonParser.DEFAULT_ITEM_VALIDATOR$lambda$2(((Long) obj).longValue());
                return DEFAULT_ITEM_VALIDATOR$lambda$2;
            }
        };
        ROW_SPAN_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivPagerJsonParser$$ExternalSyntheticLambda3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ROW_SPAN_VALIDATOR$lambda$3;
                ROW_SPAN_VALIDATOR$lambda$3 = DivPagerJsonParser.ROW_SPAN_VALIDATOR$lambda$3(((Long) obj).longValue());
                return ROW_SPAN_VALIDATOR$lambda$3;
            }
        };
        TRANSITION_TRIGGERS_VALIDATOR = new ListValidator() { // from class: com.yandex.div2.DivPagerJsonParser$$ExternalSyntheticLambda4
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean TRANSITION_TRIGGERS_VALIDATOR$lambda$4;
                TRANSITION_TRIGGERS_VALIDATOR$lambda$4 = DivPagerJsonParser.TRANSITION_TRIGGERS_VALIDATOR$lambda$4(list);
                return TRANSITION_TRIGGERS_VALIDATOR$lambda$4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TRANSITION_TRIGGERS_VALIDATOR$lambda$4(List list) {
        return list.size() >= 1;
    }
}
