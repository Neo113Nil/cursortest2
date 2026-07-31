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
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivSize;
import io.appmetrica.analytics.impl.M2;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivGalleryJsonParser.kt */
/* loaded from: classes9.dex */
public abstract class DivGalleryJsonParser {
    public static final Expression ALPHA_DEFAULT_VALUE;
    public static final ValueValidator ALPHA_VALIDATOR;
    public static final ValueValidator COLUMN_COUNT_VALIDATOR;
    public static final ValueValidator COLUMN_SPAN_VALIDATOR;
    public static final Expression CROSS_CONTENT_ALIGNMENT_DEFAULT_VALUE;
    public static final ValueValidator CROSS_SPACING_VALIDATOR;
    private static final Companion Companion = new Companion(null);
    public static final Expression DEFAULT_ITEM_DEFAULT_VALUE;
    public static final ValueValidator DEFAULT_ITEM_VALIDATOR;
    public static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    public static final Expression ITEM_SPACING_DEFAULT_VALUE;
    public static final ValueValidator ITEM_SPACING_VALIDATOR;
    public static final Expression ORIENTATION_DEFAULT_VALUE;
    public static final Expression RESTRICT_PARENT_SCROLL_DEFAULT_VALUE;
    public static final ValueValidator ROW_SPAN_VALIDATOR;
    public static final Expression SCROLLBAR_DEFAULT_VALUE;
    public static final Expression SCROLL_MODE_DEFAULT_VALUE;
    public static final ListValidator TRANSITION_TRIGGERS_VALIDATOR;
    public static final TypeHelper TYPE_HELPER_ALIGNMENT_HORIZONTAL;
    public static final TypeHelper TYPE_HELPER_ALIGNMENT_VERTICAL;
    public static final TypeHelper TYPE_HELPER_CROSS_CONTENT_ALIGNMENT;
    public static final TypeHelper TYPE_HELPER_ORIENTATION;
    public static final TypeHelper TYPE_HELPER_SCROLLBAR;
    public static final TypeHelper TYPE_HELPER_SCROLL_MODE;
    public static final TypeHelper TYPE_HELPER_VISIBILITY;
    public static final Expression VISIBILITY_DEFAULT_VALUE;
    public static final DivSize.MatchParent WIDTH_DEFAULT_VALUE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ALPHA_VALIDATOR$lambda$0(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean COLUMN_COUNT_VALIDATOR$lambda$1(long j) {
        return j > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean COLUMN_SPAN_VALIDATOR$lambda$2(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CROSS_SPACING_VALIDATOR$lambda$3(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DEFAULT_ITEM_VALIDATOR$lambda$4(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ITEM_SPACING_VALIDATOR$lambda$5(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ROW_SPAN_VALIDATOR$lambda$6(long j) {
        return j >= 0;
    }

    /* compiled from: DivGalleryJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivGallery deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.component.getDivAccessibilityJsonEntityParser());
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", DivGalleryJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL, DivAlignmentHorizontal.FROM_STRING);
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivGalleryJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivGalleryJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivGalleryJsonParser.ALPHA_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression3 != null) {
                expression = readOptionalExpression3;
            }
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.component.getDivAnimatorJsonEntityParser());
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, M2.g, this.component.getDivBackgroundJsonEntityParser());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.component.getDivBorderJsonEntityParser());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_count", typeHelper2, function12, DivGalleryJsonParser.COLUMN_COUNT_VALIDATOR);
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, function12, DivGalleryJsonParser.COLUMN_SPAN_VALIDATOR);
            TypeHelper typeHelper3 = DivGalleryJsonParser.TYPE_HELPER_CROSS_CONTENT_ALIGNMENT;
            Function1 function13 = DivGallery.CrossContentAlignment.FROM_STRING;
            Expression expression2 = DivGalleryJsonParser.CROSS_CONTENT_ALIGNMENT_DEFAULT_VALUE;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "cross_content_alignment", typeHelper3, function13, expression2);
            Expression expression3 = readOptionalExpression6 == null ? expression2 : readOptionalExpression6;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "cross_spacing", typeHelper2, function12, DivGalleryJsonParser.CROSS_SPACING_VALIDATOR);
            ValueValidator valueValidator2 = DivGalleryJsonParser.DEFAULT_ITEM_VALIDATOR;
            Expression expression4 = DivGalleryJsonParser.DEFAULT_ITEM_DEFAULT_VALUE;
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "default_item", typeHelper2, function12, valueValidator2, expression4);
            if (readOptionalExpression8 != null) {
                expression4 = readOptionalExpression8;
            }
            List readOptionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.component.getDivDisappearActionJsonEntityParser());
            List readOptionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.component.getDivExtensionJsonEntityParser());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.component.getDivFocusJsonEntityParser());
            List readOptionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.component.getDivFunctionJsonEntityParser());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.component.getDivSizeJsonEntityParser());
            if (divSize == null) {
                divSize = DivGalleryJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            DivSize divSize2 = divSize;
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            DivCollectionItemBuilder divCollectionItemBuilder = (DivCollectionItemBuilder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_builder", this.component.getDivCollectionItemBuilderJsonEntityParser());
            ValueValidator valueValidator3 = DivGalleryJsonParser.ITEM_SPACING_VALIDATOR;
            Expression expression5 = DivGalleryJsonParser.ITEM_SPACING_DEFAULT_VALUE;
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "item_spacing", typeHelper2, function12, valueValidator3, expression5);
            if (readOptionalExpression9 != null) {
                expression5 = readOptionalExpression9;
            }
            List readOptionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "items", this.component.getDivJsonEntityParser());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.component.getDivLayoutProviderJsonEntityParser());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.component.getDivEdgeInsetsJsonEntityParser());
            TypeHelper typeHelper4 = DivGalleryJsonParser.TYPE_HELPER_ORIENTATION;
            Function1 function14 = DivGallery.Orientation.FROM_STRING;
            Expression expression6 = DivGalleryJsonParser.ORIENTATION_DEFAULT_VALUE;
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, X3.i.n, typeHelper4, function14, expression6);
            Expression expression7 = readOptionalExpression10 == null ? expression6 : readOptionalExpression10;
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonEntityParser());
            TypeHelper<Boolean> typeHelper5 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function15 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression8 = DivGalleryJsonParser.RESTRICT_PARENT_SCROLL_DEFAULT_VALUE;
            Expression readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "restrict_parent_scroll", typeHelper5, function15, expression8);
            Expression expression9 = readOptionalExpression11 == null ? expression8 : readOptionalExpression11;
            Expression readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, function12, DivGalleryJsonParser.ROW_SPAN_VALIDATOR);
            TypeHelper typeHelper6 = DivGalleryJsonParser.TYPE_HELPER_SCROLL_MODE;
            Function1 function16 = DivGallery.ScrollMode.FROM_STRING;
            Expression expression10 = DivGalleryJsonParser.SCROLL_MODE_DEFAULT_VALUE;
            Expression readOptionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scroll_mode", typeHelper6, function16, expression10);
            Expression expression11 = readOptionalExpression14 == null ? expression10 : readOptionalExpression14;
            TypeHelper typeHelper7 = DivGalleryJsonParser.TYPE_HELPER_SCROLLBAR;
            Function1 function17 = DivGallery.Scrollbar.FROM_STRING;
            Expression expression12 = DivGalleryJsonParser.SCROLLBAR_DEFAULT_VALUE;
            Expression readOptionalExpression15 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scrollbar", typeHelper7, function17, expression12);
            Expression expression13 = readOptionalExpression15 == null ? expression12 : readOptionalExpression15;
            List readOptionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.component.getDivActionJsonEntityParser());
            List readOptionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.component.getDivTooltipJsonEntityParser());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.component.getDivTransformJsonEntityParser());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.component.getDivChangeTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.component.getDivAppearanceTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.component.getDivAppearanceTransitionJsonEntityParser());
            List readOptionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivGalleryJsonParser.TRANSITION_TRIGGERS_VALIDATOR);
            List readOptionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.component.getDivTriggerJsonEntityParser());
            List readOptionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.component.getDivVariableJsonEntityParser());
            TypeHelper typeHelper8 = DivGalleryJsonParser.TYPE_HELPER_VISIBILITY;
            Function1 function18 = DivVisibility.FROM_STRING;
            Expression expression14 = DivGalleryJsonParser.VISIBILITY_DEFAULT_VALUE;
            Expression readOptionalExpression16 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, typeHelper8, function18, expression14);
            Expression expression15 = readOptionalExpression16 == null ? expression14 : readOptionalExpression16;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.component.getDivVisibilityActionJsonEntityParser());
            List readOptionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.component.getDivVisibilityActionJsonEntityParser());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.component.getDivSizeJsonEntityParser());
            if (divSize3 == null) {
                divSize3 = DivGalleryJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivGallery(divAccessibility, readOptionalExpression, readOptionalExpression2, expression, readOptionalList, readOptionalList2, divBorder, readOptionalExpression4, readOptionalExpression5, expression3, readOptionalExpression7, expression4, readOptionalList3, readOptionalList4, divFocus, readOptionalList5, divSize2, str, divCollectionItemBuilder, expression5, readOptionalList6, divLayoutProvider, divEdgeInsets, expression7, divEdgeInsets2, expression9, readOptionalExpression12, readOptionalExpression13, expression11, expression13, readOptionalList7, readOptionalList8, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, readOptionalList9, readOptionalList10, readOptionalList11, expression15, divVisibilityAction, readOptionalList12, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivGallery divGallery) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divGallery.getAccessibility(), this.component.getDivAccessibilityJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divGallery.getAlignmentHorizontal(), DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divGallery.getAlignmentVertical(), DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divGallery.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divGallery.getAnimators(), this.component.getDivAnimatorJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, M2.g, divGallery.getBackground(), this.component.getDivBackgroundJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divGallery.getBorder(), this.component.getDivBorderJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_count", divGallery.columnCount);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divGallery.getColumnSpan());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "cross_content_alignment", divGallery.crossContentAlignment, DivGallery.CrossContentAlignment.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "cross_spacing", divGallery.crossSpacing);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "default_item", divGallery.defaultItem);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divGallery.getDisappearActions(), this.component.getDivDisappearActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divGallery.getExtensions(), this.component.getDivExtensionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divGallery.getFocus(), this.component.getDivFocusJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divGallery.getFunctions(), this.component.getDivFunctionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divGallery.getHeight(), this.component.getDivSizeJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divGallery.getId());
            JsonPropertyParser.write(parsingContext, jSONObject, "item_builder", divGallery.itemBuilder, this.component.getDivCollectionItemBuilderJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "item_spacing", divGallery.itemSpacing);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", divGallery.items, this.component.getDivJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divGallery.getLayoutProvider(), this.component.getDivLayoutProviderJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divGallery.getMargins(), this.component.getDivEdgeInsetsJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, X3.i.n, divGallery.orientation, DivGallery.Orientation.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divGallery.getPaddings(), this.component.getDivEdgeInsetsJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "restrict_parent_scroll", divGallery.restrictParentScroll);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divGallery.getReuseId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divGallery.getRowSpan());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scroll_mode", divGallery.scrollMode, DivGallery.ScrollMode.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scrollbar", divGallery.scrollbar, DivGallery.Scrollbar.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divGallery.getSelectedActions(), this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divGallery.getTooltips(), this.component.getDivTooltipJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divGallery.getTransform(), this.component.getDivTransformJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divGallery.getTransitionChange(), this.component.getDivChangeTransitionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divGallery.getTransitionIn(), this.component.getDivAppearanceTransitionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divGallery.getTransitionOut(), this.component.getDivAppearanceTransitionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divGallery.getTransitionTriggers(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "gallery");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divGallery.getVariableTriggers(), this.component.getDivTriggerJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divGallery.getVariables(), this.component.getDivVariableJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, divGallery.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divGallery.getVisibilityAction(), this.component.getDivVisibilityActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divGallery.getVisibilityActions(), this.component.getDivVisibilityActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divGallery.getWidth(), this.component.getDivSizeJsonEntityParser());
            return jSONObject;
        }
    }

    /* compiled from: DivGalleryJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivGalleryTemplate deserialize(ParsingContext parsingContext, DivGalleryTemplate divGalleryTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.accessibility : null, this.component.getDivAccessibilityJsonTemplateParser());
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_horizontal", DivGalleryJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL, allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.alignmentHorizontal : null, DivAlignmentHorizontal.FROM_STRING);
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", DivGalleryJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.alignmentVertical : null, DivAlignmentVertical.FROM_STRING);
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.alpha : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivGalleryJsonParser.ALPHA_VALIDATOR);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.animators : null, this.component.getDivAnimatorJsonTemplateParser());
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, M2.g, allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.background : null, this.component.getDivBackgroundJsonTemplateParser());
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.border : null, this.component.getDivBorderJsonTemplateParser());
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = divGalleryTemplate != null ? divGalleryTemplate.columnCount : null;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_count", typeHelper, allowPropertyOverride, field, function1, DivGalleryJsonParser.COLUMN_COUNT_VALIDATOR);
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.columnSpan : null, function1, DivGalleryJsonParser.COLUMN_SPAN_VALIDATOR);
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "cross_content_alignment", DivGalleryJsonParser.TYPE_HELPER_CROSS_CONTENT_ALIGNMENT, allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.crossContentAlignment : null, DivGallery.CrossContentAlignment.FROM_STRING);
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "cross_spacing", typeHelper, allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.crossSpacing : null, function1, DivGalleryJsonParser.CROSS_SPACING_VALIDATOR);
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "default_item", typeHelper, allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.defaultItem : null, function1, DivGalleryJsonParser.DEFAULT_ITEM_VALIDATOR);
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.disappearActions : null, this.component.getDivDisappearActionJsonTemplateParser());
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.extensions : null, this.component.getDivExtensionJsonTemplateParser());
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.focus : null, this.component.getDivFocusJsonTemplateParser());
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.functions : null, this.component.getDivFunctionJsonTemplateParser());
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.height : null, this.component.getDivSizeJsonTemplateParser());
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.id : null);
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "item_builder", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.itemBuilder : null, this.component.getDivCollectionItemBuilderJsonTemplateParser());
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "item_spacing", typeHelper, allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.itemSpacing : null, function1, DivGalleryJsonParser.ITEM_SPACING_VALIDATOR);
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "items", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.items : null, this.component.getDivJsonTemplateParser());
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.layoutProvider : null, this.component.getDivLayoutProviderJsonTemplateParser());
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.margins : null, this.component.getDivEdgeInsetsJsonTemplateParser());
            Field readOptionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, X3.i.n, DivGalleryJsonParser.TYPE_HELPER_ORIENTATION, allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.orientation : null, DivGallery.Orientation.FROM_STRING);
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.paddings : null, this.component.getDivEdgeInsetsJsonTemplateParser());
            Field readOptionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "restrict_parent_scroll", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.restrictParentScroll : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field readOptionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.reuseId : null);
            Field readOptionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.rowSpan : null, function1, DivGalleryJsonParser.ROW_SPAN_VALIDATOR);
            Field readOptionalFieldWithExpression14 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "scroll_mode", DivGalleryJsonParser.TYPE_HELPER_SCROLL_MODE, allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.scrollMode : null, DivGallery.ScrollMode.FROM_STRING);
            Field readOptionalFieldWithExpression15 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "scrollbar", DivGalleryJsonParser.TYPE_HELPER_SCROLLBAR, allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.scrollbar : null, DivGallery.Scrollbar.FROM_STRING);
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.selectedActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalListField8 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.tooltips : null, this.component.getDivTooltipJsonTemplateParser());
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.transform : null, this.component.getDivTransformJsonTemplateParser());
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.transitionChange : null, this.component.getDivChangeTransitionJsonTemplateParser());
            Field readOptionalField12 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.transitionIn : null, this.component.getDivAppearanceTransitionJsonTemplateParser());
            Field readOptionalField13 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.transitionOut : null, this.component.getDivAppearanceTransitionJsonTemplateParser());
            Field field2 = divGalleryTemplate != null ? divGalleryTemplate.transitionTriggers : null;
            Function1 function12 = DivTransitionTrigger.FROM_STRING;
            ListValidator listValidator = DivGalleryJsonParser.TRANSITION_TRIGGERS_VALIDATOR;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivGalleryTemplate(readOptionalField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField, readOptionalListField2, readOptionalField2, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalFieldWithExpression7, readOptionalFieldWithExpression8, readOptionalListField3, readOptionalListField4, readOptionalField3, readOptionalListField5, readOptionalField4, readOptionalField5, readOptionalField6, readOptionalFieldWithExpression9, readOptionalListField6, readOptionalField7, readOptionalField8, readOptionalFieldWithExpression10, readOptionalField9, readOptionalFieldWithExpression11, readOptionalFieldWithExpression12, readOptionalFieldWithExpression13, readOptionalFieldWithExpression14, readOptionalFieldWithExpression15, readOptionalListField7, readOptionalListField8, readOptionalField10, readOptionalField11, readOptionalField12, readOptionalField13, JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field2, function12, listValidator), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.variableTriggers : null, this.component.getDivTriggerJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.variables : null, this.component.getDivVariableJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, DivGalleryJsonParser.TYPE_HELPER_VISIBILITY, allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.visibility : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.visibilityAction : null, this.component.getDivVisibilityActionJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.visibilityActions : null, this.component.getDivVisibilityActionJsonTemplateParser()), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divGalleryTemplate != null ? divGalleryTemplate.width : null, this.component.getDivSizeJsonTemplateParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivGalleryTemplate divGalleryTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divGalleryTemplate.accessibility, this.component.getDivAccessibilityJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", divGalleryTemplate.alignmentHorizontal, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", divGalleryTemplate.alignmentVertical, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divGalleryTemplate.alpha);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divGalleryTemplate.animators, this.component.getDivAnimatorJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, M2.g, divGalleryTemplate.background, this.component.getDivBackgroundJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", divGalleryTemplate.border, this.component.getDivBorderJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_count", divGalleryTemplate.columnCount);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divGalleryTemplate.columnSpan);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "cross_content_alignment", divGalleryTemplate.crossContentAlignment, DivGallery.CrossContentAlignment.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "cross_spacing", divGalleryTemplate.crossSpacing);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "default_item", divGalleryTemplate.defaultItem);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divGalleryTemplate.disappearActions, this.component.getDivDisappearActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divGalleryTemplate.extensions, this.component.getDivExtensionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divGalleryTemplate.focus, this.component.getDivFocusJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divGalleryTemplate.functions, this.component.getDivFunctionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divGalleryTemplate.height, this.component.getDivSizeJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divGalleryTemplate.id);
            JsonFieldParser.writeField(parsingContext, jSONObject, "item_builder", divGalleryTemplate.itemBuilder, this.component.getDivCollectionItemBuilderJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "item_spacing", divGalleryTemplate.itemSpacing);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", divGalleryTemplate.items, this.component.getDivJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divGalleryTemplate.layoutProvider, this.component.getDivLayoutProviderJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divGalleryTemplate.margins, this.component.getDivEdgeInsetsJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, X3.i.n, divGalleryTemplate.orientation, DivGallery.Orientation.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divGalleryTemplate.paddings, this.component.getDivEdgeInsetsJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "restrict_parent_scroll", divGalleryTemplate.restrictParentScroll);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divGalleryTemplate.reuseId);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divGalleryTemplate.rowSpan);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scroll_mode", divGalleryTemplate.scrollMode, DivGallery.ScrollMode.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scrollbar", divGalleryTemplate.scrollbar, DivGallery.Scrollbar.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divGalleryTemplate.selectedActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divGalleryTemplate.tooltips, this.component.getDivTooltipJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divGalleryTemplate.transform, this.component.getDivTransformJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divGalleryTemplate.transitionChange, this.component.getDivChangeTransitionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divGalleryTemplate.transitionIn, this.component.getDivAppearanceTransitionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divGalleryTemplate.transitionOut, this.component.getDivAppearanceTransitionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divGalleryTemplate.transitionTriggers, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "gallery");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divGalleryTemplate.variableTriggers, this.component.getDivTriggerJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divGalleryTemplate.variables, this.component.getDivVariableJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, divGalleryTemplate.visibility, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divGalleryTemplate.visibilityAction, this.component.getDivVisibilityActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divGalleryTemplate.visibilityActions, this.component.getDivVisibilityActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divGalleryTemplate.width, this.component.getDivSizeJsonTemplateParser());
            return jSONObject;
        }
    }

    /* compiled from: DivGalleryJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivGallery resolve(ParsingContext parsingContext, DivGalleryTemplate divGalleryTemplate, JSONObject jSONObject) {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divGalleryTemplate.accessibility, jSONObject, "accessibility", this.component.getDivAccessibilityJsonTemplateResolver(), this.component.getDivAccessibilityJsonEntityParser());
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divGalleryTemplate.alignmentHorizontal, jSONObject, "alignment_horizontal", DivGalleryJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL, DivAlignmentHorizontal.FROM_STRING);
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divGalleryTemplate.alignmentVertical, jSONObject, "alignment_vertical", DivGalleryJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, DivAlignmentVertical.FROM_STRING);
            Field field = divGalleryTemplate.alpha;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivGalleryJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivGalleryJsonParser.ALPHA_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression3 != null) {
                expression = resolveOptionalExpression3;
            }
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divGalleryTemplate.animators, jSONObject, "animators", this.component.getDivAnimatorJsonTemplateResolver(), this.component.getDivAnimatorJsonEntityParser());
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divGalleryTemplate.background, jSONObject, M2.g, this.component.getDivBackgroundJsonTemplateResolver(), this.component.getDivBackgroundJsonEntityParser());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divGalleryTemplate.border, jSONObject, "border", this.component.getDivBorderJsonTemplateResolver(), this.component.getDivBorderJsonEntityParser());
            Field field2 = divGalleryTemplate.columnCount;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "column_count", typeHelper2, function12, DivGalleryJsonParser.COLUMN_COUNT_VALIDATOR);
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divGalleryTemplate.columnSpan, jSONObject, "column_span", typeHelper2, function12, DivGalleryJsonParser.COLUMN_SPAN_VALIDATOR);
            Field field3 = divGalleryTemplate.crossContentAlignment;
            TypeHelper typeHelper3 = DivGalleryJsonParser.TYPE_HELPER_CROSS_CONTENT_ALIGNMENT;
            Function1 function13 = DivGallery.CrossContentAlignment.FROM_STRING;
            Expression expression2 = DivGalleryJsonParser.CROSS_CONTENT_ALIGNMENT_DEFAULT_VALUE;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "cross_content_alignment", typeHelper3, function13, expression2);
            Expression expression3 = resolveOptionalExpression6 == null ? expression2 : resolveOptionalExpression6;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divGalleryTemplate.crossSpacing, jSONObject, "cross_spacing", typeHelper2, function12, DivGalleryJsonParser.CROSS_SPACING_VALIDATOR);
            Field field4 = divGalleryTemplate.defaultItem;
            ValueValidator valueValidator2 = DivGalleryJsonParser.DEFAULT_ITEM_VALIDATOR;
            Expression expression4 = DivGalleryJsonParser.DEFAULT_ITEM_DEFAULT_VALUE;
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "default_item", typeHelper2, function12, valueValidator2, expression4);
            if (resolveOptionalExpression8 != null) {
                expression4 = resolveOptionalExpression8;
            }
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divGalleryTemplate.disappearActions, jSONObject, "disappear_actions", this.component.getDivDisappearActionJsonTemplateResolver(), this.component.getDivDisappearActionJsonEntityParser());
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divGalleryTemplate.extensions, jSONObject, "extensions", this.component.getDivExtensionJsonTemplateResolver(), this.component.getDivExtensionJsonEntityParser());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divGalleryTemplate.focus, jSONObject, "focus", this.component.getDivFocusJsonTemplateResolver(), this.component.getDivFocusJsonEntityParser());
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divGalleryTemplate.functions, jSONObject, "functions", this.component.getDivFunctionJsonTemplateResolver(), this.component.getDivFunctionJsonEntityParser());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divGalleryTemplate.height, jSONObject, "height", this.component.getDivSizeJsonTemplateResolver(), this.component.getDivSizeJsonEntityParser());
            if (divSize == null) {
                divSize = DivGalleryJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            DivSize divSize2 = divSize;
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divGalleryTemplate.id, jSONObject, "id");
            DivCollectionItemBuilder divCollectionItemBuilder = (DivCollectionItemBuilder) JsonFieldResolver.resolveOptional(parsingContext, divGalleryTemplate.itemBuilder, jSONObject, "item_builder", this.component.getDivCollectionItemBuilderJsonTemplateResolver(), this.component.getDivCollectionItemBuilderJsonEntityParser());
            Field field5 = divGalleryTemplate.itemSpacing;
            ValueValidator valueValidator3 = DivGalleryJsonParser.ITEM_SPACING_VALIDATOR;
            Expression expression5 = DivGalleryJsonParser.ITEM_SPACING_DEFAULT_VALUE;
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "item_spacing", typeHelper2, function12, valueValidator3, expression5);
            if (resolveOptionalExpression9 != null) {
                expression5 = resolveOptionalExpression9;
            }
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divGalleryTemplate.items, jSONObject, "items", this.component.getDivJsonTemplateResolver(), this.component.getDivJsonEntityParser());
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divGalleryTemplate.layoutProvider, jSONObject, "layout_provider", this.component.getDivLayoutProviderJsonTemplateResolver(), this.component.getDivLayoutProviderJsonEntityParser());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divGalleryTemplate.margins, jSONObject, "margins", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            Field field6 = divGalleryTemplate.orientation;
            TypeHelper typeHelper4 = DivGalleryJsonParser.TYPE_HELPER_ORIENTATION;
            Function1 function14 = DivGallery.Orientation.FROM_STRING;
            Expression expression6 = DivGalleryJsonParser.ORIENTATION_DEFAULT_VALUE;
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, X3.i.n, typeHelper4, function14, expression6);
            Expression expression7 = resolveOptionalExpression10 == null ? expression6 : resolveOptionalExpression10;
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divGalleryTemplate.paddings, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            Field field7 = divGalleryTemplate.restrictParentScroll;
            TypeHelper<Boolean> typeHelper5 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function15 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression8 = DivGalleryJsonParser.RESTRICT_PARENT_SCROLL_DEFAULT_VALUE;
            Expression resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "restrict_parent_scroll", typeHelper5, function15, expression8);
            Expression expression9 = resolveOptionalExpression11 == null ? expression8 : resolveOptionalExpression11;
            Expression resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divGalleryTemplate.reuseId, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divGalleryTemplate.rowSpan, jSONObject, "row_span", typeHelper2, function12, DivGalleryJsonParser.ROW_SPAN_VALIDATOR);
            Field field8 = divGalleryTemplate.scrollMode;
            TypeHelper typeHelper6 = DivGalleryJsonParser.TYPE_HELPER_SCROLL_MODE;
            Function1 function16 = DivGallery.ScrollMode.FROM_STRING;
            Expression expression10 = DivGalleryJsonParser.SCROLL_MODE_DEFAULT_VALUE;
            Expression resolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "scroll_mode", typeHelper6, function16, expression10);
            Expression expression11 = resolveOptionalExpression14 == null ? expression10 : resolveOptionalExpression14;
            Field field9 = divGalleryTemplate.scrollbar;
            TypeHelper typeHelper7 = DivGalleryJsonParser.TYPE_HELPER_SCROLLBAR;
            Function1 function17 = DivGallery.Scrollbar.FROM_STRING;
            Expression expression12 = DivGalleryJsonParser.SCROLLBAR_DEFAULT_VALUE;
            Expression resolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "scrollbar", typeHelper7, function17, expression12);
            Expression expression13 = resolveOptionalExpression15 == null ? expression12 : resolveOptionalExpression15;
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divGalleryTemplate.selectedActions, jSONObject, "selected_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divGalleryTemplate.tooltips, jSONObject, "tooltips", this.component.getDivTooltipJsonTemplateResolver(), this.component.getDivTooltipJsonEntityParser());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divGalleryTemplate.transform, jSONObject, "transform", this.component.getDivTransformJsonTemplateResolver(), this.component.getDivTransformJsonEntityParser());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divGalleryTemplate.transitionChange, jSONObject, "transition_change", this.component.getDivChangeTransitionJsonTemplateResolver(), this.component.getDivChangeTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divGalleryTemplate.transitionIn, jSONObject, "transition_in", this.component.getDivAppearanceTransitionJsonTemplateResolver(), this.component.getDivAppearanceTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divGalleryTemplate.transitionOut, jSONObject, "transition_out", this.component.getDivAppearanceTransitionJsonTemplateResolver(), this.component.getDivAppearanceTransitionJsonEntityParser());
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divGalleryTemplate.transitionTriggers, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivGalleryJsonParser.TRANSITION_TRIGGERS_VALIDATOR);
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divGalleryTemplate.variableTriggers, jSONObject, "variable_triggers", this.component.getDivTriggerJsonTemplateResolver(), this.component.getDivTriggerJsonEntityParser());
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divGalleryTemplate.variables, jSONObject, "variables", this.component.getDivVariableJsonTemplateResolver(), this.component.getDivVariableJsonEntityParser());
            Field field10 = divGalleryTemplate.visibility;
            TypeHelper typeHelper8 = DivGalleryJsonParser.TYPE_HELPER_VISIBILITY;
            Function1 function18 = DivVisibility.FROM_STRING;
            Expression expression14 = DivGalleryJsonParser.VISIBILITY_DEFAULT_VALUE;
            Expression resolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, typeHelper8, function18, expression14);
            Expression expression15 = resolveOptionalExpression16 == null ? expression14 : resolveOptionalExpression16;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divGalleryTemplate.visibilityAction, jSONObject, "visibility_action", this.component.getDivVisibilityActionJsonTemplateResolver(), this.component.getDivVisibilityActionJsonEntityParser());
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divGalleryTemplate.visibilityActions, jSONObject, "visibility_actions", this.component.getDivVisibilityActionJsonTemplateResolver(), this.component.getDivVisibilityActionJsonEntityParser());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divGalleryTemplate.width, jSONObject, "width", this.component.getDivSizeJsonTemplateResolver(), this.component.getDivSizeJsonEntityParser());
            if (divSize3 == null) {
                divSize3 = DivGalleryJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivGallery(divAccessibility, resolveOptionalExpression, resolveOptionalExpression2, expression, resolveOptionalList, resolveOptionalList2, divBorder, resolveOptionalExpression4, resolveOptionalExpression5, expression3, resolveOptionalExpression7, expression4, resolveOptionalList3, resolveOptionalList4, divFocus, resolveOptionalList5, divSize2, str, divCollectionItemBuilder, expression5, resolveOptionalList6, divLayoutProvider, divEdgeInsets, expression7, divEdgeInsets2, expression9, resolveOptionalExpression12, resolveOptionalExpression13, expression11, expression13, resolveOptionalList7, resolveOptionalList8, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, resolveOptionalList9, resolveOptionalList10, resolveOptionalList11, expression15, divVisibilityAction, resolveOptionalList12, divSize3);
        }
    }

    /* compiled from: DivGalleryJsonParser.kt */
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
        DivGallery.CrossContentAlignment crossContentAlignment = DivGallery.CrossContentAlignment.START;
        CROSS_CONTENT_ALIGNMENT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, crossContentAlignment, null, 2, null);
        DEFAULT_ITEM_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7, null));
        ITEM_SPACING_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 8L, null, 2, null);
        DivGallery.Orientation orientation = DivGallery.Orientation.HORIZONTAL;
        ORIENTATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, orientation, null, 2, null);
        RESTRICT_PARENT_SCROLL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        DivGallery.ScrollMode scrollMode = DivGallery.ScrollMode.DEFAULT;
        SCROLL_MODE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, scrollMode, null, 2, null);
        DivGallery.Scrollbar scrollbar = DivGallery.Scrollbar.NONE;
        SCROLLBAR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, scrollbar, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null == true ? 1 : 0, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        TYPE_HELPER_ALIGNMENT_HORIZONTAL = companion2.from(ArraysKt.first(DivAlignmentHorizontal.values()), new Function1() { // from class: com.yandex.div2.DivGalleryJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        TYPE_HELPER_ALIGNMENT_VERTICAL = companion2.from(ArraysKt.first(DivAlignmentVertical.values()), new Function1() { // from class: com.yandex.div2.DivGalleryJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        TYPE_HELPER_CROSS_CONTENT_ALIGNMENT = companion2.from(crossContentAlignment, new Function1() { // from class: com.yandex.div2.DivGalleryJsonParser$Companion$TYPE_HELPER_CROSS_CONTENT_ALIGNMENT$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivGallery.CrossContentAlignment);
            }
        });
        TYPE_HELPER_ORIENTATION = companion2.from(orientation, new Function1() { // from class: com.yandex.div2.DivGalleryJsonParser$Companion$TYPE_HELPER_ORIENTATION$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivGallery.Orientation);
            }
        });
        TYPE_HELPER_SCROLL_MODE = companion2.from(scrollMode, new Function1() { // from class: com.yandex.div2.DivGalleryJsonParser$Companion$TYPE_HELPER_SCROLL_MODE$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivGallery.ScrollMode);
            }
        });
        TYPE_HELPER_SCROLLBAR = companion2.from(scrollbar, new Function1() { // from class: com.yandex.div2.DivGalleryJsonParser$Companion$TYPE_HELPER_SCROLLBAR$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivGallery.Scrollbar);
            }
        });
        TYPE_HELPER_VISIBILITY = companion2.from(divVisibility, new Function1() { // from class: com.yandex.div2.DivGalleryJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        ALPHA_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivGalleryJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ALPHA_VALIDATOR$lambda$0;
                ALPHA_VALIDATOR$lambda$0 = DivGalleryJsonParser.ALPHA_VALIDATOR$lambda$0(((Double) obj).doubleValue());
                return ALPHA_VALIDATOR$lambda$0;
            }
        };
        COLUMN_COUNT_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivGalleryJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean COLUMN_COUNT_VALIDATOR$lambda$1;
                COLUMN_COUNT_VALIDATOR$lambda$1 = DivGalleryJsonParser.COLUMN_COUNT_VALIDATOR$lambda$1(((Long) obj).longValue());
                return COLUMN_COUNT_VALIDATOR$lambda$1;
            }
        };
        COLUMN_SPAN_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivGalleryJsonParser$$ExternalSyntheticLambda2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean COLUMN_SPAN_VALIDATOR$lambda$2;
                COLUMN_SPAN_VALIDATOR$lambda$2 = DivGalleryJsonParser.COLUMN_SPAN_VALIDATOR$lambda$2(((Long) obj).longValue());
                return COLUMN_SPAN_VALIDATOR$lambda$2;
            }
        };
        CROSS_SPACING_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivGalleryJsonParser$$ExternalSyntheticLambda3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean CROSS_SPACING_VALIDATOR$lambda$3;
                CROSS_SPACING_VALIDATOR$lambda$3 = DivGalleryJsonParser.CROSS_SPACING_VALIDATOR$lambda$3(((Long) obj).longValue());
                return CROSS_SPACING_VALIDATOR$lambda$3;
            }
        };
        DEFAULT_ITEM_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivGalleryJsonParser$$ExternalSyntheticLambda4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean DEFAULT_ITEM_VALIDATOR$lambda$4;
                DEFAULT_ITEM_VALIDATOR$lambda$4 = DivGalleryJsonParser.DEFAULT_ITEM_VALIDATOR$lambda$4(((Long) obj).longValue());
                return DEFAULT_ITEM_VALIDATOR$lambda$4;
            }
        };
        ITEM_SPACING_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivGalleryJsonParser$$ExternalSyntheticLambda5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ITEM_SPACING_VALIDATOR$lambda$5;
                ITEM_SPACING_VALIDATOR$lambda$5 = DivGalleryJsonParser.ITEM_SPACING_VALIDATOR$lambda$5(((Long) obj).longValue());
                return ITEM_SPACING_VALIDATOR$lambda$5;
            }
        };
        ROW_SPAN_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivGalleryJsonParser$$ExternalSyntheticLambda6
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ROW_SPAN_VALIDATOR$lambda$6;
                ROW_SPAN_VALIDATOR$lambda$6 = DivGalleryJsonParser.ROW_SPAN_VALIDATOR$lambda$6(((Long) obj).longValue());
                return ROW_SPAN_VALIDATOR$lambda$6;
            }
        };
        TRANSITION_TRIGGERS_VALIDATOR = new ListValidator() { // from class: com.yandex.div2.DivGalleryJsonParser$$ExternalSyntheticLambda7
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean TRANSITION_TRIGGERS_VALIDATOR$lambda$7;
                TRANSITION_TRIGGERS_VALIDATOR$lambda$7 = DivGalleryJsonParser.TRANSITION_TRIGGERS_VALIDATOR$lambda$7(list);
                return TRANSITION_TRIGGERS_VALIDATOR$lambda$7;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TRANSITION_TRIGGERS_VALIDATOR$lambda$7(List list) {
        return list.size() >= 1;
    }
}
