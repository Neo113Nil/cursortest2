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
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivText;
import io.appmetrica.analytics.impl.M2;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTextJsonParser.kt */
/* loaded from: classes12.dex */
public abstract class DivTextJsonParser {
    public static final DivAnimation ACTION_ANIMATION_DEFAULT_VALUE;
    public static final Expression ALPHA_DEFAULT_VALUE;
    public static final ValueValidator ALPHA_VALIDATOR;
    public static final Expression CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE;
    public static final ValueValidator COLUMN_SPAN_VALIDATOR;
    private static final Companion Companion = new Companion(null);
    public static final Expression FONT_SIZE_DEFAULT_VALUE;
    public static final Expression FONT_SIZE_UNIT_DEFAULT_VALUE;
    public static final ValueValidator FONT_SIZE_VALIDATOR;
    public static final ValueValidator FONT_WEIGHT_VALUE_VALIDATOR;
    public static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    public static final Expression LETTER_SPACING_DEFAULT_VALUE;
    public static final ValueValidator LINE_HEIGHT_VALIDATOR;
    public static final ValueValidator MAX_LINES_VALIDATOR;
    public static final ValueValidator MIN_HIDDEN_LINES_VALIDATOR;
    public static final ValueValidator ROW_SPAN_VALIDATOR;
    public static final Expression SELECTABLE_DEFAULT_VALUE;
    public static final Expression STRIKE_DEFAULT_VALUE;
    public static final Expression TEXT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE;
    public static final Expression TEXT_ALIGNMENT_VERTICAL_DEFAULT_VALUE;
    public static final Expression TEXT_COLOR_DEFAULT_VALUE;
    public static final Expression TIGHTEN_WIDTH_DEFAULT_VALUE;
    public static final ListValidator TRANSITION_TRIGGERS_VALIDATOR;
    public static final Expression TRUNCATE_DEFAULT_VALUE;
    public static final TypeHelper TYPE_HELPER_ALIGNMENT_HORIZONTAL;
    public static final TypeHelper TYPE_HELPER_ALIGNMENT_VERTICAL;
    public static final TypeHelper TYPE_HELPER_FONT_SIZE_UNIT;
    public static final TypeHelper TYPE_HELPER_FONT_WEIGHT;
    public static final TypeHelper TYPE_HELPER_STRIKE;
    public static final TypeHelper TYPE_HELPER_TEXT_ALIGNMENT_HORIZONTAL;
    public static final TypeHelper TYPE_HELPER_TEXT_ALIGNMENT_VERTICAL;
    public static final TypeHelper TYPE_HELPER_TRUNCATE;
    public static final TypeHelper TYPE_HELPER_UNDERLINE;
    public static final TypeHelper TYPE_HELPER_VISIBILITY;
    public static final Expression UNDERLINE_DEFAULT_VALUE;
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
    public static final boolean MAX_LINES_VALIDATOR$lambda$5(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MIN_HIDDEN_LINES_VALIDATOR$lambda$6(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ROW_SPAN_VALIDATOR$lambda$7(long j) {
        return j >= 0;
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivText deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.component.getDivAccessibilityJsonEntityParser());
            DivAction divAction = (DivAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action", this.component.getDivActionJsonEntityParser());
            DivAnimation divAnimation = (DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action_animation", this.component.getDivAnimationJsonEntityParser());
            if (divAnimation == null) {
                divAnimation = DivTextJsonParser.ACTION_ANIMATION_DEFAULT_VALUE;
            }
            DivAnimation divAnimation2 = divAnimation;
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.component.getDivActionJsonEntityParser());
            TypeHelper typeHelper = DivTextJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL;
            Function1 function1 = DivAlignmentHorizontal.FROM_STRING;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", typeHelper, function1);
            TypeHelper typeHelper2 = DivTextJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL;
            Function1 function12 = DivAlignmentVertical.FROM_STRING;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper2, function12);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivTextJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivTextJsonParser.ALPHA_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper3, function13, valueValidator, expression);
            if (readOptionalExpression3 != null) {
                expression = readOptionalExpression3;
            }
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.component.getDivAnimatorJsonEntityParser());
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "auto_ellipsize", typeHelper4, function14);
            List readOptionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, M2.g, this.component.getDivBackgroundJsonEntityParser());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.component.getDivBorderJsonEntityParser());
            Expression expression2 = DivTextJsonParser.CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper4, function14, expression2);
            if (readOptionalExpression5 != null) {
                expression2 = readOptionalExpression5;
            }
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function15 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper5, function15, DivTextJsonParser.COLUMN_SPAN_VALIDATOR);
            List readOptionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.component.getDivDisappearActionJsonEntityParser());
            List readOptionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", this.component.getDivActionJsonEntityParser());
            DivText.Ellipsis ellipsis = (DivText.Ellipsis) JsonPropertyParser.readOptional(parsingContext, jSONObject, "ellipsis", this.component.getDivTextEllipsisJsonEntityParser());
            List readOptionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.component.getDivExtensionJsonEntityParser());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.component.getDivFocusJsonEntityParser());
            TypeHelper<Integer> typeHelper6 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1 function16 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "focused_text_color", typeHelper6, function16);
            TypeHelper<String> typeHelper7 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_family", typeHelper7);
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_feature_settings", typeHelper7);
            ValueValidator valueValidator2 = DivTextJsonParser.FONT_SIZE_VALIDATOR;
            Expression expression3 = DivTextJsonParser.FONT_SIZE_DEFAULT_VALUE;
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyConstants.TEXT_SIZE, typeHelper5, function15, valueValidator2, expression3);
            if (readOptionalExpression10 != null) {
                expression3 = readOptionalExpression10;
            }
            TypeHelper typeHelper8 = DivTextJsonParser.TYPE_HELPER_FONT_SIZE_UNIT;
            Function1 function17 = DivSizeUnit.FROM_STRING;
            Expression expression4 = DivTextJsonParser.FONT_SIZE_UNIT_DEFAULT_VALUE;
            Expression readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size_unit", typeHelper8, function17, expression4);
            Expression expression5 = readOptionalExpression11 == null ? expression4 : readOptionalExpression11;
            Expression readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
            Expression readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight", DivTextJsonParser.TYPE_HELPER_FONT_WEIGHT, DivFontWeight.FROM_STRING);
            Expression readOptionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight_value", typeHelper5, function15, DivTextJsonParser.FONT_WEIGHT_VALUE_VALIDATOR);
            List readOptionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.component.getDivFunctionJsonEntityParser());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.component.getDivSizeJsonEntityParser());
            if (divSize == null) {
                divSize = DivTextJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            DivSize divSize2 = divSize;
            List readOptionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", this.component.getDivActionJsonEntityParser());
            List readOptionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", this.component.getDivActionJsonEntityParser());
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            List readOptionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "images", this.component.getDivTextImageJsonEntityParser());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.component.getDivLayoutProviderJsonEntityParser());
            Expression expression6 = DivTextJsonParser.LETTER_SPACING_DEFAULT_VALUE;
            Expression readOptionalExpression15 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "letter_spacing", typeHelper3, function13, expression6);
            Expression expression7 = readOptionalExpression15 == null ? expression6 : readOptionalExpression15;
            Expression readOptionalExpression16 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "line_height", typeHelper5, function15, DivTextJsonParser.LINE_HEIGHT_VALIDATOR);
            List readOptionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", this.component.getDivActionJsonEntityParser());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.component.getDivEdgeInsetsJsonEntityParser());
            Expression readOptionalExpression17 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "max_lines", typeHelper5, function15, DivTextJsonParser.MAX_LINES_VALIDATOR);
            Expression readOptionalExpression18 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "min_hidden_lines", typeHelper5, function15, DivTextJsonParser.MIN_HIDDEN_LINES_VALIDATOR);
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonEntityParser());
            List readOptionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", this.component.getDivActionJsonEntityParser());
            List readOptionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", this.component.getDivActionJsonEntityParser());
            List readOptionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "ranges", this.component.getDivTextRangeJsonEntityParser());
            Expression readOptionalExpression19 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper7);
            Expression readOptionalExpression20 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper5, function15, DivTextJsonParser.ROW_SPAN_VALIDATOR);
            Expression expression8 = DivTextJsonParser.SELECTABLE_DEFAULT_VALUE;
            Expression readOptionalExpression21 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "selectable", typeHelper4, function14, expression8);
            Expression expression9 = readOptionalExpression21 == null ? expression8 : readOptionalExpression21;
            List readOptionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.component.getDivActionJsonEntityParser());
            TypeHelper typeHelper9 = DivTextJsonParser.TYPE_HELPER_STRIKE;
            Function1 function18 = DivLineStyle.FROM_STRING;
            Expression expression10 = DivTextJsonParser.STRIKE_DEFAULT_VALUE;
            Expression readOptionalExpression22 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "strike", typeHelper9, function18, expression10);
            Expression expression11 = readOptionalExpression22 == null ? expression10 : readOptionalExpression22;
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "text", typeHelper7);
            TypeHelper typeHelper10 = DivTextJsonParser.TYPE_HELPER_TEXT_ALIGNMENT_HORIZONTAL;
            Expression expression12 = DivTextJsonParser.TEXT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE;
            Expression readOptionalExpression23 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_alignment_horizontal", typeHelper10, function1, expression12);
            Expression expression13 = readOptionalExpression23 == null ? expression12 : readOptionalExpression23;
            TypeHelper typeHelper11 = DivTextJsonParser.TYPE_HELPER_TEXT_ALIGNMENT_VERTICAL;
            Expression expression14 = DivTextJsonParser.TEXT_ALIGNMENT_VERTICAL_DEFAULT_VALUE;
            Expression readOptionalExpression24 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_alignment_vertical", typeHelper11, function12, expression14);
            Expression expression15 = readOptionalExpression24 == null ? expression14 : readOptionalExpression24;
            Expression expression16 = DivTextJsonParser.TEXT_COLOR_DEFAULT_VALUE;
            Expression readOptionalExpression25 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_color", typeHelper6, function16, expression16);
            Expression expression17 = readOptionalExpression25 == null ? expression16 : readOptionalExpression25;
            DivTextGradient divTextGradient = (DivTextGradient) JsonPropertyParser.readOptional(parsingContext, jSONObject, "text_gradient", this.component.getDivTextGradientJsonEntityParser());
            DivShadow divShadow = (DivShadow) JsonPropertyParser.readOptional(parsingContext, jSONObject, "text_shadow", this.component.getDivShadowJsonEntityParser());
            Expression expression18 = DivTextJsonParser.TIGHTEN_WIDTH_DEFAULT_VALUE;
            Expression readOptionalExpression26 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "tighten_width", typeHelper4, function14, expression18);
            Expression expression19 = readOptionalExpression26 == null ? expression18 : readOptionalExpression26;
            List readOptionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.component.getDivTooltipJsonEntityParser());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.component.getDivTransformJsonEntityParser());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.component.getDivChangeTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.component.getDivAppearanceTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.component.getDivAppearanceTransitionJsonEntityParser());
            List readOptionalList17 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivTextJsonParser.TRANSITION_TRIGGERS_VALIDATOR);
            TypeHelper typeHelper12 = DivTextJsonParser.TYPE_HELPER_TRUNCATE;
            Function1 function19 = DivText.Truncate.FROM_STRING;
            Expression expression20 = DivTextJsonParser.TRUNCATE_DEFAULT_VALUE;
            Expression readOptionalExpression27 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "truncate", typeHelper12, function19, expression20);
            Expression expression21 = readOptionalExpression27 == null ? expression20 : readOptionalExpression27;
            TypeHelper typeHelper13 = DivTextJsonParser.TYPE_HELPER_UNDERLINE;
            Expression expression22 = DivTextJsonParser.UNDERLINE_DEFAULT_VALUE;
            Expression readOptionalExpression28 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "underline", typeHelper13, function18, expression22);
            Expression expression23 = readOptionalExpression28 == null ? expression22 : readOptionalExpression28;
            List readOptionalList18 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.component.getDivTriggerJsonEntityParser());
            List readOptionalList19 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.component.getDivVariableJsonEntityParser());
            TypeHelper typeHelper14 = DivTextJsonParser.TYPE_HELPER_VISIBILITY;
            Function1 function110 = DivVisibility.FROM_STRING;
            Expression expression24 = DivTextJsonParser.VISIBILITY_DEFAULT_VALUE;
            Expression readOptionalExpression29 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, typeHelper14, function110, expression24);
            Expression expression25 = readOptionalExpression29 == null ? expression24 : readOptionalExpression29;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.component.getDivVisibilityActionJsonEntityParser());
            List readOptionalList20 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.component.getDivVisibilityActionJsonEntityParser());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.component.getDivSizeJsonEntityParser());
            if (divSize3 == null) {
                divSize3 = DivTextJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivText(divAccessibility, divAction, divAnimation2, readOptionalList, readOptionalExpression, readOptionalExpression2, expression, readOptionalList2, readOptionalExpression4, readOptionalList3, divBorder, expression2, readOptionalExpression6, readOptionalList4, readOptionalList5, ellipsis, readOptionalList6, divFocus, readOptionalExpression7, readOptionalExpression8, readOptionalExpression9, expression3, expression5, readOptionalExpression12, readOptionalExpression13, readOptionalExpression14, readOptionalList7, divSize2, readOptionalList8, readOptionalList9, str, readOptionalList10, divLayoutProvider, expression7, readOptionalExpression16, readOptionalList11, divEdgeInsets, readOptionalExpression17, readOptionalExpression18, divEdgeInsets2, readOptionalList12, readOptionalList13, readOptionalList14, readOptionalExpression19, readOptionalExpression20, expression9, readOptionalList15, expression11, readExpression, expression13, expression15, expression17, divTextGradient, divShadow, expression19, readOptionalList16, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, readOptionalList17, expression21, expression23, readOptionalList18, readOptionalList19, expression25, divVisibilityAction, readOptionalList20, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivText divText) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divText.getAccessibility(), this.component.getDivAccessibilityJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "action", divText.action, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "action_animation", divText.actionAnimation, this.component.getDivAnimationJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", divText.actions, this.component.getDivActionJsonEntityParser());
            Expression alignmentHorizontal = divText.getAlignmentHorizontal();
            Function1 function1 = DivAlignmentHorizontal.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", alignmentHorizontal, function1);
            Expression alignmentVertical = divText.getAlignmentVertical();
            Function1 function12 = DivAlignmentVertical.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", alignmentVertical, function12);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divText.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divText.getAnimators(), this.component.getDivAnimatorJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "auto_ellipsize", divText.autoEllipsize);
            JsonPropertyParser.writeList(parsingContext, jSONObject, M2.g, divText.getBackground(), this.component.getDivBackgroundJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divText.getBorder(), this.component.getDivBorderJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "capture_focus_on_action", divText.captureFocusOnAction);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divText.getColumnSpan());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divText.getDisappearActions(), this.component.getDivDisappearActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "doubletap_actions", divText.doubletapActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "ellipsis", divText.ellipsis, this.component.getDivTextEllipsisJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divText.getExtensions(), this.component.getDivExtensionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divText.getFocus(), this.component.getDivFocusJsonEntityParser());
            Expression expression = divText.focusedTextColor;
            Function1 function13 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "focused_text_color", expression, function13);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_family", divText.fontFamily);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_feature_settings", divText.fontFeatureSettings);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, ViewHierarchyConstants.TEXT_SIZE, divText.fontSize);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size_unit", divText.fontSizeUnit, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_variation_settings", divText.fontVariationSettings);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight", divText.fontWeight, DivFontWeight.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight_value", divText.fontWeightValue);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divText.getFunctions(), this.component.getDivFunctionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divText.getHeight(), this.component.getDivSizeJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_end_actions", divText.hoverEndActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_start_actions", divText.hoverStartActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divText.getId());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "images", divText.images, this.component.getDivTextImageJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divText.getLayoutProvider(), this.component.getDivLayoutProviderJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "letter_spacing", divText.letterSpacing);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "line_height", divText.lineHeight);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "longtap_actions", divText.longtapActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divText.getMargins(), this.component.getDivEdgeInsetsJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "max_lines", divText.maxLines);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "min_hidden_lines", divText.minHiddenLines);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divText.getPaddings(), this.component.getDivEdgeInsetsJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_end_actions", divText.pressEndActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_start_actions", divText.pressStartActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "ranges", divText.ranges, this.component.getDivTextRangeJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divText.getReuseId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divText.getRowSpan());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "selectable", divText.selectable);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divText.getSelectedActions(), this.component.getDivActionJsonEntityParser());
            Expression expression2 = divText.strike;
            Function1 function14 = DivLineStyle.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "strike", expression2, function14);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text", divText.text);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_alignment_horizontal", divText.textAlignmentHorizontal, function1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_alignment_vertical", divText.textAlignmentVertical, function12);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_color", divText.textColor, function13);
            JsonPropertyParser.write(parsingContext, jSONObject, "text_gradient", divText.textGradient, this.component.getDivTextGradientJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "text_shadow", divText.textShadow, this.component.getDivShadowJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "tighten_width", divText.tightenWidth);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divText.getTooltips(), this.component.getDivTooltipJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divText.getTransform(), this.component.getDivTransformJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divText.getTransitionChange(), this.component.getDivChangeTransitionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divText.getTransitionIn(), this.component.getDivAppearanceTransitionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divText.getTransitionOut(), this.component.getDivAppearanceTransitionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divText.getTransitionTriggers(), DivTransitionTrigger.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "truncate", divText.truncate, DivText.Truncate.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "text");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "underline", divText.underline, function14);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divText.getVariableTriggers(), this.component.getDivTriggerJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divText.getVariables(), this.component.getDivVariableJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, divText.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divText.getVisibilityAction(), this.component.getDivVisibilityActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divText.getVisibilityActions(), this.component.getDivVisibilityActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divText.getWidth(), this.component.getDivSizeJsonEntityParser());
            return jSONObject;
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivTextTemplate deserialize(ParsingContext parsingContext, DivTextTemplate divTextTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.accessibility : null, this.component.getDivAccessibilityJsonTemplateParser());
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "action", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.action : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.actionAnimation : null, this.component.getDivAnimationJsonTemplateParser());
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.actions : null, this.component.getDivActionJsonTemplateParser());
            TypeHelper typeHelper = DivTextJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL;
            Field field = divTextTemplate != null ? divTextTemplate.alignmentHorizontal : null;
            Function1 function1 = DivAlignmentHorizontal.FROM_STRING;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_horizontal", typeHelper, allowPropertyOverride, field, function1);
            TypeHelper typeHelper2 = DivTextJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL;
            Field field2 = divTextTemplate != null ? divTextTemplate.alignmentVertical : null;
            Function1 function12 = DivAlignmentVertical.FROM_STRING;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", typeHelper2, allowPropertyOverride, field2, function12);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field field3 = divTextTemplate != null ? divTextTemplate.alpha : null;
            Function1 function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", typeHelper3, allowPropertyOverride, field3, function13, DivTextJsonParser.ALPHA_VALIDATOR);
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.animators : null, this.component.getDivAnimatorJsonTemplateParser());
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field4 = divTextTemplate != null ? divTextTemplate.autoEllipsize : null;
            Function1 function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "auto_ellipsize", typeHelper4, allowPropertyOverride, field4, function14);
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, M2.g, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.background : null, this.component.getDivBackgroundJsonTemplateParser());
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.border : null, this.component.getDivBorderJsonTemplateParser());
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "capture_focus_on_action", typeHelper4, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.captureFocusOnAction : null, function14);
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            Field field5 = divTextTemplate != null ? divTextTemplate.columnSpan : null;
            Function1 function15 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_span", typeHelper5, allowPropertyOverride, field5, function15, DivTextJsonParser.COLUMN_SPAN_VALIDATOR);
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.disappearActions : null, this.component.getDivDisappearActionJsonTemplateParser());
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.doubletapActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "ellipsis", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.ellipsis : null, this.component.getDivTextEllipsisJsonTemplateParser());
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.extensions : null, this.component.getDivExtensionJsonTemplateParser());
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.focus : null, this.component.getDivFocusJsonTemplateParser());
            TypeHelper<Integer> typeHelper6 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field field6 = divTextTemplate != null ? divTextTemplate.focusedTextColor : null;
            Function1 function16 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "focused_text_color", typeHelper6, allowPropertyOverride, field6, function16);
            TypeHelper<String> typeHelper7 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_family", typeHelper7, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.fontFamily : null);
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_feature_settings", typeHelper7, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.fontFeatureSettings : null);
            Field readOptionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, ViewHierarchyConstants.TEXT_SIZE, typeHelper5, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.fontSize : null, function15, DivTextJsonParser.FONT_SIZE_VALIDATOR);
            Field readOptionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_size_unit", DivTextJsonParser.TYPE_HELPER_FONT_SIZE_UNIT, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.fontSizeUnit : null, DivSizeUnit.FROM_STRING);
            Field readOptionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.fontVariationSettings : null);
            Field readOptionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_weight", DivTextJsonParser.TYPE_HELPER_FONT_WEIGHT, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.fontWeight : null, DivFontWeight.FROM_STRING);
            Field readOptionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_weight_value", typeHelper5, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.fontWeightValue : null, function15, DivTextJsonParser.FONT_WEIGHT_VALUE_VALIDATOR);
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.functions : null, this.component.getDivFunctionJsonTemplateParser());
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.height : null, this.component.getDivSizeJsonTemplateParser());
            Field readOptionalListField8 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.hoverEndActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalListField9 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.hoverStartActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.id : null);
            Field readOptionalListField10 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "images", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.images : null, this.component.getDivTextImageJsonTemplateParser());
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.layoutProvider : null, this.component.getDivLayoutProviderJsonTemplateParser());
            Field readOptionalFieldWithExpression15 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "letter_spacing", typeHelper3, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.letterSpacing : null, function13);
            Field readOptionalFieldWithExpression16 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "line_height", typeHelper5, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.lineHeight : null, function15, DivTextJsonParser.LINE_HEIGHT_VALIDATOR);
            Field readOptionalListField11 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.longtapActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.margins : null, this.component.getDivEdgeInsetsJsonTemplateParser());
            Field readOptionalFieldWithExpression17 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "max_lines", typeHelper5, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.maxLines : null, function15, DivTextJsonParser.MAX_LINES_VALIDATOR);
            Field readOptionalFieldWithExpression18 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "min_hidden_lines", typeHelper5, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.minHiddenLines : null, function15, DivTextJsonParser.MIN_HIDDEN_LINES_VALIDATOR);
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.paddings : null, this.component.getDivEdgeInsetsJsonTemplateParser());
            Field readOptionalListField12 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.pressEndActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalListField13 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.pressStartActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalListField14 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "ranges", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.ranges : null, this.component.getDivTextRangeJsonTemplateParser());
            Field readOptionalFieldWithExpression19 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reuse_id", typeHelper7, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.reuseId : null);
            Field readOptionalFieldWithExpression20 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "row_span", typeHelper5, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.rowSpan : null, function15, DivTextJsonParser.ROW_SPAN_VALIDATOR);
            Field readOptionalFieldWithExpression21 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "selectable", typeHelper4, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.selectable : null, function14);
            Field readOptionalListField15 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.selectedActions : null, this.component.getDivActionJsonTemplateParser());
            TypeHelper typeHelper8 = DivTextJsonParser.TYPE_HELPER_STRIKE;
            Field field7 = divTextTemplate != null ? divTextTemplate.strike : null;
            Function1 function17 = DivLineStyle.FROM_STRING;
            Field readOptionalFieldWithExpression22 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "strike", typeHelper8, allowPropertyOverride, field7, function17);
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "text", typeHelper7, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.text : null);
            Field readOptionalFieldWithExpression23 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "text_alignment_horizontal", DivTextJsonParser.TYPE_HELPER_TEXT_ALIGNMENT_HORIZONTAL, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.textAlignmentHorizontal : null, function1);
            Field readOptionalFieldWithExpression24 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "text_alignment_vertical", DivTextJsonParser.TYPE_HELPER_TEXT_ALIGNMENT_VERTICAL, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.textAlignmentVertical : null, function12);
            Field readOptionalFieldWithExpression25 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "text_color", typeHelper6, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.textColor : null, function16);
            Field readOptionalField12 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "text_gradient", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.textGradient : null, this.component.getDivTextGradientJsonTemplateParser());
            Field readOptionalField13 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "text_shadow", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.textShadow : null, this.component.getDivShadowJsonTemplateParser());
            Field readOptionalFieldWithExpression26 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "tighten_width", typeHelper4, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.tightenWidth : null, function14);
            Field readOptionalListField16 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.tooltips : null, this.component.getDivTooltipJsonTemplateParser());
            Field readOptionalField14 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.transform : null, this.component.getDivTransformJsonTemplateParser());
            Field readOptionalField15 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.transitionChange : null, this.component.getDivChangeTransitionJsonTemplateParser());
            Field readOptionalField16 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.transitionIn : null, this.component.getDivAppearanceTransitionJsonTemplateParser());
            Field readOptionalField17 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.transitionOut : null, this.component.getDivAppearanceTransitionJsonTemplateParser());
            Field field8 = divTextTemplate != null ? divTextTemplate.transitionTriggers : null;
            Function1 function18 = DivTransitionTrigger.FROM_STRING;
            ListValidator listValidator = DivTextJsonParser.TRANSITION_TRIGGERS_VALIDATOR;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivTextTemplate(readOptionalField, readOptionalField2, readOptionalField3, readOptionalListField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField2, readOptionalFieldWithExpression4, readOptionalListField3, readOptionalField4, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalListField4, readOptionalListField5, readOptionalField5, readOptionalListField6, readOptionalField6, readOptionalFieldWithExpression7, readOptionalFieldWithExpression8, readOptionalFieldWithExpression9, readOptionalFieldWithExpression10, readOptionalFieldWithExpression11, readOptionalFieldWithExpression12, readOptionalFieldWithExpression13, readOptionalFieldWithExpression14, readOptionalListField7, readOptionalField7, readOptionalListField8, readOptionalListField9, readOptionalField8, readOptionalListField10, readOptionalField9, readOptionalFieldWithExpression15, readOptionalFieldWithExpression16, readOptionalListField11, readOptionalField10, readOptionalFieldWithExpression17, readOptionalFieldWithExpression18, readOptionalField11, readOptionalListField12, readOptionalListField13, readOptionalListField14, readOptionalFieldWithExpression19, readOptionalFieldWithExpression20, readOptionalFieldWithExpression21, readOptionalListField15, readOptionalFieldWithExpression22, readFieldWithExpression, readOptionalFieldWithExpression23, readOptionalFieldWithExpression24, readOptionalFieldWithExpression25, readOptionalField12, readOptionalField13, readOptionalFieldWithExpression26, readOptionalListField16, readOptionalField14, readOptionalField15, readOptionalField16, readOptionalField17, JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field8, function18, listValidator), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "truncate", DivTextJsonParser.TYPE_HELPER_TRUNCATE, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.truncate : null, DivText.Truncate.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "underline", DivTextJsonParser.TYPE_HELPER_UNDERLINE, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.underline : null, function17), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.variableTriggers : null, this.component.getDivTriggerJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.variables : null, this.component.getDivVariableJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, DivTextJsonParser.TYPE_HELPER_VISIBILITY, allowPropertyOverride, divTextTemplate != null ? divTextTemplate.visibility : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.visibilityAction : null, this.component.getDivVisibilityActionJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.visibilityActions : null, this.component.getDivVisibilityActionJsonTemplateParser()), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divTextTemplate != null ? divTextTemplate.width : null, this.component.getDivSizeJsonTemplateParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivTextTemplate divTextTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divTextTemplate.accessibility, this.component.getDivAccessibilityJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action", divTextTemplate.action, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action_animation", divTextTemplate.actionAnimation, this.component.getDivAnimationJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", divTextTemplate.actions, this.component.getDivActionJsonTemplateParser());
            Field field = divTextTemplate.alignmentHorizontal;
            Function1 function1 = DivAlignmentHorizontal.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", field, function1);
            Field field2 = divTextTemplate.alignmentVertical;
            Function1 function12 = DivAlignmentVertical.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", field2, function12);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divTextTemplate.alpha);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divTextTemplate.animators, this.component.getDivAnimatorJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "auto_ellipsize", divTextTemplate.autoEllipsize);
            JsonFieldParser.writeListField(parsingContext, jSONObject, M2.g, divTextTemplate.background, this.component.getDivBackgroundJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", divTextTemplate.border, this.component.getDivBorderJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "capture_focus_on_action", divTextTemplate.captureFocusOnAction);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divTextTemplate.columnSpan);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divTextTemplate.disappearActions, this.component.getDivDisappearActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "doubletap_actions", divTextTemplate.doubletapActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "ellipsis", divTextTemplate.ellipsis, this.component.getDivTextEllipsisJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divTextTemplate.extensions, this.component.getDivExtensionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divTextTemplate.focus, this.component.getDivFocusJsonTemplateParser());
            Field field3 = divTextTemplate.focusedTextColor;
            Function1 function13 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "focused_text_color", field3, function13);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_family", divTextTemplate.fontFamily);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_feature_settings", divTextTemplate.fontFeatureSettings);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, ViewHierarchyConstants.TEXT_SIZE, divTextTemplate.fontSize);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size_unit", divTextTemplate.fontSizeUnit, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_variation_settings", divTextTemplate.fontVariationSettings);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight", divTextTemplate.fontWeight, DivFontWeight.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight_value", divTextTemplate.fontWeightValue);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divTextTemplate.functions, this.component.getDivFunctionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divTextTemplate.height, this.component.getDivSizeJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_end_actions", divTextTemplate.hoverEndActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_start_actions", divTextTemplate.hoverStartActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divTextTemplate.id);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "images", divTextTemplate.images, this.component.getDivTextImageJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divTextTemplate.layoutProvider, this.component.getDivLayoutProviderJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "letter_spacing", divTextTemplate.letterSpacing);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "line_height", divTextTemplate.lineHeight);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "longtap_actions", divTextTemplate.longtapActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divTextTemplate.margins, this.component.getDivEdgeInsetsJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "max_lines", divTextTemplate.maxLines);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "min_hidden_lines", divTextTemplate.minHiddenLines);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divTextTemplate.paddings, this.component.getDivEdgeInsetsJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_end_actions", divTextTemplate.pressEndActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_start_actions", divTextTemplate.pressStartActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "ranges", divTextTemplate.ranges, this.component.getDivTextRangeJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divTextTemplate.reuseId);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divTextTemplate.rowSpan);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "selectable", divTextTemplate.selectable);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divTextTemplate.selectedActions, this.component.getDivActionJsonTemplateParser());
            Field field4 = divTextTemplate.strike;
            Function1 function14 = DivLineStyle.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "strike", field4, function14);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text", divTextTemplate.text);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_alignment_horizontal", divTextTemplate.textAlignmentHorizontal, function1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_alignment_vertical", divTextTemplate.textAlignmentVertical, function12);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_color", divTextTemplate.textColor, function13);
            JsonFieldParser.writeField(parsingContext, jSONObject, "text_gradient", divTextTemplate.textGradient, this.component.getDivTextGradientJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "text_shadow", divTextTemplate.textShadow, this.component.getDivShadowJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "tighten_width", divTextTemplate.tightenWidth);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divTextTemplate.tooltips, this.component.getDivTooltipJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divTextTemplate.transform, this.component.getDivTransformJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divTextTemplate.transitionChange, this.component.getDivChangeTransitionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divTextTemplate.transitionIn, this.component.getDivAppearanceTransitionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divTextTemplate.transitionOut, this.component.getDivAppearanceTransitionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divTextTemplate.transitionTriggers, DivTransitionTrigger.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "truncate", divTextTemplate.truncate, DivText.Truncate.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "text");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "underline", divTextTemplate.underline, function14);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divTextTemplate.variableTriggers, this.component.getDivTriggerJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divTextTemplate.variables, this.component.getDivVariableJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, divTextTemplate.visibility, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divTextTemplate.visibilityAction, this.component.getDivVisibilityActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divTextTemplate.visibilityActions, this.component.getDivVisibilityActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divTextTemplate.width, this.component.getDivSizeJsonTemplateParser());
            return jSONObject;
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivText resolve(ParsingContext parsingContext, DivTextTemplate divTextTemplate, JSONObject jSONObject) {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.accessibility, jSONObject, "accessibility", this.component.getDivAccessibilityJsonTemplateResolver(), this.component.getDivAccessibilityJsonEntityParser());
            DivAction divAction = (DivAction) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.action, jSONObject, "action", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            DivAnimation divAnimation = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.actionAnimation, jSONObject, "action_animation", this.component.getDivAnimationJsonTemplateResolver(), this.component.getDivAnimationJsonEntityParser());
            if (divAnimation == null) {
                divAnimation = DivTextJsonParser.ACTION_ANIMATION_DEFAULT_VALUE;
            }
            DivAnimation divAnimation2 = divAnimation;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.actions, jSONObject, "actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            Field field = divTextTemplate.alignmentHorizontal;
            TypeHelper typeHelper = DivTextJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL;
            Function1 function1 = DivAlignmentHorizontal.FROM_STRING;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alignment_horizontal", typeHelper, function1);
            Field field2 = divTextTemplate.alignmentVertical;
            TypeHelper typeHelper2 = DivTextJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL;
            Function1 function12 = DivAlignmentVertical.FROM_STRING;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alignment_vertical", typeHelper2, function12);
            Field field3 = divTextTemplate.alpha;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivTextJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivTextJsonParser.ALPHA_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alpha", typeHelper3, function13, valueValidator, expression);
            if (resolveOptionalExpression3 != null) {
                expression = resolveOptionalExpression3;
            }
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.animators, jSONObject, "animators", this.component.getDivAnimatorJsonTemplateResolver(), this.component.getDivAnimatorJsonEntityParser());
            Field field4 = divTextTemplate.autoEllipsize;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "auto_ellipsize", typeHelper4, function14);
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.background, jSONObject, M2.g, this.component.getDivBackgroundJsonTemplateResolver(), this.component.getDivBackgroundJsonEntityParser());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.border, jSONObject, "border", this.component.getDivBorderJsonTemplateResolver(), this.component.getDivBorderJsonEntityParser());
            Field field5 = divTextTemplate.captureFocusOnAction;
            Expression expression2 = DivTextJsonParser.CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "capture_focus_on_action", typeHelper4, function14, expression2);
            Expression expression3 = resolveOptionalExpression5 == null ? expression2 : resolveOptionalExpression5;
            Field field6 = divTextTemplate.columnSpan;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function15 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "column_span", typeHelper5, function15, DivTextJsonParser.COLUMN_SPAN_VALIDATOR);
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.disappearActions, jSONObject, "disappear_actions", this.component.getDivDisappearActionJsonTemplateResolver(), this.component.getDivDisappearActionJsonEntityParser());
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.doubletapActions, jSONObject, "doubletap_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            DivText.Ellipsis ellipsis = (DivText.Ellipsis) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.ellipsis, jSONObject, "ellipsis", this.component.getDivTextEllipsisJsonTemplateResolver(), this.component.getDivTextEllipsisJsonEntityParser());
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.extensions, jSONObject, "extensions", this.component.getDivExtensionJsonTemplateResolver(), this.component.getDivExtensionJsonEntityParser());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.focus, jSONObject, "focus", this.component.getDivFocusJsonTemplateResolver(), this.component.getDivFocusJsonEntityParser());
            Field field7 = divTextTemplate.focusedTextColor;
            TypeHelper<Integer> typeHelper6 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1 function16 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "focused_text_color", typeHelper6, function16);
            Field field8 = divTextTemplate.fontFamily;
            TypeHelper<String> typeHelper7 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "font_family", typeHelper7);
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTextTemplate.fontFeatureSettings, jSONObject, "font_feature_settings", typeHelper7);
            Field field9 = divTextTemplate.fontSize;
            ValueValidator valueValidator2 = DivTextJsonParser.FONT_SIZE_VALIDATOR;
            Expression expression4 = DivTextJsonParser.FONT_SIZE_DEFAULT_VALUE;
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, ViewHierarchyConstants.TEXT_SIZE, typeHelper5, function15, valueValidator2, expression4);
            if (resolveOptionalExpression10 != null) {
                expression4 = resolveOptionalExpression10;
            }
            Field field10 = divTextTemplate.fontSizeUnit;
            TypeHelper typeHelper8 = DivTextJsonParser.TYPE_HELPER_FONT_SIZE_UNIT;
            Function1 function17 = DivSizeUnit.FROM_STRING;
            Expression expression5 = DivTextJsonParser.FONT_SIZE_UNIT_DEFAULT_VALUE;
            Expression resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "font_size_unit", typeHelper8, function17, expression5);
            Expression expression6 = resolveOptionalExpression11 == null ? expression5 : resolveOptionalExpression11;
            Expression resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTextTemplate.fontVariationSettings, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
            Expression resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTextTemplate.fontWeight, jSONObject, "font_weight", DivTextJsonParser.TYPE_HELPER_FONT_WEIGHT, DivFontWeight.FROM_STRING);
            Expression resolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTextTemplate.fontWeightValue, jSONObject, "font_weight_value", typeHelper5, function15, DivTextJsonParser.FONT_WEIGHT_VALUE_VALIDATOR);
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.functions, jSONObject, "functions", this.component.getDivFunctionJsonTemplateResolver(), this.component.getDivFunctionJsonEntityParser());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.height, jSONObject, "height", this.component.getDivSizeJsonTemplateResolver(), this.component.getDivSizeJsonEntityParser());
            if (divSize == null) {
                divSize = DivTextJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            DivSize divSize2 = divSize;
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.hoverEndActions, jSONObject, "hover_end_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.hoverStartActions, jSONObject, "hover_start_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.id, jSONObject, "id");
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.images, jSONObject, "images", this.component.getDivTextImageJsonTemplateResolver(), this.component.getDivTextImageJsonEntityParser());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.layoutProvider, jSONObject, "layout_provider", this.component.getDivLayoutProviderJsonTemplateResolver(), this.component.getDivLayoutProviderJsonEntityParser());
            Field field11 = divTextTemplate.letterSpacing;
            Expression expression7 = DivTextJsonParser.LETTER_SPACING_DEFAULT_VALUE;
            Expression resolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field11, jSONObject, "letter_spacing", typeHelper3, function13, expression7);
            Expression expression8 = resolveOptionalExpression15 == null ? expression7 : resolveOptionalExpression15;
            Expression resolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTextTemplate.lineHeight, jSONObject, "line_height", typeHelper5, function15, DivTextJsonParser.LINE_HEIGHT_VALIDATOR);
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.longtapActions, jSONObject, "longtap_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.margins, jSONObject, "margins", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            Expression resolveOptionalExpression17 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTextTemplate.maxLines, jSONObject, "max_lines", typeHelper5, function15, DivTextJsonParser.MAX_LINES_VALIDATOR);
            Expression resolveOptionalExpression18 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTextTemplate.minHiddenLines, jSONObject, "min_hidden_lines", typeHelper5, function15, DivTextJsonParser.MIN_HIDDEN_LINES_VALIDATOR);
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.paddings, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.pressEndActions, jSONObject, "press_end_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            List resolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.pressStartActions, jSONObject, "press_start_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            List resolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.ranges, jSONObject, "ranges", this.component.getDivTextRangeJsonTemplateResolver(), this.component.getDivTextRangeJsonEntityParser());
            Expression resolveOptionalExpression19 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTextTemplate.reuseId, jSONObject, "reuse_id", typeHelper7);
            Expression resolveOptionalExpression20 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTextTemplate.rowSpan, jSONObject, "row_span", typeHelper5, function15, DivTextJsonParser.ROW_SPAN_VALIDATOR);
            Field field12 = divTextTemplate.selectable;
            Expression expression9 = DivTextJsonParser.SELECTABLE_DEFAULT_VALUE;
            Expression resolveOptionalExpression21 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field12, jSONObject, "selectable", typeHelper4, function14, expression9);
            Expression expression10 = resolveOptionalExpression21 == null ? expression9 : resolveOptionalExpression21;
            List resolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.selectedActions, jSONObject, "selected_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            Field field13 = divTextTemplate.strike;
            TypeHelper typeHelper9 = DivTextJsonParser.TYPE_HELPER_STRIKE;
            Function1 function18 = DivLineStyle.FROM_STRING;
            Expression expression11 = DivTextJsonParser.STRIKE_DEFAULT_VALUE;
            Expression resolveOptionalExpression22 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field13, jSONObject, "strike", typeHelper9, function18, expression11);
            Expression expression12 = resolveOptionalExpression22 == null ? expression11 : resolveOptionalExpression22;
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divTextTemplate.text, jSONObject, "text", typeHelper7);
            Field field14 = divTextTemplate.textAlignmentHorizontal;
            TypeHelper typeHelper10 = DivTextJsonParser.TYPE_HELPER_TEXT_ALIGNMENT_HORIZONTAL;
            Expression expression13 = DivTextJsonParser.TEXT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE;
            Expression resolveOptionalExpression23 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field14, jSONObject, "text_alignment_horizontal", typeHelper10, function1, expression13);
            Expression expression14 = resolveOptionalExpression23 == null ? expression13 : resolveOptionalExpression23;
            Field field15 = divTextTemplate.textAlignmentVertical;
            TypeHelper typeHelper11 = DivTextJsonParser.TYPE_HELPER_TEXT_ALIGNMENT_VERTICAL;
            Expression expression15 = DivTextJsonParser.TEXT_ALIGNMENT_VERTICAL_DEFAULT_VALUE;
            Expression resolveOptionalExpression24 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field15, jSONObject, "text_alignment_vertical", typeHelper11, function12, expression15);
            Expression expression16 = resolveOptionalExpression24 == null ? expression15 : resolveOptionalExpression24;
            Field field16 = divTextTemplate.textColor;
            Expression expression17 = DivTextJsonParser.TEXT_COLOR_DEFAULT_VALUE;
            Expression resolveOptionalExpression25 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field16, jSONObject, "text_color", typeHelper6, function16, expression17);
            Expression expression18 = resolveOptionalExpression25 == null ? expression17 : resolveOptionalExpression25;
            DivTextGradient divTextGradient = (DivTextGradient) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.textGradient, jSONObject, "text_gradient", this.component.getDivTextGradientJsonTemplateResolver(), this.component.getDivTextGradientJsonEntityParser());
            DivShadow divShadow = (DivShadow) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.textShadow, jSONObject, "text_shadow", this.component.getDivShadowJsonTemplateResolver(), this.component.getDivShadowJsonEntityParser());
            Field field17 = divTextTemplate.tightenWidth;
            Expression expression19 = DivTextJsonParser.TIGHTEN_WIDTH_DEFAULT_VALUE;
            Expression resolveOptionalExpression26 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field17, jSONObject, "tighten_width", typeHelper4, function14, expression19);
            Expression expression20 = resolveOptionalExpression26 == null ? expression19 : resolveOptionalExpression26;
            List resolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.tooltips, jSONObject, "tooltips", this.component.getDivTooltipJsonTemplateResolver(), this.component.getDivTooltipJsonEntityParser());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.transform, jSONObject, "transform", this.component.getDivTransformJsonTemplateResolver(), this.component.getDivTransformJsonEntityParser());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.transitionChange, jSONObject, "transition_change", this.component.getDivChangeTransitionJsonTemplateResolver(), this.component.getDivChangeTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.transitionIn, jSONObject, "transition_in", this.component.getDivAppearanceTransitionJsonTemplateResolver(), this.component.getDivAppearanceTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.transitionOut, jSONObject, "transition_out", this.component.getDivAppearanceTransitionJsonTemplateResolver(), this.component.getDivAppearanceTransitionJsonEntityParser());
            List resolveOptionalList17 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.transitionTriggers, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivTextJsonParser.TRANSITION_TRIGGERS_VALIDATOR);
            Field field18 = divTextTemplate.truncate;
            TypeHelper typeHelper12 = DivTextJsonParser.TYPE_HELPER_TRUNCATE;
            Function1 function19 = DivText.Truncate.FROM_STRING;
            Expression expression21 = DivTextJsonParser.TRUNCATE_DEFAULT_VALUE;
            Expression resolveOptionalExpression27 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field18, jSONObject, "truncate", typeHelper12, function19, expression21);
            Expression expression22 = resolveOptionalExpression27 == null ? expression21 : resolveOptionalExpression27;
            Field field19 = divTextTemplate.underline;
            TypeHelper typeHelper13 = DivTextJsonParser.TYPE_HELPER_UNDERLINE;
            Expression expression23 = DivTextJsonParser.UNDERLINE_DEFAULT_VALUE;
            Expression resolveOptionalExpression28 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field19, jSONObject, "underline", typeHelper13, function18, expression23);
            Expression expression24 = resolveOptionalExpression28 == null ? expression23 : resolveOptionalExpression28;
            List resolveOptionalList18 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.variableTriggers, jSONObject, "variable_triggers", this.component.getDivTriggerJsonTemplateResolver(), this.component.getDivTriggerJsonEntityParser());
            List resolveOptionalList19 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.variables, jSONObject, "variables", this.component.getDivVariableJsonTemplateResolver(), this.component.getDivVariableJsonEntityParser());
            Field field20 = divTextTemplate.visibility;
            TypeHelper typeHelper14 = DivTextJsonParser.TYPE_HELPER_VISIBILITY;
            Function1 function110 = DivVisibility.FROM_STRING;
            Expression expression25 = DivTextJsonParser.VISIBILITY_DEFAULT_VALUE;
            Expression resolveOptionalExpression29 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field20, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, typeHelper14, function110, expression25);
            Expression expression26 = resolveOptionalExpression29 == null ? expression25 : resolveOptionalExpression29;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.visibilityAction, jSONObject, "visibility_action", this.component.getDivVisibilityActionJsonTemplateResolver(), this.component.getDivVisibilityActionJsonEntityParser());
            List resolveOptionalList20 = JsonFieldResolver.resolveOptionalList(parsingContext, divTextTemplate.visibilityActions, jSONObject, "visibility_actions", this.component.getDivVisibilityActionJsonTemplateResolver(), this.component.getDivVisibilityActionJsonEntityParser());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divTextTemplate.width, jSONObject, "width", this.component.getDivSizeJsonTemplateResolver(), this.component.getDivSizeJsonEntityParser());
            if (divSize3 == null) {
                divSize3 = DivTextJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivText(divAccessibility, divAction, divAnimation2, resolveOptionalList, resolveOptionalExpression, resolveOptionalExpression2, expression, resolveOptionalList2, resolveOptionalExpression4, resolveOptionalList3, divBorder, expression3, resolveOptionalExpression6, resolveOptionalList4, resolveOptionalList5, ellipsis, resolveOptionalList6, divFocus, resolveOptionalExpression7, resolveOptionalExpression8, resolveOptionalExpression9, expression4, expression6, resolveOptionalExpression12, resolveOptionalExpression13, resolveOptionalExpression14, resolveOptionalList7, divSize2, resolveOptionalList8, resolveOptionalList9, str, resolveOptionalList10, divLayoutProvider, expression8, resolveOptionalExpression16, resolveOptionalList11, divEdgeInsets, resolveOptionalExpression17, resolveOptionalExpression18, divEdgeInsets2, resolveOptionalList12, resolveOptionalList13, resolveOptionalList14, resolveOptionalExpression19, resolveOptionalExpression20, expression10, resolveOptionalList15, expression12, resolveExpression, expression14, expression16, expression18, divTextGradient, divShadow, expression20, resolveOptionalList16, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, resolveOptionalList17, expression22, expression24, resolveOptionalList18, resolveOptionalList19, expression26, divVisibilityAction, resolveOptionalList20, divSize3);
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        Expression constant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression constant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression constant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double valueOf = Double.valueOf(1.0d);
        ACTION_ANIMATION_DEFAULT_VALUE = new DivAnimation(constant$default, constant$default2, null, null, constant$default3, null, null, Expression.Companion.constant$default(companion, valueOf, null, 2, null), 108, null);
        ALPHA_DEFAULT_VALUE = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        FONT_SIZE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        DivSizeUnit divSizeUnit = DivSizeUnit.SP;
        FONT_SIZE_UNIT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7, null));
        LETTER_SPACING_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        SELECTABLE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        DivLineStyle divLineStyle = DivLineStyle.NONE;
        STRIKE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divLineStyle, null, 2, null);
        DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.START;
        TEXT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divAlignmentHorizontal, null, 2, null);
        DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.TOP;
        TEXT_ALIGNMENT_VERTICAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divAlignmentVertical, null, 2, null);
        TEXT_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, -16777216, null, 2, null);
        TIGHTEN_WIDTH_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        DivText.Truncate truncate = DivText.Truncate.END;
        TRUNCATE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, truncate, null, 2, null);
        UNDERLINE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divLineStyle, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        TYPE_HELPER_ALIGNMENT_HORIZONTAL = companion2.from(ArraysKt.first(DivAlignmentHorizontal.values()), new Function1() { // from class: com.yandex.div2.DivTextJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        TYPE_HELPER_ALIGNMENT_VERTICAL = companion2.from(ArraysKt.first(DivAlignmentVertical.values()), new Function1() { // from class: com.yandex.div2.DivTextJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        TYPE_HELPER_FONT_SIZE_UNIT = companion2.from(divSizeUnit, new Function1() { // from class: com.yandex.div2.DivTextJsonParser$Companion$TYPE_HELPER_FONT_SIZE_UNIT$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
        TYPE_HELPER_FONT_WEIGHT = companion2.from(ArraysKt.first(DivFontWeight.values()), new Function1() { // from class: com.yandex.div2.DivTextJsonParser$Companion$TYPE_HELPER_FONT_WEIGHT$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivFontWeight);
            }
        });
        TYPE_HELPER_STRIKE = companion2.from(divLineStyle, new Function1() { // from class: com.yandex.div2.DivTextJsonParser$Companion$TYPE_HELPER_STRIKE$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivLineStyle);
            }
        });
        TYPE_HELPER_TEXT_ALIGNMENT_HORIZONTAL = companion2.from(divAlignmentHorizontal, new Function1() { // from class: com.yandex.div2.DivTextJsonParser$Companion$TYPE_HELPER_TEXT_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        TYPE_HELPER_TEXT_ALIGNMENT_VERTICAL = companion2.from(divAlignmentVertical, new Function1() { // from class: com.yandex.div2.DivTextJsonParser$Companion$TYPE_HELPER_TEXT_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        TYPE_HELPER_TRUNCATE = companion2.from(truncate, new Function1() { // from class: com.yandex.div2.DivTextJsonParser$Companion$TYPE_HELPER_TRUNCATE$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivText.Truncate);
            }
        });
        TYPE_HELPER_UNDERLINE = companion2.from(divLineStyle, new Function1() { // from class: com.yandex.div2.DivTextJsonParser$Companion$TYPE_HELPER_UNDERLINE$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivLineStyle);
            }
        });
        TYPE_HELPER_VISIBILITY = companion2.from(divVisibility, new Function1() { // from class: com.yandex.div2.DivTextJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        ALPHA_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivTextJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ALPHA_VALIDATOR$lambda$0;
                ALPHA_VALIDATOR$lambda$0 = DivTextJsonParser.ALPHA_VALIDATOR$lambda$0(((Double) obj).doubleValue());
                return ALPHA_VALIDATOR$lambda$0;
            }
        };
        COLUMN_SPAN_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivTextJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean COLUMN_SPAN_VALIDATOR$lambda$1;
                COLUMN_SPAN_VALIDATOR$lambda$1 = DivTextJsonParser.COLUMN_SPAN_VALIDATOR$lambda$1(((Long) obj).longValue());
                return COLUMN_SPAN_VALIDATOR$lambda$1;
            }
        };
        FONT_SIZE_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivTextJsonParser$$ExternalSyntheticLambda2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean FONT_SIZE_VALIDATOR$lambda$2;
                FONT_SIZE_VALIDATOR$lambda$2 = DivTextJsonParser.FONT_SIZE_VALIDATOR$lambda$2(((Long) obj).longValue());
                return FONT_SIZE_VALIDATOR$lambda$2;
            }
        };
        FONT_WEIGHT_VALUE_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivTextJsonParser$$ExternalSyntheticLambda3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean FONT_WEIGHT_VALUE_VALIDATOR$lambda$3;
                FONT_WEIGHT_VALUE_VALIDATOR$lambda$3 = DivTextJsonParser.FONT_WEIGHT_VALUE_VALIDATOR$lambda$3(((Long) obj).longValue());
                return FONT_WEIGHT_VALUE_VALIDATOR$lambda$3;
            }
        };
        LINE_HEIGHT_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivTextJsonParser$$ExternalSyntheticLambda4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean LINE_HEIGHT_VALIDATOR$lambda$4;
                LINE_HEIGHT_VALIDATOR$lambda$4 = DivTextJsonParser.LINE_HEIGHT_VALIDATOR$lambda$4(((Long) obj).longValue());
                return LINE_HEIGHT_VALIDATOR$lambda$4;
            }
        };
        MAX_LINES_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivTextJsonParser$$ExternalSyntheticLambda5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean MAX_LINES_VALIDATOR$lambda$5;
                MAX_LINES_VALIDATOR$lambda$5 = DivTextJsonParser.MAX_LINES_VALIDATOR$lambda$5(((Long) obj).longValue());
                return MAX_LINES_VALIDATOR$lambda$5;
            }
        };
        MIN_HIDDEN_LINES_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivTextJsonParser$$ExternalSyntheticLambda6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean MIN_HIDDEN_LINES_VALIDATOR$lambda$6;
                MIN_HIDDEN_LINES_VALIDATOR$lambda$6 = DivTextJsonParser.MIN_HIDDEN_LINES_VALIDATOR$lambda$6(((Long) obj).longValue());
                return MIN_HIDDEN_LINES_VALIDATOR$lambda$6;
            }
        };
        ROW_SPAN_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivTextJsonParser$$ExternalSyntheticLambda7
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ROW_SPAN_VALIDATOR$lambda$7;
                ROW_SPAN_VALIDATOR$lambda$7 = DivTextJsonParser.ROW_SPAN_VALIDATOR$lambda$7(((Long) obj).longValue());
                return ROW_SPAN_VALIDATOR$lambda$7;
            }
        };
        TRANSITION_TRIGGERS_VALIDATOR = new ListValidator() { // from class: com.yandex.div2.DivTextJsonParser$$ExternalSyntheticLambda8
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean TRANSITION_TRIGGERS_VALIDATOR$lambda$8;
                TRANSITION_TRIGGERS_VALIDATOR$lambda$8 = DivTextJsonParser.TRANSITION_TRIGGERS_VALIDATOR$lambda$8(list);
                return TRANSITION_TRIGGERS_VALIDATOR$lambda$8;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TRANSITION_TRIGGERS_VALIDATOR$lambda$8(List list) {
        return list.size() >= 1;
    }
}
