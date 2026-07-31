package com.yandex.div2;

import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
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
import com.yandex.div2.DivTooltip;
import com.yandex.div2.DivTooltipMode;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTooltipJsonParser.kt */
/* loaded from: classes10.dex */
public abstract class DivTooltipJsonParser {
    public static final Expression CLOSE_BY_TAP_OUTSIDE_DEFAULT_VALUE;
    private static final Companion Companion = new Companion(null);
    public static final Expression DURATION_DEFAULT_VALUE;
    public static final ValueValidator DURATION_VALIDATOR;
    public static final DivTooltipMode.Modal MODE_DEFAULT_VALUE;
    public static final TypeHelper TYPE_HELPER_POSITION;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DURATION_VALIDATOR$lambda$0(long j) {
        return j >= 0;
    }

    /* compiled from: DivTooltipJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivTooltip deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            DivAnimation divAnimation = (DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "animation_in", this.component.getDivAnimationJsonEntityParser());
            DivAnimation divAnimation2 = (DivAnimation) JsonPropertyParser.readOptional(parsingContext, jSONObject, "animation_out", this.component.getDivAnimationJsonEntityParser());
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "background_accessibility_description", TypeHelpersKt.TYPE_HELPER_STRING);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = DivTooltipJsonParser.CLOSE_BY_TAP_OUTSIDE_DEFAULT_VALUE;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "close_by_tap_outside", typeHelper, function1, expression);
            Expression expression2 = readOptionalExpression2 == null ? expression : readOptionalExpression2;
            Div div = (Div) JsonPropertyParser.read(parsingContext, jSONObject, "div", this.component.getDivJsonEntityParser());
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = DivTooltipJsonParser.DURATION_VALIDATOR;
            Expression expression3 = DivTooltipJsonParser.DURATION_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, IronSourceConstants.EVENTS_DURATION, typeHelper2, function12, valueValidator, expression3);
            Expression expression4 = readOptionalExpression3 == null ? expression3 : readOptionalExpression3;
            String str = (String) JsonPropertyParser.read(parsingContext, jSONObject, "id");
            DivTooltipMode divTooltipMode = (DivTooltipMode) JsonPropertyParser.readOptional(parsingContext, jSONObject, X3.a.t, this.component.getDivTooltipModeJsonEntityParser());
            if (divTooltipMode == null) {
                divTooltipMode = DivTooltipJsonParser.MODE_DEFAULT_VALUE;
            }
            return new DivTooltip(divAnimation, divAnimation2, readOptionalExpression, expression2, div, expression4, str, divTooltipMode, (DivPoint) JsonPropertyParser.readOptional(parsingContext, jSONObject, "offset", this.component.getDivPointJsonEntityParser()), JsonExpressionParser.readExpression(parsingContext, jSONObject, X3.i.L, DivTooltipJsonParser.TYPE_HELPER_POSITION, DivTooltip.Position.FROM_STRING), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "tap_outside_actions", this.component.getDivActionJsonEntityParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivTooltip divTooltip) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "animation_in", divTooltip.animationIn, this.component.getDivAnimationJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "animation_out", divTooltip.animationOut, this.component.getDivAnimationJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "background_accessibility_description", divTooltip.backgroundAccessibilityDescription);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "close_by_tap_outside", divTooltip.closeByTapOutside);
            JsonPropertyParser.write(parsingContext, jSONObject, "div", divTooltip.div, this.component.getDivJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, IronSourceConstants.EVENTS_DURATION, divTooltip.duration);
            JsonPropertyParser.write(parsingContext, jSONObject, "id", divTooltip.id);
            JsonPropertyParser.write(parsingContext, jSONObject, X3.a.t, divTooltip.mode, this.component.getDivTooltipModeJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "offset", divTooltip.offset, this.component.getDivPointJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, X3.i.L, divTooltip.position, DivTooltip.Position.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "tap_outside_actions", divTooltip.tapOutsideActions, this.component.getDivActionJsonEntityParser());
            return jSONObject;
        }
    }

    /* compiled from: DivTooltipJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivTooltipTemplate deserialize(ParsingContext parsingContext, DivTooltipTemplate divTooltipTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivTooltipTemplate(JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "animation_in", allowPropertyOverride, divTooltipTemplate != null ? divTooltipTemplate.animationIn : null, this.component.getDivAnimationJsonTemplateParser()), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "animation_out", allowPropertyOverride, divTooltipTemplate != null ? divTooltipTemplate.animationOut : null, this.component.getDivAnimationJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "background_accessibility_description", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divTooltipTemplate != null ? divTooltipTemplate.backgroundAccessibilityDescription : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "close_by_tap_outside", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divTooltipTemplate != null ? divTooltipTemplate.closeByTapOutside : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "div", allowPropertyOverride, divTooltipTemplate != null ? divTooltipTemplate.div : null, this.component.getDivJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, IronSourceConstants.EVENTS_DURATION, TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, divTooltipTemplate != null ? divTooltipTemplate.duration : null, ParsingConvertersKt.NUMBER_TO_INT, DivTooltipJsonParser.DURATION_VALIDATOR), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "id", allowPropertyOverride, divTooltipTemplate != null ? divTooltipTemplate.id : null), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, X3.a.t, allowPropertyOverride, divTooltipTemplate != null ? divTooltipTemplate.mode : null, this.component.getDivTooltipModeJsonTemplateParser()), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "offset", allowPropertyOverride, divTooltipTemplate != null ? divTooltipTemplate.offset : null, this.component.getDivPointJsonTemplateParser()), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, X3.i.L, DivTooltipJsonParser.TYPE_HELPER_POSITION, allowPropertyOverride, divTooltipTemplate != null ? divTooltipTemplate.position : null, DivTooltip.Position.FROM_STRING), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "tap_outside_actions", allowPropertyOverride, divTooltipTemplate != null ? divTooltipTemplate.tapOutsideActions : null, this.component.getDivActionJsonTemplateParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivTooltipTemplate divTooltipTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "animation_in", divTooltipTemplate.animationIn, this.component.getDivAnimationJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "animation_out", divTooltipTemplate.animationOut, this.component.getDivAnimationJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "background_accessibility_description", divTooltipTemplate.backgroundAccessibilityDescription);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "close_by_tap_outside", divTooltipTemplate.closeByTapOutside);
            JsonFieldParser.writeField(parsingContext, jSONObject, "div", divTooltipTemplate.div, this.component.getDivJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, IronSourceConstants.EVENTS_DURATION, divTooltipTemplate.duration);
            JsonFieldParser.writeField(parsingContext, jSONObject, "id", divTooltipTemplate.id);
            JsonFieldParser.writeField(parsingContext, jSONObject, X3.a.t, divTooltipTemplate.mode, this.component.getDivTooltipModeJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "offset", divTooltipTemplate.offset, this.component.getDivPointJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, X3.i.L, divTooltipTemplate.position, DivTooltip.Position.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "tap_outside_actions", divTooltipTemplate.tapOutsideActions, this.component.getDivActionJsonTemplateParser());
            return jSONObject;
        }
    }

    /* compiled from: DivTooltipJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivTooltip resolve(ParsingContext parsingContext, DivTooltipTemplate divTooltipTemplate, JSONObject jSONObject) {
            DivAnimation divAnimation = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, divTooltipTemplate.animationIn, jSONObject, "animation_in", this.component.getDivAnimationJsonTemplateResolver(), this.component.getDivAnimationJsonEntityParser());
            DivAnimation divAnimation2 = (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, divTooltipTemplate.animationOut, jSONObject, "animation_out", this.component.getDivAnimationJsonTemplateResolver(), this.component.getDivAnimationJsonEntityParser());
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, divTooltipTemplate.backgroundAccessibilityDescription, jSONObject, "background_accessibility_description", TypeHelpersKt.TYPE_HELPER_STRING);
            Field field = divTooltipTemplate.closeByTapOutside;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = DivTooltipJsonParser.CLOSE_BY_TAP_OUTSIDE_DEFAULT_VALUE;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "close_by_tap_outside", typeHelper, function1, expression);
            Expression expression2 = resolveOptionalExpression2 == null ? expression : resolveOptionalExpression2;
            Div div = (Div) JsonFieldResolver.resolve(parsingContext, divTooltipTemplate.div, jSONObject, "div", this.component.getDivJsonTemplateResolver(), this.component.getDivJsonEntityParser());
            Field field2 = divTooltipTemplate.duration;
            TypeHelper<Long> typeHelper2 = TypeHelpersKt.TYPE_HELPER_INT;
            Function1 function12 = ParsingConvertersKt.NUMBER_TO_INT;
            ValueValidator valueValidator = DivTooltipJsonParser.DURATION_VALIDATOR;
            Expression expression3 = DivTooltipJsonParser.DURATION_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, IronSourceConstants.EVENTS_DURATION, typeHelper2, function12, valueValidator, expression3);
            Expression expression4 = resolveOptionalExpression3 == null ? expression3 : resolveOptionalExpression3;
            String str = (String) JsonFieldResolver.resolve(parsingContext, divTooltipTemplate.id, jSONObject, "id");
            DivTooltipMode divTooltipMode = (DivTooltipMode) JsonFieldResolver.resolveOptional(parsingContext, divTooltipTemplate.mode, jSONObject, X3.a.t, this.component.getDivTooltipModeJsonTemplateResolver(), this.component.getDivTooltipModeJsonEntityParser());
            if (divTooltipMode == null) {
                divTooltipMode = DivTooltipJsonParser.MODE_DEFAULT_VALUE;
            }
            return new DivTooltip(divAnimation, divAnimation2, resolveOptionalExpression, expression2, div, expression4, str, divTooltipMode, (DivPoint) JsonFieldResolver.resolveOptional(parsingContext, divTooltipTemplate.offset, jSONObject, "offset", this.component.getDivPointJsonTemplateResolver(), this.component.getDivPointJsonEntityParser()), JsonFieldResolver.resolveExpression(parsingContext, divTooltipTemplate.position, jSONObject, X3.i.L, DivTooltipJsonParser.TYPE_HELPER_POSITION, DivTooltip.Position.FROM_STRING), JsonFieldResolver.resolveOptionalList(parsingContext, divTooltipTemplate.tapOutsideActions, jSONObject, "tap_outside_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser()));
        }
    }

    /* compiled from: DivTooltipJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        CLOSE_BY_TAP_OUTSIDE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        DURATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 5000L, null, 2, null);
        MODE_DEFAULT_VALUE = new DivTooltipMode.Modal(new DivTooltipModeModal());
        TYPE_HELPER_POSITION = TypeHelper.INSTANCE.from(ArraysKt.first(DivTooltip.Position.values()), new Function1() { // from class: com.yandex.div2.DivTooltipJsonParser$Companion$TYPE_HELPER_POSITION$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivTooltip.Position);
            }
        });
        DURATION_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivTooltipJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean DURATION_VALIDATOR$lambda$0;
                DURATION_VALIDATOR$lambda$0 = DivTooltipJsonParser.DURATION_VALIDATOR$lambda$0(((Long) obj).longValue());
                return DURATION_VALIDATOR$lambda$0;
            }
        };
    }
}
