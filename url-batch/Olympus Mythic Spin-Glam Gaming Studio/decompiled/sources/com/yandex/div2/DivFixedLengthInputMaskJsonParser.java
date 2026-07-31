package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
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
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivFixedLengthInputMaskJsonParser.kt */
/* loaded from: classes11.dex */
public abstract class DivFixedLengthInputMaskJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final Expression ALWAYS_VISIBLE_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.FALSE, null, 2, null);
    public static final ListValidator PATTERN_ELEMENTS_VALIDATOR = new ListValidator() { // from class: com.yandex.div2.DivFixedLengthInputMaskJsonParser$$ExternalSyntheticLambda0
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            boolean PATTERN_ELEMENTS_VALIDATOR$lambda$0;
            PATTERN_ELEMENTS_VALIDATOR$lambda$0 = DivFixedLengthInputMaskJsonParser.PATTERN_ELEMENTS_VALIDATOR$lambda$0(list);
            return PATTERN_ELEMENTS_VALIDATOR$lambda$0;
        }
    };

    /* compiled from: DivFixedLengthInputMaskJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivFixedLengthInputMask deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = DivFixedLengthInputMaskJsonParser.ALWAYS_VISIBLE_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "always_visible", typeHelper, function1, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new DivFixedLengthInputMask(expression, JsonExpressionParser.readExpression(parsingContext, jSONObject, "pattern", TypeHelpersKt.TYPE_HELPER_STRING), JsonPropertyParser.readList(parsingContext, jSONObject, "pattern_elements", this.component.getDivFixedLengthInputMaskPatternElementJsonEntityParser(), DivFixedLengthInputMaskJsonParser.PATTERN_ELEMENTS_VALIDATOR), (String) JsonPropertyParser.read(parsingContext, jSONObject, "raw_text_variable"));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivFixedLengthInputMask divFixedLengthInputMask) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "always_visible", divFixedLengthInputMask.alwaysVisible);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "pattern", divFixedLengthInputMask.pattern);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "pattern_elements", divFixedLengthInputMask.patternElements, this.component.getDivFixedLengthInputMaskPatternElementJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "raw_text_variable", divFixedLengthInputMask.getRawTextVariable());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "fixed_length");
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
        public DivFixedLengthInputMaskTemplate deserialize(ParsingContext parsingContext, DivFixedLengthInputMaskTemplate divFixedLengthInputMaskTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "always_visible", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divFixedLengthInputMaskTemplate != null ? divFixedLengthInputMaskTemplate.alwaysVisible : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "pattern", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divFixedLengthInputMaskTemplate != null ? divFixedLengthInputMaskTemplate.pattern : null);
            Field field = divFixedLengthInputMaskTemplate != null ? divFixedLengthInputMaskTemplate.patternElements : null;
            Lazy divFixedLengthInputMaskPatternElementJsonTemplateParser = this.component.getDivFixedLengthInputMaskPatternElementJsonTemplateParser();
            ListValidator listValidator = DivFixedLengthInputMaskJsonParser.PATTERN_ELEMENTS_VALIDATOR;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivFixedLengthInputMaskTemplate(readOptionalFieldWithExpression, readFieldWithExpression, JsonFieldParser.readListField(restrictPropertyOverride, jSONObject, "pattern_elements", allowPropertyOverride, field, divFixedLengthInputMaskPatternElementJsonTemplateParser, listValidator), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "raw_text_variable", allowPropertyOverride, divFixedLengthInputMaskTemplate != null ? divFixedLengthInputMaskTemplate.rawTextVariable : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivFixedLengthInputMaskTemplate divFixedLengthInputMaskTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "always_visible", divFixedLengthInputMaskTemplate.alwaysVisible);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "pattern", divFixedLengthInputMaskTemplate.pattern);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "pattern_elements", divFixedLengthInputMaskTemplate.patternElements, this.component.getDivFixedLengthInputMaskPatternElementJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "raw_text_variable", divFixedLengthInputMaskTemplate.rawTextVariable);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "fixed_length");
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
        public DivFixedLengthInputMask resolve(ParsingContext parsingContext, DivFixedLengthInputMaskTemplate divFixedLengthInputMaskTemplate, JSONObject jSONObject) {
            Field field = divFixedLengthInputMaskTemplate.alwaysVisible;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = DivFixedLengthInputMaskJsonParser.ALWAYS_VISIBLE_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "always_visible", typeHelper, function1, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new DivFixedLengthInputMask(expression, JsonFieldResolver.resolveExpression(parsingContext, divFixedLengthInputMaskTemplate.pattern, jSONObject, "pattern", TypeHelpersKt.TYPE_HELPER_STRING), JsonFieldResolver.resolveList(parsingContext, divFixedLengthInputMaskTemplate.patternElements, jSONObject, "pattern_elements", this.component.getDivFixedLengthInputMaskPatternElementJsonTemplateResolver(), this.component.getDivFixedLengthInputMaskPatternElementJsonEntityParser(), DivFixedLengthInputMaskJsonParser.PATTERN_ELEMENTS_VALIDATOR), (String) JsonFieldResolver.resolve(parsingContext, divFixedLengthInputMaskTemplate.rawTextVariable, jSONObject, "raw_text_variable"));
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
    public static final boolean PATTERN_ELEMENTS_VALIDATOR$lambda$0(List list) {
        return list.size() >= 1;
    }
}
