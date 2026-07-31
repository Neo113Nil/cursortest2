package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTextRangeMask.kt */
/* loaded from: classes10.dex */
public abstract class DivTextRangeMask implements JSONSerializable, Hashable {
    private Integer _hash;
    private Integer _propertiesHash;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivTextRangeMask$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivTextRangeMask invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivTextRangeMask.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public /* synthetic */ DivTextRangeMask(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivTextRangeMask.kt */
    public static final class Particles extends DivTextRangeMask {
        private final DivTextRangeMaskParticles value;

        public Particles(DivTextRangeMaskParticles divTextRangeMaskParticles) {
            super(null);
            this.value = divTextRangeMaskParticles;
        }

        public final DivTextRangeMaskParticles getValue() {
            return this.value;
        }
    }

    private DivTextRangeMask() {
    }

    /* compiled from: DivTextRangeMask.kt */
    public static final class Solid extends DivTextRangeMask {
        private final DivTextRangeMaskSolid value;

        public Solid(DivTextRangeMaskSolid divTextRangeMaskSolid) {
            super(null);
            this.value = divTextRangeMaskSolid;
        }

        public final DivTextRangeMaskSolid getValue() {
            return this.value;
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int propertiesHash() {
        int propertiesHash;
        Integer num = this._propertiesHash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(getClass()).hashCode();
        if (this instanceof Particles) {
            propertiesHash = ((Particles) this).getValue().propertiesHash();
        } else {
            if (!(this instanceof Solid)) {
                throw new NoWhenBranchMatchedException();
            }
            propertiesHash = ((Solid) this).getValue().propertiesHash();
        }
        int i = hashCode + propertiesHash;
        this._propertiesHash = Integer.valueOf(i);
        return i;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int hash;
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(getClass()).hashCode();
        if (this instanceof Particles) {
            hash = ((Particles) this).getValue().hash();
        } else {
            if (!(this instanceof Solid)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((Solid) this).getValue().hash();
        }
        int i = hashCode + hash;
        this._hash = Integer.valueOf(i);
        return i;
    }

    public final boolean equals(DivTextRangeMask divTextRangeMask, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divTextRangeMask == null) {
            return false;
        }
        if (this instanceof Particles) {
            DivTextRangeMaskParticles value = ((Particles) this).getValue();
            Object value2 = divTextRangeMask.value();
            return value.equals(value2 instanceof DivTextRangeMaskParticles ? (DivTextRangeMaskParticles) value2 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof Solid)) {
            throw new NoWhenBranchMatchedException();
        }
        DivTextRangeMaskSolid value3 = ((Solid) this).getValue();
        Object value4 = divTextRangeMask.value();
        return value3.equals(value4 instanceof DivTextRangeMaskSolid ? (DivTextRangeMaskSolid) value4 : null, expressionResolver, expressionResolver2);
    }

    public final Object value() {
        if (this instanceof Particles) {
            return ((Particles) this).getValue();
        }
        if (this instanceof Solid) {
            return ((Solid) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivTextRangeMaskJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextRangeMaskJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivTextRangeMask.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivTextRangeMask fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivTextRangeMaskJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextRangeMaskJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
