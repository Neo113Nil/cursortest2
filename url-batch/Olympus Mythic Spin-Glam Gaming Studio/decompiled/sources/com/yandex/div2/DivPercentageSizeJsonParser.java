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

/* compiled from: DivPercentageSizeJsonParser.kt */
/* loaded from: classes10.dex */
public abstract class DivPercentageSizeJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final ValueValidator VALUE_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivPercentageSizeJsonParser$$ExternalSyntheticLambda0
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean VALUE_VALIDATOR$lambda$0;
            VALUE_VALIDATOR$lambda$0 = DivPercentageSizeJsonParser.VALUE_VALIDATOR$lambda$0(((Double) obj).doubleValue());
            return VALUE_VALIDATOR$lambda$0;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean VALUE_VALIDATOR$lambda$0(double d) {
        return d > 0.0d;
    }

    /* compiled from: DivPercentageSizeJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivPercentageSize deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            return new DivPercentageSize(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivPercentageSizeJsonParser.VALUE_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivPercentageSize divPercentageSize) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "percentage");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", divPercentageSize.value);
            return jSONObject;
        }
    }

    /* compiled from: DivPercentageSizeJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivPercentageSizeTemplate deserialize(ParsingContext parsingContext, DivPercentageSizeTemplate divPercentageSizeTemplate, JSONObject jSONObject) {
            return new DivPercentageSizeTemplate(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, parsingContext.getAllowPropertyOverride(), divPercentageSizeTemplate != null ? divPercentageSizeTemplate.value : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivPercentageSizeJsonParser.VALUE_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivPercentageSizeTemplate divPercentageSizeTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "percentage");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", divPercentageSizeTemplate.value);
            return jSONObject;
        }
    }

    /* compiled from: DivPercentageSizeJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivPercentageSize resolve(ParsingContext parsingContext, DivPercentageSizeTemplate divPercentageSizeTemplate, JSONObject jSONObject) {
            return new DivPercentageSize(JsonFieldResolver.resolveExpression(parsingContext, divPercentageSizeTemplate.value, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivPercentageSizeJsonParser.VALUE_VALIDATOR));
        }
    }

    /* compiled from: DivPercentageSizeJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
