package o;

/* loaded from: classes.dex */
public abstract class TJ extends VJ implements InterfaceC0596Ww {
    @Override // o.AbstractC2336z9
    public InterfaceC0387Ov computeReflected() {
        return UM.a.g(this);
    }

    @Override // o.InterfaceC0596Ww
    public Object getDelegate(Object obj) {
        return ((InterfaceC0596Ww) getReflected()).getDelegate(obj);
    }

    @Override // o.InterfaceC2114vp
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // o.InterfaceC0937dx
    public InterfaceC0570Vw getGetter() {
        return ((InterfaceC0596Ww) getReflected()).getGetter();
    }
}
