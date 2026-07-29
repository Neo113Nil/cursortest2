package o;

/* renamed from: o.aE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0696aE implements InterfaceC0718aa, C00 {
    public final C0849ca h;
    public final /* synthetic */ C0762bE i;

    public C0696aE(C0762bE c0762bE, C0849ca c0849ca) {
        this.i = c0762bE;
        this.h = c0849ca;
    }

    @Override // o.C00
    public final void a(AbstractC1760qQ abstractC1760qQ, int i) {
        this.h.a(abstractC1760qQ, i);
    }

    @Override // o.InterfaceC0718aa
    public final C0457Rn g(Object obj, InterfaceC2378zp interfaceC2378zp) {
        C0762bE c0762bE = this.i;
        C0784ba c0784ba = new C0784ba(c0762bE, this);
        C0457Rn g = this.h.g((C0782bY) obj, c0784ba);
        if (g != null) {
            C0762bE.g.set(c0762bE, null);
        }
        return g;
    }

    @Override // o.InterfaceC2235xe
    public final InterfaceC0189He getContext() {
        return this.h.l;
    }

    @Override // o.InterfaceC0718aa
    public final void h(Object obj) {
        this.h.h(obj);
    }

    @Override // o.InterfaceC2235xe
    public final void resumeWith(Object obj) {
        this.h.resumeWith(obj);
    }
}
