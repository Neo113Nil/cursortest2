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
import com.yandex.div2.DivSlider;
import com.yandex.div2.DivSliderTemplate;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivSliderJsonParser.kt */
/* loaded from: classes8.dex */
public abstract class DivSliderTextStyleJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final Expression FONT_SIZE_DEFAULT_VALUE;
    public static final Expression FONT_SIZE_UNIT_DEFAULT_VALUE;
    public static final ValueValidator FONT_SIZE_VALIDATOR;
    public static final ValueValidator FONT_WEIGHT_VALUE_VALIDATOR;
    public static final Expression LETTER_SPACING_DEFAULT_VALUE;
    public static final Expression TEXT_COLOR_DEFAULT_VALUE;
    public static final TypeHelper TYPE_HELPER_FONT_SIZE_UNIT;
    public static final TypeHelper TYPE_HELPER_FONT_WEIGHT;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FONT_SIZE_VALIDATOR$lambda$0(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FONT_WEIGHT_VALUE_VALIDATOR$lambda$1(long j) {
        return j > 0;
    }

    /* compiled from: DivSliderJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivSlider.TextStyle deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_family", TypeHelpersKt.TYPE_HELPER_STRING);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = DivSliderTextStyleJsonParser.FONT_SIZE_VALIDATOR;
            Expression expression = DivSliderTextStyleJsonParser.FONT_SIZE_DEFAULT_VALUE;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyConstants.TEXT_SIZE, typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression2 != null) {
                expression = readOptionalExpression2;
            }
            TypeHelper typeHelper2 = DivSliderTextStyleJsonParser.TYPE_HELPER_FONT_SIZE_UNIT;
            Function1 function12 = DivSizeUnit.FROM_STRING;
            Expression expression2 = DivSliderTextStyleJsonParser.FONT_SIZE_UNIT_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_size_unit", typeHelper2, function12, expression2);
            if (readOptionalExpression3 != null) {
                expression2 = readOptionalExpression3;
            }
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight", DivSliderTextStyleJsonParser.TYPE_HELPER_FONT_WEIGHT, DivFontWeight.FROM_STRING);
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "font_weight_value", typeHelper, function1, DivSliderTextStyleJsonParser.FONT_WEIGHT_VALUE_VALIDATOR);
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression expression3 = DivSliderTextStyleJsonParser.LETTER_SPACING_DEFAULT_VALUE;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "letter_spacing", typeHelper3, function13, expression3);
            if (readOptionalExpression7 != null) {
                expression3 = readOptionalExpression7;
            }
            DivPoint divPoint = (DivPoint) JsonPropertyParser.readOptional(parsingContext, jSONObject, "offset", this.component.getDivPointJsonEntityParser());
            TypeHelper<Integer> typeHelper4 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1 function14 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression4 = DivSliderTextStyleJsonParser.TEXT_COLOR_DEFAULT_VALUE;
            Expression readOptionalExpression8 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "text_color", typeHelper4, function14, expression4);
            if (readOptionalExpression8 != null) {
                expression4 = readOptionalExpression8;
            }
            return new DivSlider.TextStyle(readOptionalExpression, expression, expression2, readOptionalExpression4, readOptionalExpression5, readOptionalExpression6, expression3, divPoint, expression4);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivSlider.TextStyle textStyle) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_family", textStyle.fontFamily);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, ViewHierarchyConstants.TEXT_SIZE, textStyle.fontSize);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_size_unit", textStyle.fontSizeUnit, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_variation_settings", textStyle.fontVariationSettings);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight", textStyle.fontWeight, DivFontWeight.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "font_weight_value", textStyle.fontWeightValue);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "letter_spacing", textStyle.letterSpacing);
            JsonPropertyParser.write(parsingContext, jSONObject, "offset", textStyle.offset, this.component.getDivPointJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text_color", textStyle.textColor, ParsingConvertersKt.COLOR_INT_TO_STRING);
            return jSONObject;
        }
    }

    /* compiled from: DivSliderJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivSliderTemplate.TextStyleTemplate deserialize(ParsingContext parsingContext, DivSliderTemplate.TextStyleTemplate textStyleTemplate, JSONObject jSONObject) {
            TemplateParserImpl templateParserImpl;
            Field field;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_family", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, textStyleTemplate != null ? textStyleTemplate.fontFamily : null);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field2 = textStyleTemplate != null ? textStyleTemplate.fontSize : null;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, ViewHierarchyConstants.TEXT_SIZE, typeHelper, allowPropertyOverride, field2, function1, DivSliderTextStyleJsonParser.FONT_SIZE_VALIDATOR);
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_size_unit", DivSliderTextStyleJsonParser.TYPE_HELPER_FONT_SIZE_UNIT, allowPropertyOverride, textStyleTemplate != null ? textStyleTemplate.fontSizeUnit : null, DivSizeUnit.FROM_STRING);
            Field readOptionalFieldWithExpression4 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT, allowPropertyOverride, textStyleTemplate != null ? textStyleTemplate.fontVariationSettings : null);
            Field readOptionalFieldWithExpression5 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_weight", DivSliderTextStyleJsonParser.TYPE_HELPER_FONT_WEIGHT, allowPropertyOverride, textStyleTemplate != null ? textStyleTemplate.fontWeight : null, DivFontWeight.FROM_STRING);
            Field readOptionalFieldWithExpression6 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "font_weight_value", typeHelper, allowPropertyOverride, textStyleTemplate != null ? textStyleTemplate.fontWeightValue : null, function1, DivSliderTextStyleJsonParser.FONT_WEIGHT_VALUE_VALIDATOR);
            Field readOptionalFieldWithExpression7 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "letter_spacing", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, textStyleTemplate != null ? textStyleTemplate.letterSpacing : null, ParsingConvertersKt.NUMBER_TO_DOUBLE);
            if (textStyleTemplate != null) {
                templateParserImpl = this;
                field = textStyleTemplate.offset;
            } else {
                templateParserImpl = this;
                field = null;
            }
            return new DivSliderTemplate.TextStyleTemplate(readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, readOptionalFieldWithExpression4, readOptionalFieldWithExpression5, readOptionalFieldWithExpression6, readOptionalFieldWithExpression7, JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "offset", allowPropertyOverride, field, templateParserImpl.component.getDivPointJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "text_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, textStyleTemplate != null ? textStyleTemplate.textColor : null, ParsingConvertersKt.STRING_TO_COLOR_INT));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivSliderTemplate.TextStyleTemplate textStyleTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_family", textStyleTemplate.fontFamily);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, ViewHierarchyConstants.TEXT_SIZE, textStyleTemplate.fontSize);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_size_unit", textStyleTemplate.fontSizeUnit, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_variation_settings", textStyleTemplate.fontVariationSettings);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight", textStyleTemplate.fontWeight, DivFontWeight.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "font_weight_value", textStyleTemplate.fontWeightValue);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "letter_spacing", textStyleTemplate.letterSpacing);
            JsonFieldParser.writeField(parsingContext, jSONObject, "offset", textStyleTemplate.offset, this.component.getDivPointJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "text_color", textStyleTemplate.textColor, ParsingConvertersKt.COLOR_INT_TO_STRING);
            return jSONObject;
        }
    }

    /* compiled from: DivSliderJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivSlider.TextStyle resolve(ParsingContext parsingContext, DivSliderTemplate.TextStyleTemplate textStyleTemplate, JSONObject jSONObject) {
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, textStyleTemplate.fontFamily, jSONObject, "font_family", TypeHelpersKt.TYPE_HELPER_STRING);
            Field field = textStyleTemplate.fontSize;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = DivSliderTextStyleJsonParser.FONT_SIZE_VALIDATOR;
            Expression expression = DivSliderTextStyleJsonParser.FONT_SIZE_DEFAULT_VALUE;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, ViewHierarchyConstants.TEXT_SIZE, typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression2 != null) {
                expression = resolveOptionalExpression2;
            }
            Field field2 = textStyleTemplate.fontSizeUnit;
            TypeHelper typeHelper2 = DivSliderTextStyleJsonParser.TYPE_HELPER_FONT_SIZE_UNIT;
            Function1 function12 = DivSizeUnit.FROM_STRING;
            Expression expression2 = DivSliderTextStyleJsonParser.FONT_SIZE_UNIT_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "font_size_unit", typeHelper2, function12, expression2);
            if (resolveOptionalExpression3 != null) {
                expression2 = resolveOptionalExpression3;
            }
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, textStyleTemplate.fontVariationSettings, jSONObject, "font_variation_settings", TypeHelpersKt.TYPE_HELPER_DICT);
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, textStyleTemplate.fontWeight, jSONObject, "font_weight", DivSliderTextStyleJsonParser.TYPE_HELPER_FONT_WEIGHT, DivFontWeight.FROM_STRING);
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, textStyleTemplate.fontWeightValue, jSONObject, "font_weight_value", typeHelper, function1, DivSliderTextStyleJsonParser.FONT_WEIGHT_VALUE_VALIDATOR);
            Field field3 = textStyleTemplate.letterSpacing;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression expression3 = DivSliderTextStyleJsonParser.LETTER_SPACING_DEFAULT_VALUE;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "letter_spacing", typeHelper3, function13, expression3);
            if (resolveOptionalExpression7 != null) {
                expression3 = resolveOptionalExpression7;
            }
            DivPoint divPoint = (DivPoint) JsonFieldResolver.resolveOptional(parsingContext, textStyleTemplate.offset, jSONObject, "offset", this.component.getDivPointJsonTemplateResolver(), this.component.getDivPointJsonEntityParser());
            Field field4 = textStyleTemplate.textColor;
            TypeHelper<Integer> typeHelper4 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1 function14 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression4 = DivSliderTextStyleJsonParser.TEXT_COLOR_DEFAULT_VALUE;
            Expression resolveOptionalExpression8 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "text_color", typeHelper4, function14, expression4);
            if (resolveOptionalExpression8 != null) {
                expression4 = resolveOptionalExpression8;
            }
            return new DivSlider.TextStyle(resolveOptionalExpression, expression, expression2, resolveOptionalExpression4, resolveOptionalExpression5, resolveOptionalExpression6, expression3, divPoint, expression4);
        }
    }

    /* compiled from: DivSliderJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        FONT_SIZE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        DivSizeUnit divSizeUnit = DivSizeUnit.SP;
        FONT_SIZE_UNIT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        LETTER_SPACING_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        TEXT_COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, -16777216, null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        TYPE_HELPER_FONT_SIZE_UNIT = companion2.from(divSizeUnit, new Function1() { // from class: com.yandex.div2.DivSliderTextStyleJsonParser$Companion$TYPE_HELPER_FONT_SIZE_UNIT$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
        TYPE_HELPER_FONT_WEIGHT = companion2.from(ArraysKt.first(DivFontWeight.values()), new Function1() { // from class: com.yandex.div2.DivSliderTextStyleJsonParser$Companion$TYPE_HELPER_FONT_WEIGHT$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivFontWeight);
            }
        });
        FONT_SIZE_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivSliderTextStyleJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean FONT_SIZE_VALIDATOR$lambda$0;
                FONT_SIZE_VALIDATOR$lambda$0 = DivSliderTextStyleJsonParser.FONT_SIZE_VALIDATOR$lambda$0(((Long) obj).longValue());
                return FONT_SIZE_VALIDATOR$lambda$0;
            }
        };
        FONT_WEIGHT_VALUE_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivSliderTextStyleJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean FONT_WEIGHT_VALUE_VALIDATOR$lambda$1;
                FONT_WEIGHT_VALUE_VALIDATOR$lambda$1 = DivSliderTextStyleJsonParser.FONT_WEIGHT_VALUE_VALIDATOR$lambda$1(((Long) obj).longValue());
                return FONT_WEIGHT_VALUE_VALIDATOR$lambda$1;
            }
        };
    }
}
