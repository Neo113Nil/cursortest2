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
import com.yandex.div2.DivActionScrollBy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivActionScrollByJsonParser.kt */
/* loaded from: classes10.dex */
public abstract class DivActionScrollByJsonParser {
    public static final Expression ANIMATED_DEFAULT_VALUE;
    private static final Companion Companion = new Companion(null);
    public static final Expression ITEM_COUNT_DEFAULT_VALUE;
    public static final Expression OFFSET_DEFAULT_VALUE;
    public static final Expression OVERFLOW_DEFAULT_VALUE;
    public static final TypeHelper TYPE_HELPER_OVERFLOW;

    /* compiled from: DivActionScrollByJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivActionScrollBy deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = DivActionScrollByJsonParser.ANIMATED_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "animated", typeHelper, function1, expression);
            Expression expression2 = readOptionalExpression == null ? expression : readOptionalExpression;
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING);
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expression3 = DivActionScrollByJsonParser.ITEM_COUNT_DEFAULT_VALUE;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "item_count", typeHelper2, function12, expression3);
            if (readOptionalExpression2 != null) {
                expression3 = readOptionalExpression2;
            }
            Expression expression4 = DivActionScrollByJsonParser.OFFSET_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "offset", typeHelper2, function12, expression4);
            if (readOptionalExpression3 != null) {
                expression4 = readOptionalExpression3;
            }
            TypeHelper typeHelper3 = DivActionScrollByJsonParser.TYPE_HELPER_OVERFLOW;
            Function1 function13 = DivActionScrollBy.Overflow.FROM_STRING;
            Expression expression5 = DivActionScrollByJsonParser.OVERFLOW_DEFAULT_VALUE;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "overflow", typeHelper3, function13, expression5);
            if (readOptionalExpression4 == null) {
                readOptionalExpression4 = expression5;
            }
            return new DivActionScrollBy(expression2, readExpression, expression3, expression4, readOptionalExpression4);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivActionScrollBy divActionScrollBy) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "animated", divActionScrollBy.animated);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "id", divActionScrollBy.id);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "item_count", divActionScrollBy.itemCount);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "offset", divActionScrollBy.offset);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "overflow", divActionScrollBy.overflow, DivActionScrollBy.Overflow.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "scroll_by");
            return jSONObject;
        }
    }

    /* compiled from: DivActionScrollByJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivActionScrollByTemplate deserialize(ParsingContext parsingContext, DivActionScrollByTemplate divActionScrollByTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "animated", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divActionScrollByTemplate != null ? divActionScrollByTemplate.animated : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divActionScrollByTemplate != null ? divActionScrollByTemplate.id : null);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = divActionScrollByTemplate != null ? divActionScrollByTemplate.itemCount : null;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivActionScrollByTemplate(readOptionalFieldWithExpression, readFieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "item_count", typeHelper, allowPropertyOverride, field, function1), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "offset", typeHelper, allowPropertyOverride, divActionScrollByTemplate != null ? divActionScrollByTemplate.offset : null, function1), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "overflow", DivActionScrollByJsonParser.TYPE_HELPER_OVERFLOW, allowPropertyOverride, divActionScrollByTemplate != null ? divActionScrollByTemplate.overflow : null, DivActionScrollBy.Overflow.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivActionScrollByTemplate divActionScrollByTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "animated", divActionScrollByTemplate.animated);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "id", divActionScrollByTemplate.id);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "item_count", divActionScrollByTemplate.itemCount);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "offset", divActionScrollByTemplate.offset);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "overflow", divActionScrollByTemplate.overflow, DivActionScrollBy.Overflow.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "scroll_by");
            return jSONObject;
        }
    }

    /* compiled from: DivActionScrollByJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivActionScrollBy resolve(ParsingContext parsingContext, DivActionScrollByTemplate divActionScrollByTemplate, JSONObject jSONObject) {
            Field field = divActionScrollByTemplate.animated;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = DivActionScrollByJsonParser.ANIMATED_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "animated", typeHelper, function1, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divActionScrollByTemplate.id, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING);
            Field field2 = divActionScrollByTemplate.itemCount;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_INT;
            Expression expression2 = DivActionScrollByJsonParser.ITEM_COUNT_DEFAULT_VALUE;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "item_count", typeHelper2, function12, expression2);
            if (resolveOptionalExpression2 != null) {
                expression2 = resolveOptionalExpression2;
            }
            Field field3 = divActionScrollByTemplate.offset;
            Expression expression3 = DivActionScrollByJsonParser.OFFSET_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "offset", typeHelper2, function12, expression3);
            Expression expression4 = resolveOptionalExpression3 == null ? expression3 : resolveOptionalExpression3;
            Field field4 = divActionScrollByTemplate.overflow;
            TypeHelper typeHelper3 = DivActionScrollByJsonParser.TYPE_HELPER_OVERFLOW;
            Function1 function13 = DivActionScrollBy.Overflow.FROM_STRING;
            Expression expression5 = DivActionScrollByJsonParser.OVERFLOW_DEFAULT_VALUE;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "overflow", typeHelper3, function13, expression5);
            return new DivActionScrollBy(expression, resolveExpression, expression2, expression4, resolveOptionalExpression4 == null ? expression5 : resolveOptionalExpression4);
        }
    }

    /* compiled from: DivActionScrollByJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        ANIMATED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        ITEM_COUNT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        OFFSET_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        DivActionScrollBy.Overflow overflow = DivActionScrollBy.Overflow.CLAMP;
        OVERFLOW_DEFAULT_VALUE = Expression.Companion.constant$default(companion, overflow, null, 2, null);
        TYPE_HELPER_OVERFLOW = TypeHelper.INSTANCE.from(overflow, new Function1() { // from class: com.yandex.div2.DivActionScrollByJsonParser$Companion$TYPE_HELPER_OVERFLOW$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivActionScrollBy.Overflow);
            }
        });
    }
}
