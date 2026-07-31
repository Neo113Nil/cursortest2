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

/* compiled from: DivScaleTransitionJsonParser.kt */
/* loaded from: classes10.dex */
public abstract class DivScaleTransitionJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final Expression DURATION_DEFAULT_VALUE;
    public static final ValueValidator DURATION_VALIDATOR;
    public static final Expression INTERPOLATOR_DEFAULT_VALUE;
    public static final Expression PIVOT_X_DEFAULT_VALUE;
    public static final ValueValidator PIVOT_X_VALIDATOR;
    public static final Expression PIVOT_Y_DEFAULT_VALUE;
    public static final ValueValidator PIVOT_Y_VALIDATOR;
    public static final Expression SCALE_DEFAULT_VALUE;
    public static final ValueValidator SCALE_VALIDATOR;
    public static final Expression START_DELAY_DEFAULT_VALUE;
    public static final ValueValidator START_DELAY_VALIDATOR;
    public static final TypeHelper TYPE_HELPER_INTERPOLATOR;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DURATION_VALIDATOR$lambda$0(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PIVOT_X_VALIDATOR$lambda$1(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PIVOT_Y_VALIDATOR$lambda$2(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SCALE_VALIDATOR$lambda$3(double d) {
        return d >= 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean START_DELAY_VALIDATOR$lambda$4(long j) {
        return j >= 0;
    }

    /* compiled from: DivScaleTransitionJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivScaleTransition deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = DivScaleTransitionJsonParser.DURATION_VALIDATOR;
            Expression expression = DivScaleTransitionJsonParser.DURATION_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, IronSourceConstants.EVENTS_DURATION, typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            TypeHelper typeHelper2 = DivScaleTransitionJsonParser.TYPE_HELPER_INTERPOLATOR;
            Function1 function12 = DivAnimationInterpolator.FROM_STRING;
            Expression expression2 = DivScaleTransitionJsonParser.INTERPOLATOR_DEFAULT_VALUE;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper2, function12, expression2);
            Expression expression3 = readOptionalExpression2 == null ? expression2 : readOptionalExpression2;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator2 = DivScaleTransitionJsonParser.PIVOT_X_VALIDATOR;
            Expression expression4 = DivScaleTransitionJsonParser.PIVOT_X_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "pivot_x", typeHelper3, function13, valueValidator2, expression4);
            if (readOptionalExpression3 != null) {
                expression4 = readOptionalExpression3;
            }
            ValueValidator valueValidator3 = DivScaleTransitionJsonParser.PIVOT_Y_VALIDATOR;
            Expression expression5 = DivScaleTransitionJsonParser.PIVOT_Y_DEFAULT_VALUE;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "pivot_y", typeHelper3, function13, valueValidator3, expression5);
            if (readOptionalExpression4 != null) {
                expression5 = readOptionalExpression4;
            }
            ValueValidator valueValidator4 = DivScaleTransitionJsonParser.SCALE_VALIDATOR;
            Expression expression6 = DivScaleTransitionJsonParser.SCALE_DEFAULT_VALUE;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scale", typeHelper3, function13, valueValidator4, expression6);
            if (readOptionalExpression5 != null) {
                expression6 = readOptionalExpression5;
            }
            ValueValidator valueValidator5 = DivScaleTransitionJsonParser.START_DELAY_VALIDATOR;
            Expression expression7 = DivScaleTransitionJsonParser.START_DELAY_DEFAULT_VALUE;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper, function1, valueValidator5, expression7);
            return new DivScaleTransition(expression, expression3, expression4, expression5, expression6, readOptionalExpression6 == null ? expression7 : readOptionalExpression6);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivScaleTransition divScaleTransition) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, IronSourceConstants.EVENTS_DURATION, divScaleTransition.getDuration());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", divScaleTransition.getInterpolator(), DivAnimationInterpolator.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "pivot_x", divScaleTransition.pivotX);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "pivot_y", divScaleTransition.pivotY);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scale", divScaleTransition.scale);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", divScaleTransition.getStartDelay());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "scale");
            return jSONObject;
        }
    }

    /* compiled from: DivScaleTransitionJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivScaleTransitionTemplate deserialize(ParsingContext parsingContext, DivScaleTransitionTemplate divScaleTransitionTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = divScaleTransitionTemplate != null ? divScaleTransitionTemplate.duration : null;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, IronSourceConstants.EVENTS_DURATION, typeHelper, allowPropertyOverride, field, function1, DivScaleTransitionJsonParser.DURATION_VALIDATOR);
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "interpolator", DivScaleTransitionJsonParser.TYPE_HELPER_INTERPOLATOR, allowPropertyOverride, divScaleTransitionTemplate != null ? divScaleTransitionTemplate.interpolator : null, DivAnimationInterpolator.FROM_STRING);
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field field2 = divScaleTransitionTemplate != null ? divScaleTransitionTemplate.pivotX : null;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            return new DivScaleTransitionTemplate(readOptionalFieldWithExpression, readOptionalFieldWithExpression2, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "pivot_x", typeHelper2, allowPropertyOverride, field2, function12, DivScaleTransitionJsonParser.PIVOT_X_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "pivot_y", typeHelper2, allowPropertyOverride, divScaleTransitionTemplate != null ? divScaleTransitionTemplate.pivotY : null, function12, DivScaleTransitionJsonParser.PIVOT_Y_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "scale", typeHelper2, allowPropertyOverride, divScaleTransitionTemplate != null ? divScaleTransitionTemplate.scale : null, function12, DivScaleTransitionJsonParser.SCALE_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, divScaleTransitionTemplate != null ? divScaleTransitionTemplate.startDelay : null, function1, DivScaleTransitionJsonParser.START_DELAY_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivScaleTransitionTemplate divScaleTransitionTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, IronSourceConstants.EVENTS_DURATION, divScaleTransitionTemplate.duration);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", divScaleTransitionTemplate.interpolator, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "pivot_x", divScaleTransitionTemplate.pivotX);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "pivot_y", divScaleTransitionTemplate.pivotY);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scale", divScaleTransitionTemplate.scale);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", divScaleTransitionTemplate.startDelay);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "scale");
            return jSONObject;
        }
    }

    /* compiled from: DivScaleTransitionJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivScaleTransition resolve(ParsingContext parsingContext, DivScaleTransitionTemplate divScaleTransitionTemplate, JSONObject jSONObject) {
            Field field = divScaleTransitionTemplate.duration;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = DivScaleTransitionJsonParser.DURATION_VALIDATOR;
            Expression expression = DivScaleTransitionJsonParser.DURATION_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, IronSourceConstants.EVENTS_DURATION, typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            Field field2 = divScaleTransitionTemplate.interpolator;
            TypeHelper typeHelper2 = DivScaleTransitionJsonParser.TYPE_HELPER_INTERPOLATOR;
            Function1 function12 = DivAnimationInterpolator.FROM_STRING;
            Expression expression2 = DivScaleTransitionJsonParser.INTERPOLATOR_DEFAULT_VALUE;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "interpolator", typeHelper2, function12, expression2);
            if (resolveOptionalExpression2 != null) {
                expression2 = resolveOptionalExpression2;
            }
            Field field3 = divScaleTransitionTemplate.pivotX;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator2 = DivScaleTransitionJsonParser.PIVOT_X_VALIDATOR;
            Expression expression3 = DivScaleTransitionJsonParser.PIVOT_X_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "pivot_x", typeHelper3, function13, valueValidator2, expression3);
            if (resolveOptionalExpression3 == null) {
                resolveOptionalExpression3 = expression3;
            }
            Field field4 = divScaleTransitionTemplate.pivotY;
            ValueValidator valueValidator3 = DivScaleTransitionJsonParser.PIVOT_Y_VALIDATOR;
            Expression expression4 = DivScaleTransitionJsonParser.PIVOT_Y_DEFAULT_VALUE;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "pivot_y", typeHelper3, function13, valueValidator3, expression4);
            if (resolveOptionalExpression4 != null) {
                expression4 = resolveOptionalExpression4;
            }
            Field field5 = divScaleTransitionTemplate.scale;
            ValueValidator valueValidator4 = DivScaleTransitionJsonParser.SCALE_VALIDATOR;
            Expression expression5 = DivScaleTransitionJsonParser.SCALE_DEFAULT_VALUE;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "scale", typeHelper3, function13, valueValidator4, expression5);
            if (resolveOptionalExpression5 == null) {
                resolveOptionalExpression5 = expression5;
            }
            Field field6 = divScaleTransitionTemplate.startDelay;
            ValueValidator valueValidator5 = DivScaleTransitionJsonParser.START_DELAY_VALIDATOR;
            Expression expression6 = DivScaleTransitionJsonParser.START_DELAY_DEFAULT_VALUE;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field6, jSONObject, "start_delay", typeHelper, function1, valueValidator5, expression6);
            return new DivScaleTransition(expression, expression2, resolveOptionalExpression3, expression4, resolveOptionalExpression5, resolveOptionalExpression6 == null ? expression6 : resolveOptionalExpression6);
        }
    }

    /* compiled from: DivScaleTransitionJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        DURATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.EASE_IN_OUT;
        INTERPOLATOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divAnimationInterpolator, null, 2, null);
        Double valueOf = Double.valueOf(0.5d);
        PIVOT_X_DEFAULT_VALUE = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        PIVOT_Y_DEFAULT_VALUE = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        SCALE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        START_DELAY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        TYPE_HELPER_INTERPOLATOR = TypeHelper.INSTANCE.from(divAnimationInterpolator, new Function1() { // from class: com.yandex.div2.DivScaleTransitionJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
            }
        });
        DURATION_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivScaleTransitionJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean DURATION_VALIDATOR$lambda$0;
                DURATION_VALIDATOR$lambda$0 = DivScaleTransitionJsonParser.DURATION_VALIDATOR$lambda$0(((Long) obj).longValue());
                return DURATION_VALIDATOR$lambda$0;
            }
        };
        PIVOT_X_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivScaleTransitionJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean PIVOT_X_VALIDATOR$lambda$1;
                PIVOT_X_VALIDATOR$lambda$1 = DivScaleTransitionJsonParser.PIVOT_X_VALIDATOR$lambda$1(((Double) obj).doubleValue());
                return PIVOT_X_VALIDATOR$lambda$1;
            }
        };
        PIVOT_Y_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivScaleTransitionJsonParser$$ExternalSyntheticLambda2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean PIVOT_Y_VALIDATOR$lambda$2;
                PIVOT_Y_VALIDATOR$lambda$2 = DivScaleTransitionJsonParser.PIVOT_Y_VALIDATOR$lambda$2(((Double) obj).doubleValue());
                return PIVOT_Y_VALIDATOR$lambda$2;
            }
        };
        SCALE_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivScaleTransitionJsonParser$$ExternalSyntheticLambda3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean SCALE_VALIDATOR$lambda$3;
                SCALE_VALIDATOR$lambda$3 = DivScaleTransitionJsonParser.SCALE_VALIDATOR$lambda$3(((Double) obj).doubleValue());
                return SCALE_VALIDATOR$lambda$3;
            }
        };
        START_DELAY_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivScaleTransitionJsonParser$$ExternalSyntheticLambda4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean START_DELAY_VALIDATOR$lambda$4;
                START_DELAY_VALIDATOR$lambda$4 = DivScaleTransitionJsonParser.START_DELAY_VALIDATOR$lambda$4(((Long) obj).longValue());
                return START_DELAY_VALIDATOR$lambda$4;
            }
        };
    }
}
