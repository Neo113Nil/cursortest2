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
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSlider;
import io.appmetrica.analytics.impl.M2;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivSliderJsonParser.kt */
/* loaded from: classes9.dex */
public abstract class DivSliderJsonParser {
    public static final Expression ALPHA_DEFAULT_VALUE;
    public static final ValueValidator ALPHA_VALIDATOR;
    public static final ValueValidator COLUMN_SPAN_VALIDATOR;
    private static final Companion Companion = new Companion(null);
    public static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    public static final Expression IS_ENABLED_DEFAULT_VALUE;
    public static final Expression MAX_VALUE_DEFAULT_VALUE;
    public static final Expression MIN_VALUE_DEFAULT_VALUE;
    public static final ValueValidator ROW_SPAN_VALIDATOR;
    public static final ListValidator TRANSITION_TRIGGERS_VALIDATOR;
    public static final TypeHelper TYPE_HELPER_ALIGNMENT_HORIZONTAL;
    public static final TypeHelper TYPE_HELPER_ALIGNMENT_VERTICAL;
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
    public static final boolean ROW_SPAN_VALIDATOR$lambda$2(long j) {
        return j >= 0;
    }

    /* compiled from: DivSliderJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivSlider deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.component.getDivAccessibilityJsonEntityParser());
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", DivSliderJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL, DivAlignmentHorizontal.FROM_STRING);
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivSliderJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivSliderJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivSliderJsonParser.ALPHA_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression3 != null) {
                expression = readOptionalExpression3;
            }
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.component.getDivAnimatorJsonEntityParser());
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, M2.g, this.component.getDivBackgroundJsonEntityParser());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.component.getDivBorderJsonEntityParser());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, function12, DivSliderJsonParser.COLUMN_SPAN_VALIDATOR);
            List readOptionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.component.getDivDisappearActionJsonEntityParser());
            List readOptionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.component.getDivExtensionJsonEntityParser());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.component.getDivFocusJsonEntityParser());
            List readOptionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.component.getDivFunctionJsonEntityParser());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.component.getDivSizeJsonEntityParser());
            if (divSize == null) {
                divSize = DivSliderJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            DivSize divSize2 = divSize;
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = DivSliderJsonParser.IS_ENABLED_DEFAULT_VALUE;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper3, function13, expression2);
            if (readOptionalExpression5 != null) {
                expression2 = readOptionalExpression5;
            }
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.component.getDivLayoutProviderJsonEntityParser());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.component.getDivEdgeInsetsJsonEntityParser());
            Expression expression3 = DivSliderJsonParser.MAX_VALUE_DEFAULT_VALUE;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "max_value", typeHelper2, function12, expression3);
            if (readOptionalExpression6 != null) {
                expression3 = readOptionalExpression6;
            }
            Expression expression4 = DivSliderJsonParser.MIN_VALUE_DEFAULT_VALUE;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "min_value", typeHelper2, function12, expression4);
            if (readOptionalExpression7 != null) {
                expression4 = readOptionalExpression7;
            }
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonEntityParser());
            List readOptionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "ranges", this.component.getDivSliderRangeJsonEntityParser());
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, function12, DivSliderJsonParser.ROW_SPAN_VALIDATOR);
            DivAccessibility divAccessibility2 = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "secondary_value_accessibility", this.component.getDivAccessibilityJsonEntityParser());
            List readOptionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.component.getDivActionJsonEntityParser());
            DivDrawable divDrawable = (DivDrawable) JsonPropertyParser.readOptional(parsingContext, jSONObject, "thumb_secondary_style", this.component.getDivDrawableJsonEntityParser());
            DivSlider.TextStyle textStyle = (DivSlider.TextStyle) JsonPropertyParser.readOptional(parsingContext, jSONObject, "thumb_secondary_text_style", this.component.getDivSliderTextStyleJsonEntityParser());
            String str2 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "thumb_secondary_value_variable");
            DivDrawable divDrawable2 = (DivDrawable) JsonPropertyParser.read(parsingContext, jSONObject, "thumb_style", this.component.getDivDrawableJsonEntityParser());
            DivSlider.TextStyle textStyle2 = (DivSlider.TextStyle) JsonPropertyParser.readOptional(parsingContext, jSONObject, "thumb_text_style", this.component.getDivSliderTextStyleJsonEntityParser());
            String str3 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "thumb_value_variable");
            DivDrawable divDrawable3 = (DivDrawable) JsonPropertyParser.readOptional(parsingContext, jSONObject, "tick_mark_active_style", this.component.getDivDrawableJsonEntityParser());
            DivDrawable divDrawable4 = (DivDrawable) JsonPropertyParser.readOptional(parsingContext, jSONObject, "tick_mark_inactive_style", this.component.getDivDrawableJsonEntityParser());
            List readOptionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.component.getDivTooltipJsonEntityParser());
            DivDrawable divDrawable5 = (DivDrawable) JsonPropertyParser.read(parsingContext, jSONObject, "track_active_style", this.component.getDivDrawableJsonEntityParser());
            DivDrawable divDrawable6 = (DivDrawable) JsonPropertyParser.read(parsingContext, jSONObject, "track_inactive_style", this.component.getDivDrawableJsonEntityParser());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.component.getDivTransformJsonEntityParser());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.component.getDivChangeTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.component.getDivAppearanceTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.component.getDivAppearanceTransitionJsonEntityParser());
            List readOptionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivSliderJsonParser.TRANSITION_TRIGGERS_VALIDATOR);
            List readOptionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.component.getDivTriggerJsonEntityParser());
            List readOptionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.component.getDivVariableJsonEntityParser());
            TypeHelper typeHelper4 = DivSliderJsonParser.TYPE_HELPER_VISIBILITY;
            Function1 function14 = DivVisibility.FROM_STRING;
            Expression expression5 = DivSliderJsonParser.VISIBILITY_DEFAULT_VALUE;
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, typeHelper4, function14, expression5);
            Expression expression6 = readOptionalExpression10 == null ? expression5 : readOptionalExpression10;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.component.getDivVisibilityActionJsonEntityParser());
            List readOptionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.component.getDivVisibilityActionJsonEntityParser());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.component.getDivSizeJsonEntityParser());
            if (divSize3 == null) {
                divSize3 = DivSliderJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivSlider(divAccessibility, readOptionalExpression, readOptionalExpression2, expression, readOptionalList, readOptionalList2, divBorder, readOptionalExpression4, readOptionalList3, readOptionalList4, divFocus, readOptionalList5, divSize2, str, expression2, divLayoutProvider, divEdgeInsets, expression3, expression4, divEdgeInsets2, readOptionalList6, readOptionalExpression8, readOptionalExpression9, divAccessibility2, readOptionalList7, divDrawable, textStyle, str2, divDrawable2, textStyle2, str3, divDrawable3, divDrawable4, readOptionalList8, divDrawable5, divDrawable6, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, readOptionalList9, readOptionalList10, readOptionalList11, expression6, divVisibilityAction, readOptionalList12, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivSlider divSlider) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divSlider.getAccessibility(), this.component.getDivAccessibilityJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divSlider.getAlignmentHorizontal(), DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divSlider.getAlignmentVertical(), DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divSlider.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divSlider.getAnimators(), this.component.getDivAnimatorJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, M2.g, divSlider.getBackground(), this.component.getDivBackgroundJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divSlider.getBorder(), this.component.getDivBorderJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divSlider.getColumnSpan());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divSlider.getDisappearActions(), this.component.getDivDisappearActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divSlider.getExtensions(), this.component.getDivExtensionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divSlider.getFocus(), this.component.getDivFocusJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divSlider.getFunctions(), this.component.getDivFunctionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divSlider.getHeight(), this.component.getDivSizeJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divSlider.getId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", divSlider.isEnabled);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divSlider.getLayoutProvider(), this.component.getDivLayoutProviderJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divSlider.getMargins(), this.component.getDivEdgeInsetsJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "max_value", divSlider.maxValue);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "min_value", divSlider.minValue);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divSlider.getPaddings(), this.component.getDivEdgeInsetsJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "ranges", divSlider.ranges, this.component.getDivSliderRangeJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divSlider.getReuseId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divSlider.getRowSpan());
            JsonPropertyParser.write(parsingContext, jSONObject, "secondary_value_accessibility", divSlider.secondaryValueAccessibility, this.component.getDivAccessibilityJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divSlider.getSelectedActions(), this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "thumb_secondary_style", divSlider.thumbSecondaryStyle, this.component.getDivDrawableJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "thumb_secondary_text_style", divSlider.thumbSecondaryTextStyle, this.component.getDivSliderTextStyleJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "thumb_secondary_value_variable", divSlider.thumbSecondaryValueVariable);
            JsonPropertyParser.write(parsingContext, jSONObject, "thumb_style", divSlider.thumbStyle, this.component.getDivDrawableJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "thumb_text_style", divSlider.thumbTextStyle, this.component.getDivSliderTextStyleJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "thumb_value_variable", divSlider.thumbValueVariable);
            JsonPropertyParser.write(parsingContext, jSONObject, "tick_mark_active_style", divSlider.tickMarkActiveStyle, this.component.getDivDrawableJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "tick_mark_inactive_style", divSlider.tickMarkInactiveStyle, this.component.getDivDrawableJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divSlider.getTooltips(), this.component.getDivTooltipJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "track_active_style", divSlider.trackActiveStyle, this.component.getDivDrawableJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "track_inactive_style", divSlider.trackInactiveStyle, this.component.getDivDrawableJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divSlider.getTransform(), this.component.getDivTransformJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divSlider.getTransitionChange(), this.component.getDivChangeTransitionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divSlider.getTransitionIn(), this.component.getDivAppearanceTransitionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divSlider.getTransitionOut(), this.component.getDivAppearanceTransitionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divSlider.getTransitionTriggers(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "slider");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divSlider.getVariableTriggers(), this.component.getDivTriggerJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divSlider.getVariables(), this.component.getDivVariableJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, divSlider.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divSlider.getVisibilityAction(), this.component.getDivVisibilityActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divSlider.getVisibilityActions(), this.component.getDivVisibilityActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divSlider.getWidth(), this.component.getDivSizeJsonEntityParser());
            return jSONObject;
        }
    }

    /* compiled from: DivSliderJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivSliderTemplate deserialize(ParsingContext parsingContext, DivSliderTemplate divSliderTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.accessibility : null, this.component.getDivAccessibilityJsonTemplateParser());
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_horizontal", DivSliderJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL, allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.alignmentHorizontal : null, DivAlignmentHorizontal.FROM_STRING);
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", DivSliderJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.alignmentVertical : null, DivAlignmentVertical.FROM_STRING);
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.alpha : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivSliderJsonParser.ALPHA_VALIDATOR);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.animators : null, this.component.getDivAnimatorJsonTemplateParser());
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, M2.g, allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.background : null, this.component.getDivBackgroundJsonTemplateParser());
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.border : null, this.component.getDivBorderJsonTemplateParser());
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = divSliderTemplate != null ? divSliderTemplate.columnSpan : null;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, field, function1, DivSliderJsonParser.COLUMN_SPAN_VALIDATOR);
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.disappearActions : null, this.component.getDivDisappearActionJsonTemplateParser());
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.extensions : null, this.component.getDivExtensionJsonTemplateParser());
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.focus : null, this.component.getDivFocusJsonTemplateParser());
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.functions : null, this.component.getDivFunctionJsonTemplateParser());
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.height : null, this.component.getDivSizeJsonTemplateParser());
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.id : null);
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.isEnabled : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.layoutProvider : null, this.component.getDivLayoutProviderJsonTemplateParser());
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.margins : null, this.component.getDivEdgeInsetsJsonTemplateParser());
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "max_value", typeHelper, allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.maxValue : null, function1);
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "min_value", typeHelper, allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.minValue : null, function1);
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.paddings : null, this.component.getDivEdgeInsetsJsonTemplateParser());
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "ranges", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.ranges : null, this.component.getDivSliderRangeJsonTemplateParser());
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.reuseId : null);
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.rowSpan : null, function1, DivSliderJsonParser.ROW_SPAN_VALIDATOR);
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "secondary_value_accessibility", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.secondaryValueAccessibility : null, this.component.getDivAccessibilityJsonTemplateParser());
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.selectedActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "thumb_secondary_style", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.thumbSecondaryStyle : null, this.component.getDivDrawableJsonTemplateParser());
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "thumb_secondary_text_style", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.thumbSecondaryTextStyle : null, this.component.getDivSliderTextStyleJsonTemplateParser());
            Field readOptionalField12 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "thumb_secondary_value_variable", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.thumbSecondaryValueVariable : null);
            Field readField = JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "thumb_style", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.thumbStyle : null, this.component.getDivDrawableJsonTemplateParser());
            Field readOptionalField13 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "thumb_text_style", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.thumbTextStyle : null, this.component.getDivSliderTextStyleJsonTemplateParser());
            Field readOptionalField14 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "thumb_value_variable", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.thumbValueVariable : null);
            Field readOptionalField15 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "tick_mark_active_style", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.tickMarkActiveStyle : null, this.component.getDivDrawableJsonTemplateParser());
            Field readOptionalField16 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "tick_mark_inactive_style", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.tickMarkInactiveStyle : null, this.component.getDivDrawableJsonTemplateParser());
            Field readOptionalListField8 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.tooltips : null, this.component.getDivTooltipJsonTemplateParser());
            Field readField2 = JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "track_active_style", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.trackActiveStyle : null, this.component.getDivDrawableJsonTemplateParser());
            Field readField3 = JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "track_inactive_style", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.trackInactiveStyle : null, this.component.getDivDrawableJsonTemplateParser());
            Field readOptionalField17 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.transform : null, this.component.getDivTransformJsonTemplateParser());
            Field readOptionalField18 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.transitionChange : null, this.component.getDivChangeTransitionJsonTemplateParser());
            Field readOptionalField19 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.transitionIn : null, this.component.getDivAppearanceTransitionJsonTemplateParser());
            Field readOptionalField20 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.transitionOut : null, this.component.getDivAppearanceTransitionJsonTemplateParser());
            Field field2 = divSliderTemplate != null ? divSliderTemplate.transitionTriggers : null;
            Function1 function12 = DivTransitionTrigger.FROM_STRING;
            ListValidator listValidator = DivSliderJsonParser.TRANSITION_TRIGGERS_VALIDATOR;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivSliderTemplate(readOptionalField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField, readOptionalListField2, readOptionalField2, readOptionalFieldWithExpression4, readOptionalListField3, readOptionalListField4, readOptionalField3, readOptionalListField5, readOptionalField4, readOptionalField5, readOptionalFieldWithExpression5, readOptionalField6, readOptionalField7, readOptionalFieldWithExpression6, readOptionalFieldWithExpression7, readOptionalField8, readOptionalListField6, readOptionalFieldWithExpression8, readOptionalFieldWithExpression9, readOptionalField9, readOptionalListField7, readOptionalField10, readOptionalField11, readOptionalField12, readField, readOptionalField13, readOptionalField14, readOptionalField15, readOptionalField16, readOptionalListField8, readField2, readField3, readOptionalField17, readOptionalField18, readOptionalField19, readOptionalField20, JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field2, function12, listValidator), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.variableTriggers : null, this.component.getDivTriggerJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.variables : null, this.component.getDivVariableJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, DivSliderJsonParser.TYPE_HELPER_VISIBILITY, allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.visibility : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.visibilityAction : null, this.component.getDivVisibilityActionJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.visibilityActions : null, this.component.getDivVisibilityActionJsonTemplateParser()), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divSliderTemplate != null ? divSliderTemplate.width : null, this.component.getDivSizeJsonTemplateParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivSliderTemplate divSliderTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divSliderTemplate.accessibility, this.component.getDivAccessibilityJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", divSliderTemplate.alignmentHorizontal, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", divSliderTemplate.alignmentVertical, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divSliderTemplate.alpha);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divSliderTemplate.animators, this.component.getDivAnimatorJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, M2.g, divSliderTemplate.background, this.component.getDivBackgroundJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", divSliderTemplate.border, this.component.getDivBorderJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divSliderTemplate.columnSpan);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divSliderTemplate.disappearActions, this.component.getDivDisappearActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divSliderTemplate.extensions, this.component.getDivExtensionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divSliderTemplate.focus, this.component.getDivFocusJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divSliderTemplate.functions, this.component.getDivFunctionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divSliderTemplate.height, this.component.getDivSizeJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divSliderTemplate.id);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", divSliderTemplate.isEnabled);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divSliderTemplate.layoutProvider, this.component.getDivLayoutProviderJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divSliderTemplate.margins, this.component.getDivEdgeInsetsJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "max_value", divSliderTemplate.maxValue);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "min_value", divSliderTemplate.minValue);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divSliderTemplate.paddings, this.component.getDivEdgeInsetsJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "ranges", divSliderTemplate.ranges, this.component.getDivSliderRangeJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divSliderTemplate.reuseId);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divSliderTemplate.rowSpan);
            JsonFieldParser.writeField(parsingContext, jSONObject, "secondary_value_accessibility", divSliderTemplate.secondaryValueAccessibility, this.component.getDivAccessibilityJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divSliderTemplate.selectedActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "thumb_secondary_style", divSliderTemplate.thumbSecondaryStyle, this.component.getDivDrawableJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "thumb_secondary_text_style", divSliderTemplate.thumbSecondaryTextStyle, this.component.getDivSliderTextStyleJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "thumb_secondary_value_variable", divSliderTemplate.thumbSecondaryValueVariable);
            JsonFieldParser.writeField(parsingContext, jSONObject, "thumb_style", divSliderTemplate.thumbStyle, this.component.getDivDrawableJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "thumb_text_style", divSliderTemplate.thumbTextStyle, this.component.getDivSliderTextStyleJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "thumb_value_variable", divSliderTemplate.thumbValueVariable);
            JsonFieldParser.writeField(parsingContext, jSONObject, "tick_mark_active_style", divSliderTemplate.tickMarkActiveStyle, this.component.getDivDrawableJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "tick_mark_inactive_style", divSliderTemplate.tickMarkInactiveStyle, this.component.getDivDrawableJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divSliderTemplate.tooltips, this.component.getDivTooltipJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "track_active_style", divSliderTemplate.trackActiveStyle, this.component.getDivDrawableJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "track_inactive_style", divSliderTemplate.trackInactiveStyle, this.component.getDivDrawableJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divSliderTemplate.transform, this.component.getDivTransformJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divSliderTemplate.transitionChange, this.component.getDivChangeTransitionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divSliderTemplate.transitionIn, this.component.getDivAppearanceTransitionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divSliderTemplate.transitionOut, this.component.getDivAppearanceTransitionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divSliderTemplate.transitionTriggers, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "slider");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divSliderTemplate.variableTriggers, this.component.getDivTriggerJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divSliderTemplate.variables, this.component.getDivVariableJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, divSliderTemplate.visibility, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divSliderTemplate.visibilityAction, this.component.getDivVisibilityActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divSliderTemplate.visibilityActions, this.component.getDivVisibilityActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divSliderTemplate.width, this.component.getDivSizeJsonTemplateParser());
            return jSONObject;
        }
    }

    /* compiled from: DivSliderJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivSlider resolve(ParsingContext parsingContext, DivSliderTemplate divSliderTemplate, JSONObject jSONObject) {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.accessibility, jSONObject, "accessibility", this.component.getDivAccessibilityJsonTemplateResolver(), this.component.getDivAccessibilityJsonEntityParser());
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSliderTemplate.alignmentHorizontal, jSONObject, "alignment_horizontal", DivSliderJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL, DivAlignmentHorizontal.FROM_STRING);
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSliderTemplate.alignmentVertical, jSONObject, "alignment_vertical", DivSliderJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, DivAlignmentVertical.FROM_STRING);
            Field field = divSliderTemplate.alpha;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivSliderJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivSliderJsonParser.ALPHA_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression3 != null) {
                expression = resolveOptionalExpression3;
            }
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.animators, jSONObject, "animators", this.component.getDivAnimatorJsonTemplateResolver(), this.component.getDivAnimatorJsonEntityParser());
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.background, jSONObject, M2.g, this.component.getDivBackgroundJsonTemplateResolver(), this.component.getDivBackgroundJsonEntityParser());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.border, jSONObject, "border", this.component.getDivBorderJsonTemplateResolver(), this.component.getDivBorderJsonEntityParser());
            Field field2 = divSliderTemplate.columnSpan;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "column_span", typeHelper2, function12, DivSliderJsonParser.COLUMN_SPAN_VALIDATOR);
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.disappearActions, jSONObject, "disappear_actions", this.component.getDivDisappearActionJsonTemplateResolver(), this.component.getDivDisappearActionJsonEntityParser());
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.extensions, jSONObject, "extensions", this.component.getDivExtensionJsonTemplateResolver(), this.component.getDivExtensionJsonEntityParser());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.focus, jSONObject, "focus", this.component.getDivFocusJsonTemplateResolver(), this.component.getDivFocusJsonEntityParser());
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.functions, jSONObject, "functions", this.component.getDivFunctionJsonTemplateResolver(), this.component.getDivFunctionJsonEntityParser());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.height, jSONObject, "height", this.component.getDivSizeJsonTemplateResolver(), this.component.getDivSizeJsonEntityParser());
            if (divSize == null) {
                divSize = DivSliderJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            DivSize divSize2 = divSize;
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.id, jSONObject, "id");
            Field field3 = divSliderTemplate.isEnabled;
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = DivSliderJsonParser.IS_ENABLED_DEFAULT_VALUE;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "is_enabled", typeHelper3, function13, expression2);
            if (resolveOptionalExpression5 != null) {
                expression2 = resolveOptionalExpression5;
            }
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.layoutProvider, jSONObject, "layout_provider", this.component.getDivLayoutProviderJsonTemplateResolver(), this.component.getDivLayoutProviderJsonEntityParser());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.margins, jSONObject, "margins", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            Field field4 = divSliderTemplate.maxValue;
            Expression expression3 = DivSliderJsonParser.MAX_VALUE_DEFAULT_VALUE;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "max_value", typeHelper2, function12, expression3);
            if (resolveOptionalExpression6 != null) {
                expression3 = resolveOptionalExpression6;
            }
            Field field5 = divSliderTemplate.minValue;
            Expression expression4 = DivSliderJsonParser.MIN_VALUE_DEFAULT_VALUE;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "min_value", typeHelper2, function12, expression4);
            if (resolveOptionalExpression7 != null) {
                expression4 = resolveOptionalExpression7;
            }
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.paddings, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.ranges, jSONObject, "ranges", this.component.getDivSliderRangeJsonTemplateResolver(), this.component.getDivSliderRangeJsonEntityParser());
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSliderTemplate.reuseId, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSliderTemplate.rowSpan, jSONObject, "row_span", typeHelper2, function12, DivSliderJsonParser.ROW_SPAN_VALIDATOR);
            DivAccessibility divAccessibility2 = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.secondaryValueAccessibility, jSONObject, "secondary_value_accessibility", this.component.getDivAccessibilityJsonTemplateResolver(), this.component.getDivAccessibilityJsonEntityParser());
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.selectedActions, jSONObject, "selected_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            DivDrawable divDrawable = (DivDrawable) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.thumbSecondaryStyle, jSONObject, "thumb_secondary_style", this.component.getDivDrawableJsonTemplateResolver(), this.component.getDivDrawableJsonEntityParser());
            DivSlider.TextStyle textStyle = (DivSlider.TextStyle) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.thumbSecondaryTextStyle, jSONObject, "thumb_secondary_text_style", this.component.getDivSliderTextStyleJsonTemplateResolver(), this.component.getDivSliderTextStyleJsonEntityParser());
            String str2 = (String) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.thumbSecondaryValueVariable, jSONObject, "thumb_secondary_value_variable");
            DivDrawable divDrawable2 = (DivDrawable) JsonFieldResolver.resolve(parsingContext, divSliderTemplate.thumbStyle, jSONObject, "thumb_style", this.component.getDivDrawableJsonTemplateResolver(), this.component.getDivDrawableJsonEntityParser());
            DivSlider.TextStyle textStyle2 = (DivSlider.TextStyle) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.thumbTextStyle, jSONObject, "thumb_text_style", this.component.getDivSliderTextStyleJsonTemplateResolver(), this.component.getDivSliderTextStyleJsonEntityParser());
            String str3 = (String) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.thumbValueVariable, jSONObject, "thumb_value_variable");
            DivDrawable divDrawable3 = (DivDrawable) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.tickMarkActiveStyle, jSONObject, "tick_mark_active_style", this.component.getDivDrawableJsonTemplateResolver(), this.component.getDivDrawableJsonEntityParser());
            DivDrawable divDrawable4 = (DivDrawable) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.tickMarkInactiveStyle, jSONObject, "tick_mark_inactive_style", this.component.getDivDrawableJsonTemplateResolver(), this.component.getDivDrawableJsonEntityParser());
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.tooltips, jSONObject, "tooltips", this.component.getDivTooltipJsonTemplateResolver(), this.component.getDivTooltipJsonEntityParser());
            DivDrawable divDrawable5 = (DivDrawable) JsonFieldResolver.resolve(parsingContext, divSliderTemplate.trackActiveStyle, jSONObject, "track_active_style", this.component.getDivDrawableJsonTemplateResolver(), this.component.getDivDrawableJsonEntityParser());
            DivDrawable divDrawable6 = (DivDrawable) JsonFieldResolver.resolve(parsingContext, divSliderTemplate.trackInactiveStyle, jSONObject, "track_inactive_style", this.component.getDivDrawableJsonTemplateResolver(), this.component.getDivDrawableJsonEntityParser());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.transform, jSONObject, "transform", this.component.getDivTransformJsonTemplateResolver(), this.component.getDivTransformJsonEntityParser());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.transitionChange, jSONObject, "transition_change", this.component.getDivChangeTransitionJsonTemplateResolver(), this.component.getDivChangeTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.transitionIn, jSONObject, "transition_in", this.component.getDivAppearanceTransitionJsonTemplateResolver(), this.component.getDivAppearanceTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.transitionOut, jSONObject, "transition_out", this.component.getDivAppearanceTransitionJsonTemplateResolver(), this.component.getDivAppearanceTransitionJsonEntityParser());
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.transitionTriggers, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivSliderJsonParser.TRANSITION_TRIGGERS_VALIDATOR);
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.variableTriggers, jSONObject, "variable_triggers", this.component.getDivTriggerJsonTemplateResolver(), this.component.getDivTriggerJsonEntityParser());
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.variables, jSONObject, "variables", this.component.getDivVariableJsonTemplateResolver(), this.component.getDivVariableJsonEntityParser());
            Field field6 = divSliderTemplate.visibility;
            TypeHelper typeHelper4 = DivSliderJsonParser.TYPE_HELPER_VISIBILITY;
            Function1 function14 = DivVisibility.FROM_STRING;
            Expression expression5 = DivSliderJsonParser.VISIBILITY_DEFAULT_VALUE;
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, typeHelper4, function14, expression5);
            Expression expression6 = resolveOptionalExpression10 == null ? expression5 : resolveOptionalExpression10;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.visibilityAction, jSONObject, "visibility_action", this.component.getDivVisibilityActionJsonTemplateResolver(), this.component.getDivVisibilityActionJsonEntityParser());
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divSliderTemplate.visibilityActions, jSONObject, "visibility_actions", this.component.getDivVisibilityActionJsonTemplateResolver(), this.component.getDivVisibilityActionJsonEntityParser());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divSliderTemplate.width, jSONObject, "width", this.component.getDivSizeJsonTemplateResolver(), this.component.getDivSizeJsonEntityParser());
            if (divSize3 == null) {
                divSize3 = DivSliderJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivSlider(divAccessibility, resolveOptionalExpression, resolveOptionalExpression2, expression, resolveOptionalList, resolveOptionalList2, divBorder, resolveOptionalExpression4, resolveOptionalList3, resolveOptionalList4, divFocus, resolveOptionalList5, divSize2, str, expression2, divLayoutProvider, divEdgeInsets, expression3, expression4, divEdgeInsets2, resolveOptionalList6, resolveOptionalExpression8, resolveOptionalExpression9, divAccessibility2, resolveOptionalList7, divDrawable, textStyle, str2, divDrawable2, textStyle2, str3, divDrawable3, divDrawable4, resolveOptionalList8, divDrawable5, divDrawable6, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, resolveOptionalList9, resolveOptionalList10, resolveOptionalList11, expression6, divVisibilityAction, resolveOptionalList12, divSize3);
        }
    }

    /* compiled from: DivSliderJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        ALPHA_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7, null));
        IS_ENABLED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        MAX_VALUE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        MIN_VALUE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        TYPE_HELPER_ALIGNMENT_HORIZONTAL = companion2.from(ArraysKt.first(DivAlignmentHorizontal.values()), new Function1() { // from class: com.yandex.div2.DivSliderJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        TYPE_HELPER_ALIGNMENT_VERTICAL = companion2.from(ArraysKt.first(DivAlignmentVertical.values()), new Function1() { // from class: com.yandex.div2.DivSliderJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        TYPE_HELPER_VISIBILITY = companion2.from(divVisibility, new Function1() { // from class: com.yandex.div2.DivSliderJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        ALPHA_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivSliderJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ALPHA_VALIDATOR$lambda$0;
                ALPHA_VALIDATOR$lambda$0 = DivSliderJsonParser.ALPHA_VALIDATOR$lambda$0(((Double) obj).doubleValue());
                return ALPHA_VALIDATOR$lambda$0;
            }
        };
        COLUMN_SPAN_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivSliderJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean COLUMN_SPAN_VALIDATOR$lambda$1;
                COLUMN_SPAN_VALIDATOR$lambda$1 = DivSliderJsonParser.COLUMN_SPAN_VALIDATOR$lambda$1(((Long) obj).longValue());
                return COLUMN_SPAN_VALIDATOR$lambda$1;
            }
        };
        ROW_SPAN_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivSliderJsonParser$$ExternalSyntheticLambda2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ROW_SPAN_VALIDATOR$lambda$2;
                ROW_SPAN_VALIDATOR$lambda$2 = DivSliderJsonParser.ROW_SPAN_VALIDATOR$lambda$2(((Long) obj).longValue());
                return ROW_SPAN_VALIDATOR$lambda$2;
            }
        };
        TRANSITION_TRIGGERS_VALIDATOR = new ListValidator() { // from class: com.yandex.div2.DivSliderJsonParser$$ExternalSyntheticLambda3
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean TRANSITION_TRIGGERS_VALIDATOR$lambda$3;
                TRANSITION_TRIGGERS_VALIDATOR$lambda$3 = DivSliderJsonParser.TRANSITION_TRIGGERS_VALIDATOR$lambda$3(list);
                return TRANSITION_TRIGGERS_VALIDATOR$lambda$3;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TRANSITION_TRIGGERS_VALIDATOR$lambda$3(List list) {
        return list.size() >= 1;
    }
}
