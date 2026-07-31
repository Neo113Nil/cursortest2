package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivText;
import com.yandex.div2.DivTextTemplate;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: DivTextJsonParser.kt */
/* loaded from: classes14.dex */
public abstract class DivTextImageAccessibilityJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final DivText.Image.Accessibility.Type TYPE_DEFAULT_VALUE = DivText.Image.Accessibility.Type.AUTO;

    /* compiled from: DivTextJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivText.Image.Accessibility deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "description", TypeHelpersKt.TYPE_HELPER_STRING);
            DivText.Image.Accessibility.Type type = (DivText.Image.Accessibility.Type) JsonPropertyParser.readOptional(parsingContext, jSONObject, "type", DivText.Image.Accessibility.Type.FROM_STRING);
            if (type == null) {
                type = DivTextImageAccessibilityJsonParser.TYPE_DEFAULT_VALUE;
            }
            return new DivText.Image.Accessibility(readOptionalExpression, type);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivText.Image.Accessibility accessibility) {
            JSONObject jSONObject = new JSONObject();
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "description", accessibility.description);
            JsonPropertyParser.write(parsingContext, jSONObject, "type", accessibility.type, DivText.Image.Accessibility.Type.TO_STRING);
            return jSONObject;
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivTextTemplate.ImageTemplate.AccessibilityTemplate deserialize(ParsingContext parsingContext, DivTextTemplate.ImageTemplate.AccessibilityTemplate accessibilityTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivTextTemplate.ImageTemplate.AccessibilityTemplate(JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "description", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, accessibilityTemplate != null ? accessibilityTemplate.description : null), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "type", allowPropertyOverride, accessibilityTemplate != null ? accessibilityTemplate.type : null, DivText.Image.Accessibility.Type.FROM_STRING));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivTextTemplate.ImageTemplate.AccessibilityTemplate accessibilityTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "description", accessibilityTemplate.description);
            JsonFieldParser.writeField(parsingContext, jSONObject, "type", accessibilityTemplate.type, DivText.Image.Accessibility.Type.TO_STRING);
            return jSONObject;
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivText.Image.Accessibility resolve(ParsingContext parsingContext, DivTextTemplate.ImageTemplate.AccessibilityTemplate accessibilityTemplate, JSONObject jSONObject) {
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, accessibilityTemplate.description, jSONObject, "description", TypeHelpersKt.TYPE_HELPER_STRING);
            DivText.Image.Accessibility.Type type = (DivText.Image.Accessibility.Type) JsonFieldResolver.resolveOptional(parsingContext, accessibilityTemplate.type, jSONObject, "type", DivText.Image.Accessibility.Type.FROM_STRING);
            if (type == null) {
                type = DivTextImageAccessibilityJsonParser.TYPE_DEFAULT_VALUE;
            }
            return new DivText.Image.Accessibility(resolveOptionalExpression, type);
        }
    }

    /* compiled from: DivTextJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
