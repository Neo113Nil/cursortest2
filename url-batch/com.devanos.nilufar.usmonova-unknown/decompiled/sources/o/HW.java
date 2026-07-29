package o;

/* loaded from: classes.dex */
public final class HW implements InterfaceC2042uj {
    public final int h;
    public final InterfaceC2372zj i;

    public HW(int i, InterfaceC2372zj interfaceC2372zj) {
        this.h = i;
        this.i = interfaceC2372zj;
    }

    @Override // o.U3
    public final YY a(C0208Hx c0208Hx) {
        return new C1143h2(this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof HW)) {
            return false;
        }
        HW hw = (HW) obj;
        return hw.h == this.h && AbstractC0048Bt.h(hw.i, this.i);
    }

    public final int hashCode() {
        return (this.i.hashCode() + (this.h * 31)) * 31;
    }

    @Override // o.InterfaceC2042uj, o.U3
    public final ZY a(C0208Hx c0208Hx) {
        return new C1143h2(this.h, this.i);
    }
}
