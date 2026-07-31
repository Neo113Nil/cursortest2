package kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UShort.kt */
/* loaded from: classes9.dex */
public final class UShort implements Comparable {
    public static final Companion Companion = new Companion(null);
    private final short data;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UShort m8098boximpl(short s) {
        return new UShort(s);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m8099constructorimpl(short s) {
        return s;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8100equalsimpl(short s, Object obj) {
        return (obj instanceof UShort) && s == ((UShort) obj).m8103unboximpl();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8101hashCodeimpl(short s) {
        return Short.hashCode(s);
    }

    public boolean equals(Object obj) {
        return m8100equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m8101hashCodeimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short m8103unboximpl() {
        return this.data;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.compare(m8103unboximpl() & 65535, ((UShort) obj).m8103unboximpl() & 65535);
    }

    private /* synthetic */ UShort(short s) {
        this.data = s;
    }

    /* compiled from: UShort.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8102toStringimpl(short s) {
        return String.valueOf(s & 65535);
    }

    public String toString() {
        return m8102toStringimpl(this.data);
    }
}
