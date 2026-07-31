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

/* compiled from: DivAppearanceSetTransitionJsonParser.kt */
/* loaded from: classes11.dex */
public abstract class DivAppearanceSetTransitionJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final ListValidator ITEMS_VALIDATOR = new ListValidator() { // from class: com.yandex.div2.DivAppearanceSetTransitionJsonParser$$ExternalSyntheticLambda0
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            boolean ITEMS_VALIDATOR$lambda$0;
            ITEMS_VALIDATOR$lambda$0 = DivAppearanceSetTransitionJsonParser.ITEMS_VALIDATOR$lambda$0(list);
            return ITEMS_VALIDATOR$lambda$0;
        }
    };

    /* compiled from: DivAppearanceSetTransitionJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivAppearanceSetTransition deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            return new DivAppearanceSetTransition(JsonPropertyParser.readList(parsingContext, jSONObject, "items", this.component.getDivAppearanceTransitionJsonEntityParser(), DivAppearanceSetTransitionJsonParser.ITEMS_VALIDATOR));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivAppearanceSetTransition divAppearanceSetTransition) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(parsingContext, jSONObject, "items", divAppearanceSetTransition.items, this.component.getDivAppearanceTransitionJsonEntityParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "set");
            return jSONObject;
        }
    }

    /* compiled from: DivAppearanceSetTransitionJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivAppearanceSetTransitionTemplate deserialize(ParsingContext parsingContext, DivAppearanceSetTransitionTemplate divAppearanceSetTransitionTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            Field field = divAppearanceSetTransitionTemplate != null ? divAppearanceSetTransitionTemplate.items : null;
            Lazy divAppearanceTransitionJsonTemplateParser = this.component.getDivAppearanceTransitionJsonTemplateParser();
            ListValidator listValidator = DivAppearanceSetTransitionJsonParser.ITEMS_VALIDATOR;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            return new DivAppearanceSetTransitionTemplate(JsonFieldParser.readListField(restrictPropertyOverride, jSONObject, "items", allowPropertyOverride, field, divAppearanceTransitionJsonTemplateParser, listValidator));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivAppearanceSetTransitionTemplate divAppearanceSetTransitionTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(parsingContext, jSONObject, "items", divAppearanceSetTransitionTemplate.items, this.component.getDivAppearanceTransitionJsonTemplateParser());
            JsonPropertyParser.write(parsingContext, jSONObject, "type", "set");
            return jSONObject;
        }
    }

    /* compiled from: DivAppearanceSetTransitionJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivAppearanceSetTransition resolve(ParsingContext parsingContext, DivAppearanceSetTransitionTemplate divAppearanceSetTransitionTemplate, JSONObject jSONObject) {
            return new DivAppearanceSetTransition(JsonFieldResolver.resolveList(parsingContext, divAppearanceSetTransitionTemplate.items, jSONObject, "items", this.component.getDivAppearanceTransitionJsonTemplateResolver(), this.component.getDivAppearanceTransitionJsonEntityParser(), DivAppearanceSetTransitionJsonParser.ITEMS_VALIDATOR));
        }
    }

    /* compiled from: DivAppearanceSetTransitionJsonParser.kt */
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
