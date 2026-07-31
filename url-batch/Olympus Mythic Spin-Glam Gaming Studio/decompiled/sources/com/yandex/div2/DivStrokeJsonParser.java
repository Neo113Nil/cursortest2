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
import com.yandex.div2.DivStrokeStyle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivStrokeJsonParser.kt */
/* loaded from: classes.dex */
public abstract class DivStrokeJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final DivStrokeStyle.Solid STYLE_DEFAULT_VALUE = new DivStrokeStyle.Solid(new DivStrokeStyleSolid());
    public static final TypeHelper TYPE_HELPER_UNIT;
    public static final Expression UNIT_DEFAULT_VALUE;
    public static final Expression WIDTH_DEFAULT_VALUE;
    public static final ValueValidator WIDTH_VALIDATOR;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean WIDTH_VALIDATOR$lambda$0(double d) {
        return d >= 0.0d;
    }

    /* compiled from: DivStrokeJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivStroke deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            DivStrokeStyle divStrokeStyle = (DivStrokeStyle) JsonPropertyParser.readOptional(parsingContext, jSONObject, "style", this.component.getDivStrokeStyleJsonEntityParser());
            if (divStrokeStyle == null) {
                divStrokeStyle = DivStrokeJsonParser.STYLE_DEFAULT_VALUE;
            }
            DivStrokeStyle divStrokeStyle2 = divStrokeStyle;
            TypeHelper typeHelper = DivStrokeJsonParser.TYPE_HELPER_UNIT;
            Function1 function1 = DivSizeUnit.FROM_STRING;
            Expression expression = DivStrokeJsonParser.UNIT_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "unit", typeHelper, function1, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivStrokeJsonParser.WIDTH_VALIDATOR;
            Expression expression2 = DivStrokeJsonParser.WIDTH_DEFAULT_VALUE;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "width", typeHelper2, function12, valueValidator, expression2);
            if (readOptionalExpression2 != null) {
                expression2 = readOptionalExpression2;
            }
            return new DivStroke(readExpression, divStrokeStyle2, expression, expression2);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivStroke divStroke) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", divStroke.color, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "style", divStroke.style, this.component.getDivStrokeStyleJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "unit", divStroke.unit, DivSizeUnit.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "width", divStroke.width);
            return jSONObject;
        }
    }

    /* compiled from: DivStrokeJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivStrokeTemplate deserialize(ParsingContext parsingContext, DivStrokeTemplate divStrokeTemplate, JSONObject jSONObject) {
            TemplateParserImpl templateParserImpl;
            Field field;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, divStrokeTemplate != null ? divStrokeTemplate.color : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            if (divStrokeTemplate != null) {
                templateParserImpl = this;
                field = divStrokeTemplate.style;
            } else {
                templateParserImpl = this;
                field = null;
            }
            return new DivStrokeTemplate(readFieldWithExpression, JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "style", allowPropertyOverride, field, templateParserImpl.component.getDivStrokeStyleJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "unit", DivStrokeJsonParser.TYPE_HELPER_UNIT, allowPropertyOverride, divStrokeTemplate != null ? divStrokeTemplate.unit : null, DivSizeUnit.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "width", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divStrokeTemplate != null ? divStrokeTemplate.width : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivStrokeJsonParser.WIDTH_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivStrokeTemplate divStrokeTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", divStrokeTemplate.color, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "style", divStrokeTemplate.style, this.component.getDivStrokeStyleJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "unit", divStrokeTemplate.unit, DivSizeUnit.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "width", divStrokeTemplate.width);
            return jSONObject;
        }
    }

    /* compiled from: DivStrokeJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivStroke resolve(ParsingContext parsingContext, DivStrokeTemplate divStrokeTemplate, JSONObject jSONObject) {
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divStrokeTemplate.color, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            DivStrokeStyle divStrokeStyle = (DivStrokeStyle) JsonFieldResolver.resolveOptional(parsingContext, divStrokeTemplate.style, jSONObject, "style", this.component.getDivStrokeStyleJsonTemplateResolver(), this.component.getDivStrokeStyleJsonEntityParser());
            if (divStrokeStyle == null) {
                divStrokeStyle = DivStrokeJsonParser.STYLE_DEFAULT_VALUE;
            }
            Field field = divStrokeTemplate.unit;
            TypeHelper typeHelper = DivStrokeJsonParser.TYPE_HELPER_UNIT;
            Function1 function1 = DivSizeUnit.FROM_STRING;
            Expression expression = DivStrokeJsonParser.UNIT_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "unit", typeHelper, function1, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            Field field2 = divStrokeTemplate.width;
            TypeHelper<Double> typeHelper2 = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivStrokeJsonParser.WIDTH_VALIDATOR;
            Expression expression2 = DivStrokeJsonParser.WIDTH_DEFAULT_VALUE;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "width", typeHelper2, function12, valueValidator, expression2);
            if (resolveOptionalExpression2 != null) {
                expression2 = resolveOptionalExpression2;
            }
            return new DivStroke(resolveExpression, divStrokeStyle, expression, expression2);
        }
    }

    /* compiled from: DivStrokeJsonParser.kt */
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
        WIDTH_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        TYPE_HELPER_UNIT = TypeHelper.INSTANCE.from(divSizeUnit, new Function1() { // from class: com.yandex.div2.DivStrokeJsonParser$Companion$TYPE_HELPER_UNIT$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
        WIDTH_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivStrokeJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean WIDTH_VALIDATOR$lambda$0;
                WIDTH_VALIDATOR$lambda$0 = DivStrokeJsonParser.WIDTH_VALIDATOR$lambda$0(((Double) obj).doubleValue());
                return WIDTH_VALIDATOR$lambda$0;
            }
        };
    }
}
