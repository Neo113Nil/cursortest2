package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: DivVisibilityActionJsonParser.kt */
/* loaded from: classes13.dex */
public abstract class DivVisibilityActionJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final Expression IS_ENABLED_DEFAULT_VALUE;
    public static final Expression LOG_LIMIT_DEFAULT_VALUE;
    public static final ValueValidator LOG_LIMIT_VALIDATOR;
    public static final Expression VISIBILITY_DURATION_DEFAULT_VALUE;
    public static final ValueValidator VISIBILITY_DURATION_VALIDATOR;
    public static final Expression VISIBILITY_PERCENTAGE_DEFAULT_VALUE;
    public static final ValueValidator VISIBILITY_PERCENTAGE_VALIDATOR;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LOG_LIMIT_VALIDATOR$lambda$0(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean VISIBILITY_DURATION_VALIDATOR$lambda$1(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean VISIBILITY_PERCENTAGE_VALIDATOR$lambda$2(long j) {
        return j > 0 && j <= 100;
    }

    /* compiled from: DivVisibilityActionJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivVisibilityAction deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            DivDownloadCallbacks divDownloadCallbacks = (DivDownloadCallbacks) JsonPropertyParser.readOptional(parsingContext, jSONObject, "download_callbacks", this.component.getDivDownloadCallbacksJsonEntityParser());
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = DivVisibilityActionJsonParser.IS_ENABLED_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper, function1, expression);
            Expression expression2 = readOptionalExpression == null ? expression : readOptionalExpression;
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING);
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = DivVisibilityActionJsonParser.LOG_LIMIT_VALIDATOR;
            Expression expression3 = DivVisibilityActionJsonParser.LOG_LIMIT_DEFAULT_VALUE;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "log_limit", typeHelper2, function12, valueValidator, expression3);
            if (readOptionalExpression2 != null) {
                expression3 = readOptionalExpression2;
            }
            JSONObject jSONObject2 = (JSONObject) JsonPropertyParser.readOptional(parsingContext, jSONObject, "payload");
            TypeHelper<Uri> typeHelper3 = TypeHelpersKt.TYPE_HELPER_URI;
            Function1 function13 = ParsingConvertersKt.ANY_TO_URI;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "referer", typeHelper3, function13);
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "scope_id");
            DivActionTyped divActionTyped = (DivActionTyped) JsonPropertyParser.readOptional(parsingContext, jSONObject, "typed", this.component.getDivActionTypedJsonEntityParser());
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "url", typeHelper3, function13);
            ValueValidator valueValidator2 = DivVisibilityActionJsonParser.VISIBILITY_DURATION_VALIDATOR;
            Expression expression4 = DivVisibilityActionJsonParser.VISIBILITY_DURATION_DEFAULT_VALUE;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility_duration", typeHelper2, function12, valueValidator2, expression4);
            if (readOptionalExpression5 != null) {
                expression4 = readOptionalExpression5;
            }
            ValueValidator valueValidator3 = DivVisibilityActionJsonParser.VISIBILITY_PERCENTAGE_VALIDATOR;
            Expression expression5 = DivVisibilityActionJsonParser.VISIBILITY_PERCENTAGE_DEFAULT_VALUE;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility_percentage", typeHelper2, function12, valueValidator3, expression5);
            if (readOptionalExpression6 != null) {
                expression5 = readOptionalExpression6;
            }
            return new DivVisibilityAction(divDownloadCallbacks, expression2, readExpression, expression3, jSONObject2, readOptionalExpression3, str, divActionTyped, readOptionalExpression4, expression4, expression5);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivVisibilityAction divVisibilityAction) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "download_callbacks", divVisibilityAction.getDownloadCallbacks(), this.component.getDivDownloadCallbacksJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", divVisibilityAction.isEnabled());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "log_id", divVisibilityAction.getLogId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "log_limit", divVisibilityAction.getLogLimit());
            JsonPropertyParser.write(parsingContext, jSONObject, "payload", divVisibilityAction.getPayload());
            Expression referer = divVisibilityAction.getReferer();
            Function1 function1 = ParsingConvertersKt.URI_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "referer", referer, function1);
            JsonPropertyParser.write(parsingContext, jSONObject, "scope_id", divVisibilityAction.getScopeId());
            JsonPropertyParser.write(parsingContext, jSONObject, "typed", divVisibilityAction.getTyped(), this.component.getDivActionTypedJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "url", divVisibilityAction.getUrl(), function1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility_duration", divVisibilityAction.visibilityDuration);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility_percentage", divVisibilityAction.visibilityPercentage);
            return jSONObject;
        }
    }

    /* compiled from: DivVisibilityActionJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivVisibilityActionTemplate deserialize(ParsingContext parsingContext, DivVisibilityActionTemplate divVisibilityActionTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "download_callbacks", allowPropertyOverride, divVisibilityActionTemplate != null ? divVisibilityActionTemplate.downloadCallbacks : null, this.component.getDivDownloadCallbacksJsonTemplateParser());
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divVisibilityActionTemplate != null ? divVisibilityActionTemplate.isEnabled : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divVisibilityActionTemplate != null ? divVisibilityActionTemplate.logId : null);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = divVisibilityActionTemplate != null ? divVisibilityActionTemplate.logLimit : null;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "log_limit", typeHelper, allowPropertyOverride, field, function1, DivVisibilityActionJsonParser.LOG_LIMIT_VALIDATOR);
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "payload", allowPropertyOverride, divVisibilityActionTemplate != null ? divVisibilityActionTemplate.payload : null);
            TypeHelper<Uri> typeHelper2 = TypeHelpersKt.TYPE_HELPER_URI;
            Field field2 = divVisibilityActionTemplate != null ? divVisibilityActionTemplate.referer : null;
            Function1 function12 = ParsingConvertersKt.ANY_TO_URI;
            return new DivVisibilityActionTemplate(readOptionalField, readOptionalFieldWithExpression, readFieldWithExpression, readOptionalFieldWithExpression2, readOptionalField2, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "referer", typeHelper2, allowPropertyOverride, field2, function12), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "scope_id", allowPropertyOverride, divVisibilityActionTemplate != null ? divVisibilityActionTemplate.scopeId : null), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "typed", allowPropertyOverride, divVisibilityActionTemplate != null ? divVisibilityActionTemplate.typed : null, this.component.getDivActionTypedJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "url", typeHelper2, allowPropertyOverride, divVisibilityActionTemplate != null ? divVisibilityActionTemplate.url : null, function12), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "visibility_duration", typeHelper, allowPropertyOverride, divVisibilityActionTemplate != null ? divVisibilityActionTemplate.visibilityDuration : null, function1, DivVisibilityActionJsonParser.VISIBILITY_DURATION_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "visibility_percentage", typeHelper, allowPropertyOverride, divVisibilityActionTemplate != null ? divVisibilityActionTemplate.visibilityPercentage : null, function1, DivVisibilityActionJsonParser.VISIBILITY_PERCENTAGE_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivVisibilityActionTemplate divVisibilityActionTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "download_callbacks", divVisibilityActionTemplate.downloadCallbacks, this.component.getDivDownloadCallbacksJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", divVisibilityActionTemplate.isEnabled);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "log_id", divVisibilityActionTemplate.logId);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "log_limit", divVisibilityActionTemplate.logLimit);
            JsonFieldParser.writeField(parsingContext, jSONObject, "payload", divVisibilityActionTemplate.payload);
            Field field = divVisibilityActionTemplate.referer;
            Function1 function1 = ParsingConvertersKt.URI_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "referer", field, function1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "scope_id", divVisibilityActionTemplate.scopeId);
            JsonFieldParser.writeField(parsingContext, jSONObject, "typed", divVisibilityActionTemplate.typed, this.component.getDivActionTypedJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", divVisibilityActionTemplate.url, function1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility_duration", divVisibilityActionTemplate.visibilityDuration);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility_percentage", divVisibilityActionTemplate.visibilityPercentage);
            return jSONObject;
        }
    }

    /* compiled from: DivVisibilityActionJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivVisibilityAction resolve(ParsingContext parsingContext, DivVisibilityActionTemplate divVisibilityActionTemplate, JSONObject jSONObject) {
            DivDownloadCallbacks divDownloadCallbacks = (DivDownloadCallbacks) JsonFieldResolver.resolveOptional(parsingContext, divVisibilityActionTemplate.downloadCallbacks, jSONObject, "download_callbacks", this.component.getDivDownloadCallbacksJsonTemplateResolver(), this.component.getDivDownloadCallbacksJsonEntityParser());
            Field field = divVisibilityActionTemplate.isEnabled;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = DivVisibilityActionJsonParser.IS_ENABLED_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "is_enabled", typeHelper, function1, expression);
            Expression expression2 = resolveOptionalExpression == null ? expression : resolveOptionalExpression;
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divVisibilityActionTemplate.logId, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Field field2 = divVisibilityActionTemplate.logLimit;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = DivVisibilityActionJsonParser.LOG_LIMIT_VALIDATOR;
            Expression expression3 = DivVisibilityActionJsonParser.LOG_LIMIT_DEFAULT_VALUE;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "log_limit", typeHelper2, function12, valueValidator, expression3);
            if (resolveOptionalExpression2 != null) {
                expression3 = resolveOptionalExpression2;
            }
            JSONObject jSONObject2 = (JSONObject) JsonFieldResolver.resolveOptional(parsingContext, divVisibilityActionTemplate.payload, jSONObject, "payload");
            Field field3 = divVisibilityActionTemplate.referer;
            TypeHelper<Uri> typeHelper3 = TypeHelpersKt.TYPE_HELPER_URI;
            Function1 function13 = ParsingConvertersKt.ANY_TO_URI;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "referer", typeHelper3, function13);
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divVisibilityActionTemplate.scopeId, jSONObject, "scope_id");
            DivActionTyped divActionTyped = (DivActionTyped) JsonFieldResolver.resolveOptional(parsingContext, divVisibilityActionTemplate.typed, jSONObject, "typed", this.component.getDivActionTypedJsonTemplateResolver(), this.component.getDivActionTypedJsonEntityParser());
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divVisibilityActionTemplate.url, jSONObject, "url", typeHelper3, function13);
            Field field4 = divVisibilityActionTemplate.visibilityDuration;
            ValueValidator valueValidator2 = DivVisibilityActionJsonParser.VISIBILITY_DURATION_VALIDATOR;
            Expression expression4 = DivVisibilityActionJsonParser.VISIBILITY_DURATION_DEFAULT_VALUE;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "visibility_duration", typeHelper2, function12, valueValidator2, expression4);
            if (resolveOptionalExpression5 != null) {
                expression4 = resolveOptionalExpression5;
            }
            Field field5 = divVisibilityActionTemplate.visibilityPercentage;
            ValueValidator valueValidator3 = DivVisibilityActionJsonParser.VISIBILITY_PERCENTAGE_VALIDATOR;
            Expression expression5 = DivVisibilityActionJsonParser.VISIBILITY_PERCENTAGE_DEFAULT_VALUE;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "visibility_percentage", typeHelper2, function12, valueValidator3, expression5);
            return new DivVisibilityAction(divDownloadCallbacks, expression2, resolveExpression, expression3, jSONObject2, resolveOptionalExpression3, str, divActionTyped, resolveOptionalExpression4, expression4, resolveOptionalExpression6 == null ? expression5 : resolveOptionalExpression6);
        }
    }

    /* compiled from: DivVisibilityActionJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        IS_ENABLED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        LOG_LIMIT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 1L, null, 2, null);
        VISIBILITY_DURATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 800L, null, 2, null);
        VISIBILITY_PERCENTAGE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 50L, null, 2, null);
        LOG_LIMIT_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivVisibilityActionJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean LOG_LIMIT_VALIDATOR$lambda$0;
                LOG_LIMIT_VALIDATOR$lambda$0 = DivVisibilityActionJsonParser.LOG_LIMIT_VALIDATOR$lambda$0(((Long) obj).longValue());
                return LOG_LIMIT_VALIDATOR$lambda$0;
            }
        };
        VISIBILITY_DURATION_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivVisibilityActionJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean VISIBILITY_DURATION_VALIDATOR$lambda$1;
                VISIBILITY_DURATION_VALIDATOR$lambda$1 = DivVisibilityActionJsonParser.VISIBILITY_DURATION_VALIDATOR$lambda$1(((Long) obj).longValue());
                return VISIBILITY_DURATION_VALIDATOR$lambda$1;
            }
        };
        VISIBILITY_PERCENTAGE_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivVisibilityActionJsonParser$$ExternalSyntheticLambda2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean VISIBILITY_PERCENTAGE_VALIDATOR$lambda$2;
                VISIBILITY_PERCENTAGE_VALIDATOR$lambda$2 = DivVisibilityActionJsonParser.VISIBILITY_PERCENTAGE_VALIDATOR$lambda$2(((Long) obj).longValue());
                return VISIBILITY_PERCENTAGE_VALIDATOR$lambda$2;
            }
        };
    }
}
