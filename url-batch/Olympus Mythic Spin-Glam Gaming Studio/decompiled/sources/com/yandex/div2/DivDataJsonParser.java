package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import com.yandex.div.serialization.TemplateResolver;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivDataJsonParser.kt */
/* loaded from: classes.dex */
public abstract class DivDataJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final ListValidator STATES_VALIDATOR;
    public static final Expression TRANSITION_ANIMATION_SELECTOR_DEFAULT_VALUE;
    public static final TypeHelper TYPE_HELPER_TRANSITION_ANIMATION_SELECTOR;

    /* compiled from: DivDataJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivData deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            ParsingContext collectingErrors = ParsingContextKt.collectingErrors(parsingContext);
            List readOptionalList = JsonPropertyParser.readOptionalList(collectingErrors, jSONObject, "functions", this.component.getDivFunctionJsonEntityParser());
            String str = (String) JsonPropertyParser.read(collectingErrors, jSONObject, "log_id");
            List readList = JsonPropertyParser.readList(collectingErrors, jSONObject, "states", this.component.getDivDataStateJsonEntityParser(), DivDataJsonParser.STATES_VALIDATOR);
            List readOptionalList2 = JsonPropertyParser.readOptionalList(collectingErrors, jSONObject, "timers", this.component.getDivTimerJsonEntityParser());
            TypeHelper typeHelper = DivDataJsonParser.TYPE_HELPER_TRANSITION_ANIMATION_SELECTOR;
            Function1 function1 = DivTransitionSelector.FROM_STRING;
            Expression expression = DivDataJsonParser.TRANSITION_ANIMATION_SELECTOR_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(collectingErrors, jSONObject, "transition_animation_selector", typeHelper, function1, expression);
            return new DivData(readOptionalList, str, readList, readOptionalList2, readOptionalExpression == null ? expression : readOptionalExpression, JsonPropertyParser.readOptionalList(collectingErrors, jSONObject, "variable_triggers", this.component.getDivTriggerJsonEntityParser()), JsonPropertyParser.readOptionalList(collectingErrors, jSONObject, "variables", this.component.getDivVariableJsonEntityParser()), ParsingContextKt.getCollectedErrors(collectingErrors));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivData divData) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "functions", divData.functions, this.component.getDivFunctionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "log_id", divData.logId);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "states", divData.states, this.component.getDivDataStateJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "timers", divData.timers, this.component.getDivTimerJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "transition_animation_selector", divData.transitionAnimationSelector, DivTransitionSelector.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variable_triggers", divData.variableTriggers, this.component.getDivTriggerJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "variables", divData.variables, this.component.getDivVariableJsonEntityParser());
            return jSONObject;
        }
    }

    /* compiled from: DivDataJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivDataTemplate deserialize(ParsingContext parsingContext, DivDataTemplate divDataTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "functions", allowPropertyOverride, divDataTemplate != null ? divDataTemplate.functions : null, this.component.getDivFunctionJsonTemplateParser());
            Field readField = JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "log_id", allowPropertyOverride, divDataTemplate != null ? divDataTemplate.logId : null);
            Field field = divDataTemplate != null ? divDataTemplate.states : null;
            Lazy divDataStateJsonTemplateParser = this.component.getDivDataStateJsonTemplateParser();
            ListValidator listValidator = DivDataJsonParser.STATES_VALIDATOR;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivDataTemplate(readOptionalListField, readField, JsonFieldParser.readListField(restrictPropertyOverride, jSONObject, "states", allowPropertyOverride, field, divDataStateJsonTemplateParser, listValidator), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "timers", allowPropertyOverride, divDataTemplate != null ? divDataTemplate.timers : null, this.component.getDivTimerJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "transition_animation_selector", DivDataJsonParser.TYPE_HELPER_TRANSITION_ANIMATION_SELECTOR, allowPropertyOverride, divDataTemplate != null ? divDataTemplate.transitionAnimationSelector : null, DivTransitionSelector.FROM_STRING), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variable_triggers", allowPropertyOverride, divDataTemplate != null ? divDataTemplate.variableTriggers : null, this.component.getDivTriggerJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "variables", allowPropertyOverride, divDataTemplate != null ? divDataTemplate.variables : null, this.component.getDivVariableJsonTemplateParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivDataTemplate divDataTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "functions", divDataTemplate.functions, this.component.getDivFunctionJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "log_id", divDataTemplate.logId);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "states", divDataTemplate.states, this.component.getDivDataStateJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "timers", divDataTemplate.timers, this.component.getDivTimerJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "transition_animation_selector", divDataTemplate.transitionAnimationSelector, DivTransitionSelector.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variable_triggers", divDataTemplate.variableTriggers, this.component.getDivTriggerJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "variables", divDataTemplate.variables, this.component.getDivVariableJsonTemplateParser());
            return jSONObject;
        }
    }

    /* compiled from: DivDataJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivData resolve(ParsingContext parsingContext, DivDataTemplate divDataTemplate, JSONObject jSONObject) {
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divDataTemplate.functions, jSONObject, "functions", this.component.getDivFunctionJsonTemplateResolver(), this.component.getDivFunctionJsonEntityParser());
            String str = (String) JsonFieldResolver.resolve(parsingContext, divDataTemplate.logId, jSONObject, "log_id");
            List resolveList = JsonFieldResolver.resolveList(parsingContext, divDataTemplate.states, jSONObject, "states", this.component.getDivDataStateJsonTemplateResolver(), this.component.getDivDataStateJsonEntityParser(), DivDataJsonParser.STATES_VALIDATOR);
            List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(parsingContext, divDataTemplate.timers, jSONObject, "timers", this.component.getDivTimerJsonTemplateResolver(), this.component.getDivTimerJsonEntityParser());
            Field field = divDataTemplate.transitionAnimationSelector;
            TypeHelper typeHelper = DivDataJsonParser.TYPE_HELPER_TRANSITION_ANIMATION_SELECTOR;
            Function1 function1 = DivTransitionSelector.FROM_STRING;
            Expression expression = DivDataJsonParser.TRANSITION_ANIMATION_SELECTOR_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "transition_animation_selector", typeHelper, function1, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new DivData(resolveOptionalList, str, resolveList, resolveOptionalList2, expression, JsonFieldResolver.resolveOptionalList(parsingContext, divDataTemplate.variableTriggers, jSONObject, "variable_triggers", this.component.getDivTriggerJsonTemplateResolver(), this.component.getDivTriggerJsonEntityParser()), JsonFieldResolver.resolveOptionalList(parsingContext, divDataTemplate.variables, jSONObject, "variables", this.component.getDivVariableJsonTemplateResolver(), this.component.getDivVariableJsonEntityParser()), null, 128, null);
        }
    }

    /* compiled from: DivDataJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        DivTransitionSelector divTransitionSelector = DivTransitionSelector.NONE;
        TRANSITION_ANIMATION_SELECTOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divTransitionSelector, null, 2, null);
        TYPE_HELPER_TRANSITION_ANIMATION_SELECTOR = TypeHelper.INSTANCE.from(divTransitionSelector, new Function1() { // from class: com.yandex.div2.DivDataJsonParser$Companion$TYPE_HELPER_TRANSITION_ANIMATION_SELECTOR$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivTransitionSelector);
            }
        });
        STATES_VALIDATOR = new ListValidator() { // from class: com.yandex.div2.DivDataJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean STATES_VALIDATOR$lambda$0;
                STATES_VALIDATOR$lambda$0 = DivDataJsonParser.STATES_VALIDATOR$lambda$0(list);
                return STATES_VALIDATOR$lambda$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean STATES_VALIDATOR$lambda$0(List list) {
        return list.size() >= 1;
    }
}
