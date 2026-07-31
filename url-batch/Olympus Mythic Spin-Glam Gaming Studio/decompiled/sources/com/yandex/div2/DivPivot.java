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

/* compiled from: DivPivot.kt */
/* loaded from: classes8.dex */
public abstract class DivPivot implements JSONSerializable, Hashable {
    private Integer _hash;
    private Integer _propertiesHash;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivPivot$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivPivot invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivPivot.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public /* synthetic */ DivPivot(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivPivot.kt */
    public static final class Fixed extends DivPivot {
        private final DivPivotFixed value;

        public Fixed(DivPivotFixed divPivotFixed) {
            super(null);
            this.value = divPivotFixed;
        }

        public final DivPivotFixed getValue() {
            return this.value;
        }
    }

    private DivPivot() {
    }

    /* compiled from: DivPivot.kt */
    public static final class Percentage extends DivPivot {
        private final DivPivotPercentage value;

        public Percentage(DivPivotPercentage divPivotPercentage) {
            super(null);
            this.value = divPivotPercentage;
        }

        public final DivPivotPercentage getValue() {
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
        if (this instanceof Fixed) {
            propertiesHash = ((Fixed) this).getValue().propertiesHash();
        } else {
            if (!(this instanceof Percentage)) {
                throw new NoWhenBranchMatchedException();
            }
            propertiesHash = ((Percentage) this).getValue().propertiesHash();
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
        if (this instanceof Fixed) {
            hash = ((Fixed) this).getValue().hash();
        } else {
            if (!(this instanceof Percentage)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((Percentage) this).getValue().hash();
        }
        int i = hashCode + hash;
        this._hash = Integer.valueOf(i);
        return i;
    }

    public final boolean equals(DivPivot divPivot, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divPivot == null) {
            return false;
        }
        if (this instanceof Fixed) {
            DivPivotFixed value = ((Fixed) this).getValue();
            Object value2 = divPivot.value();
            return value.equals(value2 instanceof DivPivotFixed ? (DivPivotFixed) value2 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof Percentage)) {
            throw new NoWhenBranchMatchedException();
        }
        DivPivotPercentage value3 = ((Percentage) this).getValue();
        Object value4 = divPivot.value();
        return value3.equals(value4 instanceof DivPivotPercentage ? (DivPivotPercentage) value4 : null, expressionResolver, expressionResolver2);
    }

    public final Object value() {
        if (this instanceof Fixed) {
            return ((Fixed) this).getValue();
        }
        if (this instanceof Percentage) {
            return ((Percentage) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivPivotJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPivotJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivPivot.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivPivot fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivPivotJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPivotJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
