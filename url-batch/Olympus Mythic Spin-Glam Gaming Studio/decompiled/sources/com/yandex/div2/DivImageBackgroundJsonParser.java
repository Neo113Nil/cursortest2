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
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivImageBackgroundJsonParser.kt */
/* loaded from: classes8.dex */
public abstract class DivImageBackgroundJsonParser {
    public static final Expression ALPHA_DEFAULT_VALUE;
    public static final ValueValidator ALPHA_VALIDATOR;
    public static final Expression CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE;
    public static final Expression CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE;
    private static final Companion Companion = new Companion(null);
    public static final Expression PRELOAD_REQUIRED_DEFAULT_VALUE;
    public static final Expression SCALE_DEFAULT_VALUE;
    public static final TypeHelper TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL;
    public static final TypeHelper TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL;
    public static final TypeHelper TYPE_HELPER_SCALE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ALPHA_VALIDATOR$lambda$0(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* compiled from: DivImageBackgroundJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivImageBackground deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivImageBackgroundJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivImageBackgroundJsonParser.ALPHA_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            TypeHelper typeHelper2 = DivImageBackgroundJsonParser.TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL;
            Function1 function12 = DivAlignmentHorizontal.FROM_STRING;
            Expression expression2 = DivImageBackgroundJsonParser.CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_horizontal", typeHelper2, function12, expression2);
            if (readOptionalExpression2 != null) {
                expression2 = readOptionalExpression2;
            }
            TypeHelper typeHelper3 = DivImageBackgroundJsonParser.TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL;
            Function1 function13 = DivAlignmentVertical.FROM_STRING;
            Expression expression3 = DivImageBackgroundJsonParser.CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "content_alignment_vertical", typeHelper3, function13, expression3);
            if (readOptionalExpression3 != null) {
                expression3 = readOptionalExpression3;
            }
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "filters", this.component.getDivFilterJsonEntityParser());
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression4 = DivImageBackgroundJsonParser.PRELOAD_REQUIRED_DEFAULT_VALUE;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preload_required", typeHelper4, function14, expression4);
            if (readOptionalExpression4 != null) {
                expression4 = readOptionalExpression4;
            }
            TypeHelper typeHelper5 = DivImageBackgroundJsonParser.TYPE_HELPER_SCALE;
            Function1 function15 = DivImageScale.FROM_STRING;
            Expression expression5 = DivImageBackgroundJsonParser.SCALE_DEFAULT_VALUE;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "scale", typeHelper5, function15, expression5);
            return new DivImageBackground(expression, expression2, expression3, readOptionalList, readExpression, expression4, readOptionalExpression5 == null ? expression5 : readOptionalExpression5);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivImageBackground divImageBackground) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alpha", divImageBackground.alpha);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_horizontal", divImageBackground.contentAlignmentHorizontal, DivAlignmentHorizontal.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "content_alignment_vertical", divImageBackground.contentAlignmentVertical, DivAlignmentVertical.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "filters", divImageBackground.filters, this.component.getDivFilterJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "image_url", divImageBackground.imageUrl, ParsingConvertersKt.URI_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preload_required", divImageBackground.preloadRequired);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "scale", divImageBackground.scale, DivImageScale.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "image");
            return jSONObject;
        }
    }

    /* compiled from: DivImageBackgroundJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivImageBackgroundTemplate deserialize(ParsingContext parsingContext, DivImageBackgroundTemplate divImageBackgroundTemplate, JSONObject jSONObject) {
            TemplateParserImpl templateParserImpl;
            Field field;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alpha", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divImageBackgroundTemplate != null ? divImageBackgroundTemplate.alpha : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivImageBackgroundJsonParser.ALPHA_VALIDATOR);
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "content_alignment_horizontal", DivImageBackgroundJsonParser.TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL, allowPropertyOverride, divImageBackgroundTemplate != null ? divImageBackgroundTemplate.contentAlignmentHorizontal : null, DivAlignmentHorizontal.FROM_STRING);
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "content_alignment_vertical", DivImageBackgroundJsonParser.TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL, allowPropertyOverride, divImageBackgroundTemplate != null ? divImageBackgroundTemplate.contentAlignmentVertical : null, DivAlignmentVertical.FROM_STRING);
            if (divImageBackgroundTemplate != null) {
                templateParserImpl = this;
                field = divImageBackgroundTemplate.filters;
            } else {
                templateParserImpl = this;
                field = null;
            }
            return new DivImageBackgroundTemplate(readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "filters", allowPropertyOverride, field, templateParserImpl.component.getDivFilterJsonTemplateParser()), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, divImageBackgroundTemplate != null ? divImageBackgroundTemplate.imageUrl : null, ParsingConvertersKt.ANY_TO_URI), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "preload_required", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divImageBackgroundTemplate != null ? divImageBackgroundTemplate.preloadRequired : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "scale", DivImageBackgroundJsonParser.TYPE_HELPER_SCALE, allowPropertyOverride, divImageBackgroundTemplate != null ? divImageBackgroundTemplate.scale : null, DivImageScale.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivImageBackgroundTemplate divImageBackgroundTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alpha", divImageBackgroundTemplate.alpha);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_horizontal", divImageBackgroundTemplate.contentAlignmentHorizontal, DivAlignmentHorizontal.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "content_alignment_vertical", divImageBackgroundTemplate.contentAlignmentVertical, DivAlignmentVertical.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "filters", divImageBackgroundTemplate.filters, this.component.getDivFilterJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "image_url", divImageBackgroundTemplate.imageUrl, ParsingConvertersKt.URI_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preload_required", divImageBackgroundTemplate.preloadRequired);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "scale", divImageBackgroundTemplate.scale, DivImageScale.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "image");
            return jSONObject;
        }
    }

    /* compiled from: DivImageBackgroundJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivImageBackground resolve(ParsingContext parsingContext, DivImageBackgroundTemplate divImageBackgroundTemplate, JSONObject jSONObject) {
            Field field = divImageBackgroundTemplate.alpha;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivImageBackgroundJsonParser.ALPHA_VALIDATOR;
            Expression expression = DivImageBackgroundJsonParser.ALPHA_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alpha", typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            Field field2 = divImageBackgroundTemplate.contentAlignmentHorizontal;
            TypeHelper typeHelper2 = DivImageBackgroundJsonParser.TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL;
            Function1 function12 = DivAlignmentHorizontal.FROM_STRING;
            Expression expression2 = DivImageBackgroundJsonParser.CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "content_alignment_horizontal", typeHelper2, function12, expression2);
            if (resolveOptionalExpression2 != null) {
                expression2 = resolveOptionalExpression2;
            }
            Field field3 = divImageBackgroundTemplate.contentAlignmentVertical;
            TypeHelper typeHelper3 = DivImageBackgroundJsonParser.TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL;
            Function1 function13 = DivAlignmentVertical.FROM_STRING;
            Expression expression3 = DivImageBackgroundJsonParser.CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "content_alignment_vertical", typeHelper3, function13, expression3);
            if (resolveOptionalExpression3 != null) {
                expression3 = resolveOptionalExpression3;
            }
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divImageBackgroundTemplate.filters, jSONObject, "filters", this.component.getDivFilterJsonTemplateResolver(), this.component.getDivFilterJsonEntityParser());
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divImageBackgroundTemplate.imageUrl, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            Field field4 = divImageBackgroundTemplate.preloadRequired;
            TypeHelper<Boolean> typeHelper4 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function14 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression4 = DivImageBackgroundJsonParser.PRELOAD_REQUIRED_DEFAULT_VALUE;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "preload_required", typeHelper4, function14, expression4);
            if (resolveOptionalExpression4 != null) {
                expression4 = resolveOptionalExpression4;
            }
            Field field5 = divImageBackgroundTemplate.scale;
            TypeHelper typeHelper5 = DivImageBackgroundJsonParser.TYPE_HELPER_SCALE;
            Function1 function15 = DivImageScale.FROM_STRING;
            Expression expression5 = DivImageBackgroundJsonParser.SCALE_DEFAULT_VALUE;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "scale", typeHelper5, function15, expression5);
            if (resolveOptionalExpression5 == null) {
                resolveOptionalExpression5 = expression5;
            }
            return new DivImageBackground(expression, expression2, expression3, resolveOptionalList, resolveExpression, expression4, resolveOptionalExpression5);
        }
    }

    /* compiled from: DivImageBackgroundJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        ALPHA_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.CENTER;
        CONTENT_ALIGNMENT_HORIZONTAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divAlignmentHorizontal, null, 2, null);
        DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.CENTER;
        CONTENT_ALIGNMENT_VERTICAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divAlignmentVertical, null, 2, null);
        PRELOAD_REQUIRED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        DivImageScale divImageScale = DivImageScale.FILL;
        SCALE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divImageScale, null, 2, null);
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL = companion2.from(divAlignmentHorizontal, new Function1() { // from class: com.yandex.div2.DivImageBackgroundJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_HORIZONTAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentHorizontal);
            }
        });
        TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL = companion2.from(divAlignmentVertical, new Function1() { // from class: com.yandex.div2.DivImageBackgroundJsonParser$Companion$TYPE_HELPER_CONTENT_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAlignmentVertical);
            }
        });
        TYPE_HELPER_SCALE = companion2.from(divImageScale, new Function1() { // from class: com.yandex.div2.DivImageBackgroundJsonParser$Companion$TYPE_HELPER_SCALE$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivImageScale);
            }
        });
        ALPHA_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivImageBackgroundJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean ALPHA_VALIDATOR$lambda$0;
                ALPHA_VALIDATOR$lambda$0 = DivImageBackgroundJsonParser.ALPHA_VALIDATOR$lambda$0(((Double) obj).doubleValue());
                return ALPHA_VALIDATOR$lambda$0;
            }
        };
    }
}
