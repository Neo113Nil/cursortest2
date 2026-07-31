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
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivActionAnimatorStartJsonParser.kt */
/* loaded from: classes8.dex */
public abstract class DivActionAnimatorStartJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final ValueValidator DURATION_VALIDATOR;
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

    /* compiled from: DivActionAnimatorStartJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivActionAnimatorStart deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            String str = (String) JsonPropertyParser.read(parsingContext, jSONObject, "animator_id");
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "direction", DivActionAnimatorStartJsonParser.TYPE_HELPER_DIRECTION, DivAnimationDirection.FROM_STRING);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivActionAnimatorStart(str, readOptionalExpression, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, IronSourceConstants.EVENTS_DURATION, typeHelper, function1, DivActionAnimatorStartJsonParser.DURATION_VALIDATOR), (DivTypedValue) JsonPropertyParser.readOptional(parsingContext, jSONObject, "end_value", this.component.getDivTypedValueJsonEntityParser()), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "interpolator", DivActionAnimatorStartJsonParser.TYPE_HELPER_INTERPOLATOR, DivAnimationInterpolator.FROM_STRING), (DivCount) JsonPropertyParser.readOptional(parsingContext, jSONObject, "repeat_count", this.component.getDivCountJsonEntityParser()), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start_delay", typeHelper, function1, DivActionAnimatorStartJsonParser.START_DELAY_VALIDATOR), (DivTypedValue) JsonPropertyParser.readOptional(parsingContext, jSONObject, "start_value", this.component.getDivTypedValueJsonEntityParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivActionAnimatorStart divActionAnimatorStart) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "animator_id", divActionAnimatorStart.animatorId);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "direction", divActionAnimatorStart.direction, DivAnimationDirection.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, IronSourceConstants.EVENTS_DURATION, divActionAnimatorStart.duration);
            JsonPropertyParser.write(parsingContext, jSONObject, "end_value", divActionAnimatorStart.endValue, this.component.getDivTypedValueJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "interpolator", divActionAnimatorStart.interpolator, DivAnimationInterpolator.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "repeat_count", divActionAnimatorStart.repeatCount, this.component.getDivCountJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start_delay", divActionAnimatorStart.startDelay);
            JsonPropertyParser.write(parsingContext, jSONObject, "start_value", divActionAnimatorStart.startValue, this.component.getDivTypedValueJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "animator_start");
            return jSONObject;
        }
    }

    /* compiled from: DivActionAnimatorStartJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivActionAnimatorStartTemplate deserialize(ParsingContext parsingContext, DivActionAnimatorStartTemplate divActionAnimatorStartTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readField = JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "animator_id", allowPropertyOverride, divActionAnimatorStartTemplate != null ? divActionAnimatorStartTemplate.animatorId : null);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "direction", DivActionAnimatorStartJsonParser.TYPE_HELPER_DIRECTION, allowPropertyOverride, divActionAnimatorStartTemplate != null ? divActionAnimatorStartTemplate.direction : null, DivAnimationDirection.FROM_STRING);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = divActionAnimatorStartTemplate != null ? divActionAnimatorStartTemplate.duration : null;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivActionAnimatorStartTemplate(readField, readOptionalFieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, IronSourceConstants.EVENTS_DURATION, typeHelper, allowPropertyOverride, field, function1, DivActionAnimatorStartJsonParser.DURATION_VALIDATOR), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "end_value", allowPropertyOverride, divActionAnimatorStartTemplate != null ? divActionAnimatorStartTemplate.endValue : null, this.component.getDivTypedValueJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "interpolator", DivActionAnimatorStartJsonParser.TYPE_HELPER_INTERPOLATOR, allowPropertyOverride, divActionAnimatorStartTemplate != null ? divActionAnimatorStartTemplate.interpolator : null, DivAnimationInterpolator.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "repeat_count", allowPropertyOverride, divActionAnimatorStartTemplate != null ? divActionAnimatorStartTemplate.repeatCount : null, this.component.getDivCountJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "start_delay", typeHelper, allowPropertyOverride, divActionAnimatorStartTemplate != null ? divActionAnimatorStartTemplate.startDelay : null, function1, DivActionAnimatorStartJsonParser.START_DELAY_VALIDATOR), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "start_value", allowPropertyOverride, divActionAnimatorStartTemplate != null ? divActionAnimatorStartTemplate.startValue : null, this.component.getDivTypedValueJsonTemplateParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivActionAnimatorStartTemplate divActionAnimatorStartTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "animator_id", divActionAnimatorStartTemplate.animatorId);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "direction", divActionAnimatorStartTemplate.direction, DivAnimationDirection.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, IronSourceConstants.EVENTS_DURATION, divActionAnimatorStartTemplate.duration);
            JsonFieldParser.writeField(parsingContext, jSONObject, "end_value", divActionAnimatorStartTemplate.endValue, this.component.getDivTypedValueJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "interpolator", divActionAnimatorStartTemplate.interpolator, DivAnimationInterpolator.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "repeat_count", divActionAnimatorStartTemplate.repeatCount, this.component.getDivCountJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start_delay", divActionAnimatorStartTemplate.startDelay);
            JsonFieldParser.writeField(parsingContext, jSONObject, "start_value", divActionAnimatorStartTemplate.startValue, this.component.getDivTypedValueJsonTemplateParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "animator_start");
            return jSONObject;
        }
    }

    /* compiled from: DivActionAnimatorStartJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivActionAnimatorStart resolve(ParsingContext parsingContext, DivActionAnimatorStartTemplate divActionAnimatorStartTemplate, JSONObject jSONObject) {
            String str = (String) JsonFieldResolver.resolve(parsingContext, divActionAnimatorStartTemplate.animatorId, jSONObject, "animator_id");
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divActionAnimatorStartTemplate.direction, jSONObject, "direction", DivActionAnimatorStartJsonParser.TYPE_HELPER_DIRECTION, DivAnimationDirection.FROM_STRING);
            Field field = divActionAnimatorStartTemplate.duration;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivActionAnimatorStart(str, resolveOptionalExpression, JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, IronSourceConstants.EVENTS_DURATION, typeHelper, function1, DivActionAnimatorStartJsonParser.DURATION_VALIDATOR), (DivTypedValue) JsonFieldResolver.resolveOptional(parsingContext, divActionAnimatorStartTemplate.endValue, jSONObject, "end_value", this.component.getDivTypedValueJsonTemplateResolver(), this.component.getDivTypedValueJsonEntityParser()), JsonFieldResolver.resolveOptionalExpression(parsingContext, divActionAnimatorStartTemplate.interpolator, jSONObject, "interpolator", DivActionAnimatorStartJsonParser.TYPE_HELPER_INTERPOLATOR, DivAnimationInterpolator.FROM_STRING), (DivCount) JsonFieldResolver.resolveOptional(parsingContext, divActionAnimatorStartTemplate.repeatCount, jSONObject, "repeat_count", this.component.getDivCountJsonTemplateResolver(), this.component.getDivCountJsonEntityParser()), JsonFieldResolver.resolveOptionalExpression(parsingContext, divActionAnimatorStartTemplate.startDelay, jSONObject, "start_delay", typeHelper, function1, DivActionAnimatorStartJsonParser.START_DELAY_VALIDATOR), (DivTypedValue) JsonFieldResolver.resolveOptional(parsingContext, divActionAnimatorStartTemplate.startValue, jSONObject, "start_value", this.component.getDivTypedValueJsonTemplateResolver(), this.component.getDivTypedValueJsonEntityParser()));
        }
    }

    /* compiled from: DivActionAnimatorStartJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        TypeHelper.Companion companion = TypeHelper.INSTANCE;
        TYPE_HELPER_DIRECTION = companion.from(ArraysKt.first(DivAnimationDirection.values()), new Function1() { // from class: com.yandex.div2.DivActionAnimatorStartJsonParser$Companion$TYPE_HELPER_DIRECTION$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationDirection);
            }
        });
        TYPE_HELPER_INTERPOLATOR = companion.from(ArraysKt.first(DivAnimationInterpolator.values()), new Function1() { // from class: com.yandex.div2.DivActionAnimatorStartJsonParser$Companion$TYPE_HELPER_INTERPOLATOR$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAnimationInterpolator);
            }
        });
        DURATION_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivActionAnimatorStartJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean DURATION_VALIDATOR$lambda$0;
                DURATION_VALIDATOR$lambda$0 = DivActionAnimatorStartJsonParser.DURATION_VALIDATOR$lambda$0(((Long) obj).longValue());
                return DURATION_VALIDATOR$lambda$0;
            }
        };
        START_DELAY_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivActionAnimatorStartJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean START_DELAY_VALIDATOR$lambda$1;
                START_DELAY_VALIDATOR$lambda$1 = DivActionAnimatorStartJsonParser.START_DELAY_VALIDATOR$lambda$1(((Long) obj).longValue());
                return START_DELAY_VALIDATOR$lambda$1;
            }
        };
    }
}
