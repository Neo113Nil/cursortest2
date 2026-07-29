package o;

/* loaded from: classes.dex */
public final class KY extends ZM {
    public final Object e;
    public final int f;
    public final HO g;

    public KY(Object obj, int i, HO ho) {
        AbstractC0048Bt.n(obj, "value");
        AbstractC1888sN.p(i, "verificationMode");
        this.e = obj;
        this.f = i;
        this.g = ho;
    }

    @Override // o.ZM
    public final Object c() {
        return this.e;
    }

    @Override // o.ZM
    public final ZM k(String str, InterfaceC2114vp interfaceC2114vp) {
        Object obj = this.e;
        return ((Boolean) interfaceC2114vp.invoke(obj)).booleanValue() ? this : new C0014Al(obj, str, this.g, this.f);
    }
}
