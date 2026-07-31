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

/* compiled from: DivDisappearActionJsonParser.kt */
/* loaded from: classes.dex */
public abstract class DivDisappearActionJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final Expression DISAPPEAR_DURATION_DEFAULT_VALUE;
    public static final ValueValidator DISAPPEAR_DURATION_VALIDATOR;
    public static final Expression IS_ENABLED_DEFAULT_VALUE;
    public static final Expression LOG_LIMIT_DEFAULT_VALUE;
    public static final ValueValidator LOG_LIMIT_VALIDATOR;
    public static final Expression VISIBILITY_PERCENTAGE_DEFAULT_VALUE;
    public static final ValueValidator VISIBILITY_PERCENTAGE_VALIDATOR;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DISAPPEAR_DURATION_VALIDATOR$lambda$0(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LOG_LIMIT_VALIDATOR$lambda$1(long j) {
        return j >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean VISIBILITY_PERCENTAGE_VALIDATOR$lambda$2(long j) {
        return j >= 0 && j < 100;
    }

    /* compiled from: DivDisappearActionJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivDisappearAction deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = DivDisappearActionJsonParser.DISAPPEAR_DURATION_VALIDATOR;
            Expression expression = DivDisappearActionJsonParser.DISAPPEAR_DURATION_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "disappear_duration", typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            DivDownloadCallbacks divDownloadCallbacks = (DivDownloadCallbacks) JsonPropertyParser.readOptional(parsingContext, jSONObject, "download_callbacks", this.component.getDivDownloadCallbacksJsonEntityParser());
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = DivDisappearActionJsonParser.IS_ENABLED_DEFAULT_VALUE;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper2, function12, expression2);
            Expression expression3 = readOptionalExpression2 == null ? expression2 : readOptionalExpression2;
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING);
            ValueValidator valueValidator2 = DivDisappearActionJsonParser.LOG_LIMIT_VALIDATOR;
            Expression expression4 = DivDisappearActionJsonParser.LOG_LIMIT_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "log_limit", typeHelper, function1, valueValidator2, expression4);
            if (readOptionalExpression3 != null) {
                expression4 = readOptionalExpression3;
            }
            JSONObject jSONObject2 = (JSONObject) JsonPropertyParser.readOptional(parsingContext, jSONObject, "payload");
            TypeHelper<Uri> typeHelper3 = TypeHelpersKt.TYPE_HELPER_URI;
            Function1 function13 = ParsingConvertersKt.ANY_TO_URI;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "referer", typeHelper3, function13);
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "scope_id");
            DivActionTyped divActionTyped = (DivActionTyped) JsonPropertyParser.readOptional(parsingContext, jSONObject, "typed", this.component.getDivActionTypedJsonEntityParser());
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "url", typeHelper3, function13);
            ValueValidator valueValidator3 = DivDisappearActionJsonParser.VISIBILITY_PERCENTAGE_VALIDATOR;
            Expression expression5 = DivDisappearActionJsonParser.VISIBILITY_PERCENTAGE_DEFAULT_VALUE;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "visibility_percentage", typeHelper, function1, valueValidator3, expression5);
            if (readOptionalExpression6 != null) {
                expression5 = readOptionalExpression6;
            }
            return new DivDisappearAction(expression, divDownloadCallbacks, expression3, readExpression, expression4, jSONObject2, readOptionalExpression4, str, divActionTyped, readOptionalExpression5, expression5);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivDisappearAction divDisappearAction) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "disappear_duration", divDisappearAction.disappearDuration);
            JsonPropertyParser.write(parsingContext, jSONObject, "download_callbacks", divDisappearAction.getDownloadCallbacks(), this.component.getDivDownloadCallbacksJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", divDisappearAction.isEnabled());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "log_id", divDisappearAction.getLogId());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "log_limit", divDisappearAction.getLogLimit());
            JsonPropertyParser.write(parsingContext, jSONObject, "payload", divDisappearAction.getPayload());
            Expression referer = divDisappearAction.getReferer();
            Function1 function1 = ParsingConvertersKt.URI_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "referer", referer, function1);
            JsonPropertyParser.write(parsingContext, jSONObject, "scope_id", divDisappearAction.getScopeId());
            JsonPropertyParser.write(parsingContext, jSONObject, "typed", divDisappearAction.getTyped(), this.component.getDivActionTypedJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "url", divDisappearAction.getUrl(), function1);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "visibility_percentage", divDisappearAction.visibilityPercentage);
            return jSONObject;
        }
    }

    /* compiled from: DivDisappearActionJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivDisappearActionTemplate deserialize(ParsingContext parsingContext, DivDisappearActionTemplate divDisappearActionTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Field field = divDisappearActionTemplate != null ? divDisappearActionTemplate.disappearDuration : null;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "disappear_duration", typeHelper, allowPropertyOverride, field, function1, DivDisappearActionJsonParser.DISAPPEAR_DURATION_VALIDATOR);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "download_callbacks", allowPropertyOverride, divDisappearActionTemplate != null ? divDisappearActionTemplate.downloadCallbacks : null, this.component.getDivDownloadCallbacksJsonTemplateParser());
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divDisappearActionTemplate != null ? divDisappearActionTemplate.isEnabled : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divDisappearActionTemplate != null ? divDisappearActionTemplate.logId : null);
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "log_limit", typeHelper, allowPropertyOverride, divDisappearActionTemplate != null ? divDisappearActionTemplate.logLimit : null, function1, DivDisappearActionJsonParser.LOG_LIMIT_VALIDATOR);
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "payload", allowPropertyOverride, divDisappearActionTemplate != null ? divDisappearActionTemplate.payload : null);
            TypeHelper<Uri> typeHelper2 = TypeHelpersKt.TYPE_HELPER_URI;
            Field field2 = divDisappearActionTemplate != null ? divDisappearActionTemplate.referer : null;
            Function1 function12 = ParsingConvertersKt.ANY_TO_URI;
            return new DivDisappearActionTemplate(readOptionalFieldWithExpression, readOptionalField, readOptionalFieldWithExpression2, readFieldWithExpression, readOptionalFieldWithExpression3, readOptionalField2, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "referer", typeHelper2, allowPropertyOverride, field2, function12), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "scope_id", allowPropertyOverride, divDisappearActionTemplate != null ? divDisappearActionTemplate.scopeId : null), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "typed", allowPropertyOverride, divDisappearActionTemplate != null ? divDisappearActionTemplate.typed : null, this.component.getDivActionTypedJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "url", typeHelper2, allowPropertyOverride, divDisappearActionTemplate != null ? divDisappearActionTemplate.url : null, function12), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "visibility_percentage", typeHelper, allowPropertyOverride, divDisappearActionTemplate != null ? divDisappearActionTemplate.visibilityPercentage : null, function1, DivDisappearActionJsonParser.VISIBILITY_PERCENTAGE_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivDisappearActionTemplate divDisappearActionTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "disappear_duration", divDisappearActionTemplate.disappearDuration);
            JsonFieldParser.writeField(parsingContext, jSONObject, "download_callbacks", divDisappearActionTemplate.downloadCallbacks, this.component.getDivDownloadCallbacksJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", divDisappearActionTemplate.isEnabled);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "log_id", divDisappearActionTemplate.logId);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "log_limit", divDisappearActionTemplate.logLimit);
            JsonFieldParser.writeField(parsingContext, jSONObject, "payload", divDisappearActionTemplate.payload);
            Field field = divDisappearActionTemplate.referer;
            Function1 function1 = ParsingConvertersKt.URI_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "referer", field, function1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "scope_id", divDisappearActionTemplate.scopeId);
            JsonFieldParser.writeField(parsingContext, jSONObject, "typed", divDisappearActionTemplate.typed, this.component.getDivActionTypedJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", divDisappearActionTemplate.url, function1);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "visibility_percentage", divDisappearActionTemplate.visibilityPercentage);
            return jSONObject;
        }
    }

    /* compiled from: DivDisappearActionJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivDisappearAction resolve(ParsingContext parsingContext, DivDisappearActionTemplate divDisappearActionTemplate, JSONObject jSONObject) {
            Field field = divDisappearActionTemplate.disappearDuration;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = DivDisappearActionJsonParser.DISAPPEAR_DURATION_VALIDATOR;
            Expression expression = DivDisappearActionJsonParser.DISAPPEAR_DURATION_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "disappear_duration", typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            DivDownloadCallbacks divDownloadCallbacks = (DivDownloadCallbacks) JsonFieldResolver.resolveOptional(parsingContext, divDisappearActionTemplate.downloadCallbacks, jSONObject, "download_callbacks", this.component.getDivDownloadCallbacksJsonTemplateResolver(), this.component.getDivDownloadCallbacksJsonEntityParser());
            Field field2 = divDisappearActionTemplate.isEnabled;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = DivDisappearActionJsonParser.IS_ENABLED_DEFAULT_VALUE;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "is_enabled", typeHelper2, function12, expression2);
            Expression expression3 = resolveOptionalExpression2 == null ? expression2 : resolveOptionalExpression2;
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divDisappearActionTemplate.logId, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Field field3 = divDisappearActionTemplate.logLimit;
            ValueValidator valueValidator2 = DivDisappearActionJsonParser.LOG_LIMIT_VALIDATOR;
            Expression expression4 = DivDisappearActionJsonParser.LOG_LIMIT_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "log_limit", typeHelper, function1, valueValidator2, expression4);
            if (resolveOptionalExpression3 != null) {
                expression4 = resolveOptionalExpression3;
            }
            JSONObject jSONObject2 = (JSONObject) JsonFieldResolver.resolveOptional(parsingContext, divDisappearActionTemplate.payload, jSONObject, "payload");
            Field field4 = divDisappearActionTemplate.referer;
            TypeHelper<Uri> typeHelper3 = TypeHelpersKt.TYPE_HELPER_URI;
            Function1 function13 = ParsingConvertersKt.ANY_TO_URI;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "referer", typeHelper3, function13);
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divDisappearActionTemplate.scopeId, jSONObject, "scope_id");
            DivActionTyped divActionTyped = (DivActionTyped) JsonFieldResolver.resolveOptional(parsingContext, divDisappearActionTemplate.typed, jSONObject, "typed", this.component.getDivActionTypedJsonTemplateResolver(), this.component.getDivActionTypedJsonEntityParser());
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divDisappearActionTemplate.url, jSONObject, "url", typeHelper3, function13);
            Field field5 = divDisappearActionTemplate.visibilityPercentage;
            ValueValidator valueValidator3 = DivDisappearActionJsonParser.VISIBILITY_PERCENTAGE_VALIDATOR;
            Expression expression5 = DivDisappearActionJsonParser.VISIBILITY_PERCENTAGE_DEFAULT_VALUE;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field5, jSONObject, "visibility_percentage", typeHelper, function1, valueValidator3, expression5);
            return new DivDisappearAction(expression, divDownloadCallbacks, expression3, resolveExpression, expression4, jSONObject2, resolveOptionalExpression4, str, divActionTyped, resolveOptionalExpression5, resolveOptionalExpression6 == null ? expression5 : resolveOptionalExpression6);
        }
    }

    /* compiled from: DivDisappearActionJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        DISAPPEAR_DURATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 800L, null, 2, null);
        IS_ENABLED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        LOG_LIMIT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 1L, null, 2, null);
        VISIBILITY_PERCENTAGE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        DISAPPEAR_DURATION_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivDisappearActionJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean DISAPPEAR_DURATION_VALIDATOR$lambda$0;
                DISAPPEAR_DURATION_VALIDATOR$lambda$0 = DivDisappearActionJsonParser.DISAPPEAR_DURATION_VALIDATOR$lambda$0(((Long) obj).longValue());
                return DISAPPEAR_DURATION_VALIDATOR$lambda$0;
            }
        };
        LOG_LIMIT_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivDisappearActionJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean LOG_LIMIT_VALIDATOR$lambda$1;
                LOG_LIMIT_VALIDATOR$lambda$1 = DivDisappearActionJsonParser.LOG_LIMIT_VALIDATOR$lambda$1(((Long) obj).longValue());
                return LOG_LIMIT_VALIDATOR$lambda$1;
            }
        };
        VISIBILITY_PERCENTAGE_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivDisappearActionJsonParser$$ExternalSyntheticLambda2
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean VISIBILITY_PERCENTAGE_VALIDATOR$lambda$2;
                VISIBILITY_PERCENTAGE_VALIDATOR$lambda$2 = DivDisappearActionJsonParser.VISIBILITY_PERCENTAGE_VALIDATOR$lambda$2(((Long) obj).longValue());
                return VISIBILITY_PERCENTAGE_VALIDATOR$lambda$2;
            }
        };
    }
}
