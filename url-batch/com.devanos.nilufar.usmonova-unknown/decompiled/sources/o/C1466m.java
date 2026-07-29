package o;

/* renamed from: o.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1466m implements InterfaceC2114vp {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ C1466m(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        switch (this.h) {
            case 0:
                C1532n c1532n = (C1532n) this.i;
                ((C1398ky) obj).getClass();
                return (JR) c1532n.i.i.invoke();
            case 1:
                InterfaceC2204x9 interfaceC2204x9 = (InterfaceC2204x9) obj;
                if (interfaceC2204x9 == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'descriptor' of kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1.invoke must not be null");
                }
                ((C0088Dh) this.i).h.l(interfaceC2204x9);
                return C0782bY.a;
            case 2:
                C0827cE c0827cE = (C0827cE) obj;
                C0826cD k = ((AbstractC0545Ux) this.i).k();
                C2245xo c2245xo = AbstractC1499mT.j;
                C1531mz c1531mz = ((C1465lz) k.S(c2245xo)).n;
                if (c1531mz == null) {
                    AbstractC0545Ux.a(11);
                    throw null;
                }
                InterfaceC2364zb g = c1531mz.g(c0827cE, DE.h);
                if (g == null) {
                    throw new AssertionError("Built-in class " + c2245xo.c(c0827cE) + " is not found");
                }
                if (g instanceof InterfaceC1245ib) {
                    return (InterfaceC1245ib) g;
                }
                throw new AssertionError("Must be a class descriptor " + c0827cE + ", but was " + g);
            default:
                C0849ca c0849ca = (C0849ca) this.i;
                C0782bY c0782bY = C0782bY.a;
                c0849ca.resumeWith(c0782bY);
                return c0782bY;
        }
    }
}
