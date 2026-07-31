package com.yandex.div2;

import com.facebook.share.internal.ShareConstants;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: DivActionScrollToJsonParser.kt */
/* loaded from: classes9.dex */
public abstract class DivActionScrollToJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final Expression ANIMATED_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.TRUE, null, 2, null);

    /* compiled from: DivActionScrollToJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivActionScrollTo deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = DivActionScrollToJsonParser.ANIMATED_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "animated", typeHelper, function1, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new DivActionScrollTo(expression, (DivActionScrollDestination) JsonPropertyParser.read(parsingContext, jSONObject, ShareConstants.DESTINATION, this.component.getDivActionScrollDestinationJsonEntityParser()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivActionScrollTo divActionScrollTo) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "animated", divActionScrollTo.animated);
            JsonPropertyParser.write(parsingContext, jSONObject, ShareConstants.DESTINATION, divActionScrollTo.destination, this.component.getDivActionScrollDestinationJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "id", divActionScrollTo.id);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "scroll_to");
            return jSONObject;
        }
    }

    /* compiled from: DivActionScrollToJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivActionScrollToTemplate deserialize(ParsingContext parsingContext, DivActionScrollToTemplate divActionScrollToTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivActionScrollToTemplate(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "animated", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divActionScrollToTemplate != null ? divActionScrollToTemplate.animated : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, ShareConstants.DESTINATION, allowPropertyOverride, divActionScrollToTemplate != null ? divActionScrollToTemplate.destination : null, this.component.getDivActionScrollDestinationJsonTemplateParser()), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divActionScrollToTemplate != null ? divActionScrollToTemplate.id : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivActionScrollToTemplate divActionScrollToTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "animated", divActionScrollToTemplate.animated);
            JsonFieldParser.writeField(parsingContext, jSONObject, ShareConstants.DESTINATION, divActionScrollToTemplate.destination, this.component.getDivActionScrollDestinationJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "id", divActionScrollToTemplate.id);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "scroll_to");
            return jSONObject;
        }
    }

    /* compiled from: DivActionScrollToJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivActionScrollTo resolve(ParsingContext parsingContext, DivActionScrollToTemplate divActionScrollToTemplate, JSONObject jSONObject) {
            Field field = divActionScrollToTemplate.animated;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = DivActionScrollToJsonParser.ANIMATED_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "animated", typeHelper, function1, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new DivActionScrollTo(expression, (DivActionScrollDestination) JsonFieldResolver.resolve(parsingContext, divActionScrollToTemplate.destination, jSONObject, ShareConstants.DESTINATION, this.component.getDivActionScrollDestinationJsonTemplateResolver(), this.component.getDivActionScrollDestinationJsonEntityParser()), JsonFieldResolver.resolveExpression(parsingContext, divActionScrollToTemplate.id, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
        }
    }

    /* compiled from: DivActionScrollToJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
