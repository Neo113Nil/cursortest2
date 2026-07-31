package com.yandex.div2;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
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
import io.appmetrica.analytics.impl.M2;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivImageJsonParser.kt */
/* loaded from: classes10.dex */
public abstract class DivImageJsonParser {
    public static final DivAnimation ACTION_ANIMATION_DEFAULT_VALUE;
    public static final Expression ALPHA_DEFAULT_VALUE;
    public static final ValueValidator ALPHA_VALIDATOR;
    public static final Expression CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE;
    public static final ValueValidator COLUMN_SPAN_VALIDATOR;
    public static final Expression CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE;
    public static final Expression CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE;
    private static final Companion Companion = new Companion(null);
    public static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    public static final Expression HIGH_PRIORITY_PREVIEW_SHOW_DEFAULT_VALUE;
    public static final Expression PLACEHOLDER_COLOR_DEFAULT_VALUE;
    public static final Expression PRELOAD_REQUIRED_DEFAULT_VALUE;
    public static final ValueValidator ROW_SPAN_VALIDATOR;
    public static final Expression SCALE_DEFAULT_VALUE;
    public static final Expression TINT_MODE_DEFAULT_VALUE;
    public static final ListValidator TRANSITION_TRIGGERS_VALIDATOR;
    public static final TypeHelper TYPE_HELPER_ALIGNMENT_HORIZONTAL;
    public static final TypeHelper TYPE_HELPER_ALIGNMENT_VERTICAL;
    public static final TypeHelper TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL;
    public static final TypeHelper TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL;
    public static final TypeHelper TYPE_HELPER_SCALE;
    public static final TypeHelper TYPE_HELPER_TINT_MODE;
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

