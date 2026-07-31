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
import io.appmetrica.analytics.impl.M2;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivCustomJsonParser.kt */
/* loaded from: classes9.dex */
public abstract class DivCustomJsonParser {
    public static final Expression ALPHA_DEFAULT_VALUE;
    public static final ValueValidator ALPHA_VALIDATOR;
    public static final ValueValidator COLUMN_SPAN_VALIDATOR;
    private static final Companion Companion = new Companion(null);
    public static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
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

    /* compiled from: DivCustomJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivCustom deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.component.getDivAccessibilityJsonEntityParser());
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", DivCustomJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL, DivAlignmentHorizontal.FROM_STRING);
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivCustomJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivCustomJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivCustomJsonParser.ALPHA_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression3 != null) {
                expression = readOptionalExpression3;
            }
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.component.getDivAnimatorJsonEntityParser());
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, M2.g, this.component.getDivBackgroundJsonEntityParser());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.component.getDivBorderJsonEntityParser());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, function12, DivCustomJsonParser.COLUMN_SPAN_VALIDATOR);
            JSONObject jSONObject2 = (JSONObject) JsonPropertyParser.readOptional(parsingContext, jSONObject, "custom_props");
            String str = (String) JsonPropertyParser.read(parsingContext, jSONObject, "custom_type");
            List readOptionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.component.getDivDisappearActionJsonEntityParser());
            List readOptionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.component.getDivExtensionJsonEntityParser());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.component.getDivFocusJsonEntityParser());
            List readOptionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.component.getDivFunctionJsonEntityParser());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.component.getDivSizeJsonEntityParser());
            if (divSize == null) {
                divSize = DivCustomJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            DivSize divSize2 = divSize;
            String str2 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            List readOptionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "items", this.component.getDivJsonEntityParser());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.component.getDivLayoutProviderJsonEntityParser());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.component.getDivEdgeInsetsJsonEntityParser());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonEntityParser());
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, function12, DivCustomJsonParser.ROW_SPAN_VALIDATOR);
            List readOptionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.component.getDivActionJsonEntityParser());
            List readOptionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.component.getDivTooltipJsonEntityParser());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.component.getDivTransformJsonEntityParser());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.component.getDivChangeTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.component.getDivAppearanceTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.component.getDivAppearanceTransitionJsonEntityParser());
            List readOptionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivCustomJsonParser.TRANSITION_TRIGGERS_VALIDATOR);
            List readOptionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.component.getDivTriggerJsonEntityParser());
            List readOptionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.component.getDivVariableJsonEntityParser());
            TypeHelper typeHelper3 = DivCustomJsonParser.TYPE_HELPER_VISIBILITY;
            Function1 function13 = DivVisibility.FROM_STRING;
            Expression expression2 = DivCustomJsonParser.VISIBILITY_DEFAULT_VALUE;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, typeHelper3, function13, expression2);
            Expression expression3 = readOptionalExpression7 == null ? expression2 : readOptionalExpression7;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.component.getDivVisibilityActionJsonEntityParser());
            List readOptionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.component.getDivVisibilityActionJsonEntityParser());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.component.getDivSizeJsonEntityParser());
            if (divSize3 == null) {
                divSize3 = DivCustomJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivCustom(divAccessibility, readOptionalExpression, readOptionalExpression2, expression, readOptionalList, readOptionalList2, divBorder, readOptionalExpression4, jSONObject2, str, readOptionalList3, readOptionalList4, divFocus, readOptionalList5, divSize2, str2, readOptionalList6, divLayoutProvider, divEdgeInsets, divEdgeInsets2, readOptionalExpression5, readOptionalExpression6, readOptionalList7, readOptionalList8, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, readOptionalList9, readOptionalList10, readOptionalList11, expression3, divVisibilityAction, readOptionalList12, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivCustom divCustom) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divCustom.getAccessibility(), this.component.getDivAccessibilityJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divCustom.getAlignmentHorizontal(), DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divCustom.getAlignmentVertical(), DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divCustom.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divCustom.getAnimators(), this.component.getDivAnimatorJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, M2.g, divCustom.getBackground(), this.component.getDivBackgroundJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divCustom.getBorder(), this.component.getDivBorderJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divCustom.getColumnSpan());
            JsonPropertyParser.write(parsingContext, jSONObject, "custom_props", divCustom.customProps);
            JsonPropertyParser.write(parsingContext, jSONObject, "custom_type", divCustom.customType);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divCustom.getDisappearActions(), this.component.getDivDisappearActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divCustom.getExtensions(), this.component.getDivExtensionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divCustom.getFocus(), this.component.getDivFocusJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divCustom.getFunctions(), this.component.getDivFunctionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divCustom.getHeight(), this.component.getDivSizeJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divCustom.getId());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", divCustom.items, this.component.getDivJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divCustom.getLayoutProvider(), this.component.getDivLayoutProviderJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divCustom.getMargins(), this.component.getDivEdgeInsetsJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divCustom.getPaddings(), this.component.getDivEdgeInsetsJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divCustom.getReuseId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divCustom.getRowSpan());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divCustom.getSelectedActions(), this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divCustom.getTooltips(), this.component.getDivTooltipJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divCustom.getTransform(), this.component.getDivTransformJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divCustom.getTransitionChange(), this.component.getDivChangeTransitionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divCustom.getTransitionIn(), this.component.getDivAppearanceTransitionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divCustom.getTransitionOut(), this.component.getDivAppearanceTransitionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divCustom.getTransitionTriggers(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "custom");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divCustom.getVariableTriggers(), this.component.getDivTriggerJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divCustom.getVariables(), this.component.getDivVariableJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, divCustom.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divCustom.getVisibilityAction(), this.component.getDivVisibilityActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divCustom.getVisibilityActions(), this.component.getDivVisibilityActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divCustom.getWidth(), this.component.getDivSizeJsonEntityParser());
            return jSONObject;
        }
    }

    /* compiled from: DivCustomJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivCustomTemplate deserialize(ParsingContext parsingContext, DivCustomTemplate divCustomTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.accessibility : null, this.component.getDivAccessibilityJsonTemplateParser());
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_horizontal", DivCustomJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL, allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.alignmentHorizontal : null, DivAlignmentHorizontal.FROM_STRING);
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", DivCustomJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.alignmentVertical : null, DivAlignmentVertical.FROM_STRING);
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.alpha : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivCustomJsonParser.ALPHA_VALIDATOR);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.animators : null, this.component.getDivAnimatorJsonTemplateParser());
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, M2.g, allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.background : null, this.component.getDivBackgroundJsonTemplateParser());
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.border : null, this.component.getDivBorderJsonTemplateParser());
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = divCustomTemplate != null ? divCustomTemplate.columnSpan : null;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, field, function1, DivCustomJsonParser.COLUMN_SPAN_VALIDATOR);
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "custom_props", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.customProps : null);
            Field readField = JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "custom_type", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.customType : null);
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.disappearActions : null, this.component.getDivDisappearActionJsonTemplateParser());
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.extensions : null, this.component.getDivExtensionJsonTemplateParser());
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.focus : null, this.component.getDivFocusJsonTemplateParser());
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.functions : null, this.component.getDivFunctionJsonTemplateParser());
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.height : null, this.component.getDivSizeJsonTemplateParser());
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.id : null);
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "items", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.items : null, this.component.getDivJsonTemplateParser());
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.layoutProvider : null, this.component.getDivLayoutProviderJsonTemplateParser());
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.margins : null, this.component.getDivEdgeInsetsJsonTemplateParser());
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.paddings : null, this.component.getDivEdgeInsetsJsonTemplateParser());
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.reuseId : null);
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.rowSpan : null, function1, DivCustomJsonParser.ROW_SPAN_VALIDATOR);
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.selectedActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalListField8 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.tooltips : null, this.component.getDivTooltipJsonTemplateParser());
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.transform : null, this.component.getDivTransformJsonTemplateParser());
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.transitionChange : null, this.component.getDivChangeTransitionJsonTemplateParser());
            Field readOptionalField12 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.transitionIn : null, this.component.getDivAppearanceTransitionJsonTemplateParser());
            Field readOptionalField13 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.transitionOut : null, this.component.getDivAppearanceTransitionJsonTemplateParser());
            Field field2 = divCustomTemplate != null ? divCustomTemplate.transitionTriggers : null;
            Function1 function12 = DivTransitionTrigger.FROM_STRING;
            ListValidator listValidator = DivCustomJsonParser.TRANSITION_TRIGGERS_VALIDATOR;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivCustomTemplate(readOptionalField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField, readOptionalListField2, readOptionalField2, readOptionalFieldWithExpression4, readOptionalField3, readField, readOptionalListField3, readOptionalListField4, readOptionalField4, readOptionalListField5, readOptionalField5, readOptionalField6, readOptionalListField6, readOptionalField7, readOptionalField8, readOptionalField9, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalListField7, readOptionalListField8, readOptionalField10, readOptionalField11, readOptionalField12, readOptionalField13, JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field2, function12, listValidator), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.variableTriggers : null, this.component.getDivTriggerJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.variables : null, this.component.getDivVariableJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, DivCustomJsonParser.TYPE_HELPER_VISIBILITY, allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.visibility : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.visibilityAction : null, this.component.getDivVisibilityActionJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.visibilityActions : null, this.component.getDivVisibilityActionJsonTemplateParser()), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divCustomTemplate != null ? divCustomTemplate.width : null, this.component.getDivSizeJsonTemplateParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivCustomTemplate divCustomTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divCustomTemplate.accessibility, this.component.getDivAccessibilityJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", divCustomTemplate.alignmentHorizontal, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", divCustomTemplate.alignmentVertical, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divCustomTemplate.alpha);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divCustomTemplate.animators, this.component.getDivAnimatorJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, M2.g, divCustomTemplate.background, this.component.getDivBackgroundJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", divCustomTemplate.border, this.component.getDivBorderJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divCustomTemplate.columnSpan);
            JsonFieldParser.writeField(parsingContext, jSONObject, "custom_props", divCustomTemplate.customProps);
            JsonFieldParser.writeField(parsingContext, jSONObject, "custom_type", divCustomTemplate.customType);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divCustomTemplate.disappearActions, this.component.getDivDisappearActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divCustomTemplate.extensions, this.component.getDivExtensionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divCustomTemplate.focus, this.component.getDivFocusJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divCustomTemplate.functions, this.component.getDivFunctionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divCustomTemplate.height, this.component.getDivSizeJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divCustomTemplate.id);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", divCustomTemplate.items, this.component.getDivJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divCustomTemplate.layoutProvider, this.component.getDivLayoutProviderJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divCustomTemplate.margins, this.component.getDivEdgeInsetsJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divCustomTemplate.paddings, this.component.getDivEdgeInsetsJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divCustomTemplate.reuseId);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divCustomTemplate.rowSpan);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divCustomTemplate.selectedActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divCustomTemplate.tooltips, this.component.getDivTooltipJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divCustomTemplate.transform, this.component.getDivTransformJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divCustomTemplate.transitionChange, this.component.getDivChangeTransitionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divCustomTemplate.transitionIn, this.component.getDivAppearanceTransitionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divCustomTemplate.transitionOut, this.component.getDivAppearanceTransitionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divCustomTemplate.transitionTriggers, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "custom");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divCustomTemplate.variableTriggers, this.component.getDivTriggerJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divCustomTemplate.variables, this.component.getDivVariableJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, divCustomTemplate.visibility, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divCustomTemplate.visibilityAction, this.component.getDivVisibilityActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divCustomTemplate.visibilityActions, this.component.getDivVisibilityActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divCustomTemplate.width, this.component.getDivSizeJsonTemplateParser());
            return jSONObject;
        }
    }

    /* compiled from: DivCustomJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivCustom resolve(ParsingContext parsingContext, DivCustomTemplate divCustomTemplate, JSONObject jSONObject) {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.accessibility, jSONObject, "accessibility", this.component.getDivAccessibilityJsonTemplateResolver(), this.component.getDivAccessibilityJsonEntityParser());
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divCustomTemplate.alignmentHorizontal, jSONObject, "alignment_horizontal", DivCustomJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL, DivAlignmentHorizontal.FROM_STRING);
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divCustomTemplate.alignmentVertical, jSONObject, "alignment_vertical", DivCustomJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, DivAlignmentVertical.FROM_STRING);
            Field field = divCustomTemplate.alpha;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivCustomJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivCustomJsonParser.ALPHA_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression3 != null) {
                expression = resolveOptionalExpression3;
            }
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.animators, jSONObject, "animators", this.component.getDivAnimatorJsonTemplateResolver(), this.component.getDivAnimatorJsonEntityParser());
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.background, jSONObject, M2.g, this.component.getDivBackgroundJsonTemplateResolver(), this.component.getDivBackgroundJsonEntityParser());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.border, jSONObject, "border", this.component.getDivBorderJsonTemplateResolver(), this.component.getDivBorderJsonEntityParser());
            Field field2 = divCustomTemplate.columnSpan;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "column_span", typeHelper2, function12, DivCustomJsonParser.COLUMN_SPAN_VALIDATOR);
            JSONObject jSONObject2 = (JSONObject) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.customProps, jSONObject, "custom_props");
            String str = (String) JsonFieldResolver.resolve(parsingContext, divCustomTemplate.customType, jSONObject, "custom_type");
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.disappearActions, jSONObject, "disappear_actions", this.component.getDivDisappearActionJsonTemplateResolver(), this.component.getDivDisappearActionJsonEntityParser());
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.extensions, jSONObject, "extensions", this.component.getDivExtensionJsonTemplateResolver(), this.component.getDivExtensionJsonEntityParser());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.focus, jSONObject, "focus", this.component.getDivFocusJsonTemplateResolver(), this.component.getDivFocusJsonEntityParser());
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.functions, jSONObject, "functions", this.component.getDivFunctionJsonTemplateResolver(), this.component.getDivFunctionJsonEntityParser());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.height, jSONObject, "height", this.component.getDivSizeJsonTemplateResolver(), this.component.getDivSizeJsonEntityParser());
            if (divSize == null) {
                divSize = DivCustomJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            DivSize divSize2 = divSize;
            String str2 = (String) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.id, jSONObject, "id");
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.items, jSONObject, "items", this.component.getDivJsonTemplateResolver(), this.component.getDivJsonEntityParser());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.layoutProvider, jSONObject, "layout_provider", this.component.getDivLayoutProviderJsonTemplateResolver(), this.component.getDivLayoutProviderJsonEntityParser());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.margins, jSONObject, "margins", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.paddings, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divCustomTemplate.reuseId, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divCustomTemplate.rowSpan, jSONObject, "row_span", typeHelper2, function12, DivCustomJsonParser.ROW_SPAN_VALIDATOR);
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.selectedActions, jSONObject, "selected_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.tooltips, jSONObject, "tooltips", this.component.getDivTooltipJsonTemplateResolver(), this.component.getDivTooltipJsonEntityParser());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.transform, jSONObject, "transform", this.component.getDivTransformJsonTemplateResolver(), this.component.getDivTransformJsonEntityParser());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.transitionChange, jSONObject, "transition_change", this.component.getDivChangeTransitionJsonTemplateResolver(), this.component.getDivChangeTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.transitionIn, jSONObject, "transition_in", this.component.getDivAppearanceTransitionJsonTemplateResolver(), this.component.getDivAppearanceTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.transitionOut, jSONObject, "transition_out", this.component.getDivAppearanceTransitionJsonTemplateResolver(), this.component.getDivAppearanceTransitionJsonEntityParser());
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.transitionTriggers, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivCustomJsonParser.TRANSITION_TRIGGERS_VALIDATOR);
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.variableTriggers, jSONObject, "variable_triggers", this.component.getDivTriggerJsonTemplateResolver(), this.component.getDivTriggerJsonEntityParser());
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.variables, jSONObject, "variables", this.component.getDivVariableJsonTemplateResolver(), this.component.getDivVariableJsonEntityParser());
            Field field3 = divCustomTemplate.visibility;
            TypeHelper typeHelper3 = DivCustomJsonParser.TYPE_HELPER_VISIBILITY;
            Function1 function13 = DivVisibility.FROM_STRING;
            Expression expression2 = DivCustomJsonParser.VISIBILITY_DEFAULT_VALUE;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, typeHelper3, function13, expression2);
            Expression expression3 = resolveOptionalExpression7 == null ? expression2 : resolveOptionalExpression7;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.visibilityAction, jSONObject, "visibility_action", this.component.getDivVisibilityActionJsonTemplateResolver(), this.component.getDivVisibilityActionJsonEntityParser());
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divCustomTemplate.visibilityActions, jSONObject, "visibility_actions", this.component.getDivVisibilityActionJsonTemplateResolver(), this.component.getDivVisibilityActionJsonEntityParser());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divCustomTemplate.width, jSONObject, "width", this.component.getDivSizeJsonTemplateResolver(), this.component.getDivSizeJsonEntityParser());
            if (divSize3 == null) {
                divSize3 = DivCustomJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivCustom(divAccessibility, resolveOptionalExpression, resolveOptionalExpression2, expression, resolveOptionalList, resolveOptionalList2, divBorder, resolveOptionalExpression4, jSONObject2, str, resolveOptionalList3, resolveOptionalList4, divFocus, resolveOptionalList5, divSize2, str2, resolveOptionalList6, divLayoutProvider, divEdgeInsets, divEdgeInsets2, resolveOptionalExpression5, resolveOptionalExpression6, resolveOptionalList7, resolveOptionalList8, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, resolveOptionalList9, resolveOptionalList10, resolveOptionalList11, expression3, divVisibilityAction, resolveOptionalList12, divSize3);
        }
    }

    /* compiled from: DivCustomJsonParser.kt */
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
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7, null));
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        TYPE_HELPER_ALIGNMENT_HORIZONTAL = companion2.from(ArraysKt.first(DivAlignmentHorizontal.values()), new Function1() { // from class: com.yandex.div2.DivCustomJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        TYPE_HELPER_ALIGNMENT_VERTICAL = companion2.from(ArraysKt.first(DivAlignmentVertical.values()), new Function1() { // from class: com.yandex.div2.DivCustomJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        TYPE_HELPER_VISIBILITY = companion2.from(divVisibility, new Function1() { // from class: com.yandex.div2.DivCustomJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        ALPHA_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivCustomJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ALPHA_VALIDATOR$lambda$0;
                ALPHA_VALIDATOR$lambda$0 = DivCustomJsonParser.ALPHA_VALIDATOR$lambda$0(((Double) obj).doubleValue());
                return ALPHA_VALIDATOR$lambda$0;
            }
        };
        COLUMN_SPAN_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivCustomJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean COLUMN_SPAN_VALIDATOR$lambda$1;
                COLUMN_SPAN_VALIDATOR$lambda$1 = DivCustomJsonParser.COLUMN_SPAN_VALIDATOR$lambda$1(((Long) obj).longValue());
                return COLUMN_SPAN_VALIDATOR$lambda$1;
            }
        };
        ROW_SPAN_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivCustomJsonParser$$ExternalSyntheticLambda2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ROW_SPAN_VALIDATOR$lambda$2;
                ROW_SPAN_VALIDATOR$lambda$2 = DivCustomJsonParser.ROW_SPAN_VALIDATOR$lambda$2(((Long) obj).longValue());
                return ROW_SPAN_VALIDATOR$lambda$2;
            }
        };
        TRANSITION_TRIGGERS_VALIDATOR = new ListValidator() { // from class: com.yandex.div2.DivCustomJsonParser$$ExternalSyntheticLambda3
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean TRANSITION_TRIGGERS_VALIDATOR$lambda$3;
                TRANSITION_TRIGGERS_VALIDATOR$lambda$3 = DivCustomJsonParser.TRANSITION_TRIGGERS_VALIDATOR$lambda$3(list);
                return TRANSITION_TRIGGERS_VALIDATOR$lambda$3;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TRANSITION_TRIGGERS_VALIDATOR$lambda$3(List list) {
        return list.size() >= 1;
    }
}
