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
import org.json.JSONObject;

/* compiled from: DivShadowJsonParser.kt */
/* loaded from: classes13.dex */
public abstract class DivShadowJsonParser {
    public static final Expression ALPHA_DEFAULT_VALUE;
    public static final ValueValidator ALPHA_VALIDATOR;
    public static final Expression BLUR_DEFAULT_VALUE;
    public static final ValueValidator BLUR_VALIDATOR;
    public static final Expression COLOR_DEFAULT_VALUE;
    private static final Companion Companion = new Companion(null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ALPHA_VALIDATOR$lambda$0(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BLUR_VALIDATOR$lambda$1(long j) {
        return j >= 0;
    }

    /* compiled from: DivShadowJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivShadow deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivShadowJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivShadowJsonParser.ALPHA_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator2 = DivShadowJsonParser.BLUR_VALIDATOR;
            Expression expression2 = DivShadowJsonParser.BLUR_DEFAULT_VALUE;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "blur", typeHelper2, function12, valueValidator2, expression2);
            if (readOptionalExpression2 != null) {
                expression2 = readOptionalExpression2;
            }
            TypeHelper<Integer> typeHelper3 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1 function13 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression3 = DivShadowJsonParser.COLOR_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "color", typeHelper3, function13, expression3);
            if (readOptionalExpression3 != null) {
                expression3 = readOptionalExpression3;
            }
            return new DivShadow(expression, expression2, expression3, (DivPoint) JsonPropertyParser.read(parsingContext, jSONObject, "offset", this.component.getDivPointJsonEntityParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivShadow divShadow) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divShadow.alpha);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "blur", divShadow.blur);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", divShadow.color, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "offset", divShadow.offset, this.component.getDivPointJsonEntityParser());
            return jSONObject;
        }
    }

    /* compiled from: DivShadowJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivShadowTemplate deserialize(ParsingContext parsingContext, DivShadowTemplate divShadowTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivShadowTemplate(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divShadowTemplate != null ? divShadowTemplate.alpha : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivShadowJsonParser.ALPHA_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "blur", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, divShadowTemplate != null ? divShadowTemplate.blur : null, ParsingConvertersKt.NUMBER_TO_INT, DivShadowJsonParser.BLUR_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, divShadowTemplate != null ? divShadowTemplate.color : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "offset", allowPropertyOverride, divShadowTemplate != null ? divShadowTemplate.offset : null, this.component.getDivPointJsonTemplateParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivShadowTemplate divShadowTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divShadowTemplate.alpha);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "blur", divShadowTemplate.blur);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", divShadowTemplate.color, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "offset", divShadowTemplate.offset, this.component.getDivPointJsonTemplateParser());
            return jSONObject;
        }
    }

    /* compiled from: DivShadowJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivShadow resolve(ParsingContext parsingContext, DivShadowTemplate divShadowTemplate, JSONObject jSONObject) {
            Field field = divShadowTemplate.alpha;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivShadowJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivShadowJsonParser.ALPHA_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            Field field2 = divShadowTemplate.blur;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator2 = DivShadowJsonParser.BLUR_VALIDATOR;
            Expression expression2 = DivShadowJsonParser.BLUR_DEFAULT_VALUE;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "blur", typeHelper2, function12, valueValidator2, expression2);
            if (resolveOptionalExpression2 != null) {
                expression2 = resolveOptionalExpression2;
            }
            Field field3 = divShadowTemplate.color;
            TypeHelper<Integer> typeHelper3 = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1 function13 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression3 = DivShadowJsonParser.COLOR_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "color", typeHelper3, function13, expression3);
            if (resolveOptionalExpression3 != null) {
                expression3 = resolveOptionalExpression3;
            }
            return new DivShadow(expression, expression2, expression3, (DivPoint) JsonFieldResolver.resolve(parsingContext, divShadowTemplate.offset, jSONObject, "offset", this.component.getDivPointJsonTemplateResolver(), this.component.getDivPointJsonEntityParser()));
        }
    }

    /* compiled from: DivShadowJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        ALPHA_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(0.19d), null, 2, null);
        BLUR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 2L, null, 2, null);
        COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0, null, 2, null);
        ALPHA_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivShadowJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ALPHA_VALIDATOR$lambda$0;
                ALPHA_VALIDATOR$lambda$0 = DivShadowJsonParser.ALPHA_VALIDATOR$lambda$0(((Double) obj).doubleValue());
                return ALPHA_VALIDATOR$lambda$0;
            }
        };
        BLUR_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivShadowJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean BLUR_VALIDATOR$lambda$1;
                BLUR_VALIDATOR$lambda$1 = DivShadowJsonParser.BLUR_VALIDATOR$lambda$1(((Long) obj).longValue());
                return BLUR_VALIDATOR$lambda$1;
            }
        };
    }
}
