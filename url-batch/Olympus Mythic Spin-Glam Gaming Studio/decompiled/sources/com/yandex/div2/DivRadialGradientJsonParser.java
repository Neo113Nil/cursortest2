package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivRadialGradientCenter;
import com.yandex.div2.DivRadialGradientRadius;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivRadialGradientJsonParser.kt */
/* loaded from: classes8.dex */
public abstract class DivRadialGradientJsonParser {
    public static final DivRadialGradientCenter.Relative CENTER_X_DEFAULT_VALUE;
    public static final DivRadialGradientCenter.Relative CENTER_Y_DEFAULT_VALUE;
    public static final ListValidator COLORS_VALIDATOR;
    public static final ListValidator COLOR_MAP_VALIDATOR;
    private static final Companion Companion = new Companion(null);
    public static final DivRadialGradientRadius.Relative RADIUS_DEFAULT_VALUE;

    /* compiled from: DivRadialGradientJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivRadialGradient deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            DivRadialGradientCenter divRadialGradientCenter = (DivRadialGradientCenter) JsonPropertyParser.readOptional(parsingContext, jSONObject, "center_x", this.component.getDivRadialGradientCenterJsonEntityParser());
            if (divRadialGradientCenter == null) {
                divRadialGradientCenter = DivRadialGradientJsonParser.CENTER_X_DEFAULT_VALUE;
            }
            DivRadialGradientCenter divRadialGradientCenter2 = divRadialGradientCenter;
            DivRadialGradientCenter divRadialGradientCenter3 = (DivRadialGradientCenter) JsonPropertyParser.readOptional(parsingContext, jSONObject, "center_y", this.component.getDivRadialGradientCenterJsonEntityParser());
            if (divRadialGradientCenter3 == null) {
                divRadialGradientCenter3 = DivRadialGradientJsonParser.CENTER_Y_DEFAULT_VALUE;
            }
            DivRadialGradientCenter divRadialGradientCenter4 = divRadialGradientCenter3;
            List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "color_map", this.component.getDivRadialGradientColorPointJsonEntityParser(), DivRadialGradientJsonParser.COLOR_MAP_VALIDATOR);
            ExpressionList readOptionalExpressionList = JsonExpressionParser.readOptionalExpressionList(parsingContext, jSONObject, "colors", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, DivRadialGradientJsonParser.COLORS_VALIDATOR);
            DivRadialGradientRadius divRadialGradientRadius = (DivRadialGradientRadius) JsonPropertyParser.readOptional(parsingContext, jSONObject, "radius", this.component.getDivRadialGradientRadiusJsonEntityParser());
            if (divRadialGradientRadius == null) {
                divRadialGradientRadius = DivRadialGradientJsonParser.RADIUS_DEFAULT_VALUE;
            }
            return new DivRadialGradient(divRadialGradientCenter2, divRadialGradientCenter4, readOptionalList, readOptionalExpressionList, divRadialGradientRadius);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivRadialGradient divRadialGradient) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "center_x", divRadialGradient.centerX, this.component.getDivRadialGradientCenterJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "center_y", divRadialGradient.centerY, this.component.getDivRadialGradientCenterJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "color_map", divRadialGradient.colorMap, this.component.getDivRadialGradientColorPointJsonEntityParser());
            JsonExpressionParser.writeExpressionList(parsingContext, jSONObject, "colors", divRadialGradient.colors, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "radius", divRadialGradient.radius, this.component.getDivRadialGradientRadiusJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "radial_gradient");
            return jSONObject;
        }
    }

    /* compiled from: DivRadialGradientJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivRadialGradientTemplate deserialize(ParsingContext parsingContext, DivRadialGradientTemplate divRadialGradientTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "center_x", allowPropertyOverride, divRadialGradientTemplate != null ? divRadialGradientTemplate.centerX : null, this.component.getDivRadialGradientCenterJsonTemplateParser());
            Field readOptionalField2 = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "center_y", allowPropertyOverride, divRadialGradientTemplate != null ? divRadialGradientTemplate.centerY : null, this.component.getDivRadialGradientCenterJsonTemplateParser());
            Field field = divRadialGradientTemplate != null ? divRadialGradientTemplate.colorMap : null;
            Lazy divRadialGradientColorPointJsonTemplateParser = this.component.getDivRadialGradientColorPointJsonTemplateParser();
            ListValidator listValidator = DivRadialGradientJsonParser.COLOR_MAP_VALIDATOR;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readOptionalListField = JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "color_map", allowPropertyOverride, field, divRadialGradientColorPointJsonTemplateParser, listValidator);
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Field field2 = divRadialGradientTemplate != null ? divRadialGradientTemplate.colors : null;
            Function1 function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            ListValidator listValidator2 = DivRadialGradientJsonParser.COLORS_VALIDATOR;
            Intrinsics.checkNotNull(listValidator2, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivRadialGradientTemplate(readOptionalField, readOptionalField2, readOptionalListField, JsonFieldParser.readOptionalExpressionListField(restrictPropertyOverride, jSONObject, "colors", typeHelper, allowPropertyOverride, field2, function1, listValidator2), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "radius", allowPropertyOverride, divRadialGradientTemplate != null ? divRadialGradientTemplate.radius : null, this.component.getDivRadialGradientRadiusJsonTemplateParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivRadialGradientTemplate divRadialGradientTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "center_x", divRadialGradientTemplate.centerX, this.component.getDivRadialGradientCenterJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "center_y", divRadialGradientTemplate.centerY, this.component.getDivRadialGradientCenterJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "color_map", divRadialGradientTemplate.colorMap, this.component.getDivRadialGradientColorPointJsonTemplateParser());
            JsonFieldParser.writeExpressionListField(parsingContext, jSONObject, "colors", divRadialGradientTemplate.colors, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "radius", divRadialGradientTemplate.radius, this.component.getDivRadialGradientRadiusJsonTemplateParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "radial_gradient");
            return jSONObject;
        }
    }

    /* compiled from: DivRadialGradientJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivRadialGradient resolve(ParsingContext parsingContext, DivRadialGradientTemplate divRadialGradientTemplate, JSONObject jSONObject) {
            DivRadialGradientCenter divRadialGradientCenter = (DivRadialGradientCenter) JsonFieldResolver.resolveOptional(parsingContext, divRadialGradientTemplate.centerX, jSONObject, "center_x", this.component.getDivRadialGradientCenterJsonTemplateResolver(), this.component.getDivRadialGradientCenterJsonEntityParser());
            if (divRadialGradientCenter == null) {
                divRadialGradientCenter = DivRadialGradientJsonParser.CENTER_X_DEFAULT_VALUE;
            }
            DivRadialGradientCenter divRadialGradientCenter2 = (DivRadialGradientCenter) JsonFieldResolver.resolveOptional(parsingContext, divRadialGradientTemplate.centerY, jSONObject, "center_y", this.component.getDivRadialGradientCenterJsonTemplateResolver(), this.component.getDivRadialGradientCenterJsonEntityParser());
            if (divRadialGradientCenter2 == null) {
                divRadialGradientCenter2 = DivRadialGradientJsonParser.CENTER_Y_DEFAULT_VALUE;
            }
            List resolveOptionalList = JsonFieldResolver.resolveOptionalList(parsingContext, divRadialGradientTemplate.colorMap, jSONObject, "color_map", this.component.getDivRadialGradientColorPointJsonTemplateResolver(), this.component.getDivRadialGradientColorPointJsonEntityParser(), DivRadialGradientJsonParser.COLOR_MAP_VALIDATOR);
            ExpressionList resolveOptionalExpressionList = JsonFieldResolver.resolveOptionalExpressionList(parsingContext, divRadialGradientTemplate.colors, jSONObject, "colors", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT, DivRadialGradientJsonParser.COLORS_VALIDATOR);
            DivRadialGradientRadius divRadialGradientRadius = (DivRadialGradientRadius) JsonFieldResolver.resolveOptional(parsingContext, divRadialGradientTemplate.radius, jSONObject, "radius", this.component.getDivRadialGradientRadiusJsonTemplateResolver(), this.component.getDivRadialGradientRadiusJsonEntityParser());
            if (divRadialGradientRadius == null) {
                divRadialGradientRadius = DivRadialGradientJsonParser.RADIUS_DEFAULT_VALUE;
            }
            return new DivRadialGradient(divRadialGradientCenter, divRadialGradientCenter2, resolveOptionalList, resolveOptionalExpressionList, divRadialGradientRadius);
        }
    }

    /* compiled from: DivRadialGradientJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        Double valueOf = Double.valueOf(0.5d);
        CENTER_X_DEFAULT_VALUE = new DivRadialGradientCenter.Relative(new DivRadialGradientRelativeCenter(Expression.Companion.constant$default(companion, valueOf, null, 2, null)));
        CENTER_Y_DEFAULT_VALUE = new DivRadialGradientCenter.Relative(new DivRadialGradientRelativeCenter(Expression.Companion.constant$default(companion, valueOf, null, 2, null)));
        RADIUS_DEFAULT_VALUE = new DivRadialGradientRadius.Relative(new DivRadialGradientRelativeRadius(Expression.Companion.constant$default(companion, DivRadialGradientRelativeRadius.Value.FARTHEST_CORNER, null, 2, null)));
        COLORS_VALIDATOR = new ListValidator() { // from class: com.yandex.div2.DivRadialGradientJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean COLORS_VALIDATOR$lambda$0;
                COLORS_VALIDATOR$lambda$0 = DivRadialGradientJsonParser.COLORS_VALIDATOR$lambda$0(list);
                return COLORS_VALIDATOR$lambda$0;
            }
        };
        COLOR_MAP_VALIDATOR = new ListValidator() { // from class: com.yandex.div2.DivRadialGradientJsonParser$$ExternalSyntheticLambda1
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean COLOR_MAP_VALIDATOR$lambda$1;
                COLOR_MAP_VALIDATOR$lambda$1 = DivRadialGradientJsonParser.COLOR_MAP_VALIDATOR$lambda$1(list);
                return COLOR_MAP_VALIDATOR$lambda$1;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean COLORS_VALIDATOR$lambda$0(List list) {
        return list.size() >= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean COLOR_MAP_VALIDATOR$lambda$1(List list) {
        return list.size() >= 2;
    }
}
