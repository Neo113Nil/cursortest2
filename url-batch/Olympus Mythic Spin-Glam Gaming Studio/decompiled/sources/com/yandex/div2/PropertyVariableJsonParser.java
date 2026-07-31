package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: PropertyVariableJsonParser.kt */
/* loaded from: classes10.dex */
public abstract class PropertyVariableJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final String NEW_VALUE_VARIABLE_NAME_DEFAULT_VALUE = "new_value";
    public static final TypeHelper TYPE_HELPER_VALUE_TYPE = TypeHelper.INSTANCE.from(ArraysKt.first(DivEvaluableType.values()), new Function1() { // from class: com.yandex.div2.PropertyVariableJsonParser$Companion$TYPE_HELPER_VALUE_TYPE$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull Object obj) {
            return Boolean.valueOf(obj instanceof DivEvaluableType);
        }
    });

    /* compiled from: PropertyVariableJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public PropertyVariable deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "get", TypeHelpersKt.TYPE_HELPER_STRING);
            String str = (String) JsonPropertyParser.read(parsingContext, jSONObject, "name");
            String str2 = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "new_value_variable_name");
            if (str2 == null) {
                str2 = PropertyVariableJsonParser.NEW_VALUE_VARIABLE_NAME_DEFAULT_VALUE;
            }
            return new PropertyVariable(readExpression, str, str2, JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "set", this.component.getDivActionJsonEntityParser()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "value_type", PropertyVariableJsonParser.TYPE_HELPER_VALUE_TYPE, DivEvaluableType.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, PropertyVariable propertyVariable) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "get", propertyVariable.get);
            JsonPropertyParser.write(parsingContext, jSONObject, "name", propertyVariable.name);
            JsonPropertyParser.write(parsingContext, jSONObject, "new_value_variable_name", propertyVariable.newValueVariableName);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "set", propertyVariable.set, this.component.getDivActionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "property");
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "value_type", propertyVariable.valueType, DivEvaluableType.TO_STRING);
            return jSONObject;
        }
    }

    /* compiled from: PropertyVariableJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public PropertyVariableTemplate deserialize(ParsingContext parsingContext, PropertyVariableTemplate propertyVariableTemplate, JSONObject jSONObject) {
            TemplateParserImpl templateParserImpl;
            Field field;
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "get", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, propertyVariableTemplate != null ? propertyVariableTemplate.get : null);
            Field readField = JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "name", allowPropertyOverride, propertyVariableTemplate != null ? propertyVariableTemplate.name : null);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "new_value_variable_name", allowPropertyOverride, propertyVariableTemplate != null ? propertyVariableTemplate.newValueVariableName : null);
            if (propertyVariableTemplate != null) {
                templateParserImpl = this;
                field = propertyVariableTemplate.set;
            } else {
                templateParserImpl = this;
                field = null;
            }
            return new PropertyVariableTemplate(readFieldWithExpression, readField, readOptionalField, JsonFieldParser.readOptionalListField(restrictPropertyOverride, jSONObject, "set", allowPropertyOverride, field, templateParserImpl.component.getDivActionJsonTemplateParser()), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "value_type", PropertyVariableJsonParser.TYPE_HELPER_VALUE_TYPE, allowPropertyOverride, propertyVariableTemplate != null ? propertyVariableTemplate.valueType : null, DivEvaluableType.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, PropertyVariableTemplate propertyVariableTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "get", propertyVariableTemplate.get);
            JsonFieldParser.writeField(parsingContext, jSONObject, "name", propertyVariableTemplate.name);
            JsonFieldParser.writeField(parsingContext, jSONObject, "new_value_variable_name", propertyVariableTemplate.newValueVariableName);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "set", propertyVariableTemplate.set, this.component.getDivActionJsonTemplateParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "property");
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "value_type", propertyVariableTemplate.valueType, DivEvaluableType.TO_STRING);
            return jSONObject;
        }
    }

    /* compiled from: PropertyVariableJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public PropertyVariable resolve(ParsingContext parsingContext, PropertyVariableTemplate propertyVariableTemplate, JSONObject jSONObject) {
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, propertyVariableTemplate.get, jSONObject, "get", TypeHelpersKt.TYPE_HELPER_STRING);
            String str = (String) JsonFieldResolver.resolve(parsingContext, propertyVariableTemplate.name, jSONObject, "name");
            String str2 = (String) JsonFieldResolver.resolveOptional(parsingContext, propertyVariableTemplate.newValueVariableName, jSONObject, "new_value_variable_name");
            if (str2 == null) {
                str2 = PropertyVariableJsonParser.NEW_VALUE_VARIABLE_NAME_DEFAULT_VALUE;
            }
            return new PropertyVariable(resolveExpression, str, str2, JsonFieldResolver.resolveOptionalList(parsingContext, propertyVariableTemplate.set, jSONObject, "set", this.component.getDivActionJsonTemplateResolver(), this.component.getDivActionJsonEntityParser()), JsonFieldResolver.resolveExpression(parsingContext, propertyVariableTemplate.valueType, jSONObject, "value_type", PropertyVariableJsonParser.TYPE_HELPER_VALUE_TYPE, DivEvaluableType.FROM_STRING));
        }
    }

    /* compiled from: PropertyVariableJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
