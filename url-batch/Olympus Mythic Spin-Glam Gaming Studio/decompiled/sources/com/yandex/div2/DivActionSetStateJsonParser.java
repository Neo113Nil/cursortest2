package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
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
import com.yandex.div.state.db.StateEntry;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: DivActionSetStateJsonParser.kt */
/* loaded from: classes8.dex */
public abstract class DivActionSetStateJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final Expression TEMPORARY_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.TRUE, null, 2, null);

    /* compiled from: DivActionSetStateJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivActionSetState deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, StateEntry.COLUMN_STATE_ID, TypeHelpersKt.TYPE_HELPER_STRING);
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = DivActionSetStateJsonParser.TEMPORARY_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "temporary", typeHelper, function1, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new DivActionSetState(readExpression, expression);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivActionSetState divActionSetState) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, StateEntry.COLUMN_STATE_ID, divActionSetState.stateId);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "temporary", divActionSetState.temporary);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "set_state");
            return jSONObject;
        }
    }

    /* compiled from: DivActionSetStateJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivActionSetStateTemplate deserialize(ParsingContext parsingContext, DivActionSetStateTemplate divActionSetStateTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivActionSetStateTemplate(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, StateEntry.COLUMN_STATE_ID, TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divActionSetStateTemplate != null ? divActionSetStateTemplate.stateId : null), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "temporary", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, divActionSetStateTemplate != null ? divActionSetStateTemplate.temporary : null, ParsingConvertersKt.ANY_TO_BOOLEAN));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivActionSetStateTemplate divActionSetStateTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, StateEntry.COLUMN_STATE_ID, divActionSetStateTemplate.stateId);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "temporary", divActionSetStateTemplate.temporary);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "set_state");
            return jSONObject;
        }
    }

    /* compiled from: DivActionSetStateJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivActionSetState resolve(ParsingContext parsingContext, DivActionSetStateTemplate divActionSetStateTemplate, JSONObject jSONObject) {
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divActionSetStateTemplate.stateId, jSONObject, StateEntry.COLUMN_STATE_ID, TypeHelpersKt.TYPE_HELPER_STRING);
            Field field = divActionSetStateTemplate.temporary;
            TypeHelper<Boolean> typeHelper = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function1 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression = DivActionSetStateJsonParser.TEMPORARY_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "temporary", typeHelper, function1, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new DivActionSetState(resolveExpression, expression);
        }
    }

    /* compiled from: DivActionSetStateJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
