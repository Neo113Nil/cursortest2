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
import com.yandex.div2.DivSize;
import com.yandex.div2.DivTabs;
import io.appmetrica.analytics.impl.M2;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTabsJsonParser.kt */
/* loaded from: classes8.dex */
public abstract class DivTabsJsonParser {
    public static final Expression ALPHA_DEFAULT_VALUE;
    public static final ValueValidator ALPHA_VALIDATOR;
    public static final ValueValidator COLUMN_SPAN_VALIDATOR;
    private static final Companion Companion = new Companion(null);
    public static final Expression DYNAMIC_HEIGHT_DEFAULT_VALUE;
    public static final Expression HAS_SEPARATOR_DEFAULT_VALUE;
    public static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    public static final ListValidator ITEMS_VALIDATOR;
    public static final Expression RESTRICT_PARENT_SCROLL_DEFAULT_VALUE;
    public static final ValueValidator ROW_SPAN_VALIDATOR;
    public static final Expression SELECTED_TAB_DEFAULT_VALUE;
    public static final ValueValidator SELECTED_TAB_VALIDATOR;
    public static final Expression SEPARATOR_COLOR_DEFAULT_VALUE;
    public static final DivEdgeInsets SEPARATOR_PADDINGS_DEFAULT_VALUE;
    public static final Expression SWITCH_TABS_BY_CONTENT_SWIPE_ENABLED_DEFAULT_VALUE;
    public static final DivEdgeInsets TITLE_PADDINGS_DEFAULT_VALUE;
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
    public static final boolean ROW_SPAN_VALIDATOR$lambda$3(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SELECTED_TAB_VALIDATOR$lambda$4(long j) {
        return j >= 0;
    }

    /* compiled from: DivTabsJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivTabs deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.component.getDivAccessibilityJsonEntityParser());
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", DivTabsJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL, DivAlignmentHorizontal.FROM_STRING);
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivTabsJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivTabsJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivTabsJsonParser.ALPHA_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression3 != null) {
                expression = readOptionalExpression3;
            }
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.component.getDivAnimatorJsonEntityParser());
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, M2.g, this.component.getDivBackgroundJsonEntityParser());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.component.getDivBorderJsonEntityParser());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper2, function12, DivTabsJsonParser.COLUMN_SPAN_VALIDATOR);
            List readOptionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.component.getDivDisappearActionJsonEntityParser());
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = DivTabsJsonParser.DYNAMIC_HEIGHT_DEFAULT_VALUE;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "dynamic_height", typeHelper3, function13, expression2);
            if (readOptionalExpression5 != null) {
                expression2 = readOptionalExpression5;
            }
            List readOptionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.component.getDivExtensionJsonEntityParser());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.component.getDivFocusJsonEntityParser());
            List readOptionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.component.getDivFunctionJsonEntityParser());
            Expression expression3 = DivTabsJsonParser.HAS_SEPARATOR_DEFAULT_VALUE;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "has_separator", typeHelper3, function13, expression3);
            if (readOptionalExpression6 != null) {
                expression3 = readOptionalExpression6;
            }
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.component.getDivSizeJsonEntityParser());
            if (divSize == null) {
                divSize = DivTabsJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            DivSize divSize2 = divSize;
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            List readList = JsonPropertyParser.readList(parsingContext, jSONObject, "items", this.component.getDivTabsItemJsonEntityParser(), DivTabsJsonParser.ITEMS_VALIDATOR);
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.component.getDivLayoutProviderJsonEntityParser());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.component.getDivEdgeInsetsJsonEntityParser());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonEntityParser());
            Expression expression4 = DivTabsJsonParser.RESTRICT_PARENT_SCROLL_DEFAULT_VALUE;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "restrict_parent_scroll", typeHelper3, function13, expression4);
            if (readOptionalExpression7 != null) {
                expression4 = readOptionalExpression7;
            }
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper2, function12, DivTabsJsonParser.ROW_SPAN_VALIDATOR);
            List readOptionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.component.getDivActionJsonEntityParser());
            ValueValidator valueValidator2 = DivTabsJsonParser.SELECTED_TAB_VALIDATOR;
            Expression expression5 = DivTabsJsonParser.SELECTED_TAB_DEFAULT_VALUE;
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "selected_tab", typeHelper2, function12, valueValidator2, expression5);
            if (readOptionalExpression10 != null) {
                expression5 = readOptionalExpression10;
            }
            TypeHelper<Integer> typeHelper4 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1 function14 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression6 = DivTabsJsonParser.SEPARATOR_COLOR_DEFAULT_VALUE;
            Expression readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "separator_color", typeHelper4, function14, expression6);
            Expression expression7 = readOptionalExpression11 == null ? expression6 : readOptionalExpression11;
            DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "separator_paddings", this.component.getDivEdgeInsetsJsonEntityParser());
            if (divEdgeInsets3 == null) {
                divEdgeInsets3 = DivTabsJsonParser.SEPARATOR_PADDINGS_DEFAULT_VALUE;
            }
            DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
            Expression expression8 = DivTabsJsonParser.SWITCH_TABS_BY_CONTENT_SWIPE_ENABLED_DEFAULT_VALUE;
            Expression readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "switch_tabs_by_content_swipe_enabled", typeHelper3, function13, expression8);
            Expression expression9 = readOptionalExpression12 == null ? expression8 : readOptionalExpression12;
            DivTabs.TabTitleDelimiter tabTitleDelimiter = (DivTabs.TabTitleDelimiter) JsonPropertyParser.readOptional(parsingContext, jSONObject, "tab_title_delimiter", this.component.getDivTabsTabTitleDelimiterJsonEntityParser());
            DivTabs.TabTitleStyle tabTitleStyle = (DivTabs.TabTitleStyle) JsonPropertyParser.readOptional(parsingContext, jSONObject, "tab_title_style", this.component.getDivTabsTabTitleStyleJsonEntityParser());
            DivEdgeInsets divEdgeInsets5 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "title_paddings", this.component.getDivEdgeInsetsJsonEntityParser());
            if (divEdgeInsets5 == null) {
                divEdgeInsets5 = DivTabsJsonParser.TITLE_PADDINGS_DEFAULT_VALUE;
            }
            DivEdgeInsets divEdgeInsets6 = divEdgeInsets5;
            List readOptionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.component.getDivTooltipJsonEntityParser());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.component.getDivTransformJsonEntityParser());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.component.getDivChangeTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.component.getDivAppearanceTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.component.getDivAppearanceTransitionJsonEntityParser());
            List readOptionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivTabsJsonParser.TRANSITION_TRIGGERS_VALIDATOR);
            List readOptionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.component.getDivTriggerJsonEntityParser());
            List readOptionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.component.getDivVariableJsonEntityParser());
            TypeHelper typeHelper5 = DivTabsJsonParser.TYPE_HELPER_VISIBILITY;
            Function1 function15 = DivVisibility.FROM_STRING;
            Expression expression10 = DivTabsJsonParser.VISIBILITY_DEFAULT_VALUE;
            Expression readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, typeHelper5, function15, expression10);
            Expression expression11 = readOptionalExpression13 == null ? expression10 : readOptionalExpression13;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.component.getDivVisibilityActionJsonEntityParser());
            List readOptionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.component.getDivVisibilityActionJsonEntityParser());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.component.getDivSizeJsonEntityParser());
            if (divSize3 == null) {
                divSize3 = DivTabsJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivTabs(divAccessibility, readOptionalExpression, readOptionalExpression2, expression, readOptionalList, readOptionalList2, divBorder, readOptionalExpression4, readOptionalList3, expression2, readOptionalList4, divFocus, readOptionalList5, expression3, divSize2, str, readList, divLayoutProvider, divEdgeInsets, divEdgeInsets2, expression4, readOptionalExpression8, readOptionalExpression9, readOptionalList6, expression5, expression7, divEdgeInsets4, expression9, tabTitleDelimiter, tabTitleStyle, divEdgeInsets6, readOptionalList7, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, readOptionalList8, readOptionalList9, readOptionalList10, expression11, divVisibilityAction, readOptionalList11, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivTabs divTabs) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divTabs.getAccessibility(), this.component.getDivAccessibilityJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divTabs.getAlignmentHorizontal(), DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divTabs.getAlignmentVertical(), DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divTabs.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divTabs.getAnimators(), this.component.getDivAnimatorJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, M2.g, divTabs.getBackground(), this.component.getDivBackgroundJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divTabs.getBorder(), this.component.getDivBorderJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divTabs.getColumnSpan());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divTabs.getDisappearActions(), this.component.getDivDisappearActionJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "dynamic_height", divTabs.dynamicHeight);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divTabs.getExtensions(), this.component.getDivExtensionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divTabs.getFocus(), this.component.getDivFocusJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divTabs.getFunctions(), this.component.getDivFunctionJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "has_separator", divTabs.hasSeparator);
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divTabs.getHeight(), this.component.getDivSizeJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divTabs.getId());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", divTabs.items, this.component.getDivTabsItemJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divTabs.getLayoutProvider(), this.component.getDivLayoutProviderJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divTabs.getMargins(), this.component.getDivEdgeInsetsJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divTabs.getPaddings(), this.component.getDivEdgeInsetsJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "restrict_parent_scroll", divTabs.restrictParentScroll);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divTabs.getReuseId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divTabs.getRowSpan());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divTabs.getSelectedActions(), this.component.getDivActionJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "selected_tab", divTabs.selectedTab);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "separator_color", divTabs.separatorColor, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "separator_paddings", divTabs.separatorPaddings, this.component.getDivEdgeInsetsJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "switch_tabs_by_content_swipe_enabled", divTabs.switchTabsByContentSwipeEnabled);
            JsonPropertyParser.write(parsingContext, jSONObject, "tab_title_delimiter", divTabs.tabTitleDelimiter, this.component.getDivTabsTabTitleDelimiterJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "tab_title_style", divTabs.tabTitleStyle, this.component.getDivTabsTabTitleStyleJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "title_paddings", divTabs.titlePaddings, this.component.getDivEdgeInsetsJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divTabs.getTooltips(), this.component.getDivTooltipJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divTabs.getTransform(), this.component.getDivTransformJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divTabs.getTransitionChange(), this.component.getDivChangeTransitionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divTabs.getTransitionIn(), this.component.getDivAppearanceTransitionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divTabs.getTransitionOut(), this.component.getDivAppearanceTransitionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divTabs.getTransitionTriggers(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "tabs");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divTabs.getVariableTriggers(), this.component.getDivTriggerJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divTabs.getVariables(), this.component.getDivVariableJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, divTabs.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divTabs.getVisibilityAction(), this.component.getDivVisibilityActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divTabs.getVisibilityActions(), this.component.getDivVisibilityActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divTabs.getWidth(), this.component.getDivSizeJsonEntityParser());
            return jSONObject;
        }
    }

    /* compiled from: DivTabsJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivTabsTemplate deserialize(ParsingContext parsingContext, DivTabsTemplate divTabsTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.accessibility : null, this.component.getDivAccessibilityJsonTemplateParser());
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_horizontal", DivTabsJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.alignmentHorizontal : null, DivAlignmentHorizontal.FROM_STRING);
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", DivTabsJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.alignmentVertical : null, DivAlignmentVertical.FROM_STRING);
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.alpha : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivTabsJsonParser.ALPHA_VALIDATOR);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.animators : null, this.component.getDivAnimatorJsonTemplateParser());
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, M2.g, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.background : null, this.component.getDivBackgroundJsonTemplateParser());
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.border : null, this.component.getDivBorderJsonTemplateParser());
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = divTabsTemplate != null ? divTabsTemplate.columnSpan : null;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_span", typeHelper, allowPropertyOverride, field, function1, DivTabsJsonParser.COLUMN_SPAN_VALIDATOR);
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.disappearActions : null, this.component.getDivDisappearActionJsonTemplateParser());
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field2 = divTabsTemplate != null ? divTabsTemplate.dynamicHeight : null;
            Function1 function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "dynamic_height", typeHelper2, allowPropertyOverride, field2, function12);
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.extensions : null, this.component.getDivExtensionJsonTemplateParser());
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.focus : null, this.component.getDivFocusJsonTemplateParser());
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.functions : null, this.component.getDivFunctionJsonTemplateParser());
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "has_separator", typeHelper2, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.hasSeparator : null, function12);
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.height : null, this.component.getDivSizeJsonTemplateParser());
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.id : null);
            Field field3 = divTabsTemplate != null ? divTabsTemplate.items : null;
            Lazy divTabsItemJsonTemplateParser = this.component.getDivTabsItemJsonTemplateParser();
            ListValidator listValidator = DivTabsJsonParser.ITEMS_VALIDATOR;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readListField = JsonFieldParser.readListField(restrictPropertyOverride, jSONObject, "items", allowPropertyOverride, field3, divTabsItemJsonTemplateParser, listValidator);
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.layoutProvider : null, this.component.getDivLayoutProviderJsonTemplateParser());
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.margins : null, this.component.getDivEdgeInsetsJsonTemplateParser());
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.paddings : null, this.component.getDivEdgeInsetsJsonTemplateParser());
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "restrict_parent_scroll", typeHelper2, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.restrictParentScroll : null, function12);
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.reuseId : null);
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "row_span", typeHelper, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.rowSpan : null, function1, DivTabsJsonParser.ROW_SPAN_VALIDATOR);
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.selectedActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "selected_tab", typeHelper, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.selectedTab : null, function1, DivTabsJsonParser.SELECTED_TAB_VALIDATOR);
            Field readOptionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "separator_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.separatorColor : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "separator_paddings", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.separatorPaddings : null, this.component.getDivEdgeInsetsJsonTemplateParser());
            Field readOptionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "switch_tabs_by_content_swipe_enabled", typeHelper2, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.switchTabsByContentSwipeEnabled : null, function12);
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "tab_title_delimiter", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.tabTitleDelimiter : null, this.component.getDivTabsTabTitleDelimiterJsonTemplateParser());
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "tab_title_style", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.tabTitleStyle : null, this.component.getDivTabsTabTitleStyleJsonTemplateParser());
            Field readOptionalField12 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "title_paddings", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.titlePaddings : null, this.component.getDivEdgeInsetsJsonTemplateParser());
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.tooltips : null, this.component.getDivTooltipJsonTemplateParser());
            Field readOptionalField13 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.transform : null, this.component.getDivTransformJsonTemplateParser());
            Field readOptionalField14 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.transitionChange : null, this.component.getDivChangeTransitionJsonTemplateParser());
            Field readOptionalField15 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.transitionIn : null, this.component.getDivAppearanceTransitionJsonTemplateParser());
            Field readOptionalField16 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.transitionOut : null, this.component.getDivAppearanceTransitionJsonTemplateParser());
            Field field4 = divTabsTemplate != null ? divTabsTemplate.transitionTriggers : null;
            Function1 function13 = DivTransitionTrigger.FROM_STRING;
            ListValidator listValidator2 = DivTabsJsonParser.TRANSITION_TRIGGERS_VALIDATOR;
            Intrinsics.checkNotNull(listValidator2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivTabsTemplate(readOptionalField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField, readOptionalListField2, readOptionalField2, readOptionalFieldWithExpression4, readOptionalListField3, readOptionalFieldWithExpression5, readOptionalListField4, readOptionalField3, readOptionalListField5, readOptionalFieldWithExpression6, readOptionalField4, readOptionalField5, readListField, readOptionalField6, readOptionalField7, readOptionalField8, readOptionalFieldWithExpression7, readOptionalFieldWithExpression8, readOptionalFieldWithExpression9, readOptionalListField6, readOptionalFieldWithExpression10, readOptionalFieldWithExpression11, readOptionalField9, readOptionalFieldWithExpression12, readOptionalField10, readOptionalField11, readOptionalField12, readOptionalListField7, readOptionalField13, readOptionalField14, readOptionalField15, readOptionalField16, JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field4, function13, listValidator2), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.variableTriggers : null, this.component.getDivTriggerJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.variables : null, this.component.getDivVariableJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, DivTabsJsonParser.TYPE_HELPER_VISIBILITY, allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.visibility : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.visibilityAction : null, this.component.getDivVisibilityActionJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.visibilityActions : null, this.component.getDivVisibilityActionJsonTemplateParser()), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divTabsTemplate != null ? divTabsTemplate.width : null, this.component.getDivSizeJsonTemplateParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivTabsTemplate divTabsTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divTabsTemplate.accessibility, this.component.getDivAccessibilityJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", divTabsTemplate.alignmentHorizontal, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", divTabsTemplate.alignmentVertical, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divTabsTemplate.alpha);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divTabsTemplate.animators, this.component.getDivAnimatorJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, M2.g, divTabsTemplate.background, this.component.getDivBackgroundJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", divTabsTemplate.border, this.component.getDivBorderJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divTabsTemplate.columnSpan);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divTabsTemplate.disappearActions, this.component.getDivDisappearActionJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "dynamic_height", divTabsTemplate.dynamicHeight);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divTabsTemplate.extensions, this.component.getDivExtensionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divTabsTemplate.focus, this.component.getDivFocusJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divTabsTemplate.functions, this.component.getDivFunctionJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "has_separator", divTabsTemplate.hasSeparator);
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divTabsTemplate.height, this.component.getDivSizeJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divTabsTemplate.id);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", divTabsTemplate.items, this.component.getDivTabsItemJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divTabsTemplate.layoutProvider, this.component.getDivLayoutProviderJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divTabsTemplate.margins, this.component.getDivEdgeInsetsJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divTabsTemplate.paddings, this.component.getDivEdgeInsetsJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "restrict_parent_scroll", divTabsTemplate.restrictParentScroll);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divTabsTemplate.reuseId);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divTabsTemplate.rowSpan);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divTabsTemplate.selectedActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "selected_tab", divTabsTemplate.selectedTab);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "separator_color", divTabsTemplate.separatorColor, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "separator_paddings", divTabsTemplate.separatorPaddings, this.component.getDivEdgeInsetsJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "switch_tabs_by_content_swipe_enabled", divTabsTemplate.switchTabsByContentSwipeEnabled);
            JsonFieldParser.writeField(parsingContext, jSONObject, "tab_title_delimiter", divTabsTemplate.tabTitleDelimiter, this.component.getDivTabsTabTitleDelimiterJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "tab_title_style", divTabsTemplate.tabTitleStyle, this.component.getDivTabsTabTitleStyleJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "title_paddings", divTabsTemplate.titlePaddings, this.component.getDivEdgeInsetsJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divTabsTemplate.tooltips, this.component.getDivTooltipJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divTabsTemplate.transform, this.component.getDivTransformJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divTabsTemplate.transitionChange, this.component.getDivChangeTransitionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divTabsTemplate.transitionIn, this.component.getDivAppearanceTransitionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divTabsTemplate.transitionOut, this.component.getDivAppearanceTransitionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divTabsTemplate.transitionTriggers, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "tabs");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divTabsTemplate.variableTriggers, this.component.getDivTriggerJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divTabsTemplate.variables, this.component.getDivVariableJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, divTabsTemplate.visibility, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divTabsTemplate.visibilityAction, this.component.getDivVisibilityActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divTabsTemplate.visibilityActions, this.component.getDivVisibilityActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divTabsTemplate.width, this.component.getDivSizeJsonTemplateParser());
            return jSONObject;
        }
    }

    /* compiled from: DivTabsJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivTabs resolve(ParsingContext parsingContext, DivTabsTemplate divTabsTemplate, JSONObject jSONObject) {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.accessibility, jSONObject, "accessibility", this.component.getDivAccessibilityJsonTemplateResolver(), this.component.getDivAccessibilityJsonEntityParser());
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTabsTemplate.alignmentHorizontal, jSONObject, "alignment_horizontal", DivTabsJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL, DivAlignmentHorizontal.FROM_STRING);
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTabsTemplate.alignmentVertical, jSONObject, "alignment_vertical", DivTabsJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, DivAlignmentVertical.FROM_STRING);
            Field field = divTabsTemplate.alpha;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivTabsJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivTabsJsonParser.ALPHA_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression3 != null) {
                expression = resolveOptionalExpression3;
            }
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divTabsTemplate.animators, jSONObject, "animators", this.component.getDivAnimatorJsonTemplateResolver(), this.component.getDivAnimatorJsonEntityParser());
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divTabsTemplate.background, jSONObject, M2.g, this.component.getDivBackgroundJsonTemplateResolver(), this.component.getDivBackgroundJsonEntityParser());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.border, jSONObject, "border", this.component.getDivBorderJsonTemplateResolver(), this.component.getDivBorderJsonEntityParser());
            Field field2 = divTabsTemplate.columnSpan;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "column_span", typeHelper2, function12, DivTabsJsonParser.COLUMN_SPAN_VALIDATOR);
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divTabsTemplate.disappearActions, jSONObject, "disappear_actions", this.component.getDivDisappearActionJsonTemplateResolver(), this.component.getDivDisappearActionJsonEntityParser());
            Field field3 = divTabsTemplate.dynamicHeight;
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = DivTabsJsonParser.DYNAMIC_HEIGHT_DEFAULT_VALUE;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "dynamic_height", typeHelper3, function13, expression2);
            if (resolveOptionalExpression5 != null) {
                expression2 = resolveOptionalExpression5;
            }
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divTabsTemplate.extensions, jSONObject, "extensions", this.component.getDivExtensionJsonTemplateResolver(), this.component.getDivExtensionJsonEntityParser());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.focus, jSONObject, "focus", this.component.getDivFocusJsonTemplateResolver(), this.component.getDivFocusJsonEntityParser());
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divTabsTemplate.functions, jSONObject, "functions", this.component.getDivFunctionJsonTemplateResolver(), this.component.getDivFunctionJsonEntityParser());
            Field field4 = divTabsTemplate.hasSeparator;
            Expression expression3 = DivTabsJsonParser.HAS_SEPARATOR_DEFAULT_VALUE;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "has_separator", typeHelper3, function13, expression3);
            if (resolveOptionalExpression6 != null) {
                expression3 = resolveOptionalExpression6;
            }
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.height, jSONObject, "height", this.component.getDivSizeJsonTemplateResolver(), this.component.getDivSizeJsonEntityParser());
            if (divSize == null) {
                divSize = DivTabsJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            DivSize divSize2 = divSize;
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.id, jSONObject, "id");
            List resolveList = JsonFieldResolver.resolveList(parsingContext, divTabsTemplate.items, jSONObject, "items", this.component.getDivTabsItemJsonTemplateResolver(), this.component.getDivTabsItemJsonEntityParser(), DivTabsJsonParser.ITEMS_VALIDATOR);
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.layoutProvider, jSONObject, "layout_provider", this.component.getDivLayoutProviderJsonTemplateResolver(), this.component.getDivLayoutProviderJsonEntityParser());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.margins, jSONObject, "margins", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.paddings, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            Field field5 = divTabsTemplate.restrictParentScroll;
            Expression expression4 = DivTabsJsonParser.RESTRICT_PARENT_SCROLL_DEFAULT_VALUE;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "restrict_parent_scroll", typeHelper3, function13, expression4);
            if (resolveOptionalExpression7 != null) {
                expression4 = resolveOptionalExpression7;
            }
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTabsTemplate.reuseId, jSONObject, "reuse_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTabsTemplate.rowSpan, jSONObject, "row_span", typeHelper2, function12, DivTabsJsonParser.ROW_SPAN_VALIDATOR);
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divTabsTemplate.selectedActions, jSONObject, "selected_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            Field field6 = divTabsTemplate.selectedTab;
            ValueValidator valueValidator2 = DivTabsJsonParser.SELECTED_TAB_VALIDATOR;
            Expression expression5 = DivTabsJsonParser.SELECTED_TAB_DEFAULT_VALUE;
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "selected_tab", typeHelper2, function12, valueValidator2, expression5);
            if (resolveOptionalExpression10 != null) {
                expression5 = resolveOptionalExpression10;
            }
            Field field7 = divTabsTemplate.separatorColor;
            TypeHelper<Integer> typeHelper4 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1 function14 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression6 = DivTabsJsonParser.SEPARATOR_COLOR_DEFAULT_VALUE;
            Expression resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "separator_color", typeHelper4, function14, expression6);
            Expression expression7 = resolveOptionalExpression11 == null ? expression6 : resolveOptionalExpression11;
            DivEdgeInsets divEdgeInsets3 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.separatorPaddings, jSONObject, "separator_paddings", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            if (divEdgeInsets3 == null) {
                divEdgeInsets3 = DivTabsJsonParser.SEPARATOR_PADDINGS_DEFAULT_VALUE;
            }
            DivEdgeInsets divEdgeInsets4 = divEdgeInsets3;
            Field field8 = divTabsTemplate.switchTabsByContentSwipeEnabled;
            Expression expression8 = DivTabsJsonParser.SWITCH_TABS_BY_CONTENT_SWIPE_ENABLED_DEFAULT_VALUE;
            Expression resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "switch_tabs_by_content_swipe_enabled", typeHelper3, function13, expression8);
            Expression expression9 = resolveOptionalExpression12 == null ? expression8 : resolveOptionalExpression12;
            DivTabs.TabTitleDelimiter tabTitleDelimiter = (DivTabs.TabTitleDelimiter) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.tabTitleDelimiter, jSONObject, "tab_title_delimiter", this.component.getDivTabsTabTitleDelimiterJsonTemplateResolver(), this.component.getDivTabsTabTitleDelimiterJsonEntityParser());
            DivTabs.TabTitleStyle tabTitleStyle = (DivTabs.TabTitleStyle) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.tabTitleStyle, jSONObject, "tab_title_style", this.component.getDivTabsTabTitleStyleJsonTemplateResolver(), this.component.getDivTabsTabTitleStyleJsonEntityParser());
            DivEdgeInsets divEdgeInsets5 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.titlePaddings, jSONObject, "title_paddings", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            if (divEdgeInsets5 == null) {
                divEdgeInsets5 = DivTabsJsonParser.TITLE_PADDINGS_DEFAULT_VALUE;
            }
            DivEdgeInsets divEdgeInsets6 = divEdgeInsets5;
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divTabsTemplate.tooltips, jSONObject, "tooltips", this.component.getDivTooltipJsonTemplateResolver(), this.component.getDivTooltipJsonEntityParser());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.transform, jSONObject, "transform", this.component.getDivTransformJsonTemplateResolver(), this.component.getDivTransformJsonEntityParser());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.transitionChange, jSONObject, "transition_change", this.component.getDivChangeTransitionJsonTemplateResolver(), this.component.getDivChangeTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.transitionIn, jSONObject, "transition_in", this.component.getDivAppearanceTransitionJsonTemplateResolver(), this.component.getDivAppearanceTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.transitionOut, jSONObject, "transition_out", this.component.getDivAppearanceTransitionJsonTemplateResolver(), this.component.getDivAppearanceTransitionJsonEntityParser());
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divTabsTemplate.transitionTriggers, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivTabsJsonParser.TRANSITION_TRIGGERS_VALIDATOR);
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divTabsTemplate.variableTriggers, jSONObject, "variable_triggers", this.component.getDivTriggerJsonTemplateResolver(), this.component.getDivTriggerJsonEntityParser());
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divTabsTemplate.variables, jSONObject, "variables", this.component.getDivVariableJsonTemplateResolver(), this.component.getDivVariableJsonEntityParser());
            Field field9 = divTabsTemplate.visibility;
            TypeHelper typeHelper5 = DivTabsJsonParser.TYPE_HELPER_VISIBILITY;
            Function1 function15 = DivVisibility.FROM_STRING;
            Expression expression10 = DivTabsJsonParser.VISIBILITY_DEFAULT_VALUE;
            Expression resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, typeHelper5, function15, expression10);
            Expression expression11 = resolveOptionalExpression13 == null ? expression10 : resolveOptionalExpression13;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.visibilityAction, jSONObject, "visibility_action", this.component.getDivVisibilityActionJsonTemplateResolver(), this.component.getDivVisibilityActionJsonEntityParser());
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divTabsTemplate.visibilityActions, jSONObject, "visibility_actions", this.component.getDivVisibilityActionJsonTemplateResolver(), this.component.getDivVisibilityActionJsonEntityParser());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divTabsTemplate.width, jSONObject, "width", this.component.getDivSizeJsonTemplateResolver(), this.component.getDivSizeJsonEntityParser());
            if (divSize3 == null) {
                divSize3 = DivTabsJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivTabs(divAccessibility, resolveOptionalExpression, resolveOptionalExpression2, expression, resolveOptionalList, resolveOptionalList2, divBorder, resolveOptionalExpression4, resolveOptionalList3, expression2, resolveOptionalList4, divFocus, resolveOptionalList5, expression3, divSize2, str, resolveList, divLayoutProvider, divEdgeInsets, divEdgeInsets2, expression4, resolveOptionalExpression8, resolveOptionalExpression9, resolveOptionalList6, expression5, expression7, divEdgeInsets4, expression9, tabTitleDelimiter, tabTitleStyle, divEdgeInsets6, resolveOptionalList7, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, resolveOptionalList8, resolveOptionalList9, resolveOptionalList10, expression11, divVisibilityAction, resolveOptionalList11, divSize3);
        }
    }

    /* compiled from: DivTabsJsonParser.kt */
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
        Boolean bool = Boolean.FALSE;
        DYNAMIC_HEIGHT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        HAS_SEPARATOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, null, null, 7, null));
        RESTRICT_PARENT_SCROLL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        SELECTED_TAB_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        SEPARATOR_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Integer.valueOf(DivSeparatorView.DEFAULT_DIVIDER_COLOR), null, 2, null);
        SEPARATOR_PADDINGS_DEFAULT_VALUE = new DivEdgeInsets(Expression.Companion.constant$default(companion, 0L, null, 2, null), null, Expression.Companion.constant$default(companion, 12L, null, 2, null), Expression.Companion.constant$default(companion, 12L, null, 2, null), null, Expression.Companion.constant$default(companion, 0L, null, 2, null), null, 82, null);
        SWITCH_TABS_BY_CONTENT_SWIPE_ENABLED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        TITLE_PADDINGS_DEFAULT_VALUE = new DivEdgeInsets(Expression.Companion.constant$default(companion, 8L, null, 2, null), null, Expression.Companion.constant$default(companion, 12L, null, 2, null), Expression.Companion.constant$default(companion, 12L, null, 2, null), null, Expression.Companion.constant$default(companion, 0L, null, 2, null), null, 82, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(null, null, null, 7, null));
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        TYPE_HELPER_ALIGNMENT_HORIZONTAL = companion2.from(ArraysKt.first(DivAlignmentHorizontal.values()), new Function1() { // from class: com.yandex.div2.DivTabsJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        TYPE_HELPER_ALIGNMENT_VERTICAL = companion2.from(ArraysKt.first(DivAlignmentVertical.values()), new Function1() { // from class: com.yandex.div2.DivTabsJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        TYPE_HELPER_VISIBILITY = companion2.from(divVisibility, new Function1() { // from class: com.yandex.div2.DivTabsJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        ALPHA_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivTabsJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ALPHA_VALIDATOR$lambda$0;
                ALPHA_VALIDATOR$lambda$0 = DivTabsJsonParser.ALPHA_VALIDATOR$lambda$0(((Double) obj).doubleValue());
                return ALPHA_VALIDATOR$lambda$0;
            }
        };
        COLUMN_SPAN_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivTabsJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean COLUMN_SPAN_VALIDATOR$lambda$1;
                COLUMN_SPAN_VALIDATOR$lambda$1 = DivTabsJsonParser.COLUMN_SPAN_VALIDATOR$lambda$1(((Long) obj).longValue());
                return COLUMN_SPAN_VALIDATOR$lambda$1;
            }
        };
        ITEMS_VALIDATOR = new ListValidator() { // from class: com.yandex.div2.DivTabsJsonParser$$ExternalSyntheticLambda2
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean ITEMS_VALIDATOR$lambda$2;
                ITEMS_VALIDATOR$lambda$2 = DivTabsJsonParser.ITEMS_VALIDATOR$lambda$2(list);
                return ITEMS_VALIDATOR$lambda$2;
            }
        };
        ROW_SPAN_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivTabsJsonParser$$ExternalSyntheticLambda3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ROW_SPAN_VALIDATOR$lambda$3;
                ROW_SPAN_VALIDATOR$lambda$3 = DivTabsJsonParser.ROW_SPAN_VALIDATOR$lambda$3(((Long) obj).longValue());
                return ROW_SPAN_VALIDATOR$lambda$3;
            }
        };
        SELECTED_TAB_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivTabsJsonParser$$ExternalSyntheticLambda4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean SELECTED_TAB_VALIDATOR$lambda$4;
                SELECTED_TAB_VALIDATOR$lambda$4 = DivTabsJsonParser.SELECTED_TAB_VALIDATOR$lambda$4(((Long) obj).longValue());
                return SELECTED_TAB_VALIDATOR$lambda$4;
            }
        };
        TRANSITION_TRIGGERS_VALIDATOR = new ListValidator() { // from class: com.yandex.div2.DivTabsJsonParser$$ExternalSyntheticLambda5
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean TRANSITION_TRIGGERS_VALIDATOR$lambda$5;
                TRANSITION_TRIGGERS_VALIDATOR$lambda$5 = DivTabsJsonParser.TRANSITION_TRIGGERS_VALIDATOR$lambda$5(list);
                return TRANSITION_TRIGGERS_VALIDATOR$lambda$5;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ITEMS_VALIDATOR$lambda$2(List list) {
        return list.size() >= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TRANSITION_TRIGGERS_VALIDATOR$lambda$5(List list) {
        return list.size() >= 1;
    }
}
