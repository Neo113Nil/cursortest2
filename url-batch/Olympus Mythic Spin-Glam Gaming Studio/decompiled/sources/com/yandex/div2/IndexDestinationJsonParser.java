package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: IndexDestinationJsonParser.kt */
/* loaded from: classes11.dex */
public abstract class IndexDestinationJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final ValueValidator VALUE_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.IndexDestinationJsonParser$$ExternalSyntheticLambda0
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean VALUE_VALIDATOR$lambda$0;
            VALUE_VALIDATOR$lambda$0 = IndexDestinationJsonParser.VALUE_VALIDATOR$lambda$0(((Long) obj).longValue());
            return VALUE_VALIDATOR$lambda$0;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean VALUE_VALIDATOR$lambda$0(long j) {
        return j >= 0;
    }

    /* compiled from: IndexDestinationJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public IndexDestination deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            return new IndexDestination(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, IndexDestinationJsonParser.VALUE_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, IndexDestination indexDestination) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "index");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", indexDestination.value);
            return jSONObject;
        }
    }

    /* compiled from: IndexDestinationJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public IndexDestinationTemplate deserialize(ParsingContext parsingContext, IndexDestinationTemplate indexDestinationTemplate, JSONObject jSONObject) {
            return new IndexDestinationTemplate(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, parsingContext.getAllowPropertyOverride(), indexDestinationTemplate != null ? indexDestinationTemplate.value : null, ParsingConvertersKt.NUMBER_TO_INT, IndexDestinationJsonParser.VALUE_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, IndexDestinationTemplate indexDestinationTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "index");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", indexDestinationTemplate.value);
            return jSONObject;
        }
    }

    /* compiled from: IndexDestinationJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public IndexDestination resolve(ParsingContext parsingContext, IndexDestinationTemplate indexDestinationTemplate, JSONObject jSONObject) {
            return new IndexDestination(JsonFieldResolver.resolveExpression(parsingContext, indexDestinationTemplate.value, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, IndexDestinationJsonParser.VALUE_VALIDATOR));
        }
    }

    /* compiled from: IndexDestinationJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
