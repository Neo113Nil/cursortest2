package o;

/* renamed from: o.mV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1501mV {
    public static final long b = AbstractC1494mO.a(0, 0);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public /* synthetic */ C1501mV(long j) {
        this.a = j;
    }

    public static String a(long j) {
        return "TextRange(" + ((int) (j >> 32)) + ", " + ((int) (j & 4294967295L)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1501mV) {
            return this.a == ((C1501mV) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
