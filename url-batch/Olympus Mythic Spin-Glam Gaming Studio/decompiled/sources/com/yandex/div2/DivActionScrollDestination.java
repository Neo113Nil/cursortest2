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

/* compiled from: DivActionScrollDestination.kt */
/* loaded from: classes11.dex */
public abstract class DivActionScrollDestination implements JSONSerializable, Hashable {
    private Integer _hash;
    private Integer _propertiesHash;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionScrollDestination$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionScrollDestination invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionScrollDestination.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public /* synthetic */ DivActionScrollDestination(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivActionScrollDestination.kt */
    public static final class Offset extends DivActionScrollDestination {
        private final OffsetDestination value;

        public Offset(OffsetDestination offsetDestination) {
            super(null);
            this.value = offsetDestination;
        }

        public final OffsetDestination getValue() {
            return this.value;
        }
    }

    private DivActionScrollDestination() {
    }

    /* compiled from: DivActionScrollDestination.kt */
    public static final class Index extends DivActionScrollDestination {
        private final IndexDestination value;

        public Index(IndexDestination indexDestination) {
            super(null);
            this.value = indexDestination;
        }

        public final IndexDestination getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionScrollDestination.kt */
    public static final class Start extends DivActionScrollDestination {
        private final StartDestination value;

        public Start(StartDestination startDestination) {
            super(null);
            this.value = startDestination;
        }

        public final StartDestination getValue() {
            return this.value;
        }
    }

    /* compiled from: DivActionScrollDestination.kt */
    public static final class End extends DivActionScrollDestination {
        private final EndDestination value;

        public End(EndDestination endDestination) {
            super(null);
            this.value = endDestination;
        }

        public final EndDestination getValue() {
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
        if (this instanceof Offset) {
            propertiesHash = ((Offset) this).getValue().propertiesHash();
        } else if (this instanceof Index) {
            propertiesHash = ((Index) this).getValue().propertiesHash();
        } else if (this instanceof Start) {
            propertiesHash = ((Start) this).getValue().propertiesHash();
        } else {
            if (!(this instanceof End)) {
                throw new NoWhenBranchMatchedException();
            }
            propertiesHash = ((End) this).getValue().propertiesHash();
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
        if (this instanceof Offset) {
            hash = ((Offset) this).getValue().hash();
        } else if (this instanceof Index) {
            hash = ((Index) this).getValue().hash();
        } else if (this instanceof Start) {
            hash = ((Start) this).getValue().hash();
        } else {
            if (!(this instanceof End)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((End) this).getValue().hash();
        }
        int i = hashCode + hash;
        this._hash = Integer.valueOf(i);
        return i;
    }

    public final boolean equals(DivActionScrollDestination divActionScrollDestination, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divActionScrollDestination == null) {
            return false;
        }
        if (this instanceof Offset) {
            OffsetDestination value = ((Offset) this).getValue();
            Object value2 = divActionScrollDestination.value();
            return value.equals(value2 instanceof OffsetDestination ? (OffsetDestination) value2 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Index) {
            IndexDestination value3 = ((Index) this).getValue();
            Object value4 = divActionScrollDestination.value();
            return value3.equals(value4 instanceof IndexDestination ? (IndexDestination) value4 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof Start) {
            StartDestination value5 = ((Start) this).getValue();
            Object value6 = divActionScrollDestination.value();
            return value5.equals(value6 instanceof StartDestination ? (StartDestination) value6 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof End)) {
            throw new NoWhenBranchMatchedException();
        }
        EndDestination value7 = ((End) this).getValue();
        Object value8 = divActionScrollDestination.value();
        return value7.equals(value8 instanceof EndDestination ? (EndDestination) value8 : null, expressionResolver, expressionResolver2);
    }

    public final Object value() {
        if (this instanceof Offset) {
            return ((Offset) this).getValue();
        }
        if (this instanceof Index) {
            return ((Index) this).getValue();
        }
        if (this instanceof Start) {
            return ((Start) this).getValue();
        }
        if (this instanceof End) {
            return ((End) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionScrollDestinationJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionScrollDestinationJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionScrollDestination.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivActionScrollDestination fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivActionScrollDestinationJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionScrollDestinationJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
