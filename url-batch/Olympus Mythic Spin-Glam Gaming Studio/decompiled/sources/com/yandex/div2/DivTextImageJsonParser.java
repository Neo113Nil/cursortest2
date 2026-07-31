package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Parser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateParser;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivText;
import com.yandex.div2.DivTextTemplate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTextJsonParser.kt */
/* loaded from: classes9.dex */
public abstract class DivTextImageJsonParser {
    public static final Expression ALIGNMENT_VERTICAL_DEFAULT_VALUE;
    private static final Companion Companion = new Companion(null);
    public static final DivFixedSize HEIGHT_DEFAULT_VALUE;
    public static final Expression INDEXING_DIRECTION_DEFAULT_VALUE;
    public static final Expression PRELOAD_REQUIRED_DEFAULT_VALUE;
    public static final ValueValidator START_VALIDATOR;
    public static final Expression TINT_MODE_DEFAULT_VALUE;
    public static final TypeHelper TYPE_HELPER_ALIGNMENT_VERTICAL;
    public static final TypeHelper TYPE_HELPER_INDEXING_DIRECTION;
    public static final TypeHelper TYPE_HELPER_TINT_MODE;
    public static final DivFixedSize WIDTH_DEFAULT_VALUE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean START_VALIDATOR$lambda$0(long j) {
        return j >= 0;
    }

    /* compiled from: DivTextJsonParser.kt */
    public static final class EntityParserImpl implements Parser {
        private final JsonParserComponent component;

        public EntityParserImpl(JsonParserComponent jsonParserComponent) {
            this.component = jsonParserComponent;
        }

