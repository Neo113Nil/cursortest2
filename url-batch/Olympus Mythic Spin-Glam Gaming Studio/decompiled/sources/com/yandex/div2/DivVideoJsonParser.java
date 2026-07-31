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
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivVideoJsonParser.kt */
/* loaded from: classes11.dex */
public abstract class DivVideoJsonParser {
    public static final Expression ALPHA_DEFAULT_VALUE;
    public static final ValueValidator ALPHA_VALIDATOR;
    public static final Expression AUTOSTART_DEFAULT_VALUE;
    public static final ValueValidator COLUMN_SPAN_VALIDATOR;
    private static final Companion Companion = new Companion(null);
    public static final DivSize.WrapContent HEIGHT_DEFAULT_VALUE;
    public static final Expression MUTED_DEFAULT_VALUE;
    public static final Expression PRELOAD_REQUIRED_DEFAULT_VALUE;
    public static final Expression REPEATABLE_DEFAULT_VALUE;
    public static final ValueValidator ROW_SPAN_VALIDATOR;
    public static final Expression SCALE_DEFAULT_VALUE;
    public static final ListValidator TRANSITION_TRIGGERS_VALIDATOR;
    public static final TypeHelper TYPE_HELPER_ALIGNMENT_HORIZONTAL;
    public static final TypeHelper TYPE_HELPER_ALIGNMENT_VERTICAL;
    public static final TypeHelper TYPE_HELPER_SCALE;
    public static final TypeHelper TYPE_HELPER_VISIBILITY;
    public static final ListValidator VIDEO_SOURCES_VALIDATOR;
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

