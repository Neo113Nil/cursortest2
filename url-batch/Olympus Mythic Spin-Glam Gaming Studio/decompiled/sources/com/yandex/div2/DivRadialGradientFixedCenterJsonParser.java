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

/* compiled from: DivRadialGradientFixedCenterJsonParser.kt */
/* loaded from: classes9.dex */
public abstract class DivRadialGradientFixedCenterJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final TypeHelper TYPE_HELPER_UNIT;
    public static final Expression UNIT_DEFAULT_VALUE;

    /* compiled from: DivRadialGradientFixedCenterJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivRadialGradientFixedCenter deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper typeHelper = DivRadialGradientFixedCenterJsonParser.TYPE_HELPER_UNIT;
            Function1 function1 = DivSizeUnit.FROM_STRING;
            Expression expression = DivRadialGradientFixedCenterJsonParser.UNIT_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "unit", typeHelper, function1, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new DivRadialGradientFixedCenter(expression, JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivRadialGradientFixedCenter divRadialGradientFixedCenter) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "fixed");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "unit", divRadialGradientFixedCenter.unit, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", divRadialGradientFixedCenter.value);
            return jSONObject;
        }
    }

    /* compiled from: DivRadialGradientFixedCenterJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivRadialGradientFixedCenterTemplate deserialize(ParsingContext parsingContext, DivRadialGradientFixedCenterTemplate divRadialGradientFixedCenterTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivRadialGradientFixedCenterTemplate(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "unit", DivRadialGradientFixedCenterJsonParser.TYPE_HELPER_UNIT, allowPropertyOverride, divRadialGradientFixedCenterTemplate != null ? divRadialGradientFixedCenterTemplate.unit : null, DivSizeUnit.FROM_STRING), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, divRadialGradientFixedCenterTemplate != null ? divRadialGradientFixedCenterTemplate.value : null, ParsingConvertersKt.NUMBER_TO_INT));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivRadialGradientFixedCenterTemplate divRadialGradientFixedCenterTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "fixed");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "unit", divRadialGradientFixedCenterTemplate.unit, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", divRadialGradientFixedCenterTemplate.value);
            return jSONObject;
        }
    }

    /* compiled from: DivRadialGradientFixedCenterJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivRadialGradientFixedCenter resolve(ParsingContext parsingContext, DivRadialGradientFixedCenterTemplate divRadialGradientFixedCenterTemplate, JSONObject jSONObject) {
            Field field = divRadialGradientFixedCenterTemplate.unit;
            TypeHelper typeHelper = DivRadialGradientFixedCenterJsonParser.TYPE_HELPER_UNIT;
            Function1 function1 = DivSizeUnit.FROM_STRING;
            Expression expression = DivRadialGradientFixedCenterJsonParser.UNIT_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "unit", typeHelper, function1, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new DivRadialGradientFixedCenter(expression, JsonFieldResolver.resolveExpression(parsingContext, divRadialGradientFixedCenterTemplate.value, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT));
        }
    }

    /* compiled from: DivRadialGradientFixedCenterJsonParser.kt */
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
        TYPE_HELPER_UNIT = TypeHelper.INSTANCE.from(divSizeUnit, new Function1() { // from class: com.yandex.div2.DivRadialGradientFixedCenterJsonParser$Companion$TYPE_HELPER_UNIT$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
    }
}
