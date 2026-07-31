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
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivGridJsonParser.kt */
/* loaded from: classes8.dex */
public abstract class DivGridJsonParser {
    public static final DivAnimation ACTION_ANIMATION_DEFAULT_VALUE;
    public static final Expression ALPHA_DEFAULT_VALUE;
    public static final ValueValidator ALPHA_VALIDATOR;
    public static final Expression CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE;
    public static final ValueValidator COLUMN_COUNT_VALIDATOR;
    public static final ValueValidator COLUMN_SPAN_VALIDATOR;
    public static final Expression CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE;
    public static final Expression CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE;
    private static final Companion Companion = new Companion(null);
    public static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    public static final ValueValidator ROW_SPAN_VALIDATOR;
    public static final ListValidator TRANSITION_TRIGGERS_VALIDATOR;
    public static final TypeHelper TYPE_HELPER_ALIGNMENT_HORIZONTAL;
    public static final TypeHelper TYPE_HELPER_ALIGNMENT_VERTICAL;
    public static final TypeHelper TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL;
    public static final TypeHelper TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL;
    public static final TypeHelper TYPE_HELPER_VISIBILITY;
    public static final Expression VISIBILITY_DEFAULT_VALUE;
    public static final DivSize.MatchParent WIDTH_DEFAULT_VALUE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ALPHA_VALIDATOR$lambda$0(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean COLUMN_COUNT_VALIDATOR$lambda$1(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean COLUMN_SPAN_VALIDATOR$lambda$2(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ROW_SPAN_VALIDATOR$lambda$3(long j) {
        return j >= 0;
    }

    /* compiled from: DivGridJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivGrid deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.component.getDivAccessibilityJsonEntityParser());
            DivAction divAction = (DivAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action", this.component.getDivActionJsonEntityParser());
            DivAnimation divAnimation = (DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action_animation", this.component.getDivAnimationJsonEntityParser());
            if (divAnimation == null) {
                divAnimation = DivGridJsonParser.ACTION_ANIMATION_DEFAULT_VALUE;
            }
            DivAnimation divAnimation2 = divAnimation;
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.component.getDivActionJsonEntityParser());
            TypeHelper typeHelper = DivGridJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL;
            Function1 function1 = DivAlignmentHorizontal.FROM_STRING;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", typeHelper, function1);
            TypeHelper typeHelper2 = DivGridJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL;
            Function1 function12 = DivAlignmentVertical.FROM_STRING;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper2, function12);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivGridJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivGridJsonParser.ALPHA_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper3, function13, valueValidator, expression);
            if (readOptionalExpression3 != null) {
                expression = readOptionalExpression3;
            }
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.component.getDivAnimatorJsonEntityParser());
            List readOptionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, M2.g, this.component.getDivBackgroundJsonEntityParser());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.component.getDivBorderJsonEntityParser());
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = DivGridJsonParser.CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper4, function14, expression2);
            Expression expression3 = readOptionalExpression4 == null ? expression2 : readOptionalExpression4;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function15 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "column_count", typeHelper5, function15, DivGridJsonParser.COLUMN_COUNT_VALIDATOR);
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper5, function15, DivGridJsonParser.COLUMN_SPAN_VALIDATOR);
            TypeHelper typeHelper6 = DivGridJsonParser.TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL;
            Expression expression4 = DivGridJsonParser.CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_horizontal", typeHelper6, function1, expression4);
            if (readOptionalExpression6 != null) {
                expression4 = readOptionalExpression6;
            }
            TypeHelper typeHelper7 = DivGridJsonParser.TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL;
            Expression expression5 = DivGridJsonParser.CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_vertical", typeHelper7, function12, expression5);
            Expression expression6 = readOptionalExpression7 == null ? expression5 : readOptionalExpression7;
            List readOptionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.component.getDivDisappearActionJsonEntityParser());
            List readOptionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", this.component.getDivActionJsonEntityParser());
            List readOptionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.component.getDivExtensionJsonEntityParser());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.component.getDivFocusJsonEntityParser());
            List readOptionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.component.getDivFunctionJsonEntityParser());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.component.getDivSizeJsonEntityParser());
            if (divSize == null) {
                divSize = DivGridJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            DivSize divSize2 = divSize;
            List readOptionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", this.component.getDivActionJsonEntityParser());
            List readOptionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", this.component.getDivActionJsonEntityParser());
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            List readOptionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "items", this.component.getDivJsonEntityParser());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.component.getDivLayoutProviderJsonEntityParser());
            List readOptionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", this.component.getDivActionJsonEntityParser());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.component.getDivEdgeInsetsJsonEntityParser());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonEntityParser());
            List readOptionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", this.component.getDivActionJsonEntityParser());
            List readOptionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", this.component.getDivActionJsonEntityParser());
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper5, function15, DivGridJsonParser.ROW_SPAN_VALIDATOR);
            List readOptionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.component.getDivActionJsonEntityParser());
            List readOptionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.component.getDivTooltipJsonEntityParser());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.component.getDivTransformJsonEntityParser());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.component.getDivChangeTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.component.getDivAppearanceTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.component.getDivAppearanceTransitionJsonEntityParser());
            List readOptionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivGridJsonParser.TRANSITION_TRIGGERS_VALIDATOR);
            List readOptionalList17 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.component.getDivTriggerJsonEntityParser());
            List readOptionalList18 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.component.getDivVariableJsonEntityParser());
            TypeHelper typeHelper8 = DivGridJsonParser.TYPE_HELPER_VISIBILITY;
            Function1 function16 = DivVisibility.FROM_STRING;
            Expression expression7 = DivGridJsonParser.VISIBILITY_DEFAULT_VALUE;
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, typeHelper8, function16, expression7);
            Expression expression8 = readOptionalExpression10 == null ? expression7 : readOptionalExpression10;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.component.getDivVisibilityActionJsonEntityParser());
            List readOptionalList19 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.component.getDivVisibilityActionJsonEntityParser());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.component.getDivSizeJsonEntityParser());
            if (divSize3 == null) {
                divSize3 = DivGridJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivGrid(divAccessibility, divAction, divAnimation2, readOptionalList, readOptionalExpression, readOptionalExpression2, expression, readOptionalList2, readOptionalList3, divBorder, expression3, readExpression, readOptionalExpression5, expression4, expression6, readOptionalList4, readOptionalList5, readOptionalList6, divFocus, readOptionalList7, divSize2, readOptionalList8, readOptionalList9, str, readOptionalList10, divLayoutProvider, readOptionalList11, divEdgeInsets, divEdgeInsets2, readOptionalList12, readOptionalList13, readOptionalExpression8, readOptionalExpression9, readOptionalList14, readOptionalList15, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, readOptionalList16, readOptionalList17, readOptionalList18, expression8, divVisibilityAction, readOptionalList19, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivGrid divGrid) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divGrid.getAccessibility(), this.component.getDivAccessibilityJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "action", divGrid.action, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "action_animation", divGrid.actionAnimation, this.component.getDivAnimationJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", divGrid.actions, this.component.getDivActionJsonEntityParser());
            Expression alignmentHorizontal = divGrid.getAlignmentHorizontal();
            Function1 function1 = DivAlignmentHorizontal.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", alignmentHorizontal, function1);
            Expression alignmentVertical = divGrid.getAlignmentVertical();
            Function1 function12 = DivAlignmentVertical.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", alignmentVertical, function12);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divGrid.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divGrid.getAnimators(), this.component.getDivAnimatorJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, M2.g, divGrid.getBackground(), this.component.getDivBackgroundJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divGrid.getBorder(), this.component.getDivBorderJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "capture_focus_on_action", divGrid.captureFocusOnAction);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_count", divGrid.columnCount);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divGrid.getColumnSpan());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_horizontal", divGrid.contentAlignmentHorizontal, function1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_vertical", divGrid.contentAlignmentVertical, function12);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divGrid.getDisappearActions(), this.component.getDivDisappearActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "doubletap_actions", divGrid.doubletapActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divGrid.getExtensions(), this.component.getDivExtensionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divGrid.getFocus(), this.component.getDivFocusJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divGrid.getFunctions(), this.component.getDivFunctionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divGrid.getHeight(), this.component.getDivSizeJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_end_actions", divGrid.hoverEndActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_start_actions", divGrid.hoverStartActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divGrid.getId());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", divGrid.items, this.component.getDivJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divGrid.getLayoutProvider(), this.component.getDivLayoutProviderJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "longtap_actions", divGrid.longtapActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divGrid.getMargins(), this.component.getDivEdgeInsetsJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divGrid.getPaddings(), this.component.getDivEdgeInsetsJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_end_actions", divGrid.pressEndActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_start_actions", divGrid.pressStartActions, this.component.getDivActionJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divGrid.getReuseId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divGrid.getRowSpan());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divGrid.getSelectedActions(), this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divGrid.getTooltips(), this.component.getDivTooltipJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divGrid.getTransform(), this.component.getDivTransformJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divGrid.getTransitionChange(), this.component.getDivChangeTransitionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divGrid.getTransitionIn(), this.component.getDivAppearanceTransitionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divGrid.getTransitionOut(), this.component.getDivAppearanceTransitionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divGrid.getTransitionTriggers(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "grid");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divGrid.getVariableTriggers(), this.component.getDivTriggerJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divGrid.getVariables(), this.component.getDivVariableJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, divGrid.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divGrid.getVisibilityAction(), this.component.getDivVisibilityActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divGrid.getVisibilityActions(), this.component.getDivVisibilityActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divGrid.getWidth(), this.component.getDivSizeJsonEntityParser());
            return jSONObject;
        }
    }

    /* compiled from: DivGridJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivGridTemplate deserialize(ParsingContext parsingContext, DivGridTemplate divGridTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.accessibility : null, this.component.getDivAccessibilityJsonTemplateParser());
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "action", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.action : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.actionAnimation : null, this.component.getDivAnimationJsonTemplateParser());
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.actions : null, this.component.getDivActionJsonTemplateParser());
            TypeHelper typeHelper = DivGridJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL;
            Field field = divGridTemplate != null ? divGridTemplate.alignmentHorizontal : null;
            Function1 function1 = DivAlignmentHorizontal.FROM_STRING;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_horizontal", typeHelper, allowPropertyOverride, field, function1);
            TypeHelper typeHelper2 = DivGridJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL;
            Field field2 = divGridTemplate != null ? divGridTemplate.alignmentVertical : null;
            Function1 function12 = DivAlignmentVertical.FROM_STRING;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", typeHelper2, allowPropertyOverride, field2, function12);
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divGridTemplate != null ? divGridTemplate.alpha : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivGridJsonParser.ALPHA_VALIDATOR);
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.animators : null, this.component.getDivAnimatorJsonTemplateParser());
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, M2.g, allowPropertyOverride, divGridTemplate != null ? divGridTemplate.background : null, this.component.getDivBackgroundJsonTemplateParser());
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.border : null, this.component.getDivBorderJsonTemplateParser());
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "capture_focus_on_action", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divGridTemplate != null ? divGridTemplate.captureFocusOnAction : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            Field field3 = divGridTemplate != null ? divGridTemplate.columnCount : null;
            Function1 function13 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "column_count", typeHelper3, allowPropertyOverride, field3, function13, DivGridJsonParser.COLUMN_COUNT_VALIDATOR);
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_span", typeHelper3, allowPropertyOverride, divGridTemplate != null ? divGridTemplate.columnSpan : null, function13, DivGridJsonParser.COLUMN_SPAN_VALIDATOR);
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "content_alignment_horizontal", DivGridJsonParser.TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL, allowPropertyOverride, divGridTemplate != null ? divGridTemplate.contentAlignmentHorizontal : null, function1);
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "content_alignment_vertical", DivGridJsonParser.TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL, allowPropertyOverride, divGridTemplate != null ? divGridTemplate.contentAlignmentVertical : null, function12);
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.disappearActions : null, this.component.getDivDisappearActionJsonTemplateParser());
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.doubletapActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.extensions : null, this.component.getDivExtensionJsonTemplateParser());
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.focus : null, this.component.getDivFocusJsonTemplateParser());
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.functions : null, this.component.getDivFunctionJsonTemplateParser());
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.height : null, this.component.getDivSizeJsonTemplateParser());
            Field readOptionalListField8 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.hoverEndActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalListField9 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.hoverStartActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.id : null);
            Field readOptionalListField10 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "items", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.items : null, this.component.getDivJsonTemplateParser());
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.layoutProvider : null, this.component.getDivLayoutProviderJsonTemplateParser());
            Field readOptionalListField11 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.longtapActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.margins : null, this.component.getDivEdgeInsetsJsonTemplateParser());
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.paddings : null, this.component.getDivEdgeInsetsJsonTemplateParser());
            Field readOptionalListField12 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.pressEndActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalListField13 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.pressStartActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divGridTemplate != null ? divGridTemplate.reuseId : null);
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "row_span", typeHelper3, allowPropertyOverride, divGridTemplate != null ? divGridTemplate.rowSpan : null, function13, DivGridJsonParser.ROW_SPAN_VALIDATOR);
            Field readOptionalListField14 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.selectedActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalListField15 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.tooltips : null, this.component.getDivTooltipJsonTemplateParser());
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.transform : null, this.component.getDivTransformJsonTemplateParser());
            Field readOptionalField12 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.transitionChange : null, this.component.getDivChangeTransitionJsonTemplateParser());
            Field readOptionalField13 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.transitionIn : null, this.component.getDivAppearanceTransitionJsonTemplateParser());
            Field readOptionalField14 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.transitionOut : null, this.component.getDivAppearanceTransitionJsonTemplateParser());
            Field field4 = divGridTemplate != null ? divGridTemplate.transitionTriggers : null;
            Function1 function14 = DivTransitionTrigger.FROM_STRING;
            ListValidator listValidator = DivGridJsonParser.TRANSITION_TRIGGERS_VALIDATOR;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivGridTemplate(readOptionalField, readOptionalField2, readOptionalField3, readOptionalListField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField2, readOptionalListField3, readOptionalField4, readOptionalFieldWithExpression4, readFieldWithExpression, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalFieldWithExpression7, readOptionalListField4, readOptionalListField5, readOptionalListField6, readOptionalField5, readOptionalListField7, readOptionalField6, readOptionalListField8, readOptionalListField9, readOptionalField7, readOptionalListField10, readOptionalField8, readOptionalListField11, readOptionalField9, readOptionalField10, readOptionalListField12, readOptionalListField13, readOptionalFieldWithExpression8, readOptionalFieldWithExpression9, readOptionalListField14, readOptionalListField15, readOptionalField11, readOptionalField12, readOptionalField13, readOptionalField14, JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field4, function14, listValidator), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.variableTriggers : null, this.component.getDivTriggerJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.variables : null, this.component.getDivVariableJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, DivGridJsonParser.TYPE_HELPER_VISIBILITY, allowPropertyOverride, divGridTemplate != null ? divGridTemplate.visibility : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.visibilityAction : null, this.component.getDivVisibilityActionJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.visibilityActions : null, this.component.getDivVisibilityActionJsonTemplateParser()), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divGridTemplate != null ? divGridTemplate.width : null, this.component.getDivSizeJsonTemplateParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivGridTemplate divGridTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divGridTemplate.accessibility, this.component.getDivAccessibilityJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action", divGridTemplate.action, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action_animation", divGridTemplate.actionAnimation, this.component.getDivAnimationJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", divGridTemplate.actions, this.component.getDivActionJsonTemplateParser());
            Field field = divGridTemplate.alignmentHorizontal;
            Function1 function1 = DivAlignmentHorizontal.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", field, function1);
            Field field2 = divGridTemplate.alignmentVertical;
            Function1 function12 = DivAlignmentVertical.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", field2, function12);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divGridTemplate.alpha);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divGridTemplate.animators, this.component.getDivAnimatorJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, M2.g, divGridTemplate.background, this.component.getDivBackgroundJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", divGridTemplate.border, this.component.getDivBorderJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "capture_focus_on_action", divGridTemplate.captureFocusOnAction);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_count", divGridTemplate.columnCount);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divGridTemplate.columnSpan);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_horizontal", divGridTemplate.contentAlignmentHorizontal, function1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_vertical", divGridTemplate.contentAlignmentVertical, function12);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divGridTemplate.disappearActions, this.component.getDivDisappearActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "doubletap_actions", divGridTemplate.doubletapActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divGridTemplate.extensions, this.component.getDivExtensionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divGridTemplate.focus, this.component.getDivFocusJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divGridTemplate.functions, this.component.getDivFunctionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divGridTemplate.height, this.component.getDivSizeJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_end_actions", divGridTemplate.hoverEndActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_start_actions", divGridTemplate.hoverStartActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divGridTemplate.id);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", divGridTemplate.items, this.component.getDivJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divGridTemplate.layoutProvider, this.component.getDivLayoutProviderJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "longtap_actions", divGridTemplate.longtapActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divGridTemplate.margins, this.component.getDivEdgeInsetsJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divGridTemplate.paddings, this.component.getDivEdgeInsetsJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_end_actions", divGridTemplate.pressEndActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_start_actions", divGridTemplate.pressStartActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divGridTemplate.reuseId);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divGridTemplate.rowSpan);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divGridTemplate.selectedActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divGridTemplate.tooltips, this.component.getDivTooltipJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divGridTemplate.transform, this.component.getDivTransformJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divGridTemplate.transitionChange, this.component.getDivChangeTransitionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divGridTemplate.transitionIn, this.component.getDivAppearanceTransitionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divGridTemplate.transitionOut, this.component.getDivAppearanceTransitionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divGridTemplate.transitionTriggers, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "grid");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divGridTemplate.variableTriggers, this.component.getDivTriggerJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divGridTemplate.variables, this.component.getDivVariableJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, divGridTemplate.visibility, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divGridTemplate.visibilityAction, this.component.getDivVisibilityActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divGridTemplate.visibilityActions, this.component.getDivVisibilityActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divGridTemplate.width, this.component.getDivSizeJsonTemplateParser());
            return jSONObject;
        }
    }

    /* compiled from: DivGridJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivGrid resolve(ParsingContext parsingContext, DivGridTemplate divGridTemplate, JSONObject jSONObject) {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.accessibility, jSONObject, "accessibility", this.component.getDivAccessibilityJsonTemplateResolver(), this.component.getDivAccessibilityJsonEntityParser());
            DivAction divAction = (DivAction) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.action, jSONObject, "action", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            DivAnimation divAnimation = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.actionAnimation, jSONObject, "action_animation", this.component.getDivAnimationJsonTemplateResolver(), this.component.getDivAnimationJsonEntityParser());
            if (divAnimation == null) {
                divAnimation = DivGridJsonParser.ACTION_ANIMATION_DEFAULT_VALUE;
            }
            DivAnimation divAnimation2 = divAnimation;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.actions, jSONObject, "actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            Field field = divGridTemplate.alignmentHorizontal;
            TypeHelper typeHelper = DivGridJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL;
            Function1 function1 = DivAlignmentHorizontal.FROM_STRING;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alignment_horizontal", typeHelper, function1);
            Field field2 = divGridTemplate.alignmentVertical;
            TypeHelper typeHelper2 = DivGridJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL;
            Function1 function12 = DivAlignmentVertical.FROM_STRING;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alignment_vertical", typeHelper2, function12);
            Field field3 = divGridTemplate.alpha;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivGridJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivGridJsonParser.ALPHA_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alpha", typeHelper3, function13, valueValidator, expression);
            Expression expression2 = resolveOptionalExpression3 == null ? expression : resolveOptionalExpression3;
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.animators, jSONObject, "animators", this.component.getDivAnimatorJsonTemplateResolver(), this.component.getDivAnimatorJsonEntityParser());
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.background, jSONObject, M2.g, this.component.getDivBackgroundJsonTemplateResolver(), this.component.getDivBackgroundJsonEntityParser());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.border, jSONObject, "border", this.component.getDivBorderJsonTemplateResolver(), this.component.getDivBorderJsonEntityParser());
            Field field4 = divGridTemplate.captureFocusOnAction;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression3 = DivGridJsonParser.CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "capture_focus_on_action", typeHelper4, function14, expression3);
            if (resolveOptionalExpression4 != null) {
                expression3 = resolveOptionalExpression4;
            }
            Field field5 = divGridTemplate.columnCount;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function15 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, field5, jSONObject, "column_count", typeHelper5, function15, DivGridJsonParser.COLUMN_COUNT_VALIDATOR);
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divGridTemplate.columnSpan, jSONObject, "column_span", typeHelper5, function15, DivGridJsonParser.COLUMN_SPAN_VALIDATOR);
            Field field6 = divGridTemplate.contentAlignmentHorizontal;
            TypeHelper typeHelper6 = DivGridJsonParser.TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL;
            Expression expression4 = DivGridJsonParser.CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "content_alignment_horizontal", typeHelper6, function1, expression4);
            if (resolveOptionalExpression6 != null) {
                expression4 = resolveOptionalExpression6;
            }
            Field field7 = divGridTemplate.contentAlignmentVertical;
            TypeHelper typeHelper7 = DivGridJsonParser.TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL;
            Expression expression5 = DivGridJsonParser.CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "content_alignment_vertical", typeHelper7, function12, expression5);
            if (resolveOptionalExpression7 != null) {
                expression5 = resolveOptionalExpression7;
            }
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.disappearActions, jSONObject, "disappear_actions", this.component.getDivDisappearActionJsonTemplateResolver(), this.component.getDivDisappearActionJsonEntityParser());
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.doubletapActions, jSONObject, "doubletap_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.extensions, jSONObject, "extensions", this.component.getDivExtensionJsonTemplateResolver(), this.component.getDivExtensionJsonEntityParser());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.focus, jSONObject, "focus", this.component.getDivFocusJsonTemplateResolver(), this.component.getDivFocusJsonEntityParser());
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.functions, jSONObject, "functions", this.component.getDivFunctionJsonTemplateResolver(), this.component.getDivFunctionJsonEntityParser());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.height, jSONObject, "height", this.component.getDivSizeJsonTemplateResolver(), this.component.getDivSizeJsonEntityParser());
            if (divSize == null) {
                divSize = DivGridJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            DivSize divSize2 = divSize;
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.hoverEndActions, jSONObject, "hover_end_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.hoverStartActions, jSONObject, "hover_start_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.id, jSONObject, "id");
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.items, jSONObject, "items", this.component.getDivJsonTemplateResolver(), this.component.getDivJsonEntityParser());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.layoutProvider, jSONObject, "layout_provider", this.component.getDivLayoutProviderJsonTemplateResolver(), this.component.getDivLayoutProviderJsonEntityParser());
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.longtapActions, jSONObject, "longtap_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.margins, jSONObject, "margins", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.paddings, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.pressEndActions, jSONObject, "press_end_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            List resolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.pressStartActions, jSONObject, "press_start_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divGridTemplate.reuseId, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divGridTemplate.rowSpan, jSONObject, "row_span", typeHelper5, function15, DivGridJsonParser.ROW_SPAN_VALIDATOR);
            List resolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.selectedActions, jSONObject, "selected_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            List resolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.tooltips, jSONObject, "tooltips", this.component.getDivTooltipJsonTemplateResolver(), this.component.getDivTooltipJsonEntityParser());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.transform, jSONObject, "transform", this.component.getDivTransformJsonTemplateResolver(), this.component.getDivTransformJsonEntityParser());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.transitionChange, jSONObject, "transition_change", this.component.getDivChangeTransitionJsonTemplateResolver(), this.component.getDivChangeTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.transitionIn, jSONObject, "transition_in", this.component.getDivAppearanceTransitionJsonTemplateResolver(), this.component.getDivAppearanceTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.transitionOut, jSONObject, "transition_out", this.component.getDivAppearanceTransitionJsonTemplateResolver(), this.component.getDivAppearanceTransitionJsonEntityParser());
            List resolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.transitionTriggers, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivGridJsonParser.TRANSITION_TRIGGERS_VALIDATOR);
            List resolveOptionalList17 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.variableTriggers, jSONObject, "variable_triggers", this.component.getDivTriggerJsonTemplateResolver(), this.component.getDivTriggerJsonEntityParser());
            List resolveOptionalList18 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.variables, jSONObject, "variables", this.component.getDivVariableJsonTemplateResolver(), this.component.getDivVariableJsonEntityParser());
            Field field8 = divGridTemplate.visibility;
            TypeHelper typeHelper8 = DivGridJsonParser.TYPE_HELPER_VISIBILITY;
            Function1 function16 = DivVisibility.FROM_STRING;
            Expression expression6 = DivGridJsonParser.VISIBILITY_DEFAULT_VALUE;
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, typeHelper8, function16, expression6);
            Expression expression7 = resolveOptionalExpression10 == null ? expression6 : resolveOptionalExpression10;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.visibilityAction, jSONObject, "visibility_action", this.component.getDivVisibilityActionJsonTemplateResolver(), this.component.getDivVisibilityActionJsonEntityParser());
            List resolveOptionalList19 = JsonFieldResolver.resolveOptionalList(parsingContext, divGridTemplate.visibilityActions, jSONObject, "visibility_actions", this.component.getDivVisibilityActionJsonTemplateResolver(), this.component.getDivVisibilityActionJsonEntityParser());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divGridTemplate.width, jSONObject, "width", this.component.getDivSizeJsonTemplateResolver(), this.component.getDivSizeJsonEntityParser());
            if (divSize3 == null) {
                divSize3 = DivGridJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivGrid(divAccessibility, divAction, divAnimation2, resolveOptionalList, resolveOptionalExpression, resolveOptionalExpression2, expression2, resolveOptionalList2, resolveOptionalList3, divBorder, expression3, resolveExpression, resolveOptionalExpression5, expression4, expression5, resolveOptionalList4, resolveOptionalList5, resolveOptionalList6, divFocus, resolveOptionalList7, divSize2, resolveOptionalList8, resolveOptionalList9, str, resolveOptionalList10, divLayoutProvider, resolveOptionalList11, divEdgeInsets, divEdgeInsets2, resolveOptionalList12, resolveOptionalList13, resolveOptionalExpression8, resolveOptionalExpression9, resolveOptionalList14, resolveOptionalList15, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, resolveOptionalList16, resolveOptionalList17, resolveOptionalList18, expression7, divVisibilityAction, resolveOptionalList19, divSize3);
        }
    }

    /* compiled from: DivGridJsonParser.kt */
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
        DivSizeUnitValue divSizeUnitValue = null;
        DefaultConstructorMarker defaultConstructorMarker = null;
        ACTION_ANIMATION_DEFAULT_VALUE = new DivAnimation(constant$default, constant$default2, null, null, constant$default3, null, null, Expression.Companion.constant$default(companion, valueOf, null, 2, null), 108, null);
        ALPHA_DEFAULT_VALUE = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.START;
        CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divAlignmentHorizontal, null, 2, null);
        DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.TOP;
        CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divAlignmentVertical, null, 2, null);
        int i = 7;
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, divSizeUnitValue, null, i, defaultConstructorMarker));
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null == true ? 1 : 0, divSizeUnitValue, null == true ? 1 : 0, i, defaultConstructorMarker));
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        TYPE_HELPER_ALIGNMENT_HORIZONTAL = companion2.from(ArraysKt.first(DivAlignmentHorizontal.values()), new Function1() { // from class: com.yandex.div2.DivGridJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        TYPE_HELPER_ALIGNMENT_VERTICAL = companion2.from(ArraysKt.first(DivAlignmentVertical.values()), new Function1() { // from class: com.yandex.div2.DivGridJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL = companion2.from(divAlignmentHorizontal, new Function1() { // from class: com.yandex.div2.DivGridJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL = companion2.from(divAlignmentVertical, new Function1() { // from class: com.yandex.div2.DivGridJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        TYPE_HELPER_VISIBILITY = companion2.from(divVisibility, new Function1() { // from class: com.yandex.div2.DivGridJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        ALPHA_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivGridJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ALPHA_VALIDATOR$lambda$0;
                ALPHA_VALIDATOR$lambda$0 = DivGridJsonParser.ALPHA_VALIDATOR$lambda$0(((Double) obj).doubleValue());
                return ALPHA_VALIDATOR$lambda$0;
            }
        };
        COLUMN_COUNT_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivGridJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean COLUMN_COUNT_VALIDATOR$lambda$1;
                COLUMN_COUNT_VALIDATOR$lambda$1 = DivGridJsonParser.COLUMN_COUNT_VALIDATOR$lambda$1(((Long) obj).longValue());
                return COLUMN_COUNT_VALIDATOR$lambda$1;
            }
        };
        COLUMN_SPAN_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivGridJsonParser$$ExternalSyntheticLambda2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean COLUMN_SPAN_VALIDATOR$lambda$2;
                COLUMN_SPAN_VALIDATOR$lambda$2 = DivGridJsonParser.COLUMN_SPAN_VALIDATOR$lambda$2(((Long) obj).longValue());
                return COLUMN_SPAN_VALIDATOR$lambda$2;
            }
        };
        ROW_SPAN_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivGridJsonParser$$ExternalSyntheticLambda3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ROW_SPAN_VALIDATOR$lambda$3;
                ROW_SPAN_VALIDATOR$lambda$3 = DivGridJsonParser.ROW_SPAN_VALIDATOR$lambda$3(((Long) obj).longValue());
                return ROW_SPAN_VALIDATOR$lambda$3;
            }
        };
        TRANSITION_TRIGGERS_VALIDATOR = new ListValidator() { // from class: com.yandex.div2.DivGridJsonParser$$ExternalSyntheticLambda4
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean TRANSITION_TRIGGERS_VALIDATOR$lambda$4;
                TRANSITION_TRIGGERS_VALIDATOR$lambda$4 = DivGridJsonParser.TRANSITION_TRIGGERS_VALIDATOR$lambda$4(list);
                return TRANSITION_TRIGGERS_VALIDATOR$lambda$4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TRANSITION_TRIGGERS_VALIDATOR$lambda$4(List list) {
        return list.size() >= 1;
    }
}
