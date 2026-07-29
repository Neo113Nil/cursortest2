package o;

/* renamed from: o.pr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1721pr {
    public static final C1347k9 d;
    public static final C1347k9 e;
    public static final C1347k9 f;
    public static final C1347k9 g;
    public static final C1347k9 h;
    public static final C1347k9 i;
    public final C1347k9 a;
    public final C1347k9 b;
    public final int c;

    static {
        C1347k9 c1347k9 = C1347k9.k;
        d = C1097gL.d0(":");
        e = C1097gL.d0(":status");
        f = C1097gL.d0(":method");
        g = C1097gL.d0(":path");
        h = C1097gL.d0(":scheme");
        i = C1097gL.d0(":authority");
    }

    public C1721pr(C1347k9 c1347k9, C1347k9 c1347k92) {
        AbstractC0048Bt.n(c1347k9, "name");
        AbstractC0048Bt.n(c1347k92, "value");
        this.a = c1347k9;
        this.b = c1347k92;
        this.c = c1347k92.b() + c1347k9.b() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1721pr)) {
            return false;
        }
        C1721pr c1721pr = (C1721pr) obj;
        return AbstractC0048Bt.h(this.a, c1721pr.a) && AbstractC0048Bt.h(this.b, c1721pr.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.o() + ": " + this.b.o();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1721pr(String str, String str2) {
        this(C1097gL.d0(str), C1097gL.d0(str2));
        AbstractC0048Bt.n(str, "name");
        AbstractC0048Bt.n(str2, "value");
        C1347k9 c1347k9 = C1347k9.k;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1721pr(C1347k9 c1347k9, String str) {
        this(c1347k9, C1097gL.d0(str));
        AbstractC0048Bt.n(c1347k9, "name");
        AbstractC0048Bt.n(str, "value");
        C1347k9 c1347k92 = C1347k9.k;
    }
}
