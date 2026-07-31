package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingValidatorsKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: DivActionUpdateStructureJsonParser.kt */
/* loaded from: classes8.dex */
public abstract class DivActionUpdateStructureJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final ValueValidator PATH_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivActionUpdateStructureJsonParser$$ExternalSyntheticLambda0
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean PATH_VALIDATOR$lambda$0;
            PATH_VALIDATOR$lambda$0 = DivActionUpdateStructureJsonParser.PATH_VALIDATOR$lambda$0((String) obj);
            return PATH_VALIDATOR$lambda$0;
        }
    };

    /* compiled from: DivActionUpdateStructureJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivActionUpdateStructure deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            return new DivActionUpdateStructure(JsonExpressionParser.readExpression(parsingContext, jSONObject, "path", typeHelper, DivActionUpdateStructureJsonParser.PATH_VALIDATOR), (DivTypedValue) JsonPropertyParser.read(parsingContext, jSONObject, "value", this.component.getDivTypedValueJsonEntityParser()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "variable_name", typeHelper));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivActionUpdateStructure divActionUpdateStructure) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "path", divActionUpdateStructure.path);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "update_structure");
            JsonPropertyParser.write(parsingContext, jSONObject, "value", divActionUpdateStructure.value, this.component.getDivTypedValueJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "variable_name", divActionUpdateStructure.variableName);
            return jSONObject;
        }
    }

    /* compiled from: DivActionUpdateStructureJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivActionUpdateStructureTemplate deserialize(ParsingContext parsingContext, DivActionUpdateStructureTemplate divActionUpdateStructureTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            return new DivActionUpdateStructureTemplate(JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "path", typeHelper, allowPropertyOverride, divActionUpdateStructureTemplate != null ? divActionUpdateStructureTemplate.path : null, DivActionUpdateStructureJsonParser.PATH_VALIDATOR), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "value", allowPropertyOverride, divActionUpdateStructureTemplate != null ? divActionUpdateStructureTemplate.value : null, this.component.getDivTypedValueJsonTemplateParser()), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "variable_name", typeHelper, allowPropertyOverride, divActionUpdateStructureTemplate != null ? divActionUpdateStructureTemplate.variableName : null));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivActionUpdateStructureTemplate divActionUpdateStructureTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "path", divActionUpdateStructureTemplate.path);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "update_structure");
            JsonFieldParser.writeField(parsingContext, jSONObject, "value", divActionUpdateStructureTemplate.value, this.component.getDivTypedValueJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "variable_name", divActionUpdateStructureTemplate.variableName);
            return jSONObject;
        }
    }

    /* compiled from: DivActionUpdateStructureJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivActionUpdateStructure resolve(ParsingContext parsingContext, DivActionUpdateStructureTemplate divActionUpdateStructureTemplate, JSONObject jSONObject) {
            Field field = divActionUpdateStructureTemplate.path;
            TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
            return new DivActionUpdateStructure(JsonFieldResolver.resolveExpression(parsingContext, field, jSONObject, "path", typeHelper, DivActionUpdateStructureJsonParser.PATH_VALIDATOR), (DivTypedValue) JsonFieldResolver.resolve(parsingContext, divActionUpdateStructureTemplate.value, jSONObject, "value", this.component.getDivTypedValueJsonTemplateResolver(), this.component.getDivTypedValueJsonEntityParser()), JsonFieldResolver.resolveExpression(parsingContext, divActionUpdateStructureTemplate.variableName, jSONObject, "variable_name", typeHelper));
        }
    }

    /* compiled from: DivActionUpdateStructureJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PATH_VALIDATOR$lambda$0(String str) {
        return ParsingValidatorsKt.doesMatch(str, "^(?!/)(.+)(?<!/)$");
    }
}
