package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import com.yandex.div.serialization.TemplateResolver;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: DivCircleShapeJsonParser.kt */
/* loaded from: classes9.dex */
public abstract class DivCircleShapeJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final DivFixedSize RADIUS_DEFAULT_VALUE = new DivFixedSize(null, Expression.Companion.constant$default(Expression.INSTANCE, 10L, null, 2, null), 1, null);

    /* compiled from: DivCircleShapeJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivCircleShape deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            DivFixedSize divFixedSize = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "radius", this.component.getDivFixedSizeJsonEntityParser());
            if (divFixedSize == null) {
                divFixedSize = DivCircleShapeJsonParser.RADIUS_DEFAULT_VALUE;
            }
            return new DivCircleShape(readOptionalExpression, divFixedSize, (DivStroke) JsonPropertyParser.readOptional(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, this.component.getDivStrokeJsonEntityParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivCircleShape divCircleShape) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "background_color", divCircleShape.backgroundColor, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "radius", divCircleShape.radius, this.component.getDivFixedSizeJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, divCircleShape.stroke, this.component.getDivStrokeJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "circle");
            return jSONObject;
        }
    }

    /* compiled from: DivCircleShapeJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivCircleShapeTemplate deserialize(ParsingContext parsingContext, DivCircleShapeTemplate divCircleShapeTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivCircleShapeTemplate(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, divCircleShapeTemplate != null ? divCircleShapeTemplate.backgroundColor : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "radius", allowPropertyOverride, divCircleShapeTemplate != null ? divCircleShapeTemplate.radius : null, this.component.getDivFixedSizeJsonTemplateParser()), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, VastAttributes.STROKE_COLOR, allowPropertyOverride, divCircleShapeTemplate != null ? divCircleShapeTemplate.stroke : null, this.component.getDivStrokeJsonTemplateParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivCircleShapeTemplate divCircleShapeTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "background_color", divCircleShapeTemplate.backgroundColor, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "radius", divCircleShapeTemplate.radius, this.component.getDivFixedSizeJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, divCircleShapeTemplate.stroke, this.component.getDivStrokeJsonTemplateParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "circle");
            return jSONObject;
        }
    }

    /* compiled from: DivCircleShapeJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivCircleShape resolve(ParsingContext parsingContext, DivCircleShapeTemplate divCircleShapeTemplate, JSONObject jSONObject) {
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divCircleShapeTemplate.backgroundColor, jSONObject, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            DivFixedSize divFixedSize = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, divCircleShapeTemplate.radius, jSONObject, "radius", this.component.getDivFixedSizeJsonTemplateResolver(), this.component.getDivFixedSizeJsonEntityParser());
            if (divFixedSize == null) {
                divFixedSize = DivCircleShapeJsonParser.RADIUS_DEFAULT_VALUE;
            }
            return new DivCircleShape(resolveOptionalExpression, divFixedSize, (DivStroke) JsonFieldResolver.resolveOptional(parsingContext, divCircleShapeTemplate.stroke, jSONObject, VastAttributes.STROKE_COLOR, this.component.getDivStrokeJsonTemplateResolver(), this.component.getDivStrokeJsonEntityParser()));
        }
    }

    /* compiled from: DivCircleShapeJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
