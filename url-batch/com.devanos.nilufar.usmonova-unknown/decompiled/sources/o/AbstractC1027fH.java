package o;

/* renamed from: o.fH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1027fH extends AbstractC1314jg implements InterfaceC0961eH {
    public final C2245xo l;
    public final String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1027fH(InterfaceC0761bD interfaceC0761bD, C2245xo c2245xo) {
        super(interfaceC0761bD, C0460Rq.t, c2245xo.g(), IS.e);
        AbstractC0048Bt.n(interfaceC0761bD, "module");
        AbstractC0048Bt.n(c2245xo, "fqName");
        this.l = c2245xo;
        this.m = "package " + c2245xo + " of " + interfaceC0761bD;
    }

    @Override // o.AbstractC1314jg, o.InterfaceC1118gg
    /* renamed from: H0, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0761bD n() {
        InterfaceC1118gg n = super.n();
        AbstractC0048Bt.l(n, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (InterfaceC0761bD) n;
    }

    @Override // o.AbstractC1314jg, o.InterfaceC1249ig
    public IS d() {
        return IS.e;
    }

    @Override // o.InterfaceC1118gg
    public final Object t(InterfaceC1380kg interfaceC1380kg, Object obj) {
        return interfaceC1380kg.J(this, obj);
    }

    @Override // o.AbstractC1184hg
    public String toString() {
        return this.m;
    }
}
