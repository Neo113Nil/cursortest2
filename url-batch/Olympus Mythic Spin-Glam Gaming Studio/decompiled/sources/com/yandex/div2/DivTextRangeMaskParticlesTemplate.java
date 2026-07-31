package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivTextRangeMaskParticlesJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTextRangeMaskParticlesTemplate.kt */
/* loaded from: classes12.dex */
public final class DivTextRangeMaskParticlesTemplate implements JSONSerializable, JsonTemplate {
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression DENSITY_DEFAULT_VALUE;
    private static final Expression IS_ANIMATED_DEFAULT_VALUE;
    private static final Expression IS_ENABLED_DEFAULT_VALUE;
    private static final DivFixedSize PARTICLE_SIZE_DEFAULT_VALUE;
    public final Field color;
    public final Field density;
    public final Field isAnimated;
    public final Field isEnabled;
    public final Field particleSize;

    public DivTextRangeMaskParticlesTemplate(Field field, Field field2, Field field3, Field field4, Field field5) {
        this.color = field;
        this.density = field2;
        this.isAnimated = field3;
        this.isEnabled = field4;
        this.particleSize = field5;
    }

    public /* synthetic */ DivTextRangeMaskParticlesTemplate(ParsingEnvironment parsingEnvironment, DivTextRangeMaskParticlesTemplate divTextRangeMaskParticlesTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divTextRangeMaskParticlesTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivTextRangeMaskParticlesTemplate(ParsingEnvironment parsingEnvironment, DivTextRangeMaskParticlesTemplate divTextRangeMaskParticlesTemplate, boolean z, JSONObject jSONObject) {
        this(r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivTextRangeMaskParticles resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivTextRangeMaskParticlesJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextRangeMaskParticlesJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivTextRangeMaskParticlesJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextRangeMaskParticlesJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivTextRangeMaskParticlesTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        DENSITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(0.8d), null, 2, null);
        IS_ANIMATED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        IS_ENABLED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        PARTICLE_SIZE_DEFAULT_VALUE = new DivFixedSize(null, Expression.Companion.constant$default(companion, 1L, null, 2, null), 1, null);
        CREATOR = new Function2() { // from class: com.yandex.div2.DivTextRangeMaskParticlesTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivTextRangeMaskParticlesTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivTextRangeMaskParticlesTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }
}
