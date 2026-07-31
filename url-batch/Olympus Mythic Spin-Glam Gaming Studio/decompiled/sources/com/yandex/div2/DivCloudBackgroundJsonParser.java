package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: DivCloudBackgroundJsonParser.kt */
/* loaded from: classes13.dex */
public abstract class DivCloudBackgroundJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final ValueValidator CORNER_RADIUS_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivCloudBackgroundJsonParser$$ExternalSyntheticLambda0
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean CORNER_RADIUS_VALIDATOR$lambda$0;
            CORNER_RADIUS_VALIDATOR$lambda$0 = DivCloudBackgroundJsonParser.CORNER_RADIUS_VALIDATOR$lambda$0(((Long) obj).longValue());
            return CORNER_RADIUS_VALIDATOR$lambda$0;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CORNER_RADIUS_VALIDATOR$lambda$0(long j) {
        return j >= 0;
    }

    /* compiled from: DivCloudBackgroundJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivCloudBackground deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            return new DivCloudBackground(JsonExpressionParser.readExpression(parsingContext, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonExpressionParser.readExpression(parsingContext, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, DivCloudBackgroundJsonParser.CORNER_RADIUS_VALIDATOR), (DivEdgeInsets) JsonPropertyParser.readOptional(parsingContext, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonEntityParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivCloudBackground divCloudBackground) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", divCloudBackground.color, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "corner_radius", divCloudBackground.cornerRadius);
            JsonPropertyParser.write(parsingContext, jSONObject, "paddings", divCloudBackground.paddings, this.component.getDivEdgeInsetsJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "cloud");
            return jSONObject;
        }
    }

    /* compiled from: DivCloudBackgroundJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivCloudBackgroundTemplate deserialize(ParsingContext parsingContext, DivCloudBackgroundTemplate divCloudBackgroundTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivCloudBackgroundTemplate(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, divCloudBackgroundTemplate != null ? divCloudBackgroundTemplate.color : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, divCloudBackgroundTemplate != null ? divCloudBackgroundTemplate.cornerRadius : null, ParsingConvertersKt.NUMBER_TO_INT, DivCloudBackgroundJsonParser.CORNER_RADIUS_VALIDATOR), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "paddings", allowPropertyOverride, divCloudBackgroundTemplate != null ? divCloudBackgroundTemplate.paddings : null, this.component.getDivEdgeInsetsJsonTemplateParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivCloudBackgroundTemplate divCloudBackgroundTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", divCloudBackgroundTemplate.color, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "corner_radius", divCloudBackgroundTemplate.cornerRadius);
            JsonFieldParser.writeField(parsingContext, jSONObject, "paddings", divCloudBackgroundTemplate.paddings, this.component.getDivEdgeInsetsJsonTemplateParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "cloud");
            return jSONObject;
        }
    }

    /* compiled from: DivCloudBackgroundJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivCloudBackground resolve(ParsingContext parsingContext, DivCloudBackgroundTemplate divCloudBackgroundTemplate, JSONObject jSONObject) {
            return new DivCloudBackground(JsonFieldResolver.resolveExpression(parsingContext, divCloudBackgroundTemplate.color, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldResolver.resolveExpression(parsingContext, divCloudBackgroundTemplate.cornerRadius, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, DivCloudBackgroundJsonParser.CORNER_RADIUS_VALIDATOR), (DivEdgeInsets) JsonFieldResolver.resolveOptional(parsingContext, divCloudBackgroundTemplate.paddings, jSONObject, "paddings", this.component.getDivEdgeInsetsJsonTemplateResolver(), this.component.getDivEdgeInsetsJsonEntityParser()));
        }
    }

    /* compiled from: DivCloudBackgroundJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
