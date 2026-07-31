package com.yandex.div2;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
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
import com.yandex.div2.DivTabs;
import com.yandex.div2.DivTabsTemplate;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTabsJsonParser.kt */
/* loaded from: classes9.dex */
public abstract class DivTabsTabTitleStyleJsonParser {
    public static final Expression ACTIVE_BACKGROUND_COLOR_DEFAULT_VALUE;
    public static final Expression ACTIVE_TEXT_COLOR_DEFAULT_VALUE;
    public static final Expression ANIMATION_DURATION_DEFAULT_VALUE;
    public static final ValueValidator ANIMATION_DURATION_VALIDATOR;
    public static final Expression ANIMATION_TYPE_DEFAULT_VALUE;
    public static final ValueValidator CORNER_RADIUS_VALIDATOR;
    private static final Companion Companion = new Companion(null);
    public static final Expression FONT_SIZE_DEFAULT_VALUE;
    public static final Expression FONT_SIZE_UNIT_DEFAULT_VALUE;
    public static final ValueValidator FONT_SIZE_VALIDATOR;
    public static final Expression FONT_WEIGHT_DEFAULT_VALUE;
    public static final Expression INACTIVE_TEXT_COLOR_DEFAULT_VALUE;
    public static final Expression ITEM_SPACING_DEFAULT_VALUE;
    public static final ValueValidator ITEM_SPACING_VALIDATOR;
    public static final Expression LETTER_SPACING_DEFAULT_VALUE;
    public static final ValueValidator LINE_HEIGHT_VALIDATOR;
    public static final DivEdgeInsets PADDINGS_DEFAULT_VALUE;
    public static final TypeHelper TYPE_HELPER_ACTIVE_FONT_WEIGHT;
    public static final TypeHelper TYPE_HELPER_ANIMATION_TYPE;
    public static final TypeHelper TYPE_HELPER_FONT_SIZE_UNIT;
    public static final TypeHelper TYPE_HELPER_FONT_WEIGHT;
    public static final TypeHelper TYPE_HELPER_INACTIVE_FONT_WEIGHT;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ANIMATION_DURATION_VALIDATOR$lambda$0(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CORNER_RADIUS_VALIDATOR$lambda$1(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FONT_SIZE_VALIDATOR$lambda$2(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ITEM_SPACING_VALIDATOR$lambda$3(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LINE_HEIGHT_VALIDATOR$lambda$4(long j) {
        return j >= 0;
    }

    /* compiled from: DivTabsJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivTabs.TabTitleStyle deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1 function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression = DivTabsTabTitleStyleJsonParser.ACTIVE_BACKGROUND_COLOR_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "active_background_color", typeHelper, function1, expression);
            Expression expression2 = readOptionalExpression == null ? expression : readOptionalExpression;
            TypeHelper<JSONObject> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DICT;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "active_font_variation_settings", typeHelper2);
            TypeHelper typeHelper3 = DivTabsTabTitleStyleJsonParser.TYPE_HELPER_ACTIVE_FONT_WEIGHT;
            Function1 function12 = DivFontWeight.FROM_STRING;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "active_font_weight", typeHelper3, function12);
            Expression expression3 = DivTabsTabTitleStyleJsonParser.ACTIVE_TEXT_COLOR_DEFAULT_VALUE;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "active_text_color", typeHelper, function1, expression3);
            Expression expression4 = readOptionalExpression4 == null ? expression3 : readOptionalExpression4;
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function13 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = DivTabsTabTitleStyleJsonParser.ANIMATION_DURATION_VALIDATOR;
            Expression expression5 = DivTabsTabTitleStyleJsonParser.ANIMATION_DURATION_DEFAULT_VALUE;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "animation_duration", typeHelper4, function13, valueValidator, expression5);
            if (readOptionalExpression5 != null) {
                expression5 = readOptionalExpression5;
            }
            TypeHelper typeHelper5 = DivTabsTabTitleStyleJsonParser.TYPE_HELPER_ANIMATION_TYPE;
            Function1 function14 = DivTabs.TabTitleStyle.AnimationType.FROM_STRING;
            Expression expression6 = DivTabsTabTitleStyleJsonParser.ANIMATION_TYPE_DEFAULT_VALUE;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "animation_type", typeHelper5, function14, expression6);
            Expression expression7 = readOptionalExpression6 == null ? expression6 : readOptionalExpression6;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "corner_radius", typeHelper4, function13, DivTabsTabTitleStyleJsonParser.CORNER_RADIUS_VALIDATOR);
            DivCornersRadius divCornersRadius = (DivCornersRadius) JsonPropertyParser.readOptional(parsingContext, jSONObject, "corners_radius", this.component.getDivCornersRadiusJsonEntityParser());
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_family", TypeHelpersKt.TYPE_HELPER_STRING);
            ValueValidator valueValidator2 = DivTabsTabTitleStyleJsonParser.FONT_SIZE_VALIDATOR;
            Expression expression8 = DivTabsTabTitleStyleJsonParser.FONT_SIZE_DEFAULT_VALUE;
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyConstants.TEXT_SIZE, typeHelper4, function13, valueValidator2, expression8);
            if (readOptionalExpression9 != null) {
                expression8 = readOptionalExpression9;
            }
            TypeHelper typeHelper6 = DivTabsTabTitleStyleJsonParser.TYPE_HELPER_FONT_SIZE_UNIT;
            Function1 function15 = DivSizeUnit.FROM_STRING;
            Expression expression9 = DivTabsTabTitleStyleJsonParser.FONT_SIZE_UNIT_DEFAULT_VALUE;
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size_unit", typeHelper6, function15, expression9);
            Expression expression10 = readOptionalExpression10 == null ? expression9 : readOptionalExpression10;
            TypeHelper typeHelper7 = DivTabsTabTitleStyleJsonParser.TYPE_HELPER_FONT_WEIGHT;
            Expression expression11 = DivTabsTabTitleStyleJsonParser.FONT_WEIGHT_DEFAULT_VALUE;
            Expression readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight", typeHelper7, function12, expression11);
            Expression expression12 = readOptionalExpression11 == null ? expression11 : readOptionalExpression11;
            Expression readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "inactive_background_color", typeHelper, function1);
            Expression readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "inactive_font_variation_settings", typeHelper2);
            Expression readOptionalExpression14 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "inactive_font_weight", DivTabsTabTitleStyleJsonParser.TYPE_HELPER_INACTIVE_FONT_WEIGHT, function12);
            Expression expression13 = DivTabsTabTitleStyleJsonParser.INACTIVE_TEXT_COLOR_DEFAULT_VALUE;
            Expression readOptionalExpression15 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "inactive_text_color", typeHelper, function1, expression13);
            Expression expression14 = readOptionalExpression15 == null ? expression13 : readOptionalExpression15;
            ValueValidator valueValidator3 = DivTabsTabTitleStyleJsonParser.ITEM_SPACING_VALIDATOR;
            Expression expression15 = DivTabsTabTitleStyleJsonParser.ITEM_SPACING_DEFAULT_VALUE;
            Expression readOptionalExpression16 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "item_spacing", typeHelper4, function13, valueValidator3, expression15);
            Expression expression16 = readOptionalExpression16 == null ? expression15 : readOptionalExpression16;
            TypeHelper<Double> typeHelper8 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function16 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression expression17 = DivTabsTabTitleStyleJsonParser.LETTER_SPACING_DEFAULT_VALUE;
            Expression readOptionalExpression17 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "letter_spacing", typeHelper8, function16, expression17);
            Expression expression18 = readOptionalExpression17 == null ? expression17 : readOptionalExpression17;
            Expression readOptionalExpression18 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "line_height", typeHelper4, function13, DivTabsTabTitleStyleJsonParser.LINE_HEIGHT_VALIDATOR);
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonEntityParser());
            if (divEdgeInsets == null) {
                divEdgeInsets = DivTabsTabTitleStyleJsonParser.PADDINGS_DEFAULT_VALUE;
            }
            return new DivTabs.TabTitleStyle(expression2, readOptionalExpression2, readOptionalExpression3, expression4, expression5, expression7, readOptionalExpression7, divCornersRadius, readOptionalExpression8, expression8, expression10, expression12, readOptionalExpression12, readOptionalExpression13, readOptionalExpression14, expression14, expression16, expression18, readOptionalExpression18, divEdgeInsets);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivTabs.TabTitleStyle tabTitleStyle) {
            JSONObject jSONObject = new JSONObject();
            Expression expression = tabTitleStyle.activeBackgroundColor;
            Function1 function1 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "active_background_color", expression, function1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "active_font_variation_settings", tabTitleStyle.activeFontVariationSettings);
            Expression expression2 = tabTitleStyle.activeFontWeight;
            Function1 function12 = DivFontWeight.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "active_font_weight", expression2, function12);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "active_text_color", tabTitleStyle.activeTextColor, function1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "animation_duration", tabTitleStyle.animationDuration);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "animation_type", tabTitleStyle.animationType, DivTabs.TabTitleStyle.AnimationType.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "corner_radius", tabTitleStyle.cornerRadius);
            JsonPropertyParser.write(parsingContext, jSONObject, "corners_radius", tabTitleStyle.cornersRadius, this.component.getDivCornersRadiusJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_family", tabTitleStyle.fontFamily);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, ViewHierarchyConstants.TEXT_SIZE, tabTitleStyle.fontSize);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size_unit", tabTitleStyle.fontSizeUnit, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight", tabTitleStyle.fontWeight, function12);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "inactive_background_color", tabTitleStyle.inactiveBackgroundColor, function1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "inactive_font_variation_settings", tabTitleStyle.inactiveFontVariationSettings);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "inactive_font_weight", tabTitleStyle.inactiveFontWeight, function12);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "inactive_text_color", tabTitleStyle.inactiveTextColor, function1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "item_spacing", tabTitleStyle.itemSpacing);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "letter_spacing", tabTitleStyle.letterSpacing);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "line_height", tabTitleStyle.lineHeight);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", tabTitleStyle.paddings, this.component.getDivEdgeInsetsJsonEntityParser());
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
        public DivTabsTemplate.TabTitleStyleTemplate deserialize(ParsingContext parsingContext, DivTabsTemplate.TabTitleStyleTemplate tabTitleStyleTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field field = tabTitleStyleTemplate != null ? tabTitleStyleTemplate.activeBackgroundColor : null;
            Function1 function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "active_background_color", typeHelper, allowPropertyOverride, field, function1);
            TypeHelper<JSONObject> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DICT;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "active_font_variation_settings", typeHelper2, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.activeFontVariationSettings : null);
            TypeHelper typeHelper3 = DivTabsTabTitleStyleJsonParser.TYPE_HELPER_ACTIVE_FONT_WEIGHT;
            Field field2 = tabTitleStyleTemplate != null ? tabTitleStyleTemplate.activeFontWeight : null;
            Function1 function12 = DivFontWeight.FROM_STRING;
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "active_font_weight", typeHelper3, allowPropertyOverride, field2, function12);
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "active_text_color", typeHelper, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.activeTextColor : null, function1);
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Field field3 = tabTitleStyleTemplate != null ? tabTitleStyleTemplate.animationDuration : null;
            Function1 function13 = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivTabsTemplate.TabTitleStyleTemplate(readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalFieldWithExpression4, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "animation_duration", typeHelper4, allowPropertyOverride, field3, function13, DivTabsTabTitleStyleJsonParser.ANIMATION_DURATION_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "animation_type", DivTabsTabTitleStyleJsonParser.TYPE_HELPER_ANIMATION_TYPE, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.animationType : null, DivTabs.TabTitleStyle.AnimationType.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "corner_radius", typeHelper4, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.cornerRadius : null, function13, DivTabsTabTitleStyleJsonParser.CORNER_RADIUS_VALIDATOR), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "corners_radius", allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.cornersRadius : null, this.component.getDivCornersRadiusJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_family", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.fontFamily : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, ViewHierarchyConstants.TEXT_SIZE, typeHelper4, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.fontSize : null, function13, DivTabsTabTitleStyleJsonParser.FONT_SIZE_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_size_unit", DivTabsTabTitleStyleJsonParser.TYPE_HELPER_FONT_SIZE_UNIT, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.fontSizeUnit : null, DivSizeUnit.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_weight", DivTabsTabTitleStyleJsonParser.TYPE_HELPER_FONT_WEIGHT, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.fontWeight : null, function12), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "inactive_background_color", typeHelper, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.inactiveBackgroundColor : null, function1), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "inactive_font_variation_settings", typeHelper2, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.inactiveFontVariationSettings : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "inactive_font_weight", DivTabsTabTitleStyleJsonParser.TYPE_HELPER_INACTIVE_FONT_WEIGHT, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.inactiveFontWeight : null, function12), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "inactive_text_color", typeHelper, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.inactiveTextColor : null, function1), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "item_spacing", typeHelper4, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.itemSpacing : null, function13, DivTabsTabTitleStyleJsonParser.ITEM_SPACING_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "letter_spacing", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.letterSpacing : null, ParsingConvertersKt.NUMBER_TO_DOUBLE), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "line_height", typeHelper4, allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.lineHeight : null, function13, DivTabsTabTitleStyleJsonParser.LINE_HEIGHT_VALIDATOR), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, tabTitleStyleTemplate != null ? tabTitleStyleTemplate.paddings : null, this.component.getDivEdgeInsetsJsonTemplateParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivTabsTemplate.TabTitleStyleTemplate tabTitleStyleTemplate) {
            JSONObject jSONObject = new JSONObject();
            Field field = tabTitleStyleTemplate.activeBackgroundColor;
            Function1 function1 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "active_background_color", field, function1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "active_font_variation_settings", tabTitleStyleTemplate.activeFontVariationSettings);
            Field field2 = tabTitleStyleTemplate.activeFontWeight;
            Function1 function12 = DivFontWeight.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "active_font_weight", field2, function12);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "active_text_color", tabTitleStyleTemplate.activeTextColor, function1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "animation_duration", tabTitleStyleTemplate.animationDuration);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "animation_type", tabTitleStyleTemplate.animationType, DivTabs.TabTitleStyle.AnimationType.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "corner_radius", tabTitleStyleTemplate.cornerRadius);
            JsonFieldParser.writeField(parsingContext, jSONObject, "corners_radius", tabTitleStyleTemplate.cornersRadius, this.component.getDivCornersRadiusJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_family", tabTitleStyleTemplate.fontFamily);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, ViewHierarchyConstants.TEXT_SIZE, tabTitleStyleTemplate.fontSize);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size_unit", tabTitleStyleTemplate.fontSizeUnit, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight", tabTitleStyleTemplate.fontWeight, function12);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "inactive_background_color", tabTitleStyleTemplate.inactiveBackgroundColor, function1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "inactive_font_variation_settings", tabTitleStyleTemplate.inactiveFontVariationSettings);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "inactive_font_weight", tabTitleStyleTemplate.inactiveFontWeight, function12);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "inactive_text_color", tabTitleStyleTemplate.inactiveTextColor, function1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "item_spacing", tabTitleStyleTemplate.itemSpacing);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "letter_spacing", tabTitleStyleTemplate.letterSpacing);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "line_height", tabTitleStyleTemplate.lineHeight);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", tabTitleStyleTemplate.paddings, this.component.getDivEdgeInsetsJsonTemplateParser());
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
        public DivTabs.TabTitleStyle resolve(ParsingContext parsingContext, DivTabsTemplate.TabTitleStyleTemplate tabTitleStyleTemplate, JSONObject jSONObject) {
            Field field = tabTitleStyleTemplate.activeBackgroundColor;
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1 function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression = DivTabsTabTitleStyleJsonParser.ACTIVE_BACKGROUND_COLOR_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "active_background_color", typeHelper, function1, expression);
            Expression expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            Field field2 = tabTitleStyleTemplate.activeFontVariationSettings;
            TypeHelper<JSONObject> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DICT;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "active_font_variation_settings", typeHelper2);
            Field field3 = tabTitleStyleTemplate.activeFontWeight;
            TypeHelper typeHelper3 = DivTabsTabTitleStyleJsonParser.TYPE_HELPER_ACTIVE_FONT_WEIGHT;
            Function1 function12 = DivFontWeight.FROM_STRING;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "active_font_weight", typeHelper3, function12);
            Field field4 = tabTitleStyleTemplate.activeTextColor;
            Expression expression3 = DivTabsTabTitleStyleJsonParser.ACTIVE_TEXT_COLOR_DEFAULT_VALUE;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "active_text_color", typeHelper, function1, expression3);
            Expression expression4 = resolveOptionalExpression4 == null ? expression3 : resolveOptionalExpression4;
            Field field5 = tabTitleStyleTemplate.animationDuration;
            TypeHelper<Long> typeHelper4 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function13 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = DivTabsTabTitleStyleJsonParser.ANIMATION_DURATION_VALIDATOR;
            Expression expression5 = DivTabsTabTitleStyleJsonParser.ANIMATION_DURATION_DEFAULT_VALUE;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "animation_duration", typeHelper4, function13, valueValidator, expression5);
            if (resolveOptionalExpression5 != null) {
                expression5 = resolveOptionalExpression5;
            }
            Field field6 = tabTitleStyleTemplate.animationType;
            TypeHelper typeHelper5 = DivTabsTabTitleStyleJsonParser.TYPE_HELPER_ANIMATION_TYPE;
            Function1 function14 = DivTabs.TabTitleStyle.AnimationType.FROM_STRING;
            Expression expression6 = DivTabsTabTitleStyleJsonParser.ANIMATION_TYPE_DEFAULT_VALUE;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "animation_type", typeHelper5, function14, expression6);
            Expression expression7 = resolveOptionalExpression6 == null ? expression6 : resolveOptionalExpression6;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, tabTitleStyleTemplate.cornerRadius, jSONObject, "corner_radius", typeHelper4, function13, DivTabsTabTitleStyleJsonParser.CORNER_RADIUS_VALIDATOR);
            DivCornersRadius divCornersRadius = (DivCornersRadius) JsonFieldResolver.resolveOptional(parsingContext, tabTitleStyleTemplate.cornersRadius, jSONObject, "corners_radius", this.component.getDivCornersRadiusJsonTemplateResolver(), this.component.getDivCornersRadiusJsonEntityParser());
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, tabTitleStyleTemplate.fontFamily, jSONObject, "font_family", TypeHelpersKt.TYPE_HELPER_STRING);
            Field field7 = tabTitleStyleTemplate.fontSize;
            ValueValidator valueValidator2 = DivTabsTabTitleStyleJsonParser.FONT_SIZE_VALIDATOR;
            Expression expression8 = DivTabsTabTitleStyleJsonParser.FONT_SIZE_DEFAULT_VALUE;
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field7, jSONObject, ViewHierarchyConstants.TEXT_SIZE, typeHelper4, function13, valueValidator2, expression8);
            if (resolveOptionalExpression9 != null) {
                expression8 = resolveOptionalExpression9;
            }
            Field field8 = tabTitleStyleTemplate.fontSizeUnit;
            TypeHelper typeHelper6 = DivTabsTabTitleStyleJsonParser.TYPE_HELPER_FONT_SIZE_UNIT;
            Function1 function15 = DivSizeUnit.FROM_STRING;
            Expression expression9 = DivTabsTabTitleStyleJsonParser.FONT_SIZE_UNIT_DEFAULT_VALUE;
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field8, jSONObject, "font_size_unit", typeHelper6, function15, expression9);
            Expression expression10 = resolveOptionalExpression10 == null ? expression9 : resolveOptionalExpression10;
            Field field9 = tabTitleStyleTemplate.fontWeight;
            TypeHelper typeHelper7 = DivTabsTabTitleStyleJsonParser.TYPE_HELPER_FONT_WEIGHT;
            Expression expression11 = DivTabsTabTitleStyleJsonParser.FONT_WEIGHT_DEFAULT_VALUE;
            Expression resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field9, jSONObject, "font_weight", typeHelper7, function12, expression11);
            Expression expression12 = resolveOptionalExpression11 == null ? expression11 : resolveOptionalExpression11;
            Expression resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, tabTitleStyleTemplate.inactiveBackgroundColor, jSONObject, "inactive_background_color", typeHelper, function1);
            Expression resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, tabTitleStyleTemplate.inactiveFontVariationSettings, jSONObject, "inactive_font_variation_settings", typeHelper2);
            Expression resolveOptionalExpression14 = JsonFieldResolver.resolveOptionalExpression(parsingContext, tabTitleStyleTemplate.inactiveFontWeight, jSONObject, "inactive_font_weight", DivTabsTabTitleStyleJsonParser.TYPE_HELPER_INACTIVE_FONT_WEIGHT, function12);
            Field field10 = tabTitleStyleTemplate.inactiveTextColor;
            Expression expression13 = DivTabsTabTitleStyleJsonParser.INACTIVE_TEXT_COLOR_DEFAULT_VALUE;
            Expression resolveOptionalExpression15 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field10, jSONObject, "inactive_text_color", typeHelper, function1, expression13);
            Expression expression14 = resolveOptionalExpression15 == null ? expression13 : resolveOptionalExpression15;
            Field field11 = tabTitleStyleTemplate.itemSpacing;
            ValueValidator valueValidator3 = DivTabsTabTitleStyleJsonParser.ITEM_SPACING_VALIDATOR;
            Expression expression15 = DivTabsTabTitleStyleJsonParser.ITEM_SPACING_DEFAULT_VALUE;
            Expression resolveOptionalExpression16 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field11, jSONObject, "item_spacing", typeHelper4, function13, valueValidator3, expression15);
            Expression expression16 = resolveOptionalExpression16 == null ? expression15 : resolveOptionalExpression16;
            Field field12 = tabTitleStyleTemplate.letterSpacing;
            TypeHelper<Double> typeHelper8 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function16 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression expression17 = DivTabsTabTitleStyleJsonParser.LETTER_SPACING_DEFAULT_VALUE;
            Expression resolveOptionalExpression17 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field12, jSONObject, "letter_spacing", typeHelper8, function16, expression17);
            Expression expression18 = resolveOptionalExpression17 == null ? expression17 : resolveOptionalExpression17;
            Expression resolveOptionalExpression18 = JsonFieldResolver.resolveOptionalExpression(parsingContext, tabTitleStyleTemplate.lineHeight, jSONObject, "line_height", typeHelper4, function13, DivTabsTabTitleStyleJsonParser.LINE_HEIGHT_VALIDATOR);
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, tabTitleStyleTemplate.paddings, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            if (divEdgeInsets == null) {
                divEdgeInsets = DivTabsTabTitleStyleJsonParser.PADDINGS_DEFAULT_VALUE;
            }
            return new DivTabs.TabTitleStyle(expression2, resolveOptionalExpression2, resolveOptionalExpression3, expression4, expression5, expression7, resolveOptionalExpression7, divCornersRadius, resolveOptionalExpression8, expression8, expression10, expression12, resolveOptionalExpression12, resolveOptionalExpression13, resolveOptionalExpression14, expression14, expression16, expression18, resolveOptionalExpression18, divEdgeInsets);
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
        ACTIVE_BACKGROUND_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, -9120, null, 2, null);
        ACTIVE_TEXT_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, -872415232, null, 2, null);
        ANIMATION_DURATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 300L, null, 2, null);
        DivTabs.TabTitleStyle.AnimationType animationType = DivTabs.TabTitleStyle.AnimationType.SLIDE;
        ANIMATION_TYPE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, animationType, null, 2, null);
        FONT_SIZE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        DivSizeUnit divSizeUnit = DivSizeUnit.SP;
        FONT_SIZE_UNIT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        DivFontWeight divFontWeight = DivFontWeight.REGULAR;
        FONT_WEIGHT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divFontWeight, null, 2, null);
        INACTIVE_TEXT_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Integer.MIN_VALUE, null, 2, null);
        ITEM_SPACING_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        LETTER_SPACING_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        PADDINGS_DEFAULT_VALUE = new DivEdgeInsets(Expression.Companion.constant$default(companion, 6L, null, 2, null), null, Expression.Companion.constant$default(companion, 8L, null, 2, null), Expression.Companion.constant$default(companion, 8L, null, 2, null), null, Expression.Companion.constant$default(companion, 6L, null, 2, null), null, 82, null);
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        TYPE_HELPER_ACTIVE_FONT_WEIGHT = companion2.from(ArraysKt.first(DivFontWeight.values()), new Function1() { // from class: com.yandex.div2.DivTabsTabTitleStyleJsonParser$Companion$TYPE_HELPER_ACTIVE_FONT_WEIGHT$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivFontWeight);
            }
        });
        TYPE_HELPER_ANIMATION_TYPE = companion2.from(animationType, new Function1() { // from class: com.yandex.div2.DivTabsTabTitleStyleJsonParser$Companion$TYPE_HELPER_ANIMATION_TYPE$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivTabs.TabTitleStyle.AnimationType);
            }
        });
        TYPE_HELPER_FONT_SIZE_UNIT = companion2.from(divSizeUnit, new Function1() { // from class: com.yandex.div2.DivTabsTabTitleStyleJsonParser$Companion$TYPE_HELPER_FONT_SIZE_UNIT$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
        TYPE_HELPER_FONT_WEIGHT = companion2.from(divFontWeight, new Function1() { // from class: com.yandex.div2.DivTabsTabTitleStyleJsonParser$Companion$TYPE_HELPER_FONT_WEIGHT$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivFontWeight);
            }
        });
        TYPE_HELPER_INACTIVE_FONT_WEIGHT = companion2.from(ArraysKt.first(DivFontWeight.values()), new Function1() { // from class: com.yandex.div2.DivTabsTabTitleStyleJsonParser$Companion$TYPE_HELPER_INACTIVE_FONT_WEIGHT$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivFontWeight);
            }
        });
        ANIMATION_DURATION_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivTabsTabTitleStyleJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ANIMATION_DURATION_VALIDATOR$lambda$0;
                ANIMATION_DURATION_VALIDATOR$lambda$0 = DivTabsTabTitleStyleJsonParser.ANIMATION_DURATION_VALIDATOR$lambda$0(((Long) obj).longValue());
                return ANIMATION_DURATION_VALIDATOR$lambda$0;
            }
        };
        CORNER_RADIUS_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivTabsTabTitleStyleJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean CORNER_RADIUS_VALIDATOR$lambda$1;
                CORNER_RADIUS_VALIDATOR$lambda$1 = DivTabsTabTitleStyleJsonParser.CORNER_RADIUS_VALIDATOR$lambda$1(((Long) obj).longValue());
                return CORNER_RADIUS_VALIDATOR$lambda$1;
            }
        };
        FONT_SIZE_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivTabsTabTitleStyleJsonParser$$ExternalSyntheticLambda2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean FONT_SIZE_VALIDATOR$lambda$2;
                FONT_SIZE_VALIDATOR$lambda$2 = DivTabsTabTitleStyleJsonParser.FONT_SIZE_VALIDATOR$lambda$2(((Long) obj).longValue());
                return FONT_SIZE_VALIDATOR$lambda$2;
            }
        };
        ITEM_SPACING_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivTabsTabTitleStyleJsonParser$$ExternalSyntheticLambda3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ITEM_SPACING_VALIDATOR$lambda$3;
                ITEM_SPACING_VALIDATOR$lambda$3 = DivTabsTabTitleStyleJsonParser.ITEM_SPACING_VALIDATOR$lambda$3(((Long) obj).longValue());
                return ITEM_SPACING_VALIDATOR$lambda$3;
            }
        };
        LINE_HEIGHT_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivTabsTabTitleStyleJsonParser$$ExternalSyntheticLambda4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean LINE_HEIGHT_VALIDATOR$lambda$4;
                LINE_HEIGHT_VALIDATOR$lambda$4 = DivTabsTabTitleStyleJsonParser.LINE_HEIGHT_VALIDATOR$lambda$4(((Long) obj).longValue());
                return LINE_HEIGHT_VALIDATOR$lambda$4;
            }
        };
    }
}
