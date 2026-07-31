package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivTabs;
import com.yandex.div2.DivTabsTemplate;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: DivTabsJsonParser.kt */
/* loaded from: classes8.dex */
public abstract class DivTabsTabTitleDelimiterJsonParser {
    private static final Companion Companion = new Companion(null);
    public static final DivFixedSize HEIGHT_DEFAULT_VALUE;
    public static final DivFixedSize WIDTH_DEFAULT_VALUE;

    /* compiled from: DivTabsJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivTabs.TabTitleDelimiter deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            DivFixedSize divFixedSize = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.component.getDivFixedSizeJsonEntityParser());
            if (divFixedSize == null) {
                divFixedSize = DivTabsTabTitleDelimiterJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            DivFixedSize divFixedSize2 = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.component.getDivFixedSizeJsonEntityParser());
            if (divFixedSize2 == null) {
                divFixedSize2 = DivTabsTabTitleDelimiterJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivTabs.TabTitleDelimiter(divFixedSize, readExpression, divFixedSize2);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivTabs.TabTitleDelimiter tabTitleDelimiter) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "height", tabTitleDelimiter.height, this.component.getDivFixedSizeJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "image_url", tabTitleDelimiter.imageUrl, ParsingConvertersKt.URI_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "width", tabTitleDelimiter.width, this.component.getDivFixedSizeJsonEntityParser());
            return jSONObject;
        }
    }

    /* compiled from: DivTabsJsonParser.kt */
    public static final class TemplateParserImpl implements TemplateParser {
        private final JsonParserComponent component;

        public TemplateParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        public DivTabsTemplate.TabTitleDelimiterTemplate deserialize(ParsingContext parsingContext, DivTabsTemplate.TabTitleDelimiterTemplate tabTitleDelimiterTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivTabsTemplate.TabTitleDelimiterTemplate(JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, tabTitleDelimiterTemplate != null ? tabTitleDelimiterTemplate.height : null, this.component.getDivFixedSizeJsonTemplateParser()), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, tabTitleDelimiterTemplate != null ? tabTitleDelimiterTemplate.imageUrl : null, ParsingConvertersKt.ANY_TO_URI), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, tabTitleDelimiterTemplate != null ? tabTitleDelimiterTemplate.width : null, this.component.getDivFixedSizeJsonTemplateParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivTabsTemplate.TabTitleDelimiterTemplate tabTitleDelimiterTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", tabTitleDelimiterTemplate.height, this.component.getDivFixedSizeJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "image_url", tabTitleDelimiterTemplate.imageUrl, ParsingConvertersKt.URI_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", tabTitleDelimiterTemplate.width, this.component.getDivFixedSizeJsonTemplateParser());
            return jSONObject;
        }
    }

    /* compiled from: DivTabsJsonParser.kt */
    public static final class TemplateResolverImpl implements TemplateResolver {
        private final JsonParserComponent component;

        public TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        public DivTabs.TabTitleDelimiter resolve(ParsingContext parsingContext, DivTabsTemplate.TabTitleDelimiterTemplate tabTitleDelimiterTemplate, JSONObject jSONObject) {
            DivFixedSize divFixedSize = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, tabTitleDelimiterTemplate.height, jSONObject, "height", this.component.getDivFixedSizeJsonTemplateResolver(), this.component.getDivFixedSizeJsonEntityParser());
            if (divFixedSize == null) {
                divFixedSize = DivTabsTabTitleDelimiterJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, tabTitleDelimiterTemplate.imageUrl, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            DivFixedSize divFixedSize2 = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, tabTitleDelimiterTemplate.width, jSONObject, "width", this.component.getDivFixedSizeJsonTemplateResolver(), this.component.getDivFixedSizeJsonEntityParser());
            if (divFixedSize2 == null) {
                divFixedSize2 = DivTabsTabTitleDelimiterJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivTabs.TabTitleDelimiter(divFixedSize, resolveExpression, divFixedSize2);
        }
    }

    /* compiled from: DivTabsJsonParser.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        HEIGHT_DEFAULT_VALUE = new DivFixedSize(null, Expression.Companion.constant$default(companion, 12L, null, 2, null), 1, null);
        WIDTH_DEFAULT_VALUE = new DivFixedSize(null, Expression.Companion.constant$default(companion, 12L, null, 2, null), 1, null);
    }
}
