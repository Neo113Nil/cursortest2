package o;

/* renamed from: o.Hz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0210Hz implements InterfaceC0288Kz, InterfaceC0422Qe {
    public final AbstractC0106Dz h;
    public final InterfaceC0189He i;

    public C0210Hz(AbstractC0106Dz abstractC0106Dz, InterfaceC0189He interfaceC0189He) {
        AbstractC0048Bt.n(interfaceC0189He, "coroutineContext");
        this.h = abstractC0106Dz;
        this.i = interfaceC0189He;
        if (((C0417Pz) abstractC0106Dz).d == EnumC0080Cz.h) {
            PX.s(interfaceC0189He, null);
        }
    }

    @Override // o.InterfaceC0288Kz
    public final void j(InterfaceC0365Nz interfaceC0365Nz, EnumC0054Bz enumC0054Bz) {
        AbstractC0106Dz abstractC0106Dz = this.h;
        if (((C0417Pz) abstractC0106Dz).d.compareTo(EnumC0080Cz.h) <= 0) {
            abstractC0106Dz.b(this);
            PX.s(this.i, null);
        }
    }

    @Override // o.InterfaceC0422Qe
    public final InterfaceC0189He m() {
        return this.i;
    }
}
