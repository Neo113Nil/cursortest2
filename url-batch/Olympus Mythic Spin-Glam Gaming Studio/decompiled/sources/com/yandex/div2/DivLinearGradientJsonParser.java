package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
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
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivLinearGradientJsonParser.kt */
/* loaded from: classes10.dex */
public abstract class DivLinearGradientJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final Expression ANGLE_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, 0L, null, 2, null);
    public static final ValueValidator ANGLE_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivLinearGradientJsonParser$$ExternalSyntheticLambda0
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean ANGLE_VALIDATOR$lambda$0;
            ANGLE_VALIDATOR$lambda$0 = DivLinearGradientJsonParser.ANGLE_VALIDATOR$lambda$0(((Long) obj).longValue());
            return ANGLE_VALIDATOR$lambda$0;
        }
    };
    public static final ListValidator COLORS_VALIDATOR = new ListValidator() { // from class: com.yandex.div2.DivLinearGradientJsonParser$$ExternalSyntheticLambda1
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            boolean COLORS_VALIDATOR$lambda$1;
            COLORS_VALIDATOR$lambda$1 = DivLinearGradientJsonParser.COLORS_VALIDATOR$lambda$1(list);
            return COLORS_VALIDATOR$lambda$1;
        }
    };
    public static final ListValidator COLOR_MAP_VALIDATOR = new ListValidator() { // from class: com.yandex.div2.DivLinearGradientJsonParser$$ExternalSyntheticLambda2
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            boolean COLOR_MAP_VALIDATOR$lambda$2;
            COLOR_MAP_VALIDATOR$lambda$2 = DivLinearGradientJsonParser.COLOR_MAP_VALIDATOR$lambda$2(list);
            return COLOR_MAP_VALIDATOR$lambda$2;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ANGLE_VALIDATOR$lambda$0(long j) {
        return j >= 0 && j <= 360;
    }

    /* compiled from: DivLinearGradientJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivLinearGradient deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = DivLinearGradientJsonParser.ANGLE_VALIDATOR;
            Expression expression = DivLinearGradientJsonParser.ANGLE_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "angle", typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new DivLinearGradient(expression, JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "color_map", this.component.getDivLinearGradientColorPointJsonEntityParser(), DivLinearGradientJsonParser.COLOR_MAP_VALIDATOR), JsonExpressionParser.readOptionalExpressionList(parsingContext, jSONObject, "colors", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, DivLinearGradientJsonParser.COLORS_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivLinearGradient divLinearGradient) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "angle", divLinearGradient.angle);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "color_map", divLinearGradient.colorMap, this.component.getDivLinearGradientColorPointJsonEntityParser());
            JsonExpressionParser.writeExpressionList(parsingContext, jSONObject, "colors", divLinearGradient.colors, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "gradient");
            return jSONObject;
        }
    }

    /* compiled from: DivLinearGradientJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivLinearGradientTemplate deserialize(ParsingContext parsingContext, DivLinearGradientTemplate divLinearGradientTemplate, JSONObject jSONObject) {
            TemplateParserImpl templateParserImpl;
            Field field;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "angle", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, divLinearGradientTemplate != null ? divLinearGradientTemplate.angle : null, ParsingConvertersKt.NUMBER_TO_INT, DivLinearGradientJsonParser.ANGLE_VALIDATOR);
            if (divLinearGradientTemplate != null) {
                templateParserImpl = this;
                field = divLinearGradientTemplate.colorMap;
            } else {
                templateParserImpl = this;
                field = null;
            }
            Lazy divLinearGradientColorPointJsonTemplateParser = templateParserImpl.component.getDivLinearGradientColorPointJsonTemplateParser();
            ListValidator listValidator = DivLinearGradientJsonParser.COLOR_MAP_VALIDATOR;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "color_map", allowPropertyOverride, field, divLinearGradientColorPointJsonTemplateParser, listValidator);
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field field2 = divLinearGradientTemplate != null ? divLinearGradientTemplate.colors : null;
            Function1 function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            ListValidator listValidator2 = DivLinearGradientJsonParser.COLORS_VALIDATOR;
            Intrinsics.checkNotNull(listValidator2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivLinearGradientTemplate(readOptionalFieldWithExpression, readOptionalListField, JsonFieldParser.readOptionalExpressionListField(restrictPropertyOverride, jSONObject, "colors", typeHelper, allowPropertyOverride, field2, function1, listValidator2));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivLinearGradientTemplate divLinearGradientTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "angle", divLinearGradientTemplate.angle);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "color_map", divLinearGradientTemplate.colorMap, this.component.getDivLinearGradientColorPointJsonTemplateParser());
            JsonFieldParser.writeExpressionListField(parsingContext, jSONObject, "colors", divLinearGradientTemplate.colors, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "gradient");
            return jSONObject;
        }
    }

    /* compiled from: DivLinearGradientJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivLinearGradient resolve(ParsingContext parsingContext, DivLinearGradientTemplate divLinearGradientTemplate, JSONObject jSONObject) {
            Field field = divLinearGradientTemplate.angle;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = DivLinearGradientJsonParser.ANGLE_VALIDATOR;
            Expression expression = DivLinearGradientJsonParser.ANGLE_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "angle", typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new DivLinearGradient(expression, JsonFieldResolver.resolveOptionalList(parsingContext, divLinearGradientTemplate.colorMap, jSONObject, "color_map", this.component.getDivLinearGradientColorPointJsonTemplateResolver(), this.component.getDivLinearGradientColorPointJsonEntityParser(), DivLinearGradientJsonParser.COLOR_MAP_VALIDATOR), JsonFieldResolver.resolveOptionalExpressionList(parsingContext, divLinearGradientTemplate.colors, jSONObject, "colors", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, DivLinearGradientJsonParser.COLORS_VALIDATOR));
        }
    }

    /* compiled from: DivLinearGradientJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean COLORS_VALIDATOR$lambda$1(List list) {
        return list.size() >= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean COLOR_MAP_VALIDATOR$lambda$2(List list) {
        return list.size() >= 2;
    }
}
