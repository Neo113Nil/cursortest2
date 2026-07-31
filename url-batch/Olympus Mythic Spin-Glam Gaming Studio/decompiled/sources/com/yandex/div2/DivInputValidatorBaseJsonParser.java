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

/* compiled from: DivInputValidatorBaseJsonParser.kt */
/* loaded from: classes13.dex */
public abstract class DivInputValidatorBaseJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final Expression ALLOW_EMPTY_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.FALSE, null, 2, null);

    /* compiled from: DivInputValidatorBaseJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivInputValidatorBase deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = DivInputValidatorBaseJsonParser.ALLOW_EMPTY_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "allow_empty", typeHelper, function1, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new DivInputValidatorBase(expression, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "label_id", TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "variable"));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivInputValidatorBase divInputValidatorBase) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "allow_empty", divInputValidatorBase.allowEmpty);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "label_id", divInputValidatorBase.labelId);
            JsonPropertyParser.write(parsingContext, jSONObject, "variable", divInputValidatorBase.variable);
            return jSONObject;
        }
    }

    /* compiled from: DivInputValidatorBaseJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivInputValidatorBaseTemplate deserialize(ParsingContext parsingContext, DivInputValidatorBaseTemplate divInputValidatorBaseTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivInputValidatorBaseTemplate(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "allow_empty", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divInputValidatorBaseTemplate != null ? divInputValidatorBaseTemplate.allowEmpty : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "label_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divInputValidatorBaseTemplate != null ? divInputValidatorBaseTemplate.labelId : null), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "variable", allowPropertyOverride, divInputValidatorBaseTemplate != null ? divInputValidatorBaseTemplate.variable : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivInputValidatorBaseTemplate divInputValidatorBaseTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "allow_empty", divInputValidatorBaseTemplate.allowEmpty);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "label_id", divInputValidatorBaseTemplate.labelId);
            JsonFieldParser.writeField(parsingContext, jSONObject, "variable", divInputValidatorBaseTemplate.variable);
            return jSONObject;
        }
    }

    /* compiled from: DivInputValidatorBaseJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivInputValidatorBase resolve(ParsingContext parsingContext, DivInputValidatorBaseTemplate divInputValidatorBaseTemplate, JSONObject jSONObject) {
            Field field = divInputValidatorBaseTemplate.allowEmpty;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = DivInputValidatorBaseJsonParser.ALLOW_EMPTY_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "allow_empty", typeHelper, function1, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new DivInputValidatorBase(expression, JsonFieldResolver.resolveOptionalExpression(parsingContext, divInputValidatorBaseTemplate.labelId, jSONObject, "label_id", TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonFieldResolver.resolveOptional(parsingContext, divInputValidatorBaseTemplate.variable, jSONObject, "variable"));
        }
    }

    /* compiled from: DivInputValidatorBaseJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
