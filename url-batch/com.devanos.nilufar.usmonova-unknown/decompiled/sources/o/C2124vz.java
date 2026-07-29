package o;

import java.util.List;

/* renamed from: o.vz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2124vz extends AbstractC1004ey {
    public final OT i;
    public final AbstractC1596ny j;
    public final SA k;

    /* JADX WARN: Multi-variable type inference failed */
    public C2124vz(OT ot, InterfaceC1455lp interfaceC1455lp) {
        AbstractC0048Bt.n(ot, "storageManager");
        this.i = ot;
        this.j = (AbstractC1596ny) interfaceC1455lp;
        this.k = new SA((VA) ot, interfaceC1455lp);
    }

    @Override // o.AbstractC1004ey
    public final OW A0() {
        return F0().A0();
    }

    @Override // o.AbstractC1004ey
    public final SW B0() {
        return F0().B0();
    }

    @Override // o.AbstractC1004ey
    public final boolean C0() {
        return F0().C0();
    }

    @Override // o.AbstractC1004ey
    public final AbstractC1004ey D0(C1398ky c1398ky) {
        AbstractC0048Bt.n(c1398ky, "kotlinTypeRefiner");
        return new C2124vz(this.i, new K2(c1398ky, 17, this));
    }

    @Override // o.AbstractC1004ey
    public final AbstractC2097vY E0() {
        AbstractC1004ey F0 = F0();
        while (F0 instanceof C2124vz) {
            F0 = ((C2124vz) F0).F0();
        }
        AbstractC0048Bt.l(F0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (AbstractC2097vY) F0;
    }

    public final AbstractC1004ey F0() {
        return (AbstractC1004ey) this.k.invoke();
    }

    @Override // o.AbstractC1004ey
    public final WB r0() {
        return F0().r0();
    }

    public final String toString() {
        SA sa = this.k;
        return (sa.j == UA.h || sa.j == UA.i) ? "<Not computed yet>" : F0().toString();
    }

    @Override // o.AbstractC1004ey
    public final List w0() {
        return F0().w0();
    }
}
