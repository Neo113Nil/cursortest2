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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: DivStretchIndicatorItemPlacementJsonParser.kt */
/* loaded from: classes13.dex */
public abstract class DivStretchIndicatorItemPlacementJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final DivFixedSize ITEM_SPACING_DEFAULT_VALUE;
    public static final Expression MAX_VISIBLE_ITEMS_DEFAULT_VALUE;
    public static final ValueValidator MAX_VISIBLE_ITEMS_VALIDATOR;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MAX_VISIBLE_ITEMS_VALIDATOR$lambda$0(long j) {
        return j > 0;
    }

    /* compiled from: DivStretchIndicatorItemPlacementJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivStretchIndicatorItemPlacement deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            DivFixedSize divFixedSize = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "item_spacing", this.component.getDivFixedSizeJsonEntityParser());
            if (divFixedSize == null) {
                divFixedSize = DivStretchIndicatorItemPlacementJsonParser.ITEM_SPACING_DEFAULT_VALUE;
            }
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = DivStretchIndicatorItemPlacementJsonParser.MAX_VISIBLE_ITEMS_VALIDATOR;
            Expression expression = DivStretchIndicatorItemPlacementJsonParser.MAX_VISIBLE_ITEMS_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "max_visible_items", typeHelper, function1, valueValidator, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new DivStretchIndicatorItemPlacement(divFixedSize, expression);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivStretchIndicatorItemPlacement divStretchIndicatorItemPlacement) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "item_spacing", divStretchIndicatorItemPlacement.itemSpacing, this.component.getDivFixedSizeJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "max_visible_items", divStretchIndicatorItemPlacement.maxVisibleItems);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "stretch");
            return jSONObject;
        }
    }

    /* compiled from: DivStretchIndicatorItemPlacementJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivStretchIndicatorItemPlacementTemplate deserialize(ParsingContext parsingContext, DivStretchIndicatorItemPlacementTemplate divStretchIndicatorItemPlacementTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivStretchIndicatorItemPlacementTemplate(JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "item_spacing", allowPropertyOverride, divStretchIndicatorItemPlacementTemplate != null ? divStretchIndicatorItemPlacementTemplate.itemSpacing : null, this.component.getDivFixedSizeJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "max_visible_items", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, divStretchIndicatorItemPlacementTemplate != null ? divStretchIndicatorItemPlacementTemplate.maxVisibleItems : null, ParsingConvertersKt.NUMBER_TO_INT, DivStretchIndicatorItemPlacementJsonParser.MAX_VISIBLE_ITEMS_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivStretchIndicatorItemPlacementTemplate divStretchIndicatorItemPlacementTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "item_spacing", divStretchIndicatorItemPlacementTemplate.itemSpacing, this.component.getDivFixedSizeJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "max_visible_items", divStretchIndicatorItemPlacementTemplate.maxVisibleItems);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "stretch");
            return jSONObject;
        }
    }

    /* compiled from: DivStretchIndicatorItemPlacementJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivStretchIndicatorItemPlacement resolve(ParsingContext parsingContext, DivStretchIndicatorItemPlacementTemplate divStretchIndicatorItemPlacementTemplate, JSONObject jSONObject) {
            DivFixedSize divFixedSize = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, divStretchIndicatorItemPlacementTemplate.itemSpacing, jSONObject, "item_spacing", this.component.getDivFixedSizeJsonTemplateResolver(), this.component.getDivFixedSizeJsonEntityParser());
            if (divFixedSize == null) {
                divFixedSize = DivStretchIndicatorItemPlacementJsonParser.ITEM_SPACING_DEFAULT_VALUE;
            }
            Field field = divStretchIndicatorItemPlacementTemplate.maxVisibleItems;
            TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function1 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = DivStretchIndicatorItemPlacementJsonParser.MAX_VISIBLE_ITEMS_VALIDATOR;
            Expression expression = DivStretchIndicatorItemPlacementJsonParser.MAX_VISIBLE_ITEMS_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "max_visible_items", typeHelper, function1, valueValidator, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new DivStretchIndicatorItemPlacement(divFixedSize, expression);
        }
    }

    /* compiled from: DivStretchIndicatorItemPlacementJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        ITEM_SPACING_DEFAULT_VALUE = new DivFixedSize(null, Expression.Companion.constant$default(companion, 5L, null, 2, null), 1, null);
        MAX_VISIBLE_ITEMS_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 10L, null, 2, null);
        MAX_VISIBLE_ITEMS_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivStretchIndicatorItemPlacementJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean MAX_VISIBLE_ITEMS_VALIDATOR$lambda$0;
                MAX_VISIBLE_ITEMS_VALIDATOR$lambda$0 = DivStretchIndicatorItemPlacementJsonParser.MAX_VISIBLE_ITEMS_VALIDATOR$lambda$0(((Long) obj).longValue());
                return MAX_VISIBLE_ITEMS_VALIDATOR$lambda$0;
            }
        };
    }
}
