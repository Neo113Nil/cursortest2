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

/* compiled from: DivRadialGradientRadius.kt */
/* loaded from: classes9.dex */
public abstract class DivRadialGradientRadius implements JSONSerializable, Hashable {
    private Integer _hash;
    private Integer _propertiesHash;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivRadialGradientRadius$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivRadialGradientRadius invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivRadialGradientRadius.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public /* synthetic */ DivRadialGradientRadius(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivRadialGradientRadius.kt */
    public static final class FixedSize extends DivRadialGradientRadius {
        private final DivFixedSize value;

        public FixedSize(DivFixedSize divFixedSize) {
            super(null);
            this.value = divFixedSize;
        }

        public final DivFixedSize getValue() {
            return this.value;
        }
    }

    private DivRadialGradientRadius() {
    }

    /* compiled from: DivRadialGradientRadius.kt */
    public static final class Relative extends DivRadialGradientRadius {
        private final DivRadialGradientRelativeRadius value;

        public Relative(DivRadialGradientRelativeRadius divRadialGradientRelativeRadius) {
            super(null);
            this.value = divRadialGradientRelativeRadius;
        }

        public final DivRadialGradientRelativeRadius getValue() {
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
        if (this instanceof FixedSize) {
            propertiesHash = ((FixedSize) this).getValue().propertiesHash();
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
        if (this instanceof FixedSize) {
            hash = ((FixedSize) this).getValue().hash();
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

    public final boolean equals(DivRadialGradientRadius divRadialGradientRadius, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divRadialGradientRadius == null) {
            return false;
        }
        if (this instanceof FixedSize) {
            DivFixedSize value = ((FixedSize) this).getValue();
            Object value2 = divRadialGradientRadius.value();
            return value.equals(value2 instanceof DivFixedSize ? (DivFixedSize) value2 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof Relative)) {
            throw new NoWhenBranchMatchedException();
        }
        DivRadialGradientRelativeRadius value3 = ((Relative) this).getValue();
        Object value4 = divRadialGradientRadius.value();
        return value3.equals(value4 instanceof DivRadialGradientRelativeRadius ? (DivRadialGradientRelativeRadius) value4 : null, expressionResolver, expressionResolver2);
    }

    public final Object value() {
        if (this instanceof FixedSize) {
            return ((FixedSize) this).getValue();
        }
        if (this instanceof Relative) {
            return ((Relative) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivRadialGradientRadiusJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRadialGradientRadiusJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivRadialGradientRadius.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivRadialGradientRadius fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivRadialGradientRadiusJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivRadialGradientRadiusJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
