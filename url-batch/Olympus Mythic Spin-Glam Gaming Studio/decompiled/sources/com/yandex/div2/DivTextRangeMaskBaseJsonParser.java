package com.yandex.div2;

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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: DivTextRangeMaskBaseJsonParser.kt */
/* loaded from: classes9.dex */
public abstract class DivTextRangeMaskBaseJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final Expression IS_ENABLED_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.TRUE, null, 2, null);

    /* compiled from: DivTextRangeMaskBaseJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivTextRangeMaskBase deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = DivTextRangeMaskBaseJsonParser.IS_ENABLED_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "is_enabled", typeHelper, function1, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new DivTextRangeMaskBase(expression);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivTextRangeMaskBase divTextRangeMaskBase) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "is_enabled", divTextRangeMaskBase.isEnabled);
            return jSONObject;
        }
    }

    /* compiled from: DivTextRangeMaskBaseJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivTextRangeMaskBaseTemplate deserialize(ParsingContext parsingContext, DivTextRangeMaskBaseTemplate divTextRangeMaskBaseTemplate, JSONObject jSONObject) {
            return new DivTextRangeMaskBaseTemplate(JsonFieldParser.readOptionalFieldWithExpression(ParsingContextKt.restrictPropertyOverride(parsingContext), jSONObject, "is_enabled", TypeHelpersKt.TYPE_HELPER_BOOLEAN, parsingContext.getAllowPropertyOverride(), divTextRangeMaskBaseTemplate != null ? divTextRangeMaskBaseTemplate.isEnabled : null, ParsingConvertersKt.ANY_TO_BOOLEAN));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivTextRangeMaskBaseTemplate divTextRangeMaskBaseTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "is_enabled", divTextRangeMaskBaseTemplate.isEnabled);
            return jSONObject;
        }
    }

    /* compiled from: DivTextRangeMaskBaseJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivTextRangeMaskBase resolve(ParsingContext parsingContext, DivTextRangeMaskBaseTemplate divTextRangeMaskBaseTemplate, JSONObject jSONObject) {
            Field field = divTextRangeMaskBaseTemplate.isEnabled;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = DivTextRangeMaskBaseJsonParser.IS_ENABLED_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "is_enabled", typeHelper, function1, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new DivTextRangeMaskBase(expression);
        }
    }

    /* compiled from: DivTextRangeMaskBaseJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
