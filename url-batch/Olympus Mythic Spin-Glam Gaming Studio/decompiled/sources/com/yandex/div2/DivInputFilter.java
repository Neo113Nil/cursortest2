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

/* compiled from: DivInputFilter.kt */
/* loaded from: classes8.dex */
public abstract class DivInputFilter implements JSONSerializable, Hashable {
    private Integer _hash;
    private Integer _propertiesHash;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivInputFilter$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivInputFilter invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivInputFilter.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public /* synthetic */ DivInputFilter(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivInputFilter.kt */
    public static final class Regex extends DivInputFilter {
        private final DivInputFilterRegex value;

        public Regex(DivInputFilterRegex divInputFilterRegex) {
            super(null);
            this.value = divInputFilterRegex;
        }

        public final DivInputFilterRegex getValue() {
            return this.value;
        }
    }

    private DivInputFilter() {
    }

    /* compiled from: DivInputFilter.kt */
    public static final class Expression extends DivInputFilter {
        private final DivInputFilterExpression value;

        public Expression(DivInputFilterExpression divInputFilterExpression) {
            super(null);
            this.value = divInputFilterExpression;
        }

        public final DivInputFilterExpression getValue() {
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
        if (this instanceof Regex) {
            propertiesHash = ((Regex) this).getValue().propertiesHash();
        } else {
            if (!(this instanceof Expression)) {
                throw new NoWhenBranchMatchedException();
            }
            propertiesHash = ((Expression) this).getValue().propertiesHash();
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
        if (this instanceof Regex) {
            hash = ((Regex) this).getValue().hash();
        } else {
            if (!(this instanceof Expression)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((Expression) this).getValue().hash();
        }
        int i = hashCode + hash;
        this._hash = Integer.valueOf(i);
        return i;
    }

    public final boolean equals(DivInputFilter divInputFilter, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divInputFilter == null) {
            return false;
        }
        if (this instanceof Regex) {
            DivInputFilterRegex value = ((Regex) this).getValue();
            Object value2 = divInputFilter.value();
            return value.equals(value2 instanceof DivInputFilterRegex ? (DivInputFilterRegex) value2 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof Expression)) {
            throw new NoWhenBranchMatchedException();
        }
        DivInputFilterExpression value3 = ((Expression) this).getValue();
        Object value4 = divInputFilter.value();
        return value3.equals(value4 instanceof DivInputFilterExpression ? (DivInputFilterExpression) value4 : null, expressionResolver, expressionResolver2);
    }

    public final Object value() {
        if (this instanceof Regex) {
            return ((Regex) this).getValue();
        }
        if (this instanceof Expression) {
            return ((Expression) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivInputFilterJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputFilterJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivInputFilter.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivInputFilter fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivInputFilterJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputFilterJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
