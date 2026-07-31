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

/* compiled from: DivCount.kt */
/* loaded from: classes12.dex */
public abstract class DivCount implements JSONSerializable, Hashable {
    private Integer _hash;
    private Integer _propertiesHash;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivCount$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivCount invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivCount.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public /* synthetic */ DivCount(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivCount.kt */
    public static final class Infinity extends DivCount {
        private final DivInfinityCount value;

        public Infinity(DivInfinityCount divInfinityCount) {
            super(null);
            this.value = divInfinityCount;
        }

        public final DivInfinityCount getValue() {
            return this.value;
        }
    }

    private DivCount() {
    }

    /* compiled from: DivCount.kt */
    public static final class Fixed extends DivCount {
        private final DivFixedCount value;

        public Fixed(DivFixedCount divFixedCount) {
            super(null);
            this.value = divFixedCount;
        }

        public final DivFixedCount getValue() {
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
        if (this instanceof Infinity) {
            propertiesHash = ((Infinity) this).getValue().propertiesHash();
        } else {
            if (!(this instanceof Fixed)) {
                throw new NoWhenBranchMatchedException();
            }
            propertiesHash = ((Fixed) this).getValue().propertiesHash();
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
        if (this instanceof Infinity) {
            hash = ((Infinity) this).getValue().hash();
        } else {
            if (!(this instanceof Fixed)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((Fixed) this).getValue().hash();
        }
        int i = hashCode + hash;
        this._hash = Integer.valueOf(i);
        return i;
    }

    public final boolean equals(DivCount divCount, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divCount == null) {
            return false;
        }
        if (this instanceof Infinity) {
            DivInfinityCount value = ((Infinity) this).getValue();
            Object value2 = divCount.value();
            return value.equals(value2 instanceof DivInfinityCount ? (DivInfinityCount) value2 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof Fixed)) {
            throw new NoWhenBranchMatchedException();
        }
        DivFixedCount value3 = ((Fixed) this).getValue();
        Object value4 = divCount.value();
        return value3.equals(value4 instanceof DivFixedCount ? (DivFixedCount) value4 : null, expressionResolver, expressionResolver2);
    }

    public final Object value() {
        if (this instanceof Infinity) {
            return ((Infinity) this).getValue();
        }
        if (this instanceof Fixed) {
            return ((Fixed) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivCountJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivCountJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivCount.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivCount fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivCountJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivCountJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
