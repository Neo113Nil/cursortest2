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

/* compiled from: DivChangeBoundsTransitionJsonParser.kt */
/* loaded from: classes13.dex */
public abstract class DivChangeBoundsTransitionJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final Expression DURATION_DEFAULT_VALUE;
    public static final ValueValidator DURATION_VALIDATOR;
    public static final Expression INTERPOLATOR_DEFAULT_VALUE;
    public static final Expression START_DELAY_DEFAULT_VALUE;
    public static final ValueValidator START_DELAY_VALIDATOR;
    public static final TypeHelper TYPE_HELPER_INTERPOLATOR;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DURATION_VALIDATOR$lambda$0(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean START_DELAY_VALIDATOR$lambda$1(long j) {
        return j >= 0;
    }

    /* compiled from: DivChangeBoundsTransitionJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivChangeBoundsTransition deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = DivChangeBoundsTransitionJsonParser.DURATION_VALIDATOR;
            Expression expression = DivChangeBoundsTransitionJsonParser.DURATION_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, IronSourceConstants.EVENTS_DURATION, typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            TypeHelper typeHelper2 = DivChangeBoundsTransitionJsonParser.TYPE_HELPER_INTERPOLATOR;
            Function1 function12 = DivAnimationInterpolator.FROM_STRING;
            Expression expression2 = DivChangeBoundsTransitionJsonParser.INTERPOLATOR_DEFAULT_VALUE;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper2, function12, expression2);
            Expression expression3 = readOptionalExpression2 == null ? expression2 : readOptionalExpression2;
            ValueValidator valueValidator2 = DivChangeBoundsTransitionJsonParser.START_DELAY_VALIDATOR;
            Expression expression4 = DivChangeBoundsTransitionJsonParser.START_DELAY_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper, function1, valueValidator2, expression4);
            if (readOptionalExpression3 != null) {
                expression4 = readOptionalExpression3;
            }
            return new DivChangeBoundsTransition(expression, expression3, expression4);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivChangeBoundsTransition divChangeBoundsTransition) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, IronSourceConstants.EVENTS_DURATION, divChangeBoundsTransition.getDuration());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", divChangeBoundsTransition.getInterpolator(), DivAnimationInterpolator.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", divChangeBoundsTransition.getStartDelay());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "change_bounds");
            return jSONObject;
        }
    }

    /* compiled from: DivChangeBoundsTransitionJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivChangeBoundsTransitionTemplate deserialize(ParsingContext parsingContext, DivChangeBoundsTransitionTemplate divChangeBoundsTransitionTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = divChangeBoundsTransitionTemplate != null ? divChangeBoundsTransitionTemplate.duration : null;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivChangeBoundsTransitionTemplate(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, IronSourceConstants.EVENTS_DURATION, typeHelper, allowPropertyOverride, field, function1, DivChangeBoundsTransitionJsonParser.DURATION_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "interpolator", DivChangeBoundsTransitionJsonParser.TYPE_HELPER_INTERPOLATOR, allowPropertyOverride, divChangeBoundsTransitionTemplate != null ? divChangeBoundsTransitionTemplate.interpolator : null, DivAnimationInterpolator.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, divChangeBoundsTransitionTemplate != null ? divChangeBoundsTransitionTemplate.startDelay : null, function1, DivChangeBoundsTransitionJsonParser.START_DELAY_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivChangeBoundsTransitionTemplate divChangeBoundsTransitionTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, IronSourceConstants.EVENTS_DURATION, divChangeBoundsTransitionTemplate.duration);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", divChangeBoundsTransitionTemplate.interpolator, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", divChangeBoundsTransitionTemplate.startDelay);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "change_bounds");
            return jSONObject;
        }
    }

    /* compiled from: DivChangeBoundsTransitionJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivChangeBoundsTransition resolve(ParsingContext parsingContext, DivChangeBoundsTransitionTemplate divChangeBoundsTransitionTemplate, JSONObject jSONObject) {
            Field field = divChangeBoundsTransitionTemplate.duration;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = DivChangeBoundsTransitionJsonParser.DURATION_VALIDATOR;
            Expression expression = DivChangeBoundsTransitionJsonParser.DURATION_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, IronSourceConstants.EVENTS_DURATION, typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            Field field2 = divChangeBoundsTransitionTemplate.interpolator;
            TypeHelper typeHelper2 = DivChangeBoundsTransitionJsonParser.TYPE_HELPER_INTERPOLATOR;
            Function1 function12 = DivAnimationInterpolator.FROM_STRING;
            Expression expression2 = DivChangeBoundsTransitionJsonParser.INTERPOLATOR_DEFAULT_VALUE;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "interpolator", typeHelper2, function12, expression2);
            if (resolveOptionalExpression2 == null) {
                resolveOptionalExpression2 = expression2;
            }
            Field field3 = divChangeBoundsTransitionTemplate.startDelay;
            ValueValidator valueValidator2 = DivChangeBoundsTransitionJsonParser.START_DELAY_VALIDATOR;
            Expression expression3 = DivChangeBoundsTransitionJsonParser.START_DELAY_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "start_delay", typeHelper, function1, valueValidator2, expression3);
            if (resolveOptionalExpression3 != null) {
                expression3 = resolveOptionalExpression3;
            }
            return new DivChangeBoundsTransition(expression, resolveOptionalExpression2, expression3);
        }
    }

    /* compiled from: DivChangeBoundsTransitionJsonParser.kt */
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
        START_DELAY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        TYPE_HELPER_INTERPOLATOR = TypeHelper.INSTANCE.from(divAnimationInterpolator, new Function1() { // from class: com.yandex.div2.DivChangeBoundsTransitionJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
            }
        });
        DURATION_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivChangeBoundsTransitionJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean DURATION_VALIDATOR$lambda$0;
                DURATION_VALIDATOR$lambda$0 = DivChangeBoundsTransitionJsonParser.DURATION_VALIDATOR$lambda$0(((Long) obj).longValue());
                return DURATION_VALIDATOR$lambda$0;
            }
        };
        START_DELAY_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivChangeBoundsTransitionJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean START_DELAY_VALIDATOR$lambda$1;
                START_DELAY_VALIDATOR$lambda$1 = DivChangeBoundsTransitionJsonParser.START_DELAY_VALIDATOR$lambda$1(((Long) obj).longValue());
                return START_DELAY_VALIDATOR$lambda$1;
            }
        };
    }
}
