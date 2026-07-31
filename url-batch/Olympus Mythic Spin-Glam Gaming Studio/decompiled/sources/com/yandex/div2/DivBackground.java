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

/* compiled from: DivBackground.kt */
/* loaded from: classes9.dex */
public abstract class DivBackground implements JSONSerializable, Hashable {
    private Integer _hash;
    private Integer _propertiesHash;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivBackground$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivBackground invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivBackground.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public /* synthetic */ DivBackground(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivBackground.kt */
    public static final class LinearGradient extends DivBackground {
        private final DivLinearGradient value;

        public LinearGradient(DivLinearGradient divLinearGradient) {
            super(null);
            this.value = divLinearGradient;
        }

        public final DivLinearGradient getValue() {
            return this.value;
        }
    }

    private DivBackground() {
    }

    /* compiled from: DivBackground.kt */
    public static final class RadialGradient extends DivBackground {
        private final DivRadialGradient value;

        public RadialGradient(DivRadialGradient divRadialGradient) {
            super(null);
            this.value = divRadialGradient;
        }

        public final DivRadialGradient getValue() {
            return this.value;
        }
    }

    /* compiled from: DivBackground.kt */
    public static final class Image extends DivBackground {
        private final DivImageBackground value;

        public Image(DivImageBackground divImageBackground) {
            super(null);
            this.value = divImageBackground;
        }

        public final DivImageBackground getValue() {
            return this.value;
        }
    }

    /* compiled from: DivBackground.kt */
    public static final class Solid extends DivBackground {
        private final DivSolidBackground value;

        public Solid(DivSolidBackground divSolidBackground) {
            super(null);
            this.value = divSolidBackground;
        }

        public final DivSolidBackground getValue() {
            return this.value;
        }
    }

    /* compiled from: DivBackground.kt */
    public static final class NinePatch extends DivBackground {
        private final DivNinePatchBackground value;

        public NinePatch(DivNinePatchBackground divNinePatchBackground) {
            super(null);
            this.value = divNinePatchBackground;
        }

        public final DivNinePatchBackground getValue() {
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
        if (this instanceof LinearGradient) {
            propertiesHash = ((LinearGradient) this).getValue().propertiesHash();
        } else if (this instanceof RadialGradient) {
            propertiesHash = ((RadialGradient) this).getValue().propertiesHash();
        } else if (this instanceof Image) {
            propertiesHash = ((Image) this).getValue().propertiesHash();
        } else if (this instanceof Solid) {
            propertiesHash = ((Solid) this).getValue().propertiesHash();
        } else {
            if (!(this instanceof NinePatch)) {
                throw new NoWhenBranchMatchedException();
            }
            propertiesHash = ((NinePatch) this).getValue().propertiesHash();
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
        if (this instanceof LinearGradient) {
            hash = ((LinearGradient) this).getValue().hash();
        } else if (this instanceof RadialGradient) {
            hash = ((RadialGradient) this).getValue().hash();
        } else if (this instanceof Image) {
            hash = ((Image) this).getValue().hash();
        } else if (this instanceof Solid) {
            hash = ((Solid) this).getValue().hash();
        } else {
            if (!(this instanceof NinePatch)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((NinePatch) this).getValue().hash();
        }
        int i = hashCode + hash;
        this._hash = Integer.valueOf(i);
        return i;
    }

    public final boolean equals(DivBackground divBackground, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divBackground == null) {
            return false;
        }
        if (this instanceof LinearGradient) {
            DivLinearGradient value = ((LinearGradient) this).getValue();
            Object value2 = divBackground.value();
            return value.equals(value2 instanceof DivLinearGradient ? (DivLinearGradient) value2 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof RadialGradient) {
            DivRadialGradient value3 = ((RadialGradient) this).getValue();
            Object value4 = divBackground.value();
            return value3.equals(value4 instanceof DivRadialGradient ? (DivRadialGradient) value4 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Image) {
            DivImageBackground value5 = ((Image) this).getValue();
            Object value6 = divBackground.value();
            return value5.equals(value6 instanceof DivImageBackground ? (DivImageBackground) value6 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Solid) {
            DivSolidBackground value7 = ((Solid) this).getValue();
            Object value8 = divBackground.value();
            return value7.equals(value8 instanceof DivSolidBackground ? (DivSolidBackground) value8 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof NinePatch)) {
            throw new NoWhenBranchMatchedException();
        }
        DivNinePatchBackground value9 = ((NinePatch) this).getValue();
        Object value10 = divBackground.value();
        return value9.equals(value10 instanceof DivNinePatchBackground ? (DivNinePatchBackground) value10 : null, expressionResolver, expressionResolver2);
    }

    public final Object value() {
        if (this instanceof LinearGradient) {
            return ((LinearGradient) this).getValue();
        }
        if (this instanceof RadialGradient) {
            return ((RadialGradient) this).getValue();
        }
        if (this instanceof Image) {
            return ((Image) this).getValue();
        }
        if (this instanceof Solid) {
            return ((Solid) this).getValue();
        }
        if (this instanceof NinePatch) {
            return ((NinePatch) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivBackgroundJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivBackgroundJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivBackground.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivBackground fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivBackgroundJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivBackgroundJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
