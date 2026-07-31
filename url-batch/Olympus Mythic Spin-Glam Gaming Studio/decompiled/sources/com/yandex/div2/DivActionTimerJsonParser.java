package com.yandex.div2;

import com.yandex.div.core.DivActionHandler;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionTimer;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivActionTimerJsonParser.kt */
/* loaded from: classes13.dex */
public abstract class DivActionTimerJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final TypeHelper TYPE_HELPER_ACTION = TypeHelper.INSTANCE.from(ArraysKt.first(DivActionTimer.Action.values()), new Function1() { // from class: com.yandex.div2.DivActionTimerJsonParser$Companion$TYPE_HELPER_ACTION$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull Object obj) {
            return Boolean.valueOf(obj instanceof DivActionTimer.Action);
        }
    });

    /* compiled from: DivActionTimerJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivActionTimer deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            return new DivActionTimer(JsonExpressionParser.readExpression(parsingContext, jSONObject, "action", DivActionTimerJsonParser.TYPE_HELPER_ACTION, DivActionTimer.Action.FROM_STRING), JsonExpressionParser.readExpression(parsingContext, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivActionTimer divActionTimer) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "action", divActionTimer.action, DivActionTimer.Action.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "id", divActionTimer.id);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", DivActionHandler.DivActionReason.TIMER);
            return jSONObject;
        }
    }

    /* compiled from: DivActionTimerJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivActionTimerTemplate deserialize(ParsingContext parsingContext, DivActionTimerTemplate divActionTimerTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivActionTimerTemplate(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "action", DivActionTimerJsonParser.TYPE_HELPER_ACTION, allowPropertyOverride, divActionTimerTemplate != null ? divActionTimerTemplate.action : null, DivActionTimer.Action.FROM_STRING), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divActionTimerTemplate != null ? divActionTimerTemplate.id : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivActionTimerTemplate divActionTimerTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "action", divActionTimerTemplate.action, DivActionTimer.Action.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "id", divActionTimerTemplate.id);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", DivActionHandler.DivActionReason.TIMER);
            return jSONObject;
        }
    }

    /* compiled from: DivActionTimerJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivActionTimer resolve(ParsingContext parsingContext, DivActionTimerTemplate divActionTimerTemplate, JSONObject jSONObject) {
            return new DivActionTimer(JsonFieldResolver.resolveExpression(parsingContext, divActionTimerTemplate.action, jSONObject, "action", DivActionTimerJsonParser.TYPE_HELPER_ACTION, DivActionTimer.Action.FROM_STRING), JsonFieldResolver.resolveExpression(parsingContext, divActionTimerTemplate.id, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
        }
    }

    /* compiled from: DivActionTimerJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
