package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
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

/* compiled from: DivAspectJsonParser.kt */
/* loaded from: classes14.dex */
public abstract class DivAspectJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final ValueValidator RATIO_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivAspectJsonParser$$ExternalSyntheticLambda0
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean RATIO_VALIDATOR$lambda$0;
            RATIO_VALIDATOR$lambda$0 = DivAspectJsonParser.RATIO_VALIDATOR$lambda$0(((Double) obj).doubleValue());
            return RATIO_VALIDATOR$lambda$0;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RATIO_VALIDATOR$lambda$0(double d) {
        return d > 0.0d;
    }

    /* compiled from: DivAspectJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivAspect deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            return new DivAspect(JsonExpressionParser.readExpression(parsingContext, jSONObject, "ratio", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivAspectJsonParser.RATIO_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivAspect divAspect) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "ratio", divAspect.ratio);
            return jSONObject;
        }
    }

    /* compiled from: DivAspectJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivAspectTemplate deserialize(ParsingContext parsingContext, DivAspectTemplate divAspectTemplate, JSONObject jSONObject) {
            return new DivAspectTemplate(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "ratio", TypeHelpersKt.TYPE_HELPER_DOUBLE, parsingContext.getAllowPropertyOverride(), divAspectTemplate != null ? divAspectTemplate.ratio : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivAspectJsonParser.RATIO_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivAspectTemplate divAspectTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "ratio", divAspectTemplate.ratio);
            return jSONObject;
        }
    }

    /* compiled from: DivAspectJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivAspect resolve(ParsingContext parsingContext, DivAspectTemplate divAspectTemplate, JSONObject jSONObject) {
            return new DivAspect(JsonFieldResolver.resolveExpression(parsingContext, divAspectTemplate.ratio, jSONObject, "ratio", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivAspectJsonParser.RATIO_VALIDATOR));
        }
    }

    /* compiled from: DivAspectJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
