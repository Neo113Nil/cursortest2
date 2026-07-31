package com.yandex.div2;

import com.facebook.appevents.internal.ViewHierarchyConstants;
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

/* compiled from: DivEdgeInsetsJsonParser.kt */
/* loaded from: classes8.dex */
public abstract class DivEdgeInsetsJsonParser {
    public static final Expression BOTTOM_DEFAULT_VALUE;
    public static final ValueValidator BOTTOM_VALIDATOR;
    private static final Companion Companion = new Companion(null);
    public static final ValueValidator END_VALIDATOR;
    public static final Expression LEFT_DEFAULT_VALUE;
    public static final ValueValidator LEFT_VALIDATOR;
    public static final Expression RIGHT_DEFAULT_VALUE;
    public static final ValueValidator RIGHT_VALIDATOR;
    public static final ValueValidator START_VALIDATOR;
    public static final Expression TOP_DEFAULT_VALUE;
    public static final ValueValidator TOP_VALIDATOR;
    public static final TypeHelper TYPE_HELPER_UNIT;
    public static final Expression UNIT_DEFAULT_VALUE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BOTTOM_VALIDATOR$lambda$0(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean END_VALIDATOR$lambda$1(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LEFT_VALIDATOR$lambda$2(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RIGHT_VALIDATOR$lambda$3(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean START_VALIDATOR$lambda$4(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TOP_VALIDATOR$lambda$5(long j) {
        return j >= 0;
    }

    /* compiled from: DivEdgeInsetsJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivEdgeInsets deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = DivEdgeInsetsJsonParser.BOTTOM_VALIDATOR;
            Expression expression = DivEdgeInsetsJsonParser.BOTTOM_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "bottom", typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "end", typeHelper, function1, DivEdgeInsetsJsonParser.END_VALIDATOR);
            ValueValidator valueValidator2 = DivEdgeInsetsJsonParser.LEFT_VALIDATOR;
            Expression expression2 = DivEdgeInsetsJsonParser.LEFT_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "left", typeHelper, function1, valueValidator2, expression2);
            if (readOptionalExpression3 != null) {
                expression2 = readOptionalExpression3;
            }
            ValueValidator valueValidator3 = DivEdgeInsetsJsonParser.RIGHT_VALIDATOR;
            Expression expression3 = DivEdgeInsetsJsonParser.RIGHT_DEFAULT_VALUE;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "right", typeHelper, function1, valueValidator3, expression3);
            if (readOptionalExpression4 != null) {
                expression3 = readOptionalExpression4;
            }
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "start", typeHelper, function1, DivEdgeInsetsJsonParser.START_VALIDATOR);
            ValueValidator valueValidator4 = DivEdgeInsetsJsonParser.TOP_VALIDATOR;
            Expression expression4 = DivEdgeInsetsJsonParser.TOP_DEFAULT_VALUE;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_TOP_KEY, typeHelper, function1, valueValidator4, expression4);
            Expression expression5 = readOptionalExpression6 == null ? expression4 : readOptionalExpression6;
            TypeHelper typeHelper2 = DivEdgeInsetsJsonParser.TYPE_HELPER_UNIT;
            Function1 function12 = DivSizeUnit.FROM_STRING;
            Expression expression6 = DivEdgeInsetsJsonParser.UNIT_DEFAULT_VALUE;
            Expression readOptionalExpression7 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "unit", typeHelper2, function12, expression6);
            if (readOptionalExpression7 != null) {
                expression6 = readOptionalExpression7;
            }
            return new DivEdgeInsets(expression, readOptionalExpression2, expression2, expression3, readOptionalExpression5, expression5, expression6);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivEdgeInsets divEdgeInsets) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "bottom", divEdgeInsets.bottom);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "end", divEdgeInsets.end);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "left", divEdgeInsets.left);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "right", divEdgeInsets.right);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start", divEdgeInsets.start);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_TOP_KEY, divEdgeInsets.top);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "unit", divEdgeInsets.unit, DivSizeUnit.TO_STRING);
            return jSONObject;
        }
    }

    /* compiled from: DivEdgeInsetsJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivEdgeInsetsTemplate deserialize(ParsingContext parsingContext, DivEdgeInsetsTemplate divEdgeInsetsTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = divEdgeInsetsTemplate != null ? divEdgeInsetsTemplate.bottom : null;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivEdgeInsetsTemplate(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "bottom", typeHelper, allowPropertyOverride, field, function1, DivEdgeInsetsJsonParser.BOTTOM_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "end", typeHelper, allowPropertyOverride, divEdgeInsetsTemplate != null ? divEdgeInsetsTemplate.end : null, function1, DivEdgeInsetsJsonParser.END_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "left", typeHelper, allowPropertyOverride, divEdgeInsetsTemplate != null ? divEdgeInsetsTemplate.left : null, function1, DivEdgeInsetsJsonParser.LEFT_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "right", typeHelper, allowPropertyOverride, divEdgeInsetsTemplate != null ? divEdgeInsetsTemplate.right : null, function1, DivEdgeInsetsJsonParser.RIGHT_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "start", typeHelper, allowPropertyOverride, divEdgeInsetsTemplate != null ? divEdgeInsetsTemplate.start : null, function1, DivEdgeInsetsJsonParser.START_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, ViewHierarchyConstants.DIMENSION_TOP_KEY, typeHelper, allowPropertyOverride, divEdgeInsetsTemplate != null ? divEdgeInsetsTemplate.top : null, function1, DivEdgeInsetsJsonParser.TOP_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "unit", DivEdgeInsetsJsonParser.TYPE_HELPER_UNIT, allowPropertyOverride, divEdgeInsetsTemplate != null ? divEdgeInsetsTemplate.unit : null, DivSizeUnit.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivEdgeInsetsTemplate divEdgeInsetsTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "bottom", divEdgeInsetsTemplate.bottom);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "end", divEdgeInsetsTemplate.end);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "left", divEdgeInsetsTemplate.left);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "right", divEdgeInsetsTemplate.right);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start", divEdgeInsetsTemplate.start);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_TOP_KEY, divEdgeInsetsTemplate.top);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "unit", divEdgeInsetsTemplate.unit, DivSizeUnit.TO_STRING);
            return jSONObject;
        }
    }

    /* compiled from: DivEdgeInsetsJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivEdgeInsets resolve(ParsingContext parsingContext, DivEdgeInsetsTemplate divEdgeInsetsTemplate, JSONObject jSONObject) {
            Field field = divEdgeInsetsTemplate.bottom;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = DivEdgeInsetsJsonParser.BOTTOM_VALIDATOR;
            Expression expression = DivEdgeInsetsJsonParser.BOTTOM_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "bottom", typeHelper, function1, valueValidator, expression);
            Expression expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divEdgeInsetsTemplate.end, jSONObject, "end", typeHelper, function1, DivEdgeInsetsJsonParser.END_VALIDATOR);
            Field field2 = divEdgeInsetsTemplate.left;
            ValueValidator valueValidator2 = DivEdgeInsetsJsonParser.LEFT_VALIDATOR;
            Expression expression3 = DivEdgeInsetsJsonParser.LEFT_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "left", typeHelper, function1, valueValidator2, expression3);
            Expression expression4 = resolveOptionalExpression3 == null ? expression3 : resolveOptionalExpression3;
            Field field3 = divEdgeInsetsTemplate.right;
            ValueValidator valueValidator3 = DivEdgeInsetsJsonParser.RIGHT_VALIDATOR;
            Expression expression5 = DivEdgeInsetsJsonParser.RIGHT_DEFAULT_VALUE;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "right", typeHelper, function1, valueValidator3, expression5);
            Expression expression6 = resolveOptionalExpression4 == null ? expression5 : resolveOptionalExpression4;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divEdgeInsetsTemplate.start, jSONObject, "start", typeHelper, function1, DivEdgeInsetsJsonParser.START_VALIDATOR);
            Field field4 = divEdgeInsetsTemplate.top;
            ValueValidator valueValidator4 = DivEdgeInsetsJsonParser.TOP_VALIDATOR;
            Expression expression7 = DivEdgeInsetsJsonParser.TOP_DEFAULT_VALUE;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, ViewHierarchyConstants.DIMENSION_TOP_KEY, typeHelper, function1, valueValidator4, expression7);
            Expression expression8 = resolveOptionalExpression6 == null ? expression7 : resolveOptionalExpression6;
            Field field5 = divEdgeInsetsTemplate.unit;
            TypeHelper typeHelper2 = DivEdgeInsetsJsonParser.TYPE_HELPER_UNIT;
            Function1 function12 = DivSizeUnit.FROM_STRING;
            Expression expression9 = DivEdgeInsetsJsonParser.UNIT_DEFAULT_VALUE;
            Expression resolveOptionalExpression7 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "unit", typeHelper2, function12, expression9);
            return new DivEdgeInsets(expression2, resolveOptionalExpression2, expression4, expression6, resolveOptionalExpression5, expression8, resolveOptionalExpression7 == null ? expression9 : resolveOptionalExpression7);
        }
    }

    /* compiled from: DivEdgeInsetsJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        BOTTOM_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        LEFT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        RIGHT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        TOP_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        DivSizeUnit divSizeUnit = DivSizeUnit.DP;
        UNIT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divSizeUnit, null, 2, null);
        TYPE_HELPER_UNIT = TypeHelper.INSTANCE.from(divSizeUnit, new Function1() { // from class: com.yandex.div2.DivEdgeInsetsJsonParser$Companion$TYPE_HELPER_UNIT$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivSizeUnit);
            }
        });
        BOTTOM_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivEdgeInsetsJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean BOTTOM_VALIDATOR$lambda$0;
                BOTTOM_VALIDATOR$lambda$0 = DivEdgeInsetsJsonParser.BOTTOM_VALIDATOR$lambda$0(((Long) obj).longValue());
                return BOTTOM_VALIDATOR$lambda$0;
            }
        };
        END_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivEdgeInsetsJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean END_VALIDATOR$lambda$1;
                END_VALIDATOR$lambda$1 = DivEdgeInsetsJsonParser.END_VALIDATOR$lambda$1(((Long) obj).longValue());
                return END_VALIDATOR$lambda$1;
            }
        };
        LEFT_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivEdgeInsetsJsonParser$$ExternalSyntheticLambda2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean LEFT_VALIDATOR$lambda$2;
                LEFT_VALIDATOR$lambda$2 = DivEdgeInsetsJsonParser.LEFT_VALIDATOR$lambda$2(((Long) obj).longValue());
                return LEFT_VALIDATOR$lambda$2;
            }
        };
        RIGHT_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivEdgeInsetsJsonParser$$ExternalSyntheticLambda3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean RIGHT_VALIDATOR$lambda$3;
                RIGHT_VALIDATOR$lambda$3 = DivEdgeInsetsJsonParser.RIGHT_VALIDATOR$lambda$3(((Long) obj).longValue());
                return RIGHT_VALIDATOR$lambda$3;
            }
        };
        START_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivEdgeInsetsJsonParser$$ExternalSyntheticLambda4
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean START_VALIDATOR$lambda$4;
                START_VALIDATOR$lambda$4 = DivEdgeInsetsJsonParser.START_VALIDATOR$lambda$4(((Long) obj).longValue());
                return START_VALIDATOR$lambda$4;
            }
        };
        TOP_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivEdgeInsetsJsonParser$$ExternalSyntheticLambda5
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean TOP_VALIDATOR$lambda$5;
                TOP_VALIDATOR$lambda$5 = DivEdgeInsetsJsonParser.TOP_VALIDATOR$lambda$5(((Long) obj).longValue());
                return TOP_VALIDATOR$lambda$5;
            }
        };
    }
}
