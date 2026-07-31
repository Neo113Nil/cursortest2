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

/* compiled from: DivShape.kt */
/* loaded from: classes10.dex */
public abstract class DivShape implements JSONSerializable, Hashable {
    private Integer _hash;
    private Integer _propertiesHash;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivShape$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivShape invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivShape.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public /* synthetic */ DivShape(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivShape.kt */
    public static final class RoundedRectangle extends DivShape {
        private final DivRoundedRectangleShape value;

        public RoundedRectangle(DivRoundedRectangleShape divRoundedRectangleShape) {
            super(null);
            this.value = divRoundedRectangleShape;
        }

        public final DivRoundedRectangleShape getValue() {
            return this.value;
        }
    }

    private DivShape() {
    }

    /* compiled from: DivShape.kt */
    public static final class Circle extends DivShape {
        private final DivCircleShape value;

        public Circle(DivCircleShape divCircleShape) {
            super(null);
            this.value = divCircleShape;
        }

        public final DivCircleShape getValue() {
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
        if (this instanceof RoundedRectangle) {
            propertiesHash = ((RoundedRectangle) this).getValue().propertiesHash();
        } else {
            if (!(this instanceof Circle)) {
                throw new NoWhenBranchMatchedException();
            }
            propertiesHash = ((Circle) this).getValue().propertiesHash();
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
        if (this instanceof RoundedRectangle) {
            hash = ((RoundedRectangle) this).getValue().hash();
        } else {
            if (!(this instanceof Circle)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((Circle) this).getValue().hash();
        }
        int i = hashCode + hash;
        this._hash = Integer.valueOf(i);
        return i;
    }

    public final boolean equals(DivShape divShape, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divShape == null) {
            return false;
        }
        if (this instanceof RoundedRectangle) {
            DivRoundedRectangleShape value = ((RoundedRectangle) this).getValue();
            Object value2 = divShape.value();
            return value.equals(value2 instanceof DivRoundedRectangleShape ? (DivRoundedRectangleShape) value2 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof Circle)) {
            throw new NoWhenBranchMatchedException();
        }
        DivCircleShape value3 = ((Circle) this).getValue();
        Object value4 = divShape.value();
        return value3.equals(value4 instanceof DivCircleShape ? (DivCircleShape) value4 : null, expressionResolver, expressionResolver2);
    }

    public final Object value() {
        if (this instanceof RoundedRectangle) {
            return ((RoundedRectangle) this).getValue();
        }
        if (this instanceof Circle) {
            return ((Circle) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivShapeJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivShapeJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivShape.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivShape fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivShapeJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivShapeJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
