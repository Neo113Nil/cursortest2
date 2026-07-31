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

/* compiled from: DivFixedCountJsonParser.kt */
/* loaded from: classes15.dex */
public abstract class DivFixedCountJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final ValueValidator VALUE_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivFixedCountJsonParser$$ExternalSyntheticLambda0
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean VALUE_VALIDATOR$lambda$0;
            VALUE_VALIDATOR$lambda$0 = DivFixedCountJsonParser.VALUE_VALIDATOR$lambda$0(((Long) obj).longValue());
            return VALUE_VALIDATOR$lambda$0;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean VALUE_VALIDATOR$lambda$0(long j) {
        return j >= 0;
    }

    /* compiled from: DivFixedCountJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivFixedCount deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            return new DivFixedCount(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, DivFixedCountJsonParser.VALUE_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivFixedCount divFixedCount) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "fixed");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", divFixedCount.value);
            return jSONObject;
        }
    }

    /* compiled from: DivFixedCountJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivFixedCountTemplate deserialize(ParsingContext parsingContext, DivFixedCountTemplate divFixedCountTemplate, JSONObject jSONObject) {
            return new DivFixedCountTemplate(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, parsingContext.getAllowPropertyOverride(), divFixedCountTemplate != null ? divFixedCountTemplate.value : null, ParsingConvertersKt.NUMBER_TO_INT, DivFixedCountJsonParser.VALUE_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivFixedCountTemplate divFixedCountTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "fixed");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", divFixedCountTemplate.value);
            return jSONObject;
        }
    }

    /* compiled from: DivFixedCountJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivFixedCount resolve(ParsingContext parsingContext, DivFixedCountTemplate divFixedCountTemplate, JSONObject jSONObject) {
            return new DivFixedCount(JsonFieldResolver.resolveExpression(parsingContext, divFixedCountTemplate.value, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, DivFixedCountJsonParser.VALUE_VALIDATOR));
        }
    }

    /* compiled from: DivFixedCountJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
