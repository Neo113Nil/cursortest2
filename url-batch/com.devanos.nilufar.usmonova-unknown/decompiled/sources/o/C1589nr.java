package o;

/* renamed from: o.nr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1589nr {
    public final C2137w8 a;
    public final C0457Rn b;
    public final C0457Rn c;

    public C1589nr(C2137w8 c2137w8, C0457Rn c0457Rn, C0457Rn c0457Rn2) {
        int i = c2137w8.b;
        this.a = c2137w8;
        this.b = c0457Rn;
        this.c = c0457Rn2;
        int i2 = c2137w8.c;
        int i3 = c2137w8.a;
        if (i2 - i3 == 0 && c2137w8.d - i == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (i3 != 0 && i != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1589nr.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC0048Bt.l(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        C1589nr c1589nr = (C1589nr) obj;
        return AbstractC0048Bt.h(this.a, c1589nr.a) && AbstractC0048Bt.h(this.b, c1589nr.b) && AbstractC0048Bt.h(this.c, c1589nr.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return C1589nr.class.getSimpleName() + " { " + this.a + ", type=" + this.b + ", state=" + this.c + " }";
    }
}
