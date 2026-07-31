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

/* compiled from: DivStrokeStyle.kt */
/* loaded from: classes8.dex */
public abstract class DivStrokeStyle implements JSONSerializable, Hashable {
    private Integer _hash;
    private Integer _propertiesHash;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivStrokeStyle$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivStrokeStyle invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivStrokeStyle.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public /* synthetic */ DivStrokeStyle(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivStrokeStyle.kt */
    public static final class Solid extends DivStrokeStyle {
        private final DivStrokeStyleSolid value;

        public Solid(DivStrokeStyleSolid divStrokeStyleSolid) {
            super(null);
            this.value = divStrokeStyleSolid;
        }

        public final DivStrokeStyleSolid getValue() {
            return this.value;
        }
    }

    private DivStrokeStyle() {
    }

    /* compiled from: DivStrokeStyle.kt */
    public static final class Dashed extends DivStrokeStyle {
        private final DivStrokeStyleDashed value;

        public Dashed(DivStrokeStyleDashed divStrokeStyleDashed) {
            super(null);
            this.value = divStrokeStyleDashed;
        }

        public final DivStrokeStyleDashed getValue() {
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
        if (this instanceof Solid) {
            propertiesHash = ((Solid) this).getValue().propertiesHash();
        } else {
            if (!(this instanceof Dashed)) {
                throw new NoWhenBranchMatchedException();
            }
            propertiesHash = ((Dashed) this).getValue().propertiesHash();
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
        if (this instanceof Solid) {
            hash = ((Solid) this).getValue().hash();
        } else {
            if (!(this instanceof Dashed)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((Dashed) this).getValue().hash();
        }
        int i = hashCode + hash;
        this._hash = Integer.valueOf(i);
        return i;
    }

    public final boolean equals(DivStrokeStyle divStrokeStyle, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divStrokeStyle == null) {
            return false;
        }
        if (this instanceof Solid) {
            DivStrokeStyleSolid value = ((Solid) this).getValue();
            Object value2 = divStrokeStyle.value();
            return value.equals(value2 instanceof DivStrokeStyleSolid ? (DivStrokeStyleSolid) value2 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof Dashed)) {
            throw new NoWhenBranchMatchedException();
        }
        DivStrokeStyleDashed value3 = ((Dashed) this).getValue();
        Object value4 = divStrokeStyle.value();
        return value3.equals(value4 instanceof DivStrokeStyleDashed ? (DivStrokeStyleDashed) value4 : null, expressionResolver, expressionResolver2);
    }

    public final Object value() {
        if (this instanceof Solid) {
            return ((Solid) this).getValue();
        }
        if (this instanceof Dashed) {
            return ((Dashed) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivStrokeStyleJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivStrokeStyleJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivStrokeStyle.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivStrokeStyle fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivStrokeStyleJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivStrokeStyleJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
