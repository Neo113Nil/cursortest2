package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import com.yandex.div.serialization.TemplateResolver;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivCollectionItemBuilderJsonParser.kt */
/* loaded from: classes11.dex */
public abstract class DivCollectionItemBuilderJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final String DATA_ELEMENT_NAME_DEFAULT_VALUE = "it";
    public static final ListValidator PROTOTYPES_VALIDATOR = new ListValidator() { // from class: com.yandex.div2.DivCollectionItemBuilderJsonParser$$ExternalSyntheticLambda0
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            boolean PROTOTYPES_VALIDATOR$lambda$0;
            PROTOTYPES_VALIDATOR$lambda$0 = DivCollectionItemBuilderJsonParser.PROTOTYPES_VALIDATOR$lambda$0(list);
            return PROTOTYPES_VALIDATOR$lambda$0;
        }
    };

    /* compiled from: DivCollectionItemBuilderJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivCollectionItemBuilder deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "data", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY);
            String str = (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, "data_element_name");
            if (str == null) {
                str = DivCollectionItemBuilderJsonParser.DATA_ELEMENT_NAME_DEFAULT_VALUE;
            }
            return new DivCollectionItemBuilder(readExpression, str, JsonPropertyParser.readList(parsingContext, jSONObject, "prototypes", this.component.getDivCollectionItemBuilderPrototypeJsonEntityParser(), DivCollectionItemBuilderJsonParser.PROTOTYPES_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivCollectionItemBuilder divCollectionItemBuilder) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "data", divCollectionItemBuilder.data);
            JsonPropertyParser.write(parsingContext, jSONObject, "data_element_name", divCollectionItemBuilder.dataElementName);
            JsonPropertyParser.writeList(parsingContext, jSONObject, "prototypes", divCollectionItemBuilder.prototypes, this.component.getDivCollectionItemBuilderPrototypeJsonEntityParser());
            return jSONObject;
        }
    }

    /* compiled from: DivCollectionItemBuilderJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivCollectionItemBuilderTemplate deserialize(ParsingContext parsingContext, DivCollectionItemBuilderTemplate divCollectionItemBuilderTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "data", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY, allowPropertyOverride, divCollectionItemBuilderTemplate != null ? divCollectionItemBuilderTemplate.data : null);
            Field readOptionalField = JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "data_element_name", allowPropertyOverride, divCollectionItemBuilderTemplate != null ? divCollectionItemBuilderTemplate.dataElementName : null);
            Field field = divCollectionItemBuilderTemplate != null ? divCollectionItemBuilderTemplate.prototypes : null;
            Lazy divCollectionItemBuilderPrototypeJsonTemplateParser = this.component.getDivCollectionItemBuilderPrototypeJsonTemplateParser();
            ListValidator listValidator = DivCollectionItemBuilderJsonParser.PROTOTYPES_VALIDATOR;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivCollectionItemBuilderTemplate(readFieldWithExpression, readOptionalField, JsonFieldParser.readListField(restrictPropertyOverride, jSONObject, "prototypes", allowPropertyOverride, field, divCollectionItemBuilderPrototypeJsonTemplateParser, listValidator));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivCollectionItemBuilderTemplate divCollectionItemBuilderTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "data", divCollectionItemBuilderTemplate.data);
            JsonFieldParser.writeField(parsingContext, jSONObject, "data_element_name", divCollectionItemBuilderTemplate.dataElementName);
            JsonFieldParser.writeListField(parsingContext, jSONObject, "prototypes", divCollectionItemBuilderTemplate.prototypes, this.component.getDivCollectionItemBuilderPrototypeJsonTemplateParser());
            return jSONObject;
        }
    }

    /* compiled from: DivCollectionItemBuilderJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivCollectionItemBuilder resolve(ParsingContext parsingContext, DivCollectionItemBuilderTemplate divCollectionItemBuilderTemplate, JSONObject jSONObject) {
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, divCollectionItemBuilderTemplate.data, jSONObject, "data", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY);
            String str = (String) JsonFieldResolver.resolveOptional(parsingContext, divCollectionItemBuilderTemplate.dataElementName, jSONObject, "data_element_name");
            if (str == null) {
                str = DivCollectionItemBuilderJsonParser.DATA_ELEMENT_NAME_DEFAULT_VALUE;
            }
            return new DivCollectionItemBuilder(resolveExpression, str, JsonFieldResolver.resolveList(parsingContext, divCollectionItemBuilderTemplate.prototypes, jSONObject, "prototypes", this.component.getDivCollectionItemBuilderPrototypeJsonTemplateResolver(), this.component.getDivCollectionItemBuilderPrototypeJsonEntityParser(), DivCollectionItemBuilderJsonParser.PROTOTYPES_VALIDATOR));
        }
    }

    /* compiled from: DivCollectionItemBuilderJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PROTOTYPES_VALIDATOR$lambda$0(List list) {
        return list.size() >= 1;
    }
}
