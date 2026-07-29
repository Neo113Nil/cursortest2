package o;

/* renamed from: o.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2059v implements InterfaceC0137Fe {
    public final InterfaceC0163Ge h;

    public AbstractC2059v(InterfaceC0163Ge interfaceC0163Ge) {
        this.h = interfaceC0163Ge;
    }

    @Override // o.InterfaceC0189He
    public final /* bridge */ InterfaceC0189He D(InterfaceC0189He interfaceC0189He) {
        return PX.E0(this, interfaceC0189He);
    }

    @Override // o.InterfaceC0189He
    public final Object I(Object obj, InterfaceC2312yp interfaceC2312yp) {
        return interfaceC2312yp.invoke(obj, this);
    }

    @Override // o.InterfaceC0137Fe
    public final InterfaceC0163Ge getKey() {
        return this.h;
    }

    @Override // o.InterfaceC0189He
    public /* bridge */ InterfaceC0189He j(InterfaceC0163Ge interfaceC0163Ge) {
        return PX.z0(this, interfaceC0163Ge);
    }

    @Override // o.InterfaceC0189He
    public /* bridge */ InterfaceC0137Fe k(InterfaceC0163Ge interfaceC0163Ge) {
        return PX.J(this, interfaceC0163Ge);
    }
}
