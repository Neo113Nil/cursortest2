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

/* compiled from: DivVariable.kt */
/* loaded from: classes9.dex */
public abstract class DivVariable implements JSONSerializable, Hashable {
    private java.lang.Integer _hash;
    private java.lang.Integer _propertiesHash;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivVariable$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivVariable invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivVariable.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public /* synthetic */ DivVariable(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivVariable.kt */
    public static final class Str extends DivVariable {
        private final StrVariable value;

        public Str(StrVariable strVariable) {
            super(null);
            this.value = strVariable;
        }

        public final StrVariable getValue() {
            return this.value;
        }
    }

    private DivVariable() {
    }

    /* compiled from: DivVariable.kt */
    public static final class Number extends DivVariable {
        private final NumberVariable value;

        public Number(NumberVariable numberVariable) {
            super(null);
            this.value = numberVariable;
        }

        public final NumberVariable getValue() {
            return this.value;
        }
    }

    /* compiled from: DivVariable.kt */
    public static final class Integer extends DivVariable {
        private final IntegerVariable value;

        public Integer(IntegerVariable integerVariable) {
            super(null);
            this.value = integerVariable;
        }

        public final IntegerVariable getValue() {
            return this.value;
        }
    }

    /* compiled from: DivVariable.kt */
    public static final class Bool extends DivVariable {
        private final BoolVariable value;

        public Bool(BoolVariable boolVariable) {
            super(null);
            this.value = boolVariable;
        }

        public final BoolVariable getValue() {
            return this.value;
        }
    }

    /* compiled from: DivVariable.kt */
    public static final class Color extends DivVariable {
        private final ColorVariable value;

        public Color(ColorVariable colorVariable) {
            super(null);
            this.value = colorVariable;
        }

        public final ColorVariable getValue() {
            return this.value;
        }
    }

    /* compiled from: DivVariable.kt */
    public static final class Url extends DivVariable {
        private final UrlVariable value;

        public Url(UrlVariable urlVariable) {
            super(null);
            this.value = urlVariable;
        }

        public final UrlVariable getValue() {
            return this.value;
        }
    }

    /* compiled from: DivVariable.kt */
    public static final class Dict extends DivVariable {
        private final DictVariable value;

        public Dict(DictVariable dictVariable) {
            super(null);
            this.value = dictVariable;
        }

        public final DictVariable getValue() {
            return this.value;
        }
    }

    /* compiled from: DivVariable.kt */
    public static final class Array extends DivVariable {
        private final ArrayVariable value;

        public Array(ArrayVariable arrayVariable) {
            super(null);
            this.value = arrayVariable;
        }

        public final ArrayVariable getValue() {
            return this.value;
        }
    }

    /* compiled from: DivVariable.kt */
    public static final class Property extends DivVariable {
        private final PropertyVariable value;

        public Property(PropertyVariable propertyVariable) {
            super(null);
            this.value = propertyVariable;
        }

        public final PropertyVariable getValue() {
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
        } else if (this instanceof Number) {
            propertiesHash = ((Number) this).getValue().propertiesHash();
        } else if (this instanceof Integer) {
            propertiesHash = ((Integer) this).getValue().propertiesHash();
        } else if (this instanceof Bool) {
            propertiesHash = ((Bool) this).getValue().propertiesHash();
        } else if (this instanceof Color) {
            propertiesHash = ((Color) this).getValue().propertiesHash();
        } else if (this instanceof Url) {
            propertiesHash = ((Url) this).getValue().propertiesHash();
        } else if (this instanceof Dict) {
            propertiesHash = ((Dict) this).getValue().propertiesHash();
        } else if (this instanceof Array) {
            propertiesHash = ((Array) this).getValue().propertiesHash();
        } else {
            if (!(this instanceof Property)) {
                throw new NoWhenBranchMatchedException();
            }
            propertiesHash = ((Property) this).getValue().propertiesHash();
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
        } else if (this instanceof Number) {
            hash = ((Number) this).getValue().hash();
        } else if (this instanceof Integer) {
            hash = ((Integer) this).getValue().hash();
        } else if (this instanceof Bool) {
            hash = ((Bool) this).getValue().hash();
        } else if (this instanceof Color) {
            hash = ((Color) this).getValue().hash();
        } else if (this instanceof Url) {
            hash = ((Url) this).getValue().hash();
        } else if (this instanceof Dict) {
            hash = ((Dict) this).getValue().hash();
        } else if (this instanceof Array) {
            hash = ((Array) this).getValue().hash();
        } else {
            if (!(this instanceof Property)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((Property) this).getValue().hash();
        }
        int i = hashCode + hash;
        this._hash = java.lang.Integer.valueOf(i);
        return i;
    }

    public final boolean equals(DivVariable divVariable, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divVariable == null) {
            return false;
        }
        if (this instanceof Str) {
            StrVariable value = ((Str) this).getValue();
            Object value2 = divVariable.value();
            return value.equals(value2 instanceof StrVariable ? (StrVariable) value2 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Number) {
            NumberVariable value3 = ((Number) this).getValue();
            Object value4 = divVariable.value();
            return value3.equals(value4 instanceof NumberVariable ? (NumberVariable) value4 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Integer) {
            IntegerVariable value5 = ((Integer) this).getValue();
            Object value6 = divVariable.value();
            return value5.equals(value6 instanceof IntegerVariable ? (IntegerVariable) value6 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Bool) {
            BoolVariable value7 = ((Bool) this).getValue();
            Object value8 = divVariable.value();
            return value7.equals(value8 instanceof BoolVariable ? (BoolVariable) value8 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Color) {
            ColorVariable value9 = ((Color) this).getValue();
            Object value10 = divVariable.value();
            return value9.equals(value10 instanceof ColorVariable ? (ColorVariable) value10 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Url) {
            UrlVariable value11 = ((Url) this).getValue();
            Object value12 = divVariable.value();
            return value11.equals(value12 instanceof UrlVariable ? (UrlVariable) value12 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Dict) {
            DictVariable value13 = ((Dict) this).getValue();
            Object value14 = divVariable.value();
            return value13.equals(value14 instanceof DictVariable ? (DictVariable) value14 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Array) {
            ArrayVariable value15 = ((Array) this).getValue();
            Object value16 = divVariable.value();
            return value15.equals(value16 instanceof ArrayVariable ? (ArrayVariable) value16 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof Property)) {
            throw new NoWhenBranchMatchedException();
        }
        PropertyVariable value17 = ((Property) this).getValue();
        Object value18 = divVariable.value();
        return value17.equals(value18 instanceof PropertyVariable ? (PropertyVariable) value18 : null, expressionResolver, expressionResolver2);
    }

    public final Object value() {
        if (this instanceof Str) {
            return ((Str) this).getValue();
        }
        if (this instanceof Number) {
            return ((Number) this).getValue();
        }
        if (this instanceof Integer) {
            return ((Integer) this).getValue();
        }
        if (this instanceof Bool) {
            return ((Bool) this).getValue();
        }
        if (this instanceof Color) {
            return ((Color) this).getValue();
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
        if (this instanceof Property) {
            return ((Property) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivVariableJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivVariableJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivVariable.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivVariable fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivVariableJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivVariableJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }

        public final Function2 getCREATOR() {
            return DivVariable.CREATOR;
        }
    }
}
