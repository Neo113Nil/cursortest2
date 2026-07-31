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

/* compiled from: DivInputValidatorRegexJsonParser.kt */
/* loaded from: classes12.dex */
public abstract class DivInputValidatorRegexJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final Expression ALLOW_EMPTY_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.FALSE, null, 2, null);

    /* compiled from: DivInputValidatorRegexJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivInputValidatorRegex deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = DivInputValidatorRegexJsonParser.ALLOW_EMPTY_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "allow_empty", typeHelper, function1, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            TypeHelper<String> typeHelper2 = TypeHelpersKt.TYPE_HELPER_STRING;
            return new DivInputValidatorRegex(expression, JsonExpressionParser.readExpression(parsingContext, jSONObject, "label_id", typeHelper2), JsonExpressionParser.readExpression(parsingContext, jSONObject, "pattern", typeHelper2), (String) JsonPropertyParser.read(parsingContext, jSONObject, "variable"));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivInputValidatorRegex divInputValidatorRegex) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "allow_empty", divInputValidatorRegex.allowEmpty);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "label_id", divInputValidatorRegex.labelId);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "pattern", divInputValidatorRegex.pattern);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "regex");
            JsonPropertyParser.write(parsingContext, jSONObject, "variable", divInputValidatorRegex.variable);
            return jSONObject;
        }
    }

    /* compiled from: DivInputValidatorRegexJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivInputValidatorRegexTemplate deserialize(ParsingContext parsingContext, DivInputValidatorRegexTemplate divInputValidatorRegexTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "allow_empty", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divInputValidatorRegexTemplate != null ? divInputValidatorRegexTemplate.allowEmpty : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            return new DivInputValidatorRegexTemplate(readOptionalFieldWithExpression, JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "label_id", typeHelper, allowPropertyOverride, divInputValidatorRegexTemplate != null ? divInputValidatorRegexTemplate.labelId : null), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "pattern", typeHelper, allowPropertyOverride, divInputValidatorRegexTemplate != null ? divInputValidatorRegexTemplate.pattern : null), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "variable", allowPropertyOverride, divInputValidatorRegexTemplate != null ? divInputValidatorRegexTemplate.variable : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivInputValidatorRegexTemplate divInputValidatorRegexTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "allow_empty", divInputValidatorRegexTemplate.allowEmpty);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "label_id", divInputValidatorRegexTemplate.labelId);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "pattern", divInputValidatorRegexTemplate.pattern);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "regex");
            JsonFieldParser.writeField(parsingContext, jSONObject, "variable", divInputValidatorRegexTemplate.variable);
            return jSONObject;
        }
    }

    /* compiled from: DivInputValidatorRegexJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivInputValidatorRegex resolve(ParsingContext parsingContext, DivInputValidatorRegexTemplate divInputValidatorRegexTemplate, JSONObject jSONObject) {
            Field field = divInputValidatorRegexTemplate.allowEmpty;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = DivInputValidatorRegexJsonParser.ALLOW_EMPTY_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "allow_empty", typeHelper, function1, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            Field field2 = divInputValidatorRegexTemplate.labelId;
            TypeHelper<String> typeHelper2 = TypeHelpersKt.TYPE_HELPER_STRING;
            return new DivInputValidatorRegex(expression, JsonFieldResolver.resolveExpression(parsingContext, field2, jSONObject, "label_id", typeHelper2), JsonFieldResolver.resolveExpression(parsingContext, divInputValidatorRegexTemplate.pattern, jSONObject, "pattern", typeHelper2), (String) JsonFieldResolver.resolve(parsingContext, divInputValidatorRegexTemplate.variable, jSONObject, "variable"));
        }
    }

    /* compiled from: DivInputValidatorRegexJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
