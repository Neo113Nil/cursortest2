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
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivCollectionItemBuilderTemplate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: DivCollectionItemBuilderJsonParser.kt */
/* loaded from: classes.dex */
public abstract class DivCollectionItemBuilderPrototypeJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final Expression SELECTOR_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.TRUE, null, 2, null);

    /* compiled from: DivCollectionItemBuilderJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivCollectionItemBuilder.Prototype deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            Div div = (Div) JsonPropertyParser.read(parsingContext, jSONObject, "div", this.component.getDivJsonEntityParser());
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = DivCollectionItemBuilderPrototypeJsonParser.SELECTOR_DEFAULT_VALUE;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "selector", typeHelper, function1, expression);
            if (readOptionalExpression2 != null) {
                expression = readOptionalExpression2;
            }
            return new DivCollectionItemBuilder.Prototype(div, readOptionalExpression, expression);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivCollectionItemBuilder.Prototype prototype) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "div", prototype.div, this.component.getDivJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "id", prototype.id);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "selector", prototype.selector);
            return jSONObject;
        }
    }

    /* compiled from: DivCollectionItemBuilderJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivCollectionItemBuilderTemplate.PrototypeTemplate deserialize(ParsingContext parsingContext, DivCollectionItemBuilderTemplate.PrototypeTemplate prototypeTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivCollectionItemBuilderTemplate.PrototypeTemplate(JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "div", allowPropertyOverride, prototypeTemplate != null ? prototypeTemplate.div : null, this.component.getDivJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, prototypeTemplate != null ? prototypeTemplate.id : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "selector", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, prototypeTemplate != null ? prototypeTemplate.selector : null, ParsingConvertersKt.ANY_TO_BOOLEAN));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivCollectionItemBuilderTemplate.PrototypeTemplate prototypeTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "div", prototypeTemplate.div, this.component.getDivJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "id", prototypeTemplate.id);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "selector", prototypeTemplate.selector);
            return jSONObject;
        }
    }

    /* compiled from: DivCollectionItemBuilderJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivCollectionItemBuilder.Prototype resolve(ParsingContext parsingContext, DivCollectionItemBuilderTemplate.PrototypeTemplate prototypeTemplate, JSONObject jSONObject) {
            Div div = (Div) JsonFieldResolver.resolve(parsingContext, prototypeTemplate.div, jSONObject, "div", this.component.getDivJsonTemplateResolver(), this.component.getDivJsonEntityParser());
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, prototypeTemplate.id, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING);
            Field field = prototypeTemplate.selector;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = DivCollectionItemBuilderPrototypeJsonParser.SELECTOR_DEFAULT_VALUE;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "selector", typeHelper, function1, expression);
            if (resolveOptionalExpression2 != null) {
                expression = resolveOptionalExpression2;
            }
            return new DivCollectionItemBuilder.Prototype(div, resolveOptionalExpression, expression);
        }
    }

    /* compiled from: DivCollectionItemBuilderJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
