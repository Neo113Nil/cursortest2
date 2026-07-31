package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivRadialGradient;
import com.yandex.div2.DivRadialGradientCenter;
import com.yandex.div2.DivRadialGradientColorPointJsonParser;
import com.yandex.div2.DivRadialGradientJsonParser;
import com.yandex.div2.DivRadialGradientRadius;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import com.yandex.div2.DivRadialGradientTemplate;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivRadialGradientTemplate.kt */
/* loaded from: classes11.dex */
public final class DivRadialGradientTemplate implements JSONSerializable, JsonTemplate {
    private static final DivRadialGradientCenter.Relative CENTER_X_DEFAULT_VALUE;
    private static final DivRadialGradientCenter.Relative CENTER_Y_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final DivRadialGradientRadius.Relative RADIUS_DEFAULT_VALUE;
    public final Field centerX;
    public final Field centerY;
    public final Field colorMap;
    public final Field colors;
    public final Field radius;

    public DivRadialGradientTemplate(Field field, Field field2, Field field3, Field field4, Field field5) {
        this.centerX = field;
        this.centerY = field2;
        this.colorMap = field3;
        this.colors = field4;
        this.radius = field5;
    }

    public /* synthetic */ DivRadialGradientTemplate(ParsingEnvironment parsingEnvironment, DivRadialGradientTemplate divRadialGradientTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divRadialGradientTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivRadialGradientTemplate(ParsingEnvironment parsingEnvironment, DivRadialGradientTemplate divRadialGradientTemplate, boolean z, JSONObject jSONObject) {
        this(r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivRadialGradient resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivRadialGradientJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRadialGradientJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivRadialGradientJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRadialGradientJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivRadialGradientTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        Double valueOf = Double.valueOf(0.5d);
        CENTER_X_DEFAULT_VALUE = new DivRadialGradientCenter.Relative(new DivRadialGradientRelativeCenter(Expression.Companion.constant$default(companion, valueOf, null, 2, null)));
        CENTER_Y_DEFAULT_VALUE = new DivRadialGradientCenter.Relative(new DivRadialGradientRelativeCenter(Expression.Companion.constant$default(companion, valueOf, null, 2, null)));
        RADIUS_DEFAULT_VALUE = new DivRadialGradientRadius.Relative(new DivRadialGradientRelativeRadius(Expression.Companion.constant$default(companion, DivRadialGradientRelativeRadius.Value.FARTHEST_CORNER, null, 2, null)));
        CREATOR = new Function2() { // from class: com.yandex.div2.DivRadialGradientTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivRadialGradientTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivRadialGradientTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    /* compiled from: DivRadialGradientTemplate.kt */
    public static final class ColorPointTemplate implements JSONSerializable, JsonTemplate {
        public final Field color;
        public final Field position;
        public static final Companion Companion = new Companion(null);
        private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivRadialGradientTemplate$ColorPointTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivRadialGradientTemplate.ColorPointTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivRadialGradientTemplate.ColorPointTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
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
        public DivRadialGradient.ColorPoint resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivRadialGradientColorPointJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRadialGradientColorPointJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivRadialGradientColorPointJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRadialGradientColorPointJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivRadialGradientTemplate.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }
}
