package o;

/* renamed from: o.eV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0975eV {
    public static final /* synthetic */ int c = 0;
    public final long a;
    public final long b;

    static {
        AbstractC2219xO.p(0);
        AbstractC2219xO.p(0);
    }

    public C0975eV(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0975eV)) {
            return false;
        }
        C0975eV c0975eV = (C0975eV) obj;
        return C1830rV.a(this.a, c0975eV.a) && C1830rV.a(this.b, c0975eV.b);
    }

    public final int hashCode() {
        C1896sV[] c1896sVArr = C1830rV.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) C1830rV.d(this.a)) + ", restLine=" + ((Object) C1830rV.d(this.b)) + ')';
    }
}
