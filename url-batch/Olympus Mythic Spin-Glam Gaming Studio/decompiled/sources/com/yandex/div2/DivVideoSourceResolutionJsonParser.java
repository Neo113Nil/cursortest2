package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivVideoSource;
import com.yandex.div2.DivVideoSourceTemplate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: DivVideoSourceJsonParser.kt */
/* loaded from: classes10.dex */
public abstract class DivVideoSourceResolutionJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final ValueValidator HEIGHT_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivVideoSourceResolutionJsonParser$$ExternalSyntheticLambda0
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean HEIGHT_VALIDATOR$lambda$0;
            HEIGHT_VALIDATOR$lambda$0 = DivVideoSourceResolutionJsonParser.HEIGHT_VALIDATOR$lambda$0(((Long) obj).longValue());
            return HEIGHT_VALIDATOR$lambda$0;
        }
    };
    public static final ValueValidator WIDTH_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivVideoSourceResolutionJsonParser$$ExternalSyntheticLambda1
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean WIDTH_VALIDATOR$lambda$1;
            WIDTH_VALIDATOR$lambda$1 = DivVideoSourceResolutionJsonParser.WIDTH_VALIDATOR$lambda$1(((Long) obj).longValue());
            return WIDTH_VALIDATOR$lambda$1;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HEIGHT_VALIDATOR$lambda$0(long j) {
        return j > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean WIDTH_VALIDATOR$lambda$1(long j) {
        return j > 0;
    }

    /* compiled from: DivVideoSourceJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivVideoSource.Resolution deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivVideoSource.Resolution(JsonExpressionParser.readExpression(parsingContext, jSONObject, "height", typeHelper, function1, DivVideoSourceResolutionJsonParser.HEIGHT_VALIDATOR), JsonExpressionParser.readExpression(parsingContext, jSONObject, "width", typeHelper, function1, DivVideoSourceResolutionJsonParser.WIDTH_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivVideoSource.Resolution resolution) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "height", resolution.height);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "resolution");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "width", resolution.width);
            return jSONObject;
        }
    }

    /* compiled from: DivVideoSourceJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivVideoSourceTemplate.ResolutionTemplate deserialize(ParsingContext parsingContext, DivVideoSourceTemplate.ResolutionTemplate resolutionTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = resolutionTemplate != null ? resolutionTemplate.height : null;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivVideoSourceTemplate.ResolutionTemplate(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "height", typeHelper, allowPropertyOverride, field, function1, DivVideoSourceResolutionJsonParser.HEIGHT_VALIDATOR), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "width", typeHelper, allowPropertyOverride, resolutionTemplate != null ? resolutionTemplate.width : null, function1, DivVideoSourceResolutionJsonParser.WIDTH_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivVideoSourceTemplate.ResolutionTemplate resolutionTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "height", resolutionTemplate.height);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "resolution");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "width", resolutionTemplate.width);
            return jSONObject;
        }
    }

    /* compiled from: DivVideoSourceJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivVideoSource.Resolution resolve(ParsingContext parsingContext, DivVideoSourceTemplate.ResolutionTemplate resolutionTemplate, JSONObject jSONObject) {
            Field field = resolutionTemplate.height;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivVideoSource.Resolution(JsonFieldResolver.resolveExpression(parsingContext, field, jSONObject, "height", typeHelper, function1, DivVideoSourceResolutionJsonParser.HEIGHT_VALIDATOR), JsonFieldResolver.resolveExpression(parsingContext, resolutionTemplate.width, jSONObject, "width", typeHelper, function1, DivVideoSourceResolutionJsonParser.WIDTH_VALIDATOR));
        }
    }

    /* compiled from: DivVideoSourceJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
