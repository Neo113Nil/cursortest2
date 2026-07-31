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

/* compiled from: DivColorAnimatorJsonParser.kt */
/* loaded from: classes13.dex */
public abstract class DivColorAnimatorJsonParser {
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

    /* compiled from: DivColorAnimatorJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivColorAnimator deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "cancel_actions", this.component.getDivActionJsonEntityParser());
            TypeHelper typeHelper = DivColorAnimatorJsonParser.TYPE_HELPER_DIRECTION;
            Function1 function1 = DivAnimationDirection.FROM_STRING;
            Expression expression = DivColorAnimatorJsonParser.DIRECTION_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "direction", typeHelper, function1, expression);
            Expression expression2 = readOptionalExpression == null ? expression : readOptionalExpression;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, IronSourceConstants.EVENTS_DURATION, typeHelper2, function12, DivColorAnimatorJsonParser.DURATION_VALIDATOR);
            List readOptionalList2 = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "end_actions", this.component.getDivActionJsonEntityParser());
            TypeHelper<Integer> typeHelper3 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1 function13 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression readExpression2 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "end_value", typeHelper3, function13);
            String str = (String) JsonPropertyParser.read(parsingContext, jSONObject, "id");
            TypeHelper typeHelper4 = DivColorAnimatorJsonParser.TYPE_HELPER_INTERPOLATOR;
            Function1 function14 = DivAnimationInterpolator.FROM_STRING;
            Expression expression3 = DivColorAnimatorJsonParser.INTERPOLATOR_DEFAULT_VALUE;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", typeHelper4, function14, expression3);
            if (readOptionalExpression2 != null) {
                expression3 = readOptionalExpression2;
            }
            DivCount divCount = (DivCount) JsonPropertyParser.readOptional(parsingContext, jSONObject, "repeat_count", this.component.getDivCountJsonEntityParser());
            if (divCount == null) {
                divCount = DivColorAnimatorJsonParser.REPEAT_COUNT_DEFAULT_VALUE;
            }
            DivCount divCount2 = divCount;
            ValueValidator valueValidator = DivColorAnimatorJsonParser.START_DELAY_VALIDATOR;
            Expression expression4 = DivColorAnimatorJsonParser.START_DELAY_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper2, function12, valueValidator, expression4);
            if (readOptionalExpression3 != null) {
                expression4 = readOptionalExpression3;
            }
            return new DivColorAnimator(readOptionalList, expression2, readExpression, readOptionalList2, readExpression2, str, expression3, divCount2, expression4, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_value", typeHelper3, function13), (String) JsonPropertyParser.read(parsingContext, jSONObject, "variable_name"));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivColorAnimator divColorAnimator) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "cancel_actions", divColorAnimator.getCancelActions(), this.component.getDivActionJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "direction", divColorAnimator.getDirection(), DivAnimationDirection.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, IronSourceConstants.EVENTS_DURATION, divColorAnimator.getDuration());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "end_actions", divColorAnimator.getEndActions(), this.component.getDivActionJsonEntityParser());
            Expression expression = divColorAnimator.endValue;
            Function1 function1 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "end_value", expression, function1);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divColorAnimator.getId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", divColorAnimator.getInterpolator(), DivAnimationInterpolator.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "repeat_count", divColorAnimator.getRepeatCount(), this.component.getDivCountJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", divColorAnimator.getStartDelay());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_value", divColorAnimator.startValue, function1);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "color_animator");
            JsonPropertyParser.write(parsingContext, jSONObject, "variable_name", divColorAnimator.getVariableName());
            return jSONObject;
        }
    }

    /* compiled from: DivColorAnimatorJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivColorAnimatorTemplate deserialize(ParsingContext parsingContext, DivColorAnimatorTemplate divColorAnimatorTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "cancel_actions", allowPropertyOverride, divColorAnimatorTemplate != null ? divColorAnimatorTemplate.cancelActions : null, this.component.getDivActionJsonTemplateParser());
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "direction", DivColorAnimatorJsonParser.TYPE_HELPER_DIRECTION, allowPropertyOverride, divColorAnimatorTemplate != null ? divColorAnimatorTemplate.direction : null, DivAnimationDirection.FROM_STRING);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = divColorAnimatorTemplate != null ? divColorAnimatorTemplate.duration : null;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, IronSourceConstants.EVENTS_DURATION, typeHelper, allowPropertyOverride, field, function1, DivColorAnimatorJsonParser.DURATION_VALIDATOR);
            Field readOptionalListField2 = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "end_actions", allowPropertyOverride, divColorAnimatorTemplate != null ? divColorAnimatorTemplate.endActions : null, this.component.getDivActionJsonTemplateParser());
            TypeHelper<Integer> typeHelper2 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field field2 = divColorAnimatorTemplate != null ? divColorAnimatorTemplate.endValue : null;
            Function1 function12 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            return new DivColorAnimatorTemplate(readOptionalListField, readOptionalFieldWithExpression, readFieldWithExpression, readOptionalListField2, JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "end_value", typeHelper2, allowPropertyOverride, field2, function12), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divColorAnimatorTemplate != null ? divColorAnimatorTemplate.id : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "interpolator", DivColorAnimatorJsonParser.TYPE_HELPER_INTERPOLATOR, allowPropertyOverride, divColorAnimatorTemplate != null ? divColorAnimatorTemplate.interpolator : null, DivAnimationInterpolator.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "repeat_count", allowPropertyOverride, divColorAnimatorTemplate != null ? divColorAnimatorTemplate.repeatCount : null, this.component.getDivCountJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, divColorAnimatorTemplate != null ? divColorAnimatorTemplate.startDelay : null, function1, DivColorAnimatorJsonParser.START_DELAY_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "start_value", typeHelper2, allowPropertyOverride, divColorAnimatorTemplate != null ? divColorAnimatorTemplate.startValue : null, function12), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "variable_name", allowPropertyOverride, divColorAnimatorTemplate != null ? divColorAnimatorTemplate.variableName : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivColorAnimatorTemplate divColorAnimatorTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "cancel_actions", divColorAnimatorTemplate.cancelActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "direction", divColorAnimatorTemplate.direction, DivAnimationDirection.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, IronSourceConstants.EVENTS_DURATION, divColorAnimatorTemplate.duration);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "end_actions", divColorAnimatorTemplate.endActions, this.component.getDivActionJsonTemplateParser());
            Field field = divColorAnimatorTemplate.endValue;
            Function1 function1 = ParsingConvertersKt.COLOR_INT_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "end_value", field, function1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divColorAnimatorTemplate.id);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", divColorAnimatorTemplate.interpolator, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "repeat_count", divColorAnimatorTemplate.repeatCount, this.component.getDivCountJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", divColorAnimatorTemplate.startDelay);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_value", divColorAnimatorTemplate.startValue, function1);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "color_animator");
            JsonFieldParser.writeField(parsingContext, jSONObject, "variable_name", divColorAnimatorTemplate.variableName);
            return jSONObject;
        }
    }

    /* compiled from: DivColorAnimatorJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivColorAnimator resolve(ParsingContext parsingContext, DivColorAnimatorTemplate divColorAnimatorTemplate, JSONObject jSONObject) {
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divColorAnimatorTemplate.cancelActions, jSONObject, "cancel_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            Field field = divColorAnimatorTemplate.direction;
            TypeHelper typeHelper = DivColorAnimatorJsonParser.TYPE_HELPER_DIRECTION;
            Function1 function1 = DivAnimationDirection.FROM_STRING;
            Expression expression = DivColorAnimatorJsonParser.DIRECTION_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "direction", typeHelper, function1, expression);
            Expression expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            Field field2 = divColorAnimatorTemplate.duration;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, field2, jSONObject, IronSourceConstants.EVENTS_DURATION, typeHelper2, function12, DivColorAnimatorJsonParser.DURATION_VALIDATOR);
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divColorAnimatorTemplate.endActions, jSONObject, "end_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser());
            Field field3 = divColorAnimatorTemplate.endValue;
            TypeHelper<Integer> typeHelper3 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1 function13 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression resolveExpression2 = JsonFieldResolver.resolveExpression(parsingContext, field3, jSONObject, "end_value", typeHelper3, function13);
            String str = (String) JsonFieldResolver.resolve(parsingContext, divColorAnimatorTemplate.id, jSONObject, "id");
            Field field4 = divColorAnimatorTemplate.interpolator;
            TypeHelper typeHelper4 = DivColorAnimatorJsonParser.TYPE_HELPER_INTERPOLATOR;
            Function1 function14 = DivAnimationInterpolator.FROM_STRING;
            Expression expression3 = DivColorAnimatorJsonParser.INTERPOLATOR_DEFAULT_VALUE;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "interpolator", typeHelper4, function14, expression3);
            if (resolveOptionalExpression2 != null) {
                expression3 = resolveOptionalExpression2;
            }
            DivCount divCount = (DivCount) JsonFieldResolver.resolveOptional(parsingContext, divColorAnimatorTemplate.repeatCount, jSONObject, "repeat_count", this.component.getDivCountJsonTemplateResolver(), this.component.getDivCountJsonEntityParser());
            if (divCount == null) {
                divCount = DivColorAnimatorJsonParser.REPEAT_COUNT_DEFAULT_VALUE;
            }
            DivCount divCount2 = divCount;
            Field field5 = divColorAnimatorTemplate.startDelay;
            ValueValidator valueValidator = DivColorAnimatorJsonParser.START_DELAY_VALIDATOR;
            Expression expression4 = DivColorAnimatorJsonParser.START_DELAY_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "start_delay", typeHelper2, function12, valueValidator, expression4);
            if (resolveOptionalExpression3 != null) {
                expression4 = resolveOptionalExpression3;
            }
            return new DivColorAnimator(resolveOptionalList, expression2, resolveExpression, resolveOptionalList2, resolveExpression2, str, expression3, divCount2, expression4, JsonFieldResolver.resolveOptionalExpression(parsingContext, divColorAnimatorTemplate.startValue, jSONObject, "start_value", typeHelper3, function13), (String) JsonFieldResolver.resolve(parsingContext, divColorAnimatorTemplate.variableName, jSONObject, "variable_name"));
        }
    }

    /* compiled from: DivColorAnimatorJsonParser.kt */
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
        TYPE_HELPER_DIRECTION = companion2.from(divAnimationDirection, new Function1() { // from class: com.yandex.div2.DivColorAnimatorJsonParser$Companion$TYPE_HELPER_DIRECTION$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationDirection);
            }
        });
        TYPE_HELPER_INTERPOLATOR = companion2.from(divAnimationInterpolator, new Function1() { // from class: com.yandex.div2.DivColorAnimatorJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
            }
        });
        DURATION_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivColorAnimatorJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean DURATION_VALIDATOR$lambda$0;
                DURATION_VALIDATOR$lambda$0 = DivColorAnimatorJsonParser.DURATION_VALIDATOR$lambda$0(((Long) obj).longValue());
                return DURATION_VALIDATOR$lambda$0;
            }
        };
        START_DELAY_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivColorAnimatorJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean START_DELAY_VALIDATOR$lambda$1;
                START_DELAY_VALIDATOR$lambda$1 = DivColorAnimatorJsonParser.START_DELAY_VALIDATOR$lambda$1(((Long) obj).longValue());
                return START_DELAY_VALIDATOR$lambda$1;
            }
        };
    }
}
