package com.yandex.div2;

import com.ironsource.X3;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: DivCornersRadiusJsonParser.kt */
/* loaded from: classes8.dex */
public abstract class DivCornersRadiusJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final ValueValidator BOTTOM_LEFT_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivCornersRadiusJsonParser$$ExternalSyntheticLambda0
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean BOTTOM_LEFT_VALIDATOR$lambda$0;
            BOTTOM_LEFT_VALIDATOR$lambda$0 = DivCornersRadiusJsonParser.BOTTOM_LEFT_VALIDATOR$lambda$0(((Long) obj).longValue());
            return BOTTOM_LEFT_VALIDATOR$lambda$0;
        }
    };
    public static final ValueValidator BOTTOM_RIGHT_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivCornersRadiusJsonParser$$ExternalSyntheticLambda1
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean BOTTOM_RIGHT_VALIDATOR$lambda$1;
            BOTTOM_RIGHT_VALIDATOR$lambda$1 = DivCornersRadiusJsonParser.BOTTOM_RIGHT_VALIDATOR$lambda$1(((Long) obj).longValue());
            return BOTTOM_RIGHT_VALIDATOR$lambda$1;
        }
    };
    public static final ValueValidator TOP_LEFT_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivCornersRadiusJsonParser$$ExternalSyntheticLambda2
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean TOP_LEFT_VALIDATOR$lambda$2;
            TOP_LEFT_VALIDATOR$lambda$2 = DivCornersRadiusJsonParser.TOP_LEFT_VALIDATOR$lambda$2(((Long) obj).longValue());
            return TOP_LEFT_VALIDATOR$lambda$2;
        }
    };
    public static final ValueValidator TOP_RIGHT_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivCornersRadiusJsonParser$$ExternalSyntheticLambda3
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean TOP_RIGHT_VALIDATOR$lambda$3;
            TOP_RIGHT_VALIDATOR$lambda$3 = DivCornersRadiusJsonParser.TOP_RIGHT_VALIDATOR$lambda$3(((Long) obj).longValue());
            return TOP_RIGHT_VALIDATOR$lambda$3;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BOTTOM_LEFT_VALIDATOR$lambda$0(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BOTTOM_RIGHT_VALIDATOR$lambda$1(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TOP_LEFT_VALIDATOR$lambda$2(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TOP_RIGHT_VALIDATOR$lambda$3(long j) {
        return j >= 0;
    }

    /* compiled from: DivCornersRadiusJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivCornersRadius deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivCornersRadius(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, X3.e.e, typeHelper, function1, DivCornersRadiusJsonParser.BOTTOM_LEFT_VALIDATOR), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, X3.e.d, typeHelper, function1, DivCornersRadiusJsonParser.BOTTOM_RIGHT_VALIDATOR), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, X3.e.c, typeHelper, function1, DivCornersRadiusJsonParser.TOP_LEFT_VALIDATOR), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, X3.e.b, typeHelper, function1, DivCornersRadiusJsonParser.TOP_RIGHT_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivCornersRadius divCornersRadius) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, X3.e.e, divCornersRadius.bottomLeft);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, X3.e.d, divCornersRadius.bottomRight);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, X3.e.c, divCornersRadius.topLeft);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, X3.e.b, divCornersRadius.topRight);
            return jSONObject;
        }
    }

    /* compiled from: DivCornersRadiusJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivCornersRadiusTemplate deserialize(ParsingContext parsingContext, DivCornersRadiusTemplate divCornersRadiusTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = divCornersRadiusTemplate != null ? divCornersRadiusTemplate.bottomLeft : null;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivCornersRadiusTemplate(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, X3.e.e, typeHelper, allowPropertyOverride, field, function1, DivCornersRadiusJsonParser.BOTTOM_LEFT_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, X3.e.d, typeHelper, allowPropertyOverride, divCornersRadiusTemplate != null ? divCornersRadiusTemplate.bottomRight : null, function1, DivCornersRadiusJsonParser.BOTTOM_RIGHT_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, X3.e.c, typeHelper, allowPropertyOverride, divCornersRadiusTemplate != null ? divCornersRadiusTemplate.topLeft : null, function1, DivCornersRadiusJsonParser.TOP_LEFT_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, X3.e.b, typeHelper, allowPropertyOverride, divCornersRadiusTemplate != null ? divCornersRadiusTemplate.topRight : null, function1, DivCornersRadiusJsonParser.TOP_RIGHT_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivCornersRadiusTemplate divCornersRadiusTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, X3.e.e, divCornersRadiusTemplate.bottomLeft);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, X3.e.d, divCornersRadiusTemplate.bottomRight);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, X3.e.c, divCornersRadiusTemplate.topLeft);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, X3.e.b, divCornersRadiusTemplate.topRight);
            return jSONObject;
        }
    }

    /* compiled from: DivCornersRadiusJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivCornersRadius resolve(ParsingContext parsingContext, DivCornersRadiusTemplate divCornersRadiusTemplate, JSONObject jSONObject) {
            Field field = divCornersRadiusTemplate.bottomLeft;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            return new DivCornersRadius(JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, X3.e.e, typeHelper, function1, DivCornersRadiusJsonParser.BOTTOM_LEFT_VALIDATOR), JsonFieldResolver.resolveOptionalExpression(parsingContext, divCornersRadiusTemplate.bottomRight, jSONObject, X3.e.d, typeHelper, function1, DivCornersRadiusJsonParser.BOTTOM_RIGHT_VALIDATOR), JsonFieldResolver.resolveOptionalExpression(parsingContext, divCornersRadiusTemplate.topLeft, jSONObject, X3.e.c, typeHelper, function1, DivCornersRadiusJsonParser.TOP_LEFT_VALIDATOR), JsonFieldResolver.resolveOptionalExpression(parsingContext, divCornersRadiusTemplate.topRight, jSONObject, X3.e.b, typeHelper, function1, DivCornersRadiusJsonParser.TOP_RIGHT_VALIDATOR));
        }
    }

    /* compiled from: DivCornersRadiusJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
