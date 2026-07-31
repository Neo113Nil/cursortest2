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
import io.appmetrica.analytics.impl.M2;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivStateJsonParser.kt */
/* loaded from: classes10.dex */
public abstract class DivStateJsonParser {
    public static final DivAnimation ACTION_ANIMATION_DEFAULT_VALUE;
    public static final Expression ALPHA_DEFAULT_VALUE;
    public static final ValueValidator ALPHA_VALIDATOR;
    public static final Expression CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE;
    public static final Expression CLIP_TO_BOUNDS_DEFAULT_VALUE;
    public static final ValueValidator COLUMN_SPAN_VALIDATOR;
    private static final Companion Companion = new Companion(null);
    public static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    public static final ValueValidator ROW_SPAN_VALIDATOR;
    public static final ListValidator STATES_VALIDATOR;
    public static final Expression TRANSITION_ANIMATION_SELECTOR_DEFAULT_VALUE;
    public static final ListValidator TRANSITION_TRIGGERS_VALIDATOR;
    public static final TypeHelper TYPE_HELPER_ALIGNMENT_HORIZONTAL;
    public static final TypeHelper TYPE_HELPER_ALIGNMENT_VERTICAL;
    public static final TypeHelper TYPE_HELPER_TRANSITION_ANIMATION_SELECTOR;
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

