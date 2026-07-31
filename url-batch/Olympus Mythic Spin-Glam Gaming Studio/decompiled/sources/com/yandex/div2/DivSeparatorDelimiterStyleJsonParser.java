package com.yandex.div2;

import com.ironsource.X3;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivSeparator;
import com.yandex.div2.DivSeparatorTemplate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivSeparatorJsonParser.kt */
/* loaded from: classes10.dex */
public abstract class DivSeparatorDelimiterStyleJsonParser {
    public static final Expression COLOR_DEFAULT_VALUE;
    private static final Companion Companion = new Companion(null);
    public static final Expression ORIENTATION_DEFAULT_VALUE;
    public static final TypeHelper TYPE_HELPER_ORIENTATION;

    /* compiled from: DivSeparatorJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivSeparator.DelimiterStyle deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1 function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression = DivSeparatorDelimiterStyleJsonParser.COLOR_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "color", typeHelper, function1, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            TypeHelper typeHelper2 = DivSeparatorDelimiterStyleJsonParser.TYPE_HELPER_ORIENTATION;
            Function1 function12 = DivSeparator.DelimiterStyle.Orientation.FROM_STRING;
            Expression expression2 = DivSeparatorDelimiterStyleJsonParser.ORIENTATION_DEFAULT_VALUE;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, X3.i.n, typeHelper2, function12, expression2);
            if (readOptionalExpression2 != null) {
                expression2 = readOptionalExpression2;
            }
            return new DivSeparator.DelimiterStyle(expression, expression2);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivSeparator.DelimiterStyle delimiterStyle) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "color", delimiterStyle.color, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, X3.i.n, delimiterStyle.orientation, DivSeparator.DelimiterStyle.Orientation.TO_STRING);
            return jSONObject;
        }
    }

    /* compiled from: DivSeparatorJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivSeparatorTemplate.DelimiterStyleTemplate deserialize(ParsingContext parsingContext, DivSeparatorTemplate.DelimiterStyleTemplate delimiterStyleTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivSeparatorTemplate.DelimiterStyleTemplate(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, delimiterStyleTemplate != null ? delimiterStyleTemplate.color : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, X3.i.n, DivSeparatorDelimiterStyleJsonParser.TYPE_HELPER_ORIENTATION, allowPropertyOverride, delimiterStyleTemplate != null ? delimiterStyleTemplate.orientation : null, DivSeparator.DelimiterStyle.Orientation.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivSeparatorTemplate.DelimiterStyleTemplate delimiterStyleTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "color", delimiterStyleTemplate.color, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, X3.i.n, delimiterStyleTemplate.orientation, DivSeparator.DelimiterStyle.Orientation.TO_STRING);
            return jSONObject;
        }
    }

    /* compiled from: DivSeparatorJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivSeparator.DelimiterStyle resolve(ParsingContext parsingContext, DivSeparatorTemplate.DelimiterStyleTemplate delimiterStyleTemplate, JSONObject jSONObject) {
            Field field = delimiterStyleTemplate.color;
            TypeHelper<Integer> typeHelper = TypeHelpersKt.TYPE_HELPER_COLOR;
            Function1 function1 = ParsingConvertersKt.STRING_TO_COLOR_INT;
            Expression expression = DivSeparatorDelimiterStyleJsonParser.COLOR_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "color", typeHelper, function1, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            Field field2 = delimiterStyleTemplate.orientation;
            TypeHelper typeHelper2 = DivSeparatorDelimiterStyleJsonParser.TYPE_HELPER_ORIENTATION;
            Function1 function12 = DivSeparator.DelimiterStyle.Orientation.FROM_STRING;
            Expression expression2 = DivSeparatorDelimiterStyleJsonParser.ORIENTATION_DEFAULT_VALUE;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, X3.i.n, typeHelper2, function12, expression2);
            if (resolveOptionalExpression2 != null) {
                expression2 = resolveOptionalExpression2;
            }
            return new DivSeparator.DelimiterStyle(expression, expression2);
        }
    }

    /* compiled from: DivSeparatorJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Integer.valueOf(DivSeparatorView.DEFAULT_DIVIDER_COLOR), null, 2, null);
        DivSeparator.DelimiterStyle.Orientation orientation = DivSeparator.DelimiterStyle.Orientation.HORIZONTAL;
        ORIENTATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, orientation, null, 2, null);
        TYPE_HELPER_ORIENTATION = TypeHelper.INSTANCE.from(orientation, new Function1() { // from class: com.yandex.div2.DivSeparatorDelimiterStyleJsonParser$Companion$TYPE_HELPER_ORIENTATION$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivSeparator.DelimiterStyle.Orientation);
            }
        });
    }
}
