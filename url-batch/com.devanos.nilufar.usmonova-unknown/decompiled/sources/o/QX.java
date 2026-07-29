package o;

/* loaded from: classes.dex */
public final class QX {
    public final C1699pV a;
    public final C1699pV b;
    public final C1699pV c;
    public final C1699pV d;
    public final C1699pV e;
    public final C1699pV f;
    public final C1699pV g;
    public final C1699pV h;
    public final C1699pV i;
    public final C1699pV j;
    public final C1699pV k;
    public final C1699pV l;
    public final C1699pV m;
    public final C1699pV n;

    /* renamed from: o, reason: collision with root package name */
    public final C1699pV f90o;

    public QX() {
        C1699pV c1699pV = SX.d;
        C1699pV c1699pV2 = SX.e;
        C1699pV c1699pV3 = SX.f;
        C1699pV c1699pV4 = SX.g;
        C1699pV c1699pV5 = SX.h;
        C1699pV c1699pV6 = SX.i;
        C1699pV c1699pV7 = SX.m;
        C1699pV c1699pV8 = SX.n;
        C1699pV c1699pV9 = SX.f107o;
        C1699pV c1699pV10 = SX.a;
        C1699pV c1699pV11 = SX.b;
        C1699pV c1699pV12 = SX.c;
        C1699pV c1699pV13 = SX.j;
        C1699pV c1699pV14 = SX.k;
        C1699pV c1699pV15 = SX.l;
        this.a = c1699pV;
        this.b = c1699pV2;
        this.c = c1699pV3;
        this.d = c1699pV4;
        this.e = c1699pV5;
        this.f = c1699pV6;
        this.g = c1699pV7;
        this.h = c1699pV8;
        this.i = c1699pV9;
        this.j = c1699pV10;
        this.k = c1699pV11;
        this.l = c1699pV12;
        this.m = c1699pV13;
        this.n = c1699pV14;
        this.f90o = c1699pV15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QX)) {
            return false;
        }
        QX qx = (QX) obj;
        return AbstractC0048Bt.h(this.a, qx.a) && AbstractC0048Bt.h(this.b, qx.b) && AbstractC0048Bt.h(this.c, qx.c) && AbstractC0048Bt.h(this.d, qx.d) && AbstractC0048Bt.h(this.e, qx.e) && AbstractC0048Bt.h(this.f, qx.f) && AbstractC0048Bt.h(this.g, qx.g) && AbstractC0048Bt.h(this.h, qx.h) && AbstractC0048Bt.h(this.i, qx.i) && AbstractC0048Bt.h(this.j, qx.j) && AbstractC0048Bt.h(this.k, qx.k) && AbstractC0048Bt.h(this.l, qx.l) && AbstractC0048Bt.h(this.m, qx.m) && AbstractC0048Bt.h(this.n, qx.n) && AbstractC0048Bt.h(this.f90o, qx.f90o);
    }

    public final int hashCode() {
        return this.f90o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Typography(displayLarge=" + this.a + ", displayMedium=" + this.b + ",displaySmall=" + this.c + ", headlineLarge=" + this.d + ", headlineMedium=" + this.e + ", headlineSmall=" + this.f + ", titleLarge=" + this.g + ", titleMedium=" + this.h + ", titleSmall=" + this.i + ", bodyLarge=" + this.j + ", bodyMedium=" + this.k + ", bodySmall=" + this.l + ", labelLarge=" + this.m + ", labelMedium=" + this.n + ", labelSmall=" + this.f90o + ')';
    }
}
