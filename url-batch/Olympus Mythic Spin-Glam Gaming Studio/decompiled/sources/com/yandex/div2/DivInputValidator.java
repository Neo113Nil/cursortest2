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

/* compiled from: DivInputValidator.kt */
/* loaded from: classes10.dex */
public abstract class DivInputValidator implements JSONSerializable, Hashable {
    private Integer _hash;
    private Integer _propertiesHash;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivInputValidator$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivInputValidator invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivInputValidator.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public /* synthetic */ DivInputValidator(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivInputValidator.kt */
    public static final class Regex extends DivInputValidator {
        private final DivInputValidatorRegex value;

        public Regex(DivInputValidatorRegex divInputValidatorRegex) {
            super(null);
            this.value = divInputValidatorRegex;
        }

        public final DivInputValidatorRegex getValue() {
            return this.value;
        }
    }

    private DivInputValidator() {
    }

    /* compiled from: DivInputValidator.kt */
    public static final class Expression extends DivInputValidator {
        private final DivInputValidatorExpression value;

        public Expression(DivInputValidatorExpression divInputValidatorExpression) {
            super(null);
            this.value = divInputValidatorExpression;
        }

        public final DivInputValidatorExpression getValue() {
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

    public final boolean equals(DivInputValidator divInputValidator, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divInputValidator == null) {
            return false;
        }
        if (this instanceof Regex) {
            DivInputValidatorRegex value = ((Regex) this).getValue();
            Object value2 = divInputValidator.value();
            return value.equals(value2 instanceof DivInputValidatorRegex ? (DivInputValidatorRegex) value2 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof Expression)) {
            throw new NoWhenBranchMatchedException();
        }
        DivInputValidatorExpression value3 = ((Expression) this).getValue();
        Object value4 = divInputValidator.value();
        return value3.equals(value4 instanceof DivInputValidatorExpression ? (DivInputValidatorExpression) value4 : null, expressionResolver, expressionResolver2);
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
        return ((DivInputValidatorJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputValidatorJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivInputValidator.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivInputValidator fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivInputValidatorJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputValidatorJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
