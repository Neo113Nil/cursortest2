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

/* compiled from: DivChangeTransition.kt */
/* loaded from: classes12.dex */
public abstract class DivChangeTransition implements JSONSerializable, Hashable {
    private Integer _hash;
    private Integer _propertiesHash;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivChangeTransition$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivChangeTransition invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivChangeTransition.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public /* synthetic */ DivChangeTransition(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivChangeTransition.kt */
    public static final class Set extends DivChangeTransition {
        private final DivChangeSetTransition value;

        public Set(DivChangeSetTransition divChangeSetTransition) {
            super(null);
            this.value = divChangeSetTransition;
        }

        public final DivChangeSetTransition getValue() {
            return this.value;
        }
    }

    private DivChangeTransition() {
    }

    /* compiled from: DivChangeTransition.kt */
    public static final class Bounds extends DivChangeTransition {
        private final DivChangeBoundsTransition value;

        public Bounds(DivChangeBoundsTransition divChangeBoundsTransition) {
            super(null);
            this.value = divChangeBoundsTransition;
        }

        public final DivChangeBoundsTransition getValue() {
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
        if (this instanceof Set) {
            propertiesHash = ((Set) this).getValue().propertiesHash();
        } else {
            if (!(this instanceof Bounds)) {
                throw new NoWhenBranchMatchedException();
            }
            propertiesHash = ((Bounds) this).getValue().propertiesHash();
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
        if (this instanceof Set) {
            hash = ((Set) this).getValue().hash();
        } else {
            if (!(this instanceof Bounds)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((Bounds) this).getValue().hash();
        }
        int i = hashCode + hash;
        this._hash = Integer.valueOf(i);
        return i;
    }

    public final boolean equals(DivChangeTransition divChangeTransition, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divChangeTransition == null) {
            return false;
        }
        if (this instanceof Set) {
            DivChangeSetTransition value = ((Set) this).getValue();
            Object value2 = divChangeTransition.value();
            return value.equals(value2 instanceof DivChangeSetTransition ? (DivChangeSetTransition) value2 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof Bounds)) {
            throw new NoWhenBranchMatchedException();
        }
        DivChangeBoundsTransition value3 = ((Bounds) this).getValue();
        Object value4 = divChangeTransition.value();
        return value3.equals(value4 instanceof DivChangeBoundsTransition ? (DivChangeBoundsTransition) value4 : null, expressionResolver, expressionResolver2);
    }

    public final Object value() {
        if (this instanceof Set) {
            return ((Set) this).getValue();
        }
        if (this instanceof Bounds) {
            return ((Bounds) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivChangeTransitionJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivChangeTransitionJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivChangeTransition.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivChangeTransition fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivChangeTransitionJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivChangeTransitionJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
