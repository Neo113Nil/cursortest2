package o;

/* renamed from: o.py, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1728py implements InterfaceC0771bN {
    public final InterfaceC2312yp a;
    public final C2103ve b;
    public C0908dT c;

    public C1728py(InterfaceC0189He interfaceC0189He, InterfaceC2312yp interfaceC2312yp) {
        this.a = interfaceC2312yp;
        this.b = AbstractC1052fg.c(interfaceC0189He);
    }

    @Override // o.InterfaceC0771bN
    public final void a() {
        C0908dT c0908dT = this.c;
        if (c0908dT != null) {
            c0908dT.o(PX.a("Old job was still running!", null));
        }
        this.c = AbstractC0868ct.H(this.b, null, null, this.a, 3);
    }

    @Override // o.InterfaceC0771bN
    public final void b() {
        C0908dT c0908dT = this.c;
        if (c0908dT != null) {
            c0908dT.o(new C0600Xa());
        }
        this.c = null;
    }

    @Override // o.InterfaceC0771bN
    public final void c() {
        C0908dT c0908dT = this.c;
        if (c0908dT != null) {
            c0908dT.o(new C0600Xa());
        }
        this.c = null;
    }
}
