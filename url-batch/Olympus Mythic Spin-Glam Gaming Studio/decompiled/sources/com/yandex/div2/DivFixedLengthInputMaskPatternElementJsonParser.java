package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
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
import com.yandex.div2.DivFixedLengthInputMask;
import com.yandex.div2.DivFixedLengthInputMaskTemplate;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: DivFixedLengthInputMaskJsonParser.kt */
/* loaded from: classes12.dex */
public abstract class DivFixedLengthInputMaskPatternElementJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final Expression PLACEHOLDER_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, "_", null, 2, null);
    public static final ValueValidator KEY_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivFixedLengthInputMaskPatternElementJsonParser$$ExternalSyntheticLambda0
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean KEY_VALIDATOR$lambda$0;
            KEY_VALIDATOR$lambda$0 = DivFixedLengthInputMaskPatternElementJsonParser.KEY_VALIDATOR$lambda$0((String) obj);
            return KEY_VALIDATOR$lambda$0;
        }
    };
    public static final ValueValidator PLACEHOLDER_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivFixedLengthInputMaskPatternElementJsonParser$$ExternalSyntheticLambda1
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean PLACEHOLDER_VALIDATOR$lambda$1;
            PLACEHOLDER_VALIDATOR$lambda$1 = DivFixedLengthInputMaskPatternElementJsonParser.PLACEHOLDER_VALIDATOR$lambda$1((String) obj);
            return PLACEHOLDER_VALIDATOR$lambda$1;
        }
    };

    /* compiled from: DivFixedLengthInputMaskJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivFixedLengthInputMask.PatternElement deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "key", typeHelper, DivFixedLengthInputMaskPatternElementJsonParser.KEY_VALIDATOR);
            ValueValidator valueValidator = DivFixedLengthInputMaskPatternElementJsonParser.PLACEHOLDER_VALIDATOR;
            Expression expression = DivFixedLengthInputMaskPatternElementJsonParser.PLACEHOLDER_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "placeholder", typeHelper, valueValidator, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new DivFixedLengthInputMask.PatternElement(readExpression, expression, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "regex", typeHelper));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivFixedLengthInputMask.PatternElement patternElement) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "key", patternElement.key);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "placeholder", patternElement.placeholder);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "regex", patternElement.regex);
            return jSONObject;
        }
    }

    /* compiled from: DivFixedLengthInputMaskJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivFixedLengthInputMaskTemplate.PatternElementTemplate deserialize(ParsingContext parsingContext, DivFixedLengthInputMaskTemplate.PatternElementTemplate patternElementTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            return new DivFixedLengthInputMaskTemplate.PatternElementTemplate(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "key", typeHelper, allowPropertyOverride, patternElementTemplate != null ? patternElementTemplate.key : null, DivFixedLengthInputMaskPatternElementJsonParser.KEY_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "placeholder", typeHelper, allowPropertyOverride, patternElementTemplate != null ? patternElementTemplate.placeholder : null, DivFixedLengthInputMaskPatternElementJsonParser.PLACEHOLDER_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "regex", typeHelper, allowPropertyOverride, patternElementTemplate != null ? patternElementTemplate.regex : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivFixedLengthInputMaskTemplate.PatternElementTemplate patternElementTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "key", patternElementTemplate.key);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "placeholder", patternElementTemplate.placeholder);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "regex", patternElementTemplate.regex);
            return jSONObject;
        }
    }

    /* compiled from: DivFixedLengthInputMaskJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivFixedLengthInputMask.PatternElement resolve(ParsingContext parsingContext, DivFixedLengthInputMaskTemplate.PatternElementTemplate patternElementTemplate, JSONObject jSONObject) {
            Field field = patternElementTemplate.key;
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, field, jSONObject, "key", typeHelper, DivFixedLengthInputMaskPatternElementJsonParser.KEY_VALIDATOR);
            Field field2 = patternElementTemplate.placeholder;
            ValueValidator valueValidator = DivFixedLengthInputMaskPatternElementJsonParser.PLACEHOLDER_VALIDATOR;
            Expression expression = DivFixedLengthInputMaskPatternElementJsonParser.PLACEHOLDER_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "placeholder", typeHelper, valueValidator, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new DivFixedLengthInputMask.PatternElement(resolveExpression, expression, JsonFieldResolver.resolveOptionalExpression(parsingContext, patternElementTemplate.regex, jSONObject, "regex", typeHelper));
        }
    }

    /* compiled from: DivFixedLengthInputMaskJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean KEY_VALIDATOR$lambda$0(String str) {
        return str.length() >= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PLACEHOLDER_VALIDATOR$lambda$1(String str) {
        return str.length() >= 1;
    }
}
