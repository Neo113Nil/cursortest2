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

/* compiled from: DivRadialGradientCenter.kt */
/* loaded from: classes8.dex */
public abstract class DivRadialGradientCenter implements JSONSerializable, Hashable {
    private Integer _hash;
    private Integer _propertiesHash;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivRadialGradientCenter$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivRadialGradientCenter invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivRadialGradientCenter.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public /* synthetic */ DivRadialGradientCenter(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivRadialGradientCenter.kt */
    public static final class Fixed extends DivRadialGradientCenter {
        private final DivRadialGradientFixedCenter value;

        public Fixed(DivRadialGradientFixedCenter divRadialGradientFixedCenter) {
            super(null);
            this.value = divRadialGradientFixedCenter;
        }

        public final DivRadialGradientFixedCenter getValue() {
            return this.value;
        }
    }

    private DivRadialGradientCenter() {
    }

    /* compiled from: DivRadialGradientCenter.kt */
    public static final class Relative extends DivRadialGradientCenter {
        private final DivRadialGradientRelativeCenter value;

        public Relative(DivRadialGradientRelativeCenter divRadialGradientRelativeCenter) {
            super(null);
            this.value = divRadialGradientRelativeCenter;
        }

        public final DivRadialGradientRelativeCenter getValue() {
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
            if (!(this instanceof Relative)) {
                throw new NoWhenBranchMatchedException();
            }
            propertiesHash = ((Relative) this).getValue().propertiesHash();
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
            if (!(this instanceof Relative)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((Relative) this).getValue().hash();
        }
        int i = hashCode + hash;
        this._hash = Integer.valueOf(i);
        return i;
    }

    public final boolean equals(DivRadialGradientCenter divRadialGradientCenter, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divRadialGradientCenter == null) {
            return false;
        }
        if (this instanceof Fixed) {
            DivRadialGradientFixedCenter value = ((Fixed) this).getValue();
            Object value2 = divRadialGradientCenter.value();
            return value.equals(value2 instanceof DivRadialGradientFixedCenter ? (DivRadialGradientFixedCenter) value2 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof Relative)) {
            throw new NoWhenBranchMatchedException();
        }
        DivRadialGradientRelativeCenter value3 = ((Relative) this).getValue();
        Object value4 = divRadialGradientCenter.value();
        return value3.equals(value4 instanceof DivRadialGradientRelativeCenter ? (DivRadialGradientRelativeCenter) value4 : null, expressionResolver, expressionResolver2);
    }

    public final Object value() {
        if (this instanceof Fixed) {
            return ((Fixed) this).getValue();
        }
        if (this instanceof Relative) {
            return ((Relative) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivRadialGradientCenterJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRadialGradientCenterJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivRadialGradientCenter.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivRadialGradientCenter fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivRadialGradientCenterJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRadialGradientCenterJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
