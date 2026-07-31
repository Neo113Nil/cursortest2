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

/* compiled from: DivTextGradient.kt */
/* loaded from: classes10.dex */
public abstract class DivTextGradient implements JSONSerializable, Hashable {
    private Integer _hash;
    private Integer _propertiesHash;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivTextGradient$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivTextGradient invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivTextGradient.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public /* synthetic */ DivTextGradient(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivTextGradient.kt */
    public static final class Linear extends DivTextGradient {
        private final DivLinearGradient value;

        public Linear(DivLinearGradient divLinearGradient) {
            super(null);
            this.value = divLinearGradient;
        }

        public final DivLinearGradient getValue() {
            return this.value;
        }
    }

    private DivTextGradient() {
    }

    /* compiled from: DivTextGradient.kt */
    public static final class Radial extends DivTextGradient {
        private final DivRadialGradient value;

        public Radial(DivRadialGradient divRadialGradient) {
            super(null);
            this.value = divRadialGradient;
        }

        public final DivRadialGradient getValue() {
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
        if (this instanceof Linear) {
            propertiesHash = ((Linear) this).getValue().propertiesHash();
        } else {
            if (!(this instanceof Radial)) {
                throw new NoWhenBranchMatchedException();
            }
            propertiesHash = ((Radial) this).getValue().propertiesHash();
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
        if (this instanceof Linear) {
            hash = ((Linear) this).getValue().hash();
        } else {
            if (!(this instanceof Radial)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((Radial) this).getValue().hash();
        }
        int i = hashCode + hash;
        this._hash = Integer.valueOf(i);
        return i;
    }

    public final boolean equals(DivTextGradient divTextGradient, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divTextGradient == null) {
            return false;
        }
        if (this instanceof Linear) {
            DivLinearGradient value = ((Linear) this).getValue();
            Object value2 = divTextGradient.value();
            return value.equals(value2 instanceof DivLinearGradient ? (DivLinearGradient) value2 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof Radial)) {
            throw new NoWhenBranchMatchedException();
        }
        DivRadialGradient value3 = ((Radial) this).getValue();
        Object value4 = divTextGradient.value();
        return value3.equals(value4 instanceof DivRadialGradient ? (DivRadialGradient) value4 : null, expressionResolver, expressionResolver2);
    }

    public final Object value() {
        if (this instanceof Linear) {
            return ((Linear) this).getValue();
        }
        if (this instanceof Radial) {
            return ((Radial) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivTextGradientJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextGradientJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivTextGradient.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivTextGradient fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivTextGradientJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextGradientJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
