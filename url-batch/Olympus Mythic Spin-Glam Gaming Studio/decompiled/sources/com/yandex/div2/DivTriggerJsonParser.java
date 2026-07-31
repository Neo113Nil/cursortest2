package com.yandex.div2;

import com.ironsource.X3;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivTrigger;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTriggerJsonParser.kt */
/* loaded from: classes12.dex */
public abstract class DivTriggerJsonParser {
    public static final ListValidator ACTIONS_VALIDATOR;
    private static final Companion Companion = new Companion(null);
    public static final Expression MODE_DEFAULT_VALUE;
    public static final TypeHelper TYPE_HELPER_MODE;

    /* compiled from: DivTriggerJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivTrigger deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            List readList = JsonPropertyParser.readList(parsingContext, jSONObject, "actions", this.component.getDivActionJsonEntityParser(), DivTriggerJsonParser.ACTIONS_VALIDATOR);
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "condition", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN);
            TypeHelper typeHelper = DivTriggerJsonParser.TYPE_HELPER_MODE;
            Function1 function1 = DivTrigger.Mode.FROM_STRING;
            Expression expression = DivTriggerJsonParser.MODE_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, X3.a.t, typeHelper, function1, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new DivTrigger(readList, readExpression, expression);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivTrigger divTrigger) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", divTrigger.actions, this.component.getDivActionJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "condition", divTrigger.condition);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, X3.a.t, divTrigger.mode, DivTrigger.Mode.TO_STRING);
            return jSONObject;
        }
    }

    /* compiled from: DivTriggerJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivTriggerTemplate deserialize(ParsingContext parsingContext, DivTriggerTemplate divTriggerTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field field = divTriggerTemplate != null ? divTriggerTemplate.actions : null;
            Lazy divActionJsonTemplateParser = this.component.getDivActionJsonTemplateParser();
            ListValidator listValidator = DivTriggerJsonParser.ACTIONS_VALIDATOR;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivTriggerTemplate(JsonFieldParser.readListField(restrictPropertyOverride, jSONObject, "actions", allowPropertyOverride, field, divActionJsonTemplateParser, listValidator), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "condition", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divTriggerTemplate != null ? divTriggerTemplate.condition : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, X3.a.t, DivTriggerJsonParser.TYPE_HELPER_MODE, allowPropertyOverride, divTriggerTemplate != null ? divTriggerTemplate.mode : null, DivTrigger.Mode.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivTriggerTemplate divTriggerTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "actions", divTriggerTemplate.actions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "condition", divTriggerTemplate.condition);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, X3.a.t, divTriggerTemplate.mode, DivTrigger.Mode.TO_STRING);
            return jSONObject;
        }
    }

    /* compiled from: DivTriggerJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivTrigger resolve(ParsingContext parsingContext, DivTriggerTemplate divTriggerTemplate, JSONObject jSONObject) {
            List resolveList = JsonFieldResolver.resolveList(parsingContext, divTriggerTemplate.actions, jSONObject, "actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser(), DivTriggerJsonParser.ACTIONS_VALIDATOR);
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divTriggerTemplate.condition, jSONObject, "condition", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field field = divTriggerTemplate.mode;
            TypeHelper typeHelper = DivTriggerJsonParser.TYPE_HELPER_MODE;
            Function1 function1 = DivTrigger.Mode.FROM_STRING;
            Expression expression = DivTriggerJsonParser.MODE_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, X3.a.t, typeHelper, function1, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new DivTrigger(resolveList, resolveExpression, expression);
        }
    }

    /* compiled from: DivTriggerJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        DivTrigger.Mode mode = DivTrigger.Mode.ON_CONDITION;
        MODE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, mode, null, 2, null);
        TYPE_HELPER_MODE = TypeHelper.INSTANCE.from(mode, new Function1() { // from class: com.yandex.div2.DivTriggerJsonParser$Companion$TYPE_HELPER_MODE$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivTrigger.Mode);
            }
        });
        ACTIONS_VALIDATOR = new ListValidator() { // from class: com.yandex.div2.DivTriggerJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean ACTIONS_VALIDATOR$lambda$0;
                ACTIONS_VALIDATOR$lambda$0 = DivTriggerJsonParser.ACTIONS_VALIDATOR$lambda$0(list);
                return ACTIONS_VALIDATOR$lambda$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ACTIONS_VALIDATOR$lambda$0(List list) {
        return list.size() >= 1;
    }
}
