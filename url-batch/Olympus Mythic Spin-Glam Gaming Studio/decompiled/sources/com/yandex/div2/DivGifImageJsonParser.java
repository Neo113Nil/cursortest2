package com.yandex.div2;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
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

/* compiled from: DivGifImageJsonParser.kt */
/* loaded from: classes8.dex */
public abstract class DivGifImageJsonParser {
    public static final DivAnimation ACTION_ANIMATION_DEFAULT_VALUE;
    public static final Expression ALPHA_DEFAULT_VALUE;
    public static final ValueValidator ALPHA_VALIDATOR;
    public static final Expression CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE;
    public static final ValueValidator COLUMN_SPAN_VALIDATOR;
    public static final Expression CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE;
    public static final Expression CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE;
    private static final Companion Companion = new Companion(null);
    public static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    public static final Expression PLACEHOLDER_COLOR_DEFAULT_VALUE;
    public static final Expression PRELOAD_REQUIRED_DEFAULT_VALUE;
    public static final ValueValidator ROW_SPAN_VALIDATOR;
    public static final Expression SCALE_DEFAULT_VALUE;
    public static final ListValidator TRANSITION_TRIGGERS_VALIDATOR;
    public static final TypeHelper TYPE_HELPER_ALIGNMENT_HORIZONTAL;
    public static final TypeHelper TYPE_HELPER_ALIGNMENT_VERTICAL;
    public static final TypeHelper TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL;
    public static final TypeHelper TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL;
    public static final TypeHelper TYPE_HELPER_SCALE;
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

