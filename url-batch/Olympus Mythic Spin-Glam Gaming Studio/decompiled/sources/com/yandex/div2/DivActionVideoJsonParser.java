package com.yandex.div2;

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
import com.yandex.div2.DivActionVideo;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivActionVideoJsonParser.kt */
/* loaded from: classes.dex */
public abstract class DivActionVideoJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final TypeHelper TYPE_HELPER_ACTION = TypeHelper.INSTANCE.from(ArraysKt.first(DivActionVideo.Action.values()), new Function1() { // from class: com.yandex.div2.DivActionVideoJsonParser$Companion$TYPE_HELPER_ACTION$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull Object obj) {
            return Boolean.valueOf(obj instanceof DivActionVideo.Action);
        }
    });

    /* compiled from: DivActionVideoJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivActionVideo deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            return new DivActionVideo(JsonExpressionParser.readExpression(parsingContext, jSONObject, "action", DivActionVideoJsonParser.TYPE_HELPER_ACTION, DivActionVideo.Action.FROM_STRING), JsonExpressionParser.readExpression(parsingContext, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivActionVideo divActionVideo) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "action", divActionVideo.action, DivActionVideo.Action.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "id", divActionVideo.id);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "video");
            return jSONObject;
        }
    }

    /* compiled from: DivActionVideoJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivActionVideoTemplate deserialize(ParsingContext parsingContext, DivActionVideoTemplate divActionVideoTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivActionVideoTemplate(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "action", DivActionVideoJsonParser.TYPE_HELPER_ACTION, allowPropertyOverride, divActionVideoTemplate != null ? divActionVideoTemplate.action : null, DivActionVideo.Action.FROM_STRING), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divActionVideoTemplate != null ? divActionVideoTemplate.id : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivActionVideoTemplate divActionVideoTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "action", divActionVideoTemplate.action, DivActionVideo.Action.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "id", divActionVideoTemplate.id);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "video");
            return jSONObject;
        }
    }

    /* compiled from: DivActionVideoJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivActionVideo resolve(ParsingContext parsingContext, DivActionVideoTemplate divActionVideoTemplate, JSONObject jSONObject) {
            return new DivActionVideo(JsonFieldResolver.resolveExpression(parsingContext, divActionVideoTemplate.action, jSONObject, "action", DivActionVideoJsonParser.TYPE_HELPER_ACTION, DivActionVideo.Action.FROM_STRING), JsonFieldResolver.resolveExpression(parsingContext, divActionVideoTemplate.id, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
        }
    }

    /* compiled from: DivActionVideoJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
