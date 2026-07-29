package o;

/* renamed from: o.Qx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0441Qx {
    public final Float a;
    public InterfaceC2372zj b;

    public C0441Qx(Float f, InterfaceC2372zj interfaceC2372zj) {
        this.a = f;
        this.b = interfaceC2372zj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0441Qx)) {
            return false;
        }
        C0441Qx c0441Qx = (C0441Qx) obj;
        return c0441Qx.a.equals(this.a) && AbstractC0048Bt.h(c0441Qx.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((Integer.hashCode(0) + (this.a.hashCode() * 31)) * 31);
    }
}
