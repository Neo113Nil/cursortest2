package o;

import java.util.List;

/* renamed from: o.Lt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0307Lt implements InterfaceC0496Ta {
    public static final C0307Lt b = new C0307Lt(0);
    public static final C0307Lt c = new C0307Lt(1);
    public final /* synthetic */ int a;

    public /* synthetic */ C0307Lt(int i) {
        this.a = i;
    }

    @Override // o.InterfaceC0496Ta
    public final String b() {
        switch (this.a) {
            case 0:
                return "second parameter must be of type KProperty<*> or its supertype";
            default:
                return "should not have varargs or parameters with default values";
        }
    }

    @Override // o.InterfaceC0496Ta
    public final String c(C0934du c0934du) {
        switch (this.a) {
        }
        return AbstractC0022At.w(this, c0934du);
    }

    @Override // o.InterfaceC0496Ta
    public final boolean d(C0934du c0934du) {
        JR q;
        switch (this.a) {
            case 0:
                RY ry = (RY) c0934du.t0().get(1);
                C0218Ih c0218Ih = YM.d;
                AbstractC0048Bt.m(ry, "secondParameter");
                InterfaceC0761bD j = AbstractC0192Hh.j(ry);
                c0218Ih.getClass();
                InterfaceC1245ib o2 = AbstractC1052fg.o(j, AbstractC1433lT.Q);
                if (o2 == null) {
                    q = null;
                } else {
                    OW.i.getClass();
                    OW ow = OW.j;
                    List parameters = o2.z().getParameters();
                    AbstractC0048Bt.m(parameters, "kPropertyClass.typeConstructor.parameters");
                    Object D0 = AbstractC0720ac.D0(parameters);
                    AbstractC0048Bt.m(D0, "kPropertyClass.typeConstructor.parameters.single()");
                    q = HO.q(ow, o2, AbstractC0868ct.J(new C1631oT((InterfaceC1437lX) D0)));
                }
                if (q == null) {
                    return false;
                }
                AbstractC1004ey c2 = ry.c();
                AbstractC0048Bt.m(c2, "secondParameter.type");
                return InterfaceC1136gy.a.b(q, AbstractC2228xX.g(c2, false));
            default:
                List<RY> t0 = c0934du.t0();
                AbstractC0048Bt.m(t0, "functionDescriptor.valueParameters");
                if (!t0.isEmpty()) {
                    for (RY ry2 : t0) {
                        AbstractC0048Bt.m(ry2, "it");
                        if (AbstractC0192Hh.a(ry2) || ry2.q != null) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }
}
