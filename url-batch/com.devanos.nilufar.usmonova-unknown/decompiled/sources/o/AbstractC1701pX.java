package o;

/* renamed from: o.pX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1701pX {
    public abstract int a();

    public abstract AbstractC1004ey b();

    public abstract boolean c();

    public abstract AbstractC1701pX d(C1398ky c1398ky);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1701pX)) {
            return false;
        }
        AbstractC1701pX abstractC1701pX = (AbstractC1701pX) obj;
        return c() == abstractC1701pX.c() && a() == abstractC1701pX.a() && b().equals(abstractC1701pX.b());
    }

    public final int hashCode() {
        int v = AbstractC1888sN.v(a());
        if (AbstractC2228xX.l(b())) {
            return (v * 31) + 19;
        }
        return (v * 31) + (c() ? 17 : b().hashCode());
    }

    public final String toString() {
        if (c()) {
            return "*";
        }
        if (a() == 1) {
            return b().toString();
        }
        return AbstractC2188wx.o(a()) + " " + b();
    }
}
