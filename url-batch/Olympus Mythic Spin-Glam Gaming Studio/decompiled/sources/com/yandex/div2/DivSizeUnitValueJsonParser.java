package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
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

/* compiled from: DivSizeUnitValueJsonParser.kt */
/* loaded from: classes11.dex */
public abstract class DivSizeUnitValueJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final TypeHelper TYPE_HELPER_UNIT;
    public static final Expression UNIT_DEFAULT_VALUE;
    public static final ValueValidator VALUE_VALIDATOR;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean VALUE_VALIDATOR$lambda$0(long j) {
        return j >= 0;
    }

    /* compiled from: DivSizeUnitValueJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivSizeUnitValue deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper typeHelper = DivSizeUnitValueJsonParser.TYPE_HELPER_UNIT;
            Function1 function1 = DivSizeUnit.FROM_STRING;
            Expression expression = DivSizeUnitValueJsonParser.UNIT_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "unit", typeHelper, function1, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new DivSizeUnitValue(expression, JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, DivSizeUnitValueJsonParser.VALUE_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivSizeUnitValue divSizeUnitValue) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "unit", divSizeUnitValue.unit, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", divSizeUnitValue.value);
            return jSONObject;
        }
    }

    /* compiled from: DivSizeUnitValueJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivSizeUnitValueTemplate deserialize(ParsingContext parsingContext, DivSizeUnitValueTemplate divSizeUnitValueTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivSizeUnitValueTemplate(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "unit", DivSizeUnitValueJsonParser.TYPE_HELPER_UNIT, allowPropertyOverride, divSizeUnitValueTemplate != null ? divSizeUnitValueTemplate.unit : null, DivSizeUnit.FROM_STRING), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, divSizeUnitValueTemplate != null ? divSizeUnitValueTemplate.value : null, ParsingConvertersKt.NUMBER_TO_INT, DivSizeUnitValueJsonParser.VALUE_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivSizeUnitValueTemplate divSizeUnitValueTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "unit", divSizeUnitValueTemplate.unit, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", divSizeUnitValueTemplate.value);
            return jSONObject;
        }
    }

    /* compiled from: DivSizeUnitValueJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivSizeUnitValue resolve(ParsingContext parsingContext, DivSizeUnitValueTemplate divSizeUnitValueTemplate, JSONObject jSONObject) {
            Field field = divSizeUnitValueTemplate.unit;
            TypeHelper typeHelper = DivSizeUnitValueJsonParser.TYPE_HELPER_UNIT;
            Function1 function1 = DivSizeUnit.FROM_STRING;
            Expression expression = DivSizeUnitValueJsonParser.UNIT_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "unit", typeHelper, function1, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new DivSizeUnitValue(expression, JsonFieldResolver.resolveExpression(parsingContext, divSizeUnitValueTemplate.value, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, DivSizeUnitValueJsonParser.VALUE_VALIDATOR));
        }
    }

    /* compiled from: DivSizeUnitValueJsonParser.kt */
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
        TYPE_HELPER_UNIT = TypeHelper.INSTANCE.from(divSizeUnit, new Function1() { // from class: com.yandex.div2.DivSizeUnitValueJsonParser$Companion$TYPE_HELPER_UNIT$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
        VALUE_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivSizeUnitValueJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean VALUE_VALIDATOR$lambda$0;
                VALUE_VALIDATOR$lambda$0 = DivSizeUnitValueJsonParser.VALUE_VALIDATOR$lambda$0(((Long) obj).longValue());
                return VALUE_VALIDATOR$lambda$0;
            }
        };
    }
}
