package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivLinearGradient;
import com.yandex.div2.DivLinearGradientColorPointJsonParser;
import com.yandex.div2.DivLinearGradientJsonParser;
import com.yandex.div2.DivLinearGradientTemplate;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivLinearGradientTemplate.kt */
/* loaded from: classes10.dex */
public final class DivLinearGradientTemplate implements JSONSerializable, JsonTemplate {
    public final Field angle;
    public final Field colorMap;
    public final Field colors;
    public static final Companion Companion = new Companion(null);
    private static final Expression ANGLE_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, 0L, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivLinearGradientTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivLinearGradientTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivLinearGradientTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivLinearGradientTemplate(Field field, Field field2, Field field3) {
        this.angle = field;
        this.colorMap = field2;
        this.colors = field3;
    }

    public /* synthetic */ DivLinearGradientTemplate(ParsingEnvironment parsingEnvironment, DivLinearGradientTemplate divLinearGradientTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divLinearGradientTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivLinearGradientTemplate(ParsingEnvironment parsingEnvironment, DivLinearGradientTemplate divLinearGradientTemplate, boolean z, JSONObject jSONObject) {
        this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivLinearGradient resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivLinearGradientJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivLinearGradientJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivLinearGradientJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivLinearGradientJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivLinearGradientTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: DivLinearGradientTemplate.kt */
    public static final class ColorPointTemplate implements JSONSerializable, JsonTemplate {
        public final Field color;
        public final Field position;
        public static final Companion Companion = new Companion(null);
        private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivLinearGradientTemplate$ColorPointTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivLinearGradientTemplate.ColorPointTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivLinearGradientTemplate.ColorPointTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        public ColorPointTemplate(Field field, Field field2) {
            this.color = field;
            this.position = field2;
        }

        public /* synthetic */ ColorPointTemplate(ParsingEnvironment parsingEnvironment, ColorPointTemplate colorPointTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i & 2) != 0 ? null : colorPointTemplate, (i & 4) != 0 ? false : z, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ColorPointTemplate(ParsingEnvironment parsingEnvironment, ColorPointTemplate colorPointTemplate, boolean z, JSONObject jSONObject) {
            this(r1.nullField(false), r1.nullField(false));
            Field.Companion companion = Field.INSTANCE;
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        @Override // com.yandex.div.json.JsonTemplate
        public DivLinearGradient.ColorPoint resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivLinearGradientColorPointJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivLinearGradientColorPointJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivLinearGradientColorPointJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivLinearGradientColorPointJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivLinearGradientTemplate.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }
}
