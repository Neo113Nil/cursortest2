package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivFixedLengthInputMask;
import com.yandex.div2.DivFixedLengthInputMaskJsonParser;
import com.yandex.div2.DivFixedLengthInputMaskPatternElementJsonParser;
import com.yandex.div2.DivFixedLengthInputMaskTemplate;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivFixedLengthInputMaskTemplate.kt */
/* loaded from: classes14.dex */
public final class DivFixedLengthInputMaskTemplate implements JSONSerializable, JsonTemplate {
    public final Field alwaysVisible;
    public final Field pattern;
    public final Field patternElements;
    public final Field rawTextVariable;
    public static final Companion Companion = new Companion(null);
    private static final Expression ALWAYS_VISIBLE_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.FALSE, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivFixedLengthInputMaskTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivFixedLengthInputMaskTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivFixedLengthInputMaskTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivFixedLengthInputMaskTemplate(Field field, Field field2, Field field3, Field field4) {
        this.alwaysVisible = field;
        this.pattern = field2;
        this.patternElements = field3;
        this.rawTextVariable = field4;
    }

    public /* synthetic */ DivFixedLengthInputMaskTemplate(ParsingEnvironment parsingEnvironment, DivFixedLengthInputMaskTemplate divFixedLengthInputMaskTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divFixedLengthInputMaskTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivFixedLengthInputMaskTemplate(ParsingEnvironment parsingEnvironment, DivFixedLengthInputMaskTemplate divFixedLengthInputMaskTemplate, boolean z, JSONObject jSONObject) {
        this(r2.nullField(false), r2.nullField(false), r2.nullField(false), r2.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivFixedLengthInputMask resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivFixedLengthInputMaskJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFixedLengthInputMaskJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivFixedLengthInputMaskJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFixedLengthInputMaskJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivFixedLengthInputMaskTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: DivFixedLengthInputMaskTemplate.kt */
    public static final class PatternElementTemplate implements JSONSerializable, JsonTemplate {
        public final Field key;
        public final Field placeholder;
        public final Field regex;
        public static final Companion Companion = new Companion(null);
        private static final Expression PLACEHOLDER_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, "_", null, 2, null);
        private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivFixedLengthInputMaskTemplate$PatternElementTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivFixedLengthInputMaskTemplate.PatternElementTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivFixedLengthInputMaskTemplate.PatternElementTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        public PatternElementTemplate(Field field, Field field2, Field field3) {
            this.key = field;
            this.placeholder = field2;
            this.regex = field3;
        }

        public /* synthetic */ PatternElementTemplate(ParsingEnvironment parsingEnvironment, PatternElementTemplate patternElementTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i & 2) != 0 ? null : patternElementTemplate, (i & 4) != 0 ? false : z, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public PatternElementTemplate(ParsingEnvironment parsingEnvironment, PatternElementTemplate patternElementTemplate, boolean z, JSONObject jSONObject) {
            this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
            Field.Companion companion = Field.INSTANCE;
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        @Override // com.yandex.div.json.JsonTemplate
        public DivFixedLengthInputMask.PatternElement resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivFixedLengthInputMaskPatternElementJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFixedLengthInputMaskPatternElementJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivFixedLengthInputMaskPatternElementJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFixedLengthInputMaskPatternElementJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivFixedLengthInputMaskTemplate.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }
}
