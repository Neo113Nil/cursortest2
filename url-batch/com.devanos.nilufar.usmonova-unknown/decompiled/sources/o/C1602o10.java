package o;

/* renamed from: o.o10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1602o10 {
    public final C2137w8 a;
    public final C1142h10 b;

    public C1602o10(C2137w8 c2137w8, C1142h10 c1142h10) {
        AbstractC0048Bt.n(c1142h10, "_windowInsetsCompat");
        this.a = c2137w8;
        this.b = c1142h10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1602o10.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC0048Bt.l(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        C1602o10 c1602o10 = (C1602o10) obj;
        return AbstractC0048Bt.h(this.a, c1602o10.a) && AbstractC0048Bt.h(this.b, c1602o10.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.a + ", windowInsetsCompat=" + this.b + ')';
    }
}
