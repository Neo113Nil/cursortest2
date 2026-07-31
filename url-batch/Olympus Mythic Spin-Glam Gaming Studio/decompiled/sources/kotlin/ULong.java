package kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ULong.kt */
/* loaded from: classes8.dex */
public final class ULong implements Comparable {
    public static final Companion Companion = new Companion(null);
    private final long data;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ULong m8076boximpl(long j) {
        return new ULong(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m8077constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8078equalsimpl(long j, Object obj) {
        return (obj instanceof ULong) && j == ((ULong) obj).m8081unboximpl();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8079hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public boolean equals(Object obj) {
        return m8078equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m8079hashCodeimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m8081unboximpl() {
        return this.data;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return UnsignedKt.ulongCompare(m8081unboximpl(), ((ULong) obj).m8081unboximpl());
    }

    private /* synthetic */ ULong(long j) {
        this.data = j;
    }

    /* compiled from: ULong.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8080toStringimpl(long j) {
        return UnsignedKt.ulongToString(j, 10);
    }

    public String toString() {
        return m8080toStringimpl(this.data);
    }
}
