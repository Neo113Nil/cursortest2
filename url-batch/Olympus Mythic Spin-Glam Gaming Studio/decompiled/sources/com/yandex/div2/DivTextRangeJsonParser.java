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
import com.yandex.div2.DivText;
import com.yandex.div2.DivTextTemplate;
import io.appmetrica.analytics.impl.M2;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTextJsonParser.kt */
/* loaded from: classes13.dex */
public abstract class DivTextRangeJsonParser {
    public static final Expression BASELINE_OFFSET_DEFAULT_VALUE;
    private static final Companion Companion = new Companion(null);
    public static final ValueValidator END_VALIDATOR;
    public static final Expression FONT_SIZE_UNIT_DEFAULT_VALUE;
    public static final ValueValidator FONT_SIZE_VALIDATOR;
    public static final ValueValidator FONT_WEIGHT_VALUE_VALIDATOR;
    public static final ValueValidator LINE_HEIGHT_VALIDATOR;
    public static final Expression START_DEFAULT_VALUE;
    public static final ValueValidator START_VALIDATOR;
    public static final ValueValidator TOP_OFFSET_VALIDATOR;
    public static final TypeHelper TYPE_HELPER_ALIGNMENT_VERTICAL;
    public static final TypeHelper TYPE_HELPER_FONT_SIZE_UNIT;
    public static final TypeHelper TYPE_HELPER_FONT_WEIGHT;
    public static final TypeHelper TYPE_HELPER_STRIKE;
    public static final TypeHelper TYPE_HELPER_UNDERLINE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean END_VALIDATOR$lambda$0(long j) {
        return j > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FONT_SIZE_VALIDATOR$lambda$1(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FONT_WEIGHT_VALUE_VALIDATOR$lambda$2(long j) {
        return j > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LINE_HEIGHT_VALIDATOR$lambda$3(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean START_VALIDATOR$lambda$4(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TOP_OFFSET_VALIDATOR$lambda$5(long j) {
        return j >= 0;
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivText.Range deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.component.getDivActionJsonEntityParser());
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", DivTextRangeJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, DivTextAlignmentVertical.FROM_STRING);
            DivTextRangeBackground divTextRangeBackground = (DivTextRangeBackground) JsonPropertyParser.readOptional(parsingContext, jSONObject, M2.g, this.component.getDivTextRangeBackgroundJsonEntityParser());
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression expression = DivTextRangeJsonParser.BASELINE_OFFSET_DEFAULT_VALUE;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "baseline_offset", typeHelper, function1, expression);
            if (readOptionalExpression2 != null) {
                expression = readOptionalExpression2;
            }
            DivTextRangeBorder divTextRangeBorder = (DivTextRangeBorder) JsonPropertyParser.readOptional(parsingContext, jSONObject, "border", this.component.getDivTextRangeBorderJsonEntityParser());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "end", typeHelper2, function12, DivTextRangeJsonParser.END_VALIDATOR);
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_family", typeHelper3);
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_feature_settings", typeHelper3);
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyConstants.TEXT_SIZE, typeHelper2, function12, DivTextRangeJsonParser.FONT_SIZE_VALIDATOR);
            TypeHelper typeHelper4 = DivTextRangeJsonParser.TYPE_HELPER_FONT_SIZE_UNIT;
            Function1 function13 = DivSizeUnit.FROM_STRING;
            Expression expression2 = DivTextRangeJsonParser.FONT_SIZE_UNIT_DEFAULT_VALUE;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size_unit", typeHelper4, function13, expression2);
            if (readOptionalExpression7 != null) {
                expression2 = readOptionalExpression7;
            }
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
            Expression readOptionalExpression9 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight", DivTextRangeJsonParser.TYPE_HELPER_FONT_WEIGHT, DivFontWeight.FROM_STRING);
            Expression readOptionalExpression10 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight_value", typeHelper2, function12, DivTextRangeJsonParser.FONT_WEIGHT_VALUE_VALIDATOR);
            Expression readOptionalExpression11 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "letter_spacing", typeHelper, function1);
            Expression readOptionalExpression12 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "line_height", typeHelper2, function12, DivTextRangeJsonParser.LINE_HEIGHT_VALIDATOR);
            DivTextRangeMask divTextRangeMask = (DivTextRangeMask) JsonPropertyParser.readOptional(parsingContext, jSONObject, "mask", this.component.getDivTextRangeMaskJsonEntityParser());
            ValueValidator valueValidator = DivTextRangeJsonParser.START_VALIDATOR;
            Expression expression3 = DivTextRangeJsonParser.START_DEFAULT_VALUE;
            Expression readOptionalExpression13 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start", typeHelper2, function12, valueValidator, expression3);
            Expression expression4 = readOptionalExpression13 == null ? expression3 : readOptionalExpression13;
            TypeHelper typeHelper5 = DivTextRangeJsonParser.TYPE_HELPER_STRIKE;
            Function1 function14 = DivLineStyle.FROM_STRING;
            return new DivText.Range(readOptionalList, readOptionalExpression, divTextRangeBackground, expression, divTextRangeBorder, readOptionalExpression3, readOptionalExpression4, readOptionalExpression5, readOptionalExpression6, expression2, readOptionalExpression8, readOptionalExpression9, readOptionalExpression10, readOptionalExpression11, readOptionalExpression12, divTextRangeMask, expression4, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "strike", typeHelper5, function14), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), (DivShadow) JsonPropertyParser.readOptional(parsingContext, jSONObject, "text_shadow", this.component.getDivShadowJsonEntityParser()), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "top_offset", typeHelper2, function12, DivTextRangeJsonParser.TOP_OFFSET_VALIDATOR), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "underline", DivTextRangeJsonParser.TYPE_HELPER_UNDERLINE, function14));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivText.Range range) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", range.actions, this.component.getDivActionJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", range.alignmentVertical, DivTextAlignmentVertical.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, M2.g, range.background, this.component.getDivTextRangeBackgroundJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "baseline_offset", range.baselineOffset);
            JsonPropertyParser.write(parsingContext, jSONObject, "border", range.border, this.component.getDivTextRangeBorderJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "end", range.end);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_family", range.fontFamily);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_feature_settings", range.fontFeatureSettings);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, ViewHierarchyConstants.TEXT_SIZE, range.fontSize);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size_unit", range.fontSizeUnit, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_variation_settings", range.fontVariationSettings);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight", range.fontWeight, DivFontWeight.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight_value", range.fontWeightValue);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "letter_spacing", range.letterSpacing);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "line_height", range.lineHeight);
            JsonPropertyParser.write(parsingContext, jSONObject, "mask", range.mask, this.component.getDivTextRangeMaskJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start", range.start);
            Expression expression = range.strike;
            Function1 function1 = DivLineStyle.TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "strike", expression, function1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_color", range.textColor, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "text_shadow", range.textShadow, this.component.getDivShadowJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "top_offset", range.topOffset);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "underline", range.underline, function1);
            return jSONObject;
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivTextTemplate.RangeTemplate deserialize(ParsingContext parsingContext, DivTextTemplate.RangeTemplate rangeTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, rangeTemplate != null ? rangeTemplate.actions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", DivTextRangeJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.alignmentVertical : null, DivTextAlignmentVertical.FROM_STRING);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, M2.g, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.background : null, this.component.getDivTextRangeBackgroundJsonTemplateParser());
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field field = rangeTemplate != null ? rangeTemplate.baselineOffset : null;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "baseline_offset", typeHelper, allowPropertyOverride, field, function1);
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "border", allowPropertyOverride, rangeTemplate != null ? rangeTemplate.border : null, this.component.getDivTextRangeBorderJsonTemplateParser());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Field field2 = rangeTemplate != null ? rangeTemplate.end : null;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "end", typeHelper2, allowPropertyOverride, field2, function12, DivTextRangeJsonParser.END_VALIDATOR);
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_family", typeHelper3, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.fontFamily : null);
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_feature_settings", typeHelper3, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.fontFeatureSettings : null);
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, ViewHierarchyConstants.TEXT_SIZE, typeHelper2, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.fontSize : null, function12, DivTextRangeJsonParser.FONT_SIZE_VALIDATOR);
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_size_unit", DivTextRangeJsonParser.TYPE_HELPER_FONT_SIZE_UNIT, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.fontSizeUnit : null, DivSizeUnit.FROM_STRING);
            Field readOptionalFieldWithExpression8 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.fontVariationSettings : null);
            Field readOptionalFieldWithExpression9 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_weight", DivTextRangeJsonParser.TYPE_HELPER_FONT_WEIGHT, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.fontWeight : null, DivFontWeight.FROM_STRING);
            Field readOptionalFieldWithExpression10 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_weight_value", typeHelper2, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.fontWeightValue : null, function12, DivTextRangeJsonParser.FONT_WEIGHT_VALUE_VALIDATOR);
            Field readOptionalFieldWithExpression11 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "letter_spacing", typeHelper, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.letterSpacing : null, function1);
            Field readOptionalFieldWithExpression12 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "line_height", typeHelper2, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.lineHeight : null, function12, DivTextRangeJsonParser.LINE_HEIGHT_VALIDATOR);
            Field readOptionalField3 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "mask", allowPropertyOverride, rangeTemplate != null ? rangeTemplate.mask : null, this.component.getDivTextRangeMaskJsonTemplateParser());
            Field readOptionalFieldWithExpression13 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "start", typeHelper2, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.start : null, function12, DivTextRangeJsonParser.START_VALIDATOR);
            TypeHelper typeHelper4 = DivTextRangeJsonParser.TYPE_HELPER_STRIKE;
            Field field3 = rangeTemplate != null ? rangeTemplate.strike : null;
            Function1 function13 = DivLineStyle.FROM_STRING;
            return new DivTextTemplate.RangeTemplate(readOptionalListField, readOptionalFieldWithExpression, readOptionalField, readOptionalFieldWithExpression2, readOptionalField2, readOptionalFieldWithExpression3, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalFieldWithExpression7, readOptionalFieldWithExpression8, readOptionalFieldWithExpression9, readOptionalFieldWithExpression10, readOptionalFieldWithExpression11, readOptionalFieldWithExpression12, readOptionalField3, readOptionalFieldWithExpression13, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "strike", typeHelper4, allowPropertyOverride, field3, function13), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "text_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.textColor : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "text_shadow", allowPropertyOverride, rangeTemplate != null ? rangeTemplate.textShadow : null, this.component.getDivShadowJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "top_offset", typeHelper2, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.topOffset : null, function12, DivTextRangeJsonParser.TOP_OFFSET_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "underline", DivTextRangeJsonParser.TYPE_HELPER_UNDERLINE, allowPropertyOverride, rangeTemplate != null ? rangeTemplate.underline : null, function13));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivTextTemplate.RangeTemplate rangeTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", rangeTemplate.actions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", rangeTemplate.alignmentVertical, DivTextAlignmentVertical.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, M2.g, rangeTemplate.background, this.component.getDivTextRangeBackgroundJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "baseline_offset", rangeTemplate.baselineOffset);
            JsonFieldParser.writeField(parsingContext, jSONObject, "border", rangeTemplate.border, this.component.getDivTextRangeBorderJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "end", rangeTemplate.end);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_family", rangeTemplate.fontFamily);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_feature_settings", rangeTemplate.fontFeatureSettings);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, ViewHierarchyConstants.TEXT_SIZE, rangeTemplate.fontSize);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size_unit", rangeTemplate.fontSizeUnit, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_variation_settings", rangeTemplate.fontVariationSettings);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight", rangeTemplate.fontWeight, DivFontWeight.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight_value", rangeTemplate.fontWeightValue);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "letter_spacing", rangeTemplate.letterSpacing);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "line_height", rangeTemplate.lineHeight);
            JsonFieldParser.writeField(parsingContext, jSONObject, "mask", rangeTemplate.mask, this.component.getDivTextRangeMaskJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start", rangeTemplate.start);
            Field field = rangeTemplate.strike;
            Function1 function1 = DivLineStyle.TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "strike", field, function1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_color", rangeTemplate.textColor, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "text_shadow", rangeTemplate.textShadow, this.component.getDivShadowJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "top_offset", rangeTemplate.topOffset);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "underline", rangeTemplate.underline, function1);
            return jSONObject;
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivText.Range resolve(ParsingContext parsingContext, DivTextTemplate.RangeTemplate rangeTemplate, JSONObject jSONObject) {
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, rangeTemplate.actions, jSONObject, "actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.alignmentVertical, jSONObject, "alignment_vertical", DivTextRangeJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, DivTextAlignmentVertical.FROM_STRING);
            DivTextRangeBackground divTextRangeBackground = (DivTextRangeBackground) JsonFieldResolver.resolveOptional(parsingContext, rangeTemplate.background, jSONObject, M2.g, this.component.getDivTextRangeBackgroundJsonTemplateResolver(), this.component.getDivTextRangeBackgroundJsonEntityParser());
            Field field = rangeTemplate.baselineOffset;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression expression = DivTextRangeJsonParser.BASELINE_OFFSET_DEFAULT_VALUE;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "baseline_offset", typeHelper, function1, expression);
            if (resolveOptionalExpression2 != null) {
                expression = resolveOptionalExpression2;
            }
            DivTextRangeBorder divTextRangeBorder = (DivTextRangeBorder) JsonFieldResolver.resolveOptional(parsingContext, rangeTemplate.border, jSONObject, "border", this.component.getDivTextRangeBorderJsonTemplateResolver(), this.component.getDivTextRangeBorderJsonEntityParser());
            Field field2 = rangeTemplate.end;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "end", typeHelper2, function12, DivTextRangeJsonParser.END_VALIDATOR);
            Field field3 = rangeTemplate.fontFamily;
            TypeHelper<String> typeHelper3 = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "font_family", typeHelper3);
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.fontFeatureSettings, jSONObject, "font_feature_settings", typeHelper3);
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.fontSize, jSONObject, ViewHierarchyConstants.TEXT_SIZE, typeHelper2, function12, DivTextRangeJsonParser.FONT_SIZE_VALIDATOR);
            Field field4 = rangeTemplate.fontSizeUnit;
            TypeHelper typeHelper4 = DivTextRangeJsonParser.TYPE_HELPER_FONT_SIZE_UNIT;
            Function1 function13 = DivSizeUnit.FROM_STRING;
            Expression expression2 = DivTextRangeJsonParser.FONT_SIZE_UNIT_DEFAULT_VALUE;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "font_size_unit", typeHelper4, function13, expression2);
            if (resolveOptionalExpression7 != null) {
                expression2 = resolveOptionalExpression7;
            }
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.fontVariationSettings, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
            Expression resolveOptionalExpression9 = JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.fontWeight, jSONObject, "font_weight", DivTextRangeJsonParser.TYPE_HELPER_FONT_WEIGHT, DivFontWeight.FROM_STRING);
            Expression resolveOptionalExpression10 = JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.fontWeightValue, jSONObject, "font_weight_value", typeHelper2, function12, DivTextRangeJsonParser.FONT_WEIGHT_VALUE_VALIDATOR);
            Expression resolveOptionalExpression11 = JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.letterSpacing, jSONObject, "letter_spacing", typeHelper, function1);
            Expression resolveOptionalExpression12 = JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.lineHeight, jSONObject, "line_height", typeHelper2, function12, DivTextRangeJsonParser.LINE_HEIGHT_VALIDATOR);
            DivTextRangeMask divTextRangeMask = (DivTextRangeMask) JsonFieldResolver.resolveOptional(parsingContext, rangeTemplate.mask, jSONObject, "mask", this.component.getDivTextRangeMaskJsonTemplateResolver(), this.component.getDivTextRangeMaskJsonEntityParser());
            Field field5 = rangeTemplate.start;
            ValueValidator valueValidator = DivTextRangeJsonParser.START_VALIDATOR;
            Expression expression3 = DivTextRangeJsonParser.START_DEFAULT_VALUE;
            Expression resolveOptionalExpression13 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "start", typeHelper2, function12, valueValidator, expression3);
            Expression expression4 = resolveOptionalExpression13 == null ? expression3 : resolveOptionalExpression13;
            Field field6 = rangeTemplate.strike;
            TypeHelper typeHelper5 = DivTextRangeJsonParser.TYPE_HELPER_STRIKE;
            Function1 function14 = DivLineStyle.FROM_STRING;
            return new DivText.Range(resolveOptionalList, resolveOptionalExpression, divTextRangeBackground, expression, divTextRangeBorder, resolveOptionalExpression3, resolveOptionalExpression4, resolveOptionalExpression5, resolveOptionalExpression6, expression2, resolveOptionalExpression8, resolveOptionalExpression9, resolveOptionalExpression10, resolveOptionalExpression11, resolveOptionalExpression12, divTextRangeMask, expression4, JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "strike", typeHelper5, function14), JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.textColor, jSONObject, "text_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), (DivShadow) JsonFieldResolver.resolveOptional(parsingContext, rangeTemplate.textShadow, jSONObject, "text_shadow", this.component.getDivShadowJsonTemplateResolver(), this.component.getDivShadowJsonEntityParser()), JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.topOffset, jSONObject, "top_offset", typeHelper2, function12, DivTextRangeJsonParser.TOP_OFFSET_VALIDATOR), JsonFieldResolver.resolveOptionalExpression(parsingContext, rangeTemplate.underline, jSONObject, "underline", DivTextRangeJsonParser.TYPE_HELPER_UNDERLINE, function14));
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        BASELINE_OFFSET_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        DivSizeUnit divSizeUnit = DivSizeUnit.SP;
        FONT_SIZE_UNIT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        START_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        TYPE_HELPER_ALIGNMENT_VERTICAL = companion2.from(ArraysKt.first(DivTextAlignmentVertical.values()), new Function1() { // from class: com.yandex.div2.DivTextRangeJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivTextAlignmentVertical);
            }
        });
        TYPE_HELPER_FONT_SIZE_UNIT = companion2.from(divSizeUnit, new Function1() { // from class: com.yandex.div2.DivTextRangeJsonParser$Companion$TYPE_HELPER_FONT_SIZE_UNIT$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
        TYPE_HELPER_FONT_WEIGHT = companion2.from(ArraysKt.first(DivFontWeight.values()), new Function1() { // from class: com.yandex.div2.DivTextRangeJsonParser$Companion$TYPE_HELPER_FONT_WEIGHT$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivFontWeight);
            }
        });
        TYPE_HELPER_STRIKE = companion2.from(ArraysKt.first(DivLineStyle.values()), new Function1() { // from class: com.yandex.div2.DivTextRangeJsonParser$Companion$TYPE_HELPER_STRIKE$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivLineStyle);
            }
        });
        TYPE_HELPER_UNDERLINE = companion2.from(ArraysKt.first(DivLineStyle.values()), new Function1() { // from class: com.yandex.div2.DivTextRangeJsonParser$Companion$TYPE_HELPER_UNDERLINE$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivLineStyle);
            }
        });
        END_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivTextRangeJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean END_VALIDATOR$lambda$0;
                END_VALIDATOR$lambda$0 = DivTextRangeJsonParser.END_VALIDATOR$lambda$0(((Long) obj).longValue());
                return END_VALIDATOR$lambda$0;
            }
        };
        FONT_SIZE_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivTextRangeJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean FONT_SIZE_VALIDATOR$lambda$1;
                FONT_SIZE_VALIDATOR$lambda$1 = DivTextRangeJsonParser.FONT_SIZE_VALIDATOR$lambda$1(((Long) obj).longValue());
                return FONT_SIZE_VALIDATOR$lambda$1;
            }
        };
        FONT_WEIGHT_VALUE_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivTextRangeJsonParser$$ExternalSyntheticLambda2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean FONT_WEIGHT_VALUE_VALIDATOR$lambda$2;
                FONT_WEIGHT_VALUE_VALIDATOR$lambda$2 = DivTextRangeJsonParser.FONT_WEIGHT_VALUE_VALIDATOR$lambda$2(((Long) obj).longValue());
                return FONT_WEIGHT_VALUE_VALIDATOR$lambda$2;
            }
        };
        LINE_HEIGHT_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivTextRangeJsonParser$$ExternalSyntheticLambda3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean LINE_HEIGHT_VALIDATOR$lambda$3;
                LINE_HEIGHT_VALIDATOR$lambda$3 = DivTextRangeJsonParser.LINE_HEIGHT_VALIDATOR$lambda$3(((Long) obj).longValue());
                return LINE_HEIGHT_VALIDATOR$lambda$3;
            }
        };
        START_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivTextRangeJsonParser$$ExternalSyntheticLambda4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean START_VALIDATOR$lambda$4;
                START_VALIDATOR$lambda$4 = DivTextRangeJsonParser.START_VALIDATOR$lambda$4(((Long) obj).longValue());
                return START_VALIDATOR$lambda$4;
            }
        };
        TOP_OFFSET_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivTextRangeJsonParser$$ExternalSyntheticLambda5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean TOP_OFFSET_VALIDATOR$lambda$5;
                TOP_OFFSET_VALIDATOR$lambda$5 = DivTextRangeJsonParser.TOP_OFFSET_VALIDATOR$lambda$5(((Long) obj).longValue());
                return TOP_OFFSET_VALIDATOR$lambda$5;
            }
        };
    }
}
