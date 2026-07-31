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
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivPivotFixedJsonParser.kt */
/* loaded from: classes8.dex */
public abstract class DivPivotFixedJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final TypeHelper TYPE_HELPER_UNIT;
    public static final Expression UNIT_DEFAULT_VALUE;

    /* compiled from: DivPivotFixedJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivPivotFixed deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper typeHelper = DivPivotFixedJsonParser.TYPE_HELPER_UNIT;
            Function1 function1 = DivSizeUnit.FROM_STRING;
            Expression expression = DivPivotFixedJsonParser.UNIT_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "unit", typeHelper, function1, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new DivPivotFixed(expression, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivPivotFixed divPivotFixed) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "pivot-fixed");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "unit", divPivotFixed.unit, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", divPivotFixed.value);
            return jSONObject;
        }
    }

    /* compiled from: DivPivotFixedJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivPivotFixedTemplate deserialize(ParsingContext parsingContext, DivPivotFixedTemplate divPivotFixedTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivPivotFixedTemplate(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "unit", DivPivotFixedJsonParser.TYPE_HELPER_UNIT, allowPropertyOverride, divPivotFixedTemplate != null ? divPivotFixedTemplate.unit : null, DivSizeUnit.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, divPivotFixedTemplate != null ? divPivotFixedTemplate.value : null, ParsingConvertersKt.NUMBER_TO_INT));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivPivotFixedTemplate divPivotFixedTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "pivot-fixed");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "unit", divPivotFixedTemplate.unit, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", divPivotFixedTemplate.value);
            return jSONObject;
        }
    }

    /* compiled from: DivPivotFixedJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivPivotFixed resolve(ParsingContext parsingContext, DivPivotFixedTemplate divPivotFixedTemplate, JSONObject jSONObject) {
            Field field = divPivotFixedTemplate.unit;
            TypeHelper typeHelper = DivPivotFixedJsonParser.TYPE_HELPER_UNIT;
            Function1 function1 = DivSizeUnit.FROM_STRING;
            Expression expression = DivPivotFixedJsonParser.UNIT_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "unit", typeHelper, function1, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new DivPivotFixed(expression, JsonFieldResolver.resolveOptionalExpression(parsingContext, divPivotFixedTemplate.value, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT));
        }
    }

    /* compiled from: DivPivotFixedJsonParser.kt */
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
        TYPE_HELPER_UNIT = TypeHelper.INSTANCE.from(divSizeUnit, new Function1() { // from class: com.yandex.div2.DivPivotFixedJsonParser$Companion$TYPE_HELPER_UNIT$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
    }
}
