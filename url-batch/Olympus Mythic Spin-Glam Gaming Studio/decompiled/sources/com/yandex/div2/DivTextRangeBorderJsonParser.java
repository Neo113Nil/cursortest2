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
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: DivTextRangeBorderJsonParser.kt */
/* loaded from: classes9.dex */
public abstract class DivTextRangeBorderJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final ValueValidator CORNER_RADIUS_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivTextRangeBorderJsonParser$$ExternalSyntheticLambda0
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean CORNER_RADIUS_VALIDATOR$lambda$0;
            CORNER_RADIUS_VALIDATOR$lambda$0 = DivTextRangeBorderJsonParser.CORNER_RADIUS_VALIDATOR$lambda$0(((Long) obj).longValue());
            return CORNER_RADIUS_VALIDATOR$lambda$0;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CORNER_RADIUS_VALIDATOR$lambda$0(long j) {
        return j >= 0;
    }

    /* compiled from: DivTextRangeBorderJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivTextRangeBorder deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            return new DivTextRangeBorder(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, DivTextRangeBorderJsonParser.CORNER_RADIUS_VALIDATOR), (DivStroke) JsonPropertyParser.readOptional(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, this.component.getDivStrokeJsonEntityParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivTextRangeBorder divTextRangeBorder) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "corner_radius", divTextRangeBorder.cornerRadius);
            JsonPropertyParser.write(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, divTextRangeBorder.stroke, this.component.getDivStrokeJsonEntityParser());
            return jSONObject;
        }
    }

    /* compiled from: DivTextRangeBorderJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivTextRangeBorderTemplate deserialize(ParsingContext parsingContext, DivTextRangeBorderTemplate divTextRangeBorderTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivTextRangeBorderTemplate(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, divTextRangeBorderTemplate != null ? divTextRangeBorderTemplate.cornerRadius : null, ParsingConvertersKt.NUMBER_TO_INT, DivTextRangeBorderJsonParser.CORNER_RADIUS_VALIDATOR), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, VastAttributes.STROKE_COLOR, allowPropertyOverride, divTextRangeBorderTemplate != null ? divTextRangeBorderTemplate.stroke : null, this.component.getDivStrokeJsonTemplateParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivTextRangeBorderTemplate divTextRangeBorderTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "corner_radius", divTextRangeBorderTemplate.cornerRadius);
            JsonFieldParser.writeField(parsingContext, jSONObject, VastAttributes.STROKE_COLOR, divTextRangeBorderTemplate.stroke, this.component.getDivStrokeJsonTemplateParser());
            return jSONObject;
        }
    }

    /* compiled from: DivTextRangeBorderJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivTextRangeBorder resolve(ParsingContext parsingContext, DivTextRangeBorderTemplate divTextRangeBorderTemplate, JSONObject jSONObject) {
            return new DivTextRangeBorder(JsonFieldResolver.resolveOptionalExpression(parsingContext, divTextRangeBorderTemplate.cornerRadius, jSONObject, "corner_radius", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, DivTextRangeBorderJsonParser.CORNER_RADIUS_VALIDATOR), (DivStroke) JsonFieldResolver.resolveOptional(parsingContext, divTextRangeBorderTemplate.stroke, jSONObject, VastAttributes.STROKE_COLOR, this.component.getDivStrokeJsonTemplateResolver(), this.component.getDivStrokeJsonEntityParser()));
        }
    }

    /* compiled from: DivTextRangeBorderJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
