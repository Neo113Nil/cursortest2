package kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: UInt.kt */
/* loaded from: classes14.dex */
public final class UInt implements Comparable {
    public static final Companion Companion = new Companion(null);
    private final int data;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UInt m8054boximpl(int i) {
        return new UInt(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m8055constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8056equalsimpl(int i, Object obj) {
        return (obj instanceof UInt) && i == ((UInt) obj).m8059unboximpl();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8057hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m8056equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m8057hashCodeimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m8059unboximpl() {
        return this.data;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return UnsignedKt.uintCompare(m8059unboximpl(), ((UInt) obj).m8059unboximpl());
    }

    private /* synthetic */ UInt(int i) {
        this.data = i;
    }

    /* compiled from: UInt.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8058toStringimpl(int i) {
        return String.valueOf(i & 4294967295L);
    }

    public String toString() {
        return m8058toStringimpl(this.data);
    }
}
