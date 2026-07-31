package com.yandex.div2;

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
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivFixedSizeJsonParser.kt */
/* loaded from: classes13.dex */
public abstract class DivFixedSizeJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final TypeHelper TYPE_HELPER_UNIT;
    public static final Expression UNIT_DEFAULT_VALUE;
    public static final ValueValidator VALUE_VALIDATOR;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean VALUE_VALIDATOR$lambda$0(long j) {
        return j >= 0;
    }

    /* compiled from: DivFixedSizeJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivFixedSize deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper typeHelper = DivFixedSizeJsonParser.TYPE_HELPER_UNIT;
            Function1 function1 = DivSizeUnit.FROM_STRING;
            Expression expression = DivFixedSizeJsonParser.UNIT_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "unit", typeHelper, function1, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new DivFixedSize(expression, JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, DivFixedSizeJsonParser.VALUE_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivFixedSize divFixedSize) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "fixed");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "unit", divFixedSize.unit, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", divFixedSize.value);
            return jSONObject;
        }
    }

    /* compiled from: DivFixedSizeJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivFixedSizeTemplate deserialize(ParsingContext parsingContext, DivFixedSizeTemplate divFixedSizeTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivFixedSizeTemplate(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "unit", DivFixedSizeJsonParser.TYPE_HELPER_UNIT, allowPropertyOverride, divFixedSizeTemplate != null ? divFixedSizeTemplate.unit : null, DivSizeUnit.FROM_STRING), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, divFixedSizeTemplate != null ? divFixedSizeTemplate.value : null, ParsingConvertersKt.NUMBER_TO_INT, DivFixedSizeJsonParser.VALUE_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivFixedSizeTemplate divFixedSizeTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "fixed");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "unit", divFixedSizeTemplate.unit, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", divFixedSizeTemplate.value);
            return jSONObject;
        }
    }

    /* compiled from: DivFixedSizeJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivFixedSize resolve(ParsingContext parsingContext, DivFixedSizeTemplate divFixedSizeTemplate, JSONObject jSONObject) {
            Field field = divFixedSizeTemplate.unit;
            TypeHelper typeHelper = DivFixedSizeJsonParser.TYPE_HELPER_UNIT;
            Function1 function1 = DivSizeUnit.FROM_STRING;
            Expression expression = DivFixedSizeJsonParser.UNIT_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "unit", typeHelper, function1, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new DivFixedSize(expression, JsonFieldResolver.resolveExpression(parsingContext, divFixedSizeTemplate.value, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, DivFixedSizeJsonParser.VALUE_VALIDATOR));
        }
    }

    /* compiled from: DivFixedSizeJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        DivSizeUnit divSizeUnit = DivSizeUnit.DP;
        UNIT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        TYPE_HELPER_UNIT = TypeHelper.INSTANCE.from(divSizeUnit, new Function1() { // from class: com.yandex.div2.DivFixedSizeJsonParser$Companion$TYPE_HELPER_UNIT$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
        VALUE_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivFixedSizeJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean VALUE_VALIDATOR$lambda$0;
                VALUE_VALIDATOR$lambda$0 = DivFixedSizeJsonParser.VALUE_VALIDATOR$lambda$0(((Long) obj).longValue());
                return VALUE_VALIDATOR$lambda$0;
            }
        };
    }
}
