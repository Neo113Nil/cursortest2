package o;

/* renamed from: o.gx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1135gx extends AbstractC1003ex implements InterfaceC0414Pw {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0937dx[] f170o;
    public final RM m = TM.u(null, new C1069fx(this, 1));
    public final Object n = EB.C(EnumC1992tz.h, new C1069fx(this, 0));

    static {
        VM vm = UM.a;
        f170o = new InterfaceC0937dx[]{vm.g(new UJ(vm.b(AbstractC1135gx.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;"))};
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC1135gx) && AbstractC0048Bt.h(t(), ((AbstractC1135gx) obj).t());
    }

    @Override // o.InterfaceC0387Ov
    public final String getName() {
        return AbstractC2188wx.h(new StringBuilder("<get-"), t().n, '>');
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
        InterfaceC0937dx interfaceC0937dx = f170o[0];
        Object invoke = this.m.invoke();
        AbstractC0048Bt.m(invoke, "<get-descriptor>(...)");
        return (SJ) invoke;
    }

    @Override // o.AbstractC1003ex
    public final MJ s() {
        InterfaceC0937dx interfaceC0937dx = f170o[0];
        Object invoke = this.m.invoke();
        AbstractC0048Bt.m(invoke, "<get-descriptor>(...)");
        return (SJ) invoke;
    }

    public final String toString() {
        return "getter of " + t();
    }
}
