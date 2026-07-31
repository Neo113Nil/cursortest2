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
import com.yandex.div2.DivActionSubmit;
import com.yandex.div2.DivActionSubmitTemplate;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivActionSubmitJsonParser.kt */
/* loaded from: classes10.dex */
public abstract class DivActionSubmitRequestJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final Expression METHOD_DEFAULT_VALUE;
    public static final TypeHelper TYPE_HELPER_METHOD;

    /* compiled from: DivActionSubmitJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivActionSubmit.Request deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "headers", this.component.getDivActionSubmitRequestHeaderJsonEntityParser());
            TypeHelper typeHelper = DivActionSubmitRequestJsonParser.TYPE_HELPER_METHOD;
            Function1 function1 = DivActionSubmit.Request.Method.FROM_STRING;
            Expression expression = DivActionSubmitRequestJsonParser.METHOD_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "method", typeHelper, function1, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new DivActionSubmit.Request(readOptionalList, expression, JsonExpressionParser.readExpression(parsingContext, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivActionSubmit.Request request) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "headers", request.headers, this.component.getDivActionSubmitRequestHeaderJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "method", request.method, DivActionSubmit.Request.Method.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "url", request.url, ParsingConvertersKt.URI_TO_STRING);
            return jSONObject;
        }
    }

    /* compiled from: DivActionSubmitJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivActionSubmitTemplate.RequestTemplate deserialize(ParsingContext parsingContext, DivActionSubmitTemplate.RequestTemplate requestTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivActionSubmitTemplate.RequestTemplate(JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "headers", allowPropertyOverride, requestTemplate != null ? requestTemplate.headers : null, this.component.getDivActionSubmitRequestHeaderJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "method", DivActionSubmitRequestJsonParser.TYPE_HELPER_METHOD, allowPropertyOverride, requestTemplate != null ? requestTemplate.method : null, DivActionSubmit.Request.Method.FROM_STRING), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, requestTemplate != null ? requestTemplate.url : null, ParsingConvertersKt.ANY_TO_URI));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivActionSubmitTemplate.RequestTemplate requestTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "headers", requestTemplate.headers, this.component.getDivActionSubmitRequestHeaderJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "method", requestTemplate.method, DivActionSubmit.Request.Method.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", requestTemplate.url, ParsingConvertersKt.URI_TO_STRING);
            return jSONObject;
        }
    }

    /* compiled from: DivActionSubmitJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivActionSubmit.Request resolve(ParsingContext parsingContext, DivActionSubmitTemplate.RequestTemplate requestTemplate, JSONObject jSONObject) {
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, requestTemplate.headers, jSONObject, "headers", this.component.getDivActionSubmitRequestHeaderJsonTemplateResolver(), this.component.getDivActionSubmitRequestHeaderJsonEntityParser());
            Field field = requestTemplate.method;
            TypeHelper typeHelper = DivActionSubmitRequestJsonParser.TYPE_HELPER_METHOD;
            Function1 function1 = DivActionSubmit.Request.Method.FROM_STRING;
            Expression expression = DivActionSubmitRequestJsonParser.METHOD_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "method", typeHelper, function1, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new DivActionSubmit.Request(resolveOptionalList, expression, JsonFieldResolver.resolveExpression(parsingContext, requestTemplate.url, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
        }
    }

    /* compiled from: DivActionSubmitJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        DivActionSubmit.Request.Method method = DivActionSubmit.Request.Method.POST;
        METHOD_DEFAULT_VALUE = Expression.Companion.constant$default(companion, method, null, 2, null);
        TYPE_HELPER_METHOD = TypeHelper.INSTANCE.from(method, new Function1() { // from class: com.yandex.div2.DivActionSubmitRequestJsonParser$Companion$TYPE_HELPER_METHOD$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivActionSubmit.Request.Method);
            }
        });
    }
}
