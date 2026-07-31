package com.yandex.div2;

import com.safedk.android.analytics.events.BrandSafetyEvent;
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

/* compiled from: DivTextRangeMaskParticlesJsonParser.kt */
/* loaded from: classes10.dex */
public abstract class DivTextRangeMaskParticlesJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final Expression DENSITY_DEFAULT_VALUE;
    public static final ValueValidator DENSITY_VALIDATOR;
    public static final Expression IS_ANIMATED_DEFAULT_VALUE;
    public static final Expression IS_ENABLED_DEFAULT_VALUE;
    public static final DivFixedSize PARTICLE_SIZE_DEFAULT_VALUE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DENSITY_VALIDATOR$lambda$0(double d) {
        return d > 0.0d && d <= 1.0d;
    }

    /* compiled from: DivTextRangeMaskParticlesJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivTextRangeMaskParticles deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivTextRangeMaskParticlesJsonParser.DENSITY_VALIDATOR;
            Expression expression = DivTextRangeMaskParticlesJsonParser.DENSITY_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "density", typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = DivTextRangeMaskParticlesJsonParser.IS_ANIMATED_DEFAULT_VALUE;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, BrandSafetyEvent.s, typeHelper2, function12, expression2);
            if (readOptionalExpression2 != null) {
                expression2 = readOptionalExpression2;
            }
            Expression expression3 = DivTextRangeMaskParticlesJsonParser.IS_ENABLED_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper2, function12, expression3);
            Expression expression4 = readOptionalExpression3 == null ? expression3 : readOptionalExpression3;
            DivFixedSize divFixedSize = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "particle_size", this.component.getDivFixedSizeJsonEntityParser());
            if (divFixedSize == null) {
                divFixedSize = DivTextRangeMaskParticlesJsonParser.PARTICLE_SIZE_DEFAULT_VALUE;
            }
            return new DivTextRangeMaskParticles(readExpression, expression, expression2, expression4, divFixedSize);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivTextRangeMaskParticles divTextRangeMaskParticles) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", divTextRangeMaskParticles.color, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "density", divTextRangeMaskParticles.density);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, BrandSafetyEvent.s, divTextRangeMaskParticles.isAnimated);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", divTextRangeMaskParticles.isEnabled);
            JsonPropertyParser.write(parsingContext, jSONObject, "particle_size", divTextRangeMaskParticles.particleSize, this.component.getDivFixedSizeJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "particles");
            return jSONObject;
        }
    }

    /* compiled from: DivTextRangeMaskParticlesJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivTextRangeMaskParticlesTemplate deserialize(ParsingContext parsingContext, DivTextRangeMaskParticlesTemplate divTextRangeMaskParticlesTemplate, JSONObject jSONObject) {
            TemplateParserImpl templateParserImpl;
            Field field;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, divTextRangeMaskParticlesTemplate != null ? divTextRangeMaskParticlesTemplate.color : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field readOptionalFieldWithExpression = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "density", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divTextRangeMaskParticlesTemplate != null ? divTextRangeMaskParticlesTemplate.density : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivTextRangeMaskParticlesJsonParser.DENSITY_VALIDATOR);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Field field2 = divTextRangeMaskParticlesTemplate != null ? divTextRangeMaskParticlesTemplate.isAnimated : null;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Field readOptionalFieldWithExpression2 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, BrandSafetyEvent.s, typeHelper, allowPropertyOverride, field2, function1);
            Field readOptionalFieldWithExpression3 = JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "is_enabled", typeHelper, allowPropertyOverride, divTextRangeMaskParticlesTemplate != null ? divTextRangeMaskParticlesTemplate.isEnabled : null, function1);
            if (divTextRangeMaskParticlesTemplate != null) {
                templateParserImpl = this;
                field = divTextRangeMaskParticlesTemplate.particleSize;
            } else {
                templateParserImpl = this;
                field = null;
            }
            return new DivTextRangeMaskParticlesTemplate(readFieldWithExpression, readOptionalFieldWithExpression, readOptionalFieldWithExpression2, readOptionalFieldWithExpression3, JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "particle_size", allowPropertyOverride, field, templateParserImpl.component.getDivFixedSizeJsonTemplateParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivTextRangeMaskParticlesTemplate divTextRangeMaskParticlesTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", divTextRangeMaskParticlesTemplate.color, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "density", divTextRangeMaskParticlesTemplate.density);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, BrandSafetyEvent.s, divTextRangeMaskParticlesTemplate.isAnimated);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", divTextRangeMaskParticlesTemplate.isEnabled);
            JsonFieldParser.writeField(parsingContext, jSONObject, "particle_size", divTextRangeMaskParticlesTemplate.particleSize, this.component.getDivFixedSizeJsonTemplateParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "particles");
            return jSONObject;
        }
    }

    /* compiled from: DivTextRangeMaskParticlesJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivTextRangeMaskParticles resolve(ParsingContext parsingContext, DivTextRangeMaskParticlesTemplate divTextRangeMaskParticlesTemplate, JSONObject jSONObject) {
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divTextRangeMaskParticlesTemplate.color, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field field = divTextRangeMaskParticlesTemplate.density;
            TypeHelper<Double> typeHelper = TypeHelpersKt.TYPE_HELPER_DOUBLE;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_DOUBLE;
            ValueValidator valueValidator = DivTextRangeMaskParticlesJsonParser.DENSITY_VALIDATOR;
            Expression expression = DivTextRangeMaskParticlesJsonParser.DENSITY_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "density", typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            Field field2 = divTextRangeMaskParticlesTemplate.isAnimated;
            TypeHelper<Boolean> typeHelper2 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function12 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression2 = DivTextRangeMaskParticlesJsonParser.IS_ANIMATED_DEFAULT_VALUE;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, BrandSafetyEvent.s, typeHelper2, function12, expression2);
            if (resolveOptionalExpression2 != null) {
                expression2 = resolveOptionalExpression2;
            }
            Field field3 = divTextRangeMaskParticlesTemplate.isEnabled;
            Expression expression3 = DivTextRangeMaskParticlesJsonParser.IS_ENABLED_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "is_enabled", typeHelper2, function12, expression3);
            if (resolveOptionalExpression3 != null) {
                expression3 = resolveOptionalExpression3;
            }
            DivFixedSize divFixedSize = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, divTextRangeMaskParticlesTemplate.particleSize, jSONObject, "particle_size", this.component.getDivFixedSizeJsonTemplateResolver(), this.component.getDivFixedSizeJsonEntityParser());
            if (divFixedSize == null) {
                divFixedSize = DivTextRangeMaskParticlesJsonParser.PARTICLE_SIZE_DEFAULT_VALUE;
            }
            return new DivTextRangeMaskParticles(resolveExpression, expression, expression2, expression3, divFixedSize);
        }
    }

    /* compiled from: DivTextRangeMaskParticlesJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        DENSITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(0.8d), null, 2, null);
        IS_ANIMATED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        IS_ENABLED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        PARTICLE_SIZE_DEFAULT_VALUE = new DivFixedSize(null, Expression.Companion.constant$default(companion, 1L, null, 2, null), 1, null);
        DENSITY_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivTextRangeMaskParticlesJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean DENSITY_VALIDATOR$lambda$0;
                DENSITY_VALIDATOR$lambda$0 = DivTextRangeMaskParticlesJsonParser.DENSITY_VALIDATOR$lambda$0(((Double) obj).doubleValue());
                return DENSITY_VALIDATOR$lambda$0;
            }
        };
    }
}
