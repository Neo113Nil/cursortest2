package com.yandex.div2;

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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivPageTransformationOverlapJsonParser.kt */
/* loaded from: classes8.dex */
public abstract class DivPageTransformationOverlapJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final Expression INTERPOLATOR_DEFAULT_VALUE;
    public static final Expression NEXT_PAGE_ALPHA_DEFAULT_VALUE;
    public static final ValueValidator NEXT_PAGE_ALPHA_VALIDATOR;
    public static final Expression NEXT_PAGE_SCALE_DEFAULT_VALUE;
    public static final ValueValidator NEXT_PAGE_SCALE_VALIDATOR;
    public static final Expression PREVIOUS_PAGE_ALPHA_DEFAULT_VALUE;
    public static final ValueValidator PREVIOUS_PAGE_ALPHA_VALIDATOR;
    public static final Expression PREVIOUS_PAGE_SCALE_DEFAULT_VALUE;
    public static final ValueValidator PREVIOUS_PAGE_SCALE_VALIDATOR;
    public static final Expression REVERSED_STACKING_ORDER_DEFAULT_VALUE;
    public static final TypeHelper TYPE_HELPER_INTERPOLATOR;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean NEXT_PAGE_ALPHA_VALIDATOR$lambda$0(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean NEXT_PAGE_SCALE_VALIDATOR$lambda$1(double d) {
        return d >= 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PREVIOUS_PAGE_ALPHA_VALIDATOR$lambda$2(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PREVIOUS_PAGE_SCALE_VALIDATOR$lambda$3(double d) {
        return d >= 0.0d;
    }

    /* compiled from: DivPageTransformationOverlapJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivPageTransformationOverlap deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper typeHelper = DivPageTransformationOverlapJsonParser.TYPE_HELPER_INTERPOLATOR;
            Function1 function1 = DivAnimationInterpolator.FROM_STRING;
            Expression expression = DivPageTransformationOverlapJsonParser.INTERPOLATOR_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper, function1, expression);
            Expression expression2 = readOptionalExpression == null ? expression : readOptionalExpression;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivPageTransformationOverlapJsonParser.NEXT_PAGE_ALPHA_VALIDATOR;
            Expression expression3 = DivPageTransformationOverlapJsonParser.NEXT_PAGE_ALPHA_DEFAULT_VALUE;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "next_page_alpha", typeHelper2, function12, valueValidator, expression3);
            if (readOptionalExpression2 != null) {
                expression3 = readOptionalExpression2;
            }
            ValueValidator valueValidator2 = DivPageTransformationOverlapJsonParser.NEXT_PAGE_SCALE_VALIDATOR;
            Expression expression4 = DivPageTransformationOverlapJsonParser.NEXT_PAGE_SCALE_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "next_page_scale", typeHelper2, function12, valueValidator2, expression4);
            if (readOptionalExpression3 != null) {
                expression4 = readOptionalExpression3;
            }
            ValueValidator valueValidator3 = DivPageTransformationOverlapJsonParser.PREVIOUS_PAGE_ALPHA_VALIDATOR;
            Expression expression5 = DivPageTransformationOverlapJsonParser.PREVIOUS_PAGE_ALPHA_DEFAULT_VALUE;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "previous_page_alpha", typeHelper2, function12, valueValidator3, expression5);
            if (readOptionalExpression4 != null) {
                expression5 = readOptionalExpression4;
            }
            ValueValidator valueValidator4 = DivPageTransformationOverlapJsonParser.PREVIOUS_PAGE_SCALE_VALIDATOR;
            Expression expression6 = DivPageTransformationOverlapJsonParser.PREVIOUS_PAGE_SCALE_DEFAULT_VALUE;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "previous_page_scale", typeHelper2, function12, valueValidator4, expression6);
            if (readOptionalExpression5 != null) {
                expression6 = readOptionalExpression5;
            }
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression7 = DivPageTransformationOverlapJsonParser.REVERSED_STACKING_ORDER_DEFAULT_VALUE;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "reversed_stacking_order", typeHelper3, function13, expression7);
            return new DivPageTransformationOverlap(expression2, expression3, expression4, expression5, expression6, readOptionalExpression6 == null ? expression7 : readOptionalExpression6);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivPageTransformationOverlap divPageTransformationOverlap) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", divPageTransformationOverlap.interpolator, DivAnimationInterpolator.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "next_page_alpha", divPageTransformationOverlap.nextPageAlpha);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "next_page_scale", divPageTransformationOverlap.nextPageScale);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "previous_page_alpha", divPageTransformationOverlap.previousPageAlpha);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "previous_page_scale", divPageTransformationOverlap.previousPageScale);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "reversed_stacking_order", divPageTransformationOverlap.reversedStackingOrder);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "overlap");
            return jSONObject;
        }
    }

    /* compiled from: DivPageTransformationOverlapJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivPageTransformationOverlapTemplate deserialize(ParsingContext parsingContext, DivPageTransformationOverlapTemplate divPageTransformationOverlapTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "interpolator", DivPageTransformationOverlapJsonParser.TYPE_HELPER_INTERPOLATOR, allowPropertyOverride, divPageTransformationOverlapTemplate != null ? divPageTransformationOverlapTemplate.interpolator : null, DivAnimationInterpolator.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field field = divPageTransformationOverlapTemplate != null ? divPageTransformationOverlapTemplate.nextPageAlpha : null;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            return new DivPageTransformationOverlapTemplate(readOptionalFieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "next_page_alpha", typeHelper, allowPropertyOverride, field, function1, DivPageTransformationOverlapJsonParser.NEXT_PAGE_ALPHA_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "next_page_scale", typeHelper, allowPropertyOverride, divPageTransformationOverlapTemplate != null ? divPageTransformationOverlapTemplate.nextPageScale : null, function1, DivPageTransformationOverlapJsonParser.NEXT_PAGE_SCALE_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "previous_page_alpha", typeHelper, allowPropertyOverride, divPageTransformationOverlapTemplate != null ? divPageTransformationOverlapTemplate.previousPageAlpha : null, function1, DivPageTransformationOverlapJsonParser.PREVIOUS_PAGE_ALPHA_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "previous_page_scale", typeHelper, allowPropertyOverride, divPageTransformationOverlapTemplate != null ? divPageTransformationOverlapTemplate.previousPageScale : null, function1, DivPageTransformationOverlapJsonParser.PREVIOUS_PAGE_SCALE_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "reversed_stacking_order", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divPageTransformationOverlapTemplate != null ? divPageTransformationOverlapTemplate.reversedStackingOrder : null, ParsingConvertersKt.ANY_TO_BOOLEAN));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivPageTransformationOverlapTemplate divPageTransformationOverlapTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", divPageTransformationOverlapTemplate.interpolator, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "next_page_alpha", divPageTransformationOverlapTemplate.nextPageAlpha);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "next_page_scale", divPageTransformationOverlapTemplate.nextPageScale);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "previous_page_alpha", divPageTransformationOverlapTemplate.previousPageAlpha);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "previous_page_scale", divPageTransformationOverlapTemplate.previousPageScale);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "reversed_stacking_order", divPageTransformationOverlapTemplate.reversedStackingOrder);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "overlap");
            return jSONObject;
        }
    }

    /* compiled from: DivPageTransformationOverlapJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivPageTransformationOverlap resolve(ParsingContext parsingContext, DivPageTransformationOverlapTemplate divPageTransformationOverlapTemplate, JSONObject jSONObject) {
            Field field = divPageTransformationOverlapTemplate.interpolator;
            TypeHelper typeHelper = DivPageTransformationOverlapJsonParser.TYPE_HELPER_INTERPOLATOR;
            Function1 function1 = DivAnimationInterpolator.FROM_STRING;
            Expression expression = DivPageTransformationOverlapJsonParser.INTERPOLATOR_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "interpolator", typeHelper, function1, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            Field field2 = divPageTransformationOverlapTemplate.nextPageAlpha;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivPageTransformationOverlapJsonParser.NEXT_PAGE_ALPHA_VALIDATOR;
            Expression expression2 = DivPageTransformationOverlapJsonParser.NEXT_PAGE_ALPHA_DEFAULT_VALUE;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "next_page_alpha", typeHelper2, function12, valueValidator, expression2);
            if (resolveOptionalExpression2 != null) {
                expression2 = resolveOptionalExpression2;
            }
            Field field3 = divPageTransformationOverlapTemplate.nextPageScale;
            ValueValidator valueValidator2 = DivPageTransformationOverlapJsonParser.NEXT_PAGE_SCALE_VALIDATOR;
            Expression expression3 = DivPageTransformationOverlapJsonParser.NEXT_PAGE_SCALE_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "next_page_scale", typeHelper2, function12, valueValidator2, expression3);
            if (resolveOptionalExpression3 != null) {
                expression3 = resolveOptionalExpression3;
            }
            Field field4 = divPageTransformationOverlapTemplate.previousPageAlpha;
            ValueValidator valueValidator3 = DivPageTransformationOverlapJsonParser.PREVIOUS_PAGE_ALPHA_VALIDATOR;
            Expression expression4 = DivPageTransformationOverlapJsonParser.PREVIOUS_PAGE_ALPHA_DEFAULT_VALUE;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "previous_page_alpha", typeHelper2, function12, valueValidator3, expression4);
            if (resolveOptionalExpression4 != null) {
                expression4 = resolveOptionalExpression4;
            }
            Field field5 = divPageTransformationOverlapTemplate.previousPageScale;
            ValueValidator valueValidator4 = DivPageTransformationOverlapJsonParser.PREVIOUS_PAGE_SCALE_VALIDATOR;
            Expression expression5 = DivPageTransformationOverlapJsonParser.PREVIOUS_PAGE_SCALE_DEFAULT_VALUE;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "previous_page_scale", typeHelper2, function12, valueValidator4, expression5);
            if (resolveOptionalExpression5 != null) {
                expression5 = resolveOptionalExpression5;
            }
            Field field6 = divPageTransformationOverlapTemplate.reversedStackingOrder;
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression6 = DivPageTransformationOverlapJsonParser.REVERSED_STACKING_ORDER_DEFAULT_VALUE;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "reversed_stacking_order", typeHelper3, function13, expression6);
            return new DivPageTransformationOverlap(expression, expression2, expression3, expression4, expression5, resolveOptionalExpression6 == null ? expression6 : resolveOptionalExpression6);
        }
    }

    /* compiled from: DivPageTransformationOverlapJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.EASE_IN_OUT;
        INTERPOLATOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divAnimationInterpolator, null, 2, null);
        Double valueOf = Double.valueOf(1.0d);
        NEXT_PAGE_ALPHA_DEFAULT_VALUE = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        NEXT_PAGE_SCALE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        PREVIOUS_PAGE_ALPHA_DEFAULT_VALUE = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        PREVIOUS_PAGE_SCALE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        REVERSED_STACKING_ORDER_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        TYPE_HELPER_INTERPOLATOR = TypeHelper.INSTANCE.from(divAnimationInterpolator, new Function1() { // from class: com.yandex.div2.DivPageTransformationOverlapJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
            }
        });
        NEXT_PAGE_ALPHA_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivPageTransformationOverlapJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean NEXT_PAGE_ALPHA_VALIDATOR$lambda$0;
                NEXT_PAGE_ALPHA_VALIDATOR$lambda$0 = DivPageTransformationOverlapJsonParser.NEXT_PAGE_ALPHA_VALIDATOR$lambda$0(((Double) obj).doubleValue());
                return NEXT_PAGE_ALPHA_VALIDATOR$lambda$0;
            }
        };
        NEXT_PAGE_SCALE_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivPageTransformationOverlapJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean NEXT_PAGE_SCALE_VALIDATOR$lambda$1;
                NEXT_PAGE_SCALE_VALIDATOR$lambda$1 = DivPageTransformationOverlapJsonParser.NEXT_PAGE_SCALE_VALIDATOR$lambda$1(((Double) obj).doubleValue());
                return NEXT_PAGE_SCALE_VALIDATOR$lambda$1;
            }
        };
        PREVIOUS_PAGE_ALPHA_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivPageTransformationOverlapJsonParser$$ExternalSyntheticLambda2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean PREVIOUS_PAGE_ALPHA_VALIDATOR$lambda$2;
                PREVIOUS_PAGE_ALPHA_VALIDATOR$lambda$2 = DivPageTransformationOverlapJsonParser.PREVIOUS_PAGE_ALPHA_VALIDATOR$lambda$2(((Double) obj).doubleValue());
                return PREVIOUS_PAGE_ALPHA_VALIDATOR$lambda$2;
            }
        };
        PREVIOUS_PAGE_SCALE_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivPageTransformationOverlapJsonParser$$ExternalSyntheticLambda3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean PREVIOUS_PAGE_SCALE_VALIDATOR$lambda$3;
                PREVIOUS_PAGE_SCALE_VALIDATOR$lambda$3 = DivPageTransformationOverlapJsonParser.PREVIOUS_PAGE_SCALE_VALIDATOR$lambda$3(((Double) obj).doubleValue());
                return PREVIOUS_PAGE_SCALE_VALIDATOR$lambda$3;
            }
        };
    }
}
