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
import org.json.JSONObject;

/* compiled from: DivAbsoluteEdgeInsetsJsonParser.kt */
/* loaded from: classes9.dex */
public abstract class DivAbsoluteEdgeInsetsJsonParser {
    public static final Expression BOTTOM_DEFAULT_VALUE;
    public static final ValueValidator BOTTOM_VALIDATOR;
    private static final Companion Companion = new Companion(null);
    public static final Expression LEFT_DEFAULT_VALUE;
    public static final ValueValidator LEFT_VALIDATOR;
    public static final Expression RIGHT_DEFAULT_VALUE;
    public static final ValueValidator RIGHT_VALIDATOR;
    public static final Expression TOP_DEFAULT_VALUE;
    public static final ValueValidator TOP_VALIDATOR;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BOTTOM_VALIDATOR$lambda$0(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LEFT_VALIDATOR$lambda$1(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RIGHT_VALIDATOR$lambda$2(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TOP_VALIDATOR$lambda$3(long j) {
        return j >= 0;
    }

    /* compiled from: DivAbsoluteEdgeInsetsJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivAbsoluteEdgeInsets deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = DivAbsoluteEdgeInsetsJsonParser.BOTTOM_VALIDATOR;
            Expression expression = DivAbsoluteEdgeInsetsJsonParser.BOTTOM_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "bottom", typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            ValueValidator valueValidator2 = DivAbsoluteEdgeInsetsJsonParser.LEFT_VALIDATOR;
            Expression expression2 = DivAbsoluteEdgeInsetsJsonParser.LEFT_DEFAULT_VALUE;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "left", typeHelper, function1, valueValidator2, expression2);
            if (readOptionalExpression2 != null) {
                expression2 = readOptionalExpression2;
            }
            ValueValidator valueValidator3 = DivAbsoluteEdgeInsetsJsonParser.RIGHT_VALIDATOR;
            Expression expression3 = DivAbsoluteEdgeInsetsJsonParser.RIGHT_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "right", typeHelper, function1, valueValidator3, expression3);
            if (readOptionalExpression3 != null) {
                expression3 = readOptionalExpression3;
            }
            ValueValidator valueValidator4 = DivAbsoluteEdgeInsetsJsonParser.TOP_VALIDATOR;
            Expression expression4 = DivAbsoluteEdgeInsetsJsonParser.TOP_DEFAULT_VALUE;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_TOP_KEY, typeHelper, function1, valueValidator4, expression4);
            if (readOptionalExpression4 != null) {
                expression4 = readOptionalExpression4;
            }
            return new DivAbsoluteEdgeInsets(expression, expression2, expression3, expression4);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivAbsoluteEdgeInsets divAbsoluteEdgeInsets) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "bottom", divAbsoluteEdgeInsets.bottom);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "left", divAbsoluteEdgeInsets.left);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "right", divAbsoluteEdgeInsets.right);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_TOP_KEY, divAbsoluteEdgeInsets.top);
            return jSONObject;
        }
    }

    /* compiled from: DivAbsoluteEdgeInsetsJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivAbsoluteEdgeInsetsTemplate deserialize(ParsingContext parsingContext, DivAbsoluteEdgeInsetsTemplate divAbsoluteEdgeInsetsTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = divAbsoluteEdgeInsetsTemplate != null ? divAbsoluteEdgeInsetsTemplate.bottom : null;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivAbsoluteEdgeInsetsTemplate(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "bottom", typeHelper, allowPropertyOverride, field, function1, DivAbsoluteEdgeInsetsJsonParser.BOTTOM_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "left", typeHelper, allowPropertyOverride, divAbsoluteEdgeInsetsTemplate != null ? divAbsoluteEdgeInsetsTemplate.left : null, function1, DivAbsoluteEdgeInsetsJsonParser.LEFT_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "right", typeHelper, allowPropertyOverride, divAbsoluteEdgeInsetsTemplate != null ? divAbsoluteEdgeInsetsTemplate.right : null, function1, DivAbsoluteEdgeInsetsJsonParser.RIGHT_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, ViewHierarchyConstants.DIMENSION_TOP_KEY, typeHelper, allowPropertyOverride, divAbsoluteEdgeInsetsTemplate != null ? divAbsoluteEdgeInsetsTemplate.top : null, function1, DivAbsoluteEdgeInsetsJsonParser.TOP_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivAbsoluteEdgeInsetsTemplate divAbsoluteEdgeInsetsTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "bottom", divAbsoluteEdgeInsetsTemplate.bottom);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "left", divAbsoluteEdgeInsetsTemplate.left);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "right", divAbsoluteEdgeInsetsTemplate.right);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, ViewHierarchyConstants.DIMENSION_TOP_KEY, divAbsoluteEdgeInsetsTemplate.top);
            return jSONObject;
        }
    }

    /* compiled from: DivAbsoluteEdgeInsetsJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivAbsoluteEdgeInsets resolve(ParsingContext parsingContext, DivAbsoluteEdgeInsetsTemplate divAbsoluteEdgeInsetsTemplate, JSONObject jSONObject) {
            Field field = divAbsoluteEdgeInsetsTemplate.bottom;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = DivAbsoluteEdgeInsetsJsonParser.BOTTOM_VALIDATOR;
            Expression expression = DivAbsoluteEdgeInsetsJsonParser.BOTTOM_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "bottom", typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression == null) {
                resolveOptionalExpression = expression;
            }
            Field field2 = divAbsoluteEdgeInsetsTemplate.left;
            ValueValidator valueValidator2 = DivAbsoluteEdgeInsetsJsonParser.LEFT_VALIDATOR;
            Expression expression2 = DivAbsoluteEdgeInsetsJsonParser.LEFT_DEFAULT_VALUE;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "left", typeHelper, function1, valueValidator2, expression2);
            if (resolveOptionalExpression2 != null) {
                expression2 = resolveOptionalExpression2;
            }
            Field field3 = divAbsoluteEdgeInsetsTemplate.right;
            ValueValidator valueValidator3 = DivAbsoluteEdgeInsetsJsonParser.RIGHT_VALIDATOR;
            Expression expression3 = DivAbsoluteEdgeInsetsJsonParser.RIGHT_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "right", typeHelper, function1, valueValidator3, expression3);
            if (resolveOptionalExpression3 != null) {
                expression3 = resolveOptionalExpression3;
            }
            Field field4 = divAbsoluteEdgeInsetsTemplate.top;
            ValueValidator valueValidator4 = DivAbsoluteEdgeInsetsJsonParser.TOP_VALIDATOR;
            Expression expression4 = DivAbsoluteEdgeInsetsJsonParser.TOP_DEFAULT_VALUE;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, ViewHierarchyConstants.DIMENSION_TOP_KEY, typeHelper, function1, valueValidator4, expression4);
            if (resolveOptionalExpression4 != null) {
                expression4 = resolveOptionalExpression4;
            }
            return new DivAbsoluteEdgeInsets(resolveOptionalExpression, expression2, expression3, expression4);
        }
    }

    /* compiled from: DivAbsoluteEdgeInsetsJsonParser.kt */
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
        BOTTOM_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivAbsoluteEdgeInsetsJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean BOTTOM_VALIDATOR$lambda$0;
                BOTTOM_VALIDATOR$lambda$0 = DivAbsoluteEdgeInsetsJsonParser.BOTTOM_VALIDATOR$lambda$0(((Long) obj).longValue());
                return BOTTOM_VALIDATOR$lambda$0;
            }
        };
        LEFT_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivAbsoluteEdgeInsetsJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean LEFT_VALIDATOR$lambda$1;
                LEFT_VALIDATOR$lambda$1 = DivAbsoluteEdgeInsetsJsonParser.LEFT_VALIDATOR$lambda$1(((Long) obj).longValue());
                return LEFT_VALIDATOR$lambda$1;
            }
        };
        RIGHT_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivAbsoluteEdgeInsetsJsonParser$$ExternalSyntheticLambda2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean RIGHT_VALIDATOR$lambda$2;
                RIGHT_VALIDATOR$lambda$2 = DivAbsoluteEdgeInsetsJsonParser.RIGHT_VALIDATOR$lambda$2(((Long) obj).longValue());
                return RIGHT_VALIDATOR$lambda$2;
            }
        };
        TOP_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivAbsoluteEdgeInsetsJsonParser$$ExternalSyntheticLambda3
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean TOP_VALIDATOR$lambda$3;
                TOP_VALIDATOR$lambda$3 = DivAbsoluteEdgeInsetsJsonParser.TOP_VALIDATOR$lambda$3(((Long) obj).longValue());
                return TOP_VALIDATOR$lambda$3;
            }
        };
    }
}
