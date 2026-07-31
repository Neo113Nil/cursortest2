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
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivContainerTemplate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: DivContainerJsonParser.kt */
/* loaded from: classes12.dex */
public abstract class DivContainerSeparatorJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final Expression SHOW_AT_END_DEFAULT_VALUE;
    public static final Expression SHOW_AT_START_DEFAULT_VALUE;
    public static final Expression SHOW_BETWEEN_DEFAULT_VALUE;

    /* compiled from: DivContainerJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivContainer.Separator deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "margins", this.component.getDivEdgeInsetsJsonEntityParser());
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = DivContainerSeparatorJsonParser.SHOW_AT_END_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "show_at_end", typeHelper, function1, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            Expression expression2 = DivContainerSeparatorJsonParser.SHOW_AT_START_DEFAULT_VALUE;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "show_at_start", typeHelper, function1, expression2);
            if (readOptionalExpression2 != null) {
                expression2 = readOptionalExpression2;
            }
            Expression expression3 = DivContainerSeparatorJsonParser.SHOW_BETWEEN_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "show_between", typeHelper, function1, expression3);
            if (readOptionalExpression3 != null) {
                expression3 = readOptionalExpression3;
            }
            return new DivContainer.Separator(divEdgeInsets, expression, expression2, expression3, (DivDrawable) JsonPropertyParser.read(parsingContext, jSONObject, "style", this.component.getDivDrawableJsonEntityParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivContainer.Separator separator) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "margins", separator.margins, this.component.getDivEdgeInsetsJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "show_at_end", separator.showAtEnd);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "show_at_start", separator.showAtStart);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "show_between", separator.showBetween);
            JsonPropertyParser.write(parsingContext, jSONObject, "style", separator.style, this.component.getDivDrawableJsonEntityParser());
            return jSONObject;
        }
    }

    /* compiled from: DivContainerJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivContainerTemplate.SeparatorTemplate deserialize(ParsingContext parsingContext, DivContainerTemplate.SeparatorTemplate separatorTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "margins", allowPropertyOverride, separatorTemplate != null ? separatorTemplate.margins : null, this.component.getDivEdgeInsetsJsonTemplateParser());
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field = separatorTemplate != null ? separatorTemplate.showAtEnd : null;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            return new DivContainerTemplate.SeparatorTemplate(readOptionalField, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "show_at_end", typeHelper, allowPropertyOverride, field, function1), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "show_at_start", typeHelper, allowPropertyOverride, separatorTemplate != null ? separatorTemplate.showAtStart : null, function1), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "show_between", typeHelper, allowPropertyOverride, separatorTemplate != null ? separatorTemplate.showBetween : null, function1), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "style", allowPropertyOverride, separatorTemplate != null ? separatorTemplate.style : null, this.component.getDivDrawableJsonTemplateParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivContainerTemplate.SeparatorTemplate separatorTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "margins", separatorTemplate.margins, this.component.getDivEdgeInsetsJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "show_at_end", separatorTemplate.showAtEnd);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "show_at_start", separatorTemplate.showAtStart);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "show_between", separatorTemplate.showBetween);
            JsonFieldParser.writeField(parsingContext, jSONObject, "style", separatorTemplate.style, this.component.getDivDrawableJsonTemplateParser());
            return jSONObject;
        }
    }

    /* compiled from: DivContainerJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivContainer.Separator resolve(ParsingContext parsingContext, DivContainerTemplate.SeparatorTemplate separatorTemplate, JSONObject jSONObject) {
            DivEdgeInsets divEdgeInsets = (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, separatorTemplate.margins, jSONObject, "margins", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser());
            Field field = separatorTemplate.showAtEnd;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = DivContainerSeparatorJsonParser.SHOW_AT_END_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "show_at_end", typeHelper, function1, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            Field field2 = separatorTemplate.showAtStart;
            Expression expression2 = DivContainerSeparatorJsonParser.SHOW_AT_START_DEFAULT_VALUE;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "show_at_start", typeHelper, function1, expression2);
            if (resolveOptionalExpression2 != null) {
                expression2 = resolveOptionalExpression2;
            }
            Field field3 = separatorTemplate.showBetween;
            Expression expression3 = DivContainerSeparatorJsonParser.SHOW_BETWEEN_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "show_between", typeHelper, function1, expression3);
            if (resolveOptionalExpression3 != null) {
                expression3 = resolveOptionalExpression3;
            }
            return new DivContainer.Separator(divEdgeInsets, expression, expression2, expression3, (DivDrawable) JsonFieldResolver.resolve(parsingContext, separatorTemplate.style, jSONObject, "style", this.component.getDivDrawableJsonTemplateResolver(), this.component.getDivDrawableJsonEntityParser()));
        }
    }

    /* compiled from: DivContainerJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        Boolean bool = Boolean.FALSE;
        SHOW_AT_END_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        SHOW_AT_START_DEFAULT_VALUE = Expression.Companion.constant$default(companion, bool, null, 2, null);
        SHOW_BETWEEN_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
    }
}
