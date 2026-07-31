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

/* compiled from: OffsetDestinationJsonParser.kt */
/* loaded from: classes8.dex */
public abstract class OffsetDestinationJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final ValueValidator VALUE_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.OffsetDestinationJsonParser$$ExternalSyntheticLambda0
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean VALUE_VALIDATOR$lambda$0;
            VALUE_VALIDATOR$lambda$0 = OffsetDestinationJsonParser.VALUE_VALIDATOR$lambda$0(((Long) obj).longValue());
            return VALUE_VALIDATOR$lambda$0;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean VALUE_VALIDATOR$lambda$0(long j) {
        return j >= 0;
    }

    /* compiled from: OffsetDestinationJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public OffsetDestination deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            return new OffsetDestination(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, OffsetDestinationJsonParser.VALUE_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, OffsetDestination offsetDestination) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "offset");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", offsetDestination.value);
            return jSONObject;
        }
    }

    /* compiled from: OffsetDestinationJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public OffsetDestinationTemplate deserialize(ParsingContext parsingContext, OffsetDestinationTemplate offsetDestinationTemplate, JSONObject jSONObject) {
            return new OffsetDestinationTemplate(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, parsingContext.getAllowPropertyOverride(), offsetDestinationTemplate != null ? offsetDestinationTemplate.value : null, ParsingConvertersKt.NUMBER_TO_INT, OffsetDestinationJsonParser.VALUE_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, OffsetDestinationTemplate offsetDestinationTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "offset");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", offsetDestinationTemplate.value);
            return jSONObject;
        }
    }

    /* compiled from: OffsetDestinationJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public OffsetDestination resolve(ParsingContext parsingContext, OffsetDestinationTemplate offsetDestinationTemplate, JSONObject jSONObject) {
            return new OffsetDestination(JsonFieldResolver.resolveExpression(parsingContext, offsetDestinationTemplate.value, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, OffsetDestinationJsonParser.VALUE_VALIDATOR));
        }
    }

    /* compiled from: OffsetDestinationJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
