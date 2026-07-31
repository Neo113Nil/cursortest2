package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: DivInputValidatorExpressionJsonParser.kt */
/* loaded from: classes10.dex */
public abstract class DivInputValidatorExpressionJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final Expression ALLOW_EMPTY_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.FALSE, null, 2, null);

    /* compiled from: DivInputValidatorExpressionJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivInputValidatorExpression deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = DivInputValidatorExpressionJsonParser.ALLOW_EMPTY_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "allow_empty", typeHelper, function1, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new DivInputValidatorExpression(expression, JsonExpressionParser.readExpression(parsingContext, jSONObject, "condition", typeHelper, function1), JsonExpressionParser.readExpression(parsingContext, jSONObject, "label_id", TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonPropertyParser.read(parsingContext, jSONObject, "variable"));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivInputValidatorExpression divInputValidatorExpression) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "allow_empty", divInputValidatorExpression.allowEmpty);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "condition", divInputValidatorExpression.condition);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "label_id", divInputValidatorExpression.labelId);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "expression");
            JsonPropertyParser.write(parsingContext, jSONObject, "variable", divInputValidatorExpression.variable);
            return jSONObject;
        }
    }

    /* compiled from: DivInputValidatorExpressionJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivInputValidatorExpressionTemplate deserialize(ParsingContext parsingContext, DivInputValidatorExpressionTemplate divInputValidatorExpressionTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field = divInputValidatorExpressionTemplate != null ? divInputValidatorExpressionTemplate.allowEmpty : null;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            return new DivInputValidatorExpressionTemplate(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "allow_empty", typeHelper, allowPropertyOverride, field, function1), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "condition", typeHelper, allowPropertyOverride, divInputValidatorExpressionTemplate != null ? divInputValidatorExpressionTemplate.condition : null, function1), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "label_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divInputValidatorExpressionTemplate != null ? divInputValidatorExpressionTemplate.labelId : null), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "variable", allowPropertyOverride, divInputValidatorExpressionTemplate != null ? divInputValidatorExpressionTemplate.variable : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivInputValidatorExpressionTemplate divInputValidatorExpressionTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "allow_empty", divInputValidatorExpressionTemplate.allowEmpty);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "condition", divInputValidatorExpressionTemplate.condition);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "label_id", divInputValidatorExpressionTemplate.labelId);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "expression");
            JsonFieldParser.writeField(parsingContext, jSONObject, "variable", divInputValidatorExpressionTemplate.variable);
            return jSONObject;
        }
    }

    /* compiled from: DivInputValidatorExpressionJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivInputValidatorExpression resolve(ParsingContext parsingContext, DivInputValidatorExpressionTemplate divInputValidatorExpressionTemplate, JSONObject jSONObject) {
            Field field = divInputValidatorExpressionTemplate.allowEmpty;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = DivInputValidatorExpressionJsonParser.ALLOW_EMPTY_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "allow_empty", typeHelper, function1, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new DivInputValidatorExpression(expression, JsonFieldResolver.resolveExpression(parsingContext, divInputValidatorExpressionTemplate.condition, jSONObject, "condition", typeHelper, function1), JsonFieldResolver.resolveExpression(parsingContext, divInputValidatorExpressionTemplate.labelId, jSONObject, "label_id", TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonFieldResolver.resolve(parsingContext, divInputValidatorExpressionTemplate.variable, jSONObject, "variable"));
        }
    }

    /* compiled from: DivInputValidatorExpressionJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
