package com.yandex.div2;

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
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: DivBorderJsonParser.kt */
/* loaded from: classes10.dex */
public abstract class DivBorderJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final Expression HAS_SHADOW_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.FALSE, null, 2, null);
    public static final ValueValidator CORNER_RADIUS_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivBorderJsonParser$$ExternalSyntheticLambda0
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean CORNER_RADIUS_VALIDATOR$lambda$0;
            CORNER_RADIUS_VALIDATOR$lambda$0 = DivBorderJsonParser.CORNER_RADIUS_VALIDATOR$lambda$0(((Long) obj).longValue());
            return CORNER_RADIUS_VALIDATOR$lambda$0;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CORNER_RADIUS_VALIDATOR$lambda$0(long j) {
        return j >= 0;
    }

    /* compiled from: DivBorderJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivBorder deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, DivBorderJsonParser.CORNER_RADIUS_VALIDATOR);
            DivCornersRadius divCornersRadius = (DivCornersRadius) JsonPropertyParser.readOptional(parsingContext, jSONObject, "corners_radius", this.component.getDivCornersRadiusJsonEntityParser());
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = DivBorderJsonParser.HAS_SHADOW_DEFAULT_VALUE;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "has_shadow", typeHelper, function1, expression);
            if (readOptionalExpression2 == null) {
                readOptionalExpression2 = expression;
            }
            return new DivBorder(readOptionalExpression, divCornersRadius, readOptionalExpression2, (DivShadow) JsonPropertyParser.readOptional(parsingContext, jSONObject, "shadow", this.component.getDivShadowJsonEntityParser()), (DivStroke) JsonPropertyParser.readOptional(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, this.component.getDivStrokeJsonEntityParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivBorder divBorder) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "corner_radius", divBorder.cornerRadius);
            JsonPropertyParser.write(parsingContext, jSONObject, "corners_radius", divBorder.cornersRadius, this.component.getDivCornersRadiusJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "has_shadow", divBorder.hasShadow);
            JsonPropertyParser.write(parsingContext, jSONObject, "shadow", divBorder.shadow, this.component.getDivShadowJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, divBorder.stroke, this.component.getDivStrokeJsonEntityParser());
            return jSONObject;
        }
    }

    /* compiled from: DivBorderJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivBorderTemplate deserialize(ParsingContext parsingContext, DivBorderTemplate divBorderTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivBorderTemplate(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, divBorderTemplate != null ? divBorderTemplate.cornerRadius : null, ParsingConvertersKt.NUMBER_TO_INT, DivBorderJsonParser.CORNER_RADIUS_VALIDATOR), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "corners_radius", allowPropertyOverride, divBorderTemplate != null ? divBorderTemplate.cornersRadius : null, this.component.getDivCornersRadiusJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "has_shadow", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divBorderTemplate != null ? divBorderTemplate.hasShadow : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "shadow", allowPropertyOverride, divBorderTemplate != null ? divBorderTemplate.shadow : null, this.component.getDivShadowJsonTemplateParser()), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, VastAttributes.STROKE_COLOR, allowPropertyOverride, divBorderTemplate != null ? divBorderTemplate.stroke : null, this.component.getDivStrokeJsonTemplateParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivBorderTemplate divBorderTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "corner_radius", divBorderTemplate.cornerRadius);
            JsonFieldParser.writeField(parsingContext, jSONObject, "corners_radius", divBorderTemplate.cornersRadius, this.component.getDivCornersRadiusJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "has_shadow", divBorderTemplate.hasShadow);
            JsonFieldParser.writeField(parsingContext, jSONObject, "shadow", divBorderTemplate.shadow, this.component.getDivShadowJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, divBorderTemplate.stroke, this.component.getDivStrokeJsonTemplateParser());
            return jSONObject;
        }
    }

    /* compiled from: DivBorderJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivBorder resolve(ParsingContext parsingContext, DivBorderTemplate divBorderTemplate, JSONObject jSONObject) {
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divBorderTemplate.cornerRadius, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, DivBorderJsonParser.CORNER_RADIUS_VALIDATOR);
            DivCornersRadius divCornersRadius = (DivCornersRadius) JsonFieldResolver.resolveOptional(parsingContext, divBorderTemplate.cornersRadius, jSONObject, "corners_radius", this.component.getDivCornersRadiusJsonTemplateResolver(), this.component.getDivCornersRadiusJsonEntityParser());
            Field field = divBorderTemplate.hasShadow;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = DivBorderJsonParser.HAS_SHADOW_DEFAULT_VALUE;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "has_shadow", typeHelper, function1, expression);
            if (resolveOptionalExpression2 != null) {
                expression = resolveOptionalExpression2;
            }
            return new DivBorder(resolveOptionalExpression, divCornersRadius, expression, (DivShadow) JsonFieldResolver.resolveOptional(parsingContext, divBorderTemplate.shadow, jSONObject, "shadow", this.component.getDivShadowJsonTemplateResolver(), this.component.getDivShadowJsonEntityParser()), (DivStroke) JsonFieldResolver.resolveOptional(parsingContext, divBorderTemplate.stroke, jSONObject, VastAttributes.STROKE_COLOR, this.component.getDivStrokeJsonTemplateResolver(), this.component.getDivStrokeJsonEntityParser()));
        }
    }

    /* compiled from: DivBorderJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