    /* compiled from: DivStateJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivState deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.component.getDivAccessibilityJsonEntityParser());
            DivAction divAction = (DivAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action", this.component.getDivActionJsonEntityParser());
            DivAnimation divAnimation = (DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action_animation", this.component.getDivAnimationJsonEntityParser());
            if (divAnimation == null) {
                divAnimation = DivStateJsonParser.ACTION_ANIMATION_DEFAULT_VALUE;
            }
            DivAnimation divAnimation2 = divAnimation;
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.component.getDivActionJsonEntityParser());
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", DivStateJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL, DivAlignmentHorizontal.FROM_STRING);
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivStateJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivStateJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivStateJsonParser.ALPHA_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression3 != null) {
                expression = readOptionalExpression3;
            }
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.component.getDivAnimatorJsonEntityParser());
            List readOptionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, M2.g, this.component.getDivBackgroundJsonEntityParser());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.component.getDivBorderJsonEntityParser());
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = DivStateJsonParser.CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper2, function12, expression2);
            if (readOptionalExpression4 != null) {
                expression2 = readOptionalExpression4;
            }
            Expression expression3 = DivStateJsonParser.CLIP_TO_BOUNDS_DEFAULT_VALUE;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "clip_to_bounds", typeHelper2, function12, expression3);
            if (readOptionalExpression5 != null) {
                expression3 = readOptionalExpression5;
            }
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function13 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper3, function13, DivStateJsonParser.COLUMN_SPAN_VALIDATOR);
            TypeHelper<String> typeHelper4 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "default_state_id", typeHelper4);
            List readOptionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.component.getDivDisappearActionJsonEntityParser());
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "div_id");
            List readOptionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", this.component.getDivActionJsonEntityParser());
            List readOptionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.component.getDivExtensionJsonEntityParser());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.component.getDivFocusJsonEntityParser());
            List readOptionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.component.getDivFunctionJsonEntityParser());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.component.getDivSizeJsonEntityParser());
            if (divSize == null) {
                divSize = DivStateJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            DivSize divSize2 = divSize;
            List readOptionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", this.component.getDivActionJsonEntityParser());
            List readOptionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", this.component.getDivActionJsonEntityParser());
            String str2 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.component.getDivLayoutProviderJsonEntityParser());
            List readOptionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", this.component.getDivActionJsonEntityParser());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.component.getDivEdgeInsetsJsonEntityParser());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonEntityParser());
            List readOptionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", this.component.getDivActionJsonEntityParser());
            List readOptionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", this.component.getDivActionJsonEntityParser());
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper4);
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper3, function13, DivStateJsonParser.ROW_SPAN_VALIDATOR);
            List readOptionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.component.getDivActionJsonEntityParser());
            String str3 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "state_id_variable");
            List readList = JsonPropertyParser.readList(parsingContext, jSONObject, "states", this.component.getDivStateStateJsonEntityParser(), DivStateJsonParser.STATES_VALIDATOR);
            List readOptionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.component.getDivTooltipJsonEntityParser());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.component.getDivTransformJsonEntityParser());
            TypeHelper typeHelper5 = DivStateJsonParser.TYPE_HELPER_TRANSITION_ANIMATION_SELECTOR;
            Function1 function14 = DivTransitionSelector.FROM_STRING;
            Expression expression4 = DivStateJsonParser.TRANSITION_ANIMATION_SELECTOR_DEFAULT_VALUE;
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "transition_animation_selector", typeHelper5, function14, expression4);
            Expression expression5 = readOptionalExpression10 == null ? expression4 : readOptionalExpression10;
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.component.getDivChangeTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.component.getDivAppearanceTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.component.getDivAppearanceTransitionJsonEntityParser());
            List readOptionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivStateJsonParser.TRANSITION_TRIGGERS_VALIDATOR);
            List readOptionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.component.getDivTriggerJsonEntityParser());
            List readOptionalList17 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.component.getDivVariableJsonEntityParser());
            TypeHelper typeHelper6 = DivStateJsonParser.TYPE_HELPER_VISIBILITY;
            Function1 function15 = DivVisibility.FROM_STRING;
            Expression expression6 = DivStateJsonParser.VISIBILITY_DEFAULT_VALUE;
            Expression readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, typeHelper6, function15, expression6);
            Expression expression7 = readOptionalExpression11 == null ? expression6 : readOptionalExpression11;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.component.getDivVisibilityActionJsonEntityParser());
            List readOptionalList18 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.component.getDivVisibilityActionJsonEntityParser());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.component.getDivSizeJsonEntityParser());
            if (divSize3 == null) {
                divSize3 = DivStateJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivState(divAccessibility, divAction, divAnimation2, readOptionalList, readOptionalExpression, readOptionalExpression2, expression, readOptionalList2, readOptionalList3, divBorder, expression2, expression3, readOptionalExpression6, readOptionalExpression7, readOptionalList4, str, readOptionalList5, readOptionalList6, divFocus, readOptionalList7, divSize2, readOptionalList8, readOptionalList9, str2, divLayoutProvider, readOptionalList10, divEdgeInsets, divEdgeInsets2, readOptionalList11, readOptionalList12, readOptionalExpression8, readOptionalExpression9, readOptionalList13, str3, readList, readOptionalList14, divTransform, expression5, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, readOptionalList15, readOptionalList16, readOptionalList17, expression7, divVisibilityAction, readOptionalList18, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivState divState) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divState.getAccessibility(), this.component.getDivAccessibilityJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "action", divState.action, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "action_animation", divState.actionAnimation, this.component.getDivAnimationJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", divState.actions, this.component.getDivActionJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divState.getAlignmentHorizontal(), DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divState.getAlignmentVertical(), DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divState.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divState.getAnimators(), this.component.getDivAnimatorJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, M2.g, divState.getBackground(), this.component.getDivBackgroundJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divState.getBorder(), this.component.getDivBorderJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "capture_focus_on_action", divState.captureFocusOnAction);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "clip_to_bounds", divState.clipToBounds);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divState.getColumnSpan());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "default_state_id", divState.defaultStateId);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divState.getDisappearActions(), this.component.getDivDisappearActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "div_id", divState.divId);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "doubletap_actions", divState.doubletapActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divState.getExtensions(), this.component.getDivExtensionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divState.getFocus(), this.component.getDivFocusJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divState.getFunctions(), this.component.getDivFunctionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divState.getHeight(), this.component.getDivSizeJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_end_actions", divState.hoverEndActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_start_actions", divState.hoverStartActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divState.getId());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divState.getLayoutProvider(), this.component.getDivLayoutProviderJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "longtap_actions", divState.longtapActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divState.getMargins(), this.component.getDivEdgeInsetsJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divState.getPaddings(), this.component.getDivEdgeInsetsJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_end_actions", divState.pressEndActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_start_actions", divState.pressStartActions, this.component.getDivActionJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divState.getReuseId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divState.getRowSpan());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divState.getSelectedActions(), this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "state_id_variable", divState.stateIdVariable);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "states", divState.states, this.component.getDivStateStateJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divState.getTooltips(), this.component.getDivTooltipJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divState.getTransform(), this.component.getDivTransformJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "transition_animation_selector", divState.transitionAnimationSelector, DivTransitionSelector.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divState.getTransitionChange(), this.component.getDivChangeTransitionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divState.getTransitionIn(), this.component.getDivAppearanceTransitionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divState.getTransitionOut(), this.component.getDivAppearanceTransitionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divState.getTransitionTriggers(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "state");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divState.getVariableTriggers(), this.component.getDivTriggerJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divState.getVariables(), this.component.getDivVariableJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, divState.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divState.getVisibilityAction(), this.component.getDivVisibilityActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divState.getVisibilityActions(), this.component.getDivVisibilityActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divState.getWidth(), this.component.getDivSizeJsonEntityParser());
            return jSONObject;
        }
    }

    /* compiled from: DivStateJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivStateTemplate deserialize(ParsingContext parsingContext, DivStateTemplate divStateTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.accessibility : null, this.component.getDivAccessibilityJsonTemplateParser());
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "action", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.action : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.actionAnimation : null, this.component.getDivAnimationJsonTemplateParser());
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.actions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_horizontal", DivStateJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL, allowPropertyOverride, divStateTemplate != null ? divStateTemplate.alignmentHorizontal : null, DivAlignmentHorizontal.FROM_STRING);
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", DivStateJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, allowPropertyOverride, divStateTemplate != null ? divStateTemplate.alignmentVertical : null, DivAlignmentVertical.FROM_STRING);
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divStateTemplate != null ? divStateTemplate.alpha : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivStateJsonParser.ALPHA_VALIDATOR);
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.animators : null, this.component.getDivAnimatorJsonTemplateParser());
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, M2.g, allowPropertyOverride, divStateTemplate != null ? divStateTemplate.background : null, this.component.getDivBackgroundJsonTemplateParser());
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.border : null, this.component.getDivBorderJsonTemplateParser());
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field = divStateTemplate != null ? divStateTemplate.captureFocusOnAction : null;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "capture_focus_on_action", typeHelper, allowPropertyOverride, field, function1);
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "clip_to_bounds", typeHelper, allowPropertyOverride, divStateTemplate != null ? divStateTemplate.clipToBounds : null, function1);
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Field field2 = divStateTemplate != null ? divStateTemplate.columnSpan : null;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_span", typeHelper2, allowPropertyOverride, field2, function12, DivStateJsonParser.COLUMN_SPAN_VALIDATOR);
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "default_state_id", typeHelper3, allowPropertyOverride, divStateTemplate != null ? divStateTemplate.defaultStateId : null);
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.disappearActions : null, this.component.getDivDisappearActionJsonTemplateParser());
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "div_id", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.divId : null);
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.doubletapActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.extensions : null, this.component.getDivExtensionJsonTemplateParser());
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.focus : null, this.component.getDivFocusJsonTemplateParser());
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.functions : null, this.component.getDivFunctionJsonTemplateParser());
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.height : null, this.component.getDivSizeJsonTemplateParser());
            Field readOptionalListField8 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.hoverEndActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalListField9 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.hoverStartActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.id : null);
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.layoutProvider : null, this.component.getDivLayoutProviderJsonTemplateParser());
            Field readOptionalListField10 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.longtapActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.margins : null, this.component.getDivEdgeInsetsJsonTemplateParser());
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.paddings : null, this.component.getDivEdgeInsetsJsonTemplateParser());
            Field readOptionalListField11 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.pressEndActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalListField12 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.pressStartActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reuse_id", typeHelper3, allowPropertyOverride, divStateTemplate != null ? divStateTemplate.reuseId : null);
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "row_span", typeHelper2, allowPropertyOverride, divStateTemplate != null ? divStateTemplate.rowSpan : null, function12, DivStateJsonParser.ROW_SPAN_VALIDATOR);
            Field readOptionalListField13 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.selectedActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalField12 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "state_id_variable", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.stateIdVariable : null);
            Field field3 = divStateTemplate != null ? divStateTemplate.states : null;
            Lazy divStateStateJsonTemplateParser = this.component.getDivStateStateJsonTemplateParser();
            ListValidator listValidator = DivStateJsonParser.STATES_VALIDATOR;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readListField = JsonFieldParser.readListField(restrictPropertyOverride, jSONObject, "states", allowPropertyOverride, field3, divStateStateJsonTemplateParser, listValidator);
            Field readOptionalListField14 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.tooltips : null, this.component.getDivTooltipJsonTemplateParser());
            Field readOptionalField13 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.transform : null, this.component.getDivTransformJsonTemplateParser());
            Field readOptionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "transition_animation_selector", DivStateJsonParser.TYPE_HELPER_TRANSITION_ANIMATION_SELECTOR, allowPropertyOverride, divStateTemplate != null ? divStateTemplate.transitionAnimationSelector : null, DivTransitionSelector.FROM_STRING);
            Field readOptionalField14 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.transitionChange : null, this.component.getDivChangeTransitionJsonTemplateParser());
            Field readOptionalField15 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.transitionIn : null, this.component.getDivAppearanceTransitionJsonTemplateParser());
            Field readOptionalField16 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.transitionOut : null, this.component.getDivAppearanceTransitionJsonTemplateParser());
            Field field4 = divStateTemplate != null ? divStateTemplate.transitionTriggers : null;
            Function1 function13 = DivTransitionTrigger.FROM_STRING;
            ListValidator listValidator2 = DivStateJsonParser.TRANSITION_TRIGGERS_VALIDATOR;
            Intrinsics.checkNotNull(listValidator2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivStateTemplate(readOptionalField, readOptionalField2, readOptionalField3, readOptionalListField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField2, readOptionalListField3, readOptionalField4, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalFieldWithExpression7, readOptionalListField4, readOptionalField5, readOptionalListField5, readOptionalListField6, readOptionalField6, readOptionalListField7, readOptionalField7, readOptionalListField8, readOptionalListField9, readOptionalField8, readOptionalField9, readOptionalListField10, readOptionalField10, readOptionalField11, readOptionalListField11, readOptionalListField12, readOptionalFieldWithExpression8, readOptionalFieldWithExpression9, readOptionalListField13, readOptionalField12, readListField, readOptionalListField14, readOptionalField13, readOptionalFieldWithExpression10, readOptionalField14, readOptionalField15, readOptionalField16, JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field4, function13, listValidator2), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.variableTriggers : null, this.component.getDivTriggerJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.variables : null, this.component.getDivVariableJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, DivStateJsonParser.TYPE_HELPER_VISIBILITY, allowPropertyOverride, divStateTemplate != null ? divStateTemplate.visibility : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.visibilityAction : null, this.component.getDivVisibilityActionJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.visibilityActions : null, this.component.getDivVisibilityActionJsonTemplateParser()), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divStateTemplate != null ? divStateTemplate.width : null, this.component.getDivSizeJsonTemplateParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivStateTemplate divStateTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divStateTemplate.accessibility, this.component.getDivAccessibilityJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action", divStateTemplate.action, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action_animation", divStateTemplate.actionAnimation, this.component.getDivAnimationJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", divStateTemplate.actions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", divStateTemplate.alignmentHorizontal, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", divStateTemplate.alignmentVertical, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divStateTemplate.alpha);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divStateTemplate.animators, this.component.getDivAnimatorJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, M2.g, divStateTemplate.background, this.component.getDivBackgroundJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", divStateTemplate.border, this.component.getDivBorderJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "capture_focus_on_action", divStateTemplate.captureFocusOnAction);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "clip_to_bounds", divStateTemplate.clipToBounds);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divStateTemplate.columnSpan);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "default_state_id", divStateTemplate.defaultStateId);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divStateTemplate.disappearActions, this.component.getDivDisappearActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "div_id", divStateTemplate.divId);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "doubletap_actions", divStateTemplate.doubletapActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divStateTemplate.extensions, this.component.getDivExtensionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divStateTemplate.focus, this.component.getDivFocusJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divStateTemplate.functions, this.component.getDivFunctionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divStateTemplate.height, this.component.getDivSizeJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_end_actions", divStateTemplate.hoverEndActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_start_actions", divStateTemplate.hoverStartActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divStateTemplate.id);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divStateTemplate.layoutProvider, this.component.getDivLayoutProviderJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "longtap_actions", divStateTemplate.longtapActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divStateTemplate.margins, this.component.getDivEdgeInsetsJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divStateTemplate.paddings, this.component.getDivEdgeInsetsJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_end_actions", divStateTemplate.pressEndActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_start_actions", divStateTemplate.pressStartActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divStateTemplate.reuseId);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divStateTemplate.rowSpan);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divStateTemplate.selectedActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "state_id_variable", divStateTemplate.stateIdVariable);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "states", divStateTemplate.states, this.component.getDivStateStateJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divStateTemplate.tooltips, this.component.getDivTooltipJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divStateTemplate.transform, this.component.getDivTransformJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "transition_animation_selector", divStateTemplate.transitionAnimationSelector, DivTransitionSelector.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divStateTemplate.transitionChange, this.component.getDivChangeTransitionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divStateTemplate.transitionIn, this.component.getDivAppearanceTransitionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divStateTemplate.transitionOut, this.component.getDivAppearanceTransitionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divStateTemplate.transitionTriggers, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "state");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divStateTemplate.variableTriggers, this.component.getDivTriggerJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divStateTemplate.variables, this.component.getDivVariableJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, divStateTemplate.visibility, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divStateTemplate.visibilityAction, this.component.getDivVisibilityActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divStateTemplate.visibilityActions, this.component.getDivVisibilityActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divStateTemplate.width, this.component.getDivSizeJsonTemplateParser());
            return jSONObject;
        }
    }

    /* compiled from: DivStateJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivState resolve(ParsingContext parsingContext, DivStateTemplate divStateTemplate, JSONObject jSONObject) {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.accessibility, jSONObject, "accessibility", this.component.getDivAccessibilityJsonTemplateResolver(), this.component.getDivAccessibilityJsonEntityParser());
            DivAction divAction = (DivAction) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.action, jSONObject, "action", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            DivAnimation divAnimation = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.actionAnimation, jSONObject, "action_animation", this.component.getDivAnimationJsonTemplateResolver(), this.component.getDivAnimationJsonEntityParser());
            if (divAnimation == null) {
                divAnimation = DivStateJsonParser.ACTION_ANIMATION_DEFAULT_VALUE;
            }
            DivAnimation divAnimation2 = divAnimation;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.actions, jSONObject, "actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divStateTemplate.alignmentHorizontal, jSONObject, "alignment_horizontal", DivStateJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL, DivAlignmentHorizontal.FROM_STRING);
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divStateTemplate.alignmentVertical, jSONObject, "alignment_vertical", DivStateJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, DivAlignmentVertical.FROM_STRING);
            Field field = divStateTemplate.alpha;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivStateJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivStateJsonParser.ALPHA_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            Expression expression2 = resolveOptionalExpression3 == null ? expression : resolveOptionalExpression3;
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.animators, jSONObject, "animators", this.component.getDivAnimatorJsonTemplateResolver(), this.component.getDivAnimatorJsonEntityParser());
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.background, jSONObject, M2.g, this.component.getDivBackgroundJsonTemplateResolver(), this.component.getDivBackgroundJsonEntityParser());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.border, jSONObject, "border", this.component.getDivBorderJsonTemplateResolver(), this.component.getDivBorderJsonEntityParser());
            Field field2 = divStateTemplate.captureFocusOnAction;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression3 = DivStateJsonParser.CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "capture_focus_on_action", typeHelper2, function12, expression3);
            if (resolveOptionalExpression4 != null) {
                expression3 = resolveOptionalExpression4;
            }
            Field field3 = divStateTemplate.clipToBounds;
            Expression expression4 = DivStateJsonParser.CLIP_TO_BOUNDS_DEFAULT_VALUE;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "clip_to_bounds", typeHelper2, function12, expression4);
            if (resolveOptionalExpression5 != null) {
                expression4 = resolveOptionalExpression5;
            }
            Field field4 = divStateTemplate.columnSpan;
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function13 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "column_span", typeHelper3, function13, DivStateJsonParser.COLUMN_SPAN_VALIDATOR);
            Field field5 = divStateTemplate.defaultStateId;
            TypeHelper<String> typeHelper4 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "default_state_id", typeHelper4);
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.disappearActions, jSONObject, "disappear_actions", this.component.getDivDisappearActionJsonTemplateResolver(), this.component.getDivDisappearActionJsonEntityParser());
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.divId, jSONObject, "div_id");
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.doubletapActions, jSONObject, "doubletap_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.extensions, jSONObject, "extensions", this.component.getDivExtensionJsonTemplateResolver(), this.component.getDivExtensionJsonEntityParser());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.focus, jSONObject, "focus", this.component.getDivFocusJsonTemplateResolver(), this.component.getDivFocusJsonEntityParser());
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.functions, jSONObject, "functions", this.component.getDivFunctionJsonTemplateResolver(), this.component.getDivFunctionJsonEntityParser());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.height, jSONObject, "height", this.component.getDivSizeJsonTemplateResolver(), this.component.getDivSizeJsonEntityParser());
            if (divSize == null) {
                divSize = DivStateJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            DivSize divSize2 = divSize;
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.hoverEndActions, jSONObject, "hover_end_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.hoverStartActions, jSONObject, "hover_start_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            String str2 = (String) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.id, jSONObject, "id");
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.layoutProvider, jSONObject, "layout_provider", this.component.getDivLayoutProviderJsonTemplateResolver(), this.component.getDivLayoutProviderJsonEntityParser());
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.longtapActions, jSONObject, "longtap_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.margins, jSONObject, "margins", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.paddings, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.pressEndActions, jSONObject, "press_end_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.pressStartActions, jSONObject, "press_start_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divStateTemplate.reuseId, jSONObject, "reuse_id", typeHelper4);
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divStateTemplate.rowSpan, jSONObject, "row_span", typeHelper3, function13, DivStateJsonParser.ROW_SPAN_VALIDATOR);
            List resolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.selectedActions, jSONObject, "selected_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            String str3 = (String) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.stateIdVariable, jSONObject, "state_id_variable");
            List resolveList = JsonFieldResolver.resolveList(parsingContext, divStateTemplate.states, jSONObject, "states", this.component.getDivStateStateJsonTemplateResolver(), this.component.getDivStateStateJsonEntityParser(), DivStateJsonParser.STATES_VALIDATOR);
            List resolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.tooltips, jSONObject, "tooltips", this.component.getDivTooltipJsonTemplateResolver(), this.component.getDivTooltipJsonEntityParser());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.transform, jSONObject, "transform", this.component.getDivTransformJsonTemplateResolver(), this.component.getDivTransformJsonEntityParser());
            Field field6 = divStateTemplate.transitionAnimationSelector;
            TypeHelper typeHelper5 = DivStateJsonParser.TYPE_HELPER_TRANSITION_ANIMATION_SELECTOR;
            Function1 function14 = DivTransitionSelector.FROM_STRING;
            Expression expression5 = DivStateJsonParser.TRANSITION_ANIMATION_SELECTOR_DEFAULT_VALUE;
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "transition_animation_selector", typeHelper5, function14, expression5);
            Expression expression6 = resolveOptionalExpression10 == null ? expression5 : resolveOptionalExpression10;
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.transitionChange, jSONObject, "transition_change", this.component.getDivChangeTransitionJsonTemplateResolver(), this.component.getDivChangeTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.transitionIn, jSONObject, "transition_in", this.component.getDivAppearanceTransitionJsonTemplateResolver(), this.component.getDivAppearanceTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.transitionOut, jSONObject, "transition_out", this.component.getDivAppearanceTransitionJsonTemplateResolver(), this.component.getDivAppearanceTransitionJsonEntityParser());
            List resolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.transitionTriggers, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivStateJsonParser.TRANSITION_TRIGGERS_VALIDATOR);
            List resolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.variableTriggers, jSONObject, "variable_triggers", this.component.getDivTriggerJsonTemplateResolver(), this.component.getDivTriggerJsonEntityParser());
            List resolveOptionalList17 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.variables, jSONObject, "variables", this.component.getDivVariableJsonTemplateResolver(), this.component.getDivVariableJsonEntityParser());
            Field field7 = divStateTemplate.visibility;
            TypeHelper typeHelper6 = DivStateJsonParser.TYPE_HELPER_VISIBILITY;
            Function1 function15 = DivVisibility.FROM_STRING;
            Expression expression7 = DivStateJsonParser.VISIBILITY_DEFAULT_VALUE;
            Expression resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, typeHelper6, function15, expression7);
            Expression expression8 = resolveOptionalExpression11 == null ? expression7 : resolveOptionalExpression11;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.visibilityAction, jSONObject, "visibility_action", this.component.getDivVisibilityActionJsonTemplateResolver(), this.component.getDivVisibilityActionJsonEntityParser());
            List resolveOptionalList18 = JsonFieldResolver.resolveOptionalList(parsingContext, divStateTemplate.visibilityActions, jSONObject, "visibility_actions", this.component.getDivVisibilityActionJsonTemplateResolver(), this.component.getDivVisibilityActionJsonEntityParser());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divStateTemplate.width, jSONObject, "width", this.component.getDivSizeJsonTemplateResolver(), this.component.getDivSizeJsonEntityParser());
            if (divSize3 == null) {
                divSize3 = DivStateJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivState(divAccessibility, divAction, divAnimation2, resolveOptionalList, resolveOptionalExpression, resolveOptionalExpression2, expression2, resolveOptionalList2, resolveOptionalList3, divBorder, expression3, expression4, resolveOptionalExpression6, resolveOptionalExpression7, resolveOptionalList4, str, resolveOptionalList5, resolveOptionalList6, divFocus, resolveOptionalList7, divSize2, resolveOptionalList8, resolveOptionalList9, str2, divLayoutProvider, resolveOptionalList10, divEdgeInsets, divEdgeInsets2, resolveOptionalList11, resolveOptionalList12, resolveOptionalExpression8, resolveOptionalExpression9, resolveOptionalList13, str3, resolveList, resolveOptionalList14, divTransform, expression6, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, resolveOptionalList15, resolveOptionalList16, resolveOptionalList17, expression8, divVisibilityAction, resolveOptionalList18, divSize3);
        }
    }

    /* compiled from: DivStateJsonParser.kt */
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
        Expression constant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression constant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression constant$default3 = Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null);
        Double valueOf = Double.valueOf(1.0d);
        ACTION_ANIMATION_DEFAULT_VALUE = new DivAnimation(constant$default, constant$default2, null, null, constant$default3, null, null, Expression.Companion.constant$default(companion, valueOf, null, 2, null), 108, null);
        ALPHA_DEFAULT_VALUE = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        Boolean bool = Boolean.TRUE;
        CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        CLIP_TO_BOUNDS_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        DivSizeUnitValue divSizeUnitValue = null;
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, divSizeUnitValue, null == true ? 1 : 0, 7, null));
        DivTransitionSelector divTransitionSelector = DivTransitionSelector.STATE_CHANGE;
        TRANSITION_ANIMATION_SELECTOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divTransitionSelector, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(divSizeUnitValue, null == true ? 1 : 0, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        TYPE_HELPER_ALIGNMENT_HORIZONTAL = companion2.from(ArraysKt.first(DivAlignmentHorizontal.values()), new Function1() { // from class: com.yandex.div2.DivStateJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        TYPE_HELPER_ALIGNMENT_VERTICAL = companion2.from(ArraysKt.first(DivAlignmentVertical.values()), new Function1() { // from class: com.yandex.div2.DivStateJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        TYPE_HELPER_TRANSITION_ANIMATION_SELECTOR = companion2.from(divTransitionSelector, new Function1() { // from class: com.yandex.div2.DivStateJsonParser$Companion$TYPE_HELPER_TRANSITION_ANIMATION_SELECTOR$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivTransitionSelector);
            }
        });
        TYPE_HELPER_VISIBILITY = companion2.from(divVisibility, new Function1() { // from class: com.yandex.div2.DivStateJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        ALPHA_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivStateJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ALPHA_VALIDATOR$lambda$0;
                ALPHA_VALIDATOR$lambda$0 = DivStateJsonParser.ALPHA_VALIDATOR$lambda$0(((Double) obj).doubleValue());
                return ALPHA_VALIDATOR$lambda$0;
            }
        };
        COLUMN_SPAN_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivStateJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean COLUMN_SPAN_VALIDATOR$lambda$1;
                COLUMN_SPAN_VALIDATOR$lambda$1 = DivStateJsonParser.COLUMN_SPAN_VALIDATOR$lambda$1(((Long) obj).longValue());
                return COLUMN_SPAN_VALIDATOR$lambda$1;
            }
        };
        ROW_SPAN_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivStateJsonParser$$ExternalSyntheticLambda2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ROW_SPAN_VALIDATOR$lambda$2;
                ROW_SPAN_VALIDATOR$lambda$2 = DivStateJsonParser.ROW_SPAN_VALIDATOR$lambda$2(((Long) obj).longValue());
                return ROW_SPAN_VALIDATOR$lambda$2;
            }
        };
        STATES_VALIDATOR = new ListValidator() { // from class: com.yandex.div2.DivStateJsonParser$$ExternalSyntheticLambda3
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean STATES_VALIDATOR$lambda$3;
                STATES_VALIDATOR$lambda$3 = DivStateJsonParser.STATES_VALIDATOR$lambda$3(list);
                return STATES_VALIDATOR$lambda$3;
            }
        };
        TRANSITION_TRIGGERS_VALIDATOR = new ListValidator() { // from class: com.yandex.div2.DivStateJsonParser$$ExternalSyntheticLambda4
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean TRANSITION_TRIGGERS_VALIDATOR$lambda$4;
                TRANSITION_TRIGGERS_VALIDATOR$lambda$4 = DivStateJsonParser.TRANSITION_TRIGGERS_VALIDATOR$lambda$4(list);
                return TRANSITION_TRIGGERS_VALIDATOR$lambda$4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean STATES_VALIDATOR$lambda$3(List list) {
        return list.size() >= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TRANSITION_TRIGGERS_VALIDATOR$lambda$4(List list) {
        return list.size() >= 1;
    }
}