    /* compiled from: DivGifImageJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivGifImage deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.component.getDivAccessibilityJsonEntityParser());
            DivAction divAction = (DivAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action", this.component.getDivActionJsonEntityParser());
            DivAnimation divAnimation = (DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "action_animation", this.component.getDivAnimationJsonEntityParser());
            if (divAnimation == null) {
                divAnimation = DivGifImageJsonParser.ACTION_ANIMATION_DEFAULT_VALUE;
            }
            DivAnimation divAnimation2 = divAnimation;
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.component.getDivActionJsonEntityParser());
            TypeHelper typeHelper = DivGifImageJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL;
            Function1 function1 = DivAlignmentHorizontal.FROM_STRING;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", typeHelper, function1);
            TypeHelper typeHelper2 = DivGifImageJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL;
            Function1 function12 = DivAlignmentVertical.FROM_STRING;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper2, function12);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivGifImageJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivGifImageJsonParser.ALPHA_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper3, function13, valueValidator, expression);
            if (readOptionalExpression3 != null) {
                expression = readOptionalExpression3;
            }
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.component.getDivAnimatorJsonEntityParser());
            DivAspect divAspect = (DivAspect) JsonPropertyParser.readOptional(parsingContext, jSONObject, "aspect", this.component.getDivAspectJsonEntityParser());
            List readOptionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, M2.g, this.component.getDivBackgroundJsonEntityParser());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.component.getDivBorderJsonEntityParser());
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = DivGifImageJsonParser.CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "capture_focus_on_action", typeHelper4, function14, expression2);
            if (readOptionalExpression4 != null) {
                expression2 = readOptionalExpression4;
            }
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function15 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper5, function15, DivGifImageJsonParser.COLUMN_SPAN_VALIDATOR);
            TypeHelper typeHelper6 = DivGifImageJsonParser.TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL;
            Expression expression3 = DivGifImageJsonParser.CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_horizontal", typeHelper6, function1, expression3);
            if (readOptionalExpression6 != null) {
                expression3 = readOptionalExpression6;
            }
            TypeHelper typeHelper7 = DivGifImageJsonParser.TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL;
            Expression expression4 = DivGifImageJsonParser.CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_vertical", typeHelper7, function12, expression4);
            Expression expression5 = readOptionalExpression7 == null ? expression4 : readOptionalExpression7;
            List readOptionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.component.getDivDisappearActionJsonEntityParser());
            List readOptionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "doubletap_actions", this.component.getDivActionJsonEntityParser());
            List readOptionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.component.getDivExtensionJsonEntityParser());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.component.getDivFocusJsonEntityParser());
            List readOptionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.component.getDivFunctionJsonEntityParser());
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, CampaignEx.JSON_KEY_GIF_URL, TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.component.getDivSizeJsonEntityParser());
            if (divSize == null) {
                divSize = DivGifImageJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            DivSize divSize2 = divSize;
            List readOptionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_end_actions", this.component.getDivActionJsonEntityParser());
            List readOptionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "hover_start_actions", this.component.getDivActionJsonEntityParser());
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.component.getDivLayoutProviderJsonEntityParser());
            List readOptionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "longtap_actions", this.component.getDivActionJsonEntityParser());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.component.getDivEdgeInsetsJsonEntityParser());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonEntityParser());
            TypeHelper<Integer> typeHelper8 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1 function16 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression6 = DivGifImageJsonParser.PLACEHOLDER_COLOR_DEFAULT_VALUE;
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "placeholder_color", typeHelper8, function16, expression6);
            Expression expression7 = readOptionalExpression8 == null ? expression6 : readOptionalExpression8;
            Expression expression8 = DivGifImageJsonParser.PRELOAD_REQUIRED_DEFAULT_VALUE;
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preload_required", typeHelper4, function14, expression8);
            Expression expression9 = readOptionalExpression9 == null ? expression8 : readOptionalExpression9;
            List readOptionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_end_actions", this.component.getDivActionJsonEntityParser());
            List readOptionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "press_start_actions", this.component.getDivActionJsonEntityParser());
            TypeHelper<String> typeHelper9 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preview", typeHelper9);
            Expression readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper9);
            Expression readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper5, function15, DivGifImageJsonParser.ROW_SPAN_VALIDATOR);
            TypeHelper typeHelper10 = DivGifImageJsonParser.TYPE_HELPER_SCALE;
            Function1 function17 = DivImageScale.FROM_STRING;
            Expression expression10 = DivGifImageJsonParser.SCALE_DEFAULT_VALUE;
            Expression readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scale", typeHelper10, function17, expression10);
            Expression expression11 = readOptionalExpression13 == null ? expression10 : readOptionalExpression13;
            List readOptionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.component.getDivActionJsonEntityParser());
            List readOptionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.component.getDivTooltipJsonEntityParser());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.component.getDivTransformJsonEntityParser());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.component.getDivChangeTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.component.getDivAppearanceTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.component.getDivAppearanceTransitionJsonEntityParser());
            List readOptionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivGifImageJsonParser.TRANSITION_TRIGGERS_VALIDATOR);
            List readOptionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.component.getDivTriggerJsonEntityParser());
            List readOptionalList17 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.component.getDivVariableJsonEntityParser());
            TypeHelper typeHelper11 = DivGifImageJsonParser.TYPE_HELPER_VISIBILITY;
            Function1 function18 = DivVisibility.FROM_STRING;
            Expression expression12 = DivGifImageJsonParser.VISIBILITY_DEFAULT_VALUE;
            Expression readOptionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, typeHelper11, function18, expression12);
            Expression expression13 = readOptionalExpression14 == null ? expression12 : readOptionalExpression14;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.component.getDivVisibilityActionJsonEntityParser());
            List readOptionalList18 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.component.getDivVisibilityActionJsonEntityParser());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.component.getDivSizeJsonEntityParser());
            if (divSize3 == null) {
                divSize3 = DivGifImageJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivGifImage(divAccessibility, divAction, divAnimation2, readOptionalList, readOptionalExpression, readOptionalExpression2, expression, readOptionalList2, divAspect, readOptionalList3, divBorder, expression2, readOptionalExpression5, expression3, expression5, readOptionalList4, readOptionalList5, readOptionalList6, divFocus, readOptionalList7, readExpression, divSize2, readOptionalList8, readOptionalList9, str, divLayoutProvider, readOptionalList10, divEdgeInsets, divEdgeInsets2, expression7, expression9, readOptionalList11, readOptionalList12, readOptionalExpression10, readOptionalExpression11, readOptionalExpression12, expression11, readOptionalList13, readOptionalList14, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, readOptionalList15, readOptionalList16, readOptionalList17, expression13, divVisibilityAction, readOptionalList18, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivGifImage divGifImage) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divGifImage.getAccessibility(), this.component.getDivAccessibilityJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "action", divGifImage.action, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "action_animation", divGifImage.actionAnimation, this.component.getDivAnimationJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", divGifImage.actions, this.component.getDivActionJsonEntityParser());
            Expression alignmentHorizontal = divGifImage.getAlignmentHorizontal();
            Function1 function1 = DivAlignmentHorizontal.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", alignmentHorizontal, function1);
            Expression alignmentVertical = divGifImage.getAlignmentVertical();
            Function1 function12 = DivAlignmentVertical.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", alignmentVertical, function12);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divGifImage.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divGifImage.getAnimators(), this.component.getDivAnimatorJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "aspect", divGifImage.aspect, this.component.getDivAspectJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, M2.g, divGifImage.getBackground(), this.component.getDivBackgroundJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divGifImage.getBorder(), this.component.getDivBorderJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "capture_focus_on_action", divGifImage.captureFocusOnAction);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divGifImage.getColumnSpan());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_horizontal", divGifImage.contentAlignmentHorizontal, function1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_vertical", divGifImage.contentAlignmentVertical, function12);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divGifImage.getDisappearActions(), this.component.getDivDisappearActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "doubletap_actions", divGifImage.doubletapActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divGifImage.getExtensions(), this.component.getDivExtensionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divGifImage.getFocus(), this.component.getDivFocusJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divGifImage.getFunctions(), this.component.getDivFunctionJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, CampaignEx.JSON_KEY_GIF_URL, divGifImage.gifUrl, ParsingConvertersKt.URI_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divGifImage.getHeight(), this.component.getDivSizeJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_end_actions", divGifImage.hoverEndActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "hover_start_actions", divGifImage.hoverStartActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divGifImage.getId());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divGifImage.getLayoutProvider(), this.component.getDivLayoutProviderJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "longtap_actions", divGifImage.longtapActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divGifImage.getMargins(), this.component.getDivEdgeInsetsJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divGifImage.getPaddings(), this.component.getDivEdgeInsetsJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "placeholder_color", divGifImage.placeholderColor, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preload_required", divGifImage.preloadRequired);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_end_actions", divGifImage.pressEndActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "press_start_actions", divGifImage.pressStartActions, this.component.getDivActionJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preview", divGifImage.preview);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divGifImage.getReuseId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divGifImage.getRowSpan());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scale", divGifImage.scale, DivImageScale.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divGifImage.getSelectedActions(), this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divGifImage.getTooltips(), this.component.getDivTooltipJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divGifImage.getTransform(), this.component.getDivTransformJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divGifImage.getTransitionChange(), this.component.getDivChangeTransitionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divGifImage.getTransitionIn(), this.component.getDivAppearanceTransitionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divGifImage.getTransitionOut(), this.component.getDivAppearanceTransitionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divGifImage.getTransitionTriggers(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "gif");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divGifImage.getVariableTriggers(), this.component.getDivTriggerJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divGifImage.getVariables(), this.component.getDivVariableJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, divGifImage.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divGifImage.getVisibilityAction(), this.component.getDivVisibilityActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divGifImage.getVisibilityActions(), this.component.getDivVisibilityActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divGifImage.getWidth(), this.component.getDivSizeJsonEntityParser());
            return jSONObject;
        }
    }

    /* compiled from: DivGifImageJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivGifImageTemplate deserialize(ParsingContext parsingContext, DivGifImageTemplate divGifImageTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.accessibility : null, this.component.getDivAccessibilityJsonTemplateParser());
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "action", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.action : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "action_animation", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.actionAnimation : null, this.component.getDivAnimationJsonTemplateParser());
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.actions : null, this.component.getDivActionJsonTemplateParser());
            TypeHelper typeHelper = DivGifImageJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL;
            Field field = divGifImageTemplate != null ? divGifImageTemplate.alignmentHorizontal : null;
            Function1 function1 = DivAlignmentHorizontal.FROM_STRING;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_horizontal", typeHelper, allowPropertyOverride, field, function1);
            TypeHelper typeHelper2 = DivGifImageJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL;
            Field field2 = divGifImageTemplate != null ? divGifImageTemplate.alignmentVertical : null;
            Function1 function12 = DivAlignmentVertical.FROM_STRING;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", typeHelper2, allowPropertyOverride, field2, function12);
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.alpha : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivGifImageJsonParser.ALPHA_VALIDATOR);
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.animators : null, this.component.getDivAnimatorJsonTemplateParser());
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "aspect", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.aspect : null, this.component.getDivAspectJsonTemplateParser());
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, M2.g, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.background : null, this.component.getDivBackgroundJsonTemplateParser());
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.border : null, this.component.getDivBorderJsonTemplateParser());
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field3 = divGifImageTemplate != null ? divGifImageTemplate.captureFocusOnAction : null;
            Function1 function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "capture_focus_on_action", typeHelper3, allowPropertyOverride, field3, function13);
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Field field4 = divGifImageTemplate != null ? divGifImageTemplate.columnSpan : null;
            Function1 function14 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_span", typeHelper4, allowPropertyOverride, field4, function14, DivGifImageJsonParser.COLUMN_SPAN_VALIDATOR);
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "content_alignment_horizontal", DivGifImageJsonParser.TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.contentAlignmentHorizontal : null, function1);
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "content_alignment_vertical", DivGifImageJsonParser.TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.contentAlignmentVertical : null, function12);
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.disappearActions : null, this.component.getDivDisappearActionJsonTemplateParser());
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "doubletap_actions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.doubletapActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.extensions : null, this.component.getDivExtensionJsonTemplateParser());
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.focus : null, this.component.getDivFocusJsonTemplateParser());
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.functions : null, this.component.getDivFunctionJsonTemplateParser());
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, CampaignEx.JSON_KEY_GIF_URL, TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.gifUrl : null, ParsingConvertersKt.ANY_TO_URI);
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.height : null, this.component.getDivSizeJsonTemplateParser());
            Field readOptionalListField8 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "hover_end_actions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.hoverEndActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalListField9 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "hover_start_actions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.hoverStartActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.id : null);
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.layoutProvider : null, this.component.getDivLayoutProviderJsonTemplateParser());
            Field readOptionalListField10 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "longtap_actions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.longtapActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.margins : null, this.component.getDivEdgeInsetsJsonTemplateParser());
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.paddings : null, this.component.getDivEdgeInsetsJsonTemplateParser());
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "placeholder_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.placeholderColor : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "preload_required", typeHelper3, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.preloadRequired : null, function13);
            Field readOptionalListField11 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "press_end_actions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.pressEndActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalListField12 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "press_start_actions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.pressStartActions : null, this.component.getDivActionJsonTemplateParser());
            TypeHelper<String> typeHelper5 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field readOptionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "preview", typeHelper5, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.preview : null);
            Field readOptionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reuse_id", typeHelper5, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.reuseId : null);
            Field readOptionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "row_span", typeHelper4, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.rowSpan : null, function14, DivGifImageJsonParser.ROW_SPAN_VALIDATOR);
            Field readOptionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "scale", DivGifImageJsonParser.TYPE_HELPER_SCALE, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.scale : null, DivImageScale.FROM_STRING);
            Field readOptionalListField13 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.selectedActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalListField14 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.tooltips : null, this.component.getDivTooltipJsonTemplateParser());
            Field readOptionalField12 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.transform : null, this.component.getDivTransformJsonTemplateParser());
            Field readOptionalField13 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.transitionChange : null, this.component.getDivChangeTransitionJsonTemplateParser());
            Field readOptionalField14 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.transitionIn : null, this.component.getDivAppearanceTransitionJsonTemplateParser());
            Field readOptionalField15 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.transitionOut : null, this.component.getDivAppearanceTransitionJsonTemplateParser());
            Field field5 = divGifImageTemplate != null ? divGifImageTemplate.transitionTriggers : null;
            Function1 function15 = DivTransitionTrigger.FROM_STRING;
            ListValidator listValidator = DivGifImageJsonParser.TRANSITION_TRIGGERS_VALIDATOR;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivGifImageTemplate(readOptionalField, readOptionalField2, readOptionalField3, readOptionalListField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField2, readOptionalField4, readOptionalListField3, readOptionalField5, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalFieldWithExpression7, readOptionalListField4, readOptionalListField5, readOptionalListField6, readOptionalField6, readOptionalListField7, readFieldWithExpression, readOptionalField7, readOptionalListField8, readOptionalListField9, readOptionalField8, readOptionalField9, readOptionalListField10, readOptionalField10, readOptionalField11, readOptionalFieldWithExpression8, readOptionalFieldWithExpression9, readOptionalListField11, readOptionalListField12, readOptionalFieldWithExpression10, readOptionalFieldWithExpression11, readOptionalFieldWithExpression12, readOptionalFieldWithExpression13, readOptionalListField13, readOptionalListField14, readOptionalField12, readOptionalField13, readOptionalField14, readOptionalField15, JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field5, function15, listValidator), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.variableTriggers : null, this.component.getDivTriggerJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.variables : null, this.component.getDivVariableJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, DivGifImageJsonParser.TYPE_HELPER_VISIBILITY, allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.visibility : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.visibilityAction : null, this.component.getDivVisibilityActionJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.visibilityActions : null, this.component.getDivVisibilityActionJsonTemplateParser()), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divGifImageTemplate != null ? divGifImageTemplate.width : null, this.component.getDivSizeJsonTemplateParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivGifImageTemplate divGifImageTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divGifImageTemplate.accessibility, this.component.getDivAccessibilityJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action", divGifImageTemplate.action, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "action_animation", divGifImageTemplate.actionAnimation, this.component.getDivAnimationJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", divGifImageTemplate.actions, this.component.getDivActionJsonTemplateParser());
            Field field = divGifImageTemplate.alignmentHorizontal;
            Function1 function1 = DivAlignmentHorizontal.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", field, function1);
            Field field2 = divGifImageTemplate.alignmentVertical;
            Function1 function12 = DivAlignmentVertical.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", field2, function12);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divGifImageTemplate.alpha);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divGifImageTemplate.animators, this.component.getDivAnimatorJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "aspect", divGifImageTemplate.aspect, this.component.getDivAspectJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, M2.g, divGifImageTemplate.background, this.component.getDivBackgroundJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", divGifImageTemplate.border, this.component.getDivBorderJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "capture_focus_on_action", divGifImageTemplate.captureFocusOnAction);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divGifImageTemplate.columnSpan);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_horizontal", divGifImageTemplate.contentAlignmentHorizontal, function1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_vertical", divGifImageTemplate.contentAlignmentVertical, function12);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divGifImageTemplate.disappearActions, this.component.getDivDisappearActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "doubletap_actions", divGifImageTemplate.doubletapActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divGifImageTemplate.extensions, this.component.getDivExtensionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divGifImageTemplate.focus, this.component.getDivFocusJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divGifImageTemplate.functions, this.component.getDivFunctionJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, CampaignEx.JSON_KEY_GIF_URL, divGifImageTemplate.gifUrl, ParsingConvertersKt.URI_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divGifImageTemplate.height, this.component.getDivSizeJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_end_actions", divGifImageTemplate.hoverEndActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "hover_start_actions", divGifImageTemplate.hoverStartActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divGifImageTemplate.id);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divGifImageTemplate.layoutProvider, this.component.getDivLayoutProviderJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "longtap_actions", divGifImageTemplate.longtapActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divGifImageTemplate.margins, this.component.getDivEdgeInsetsJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divGifImageTemplate.paddings, this.component.getDivEdgeInsetsJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "placeholder_color", divGifImageTemplate.placeholderColor, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preload_required", divGifImageTemplate.preloadRequired);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_end_actions", divGifImageTemplate.pressEndActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "press_start_actions", divGifImageTemplate.pressStartActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preview", divGifImageTemplate.preview);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divGifImageTemplate.reuseId);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divGifImageTemplate.rowSpan);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scale", divGifImageTemplate.scale, DivImageScale.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divGifImageTemplate.selectedActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divGifImageTemplate.tooltips, this.component.getDivTooltipJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divGifImageTemplate.transform, this.component.getDivTransformJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divGifImageTemplate.transitionChange, this.component.getDivChangeTransitionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divGifImageTemplate.transitionIn, this.component.getDivAppearanceTransitionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divGifImageTemplate.transitionOut, this.component.getDivAppearanceTransitionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divGifImageTemplate.transitionTriggers, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "gif");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divGifImageTemplate.variableTriggers, this.component.getDivTriggerJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divGifImageTemplate.variables, this.component.getDivVariableJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, divGifImageTemplate.visibility, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divGifImageTemplate.visibilityAction, this.component.getDivVisibilityActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divGifImageTemplate.visibilityActions, this.component.getDivVisibilityActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divGifImageTemplate.width, this.component.getDivSizeJsonTemplateParser());
            return jSONObject;
        }
    }

    /* compiled from: DivGifImageJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivGifImage resolve(ParsingContext parsingContext, DivGifImageTemplate divGifImageTemplate, JSONObject jSONObject) {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.accessibility, jSONObject, "accessibility", this.component.getDivAccessibilityJsonTemplateResolver(), this.component.getDivAccessibilityJsonEntityParser());
            DivAction divAction = (DivAction) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.action, jSONObject, "action", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            DivAnimation divAnimation = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.actionAnimation, jSONObject, "action_animation", this.component.getDivAnimationJsonTemplateResolver(), this.component.getDivAnimationJsonEntityParser());
            if (divAnimation == null) {
                divAnimation = DivGifImageJsonParser.ACTION_ANIMATION_DEFAULT_VALUE;
            }
            DivAnimation divAnimation2 = divAnimation;
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.actions, jSONObject, "actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            Field field = divGifImageTemplate.alignmentHorizontal;
            TypeHelper typeHelper = DivGifImageJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL;
            Function1 function1 = DivAlignmentHorizontal.FROM_STRING;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alignment_horizontal", typeHelper, function1);
            Field field2 = divGifImageTemplate.alignmentVertical;
            TypeHelper typeHelper2 = DivGifImageJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL;
            Function1 function12 = DivAlignmentVertical.FROM_STRING;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "alignment_vertical", typeHelper2, function12);
            Field field3 = divGifImageTemplate.alpha;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivGifImageJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivGifImageJsonParser.ALPHA_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "alpha", typeHelper3, function13, valueValidator, expression);
            Expression expression2 = resolveOptionalExpression3 == null ? expression : resolveOptionalExpression3;
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.animators, jSONObject, "animators", this.component.getDivAnimatorJsonTemplateResolver(), this.component.getDivAnimatorJsonEntityParser());
            DivAspect divAspect = (DivAspect) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.aspect, jSONObject, "aspect", this.component.getDivAspectJsonTemplateResolver(), this.component.getDivAspectJsonEntityParser());
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.background, jSONObject, M2.g, this.component.getDivBackgroundJsonTemplateResolver(), this.component.getDivBackgroundJsonEntityParser());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.border, jSONObject, "border", this.component.getDivBorderJsonTemplateResolver(), this.component.getDivBorderJsonEntityParser());
            Field field4 = divGifImageTemplate.captureFocusOnAction;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression3 = DivGifImageJsonParser.CAPTURE_FOCUS_ON_ACTION_DEFAULT_VALUE;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "capture_focus_on_action", typeHelper4, function14, expression3);
            if (resolveOptionalExpression4 != null) {
                expression3 = resolveOptionalExpression4;
            }
            Field field5 = divGifImageTemplate.columnSpan;
            TypeHelper<Long> typeHelper5 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function15 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "column_span", typeHelper5, function15, DivGifImageJsonParser.COLUMN_SPAN_VALIDATOR);
            Field field6 = divGifImageTemplate.contentAlignmentHorizontal;
            TypeHelper typeHelper6 = DivGifImageJsonParser.TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL;
            Expression expression4 = DivGifImageJsonParser.CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "content_alignment_horizontal", typeHelper6, function1, expression4);
            if (resolveOptionalExpression6 != null) {
                expression4 = resolveOptionalExpression6;
            }
            Field field7 = divGifImageTemplate.contentAlignmentVertical;
            TypeHelper typeHelper7 = DivGifImageJsonParser.TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL;
            Expression expression5 = DivGifImageJsonParser.CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "content_alignment_vertical", typeHelper7, function12, expression5);
            if (resolveOptionalExpression7 != null) {
                expression5 = resolveOptionalExpression7;
            }
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.disappearActions, jSONObject, "disappear_actions", this.component.getDivDisappearActionJsonTemplateResolver(), this.component.getDivDisappearActionJsonEntityParser());
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.doubletapActions, jSONObject, "doubletap_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.extensions, jSONObject, "extensions", this.component.getDivExtensionJsonTemplateResolver(), this.component.getDivExtensionJsonEntityParser());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.focus, jSONObject, "focus", this.component.getDivFocusJsonTemplateResolver(), this.component.getDivFocusJsonEntityParser());
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.functions, jSONObject, "functions", this.component.getDivFunctionJsonTemplateResolver(), this.component.getDivFunctionJsonEntityParser());
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divGifImageTemplate.gifUrl, jSONObject, CampaignEx.JSON_KEY_GIF_URL, TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.height, jSONObject, "height", this.component.getDivSizeJsonTemplateResolver(), this.component.getDivSizeJsonEntityParser());
            if (divSize == null) {
                divSize = DivGifImageJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            DivSize divSize2 = divSize;
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.hoverEndActions, jSONObject, "hover_end_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.hoverStartActions, jSONObject, "hover_start_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.id, jSONObject, "id");
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.layoutProvider, jSONObject, "layout_provider", this.component.getDivLayoutProviderJsonTemplateResolver(), this.component.getDivLayoutProviderJsonEntityParser());
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.longtapActions, jSONObject, "longtap_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.margins, jSONObject, "margins", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.paddings, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            Field field8 = divGifImageTemplate.placeholderColor;
            TypeHelper<Integer> typeHelper8 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1 function16 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression6 = DivGifImageJsonParser.PLACEHOLDER_COLOR_DEFAULT_VALUE;
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "placeholder_color", typeHelper8, function16, expression6);
            if (resolveOptionalExpression8 != null) {
                expression6 = resolveOptionalExpression8;
            }
            Field field9 = divGifImageTemplate.preloadRequired;
            Expression expression7 = DivGifImageJsonParser.PRELOAD_REQUIRED_DEFAULT_VALUE;
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "preload_required", typeHelper4, function14, expression7);
            if (resolveOptionalExpression9 != null) {
                expression7 = resolveOptionalExpression9;
            }
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.pressEndActions, jSONObject, "press_end_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.pressStartActions, jSONObject, "press_start_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            Field field10 = divGifImageTemplate.preview;
            TypeHelper<String> typeHelper9 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "preview", typeHelper9);
            Expression resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divGifImageTemplate.reuseId, jSONObject, "reuse_id", typeHelper9);
            Expression resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divGifImageTemplate.rowSpan, jSONObject, "row_span", typeHelper5, function15, DivGifImageJsonParser.ROW_SPAN_VALIDATOR);
            Field field11 = divGifImageTemplate.scale;
            TypeHelper typeHelper10 = DivGifImageJsonParser.TYPE_HELPER_SCALE;
            Function1 function17 = DivImageScale.FROM_STRING;
            Expression expression8 = DivGifImageJsonParser.SCALE_DEFAULT_VALUE;
            Expression resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field11, jSONObject, "scale", typeHelper10, function17, expression8);
            Expression expression9 = resolveOptionalExpression13 == null ? expression8 : resolveOptionalExpression13;
            List resolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.selectedActions, jSONObject, "selected_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            List resolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.tooltips, jSONObject, "tooltips", this.component.getDivTooltipJsonTemplateResolver(), this.component.getDivTooltipJsonEntityParser());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.transform, jSONObject, "transform", this.component.getDivTransformJsonTemplateResolver(), this.component.getDivTransformJsonEntityParser());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.transitionChange, jSONObject, "transition_change", this.component.getDivChangeTransitionJsonTemplateResolver(), this.component.getDivChangeTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.transitionIn, jSONObject, "transition_in", this.component.getDivAppearanceTransitionJsonTemplateResolver(), this.component.getDivAppearanceTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.transitionOut, jSONObject, "transition_out", this.component.getDivAppearanceTransitionJsonTemplateResolver(), this.component.getDivAppearanceTransitionJsonEntityParser());
            List resolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.transitionTriggers, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivGifImageJsonParser.TRANSITION_TRIGGERS_VALIDATOR);
            List resolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.variableTriggers, jSONObject, "variable_triggers", this.component.getDivTriggerJsonTemplateResolver(), this.component.getDivTriggerJsonEntityParser());
            List resolveOptionalList17 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.variables, jSONObject, "variables", this.component.getDivVariableJsonTemplateResolver(), this.component.getDivVariableJsonEntityParser());
            Field field12 = divGifImageTemplate.visibility;
            TypeHelper typeHelper11 = DivGifImageJsonParser.TYPE_HELPER_VISIBILITY;
            Function1 function18 = DivVisibility.FROM_STRING;
            Expression expression10 = DivGifImageJsonParser.VISIBILITY_DEFAULT_VALUE;
            Expression resolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field12, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, typeHelper11, function18, expression10);
            Expression expression11 = resolveOptionalExpression14 == null ? expression10 : resolveOptionalExpression14;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.visibilityAction, jSONObject, "visibility_action", this.component.getDivVisibilityActionJsonTemplateResolver(), this.component.getDivVisibilityActionJsonEntityParser());
            List resolveOptionalList18 = JsonFieldResolver.resolveOptionalList(parsingContext, divGifImageTemplate.visibilityActions, jSONObject, "visibility_actions", this.component.getDivVisibilityActionJsonTemplateResolver(), this.component.getDivVisibilityActionJsonEntityParser());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divGifImageTemplate.width, jSONObject, "width", this.component.getDivSizeJsonTemplateResolver(), this.component.getDivSizeJsonEntityParser());
            if (divSize3 == null) {
                divSize3 = DivGifImageJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivGifImage(divAccessibility, divAction, divAnimation2, resolveOptionalList, resolveOptionalExpression, resolveOptionalExpression2, expression2, resolveOptionalList2, divAspect, resolveOptionalList3, divBorder, expression3, resolveOptionalExpression5, expression4, expression5, resolveOptionalList4, resolveOptionalList5, resolveOptionalList6, divFocus, resolveOptionalList7, resolveExpression, divSize2, resolveOptionalList8, resolveOptionalList9, str, divLayoutProvider, resolveOptionalList10, divEdgeInsets, divEdgeInsets2, expression6, expression7, resolveOptionalList11, resolveOptionalList12, resolveOptionalExpression10, resolveOptionalExpression11, resolveOptionalExpression12, expression9, resolveOptionalList13, resolveOptionalList14, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, resolveOptionalList15, resolveOptionalList16, resolveOptionalList17, expression11, divVisibilityAction, resolveOptionalList18, divSize3);
        }
    }

    /* compiled from: DivGifImageJsonParser.kt */
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
        PLACEHOLDER_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Integer.valueOf(DivSeparatorView.DEFAULT_DIVIDER_COLOR), null, 2, null);
        PRELOAD_REQUIRED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        DivImageScale divImageScale = DivImageScale.FILL;
        SCALE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divImageScale, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        TYPE_HELPER_ALIGNMENT_HORIZONTAL = companion2.from(ArraysKt.first(DivAlignmentHorizontal.values()), new Function1() { // from class: com.yandex.div2.DivGifImageJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        TYPE_HELPER_ALIGNMENT_VERTICAL = companion2.from(ArraysKt.first(DivAlignmentVertical.values()), new Function1() { // from class: com.yandex.div2.DivGifImageJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL = companion2.from(divAlignmentHorizontal, new Function1() { // from class: com.yandex.div2.DivGifImageJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL = companion2.from(divAlignmentVertical, new Function1() { // from class: com.yandex.div2.DivGifImageJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        TYPE_HELPER_SCALE = companion2.from(divImageScale, new Function1() { // from class: com.yandex.div2.DivGifImageJsonParser$Companion$TYPE_HELPER_SCALE$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivImageScale);
            }
        });
        TYPE_HELPER_VISIBILITY = companion2.from(divVisibility, new Function1() { // from class: com.yandex.div2.DivGifImageJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        ALPHA_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivGifImageJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ALPHA_VALIDATOR$lambda$0;
                ALPHA_VALIDATOR$lambda$0 = DivGifImageJsonParser.ALPHA_VALIDATOR$lambda$0(((Double) obj).doubleValue());
                return ALPHA_VALIDATOR$lambda$0;
            }
        };
        COLUMN_SPAN_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivGifImageJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean COLUMN_SPAN_VALIDATOR$lambda$1;
                COLUMN_SPAN_VALIDATOR$lambda$1 = DivGifImageJsonParser.COLUMN_SPAN_VALIDATOR$lambda$1(((Long) obj).longValue());
                return COLUMN_SPAN_VALIDATOR$lambda$1;
            }
        };
        ROW_SPAN_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivGifImageJsonParser$$ExternalSyntheticLambda2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ROW_SPAN_VALIDATOR$lambda$2;
                ROW_SPAN_VALIDATOR$lambda$2 = DivGifImageJsonParser.ROW_SPAN_VALIDATOR$lambda$2(((Long) obj).longValue());
                return ROW_SPAN_VALIDATOR$lambda$2;
            }
        };
        TRANSITION_TRIGGERS_VALIDATOR = new ListValidator() { // from class: com.yandex.div2.DivGifImageJsonParser$$ExternalSyntheticLambda3
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean TRANSITION_TRIGGERS_VALIDATOR$lambda$3;
                TRANSITION_TRIGGERS_VALIDATOR$lambda$3 = DivGifImageJsonParser.TRANSITION_TRIGGERS_VALIDATOR$lambda$3(list);
                return TRANSITION_TRIGGERS_VALIDATOR$lambda$3;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TRANSITION_TRIGGERS_VALIDATOR$lambda$3(List list) {
        return list.size() >= 1;
    }
}