        @Override // com.yandex.div.serialization.Deserializer
        public DivText.Image deserialize(ParsingContext parsingContext, JSONObject jSONObject) {
            DivText.Image.Accessibility accessibility = (DivText.Image.Accessibility) JsonPropertyParser.readOptional(parsingContext, jSONObject, "accessibility", this.component.getDivTextImageAccessibilityJsonEntityParser());
            TypeHelper typeHelper = DivTextImageJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL;
            Function1 function1 = DivTextAlignmentVertical.FROM_STRING;
            Expression expression = DivTextImageJsonParser.ALIGNMENT_VERTICAL_DEFAULT_VALUE;
            Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "alignment_vertical", typeHelper, function1, expression);
            if (readOptionalExpression != null) {
                expression = readOptionalExpression;
            }
            DivFixedSize divFixedSize = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "height", this.component.getDivFixedSizeJsonEntityParser());
            if (divFixedSize == null) {
                divFixedSize = DivTextImageJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            DivFixedSize divFixedSize2 = divFixedSize;
            TypeHelper typeHelper2 = DivTextImageJsonParser.TYPE_HELPER_INDEXING_DIRECTION;
            Function1 function12 = DivText.Image.IndexingDirection.FROM_STRING;
            Expression expression2 = DivTextImageJsonParser.INDEXING_DIRECTION_DEFAULT_VALUE;
            Expression readOptionalExpression2 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "indexing_direction", typeHelper2, function12, expression2);
            if (readOptionalExpression2 != null) {
                expression2 = readOptionalExpression2;
            }
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression3 = DivTextImageJsonParser.PRELOAD_REQUIRED_DEFAULT_VALUE;
            Expression readOptionalExpression3 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "preload_required", typeHelper3, function13, expression3);
            if (readOptionalExpression3 != null) {
                expression3 = readOptionalExpression3;
            }
            Expression readExpression = JsonExpressionParser.readExpression(parsingContext, jSONObject, "start", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, DivTextImageJsonParser.START_VALIDATOR);
            Expression readOptionalExpression4 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "tint_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            TypeHelper typeHelper4 = DivTextImageJsonParser.TYPE_HELPER_TINT_MODE;
            Function1 function14 = DivBlendMode.FROM_STRING;
            Expression expression4 = DivTextImageJsonParser.TINT_MODE_DEFAULT_VALUE;
            Expression readOptionalExpression5 = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "tint_mode", typeHelper4, function14, expression4);
            if (readOptionalExpression5 != null) {
                expression4 = readOptionalExpression5;
            }
            Expression readExpression2 = JsonExpressionParser.readExpression(parsingContext, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            DivFixedSize divFixedSize3 = (DivFixedSize) JsonPropertyParser.readOptional(parsingContext, jSONObject, "width", this.component.getDivFixedSizeJsonEntityParser());
            if (divFixedSize3 == null) {
                divFixedSize3 = DivTextImageJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivText.Image(accessibility, expression, divFixedSize2, expression2, expression3, readExpression, readOptionalExpression4, expression4, readExpression2, divFixedSize3);
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivText.Image image) {
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.write(parsingContext, jSONObject, "accessibility", image.accessibility, this.component.getDivTextImageAccessibilityJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "alignment_vertical", image.alignmentVertical, DivTextAlignmentVertical.TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "height", image.height, this.component.getDivFixedSizeJsonEntityParser());
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "indexing_direction", image.indexingDirection, DivText.Image.IndexingDirection.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "preload_required", image.preloadRequired);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "start", image.start);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "tint_color", image.tintColor, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "tint_mode", image.tintMode, DivBlendMode.TO_STRING);
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, "url", image.url, ParsingConvertersKt.URI_TO_STRING);
            JsonPropertyParser.write(parsingContext, jSONObject, "width", image.width, this.component.getDivFixedSizeJsonEntityParser());
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
        public DivTextTemplate.ImageTemplate deserialize(ParsingContext parsingContext, DivTextTemplate.ImageTemplate imageTemplate, JSONObject jSONObject) {
            boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
            return new DivTextTemplate.ImageTemplate(JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "accessibility", allowPropertyOverride, imageTemplate != null ? imageTemplate.accessibility : null, this.component.getDivTextImageAccessibilityJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "alignment_vertical", DivTextImageJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL, allowPropertyOverride, imageTemplate != null ? imageTemplate.alignmentVertical : null, DivTextAlignmentVertical.FROM_STRING), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "height", allowPropertyOverride, imageTemplate != null ? imageTemplate.height : null, this.component.getDivFixedSizeJsonTemplateParser()), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "indexing_direction", DivTextImageJsonParser.TYPE_HELPER_INDEXING_DIRECTION, allowPropertyOverride, imageTemplate != null ? imageTemplate.indexingDirection : null, DivText.Image.IndexingDirection.FROM_STRING), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "preload_required", TypeHelpersKt.TYPE_HELPER_BOOLEAN, allowPropertyOverride, imageTemplate != null ? imageTemplate.preloadRequired : null, ParsingConvertersKt.ANY_TO_BOOLEAN), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "start", TypeHelpersKt.TYPE_HELPER_INT, allowPropertyOverride, imageTemplate != null ? imageTemplate.start : null, ParsingConvertersKt.NUMBER_TO_INT, DivTextImageJsonParser.START_VALIDATOR), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "tint_color", TypeHelpersKt.TYPE_HELPER_COLOR, allowPropertyOverride, imageTemplate != null ? imageTemplate.tintColor : null, ParsingConvertersKt.STRING_TO_COLOR_INT), JsonFieldParser.readOptionalFieldWithExpression(restrictPropertyOverride, jSONObject, "tint_mode", DivTextImageJsonParser.TYPE_HELPER_TINT_MODE, allowPropertyOverride, imageTemplate != null ? imageTemplate.tintMode : null, DivBlendMode.FROM_STRING), JsonFieldParser.readFieldWithExpression(restrictPropertyOverride, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, imageTemplate != null ? imageTemplate.url : null, ParsingConvertersKt.ANY_TO_URI), JsonFieldParser.readOptionalField(restrictPropertyOverride, jSONObject, "width", allowPropertyOverride, imageTemplate != null ? imageTemplate.width : null, this.component.getDivFixedSizeJsonTemplateParser()));
        }

        @Override // com.yandex.div.serialization.Serializer
        public JSONObject serialize(ParsingContext parsingContext, DivTextTemplate.ImageTemplate imageTemplate) {
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeField(parsingContext, jSONObject, "accessibility", imageTemplate.accessibility, this.component.getDivTextImageAccessibilityJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "alignment_vertical", imageTemplate.alignmentVertical, DivTextAlignmentVertical.TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "height", imageTemplate.height, this.component.getDivFixedSizeJsonTemplateParser());
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "indexing_direction", imageTemplate.indexingDirection, DivText.Image.IndexingDirection.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "preload_required", imageTemplate.preloadRequired);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "start", imageTemplate.start);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "tint_color", imageTemplate.tintColor, ParsingConvertersKt.COLOR_INT_TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "tint_mode", imageTemplate.tintMode, DivBlendMode.TO_STRING);
            JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", imageTemplate.url, ParsingConvertersKt.URI_TO_STRING);
            JsonFieldParser.writeField(parsingContext, jSONObject, "width", imageTemplate.width, this.component.getDivFixedSizeJsonTemplateParser());
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
        public DivText.Image resolve(ParsingContext parsingContext, DivTextTemplate.ImageTemplate imageTemplate, JSONObject jSONObject) {
            DivText.Image.Accessibility accessibility = (DivText.Image.Accessibility) JsonFieldResolver.resolveOptional(parsingContext, imageTemplate.accessibility, jSONObject, "accessibility", this.component.getDivTextImageAccessibilityJsonTemplateResolver(), this.component.getDivTextImageAccessibilityJsonEntityParser());
            Field field = imageTemplate.alignmentVertical;
            TypeHelper typeHelper = DivTextImageJsonParser.TYPE_HELPER_ALIGNMENT_VERTICAL;
            Function1 function1 = DivTextAlignmentVertical.FROM_STRING;
            Expression expression = DivTextImageJsonParser.ALIGNMENT_VERTICAL_DEFAULT_VALUE;
            Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "alignment_vertical", typeHelper, function1, expression);
            if (resolveOptionalExpression == null) {
                resolveOptionalExpression = expression;
            }
            DivFixedSize divFixedSize = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, imageTemplate.height, jSONObject, "height", this.component.getDivFixedSizeJsonTemplateResolver(), this.component.getDivFixedSizeJsonEntityParser());
            if (divFixedSize == null) {
                divFixedSize = DivTextImageJsonParser.HEIGHT_DEFAULT_VALUE;
            }
            Field field2 = imageTemplate.indexingDirection;
            TypeHelper typeHelper2 = DivTextImageJsonParser.TYPE_HELPER_INDEXING_DIRECTION;
            Function1 function12 = DivText.Image.IndexingDirection.FROM_STRING;
            Expression expression2 = DivTextImageJsonParser.INDEXING_DIRECTION_DEFAULT_VALUE;
            Expression resolveOptionalExpression2 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field2, jSONObject, "indexing_direction", typeHelper2, function12, expression2);
            if (resolveOptionalExpression2 == null) {
                resolveOptionalExpression2 = expression2;
            }
            Field field3 = imageTemplate.preloadRequired;
            TypeHelper<Boolean> typeHelper3 = TypeHelpersKt.TYPE_HELPER_BOOLEAN;
            Function1 function13 = ParsingConvertersKt.ANY_TO_BOOLEAN;
            Expression expression3 = DivTextImageJsonParser.PRELOAD_REQUIRED_DEFAULT_VALUE;
            Expression resolveOptionalExpression3 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field3, jSONObject, "preload_required", typeHelper3, function13, expression3);
            if (resolveOptionalExpression3 != null) {
                expression3 = resolveOptionalExpression3;
            }
            Expression resolveExpression = JsonFieldResolver.resolveExpression(parsingContext, imageTemplate.start, jSONObject, "start", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT, DivTextImageJsonParser.START_VALIDATOR);
            Expression resolveOptionalExpression4 = JsonFieldResolver.resolveOptionalExpression(parsingContext, imageTemplate.tintColor, jSONObject, "tint_color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
            Field field4 = imageTemplate.tintMode;
            TypeHelper typeHelper4 = DivTextImageJsonParser.TYPE_HELPER_TINT_MODE;
            Function1 function14 = DivBlendMode.FROM_STRING;
            Expression expression4 = DivTextImageJsonParser.TINT_MODE_DEFAULT_VALUE;
            Expression resolveOptionalExpression5 = JsonFieldResolver.resolveOptionalExpression(parsingContext, field4, jSONObject, "tint_mode", typeHelper4, function14, expression4);
            if (resolveOptionalExpression5 != null) {
                expression4 = resolveOptionalExpression5;
            }
            Expression resolveExpression2 = JsonFieldResolver.resolveExpression(parsingContext, imageTemplate.url, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
            DivFixedSize divFixedSize2 = (DivFixedSize) JsonFieldResolver.resolveOptional(parsingContext, imageTemplate.width, jSONObject, "width", this.component.getDivFixedSizeJsonTemplateResolver(), this.component.getDivFixedSizeJsonEntityParser());
            if (divFixedSize2 == null) {
                divFixedSize2 = DivTextImageJsonParser.WIDTH_DEFAULT_VALUE;
            }
            return new DivText.Image(accessibility, resolveOptionalExpression, divFixedSize, resolveOptionalExpression2, expression3, resolveExpression, resolveOptionalExpression4, expression4, resolveExpression2, divFixedSize2);
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

    static {
        Expression.Companion companion = Expression.INSTANCE;
        DivTextAlignmentVertical divTextAlignmentVertical = DivTextAlignmentVertical.CENTER;
        ALIGNMENT_VERTICAL_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divTextAlignmentVertical, null, 2, null);
        HEIGHT_DEFAULT_VALUE = new DivFixedSize(null, Expression.Companion.constant$default(companion, 20L, null, 2, null), 1, null);
        DivText.Image.IndexingDirection indexingDirection = DivText.Image.IndexingDirection.NORMAL;
        INDEXING_DIRECTION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, indexingDirection, null, 2, null);
        PRELOAD_REQUIRED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        DivBlendMode divBlendMode = DivBlendMode.SOURCE_IN;
        TINT_MODE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, divBlendMode, null, 2, null);
        WIDTH_DEFAULT_VALUE = new DivFixedSize(null, Expression.Companion.constant$default(companion, 20L, null, 2, null), 1, null);
        TypeHelper.Companion companion2 = TypeHelper.INSTANCE;
        TYPE_HELPER_ALIGNMENT_VERTICAL = companion2.from(divTextAlignmentVertical, new Function1() { // from class: com.yandex.div2.DivTextImageJsonParser$Companion$TYPE_HELPER_ALIGNMENT_VERTICAL$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivTextAlignmentVertical);
            }
        });
        TYPE_HELPER_INDEXING_DIRECTION = companion2.from(indexingDirection, new Function1() { // from class: com.yandex.div2.DivTextImageJsonParser$Companion$TYPE_HELPER_INDEXING_DIRECTION$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivText.Image.IndexingDirection);
            }
        });
        TYPE_HELPER_TINT_MODE = companion2.from(divBlendMode, new Function1() { // from class: com.yandex.div2.DivTextImageJsonParser$Companion$TYPE_HELPER_TINT_MODE$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Object obj) {
                return Boolean.valueOf(obj instanceof DivBlendMode);
            }
        });
        START_VALIDATOR = new ValueValidator() { // from class: com.yandex.div2.DivTextImageJsonParser$$ExternalSyntheticLambda0
            @Override // com.yandex.div.internal.parser.ValueValidator
            public final boolean isValid(Object obj) {
                boolean START_VALIDATOR$lambda$0;
                START_VALIDATOR$lambda$0 = DivTextImageJsonParser.START_VALIDATOR$lambda$0(((Long) obj).longValue());
                return START_VALIDATOR$lambda$0;
            }
        };
    }
}
