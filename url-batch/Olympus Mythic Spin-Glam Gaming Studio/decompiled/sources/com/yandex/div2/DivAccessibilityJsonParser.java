package com.yandex.div2;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.X3;
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
import com.yandex.div2.DivAccessibility;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivAccessibilityJsonParser.kt */
/* loaded from: classes13.dex */
public abstract class DivAccessibilityJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final Expression MODE_DEFAULT_VALUE;
    public static final Expression MUTE_AFTER_ACTION_DEFAULT_VALUE;
    public static final DivAccessibility.Type TYPE_DEFAULT_VALUE;
    public static final TypeHelper TYPE_HELPER_MODE;

    /* compiled from: DivAccessibilityJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivAccessibility deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "description", typeHelper);
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ViewHierarchyConstants.HINT_KEY, typeHelper);
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_checked", typeHelper2, function1);
            TypeHelper typeHelper3 = DivAccessibilityJsonParser.TYPE_HELPER_MODE;
            Function1 function12 = DivAccessibility.Mode.FROM_STRING;
            Expression expression = DivAccessibilityJsonParser.MODE_DEFAULT_VALUE;
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, X3.a.t, typeHelper3, function12, expression);
            if (readOptionalExpression4 != null) {
                expression = readOptionalExpression4;
            }
            Expression expression2 = DivAccessibilityJsonParser.MUTE_AFTER_ACTION_DEFAULT_VALUE;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "mute_after_action", typeHelper2, function1, expression2);
            Expression expression3 = readOptionalExpression5 == null ? expression2 : readOptionalExpression5;
            Expression readOptionalExpression6 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "state_description", typeHelper);
            DivAccessibility.Type type = (DivAccessibility.Type) JsonPropertyParser.readOptional(parsingContext, jSONObject, "type", DivAccessibility.Type.FROM_STRING);
            if (type == null) {
                type = DivAccessibilityJsonParser.TYPE_DEFAULT_VALUE;
            }
            return new DivAccessibility(readOptionalExpression, readOptionalExpression2, readOptionalExpression3, expression, expression3, readOptionalExpression6, type);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivAccessibility divAccessibility) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "description", divAccessibility.description);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, ViewHierarchyConstants.HINT_KEY, divAccessibility.hint);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_checked", divAccessibility.isChecked);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, X3.a.t, divAccessibility.mode, DivAccessibility.Mode.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "mute_after_action", divAccessibility.muteAfterAction);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "state_description", divAccessibility.stateDescription);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", divAccessibility.type, DivAccessibility.Type.TO_STRING);
            return jSONObject;
        }
    }

    /* compiled from: DivAccessibilityJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivAccessibilityTemplate deserialize(ParsingContext parsingContext, DivAccessibilityTemplate divAccessibilityTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "description", typeHelper, allowPropertyOverride, divAccessibilityTemplate != null ? divAccessibilityTemplate.description : null);
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, ViewHierarchyConstants.HINT_KEY, typeHelper, allowPropertyOverride, divAccessibilityTemplate != null ? divAccessibilityTemplate.hint : null);
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field = divAccessibilityTemplate != null ? divAccessibilityTemplate.isChecked : null;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            return new DivAccessibilityTemplate(readOptionalFieldWithExpression, readOptionalFieldWithExpression2, JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "is_checked", typeHelper2, allowPropertyOverride, field, function1), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, X3.a.t, DivAccessibilityJsonParser.TYPE_HELPER_MODE, allowPropertyOverride, divAccessibilityTemplate != null ? divAccessibilityTemplate.mode : null, DivAccessibility.Mode.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "mute_after_action", typeHelper2, allowPropertyOverride, divAccessibilityTemplate != null ? divAccessibilityTemplate.muteAfterAction : null, function1), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "state_description", typeHelper, allowPropertyOverride, divAccessibilityTemplate != null ? divAccessibilityTemplate.stateDescription : null), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "type", allowPropertyOverride, divAccessibilityTemplate != null ? divAccessibilityTemplate.type : null, DivAccessibility.Type.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivAccessibilityTemplate divAccessibilityTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "description", divAccessibilityTemplate.description);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, ViewHierarchyConstants.HINT_KEY, divAccessibilityTemplate.hint);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_checked", divAccessibilityTemplate.isChecked);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, X3.a.t, divAccessibilityTemplate.mode, DivAccessibility.Mode.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "mute_after_action", divAccessibilityTemplate.muteAfterAction);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "state_description", divAccessibilityTemplate.stateDescription);
            JsonFieldParser.writeField(parsingContext, jSONObject, "type", divAccessibilityTemplate.type, DivAccessibility.Type.TO_STRING);
            return jSONObject;
        }
    }

    /* compiled from: DivAccessibilityJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivAccessibility resolve(ParsingContext parsingContext, DivAccessibilityTemplate divAccessibilityTemplate, JSONObject jSONObject) {
            Field field = divAccessibilityTemplate.description;
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "description", typeHelper);
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divAccessibilityTemplate.hint, jSONObject, ViewHierarchyConstants.HINT_KEY, typeHelper);
            Field field2 = divAccessibilityTemplate.isChecked;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "is_checked", typeHelper2, function1);
            Field field3 = divAccessibilityTemplate.mode;
            TypeHelper typeHelper3 = DivAccessibilityJsonParser.TYPE_HELPER_MODE;
            Function1 function12 = DivAccessibility.Mode.FROM_STRING;
            Expression expression = DivAccessibilityJsonParser.MODE_DEFAULT_VALUE;
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, X3.a.t, typeHelper3, function12, expression);
            if (resolveOptionalExpression4 != null) {
                expression = resolveOptionalExpression4;
            }
            Field field4 = divAccessibilityTemplate.muteAfterAction;
            Expression expression2 = DivAccessibilityJsonParser.MUTE_AFTER_ACTION_DEFAULT_VALUE;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "mute_after_action", typeHelper2, function1, expression2);
            Expression expression3 = resolveOptionalExpression5 == null ? expression2 : resolveOptionalExpression5;
            Expression resolveOptionalExpression6 = JsonFieldResolver.resolveOptionalExpression(parsingContext, divAccessibilityTemplate.stateDescription, jSONObject, "state_description", typeHelper);
            DivAccessibility.Type type = (DivAccessibility.Type) JsonFieldResolver.resolveOptional(parsingContext, divAccessibilityTemplate.type, jSONObject, "type", DivAccessibility.Type.FROM_STRING);
            if (type == null) {
                type = DivAccessibilityJsonParser.TYPE_DEFAULT_VALUE;
            }
            return new DivAccessibility(resolveOptionalExpression, resolveOptionalExpression2, resolveOptionalExpression3, expression, expression3, resolveOptionalExpression6, type);
        }
    }

    /* compiled from: DivAccessibilityJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        DivAccessibility.Mode mode = DivAccessibility.Mode.DEFAULT;
        MODE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, mode, null, 2, null);
        MUTE_AFTER_ACTION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        TYPE_DEFAULT_VALUE = DivAccessibility.Type.AUTO;
        TYPE_HELPER_MODE = TypeHelper.INSTANCE.from(mode, new Function1() { // from class: com.yandex.div2.DivAccessibilityJsonParser$Companion$TYPE_HELPER_MODE$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivAccessibility.Mode);
            }
        });
    }
}
