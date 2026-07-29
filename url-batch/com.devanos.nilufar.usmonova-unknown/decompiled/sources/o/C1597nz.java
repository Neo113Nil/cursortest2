package o;

/* renamed from: o.nz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1597nz extends C0908dT {
    public final InterfaceC2235xe k;

    public C1597nz(InterfaceC0189He interfaceC0189He, InterfaceC2312yp interfaceC2312yp) {
        super(interfaceC0189He, false);
        this.k = AbstractC1473m3.t(this, this, interfaceC2312yp);
    }

    @Override // o.C0283Ku
    public final void T() {
        try {
            AbstractC0022At.I(C0782bY.a, AbstractC1473m3.L(this.k));
        } catch (Throwable th) {
            resumeWith(AbstractC1494mO.d(th));
            throw th;
        }
    }
}
