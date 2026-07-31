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
import com.yandex.div2.DivSlideTransition;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivSlideTransitionJsonParser.kt */
/* loaded from: classes11.dex */
public abstract class DivSlideTransitionJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final Expression DURATION_DEFAULT_VALUE;
    public static final ValueValidator DURATION_VALIDATOR;
    public static final Expression EDGE_DEFAULT_VALUE;
    public static final Expression INTERPOLATOR_DEFAULT_VALUE;
    public static final Expression START_DELAY_DEFAULT_VALUE;
    public static final ValueValidator START_DELAY_VALIDATOR;
    public static final TypeHelper TYPE_HELPER_EDGE;
    public static final TypeHelper TYPE_HELPER_INTERPOLATOR;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DURATION_VALIDATOR$lambda$0(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean START_DELAY_VALIDATOR$lambda$1(long j) {
        return j >= 0;
    }

    /* compiled from: DivSlideTransitionJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivSlideTransition deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            DivDimension divDimension = (DivDimension) JsonPropertyParser.readOptional(parsingContext, jSONObject, "distance", this.component.getDivDimensionJsonEntityParser());
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = DivSlideTransitionJsonParser.DURATION_VALIDATOR;
            Expression expression = DivSlideTransitionJsonParser.DURATION_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, IronSourceConstants.EVENTS_DURATION, typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            TypeHelper typeHelper2 = DivSlideTransitionJsonParser.TYPE_HELPER_EDGE;
            Function1 function12 = DivSlideTransition.Edge.FROM_STRING;
            Expression expression2 = DivSlideTransitionJsonParser.EDGE_DEFAULT_VALUE;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "edge", typeHelper2, function12, expression2);
            Expression expression3 = readOptionalExpression2 == null ? expression2 : readOptionalExpression2;
            TypeHelper typeHelper3 = DivSlideTransitionJsonParser.TYPE_HELPER_INTERPOLATOR;
            Function1 function13 = DivAnimationInterpolator.FROM_STRING;
            Expression expression4 = DivSlideTransitionJsonParser.INTERPOLATOR_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper3, function13, expression4);
            Expression expression5 = readOptionalExpression3 == null ? expression4 : readOptionalExpression3;
            ValueValidator valueValidator2 = DivSlideTransitionJsonParser.START_DELAY_VALIDATOR;
            Expression expression6 = DivSlideTransitionJsonParser.START_DELAY_DEFAULT_VALUE;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper, function1, valueValidator2, expression6);
            if (readOptionalExpression4 != null) {
                expression6 = readOptionalExpression4;
            }
            return new DivSlideTransition(divDimension, expression, expression3, expression5, expression6);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivSlideTransition divSlideTransition) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "distance", divSlideTransition.distance, this.component.getDivDimensionJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, IronSourceConstants.EVENTS_DURATION, divSlideTransition.getDuration());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "edge", divSlideTransition.edge, DivSlideTransition.Edge.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", divSlideTransition.getInterpolator(), DivAnimationInterpolator.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", divSlideTransition.getStartDelay());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "slide");
            return jSONObject;
        }
    }

    /* compiled from: DivSlideTransitionJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivSlideTransitionTemplate deserialize(ParsingContext parsingContext, DivSlideTransitionTemplate divSlideTransitionTemplate, JSONObject jSONObject) {
            TemplateParserImpl templateParserImpl;
            Field field;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            if (divSlideTransitionTemplate != null) {
                templateParserImpl = this;
                field = divSlideTransitionTemplate.distance;
            } else {
                templateParserImpl = this;
                field = null;
            }
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "distance", allowPropertyOverride, field, templateParserImpl.component.getDivDimensionJsonTemplateParser());
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field2 = divSlideTransitionTemplate != null ? divSlideTransitionTemplate.duration : null;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivSlideTransitionTemplate(readOptionalField, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, IronSourceConstants.EVENTS_DURATION, typeHelper, allowPropertyOverride, field2, function1, DivSlideTransitionJsonParser.DURATION_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "edge", DivSlideTransitionJsonParser.TYPE_HELPER_EDGE, allowPropertyOverride, divSlideTransitionTemplate != null ? divSlideTransitionTemplate.edge : null, DivSlideTransition.Edge.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "interpolator", DivSlideTransitionJsonParser.TYPE_HELPER_INTERPOLATOR, allowPropertyOverride, divSlideTransitionTemplate != null ? divSlideTransitionTemplate.interpolator : null, DivAnimationInterpolator.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, divSlideTransitionTemplate != null ? divSlideTransitionTemplate.startDelay : null, function1, DivSlideTransitionJsonParser.START_DELAY_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivSlideTransitionTemplate divSlideTransitionTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "distance", divSlideTransitionTemplate.distance, this.component.getDivDimensionJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, IronSourceConstants.EVENTS_DURATION, divSlideTransitionTemplate.duration);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "edge", divSlideTransitionTemplate.edge, DivSlideTransition.Edge.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", divSlideTransitionTemplate.interpolator, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", divSlideTransitionTemplate.startDelay);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "slide");
            return jSONObject;
        }
    }

    /* compiled from: DivSlideTransitionJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivSlideTransition resolve(ParsingContext parsingContext, DivSlideTransitionTemplate divSlideTransitionTemplate, JSONObject jSONObject) {
            DivDimension divDimension = (DivDimension) JsonFieldResolver.resolveOptional(parsingContext, divSlideTransitionTemplate.distance, jSONObject, "distance", this.component.getDivDimensionJsonTemplateResolver(), this.component.getDivDimensionJsonEntityParser());
            Field field = divSlideTransitionTemplate.duration;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = DivSlideTransitionJsonParser.DURATION_VALIDATOR;
            Expression expression = DivSlideTransitionJsonParser.DURATION_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, IronSourceConstants.EVENTS_DURATION, typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            Field field2 = divSlideTransitionTemplate.edge;
            TypeHelper typeHelper2 = DivSlideTransitionJsonParser.TYPE_HELPER_EDGE;
            Function1 function12 = DivSlideTransition.Edge.FROM_STRING;
            Expression expression2 = DivSlideTransitionJsonParser.EDGE_DEFAULT_VALUE;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "edge", typeHelper2, function12, expression2);
            if (resolveOptionalExpression2 != null) {
                expression2 = resolveOptionalExpression2;
            }
            Field field3 = divSlideTransitionTemplate.interpolator;
            TypeHelper typeHelper3 = DivSlideTransitionJsonParser.TYPE_HELPER_INTERPOLATOR;
            Function1 function13 = DivAnimationInterpolator.FROM_STRING;
            Expression expression3 = DivSlideTransitionJsonParser.INTERPOLATOR_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "interpolator", typeHelper3, function13, expression3);
            if (resolveOptionalExpression3 == null) {
                resolveOptionalExpression3 = expression3;
            }
            Field field4 = divSlideTransitionTemplate.startDelay;
            ValueValidator valueValidator2 = DivSlideTransitionJsonParser.START_DELAY_VALIDATOR;
            Expression expression4 = DivSlideTransitionJsonParser.START_DELAY_DEFAULT_VALUE;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "start_delay", typeHelper, function1, valueValidator2, expression4);
            return new DivSlideTransition(divDimension, expression, expression2, resolveOptionalExpression3, resolveOptionalExpression4 == null ? expression4 : resolveOptionalExpression4);
        }
    }

    /* compiled from: DivSlideTransitionJsonParser.kt */
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
        DivSlideTransition.Edge edge = DivSlideTransition.Edge.BOTTOM;
        EDGE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, edge, null, 2, null);
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.EASE_IN_OUT;
        INTERPOLATOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divAnimationInterpolator, null, 2, null);
        START_DELAY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        TYPE_HELPER_EDGE = companion2.from(edge, new Function1() { // from class: com.yandex.div2.DivSlideTransitionJsonParser$Companion$TYPE_HELPER_EDGE$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivSlideTransition.Edge);
            }
        });
        TYPE_HELPER_INTERPOLATOR = companion2.from(divAnimationInterpolator, new Function1() { // from class: com.yandex.div2.DivSlideTransitionJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
            }
        });
        DURATION_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivSlideTransitionJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean DURATION_VALIDATOR$lambda$0;
                DURATION_VALIDATOR$lambda$0 = DivSlideTransitionJsonParser.DURATION_VALIDATOR$lambda$0(((Long) obj).longValue());
                return DURATION_VALIDATOR$lambda$0;
            }
        };
        START_DELAY_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivSlideTransitionJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean START_DELAY_VALIDATOR$lambda$1;
                START_DELAY_VALIDATOR$lambda$1 = DivSlideTransitionJsonParser.START_DELAY_VALIDATOR$lambda$1(((Long) obj).longValue());
                return START_DELAY_VALIDATOR$lambda$1;
            }
        };
    }
}
