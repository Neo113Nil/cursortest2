package com.yandex.div2;

import com.ironsource.X3;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivLinearGradient;
import com.yandex.div2.DivLinearGradientTemplate;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: DivLinearGradientJsonParser.kt */
/* loaded from: classes13.dex */
public abstract class DivLinearGradientColorPointJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final ValueValidator POSITION_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivLinearGradientColorPointJsonParser$$ExternalSyntheticLambda0
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean POSITION_VALIDATOR$lambda$0;
            POSITION_VALIDATOR$lambda$0 = DivLinearGradientColorPointJsonParser.POSITION_VALIDATOR$lambda$0(((Double) obj).doubleValue());
            return POSITION_VALIDATOR$lambda$0;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean POSITION_VALIDATOR$lambda$0(double d) {
        return d >= 0.0d && d <= 1.0d;
    }

    /* compiled from: DivLinearGradientJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivLinearGradient.ColorPoint deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            return new DivLinearGradient.ColorPoint(JsonExpressionParser.readExpression(parsingContext, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonExpressionParser.readExpression(parsingContext, jSONObject, X3.i.L, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivLinearGradientColorPointJsonParser.POSITION_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivLinearGradient.ColorPoint colorPoint) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", colorPoint.color, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, X3.i.L, colorPoint.position);
            return jSONObject;
        }
    }

    /* compiled from: DivLinearGradientJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivLinearGradientTemplate.ColorPointTemplate deserialize(ParsingContext parsingContext, DivLinearGradientTemplate.ColorPointTemplate colorPointTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivLinearGradientTemplate.ColorPointTemplate(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, colorPointTemplate != null ? colorPointTemplate.color : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, X3.i.L, TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, colorPointTemplate != null ? colorPointTemplate.position : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivLinearGradientColorPointJsonParser.POSITION_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivLinearGradientTemplate.ColorPointTemplate colorPointTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", colorPointTemplate.color, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, X3.i.L, colorPointTemplate.position);
            return jSONObject;
        }
    }

    /* compiled from: DivLinearGradientJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivLinearGradient.ColorPoint resolve(ParsingContext parsingContext, DivLinearGradientTemplate.ColorPointTemplate colorPointTemplate, JSONObject jSONObject) {
            return new DivLinearGradient.ColorPoint(JsonFieldResolver.resolveExpression(parsingContext, colorPointTemplate.color, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldResolver.resolveExpression(parsingContext, colorPointTemplate.position, jSONObject, X3.i.L, TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivLinearGradientColorPointJsonParser.POSITION_VALIDATOR));
        }
    }

    /* compiled from: DivLinearGradientJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
