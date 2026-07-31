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

/* compiled from: DivTypedValue.kt */
/* loaded from: classes10.dex */
public abstract class DivTypedValue implements JSONSerializable, Hashable {
    private java.lang.Integer _hash;
    private java.lang.Integer _propertiesHash;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivTypedValue$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivTypedValue invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivTypedValue.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public /* synthetic */ DivTypedValue(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivTypedValue.kt */
    public static final class Str extends DivTypedValue {
        private final StrValue value;

        public Str(StrValue strValue) {
            super(null);
            this.value = strValue;
        }

        public final StrValue getValue() {
            return this.value;
        }
    }

    private DivTypedValue() {
    }

    /* compiled from: DivTypedValue.kt */
    public static final class Integer extends DivTypedValue {
        private final IntegerValue value;

        public Integer(IntegerValue integerValue) {
            super(null);
            this.value = integerValue;
        }

        public final IntegerValue getValue() {
            return this.value;
        }
    }

    /* compiled from: DivTypedValue.kt */
    public static final class Number extends DivTypedValue {
        private final NumberValue value;

        public Number(NumberValue numberValue) {
            super(null);
            this.value = numberValue;
        }

        public final NumberValue getValue() {
            return this.value;
        }
    }

    /* compiled from: DivTypedValue.kt */
    public static final class Color extends DivTypedValue {
        private final ColorValue value;

        public Color(ColorValue colorValue) {
            super(null);
            this.value = colorValue;
        }

        public final ColorValue getValue() {
            return this.value;
        }
    }

    /* compiled from: DivTypedValue.kt */
    public static final class Bool extends DivTypedValue {
        private final BoolValue value;

        public Bool(BoolValue boolValue) {
            super(null);
            this.value = boolValue;
        }

        public final BoolValue getValue() {
            return this.value;
        }
    }

    /* compiled from: DivTypedValue.kt */
    public static final class Url extends DivTypedValue {
        private final UrlValue value;

        public Url(UrlValue urlValue) {
            super(null);
            this.value = urlValue;
        }

        public final UrlValue getValue() {
            return this.value;
        }
    }

    /* compiled from: DivTypedValue.kt */
    public static final class Dict extends DivTypedValue {
        private final DictValue value;

        public Dict(DictValue dictValue) {
            super(null);
            this.value = dictValue;
        }

        public final DictValue getValue() {
            return this.value;
        }
    }

    /* compiled from: DivTypedValue.kt */
    public static final class Array extends DivTypedValue {
        private final ArrayValue value;

        public Array(ArrayValue arrayValue) {
            super(null);
            this.value = arrayValue;
        }

        public final ArrayValue getValue() {
            return this.value;
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int propertiesHash() {
        int propertiesHash;
        java.lang.Integer num = this._propertiesHash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(getClass()).hashCode();
        if (this instanceof Str) {
            propertiesHash = ((Str) this).getValue().propertiesHash();
        } else if (this instanceof Integer) {
            propertiesHash = ((Integer) this).getValue().propertiesHash();
        } else if (this instanceof Number) {
            propertiesHash = ((Number) this).getValue().propertiesHash();
        } else if (this instanceof Color) {
            propertiesHash = ((Color) this).getValue().propertiesHash();
        } else if (this instanceof Bool) {
            propertiesHash = ((Bool) this).getValue().propertiesHash();
        } else if (this instanceof Url) {
            propertiesHash = ((Url) this).getValue().propertiesHash();
        } else if (this instanceof Dict) {
            propertiesHash = ((Dict) this).getValue().propertiesHash();
        } else {
            if (!(this instanceof Array)) {
                throw new NoWhenBranchMatchedException();
            }
            propertiesHash = ((Array) this).getValue().propertiesHash();
        }
        int i = hashCode + propertiesHash;
        this._propertiesHash = java.lang.Integer.valueOf(i);
        return i;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int hash;
        java.lang.Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(getClass()).hashCode();
        if (this instanceof Str) {
            hash = ((Str) this).getValue().hash();
        } else if (this instanceof Integer) {
            hash = ((Integer) this).getValue().hash();
        } else if (this instanceof Number) {
            hash = ((Number) this).getValue().hash();
        } else if (this instanceof Color) {
            hash = ((Color) this).getValue().hash();
        } else if (this instanceof Bool) {
            hash = ((Bool) this).getValue().hash();
        } else if (this instanceof Url) {
            hash = ((Url) this).getValue().hash();
        } else if (this instanceof Dict) {
            hash = ((Dict) this).getValue().hash();
        } else {
            if (!(this instanceof Array)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((Array) this).getValue().hash();
        }
        int i = hashCode + hash;
        this._hash = java.lang.Integer.valueOf(i);
        return i;
    }

    public final boolean equals(DivTypedValue divTypedValue, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divTypedValue == null) {
            return false;
        }
        if (this instanceof Str) {
            StrValue value = ((Str) this).getValue();
            Object value2 = divTypedValue.value();
            return value.equals(value2 instanceof StrValue ? (StrValue) value2 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Integer) {
            IntegerValue value3 = ((Integer) this).getValue();
            Object value4 = divTypedValue.value();
            return value3.equals(value4 instanceof IntegerValue ? (IntegerValue) value4 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Number) {
            NumberValue value5 = ((Number) this).getValue();
            Object value6 = divTypedValue.value();
            return value5.equals(value6 instanceof NumberValue ? (NumberValue) value6 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Color) {
            ColorValue value7 = ((Color) this).getValue();
            Object value8 = divTypedValue.value();
            return value7.equals(value8 instanceof ColorValue ? (ColorValue) value8 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Bool) {
            BoolValue value9 = ((Bool) this).getValue();
            Object value10 = divTypedValue.value();
            return value9.equals(value10 instanceof BoolValue ? (BoolValue) value10 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Url) {
            UrlValue value11 = ((Url) this).getValue();
            Object value12 = divTypedValue.value();
            return value11.equals(value12 instanceof UrlValue ? (UrlValue) value12 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Dict) {
            DictValue value13 = ((Dict) this).getValue();
            Object value14 = divTypedValue.value();
            return value13.equals(value14 instanceof DictValue ? (DictValue) value14 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof Array)) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayValue value15 = ((Array) this).getValue();
        Object value16 = divTypedValue.value();
        return value15.equals(value16 instanceof ArrayValue ? (ArrayValue) value16 : null, expressionResolver, expressionResolver2);
    }

    public final Object value() {
        if (this instanceof Str) {
            return ((Str) this).getValue();
        }
        if (this instanceof Integer) {
            return ((Integer) this).getValue();
        }
        if (this instanceof Number) {
            return ((Number) this).getValue();
        }
        if (this instanceof Color) {
            return ((Color) this).getValue();
        }
        if (this instanceof Bool) {
            return ((Bool) this).getValue();
        }
        if (this instanceof Url) {
            return ((Url) this).getValue();
        }
        if (this instanceof Dict) {
            return ((Dict) this).getValue();
        }
        if (this instanceof Array) {
            return ((Array) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivTypedValueJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTypedValueJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivTypedValue.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivTypedValue fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivTypedValueJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTypedValueJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
