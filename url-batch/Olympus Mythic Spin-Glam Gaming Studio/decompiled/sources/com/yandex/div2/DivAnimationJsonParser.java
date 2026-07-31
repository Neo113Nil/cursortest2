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
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivCount;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivAnimationJsonParser.kt */
/* loaded from: classes8.dex */
public abstract class DivAnimationJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final Expression DURATION_DEFAULT_VALUE;
    public static final ValueValidator DURATION_VALIDATOR;
    public static final Expression INTERPOLATOR_DEFAULT_VALUE;
    public static final DivCount.Infinity REPEAT_DEFAULT_VALUE;
    public static final Expression START_DELAY_DEFAULT_VALUE;
    public static final ValueValidator START_DELAY_VALIDATOR;
    public static final TypeHelper TYPE_HELPER_INTERPOLATOR;
    public static final TypeHelper TYPE_HELPER_NAME;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DURATION_VALIDATOR$lambda$0(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean START_DELAY_VALIDATOR$lambda$1(long j) {
        return j >= 0;
    }

    /* compiled from: DivAnimationJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivAnimation deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = DivAnimationJsonParser.DURATION_VALIDATOR;
            Expression expression = DivAnimationJsonParser.DURATION_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, IronSourceConstants.EVENTS_DURATION, typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "end_value", typeHelper2, function12);
            TypeHelper typeHelper3 = DivAnimationJsonParser.TYPE_HELPER_INTERPOLATOR;
            Function1 function13 = DivAnimationInterpolator.FROM_STRING;
            Expression expression2 = DivAnimationJsonParser.INTERPOLATOR_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper3, function13, expression2);
            Expression expression3 = readOptionalExpression3 == null ? expression2 : readOptionalExpression3;
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "items", this.component.getDivAnimationJsonEntityParser());
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "name", DivAnimationJsonParser.TYPE_HELPER_NAME, DivAnimation.Name.FROM_STRING);
            DivCount divCount = (DivCount) JsonPropertyParser.readOptional(parsingContext, jSONObject, "repeat", this.component.getDivCountJsonEntityParser());
            if (divCount == null) {
                divCount = DivAnimationJsonParser.REPEAT_DEFAULT_VALUE;
            }
            DivCount divCount2 = divCount;
            ValueValidator valueValidator2 = DivAnimationJsonParser.START_DELAY_VALIDATOR;
            Expression expression4 = DivAnimationJsonParser.START_DELAY_DEFAULT_VALUE;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper, function1, valueValidator2, expression4);
            if (readOptionalExpression4 != null) {
                expression4 = readOptionalExpression4;
            }
            return new DivAnimation(expression, readOptionalExpression2, expression3, readOptionalList, readExpression, divCount2, expression4, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_value", typeHelper2, function12));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivAnimation divAnimation) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, IronSourceConstants.EVENTS_DURATION, divAnimation.duration);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "end_value", divAnimation.endValue);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", divAnimation.interpolator, DivAnimationInterpolator.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", divAnimation.items, this.component.getDivAnimationJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "name", divAnimation.name, DivAnimation.Name.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "repeat", divAnimation.repeat, this.component.getDivCountJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", divAnimation.startDelay);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_value", divAnimation.startValue);
            return jSONObject;
        }
    }

    /* compiled from: DivAnimationJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivAnimationTemplate deserialize(ParsingContext parsingContext, DivAnimationTemplate divAnimationTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = divAnimationTemplate != null ? divAnimationTemplate.duration : null;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, IronSourceConstants.EVENTS_DURATION, typeHelper, allowPropertyOverride, field, function1, DivAnimationJsonParser.DURATION_VALIDATOR);
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field field2 = divAnimationTemplate != null ? divAnimationTemplate.endValue : null;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            return new DivAnimationTemplate(readOptionalFieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "end_value", typeHelper2, allowPropertyOverride, field2, function12), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "interpolator", DivAnimationJsonParser.TYPE_HELPER_INTERPOLATOR, allowPropertyOverride, divAnimationTemplate != null ? divAnimationTemplate.interpolator : null, DivAnimationInterpolator.FROM_STRING), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "items", allowPropertyOverride, divAnimationTemplate != null ? divAnimationTemplate.items : null, this.component.getDivAnimationJsonTemplateParser()), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "name", DivAnimationJsonParser.TYPE_HELPER_NAME, allowPropertyOverride, divAnimationTemplate != null ? divAnimationTemplate.name : null, DivAnimation.Name.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "repeat", allowPropertyOverride, divAnimationTemplate != null ? divAnimationTemplate.repeat : null, this.component.getDivCountJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, divAnimationTemplate != null ? divAnimationTemplate.startDelay : null, function1, DivAnimationJsonParser.START_DELAY_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "start_value", typeHelper2, allowPropertyOverride, divAnimationTemplate != null ? divAnimationTemplate.startValue : null, function12));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivAnimationTemplate divAnimationTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, IronSourceConstants.EVENTS_DURATION, divAnimationTemplate.duration);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "end_value", divAnimationTemplate.endValue);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", divAnimationTemplate.interpolator, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", divAnimationTemplate.items, this.component.getDivAnimationJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "name", divAnimationTemplate.name, DivAnimation.Name.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "repeat", divAnimationTemplate.repeat, this.component.getDivCountJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", divAnimationTemplate.startDelay);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_value", divAnimationTemplate.startValue);
            return jSONObject;
        }
    }

    /* compiled from: DivAnimationJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivAnimation resolve(ParsingContext parsingContext, DivAnimationTemplate divAnimationTemplate, JSONObject jSONObject) {
            Field field = divAnimationTemplate.duration;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = DivAnimationJsonParser.DURATION_VALIDATOR;
            Expression expression = DivAnimationJsonParser.DURATION_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, IronSourceConstants.EVENTS_DURATION, typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression == null) {
                resolveOptionalExpression = expression;
            }
            Field field2 = divAnimationTemplate.endValue;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "end_value", typeHelper2, function12);
            Field field3 = divAnimationTemplate.interpolator;
            TypeHelper typeHelper3 = DivAnimationJsonParser.TYPE_HELPER_INTERPOLATOR;
            Function1 function13 = DivAnimationInterpolator.FROM_STRING;
            Expression expression2 = DivAnimationJsonParser.INTERPOLATOR_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "interpolator", typeHelper3, function13, expression2);
            if (resolveOptionalExpression3 == null) {
                resolveOptionalExpression3 = expression2;
            }
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divAnimationTemplate.items, jSONObject, "items", this.component.getDivAnimationJsonTemplateResolver(), this.component.getDivAnimationJsonEntityParser());
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divAnimationTemplate.name, jSONObject, "name", DivAnimationJsonParser.TYPE_HELPER_NAME, DivAnimation.Name.FROM_STRING);
            DivCount divCount = (DivCount) JsonFieldResolver.resolveOptional(parsingContext, divAnimationTemplate.repeat, jSONObject, "repeat", this.component.getDivCountJsonTemplateResolver(), this.component.getDivCountJsonEntityParser());
            if (divCount == null) {
                divCount = DivAnimationJsonParser.REPEAT_DEFAULT_VALUE;
            }
            Field field4 = divAnimationTemplate.startDelay;
            ValueValidator valueValidator2 = DivAnimationJsonParser.START_DELAY_VALIDATOR;
            Expression expression3 = DivAnimationJsonParser.START_DELAY_DEFAULT_VALUE;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "start_delay", typeHelper, function1, valueValidator2, expression3);
            if (resolveOptionalExpression4 != null) {
                expression3 = resolveOptionalExpression4;
            }
            return new DivAnimation(resolveOptionalExpression, resolveOptionalExpression2, resolveOptionalExpression3, resolveOptionalList, resolveExpression, divCount, expression3, JsonFieldResolver.resolveOptionalExpression(parsingContext, divAnimationTemplate.startValue, jSONObject, "start_value", typeHelper2, function12));
        }
    }

    /* compiled from: DivAnimationJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        DURATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 300L, null, 2, null);
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.SPRING;
        INTERPOLATOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divAnimationInterpolator, null, 2, null);
        REPEAT_DEFAULT_VALUE = new DivCount.Infinity(new DivInfinityCount());
        START_DELAY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        TYPE_HELPER_INTERPOLATOR = companion2.from(divAnimationInterpolator, new Function1() { // from class: com.yandex.div2.DivAnimationJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
            }
        });
        TYPE_HELPER_NAME = companion2.from(ArraysKt.first(DivAnimation.Name.values()), new Function1() { // from class: com.yandex.div2.DivAnimationJsonParser$Companion$TYPE_HELPER_NAME$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimation.Name);
            }
        });
        DURATION_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivAnimationJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean DURATION_VALIDATOR$lambda$0;
                DURATION_VALIDATOR$lambda$0 = DivAnimationJsonParser.DURATION_VALIDATOR$lambda$0(((Long) obj).longValue());
                return DURATION_VALIDATOR$lambda$0;
            }
        };
        START_DELAY_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivAnimationJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean START_DELAY_VALIDATOR$lambda$1;
                START_DELAY_VALIDATOR$lambda$1 = DivAnimationJsonParser.START_DELAY_VALIDATOR$lambda$1(((Long) obj).longValue());
                return START_DELAY_VALIDATOR$lambda$1;
            }
        };
    }
}
