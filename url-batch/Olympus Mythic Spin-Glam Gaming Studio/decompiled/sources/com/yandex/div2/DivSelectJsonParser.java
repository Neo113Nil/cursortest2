package com.yandex.div2;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
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
import io.appmetrica.analytics.impl.M2;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivSelectJsonParser.kt */
/* loaded from: classes11.dex */
public abstract class DivSelectJsonParser {
    public static final Expression ALPHA_DEFAULT_VALUE;
    public static final ValueValidator ALPHA_VALIDATOR;
    public static final ValueValidator COLUMN_SPAN_VALIDATOR;
    private static final Companion Companion = new Companion(null);
    public static final Expression FONT_SIZE_DEFAULT_VALUE;
    public static final Expression FONT_SIZE_UNIT_DEFAULT_VALUE;
    public static final ValueValidator FONT_SIZE_VALIDATOR;
    public static final ValueValidator FONT_WEIGHT_VALUE_VALIDATOR;
    public static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    public static final Expression HINT_COLOR_DEFAULT_VALUE;
    public static final Expression LETTER_SPACING_DEFAULT_VALUE;
    public static final ValueValidator LINE_HEIGHT_VALIDATOR;
    public static final ListValidator OPTIONS_VALIDATOR;
    public static final ValueValidator ROW_SPAN_VALIDATOR;
    public static final Expression TEXT_COLOR_DEFAULT_VALUE;
    public static final ListValidator TRANSITION_TRIGGERS_VALIDATOR;
    public static final TypeHelper TYPE_HELPER_ALIGNMENT_HORIZONTAL;
    public static final TypeHelper TYPE_HELPER_ALIGNMENT_VERTICAL;
    public static final TypeHelper TYPE_HELPER_FONT_SIZE_UNIT;
    public static final TypeHelper TYPE_HELPER_FONT_WEIGHT;
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
    public static final boolean FONT_SIZE_VALIDATOR$lambda$2(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FONT_WEIGHT_VALUE_VALIDATOR$lambda$3(long j) {
        return j > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LINE_HEIGHT_VALIDATOR$lambda$4(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ROW_SPAN_VALIDATOR$lambda$6(long j) {
        return j >= 0;
    }

    /* compiled from: DivSelectJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivSelect deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.component.getDivAccessibilityJsonEntityParser());
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", DivSelectJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL, DivAlignmentHorizontal.FROM_STRING);
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivSelectJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivSelectJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivSelectJsonParser.ALPHA_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression3 != null) {
                expression = readOptionalExpression3;
            }
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.component.getDivAnimatorJsonEntityParser());
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, M2.g, this.component.getDivBackgroundJsonEntityParser());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.component.getDivBorderJsonEntityParser());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, function12, DivSelectJsonParser.COLUMN_SPAN_VALIDATOR);
            List readOptionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.component.getDivDisappearActionJsonEntityParser());
            List readOptionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.component.getDivExtensionJsonEntityParser());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.component.getDivFocusJsonEntityParser());
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_family", typeHelper3);
            ValueValidator valueValidator2 = DivSelectJsonParser.FONT_SIZE_VALIDATOR;
            Expression expression2 = DivSelectJsonParser.FONT_SIZE_DEFAULT_VALUE;
            Expression expression3 = expression;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyConstants.TEXT_SIZE, typeHelper2, function12, valueValidator2, expression2);
            if (readOptionalExpression6 != null) {
                expression2 = readOptionalExpression6;
            }
            TypeHelper typeHelper4 = DivSelectJsonParser.TYPE_HELPER_FONT_SIZE_UNIT;
            Function1 function13 = DivSizeUnit.FROM_STRING;
            Expression expression4 = DivSelectJsonParser.FONT_SIZE_UNIT_DEFAULT_VALUE;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size_unit", typeHelper4, function13, expression4);
            Expression expression5 = readOptionalExpression7 == null ? expression4 : readOptionalExpression7;
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight", DivSelectJsonParser.TYPE_HELPER_FONT_WEIGHT, DivFontWeight.FROM_STRING);
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight_value", typeHelper2, function12, DivSelectJsonParser.FONT_WEIGHT_VALUE_VALIDATOR);
            List readOptionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.component.getDivFunctionJsonEntityParser());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.component.getDivSizeJsonEntityParser());
            if (divSize == null) {
                divSize = DivSelectJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            DivSize divSize2 = divSize;
            TypeHelper<Integer> typeHelper5 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1 function14 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression6 = DivSelectJsonParser.HINT_COLOR_DEFAULT_VALUE;
            Expression readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "hint_color", typeHelper5, function14, expression6);
            if (readOptionalExpression11 != null) {
                expression6 = readOptionalExpression11;
            }
            Expression readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "hint_text", typeHelper3);
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.component.getDivLayoutProviderJsonEntityParser());
            Expression expression7 = DivSelectJsonParser.LETTER_SPACING_DEFAULT_VALUE;
            Expression readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "letter_spacing", typeHelper, function1, expression7);
            if (readOptionalExpression13 != null) {
                expression7 = readOptionalExpression13;
            }
            Expression readOptionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "line_height", typeHelper2, function12, DivSelectJsonParser.LINE_HEIGHT_VALIDATOR);
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.component.getDivEdgeInsetsJsonEntityParser());
            List readList = JsonPropertyParser.readList(parsingContext, jSONObject, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, this.component.getDivSelectOptionJsonEntityParser(), DivSelectJsonParser.OPTIONS_VALIDATOR);
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonEntityParser());
            Expression readOptionalExpression15 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper3);
            Expression readOptionalExpression16 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, function12, DivSelectJsonParser.ROW_SPAN_VALIDATOR);
            List readOptionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.component.getDivActionJsonEntityParser());
            Expression expression8 = DivSelectJsonParser.TEXT_COLOR_DEFAULT_VALUE;
            Expression readOptionalExpression17 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_color", typeHelper5, function14, expression8);
            Expression expression9 = readOptionalExpression17 == null ? expression8 : readOptionalExpression17;
            List readOptionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.component.getDivTooltipJsonEntityParser());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.component.getDivTransformJsonEntityParser());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.component.getDivChangeTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.component.getDivAppearanceTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.component.getDivAppearanceTransitionJsonEntityParser());
            List readOptionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivSelectJsonParser.TRANSITION_TRIGGERS_VALIDATOR);
            String str2 = (String) JsonPropertyParser.read(parsingContext, jSONObject, "value_variable");
            List readOptionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.component.getDivTriggerJsonEntityParser());
            List readOptionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.component.getDivVariableJsonEntityParser());
            TypeHelper typeHelper6 = DivSelectJsonParser.TYPE_HELPER_VISIBILITY;
            Function1 function15 = DivVisibility.FROM_STRING;
            Expression expression10 = DivSelectJsonParser.VISIBILITY_DEFAULT_VALUE;
            Expression readOptionalExpression18 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, typeHelper6, function15, expression10);
            Expression expression11 = readOptionalExpression18 == null ? expression10 : readOptionalExpression18;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.component.getDivVisibilityActionJsonEntityParser());
            List readOptionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.component.getDivVisibilityActionJsonEntityParser());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.component.getDivSizeJsonEntityParser());
            if (divSize3 == null) {
                divSize3 = DivSelectJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivSelect(divAccessibility, readOptionalExpression, readOptionalExpression2, expression3, readOptionalList, readOptionalList2, divBorder, readOptionalExpression4, readOptionalList3, readOptionalList4, divFocus, readOptionalExpression5, expression2, expression5, readOptionalExpression8, readOptionalExpression9, readOptionalExpression10, readOptionalList5, divSize2, expression6, readOptionalExpression12, str, divLayoutProvider, expression7, readOptionalExpression14, divEdgeInsets, readList, divEdgeInsets2, readOptionalExpression15, readOptionalExpression16, readOptionalList6, expression9, readOptionalList7, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, readOptionalList8, str2, readOptionalList9, readOptionalList10, expression11, divVisibilityAction, readOptionalList11, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivSelect divSelect) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divSelect.getAccessibility(), this.component.getDivAccessibilityJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divSelect.getAlignmentHorizontal(), DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divSelect.getAlignmentVertical(), DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divSelect.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divSelect.getAnimators(), this.component.getDivAnimatorJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, M2.g, divSelect.getBackground(), this.component.getDivBackgroundJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divSelect.getBorder(), this.component.getDivBorderJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divSelect.getColumnSpan());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divSelect.getDisappearActions(), this.component.getDivDisappearActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divSelect.getExtensions(), this.component.getDivExtensionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divSelect.getFocus(), this.component.getDivFocusJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_family", divSelect.fontFamily);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, ViewHierarchyConstants.TEXT_SIZE, divSelect.fontSize);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size_unit", divSelect.fontSizeUnit, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_variation_settings", divSelect.fontVariationSettings);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight", divSelect.fontWeight, DivFontWeight.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight_value", divSelect.fontWeightValue);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divSelect.getFunctions(), this.component.getDivFunctionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divSelect.getHeight(), this.component.getDivSizeJsonEntityParser());
            Expression expression = divSelect.hintColor;
            Function1 function1 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "hint_color", expression, function1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "hint_text", divSelect.hintText);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divSelect.getId());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divSelect.getLayoutProvider(), this.component.getDivLayoutProviderJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "letter_spacing", divSelect.letterSpacing);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "line_height", divSelect.lineHeight);
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divSelect.getMargins(), this.component.getDivEdgeInsetsJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, divSelect.options, this.component.getDivSelectOptionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divSelect.getPaddings(), this.component.getDivEdgeInsetsJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divSelect.getReuseId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divSelect.getRowSpan());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divSelect.getSelectedActions(), this.component.getDivActionJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_color", divSelect.textColor, function1);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divSelect.getTooltips(), this.component.getDivTooltipJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divSelect.getTransform(), this.component.getDivTransformJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divSelect.getTransitionChange(), this.component.getDivChangeTransitionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divSelect.getTransitionIn(), this.component.getDivAppearanceTransitionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divSelect.getTransitionOut(), this.component.getDivAppearanceTransitionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divSelect.getTransitionTriggers(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "select");
            JsonPropertyParser.write(parsingContext, jSONObject, "value_variable", divSelect.valueVariable);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divSelect.getVariableTriggers(), this.component.getDivTriggerJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divSelect.getVariables(), this.component.getDivVariableJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, divSelect.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divSelect.getVisibilityAction(), this.component.getDivVisibilityActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divSelect.getVisibilityActions(), this.component.getDivVisibilityActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divSelect.getWidth(), this.component.getDivSizeJsonEntityParser());
            return jSONObject;
        }
    }

    /* compiled from: DivSelectJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivSelectTemplate deserialize(ParsingContext parsingContext, DivSelectTemplate divSelectTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.accessibility : null, this.component.getDivAccessibilityJsonTemplateParser());
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_horizontal", DivSelectJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.alignmentHorizontal : null, DivAlignmentHorizontal.FROM_STRING);
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", DivSelectJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.alignmentVertical : null, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field field = divSelectTemplate != null ? divSelectTemplate.alpha : null;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", typeHelper, allowPropertyOverride, field, function1, DivSelectJsonParser.ALPHA_VALIDATOR);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.animators : null, this.component.getDivAnimatorJsonTemplateParser());
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, M2.g, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.background : null, this.component.getDivBackgroundJsonTemplateParser());
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.border : null, this.component.getDivBorderJsonTemplateParser());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Field field2 = divSelectTemplate != null ? divSelectTemplate.columnSpan : null;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_span", typeHelper2, allowPropertyOverride, field2, function12, DivSelectJsonParser.COLUMN_SPAN_VALIDATOR);
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.disappearActions : null, this.component.getDivDisappearActionJsonTemplateParser());
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.extensions : null, this.component.getDivExtensionJsonTemplateParser());
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.focus : null, this.component.getDivFocusJsonTemplateParser());
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_family", typeHelper3, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.fontFamily : null);
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, ViewHierarchyConstants.TEXT_SIZE, typeHelper2, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.fontSize : null, function12, DivSelectJsonParser.FONT_SIZE_VALIDATOR);
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_size_unit", DivSelectJsonParser.TYPE_HELPER_FONT_SIZE_UNIT, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.fontSizeUnit : null, DivSizeUnit.FROM_STRING);
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.fontVariationSettings : null);
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_weight", DivSelectJsonParser.TYPE_HELPER_FONT_WEIGHT, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.fontWeight : null, DivFontWeight.FROM_STRING);
            Field readOptionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_weight_value", typeHelper2, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.fontWeightValue : null, function12, DivSelectJsonParser.FONT_WEIGHT_VALUE_VALIDATOR);
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.functions : null, this.component.getDivFunctionJsonTemplateParser());
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.height : null, this.component.getDivSizeJsonTemplateParser());
            TypeHelper<Integer> typeHelper4 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field field3 = divSelectTemplate != null ? divSelectTemplate.hintColor : null;
            Function1 function13 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field readOptionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "hint_color", typeHelper4, allowPropertyOverride, field3, function13);
            Field readOptionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "hint_text", typeHelper3, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.hintText : null);
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.id : null);
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.layoutProvider : null, this.component.getDivLayoutProviderJsonTemplateParser());
            Field readOptionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "letter_spacing", typeHelper, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.letterSpacing : null, function1);
            Field readOptionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "line_height", typeHelper2, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.lineHeight : null, function12, DivSelectJsonParser.LINE_HEIGHT_VALIDATOR);
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.margins : null, this.component.getDivEdgeInsetsJsonTemplateParser());
            Field field4 = divSelectTemplate != null ? divSelectTemplate.options : null;
            Lazy divSelectOptionJsonTemplateParser = this.component.getDivSelectOptionJsonTemplateParser();
            ListValidator listValidator = DivSelectJsonParser.OPTIONS_VALIDATOR;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readListField = JsonFieldParser.readListField(restrictPropertyOverride, jSONObject, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, allowPropertyOverride, field4, divSelectOptionJsonTemplateParser, listValidator);
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.paddings : null, this.component.getDivEdgeInsetsJsonTemplateParser());
            Field readOptionalFieldWithExpression15 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reuse_id", typeHelper3, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.reuseId : null);
            Field readOptionalFieldWithExpression16 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "row_span", typeHelper2, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.rowSpan : null, function12, DivSelectJsonParser.ROW_SPAN_VALIDATOR);
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.selectedActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalFieldWithExpression17 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "text_color", typeHelper4, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.textColor : null, function13);
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.tooltips : null, this.component.getDivTooltipJsonTemplateParser());
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.transform : null, this.component.getDivTransformJsonTemplateParser());
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.transitionChange : null, this.component.getDivChangeTransitionJsonTemplateParser());
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.transitionIn : null, this.component.getDivAppearanceTransitionJsonTemplateParser());
            Field readOptionalField12 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.transitionOut : null, this.component.getDivAppearanceTransitionJsonTemplateParser());
            Field field5 = divSelectTemplate != null ? divSelectTemplate.transitionTriggers : null;
            Function1 function14 = DivTransitionTrigger.FROM_STRING;
            ListValidator listValidator2 = DivSelectJsonParser.TRANSITION_TRIGGERS_VALIDATOR;
            Intrinsics.checkNotNull(listValidator2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivSelectTemplate(readOptionalField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField, readOptionalListField2, readOptionalField2, readOptionalFieldWithExpression4, readOptionalListField3, readOptionalListField4, readOptionalField3, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalFieldWithExpression7, readOptionalFieldWithExpression8, readOptionalFieldWithExpression9, readOptionalFieldWithExpression10, readOptionalListField5, readOptionalField4, readOptionalFieldWithExpression11, readOptionalFieldWithExpression12, readOptionalField5, readOptionalField6, readOptionalFieldWithExpression13, readOptionalFieldWithExpression14, readOptionalField7, readListField, readOptionalField8, readOptionalFieldWithExpression15, readOptionalFieldWithExpression16, readOptionalListField6, readOptionalFieldWithExpression17, readOptionalListField7, readOptionalField9, readOptionalField10, readOptionalField11, readOptionalField12, JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field5, function14, listValidator2), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "value_variable", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.valueVariable : null), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.variableTriggers : null, this.component.getDivTriggerJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.variables : null, this.component.getDivVariableJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, DivSelectJsonParser.TYPE_HELPER_VISIBILITY, allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.visibility : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.visibilityAction : null, this.component.getDivVisibilityActionJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.visibilityActions : null, this.component.getDivVisibilityActionJsonTemplateParser()), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divSelectTemplate != null ? divSelectTemplate.width : null, this.component.getDivSizeJsonTemplateParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivSelectTemplate divSelectTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divSelectTemplate.accessibility, this.component.getDivAccessibilityJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", divSelectTemplate.alignmentHorizontal, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", divSelectTemplate.alignmentVertical, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divSelectTemplate.alpha);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divSelectTemplate.animators, this.component.getDivAnimatorJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, M2.g, divSelectTemplate.background, this.component.getDivBackgroundJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", divSelectTemplate.border, this.component.getDivBorderJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divSelectTemplate.columnSpan);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divSelectTemplate.disappearActions, this.component.getDivDisappearActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divSelectTemplate.extensions, this.component.getDivExtensionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divSelectTemplate.focus, this.component.getDivFocusJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_family", divSelectTemplate.fontFamily);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, ViewHierarchyConstants.TEXT_SIZE, divSelectTemplate.fontSize);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size_unit", divSelectTemplate.fontSizeUnit, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_variation_settings", divSelectTemplate.fontVariationSettings);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight", divSelectTemplate.fontWeight, DivFontWeight.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight_value", divSelectTemplate.fontWeightValue);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divSelectTemplate.functions, this.component.getDivFunctionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divSelectTemplate.height, this.component.getDivSizeJsonTemplateParser());
            Field field = divSelectTemplate.hintColor;
            Function1 function1 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "hint_color", field, function1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "hint_text", divSelectTemplate.hintText);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divSelectTemplate.id);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divSelectTemplate.layoutProvider, this.component.getDivLayoutProviderJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "letter_spacing", divSelectTemplate.letterSpacing);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "line_height", divSelectTemplate.lineHeight);
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divSelectTemplate.margins, this.component.getDivEdgeInsetsJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, divSelectTemplate.options, this.component.getDivSelectOptionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divSelectTemplate.paddings, this.component.getDivEdgeInsetsJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divSelectTemplate.reuseId);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divSelectTemplate.rowSpan);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divSelectTemplate.selectedActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_color", divSelectTemplate.textColor, function1);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divSelectTemplate.tooltips, this.component.getDivTooltipJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divSelectTemplate.transform, this.component.getDivTransformJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divSelectTemplate.transitionChange, this.component.getDivChangeTransitionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divSelectTemplate.transitionIn, this.component.getDivAppearanceTransitionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divSelectTemplate.transitionOut, this.component.getDivAppearanceTransitionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divSelectTemplate.transitionTriggers, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "select");
            JsonFieldParser.writeField(parsingContext, jSONObject, "value_variable", divSelectTemplate.valueVariable);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divSelectTemplate.variableTriggers, this.component.getDivTriggerJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divSelectTemplate.variables, this.component.getDivVariableJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, divSelectTemplate.visibility, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divSelectTemplate.visibilityAction, this.component.getDivVisibilityActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divSelectTemplate.visibilityActions, this.component.getDivVisibilityActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divSelectTemplate.width, this.component.getDivSizeJsonTemplateParser());
            return jSONObject;
        }
    }

    /* compiled from: DivSelectJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivSelect resolve(ParsingContext parsingContext, DivSelectTemplate divSelectTemplate, JSONObject jSONObject) {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.accessibility, jSONObject, "accessibility", this.component.getDivAccessibilityJsonTemplateResolver(), this.component.getDivAccessibilityJsonEntityParser());
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSelectTemplate.alignmentHorizontal, jSONObject, "alignment_horizontal", DivSelectJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL, DivAlignmentHorizontal.FROM_STRING);
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSelectTemplate.alignmentVertical, jSONObject, "alignment_vertical", DivSelectJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, DivAlignmentVertical.FROM_STRING);
            Field field = divSelectTemplate.alpha;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivSelectJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivSelectJsonParser.ALPHA_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression3 != null) {
                expression = resolveOptionalExpression3;
            }
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divSelectTemplate.animators, jSONObject, "animators", this.component.getDivAnimatorJsonTemplateResolver(), this.component.getDivAnimatorJsonEntityParser());
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divSelectTemplate.background, jSONObject, M2.g, this.component.getDivBackgroundJsonTemplateResolver(), this.component.getDivBackgroundJsonEntityParser());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.border, jSONObject, "border", this.component.getDivBorderJsonTemplateResolver(), this.component.getDivBorderJsonEntityParser());
            Field field2 = divSelectTemplate.columnSpan;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "column_span", typeHelper2, function12, DivSelectJsonParser.COLUMN_SPAN_VALIDATOR);
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divSelectTemplate.disappearActions, jSONObject, "disappear_actions", this.component.getDivDisappearActionJsonTemplateResolver(), this.component.getDivDisappearActionJsonEntityParser());
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divSelectTemplate.extensions, jSONObject, "extensions", this.component.getDivExtensionJsonTemplateResolver(), this.component.getDivExtensionJsonEntityParser());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.focus, jSONObject, "focus", this.component.getDivFocusJsonTemplateResolver(), this.component.getDivFocusJsonEntityParser());
            Field field3 = divSelectTemplate.fontFamily;
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "font_family", typeHelper3);
            Field field4 = divSelectTemplate.fontSize;
            ValueValidator valueValidator2 = DivSelectJsonParser.FONT_SIZE_VALIDATOR;
            Expression expression2 = DivSelectJsonParser.FONT_SIZE_DEFAULT_VALUE;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, ViewHierarchyConstants.TEXT_SIZE, typeHelper2, function12, valueValidator2, expression2);
            if (resolveOptionalExpression6 != null) {
                expression2 = resolveOptionalExpression6;
            }
            Field field5 = divSelectTemplate.fontSizeUnit;
            TypeHelper typeHelper4 = DivSelectJsonParser.TYPE_HELPER_FONT_SIZE_UNIT;
            Function1 function13 = DivSizeUnit.FROM_STRING;
            Expression expression3 = DivSelectJsonParser.FONT_SIZE_UNIT_DEFAULT_VALUE;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "font_size_unit", typeHelper4, function13, expression3);
            Expression expression4 = resolveOptionalExpression7 == null ? expression3 : resolveOptionalExpression7;
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSelectTemplate.fontVariationSettings, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSelectTemplate.fontWeight, jSONObject, "font_weight", DivSelectJsonParser.TYPE_HELPER_FONT_WEIGHT, DivFontWeight.FROM_STRING);
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSelectTemplate.fontWeightValue, jSONObject, "font_weight_value", typeHelper2, function12, DivSelectJsonParser.FONT_WEIGHT_VALUE_VALIDATOR);
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divSelectTemplate.functions, jSONObject, "functions", this.component.getDivFunctionJsonTemplateResolver(), this.component.getDivFunctionJsonEntityParser());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.height, jSONObject, "height", this.component.getDivSizeJsonTemplateResolver(), this.component.getDivSizeJsonEntityParser());
            if (divSize == null) {
                divSize = DivSelectJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            DivSize divSize2 = divSize;
            Field field6 = divSelectTemplate.hintColor;
            TypeHelper<Integer> typeHelper5 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1 function14 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression5 = DivSelectJsonParser.HINT_COLOR_DEFAULT_VALUE;
            Expression resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "hint_color", typeHelper5, function14, expression5);
            if (resolveOptionalExpression11 != null) {
                expression5 = resolveOptionalExpression11;
            }
            Expression resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSelectTemplate.hintText, jSONObject, "hint_text", typeHelper3);
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.id, jSONObject, "id");
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.layoutProvider, jSONObject, "layout_provider", this.component.getDivLayoutProviderJsonTemplateResolver(), this.component.getDivLayoutProviderJsonEntityParser());
            Field field7 = divSelectTemplate.letterSpacing;
            Expression expression6 = DivSelectJsonParser.LETTER_SPACING_DEFAULT_VALUE;
            Expression resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "letter_spacing", typeHelper, function1, expression6);
            if (resolveOptionalExpression13 != null) {
                expression6 = resolveOptionalExpression13;
            }
            Expression resolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSelectTemplate.lineHeight, jSONObject, "line_height", typeHelper2, function12, DivSelectJsonParser.LINE_HEIGHT_VALIDATOR);
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.margins, jSONObject, "margins", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            List resolveList = JsonFieldResolver.resolveList(parsingContext, divSelectTemplate.options, jSONObject, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, this.component.getDivSelectOptionJsonTemplateResolver(), this.component.getDivSelectOptionJsonEntityParser(), DivSelectJsonParser.OPTIONS_VALIDATOR);
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.paddings, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            Expression resolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSelectTemplate.reuseId, jSONObject, "reuse_id", typeHelper3);
            Expression resolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divSelectTemplate.rowSpan, jSONObject, "row_span", typeHelper2, function12, DivSelectJsonParser.ROW_SPAN_VALIDATOR);
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divSelectTemplate.selectedActions, jSONObject, "selected_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            Field field8 = divSelectTemplate.textColor;
            Expression expression7 = DivSelectJsonParser.TEXT_COLOR_DEFAULT_VALUE;
            Expression resolveOptionalExpression17 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "text_color", typeHelper5, function14, expression7);
            Expression expression8 = resolveOptionalExpression17 == null ? expression7 : resolveOptionalExpression17;
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divSelectTemplate.tooltips, jSONObject, "tooltips", this.component.getDivTooltipJsonTemplateResolver(), this.component.getDivTooltipJsonEntityParser());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.transform, jSONObject, "transform", this.component.getDivTransformJsonTemplateResolver(), this.component.getDivTransformJsonEntityParser());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.transitionChange, jSONObject, "transition_change", this.component.getDivChangeTransitionJsonTemplateResolver(), this.component.getDivChangeTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.transitionIn, jSONObject, "transition_in", this.component.getDivAppearanceTransitionJsonTemplateResolver(), this.component.getDivAppearanceTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.transitionOut, jSONObject, "transition_out", this.component.getDivAppearanceTransitionJsonTemplateResolver(), this.component.getDivAppearanceTransitionJsonEntityParser());
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divSelectTemplate.transitionTriggers, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivSelectJsonParser.TRANSITION_TRIGGERS_VALIDATOR);
            String str2 = (String) JsonFieldResolver.resolve(parsingContext, divSelectTemplate.valueVariable, jSONObject, "value_variable");
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divSelectTemplate.variableTriggers, jSONObject, "variable_triggers", this.component.getDivTriggerJsonTemplateResolver(), this.component.getDivTriggerJsonEntityParser());
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divSelectTemplate.variables, jSONObject, "variables", this.component.getDivVariableJsonTemplateResolver(), this.component.getDivVariableJsonEntityParser());
            Field field9 = divSelectTemplate.visibility;
            TypeHelper typeHelper6 = DivSelectJsonParser.TYPE_HELPER_VISIBILITY;
            Function1 function15 = DivVisibility.FROM_STRING;
            Expression expression9 = DivSelectJsonParser.VISIBILITY_DEFAULT_VALUE;
            Expression resolveOptionalExpression18 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, typeHelper6, function15, expression9);
            Expression expression10 = resolveOptionalExpression18 == null ? expression9 : resolveOptionalExpression18;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.visibilityAction, jSONObject, "visibility_action", this.component.getDivVisibilityActionJsonTemplateResolver(), this.component.getDivVisibilityActionJsonEntityParser());
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divSelectTemplate.visibilityActions, jSONObject, "visibility_actions", this.component.getDivVisibilityActionJsonTemplateResolver(), this.component.getDivVisibilityActionJsonEntityParser());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divSelectTemplate.width, jSONObject, "width", this.component.getDivSizeJsonTemplateResolver(), this.component.getDivSizeJsonEntityParser());
            if (divSize3 == null) {
                divSize3 = DivSelectJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivSelect(divAccessibility, resolveOptionalExpression, resolveOptionalExpression2, expression, resolveOptionalList, resolveOptionalList2, divBorder, resolveOptionalExpression4, resolveOptionalList3, resolveOptionalList4, divFocus, resolveOptionalExpression5, expression2, expression4, resolveOptionalExpression8, resolveOptionalExpression9, resolveOptionalExpression10, resolveOptionalList5, divSize2, expression5, resolveOptionalExpression12, str, divLayoutProvider, expression6, resolveOptionalExpression14, divEdgeInsets, resolveList, divEdgeInsets2, resolveOptionalExpression15, resolveOptionalExpression16, resolveOptionalList6, expression8, resolveOptionalList7, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, resolveOptionalList8, str2, resolveOptionalList9, resolveOptionalList10, expression10, divVisibilityAction, resolveOptionalList11, divSize3);
        }
    }

    /* compiled from: DivSelectJsonParser.kt */
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
        FONT_SIZE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        DivSizeUnit divSizeUnit = DivSizeUnit.SP;
        FONT_SIZE_UNIT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7, null));
        HINT_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 1929379840, null, 2, null);
        LETTER_SPACING_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        TEXT_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, -16777216, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        TYPE_HELPER_ALIGNMENT_HORIZONTAL = companion2.from(ArraysKt.first(DivAlignmentHorizontal.values()), new Function1() { // from class: com.yandex.div2.DivSelectJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        TYPE_HELPER_ALIGNMENT_VERTICAL = companion2.from(ArraysKt.first(DivAlignmentVertical.values()), new Function1() { // from class: com.yandex.div2.DivSelectJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        TYPE_HELPER_FONT_SIZE_UNIT = companion2.from(divSizeUnit, new Function1() { // from class: com.yandex.div2.DivSelectJsonParser$Companion$TYPE_HELPER_FONT_SIZE_UNIT$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
        TYPE_HELPER_FONT_WEIGHT = companion2.from(ArraysKt.first(DivFontWeight.values()), new Function1() { // from class: com.yandex.div2.DivSelectJsonParser$Companion$TYPE_HELPER_FONT_WEIGHT$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivFontWeight);
            }
        });
        TYPE_HELPER_VISIBILITY = companion2.from(divVisibility, new Function1() { // from class: com.yandex.div2.DivSelectJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        ALPHA_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivSelectJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ALPHA_VALIDATOR$lambda$0;
                ALPHA_VALIDATOR$lambda$0 = DivSelectJsonParser.ALPHA_VALIDATOR$lambda$0(((Double) obj).doubleValue());
                return ALPHA_VALIDATOR$lambda$0;
            }
        };
        COLUMN_SPAN_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivSelectJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean COLUMN_SPAN_VALIDATOR$lambda$1;
                COLUMN_SPAN_VALIDATOR$lambda$1 = DivSelectJsonParser.COLUMN_SPAN_VALIDATOR$lambda$1(((Long) obj).longValue());
                return COLUMN_SPAN_VALIDATOR$lambda$1;
            }
        };
        FONT_SIZE_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivSelectJsonParser$$ExternalSyntheticLambda2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean FONT_SIZE_VALIDATOR$lambda$2;
                FONT_SIZE_VALIDATOR$lambda$2 = DivSelectJsonParser.FONT_SIZE_VALIDATOR$lambda$2(((Long) obj).longValue());
                return FONT_SIZE_VALIDATOR$lambda$2;
            }
        };
        FONT_WEIGHT_VALUE_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivSelectJsonParser$$ExternalSyntheticLambda3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean FONT_WEIGHT_VALUE_VALIDATOR$lambda$3;
                FONT_WEIGHT_VALUE_VALIDATOR$lambda$3 = DivSelectJsonParser.FONT_WEIGHT_VALUE_VALIDATOR$lambda$3(((Long) obj).longValue());
                return FONT_WEIGHT_VALUE_VALIDATOR$lambda$3;
            }
        };
        LINE_HEIGHT_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivSelectJsonParser$$ExternalSyntheticLambda4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean LINE_HEIGHT_VALIDATOR$lambda$4;
                LINE_HEIGHT_VALIDATOR$lambda$4 = DivSelectJsonParser.LINE_HEIGHT_VALIDATOR$lambda$4(((Long) obj).longValue());
                return LINE_HEIGHT_VALIDATOR$lambda$4;
            }
        };
        OPTIONS_VALIDATOR = new ListValidator() { // from class: com.yandex.div2.DivSelectJsonParser$$ExternalSyntheticLambda5
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean OPTIONS_VALIDATOR$lambda$5;
                OPTIONS_VALIDATOR$lambda$5 = DivSelectJsonParser.OPTIONS_VALIDATOR$lambda$5(list);
                return OPTIONS_VALIDATOR$lambda$5;
            }
        };
        ROW_SPAN_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivSelectJsonParser$$ExternalSyntheticLambda6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ROW_SPAN_VALIDATOR$lambda$6;
                ROW_SPAN_VALIDATOR$lambda$6 = DivSelectJsonParser.ROW_SPAN_VALIDATOR$lambda$6(((Long) obj).longValue());
                return ROW_SPAN_VALIDATOR$lambda$6;
            }
        };
        TRANSITION_TRIGGERS_VALIDATOR = new ListValidator() { // from class: com.yandex.div2.DivSelectJsonParser$$ExternalSyntheticLambda7
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean TRANSITION_TRIGGERS_VALIDATOR$lambda$7;
                TRANSITION_TRIGGERS_VALIDATOR$lambda$7 = DivSelectJsonParser.TRANSITION_TRIGGERS_VALIDATOR$lambda$7(list);
                return TRANSITION_TRIGGERS_VALIDATOR$lambda$7;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean OPTIONS_VALIDATOR$lambda$5(List list) {
        return list.size() >= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TRANSITION_TRIGGERS_VALIDATOR$lambda$7(List list) {
        return list.size() >= 1;
    }
}
