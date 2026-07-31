package com.yandex.div2;

import android.net.Uri;
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
import com.yandex.div2.DivAction;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivActionJsonParser.kt */
/* loaded from: classes10.dex */
public abstract class DivActionJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final Expression IS_ENABLED_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.TRUE, null, 2, null);
    public static final TypeHelper TYPE_HELPER_TARGET = TypeHelper.INSTANCE.from(ArraysKt.first(DivAction.Target.values()), new Function1() { // from class: com.yandex.div2.DivActionJsonParser$Companion$TYPE_HELPER_TARGET$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull Object obj) {
            return Boolean.valueOf(obj instanceof DivAction.Target);
        }
    });

    /* compiled from: DivActionJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivAction deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            DivDownloadCallbacks divDownloadCallbacks = (DivDownloadCallbacks) JsonPropertyParser.readOptional(parsingContext, jSONObject, "download_callbacks", this.component.getDivDownloadCallbacksJsonEntityParser());
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = DivActionJsonParser.IS_ENABLED_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper, function1, expression);
            Expression expression2 = readOptionalExpression == null ? expression : readOptionalExpression;
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING);
            TypeHelper<Uri> typeHelper2 = TypeHelpersKt.TYPE_HELPER_URI;
            Function1 function12 = ParsingConvertersKt.ANY_TO_URI;
            return new DivAction(divDownloadCallbacks, expression2, readExpression, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "log_url", typeHelper2, function12), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "menu_items", this.component.getDivActionMenuItemJsonEntityParser()), (JSONObject) JsonPropertyParser.readOptional(parsingContext, jSONObject, "payload"), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "referer", typeHelper2, function12), (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "scope_id"), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "target", DivActionJsonParser.TYPE_HELPER_TARGET, DivAction.Target.FROM_STRING), (DivActionTyped) JsonPropertyParser.readOptional(parsingContext, jSONObject, "typed", this.component.getDivActionTypedJsonEntityParser()), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "url", typeHelper2, function12));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivAction divAction) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "download_callbacks", divAction.downloadCallbacks, this.component.getDivDownloadCallbacksJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", divAction.isEnabled);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "log_id", divAction.logId);
            Expression expression = divAction.logUrl;
            Function1 function1 = ParsingConvertersKt.URI_TO_STRING;
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "log_url", expression, function1);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "menu_items", divAction.menuItems, this.component.getDivActionMenuItemJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "payload", divAction.payload);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "referer", divAction.referer, function1);
            JsonPropertyParser.write(parsingContext, jSONObject, "scope_id", divAction.scopeId);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "target", divAction.target, DivAction.Target.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "typed", divAction.typed, this.component.getDivActionTypedJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "url", divAction.url, function1);
            return jSONObject;
        }
    }

    /* compiled from: DivActionJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivActionTemplate deserialize(ParsingContext parsingContext, DivActionTemplate divActionTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "download_callbacks", allowPropertyOverride, divActionTemplate != null ? divActionTemplate.downloadCallbacks : null, this.component.getDivDownloadCallbacksJsonTemplateParser());
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divActionTemplate != null ? divActionTemplate.isEnabled : null, ParsingConvertersKt.ANY_TO_BOOLEAN);
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divActionTemplate != null ? divActionTemplate.logId : null);
            TypeHelper<Uri> typeHelper = TypeHelpersKt.TYPE_HELPER_URI;
            Field field = divActionTemplate != null ? divActionTemplate.logUrl : null;
            Function1 function1 = ParsingConvertersKt.ANY_TO_URI;
            return new DivActionTemplate(readOptionalField, readOptionalFieldWithExpression, readFieldWithExpression, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "log_url", typeHelper, allowPropertyOverride, field, function1), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "menu_items", allowPropertyOverride, divActionTemplate != null ? divActionTemplate.menuItems : null, this.component.getDivActionMenuItemJsonTemplateParser()), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "payload", allowPropertyOverride, divActionTemplate != null ? divActionTemplate.payload : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "referer", typeHelper, allowPropertyOverride, divActionTemplate != null ? divActionTemplate.referer : null, function1), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "scope_id", allowPropertyOverride, divActionTemplate != null ? divActionTemplate.scopeId : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "target", DivActionJsonParser.TYPE_HELPER_TARGET, allowPropertyOverride, divActionTemplate != null ? divActionTemplate.target : null, DivAction.Target.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "typed", allowPropertyOverride, divActionTemplate != null ? divActionTemplate.typed : null, this.component.getDivActionTypedJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "url", typeHelper, allowPropertyOverride, divActionTemplate != null ? divActionTemplate.url : null, function1));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivActionTemplate divActionTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "download_callbacks", divActionTemplate.downloadCallbacks, this.component.getDivDownloadCallbacksJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", divActionTemplate.isEnabled);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "log_id", divActionTemplate.logId);
            Field field = divActionTemplate.logUrl;
            Function1 function1 = ParsingConvertersKt.URI_TO_STRING;
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "log_url", field, function1);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "menu_items", divActionTemplate.menuItems, this.component.getDivActionMenuItemJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "payload", divActionTemplate.payload);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "referer", divActionTemplate.referer, function1);
            JsonFieldParser.writeField(parsingContext, jSONObject, "scope_id", divActionTemplate.scopeId);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "target", divActionTemplate.target, DivAction.Target.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "typed", divActionTemplate.typed, this.component.getDivActionTypedJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", divActionTemplate.url, function1);
            return jSONObject;
        }
    }

    /* compiled from: DivActionJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivAction resolve(ParsingContext parsingContext, DivActionTemplate divActionTemplate, JSONObject jSONObject) {
            DivDownloadCallbacks divDownloadCallbacks = (DivDownloadCallbacks) JsonFieldResolver.resolveOptional(parsingContext, divActionTemplate.downloadCallbacks, jSONObject, "download_callbacks", this.component.getDivDownloadCallbacksJsonTemplateResolver(), this.component.getDivDownloadCallbacksJsonEntityParser());
            Field field = divActionTemplate.isEnabled;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = DivActionJsonParser.IS_ENABLED_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "is_enabled", typeHelper, function1, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divActionTemplate.logId, jSONObject, "log_id", TypeHelpersKt.TYPE_HELPER_STRING);
            Field field2 = divActionTemplate.logUrl;
            TypeHelper<Uri> typeHelper2 = TypeHelpersKt.TYPE_HELPER_URI;
            Function1 function12 = ParsingConvertersKt.ANY_TO_URI;
            return new DivAction(divDownloadCallbacks, expression, resolveExpression, JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "log_url", typeHelper2, function12), JsonFieldResolver.resolveOptionalList(parsingContext, divActionTemplate.menuItems, jSONObject, "menu_items", this.component.getDivActionMenuItemJsonTemplateResolver(), this.component.getDivActionMenuItemJsonEntityParser()), (JSONObject) JsonFieldResolver.resolveOptional(parsingContext, divActionTemplate.payload, jSONObject, "payload"), JsonFieldResolver.resolveOptionalExpression(parsingContext, divActionTemplate.referer, jSONObject, "referer", typeHelper2, function12), (String) JsonFieldResolver.resolveOptional(parsingContext, divActionTemplate.scopeId, jSONObject, "scope_id"), JsonFieldResolver.resolveOptionalExpression(parsingContext, divActionTemplate.target, jSONObject, "target", DivActionJsonParser.TYPE_HELPER_TARGET, DivAction.Target.FROM_STRING), (DivActionTyped) JsonFieldResolver.resolveOptional(parsingContext, divActionTemplate.typed, jSONObject, "typed", this.component.getDivActionTypedJsonTemplateResolver(), this.component.getDivActionTypedJsonEntityParser()), JsonFieldResolver.resolveOptionalExpression(parsingContext, divActionTemplate.url, jSONObject, "url", typeHelper2, function12));
        }
    }

    /* compiled from: DivActionJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
