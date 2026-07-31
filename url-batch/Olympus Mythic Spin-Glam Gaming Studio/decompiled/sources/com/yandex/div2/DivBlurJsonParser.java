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

/* compiled from: DivBlurJsonParser.kt */
/* loaded from: classes.dex */
public abstract class DivBlurJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final ValueValidator RADIUS_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivBlurJsonParser$$ExternalSyntheticLambda0
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean RADIUS_VALIDATOR$lambda$0;
            RADIUS_VALIDATOR$lambda$0 = DivBlurJsonParser.RADIUS_VALIDATOR$lambda$0(((Long) obj).longValue());
            return RADIUS_VALIDATOR$lambda$0;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RADIUS_VALIDATOR$lambda$0(long j) {
        return j >= 0;
    }

    /* compiled from: DivBlurJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivBlur deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            return new DivBlur(JsonExpressionParser.readExpression(parsingContext, jSONObject, "radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, DivBlurJsonParser.RADIUS_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivBlur divBlur) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "radius", divBlur.radius);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "blur");
            return jSONObject;
        }
    }

    /* compiled from: DivBlurJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivBlurTemplate deserialize(ParsingContext parsingContext, DivBlurTemplate divBlurTemplate, JSONObject jSONObject) {
            return new DivBlurTemplate(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "radius", TypeHelpersKt.TYPE_HELPER_INT, parsingContext.getAllowPropertyOverride(), divBlurTemplate != null ? divBlurTemplate.radius : null, ParsingConvertersKt.NUMBER_TO_INT, DivBlurJsonParser.RADIUS_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivBlurTemplate divBlurTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "radius", divBlurTemplate.radius);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "blur");
            return jSONObject;
        }
    }

    /* compiled from: DivBlurJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivBlur resolve(ParsingContext parsingContext, DivBlurTemplate divBlurTemplate, JSONObject jSONObject) {
            return new DivBlur(JsonFieldResolver.resolveExpression(parsingContext, divBlurTemplate.radius, jSONObject, "radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, DivBlurJsonParser.RADIUS_VALIDATOR));
        }
    }

    /* compiled from: DivBlurJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
