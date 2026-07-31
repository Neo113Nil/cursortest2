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

/* compiled from: DivMatchParentSizeJsonParser.kt */
/* loaded from: classes8.dex */
public abstract class DivMatchParentSizeJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final ValueValidator WEIGHT_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivMatchParentSizeJsonParser$$ExternalSyntheticLambda0
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean WEIGHT_VALIDATOR$lambda$0;
            WEIGHT_VALIDATOR$lambda$0 = DivMatchParentSizeJsonParser.WEIGHT_VALIDATOR$lambda$0(((Double) obj).doubleValue());
            return WEIGHT_VALIDATOR$lambda$0;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean WEIGHT_VALIDATOR$lambda$0(double d) {
        return d > 0.0d;
    }

    /* compiled from: DivMatchParentSizeJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivMatchParentSize deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            return new DivMatchParentSize((DivSizeUnitValue) JsonPropertyParser.readOptional(parsingContext, jSONObject, "max_size", this.component.getDivSizeUnitValueJsonEntityParser()), (DivSizeUnitValue) JsonPropertyParser.readOptional(parsingContext, jSONObject, "min_size", this.component.getDivSizeUnitValueJsonEntityParser()), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "weight", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivMatchParentSizeJsonParser.WEIGHT_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivMatchParentSize divMatchParentSize) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "max_size", divMatchParentSize.maxSize, this.component.getDivSizeUnitValueJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "min_size", divMatchParentSize.minSize, this.component.getDivSizeUnitValueJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "match_parent");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "weight", divMatchParentSize.weight);
            return jSONObject;
        }
    }

    /* compiled from: DivMatchParentSizeJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivMatchParentSizeTemplate deserialize(ParsingContext parsingContext, DivMatchParentSizeTemplate divMatchParentSizeTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivMatchParentSizeTemplate(JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "max_size", allowPropertyOverride, divMatchParentSizeTemplate != null ? divMatchParentSizeTemplate.maxSize : null, this.component.getDivSizeUnitValueJsonTemplateParser()), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "min_size", allowPropertyOverride, divMatchParentSizeTemplate != null ? divMatchParentSizeTemplate.minSize : null, this.component.getDivSizeUnitValueJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "weight", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divMatchParentSizeTemplate != null ? divMatchParentSizeTemplate.weight : null, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivMatchParentSizeJsonParser.WEIGHT_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivMatchParentSizeTemplate divMatchParentSizeTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "max_size", divMatchParentSizeTemplate.maxSize, this.component.getDivSizeUnitValueJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "min_size", divMatchParentSizeTemplate.minSize, this.component.getDivSizeUnitValueJsonTemplateParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "match_parent");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "weight", divMatchParentSizeTemplate.weight);
            return jSONObject;
        }
    }

    /* compiled from: DivMatchParentSizeJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivMatchParentSize resolve(ParsingContext parsingContext, DivMatchParentSizeTemplate divMatchParentSizeTemplate, JSONObject jSONObject) {
            return new DivMatchParentSize((DivSizeUnitValue) JsonFieldResolver.resolveOptional(parsingContext, divMatchParentSizeTemplate.maxSize, jSONObject, "max_size", this.component.getDivSizeUnitValueJsonTemplateResolver(), this.component.getDivSizeUnitValueJsonEntityParser()), (DivSizeUnitValue) JsonFieldResolver.resolveOptional(parsingContext, divMatchParentSizeTemplate.minSize, jSONObject, "min_size", this.component.getDivSizeUnitValueJsonTemplateResolver(), this.component.getDivSizeUnitValueJsonEntityParser()), JsonFieldResolver.resolveOptionalExpression(parsingContext, divMatchParentSizeTemplate.weight, jSONObject, "weight", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE, DivMatchParentSizeJsonParser.WEIGHT_VALIDATOR));
        }
    }

    /* compiled from: DivMatchParentSizeJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