    /* compiled from: DivImageJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivImage deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.component.getDivAccessibilityJsonEntityParser());
            DivAction divAction = (DivAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action", this.component.getDivActionJsonEntityParser());
            DivAnimation divAnimation = (DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action_animation", this.component.getDivAnimationJsonEntityParser());
            if (divAnimation == null) {
                divAnimation = DivImageJsonParser.ACTION_ANIMATION_DEFAULT_VALUE;
            }
            DivAnimation divAnimation2 = divAnimation;
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.component.getDivActionJsonEntityParser());
            TypeHelper typeHelper = DivImageJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL;
            Function1 function1 = DivAlignmentHorizontal.FROM_STRING;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", typeHelper, function1);
            TypeHelper typeHelper2 = DivImageJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL;
            Function1 function12 = DivAlignmentVertical.FROM_STRING;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper2, function12);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivImageJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivImageJsonParser.ALPHA_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper3, function13, valueValidator, expression);
            if (readOptionalExpression3 != null) {
                expression = readOptionalExpression3;
            }
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.component.getDivAnimatorJsonEntityParser());
            DivFadeTransition divFadeTransition = (DivFadeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "appearance_animation", this.component.getDivFadeTransitionJsonEntityParser());
            DivAspect divAspect = (DivAspect) JsonPropertyParser.readOptional(parsingContext, jSONObject, "aspect", this.component.getDivAspectJsonEntityParser());
            List readOptionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, M2.g, this.component.getDivBackgroundJsonEntityParser());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.component.getDivBorderJsonEntityParser());
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = DivImageJsonParser.CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper4, function14, expression2);
            if (readOptionalExpression4 != null) {
                expression2 = readOptionalExpression4;
            }
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function15 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper5, function15, DivImageJsonParser.COLUMN_SPAN_VALIDATOR);
            TypeHelper typeHelper6 = DivImageJsonParser.TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL;
            Expression expression3 = DivImageJsonParser.CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_horizontal", typeHelper6, function1, expression3);
            if (readOptionalExpression6 != null) {
                expression3 = readOptionalExpression6;
            }
            TypeHelper typeHelper7 = DivImageJsonParser.TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL;
            Expression expression4 = DivImageJsonParser.CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_vertical", typeHelper7, function12, expression4);
            Expression expression5 = readOptionalExpression7 == null ? expression4 : readOptionalExpression7;
            List readOptionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.component.getDivDisappearActionJsonEntityParser());
            List readOptionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", this.component.getDivActionJsonEntityParser());
            List readOptionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.component.getDivExtensionJsonEntityParser());
            List readOptionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "filters", this.component.getDivFilterJsonEntityParser());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.component.getDivFocusJsonEntityParser());
            List readOptionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.component.getDivFunctionJsonEntityParser());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.component.getDivSizeJsonEntityParser());
            if (divSize == null) {
                divSize = DivImageJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            DivSize divSize2 = divSize;
            Expression expression6 = DivImageJsonParser.HIGH_PRIORITY_PREVIEW_SHOW_DEFAULT_VALUE;
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "high_priority_preview_show", typeHelper4, function14, expression6);
            Expression expression7 = readOptionalExpression8 == null ? expression6 : readOptionalExpression8;
            List readOptionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", this.component.getDivActionJsonEntityParser());
            List readOptionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", this.component.getDivActionJsonEntityParser());
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.component.getDivLayoutProviderJsonEntityParser());
            List readOptionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", this.component.getDivActionJsonEntityParser());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.component.getDivEdgeInsetsJsonEntityParser());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonEntityParser());
            TypeHelper<Integer> typeHelper8 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1 function16 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression8 = DivImageJsonParser.PLACEHOLDER_COLOR_DEFAULT_VALUE;
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "placeholder_color", typeHelper8, function16, expression8);
            if (readOptionalExpression9 != null) {
                expression8 = readOptionalExpression9;
            }
            Expression expression9 = DivImageJsonParser.PRELOAD_REQUIRED_DEFAULT_VALUE;
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preload_required", typeHelper4, function14, expression9);
            if (readOptionalExpression10 != null) {
                expression9 = readOptionalExpression10;
            }
            List readOptionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", this.component.getDivActionJsonEntityParser());
            List readOptionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", this.component.getDivActionJsonEntityParser());
            TypeHelper<String> typeHelper9 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preview", typeHelper9);
            Expression readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper9);
            Expression readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper5, function15, DivImageJsonParser.ROW_SPAN_VALIDATOR);
            TypeHelper typeHelper10 = DivImageJsonParser.TYPE_HELPER_SCALE;
            Function1 function17 = DivImageScale.FROM_STRING;
            Expression expression10 = DivImageJsonParser.SCALE_DEFAULT_VALUE;
            Expression readOptionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scale", typeHelper10, function17, expression10);
            Expression expression11 = readOptionalExpression14 == null ? expression10 : readOptionalExpression14;
            List readOptionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.component.getDivActionJsonEntityParser());
            Expression readOptionalExpression15 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "tint_color", typeHelper8, function16);
            TypeHelper typeHelper11 = DivImageJsonParser.TYPE_HELPER_TINT_MODE;
            Function1 function18 = DivBlendMode.FROM_STRING;
            Expression expression12 = DivImageJsonParser.TINT_MODE_DEFAULT_VALUE;
            Expression readOptionalExpression16 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "tint_mode", typeHelper11, function18, expression12);
            Expression expression13 = readOptionalExpression16 == null ? expression12 : readOptionalExpression16;
            List readOptionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.component.getDivTooltipJsonEntityParser());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.component.getDivTransformJsonEntityParser());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.component.getDivChangeTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.component.getDivAppearanceTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.component.getDivAppearanceTransitionJsonEntityParser());
            List readOptionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivImageJsonParser.TRANSITION_TRIGGERS_VALIDATOR);
            List readOptionalList17 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.component.getDivTriggerJsonEntityParser());
            List readOptionalList18 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.component.getDivVariableJsonEntityParser());
            TypeHelper typeHelper12 = DivImageJsonParser.TYPE_HELPER_VISIBILITY;
            Function1 function19 = DivVisibility.FROM_STRING;
            Expression expression14 = DivImageJsonParser.VISIBILITY_DEFAULT_VALUE;
            Expression readOptionalExpression17 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, typeHelper12, function19, expression14);
            Expression expression15 = readOptionalExpression17 == null ? expression14 : readOptionalExpression17;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.component.getDivVisibilityActionJsonEntityParser());
            List readOptionalList19 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.component.getDivVisibilityActionJsonEntityParser());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.component.getDivSizeJsonEntityParser());
            if (divSize3 == null) {
                divSize3 = DivImageJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivImage(divAccessibility, divAction, divAnimation2, readOptionalList, readOptionalExpression, readOptionalExpression2, expression, readOptionalList2, divFadeTransition, divAspect, readOptionalList3, divBorder, expression2, readOptionalExpression5, expression3, expression5, readOptionalList4, readOptionalList5, readOptionalList6, readOptionalList7, divFocus, readOptionalList8, divSize2, expression7, readOptionalList9, readOptionalList10, str, readExpression, divLayoutProvider, readOptionalList11, divEdgeInsets, divEdgeInsets2, expression8, expression9, readOptionalList12, readOptionalList13, readOptionalExpression11, readOptionalExpression12, readOptionalExpression13, expression11, readOptionalList14, readOptionalExpression15, expression13, readOptionalList15, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, readOptionalList16, readOptionalList17, readOptionalList18, expression15, divVisibilityAction, readOptionalList19, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivImage divImage) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divImage.getAccessibility(), this.component.getDivAccessibilityJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "action", divImage.action, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "action_animation", divImage.actionAnimation, this.component.getDivAnimationJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", divImage.actions, this.component.getDivActionJsonEntityParser());
            Expression alignmentHorizontal = divImage.getAlignmentHorizontal();
            Function1 function1 = DivAlignmentHorizontal.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", alignmentHorizontal, function1);
            Expression alignmentVertical = divImage.getAlignmentVertical();
            Function1 function12 = DivAlignmentVertical.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", alignmentVertical, function12);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divImage.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divImage.getAnimators(), this.component.getDivAnimatorJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "appearance_animation", divImage.appearanceAnimation, this.component.getDivFadeTransitionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "aspect", divImage.aspect, this.component.getDivAspectJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, M2.g, divImage.getBackground(), this.component.getDivBackgroundJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divImage.getBorder(), this.component.getDivBorderJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "capture_focus_on_action", divImage.captureFocusOnAction);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divImage.getColumnSpan());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_horizontal", divImage.contentAlignmentHorizontal, function1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_vertical", divImage.contentAlignmentVertical, function12);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divImage.getDisappearActions(), this.component.getDivDisappearActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "doubletap_actions", divImage.doubletapActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divImage.getExtensions(), this.component.getDivExtensionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "filters", divImage.filters, this.component.getDivFilterJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divImage.getFocus(), this.component.getDivFocusJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divImage.getFunctions(), this.component.getDivFunctionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divImage.getHeight(), this.component.getDivSizeJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "high_priority_preview_show", divImage.highPriorityPreviewShow);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_end_actions", divImage.hoverEndActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_start_actions", divImage.hoverStartActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divImage.getId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "image_url", divImage.imageUrl, ParsingConvertersKt.URI_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divImage.getLayoutProvider(), this.component.getDivLayoutProviderJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "longtap_actions", divImage.longtapActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divImage.getMargins(), this.component.getDivEdgeInsetsJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divImage.getPaddings(), this.component.getDivEdgeInsetsJsonEntityParser());
            Expression expression = divImage.placeholderColor;
            Function1 function13 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "placeholder_color", expression, function13);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preload_required", divImage.preloadRequired);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_end_actions", divImage.pressEndActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_start_actions", divImage.pressStartActions, this.component.getDivActionJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preview", divImage.preview);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divImage.getReuseId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divImage.getRowSpan());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scale", divImage.scale, DivImageScale.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divImage.getSelectedActions(), this.component.getDivActionJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "tint_color", divImage.tintColor, function13);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "tint_mode", divImage.tintMode, DivBlendMode.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divImage.getTooltips(), this.component.getDivTooltipJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divImage.getTransform(), this.component.getDivTransformJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divImage.getTransitionChange(), this.component.getDivChangeTransitionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divImage.getTransitionIn(), this.component.getDivAppearanceTransitionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divImage.getTransitionOut(), this.component.getDivAppearanceTransitionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divImage.getTransitionTriggers(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "image");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divImage.getVariableTriggers(), this.component.getDivTriggerJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divImage.getVariables(), this.component.getDivVariableJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, divImage.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divImage.getVisibilityAction(), this.component.getDivVisibilityActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divImage.getVisibilityActions(), this.component.getDivVisibilityActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divImage.getWidth(), this.component.getDivSizeJsonEntityParser());
            return jSONObject;
        }
    }

    /* compiled from: DivImageJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivImageTemplate deserialize(ParsingContext parsingContext, DivImageTemplate divImageTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.accessibility : null, this.component.getDivAccessibilityJsonTemplateParser());
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "action", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.action : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.actionAnimation : null, this.component.getDivAnimationJsonTemplateParser());
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.actions : null, this.component.getDivActionJsonTemplateParser());
            TypeHelper typeHelper = DivImageJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL;
            Field field = divImageTemplate != null ? divImageTemplate.alignmentHorizontal : null;
            Function1 function1 = DivAlignmentHorizontal.FROM_STRING;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_horizontal", typeHelper, allowPropertyOverride, field, function1);
            TypeHelper typeHelper2 = DivImageJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL;
            Field field2 = divImageTemplate != null ? divImageTemplate.alignmentVertical : null;
            Function1 function12 = DivAlignmentVertical.FROM_STRING;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", typeHelper2, allowPropertyOverride, field2, function12);
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.alpha : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivImageJsonParser.ALPHA_VALIDATOR);
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.animators : null, this.component.getDivAnimatorJsonTemplateParser());
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "appearance_animation", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.appearanceAnimation : null, this.component.getDivFadeTransitionJsonTemplateParser());
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "aspect", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.aspect : null, this.component.getDivAspectJsonTemplateParser());
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, M2.g, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.background : null, this.component.getDivBackgroundJsonTemplateParser());
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.border : null, this.component.getDivBorderJsonTemplateParser());
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field3 = divImageTemplate != null ? divImageTemplate.captureFocusOnAction : null;
            Function1 function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "capture_focus_on_action", typeHelper3, allowPropertyOverride, field3, function13);
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Field field4 = divImageTemplate != null ? divImageTemplate.columnSpan : null;
            Function1 function14 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_span", typeHelper4, allowPropertyOverride, field4, function14, DivImageJsonParser.COLUMN_SPAN_VALIDATOR);
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "content_alignment_horizontal", DivImageJsonParser.TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.contentAlignmentHorizontal : null, function1);
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "content_alignment_vertical", DivImageJsonParser.TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.contentAlignmentVertical : null, function12);
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.disappearActions : null, this.component.getDivDisappearActionJsonTemplateParser());
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.doubletapActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.extensions : null, this.component.getDivExtensionJsonTemplateParser());
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "filters", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.filters : null, this.component.getDivFilterJsonTemplateParser());
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.focus : null, this.component.getDivFocusJsonTemplateParser());
            Field readOptionalListField8 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.functions : null, this.component.getDivFunctionJsonTemplateParser());
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.height : null, this.component.getDivSizeJsonTemplateParser());
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "high_priority_preview_show", typeHelper3, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.highPriorityPreviewShow : null, function13);
            Field readOptionalListField9 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.hoverEndActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalListField10 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.hoverStartActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.id : null);
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.imageUrl : null, ParsingConvertersKt.ANY_TO_URI);
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.layoutProvider : null, this.component.getDivLayoutProviderJsonTemplateParser());
            Field readOptionalListField11 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.longtapActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.margins : null, this.component.getDivEdgeInsetsJsonTemplateParser());
            Field readOptionalField12 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.paddings : null, this.component.getDivEdgeInsetsJsonTemplateParser());
            TypeHelper<Integer> typeHelper5 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field field5 = divImageTemplate != null ? divImageTemplate.placeholderColor : null;
            Function1 function15 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "placeholder_color", typeHelper5, allowPropertyOverride, field5, function15);
            Field readOptionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "preload_required", typeHelper3, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.preloadRequired : null, function13);
            Field readOptionalListField12 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.pressEndActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalListField13 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.pressStartActions : null, this.component.getDivActionJsonTemplateParser());
            TypeHelper<String> typeHelper6 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field readOptionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "preview", typeHelper6, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.preview : null);
            Field readOptionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reuse_id", typeHelper6, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.reuseId : null);
            Field readOptionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "row_span", typeHelper4, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.rowSpan : null, function14, DivImageJsonParser.ROW_SPAN_VALIDATOR);
            Field readOptionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "scale", DivImageJsonParser.TYPE_HELPER_SCALE, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.scale : null, DivImageScale.FROM_STRING);
            Field readOptionalListField14 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.selectedActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalFieldWithExpression15 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "tint_color", typeHelper5, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.tintColor : null, function15);
            Field readOptionalFieldWithExpression16 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "tint_mode", DivImageJsonParser.TYPE_HELPER_TINT_MODE, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.tintMode : null, DivBlendMode.FROM_STRING);
            Field readOptionalListField15 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.tooltips : null, this.component.getDivTooltipJsonTemplateParser());
            Field readOptionalField13 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.transform : null, this.component.getDivTransformJsonTemplateParser());
            Field readOptionalField14 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.transitionChange : null, this.component.getDivChangeTransitionJsonTemplateParser());
            Field readOptionalField15 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.transitionIn : null, this.component.getDivAppearanceTransitionJsonTemplateParser());
            Field readOptionalField16 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.transitionOut : null, this.component.getDivAppearanceTransitionJsonTemplateParser());
            Field field6 = divImageTemplate != null ? divImageTemplate.transitionTriggers : null;
            Function1 function16 = DivTransitionTrigger.FROM_STRING;
            ListValidator listValidator = DivImageJsonParser.TRANSITION_TRIGGERS_VALIDATOR;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivImageTemplate(readOptionalField, readOptionalField2, readOptionalField3, readOptionalListField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField2, readOptionalField4, readOptionalField5, readOptionalListField3, readOptionalField6, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalFieldWithExpression7, readOptionalListField4, readOptionalListField5, readOptionalListField6, readOptionalListField7, readOptionalField7, readOptionalListField8, readOptionalField8, readOptionalFieldWithExpression8, readOptionalListField9, readOptionalListField10, readOptionalField9, readFieldWithExpression, readOptionalField10, readOptionalListField11, readOptionalField11, readOptionalField12, readOptionalFieldWithExpression9, readOptionalFieldWithExpression10, readOptionalListField12, readOptionalListField13, readOptionalFieldWithExpression11, readOptionalFieldWithExpression12, readOptionalFieldWithExpression13, readOptionalFieldWithExpression14, readOptionalListField14, readOptionalFieldWithExpression15, readOptionalFieldWithExpression16, readOptionalListField15, readOptionalField13, readOptionalField14, readOptionalField15, readOptionalField16, JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field6, function16, listValidator), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.variableTriggers : null, this.component.getDivTriggerJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.variables : null, this.component.getDivVariableJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, DivImageJsonParser.TYPE_HELPER_VISIBILITY, allowPropertyOverride, divImageTemplate != null ? divImageTemplate.visibility : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.visibilityAction : null, this.component.getDivVisibilityActionJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.visibilityActions : null, this.component.getDivVisibilityActionJsonTemplateParser()), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divImageTemplate != null ? divImageTemplate.width : null, this.component.getDivSizeJsonTemplateParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivImageTemplate divImageTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divImageTemplate.accessibility, this.component.getDivAccessibilityJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action", divImageTemplate.action, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action_animation", divImageTemplate.actionAnimation, this.component.getDivAnimationJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", divImageTemplate.actions, this.component.getDivActionJsonTemplateParser());
            Field field = divImageTemplate.alignmentHorizontal;
            Function1 function1 = DivAlignmentHorizontal.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", field, function1);
            Field field2 = divImageTemplate.alignmentVertical;
            Function1 function12 = DivAlignmentVertical.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", field2, function12);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divImageTemplate.alpha);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divImageTemplate.animators, this.component.getDivAnimatorJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "appearance_animation", divImageTemplate.appearanceAnimation, this.component.getDivFadeTransitionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "aspect", divImageTemplate.aspect, this.component.getDivAspectJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, M2.g, divImageTemplate.background, this.component.getDivBackgroundJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", divImageTemplate.border, this.component.getDivBorderJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "capture_focus_on_action", divImageTemplate.captureFocusOnAction);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divImageTemplate.columnSpan);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_horizontal", divImageTemplate.contentAlignmentHorizontal, function1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_vertical", divImageTemplate.contentAlignmentVertical, function12);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divImageTemplate.disappearActions, this.component.getDivDisappearActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "doubletap_actions", divImageTemplate.doubletapActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divImageTemplate.extensions, this.component.getDivExtensionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "filters", divImageTemplate.filters, this.component.getDivFilterJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divImageTemplate.focus, this.component.getDivFocusJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divImageTemplate.functions, this.component.getDivFunctionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divImageTemplate.height, this.component.getDivSizeJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "high_priority_preview_show", divImageTemplate.highPriorityPreviewShow);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_end_actions", divImageTemplate.hoverEndActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_start_actions", divImageTemplate.hoverStartActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divImageTemplate.id);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "image_url", divImageTemplate.imageUrl, ParsingConvertersKt.URI_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divImageTemplate.layoutProvider, this.component.getDivLayoutProviderJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "longtap_actions", divImageTemplate.longtapActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divImageTemplate.margins, this.component.getDivEdgeInsetsJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divImageTemplate.paddings, this.component.getDivEdgeInsetsJsonTemplateParser());
            Field field3 = divImageTemplate.placeholderColor;
            Function1 function13 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "placeholder_color", field3, function13);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preload_required", divImageTemplate.preloadRequired);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_end_actions", divImageTemplate.pressEndActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_start_actions", divImageTemplate.pressStartActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preview", divImageTemplate.preview);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divImageTemplate.reuseId);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divImageTemplate.rowSpan);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scale", divImageTemplate.scale, DivImageScale.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divImageTemplate.selectedActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "tint_color", divImageTemplate.tintColor, function13);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "tint_mode", divImageTemplate.tintMode, DivBlendMode.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divImageTemplate.tooltips, this.component.getDivTooltipJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divImageTemplate.transform, this.component.getDivTransformJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divImageTemplate.transitionChange, this.component.getDivChangeTransitionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divImageTemplate.transitionIn, this.component.getDivAppearanceTransitionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divImageTemplate.transitionOut, this.component.getDivAppearanceTransitionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divImageTemplate.transitionTriggers, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "image");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divImageTemplate.variableTriggers, this.component.getDivTriggerJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divImageTemplate.variables, this.component.getDivVariableJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, divImageTemplate.visibility, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divImageTemplate.visibilityAction, this.component.getDivVisibilityActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divImageTemplate.visibilityActions, this.component.getDivVisibilityActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divImageTemplate.width, this.component.getDivSizeJsonTemplateParser());
            return jSONObject;
        }
    }

    /* compiled from: DivImageJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivImage resolve(ParsingContext parsingContext, DivImageTemplate divImageTemplate, JSONObject jSONObject) {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.accessibility, jSONObject, "accessibility", this.component.getDivAccessibilityJsonTemplateResolver(), this.component.getDivAccessibilityJsonEntityParser());
            DivAction divAction = (DivAction) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.action, jSONObject, "action", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            DivAnimation divAnimation = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.actionAnimation, jSONObject, "action_animation", this.component.getDivAnimationJsonTemplateResolver(), this.component.getDivAnimationJsonEntityParser());
            if (divAnimation == null) {
                divAnimation = DivImageJsonParser.ACTION_ANIMATION_DEFAULT_VALUE;
            }
            DivAnimation divAnimation2 = divAnimation;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.actions, jSONObject, "actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            Field field = divImageTemplate.alignmentHorizontal;
            TypeHelper typeHelper = DivImageJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL;
            Function1 function1 = DivAlignmentHorizontal.FROM_STRING;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alignment_horizontal", typeHelper, function1);
            Field field2 = divImageTemplate.alignmentVertical;
            TypeHelper typeHelper2 = DivImageJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL;
            Function1 function12 = DivAlignmentVertical.FROM_STRING;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alignment_vertical", typeHelper2, function12);
            Field field3 = divImageTemplate.alpha;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivImageJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivImageJsonParser.ALPHA_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alpha", typeHelper3, function13, valueValidator, expression);
            Expression expression2 = resolveOptionalExpression3 == null ? expression : resolveOptionalExpression3;
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.animators, jSONObject, "animators", this.component.getDivAnimatorJsonTemplateResolver(), this.component.getDivAnimatorJsonEntityParser());
            DivFadeTransition divFadeTransition = (DivFadeTransition) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.appearanceAnimation, jSONObject, "appearance_animation", this.component.getDivFadeTransitionJsonTemplateResolver(), this.component.getDivFadeTransitionJsonEntityParser());
            DivAspect divAspect = (DivAspect) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.aspect, jSONObject, "aspect", this.component.getDivAspectJsonTemplateResolver(), this.component.getDivAspectJsonEntityParser());
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.background, jSONObject, M2.g, this.component.getDivBackgroundJsonTemplateResolver(), this.component.getDivBackgroundJsonEntityParser());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.border, jSONObject, "border", this.component.getDivBorderJsonTemplateResolver(), this.component.getDivBorderJsonEntityParser());
            Field field4 = divImageTemplate.captureFocusOnAction;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression3 = DivImageJsonParser.CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "capture_focus_on_action", typeHelper4, function14, expression3);
            if (resolveOptionalExpression4 != null) {
                expression3 = resolveOptionalExpression4;
            }
            Field field5 = divImageTemplate.columnSpan;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function15 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "column_span", typeHelper5, function15, DivImageJsonParser.COLUMN_SPAN_VALIDATOR);
            Field field6 = divImageTemplate.contentAlignmentHorizontal;
            TypeHelper typeHelper6 = DivImageJsonParser.TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL;
            Expression expression4 = DivImageJsonParser.CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "content_alignment_horizontal", typeHelper6, function1, expression4);
            Expression expression5 = resolveOptionalExpression6 == null ? expression4 : resolveOptionalExpression6;
            Field field7 = divImageTemplate.contentAlignmentVertical;
            TypeHelper typeHelper7 = DivImageJsonParser.TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL;
            Expression expression6 = DivImageJsonParser.CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "content_alignment_vertical", typeHelper7, function12, expression6);
            if (resolveOptionalExpression7 != null) {
                expression6 = resolveOptionalExpression7;
            }
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.disappearActions, jSONObject, "disappear_actions", this.component.getDivDisappearActionJsonTemplateResolver(), this.component.getDivDisappearActionJsonEntityParser());
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.doubletapActions, jSONObject, "doubletap_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.extensions, jSONObject, "extensions", this.component.getDivExtensionJsonTemplateResolver(), this.component.getDivExtensionJsonEntityParser());
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.filters, jSONObject, "filters", this.component.getDivFilterJsonTemplateResolver(), this.component.getDivFilterJsonEntityParser());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.focus, jSONObject, "focus", this.component.getDivFocusJsonTemplateResolver(), this.component.getDivFocusJsonEntityParser());
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.functions, jSONObject, "functions", this.component.getDivFunctionJsonTemplateResolver(), this.component.getDivFunctionJsonEntityParser());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.height, jSONObject, "height", this.component.getDivSizeJsonTemplateResolver(), this.component.getDivSizeJsonEntityParser());
            if (divSize == null) {
                divSize = DivImageJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            DivSize divSize2 = divSize;
            Field field8 = divImageTemplate.highPriorityPreviewShow;
            Expression expression7 = DivImageJsonParser.HIGH_PRIORITY_PREVIEW_SHOW_DEFAULT_VALUE;
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "high_priority_preview_show", typeHelper4, function14, expression7);
            if (resolveOptionalExpression8 != null) {
                expression7 = resolveOptionalExpression8;
            }
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.hoverEndActions, jSONObject, "hover_end_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.hoverStartActions, jSONObject, "hover_start_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.id, jSONObject, "id");
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divImageTemplate.imageUrl, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.layoutProvider, jSONObject, "layout_provider", this.component.getDivLayoutProviderJsonTemplateResolver(), this.component.getDivLayoutProviderJsonEntityParser());
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.longtapActions, jSONObject, "longtap_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.margins, jSONObject, "margins", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.paddings, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            Field field9 = divImageTemplate.placeholderColor;
            TypeHelper<Integer> typeHelper8 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1 function16 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression8 = DivImageJsonParser.PLACEHOLDER_COLOR_DEFAULT_VALUE;
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "placeholder_color", typeHelper8, function16, expression8);
            if (resolveOptionalExpression9 != null) {
                expression8 = resolveOptionalExpression9;
            }
            Field field10 = divImageTemplate.preloadRequired;
            Expression expression9 = DivImageJsonParser.PRELOAD_REQUIRED_DEFAULT_VALUE;
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "preload_required", typeHelper4, function14, expression9);
            if (resolveOptionalExpression10 != null) {
                expression9 = resolveOptionalExpression10;
            }
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.pressEndActions, jSONObject, "press_end_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            List resolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.pressStartActions, jSONObject, "press_start_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            Field field11 = divImageTemplate.preview;
            TypeHelper<String> typeHelper9 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field11, jSONObject, "preview", typeHelper9);
            Expression resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divImageTemplate.reuseId, jSONObject, "reuse_id", typeHelper9);
            Expression resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divImageTemplate.rowSpan, jSONObject, "row_span", typeHelper5, function15, DivImageJsonParser.ROW_SPAN_VALIDATOR);
            Field field12 = divImageTemplate.scale;
            TypeHelper typeHelper10 = DivImageJsonParser.TYPE_HELPER_SCALE;
            Function1 function17 = DivImageScale.FROM_STRING;
            Expression expression10 = DivImageJsonParser.SCALE_DEFAULT_VALUE;
            Expression resolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field12, jSONObject, "scale", typeHelper10, function17, expression10);
            Expression expression11 = resolveOptionalExpression14 == null ? expression10 : resolveOptionalExpression14;
            List resolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.selectedActions, jSONObject, "selected_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            Expression resolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divImageTemplate.tintColor, jSONObject, "tint_color", typeHelper8, function16);
            Field field13 = divImageTemplate.tintMode;
            TypeHelper typeHelper11 = DivImageJsonParser.TYPE_HELPER_TINT_MODE;
            Function1 function18 = DivBlendMode.FROM_STRING;
            Expression expression12 = DivImageJsonParser.TINT_MODE_DEFAULT_VALUE;
            Expression resolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field13, jSONObject, "tint_mode", typeHelper11, function18, expression12);
            Expression expression13 = resolveOptionalExpression16 == null ? expression12 : resolveOptionalExpression16;
            List resolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.tooltips, jSONObject, "tooltips", this.component.getDivTooltipJsonTemplateResolver(), this.component.getDivTooltipJsonEntityParser());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.transform, jSONObject, "transform", this.component.getDivTransformJsonTemplateResolver(), this.component.getDivTransformJsonEntityParser());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.transitionChange, jSONObject, "transition_change", this.component.getDivChangeTransitionJsonTemplateResolver(), this.component.getDivChangeTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.transitionIn, jSONObject, "transition_in", this.component.getDivAppearanceTransitionJsonTemplateResolver(), this.component.getDivAppearanceTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.transitionOut, jSONObject, "transition_out", this.component.getDivAppearanceTransitionJsonTemplateResolver(), this.component.getDivAppearanceTransitionJsonEntityParser());
            List resolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.transitionTriggers, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivImageJsonParser.TRANSITION_TRIGGERS_VALIDATOR);
            List resolveOptionalList17 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.variableTriggers, jSONObject, "variable_triggers", this.component.getDivTriggerJsonTemplateResolver(), this.component.getDivTriggerJsonEntityParser());
            List resolveOptionalList18 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.variables, jSONObject, "variables", this.component.getDivVariableJsonTemplateResolver(), this.component.getDivVariableJsonEntityParser());
            Field field14 = divImageTemplate.visibility;
            TypeHelper typeHelper12 = DivImageJsonParser.TYPE_HELPER_VISIBILITY;
            Function1 function19 = DivVisibility.FROM_STRING;
            Expression expression14 = DivImageJsonParser.VISIBILITY_DEFAULT_VALUE;
            Expression resolveOptionalExpression17 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field14, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, typeHelper12, function19, expression14);
            Expression expression15 = resolveOptionalExpression17 == null ? expression14 : resolveOptionalExpression17;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.visibilityAction, jSONObject, "visibility_action", this.component.getDivVisibilityActionJsonTemplateResolver(), this.component.getDivVisibilityActionJsonEntityParser());
            List resolveOptionalList19 = JsonFieldResolver.resolveOptionalList(parsingContext, divImageTemplate.visibilityActions, jSONObject, "visibility_actions", this.component.getDivVisibilityActionJsonTemplateResolver(), this.component.getDivVisibilityActionJsonEntityParser());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divImageTemplate.width, jSONObject, "width", this.component.getDivSizeJsonTemplateResolver(), this.component.getDivSizeJsonEntityParser());
            if (divSize3 == null) {
                divSize3 = DivImageJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivImage(divAccessibility, divAction, divAnimation2, resolveOptionalList, resolveOptionalExpression, resolveOptionalExpression2, expression2, resolveOptionalList2, divFadeTransition, divAspect, resolveOptionalList3, divBorder, expression3, resolveOptionalExpression5, expression5, expression6, resolveOptionalList4, resolveOptionalList5, resolveOptionalList6, resolveOptionalList7, divFocus, resolveOptionalList8, divSize2, expression7, resolveOptionalList9, resolveOptionalList10, str, resolveExpression, divLayoutProvider, resolveOptionalList11, divEdgeInsets, divEdgeInsets2, expression8, expression9, resolveOptionalList12, resolveOptionalList13, resolveOptionalExpression11, resolveOptionalExpression12, resolveOptionalExpression13, expression11, resolveOptionalList14, resolveOptionalExpression15, expression13, resolveOptionalList15, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, resolveOptionalList16, resolveOptionalList17, resolveOptionalList18, expression15, divVisibilityAction, resolveOptionalList19, divSize3);
        }
    }

    /* compiled from: DivImageJsonParser.kt */
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
        DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.CENTER;
        CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divAlignmentHorizontal, null, 2, null);
        DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.CENTER;
        CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divAlignmentVertical, null, 2, null);
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7, null));
        Boolean bool = Boolean.FALSE;
        HIGH_PRIORITY_PREVIEW_SHOW_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        PLACEHOLDER_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Integer.valueOf(DivSeparatorView.DEFAULT_DIVIDER_COLOR), null, 2, null);
        PRELOAD_REQUIRED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        DivImageScale divImageScale = DivImageScale.FILL;
        SCALE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divImageScale, null, 2, null);
        DivBlendMode divBlendMode = DivBlendMode.SOURCE_IN;
        TINT_MODE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divBlendMode, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        TYPE_HELPER_ALIGNMENT_HORIZONTAL = companion2.from(ArraysKt.first(DivAlignmentHorizontal.values()), new Function1() { // from class: com.yandex.div2.DivImageJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        TYPE_HELPER_ALIGNMENT_VERTICAL = companion2.from(ArraysKt.first(DivAlignmentVertical.values()), new Function1() { // from class: com.yandex.div2.DivImageJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL = companion2.from(divAlignmentHorizontal, new Function1() { // from class: com.yandex.div2.DivImageJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL = companion2.from(divAlignmentVertical, new Function1() { // from class: com.yandex.div2.DivImageJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        TYPE_HELPER_SCALE = companion2.from(divImageScale, new Function1() { // from class: com.yandex.div2.DivImageJsonParser$Companion$TYPE_HELPER_SCALE$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivImageScale);
            }
        });
        TYPE_HELPER_TINT_MODE = companion2.from(divBlendMode, new Function1() { // from class: com.yandex.div2.DivImageJsonParser$Companion$TYPE_HELPER_TINT_MODE$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivBlendMode);
            }
        });
        TYPE_HELPER_VISIBILITY = companion2.from(divVisibility, new Function1() { // from class: com.yandex.div2.DivImageJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        ALPHA_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivImageJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ALPHA_VALIDATOR$lambda$0;
                ALPHA_VALIDATOR$lambda$0 = DivImageJsonParser.ALPHA_VALIDATOR$lambda$0(((Double) obj).doubleValue());
                return ALPHA_VALIDATOR$lambda$0;
            }
        };
        COLUMN_SPAN_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivImageJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean COLUMN_SPAN_VALIDATOR$lambda$1;
                COLUMN_SPAN_VALIDATOR$lambda$1 = DivImageJsonParser.COLUMN_SPAN_VALIDATOR$lambda$1(((Long) obj).longValue());
                return COLUMN_SPAN_VALIDATOR$lambda$1;
            }
        };
        ROW_SPAN_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivImageJsonParser$$ExternalSyntheticLambda2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ROW_SPAN_VALIDATOR$lambda$2;
                ROW_SPAN_VALIDATOR$lambda$2 = DivImageJsonParser.ROW_SPAN_VALIDATOR$lambda$2(((Long) obj).longValue());
                return ROW_SPAN_VALIDATOR$lambda$2;
            }
        };
        TRANSITION_TRIGGERS_VALIDATOR = new ListValidator() { // from class: com.yandex.div2.DivImageJsonParser$$ExternalSyntheticLambda3
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean TRANSITION_TRIGGERS_VALIDATOR$lambda$3;
                TRANSITION_TRIGGERS_VALIDATOR$lambda$3 = DivImageJsonParser.TRANSITION_TRIGGERS_VALIDATOR$lambda$3(list);
                return TRANSITION_TRIGGERS_VALIDATOR$lambda$3;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TRANSITION_TRIGGERS_VALIDATOR$lambda$3(List list) {
        return list.size() >= 1;
    }
}
