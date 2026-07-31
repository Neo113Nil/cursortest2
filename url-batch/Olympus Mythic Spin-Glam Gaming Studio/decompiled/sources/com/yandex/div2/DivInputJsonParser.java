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
import com.yandex.div2.DivInput;
import com.yandex.div2.DivSize;
import io.appmetrica.analytics.impl.M2;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivInputJsonParser.kt */
/* loaded from: classes8.dex */
public abstract class DivInputJsonParser {
    public static final Expression ALPHA_DEFAULT_VALUE;
    public static final ValueValidator ALPHA_VALIDATOR;
    public static final Expression AUTOCAPITALIZATION_DEFAULT_VALUE;
    public static final ValueValidator COLUMN_SPAN_VALIDATOR;
    private static final Companion Companion = new Companion(null);
    public static final Expression ENTER_KEY_TYPE_DEFAULT_VALUE;
    public static final Expression FONT_SIZE_DEFAULT_VALUE;
    public static final Expression FONT_SIZE_UNIT_DEFAULT_VALUE;
    public static final ValueValidator FONT_SIZE_VALIDATOR;
    public static final ValueValidator FONT_WEIGHT_VALUE_VALIDATOR;
    public static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    public static final Expression HINT_COLOR_DEFAULT_VALUE;
    public static final Expression IS_ENABLED_DEFAULT_VALUE;
    public static final Expression KEYBOARD_TYPE_DEFAULT_VALUE;
    public static final Expression LETTER_SPACING_DEFAULT_VALUE;
    public static final ValueValidator LINE_HEIGHT_VALIDATOR;
    public static final ValueValidator MAX_LENGTH_VALIDATOR;
    public static final ValueValidator MAX_VISIBLE_LINES_VALIDATOR;
    public static final ValueValidator ROW_SPAN_VALIDATOR;
    public static final Expression SELECT_ALL_ON_FOCUS_DEFAULT_VALUE;
    public static final Expression TEXT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE;
    public static final Expression TEXT_ALIGNMENT_VERTICAL_DEFAULT_VALUE;
    public static final Expression TEXT_COLOR_DEFAULT_VALUE;
    public static final ListValidator TRANSITION_TRIGGERS_VALIDATOR;
    public static final TypeHelper TYPE_HELPER_ALIGNMENT_HORIZONTAL;
    public static final TypeHelper TYPE_HELPER_ALIGNMENT_VERTICAL;
    public static final TypeHelper TYPE_HELPER_AUTOCAPITALIZATION;
    public static final TypeHelper TYPE_HELPER_ENTER_KEY_TYPE;
    public static final TypeHelper TYPE_HELPER_FONT_SIZE_UNIT;
    public static final TypeHelper TYPE_HELPER_FONT_WEIGHT;
    public static final TypeHelper TYPE_HELPER_KEYBOARD_TYPE;
    public static final TypeHelper TYPE_HELPER_TEXT_ALIGNMENT_HORIZONTAL;
    public static final TypeHelper TYPE_HELPER_TEXT_ALIGNMENT_VERTICAL;
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
    public static final boolean MAX_LENGTH_VALIDATOR$lambda$5(long j) {
        return j > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MAX_VISIBLE_LINES_VALIDATOR$lambda$6(long j) {
        return j > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ROW_SPAN_VALIDATOR$lambda$7(long j) {
        return j >= 0;
    }

    /* compiled from: DivInputJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivInput deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.component.getDivAccessibilityJsonEntityParser());
            TypeHelper typeHelper = DivInputJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL;
            Function1 function1 = DivAlignmentHorizontal.FROM_STRING;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", typeHelper, function1);
            TypeHelper typeHelper2 = DivInputJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL;
            Function1 function12 = DivAlignmentVertical.FROM_STRING;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper2, function12);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivInputJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivInputJsonParser.ALPHA_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper3, function13, valueValidator, expression);
            if (readOptionalExpression3 != null) {
                expression = readOptionalExpression3;
            }
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.component.getDivAnimatorJsonEntityParser());
            TypeHelper typeHelper4 = DivInputJsonParser.TYPE_HELPER_AUTOCAPITALIZATION;
            Function1 function14 = DivInput.Autocapitalization.FROM_STRING;
            Expression expression2 = DivInputJsonParser.AUTOCAPITALIZATION_DEFAULT_VALUE;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "autocapitalization", typeHelper4, function14, expression2);
            Expression expression3 = readOptionalExpression4 == null ? expression2 : readOptionalExpression4;
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, M2.g, this.component.getDivBackgroundJsonEntityParser());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.component.getDivBorderJsonEntityParser());
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function15 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper5, function15, DivInputJsonParser.COLUMN_SPAN_VALIDATOR);
            List readOptionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.component.getDivDisappearActionJsonEntityParser());
            List readOptionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "enter_key_actions", this.component.getDivActionJsonEntityParser());
            TypeHelper typeHelper6 = DivInputJsonParser.TYPE_HELPER_ENTER_KEY_TYPE;
            Function1 function16 = DivInput.EnterKeyType.FROM_STRING;
            Expression expression4 = DivInputJsonParser.ENTER_KEY_TYPE_DEFAULT_VALUE;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "enter_key_type", typeHelper6, function16, expression4);
            Expression expression5 = readOptionalExpression6 == null ? expression4 : readOptionalExpression6;
            List readOptionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.component.getDivExtensionJsonEntityParser());
            List readOptionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "filters", this.component.getDivInputFilterJsonEntityParser());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.component.getDivFocusJsonEntityParser());
            TypeHelper<String> typeHelper7 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_family", typeHelper7);
            ValueValidator valueValidator2 = DivInputJsonParser.FONT_SIZE_VALIDATOR;
            Expression expression6 = DivInputJsonParser.FONT_SIZE_DEFAULT_VALUE;
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyConstants.TEXT_SIZE, typeHelper5, function15, valueValidator2, expression6);
            if (readOptionalExpression8 != null) {
                expression6 = readOptionalExpression8;
            }
            TypeHelper typeHelper8 = DivInputJsonParser.TYPE_HELPER_FONT_SIZE_UNIT;
            Function1 function17 = DivSizeUnit.FROM_STRING;
            Expression expression7 = DivInputJsonParser.FONT_SIZE_UNIT_DEFAULT_VALUE;
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size_unit", typeHelper8, function17, expression7);
            Expression expression8 = readOptionalExpression9 == null ? expression7 : readOptionalExpression9;
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
            Expression readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight", DivInputJsonParser.TYPE_HELPER_FONT_WEIGHT, DivFontWeight.FROM_STRING);
            Expression readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight_value", typeHelper5, function15, DivInputJsonParser.FONT_WEIGHT_VALUE_VALIDATOR);
            List readOptionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.component.getDivFunctionJsonEntityParser());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.component.getDivSizeJsonEntityParser());
            if (divSize == null) {
                divSize = DivInputJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            DivSize divSize2 = divSize;
            TypeHelper<Integer> typeHelper9 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1 function18 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "highlight_color", typeHelper9, function18);
            Expression expression9 = DivInputJsonParser.HINT_COLOR_DEFAULT_VALUE;
            Expression readOptionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "hint_color", typeHelper9, function18, expression9);
            if (readOptionalExpression14 != null) {
                expression9 = readOptionalExpression14;
            }
            Expression readOptionalExpression15 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "hint_text", typeHelper7);
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            TypeHelper<Boolean> typeHelper10 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function19 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression10 = DivInputJsonParser.IS_ENABLED_DEFAULT_VALUE;
            Expression readOptionalExpression16 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper10, function19, expression10);
            if (readOptionalExpression16 != null) {
                expression10 = readOptionalExpression16;
            }
            TypeHelper typeHelper11 = DivInputJsonParser.TYPE_HELPER_KEYBOARD_TYPE;
            Function1 function110 = DivInput.KeyboardType.FROM_STRING;
            Expression expression11 = DivInputJsonParser.KEYBOARD_TYPE_DEFAULT_VALUE;
            Expression readOptionalExpression17 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "keyboard_type", typeHelper11, function110, expression11);
            if (readOptionalExpression17 != null) {
                expression11 = readOptionalExpression17;
            }
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.component.getDivLayoutProviderJsonEntityParser());
            Expression expression12 = DivInputJsonParser.LETTER_SPACING_DEFAULT_VALUE;
            Expression readOptionalExpression18 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "letter_spacing", typeHelper3, function13, expression12);
            if (readOptionalExpression18 != null) {
                expression12 = readOptionalExpression18;
            }
            Expression readOptionalExpression19 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "line_height", typeHelper5, function15, DivInputJsonParser.LINE_HEIGHT_VALIDATOR);
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.component.getDivEdgeInsetsJsonEntityParser());
            DivInputMask divInputMask = (DivInputMask) JsonPropertyParser.readOptional(parsingContext, jSONObject, "mask", this.component.getDivInputMaskJsonEntityParser());
            Expression readOptionalExpression20 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "max_length", typeHelper5, function15, DivInputJsonParser.MAX_LENGTH_VALIDATOR);
            Expression readOptionalExpression21 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "max_visible_lines", typeHelper5, function15, DivInputJsonParser.MAX_VISIBLE_LINES_VALIDATOR);
            DivInput.NativeInterface nativeInterface = (DivInput.NativeInterface) JsonPropertyParser.readOptional(parsingContext, jSONObject, "native_interface", this.component.getDivInputNativeInterfaceJsonEntityParser());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonEntityParser());
            Expression readOptionalExpression22 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper7);
            Expression readOptionalExpression23 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper5, function15, DivInputJsonParser.ROW_SPAN_VALIDATOR);
            Expression expression13 = DivInputJsonParser.SELECT_ALL_ON_FOCUS_DEFAULT_VALUE;
            Expression readOptionalExpression24 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "select_all_on_focus", typeHelper10, function19, expression13);
            Expression expression14 = readOptionalExpression24 == null ? expression13 : readOptionalExpression24;
            List readOptionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.component.getDivActionJsonEntityParser());
            TypeHelper typeHelper12 = DivInputJsonParser.TYPE_HELPER_TEXT_ALIGNMENT_HORIZONTAL;
            Expression expression15 = DivInputJsonParser.TEXT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE;
            Expression readOptionalExpression25 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_alignment_horizontal", typeHelper12, function1, expression15);
            Expression expression16 = readOptionalExpression25 == null ? expression15 : readOptionalExpression25;
            TypeHelper typeHelper13 = DivInputJsonParser.TYPE_HELPER_TEXT_ALIGNMENT_VERTICAL;
            Expression expression17 = DivInputJsonParser.TEXT_ALIGNMENT_VERTICAL_DEFAULT_VALUE;
            Expression readOptionalExpression26 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_alignment_vertical", typeHelper13, function12, expression17);
            Expression expression18 = readOptionalExpression26 == null ? expression17 : readOptionalExpression26;
            Expression expression19 = DivInputJsonParser.TEXT_COLOR_DEFAULT_VALUE;
            Expression readOptionalExpression27 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_color", typeHelper9, function18, expression19);
            Expression expression20 = readOptionalExpression27 == null ? expression19 : readOptionalExpression27;
            String str2 = (String) JsonPropertyParser.read(parsingContext, jSONObject, "text_variable");
            List readOptionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.component.getDivTooltipJsonEntityParser());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.component.getDivTransformJsonEntityParser());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.component.getDivChangeTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.component.getDivAppearanceTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.component.getDivAppearanceTransitionJsonEntityParser());
            List readOptionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivInputJsonParser.TRANSITION_TRIGGERS_VALIDATOR);
            List readOptionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "validators", this.component.getDivInputValidatorJsonEntityParser());
            List readOptionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.component.getDivTriggerJsonEntityParser());
            List readOptionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.component.getDivVariableJsonEntityParser());
            TypeHelper typeHelper14 = DivInputJsonParser.TYPE_HELPER_VISIBILITY;
            Function1 function111 = DivVisibility.FROM_STRING;
            Expression expression21 = DivInputJsonParser.VISIBILITY_DEFAULT_VALUE;
            Expression readOptionalExpression28 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, typeHelper14, function111, expression21);
            Expression expression22 = readOptionalExpression28 == null ? expression21 : readOptionalExpression28;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.component.getDivVisibilityActionJsonEntityParser());
            List readOptionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.component.getDivVisibilityActionJsonEntityParser());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.component.getDivSizeJsonEntityParser());
            if (divSize3 == null) {
                divSize3 = DivInputJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivInput(divAccessibility, readOptionalExpression, readOptionalExpression2, expression, readOptionalList, expression3, readOptionalList2, divBorder, readOptionalExpression5, readOptionalList3, readOptionalList4, expression5, readOptionalList5, readOptionalList6, divFocus, readOptionalExpression7, expression6, expression8, readOptionalExpression10, readOptionalExpression11, readOptionalExpression12, readOptionalList7, divSize2, readOptionalExpression13, expression9, readOptionalExpression15, str, expression10, expression11, divLayoutProvider, expression12, readOptionalExpression19, divEdgeInsets, divInputMask, readOptionalExpression20, readOptionalExpression21, nativeInterface, divEdgeInsets2, readOptionalExpression22, readOptionalExpression23, expression14, readOptionalList8, expression16, expression18, expression20, str2, readOptionalList9, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, readOptionalList10, readOptionalList11, readOptionalList12, readOptionalList13, expression22, divVisibilityAction, readOptionalList14, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivInput divInput) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divInput.getAccessibility(), this.component.getDivAccessibilityJsonEntityParser());
            Expression alignmentHorizontal = divInput.getAlignmentHorizontal();
            Function1 function1 = DivAlignmentHorizontal.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", alignmentHorizontal, function1);
            Expression alignmentVertical = divInput.getAlignmentVertical();
            Function1 function12 = DivAlignmentVertical.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", alignmentVertical, function12);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divInput.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divInput.getAnimators(), this.component.getDivAnimatorJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "autocapitalization", divInput.autocapitalization, DivInput.Autocapitalization.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, M2.g, divInput.getBackground(), this.component.getDivBackgroundJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divInput.getBorder(), this.component.getDivBorderJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divInput.getColumnSpan());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divInput.getDisappearActions(), this.component.getDivDisappearActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "enter_key_actions", divInput.enterKeyActions, this.component.getDivActionJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "enter_key_type", divInput.enterKeyType, DivInput.EnterKeyType.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divInput.getExtensions(), this.component.getDivExtensionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "filters", divInput.filters, this.component.getDivInputFilterJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divInput.getFocus(), this.component.getDivFocusJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_family", divInput.fontFamily);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, ViewHierarchyConstants.TEXT_SIZE, divInput.fontSize);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size_unit", divInput.fontSizeUnit, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_variation_settings", divInput.fontVariationSettings);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight", divInput.fontWeight, DivFontWeight.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight_value", divInput.fontWeightValue);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divInput.getFunctions(), this.component.getDivFunctionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divInput.getHeight(), this.component.getDivSizeJsonEntityParser());
            Expression expression = divInput.highlightColor;
            Function1 function13 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "highlight_color", expression, function13);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "hint_color", divInput.hintColor, function13);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "hint_text", divInput.hintText);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divInput.getId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", divInput.isEnabled);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "keyboard_type", divInput.keyboardType, DivInput.KeyboardType.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divInput.getLayoutProvider(), this.component.getDivLayoutProviderJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "letter_spacing", divInput.letterSpacing);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "line_height", divInput.lineHeight);
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divInput.getMargins(), this.component.getDivEdgeInsetsJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "mask", divInput.mask, this.component.getDivInputMaskJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "max_length", divInput.maxLength);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "max_visible_lines", divInput.maxVisibleLines);
            JsonPropertyParser.write(parsingContext, jSONObject, "native_interface", divInput.nativeInterface, this.component.getDivInputNativeInterfaceJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divInput.getPaddings(), this.component.getDivEdgeInsetsJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divInput.getReuseId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divInput.getRowSpan());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "select_all_on_focus", divInput.selectAllOnFocus);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divInput.getSelectedActions(), this.component.getDivActionJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_alignment_horizontal", divInput.textAlignmentHorizontal, function1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_alignment_vertical", divInput.textAlignmentVertical, function12);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_color", divInput.textColor, function13);
            JsonPropertyParser.write(parsingContext, jSONObject, "text_variable", divInput.textVariable);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divInput.getTooltips(), this.component.getDivTooltipJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divInput.getTransform(), this.component.getDivTransformJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divInput.getTransitionChange(), this.component.getDivChangeTransitionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divInput.getTransitionIn(), this.component.getDivAppearanceTransitionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divInput.getTransitionOut(), this.component.getDivAppearanceTransitionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divInput.getTransitionTriggers(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "input");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "validators", divInput.validators, this.component.getDivInputValidatorJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divInput.getVariableTriggers(), this.component.getDivTriggerJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divInput.getVariables(), this.component.getDivVariableJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, divInput.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divInput.getVisibilityAction(), this.component.getDivVisibilityActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divInput.getVisibilityActions(), this.component.getDivVisibilityActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divInput.getWidth(), this.component.getDivSizeJsonEntityParser());
            return jSONObject;
        }
    }

    /* compiled from: DivInputJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivInputTemplate deserialize(ParsingContext parsingContext, DivInputTemplate divInputTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.accessibility : null, this.component.getDivAccessibilityJsonTemplateParser());
            TypeHelper typeHelper = DivInputJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL;
            Field field = divInputTemplate != null ? divInputTemplate.alignmentHorizontal : null;
            Function1 function1 = DivAlignmentHorizontal.FROM_STRING;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_horizontal", typeHelper, allowPropertyOverride, field, function1);
            TypeHelper typeHelper2 = DivInputJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL;
            Field field2 = divInputTemplate != null ? divInputTemplate.alignmentVertical : null;
            Function1 function12 = DivAlignmentVertical.FROM_STRING;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", typeHelper2, allowPropertyOverride, field2, function12);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field field3 = divInputTemplate != null ? divInputTemplate.alpha : null;
            Function1 function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", typeHelper3, allowPropertyOverride, field3, function13, DivInputJsonParser.ALPHA_VALIDATOR);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.animators : null, this.component.getDivAnimatorJsonTemplateParser());
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "autocapitalization", DivInputJsonParser.TYPE_HELPER_AUTOCAPITALIZATION, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.autocapitalization : null, DivInput.Autocapitalization.FROM_STRING);
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, M2.g, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.background : null, this.component.getDivBackgroundJsonTemplateParser());
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.border : null, this.component.getDivBorderJsonTemplateParser());
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Field field4 = divInputTemplate != null ? divInputTemplate.columnSpan : null;
            Function1 function14 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_span", typeHelper4, allowPropertyOverride, field4, function14, DivInputJsonParser.COLUMN_SPAN_VALIDATOR);
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.disappearActions : null, this.component.getDivDisappearActionJsonTemplateParser());
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "enter_key_actions", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.enterKeyActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "enter_key_type", DivInputJsonParser.TYPE_HELPER_ENTER_KEY_TYPE, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.enterKeyType : null, DivInput.EnterKeyType.FROM_STRING);
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.extensions : null, this.component.getDivExtensionJsonTemplateParser());
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "filters", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.filters : null, this.component.getDivInputFilterJsonTemplateParser());
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.focus : null, this.component.getDivFocusJsonTemplateParser());
            TypeHelper<String> typeHelper5 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_family", typeHelper5, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.fontFamily : null);
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, ViewHierarchyConstants.TEXT_SIZE, typeHelper4, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.fontSize : null, function14, DivInputJsonParser.FONT_SIZE_VALIDATOR);
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_size_unit", DivInputJsonParser.TYPE_HELPER_FONT_SIZE_UNIT, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.fontSizeUnit : null, DivSizeUnit.FROM_STRING);
            Field readOptionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.fontVariationSettings : null);
            Field readOptionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_weight", DivInputJsonParser.TYPE_HELPER_FONT_WEIGHT, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.fontWeight : null, DivFontWeight.FROM_STRING);
            Field readOptionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_weight_value", typeHelper4, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.fontWeightValue : null, function14, DivInputJsonParser.FONT_WEIGHT_VALUE_VALIDATOR);
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.functions : null, this.component.getDivFunctionJsonTemplateParser());
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.height : null, this.component.getDivSizeJsonTemplateParser());
            TypeHelper<Integer> typeHelper6 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field field5 = divInputTemplate != null ? divInputTemplate.highlightColor : null;
            Function1 function15 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field readOptionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "highlight_color", typeHelper6, allowPropertyOverride, field5, function15);
            Field readOptionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "hint_color", typeHelper6, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.hintColor : null, function15);
            Field readOptionalFieldWithExpression15 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "hint_text", typeHelper5, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.hintText : null);
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.id : null);
            TypeHelper<Boolean> typeHelper7 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field6 = divInputTemplate != null ? divInputTemplate.isEnabled : null;
            Function1 function16 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field readOptionalFieldWithExpression16 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "is_enabled", typeHelper7, allowPropertyOverride, field6, function16);
            Field readOptionalFieldWithExpression17 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "keyboard_type", DivInputJsonParser.TYPE_HELPER_KEYBOARD_TYPE, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.keyboardType : null, DivInput.KeyboardType.FROM_STRING);
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.layoutProvider : null, this.component.getDivLayoutProviderJsonTemplateParser());
            Field readOptionalFieldWithExpression18 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "letter_spacing", typeHelper3, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.letterSpacing : null, function13);
            Field readOptionalFieldWithExpression19 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "line_height", typeHelper4, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.lineHeight : null, function14, DivInputJsonParser.LINE_HEIGHT_VALIDATOR);
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.margins : null, this.component.getDivEdgeInsetsJsonTemplateParser());
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "mask", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.mask : null, this.component.getDivInputMaskJsonTemplateParser());
            Field readOptionalFieldWithExpression20 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "max_length", typeHelper4, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.maxLength : null, function14, DivInputJsonParser.MAX_LENGTH_VALIDATOR);
            Field readOptionalFieldWithExpression21 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "max_visible_lines", typeHelper4, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.maxVisibleLines : null, function14, DivInputJsonParser.MAX_VISIBLE_LINES_VALIDATOR);
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "native_interface", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.nativeInterface : null, this.component.getDivInputNativeInterfaceJsonTemplateParser());
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.paddings : null, this.component.getDivEdgeInsetsJsonTemplateParser());
            Field readOptionalFieldWithExpression22 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reuse_id", typeHelper5, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.reuseId : null);
            Field readOptionalFieldWithExpression23 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "row_span", typeHelper4, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.rowSpan : null, function14, DivInputJsonParser.ROW_SPAN_VALIDATOR);
            Field readOptionalFieldWithExpression24 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "select_all_on_focus", typeHelper7, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.selectAllOnFocus : null, function16);
            Field readOptionalListField8 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.selectedActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalFieldWithExpression25 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "text_alignment_horizontal", DivInputJsonParser.TYPE_HELPER_TEXT_ALIGNMENT_HORIZONTAL, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.textAlignmentHorizontal : null, function1);
            Field readOptionalFieldWithExpression26 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "text_alignment_vertical", DivInputJsonParser.TYPE_HELPER_TEXT_ALIGNMENT_VERTICAL, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.textAlignmentVertical : null, function12);
            Field readOptionalFieldWithExpression27 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "text_color", typeHelper6, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.textColor : null, function15);
            Field readField = JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "text_variable", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.textVariable : null);
            Field readOptionalListField9 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.tooltips : null, this.component.getDivTooltipJsonTemplateParser());
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.transform : null, this.component.getDivTransformJsonTemplateParser());
            Field readOptionalField12 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.transitionChange : null, this.component.getDivChangeTransitionJsonTemplateParser());
            Field readOptionalField13 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.transitionIn : null, this.component.getDivAppearanceTransitionJsonTemplateParser());
            Field readOptionalField14 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.transitionOut : null, this.component.getDivAppearanceTransitionJsonTemplateParser());
            Field field7 = divInputTemplate != null ? divInputTemplate.transitionTriggers : null;
            Function1 function17 = DivTransitionTrigger.FROM_STRING;
            ListValidator listValidator = DivInputJsonParser.TRANSITION_TRIGGERS_VALIDATOR;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivInputTemplate(readOptionalField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField, readOptionalFieldWithExpression4, readOptionalListField2, readOptionalField2, readOptionalFieldWithExpression5, readOptionalListField3, readOptionalListField4, readOptionalFieldWithExpression6, readOptionalListField5, readOptionalListField6, readOptionalField3, readOptionalFieldWithExpression7, readOptionalFieldWithExpression8, readOptionalFieldWithExpression9, readOptionalFieldWithExpression10, readOptionalFieldWithExpression11, readOptionalFieldWithExpression12, readOptionalListField7, readOptionalField4, readOptionalFieldWithExpression13, readOptionalFieldWithExpression14, readOptionalFieldWithExpression15, readOptionalField5, readOptionalFieldWithExpression16, readOptionalFieldWithExpression17, readOptionalField6, readOptionalFieldWithExpression18, readOptionalFieldWithExpression19, readOptionalField7, readOptionalField8, readOptionalFieldWithExpression20, readOptionalFieldWithExpression21, readOptionalField9, readOptionalField10, readOptionalFieldWithExpression22, readOptionalFieldWithExpression23, readOptionalFieldWithExpression24, readOptionalListField8, readOptionalFieldWithExpression25, readOptionalFieldWithExpression26, readOptionalFieldWithExpression27, readField, readOptionalListField9, readOptionalField11, readOptionalField12, readOptionalField13, readOptionalField14, JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field7, function17, listValidator), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "validators", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.validators : null, this.component.getDivInputValidatorJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.variableTriggers : null, this.component.getDivTriggerJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.variables : null, this.component.getDivVariableJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, DivInputJsonParser.TYPE_HELPER_VISIBILITY, allowPropertyOverride, divInputTemplate != null ? divInputTemplate.visibility : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.visibilityAction : null, this.component.getDivVisibilityActionJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.visibilityActions : null, this.component.getDivVisibilityActionJsonTemplateParser()), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divInputTemplate != null ? divInputTemplate.width : null, this.component.getDivSizeJsonTemplateParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivInputTemplate divInputTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divInputTemplate.accessibility, this.component.getDivAccessibilityJsonTemplateParser());
            Field field = divInputTemplate.alignmentHorizontal;
            Function1 function1 = DivAlignmentHorizontal.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", field, function1);
            Field field2 = divInputTemplate.alignmentVertical;
            Function1 function12 = DivAlignmentVertical.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", field2, function12);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divInputTemplate.alpha);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divInputTemplate.animators, this.component.getDivAnimatorJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "autocapitalization", divInputTemplate.autocapitalization, DivInput.Autocapitalization.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, M2.g, divInputTemplate.background, this.component.getDivBackgroundJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", divInputTemplate.border, this.component.getDivBorderJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divInputTemplate.columnSpan);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divInputTemplate.disappearActions, this.component.getDivDisappearActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "enter_key_actions", divInputTemplate.enterKeyActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "enter_key_type", divInputTemplate.enterKeyType, DivInput.EnterKeyType.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divInputTemplate.extensions, this.component.getDivExtensionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "filters", divInputTemplate.filters, this.component.getDivInputFilterJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divInputTemplate.focus, this.component.getDivFocusJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_family", divInputTemplate.fontFamily);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, ViewHierarchyConstants.TEXT_SIZE, divInputTemplate.fontSize);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size_unit", divInputTemplate.fontSizeUnit, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_variation_settings", divInputTemplate.fontVariationSettings);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight", divInputTemplate.fontWeight, DivFontWeight.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight_value", divInputTemplate.fontWeightValue);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divInputTemplate.functions, this.component.getDivFunctionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divInputTemplate.height, this.component.getDivSizeJsonTemplateParser());
            Field field3 = divInputTemplate.highlightColor;
            Function1 function13 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "highlight_color", field3, function13);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "hint_color", divInputTemplate.hintColor, function13);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "hint_text", divInputTemplate.hintText);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divInputTemplate.id);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", divInputTemplate.isEnabled);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "keyboard_type", divInputTemplate.keyboardType, DivInput.KeyboardType.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divInputTemplate.layoutProvider, this.component.getDivLayoutProviderJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "letter_spacing", divInputTemplate.letterSpacing);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "line_height", divInputTemplate.lineHeight);
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divInputTemplate.margins, this.component.getDivEdgeInsetsJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "mask", divInputTemplate.mask, this.component.getDivInputMaskJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "max_length", divInputTemplate.maxLength);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "max_visible_lines", divInputTemplate.maxVisibleLines);
            JsonFieldParser.writeField(parsingContext, jSONObject, "native_interface", divInputTemplate.nativeInterface, this.component.getDivInputNativeInterfaceJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divInputTemplate.paddings, this.component.getDivEdgeInsetsJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divInputTemplate.reuseId);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divInputTemplate.rowSpan);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "select_all_on_focus", divInputTemplate.selectAllOnFocus);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divInputTemplate.selectedActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_alignment_horizontal", divInputTemplate.textAlignmentHorizontal, function1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_alignment_vertical", divInputTemplate.textAlignmentVertical, function12);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_color", divInputTemplate.textColor, function13);
            JsonFieldParser.writeField(parsingContext, jSONObject, "text_variable", divInputTemplate.textVariable);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divInputTemplate.tooltips, this.component.getDivTooltipJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divInputTemplate.transform, this.component.getDivTransformJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divInputTemplate.transitionChange, this.component.getDivChangeTransitionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divInputTemplate.transitionIn, this.component.getDivAppearanceTransitionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divInputTemplate.transitionOut, this.component.getDivAppearanceTransitionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divInputTemplate.transitionTriggers, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "input");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "validators", divInputTemplate.validators, this.component.getDivInputValidatorJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divInputTemplate.variableTriggers, this.component.getDivTriggerJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divInputTemplate.variables, this.component.getDivVariableJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, divInputTemplate.visibility, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divInputTemplate.visibilityAction, this.component.getDivVisibilityActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divInputTemplate.visibilityActions, this.component.getDivVisibilityActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divInputTemplate.width, this.component.getDivSizeJsonTemplateParser());
            return jSONObject;
        }
    }

    /* compiled from: DivInputJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivInput resolve(ParsingContext parsingContext, DivInputTemplate divInputTemplate, JSONObject jSONObject) {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.accessibility, jSONObject, "accessibility", this.component.getDivAccessibilityJsonTemplateResolver(), this.component.getDivAccessibilityJsonEntityParser());
            Field field = divInputTemplate.alignmentHorizontal;
            TypeHelper typeHelper = DivInputJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL;
            Function1 function1 = DivAlignmentHorizontal.FROM_STRING;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alignment_horizontal", typeHelper, function1);
            Field field2 = divInputTemplate.alignmentVertical;
            TypeHelper typeHelper2 = DivInputJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL;
            Function1 function12 = DivAlignmentVertical.FROM_STRING;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alignment_vertical", typeHelper2, function12);
            Field field3 = divInputTemplate.alpha;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivInputJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivInputJsonParser.ALPHA_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alpha", typeHelper3, function13, valueValidator, expression);
            if (resolveOptionalExpression3 != null) {
                expression = resolveOptionalExpression3;
            }
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.animators, jSONObject, "animators", this.component.getDivAnimatorJsonTemplateResolver(), this.component.getDivAnimatorJsonEntityParser());
            Field field4 = divInputTemplate.autocapitalization;
            TypeHelper typeHelper4 = DivInputJsonParser.TYPE_HELPER_AUTOCAPITALIZATION;
            Function1 function14 = DivInput.Autocapitalization.FROM_STRING;
            Expression expression2 = DivInputJsonParser.AUTOCAPITALIZATION_DEFAULT_VALUE;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "autocapitalization", typeHelper4, function14, expression2);
            Expression expression3 = resolveOptionalExpression4 == null ? expression2 : resolveOptionalExpression4;
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.background, jSONObject, M2.g, this.component.getDivBackgroundJsonTemplateResolver(), this.component.getDivBackgroundJsonEntityParser());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.border, jSONObject, "border", this.component.getDivBorderJsonTemplateResolver(), this.component.getDivBorderJsonEntityParser());
            Field field5 = divInputTemplate.columnSpan;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function15 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "column_span", typeHelper5, function15, DivInputJsonParser.COLUMN_SPAN_VALIDATOR);
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.disappearActions, jSONObject, "disappear_actions", this.component.getDivDisappearActionJsonTemplateResolver(), this.component.getDivDisappearActionJsonEntityParser());
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.enterKeyActions, jSONObject, "enter_key_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            Field field6 = divInputTemplate.enterKeyType;
            TypeHelper typeHelper6 = DivInputJsonParser.TYPE_HELPER_ENTER_KEY_TYPE;
            Function1 function16 = DivInput.EnterKeyType.FROM_STRING;
            Expression expression4 = DivInputJsonParser.ENTER_KEY_TYPE_DEFAULT_VALUE;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "enter_key_type", typeHelper6, function16, expression4);
            Expression expression5 = resolveOptionalExpression6 == null ? expression4 : resolveOptionalExpression6;
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.extensions, jSONObject, "extensions", this.component.getDivExtensionJsonTemplateResolver(), this.component.getDivExtensionJsonEntityParser());
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.filters, jSONObject, "filters", this.component.getDivInputFilterJsonTemplateResolver(), this.component.getDivInputFilterJsonEntityParser());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.focus, jSONObject, "focus", this.component.getDivFocusJsonTemplateResolver(), this.component.getDivFocusJsonEntityParser());
            Field field7 = divInputTemplate.fontFamily;
            TypeHelper<String> typeHelper7 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "font_family", typeHelper7);
            Field field8 = divInputTemplate.fontSize;
            ValueValidator valueValidator2 = DivInputJsonParser.FONT_SIZE_VALIDATOR;
            Expression expression6 = DivInputJsonParser.FONT_SIZE_DEFAULT_VALUE;
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, ViewHierarchyConstants.TEXT_SIZE, typeHelper5, function15, valueValidator2, expression6);
            if (resolveOptionalExpression8 != null) {
                expression6 = resolveOptionalExpression8;
            }
            Field field9 = divInputTemplate.fontSizeUnit;
            TypeHelper typeHelper8 = DivInputJsonParser.TYPE_HELPER_FONT_SIZE_UNIT;
            Function1 function17 = DivSizeUnit.FROM_STRING;
            Expression expression7 = DivInputJsonParser.FONT_SIZE_UNIT_DEFAULT_VALUE;
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "font_size_unit", typeHelper8, function17, expression7);
            Expression expression8 = resolveOptionalExpression9 == null ? expression7 : resolveOptionalExpression9;
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divInputTemplate.fontVariationSettings, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
            Expression resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divInputTemplate.fontWeight, jSONObject, "font_weight", DivInputJsonParser.TYPE_HELPER_FONT_WEIGHT, DivFontWeight.FROM_STRING);
            Expression resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divInputTemplate.fontWeightValue, jSONObject, "font_weight_value", typeHelper5, function15, DivInputJsonParser.FONT_WEIGHT_VALUE_VALIDATOR);
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.functions, jSONObject, "functions", this.component.getDivFunctionJsonTemplateResolver(), this.component.getDivFunctionJsonEntityParser());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.height, jSONObject, "height", this.component.getDivSizeJsonTemplateResolver(), this.component.getDivSizeJsonEntityParser());
            if (divSize == null) {
                divSize = DivInputJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            DivSize divSize2 = divSize;
            Field field10 = divInputTemplate.highlightColor;
            TypeHelper<Integer> typeHelper9 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1 function18 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "highlight_color", typeHelper9, function18);
            Field field11 = divInputTemplate.hintColor;
            Expression expression9 = DivInputJsonParser.HINT_COLOR_DEFAULT_VALUE;
            Expression resolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field11, jSONObject, "hint_color", typeHelper9, function18, expression9);
            if (resolveOptionalExpression14 != null) {
                expression9 = resolveOptionalExpression14;
            }
            Expression resolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divInputTemplate.hintText, jSONObject, "hint_text", typeHelper7);
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.id, jSONObject, "id");
            Field field12 = divInputTemplate.isEnabled;
            TypeHelper<Boolean> typeHelper10 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function19 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression10 = DivInputJsonParser.IS_ENABLED_DEFAULT_VALUE;
            Expression resolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field12, jSONObject, "is_enabled", typeHelper10, function19, expression10);
            if (resolveOptionalExpression16 != null) {
                expression10 = resolveOptionalExpression16;
            }
            Field field13 = divInputTemplate.keyboardType;
            TypeHelper typeHelper11 = DivInputJsonParser.TYPE_HELPER_KEYBOARD_TYPE;
            Function1 function110 = DivInput.KeyboardType.FROM_STRING;
            Expression expression11 = DivInputJsonParser.KEYBOARD_TYPE_DEFAULT_VALUE;
            Expression resolveOptionalExpression17 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field13, jSONObject, "keyboard_type", typeHelper11, function110, expression11);
            if (resolveOptionalExpression17 != null) {
                expression11 = resolveOptionalExpression17;
            }
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.layoutProvider, jSONObject, "layout_provider", this.component.getDivLayoutProviderJsonTemplateResolver(), this.component.getDivLayoutProviderJsonEntityParser());
            Field field14 = divInputTemplate.letterSpacing;
            Expression expression12 = DivInputJsonParser.LETTER_SPACING_DEFAULT_VALUE;
            Expression resolveOptionalExpression18 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field14, jSONObject, "letter_spacing", typeHelper3, function13, expression12);
            if (resolveOptionalExpression18 != null) {
                expression12 = resolveOptionalExpression18;
            }
            Expression resolveOptionalExpression19 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divInputTemplate.lineHeight, jSONObject, "line_height", typeHelper5, function15, DivInputJsonParser.LINE_HEIGHT_VALIDATOR);
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.margins, jSONObject, "margins", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            DivInputMask divInputMask = (DivInputMask) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.mask, jSONObject, "mask", this.component.getDivInputMaskJsonTemplateResolver(), this.component.getDivInputMaskJsonEntityParser());
            Expression resolveOptionalExpression20 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divInputTemplate.maxLength, jSONObject, "max_length", typeHelper5, function15, DivInputJsonParser.MAX_LENGTH_VALIDATOR);
            Expression resolveOptionalExpression21 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divInputTemplate.maxVisibleLines, jSONObject, "max_visible_lines", typeHelper5, function15, DivInputJsonParser.MAX_VISIBLE_LINES_VALIDATOR);
            DivInput.NativeInterface nativeInterface = (DivInput.NativeInterface) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.nativeInterface, jSONObject, "native_interface", this.component.getDivInputNativeInterfaceJsonTemplateResolver(), this.component.getDivInputNativeInterfaceJsonEntityParser());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.paddings, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            Expression resolveOptionalExpression22 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divInputTemplate.reuseId, jSONObject, "reuse_id", typeHelper7);
            Expression resolveOptionalExpression23 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divInputTemplate.rowSpan, jSONObject, "row_span", typeHelper5, function15, DivInputJsonParser.ROW_SPAN_VALIDATOR);
            Field field15 = divInputTemplate.selectAllOnFocus;
            Expression expression13 = DivInputJsonParser.SELECT_ALL_ON_FOCUS_DEFAULT_VALUE;
            Expression resolveOptionalExpression24 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field15, jSONObject, "select_all_on_focus", typeHelper10, function19, expression13);
            Expression expression14 = resolveOptionalExpression24 == null ? expression13 : resolveOptionalExpression24;
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.selectedActions, jSONObject, "selected_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            Field field16 = divInputTemplate.textAlignmentHorizontal;
            TypeHelper typeHelper12 = DivInputJsonParser.TYPE_HELPER_TEXT_ALIGNMENT_HORIZONTAL;
            Expression expression15 = DivInputJsonParser.TEXT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE;
            Expression resolveOptionalExpression25 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field16, jSONObject, "text_alignment_horizontal", typeHelper12, function1, expression15);
            Expression expression16 = resolveOptionalExpression25 == null ? expression15 : resolveOptionalExpression25;
            Field field17 = divInputTemplate.textAlignmentVertical;
            TypeHelper typeHelper13 = DivInputJsonParser.TYPE_HELPER_TEXT_ALIGNMENT_VERTICAL;
            Expression expression17 = DivInputJsonParser.TEXT_ALIGNMENT_VERTICAL_DEFAULT_VALUE;
            Expression resolveOptionalExpression26 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field17, jSONObject, "text_alignment_vertical", typeHelper13, function12, expression17);
            Expression expression18 = resolveOptionalExpression26 == null ? expression17 : resolveOptionalExpression26;
            Field field18 = divInputTemplate.textColor;
            Expression expression19 = DivInputJsonParser.TEXT_COLOR_DEFAULT_VALUE;
            Expression resolveOptionalExpression27 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field18, jSONObject, "text_color", typeHelper9, function18, expression19);
            Expression expression20 = resolveOptionalExpression27 == null ? expression19 : resolveOptionalExpression27;
            String str2 = (String) JsonFieldResolver.resolve(parsingContext, divInputTemplate.textVariable, jSONObject, "text_variable");
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.tooltips, jSONObject, "tooltips", this.component.getDivTooltipJsonTemplateResolver(), this.component.getDivTooltipJsonEntityParser());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.transform, jSONObject, "transform", this.component.getDivTransformJsonTemplateResolver(), this.component.getDivTransformJsonEntityParser());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.transitionChange, jSONObject, "transition_change", this.component.getDivChangeTransitionJsonTemplateResolver(), this.component.getDivChangeTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.transitionIn, jSONObject, "transition_in", this.component.getDivAppearanceTransitionJsonTemplateResolver(), this.component.getDivAppearanceTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.transitionOut, jSONObject, "transition_out", this.component.getDivAppearanceTransitionJsonTemplateResolver(), this.component.getDivAppearanceTransitionJsonEntityParser());
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.transitionTriggers, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivInputJsonParser.TRANSITION_TRIGGERS_VALIDATOR);
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.validators, jSONObject, "validators", this.component.getDivInputValidatorJsonTemplateResolver(), this.component.getDivInputValidatorJsonEntityParser());
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.variableTriggers, jSONObject, "variable_triggers", this.component.getDivTriggerJsonTemplateResolver(), this.component.getDivTriggerJsonEntityParser());
            List resolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.variables, jSONObject, "variables", this.component.getDivVariableJsonTemplateResolver(), this.component.getDivVariableJsonEntityParser());
            Field field19 = divInputTemplate.visibility;
            TypeHelper typeHelper14 = DivInputJsonParser.TYPE_HELPER_VISIBILITY;
            Function1 function111 = DivVisibility.FROM_STRING;
            Expression expression21 = DivInputJsonParser.VISIBILITY_DEFAULT_VALUE;
            Expression resolveOptionalExpression28 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field19, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, typeHelper14, function111, expression21);
            Expression expression22 = resolveOptionalExpression28 == null ? expression21 : resolveOptionalExpression28;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.visibilityAction, jSONObject, "visibility_action", this.component.getDivVisibilityActionJsonTemplateResolver(), this.component.getDivVisibilityActionJsonEntityParser());
            List resolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, divInputTemplate.visibilityActions, jSONObject, "visibility_actions", this.component.getDivVisibilityActionJsonTemplateResolver(), this.component.getDivVisibilityActionJsonEntityParser());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divInputTemplate.width, jSONObject, "width", this.component.getDivSizeJsonTemplateResolver(), this.component.getDivSizeJsonEntityParser());
            if (divSize3 == null) {
                divSize3 = DivInputJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivInput(divAccessibility, resolveOptionalExpression, resolveOptionalExpression2, expression, resolveOptionalList, expression3, resolveOptionalList2, divBorder, resolveOptionalExpression5, resolveOptionalList3, resolveOptionalList4, expression5, resolveOptionalList5, resolveOptionalList6, divFocus, resolveOptionalExpression7, expression6, expression8, resolveOptionalExpression10, resolveOptionalExpression11, resolveOptionalExpression12, resolveOptionalList7, divSize2, resolveOptionalExpression13, expression9, resolveOptionalExpression15, str, expression10, expression11, divLayoutProvider, expression12, resolveOptionalExpression19, divEdgeInsets, divInputMask, resolveOptionalExpression20, resolveOptionalExpression21, nativeInterface, divEdgeInsets2, resolveOptionalExpression22, resolveOptionalExpression23, expression14, resolveOptionalList8, expression16, expression18, expression20, str2, resolveOptionalList9, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, resolveOptionalList10, resolveOptionalList11, resolveOptionalList12, resolveOptionalList13, expression22, divVisibilityAction, resolveOptionalList14, divSize3);
        }
    }

    /* compiled from: DivInputJsonParser.kt */
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
        DivInput.Autocapitalization autocapitalization = DivInput.Autocapitalization.AUTO;
        AUTOCAPITALIZATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, autocapitalization, null, 2, null);
        DivInput.EnterKeyType enterKeyType = DivInput.EnterKeyType.DEFAULT;
        ENTER_KEY_TYPE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, enterKeyType, null, 2, null);
        FONT_SIZE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        DivSizeUnit divSizeUnit = DivSizeUnit.SP;
        FONT_SIZE_UNIT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7, null));
        HINT_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 1929379840, null, 2, null);
        IS_ENABLED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        DivInput.KeyboardType keyboardType = DivInput.KeyboardType.MULTI_LINE_TEXT;
        KEYBOARD_TYPE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, keyboardType, null, 2, null);
        LETTER_SPACING_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        SELECT_ALL_ON_FOCUS_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.START;
        TEXT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divAlignmentHorizontal, null, 2, null);
        DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.CENTER;
        TEXT_ALIGNMENT_VERTICAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divAlignmentVertical, null, 2, null);
        TEXT_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, -16777216, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null == true ? 1 : 0, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        TYPE_HELPER_ALIGNMENT_HORIZONTAL = companion2.from(ArraysKt.first(DivAlignmentHorizontal.values()), new Function1() { // from class: com.yandex.div2.DivInputJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        TYPE_HELPER_ALIGNMENT_VERTICAL = companion2.from(ArraysKt.first(DivAlignmentVertical.values()), new Function1() { // from class: com.yandex.div2.DivInputJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        TYPE_HELPER_AUTOCAPITALIZATION = companion2.from(autocapitalization, new Function1() { // from class: com.yandex.div2.DivInputJsonParser$Companion$TYPE_HELPER_AUTOCAPITALIZATION$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivInput.Autocapitalization);
            }
        });
        TYPE_HELPER_ENTER_KEY_TYPE = companion2.from(enterKeyType, new Function1() { // from class: com.yandex.div2.DivInputJsonParser$Companion$TYPE_HELPER_ENTER_KEY_TYPE$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivInput.EnterKeyType);
            }
        });
        TYPE_HELPER_FONT_SIZE_UNIT = companion2.from(divSizeUnit, new Function1() { // from class: com.yandex.div2.DivInputJsonParser$Companion$TYPE_HELPER_FONT_SIZE_UNIT$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
        TYPE_HELPER_FONT_WEIGHT = companion2.from(ArraysKt.first(DivFontWeight.values()), new Function1() { // from class: com.yandex.div2.DivInputJsonParser$Companion$TYPE_HELPER_FONT_WEIGHT$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivFontWeight);
            }
        });
        TYPE_HELPER_KEYBOARD_TYPE = companion2.from(keyboardType, new Function1() { // from class: com.yandex.div2.DivInputJsonParser$Companion$TYPE_HELPER_KEYBOARD_TYPE$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivInput.KeyboardType);
            }
        });
        TYPE_HELPER_TEXT_ALIGNMENT_HORIZONTAL = companion2.from(divAlignmentHorizontal, new Function1() { // from class: com.yandex.div2.DivInputJsonParser$Companion$TYPE_HELPER_TEXT_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        TYPE_HELPER_TEXT_ALIGNMENT_VERTICAL = companion2.from(divAlignmentVertical, new Function1() { // from class: com.yandex.div2.DivInputJsonParser$Companion$TYPE_HELPER_TEXT_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        TYPE_HELPER_VISIBILITY = companion2.from(divVisibility, new Function1() { // from class: com.yandex.div2.DivInputJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        ALPHA_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivInputJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ALPHA_VALIDATOR$lambda$0;
                ALPHA_VALIDATOR$lambda$0 = DivInputJsonParser.ALPHA_VALIDATOR$lambda$0(((Double) obj).doubleValue());
                return ALPHA_VALIDATOR$lambda$0;
            }
        };
        COLUMN_SPAN_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivInputJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean COLUMN_SPAN_VALIDATOR$lambda$1;
                COLUMN_SPAN_VALIDATOR$lambda$1 = DivInputJsonParser.COLUMN_SPAN_VALIDATOR$lambda$1(((Long) obj).longValue());
                return COLUMN_SPAN_VALIDATOR$lambda$1;
            }
        };
        FONT_SIZE_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivInputJsonParser$$ExternalSyntheticLambda2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean FONT_SIZE_VALIDATOR$lambda$2;
                FONT_SIZE_VALIDATOR$lambda$2 = DivInputJsonParser.FONT_SIZE_VALIDATOR$lambda$2(((Long) obj).longValue());
                return FONT_SIZE_VALIDATOR$lambda$2;
            }
        };
        FONT_WEIGHT_VALUE_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivInputJsonParser$$ExternalSyntheticLambda3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean FONT_WEIGHT_VALUE_VALIDATOR$lambda$3;
                FONT_WEIGHT_VALUE_VALIDATOR$lambda$3 = DivInputJsonParser.FONT_WEIGHT_VALUE_VALIDATOR$lambda$3(((Long) obj).longValue());
                return FONT_WEIGHT_VALUE_VALIDATOR$lambda$3;
            }
        };
        LINE_HEIGHT_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivInputJsonParser$$ExternalSyntheticLambda4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean LINE_HEIGHT_VALIDATOR$lambda$4;
                LINE_HEIGHT_VALIDATOR$lambda$4 = DivInputJsonParser.LINE_HEIGHT_VALIDATOR$lambda$4(((Long) obj).longValue());
                return LINE_HEIGHT_VALIDATOR$lambda$4;
            }
        };
        MAX_LENGTH_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivInputJsonParser$$ExternalSyntheticLambda5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean MAX_LENGTH_VALIDATOR$lambda$5;
                MAX_LENGTH_VALIDATOR$lambda$5 = DivInputJsonParser.MAX_LENGTH_VALIDATOR$lambda$5(((Long) obj).longValue());
                return MAX_LENGTH_VALIDATOR$lambda$5;
            }
        };
        MAX_VISIBLE_LINES_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivInputJsonParser$$ExternalSyntheticLambda6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean MAX_VISIBLE_LINES_VALIDATOR$lambda$6;
                MAX_VISIBLE_LINES_VALIDATOR$lambda$6 = DivInputJsonParser.MAX_VISIBLE_LINES_VALIDATOR$lambda$6(((Long) obj).longValue());
                return MAX_VISIBLE_LINES_VALIDATOR$lambda$6;
            }
        };
        ROW_SPAN_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivInputJsonParser$$ExternalSyntheticLambda7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ROW_SPAN_VALIDATOR$lambda$7;
                ROW_SPAN_VALIDATOR$lambda$7 = DivInputJsonParser.ROW_SPAN_VALIDATOR$lambda$7(((Long) obj).longValue());
                return ROW_SPAN_VALIDATOR$lambda$7;
            }
        };
        TRANSITION_TRIGGERS_VALIDATOR = new ListValidator() { // from class: com.yandex.div2.DivInputJsonParser$$ExternalSyntheticLambda8
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean TRANSITION_TRIGGERS_VALIDATOR$lambda$8;
                TRANSITION_TRIGGERS_VALIDATOR$lambda$8 = DivInputJsonParser.TRANSITION_TRIGGERS_VALIDATOR$lambda$8(list);
                return TRANSITION_TRIGGERS_VALIDATOR$lambda$8;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TRANSITION_TRIGGERS_VALIDATOR$lambda$8(List list) {
        return list.size() >= 1;
    }
}
