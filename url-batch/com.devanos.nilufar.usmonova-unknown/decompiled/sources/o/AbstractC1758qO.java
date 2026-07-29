package o;

/* renamed from: o.qO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1758qO implements InterfaceC0496Ta {
    public final AbstractC1596ny a;
    public final String b;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC1758qO(String str, InterfaceC2114vp interfaceC2114vp) {
        this.a = (AbstractC1596ny) interfaceC2114vp;
        this.b = "must return ".concat(str);
    }

    @Override // o.InterfaceC0496Ta
    public final String b() {
        return this.b;
    }

    @Override // o.InterfaceC0496Ta
    public final String c(C0934du c0934du) {
        return AbstractC0022At.w(this, c0934du);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [o.ny, o.vp] */
    @Override // o.InterfaceC0496Ta
    public final boolean d(C0934du c0934du) {
        return AbstractC0048Bt.h(c0934du.n, this.a.invoke(AbstractC0192Hh.e(c0934du)));
    }
}
