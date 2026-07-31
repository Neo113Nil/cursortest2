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
import org.json.JSONObject;

/* compiled from: DivTimerJsonParser.kt */
/* loaded from: classes.dex */
public abstract class DivTimerJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final Expression DURATION_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, 0L, null, 2, null);
    public static final ValueValidator DURATION_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivTimerJsonParser$$ExternalSyntheticLambda0
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean DURATION_VALIDATOR$lambda$0;
            DURATION_VALIDATOR$lambda$0 = DivTimerJsonParser.DURATION_VALIDATOR$lambda$0(((Long) obj).longValue());
            return DURATION_VALIDATOR$lambda$0;
        }
    };
    public static final ValueValidator TICK_INTERVAL_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivTimerJsonParser$$ExternalSyntheticLambda1
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean TICK_INTERVAL_VALIDATOR$lambda$1;
            TICK_INTERVAL_VALIDATOR$lambda$1 = DivTimerJsonParser.TICK_INTERVAL_VALIDATOR$lambda$1(((Long) obj).longValue());
            return TICK_INTERVAL_VALIDATOR$lambda$1;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DURATION_VALIDATOR$lambda$0(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TICK_INTERVAL_VALIDATOR$lambda$1(long j) {
        return j > 0;
    }

    /* compiled from: DivTimerJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivTimer deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = DivTimerJsonParser.DURATION_VALIDATOR;
            Expression expression = DivTimerJsonParser.DURATION_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, IronSourceConstants.EVENTS_DURATION, typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new DivTimer(expression, JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "end_actions", this.component.getDivActionJsonEntityParser()), (String) JsonPropertyParser.read(parsingContext, jSONObject, "id"), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tick_actions", this.component.getDivActionJsonEntityParser()), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "tick_interval", typeHelper, function1, DivTimerJsonParser.TICK_INTERVAL_VALIDATOR), (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "value_variable"));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivTimer divTimer) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, IronSourceConstants.EVENTS_DURATION, divTimer.duration);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "end_actions", divTimer.endActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divTimer.id);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tick_actions", divTimer.tickActions, this.component.getDivActionJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "tick_interval", divTimer.tickInterval);
            JsonPropertyParser.write(parsingContext, jSONObject, "value_variable", divTimer.valueVariable);
            return jSONObject;
        }
    }

    /* compiled from: DivTimerJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivTimerTemplate deserialize(ParsingContext parsingContext, DivTimerTemplate divTimerTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = divTimerTemplate != null ? divTimerTemplate.duration : null;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivTimerTemplate(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, IronSourceConstants.EVENTS_DURATION, typeHelper, allowPropertyOverride, field, function1, DivTimerJsonParser.DURATION_VALIDATOR), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "end_actions", allowPropertyOverride, divTimerTemplate != null ? divTimerTemplate.endActions : null, this.component.getDivActionJsonTemplateParser()), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divTimerTemplate != null ? divTimerTemplate.id : null), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tick_actions", allowPropertyOverride, divTimerTemplate != null ? divTimerTemplate.tickActions : null, this.component.getDivActionJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "tick_interval", typeHelper, allowPropertyOverride, divTimerTemplate != null ? divTimerTemplate.tickInterval : null, function1, DivTimerJsonParser.TICK_INTERVAL_VALIDATOR), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "value_variable", allowPropertyOverride, divTimerTemplate != null ? divTimerTemplate.valueVariable : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivTimerTemplate divTimerTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, IronSourceConstants.EVENTS_DURATION, divTimerTemplate.duration);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "end_actions", divTimerTemplate.endActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divTimerTemplate.id);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tick_actions", divTimerTemplate.tickActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "tick_interval", divTimerTemplate.tickInterval);
            JsonFieldParser.writeField(parsingContext, jSONObject, "value_variable", divTimerTemplate.valueVariable);
            return jSONObject;
        }
    }

    /* compiled from: DivTimerJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivTimer resolve(ParsingContext parsingContext, DivTimerTemplate divTimerTemplate, JSONObject jSONObject) {
            Field field = divTimerTemplate.duration;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = DivTimerJsonParser.DURATION_VALIDATOR;
            Expression expression = DivTimerJsonParser.DURATION_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, IronSourceConstants.EVENTS_DURATION, typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new DivTimer(expression, JsonFieldResolver.resolveOptionalList(parsingContext, divTimerTemplate.endActions, jSONObject, "end_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser()), (String) JsonFieldResolver.resolve(parsingContext, divTimerTemplate.id, jSONObject, "id"), JsonFieldResolver.resolveOptionalList(parsingContext, divTimerTemplate.tickActions, jSONObject, "tick_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser()), JsonFieldResolver.resolveOptionalExpression(parsingContext, divTimerTemplate.tickInterval, jSONObject, "tick_interval", typeHelper, function1, DivTimerJsonParser.TICK_INTERVAL_VALIDATOR), (String) JsonFieldResolver.resolveOptional(parsingContext, divTimerTemplate.valueVariable, jSONObject, "value_variable"));
        }
    }

    /* compiled from: DivTimerJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
