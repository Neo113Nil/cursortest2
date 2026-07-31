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

/* compiled from: DivAnimator.kt */
/* loaded from: classes14.dex */
public abstract class DivAnimator implements JSONSerializable, Hashable {
    private Integer _hash;
    private Integer _propertiesHash;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivAnimator$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivAnimator invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivAnimator.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public /* synthetic */ DivAnimator(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivAnimator.kt */
    public static final class Color extends DivAnimator {
        private final DivColorAnimator value;

        public Color(DivColorAnimator divColorAnimator) {
            super(null);
            this.value = divColorAnimator;
        }

        public final DivColorAnimator getValue() {
            return this.value;
        }
    }

    private DivAnimator() {
    }

    /* compiled from: DivAnimator.kt */
    public static final class Number extends DivAnimator {
        private final DivNumberAnimator value;

        public Number(DivNumberAnimator divNumberAnimator) {
            super(null);
            this.value = divNumberAnimator;
        }

        public final DivNumberAnimator getValue() {
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
        if (this instanceof Color) {
            propertiesHash = ((Color) this).getValue().propertiesHash();
        } else {
            if (!(this instanceof Number)) {
                throw new NoWhenBranchMatchedException();
            }
            propertiesHash = ((Number) this).getValue().propertiesHash();
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
        if (this instanceof Color) {
            hash = ((Color) this).getValue().hash();
        } else {
            if (!(this instanceof Number)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((Number) this).getValue().hash();
        }
        int i = hashCode + hash;
        this._hash = Integer.valueOf(i);
        return i;
    }

    public final boolean equals(DivAnimator divAnimator, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divAnimator == null) {
            return false;
        }
        if (this instanceof Color) {
            DivColorAnimator value = ((Color) this).getValue();
            DivAnimatorBase value2 = divAnimator.value();
            return value.equals(value2 instanceof DivColorAnimator ? (DivColorAnimator) value2 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof Number)) {
            throw new NoWhenBranchMatchedException();
        }
        DivNumberAnimator value3 = ((Number) this).getValue();
        DivAnimatorBase value4 = divAnimator.value();
        return value3.equals(value4 instanceof DivNumberAnimator ? (DivNumberAnimator) value4 : null, expressionResolver, expressionResolver2);
    }

    public final DivAnimatorBase value() {
        if (this instanceof Color) {
            return ((Color) this).getValue();
        }
        if (this instanceof Number) {
            return ((Number) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivAnimatorJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivAnimatorJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivAnimator.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivAnimator fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivAnimatorJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivAnimatorJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
