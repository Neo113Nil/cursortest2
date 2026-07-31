package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: DivDefaultIndicatorItemPlacementJsonParser.kt */
/* loaded from: classes10.dex */
public abstract class DivDefaultIndicatorItemPlacementJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final DivFixedSize SPACE_BETWEEN_CENTERS_DEFAULT_VALUE = new DivFixedSize(null, Expression.Companion.constant$default(Expression.INSTANCE, 15L, null, 2, null), 1, null);

    /* compiled from: DivDefaultIndicatorItemPlacementJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivDefaultIndicatorItemPlacement deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            DivFixedSize divFixedSize = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "space_between_centers", this.component.getDivFixedSizeJsonEntityParser());
            if (divFixedSize == null) {
                divFixedSize = DivDefaultIndicatorItemPlacementJsonParser.SPACE_BETWEEN_CENTERS_DEFAULT_VALUE;
            }
            return new DivDefaultIndicatorItemPlacement(divFixedSize);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivDefaultIndicatorItemPlacement divDefaultIndicatorItemPlacement) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "space_between_centers", divDefaultIndicatorItemPlacement.spaceBetweenCenters, this.component.getDivFixedSizeJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "default");
            return jSONObject;
        }
    }

    /* compiled from: DivDefaultIndicatorItemPlacementJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivDefaultIndicatorItemPlacementTemplate deserialize(ParsingContext parsingContext, DivDefaultIndicatorItemPlacementTemplate divDefaultIndicatorItemPlacementTemplate, JSONObject jSONObject) {
            return new DivDefaultIndicatorItemPlacementTemplate(JsonFieldParser.readOptionalField(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "space_between_centers", parsingContext.getAllowPropertyOverride(), divDefaultIndicatorItemPlacementTemplate != null ? divDefaultIndicatorItemPlacementTemplate.spaceBetweenCenters : null, this.component.getDivFixedSizeJsonTemplateParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivDefaultIndicatorItemPlacementTemplate divDefaultIndicatorItemPlacementTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "space_between_centers", divDefaultIndicatorItemPlacementTemplate.spaceBetweenCenters, this.component.getDivFixedSizeJsonTemplateParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "default");
            return jSONObject;
        }
    }

    /* compiled from: DivDefaultIndicatorItemPlacementJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivDefaultIndicatorItemPlacement resolve(ParsingContext parsingContext, DivDefaultIndicatorItemPlacementTemplate divDefaultIndicatorItemPlacementTemplate, JSONObject jSONObject) {
            DivFixedSize divFixedSize = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, divDefaultIndicatorItemPlacementTemplate.spaceBetweenCenters, jSONObject, "space_between_centers", this.component.getDivFixedSizeJsonTemplateResolver(), this.component.getDivFixedSizeJsonEntityParser());
            if (divFixedSize == null) {
                divFixedSize = DivDefaultIndicatorItemPlacementJsonParser.SPACE_BETWEEN_CENTERS_DEFAULT_VALUE;
            }
            return new DivDefaultIndicatorItemPlacement(divFixedSize);
        }
    }

    /* compiled from: DivDefaultIndicatorItemPlacementJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
