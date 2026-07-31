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

/* compiled from: DivFilter.kt */
/* loaded from: classes13.dex */
public abstract class DivFilter implements JSONSerializable, Hashable {
    private Integer _hash;
    private Integer _propertiesHash;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivFilter$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivFilter invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivFilter.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public /* synthetic */ DivFilter(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivFilter.kt */
    public static final class Blur extends DivFilter {
        private final DivBlur value;

        public Blur(DivBlur divBlur) {
            super(null);
            this.value = divBlur;
        }

        public final DivBlur getValue() {
            return this.value;
        }
    }

    private DivFilter() {
    }

    /* compiled from: DivFilter.kt */
    public static final class RtlMirror extends DivFilter {
        private final DivFilterRtlMirror value;

        public RtlMirror(DivFilterRtlMirror divFilterRtlMirror) {
            super(null);
            this.value = divFilterRtlMirror;
        }

        public final DivFilterRtlMirror getValue() {
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
        if (this instanceof Blur) {
            propertiesHash = ((Blur) this).getValue().propertiesHash();
        } else {
            if (!(this instanceof RtlMirror)) {
                throw new NoWhenBranchMatchedException();
            }
            propertiesHash = ((RtlMirror) this).getValue().propertiesHash();
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
        if (this instanceof Blur) {
            hash = ((Blur) this).getValue().hash();
        } else {
            if (!(this instanceof RtlMirror)) {
                throw new NoWhenBranchMatchedException();
            }
            hash = ((RtlMirror) this).getValue().hash();
        }
        int i = hashCode + hash;
        this._hash = Integer.valueOf(i);
        return i;
    }

    public final boolean equals(DivFilter divFilter, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divFilter == null) {
            return false;
        }
        if (this instanceof Blur) {
            DivBlur value = ((Blur) this).getValue();
            Object value2 = divFilter.value();
            return value.equals(value2 instanceof DivBlur ? (DivBlur) value2 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof RtlMirror)) {
            throw new NoWhenBranchMatchedException();
        }
        DivFilterRtlMirror value3 = ((RtlMirror) this).getValue();
        Object value4 = divFilter.value();
        return value3.equals(value4 instanceof DivFilterRtlMirror ? (DivFilterRtlMirror) value4 : null, expressionResolver, expressionResolver2);
    }

    public final Object value() {
        if (this instanceof Blur) {
            return ((Blur) this).getValue();
        }
        if (this instanceof RtlMirror) {
            return ((RtlMirror) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivFilterJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFilterJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivFilter.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivFilter fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivFilterJsonParser$EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFilterJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
