package com.yandex.div2;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
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

/* compiled from: DivFadeTransitionJsonParser.kt */
/* loaded from: classes9.dex */
public abstract class DivFadeTransitionJsonParser {
    public static final Expression ALPHA_DEFAULT_VALUE;
    public static final ValueValidator ALPHA_VALIDATOR;
    private static final Companion Companion = new Companion(null);
    public static final Expression DURATION_DEFAULT_VALUE;
    public static final ValueValidator DURATION_VALIDATOR;
    public static final Expression INTERPOLATOR_DEFAULT_VALUE;
    public static final Expression START_DELAY_DEFAULT_VALUE;
    public static final ValueValidator START_DELAY_VALIDATOR;
    public static final TypeHelper TYPE_HELPER_INTERPOLATOR;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ALPHA_VALIDATOR$lambda$0(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DURATION_VALIDATOR$lambda$1(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean START_DELAY_VALIDATOR$lambda$2(long j) {
        return j >= 0;
    }

    /* compiled from: DivFadeTransitionJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivFadeTransition deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivFadeTransitionJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivFadeTransitionJsonParser.ALPHA_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator2 = DivFadeTransitionJsonParser.DURATION_VALIDATOR;
            Expression expression2 = DivFadeTransitionJsonParser.DURATION_DEFAULT_VALUE;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, IronSourceConstants.EVENTS_DURATION, typeHelper2, function12, valueValidator2, expression2);
            if (readOptionalExpression2 != null) {
                expression2 = readOptionalExpression2;
            }
            TypeHelper typeHelper3 = DivFadeTransitionJsonParser.TYPE_HELPER_INTERPOLATOR;
            Function1 function13 = DivAnimationInterpolator.FROM_STRING;
            Expression expression3 = DivFadeTransitionJsonParser.INTERPOLATOR_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper3, function13, expression3);
            Expression expression4 = readOptionalExpression3 == null ? expression3 : readOptionalExpression3;
            ValueValidator valueValidator3 = DivFadeTransitionJsonParser.START_DELAY_VALIDATOR;
            Expression expression5 = DivFadeTransitionJsonParser.START_DELAY_DEFAULT_VALUE;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper2, function12, valueValidator3, expression5);
            if (readOptionalExpression4 != null) {
                expression5 = readOptionalExpression4;
            }
            return new DivFadeTransition(expression, expression2, expression4, expression5);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivFadeTransition divFadeTransition) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divFadeTransition.alpha);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, IronSourceConstants.EVENTS_DURATION, divFadeTransition.getDuration());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", divFadeTransition.getInterpolator(), DivAnimationInterpolator.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", divFadeTransition.getStartDelay());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "fade");
            return jSONObject;
        }
    }

    /* compiled from: DivFadeTransitionJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivFadeTransitionTemplate deserialize(ParsingContext parsingContext, DivFadeTransitionTemplate divFadeTransitionTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divFadeTransitionTemplate != null ? divFadeTransitionTemplate.alpha : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivFadeTransitionJsonParser.ALPHA_VALIDATOR);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = divFadeTransitionTemplate != null ? divFadeTransitionTemplate.duration : null;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivFadeTransitionTemplate(readOptionalFieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, IronSourceConstants.EVENTS_DURATION, typeHelper, allowPropertyOverride, field, function1, DivFadeTransitionJsonParser.DURATION_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "interpolator", DivFadeTransitionJsonParser.TYPE_HELPER_INTERPOLATOR, allowPropertyOverride, divFadeTransitionTemplate != null ? divFadeTransitionTemplate.interpolator : null, DivAnimationInterpolator.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, divFadeTransitionTemplate != null ? divFadeTransitionTemplate.startDelay : null, function1, DivFadeTransitionJsonParser.START_DELAY_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivFadeTransitionTemplate divFadeTransitionTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divFadeTransitionTemplate.alpha);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, IronSourceConstants.EVENTS_DURATION, divFadeTransitionTemplate.duration);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", divFadeTransitionTemplate.interpolator, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", divFadeTransitionTemplate.startDelay);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "fade");
            return jSONObject;
        }
    }

    /* compiled from: DivFadeTransitionJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivFadeTransition resolve(ParsingContext parsingContext, DivFadeTransitionTemplate divFadeTransitionTemplate, JSONObject jSONObject) {
            Field field = divFadeTransitionTemplate.alpha;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivFadeTransitionJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivFadeTransitionJsonParser.ALPHA_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            Field field2 = divFadeTransitionTemplate.duration;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator2 = DivFadeTransitionJsonParser.DURATION_VALIDATOR;
            Expression expression2 = DivFadeTransitionJsonParser.DURATION_DEFAULT_VALUE;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, IronSourceConstants.EVENTS_DURATION, typeHelper2, function12, valueValidator2, expression2);
            if (resolveOptionalExpression2 == null) {
                resolveOptionalExpression2 = expression2;
            }
            Field field3 = divFadeTransitionTemplate.interpolator;
            TypeHelper typeHelper3 = DivFadeTransitionJsonParser.TYPE_HELPER_INTERPOLATOR;
            Function1 function13 = DivAnimationInterpolator.FROM_STRING;
            Expression expression3 = DivFadeTransitionJsonParser.INTERPOLATOR_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "interpolator", typeHelper3, function13, expression3);
            if (resolveOptionalExpression3 == null) {
                resolveOptionalExpression3 = expression3;
            }
            Field field4 = divFadeTransitionTemplate.startDelay;
            ValueValidator valueValidator3 = DivFadeTransitionJsonParser.START_DELAY_VALIDATOR;
            Expression expression4 = DivFadeTransitionJsonParser.START_DELAY_DEFAULT_VALUE;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "start_delay", typeHelper2, function12, valueValidator3, expression4);
            if (resolveOptionalExpression4 != null) {
                expression4 = resolveOptionalExpression4;
            }
            return new DivFadeTransition(expression, resolveOptionalExpression2, resolveOptionalExpression3, expression4);
        }
    }

    /* compiled from: DivFadeTransitionJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        ALPHA_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        DURATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.EASE_IN_OUT;
        INTERPOLATOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divAnimationInterpolator, null, 2, null);
        START_DELAY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        TYPE_HELPER_INTERPOLATOR = TypeHelper.INSTANCE.from(divAnimationInterpolator, new Function1() { // from class: com.yandex.div2.DivFadeTransitionJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
            }
        });
        ALPHA_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivFadeTransitionJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ALPHA_VALIDATOR$lambda$0;
                ALPHA_VALIDATOR$lambda$0 = DivFadeTransitionJsonParser.ALPHA_VALIDATOR$lambda$0(((Double) obj).doubleValue());
                return ALPHA_VALIDATOR$lambda$0;
            }
        };
        DURATION_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivFadeTransitionJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean DURATION_VALIDATOR$lambda$1;
                DURATION_VALIDATOR$lambda$1 = DivFadeTransitionJsonParser.DURATION_VALIDATOR$lambda$1(((Long) obj).longValue());
                return DURATION_VALIDATOR$lambda$1;
            }
        };
        START_DELAY_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivFadeTransitionJsonParser$$ExternalSyntheticLambda2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean START_DELAY_VALIDATOR$lambda$2;
                START_DELAY_VALIDATOR$lambda$2 = DivFadeTransitionJsonParser.START_DELAY_VALIDATOR$lambda$2(((Long) obj).longValue());
                return START_DELAY_VALIDATOR$lambda$2;
            }
        };
    }
}
