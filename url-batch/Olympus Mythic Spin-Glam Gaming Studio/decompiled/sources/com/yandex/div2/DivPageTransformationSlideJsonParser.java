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

/* compiled from: DivPageTransformationSlideJsonParser.kt */
/* loaded from: classes11.dex */
public abstract class DivPageTransformationSlideJsonParser {
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

    /* compiled from: DivPageTransformationSlideJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivPageTransformationSlide deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper typeHelper = DivPageTransformationSlideJsonParser.TYPE_HELPER_INTERPOLATOR;
            Function1 function1 = DivAnimationInterpolator.FROM_STRING;
            Expression expression = DivPageTransformationSlideJsonParser.INTERPOLATOR_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper, function1, expression);
            Expression expression2 = readOptionalExpression == null ? expression : readOptionalExpression;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivPageTransformationSlideJsonParser.NEXT_PAGE_ALPHA_VALIDATOR;
            Expression expression3 = DivPageTransformationSlideJsonParser.NEXT_PAGE_ALPHA_DEFAULT_VALUE;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "next_page_alpha", typeHelper2, function12, valueValidator, expression3);
            if (readOptionalExpression2 != null) {
                expression3 = readOptionalExpression2;
            }
            ValueValidator valueValidator2 = DivPageTransformationSlideJsonParser.NEXT_PAGE_SCALE_VALIDATOR;
            Expression expression4 = DivPageTransformationSlideJsonParser.NEXT_PAGE_SCALE_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "next_page_scale", typeHelper2, function12, valueValidator2, expression4);
            if (readOptionalExpression3 != null) {
                expression4 = readOptionalExpression3;
            }
            ValueValidator valueValidator3 = DivPageTransformationSlideJsonParser.PREVIOUS_PAGE_ALPHA_VALIDATOR;
            Expression expression5 = DivPageTransformationSlideJsonParser.PREVIOUS_PAGE_ALPHA_DEFAULT_VALUE;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "previous_page_alpha", typeHelper2, function12, valueValidator3, expression5);
            if (readOptionalExpression4 != null) {
                expression5 = readOptionalExpression4;
            }
            ValueValidator valueValidator4 = DivPageTransformationSlideJsonParser.PREVIOUS_PAGE_SCALE_VALIDATOR;
            Expression expression6 = DivPageTransformationSlideJsonParser.PREVIOUS_PAGE_SCALE_DEFAULT_VALUE;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "previous_page_scale", typeHelper2, function12, valueValidator4, expression6);
            if (readOptionalExpression5 != null) {
                expression6 = readOptionalExpression5;
            }
            return new DivPageTransformationSlide(expression2, expression3, expression4, expression5, expression6);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivPageTransformationSlide divPageTransformationSlide) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", divPageTransformationSlide.interpolator, DivAnimationInterpolator.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "next_page_alpha", divPageTransformationSlide.nextPageAlpha);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "next_page_scale", divPageTransformationSlide.nextPageScale);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "previous_page_alpha", divPageTransformationSlide.previousPageAlpha);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "previous_page_scale", divPageTransformationSlide.previousPageScale);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "slide");
            return jSONObject;
        }
    }

    /* compiled from: DivPageTransformationSlideJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivPageTransformationSlideTemplate deserialize(ParsingContext parsingContext, DivPageTransformationSlideTemplate divPageTransformationSlideTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "interpolator", DivPageTransformationSlideJsonParser.TYPE_HELPER_INTERPOLATOR, allowPropertyOverride, divPageTransformationSlideTemplate != null ? divPageTransformationSlideTemplate.interpolator : null, DivAnimationInterpolator.FROM_STRING);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field field = divPageTransformationSlideTemplate != null ? divPageTransformationSlideTemplate.nextPageAlpha : null;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            return new DivPageTransformationSlideTemplate(readOptionalFieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "next_page_alpha", typeHelper, allowPropertyOverride, field, function1, DivPageTransformationSlideJsonParser.NEXT_PAGE_ALPHA_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "next_page_scale", typeHelper, allowPropertyOverride, divPageTransformationSlideTemplate != null ? divPageTransformationSlideTemplate.nextPageScale : null, function1, DivPageTransformationSlideJsonParser.NEXT_PAGE_SCALE_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "previous_page_alpha", typeHelper, allowPropertyOverride, divPageTransformationSlideTemplate != null ? divPageTransformationSlideTemplate.previousPageAlpha : null, function1, DivPageTransformationSlideJsonParser.PREVIOUS_PAGE_ALPHA_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "previous_page_scale", typeHelper, allowPropertyOverride, divPageTransformationSlideTemplate != null ? divPageTransformationSlideTemplate.previousPageScale : null, function1, DivPageTransformationSlideJsonParser.PREVIOUS_PAGE_SCALE_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivPageTransformationSlideTemplate divPageTransformationSlideTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", divPageTransformationSlideTemplate.interpolator, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "next_page_alpha", divPageTransformationSlideTemplate.nextPageAlpha);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "next_page_scale", divPageTransformationSlideTemplate.nextPageScale);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "previous_page_alpha", divPageTransformationSlideTemplate.previousPageAlpha);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "previous_page_scale", divPageTransformationSlideTemplate.previousPageScale);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "slide");
            return jSONObject;
        }
    }

    /* compiled from: DivPageTransformationSlideJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivPageTransformationSlide resolve(ParsingContext parsingContext, DivPageTransformationSlideTemplate divPageTransformationSlideTemplate, JSONObject jSONObject) {
            Field field = divPageTransformationSlideTemplate.interpolator;
            TypeHelper typeHelper = DivPageTransformationSlideJsonParser.TYPE_HELPER_INTERPOLATOR;
            Function1 function1 = DivAnimationInterpolator.FROM_STRING;
            Expression expression = DivPageTransformationSlideJsonParser.INTERPOLATOR_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "interpolator", typeHelper, function1, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            Field field2 = divPageTransformationSlideTemplate.nextPageAlpha;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivPageTransformationSlideJsonParser.NEXT_PAGE_ALPHA_VALIDATOR;
            Expression expression2 = DivPageTransformationSlideJsonParser.NEXT_PAGE_ALPHA_DEFAULT_VALUE;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "next_page_alpha", typeHelper2, function12, valueValidator, expression2);
            if (resolveOptionalExpression2 != null) {
                expression2 = resolveOptionalExpression2;
            }
            Field field3 = divPageTransformationSlideTemplate.nextPageScale;
            ValueValidator valueValidator2 = DivPageTransformationSlideJsonParser.NEXT_PAGE_SCALE_VALIDATOR;
            Expression expression3 = DivPageTransformationSlideJsonParser.NEXT_PAGE_SCALE_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "next_page_scale", typeHelper2, function12, valueValidator2, expression3);
            if (resolveOptionalExpression3 != null) {
                expression3 = resolveOptionalExpression3;
            }
            Field field4 = divPageTransformationSlideTemplate.previousPageAlpha;
            ValueValidator valueValidator3 = DivPageTransformationSlideJsonParser.PREVIOUS_PAGE_ALPHA_VALIDATOR;
            Expression expression4 = DivPageTransformationSlideJsonParser.PREVIOUS_PAGE_ALPHA_DEFAULT_VALUE;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "previous_page_alpha", typeHelper2, function12, valueValidator3, expression4);
            if (resolveOptionalExpression4 != null) {
                expression4 = resolveOptionalExpression4;
            }
            Field field5 = divPageTransformationSlideTemplate.previousPageScale;
            ValueValidator valueValidator4 = DivPageTransformationSlideJsonParser.PREVIOUS_PAGE_SCALE_VALIDATOR;
            Expression expression5 = DivPageTransformationSlideJsonParser.PREVIOUS_PAGE_SCALE_DEFAULT_VALUE;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "previous_page_scale", typeHelper2, function12, valueValidator4, expression5);
            return new DivPageTransformationSlide(expression, expression2, expression3, expression4, resolveOptionalExpression5 == null ? expression5 : resolveOptionalExpression5);
        }
    }

    /* compiled from: DivPageTransformationSlideJsonParser.kt */
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
        TYPE_HELPER_INTERPOLATOR = TypeHelper.INSTANCE.from(divAnimationInterpolator, new Function1() { // from class: com.yandex.div2.DivPageTransformationSlideJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
            }
        });
        NEXT_PAGE_ALPHA_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivPageTransformationSlideJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean NEXT_PAGE_ALPHA_VALIDATOR$lambda$0;
                NEXT_PAGE_ALPHA_VALIDATOR$lambda$0 = DivPageTransformationSlideJsonParser.NEXT_PAGE_ALPHA_VALIDATOR$lambda$0(((Double) obj).doubleValue());
                return NEXT_PAGE_ALPHA_VALIDATOR$lambda$0;
            }
        };
        NEXT_PAGE_SCALE_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivPageTransformationSlideJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean NEXT_PAGE_SCALE_VALIDATOR$lambda$1;
                NEXT_PAGE_SCALE_VALIDATOR$lambda$1 = DivPageTransformationSlideJsonParser.NEXT_PAGE_SCALE_VALIDATOR$lambda$1(((Double) obj).doubleValue());
                return NEXT_PAGE_SCALE_VALIDATOR$lambda$1;
            }
        };
        PREVIOUS_PAGE_ALPHA_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivPageTransformationSlideJsonParser$$ExternalSyntheticLambda2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean PREVIOUS_PAGE_ALPHA_VALIDATOR$lambda$2;
                PREVIOUS_PAGE_ALPHA_VALIDATOR$lambda$2 = DivPageTransformationSlideJsonParser.PREVIOUS_PAGE_ALPHA_VALIDATOR$lambda$2(((Double) obj).doubleValue());
                return PREVIOUS_PAGE_ALPHA_VALIDATOR$lambda$2;
            }
        };
        PREVIOUS_PAGE_SCALE_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivPageTransformationSlideJsonParser$$ExternalSyntheticLambda3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean PREVIOUS_PAGE_SCALE_VALIDATOR$lambda$3;
                PREVIOUS_PAGE_SCALE_VALIDATOR$lambda$3 = DivPageTransformationSlideJsonParser.PREVIOUS_PAGE_SCALE_VALIDATOR$lambda$3(((Double) obj).doubleValue());
                return PREVIOUS_PAGE_SCALE_VALIDATOR$lambda$3;
            }
        };
    }
}
