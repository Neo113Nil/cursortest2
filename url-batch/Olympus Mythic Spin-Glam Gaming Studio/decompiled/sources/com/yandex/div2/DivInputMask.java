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

/* compiled from: DivInputMask.kt */
/* loaded from: classes10.dex */
public abstract class DivInputMask implements JSONSerializable, Hashable {
    private Integer _hash;
    private Integer _propertiesHash;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivInputMask$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivInputMask invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivInputMask.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public /* synthetic */ DivInputMask(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivInputMask.kt */
    public static final class FixedLength extends DivInputMask {
        private final DivFixedLengthInputMask value;

        public FixedLength(DivFixedLengthInputMask divFixedLengthInputMask) {
            super(null);
            this.value = divFixedLengthInputMask;
        }

        public final DivFixedLengthInputMask getValue() {
            return this.value;
        }
    }

    private DivInputMask() {
    }

    /* compiled from: DivInputMask.kt */
    public static final class Currency extends DivInputMask {
        private final DivCurrencyInputMask value;

        public Currency(DivCurrencyInputMask divCurrencyInputMask) {
            super(null);
            this.value = divCurrencyInputMask;
        }

        public final DivCurrencyInputMask getValue() {
            return this.value;
        }
    }

    /* compiled from: DivInputMask.kt */
    public static final class Phone extends DivInputMask {
        private final DivPhoneInputMask value;

        public Phone(DivPhoneInputMask divPhoneInputMask) {
            super(null);
            this.value = divPhoneInputMask;
        }

        public final DivPhoneInputMask getValue() {
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
        if (this instanceof FixedLength) {
            propertiesHash = ((FixedLength) this).getValue().propertiesHash();
        } else if (this instanceof Currency) {
            propertiesHash = ((Currency) this).getValue().propertiesHash();
        } else {
            if (!(this instanceof Phone)) {
                throw new NoWhenBranchMatchedException();
            }
            propertiesHash = ((Phone) this).getValue().propertiesHash();
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
        if (this instanceof FixedLength) {
            hash = ((FixedLength) this).getValue().hash();
        } else if (this instanceof Currency) {
            hash = ((Currency) this).getValue().hash();
        } else {
            if (!(this instanceof Phone)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((Phone) this).getValue().hash();
        }
        int i = hashCode + hash;
        this._hash = Integer.valueOf(i);
        return i;
    }

    public final boolean equals(DivInputMask divInputMask, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divInputMask == null) {
            return false;
        }
        if (this instanceof FixedLength) {
            DivFixedLengthInputMask value = ((FixedLength) this).getValue();
            DivInputMaskBase value2 = divInputMask.value();
            return value.equals(value2 instanceof DivFixedLengthInputMask ? (DivFixedLengthInputMask) value2 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Currency) {
            DivCurrencyInputMask value3 = ((Currency) this).getValue();
            DivInputMaskBase value4 = divInputMask.value();
            return value3.equals(value4 instanceof DivCurrencyInputMask ? (DivCurrencyInputMask) value4 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof Phone)) {
            throw new NoWhenBranchMatchedException();
        }
        DivPhoneInputMask value5 = ((Phone) this).getValue();
        DivInputMaskBase value6 = divInputMask.value();
        return value5.equals(value6 instanceof DivPhoneInputMask ? (DivPhoneInputMask) value6 : null, expressionResolver, expressionResolver2);
    }

    public final DivInputMaskBase value() {
        if (this instanceof FixedLength) {
            return ((FixedLength) this).getValue();
        }
        if (this instanceof Currency) {
            return ((Currency) this).getValue();
        }
        if (this instanceof Phone) {
            return ((Phone) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivInputMaskJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputMaskJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivInputMask.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivInputMask fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivInputMaskJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputMaskJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
