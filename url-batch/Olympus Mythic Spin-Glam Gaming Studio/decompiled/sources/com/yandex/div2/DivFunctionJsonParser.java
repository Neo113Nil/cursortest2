package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingValidatorsKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: DivFunctionJsonParser.kt */
/* loaded from: classes9.dex */
public abstract class DivFunctionJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final ValueValidator NAME_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivFunctionJsonParser$$ExternalSyntheticLambda0
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean NAME_VALIDATOR$lambda$0;
            NAME_VALIDATOR$lambda$0 = DivFunctionJsonParser.NAME_VALIDATOR$lambda$0((String) obj);
            return NAME_VALIDATOR$lambda$0;
        }
    };

    /* compiled from: DivFunctionJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivFunction deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            return new DivFunction(JsonPropertyParser.readList(parsingContext, jSONObject, "arguments", this.component.getDivFunctionArgumentJsonEntityParser()), (String) JsonPropertyParser.read(parsingContext, jSONObject, "body"), (String) JsonPropertyParser.read(parsingContext, jSONObject, "name", DivFunctionJsonParser.NAME_VALIDATOR), (DivEvaluableType) JsonPropertyParser.read(parsingContext, jSONObject, "return_type", DivEvaluableType.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivFunction divFunction) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "arguments", divFunction.arguments, this.component.getDivFunctionArgumentJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "body", divFunction.body);
            JsonPropertyParser.write(parsingContext, jSONObject, "name", divFunction.name);
            JsonPropertyParser.write(parsingContext, jSONObject, "return_type", divFunction.returnType, DivEvaluableType.TO_STRING);
            return jSONObject;
        }
    }

    /* compiled from: DivFunctionJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivFunctionTemplate deserialize(ParsingContext parsingContext, DivFunctionTemplate divFunctionTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivFunctionTemplate(JsonFieldParser.readListField(restrictPropertyOverride, jSONObject, "arguments", allowPropertyOverride, divFunctionTemplate != null ? divFunctionTemplate.arguments : null, this.component.getDivFunctionArgumentJsonTemplateParser()), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "body", allowPropertyOverride, divFunctionTemplate != null ? divFunctionTemplate.body : null), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "name", allowPropertyOverride, divFunctionTemplate != null ? divFunctionTemplate.name : null, DivFunctionJsonParser.NAME_VALIDATOR), JsonFieldParser.readField(restrictPropertyOverride, jSONObject, "return_type", allowPropertyOverride, divFunctionTemplate != null ? divFunctionTemplate.returnType : null, DivEvaluableType.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivFunctionTemplate divFunctionTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "arguments", divFunctionTemplate.arguments, this.component.getDivFunctionArgumentJsonTemplateParser());
            JsonFieldParser.writeField(parsingContext, jSONObject, "body", divFunctionTemplate.body);
            JsonFieldParser.writeField(parsingContext, jSONObject, "name", divFunctionTemplate.name);
            JsonFieldParser.writeField(parsingContext, jSONObject, "return_type", divFunctionTemplate.returnType, DivEvaluableType.TO_STRING);
            return jSONObject;
        }
    }

    /* compiled from: DivFunctionJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivFunction resolve(ParsingContext parsingContext, DivFunctionTemplate divFunctionTemplate, JSONObject jSONObject) {
            return new DivFunction(JsonFieldResolver.resolveList(parsingContext, divFunctionTemplate.arguments, jSONObject, "arguments", this.component.getDivFunctionArgumentJsonTemplateResolver(), this.component.getDivFunctionArgumentJsonEntityParser()), (String) JsonFieldResolver.resolve(parsingContext, divFunctionTemplate.body, jSONObject, "body"), (String) JsonFieldResolver.resolve(parsingContext, divFunctionTemplate.name, jSONObject, "name", DivFunctionJsonParser.NAME_VALIDATOR), (DivEvaluableType) JsonFieldResolver.resolve(parsingContext, divFunctionTemplate.returnType, jSONObject, "return_type", DivEvaluableType.FROM_STRING));
        }
    }

    /* compiled from: DivFunctionJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean NAME_VALIDATOR$lambda$0(String str) {
        return ParsingValidatorsKt.doesMatch(str, "^[a-zA-Z_][a-zA-Z0-9_]*$");
    }
}
