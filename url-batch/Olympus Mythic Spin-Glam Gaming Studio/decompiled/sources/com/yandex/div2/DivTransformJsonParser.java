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
import com.yandex.div2.DivPivot;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: DivTransformJsonParser.kt */
/* loaded from: classes13.dex */
public abstract class DivTransformJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final DivPivot.Percentage PIVOT_X_DEFAULT_VALUE;
    public static final DivPivot.Percentage PIVOT_Y_DEFAULT_VALUE;

    /* compiled from: DivTransformJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivTransform deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            DivPivot divPivot = (DivPivot) JsonPropertyParser.readOptional(parsingContext, jSONObject, "pivot_x", this.component.getDivPivotJsonEntityParser());
            if (divPivot == null) {
                divPivot = DivTransformJsonParser.PIVOT_X_DEFAULT_VALUE;
            }
            DivPivot divPivot2 = (DivPivot) JsonPropertyParser.readOptional(parsingContext, jSONObject, "pivot_y", this.component.getDivPivotJsonEntityParser());
            if (divPivot2 == null) {
                divPivot2 = DivTransformJsonParser.PIVOT_Y_DEFAULT_VALUE;
            }
            return new DivTransform(divPivot, divPivot2, JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "rotation", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivTransform divTransform) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "pivot_x", divTransform.pivotX, this.component.getDivPivotJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "pivot_y", divTransform.pivotY, this.component.getDivPivotJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "rotation", divTransform.rotation);
            return jSONObject;
        }
    }

    /* compiled from: DivTransformJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivTransformTemplate deserialize(ParsingContext parsingContext, DivTransformTemplate divTransformTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivTransformTemplate(JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "pivot_x", allowPropertyOverride, divTransformTemplate != null ? divTransformTemplate.pivotX : null, this.component.getDivPivotJsonTemplateParser()), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "pivot_y", allowPropertyOverride, divTransformTemplate != null ? divTransformTemplate.pivotY : null, this.component.getDivPivotJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "rotation", TypeHelpersKt.TYPE_HELPER_DOUBLE, allowPropertyOverride, divTransformTemplate != null ? divTransformTemplate.rotation : null, ParsingConvertersKt.NUMBER_TO_DOUBLE));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivTransformTemplate divTransformTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "pivot_x", divTransformTemplate.pivotX, this.component.getDivPivotJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "pivot_y", divTransformTemplate.pivotY, this.component.getDivPivotJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "rotation", divTransformTemplate.rotation);
            return jSONObject;
        }
    }

    /* compiled from: DivTransformJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivTransform resolve(ParsingContext parsingContext, DivTransformTemplate divTransformTemplate, JSONObject jSONObject) {
            DivPivot divPivot = (DivPivot) JsonFieldResolver.resolveOptional(parsingContext, divTransformTemplate.pivotX, jSONObject, "pivot_x", this.component.getDivPivotJsonTemplateResolver(), this.component.getDivPivotJsonEntityParser());
            if (divPivot == null) {
                divPivot = DivTransformJsonParser.PIVOT_X_DEFAULT_VALUE;
            }
            DivPivot divPivot2 = (DivPivot) JsonFieldResolver.resolveOptional(parsingContext, divTransformTemplate.pivotY, jSONObject, "pivot_y", this.component.getDivPivotJsonTemplateResolver(), this.component.getDivPivotJsonEntityParser());
            if (divPivot2 == null) {
                divPivot2 = DivTransformJsonParser.PIVOT_Y_DEFAULT_VALUE;
            }
            return new DivTransform(divPivot, divPivot2, JsonFieldResolver.resolveOptionalExpression(parsingContext, divTransformTemplate.rotation, jSONObject, "rotation", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
        }
    }

    /* compiled from: DivTransformJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        Double valueOf = Double.valueOf(50.0d);
        PIVOT_X_DEFAULT_VALUE = new DivPivot.Percentage(new DivPivotPercentage(Expression.Companion.constant$default(companion, valueOf, null, 2, null)));
        PIVOT_Y_DEFAULT_VALUE = new DivPivot.Percentage(new DivPivotPercentage(Expression.Companion.constant$default(companion, valueOf, null, 2, null)));
    }
}
