package com.yandex.div2;

import com.ironsource.X3;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivPatch;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivPatchJsonParser.kt */
/* loaded from: classes12.dex */
public abstract class DivPatchJsonParser {
    public static final ListValidator CHANGES_VALIDATOR;
    private static final Companion Companion = new Companion(null);
    public static final Expression MODE_DEFAULT_VALUE;
    public static final TypeHelper TYPE_HELPER_MODE;

    /* compiled from: DivPatchJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivPatch deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            List readList = JsonPropertyParser.readList(parsingContext, jSONObject, "changes", this.component.getDivPatchChangeJsonEntityParser(), DivPatchJsonParser.CHANGES_VALIDATOR);
            TypeHelper typeHelper = DivPatchJsonParser.TYPE_HELPER_MODE;
            Function1 function1 = DivPatch.Mode.FROM_STRING;
            Expression expression = DivPatchJsonParser.MODE_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, X3.a.t, typeHelper, function1, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            return new DivPatch(readList, expression, JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_applied_actions", this.component.getDivActionJsonEntityParser()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "on_failed_actions", this.component.getDivActionJsonEntityParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivPatch divPatch) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "changes", divPatch.changes, this.component.getDivPatchChangeJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, X3.a.t, divPatch.mode, DivPatch.Mode.TO_STRING);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "on_applied_actions", divPatch.onAppliedActions, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.writeList(parsingContext, jSONObject, "on_failed_actions", divPatch.onFailedActions, this.component.getDivActionJsonEntityParser());
            return jSONObject;
        }
    }

    /* compiled from: DivPatchJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivPatchTemplate deserialize(ParsingContext parsingContext, DivPatchTemplate divPatchTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field field = divPatchTemplate != null ? divPatchTemplate.changes : null;
            Lazy divPatchChangeJsonTemplateParser = this.component.getDivPatchChangeJsonTemplateParser();
            ListValidator listValidator = DivPatchJsonParser.CHANGES_VALIDATOR;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivPatchTemplate(JsonFieldParser.readListField(restrictPropertyOverride, jSONObject, "changes", allowPropertyOverride, field, divPatchChangeJsonTemplateParser, listValidator), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, X3.a.t, DivPatchJsonParser.TYPE_HELPER_MODE, allowPropertyOverride, divPatchTemplate != null ? divPatchTemplate.mode : null, DivPatch.Mode.FROM_STRING), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "on_applied_actions", allowPropertyOverride, divPatchTemplate != null ? divPatchTemplate.onAppliedActions : null, this.component.getDivActionJsonTemplateParser()), JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "on_failed_actions", allowPropertyOverride, divPatchTemplate != null ? divPatchTemplate.onFailedActions : null, this.component.getDivActionJsonTemplateParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivPatchTemplate divPatchTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "changes", divPatchTemplate.changes, this.component.getDivPatchChangeJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, X3.a.t, divPatchTemplate.mode, DivPatch.Mode.TO_STRING);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "on_applied_actions", divPatchTemplate.onAppliedActions, this.component.getDivActionJsonTemplateParser());
            JsonFieldParser.writeListField(parsingContext, jSONObject, "on_failed_actions", divPatchTemplate.onFailedActions, this.component.getDivActionJsonTemplateParser());
            return jSONObject;
        }
    }

    /* compiled from: DivPatchJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivPatch resolve(ParsingContext parsingContext, DivPatchTemplate divPatchTemplate, JSONObject jSONObject) {
            List resolveList = JsonFieldResolver.resolveList(parsingContext, divPatchTemplate.changes, jSONObject, "changes", this.component.getDivPatchChangeJsonTemplateResolver(), this.component.getDivPatchChangeJsonEntityParser(), DivPatchJsonParser.CHANGES_VALIDATOR);
            Field field = divPatchTemplate.mode;
            TypeHelper typeHelper = DivPatchJsonParser.TYPE_HELPER_MODE;
            Function1 function1 = DivPatch.Mode.FROM_STRING;
            Expression expression = DivPatchJsonParser.MODE_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, X3.a.t, typeHelper, function1, expression);
            if (resolveOptionalExpression != null) {
                expression = resolveOptionalExpression;
            }
            return new DivPatch(resolveList, expression, JsonFieldResolver.resolveOptionalList(parsingContext, divPatchTemplate.onAppliedActions, jSONObject, "on_applied_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser()), JsonFieldResolver.resolveOptionalList(parsingContext, divPatchTemplate.onFailedActions, jSONObject, "on_failed_actions", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser()));
        }
    }

    /* compiled from: DivPatchJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        DivPatch.Mode mode = DivPatch.Mode.PARTIAL;
        MODE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, mode, null, 2, null);
        TYPE_HELPER_MODE = TypeHelper.INSTANCE.from(mode, new Function1() { // from class: com.yandex.div2.DivPatchJsonParser$Companion$TYPE_HELPER_MODE$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivPatch.Mode);
            }
        });
        CHANGES_VALIDATOR = new ListValidator() { // from class: com.yandex.div2.DivPatchJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ListValidator
            public final boolean isValid(List list) {
                boolean CHANGES_VALIDATOR$lambda$0;
                CHANGES_VALIDATOR$lambda$0 = DivPatchJsonParser.CHANGES_VALIDATOR$lambda$0(list);
                return CHANGES_VALIDATOR$lambda$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CHANGES_VALIDATOR$lambda$0(List list) {
        return list.size() >= 1;
    }
}
