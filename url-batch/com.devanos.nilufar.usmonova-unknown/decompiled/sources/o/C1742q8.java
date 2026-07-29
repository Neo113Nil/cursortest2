package o;

/* renamed from: o.q8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1742q8 extends AbstractC0551Vd {
    public final /* synthetic */ int b = 1;

    public /* synthetic */ C1742q8(Object obj) {
        super(obj);
    }

    @Override // o.AbstractC0551Vd
    public final AbstractC1004ey a(InterfaceC0761bD interfaceC0761bD) {
        switch (this.b) {
            case 0:
                AbstractC0048Bt.n(interfaceC0761bD, "module");
                AbstractC0545Ux l = interfaceC0761bD.l();
                l.getClass();
                return l.s(EnumC1423lJ.m);
            case 1:
                AbstractC0048Bt.n(interfaceC0761bD, "module");
                AbstractC0545Ux l2 = interfaceC0761bD.l();
                l2.getClass();
                return l2.s(EnumC1423lJ.t);
            default:
                AbstractC0048Bt.n(interfaceC0761bD, "module");
                AbstractC0545Ux l3 = interfaceC0761bD.l();
                l3.getClass();
                return l3.s(EnumC1423lJ.r);
        }
    }

    @Override // o.AbstractC0551Vd
    public String toString() {
        switch (this.b) {
            case 1:
                return ((Number) this.a).doubleValue() + ".toDouble()";
            case 2:
                return ((Number) this.a).floatValue() + ".toFloat()";
            default:
                return super.toString();
        }
    }

    public C1742q8(double d) {
        super(Double.valueOf(d));
    }

    public C1742q8(float f) {
        super(Float.valueOf(f));
    }
}