    /* compiled from: DivVideoJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivVideo deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            DivAccessibility divAccessibility = (DivAccessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.component.getDivAccessibilityJsonEntityParser());
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_horizontal", DivVideoJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL, DivAlignmentHorizontal.FROM_STRING);
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivVideoJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, DivAlignmentVertical.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivVideoJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivVideoJsonParser.ALPHA_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression3 != null) {
                expression = readOptionalExpression3;
            }
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "animators", this.component.getDivAnimatorJsonEntityParser());
            DivAspect divAspect = (DivAspect) JsonPropertyParser.readOptional(parsingContext, jSONObject, "aspect", this.component.getDivAspectJsonEntityParser());
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = DivVideoJsonParser.AUTOSTART_DEFAULT_VALUE;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "autostart", typeHelper2, function12, expression2);
            if (readOptionalExpression4 != null) {
                expression2 = readOptionalExpression4;
            }
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, M2.g, this.component.getDivBackgroundJsonEntityParser());
            DivBorder divBorder = (DivBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.component.getDivBorderJsonEntityParser());
            List readOptionalList3 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "buffering_actions", this.component.getDivActionJsonEntityParser());
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function13 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "column_span", typeHelper3, function13, DivVideoJsonParser.COLUMN_SPAN_VALIDATOR);
            List readOptionalList4 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "disappear_actions", this.component.getDivDisappearActionJsonEntityParser());
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "elapsed_time_variable");
            List readOptionalList5 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "end_actions", this.component.getDivActionJsonEntityParser());
            List readOptionalList6 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "extensions", this.component.getDivExtensionJsonEntityParser());
            List readOptionalList7 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "fatal_actions", this.component.getDivActionJsonEntityParser());
            DivFocus divFocus = (DivFocus) JsonPropertyParser.readOptional(parsingContext, jSONObject, "focus", this.component.getDivFocusJsonEntityParser());
            List readOptionalList8 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "functions", this.component.getDivFunctionJsonEntityParser());
            DivSize divSize = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.component.getDivSizeJsonEntityParser());
            if (divSize == null) {
                divSize = DivVideoJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            DivSize divSize2 = divSize;
            String str2 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "id");
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonPropertyParser.readOptional(parsingContext, jSONObject, "layout_provider", this.component.getDivLayoutProviderJsonEntityParser());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.component.getDivEdgeInsetsJsonEntityParser());
            Expression expression3 = DivVideoJsonParser.MUTED_DEFAULT_VALUE;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "muted", typeHelper2, function12, expression3);
            if (readOptionalExpression6 != null) {
                expression3 = readOptionalExpression6;
            }
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonEntityParser());
            List readOptionalList9 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "pause_actions", this.component.getDivActionJsonEntityParser());
            JSONObject jSONObject2 = (JSONObject) JsonPropertyParser.readOptional(parsingContext, jSONObject, "player_settings_payload");
            Expression expression4 = DivVideoJsonParser.PRELOAD_REQUIRED_DEFAULT_VALUE;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preload_required", typeHelper2, function12, expression4);
            if (readOptionalExpression7 != null) {
                expression4 = readOptionalExpression7;
            }
            TypeHelper<String> typeHelper4 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preview", typeHelper4);
            Expression expression5 = DivVideoJsonParser.REPEATABLE_DEFAULT_VALUE;
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "repeatable", typeHelper2, function12, expression5);
            if (readOptionalExpression9 != null) {
                expression5 = readOptionalExpression9;
            }
            List readOptionalList10 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "resume_actions", this.component.getDivActionJsonEntityParser());
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reuse_id", typeHelper4);
            Expression readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "row_span", typeHelper3, function13, DivVideoJsonParser.ROW_SPAN_VALIDATOR);
            TypeHelper typeHelper5 = DivVideoJsonParser.TYPE_HELPER_SCALE;
            Function1 function14 = DivVideoScale.FROM_STRING;
            Expression expression6 = DivVideoJsonParser.SCALE_DEFAULT_VALUE;
            Expression readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scale", typeHelper5, function14, expression6);
            Expression expression7 = readOptionalExpression12 == null ? expression6 : readOptionalExpression12;
            List readOptionalList11 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "selected_actions", this.component.getDivActionJsonEntityParser());
            List readOptionalList12 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tooltips", this.component.getDivTooltipJsonEntityParser());
            DivTransform divTransform = (DivTransform) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transform", this.component.getDivTransformJsonEntityParser());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_change", this.component.getDivChangeTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_in", this.component.getDivAppearanceTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonPropertyParser.readOptional(parsingContext, jSONObject, "transition_out", this.component.getDivAppearanceTransitionJsonEntityParser());
            List readOptionalList13 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivVideoJsonParser.TRANSITION_TRIGGERS_VALIDATOR);
            List readOptionalList14 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variable_triggers", this.component.getDivTriggerJsonEntityParser());
            List readOptionalList15 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "variables", this.component.getDivVariableJsonEntityParser());
            List readList = JsonPropertyParser.readList(parsingContext, jSONObject, "video_sources", this.component.getDivVideoSourceJsonEntityParser(), DivVideoJsonParser.VIDEO_SOURCES_VALIDATOR);
            TypeHelper typeHelper6 = DivVideoJsonParser.TYPE_HELPER_VISIBILITY;
            Function1 function15 = DivVisibility.FROM_STRING;
            Expression expression8 = DivVideoJsonParser.VISIBILITY_DEFAULT_VALUE;
            Expression readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, typeHelper6, function15, expression8);
            Expression expression9 = readOptionalExpression13 == null ? expression8 : readOptionalExpression13;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "visibility_action", this.component.getDivVisibilityActionJsonEntityParser());
            List readOptionalList16 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "visibility_actions", this.component.getDivVisibilityActionJsonEntityParser());
            DivSize divSize3 = (DivSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.component.getDivSizeJsonEntityParser());
            if (divSize3 == null) {
                divSize3 = DivVideoJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivVideo(divAccessibility, readOptionalExpression, readOptionalExpression2, expression, readOptionalList, divAspect, expression2, readOptionalList2, divBorder, readOptionalList3, readOptionalExpression5, readOptionalList4, str, readOptionalList5, readOptionalList6, readOptionalList7, divFocus, readOptionalList8, divSize2, str2, divLayoutProvider, divEdgeInsets, expression3, divEdgeInsets2, readOptionalList9, jSONObject2, expression4, readOptionalExpression8, expression5, readOptionalList10, readOptionalExpression10, readOptionalExpression11, expression7, readOptionalList11, readOptionalList12, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, readOptionalList13, readOptionalList14, readOptionalList15, readList, expression9, divVisibilityAction, readOptionalList16, divSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivVideo divVideo) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", divVideo.getAccessibility(), this.component.getDivAccessibilityJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_horizontal", divVideo.getAlignmentHorizontal(), DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", divVideo.getAlignmentVertical(), DivAlignmentVertical.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divVideo.getAlpha());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "animators", divVideo.getAnimators(), this.component.getDivAnimatorJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "aspect", divVideo.aspect, this.component.getDivAspectJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "autostart", divVideo.autostart);
            JsonPropertyParser.writeList(parsingContext, jSONObject, M2.g, divVideo.getBackground(), this.component.getDivBackgroundJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "border", divVideo.getBorder(), this.component.getDivBorderJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "buffering_actions", divVideo.bufferingActions, this.component.getDivActionJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "column_span", divVideo.getColumnSpan());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "disappear_actions", divVideo.getDisappearActions(), this.component.getDivDisappearActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "elapsed_time_variable", divVideo.elapsedTimeVariable);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "end_actions", divVideo.endActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "extensions", divVideo.getExtensions(), this.component.getDivExtensionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "fatal_actions", divVideo.fatalActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "focus", divVideo.getFocus(), this.component.getDivFocusJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divVideo.getFunctions(), this.component.getDivFunctionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "height", divVideo.getHeight(), this.component.getDivSizeJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divVideo.getId());
            JsonPropertyParser.write(parsingContext, jSONObject, "layout_provider", divVideo.getLayoutProvider(), this.component.getDivLayoutProviderJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", divVideo.getMargins(), this.component.getDivEdgeInsetsJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "muted", divVideo.muted);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divVideo.getPaddings(), this.component.getDivEdgeInsetsJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "pause_actions", divVideo.pauseActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "player_settings_payload", divVideo.playerSettingsPayload);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preload_required", divVideo.preloadRequired);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preview", divVideo.preview);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "repeatable", divVideo.repeatable);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "resume_actions", divVideo.resumeActions, this.component.getDivActionJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reuse_id", divVideo.getReuseId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "row_span", divVideo.getRowSpan());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scale", divVideo.scale, DivVideoScale.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "selected_actions", divVideo.getSelectedActions(), this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tooltips", divVideo.getTooltips(), this.component.getDivTooltipJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transform", divVideo.getTransform(), this.component.getDivTransformJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_change", divVideo.getTransitionChange(), this.component.getDivChangeTransitionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_in", divVideo.getTransitionIn(), this.component.getDivAppearanceTransitionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "transition_out", divVideo.getTransitionOut(), this.component.getDivAppearanceTransitionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "transition_triggers", divVideo.getTransitionTriggers(), DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "video");
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divVideo.getVariableTriggers(), this.component.getDivTriggerJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divVideo.getVariables(), this.component.getDivVariableJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "video_sources", divVideo.videoSources, this.component.getDivVideoSourceJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, divVideo.getVisibility(), DivVisibility.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "visibility_action", divVideo.getVisibilityAction(), this.component.getDivVisibilityActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "visibility_actions", divVideo.getVisibilityActions(), this.component.getDivVisibilityActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "width", divVideo.getWidth(), this.component.getDivSizeJsonEntityParser());
            return jSONObject;
        }
    }

    /* compiled from: DivVideoJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivVideoTemplate deserialize(ParsingContext parsingContext, DivVideoTemplate divVideoTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.accessibility : null, this.component.getDivAccessibilityJsonTemplateParser());
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_horizontal", DivVideoJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL, allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.alignmentHorizontal : null, DivAlignmentHorizontal.FROM_STRING);
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", DivVideoJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.alignmentVertical : null, DivAlignmentVertical.FROM_STRING);
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.alpha : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivVideoJsonParser.ALPHA_VALIDATOR);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "animators", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.animators : null, this.component.getDivAnimatorJsonTemplateParser());
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "aspect", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.aspect : null, this.component.getDivAspectJsonTemplateParser());
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field = divVideoTemplate != null ? divVideoTemplate.autostart : null;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "autostart", typeHelper, allowPropertyOverride, field, function1);
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, M2.g, allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.background : null, this.component.getDivBackgroundJsonTemplateParser());
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.border : null, this.component.getDivBorderJsonTemplateParser());
            Field readOptionalListField3 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "buffering_actions", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.bufferingActions : null, this.component.getDivActionJsonTemplateParser());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Field field2 = divVideoTemplate != null ? divVideoTemplate.columnSpan : null;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "column_span", typeHelper2, allowPropertyOverride, field2, function12, DivVideoJsonParser.COLUMN_SPAN_VALIDATOR);
            Field readOptionalListField4 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "disappear_actions", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.disappearActions : null, this.component.getDivDisappearActionJsonTemplateParser());
            Field readOptionalField4 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "elapsed_time_variable", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.elapsedTimeVariable : null);
            Field readOptionalListField5 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "end_actions", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.endActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalListField6 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "extensions", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.extensions : null, this.component.getDivExtensionJsonTemplateParser());
            Field readOptionalListField7 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "fatal_actions", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.fatalActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalField5 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "focus", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.focus : null, this.component.getDivFocusJsonTemplateParser());
            Field readOptionalListField8 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.functions : null, this.component.getDivFunctionJsonTemplateParser());
            Field readOptionalField6 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.height : null, this.component.getDivSizeJsonTemplateParser());
            Field readOptionalField7 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.id : null);
            Field readOptionalField8 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "layout_provider", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.layoutProvider : null, this.component.getDivLayoutProviderJsonTemplateParser());
            Field readOptionalField9 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.margins : null, this.component.getDivEdgeInsetsJsonTemplateParser());
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "muted", typeHelper, allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.muted : null, function1);
            Field readOptionalField10 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.paddings : null, this.component.getDivEdgeInsetsJsonTemplateParser());
            Field readOptionalListField9 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "pause_actions", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.pauseActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalField11 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "player_settings_payload", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.playerSettingsPayload : null);
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "preload_required", typeHelper, allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.preloadRequired : null, function1);
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "preview", typeHelper3, allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.preview : null);
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "repeatable", typeHelper, allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.repeatable : null, function1);
            Field readOptionalListField10 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "resume_actions", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.resumeActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reuse_id", typeHelper3, allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.reuseId : null);
            Field readOptionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "row_span", typeHelper2, allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.rowSpan : null, function12, DivVideoJsonParser.ROW_SPAN_VALIDATOR);
            Field readOptionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "scale", DivVideoJsonParser.TYPE_HELPER_SCALE, allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.scale : null, DivVideoScale.FROM_STRING);
            Field readOptionalListField11 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "selected_actions", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.selectedActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalListField12 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tooltips", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.tooltips : null, this.component.getDivTooltipJsonTemplateParser());
            Field readOptionalField12 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transform", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.transform : null, this.component.getDivTransformJsonTemplateParser());
            Field readOptionalField13 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_change", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.transitionChange : null, this.component.getDivChangeTransitionJsonTemplateParser());
            Field readOptionalField14 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_in", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.transitionIn : null, this.component.getDivAppearanceTransitionJsonTemplateParser());
            Field readOptionalField15 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "transition_out", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.transitionOut : null, this.component.getDivAppearanceTransitionJsonTemplateParser());
            Field field3 = divVideoTemplate != null ? divVideoTemplate.transitionTriggers : null;
            Function1 function13 = DivTransitionTrigger.FROM_STRING;
            ListValidator listValidator = DivVideoJsonParser.TRANSITION_TRIGGERS_VALIDATOR;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readOptionalListField13 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "transition_triggers", allowPropertyOverride, field3, function13, listValidator);
            Field readOptionalListField14 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.variableTriggers : null, this.component.getDivTriggerJsonTemplateParser());
            Field readOptionalListField15 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.variables : null, this.component.getDivVariableJsonTemplateParser());
            Field field4 = divVideoTemplate != null ? divVideoTemplate.videoSources : null;
            Lazy divVideoSourceJsonTemplateParser = this.component.getDivVideoSourceJsonTemplateParser();
            ListValidator listValidator2 = DivVideoJsonParser.VIDEO_SOURCES_VALIDATOR;
            Intrinsics.checkNotNull(listValidator2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivVideoTemplate(readOptionalField, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalListField, readOptionalField2, readOptionalFieldWithExpression4, readOptionalListField2, readOptionalField3, readOptionalListField3, readOptionalFieldWithExpression5, readOptionalListField4, readOptionalField4, readOptionalListField5, readOptionalListField6, readOptionalListField7, readOptionalField5, readOptionalListField8, readOptionalField6, readOptionalField7, readOptionalField8, readOptionalField9, readOptionalFieldWithExpression6, readOptionalField10, readOptionalListField9, readOptionalField11, readOptionalFieldWithExpression7, readOptionalFieldWithExpression8, readOptionalFieldWithExpression9, readOptionalListField10, readOptionalFieldWithExpression10, readOptionalFieldWithExpression11, readOptionalFieldWithExpression12, readOptionalListField11, readOptionalListField12, readOptionalField12, readOptionalField13, readOptionalField14, readOptionalField15, readOptionalListField13, readOptionalListField14, readOptionalListField15, JsonFieldParser.readListField(restrictPropertyOverride, jSONObject, "video_sources", allowPropertyOverride, field4, divVideoSourceJsonTemplateParser, listValidator2), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, DivVideoJsonParser.TYPE_HELPER_VISIBILITY, allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.visibility : null, DivVisibility.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "visibility_action", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.visibilityAction : null, this.component.getDivVisibilityActionJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "visibility_actions", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.visibilityActions : null, this.component.getDivVisibilityActionJsonTemplateParser()), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, divVideoTemplate != null ? divVideoTemplate.width : null, this.component.getDivSizeJsonTemplateParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivVideoTemplate divVideoTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", divVideoTemplate.accessibility, this.component.getDivAccessibilityJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_horizontal", divVideoTemplate.alignmentHorizontal, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", divVideoTemplate.alignmentVertical, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divVideoTemplate.alpha);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "animators", divVideoTemplate.animators, this.component.getDivAnimatorJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "aspect", divVideoTemplate.aspect, this.component.getDivAspectJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "autostart", divVideoTemplate.autostart);
            JsonFieldParser.writeListField(parsingContext, jSONObject, M2.g, divVideoTemplate.background, this.component.getDivBackgroundJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", divVideoTemplate.border, this.component.getDivBorderJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "buffering_actions", divVideoTemplate.bufferingActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "column_span", divVideoTemplate.columnSpan);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "disappear_actions", divVideoTemplate.disappearActions, this.component.getDivDisappearActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "elapsed_time_variable", divVideoTemplate.elapsedTimeVariable);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "end_actions", divVideoTemplate.endActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "extensions", divVideoTemplate.extensions, this.component.getDivExtensionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "fatal_actions", divVideoTemplate.fatalActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "focus", divVideoTemplate.focus, this.component.getDivFocusJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divVideoTemplate.functions, this.component.getDivFunctionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", divVideoTemplate.height, this.component.getDivSizeJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divVideoTemplate.id);
            JsonFieldParser.writeField(parsingContext, jSONObject, "layout_provider", divVideoTemplate.layoutProvider, this.component.getDivLayoutProviderJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", divVideoTemplate.margins, this.component.getDivEdgeInsetsJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "muted", divVideoTemplate.muted);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divVideoTemplate.paddings, this.component.getDivEdgeInsetsJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "pause_actions", divVideoTemplate.pauseActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "player_settings_payload", divVideoTemplate.playerSettingsPayload);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preload_required", divVideoTemplate.preloadRequired);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preview", divVideoTemplate.preview);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "repeatable", divVideoTemplate.repeatable);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "resume_actions", divVideoTemplate.resumeActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reuse_id", divVideoTemplate.reuseId);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "row_span", divVideoTemplate.rowSpan);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scale", divVideoTemplate.scale, DivVideoScale.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "selected_actions", divVideoTemplate.selectedActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tooltips", divVideoTemplate.tooltips, this.component.getDivTooltipJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transform", divVideoTemplate.transform, this.component.getDivTransformJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_change", divVideoTemplate.transitionChange, this.component.getDivChangeTransitionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_in", divVideoTemplate.transitionIn, this.component.getDivAppearanceTransitionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "transition_out", divVideoTemplate.transitionOut, this.component.getDivAppearanceTransitionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "transition_triggers", divVideoTemplate.transitionTriggers, DivTransitionTrigger.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "video");
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divVideoTemplate.variableTriggers, this.component.getDivTriggerJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divVideoTemplate.variables, this.component.getDivVariableJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "video_sources", divVideoTemplate.videoSources, this.component.getDivVideoSourceJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, divVideoTemplate.visibility, DivVisibility.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "visibility_action", divVideoTemplate.visibilityAction, this.component.getDivVisibilityActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "visibility_actions", divVideoTemplate.visibilityActions, this.component.getDivVisibilityActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", divVideoTemplate.width, this.component.getDivSizeJsonTemplateParser());
            return jSONObject;
        }
    }

    /* compiled from: DivVideoJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivVideo resolve(ParsingContext parsingContext, DivVideoTemplate divVideoTemplate, JSONObject jSONObject) {
            DivAccessibility divAccessibility = (DivAccessibility) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.accessibility, jSONObject, "accessibility", this.component.getDivAccessibilityJsonTemplateResolver(), this.component.getDivAccessibilityJsonEntityParser());
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divVideoTemplate.alignmentHorizontal, jSONObject, "alignment_horizontal", DivVideoJsonParser.TYPE_HELPER_ALIGNMENT_HORIZONTAL, DivAlignmentHorizontal.FROM_STRING);
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divVideoTemplate.alignmentVertical, jSONObject, "alignment_vertical", DivVideoJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, DivAlignmentVertical.FROM_STRING);
            Field field = divVideoTemplate.alpha;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivVideoJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivVideoJsonParser.ALPHA_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression3 != null) {
                expression = resolveOptionalExpression3;
            }
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divVideoTemplate.animators, jSONObject, "animators", this.component.getDivAnimatorJsonTemplateResolver(), this.component.getDivAnimatorJsonEntityParser());
            DivAspect divAspect = (DivAspect) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.aspect, jSONObject, "aspect", this.component.getDivAspectJsonTemplateResolver(), this.component.getDivAspectJsonEntityParser());
            Field field2 = divVideoTemplate.autostart;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = DivVideoJsonParser.AUTOSTART_DEFAULT_VALUE;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "autostart", typeHelper2, function12, expression2);
            if (resolveOptionalExpression4 != null) {
                expression2 = resolveOptionalExpression4;
            }
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divVideoTemplate.background, jSONObject, M2.g, this.component.getDivBackgroundJsonTemplateResolver(), this.component.getDivBackgroundJsonEntityParser());
            DivBorder divBorder = (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.border, jSONObject, "border", this.component.getDivBorderJsonTemplateResolver(), this.component.getDivBorderJsonEntityParser());
            List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(parsingContext, divVideoTemplate.bufferingActions, jSONObject, "buffering_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            Field field3 = divVideoTemplate.columnSpan;
            TypeHelper<Long> typeHelper3 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function13 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "column_span", typeHelper3, function13, DivVideoJsonParser.COLUMN_SPAN_VALIDATOR);
            List resolveOptionalList4 = JsonFieldResolver.resolveOptionalList(parsingContext, divVideoTemplate.disappearActions, jSONObject, "disappear_actions", this.component.getDivDisappearActionJsonTemplateResolver(), this.component.getDivDisappearActionJsonEntityParser());
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.elapsedTimeVariable, jSONObject, "elapsed_time_variable");
            List resolveOptionalList5 = JsonFieldResolver.resolveOptionalList(parsingContext, divVideoTemplate.endActions, jSONObject, "end_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            List resolveOptionalList6 = JsonFieldResolver.resolveOptionalList(parsingContext, divVideoTemplate.extensions, jSONObject, "extensions", this.component.getDivExtensionJsonTemplateResolver(), this.component.getDivExtensionJsonEntityParser());
            List resolveOptionalList7 = JsonFieldResolver.resolveOptionalList(parsingContext, divVideoTemplate.fatalActions, jSONObject, "fatal_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            DivFocus divFocus = (DivFocus) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.focus, jSONObject, "focus", this.component.getDivFocusJsonTemplateResolver(), this.component.getDivFocusJsonEntityParser());
            List resolveOptionalList8 = JsonFieldResolver.resolveOptionalList(parsingContext, divVideoTemplate.functions, jSONObject, "functions", this.component.getDivFunctionJsonTemplateResolver(), this.component.getDivFunctionJsonEntityParser());
            DivSize divSize = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.height, jSONObject, "height", this.component.getDivSizeJsonTemplateResolver(), this.component.getDivSizeJsonEntityParser());
            if (divSize == null) {
                divSize = DivVideoJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            DivSize divSize2 = divSize;
            String str2 = (String) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.id, jSONObject, "id");
            DivLayoutProvider divLayoutProvider = (DivLayoutProvider) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.layoutProvider, jSONObject, "layout_provider", this.component.getDivLayoutProviderJsonTemplateResolver(), this.component.getDivLayoutProviderJsonEntityParser());
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.margins, jSONObject, "margins", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            Field field4 = divVideoTemplate.muted;
            Expression expression3 = DivVideoJsonParser.MUTED_DEFAULT_VALUE;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "muted", typeHelper2, function12, expression3);
            if (resolveOptionalExpression6 != null) {
                expression3 = resolveOptionalExpression6;
            }
            DivEdgeInsets divEdgeInsets2 = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.paddings, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            List resolveOptionalList9 = JsonFieldResolver.resolveOptionalList(parsingContext, divVideoTemplate.pauseActions, jSONObject, "pause_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            JSONObject jSONObject2 = (JSONObject) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.playerSettingsPayload, jSONObject, "player_settings_payload");
            Field field5 = divVideoTemplate.preloadRequired;
            Expression expression4 = DivVideoJsonParser.PRELOAD_REQUIRED_DEFAULT_VALUE;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "preload_required", typeHelper2, function12, expression4);
            if (resolveOptionalExpression7 != null) {
                expression4 = resolveOptionalExpression7;
            }
            Field field6 = divVideoTemplate.preview;
            TypeHelper<String> typeHelper4 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "preview", typeHelper4);
            Field field7 = divVideoTemplate.repeatable;
            Expression expression5 = DivVideoJsonParser.REPEATABLE_DEFAULT_VALUE;
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, "repeatable", typeHelper2, function12, expression5);
            if (resolveOptionalExpression9 != null) {
                expression5 = resolveOptionalExpression9;
            }
            List resolveOptionalList10 = JsonFieldResolver.resolveOptionalList(parsingContext, divVideoTemplate.resumeActions, jSONObject, "resume_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divVideoTemplate.reuseId, jSONObject, "reuse_id", typeHelper4);
            Expression resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divVideoTemplate.rowSpan, jSONObject, "row_span", typeHelper3, function13, DivVideoJsonParser.ROW_SPAN_VALIDATOR);
            Field field8 = divVideoTemplate.scale;
            TypeHelper typeHelper5 = DivVideoJsonParser.TYPE_HELPER_SCALE;
            Function1 function14 = DivVideoScale.FROM_STRING;
            Expression expression6 = DivVideoJsonParser.SCALE_DEFAULT_VALUE;
            Expression resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "scale", typeHelper5, function14, expression6);
            Expression expression7 = resolveOptionalExpression12 == null ? expression6 : resolveOptionalExpression12;
            List resolveOptionalList11 = JsonFieldResolver.resolveOptionalList(parsingContext, divVideoTemplate.selectedActions, jSONObject, "selected_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            List resolveOptionalList12 = JsonFieldResolver.resolveOptionalList(parsingContext, divVideoTemplate.tooltips, jSONObject, "tooltips", this.component.getDivTooltipJsonTemplateResolver(), this.component.getDivTooltipJsonEntityParser());
            DivTransform divTransform = (DivTransform) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.transform, jSONObject, "transform", this.component.getDivTransformJsonTemplateResolver(), this.component.getDivTransformJsonEntityParser());
            DivChangeTransition divChangeTransition = (DivChangeTransition) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.transitionChange, jSONObject, "transition_change", this.component.getDivChangeTransitionJsonTemplateResolver(), this.component.getDivChangeTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.transitionIn, jSONObject, "transition_in", this.component.getDivAppearanceTransitionJsonTemplateResolver(), this.component.getDivAppearanceTransitionJsonEntityParser());
            DivAppearanceTransition divAppearanceTransition2 = (DivAppearanceTransition) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.transitionOut, jSONObject, "transition_out", this.component.getDivAppearanceTransitionJsonTemplateResolver(), this.component.getDivAppearanceTransitionJsonEntityParser());
            List resolveOptionalList13 = JsonFieldResolver.resolveOptionalList(parsingContext, divVideoTemplate.transitionTriggers, jSONObject, "transition_triggers", DivTransitionTrigger.FROM_STRING, DivVideoJsonParser.TRANSITION_TRIGGERS_VALIDATOR);
            List resolveOptionalList14 = JsonFieldResolver.resolveOptionalList(parsingContext, divVideoTemplate.variableTriggers, jSONObject, "variable_triggers", this.component.getDivTriggerJsonTemplateResolver(), this.component.getDivTriggerJsonEntityParser());
            List resolveOptionalList15 = JsonFieldResolver.resolveOptionalList(parsingContext, divVideoTemplate.variables, jSONObject, "variables", this.component.getDivVariableJsonTemplateResolver(), this.component.getDivVariableJsonEntityParser());
            List resolveList = JsonFieldResolver.resolveList(parsingContext, divVideoTemplate.videoSources, jSONObject, "video_sources", this.component.getDivVideoSourceJsonTemplateResolver(), this.component.getDivVideoSourceJsonEntityParser(), DivVideoJsonParser.VIDEO_SOURCES_VALIDATOR);
            Field field9 = divVideoTemplate.visibility;
            TypeHelper typeHelper6 = DivVideoJsonParser.TYPE_HELPER_VISIBILITY;
            Function1 function15 = DivVisibility.FROM_STRING;
            Expression expression8 = DivVideoJsonParser.VISIBILITY_DEFAULT_VALUE;
            Expression resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, typeHelper6, function15, expression8);
            Expression expression9 = resolveOptionalExpression13 == null ? expression8 : resolveOptionalExpression13;
            DivVisibilityAction divVisibilityAction = (DivVisibilityAction) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.visibilityAction, jSONObject, "visibility_action", this.component.getDivVisibilityActionJsonTemplateResolver(), this.component.getDivVisibilityActionJsonEntityParser());
            List resolveOptionalList16 = JsonFieldResolver.resolveOptionalList(parsingContext, divVideoTemplate.visibilityActions, jSONObject, "visibility_actions", this.component.getDivVisibilityActionJsonTemplateResolver(), this.component.getDivVisibilityActionJsonEntityParser());
            DivSize divSize3 = (DivSize) JsonFieldResolver.resolveOptional(parsingContext, divVideoTemplate.width, jSONObject, "width", this.component.getDivSizeJsonTemplateResolver(), this.component.getDivSizeJsonEntityParser());
            if (divSize3 == null) {
                divSize3 = DivVideoJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivVideo(divAccessibility, resolveOptionalExpression, resolveOptionalExpression2, expression, resolveOptionalList, divAspect, expression2, resolveOptionalList2, divBorder, resolveOptionalList3, resolveOptionalExpression5, resolveOptionalList4, str, resolveOptionalList5, resolveOptionalList6, resolveOptionalList7, divFocus, resolveOptionalList8, divSize2, str2, divLayoutProvider, divEdgeInsets, expression3, divEdgeInsets2, resolveOptionalList9, jSONObject2, expression4, resolveOptionalExpression8, expression5, resolveOptionalList10, resolveOptionalExpression10, resolveOptionalExpression11, expression7, resolveOptionalList11, resolveOptionalList12, divTransform, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, resolveOptionalList13, resolveOptionalList14, resolveOptionalList15, resolveList, expression9, divVisibilityAction, resolveOptionalList16, divSize3);
        }
    }

    /* compiled from: DivVideoJsonParser.kt */
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
        Boolean bool = Boolean.FALSE;
        AUTOSTART_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        int i = 7;
        DefaultConstructorMarker defaultConstructorMarker = null;
        DivSizeUnitValue divSizeUnitValue = null;
        HEIGHT_DEFAULT_VALUE = new DivSize.WrapContent(new DivWrapContentSize(null, divSizeUnitValue, null, i, defaultConstructorMarker));
        MUTED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        PRELOAD_REQUIRED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        REPEATABLE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        DivVideoScale divVideoScale = DivVideoScale.FIT;
        SCALE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divVideoScale, null, 2, null);
        DivVisibility divVisibility = DivVisibility.VISIBLE;
        VISIBILITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divVisibility, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivSize.MatchParent(new DivMatchParentSize(0 == true ? 1 : 0, divSizeUnitValue, 0 == true ? 1 : 0, i, defaultConstructorMarker));
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        TYPE_HELPER_ALIGNMENT_HORIZONTAL = companion2.from(ArraysKt.first(DivAlignmentHorizontal.values()), new Function1() { // from class: com.yandex.div2.DivVideoJsonParser$Companion$TYPE_HELPER_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        TYPE_HELPER_ALIGNMENT_VERTICAL = companion2.from(ArraysKt.first(DivAlignmentVertical.values()), new Function1() { // from class: com.yandex.div2.DivVideoJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        TYPE_HELPER_SCALE = companion2.from(divVideoScale, new Function1() { // from class: com.yandex.div2.DivVideoJsonParser$Companion$TYPE_HELPER_SCALE$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivVideoScale);
            }
        });
        TYPE_HELPER_VISIBILITY = companion2.from(divVisibility, new Function1() { // from class: com.yandex.div2.DivVideoJsonParser$Companion$TYPE_HELPER_VISIBILITY$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivVisibility);
            }
        });
        ALPHA_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivVideoJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ALPHA_VALIDATOR$lambda$0;
                ALPHA_VALIDATOR$lambda$0 = DivVideoJsonParser.ALPHA_VALIDATOR$lambda$0(((Double) obj).doubleValue());
                return ALPHA_VALIDATOR$lambda$0;
            }
        };
        COLUMN_SPAN_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivVideoJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean COLUMN_SPAN_VALIDATOR$lambda$1;
                COLUMN_SPAN_VALIDATOR$lambda$1 = DivVideoJsonParser.COLUMN_SPAN_VALIDATOR$lambda$1(((Long) obj).longValue());
                return COLUMN_SPAN_VALIDATOR$lambda$1;
            }
        };
        ROW_SPAN_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivVideoJsonParser$$ExternalSyntheticLambda2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ROW_SPAN_VALIDATOR$lambda$2;
                ROW_SPAN_VALIDATOR$lambda$2 = DivVideoJsonParser.ROW_SPAN_VALIDATOR$lambda$2(((Long) obj).longValue());
                return ROW_SPAN_VALIDATOR$lambda$2;
            }
        };
        TRANSITION_TRIGGERS_VALIDATOR = new ListValidator() { // from class: com.yandex.div2.DivVideoJsonParser$$ExternalSyntheticLambda3
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean TRANSITION_TRIGGERS_VALIDATOR$lambda$3;
                TRANSITION_TRIGGERS_VALIDATOR$lambda$3 = DivVideoJsonParser.TRANSITION_TRIGGERS_VALIDATOR$lambda$3(list);
                return TRANSITION_TRIGGERS_VALIDATOR$lambda$3;
            }
        };
        VIDEO_SOURCES_VALIDATOR = new ListValidator() { // from class: com.yandex.div2.DivVideoJsonParser$$ExternalSyntheticLambda4
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean VIDEO_SOURCES_VALIDATOR$lambda$4;
                VIDEO_SOURCES_VALIDATOR$lambda$4 = DivVideoJsonParser.VIDEO_SOURCES_VALIDATOR$lambda$4(list);
                return VIDEO_SOURCES_VALIDATOR$lambda$4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TRANSITION_TRIGGERS_VALIDATOR$lambda$3(List list) {
        return list.size() >= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean VIDEO_SOURCES_VALIDATOR$lambda$4(List list) {
        return list.size() >= 1;
    }
}
