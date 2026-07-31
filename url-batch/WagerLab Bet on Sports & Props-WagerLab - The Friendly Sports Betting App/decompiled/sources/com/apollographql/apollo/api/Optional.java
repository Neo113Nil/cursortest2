package com.apollographql.apollo.api;

import androidx.exifinterface.media.ExifInterface;
import com.apollographql.apollo.exception.MissingValueException;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Optional.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \n*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0006J\u000b\u0010\u0007\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcom/apollographql/apollo/api/Optional;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "<init>", "()V", "getOrNull", "()Ljava/lang/Object;", "getOrThrow", "Present", "Absent", "Companion", "Lcom/apollographql/apollo/api/Optional$Absent;", "Lcom/apollographql/apollo/api/Optional$Present;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class Optional<V> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ Optional(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final Absent absent() {
        return INSTANCE.absent();
    }

    @JvmStatic
    public static final <V> Present<V> present(V v) {
        return INSTANCE.present(v);
    }

    @JvmStatic
    public static final <V> Optional<V> presentIfNotNull(V v) {
        return INSTANCE.presentIfNotNull(v);
    }

    private Optional() {
    }

    public final V getOrNull() {
        Present present = this instanceof Present ? (Present) this : null;
        if (present != null) {
            return (V) present.getValue();
        }
        return null;
    }

    public final V getOrThrow() {
        if (this instanceof Present) {
            return (V) ((Present) this).getValue();
        }
        throw new MissingValueException();
    }

    /* compiled from: Optional.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/apollographql/apollo/api/Optional$Present;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lcom/apollographql/apollo/api/Optional;", "value", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Optional$Present;", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Present<V> extends Optional<V> {
        private final V value;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Present copy$default(Present present, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = present.value;
            }
            return present.copy(obj);
        }

        public final V component1() {
            return this.value;
        }

        public final Present<V> copy(V value) {
            return new Present<>(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Present) && Intrinsics.areEqual(this.value, ((Present) other).value);
        }

        public int hashCode() {
            V v = this.value;
            if (v == null) {
                return 0;
            }
            return v.hashCode();
        }

        public String toString() {
            return "Present(value=" + this.value + ')';
        }

        public Present(V v) {
            super(null);
            this.value = v;
        }

        public final V getValue() {
            return this.value;
        }
    }

    /* compiled from: Optional.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/apollographql/apollo/api/Optional$Absent;", "Lcom/apollographql/apollo/api/Optional;", "", "<init>", "()V", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Absent extends Optional {
        public static final Absent INSTANCE = new Absent();

        private Absent() {
            super(null);
        }
    }

    /* compiled from: Optional.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0001\u0010\b2\u0006\u0010\t\u001a\u0002H\bH\u0007¢\u0006\u0002\u0010\nJ'\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0\f\"\b\b\u0001\u0010\b*\u00020\u00012\b\u0010\t\u001a\u0004\u0018\u0001H\bH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/apollographql/apollo/api/Optional$Companion;", "", "<init>", "()V", "absent", "Lcom/apollographql/apollo/api/Optional$Absent;", "present", "Lcom/apollographql/apollo/api/Optional$Present;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "value", "(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Optional$Present;", "presentIfNotNull", "Lcom/apollographql/apollo/api/Optional;", "(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Optional;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Absent absent() {
            return Absent.INSTANCE;
        }

        @JvmStatic
        public final <V> Present<V> present(V value) {
            return new Present<>(value);
        }

        @JvmStatic
        public final <V> Optional<V> presentIfNotNull(V value) {
            return value == null ? Absent.INSTANCE : new Present(value);
        }
    }
}
