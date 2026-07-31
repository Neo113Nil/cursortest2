package com.yandex.div2;

import com.facebook.appevents.internal.ViewHierarchyConstants;
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
import com.yandex.div2.DivIndicator;
import com.yandex.div2.DivShape;
import com.yandex.div2.DivSize;
import io.appmetrica.analytics.impl.M2;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivIndicatorJsonParser.kt */
/* loaded from: classes9.dex */
public abstract class DivIndicatorJsonParser {
    public static final Expression ACTIVE_ITEM_COLOR_DEFAULT_VALUE;
    public static final Expression ACTIVE_ITEM_SIZE_DEFAULT_VALUE;
    public static final ValueValidator ACTIVE_ITEM_SIZE_VALIDATOR;
    public static final Expression ALPHA_DEFAULT_VALUE;
    public static final ValueValidator ALPHA_VALIDATOR;
    public static final Expression ANIMATION_DEFAULT_VALUE;
    public static final ValueValidator COLUMN_SPAN_VALIDATOR;
    private static final Companion Companion = new Companion(null);
    public static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    public static final Expression INACTIVE_ITEM_COLOR_DEFAULT_VALUE;
    public static final Expression MINIMUM_ITEM_SIZE_DEFAULT_VALUE;
    public static final ValueValidator MINIMUM_ITEM_SIZE_VALIDATOR;
    public static final ValueValidator ROW_SPAN_VALIDATOR;
    public static final DivShape.RoundedRectangle SHAPE_DEFAULT_VALUE;
    public static final DivFixedSize SPACE_BETWEEN_CENTERS_DEFAULT_VALUE;
    public static final ListValidator TRANSITION_TRIGGERS_VALIDATOR;
    public static final TypeHelper TYPE_HELPER_ALIGNMENT_HORIZONTAL;
    public static final TypeHelper TYPE_HELPER_ALIGNMENT_VERTICAL;
    public static final TypeHelper TYPE_HELPER_ANIMATION;
    public static final TypeHelper TYPE_HELPER_VISIBILITY;
    public static final Expression VISIBILITY_DEFAULT_VALUE;
    public static final DivSize.MatchParent WIDTH_DEFAULT_VALUE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ACTIVE_ITEM_SIZE_VALIDATOR$lambda$0(double d) {
        return d > 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ALPHA_VALIDATOR$lambda$1(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean COLUMN_SPAN_VALIDATOR$lambda$2(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MINIMUM_ITEM_SIZE_VALIDATOR$lambda$3(double d) {
        return d > 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ROW_SPAN_VALIDATOR$lambda$4(long j) {
        return j >= 0;
    }

    /* compiled from: DivIndicatorJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivIndicator deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.component.getDivAccessibilityJsonEntityParser());
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1 function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression = DivIndicatorJsonParser.ACTIVE_ITEM_COLOR_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "active_item_color", typeHelper, function1, expression);
            Expression expression2 = readOptionalExpression == null ? expression : readOptionalExpression;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivIndicatorJsonParser.ACTIVE_ITEM_SIZE_VALIDATOR;
            Expression expression3 = DivIndicatorJsonParser.ACTIVE_ITEM_SIZE_DEFAULT_VALUE;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "active_item_size", typeHelper2, function12, valueValidator, expression3);
            if (readOptionalExpression2 != null) {
                expression3 = readOptionalExpression2;
            }
            DivRoundedRectangleShape divRoundedRectangleShape = (DivRoundedRectangleShape) JsonPropertyParser.readOptional(parsingContext, jSONObject, "active_shape", this.component.getDivRoundedRectangleShapeJsonEntityParser());
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", DivIndicatorJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL, DivAlignmentHorizontal.FROM_STRING);
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivIndicatorJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, DivAlignmentVertical.FROM_STRING);
            ValueValidator valueValidator2 = DivIndicatorJsonParser.ALPHA_VALIDATOR;
            Expression expression4 = DivIndicatorJsonParser.ALPHA_DEFAULT_VALUE;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper2, function12, valueValidator2, expression4);
            if (readOptionalExpression5 != null) {
                expression4 = readOptionalExpression5;
            }
            TypeHelper typeHelper3 = DivIndicatorJsonParser.TYPE_HELPER_ANIMATION;
            Function1 function13 = DivIndicator.Animation.FROM_STRING;
            Expression expression5 = DivIndicatorJsonParser.ANIMATION_DEFAULT_VALUE;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "animation", typeHelper3, function13, expression5);
            Expression expression6 = readOptionalExpression6 == null ? expression5 : readOptionalExpression6;
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.component.getDivAnimatorJsonEntityParser());
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, M2.g, this.component.getDivBackgroundJsonEntityParser());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.component.getDivBorderJsonEntityParser());
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function14 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper4, function14, DivIndicatorJsonParser.COLUMN_SPAN_VALIDATOR);
            List readOptionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.component.getDivDisappearActionJsonEntityParser());
            List readOptionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.component.getDivExtensionJsonEntityParser());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.component.getDivFocusJsonEntityParser());
            List readOptionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.component.getDivFunctionJsonEntityParser());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.component.getDivSizeJsonEntityParser());
            if (divSize == null) {
                divSize = DivIndicatorJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            DivSize divSize2 = divSize;
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            Expression expression7 = DivIndicatorJsonParser.INACTIVE_ITEM_COLOR_DEFAULT_VALUE;
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "inactive_item_color", typeHelper, function1, expression7);
            Expression expression8 = readOptionalExpression8 == null ? expression7 : readOptionalExpression8;
            DivRoundedRectangleShape divRoundedRectangleShape2 = (DivRoundedRectangleShape) JsonPropertyParser.readOptional(parsingContext, jSONObject, "inactive_minimum_shape", this.component.getDivRoundedRectangleShapeJsonEntityParser());
            DivRoundedRectangleShape divRoundedRectangleShape3 = (DivRoundedRectangleShape) JsonPropertyParser.readOptional(parsingContext, jSONObject, "inactive_shape", this.component.getDivRoundedRectangleShapeJsonEntityParser());
            DivIndicatorItemPlacement divIndicatorItemPlacement = (DivIndicatorItemPlacement) JsonPropertyParser.readOptional(parsingContext, jSONObject, "items_placement", this.component.getDivIndicatorItemPlacementJsonEntityParser());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.component.getDivLayoutProviderJsonEntityParser());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.component.getDivEdgeInsetsJsonEntityParser());
            ValueValidator valueValidator3 = DivIndicatorJsonParser.MINIMUM_ITEM_SIZE_VALIDATOR;
            Expression expression9 = DivIndicatorJsonParser.MINIMUM_ITEM_SIZE_DEFAULT_VALUE;
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "minimum_item_size", typeHelper2, function12, valueValidator3, expression9);
            Expression expression10 = readOptionalExpression9 == null ? expression9 : readOptionalExpression9;
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonEntityParser());
            String str2 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "pager_id");
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper4, function14, DivIndicatorJsonParser.ROW_SPAN_VALIDATOR);
            List readOptionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.component.getDivActionJsonEntityParser());
            DivShape divShape = (DivShape) JsonPropertyParser.readOptional(parsingContext, jSONObject, "shape", this.component.getDivShapeJsonEntityParser());
            if (divShape == null) {
                divShape = DivIndicatorJsonParser.SHAPE_DEFAULT_VALUE;
            }
            DivShape divShape2 = divShape;
            DivFixedSize divFixedSize = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "space_between_centers", this.component.getDivFixedSizeJsonEntityParser());
            if (divFixedSize == null) {
                divFixedSize = DivIndicatorJsonParser.SPACE_BETWEEN_CENTERS_DEFAULT_VALUE;
            }
            DivFixedSize divFixedSize2 = divFixedSize;
            List readOptionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.component.getDivTooltipJsonEntityParser());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.component.getDivTransformJsonEntityParser());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.component.getDivChangeTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.component.getDivAppearanceTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.component.getDivAppearanceTransitionJsonEntityParser());
            List readOptionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivIndicatorJsonParser.TRANSITION_TRIGGERS_VALIDATOR);
            List readOptionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.component.getDivTriggerJsonEntityParser());
            List readOptionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.component.getDivVariableJsonEntityParser());
            TypeHelper typeHelper5 = DivIndicatorJsonParser.TYPE_HELPER_VISIBILITY;
            Function1 function15 = DivVisibility.FROM_STRING;
            Expression expression11 = DivIndicatorJsonParser.VISIBILITY_DEFAULT_VALUE;
            Expression readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, typeHelper5, function15, expression11);
            Expression expression12 = readOptionalExpression12 == null ? expression11 : readOptionalExpression12;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.component.getDivVisibilityActionJsonEntityParser());
            List readOptionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.component.getDivVisibilityActionJsonEntityParser());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.component.getDivSizeJsonEntityParser());
            if (divSize3 == null) {
                divSize3 = DivIndicatorJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivIndicator(divAccessibility, expression2, expression3, divRoundedRectangleShape, readOptionalExpression3, readOptionalExpression4, expression4, expression6, readOptionalList, readOptionalList2, divBorder, readOptionalExpression7, readOptionalList3, readOptionalList4, divFocus, readOptionalList5, divSize2, str, expression8, divRoundedRectangleShape2, divRoundedRectangleShape3, divIndicatorItemPlacement, divLayoutProvider, divEdgeInsets, expression10, divEdgeInsets2, str2, readOptionalExpression10, readOptionalExpression11, readOptionalList6, divShape2, divFixedSize2, readOptionalList7, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, readOptionalList8, readOptionalList9, readOptionalList10, expression12, divVisibilityAction, readOptionalList11, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivIndicator divIndicator) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divIndicator.getAccessibility(), this.component.getDivAccessibilityJsonEntityParser());
            Expression expression = divIndicator.activeItemColor;
            Function1 function1 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "active_item_color", expression, function1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "active_item_size", divIndicator.activeItemSize);
            JsonPropertyParser.write(parsingContext, jSONObject, "active_shape", divIndicator.activeShape, this.component.getDivRoundedRectangleShapeJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divIndicator.getAlignmentHorizontal(), DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divIndicator.getAlignmentVertical(), DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divIndicator.getAlpha());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "animation", divIndicator.animation, DivIndicator.Animation.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divIndicator.getAnimators(), this.component.getDivAnimatorJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, M2.g, divIndicator.getBackground(), this.component.getDivBackgroundJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divIndicator.getBorder(), this.component.getDivBorderJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divIndicator.getColumnSpan());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divIndicator.getDisappearActions(), this.component.getDivDisappearActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divIndicator.getExtensions(), this.component.getDivExtensionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divIndicator.getFocus(), this.component.getDivFocusJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divIndicator.getFunctions(), this.component.getDivFunctionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divIndicator.getHeight(), this.component.getDivSizeJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divIndicator.getId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "inactive_item_color", divIndicator.inactiveItemColor, function1);
            JsonPropertyParser.write(parsingContext, jSONObject, "inactive_minimum_shape", divIndicator.inactiveMinimumShape, this.component.getDivRoundedRectangleShapeJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "inactive_shape", divIndicator.inactiveShape, this.component.getDivRoundedRectangleShapeJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "items_placement", divIndicator.itemsPlacement, this.component.getDivIndicatorItemPlacementJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divIndicator.getLayoutProvider(), this.component.getDivLayoutProviderJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divIndicator.getMargins(), this.component.getDivEdgeInsetsJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "minimum_item_size", divIndicator.minimumItemSize);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divIndicator.getPaddings(), this.component.getDivEdgeInsetsJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "pager_id", divIndicator.pagerId);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divIndicator.getReuseId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divIndicator.getRowSpan());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divIndicator.getSelectedActions(), this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "shape", divIndicator.shape, this.component.getDivShapeJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "space_between_centers", divIndicator.spaceBetweenCenters, this.component.getDivFixedSizeJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divIndicator.getTooltips(), this.component.getDivTooltipJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divIndicator.getTransform(), this.component.getDivTransformJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divIndicator.getTransitionChange(), this.component.getDivChangeTransitionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divIndicator.getTransitionIn(), this.component.getDivAppearanceTransitionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divIndicator.getTransitionOut(), this.component.getDivAppearanceTransitionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divIndicator.getTransitionTriggers(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "indicator");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divIndicator.getVariableTriggers(), this.component.getDivTriggerJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divIndicator.getVariables(), this.component.getDivVariableJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, divIndicator.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divIndicator.getVisibilityAction(), this.component.getDivVisibilityActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divIndicator.getVisibilityActions(), this.component.getDivVisibilityActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divIndicator.getWidth(), this.component.getDivSizeJsonEntityParser());
            return jSONObject;
        }
    }

    /* compiled from: DivIndicatorJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivIndicatorTemplate deserialize(ParsingContext parsingContext, DivIndicatorTemplate divIndicatorTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.accessibility : null, this.component.getDivAccessibilityJsonTemplateParser());
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field field = divIndicatorTemplate != null ? divIndicatorTemplate.activeItemColor : null;
            Function1 function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "active_item_color", typeHelper, allowPropertyOverride, field, function1);
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field field2 = divIndicatorTemplate != null ? divIndicatorTemplate.activeItemSize : null;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "active_item_size", typeHelper2, allowPropertyOverride, field2, function12, DivIndicatorJsonParser.ACTIVE_ITEM_SIZE_VALIDATOR);
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "active_shape", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.activeShape : null, this.component.getDivRoundedRectangleShapeJsonTemplateParser());
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_horizontal", DivIndicatorJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL, allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.alignmentHorizontal : null, DivAlignmentHorizontal.FROM_STRING);
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", DivIndicatorJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.alignmentVertical : null, DivAlignmentVertical.FROM_STRING);
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", typeHelper2, allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.alpha : null, function12, DivIndicatorJsonParser.ALPHA_VALIDATOR);
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "animation", DivIndicatorJsonParser.TYPE_HELPER_ANIMATION, allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.animation : null, DivIndicator.Animation.FROM_STRING);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.animators : null, this.component.getDivAnimatorJsonTemplateParser());
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, M2.g, allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.background : null, this.component.getDivBackgroundJsonTemplateParser());
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.border : null, this.component.getDivBorderJsonTemplateParser());
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            Field field3 = divIndicatorTemplate != null ? divIndicatorTemplate.columnSpan : null;
            Function1 function13 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_span", typeHelper3, allowPropertyOverride, field3, function13, DivIndicatorJsonParser.COLUMN_SPAN_VALIDATOR);
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.disappearActions : null, this.component.getDivDisappearActionJsonTemplateParser());
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.extensions : null, this.component.getDivExtensionJsonTemplateParser());
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.focus : null, this.component.getDivFocusJsonTemplateParser());
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.functions : null, this.component.getDivFunctionJsonTemplateParser());
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.height : null, this.component.getDivSizeJsonTemplateParser());
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.id : null);
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "inactive_item_color", typeHelper, allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.inactiveItemColor : null, function1);
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "inactive_minimum_shape", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.inactiveMinimumShape : null, this.component.getDivRoundedRectangleShapeJsonTemplateParser());
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "inactive_shape", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.inactiveShape : null, this.component.getDivRoundedRectangleShapeJsonTemplateParser());
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "items_placement", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.itemsPlacement : null, this.component.getDivIndicatorItemPlacementJsonTemplateParser());
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.layoutProvider : null, this.component.getDivLayoutProviderJsonTemplateParser());
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.margins : null, this.component.getDivEdgeInsetsJsonTemplateParser());
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "minimum_item_size", typeHelper2, allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.minimumItemSize : null, function12, DivIndicatorJsonParser.MINIMUM_ITEM_SIZE_VALIDATOR);
            Field readOptionalField12 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.paddings : null, this.component.getDivEdgeInsetsJsonTemplateParser());
            Field readOptionalField13 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "pager_id", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.pagerId : null);
            Field readOptionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.reuseId : null);
            Field readOptionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "row_span", typeHelper3, allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.rowSpan : null, function13, DivIndicatorJsonParser.ROW_SPAN_VALIDATOR);
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.selectedActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalField14 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "shape", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.shape : null, this.component.getDivShapeJsonTemplateParser());
            Field readOptionalField15 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "space_between_centers", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.spaceBetweenCenters : null, this.component.getDivFixedSizeJsonTemplateParser());
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.tooltips : null, this.component.getDivTooltipJsonTemplateParser());
            Field readOptionalField16 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.transform : null, this.component.getDivTransformJsonTemplateParser());
            Field readOptionalField17 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.transitionChange : null, this.component.getDivChangeTransitionJsonTemplateParser());
            Field readOptionalField18 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.transitionIn : null, this.component.getDivAppearanceTransitionJsonTemplateParser());
            Field readOptionalField19 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.transitionOut : null, this.component.getDivAppearanceTransitionJsonTemplateParser());
            Field field4 = divIndicatorTemplate != null ? divIndicatorTemplate.transitionTriggers : null;
            Function1 function14 = DivTransitionTrigger.FROM_STRING;
            ListValidator listValidator = DivIndicatorJsonParser.TRANSITION_TRIGGERS_VALIDATOR;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivIndicatorTemplate(readOptionalField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalField2, readOptionalFieldWithExpression3, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalListField, readOptionalListField2, readOptionalField3, readOptionalFieldWithExpression7, readOptionalListField3, readOptionalListField4, readOptionalField4, readOptionalListField5, readOptionalField5, readOptionalField6, readOptionalFieldWithExpression8, readOptionalField7, readOptionalField8, readOptionalField9, readOptionalField10, readOptionalField11, readOptionalFieldWithExpression9, readOptionalField12, readOptionalField13, readOptionalFieldWithExpression10, readOptionalFieldWithExpression11, readOptionalListField6, readOptionalField14, readOptionalField15, readOptionalListField7, readOptionalField16, readOptionalField17, readOptionalField18, readOptionalField19, JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field4, function14, listValidator), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.variableTriggers : null, this.component.getDivTriggerJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.variables : null, this.component.getDivVariableJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, DivIndicatorJsonParser.TYPE_HELPER_VISIBILITY, allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.visibility : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.visibilityAction : null, this.component.getDivVisibilityActionJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.visibilityActions : null, this.component.getDivVisibilityActionJsonTemplateParser()), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divIndicatorTemplate != null ? divIndicatorTemplate.width : null, this.component.getDivSizeJsonTemplateParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivIndicatorTemplate divIndicatorTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divIndicatorTemplate.accessibility, this.component.getDivAccessibilityJsonTemplateParser());
            Field field = divIndicatorTemplate.activeItemColor;
            Function1 function1 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "active_item_color", field, function1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "active_item_size", divIndicatorTemplate.activeItemSize);
            JsonFieldParser.writeField(parsingContext, jSONObject, "active_shape", divIndicatorTemplate.activeShape, this.component.getDivRoundedRectangleShapeJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", divIndicatorTemplate.alignmentHorizontal, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", divIndicatorTemplate.alignmentVertical, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divIndicatorTemplate.alpha);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "animation", divIndicatorTemplate.animation, DivIndicator.Animation.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divIndicatorTemplate.animators, this.component.getDivAnimatorJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, M2.g, divIndicatorTemplate.background, this.component.getDivBackgroundJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", divIndicatorTemplate.border, this.component.getDivBorderJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divIndicatorTemplate.columnSpan);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divIndicatorTemplate.disappearActions, this.component.getDivDisappearActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divIndicatorTemplate.extensions, this.component.getDivExtensionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divIndicatorTemplate.focus, this.component.getDivFocusJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divIndicatorTemplate.functions, this.component.getDivFunctionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divIndicatorTemplate.height, this.component.getDivSizeJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divIndicatorTemplate.id);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "inactive_item_color", divIndicatorTemplate.inactiveItemColor, function1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "inactive_minimum_shape", divIndicatorTemplate.inactiveMinimumShape, this.component.getDivRoundedRectangleShapeJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "inactive_shape", divIndicatorTemplate.inactiveShape, this.component.getDivRoundedRectangleShapeJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "items_placement", divIndicatorTemplate.itemsPlacement, this.component.getDivIndicatorItemPlacementJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divIndicatorTemplate.layoutProvider, this.component.getDivLayoutProviderJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divIndicatorTemplate.margins, this.component.getDivEdgeInsetsJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "minimum_item_size", divIndicatorTemplate.minimumItemSize);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divIndicatorTemplate.paddings, this.component.getDivEdgeInsetsJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "pager_id", divIndicatorTemplate.pagerId);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divIndicatorTemplate.reuseId);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divIndicatorTemplate.rowSpan);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divIndicatorTemplate.selectedActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "shape", divIndicatorTemplate.shape, this.component.getDivShapeJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "space_between_centers", divIndicatorTemplate.spaceBetweenCenters, this.component.getDivFixedSizeJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divIndicatorTemplate.tooltips, this.component.getDivTooltipJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divIndicatorTemplate.transform, this.component.getDivTransformJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divIndicatorTemplate.transitionChange, this.component.getDivChangeTransitionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divIndicatorTemplate.transitionIn, this.component.getDivAppearanceTransitionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divIndicatorTemplate.transitionOut, this.component.getDivAppearanceTransitionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divIndicatorTemplate.transitionTriggers, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "indicator");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divIndicatorTemplate.variableTriggers, this.component.getDivTriggerJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divIndicatorTemplate.variables, this.component.getDivVariableJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, divIndicatorTemplate.visibility, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divIndicatorTemplate.visibilityAction, this.component.getDivVisibilityActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divIndicatorTemplate.visibilityActions, this.component.getDivVisibilityActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divIndicatorTemplate.width, this.component.getDivSizeJsonTemplateParser());
            return jSONObject;
        }
    }

    /* compiled from: DivIndicatorJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivIndicator resolve(ParsingContext parsingContext, DivIndicatorTemplate divIndicatorTemplate, JSONObject jSONObject) {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.accessibility, jSONObject, "accessibility", this.component.getDivAccessibilityJsonTemplateResolver(), this.component.getDivAccessibilityJsonEntityParser());
            Field field = divIndicatorTemplate.activeItemColor;
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1 function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression = DivIndicatorJsonParser.ACTIVE_ITEM_COLOR_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "active_item_color", typeHelper, function1, expression);
            Expression expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            Field field2 = divIndicatorTemplate.activeItemSize;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivIndicatorJsonParser.ACTIVE_ITEM_SIZE_VALIDATOR;
            Expression expression3 = DivIndicatorJsonParser.ACTIVE_ITEM_SIZE_DEFAULT_VALUE;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "active_item_size", typeHelper2, function12, valueValidator, expression3);
            if (resolveOptionalExpression2 != null) {
                expression3 = resolveOptionalExpression2;
            }
            DivRoundedRectangleShape divRoundedRectangleShape = (DivRoundedRectangleShape) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.activeShape, jSONObject, "active_shape", this.component.getDivRoundedRectangleShapeJsonTemplateResolver(), this.component.getDivRoundedRectangleShapeJsonEntityParser());
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divIndicatorTemplate.alignmentHorizontal, jSONObject, "alignment_horizontal", DivIndicatorJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL, DivAlignmentHorizontal.FROM_STRING);
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divIndicatorTemplate.alignmentVertical, jSONObject, "alignment_vertical", DivIndicatorJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, DivAlignmentVertical.FROM_STRING);
            Field field3 = divIndicatorTemplate.alpha;
            ValueValidator valueValidator2 = DivIndicatorJsonParser.ALPHA_VALIDATOR;
            Expression expression4 = DivIndicatorJsonParser.ALPHA_DEFAULT_VALUE;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alpha", typeHelper2, function12, valueValidator2, expression4);
            if (resolveOptionalExpression5 != null) {
                expression4 = resolveOptionalExpression5;
            }
            Field field4 = divIndicatorTemplate.animation;
            TypeHelper typeHelper3 = DivIndicatorJsonParser.TYPE_HELPER_ANIMATION;
            Function1 function13 = DivIndicator.Animation.FROM_STRING;
            Expression expression5 = DivIndicatorJsonParser.ANIMATION_DEFAULT_VALUE;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "animation", typeHelper3, function13, expression5);
            Expression expression6 = resolveOptionalExpression6 == null ? expression5 : resolveOptionalExpression6;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divIndicatorTemplate.animators, jSONObject, "animators", this.component.getDivAnimatorJsonTemplateResolver(), this.component.getDivAnimatorJsonEntityParser());
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divIndicatorTemplate.background, jSONObject, M2.g, this.component.getDivBackgroundJsonTemplateResolver(), this.component.getDivBackgroundJsonEntityParser());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.border, jSONObject, "border", this.component.getDivBorderJsonTemplateResolver(), this.component.getDivBorderJsonEntityParser());
            Field field5 = divIndicatorTemplate.columnSpan;
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function14 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "column_span", typeHelper4, function14, DivIndicatorJsonParser.COLUMN_SPAN_VALIDATOR);
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divIndicatorTemplate.disappearActions, jSONObject, "disappear_actions", this.component.getDivDisappearActionJsonTemplateResolver(), this.component.getDivDisappearActionJsonEntityParser());
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divIndicatorTemplate.extensions, jSONObject, "extensions", this.component.getDivExtensionJsonTemplateResolver(), this.component.getDivExtensionJsonEntityParser());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.focus, jSONObject, "focus", this.component.getDivFocusJsonTemplateResolver(), this.component.getDivFocusJsonEntityParser());
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divIndicatorTemplate.functions, jSONObject, "functions", this.component.getDivFunctionJsonTemplateResolver(), this.component.getDivFunctionJsonEntityParser());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.height, jSONObject, "height", this.component.getDivSizeJsonTemplateResolver(), this.component.getDivSizeJsonEntityParser());
            if (divSize == null) {
                divSize = DivIndicatorJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            DivSize divSize2 = divSize;
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.id, jSONObject, "id");
            Field field6 = divIndicatorTemplate.inactiveItemColor;
            Expression expression7 = DivIndicatorJsonParser.INACTIVE_ITEM_COLOR_DEFAULT_VALUE;
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "inactive_item_color", typeHelper, function1, expression7);
            Expression expression8 = resolveOptionalExpression8 == null ? expression7 : resolveOptionalExpression8;
            DivRoundedRectangleShape divRoundedRectangleShape2 = (DivRoundedRectangleShape) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.inactiveMinimumShape, jSONObject, "inactive_minimum_shape", this.component.getDivRoundedRectangleShapeJsonTemplateResolver(), this.component.getDivRoundedRectangleShapeJsonEntityParser());
            DivRoundedRectangleShape divRoundedRectangleShape3 = (DivRoundedRectangleShape) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.inactiveShape, jSONObject, "inactive_shape", this.component.getDivRoundedRectangleShapeJsonTemplateResolver(), this.component.getDivRoundedRectangleShapeJsonEntityParser());
            DivIndicatorItemPlacement divIndicatorItemPlacement = (DivIndicatorItemPlacement) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.itemsPlacement, jSONObject, "items_placement", this.component.getDivIndicatorItemPlacementJsonTemplateResolver(), this.component.getDivIndicatorItemPlacementJsonEntityParser());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.layoutProvider, jSONObject, "layout_provider", this.component.getDivLayoutProviderJsonTemplateResolver(), this.component.getDivLayoutProviderJsonEntityParser());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.margins, jSONObject, "margins", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            Field field7 = divIndicatorTemplate.minimumItemSize;
            ValueValidator valueValidator3 = DivIndicatorJsonParser.MINIMUM_ITEM_SIZE_VALIDATOR;
            Expression expression9 = DivIndicatorJsonParser.MINIMUM_ITEM_SIZE_DEFAULT_VALUE;
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "minimum_item_size", typeHelper2, function12, valueValidator3, expression9);
            Expression expression10 = resolveOptionalExpression9 == null ? expression9 : resolveOptionalExpression9;
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.paddings, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            String str2 = (String) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.pagerId, jSONObject, "pager_id");
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divIndicatorTemplate.reuseId, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divIndicatorTemplate.rowSpan, jSONObject, "row_span", typeHelper4, function14, DivIndicatorJsonParser.ROW_SPAN_VALIDATOR);
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divIndicatorTemplate.selectedActions, jSONObject, "selected_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            DivShape divShape = (DivShape) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.shape, jSONObject, "shape", this.component.getDivShapeJsonTemplateResolver(), this.component.getDivShapeJsonEntityParser());
            if (divShape == null) {
                divShape = DivIndicatorJsonParser.SHAPE_DEFAULT_VALUE;
            }
            DivShape divShape2 = divShape;
            DivFixedSize divFixedSize = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.spaceBetweenCenters, jSONObject, "space_between_centers", this.component.getDivFixedSizeJsonTemplateResolver(), this.component.getDivFixedSizeJsonEntityParser());
            if (divFixedSize == null) {
                divFixedSize = DivIndicatorJsonParser.SPACE_BETWEEN_CENTERS_DEFAULT_VALUE;
            }
            DivFixedSize divFixedSize2 = divFixedSize;
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divIndicatorTemplate.tooltips, jSONObject, "tooltips", this.component.getDivTooltipJsonTemplateResolver(), this.component.getDivTooltipJsonEntityParser());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.transform, jSONObject, "transform", this.component.getDivTransformJsonTemplateResolver(), this.component.getDivTransformJsonEntityParser());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.transitionChange, jSONObject, "transition_change", this.component.getDivChangeTransitionJsonTemplateResolver(), this.component.getDivChangeTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.transitionIn, jSONObject, "transition_in", this.component.getDivAppearanceTransitionJsonTemplateResolver(), this.component.getDivAppearanceTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.transitionOut, jSONObject, "transition_out", this.component.getDivAppearanceTransitionJsonTemplateResolver(), this.component.getDivAppearanceTransitionJsonEntityParser());
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divIndicatorTemplate.transitionTriggers, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivIndicatorJsonParser.TRANSITION_TRIGGERS_VALIDATOR);
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divIndicatorTemplate.variableTriggers, jSONObject, "variable_triggers", this.component.getDivTriggerJsonTemplateResolver(), this.component.getDivTriggerJsonEntityParser());
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divIndicatorTemplate.variables, jSONObject, "variables", this.component.getDivVariableJsonTemplateResolver(), this.component.getDivVariableJsonEntityParser());
            Field field8 = divIndicatorTemplate.visibility;
            TypeHelper typeHelper5 = DivIndicatorJsonParser.TYPE_HELPER_VISIBILITY;
            Function1 function15 = DivVisibility.FROM_STRING;
            Expression expression11 = DivIndicatorJsonParser.VISIBILITY_DEFAULT_VALUE;
            Expression resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, typeHelper5, function15, expression11);
            Expression expression12 = resolveOptionalExpression12 == null ? expression11 : resolveOptionalExpression12;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.visibilityAction, jSONObject, "visibility_action", this.component.getDivVisibilityActionJsonTemplateResolver(), this.component.getDivVisibilityActionJsonEntityParser());
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divIndicatorTemplate.visibilityActions, jSONObject, "visibility_actions", this.component.getDivVisibilityActionJsonTemplateResolver(), this.component.getDivVisibilityActionJsonEntityParser());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divIndicatorTemplate.width, jSONObject, "width", this.component.getDivSizeJsonTemplateResolver(), this.component.getDivSizeJsonEntityParser());
            if (divSize3 == null) {
                divSize3 = DivIndicatorJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivIndicator(divAccessibility, expression2, expression3, divRoundedRectangleShape, resolveOptionalExpression3, resolveOptionalExpression4, expression4, expression6, resolveOptionalList, resolveOptionalList2, divBorder, resolveOptionalExpression7, resolveOptionalList3, resolveOptionalList4, divFocus, resolveOptionalList5, divSize2, str, expression8, divRoundedRectangleShape2, divRoundedRectangleShape3, divIndicatorItemPlacement, divLayoutProvider, divEdgeInsets, expression10, divEdgeInsets2, str2, resolveOptionalExpression10, resolveOptionalExpression11, resolveOptionalList6, divShape2, divFixedSize2, resolveOptionalList7, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, resolveOptionalList8, resolveOptionalList9, resolveOptionalList10, expression12, divVisibilityAction, resolveOptionalList11, divSize3);
        }
    }

    /* compiled from: DivIndicatorJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        ACTIVE_ITEM_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 16768096, null, 2, null);
        ACTIVE_ITEM_SIZE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(1.3d), null, 2, null);
        ALPHA_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        DivIndicator.Animation animation = DivIndicator.Animation.SCALE;
        ANIMATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, animation, null, 2, null);
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7, null));
        INACTIVE_ITEM_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 865180853, null, 2, null);
        MINIMUM_ITEM_SIZE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(0.5d), null, 2, null);
        SHAPE_DEFAULT_VALUE = new DivShape.RoundedRectangle(new DivRoundedRectangleShape(null, null, null, null, null, 31, null));
        SPACE_BETWEEN_CENTERS_DEFAULT_VALUE = new DivFixedSize(null, Expression.Companion.constant$default(companion, 15L, null, 2, null), 1, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        TYPE_HELPER_ALIGNMENT_HORIZONTAL = companion2.from(ArraysKt.first(DivAlignmentHorizontal.values()), new Function1() { // from class: com.yandex.div2.DivIndicatorJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        TYPE_HELPER_ALIGNMENT_VERTICAL = companion2.from(ArraysKt.first(DivAlignmentVertical.values()), new Function1() { // from class: com.yandex.div2.DivIndicatorJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        TYPE_HELPER_ANIMATION = companion2.from(animation, new Function1() { // from class: com.yandex.div2.DivIndicatorJsonParser$Companion$TYPE_HELPER_ANIMATION$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivIndicator.Animation);
            }
        });
        TYPE_HELPER_VISIBILITY = companion2.from(divVisibility, new Function1() { // from class: com.yandex.div2.DivIndicatorJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        ACTIVE_ITEM_SIZE_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivIndicatorJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ACTIVE_ITEM_SIZE_VALIDATOR$lambda$0;
                ACTIVE_ITEM_SIZE_VALIDATOR$lambda$0 = DivIndicatorJsonParser.ACTIVE_ITEM_SIZE_VALIDATOR$lambda$0(((Double) obj).doubleValue());
                return ACTIVE_ITEM_SIZE_VALIDATOR$lambda$0;
            }
        };
        ALPHA_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivIndicatorJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ALPHA_VALIDATOR$lambda$1;
                ALPHA_VALIDATOR$lambda$1 = DivIndicatorJsonParser.ALPHA_VALIDATOR$lambda$1(((Double) obj).doubleValue());
                return ALPHA_VALIDATOR$lambda$1;
            }
        };
        COLUMN_SPAN_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivIndicatorJsonParser$$ExternalSyntheticLambda2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean COLUMN_SPAN_VALIDATOR$lambda$2;
                COLUMN_SPAN_VALIDATOR$lambda$2 = DivIndicatorJsonParser.COLUMN_SPAN_VALIDATOR$lambda$2(((Long) obj).longValue());
                return COLUMN_SPAN_VALIDATOR$lambda$2;
            }
        };
        MINIMUM_ITEM_SIZE_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivIndicatorJsonParser$$ExternalSyntheticLambda3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean MINIMUM_ITEM_SIZE_VALIDATOR$lambda$3;
                MINIMUM_ITEM_SIZE_VALIDATOR$lambda$3 = DivIndicatorJsonParser.MINIMUM_ITEM_SIZE_VALIDATOR$lambda$3(((Double) obj).doubleValue());
                return MINIMUM_ITEM_SIZE_VALIDATOR$lambda$3;
            }
        };
        ROW_SPAN_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivIndicatorJsonParser$$ExternalSyntheticLambda4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ROW_SPAN_VALIDATOR$lambda$4;
                ROW_SPAN_VALIDATOR$lambda$4 = DivIndicatorJsonParser.ROW_SPAN_VALIDATOR$lambda$4(((Long) obj).longValue());
                return ROW_SPAN_VALIDATOR$lambda$4;
            }
        };
        TRANSITION_TRIGGERS_VALIDATOR = new ListValidator() { // from class: com.yandex.div2.DivIndicatorJsonParser$$ExternalSyntheticLambda5
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean TRANSITION_TRIGGERS_VALIDATOR$lambda$5;
                TRANSITION_TRIGGERS_VALIDATOR$lambda$5 = DivIndicatorJsonParser.TRANSITION_TRIGGERS_VALIDATOR$lambda$5(list);
                return TRANSITION_TRIGGERS_VALIDATOR$lambda$5;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TRANSITION_TRIGGERS_VALIDATOR$lambda$5(List list) {
        return list.size() >= 1;
    }
}
