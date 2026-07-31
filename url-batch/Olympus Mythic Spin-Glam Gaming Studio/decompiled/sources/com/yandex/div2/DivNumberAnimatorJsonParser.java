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
import com.yandex.div2.DivCount;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivNumberAnimatorJsonParser.kt */
/* loaded from: classes13.dex */
public abstract class DivNumberAnimatorJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final Expression DIRECTION_DEFAULT_VALUE;
    public static final ValueValidator DURATION_VALIDATOR;
    public static final Expression INTERPOLATOR_DEFAULT_VALUE;
    public static final DivCount.Fixed REPEAT_COUNT_DEFAULT_VALUE;
    public static final Expression START_DELAY_DEFAULT_VALUE;
    public static final ValueValidator START_DELAY_VALIDATOR;
    public static final TypeHelper TYPE_HELPER_DIRECTION;
    public static final TypeHelper TYPE_HELPER_INTERPOLATOR;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DURATION_VALIDATOR$lambda$0(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean START_DELAY_VALIDATOR$lambda$1(long j) {
        return j >= 0;
    }

    /* compiled from: DivNumberAnimatorJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivNumberAnimator deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "cancel_actions", this.component.getDivActionJsonEntityParser());
            TypeHelper typeHelper = DivNumberAnimatorJsonParser.TYPE_HELPER_DIRECTION;
            Function1 function1 = DivAnimationDirection.FROM_STRING;
            Expression expression = DivNumberAnimatorJsonParser.DIRECTION_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "direction", typeHelper, function1, expression);
            Expression expression2 = readOptionalExpression == null ? expression : readOptionalExpression;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, IronSourceConstants.EVENTS_DURATION, typeHelper2, function12, DivNumberAnimatorJsonParser.DURATION_VALIDATOR);
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "end_actions", this.component.getDivActionJsonEntityParser());
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression readExpression2 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "end_value", typeHelper3, function13);
            String str = (String) JsonPropertyParser.read(parsingContext, jSONObject, "id");
            TypeHelper typeHelper4 = DivNumberAnimatorJsonParser.TYPE_HELPER_INTERPOLATOR;
            Function1 function14 = DivAnimationInterpolator.FROM_STRING;
            Expression expression3 = DivNumberAnimatorJsonParser.INTERPOLATOR_DEFAULT_VALUE;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper4, function14, expression3);
            if (readOptionalExpression2 != null) {
                expression3 = readOptionalExpression2;
            }
            DivCount divCount = (DivCount) JsonPropertyParser.readOptional(parsingContext, jSONObject, "repeat_count", this.component.getDivCountJsonEntityParser());
            if (divCount == null) {
                divCount = DivNumberAnimatorJsonParser.REPEAT_COUNT_DEFAULT_VALUE;
            }
            DivCount divCount2 = divCount;
            ValueValidator valueValidator = DivNumberAnimatorJsonParser.START_DELAY_VALIDATOR;
            Expression expression4 = DivNumberAnimatorJsonParser.START_DELAY_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper2, function12, valueValidator, expression4);
            if (readOptionalExpression3 != null) {
                expression4 = readOptionalExpression3;
            }
            return new DivNumberAnimator(readOptionalList, expression2, readExpression, readOptionalList2, readExpression2, str, expression3, divCount2, expression4, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_value", typeHelper3, function13), (String) JsonPropertyParser.read(parsingContext, jSONObject, "variable_name"));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivNumberAnimator divNumberAnimator) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "cancel_actions", divNumberAnimator.getCancelActions(), this.component.getDivActionJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "direction", divNumberAnimator.getDirection(), DivAnimationDirection.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, IronSourceConstants.EVENTS_DURATION, divNumberAnimator.getDuration());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "end_actions", divNumberAnimator.getEndActions(), this.component.getDivActionJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "end_value", divNumberAnimator.endValue);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divNumberAnimator.getId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", divNumberAnimator.getInterpolator(), DivAnimationInterpolator.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "repeat_count", divNumberAnimator.getRepeatCount(), this.component.getDivCountJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", divNumberAnimator.getStartDelay());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_value", divNumberAnimator.startValue);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "number_animator");
            JsonPropertyParser.write(parsingContext, jSONObject, "variable_name", divNumberAnimator.getVariableName());
            return jSONObject;
        }
    }

    /* compiled from: DivNumberAnimatorJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivNumberAnimatorTemplate deserialize(ParsingContext parsingContext, DivNumberAnimatorTemplate divNumberAnimatorTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "cancel_actions", allowPropertyOverride, divNumberAnimatorTemplate != null ? divNumberAnimatorTemplate.cancelActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "direction", DivNumberAnimatorJsonParser.TYPE_HELPER_DIRECTION, allowPropertyOverride, divNumberAnimatorTemplate != null ? divNumberAnimatorTemplate.direction : null, DivAnimationDirection.FROM_STRING);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = divNumberAnimatorTemplate != null ? divNumberAnimatorTemplate.duration : null;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, IronSourceConstants.EVENTS_DURATION, typeHelper, allowPropertyOverride, field, function1, DivNumberAnimatorJsonParser.DURATION_VALIDATOR);
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "end_actions", allowPropertyOverride, divNumberAnimatorTemplate != null ? divNumberAnimatorTemplate.endActions : null, this.component.getDivActionJsonTemplateParser());
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Field field2 = divNumberAnimatorTemplate != null ? divNumberAnimatorTemplate.endValue : null;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            return new DivNumberAnimatorTemplate(readOptionalListField, readOptionalFieldWithExpression, readFieldWithExpression, readOptionalListField2, JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "end_value", typeHelper2, allowPropertyOverride, field2, function12), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divNumberAnimatorTemplate != null ? divNumberAnimatorTemplate.id : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "interpolator", DivNumberAnimatorJsonParser.TYPE_HELPER_INTERPOLATOR, allowPropertyOverride, divNumberAnimatorTemplate != null ? divNumberAnimatorTemplate.interpolator : null, DivAnimationInterpolator.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "repeat_count", allowPropertyOverride, divNumberAnimatorTemplate != null ? divNumberAnimatorTemplate.repeatCount : null, this.component.getDivCountJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, divNumberAnimatorTemplate != null ? divNumberAnimatorTemplate.startDelay : null, function1, DivNumberAnimatorJsonParser.START_DELAY_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "start_value", typeHelper2, allowPropertyOverride, divNumberAnimatorTemplate != null ? divNumberAnimatorTemplate.startValue : null, function12), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "variable_name", allowPropertyOverride, divNumberAnimatorTemplate != null ? divNumberAnimatorTemplate.variableName : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivNumberAnimatorTemplate divNumberAnimatorTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "cancel_actions", divNumberAnimatorTemplate.cancelActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "direction", divNumberAnimatorTemplate.direction, DivAnimationDirection.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, IronSourceConstants.EVENTS_DURATION, divNumberAnimatorTemplate.duration);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "end_actions", divNumberAnimatorTemplate.endActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "end_value", divNumberAnimatorTemplate.endValue);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divNumberAnimatorTemplate.id);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", divNumberAnimatorTemplate.interpolator, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "repeat_count", divNumberAnimatorTemplate.repeatCount, this.component.getDivCountJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", divNumberAnimatorTemplate.startDelay);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_value", divNumberAnimatorTemplate.startValue);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "number_animator");
            JsonFieldParser.writeField(parsingContext, jSONObject, "variable_name", divNumberAnimatorTemplate.variableName);
            return jSONObject;
        }
    }

    /* compiled from: DivNumberAnimatorJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivNumberAnimator resolve(ParsingContext parsingContext, DivNumberAnimatorTemplate divNumberAnimatorTemplate, JSONObject jSONObject) {
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divNumberAnimatorTemplate.cancelActions, jSONObject, "cancel_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            Field field = divNumberAnimatorTemplate.direction;
            TypeHelper typeHelper = DivNumberAnimatorJsonParser.TYPE_HELPER_DIRECTION;
            Function1 function1 = DivAnimationDirection.FROM_STRING;
            Expression expression = DivNumberAnimatorJsonParser.DIRECTION_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "direction", typeHelper, function1, expression);
            Expression expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            Field field2 = divNumberAnimatorTemplate.duration;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, field2, jSONObject, IronSourceConstants.EVENTS_DURATION, typeHelper2, function12, DivNumberAnimatorJsonParser.DURATION_VALIDATOR);
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divNumberAnimatorTemplate.endActions, jSONObject, "end_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            Field field3 = divNumberAnimatorTemplate.endValue;
            TypeHelper<Double> typeHelper3 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function13 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            Expression resolveExpression2 = JsonFieldResolver.resolveExpression(parsingContext, field3, jSONObject, "end_value", typeHelper3, function13);
            String str = (String) JsonFieldResolver.resolve(parsingContext, divNumberAnimatorTemplate.id, jSONObject, "id");
            Field field4 = divNumberAnimatorTemplate.interpolator;
            TypeHelper typeHelper4 = DivNumberAnimatorJsonParser.TYPE_HELPER_INTERPOLATOR;
            Function1 function14 = DivAnimationInterpolator.FROM_STRING;
            Expression expression3 = DivNumberAnimatorJsonParser.INTERPOLATOR_DEFAULT_VALUE;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "interpolator", typeHelper4, function14, expression3);
            if (resolveOptionalExpression2 != null) {
                expression3 = resolveOptionalExpression2;
            }
            DivCount divCount = (DivCount) JsonFieldResolver.resolveOptional(parsingContext, divNumberAnimatorTemplate.repeatCount, jSONObject, "repeat_count", this.component.getDivCountJsonTemplateResolver(), this.component.getDivCountJsonEntityParser());
            if (divCount == null) {
                divCount = DivNumberAnimatorJsonParser.REPEAT_COUNT_DEFAULT_VALUE;
            }
            DivCount divCount2 = divCount;
            Field field5 = divNumberAnimatorTemplate.startDelay;
            ValueValidator valueValidator = DivNumberAnimatorJsonParser.START_DELAY_VALIDATOR;
            Expression expression4 = DivNumberAnimatorJsonParser.START_DELAY_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "start_delay", typeHelper2, function12, valueValidator, expression4);
            if (resolveOptionalExpression3 != null) {
                expression4 = resolveOptionalExpression3;
            }
            return new DivNumberAnimator(resolveOptionalList, expression2, resolveExpression, resolveOptionalList2, resolveExpression2, str, expression3, divCount2, expression4, JsonFieldResolver.resolveOptionalExpression(parsingContext, divNumberAnimatorTemplate.startValue, jSONObject, "start_value", typeHelper3, function13), (String) JsonFieldResolver.resolve(parsingContext, divNumberAnimatorTemplate.variableName, jSONObject, "variable_name"));
        }
    }

    /* compiled from: DivNumberAnimatorJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        DivAnimationDirection divAnimationDirection = DivAnimationDirection.NORMAL;
        DIRECTION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divAnimationDirection, null, 2, null);
        DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.LINEAR;
        INTERPOLATOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divAnimationInterpolator, null, 2, null);
        REPEAT_COUNT_DEFAULT_VALUE = new DivCount.Fixed(new DivFixedCount(Expression.Companion.constant$default(companion, 1L, null, 2, null)));
        START_DELAY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        TYPE_HELPER_DIRECTION = companion2.from(divAnimationDirection, new Function1() { // from class: com.yandex.div2.DivNumberAnimatorJsonParser$Companion$TYPE_HELPER_DIRECTION$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationDirection);
            }
        });
        TYPE_HELPER_INTERPOLATOR = companion2.from(divAnimationInterpolator, new Function1() { // from class: com.yandex.div2.DivNumberAnimatorJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
            }
        });
        DURATION_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivNumberAnimatorJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean DURATION_VALIDATOR$lambda$0;
                DURATION_VALIDATOR$lambda$0 = DivNumberAnimatorJsonParser.DURATION_VALIDATOR$lambda$0(((Long) obj).longValue());
                return DURATION_VALIDATOR$lambda$0;
            }
        };
        START_DELAY_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivNumberAnimatorJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean START_DELAY_VALIDATOR$lambda$1;
                START_DELAY_VALIDATOR$lambda$1 = DivNumberAnimatorJsonParser.START_DELAY_VALIDATOR$lambda$1(((Long) obj).longValue());
                return START_DELAY_VALIDATOR$lambda$1;
            }
        };
    }
}
