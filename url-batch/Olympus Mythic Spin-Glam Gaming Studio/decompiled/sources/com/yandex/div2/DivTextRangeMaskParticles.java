package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivTextRangeMaskParticlesJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTextRangeMaskParticles.kt */
/* loaded from: classes.dex */
public final class DivTextRangeMaskParticles implements JSONSerializable, Hashable {
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression DENSITY_DEFAULT_VALUE;
    private static final Expression IS_ANIMATED_DEFAULT_VALUE;
    private static final Expression IS_ENABLED_DEFAULT_VALUE;
    private static final DivFixedSize PARTICLE_SIZE_DEFAULT_VALUE;
    private Integer _hash;
    public final Expression color;
    public final Expression density;
    public final Expression isAnimated;
    public final Expression isEnabled;
    public final DivFixedSize particleSize;

    public DivTextRangeMaskParticles(Expression expression, Expression expression2, Expression expression3, Expression expression4, DivFixedSize divFixedSize) {
        this.color = expression;
        this.density = expression2;
        this.isAnimated = expression3;
        this.isEnabled = expression4;
        this.particleSize = divFixedSize;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivTextRangeMaskParticles.class).hashCode() + this.color.hashCode() + this.density.hashCode() + this.isAnimated.hashCode() + this.isEnabled.hashCode() + this.particleSize.hash();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    public final boolean equals(DivTextRangeMaskParticles divTextRangeMaskParticles, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divTextRangeMaskParticles != null && ((Number) this.color.evaluate(expressionResolver)).intValue() == ((Number) divTextRangeMaskParticles.color.evaluate(expressionResolver2)).intValue() && ((Number) this.density.evaluate(expressionResolver)).doubleValue() == ((Number) divTextRangeMaskParticles.density.evaluate(expressionResolver2)).doubleValue() && ((Boolean) this.isAnimated.evaluate(expressionResolver)).booleanValue() == ((Boolean) divTextRangeMaskParticles.isAnimated.evaluate(expressionResolver2)).booleanValue() && ((Boolean) this.isEnabled.evaluate(expressionResolver)).booleanValue() == ((Boolean) divTextRangeMaskParticles.isEnabled.evaluate(expressionResolver2)).booleanValue() && this.particleSize.equals(divTextRangeMaskParticles.particleSize, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivTextRangeMaskParticlesJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextRangeMaskParticlesJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivTextRangeMaskParticles.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivTextRangeMaskParticles fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivTextRangeMaskParticlesJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextRangeMaskParticlesJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        DENSITY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(0.8d), null, 2, null);
        IS_ANIMATED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        IS_ENABLED_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        PARTICLE_SIZE_DEFAULT_VALUE = new DivFixedSize(null, Expression.Companion.constant$default(companion, 1L, null, 2, null), 1, null);
        CREATOR = new Function2() { // from class: com.yandex.div2.DivTextRangeMaskParticles$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivTextRangeMaskParticles invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivTextRangeMaskParticles.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }
}
