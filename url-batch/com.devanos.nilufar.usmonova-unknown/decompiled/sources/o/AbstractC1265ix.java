package o;

/* renamed from: o.ix, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1265ix extends AbstractC1003ex implements InterfaceC1857rw {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0937dx[] f179o;
    public final RM m = TM.u(null, new C1201hx(this, 1));
    public final Object n = EB.C(EnumC1992tz.h, new C1201hx(this, 0));

    static {
        VM vm = UM.a;
        f179o = new InterfaceC0937dx[]{vm.g(new UJ(vm.b(AbstractC1265ix.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;"))};
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC1265ix) && AbstractC0048Bt.h(t(), ((AbstractC1265ix) obj).t());
    }

    @Override // o.InterfaceC0387Ov
    public final String getName() {
        return AbstractC2188wx.h(new StringBuilder("<set-"), t().n, '>');
    }

    public final int hashCode() {
        return t().hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o.Iy] */
    @Override // o.AbstractC0491Sv
    public final G9 m() {
        return (G9) this.n.getValue();
    }

    @Override // o.AbstractC0491Sv
    public final InterfaceC2204x9 p() {
        InterfaceC0937dx interfaceC0937dx = f179o[0];
        Object invoke = this.m.invoke();
        AbstractC0048Bt.m(invoke, "<get-descriptor>(...)");
        return (WJ) invoke;
    }

    @Override // o.AbstractC1003ex
    public final MJ s() {
        InterfaceC0937dx interfaceC0937dx = f179o[0];
        Object invoke = this.m.invoke();
        AbstractC0048Bt.m(invoke, "<get-descriptor>(...)");
        return (WJ) invoke;
    }

    public final String toString() {
        return "setter of " + t();
    }
}
