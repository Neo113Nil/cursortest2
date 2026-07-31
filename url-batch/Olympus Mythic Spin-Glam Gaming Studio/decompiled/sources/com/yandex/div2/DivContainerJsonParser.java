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
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivSize;
import io.appmetrica.analytics.impl.M2;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivContainerJsonParser.kt */
/* loaded from: classes8.dex */
public abstract class DivContainerJsonParser {
    public static final DivAnimation ACTION_ANIMATION_DEFAULT_VALUE;
    public static final Expression ALPHA_DEFAULT_VALUE;
    public static final ValueValidator ALPHA_VALIDATOR;
    public static final Expression CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE;
    public static final Expression CLIP_TO_BOUNDS_DEFAULT_VALUE;
    public static final ValueValidator COLUMN_SPAN_VALIDATOR;
    public static final Expression CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE;
    public static final Expression CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE;
    private static final Companion Companion = new Companion(null);
    public static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    public static final Expression ITEM_SPACING_DEFAULT_VALUE;
    public static final ValueValidator ITEM_SPACING_VALIDATOR;
    public static final Expression LAYOUT_MODE_DEFAULT_VALUE;
    public static final Expression LINE_SPACING_DEFAULT_VALUE;
    public static final ValueValidator LINE_SPACING_VALIDATOR;
    public static final Expression ORIENTATION_DEFAULT_VALUE;
    public static final ValueValidator ROW_SPAN_VALIDATOR;
    public static final ListValidator TRANSITION_TRIGGERS_VALIDATOR;
    public static final TypeHelper TYPE_HELPER_ALIGNMENT_HORIZONTAL;
    public static final TypeHelper TYPE_HELPER_ALIGNMENT_VERTICAL;
    public static final TypeHelper TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL;
    public static final TypeHelper TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL;
    public static final TypeHelper TYPE_HELPER_LAYOUT_MODE;
    public static final TypeHelper TYPE_HELPER_ORIENTATION;
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
    public static final boolean ITEM_SPACING_VALIDATOR$lambda$2(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LINE_SPACING_VALIDATOR$lambda$3(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ROW_SPAN_VALIDATOR$lambda$4(long j) {
        return j >= 0;
    }

    /* compiled from: DivContainerJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivContainer deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.component.getDivAccessibilityJsonEntityParser());
            DivAction divAction = (DivAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action", this.component.getDivActionJsonEntityParser());
            DivAnimation divAnimation = (DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action_animation", this.component.getDivAnimationJsonEntityParser());
            if (divAnimation == null) {
                divAnimation = DivContainerJsonParser.ACTION_ANIMATION_DEFAULT_VALUE;
            }
            DivAnimation divAnimation2 = divAnimation;
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.component.getDivActionJsonEntityParser());
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", DivContainerJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL, DivAlignmentHorizontal.FROM_STRING);
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivContainerJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivContainerJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivContainerJsonParser.ALPHA_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression3 != null) {
                expression = readOptionalExpression3;
            }
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.component.getDivAnimatorJsonEntityParser());
            DivAspect divAspect = (DivAspect) JsonPropertyParser.readOptional(parsingContext, jSONObject, "aspect", this.component.getDivAspectJsonEntityParser());
            List readOptionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, M2.g, this.component.getDivBackgroundJsonEntityParser());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.component.getDivBorderJsonEntityParser());
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = DivContainerJsonParser.CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper2, function12, expression2);
            if (readOptionalExpression4 != null) {
                expression2 = readOptionalExpression4;
            }
            Expression expression3 = DivContainerJsonParser.CLIP_TO_BOUNDS_DEFAULT_VALUE;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "clip_to_bounds", typeHelper2, function12, expression3);
            if (readOptionalExpression5 != null) {
                expression3 = readOptionalExpression5;
            }
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function13 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper3, function13, DivContainerJsonParser.COLUMN_SPAN_VALIDATOR);
            TypeHelper typeHelper4 = DivContainerJsonParser.TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL;
            Function1 function14 = DivContentAlignmentHorizontal.FROM_STRING;
            Expression expression4 = DivContainerJsonParser.CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_horizontal", typeHelper4, function14, expression4);
            Expression expression5 = readOptionalExpression7 == null ? expression4 : readOptionalExpression7;
            TypeHelper typeHelper5 = DivContainerJsonParser.TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL;
            Function1 function15 = DivContentAlignmentVertical.FROM_STRING;
            Expression expression6 = DivContainerJsonParser.CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE;
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_vertical", typeHelper5, function15, expression6);
            Expression expression7 = readOptionalExpression8 == null ? expression6 : readOptionalExpression8;
            List readOptionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.component.getDivDisappearActionJsonEntityParser());
            List readOptionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", this.component.getDivActionJsonEntityParser());
            List readOptionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.component.getDivExtensionJsonEntityParser());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.component.getDivFocusJsonEntityParser());
            List readOptionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.component.getDivFunctionJsonEntityParser());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.component.getDivSizeJsonEntityParser());
            if (divSize == null) {
                divSize = DivContainerJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            DivSize divSize2 = divSize;
            List readOptionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", this.component.getDivActionJsonEntityParser());
            List readOptionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", this.component.getDivActionJsonEntityParser());
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            DivCollectionItemBuilder divCollectionItemBuilder = (DivCollectionItemBuilder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_builder", this.component.getDivCollectionItemBuilderJsonEntityParser());
            ValueValidator valueValidator2 = DivContainerJsonParser.ITEM_SPACING_VALIDATOR;
            Expression expression8 = DivContainerJsonParser.ITEM_SPACING_DEFAULT_VALUE;
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "item_spacing", typeHelper3, function13, valueValidator2, expression8);
            if (readOptionalExpression9 != null) {
                expression8 = readOptionalExpression9;
            }
            List readOptionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "items", this.component.getDivJsonEntityParser());
            TypeHelper typeHelper6 = DivContainerJsonParser.TYPE_HELPER_LAYOUT_MODE;
            Function1 function16 = DivContainer.LayoutMode.FROM_STRING;
            Expression expression9 = DivContainerJsonParser.LAYOUT_MODE_DEFAULT_VALUE;
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "layout_mode", typeHelper6, function16, expression9);
            Expression expression10 = readOptionalExpression10 == null ? expression9 : readOptionalExpression10;
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.component.getDivLayoutProviderJsonEntityParser());
            DivContainer.Separator separator = (DivContainer.Separator) JsonPropertyParser.readOptional(parsingContext, jSONObject, "line_separator", this.component.getDivContainerSeparatorJsonEntityParser());
            ValueValidator valueValidator3 = DivContainerJsonParser.LINE_SPACING_VALIDATOR;
            Expression expression11 = DivContainerJsonParser.LINE_SPACING_DEFAULT_VALUE;
            Expression readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "line_spacing", typeHelper3, function13, valueValidator3, expression11);
            if (readOptionalExpression11 != null) {
                expression11 = readOptionalExpression11;
            }
            List readOptionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", this.component.getDivActionJsonEntityParser());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.component.getDivEdgeInsetsJsonEntityParser());
            TypeHelper typeHelper7 = DivContainerJsonParser.TYPE_HELPER_ORIENTATION;
            Function1 function17 = DivContainer.Orientation.FROM_STRING;
            Expression expression12 = DivContainerJsonParser.ORIENTATION_DEFAULT_VALUE;
            Expression readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, X3.i.n, typeHelper7, function17, expression12);
            Expression expression13 = readOptionalExpression12 == null ? expression12 : readOptionalExpression12;
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonEntityParser());
            List readOptionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", this.component.getDivActionJsonEntityParser());
            List readOptionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", this.component.getDivActionJsonEntityParser());
            Expression readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression readOptionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper3, function13, DivContainerJsonParser.ROW_SPAN_VALIDATOR);
            List readOptionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.component.getDivActionJsonEntityParser());
            DivContainer.Separator separator2 = (DivContainer.Separator) JsonPropertyParser.readOptional(parsingContext, jSONObject, "separator", this.component.getDivContainerSeparatorJsonEntityParser());
            List readOptionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.component.getDivTooltipJsonEntityParser());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.component.getDivTransformJsonEntityParser());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.component.getDivChangeTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.component.getDivAppearanceTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.component.getDivAppearanceTransitionJsonEntityParser());
            List readOptionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivContainerJsonParser.TRANSITION_TRIGGERS_VALIDATOR);
            List readOptionalList17 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.component.getDivTriggerJsonEntityParser());
            List readOptionalList18 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.component.getDivVariableJsonEntityParser());
            TypeHelper typeHelper8 = DivContainerJsonParser.TYPE_HELPER_VISIBILITY;
            Function1 function18 = DivVisibility.FROM_STRING;
            Expression expression14 = DivContainerJsonParser.VISIBILITY_DEFAULT_VALUE;
            Expression readOptionalExpression15 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, typeHelper8, function18, expression14);
            Expression expression15 = readOptionalExpression15 == null ? expression14 : readOptionalExpression15;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.component.getDivVisibilityActionJsonEntityParser());
            List readOptionalList19 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.component.getDivVisibilityActionJsonEntityParser());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.component.getDivSizeJsonEntityParser());
            if (divSize3 == null) {
                divSize3 = DivContainerJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivContainer(divAccessibility, divAction, divAnimation2, readOptionalList, readOptionalExpression, readOptionalExpression2, expression, readOptionalList2, divAspect, readOptionalList3, divBorder, expression2, expression3, readOptionalExpression6, expression5, expression7, readOptionalList4, readOptionalList5, readOptionalList6, divFocus, readOptionalList7, divSize2, readOptionalList8, readOptionalList9, str, divCollectionItemBuilder, expression8, readOptionalList10, expression10, divLayoutProvider, separator, expression11, readOptionalList11, divEdgeInsets, expression13, divEdgeInsets2, readOptionalList12, readOptionalList13, readOptionalExpression13, readOptionalExpression14, readOptionalList14, separator2, readOptionalList15, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, readOptionalList16, readOptionalList17, readOptionalList18, expression15, divVisibilityAction, readOptionalList19, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivContainer divContainer) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divContainer.getAccessibility(), this.component.getDivAccessibilityJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "action", divContainer.action, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "action_animation", divContainer.actionAnimation, this.component.getDivAnimationJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", divContainer.actions, this.component.getDivActionJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divContainer.getAlignmentHorizontal(), DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divContainer.getAlignmentVertical(), DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divContainer.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divContainer.getAnimators(), this.component.getDivAnimatorJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "aspect", divContainer.aspect, this.component.getDivAspectJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, M2.g, divContainer.getBackground(), this.component.getDivBackgroundJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divContainer.getBorder(), this.component.getDivBorderJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "capture_focus_on_action", divContainer.captureFocusOnAction);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "clip_to_bounds", divContainer.clipToBounds);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divContainer.getColumnSpan());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_horizontal", divContainer.contentAlignmentHorizontal, DivContentAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_vertical", divContainer.contentAlignmentVertical, DivContentAlignmentVertical.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divContainer.getDisappearActions(), this.component.getDivDisappearActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "doubletap_actions", divContainer.doubletapActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divContainer.getExtensions(), this.component.getDivExtensionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divContainer.getFocus(), this.component.getDivFocusJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divContainer.getFunctions(), this.component.getDivFunctionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divContainer.getHeight(), this.component.getDivSizeJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_end_actions", divContainer.hoverEndActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_start_actions", divContainer.hoverStartActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divContainer.getId());
            JsonPropertyParser.write(parsingContext, jSONObject, "item_builder", divContainer.itemBuilder, this.component.getDivCollectionItemBuilderJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "item_spacing", divContainer.itemSpacing);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", divContainer.items, this.component.getDivJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "layout_mode", divContainer.layoutMode, DivContainer.LayoutMode.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divContainer.getLayoutProvider(), this.component.getDivLayoutProviderJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "line_separator", divContainer.lineSeparator, this.component.getDivContainerSeparatorJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "line_spacing", divContainer.lineSpacing);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "longtap_actions", divContainer.longtapActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divContainer.getMargins(), this.component.getDivEdgeInsetsJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, X3.i.n, divContainer.orientation, DivContainer.Orientation.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divContainer.getPaddings(), this.component.getDivEdgeInsetsJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_end_actions", divContainer.pressEndActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_start_actions", divContainer.pressStartActions, this.component.getDivActionJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divContainer.getReuseId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divContainer.getRowSpan());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divContainer.getSelectedActions(), this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "separator", divContainer.separator, this.component.getDivContainerSeparatorJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divContainer.getTooltips(), this.component.getDivTooltipJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divContainer.getTransform(), this.component.getDivTransformJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divContainer.getTransitionChange(), this.component.getDivChangeTransitionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divContainer.getTransitionIn(), this.component.getDivAppearanceTransitionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divContainer.getTransitionOut(), this.component.getDivAppearanceTransitionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divContainer.getTransitionTriggers(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "container");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divContainer.getVariableTriggers(), this.component.getDivTriggerJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divContainer.getVariables(), this.component.getDivVariableJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, divContainer.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divContainer.getVisibilityAction(), this.component.getDivVisibilityActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divContainer.getVisibilityActions(), this.component.getDivVisibilityActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divContainer.getWidth(), this.component.getDivSizeJsonEntityParser());
            return jSONObject;
        }
    }

    /* compiled from: DivContainerJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivContainerTemplate deserialize(ParsingContext parsingContext, DivContainerTemplate divContainerTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.accessibility : null, this.component.getDivAccessibilityJsonTemplateParser());
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "action", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.action : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.actionAnimation : null, this.component.getDivAnimationJsonTemplateParser());
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.actions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_horizontal", DivContainerJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL, allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.alignmentHorizontal : null, DivAlignmentHorizontal.FROM_STRING);
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", DivContainerJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.alignmentVertical : null, DivAlignmentVertical.FROM_STRING);
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.alpha : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivContainerJsonParser.ALPHA_VALIDATOR);
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.animators : null, this.component.getDivAnimatorJsonTemplateParser());
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "aspect", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.aspect : null, this.component.getDivAspectJsonTemplateParser());
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, M2.g, allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.background : null, this.component.getDivBackgroundJsonTemplateParser());
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.border : null, this.component.getDivBorderJsonTemplateParser());
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field = divContainerTemplate != null ? divContainerTemplate.captureFocusOnAction : null;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "capture_focus_on_action", typeHelper, allowPropertyOverride, field, function1);
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "clip_to_bounds", typeHelper, allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.clipToBounds : null, function1);
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Field field2 = divContainerTemplate != null ? divContainerTemplate.columnSpan : null;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_span", typeHelper2, allowPropertyOverride, field2, function12, DivContainerJsonParser.COLUMN_SPAN_VALIDATOR);
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "content_alignment_horizontal", DivContainerJsonParser.TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL, allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.contentAlignmentHorizontal : null, DivContentAlignmentHorizontal.FROM_STRING);
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "content_alignment_vertical", DivContainerJsonParser.TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL, allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.contentAlignmentVertical : null, DivContentAlignmentVertical.FROM_STRING);
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.disappearActions : null, this.component.getDivDisappearActionJsonTemplateParser());
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.doubletapActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.extensions : null, this.component.getDivExtensionJsonTemplateParser());
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.focus : null, this.component.getDivFocusJsonTemplateParser());
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.functions : null, this.component.getDivFunctionJsonTemplateParser());
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.height : null, this.component.getDivSizeJsonTemplateParser());
            Field readOptionalListField8 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.hoverEndActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalListField9 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.hoverStartActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.id : null);
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "item_builder", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.itemBuilder : null, this.component.getDivCollectionItemBuilderJsonTemplateParser());
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "item_spacing", typeHelper2, allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.itemSpacing : null, function12, DivContainerJsonParser.ITEM_SPACING_VALIDATOR);
            Field readOptionalListField10 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "items", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.items : null, this.component.getDivJsonTemplateParser());
            Field readOptionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "layout_mode", DivContainerJsonParser.TYPE_HELPER_LAYOUT_MODE, allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.layoutMode : null, DivContainer.LayoutMode.FROM_STRING);
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.layoutProvider : null, this.component.getDivLayoutProviderJsonTemplateParser());
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "line_separator", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.lineSeparator : null, this.component.getDivContainerSeparatorJsonTemplateParser());
            Field readOptionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "line_spacing", typeHelper2, allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.lineSpacing : null, function12, DivContainerJsonParser.LINE_SPACING_VALIDATOR);
            Field readOptionalListField11 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.longtapActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalField12 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.margins : null, this.component.getDivEdgeInsetsJsonTemplateParser());
            Field readOptionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, X3.i.n, DivContainerJsonParser.TYPE_HELPER_ORIENTATION, allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.orientation : null, DivContainer.Orientation.FROM_STRING);
            Field readOptionalField13 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.paddings : null, this.component.getDivEdgeInsetsJsonTemplateParser());
            Field readOptionalListField12 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.pressEndActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalListField13 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.pressStartActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.reuseId : null);
            Field readOptionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "row_span", typeHelper2, allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.rowSpan : null, function12, DivContainerJsonParser.ROW_SPAN_VALIDATOR);
            Field readOptionalListField14 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.selectedActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalField14 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "separator", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.separator : null, this.component.getDivContainerSeparatorJsonTemplateParser());
            Field readOptionalListField15 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.tooltips : null, this.component.getDivTooltipJsonTemplateParser());
            Field readOptionalField15 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.transform : null, this.component.getDivTransformJsonTemplateParser());
            Field readOptionalField16 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.transitionChange : null, this.component.getDivChangeTransitionJsonTemplateParser());
            Field readOptionalField17 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.transitionIn : null, this.component.getDivAppearanceTransitionJsonTemplateParser());
            Field readOptionalField18 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.transitionOut : null, this.component.getDivAppearanceTransitionJsonTemplateParser());
            Field field3 = divContainerTemplate != null ? divContainerTemplate.transitionTriggers : null;
            Function1 function13 = DivTransitionTrigger.FROM_STRING;
            ListValidator listValidator = DivContainerJsonParser.TRANSITION_TRIGGERS_VALIDATOR;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivContainerTemplate(readOptionalField, readOptionalField2, readOptionalField3, readOptionalListField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField2, readOptionalField4, readOptionalListField3, readOptionalField5, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalFieldWithExpression7, readOptionalFieldWithExpression8, readOptionalListField4, readOptionalListField5, readOptionalListField6, readOptionalField6, readOptionalListField7, readOptionalField7, readOptionalListField8, readOptionalListField9, readOptionalField8, readOptionalField9, readOptionalFieldWithExpression9, readOptionalListField10, readOptionalFieldWithExpression10, readOptionalField10, readOptionalField11, readOptionalFieldWithExpression11, readOptionalListField11, readOptionalField12, readOptionalFieldWithExpression12, readOptionalField13, readOptionalListField12, readOptionalListField13, readOptionalFieldWithExpression13, readOptionalFieldWithExpression14, readOptionalListField14, readOptionalField14, readOptionalListField15, readOptionalField15, readOptionalField16, readOptionalField17, readOptionalField18, JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field3, function13, listValidator), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.variableTriggers : null, this.component.getDivTriggerJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.variables : null, this.component.getDivVariableJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, DivContainerJsonParser.TYPE_HELPER_VISIBILITY, allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.visibility : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.visibilityAction : null, this.component.getDivVisibilityActionJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.visibilityActions : null, this.component.getDivVisibilityActionJsonTemplateParser()), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divContainerTemplate != null ? divContainerTemplate.width : null, this.component.getDivSizeJsonTemplateParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivContainerTemplate divContainerTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divContainerTemplate.accessibility, this.component.getDivAccessibilityJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action", divContainerTemplate.action, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action_animation", divContainerTemplate.actionAnimation, this.component.getDivAnimationJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", divContainerTemplate.actions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", divContainerTemplate.alignmentHorizontal, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", divContainerTemplate.alignmentVertical, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divContainerTemplate.alpha);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divContainerTemplate.animators, this.component.getDivAnimatorJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "aspect", divContainerTemplate.aspect, this.component.getDivAspectJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, M2.g, divContainerTemplate.background, this.component.getDivBackgroundJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", divContainerTemplate.border, this.component.getDivBorderJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "capture_focus_on_action", divContainerTemplate.captureFocusOnAction);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "clip_to_bounds", divContainerTemplate.clipToBounds);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divContainerTemplate.columnSpan);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_horizontal", divContainerTemplate.contentAlignmentHorizontal, DivContentAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_vertical", divContainerTemplate.contentAlignmentVertical, DivContentAlignmentVertical.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divContainerTemplate.disappearActions, this.component.getDivDisappearActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "doubletap_actions", divContainerTemplate.doubletapActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divContainerTemplate.extensions, this.component.getDivExtensionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divContainerTemplate.focus, this.component.getDivFocusJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divContainerTemplate.functions, this.component.getDivFunctionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divContainerTemplate.height, this.component.getDivSizeJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_end_actions", divContainerTemplate.hoverEndActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_start_actions", divContainerTemplate.hoverStartActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divContainerTemplate.id);
            JsonFieldParser.writeField(parsingContext, jSONObject, "item_builder", divContainerTemplate.itemBuilder, this.component.getDivCollectionItemBuilderJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "item_spacing", divContainerTemplate.itemSpacing);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", divContainerTemplate.items, this.component.getDivJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "layout_mode", divContainerTemplate.layoutMode, DivContainer.LayoutMode.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divContainerTemplate.layoutProvider, this.component.getDivLayoutProviderJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "line_separator", divContainerTemplate.lineSeparator, this.component.getDivContainerSeparatorJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "line_spacing", divContainerTemplate.lineSpacing);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "longtap_actions", divContainerTemplate.longtapActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divContainerTemplate.margins, this.component.getDivEdgeInsetsJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, X3.i.n, divContainerTemplate.orientation, DivContainer.Orientation.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divContainerTemplate.paddings, this.component.getDivEdgeInsetsJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_end_actions", divContainerTemplate.pressEndActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_start_actions", divContainerTemplate.pressStartActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divContainerTemplate.reuseId);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divContainerTemplate.rowSpan);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divContainerTemplate.selectedActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "separator", divContainerTemplate.separator, this.component.getDivContainerSeparatorJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divContainerTemplate.tooltips, this.component.getDivTooltipJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divContainerTemplate.transform, this.component.getDivTransformJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divContainerTemplate.transitionChange, this.component.getDivChangeTransitionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divContainerTemplate.transitionIn, this.component.getDivAppearanceTransitionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divContainerTemplate.transitionOut, this.component.getDivAppearanceTransitionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divContainerTemplate.transitionTriggers, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "container");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divContainerTemplate.variableTriggers, this.component.getDivTriggerJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divContainerTemplate.variables, this.component.getDivVariableJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, divContainerTemplate.visibility, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divContainerTemplate.visibilityAction, this.component.getDivVisibilityActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divContainerTemplate.visibilityActions, this.component.getDivVisibilityActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divContainerTemplate.width, this.component.getDivSizeJsonTemplateParser());
            return jSONObject;
        }
    }

    /* compiled from: DivContainerJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivContainer resolve(ParsingContext parsingContext, DivContainerTemplate divContainerTemplate, JSONObject jSONObject) {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.accessibility, jSONObject, "accessibility", this.component.getDivAccessibilityJsonTemplateResolver(), this.component.getDivAccessibilityJsonEntityParser());
            DivAction divAction = (DivAction) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.action, jSONObject, "action", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            DivAnimation divAnimation = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.actionAnimation, jSONObject, "action_animation", this.component.getDivAnimationJsonTemplateResolver(), this.component.getDivAnimationJsonEntityParser());
            if (divAnimation == null) {
                divAnimation = DivContainerJsonParser.ACTION_ANIMATION_DEFAULT_VALUE;
            }
            DivAnimation divAnimation2 = divAnimation;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.actions, jSONObject, "actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divContainerTemplate.alignmentHorizontal, jSONObject, "alignment_horizontal", DivContainerJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL, DivAlignmentHorizontal.FROM_STRING);
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divContainerTemplate.alignmentVertical, jSONObject, "alignment_vertical", DivContainerJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, DivAlignmentVertical.FROM_STRING);
            Field field = divContainerTemplate.alpha;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivContainerJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivContainerJsonParser.ALPHA_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression3 != null) {
                expression = resolveOptionalExpression3;
            }
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.animators, jSONObject, "animators", this.component.getDivAnimatorJsonTemplateResolver(), this.component.getDivAnimatorJsonEntityParser());
            DivAspect divAspect = (DivAspect) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.aspect, jSONObject, "aspect", this.component.getDivAspectJsonTemplateResolver(), this.component.getDivAspectJsonEntityParser());
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.background, jSONObject, M2.g, this.component.getDivBackgroundJsonTemplateResolver(), this.component.getDivBackgroundJsonEntityParser());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.border, jSONObject, "border", this.component.getDivBorderJsonTemplateResolver(), this.component.getDivBorderJsonEntityParser());
            Field field2 = divContainerTemplate.captureFocusOnAction;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = DivContainerJsonParser.CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "capture_focus_on_action", typeHelper2, function12, expression2);
            if (resolveOptionalExpression4 != null) {
                expression2 = resolveOptionalExpression4;
            }
            Field field3 = divContainerTemplate.clipToBounds;
            Expression expression3 = DivContainerJsonParser.CLIP_TO_BOUNDS_DEFAULT_VALUE;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "clip_to_bounds", typeHelper2, function12, expression3);
            if (resolveOptionalExpression5 != null) {
                expression3 = resolveOptionalExpression5;
            }
            Field field4 = divContainerTemplate.columnSpan;
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function13 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "column_span", typeHelper3, function13, DivContainerJsonParser.COLUMN_SPAN_VALIDATOR);
            Field field5 = divContainerTemplate.contentAlignmentHorizontal;
            TypeHelper typeHelper4 = DivContainerJsonParser.TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL;
            Function1 function14 = DivContentAlignmentHorizontal.FROM_STRING;
            Expression expression4 = DivContainerJsonParser.CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "content_alignment_horizontal", typeHelper4, function14, expression4);
            Expression expression5 = resolveOptionalExpression7 == null ? expression4 : resolveOptionalExpression7;
            Field field6 = divContainerTemplate.contentAlignmentVertical;
            TypeHelper typeHelper5 = DivContainerJsonParser.TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL;
            Function1 function15 = DivContentAlignmentVertical.FROM_STRING;
            Expression expression6 = DivContainerJsonParser.CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE;
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "content_alignment_vertical", typeHelper5, function15, expression6);
            Expression expression7 = resolveOptionalExpression8 == null ? expression6 : resolveOptionalExpression8;
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.disappearActions, jSONObject, "disappear_actions", this.component.getDivDisappearActionJsonTemplateResolver(), this.component.getDivDisappearActionJsonEntityParser());
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.doubletapActions, jSONObject, "doubletap_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.extensions, jSONObject, "extensions", this.component.getDivExtensionJsonTemplateResolver(), this.component.getDivExtensionJsonEntityParser());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.focus, jSONObject, "focus", this.component.getDivFocusJsonTemplateResolver(), this.component.getDivFocusJsonEntityParser());
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.functions, jSONObject, "functions", this.component.getDivFunctionJsonTemplateResolver(), this.component.getDivFunctionJsonEntityParser());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.height, jSONObject, "height", this.component.getDivSizeJsonTemplateResolver(), this.component.getDivSizeJsonEntityParser());
            if (divSize == null) {
                divSize = DivContainerJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            DivSize divSize2 = divSize;
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.hoverEndActions, jSONObject, "hover_end_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.hoverStartActions, jSONObject, "hover_start_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.id, jSONObject, "id");
            DivCollectionItemBuilder divCollectionItemBuilder = (DivCollectionItemBuilder) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.itemBuilder, jSONObject, "item_builder", this.component.getDivCollectionItemBuilderJsonTemplateResolver(), this.component.getDivCollectionItemBuilderJsonEntityParser());
            Field field7 = divContainerTemplate.itemSpacing;
            ValueValidator valueValidator2 = DivContainerJsonParser.ITEM_SPACING_VALIDATOR;
            Expression expression8 = DivContainerJsonParser.ITEM_SPACING_DEFAULT_VALUE;
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "item_spacing", typeHelper3, function13, valueValidator2, expression8);
            if (resolveOptionalExpression9 != null) {
                expression8 = resolveOptionalExpression9;
            }
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.items, jSONObject, "items", this.component.getDivJsonTemplateResolver(), this.component.getDivJsonEntityParser());
            Field field8 = divContainerTemplate.layoutMode;
            TypeHelper typeHelper6 = DivContainerJsonParser.TYPE_HELPER_LAYOUT_MODE;
            Function1 function16 = DivContainer.LayoutMode.FROM_STRING;
            Expression expression9 = DivContainerJsonParser.LAYOUT_MODE_DEFAULT_VALUE;
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "layout_mode", typeHelper6, function16, expression9);
            Expression expression10 = resolveOptionalExpression10 == null ? expression9 : resolveOptionalExpression10;
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.layoutProvider, jSONObject, "layout_provider", this.component.getDivLayoutProviderJsonTemplateResolver(), this.component.getDivLayoutProviderJsonEntityParser());
            DivContainer.Separator separator = (DivContainer.Separator) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.lineSeparator, jSONObject, "line_separator", this.component.getDivContainerSeparatorJsonTemplateResolver(), this.component.getDivContainerSeparatorJsonEntityParser());
            Field field9 = divContainerTemplate.lineSpacing;
            ValueValidator valueValidator3 = DivContainerJsonParser.LINE_SPACING_VALIDATOR;
            Expression expression11 = DivContainerJsonParser.LINE_SPACING_DEFAULT_VALUE;
            Expression resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "line_spacing", typeHelper3, function13, valueValidator3, expression11);
            if (resolveOptionalExpression11 != null) {
                expression11 = resolveOptionalExpression11;
            }
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.longtapActions, jSONObject, "longtap_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.margins, jSONObject, "margins", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            Field field10 = divContainerTemplate.orientation;
            TypeHelper typeHelper7 = DivContainerJsonParser.TYPE_HELPER_ORIENTATION;
            Function1 function17 = DivContainer.Orientation.FROM_STRING;
            Expression expression12 = DivContainerJsonParser.ORIENTATION_DEFAULT_VALUE;
            Expression resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, X3.i.n, typeHelper7, function17, expression12);
            Expression expression13 = resolveOptionalExpression12 == null ? expression12 : resolveOptionalExpression12;
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.paddings, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.pressEndActions, jSONObject, "press_end_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            List resolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.pressStartActions, jSONObject, "press_start_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            Expression resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divContainerTemplate.reuseId, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression resolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divContainerTemplate.rowSpan, jSONObject, "row_span", typeHelper3, function13, DivContainerJsonParser.ROW_SPAN_VALIDATOR);
            List resolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.selectedActions, jSONObject, "selected_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            DivContainer.Separator separator2 = (DivContainer.Separator) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.separator, jSONObject, "separator", this.component.getDivContainerSeparatorJsonTemplateResolver(), this.component.getDivContainerSeparatorJsonEntityParser());
            List resolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.tooltips, jSONObject, "tooltips", this.component.getDivTooltipJsonTemplateResolver(), this.component.getDivTooltipJsonEntityParser());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.transform, jSONObject, "transform", this.component.getDivTransformJsonTemplateResolver(), this.component.getDivTransformJsonEntityParser());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.transitionChange, jSONObject, "transition_change", this.component.getDivChangeTransitionJsonTemplateResolver(), this.component.getDivChangeTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.transitionIn, jSONObject, "transition_in", this.component.getDivAppearanceTransitionJsonTemplateResolver(), this.component.getDivAppearanceTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.transitionOut, jSONObject, "transition_out", this.component.getDivAppearanceTransitionJsonTemplateResolver(), this.component.getDivAppearanceTransitionJsonEntityParser());
            List resolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.transitionTriggers, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivContainerJsonParser.TRANSITION_TRIGGERS_VALIDATOR);
            List resolveOptionalList17 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.variableTriggers, jSONObject, "variable_triggers", this.component.getDivTriggerJsonTemplateResolver(), this.component.getDivTriggerJsonEntityParser());
            List resolveOptionalList18 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.variables, jSONObject, "variables", this.component.getDivVariableJsonTemplateResolver(), this.component.getDivVariableJsonEntityParser());
            Field field11 = divContainerTemplate.visibility;
            TypeHelper typeHelper8 = DivContainerJsonParser.TYPE_HELPER_VISIBILITY;
            Function1 function18 = DivVisibility.FROM_STRING;
            Expression expression14 = DivContainerJsonParser.VISIBILITY_DEFAULT_VALUE;
            Expression resolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field11, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, typeHelper8, function18, expression14);
            Expression expression15 = resolveOptionalExpression15 == null ? expression14 : resolveOptionalExpression15;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.visibilityAction, jSONObject, "visibility_action", this.component.getDivVisibilityActionJsonTemplateResolver(), this.component.getDivVisibilityActionJsonEntityParser());
            List resolveOptionalList19 = JsonFieldResolver.resolveOptionalList(parsingContext, divContainerTemplate.visibilityActions, jSONObject, "visibility_actions", this.component.getDivVisibilityActionJsonTemplateResolver(), this.component.getDivVisibilityActionJsonEntityParser());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divContainerTemplate.width, jSONObject, "width", this.component.getDivSizeJsonTemplateResolver(), this.component.getDivSizeJsonEntityParser());
            if (divSize3 == null) {
                divSize3 = DivContainerJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivContainer(divAccessibility, divAction, divAnimation2, resolveOptionalList, resolveOptionalExpression, resolveOptionalExpression2, expression, resolveOptionalList2, divAspect, resolveOptionalList3, divBorder, expression2, expression3, resolveOptionalExpression6, expression5, expression7, resolveOptionalList4, resolveOptionalList5, resolveOptionalList6, divFocus, resolveOptionalList7, divSize2, resolveOptionalList8, resolveOptionalList9, str, divCollectionItemBuilder, expression8, resolveOptionalList10, expression10, divLayoutProvider, separator, expression11, resolveOptionalList11, divEdgeInsets, expression13, divEdgeInsets2, resolveOptionalList12, resolveOptionalList13, resolveOptionalExpression13, resolveOptionalExpression14, resolveOptionalList14, separator2, resolveOptionalList15, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, resolveOptionalList16, resolveOptionalList17, resolveOptionalList18, expression15, divVisibilityAction, resolveOptionalList19, divSize3);
        }
    }

    /* compiled from: DivContainerJsonParser.kt */
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
        DivContentAlignmentHorizontal divContentAlignmentHorizontal = DivContentAlignmentHorizontal.START;
        CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divContentAlignmentHorizontal, null, 2, null);
        DivContentAlignmentVertical divContentAlignmentVertical = DivContentAlignmentVertical.TOP;
        CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divContentAlignmentVertical, null, 2, null);
        DivSizeUnitValue divSizeUnitValue = null;
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, divSizeUnitValue, 7, null));
        ITEM_SPACING_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        DivContainer.LayoutMode layoutMode = DivContainer.LayoutMode.NO_WRAP;
        LAYOUT_MODE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, layoutMode, null, 2, null);
        LINE_SPACING_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        DivContainer.Orientation orientation = DivContainer.Orientation.VERTICAL;
        ORIENTATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, orientation, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(divSizeUnitValue, null, null == true ? 1 : 0, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        TYPE_HELPER_ALIGNMENT_HORIZONTAL = companion2.from(ArraysKt.first(DivAlignmentHorizontal.values()), new Function1() { // from class: com.yandex.div2.DivContainerJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        TYPE_HELPER_ALIGNMENT_VERTICAL = companion2.from(ArraysKt.first(DivAlignmentVertical.values()), new Function1() { // from class: com.yandex.div2.DivContainerJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL = companion2.from(divContentAlignmentHorizontal, new Function1() { // from class: com.yandex.div2.DivContainerJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivContentAlignmentHorizontal);
            }
        });
        TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL = companion2.from(divContentAlignmentVertical, new Function1() { // from class: com.yandex.div2.DivContainerJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivContentAlignmentVertical);
            }
        });
        TYPE_HELPER_LAYOUT_MODE = companion2.from(layoutMode, new Function1() { // from class: com.yandex.div2.DivContainerJsonParser$Companion$TYPE_HELPER_LAYOUT_MODE$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivContainer.LayoutMode);
            }
        });
        TYPE_HELPER_ORIENTATION = companion2.from(orientation, new Function1() { // from class: com.yandex.div2.DivContainerJsonParser$Companion$TYPE_HELPER_ORIENTATION$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivContainer.Orientation);
            }
        });
        TYPE_HELPER_VISIBILITY = companion2.from(divVisibility, new Function1() { // from class: com.yandex.div2.DivContainerJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        ALPHA_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivContainerJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ALPHA_VALIDATOR$lambda$0;
                ALPHA_VALIDATOR$lambda$0 = DivContainerJsonParser.ALPHA_VALIDATOR$lambda$0(((Double) obj).doubleValue());
                return ALPHA_VALIDATOR$lambda$0;
            }
        };
        COLUMN_SPAN_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivContainerJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean COLUMN_SPAN_VALIDATOR$lambda$1;
                COLUMN_SPAN_VALIDATOR$lambda$1 = DivContainerJsonParser.COLUMN_SPAN_VALIDATOR$lambda$1(((Long) obj).longValue());
                return COLUMN_SPAN_VALIDATOR$lambda$1;
            }
        };
        ITEM_SPACING_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivContainerJsonParser$$ExternalSyntheticLambda2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ITEM_SPACING_VALIDATOR$lambda$2;
                ITEM_SPACING_VALIDATOR$lambda$2 = DivContainerJsonParser.ITEM_SPACING_VALIDATOR$lambda$2(((Long) obj).longValue());
                return ITEM_SPACING_VALIDATOR$lambda$2;
            }
        };
        LINE_SPACING_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivContainerJsonParser$$ExternalSyntheticLambda3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean LINE_SPACING_VALIDATOR$lambda$3;
                LINE_SPACING_VALIDATOR$lambda$3 = DivContainerJsonParser.LINE_SPACING_VALIDATOR$lambda$3(((Long) obj).longValue());
                return LINE_SPACING_VALIDATOR$lambda$3;
            }
        };
        ROW_SPAN_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivContainerJsonParser$$ExternalSyntheticLambda4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ROW_SPAN_VALIDATOR$lambda$4;
                ROW_SPAN_VALIDATOR$lambda$4 = DivContainerJsonParser.ROW_SPAN_VALIDATOR$lambda$4(((Long) obj).longValue());
                return ROW_SPAN_VALIDATOR$lambda$4;
            }
        };
        TRANSITION_TRIGGERS_VALIDATOR = new ListValidator() { // from class: com.yandex.div2.DivContainerJsonParser$$ExternalSyntheticLambda5
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean TRANSITION_TRIGGERS_VALIDATOR$lambda$5;
                TRANSITION_TRIGGERS_VALIDATOR$lambda$5 = DivContainerJsonParser.TRANSITION_TRIGGERS_VALIDATOR$lambda$5(list);
                return TRANSITION_TRIGGERS_VALIDATOR$lambda$5;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TRANSITION_TRIGGERS_VALIDATOR$lambda$5(List list) {
        return list.size() >= 1;
    }
}
