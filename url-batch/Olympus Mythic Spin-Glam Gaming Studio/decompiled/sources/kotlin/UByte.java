package kotlin;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UByte.kt */
/* loaded from: classes4.dex */
public final class UByte implements Comparable {
    public static final Companion Companion = new Companion(null);
    private final byte data;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UByte m8032boximpl(byte b) {
        return new UByte(b);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static byte m8033constructorimpl(byte b) {
        return b;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8034equalsimpl(byte b, Object obj) {
        return (obj instanceof UByte) && b == ((UByte) obj).m8037unboximpl();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8035hashCodeimpl(byte b) {
        return Byte.hashCode(b);
    }

    public boolean equals(Object obj) {
        return m8034equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m8035hashCodeimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ byte m8037unboximpl() {
        return this.data;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.compare(m8037unboximpl() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, ((UByte) obj).m8037unboximpl() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    private /* synthetic */ UByte(byte b) {
        this.data = b;
    }

    /* compiled from: UByte.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8036toStringimpl(byte b) {
        return String.valueOf(b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public String toString() {
        return m8036toStringimpl(this.data);
    }
}
