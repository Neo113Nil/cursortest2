package com.yandex.div2;

import com.facebook.appevents.codeless.internal.Constants;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivRadialGradientRelativeRadiusJsonParser.kt */
/* loaded from: classes8.dex */
public abstract class DivRadialGradientRelativeRadiusJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final TypeHelper TYPE_HELPER_VALUE = TypeHelper.INSTANCE.from(ArraysKt.first(DivRadialGradientRelativeRadius.Value.values()), new Function1() { // from class: com.yandex.div2.DivRadialGradientRelativeRadiusJsonParser$Companion$TYPE_HELPER_VALUE$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull Object obj) {
            return Boolean.valueOf(obj instanceof DivRadialGradientRelativeRadius.Value);
        }
    });

    /* compiled from: DivRadialGradientRelativeRadiusJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivRadialGradientRelativeRadius deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            return new DivRadialGradientRelativeRadius(JsonExpressionParser.readExpression(parsingContext, jSONObject, "value", DivRadialGradientRelativeRadiusJsonParser.TYPE_HELPER_VALUE, DivRadialGradientRelativeRadius.Value.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivRadialGradientRelativeRadius divRadialGradientRelativeRadius) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", Constants.PATH_TYPE_RELATIVE);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value", divRadialGradientRelativeRadius.value, DivRadialGradientRelativeRadius.Value.TO_STRING);
            return jSONObject;
        }
    }

    /* compiled from: DivRadialGradientRelativeRadiusJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivRadialGradientRelativeRadiusTemplate deserialize(ParsingContext parsingContext, DivRadialGradientRelativeRadiusTemplate divRadialGradientRelativeRadiusTemplate, JSONObject jSONObject) {
            return new DivRadialGradientRelativeRadiusTemplate(JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "value", DivRadialGradientRelativeRadiusJsonParser.TYPE_HELPER_VALUE, parsingContext.getAllowPropertyOverride(), divRadialGradientRelativeRadiusTemplate != null ? divRadialGradientRelativeRadiusTemplate.value : null, DivRadialGradientRelativeRadius.Value.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivRadialGradientRelativeRadiusTemplate divRadialGradientRelativeRadiusTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "type", Constants.PATH_TYPE_RELATIVE);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value", divRadialGradientRelativeRadiusTemplate.value, DivRadialGradientRelativeRadius.Value.TO_STRING);
            return jSONObject;
        }
    }

    /* compiled from: DivRadialGradientRelativeRadiusJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivRadialGradientRelativeRadius resolve(ParsingContext parsingContext, DivRadialGradientRelativeRadiusTemplate divRadialGradientRelativeRadiusTemplate, JSONObject jSONObject) {
            return new DivRadialGradientRelativeRadius(JsonFieldResolver.resolveExpression(parsingContext, divRadialGradientRelativeRadiusTemplate.value, jSONObject, "value", DivRadialGradientRelativeRadiusJsonParser.TYPE_HELPER_VALUE, DivRadialGradientRelativeRadius.Value.FROM_STRING));
        }
    }

    /* compiled from: DivRadialGradientRelativeRadiusJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
