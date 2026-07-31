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

/* compiled from: DivRoundedRectangleShapeJsonParser.kt */
/* loaded from: classes9.dex */
public abstract class DivRoundedRectangleShapeJsonParser {
    public static final DivFixedSize CORNER_RADIUS_DEFAULT_VALUE;
    private static final Companion Companion = new Companion(null);
    public static final DivFixedSize ITEM_HEIGHT_DEFAULT_VALUE;
    public static final DivFixedSize ITEM_WIDTH_DEFAULT_VALUE;

    /* compiled from: DivRoundedRectangleShapeJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivRoundedRectangleShape deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            DivFixedSize divFixedSize = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "corner_radius", this.component.getDivFixedSizeJsonEntityParser());
            if (divFixedSize == null) {
                divFixedSize = DivRoundedRectangleShapeJsonParser.CORNER_RADIUS_DEFAULT_VALUE;
            }
            DivFixedSize divFixedSize2 = divFixedSize;
            DivFixedSize divFixedSize3 = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_height", this.component.getDivFixedSizeJsonEntityParser());
            if (divFixedSize3 == null) {
                divFixedSize3 = DivRoundedRectangleShapeJsonParser.ITEM_HEIGHT_DEFAULT_VALUE;
            }
            DivFixedSize divFixedSize4 = divFixedSize3;
            DivFixedSize divFixedSize5 = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_width", this.component.getDivFixedSizeJsonEntityParser());
            if (divFixedSize5 == null) {
                divFixedSize5 = DivRoundedRectangleShapeJsonParser.ITEM_WIDTH_DEFAULT_VALUE;
            }
            return new DivRoundedRectangleShape(readOptionalExpression, divFixedSize2, divFixedSize4, divFixedSize5, (DivStroke) JsonPropertyParser.readOptional(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, this.component.getDivStrokeJsonEntityParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivRoundedRectangleShape divRoundedRectangleShape) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "background_color", divRoundedRectangleShape.backgroundColor, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "corner_radius", divRoundedRectangleShape.cornerRadius, this.component.getDivFixedSizeJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "item_height", divRoundedRectangleShape.itemHeight, this.component.getDivFixedSizeJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "item_width", divRoundedRectangleShape.itemWidth, this.component.getDivFixedSizeJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, divRoundedRectangleShape.stroke, this.component.getDivStrokeJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "rounded_rectangle");
            return jSONObject;
        }
    }

    /* compiled from: DivRoundedRectangleShapeJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivRoundedRectangleShapeTemplate deserialize(ParsingContext parsingContext, DivRoundedRectangleShapeTemplate divRoundedRectangleShapeTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivRoundedRectangleShapeTemplate(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, divRoundedRectangleShapeTemplate != null ? divRoundedRectangleShapeTemplate.backgroundColor : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "corner_radius", allowPropertyOverride, divRoundedRectangleShapeTemplate != null ? divRoundedRectangleShapeTemplate.cornerRadius : null, this.component.getDivFixedSizeJsonTemplateParser()), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "item_height", allowPropertyOverride, divRoundedRectangleShapeTemplate != null ? divRoundedRectangleShapeTemplate.itemHeight : null, this.component.getDivFixedSizeJsonTemplateParser()), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "item_width", allowPropertyOverride, divRoundedRectangleShapeTemplate != null ? divRoundedRectangleShapeTemplate.itemWidth : null, this.component.getDivFixedSizeJsonTemplateParser()), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, VastAttributes.STROKE_COLOR, allowPropertyOverride, divRoundedRectangleShapeTemplate != null ? divRoundedRectangleShapeTemplate.stroke : null, this.component.getDivStrokeJsonTemplateParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivRoundedRectangleShapeTemplate divRoundedRectangleShapeTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "background_color", divRoundedRectangleShapeTemplate.backgroundColor, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "corner_radius", divRoundedRectangleShapeTemplate.cornerRadius, this.component.getDivFixedSizeJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "item_height", divRoundedRectangleShapeTemplate.itemHeight, this.component.getDivFixedSizeJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "item_width", divRoundedRectangleShapeTemplate.itemWidth, this.component.getDivFixedSizeJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, divRoundedRectangleShapeTemplate.stroke, this.component.getDivStrokeJsonTemplateParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "rounded_rectangle");
            return jSONObject;
        }
    }

    /* compiled from: DivRoundedRectangleShapeJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivRoundedRectangleShape resolve(ParsingContext parsingContext, DivRoundedRectangleShapeTemplate divRoundedRectangleShapeTemplate, JSONObject jSONObject) {
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divRoundedRectangleShapeTemplate.backgroundColor, jSONObject, "background_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            DivFixedSize divFixedSize = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, divRoundedRectangleShapeTemplate.cornerRadius, jSONObject, "corner_radius", this.component.getDivFixedSizeJsonTemplateResolver(), this.component.getDivFixedSizeJsonEntityParser());
            if (divFixedSize == null) {
                divFixedSize = DivRoundedRectangleShapeJsonParser.CORNER_RADIUS_DEFAULT_VALUE;
            }
            DivFixedSize divFixedSize2 = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, divRoundedRectangleShapeTemplate.itemHeight, jSONObject, "item_height", this.component.getDivFixedSizeJsonTemplateResolver(), this.component.getDivFixedSizeJsonEntityParser());
            if (divFixedSize2 == null) {
                divFixedSize2 = DivRoundedRectangleShapeJsonParser.ITEM_HEIGHT_DEFAULT_VALUE;
            }
            DivFixedSize divFixedSize3 = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, divRoundedRectangleShapeTemplate.itemWidth, jSONObject, "item_width", this.component.getDivFixedSizeJsonTemplateResolver(), this.component.getDivFixedSizeJsonEntityParser());
            if (divFixedSize3 == null) {
                divFixedSize3 = DivRoundedRectangleShapeJsonParser.ITEM_WIDTH_DEFAULT_VALUE;
            }
            return new DivRoundedRectangleShape(resolveOptionalExpression, divFixedSize, divFixedSize2, divFixedSize3, (DivStroke) JsonFieldResolver.resolveOptional(parsingContext, divRoundedRectangleShapeTemplate.stroke, jSONObject, VastAttributes.STROKE_COLOR, this.component.getDivStrokeJsonTemplateResolver(), this.component.getDivStrokeJsonEntityParser()));
        }
    }

    /* compiled from: DivRoundedRectangleShapeJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        CORNER_RADIUS_DEFAULT_VALUE = new DivFixedSize(null, Expression.Companion.constant$default(companion, 5L, null, 2, null), 1, null);
        ITEM_HEIGHT_DEFAULT_VALUE = new DivFixedSize(null, Expression.Companion.constant$default(companion, 10L, null, 2, null), 1, null);
        ITEM_WIDTH_DEFAULT_VALUE = new DivFixedSize(null, Expression.Companion.constant$default(companion, 10L, null, 2, null), 1, null);
    }
}
