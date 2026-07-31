package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.template.Field;
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

/* compiled from: DivChangeSetTransitionJsonParser.kt */
/* loaded from: classes12.dex */
public abstract class DivChangeSetTransitionJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final ListValidator ITEMS_VALIDATOR = new ListValidator() { // from class: com.yandex.div2.DivChangeSetTransitionJsonParser$$ExternalSyntheticLambda0
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            boolean ITEMS_VALIDATOR$lambda$0;
            ITEMS_VALIDATOR$lambda$0 = DivChangeSetTransitionJsonParser.ITEMS_VALIDATOR$lambda$0(list);
            return ITEMS_VALIDATOR$lambda$0;
        }
    };

    /* compiled from: DivChangeSetTransitionJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivChangeSetTransition deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            return new DivChangeSetTransition(JsonPropertyParser.readList(parsingContext, jSONObject, "items", this.component.getDivChangeTransitionJsonEntityParser(), DivChangeSetTransitionJsonParser.ITEMS_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivChangeSetTransition divChangeSetTransition) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", divChangeSetTransition.items, this.component.getDivChangeTransitionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "set");
            return jSONObject;
        }
    }

    /* compiled from: DivChangeSetTransitionJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivChangeSetTransitionTemplate deserialize(ParsingContext parsingContext, DivChangeSetTransitionTemplate divChangeSetTransitionTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field field = divChangeSetTransitionTemplate != null ? divChangeSetTransitionTemplate.items : null;
            Lazy divChangeTransitionJsonTemplateParser = this.component.getDivChangeTransitionJsonTemplateParser();
            ListValidator listValidator = DivChangeSetTransitionJsonParser.ITEMS_VALIDATOR;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivChangeSetTransitionTemplate(JsonFieldParser.readListField(restrictPropertyOverride, jSONObject, "items", allowPropertyOverride, field, divChangeTransitionJsonTemplateParser, listValidator));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivChangeSetTransitionTemplate divChangeSetTransitionTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", divChangeSetTransitionTemplate.items, this.component.getDivChangeTransitionJsonTemplateParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "set");
            return jSONObject;
        }
    }

    /* compiled from: DivChangeSetTransitionJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivChangeSetTransition resolve(ParsingContext parsingContext, DivChangeSetTransitionTemplate divChangeSetTransitionTemplate, JSONObject jSONObject) {
            return new DivChangeSetTransition(JsonFieldResolver.resolveList(parsingContext, divChangeSetTransitionTemplate.items, jSONObject, "items", this.component.getDivChangeTransitionJsonTemplateResolver(), this.component.getDivChangeTransitionJsonEntityParser(), DivChangeSetTransitionJsonParser.ITEMS_VALIDATOR));
        }
    }

    /* compiled from: DivChangeSetTransitionJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ITEMS_VALIDATOR$lambda$0(List list) {
        return list.size() >= 1;
    }
}
